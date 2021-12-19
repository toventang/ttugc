package com.google.android.datatransport.cct.p1923a;

import android.util.JsonReader;
import android.util.JsonToken;
import com.bytedance.covode.number.Covode;
import java.io.IOException;
import java.io.Reader;

/* renamed from: com.google.android.datatransport.cct.a.s */
public abstract class AbstractC25099s {
    static {
        Covode.recordClassIndex(30464);
    }

    /* renamed from: a */
    public abstract long mo41044a();

    /* renamed from: a */
    public static AbstractC25099s m48126a(Reader reader) {
        JsonReader jsonReader = new JsonReader(reader);
        try {
            jsonReader.beginObject();
            while (jsonReader.hasNext()) {
                if (!jsonReader.nextName().equals("nextRequestWaitMillis")) {
                    jsonReader.skipValue();
                } else if (jsonReader.peek() == JsonToken.STRING) {
                    return new C25084i(Long.parseLong(jsonReader.nextString()));
                } else {
                    C25084i iVar = new C25084i(jsonReader.nextLong());
                    jsonReader.close();
                    return iVar;
                }
            }
            throw new IOException("Response is missing nextRequestWaitMillis field.");
        } finally {
            jsonReader.close();
        }
    }
}
