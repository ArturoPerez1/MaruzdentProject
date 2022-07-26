package packagePrincipal.modelo;

public class VerificarDatosMedico {

    private int _pDespuesCodigoT;
    private boolean _faltanDigitosTelefono;
    private boolean _sobranDigitosTelefono;
    private boolean _codigoTelefonicoVerificado;
    private boolean _isTelefonoVacio;
    private boolean _isNombreVerificado;
    private boolean _isCedulaP1Vacia;
    private boolean _isCedulaP1PocoDigitos;
    private boolean _isCedulaP1CodigoPVerificado;
    private boolean _isCedulaP2Vacia;
    private boolean _isCedulaP2CodigoVerificacionV;
    private boolean _isEspecialidadVerificada;
    private boolean _isEstadoConsultaVerificado;

    public void VerificarNombreMedico(String nombre) {
        _isNombreVerificado = false;
        char c;
        if (nombre.isEmpty()) {
            _isNombreVerificado = true;
        } else {
            for (int i = 0; i < nombre.length(); i++) {
                c = nombre.charAt(i);
                if (c == ' ') {
                    _isNombreVerificado = false;
                } else if (c == '0' || c <= '9') {
                    _isNombreVerificado = true;
                    break;
                } else {
                    _isNombreVerificado = false;
                }
            }
        }
    }

    public void VerificarEstadoConsulta(String estadoConsulta) {
        _isEstadoConsultaVerificado = false;
        if (estadoConsulta.equals("") || estadoConsulta.equals(" ")) {
            _isEstadoConsultaVerificado = true;
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

    public void VerificarCedulaMedicoM(String cedulaP1) {
        _isCedulaP1Vacia = false;
        if (cedulaP1 == " ") {
            _isCedulaP1Vacia = true;
        }
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

    public int VerificarCatidadDigitosTelefono(String telefono) {
        int cont = 0;
        String digitos = "";

        for (int i = _pDespuesCodigoT; i < telefono.length(); i++) {
            digitos += telefono.charAt(i);
            cont++;
        }

        return cont;
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

    public String ObtenerCodigoNumeroTelefonico(String telefono) {
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
                    _pDespuesCodigoT = i + 1;
                    break;
                }

                if (cont < 2 && codigoConSigno == false) {
                    codigoTelefonico += telefono.charAt(i);
                    cont++;
                } else if (cont == 2 && codigoConSigno == false) {
                    codigoTelefonico += telefono.charAt(i);
                    _pDespuesCodigoT = i + 1;
                    break;
                }
            }
        }

        return codigoTelefonico;
    }

    public void VerificarTelefono(String telefono) {
        _isTelefonoVacio = false;
        _faltanDigitosTelefono = false;
        _sobranDigitosTelefono = false;
        String codigoTelefonico = "";
        int cantidadDigitos = 0;

        if (telefono.isEmpty()) {
            _isTelefonoVacio = true;
        } else {
            codigoTelefonico = ObtenerCodigoNumeroTelefonico(telefono);
            _codigoTelefonicoVerificado = VerificarCodigoTelefonico(codigoTelefonico);

            cantidadDigitos = VerificarCatidadDigitosTelefono(telefono);
            if (cantidadDigitos < 7) {
                _faltanDigitosTelefono = true;
            } else if (cantidadDigitos > 7) {
                _sobranDigitosTelefono = true;
            }

        }

    }

    public void VerificarEspecialidad(String especialidad) {
        _isEspecialidadVerificada = false;
        if (especialidad.equals("") || especialidad.equals(" ")) {
            _isEspecialidadVerificada = true;
        }
    }

    public boolean IsNombreVerificado() {
        return _isNombreVerificado;
    }

    public boolean IsEspecialidadVerificada() {
        return _isEspecialidadVerificada;
    }

    public boolean IsEstadoConsultaVerificado() {
        return _isEstadoConsultaVerificado;
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

    public boolean IsTelefonoVacio() {
        return _isTelefonoVacio;
    }

    public boolean IsCodigoTelefonicoVerificado() {
        return _codigoTelefonicoVerificado;
    }

    public boolean isFaltanDigitosTelefono() {
        return _faltanDigitosTelefono;
    }

    public boolean isSobranDigitosTelefono() {
        return _sobranDigitosTelefono;
    }

}
