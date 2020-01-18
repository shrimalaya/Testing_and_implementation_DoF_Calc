import ca.programDemo.model.LensManager;
import ca.programDemo.ui.CameraTextUI;

/**
 * Launch application
 */
public class Main {
    public static void main(String args[]) {
        //Initialize collection of Lens objects
        LensManager manager = new LensManager();
        //Initiate UI
        CameraTextUI ui = new CameraTextUI(manager);
        //Display UI
        ui.show();
    }
}