package packagePrincipal;

import packagePrincipal.ControladorMenu.ControladorMenu;
import packagePrincipal.vistaMenu.FrameContenedorMenu;

public class MainClass {

    public static void main(String[] args) {
       FrameContenedorMenu frameContendor;
       frameContendor = new FrameContenedorMenu();
       frameContendor.setVisible(true);
       
        ControladorMenu controladorMenu;
        controladorMenu =  new ControladorMenu(frameContendor);
    }

}
