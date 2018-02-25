package controllers;


import play.mvc.Result;
import play.mvc.Security;
import play.mvc.Controller;
import play.mvc.Http;

public class AdminController extends Controller {

    public static Result index() {
        return ok();
    }
}
