package com.allanh.androidtest.utils

import com.google.gson.*
import com.google.gson.stream.JsonReader
import com.google.gson.stream.JsonToken
import com.google.gson.stream.JsonWriter
import java.io.IOException
import java.lang.NumberFormatException

class IntTypeAdapter : TypeAdapter<Int?>() {
    @Throws(IOException::class)
    override fun read(reader: JsonReader): Int? {
        if (reader.peek() == JsonToken.NULL) {
            reader.nextNull()
            return null
        }

        val stringValue = reader.nextString()
        if (stringValue.isEmpty()) {
            return null
        }

        return try {
            stringValue.toInt()
        } catch (e: NumberFormatException) {
            e.printStackTrace()
            null
        }
    }

    @Throws(IOException::class)
    override fun write(writer: JsonWriter, value: Int?) {
        if (value == null) {
            writer.nullValue()
            return
        }
        writer.value(value)
    }
}