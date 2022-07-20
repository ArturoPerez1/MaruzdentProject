package packagePrincipal.modelo;

public class VerificarDatosMedico {

    private boolean _isNombreVerificado;
    private boolean _isCedulaVerificada;
    private boolean _isTelefonoVerificado;
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

    public void VerificarCedula(String cedula) {
        int contador = 0;
        _isCedulaVerificada = false;
        char c;
        if (cedula.isEmpty()) {
            _isCedulaVerificada = true;
        } else {
            for (int i = 0; i < cedula.length(); i++) {
                c = cedula.charAt(i);
                if (c < '0' || c > '9') {
                    _isCedulaVerificada = true;
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
        _isTelefonoVerificado = false;
        if (telefono.isEmpty()) {
            _isTelefonoVerificado = true;
        }
        for (int i = 0; i < telefono.length(); i++) {
            c = telefono.charAt(i);
            if (c < '0' || c > '9') {
                _isTelefonoVerificado = true;
                break;
            } else {
                _isTelefonoVerificado = false;
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

    public boolean IsCedulaVerificada() {
        return _isCedulaVerificada;
    }

    public boolean IsTelefonoVerificado() {
        return _isTelefonoVerificado;
    }

    public boolean IsEspecialidadVerificada() {
        return _isEspecialidadVerificada;
    }

    public boolean IsEstadoConsultaVerificado() {
        return _isEstadoConsultaVerificado;
    }

}
