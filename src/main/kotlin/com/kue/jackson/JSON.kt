package com.kue.jackson

import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule

/**
 * @author Michael Vaughan
 */
object JSON : ObjectMapper() {

    init {
        this.registerModule(JavaTimeModule())
    }

}
