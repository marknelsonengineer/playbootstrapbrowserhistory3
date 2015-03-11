/**
 * The Controller leg for this Model-View-Controller application.
 *
 * @author Mark Nelson
 * @since 6.0
 * @see https://www.playframework.com
 */

package controllers;

import play.mvc.Controller;
import play.mvc.Result;
import views.html.Chrome;
import views.html.Firefox;
import views.html.Home;
import views.html.Ie;


/**
 * Controllers for the application.
 */
public class Application extends Controller {

  /**
   * Application home page.
   *
   * @return HTTP OK with page content.
   */
  public static Result home() {
    return ok(Home.render());
  }


  /**
   * Application IE page.
   *
   * @return HTTP OK with page content.
   */
  public static Result ie() {
    return ok(Ie.render());
  }


  /**
   * Application Firefox page.
   *
   * @return HTTP OK with page content.
   */
  public static Result firefox() {
    return ok(Firefox.render());
  }


  /**
   * Application Chrome page.
   *
   * @return HTTP OK with page content.
   */
  public static Result chrome() {
    return ok(Chrome.render());
  }


}
