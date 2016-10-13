package url.mappings.mixin.test

import grails.test.mixin.Mock
import grails.test.mixin.TestFor
import spock.lang.Specification

/**
 * Test for url mappings
 */
@TestFor(UrlMappings)
@Mock(ErrorsController)
class UrlMappingsSpec extends Specification {

    def 'exceptions are mapped correctly'() {
        expect:
        assertForwardUrlMapping(500, controller: 'errors', action: 'handleIllegalArgument',
                exception: new IllegalArgumentException())
        assertForwardUrlMapping(500, controller: 'errors', action: 'handleNullPointer',
                exception: new NullPointerException())
    }
}
