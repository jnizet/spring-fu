package org.springframework.fu.module.data.mongodb.coroutines

import org.springframework.beans.factory.getBean
import org.springframework.context.support.GenericApplicationContext
import org.springframework.context.support.registerBean
import org.springframework.fu.module.data.mongodb.coroutines.data.mongodb.core.CoroutineMongoTemplate
import org.springframework.fu.Module
import org.springframework.fu.module.data.mongodb.MongoModule

class CoroutinesMongoModule : Module {
	override fun initialize(context: GenericApplicationContext) {
		context.registerBean { CoroutineMongoTemplate(context.getBean()) }
	}
}

fun MongoModule.coroutines() : CoroutinesMongoModule {
	val coroutineModule = CoroutinesMongoModule()
	modules.add(coroutineModule)
	return coroutineModule
}