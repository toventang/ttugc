package com.p4501vk.api.sdk.internal;

import android.util.JsonReader;
import android.util.JsonToken;
import android.util.MalformedJsonException;
import com.bytedance.covode.number.Covode;
import java.io.StringReader;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.vk.api.sdk.internal.b */
public final class C87901b {

    /* renamed from: a */
    public static final C87901b f199644a = new C87901b();

    private C87901b() {
    }

    static {
        Covode.recordClassIndex(103912);
    }

    /* renamed from: a */
    public static boolean m152912a(String str, String str2) {
        JsonToken peek;
        C89219l.m154719c(str, "");
        C89219l.m154719c(str2, "");
        try {
            if (str.length() != 0) {
                JsonReader jsonReader = new JsonReader(new StringReader(str));
                if (jsonReader.hasNext() && jsonReader.peek() == JsonToken.BEGIN_OBJECT) {
                    jsonReader.beginObject();
                    while (jsonReader.hasNext() && (peek = jsonReader.peek()) != JsonToken.END_DOCUMENT) {
                        if (peek != JsonToken.NAME) {
                            jsonReader.skipValue();
                        } else if (C89219l.m154714a((Object) str2, (Object) jsonReader.nextName())) {
                            return true;
                        }
                    }
                }
            }
            return false;
        } catch (MalformedJsonException e) {
            throw new MalformedJsonException(e.getMessage() + ". Json: '" + str + '\'');
        }
    }
}
