import ca.programDemo.model.Lens;
import ca.programDemo.model.LensManager;
import ca.programDemo.ui.CameraTextUI;

/**
 * Launch application
 */
public class Main {
    public static void main(String args[]) {
        LensManager manager = new LensManager();

        manager.add(new Lens("Canon", 1.8, 50));

        CameraTextUI ui = new CameraTextUI(manager);
        ui.show();
    }
}