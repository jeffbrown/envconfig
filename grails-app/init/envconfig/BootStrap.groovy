package envconfig

import demo.EnvironmentAwareBean
import org.springframework.context.EnvironmentAware

class BootStrap {

    EnvironmentAwareBean environmentAwareBean

    def init = { servletContext ->
        log.debug "'grails' -> ${environmentAwareBean.getEnvironmentProperty('grails')}"
        log.debug "'grails.profile' -> ${environmentAwareBean.getEnvironmentProperty('grails.profile')}"
    }
    def destroy = {
    }
}
