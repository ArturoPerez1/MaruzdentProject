package packagePrincipal.modelo;

import java.util.ArrayList;

public class ObtenerDatosPacienteEHistorial {

    public int ObtenerIndicePacientePorCedula(ArrayList<DatosPaciente> paciente, String cedula) {
        int posicion = 0;

        for (int i = 0; i < paciente.size(); i++) {
            if (paciente.get(i).getCedula().equals(cedula)) {
                posicion = i;
                break;
            }
        }

        return posicion;
    }

    public int ObtenerIndiceRazonPorCedula(ArrayList<HistorialClinico> historial, String cedula) {
        int posicion = 0;

        for (int i = 0; i < historial.size(); i++) {
            if (historial.get(i).getCedulaAsociada().equals(cedula)) {
                posicion = i;
                break;
            }
        }

        return posicion;
    }
}
