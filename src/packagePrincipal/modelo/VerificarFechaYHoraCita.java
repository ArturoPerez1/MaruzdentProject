package packagePrincipal.modelo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class VerificarFechaYHoraCita {

    private String _mes;
    private String _dia;
    private String _ano;
    private boolean _isMesVacio;
    private boolean _isDiaVacio;
    private boolean _isAnoVacio;
    private boolean _isMesVerificado;
    private boolean _isDiaVerificado;
    private boolean _isAnoVerificado;
    private boolean _fechaVerificada;

    public void ObtenerFechaSeparada(String fecha) {
        int cont = 0;
        _mes = "";
        _dia = "";
        _ano = "";

        for (int i = 0; i < fecha.length(); i++) {
            if (fecha.charAt(i) == '/') {
                cont = i + 1;
                break;
            }
            _dia += fecha.charAt(i);
        }
        
        for (int i = cont; i < fecha.length(); i++) {
            if (fecha.charAt(i) == '/') {
                cont = i+1;
                break;
            }
            _mes += fecha.charAt(i);
        }
        
        for(int i = cont; i < fecha.length(); i++){
            _ano += fecha.charAt(i);
        }
        
    }

    public boolean VerificarFechaNacimiento(String fecha) {
        char c;
        ObtenerFechaSeparada(fecha);
        String regex = "^\\d{4}[\\-\\/\\s]?((((0[13578])|(1[02]))[\\-\\/\\s]?(([0-2][0-9])|(3[01])))|(((0[469])|(11))[\\-\\/\\s]?(([0-2][0-9])|(30)))|(02[\\-\\/\\s]?[0-2][0-9]))$";
        String fechaActual;
        _fechaVerificada = false;
        _isMesVerificado = false;
        _isDiaVerificado = false;
        _isAnoVerificado = false;
        _isMesVacio = false;
        _isDiaVacio = false;
        _isAnoVacio = false;

        if (_mes.equals("") || _mes.equals(" ")) {
            _isMesVacio = true;
        }
        if (_dia.equals("") || _dia.equals(" ")) {
            _isDiaVacio = true;
        }
        if (_ano.equals("") || _ano.equals(" ")) {
            _isAnoVacio = true;
        } else if (_ano.equals("") == false || _ano.equals(" ") == false) {
            for (int i = 0; i < _ano.length(); i++) {
                c = _ano.charAt(i);
                if (c < '0' || c > '9') {
                    _isAnoVerificado = true;
                    break;
                } else {
                    _isAnoVerificado = false;
                }
            }

            if (_isAnoVerificado == false) {
                fechaActual = _ano + "/" + _mes + "/" + _dia;
                Pattern patron = Pattern.compile(regex);
                Matcher match = patron.matcher(fechaActual);
                if (match.find() == false) {
                    _isMesVerificado = true;
                    _isDiaVerificado = true;
                    _isAnoVerificado = true;
                }
            }
        }

        if (_isMesVacio == false && _isDiaVacio == false && _isAnoVacio == false) {
            if (_isMesVerificado == false && _isDiaVerificado == false && _isAnoVerificado == false) {
                _fechaVerificada = true;
            }
        }

        return _fechaVerificada;
    }
}
