package url.mappings.mixin.test

class UrlMappings {

    static mappings = {
        "/$controller/$action?/$id?(.$format)?"{
            constraints {
                // apply constraints here
            }
        }

        "/"(view:"/index")

        "500"(controller: 'errors', exception: IllegalArgumentException, action: 'handleIllegalArgument')
        "500"(controller: 'errors', exception: NullPointerException, action: 'handleNullPointer')
        "500"(controller: 'errors', action: 'handleDefault')

        "404"(view:'/notFound')
    }
}
