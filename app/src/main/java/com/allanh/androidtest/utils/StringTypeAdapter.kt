package com.allanh.androidtest.utils

import com.google.gson.JsonParseException
import com.google.gson.JsonDeserializationContext
import com.google.gson.JsonElement
import com.google.gson.JsonPrimitive
import com.google.gson.JsonSerializationContext
import com.google.gson.JsonDeserializer
import com.google.gson.JsonSerializer
import java.lang.reflect.Type


class StringTypeAdapter : JsonSerializer<String>, JsonDeserializer<String> {
    override fun serialize(
        src: String?, typeOfSrc: Type,
        context: JsonSerializationContext
    ): JsonElement {
        return if (src == null) {
            JsonPrimitive("")
        } else {
            JsonPrimitive(src.toString())
        }
    }

    @Throws(JsonParseException::class)
    override fun deserialize(
        json: JsonElement, typeOfT: Type,
        context: JsonDeserializationContext
    ): String {
        return json.asJsonPrimitive.asString
    }
}