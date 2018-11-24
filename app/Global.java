import akka.actor.Cancellable;
import play.Application;
import play.GlobalSettings;
import play.Logger;
import play.libs.F.Promise;
import play.libs.Json;
import play.mvc.Action;
import play.mvc.Http;
import play.mvc.Result;

import java.util.ArrayList;
import java.util.List;

import static play.mvc.Results.*;

public class Global extends GlobalSettings {

    @Override
    public void onStart(Application application) {
        super.onStart(application);
    }

    @Override
    public void onStop(Application app) {
        Logger.info("Global.onStop...");
        super.onStop(app);
    }

    @Override
    public void beforeStart(Application app) {
        Logger.info("beforeStart");
		super.beforeStart(app);
    }
}
