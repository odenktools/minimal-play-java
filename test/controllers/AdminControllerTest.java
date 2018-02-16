package controllers;

import org.junit.Test;
import play.libs.Json;
import play.mvc.Result;

import static org.fest.assertions.Assertions.assertThat;
import static play.test.Helpers.*;
import static play.test.Helpers.POST;
import static play.test.Helpers.fakeRequest;
import play.test.WithApplication;

public class AdminControllerTest extends WithApplication {
 
    @Test
    public void createIndex() {
        running(fakeApplication(), () -> {
            Result result = route(fakeRequest(GET, "/"));
            //-- assert that!
            assertThat(status(result)).isEqualTo(OK);
        });
    }
}