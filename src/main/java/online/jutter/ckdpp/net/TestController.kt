package online.jutter.ckdpp.net

import online.jutter.ckdpp.common.ext.createWrapperResponse
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping(
        value = ["api/test"],
        produces = ["application/json; charset=utf-8"]
)
class TestController {

    @RequestMapping(
        value = ["hello"],
        method = [RequestMethod.GET]
    )
    fun hello() = createWrapperResponse {
        "hello world"
    }
}