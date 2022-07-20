package packagePrincipal.modelo;

public class VerificarCuentaPaciente {

    private boolean _isCostoTratamientoVerificado;
    private boolean _isCostoConsultaVerificado;
    private boolean _isCedulaVerificada;
    private boolean _isVerificadoTotal;
    private boolean _isMuchosPuntosT;
    private boolean _isMuchosPuntosC;

    public VerificarCuentaPaciente() {
        _isVerificadoTotal = true;
    }

    public void VerificarCostoTratatmiento(String costoTratamiento) {
        char c;
        int contadorDePuntos = 0;
        System.out.println("este es el costo" + costoTratamiento);
        _isCostoTratamientoVerificado = false;
        _isMuchosPuntosT = false;

        if (costoTratamiento.isEmpty()) {
            _isCostoTratamientoVerificado = true;
        } else {
            for (int i = 0; i < costoTratamiento.length(); i++) {
                c = costoTratamiento.charAt(i);
                if (c == '.') {
                    contadorDePuntos++;
                    System.out.println("este contador" + contadorDePuntos);
                }

            }

            if (contadorDePuntos > 1) {
                _isMuchosPuntosT = true;
                _isCostoTratamientoVerificado = true;
            }

            System.out.println(_isMuchosPuntosT + "///" + _isCostoConsultaVerificado);
        }
    }

    public void VerificarCedula(String cedula) {
        _isCedulaVerificada = false;
        System.out.println("esta es la cedula" + cedula);
        if (cedula.equals("") || cedula.equals(" ")) {
            System.out.println("tuki" );
            _isCedulaVerificada = true;
        }else{
            _isCedulaVerificada = false;
        }
    }

    public void VerificarCostoConsulta(String costoConsulta) {
        char c;
        int contadorDePuntos = 0;
        System.out.println("este es el costo" + costoConsulta);
        _isCostoConsultaVerificado = false;
        _isMuchosPuntosC = false;

        if (costoConsulta.isEmpty()) {
            _isCostoConsultaVerificado = true;
            _isVerificadoTotal = false;
        } else {
            for (int i = 0; i < costoConsulta.length(); i++) {
                c = costoConsulta.charAt(i);
                if (c == '.') {
                    contadorDePuntos++;
                    System.out.println("este contador" + contadorDePuntos);
                }
            }

            if (contadorDePuntos > 1) {
                _isMuchosPuntosC = true;
                _isCostoConsultaVerificado = true;
            }

            System.out.println(_isMuchosPuntosC + "///" + _isCostoConsultaVerificado);
        }
    }

    public boolean IsCostoTratamientoVerificado() {
        return _isCostoTratamientoVerificado;
    }

    public boolean IsCostoConsultaVerificado() {
        return _isCostoConsultaVerificado;
    }

    public boolean IsCedulaVerificada() {
        return _isCedulaVerificada;
    }

    public boolean IsVerificadoTotal() {
        return _isVerificadoTotal;
    }

    public boolean IsMuchosPuntosT() {
        return _isMuchosPuntosT;
    }

    public boolean IsMuchosPuntosC() {
        return _isMuchosPuntosC;
    }

}
