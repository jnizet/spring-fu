package org.springframework.fu.sample

import org.springframework.fu.module.webflux.coroutines.routes
import org.springframework.fu.ref

val routes = routes {
	val userHandler = ref<UserHandler>()
	// TODO Raise a bug since method references do not work with Coroutines
	GET("/") { userHandler.listView(it) }
	GET("/api/user") { userHandler.listApi(it) }
	GET("/conf") { userHandler.conf(it) }
}
