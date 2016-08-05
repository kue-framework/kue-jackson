package com.kue.route

import com.kue.jackson.JSON
import spark.Route

/**
 * @author Michael Vaughan
 */
fun json(next: Route) = Route() { req, res ->
    res.type("application/json")
    try {
        JSON.writeValueAsString(next.handle(req, res))
    } catch (e: Exception) {
        e.printStackTrace()
    }
}
