package packagePrincipal.modelo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class VerificarDatosPaciente {

    private int _edadPaciente;
    private boolean _isVerificadoTotal = true;
    private boolean _isNombrePVerificado;
    private boolean _isApellidoVerificado;
    private boolean _isCedulaVerificada;
    private boolean _isTelefonoVerificado;
    private boolean _isCorreoVerificado;
    private boolean _isDireccionVerificada;
    private boolean _isOcupacionVerificada;
    private boolean _isMesVerificado;
    private boolean _isDiaVerificado;
    private boolean _isAnoVerificado;
    private boolean _isEdadVerificada;
    private boolean _isEstadoCivilVerificado;
    private boolean _isGeneroVerificado;

    public void VerificarNombre(String nombre) {
        _isNombrePVerificado = false;
        char c;
        if (nombre.isEmpty()) {
            _isNombrePVerificado = true;
            _isVerificadoTotal = false;
        } else {
            for (int i = 0; i < nombre.length(); i++) {
                c = nombre.charAt(i);
                if (c == ' ') {
                    _isNombrePVerificado = false;
                } else if (c == '0' || c <= '9') {
                    _isNombrePVerificado = true;
                    _isVerificadoTotal = false;
                    break;
                } else {
                    _isNombrePVerificado = false;
                }
            }
        }
    }

    public void VerificarApellido(String apellido) {
        char c;
        if (apellido.isEmpty()) {
            _isApellidoVerificado = true;
            _isVerificadoTotal = false;
        } else {
            for (int i = 0; i < apellido.length(); i++) {
                c = apellido.charAt(i);
                if (c == ' ') {
                    _isApellidoVerificado = false;
                } else if (c == '0' || c <= '9') {
                    _isApellidoVerificado = true;
                    _isVerificadoTotal = false;
                    break;
                } else {
                    _isApellidoVerificado = false;
                }
            }
        }
    }

    public void VerificarCedula(String cedula) {
        int contador = 0;
        char c;
        if (cedula.isEmpty()) {
            _isCedulaVerificada = true;
            _isVerificadoTotal = false;
        } else {
            for (int i = 0; i < cedula.length(); i++) {
                c = cedula.charAt(i);
                if (c < '0' || c > '9') {
                    _isCedulaVerificada = true;
                    _isVerificadoTotal = false;
                    break;
                } else {
                    _isCedulaVerificada = false;
                    contador++;
                }
            }
        }

        if (contador >= 9 || contador < 6) {
            _isCedulaVerificada = true;
        }
    }

    public void VerificarTelefono(String telefono) {
        char c;
        if (telefono.isEmpty()) {
            _isTelefonoVerificado = true;
            _isVerificadoTotal = false;
        }
        for (int i = 0; i < telefono.length(); i++) {
            c = telefono.charAt(i);
            if (c < '0' || c > '9') {
                _isTelefonoVerificado = true;
                _isVerificadoTotal = false;
                break;
            } else {
                _isTelefonoVerificado = false;
            }

        }

    }

    public void VerificarCorreo(String correo) {
        String regex = "^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$";

        if (correo.isEmpty()) {
            _isCorreoVerificado = true;
            _isVerificadoTotal = false;
        } else {
            Pattern patron = Pattern.compile(regex);
            Matcher match = patron.matcher(correo);

            if (match.find() == false) {
                _isCorreoVerificado = true;
                _isVerificadoTotal = false;
            } else {
                _isCorreoVerificado = false;
            }
        }
    }

    public void VerificarDireccion(String direccion) {
        if (direccion.isEmpty()) {
            _isDireccionVerificada = true;
            _isVerificadoTotal = false;
        } else {
            _isDireccionVerificada = false;
        }
    }

    public void VerificarOcupacion(String ocupacion) {
        if (ocupacion.isEmpty()) {
            _isOcupacionVerificada = true;
            _isVerificadoTotal = false;
        } else {
            _isOcupacionVerificada = false;
        }
    }

    public void VerificarFechaNacimiento(String mes, String dia, String ano) {
        char c;
        String regex = "^\\d{4}[\\-\\/\\s]?((((0[13578])|(1[02]))[\\-\\/\\s]?(([0-2][0-9])|(3[01])))|(((0[469])|(11))[\\-\\/\\s]?(([0-2][0-9])|(30)))|(02[\\-\\/\\s]?[0-2][0-9]))$";
        String fechaActual;

        if (mes.equals("") || mes.equals(" ")) {
            _isMesVerificado = true;
            _isVerificadoTotal = false;
        } else {
            _isMesVerificado = false;
        }
        if (dia.equals("") || dia.equals(" ")) {
            _isDiaVerificado = true;
            _isVerificadoTotal = false;
        } else {
            _isDiaVerificado = false;
        }
        if (ano.equals("") || ano.equals(" ")) {
            _isAnoVerificado = true;
            _isVerificadoTotal = false;
        } else if (ano.equals("") == false || ano.equals(" ") == false) {
            for (int i = 0; i < ano.length(); i++) {
                c = ano.charAt(i);
                if (c < '0' || c > '9') {
                    _isAnoVerificado = true;
                    _isVerificadoTotal = false;
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
                    _isVerificadoTotal = false;
                    _isMesVerificado = true;
                    _isDiaVerificado = true;
                    _isAnoVerificado = true;
                }
            }
        }

    }

    public void VerificarEdad(String edad) {
        char c;
        if (edad.equals("") || edad.equals(" ")) {
            _isEdadVerificada = true;
            _isVerificadoTotal = false;

        } else {
            _isEdadVerificada = false;
            _edadPaciente = Integer.valueOf(edad);
        }
    }

    public void VerificarEstadoCivil(String estadoCivil) {
        if (estadoCivil.equals("") || estadoCivil.equals(" ")) {
            _isEstadoCivilVerificado = true;
            _isVerificadoTotal = false;
        } else {
            _isEstadoCivilVerificado = false;
        }
    }

    public void VerificarGenero(String genero) {
        if (genero.equals("") || genero.equals(" ")) {
            _isGeneroVerificado = true;
            _isVerificadoTotal = false;
        } else {
            _isGeneroVerificado = false;
        }
    }

    public boolean IsNombrePVerificado() {
        return _isNombrePVerificado;
    }

    public boolean IsApellidoVerificado() {
        return _isApellidoVerificado;
    }

    public boolean IsCedulaVerificada() {
        return _isCedulaVerificada;
    }

    public boolean IsTelefonoVerificado() {
        return _isTelefonoVerificado;
    }

    public boolean IsCorreoVerificado() {
        return _isCorreoVerificado;
    }

    public boolean IsDireccionVerificada() {
        return _isDireccionVerificada;
    }

    public boolean IsOcupacionVerificada() {
        return _isOcupacionVerificada;
    }

    public boolean IsMesVerificado() {
        return _isMesVerificado;
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

    public boolean IsVerificadoTotal() {
        return _isVerificadoTotal;
    }

}
