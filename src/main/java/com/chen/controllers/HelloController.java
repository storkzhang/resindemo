package com.chen.controllers;

import net.paoding.rose.web.annotation.Path;
import net.paoding.rose.web.annotation.rest.Get;
/**
 * Created by storkzhang on 17-3-27.
 */
@Path("")
public class HelloController {
    @Get("")
    public String index() {
        return "@hello world";
    }
}
