import play.*;
import net.sf.sprockets.Sprockets;

public class Global extends GlobalSettings {

  @Override
  public void onStart(Application app) {
    String google_api = play.Play.application().configuration().getString("google.api-key");
    Sprockets.getConfig().setProperty("google.api-key", google_api);
  }
}  