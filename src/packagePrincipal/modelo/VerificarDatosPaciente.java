package packagePrincipal.modelo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class VerificarDatosPaciente {

    private int _edadPaciente;
    private boolean _codigoTelefonicoVerificado;
    private boolean _isMesVacio;
    private boolean _isDiaVacio;
    private boolean _isAnoVacio;
    private boolean _isNombrePVacio;
    private boolean _isApellidoVacio;
    private boolean _isCedulaP1Vacia;
    private boolean _isCedulaP1PocoDigitos;
    private boolean _isCedulaP1CodigoPVerificado;
    private boolean _isCedulaP2Vacia;
    private boolean _isCedulaP2CodigoVerificacionV;
    private boolean _isTelefonoVacio;
    private boolean _isCorreoVerificado;
    private boolean _isCorreoVacio;
    private boolean _isDireccionVacia;
    private boolean _isOcupacionVacia;
    private boolean _isMesVerificado;
    private boolean _isDiaVerificado;
    private boolean _isAnoVerificado;
    private boolean _isEdadVerificada;
    private boolean _isEstadoCivilVerificado;
    private boolean _isGeneroVerificado;

    public void VerificarNombre(String nombre) {
        _isNombrePVacio = false;
        char c;
        if (nombre.isEmpty()) {
            _isNombrePVacio = true;
        } else {
            for (int i = 0; i < nombre.length(); i++) {
                c = nombre.charAt(i);
                if (c == ' ') {
                    _isNombrePVacio = false;
                } else if (c == '0' || c <= '9') {
                    _isNombrePVacio = true;
                    break;
                } else {
                    _isNombrePVacio = false;
                }
            }
        }
    }

    public void VerificarApellido(String apellido) {
        char c;
        if (apellido.isEmpty()) {
            _isApellidoVacio = true;
        } else {
            for (int i = 0; i < apellido.length(); i++) {
                c = apellido.charAt(i);
                if (c == ' ') {
                    _isApellidoVacio = false;
                } else if (c == '0' || c <= '9') {
                    _isApellidoVacio = true;
                    break;
                } else {
                    _isApellidoVacio = false;
                }
            }
        }
    }

    //aquí obtengo los primeros primero 9 dígitos
    public String ObtenerLosPrimeros9Digitos(String cedulaP1) {
        int cont = 0;
        String primero9Digitos = "";

        for (int i = 0; i < cedulaP1.length(); i++) {
            if (cont == 8) {
                break;
            } else {
                primero9Digitos += String.valueOf(cedulaP1.charAt(i));
                cont++;
            }
        }

        return primero9Digitos;
    }

    //aqui obtengo el numero de verificacion
    public int ObtenerNumeroDeVerificador(String primero9Digitos) {
        int numeroVerificacion = 0;
        int digito = 0;
        int digitosPares = 0;
        int digitosImpares = 0;

        for (int i = 0; i < primero9Digitos.length(); i++) {
            digito = Integer.valueOf(primero9Digitos.charAt(i));
            if ((digito % 2) == 0) {
                digitosPares += digito;
            } else {
                digito *= 2;
                if (digito > 9) {
                    digito -= 9;
                    digitosImpares += digito;
                } else {
                    digitosImpares += digito;
                }
            }
        }

        numeroVerificacion = (digitosImpares + digitosPares) % 10;

        return numeroVerificacion;
    }

    //aqui obtengo el codigo de provincia
    public int ObtenerCodigoProvincia(String cedulaP1) {
        String codigoProvincia = "";
        int codigo = 0;
        int cont = 0;

        for (int i = 0; i < cedulaP1.length(); i++) {
            if (cont > 1) {
                break;
            } else {
                codigoProvincia += cedulaP1.charAt(i);
                cont++;
            }
        }

        codigo = Integer.valueOf(codigoProvincia);

        return codigo;
    }

    public void VerificarCedula(String cedulaP1, String cedulaP2) {
        String primero9Digitos = "";
        int verificarLengthCedula = 0;
        int numeroVerificador = 0;
        int comparadorCodigo = 0;
        _isCedulaP1Vacia = false;
        _isCedulaP1CodigoPVerificado = false;
        _isCedulaP1PocoDigitos = false;
        _isCedulaP2CodigoVerificacionV = false;
        _isCedulaP2Vacia = false;

        if (cedulaP1.isEmpty()) {
            _isCedulaP1Vacia = true;
        }

        if (cedulaP2.isEmpty()) {
            _isCedulaP2Vacia = true;
        }

        if (_isCedulaP1Vacia == false && _isCedulaP2Vacia == false) {
            verificarLengthCedula = cedulaP1.length() + cedulaP2.length();
            if (verificarLengthCedula <= 9) {
                _isCedulaP1PocoDigitos = true;
            } else {
                comparadorCodigo = ObtenerCodigoProvincia(cedulaP1);
                if (comparadorCodigo > 24 && comparadorCodigo != 30) {
                    _isCedulaP1CodigoPVerificado = true;
                } else {
                    primero9Digitos = ObtenerLosPrimeros9Digitos(cedulaP1);
                    numeroVerificador = ObtenerNumeroDeVerificador(primero9Digitos);
                    if (numeroVerificador != Integer.valueOf(cedulaP2)) {
                        _isCedulaP2CodigoVerificacionV = true;
                    }
                }

            }

        }
    }

    public boolean VerificarCodigoTelefonico(String codigoTelefonico) {
        boolean codigoVerificado = false;
        String arrayCodigos[] = {"+59399", "+59398", "099", "098"};

        for (int i = 0; i < arrayCodigos.length; i++) {
            if (codigoTelefonico.equals(arrayCodigos[i])) {
                codigoVerificado = true;
            }
        }

        return codigoVerificado;
    }

    public String ObteneCodigoNumeroTelefonico(String telefono) {
        String codigoTelefonico = "";
        boolean codigoConSigno = false;
        int cont = 0;

        for (int i = 0; i < telefono.length(); i++) {
            if (telefono.charAt(i) == '+' && cont == 0) {
                codigoTelefonico += telefono.charAt(i);
                codigoConSigno = true;
                cont++;
            } else {

                if (cont < 5 && codigoConSigno == true) {
                    codigoTelefonico += telefono.charAt(i);
                    cont++;
                } else if (cont == 5 && codigoConSigno == true) {
                    codigoTelefonico += telefono.charAt(i);
                    break;
                }

                if (cont < 2 && codigoConSigno == false) {
                    codigoTelefonico += telefono.charAt(i);
                    cont++;
                } else if (cont == 2 && codigoConSigno == false) {
                    codigoTelefonico += telefono.charAt(i);
                    break;
                }
            }
        }

        return codigoTelefonico;
    }

    public void VerificarTelefono(String telefono) {
        _isTelefonoVacio = false;
        String codigoTelefonico = "";
        if (telefono.isEmpty()) {
            _isTelefonoVacio = true;
        } else {
            codigoTelefonico = ObteneCodigoNumeroTelefonico(telefono);
            _codigoTelefonicoVerificado = VerificarCodigoTelefonico(codigoTelefonico);
        }

    }

    public void VerificarCorreo(String correo) {
        String regex = "^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$";
        _isCorreoVacio = false;
        _isCorreoVerificado = false;
        if (correo.isEmpty()) {
            _isCorreoVacio = true;
        } else {
            Pattern patron = Pattern.compile(regex);
            Matcher match = patron.matcher(correo);

            if (match.find() == false) {
                _isCorreoVerificado = true;
            } else {
                _isCorreoVerificado = false;
            }
        }
    }

    public void VerificarDireccion(String direccion) {
        if (direccion.isEmpty()) {
            _isDireccionVacia = true;
        } else {
            _isDireccionVacia = false;
        }
    }

    public void VerificarOcupacion(String ocupacion) {
        if (ocupacion.isEmpty()) {
            _isOcupacionVacia = true;
        } else {
            _isOcupacionVacia = false;
        }
    }

    public void VerificarFechaNacimiento(String mes, String dia, String ano) {
        char c;
        String regex = "^\\d{4}[\\-\\/\\s]?((((0[13578])|(1[02]))[\\-\\/\\s]?(([0-2][0-9])|(3[01])))|(((0[469])|(11))[\\-\\/\\s]?(([0-2][0-9])|(30)))|(02[\\-\\/\\s]?[0-2][0-9]))$";
        String fechaActual;
        _isMesVerificado = false;
        _isDiaVerificado = false;
        _isAnoVerificado = false;
        _isMesVacio = false;
        _isDiaVacio = false;
        _isAnoVacio = false;

        if (mes.equals("") || mes.equals(" ")) {
            _isMesVacio = true;
        }
        if (dia.equals("") || dia.equals(" ")) {
            _isDiaVacio = true;
        }
        if (ano.equals("") || ano.equals(" ")) {
            _isAnoVacio = true;
        } else if (ano.equals("") == false || ano.equals(" ") == false) {
            for (int i = 0; i < ano.length(); i++) {
                c = ano.charAt(i);
                if (c < '0' || c > '9') {
                    _isAnoVerificado = true;
                    break;
                } else {
                    _isAnoVerificado = false;
                }
            }

            if (_isAnoVerificado == false) {
                fechaActual = ano + "/" + mes + "/" + dia;
                Pattern patron = Pattern.compile(regex);
                Matcher match = patron.matcher(fechaActual);
                if (match.find() == false) {
                    _isMesVerificado = true;
                    _isDiaVerificado = true;
                    _isAnoVerificado = true;
                }
            }
        }

    }

    public void VerificarEstadoCivil(String estadoCivil) {
        if (estadoCivil.equals("") || estadoCivil.equals(" ")) {
            _isEstadoCivilVerificado = true;
        } else {
            _isEstadoCivilVerificado = false;
        }
    }

    public void VerificarGenero(String genero) {
        if (genero.equals("") || genero.equals(" ")) {
            _isGeneroVerificado = true;
        } else {
            _isGeneroVerificado = false;
        }
    }

    public boolean IsMesVacio() {
        return _isMesVacio;
    }

    public boolean IsDiaVacio() {
        return _isDiaVacio;
    }

    public boolean IsAnoVacio() {
        return _isAnoVacio;
    }

    public boolean IsCodigoTelefonicoVerificado() {
        return _codigoTelefonicoVerificado;
    }
   
    public boolean IsNombrePVacio() {
        return _isNombrePVacio;
    }

    public boolean IsApellidoVacio() {
        return _isApellidoVacio;
    }

    public boolean IsTelefonoVacio() {
        return _isTelefonoVacio;
    }

    public boolean IsCorreoVerificado() {
        return _isCorreoVerificado;
    }

    public boolean IsDireccionVacia() {
        return _isDireccionVacia;
    }

    public boolean IsOcupacionVacia() {
        return _isOcupacionVacia;
    }

    public boolean IsMesVerificado() {
        return _isMesVerificado;
    }

    public boolean IsCorreoVacio() {
        return _isCorreoVacio;
    }

    public boolean IsDiaVerificado() {
        return _isDiaVerificado;
    }

    public boolean IsAnoVerificado() {
        return _isAnoVerificado;
    }

    public boolean IsEdadVerificada() {
        return _isEdadVerificada;
    }

    public boolean IsEstadoCivilVerificado() {
        return _isEstadoCivilVerificado;
    }

    public boolean IsGeneroVerificado() {
        return _isGeneroVerificado;
    }

    public int getEdadPaciente() {
        return _edadPaciente;
    }

    public boolean IsCedulaP1Vacia() {
        return _isCedulaP1Vacia;
    }

    public boolean IsCedulaP1PocoDigitos() {
        return _isCedulaP1PocoDigitos;
    }

    public boolean IsCedulaP1CodigoPVerificado() {
        return _isCedulaP1CodigoPVerificado;
    }

    public boolean IsCedulaP2Vacia() {
        return _isCedulaP2Vacia;
    }

    public boolean IsCedulaP2CodigoVerificacionV() {
        return _isCedulaP2CodigoVerificacionV;
    }

}
