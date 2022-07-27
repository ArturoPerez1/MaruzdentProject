package packagePrincipal.modelo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class VerificarDatosHistorial {

    private boolean _isRazonVerificada;
    private boolean _isAntePersonalesVerificados;
    private boolean _isMesVerificado;
    private boolean _isDiaVerificado;
    private boolean _isAnoVerificado;
    private boolean _isCedulaVerificada;
    private boolean _isPlanTratamientoVerificado;
    private boolean _isDiagnosticoVerificado;
    private boolean _isTipoConsultaVerificado;
    private boolean _isAntePatologicoVerificados;
    private boolean _isExamenFisicoVerificado;
    private boolean _isAnteFarmacologicosVerificados;
    private boolean _isEnfermedadVerificada;
    private boolean _isAnteFamiliaresVerificados;
    private boolean _isVerificadoTotal;

    public void VerificarRazonConsulta(String consulta) {
        _isRazonVerificada = false;
        _isVerificadoTotal = true;
        if (consulta.isEmpty()) {
            _isRazonVerificada = true;
            _isVerificadoTotal = false;
        }
    }

    public void VerificarCedula(String cedula) {
        _isCedulaVerificada = false;
        _isVerificadoTotal = true;
        if (cedula.equals("") || cedula.equals(" ")) {
            _isCedulaVerificada = true;
            _isVerificadoTotal = false;
        }
    }

    public void VerificarEnfermedadActual(String enfermedadActual) {
        _isEnfermedadVerificada = false;
        _isVerificadoTotal = true;
        if (enfermedadActual.isEmpty()) {
            _isEnfermedadVerificada = true;
            _isVerificadoTotal = false;
        }
    }

    public void VerificarAnteFamiliares(String anteFamiliares) {
        _isAnteFamiliaresVerificados = false;
        _isVerificadoTotal = true;
        if (anteFamiliares.isEmpty()) {
            _isAnteFamiliaresVerificados = true;
            _isVerificadoTotal = false;
        }
    }

    public void VerificarAntePersonales(String antePersonales) {
        _isAntePersonalesVerificados = false;
        _isVerificadoTotal = true;
        if (antePersonales.isEmpty()) {
            _isAntePersonalesVerificados = true;
            _isVerificadoTotal = false;
        }
    }

    public void VerificarAntePatologico(String antePatologico) {
        _isAntePatologicoVerificados = false;
        _isVerificadoTotal = true;
        if (antePatologico.isEmpty()) {
            _isAntePatologicoVerificados = true;
            _isVerificadoTotal = false;
        }
    }

    public void VerificarAnteFarmacologico(String anteFarmacologico) {
        _isAnteFarmacologicosVerificados = false;
        _isVerificadoTotal = true;
        if (anteFarmacologico.isEmpty()) {
            _isAnteFarmacologicosVerificados = true;
            _isVerificadoTotal = false;
        }
    }

    public void VerificarExamenFisico(String examenFisico) {
        _isExamenFisicoVerificado = false;
        _isVerificadoTotal = true;
        if (examenFisico.isEmpty()) {
            _isExamenFisicoVerificado = true;
            _isVerificadoTotal = false;
        }
    }

    public void VerificarTipoConsulta(String tipoConsulta) {
        _isTipoConsultaVerificado = false;
        _isVerificadoTotal = true;
        if (tipoConsulta.isEmpty()) {
            _isTipoConsultaVerificado = true;
            _isVerificadoTotal = false;
        }
    }

    public void VerificarDiagnostico(String diagnostico) {
        _isDiagnosticoVerificado = false;
        _isVerificadoTotal = true;
        if (diagnostico.isEmpty()) {
            _isDiagnosticoVerificado = true;
            _isVerificadoTotal = false;
        }
    }

    public void VerificarPlanTratamiento(String planTratamiento) {
        _isPlanTratamientoVerificado = false;
        _isVerificadoTotal = true;
        if (planTratamiento.isEmpty()) {
            _isPlanTratamientoVerificado = true;
            _isVerificadoTotal = false;
        }
    }

    public boolean IsRazonVerificada() {
        return _isRazonVerificada;
    }

    public boolean IsAntePersonalesVerificados() {
        return _isAntePersonalesVerificados;
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

    public boolean IsPlanTratamientoVerificado() {
        return _isPlanTratamientoVerificado;
    }

    public boolean IsDiagnosticoVerificado() {
        return _isDiagnosticoVerificado;
    }

    public boolean IsTipoConsultaVerificado() {
        return _isTipoConsultaVerificado;
    }

    public boolean IsAntePatologicoVerificados() {
        return _isAntePatologicoVerificados;
    }

    public boolean IsExamenFisicoVerificado() {
        return _isExamenFisicoVerificado;
    }

    public boolean IsAnteFarmacologicosVerificados() {
        return _isAnteFarmacologicosVerificados;
    }

    public boolean IsEnfermedadVerificada() {
        return _isEnfermedadVerificada;
    }

    public boolean IsAnteFamiliaresVerificados() {
        return _isAnteFamiliaresVerificados;
    }

    public boolean IsVerificadoTotal() {
        return _isVerificadoTotal;
    }

    public boolean IsCedulaVerificada() {
        return _isCedulaVerificada;
    }

}
