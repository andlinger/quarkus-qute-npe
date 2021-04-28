package io.i15s.quarkus.qute;

import io.quarkus.qute.CheckedTemplate;
import io.quarkus.qute.TemplateInstance;
import io.quarkus.qute.i18n.MessageBundles;

import javax.enterprise.context.RequestScoped;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.Locale;

@Path("/qute")
@Produces(MediaType.TEXT_PLAIN)
@RequestScoped
public class QuteResource {

    @CheckedTemplate
    static class Templates {
        public static native TemplateInstance number();
    }

    @GET
    public String get() {
        var view = new QuteView();
        view.setNumber(22.55f);

        return Templates.number()
                .data("view", view)
                .setAttribute(MessageBundles.ATTRIBUTE_LOCALE, Locale.GERMAN)
                .render();
    }
}
