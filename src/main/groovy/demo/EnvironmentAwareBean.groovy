package demo

import org.springframework.context.EnvironmentAware
import org.springframework.core.env.Environment

class EnvironmentAwareBean implements EnvironmentAware{

    Environment environment

    def getEnvironmentProperty(String name) {
        environment.getProperty name
    }
}
