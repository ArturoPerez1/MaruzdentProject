package packagePrincipal.modelo;

import java.time.LocalDate;

public class FechaActual {
    private int _obtenerAno;

    public void GenerarAnoActual() {
        ObtenerFechaActual();
    }
    
    
    public String ObtenerFechaActual() {
        int i;
        int j;
        int k;
        String fechaActual = String.valueOf(LocalDate.now());
        String month = "";
        String day = "";
        String year = "";

        for (i = 0; i < fechaActual.length(); i++) {
            if (!(fechaActual.charAt(i) == '-')) {
                year += String.valueOf(fechaActual.charAt(i));
            } else {
                break;
            }
        }

        for (j = i + 1; j < fechaActual.length(); j++) {
            if (!(fechaActual.charAt(j) == '-')) {
                month += String.valueOf(fechaActual.charAt(j));
            } else {
                break;
            }
        }

        for (k = j + 1; k < fechaActual.length(); k++) {
            day += String.valueOf(fechaActual.charAt(k));
        }
        
        _obtenerAno = Integer.valueOf(year);
        fechaActual = day + "/" + month + "/" + year;

        return fechaActual;
    }

    public int getObtenerAno() {
        return _obtenerAno;
    }
    
    

}
