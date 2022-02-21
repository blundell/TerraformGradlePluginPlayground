package com.blundell

import com.amazonaws.services.lambda.runtime.Context
import com.amazonaws.services.lambda.runtime.RequestStreamHandler
import java.io.InputStream
import java.io.OutputStream

class ExampleLambda : RequestStreamHandler {

    override fun handleRequest(input: InputStream, outputStream: OutputStream, context: Context) {
        // Do stuff
    }

}
