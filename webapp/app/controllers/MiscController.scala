package controllers

import play.api.http.MimeTypes
import play.api.mvc.{Action, AnyContent, BaseController, ControllerComponents}
import play.api.routing.JavaScriptReverseRouter

import javax.inject.{Inject, Singleton}

@Singleton
class MiscController @Inject()(val controllerComponents: ControllerComponents) extends BaseController {
  def javascriptRoutes: Action[AnyContent] = Action { implicit request =>
    Ok(
      JavaScriptReverseRouter("jsRoutes")(
        routes.javascript.AssessmentController.elementEvent
      )
    ).as(MimeTypes.JAVASCRIPT)
  }
}


