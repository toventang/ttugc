package com.google.gson;

import com.bytedance.covode.number.Covode;
import com.google.gson.internal.bind.C27940c;
import com.google.gson.internal.bind.C27942d;
import com.google.gson.p2020c.C27897a;
import com.google.gson.p2020c.C27900c;
import com.google.gson.p2020c.EnumC27899b;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;

/* renamed from: com.google.gson.v */
public abstract class AbstractC28031v<T> {
    static {
        Covode.recordClassIndex(33644);
    }

    public abstract T read(C27897a aVar);

    public abstract void write(C27900c cVar, T t);

    public final AbstractC28031v<T> nullSafe() {
        return new AbstractC28031v<T>() {
            /* class com.google.gson.AbstractC28031v.C280321 */

            static {
                Covode.recordClassIndex(33645);
            }

            @Override // com.google.gson.AbstractC28031v
            public final T read(C27897a aVar) {
                if (aVar.mo46627f() != EnumC27899b.NULL) {
                    return (T) AbstractC28031v.this.read(aVar);
                }
                aVar.mo46631k();
                return null;
            }

            @Override // com.google.gson.AbstractC28031v
            public final void write(C27900c cVar, T t) {
                if (t == null) {
                    cVar.mo46654f();
                } else {
                    AbstractC28031v.this.write(cVar, t);
                }
            }
        };
    }

    public final T fromJson(Reader reader) {
        return read(new C27897a(reader));
    }

    public final T fromJson(String str) {
        return fromJson(new StringReader(str));
    }

    public final T fromJsonTree(AbstractC28019l lVar) {
        try {
            return read(new C27940c(lVar));
        } catch (IOException e) {
            throw new C28020m(e);
        }
    }

    public final String toJson(T t) {
        StringWriter stringWriter = new StringWriter();
        try {
            toJson(stringWriter, t);
            return stringWriter.toString();
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    public final AbstractC28019l toJsonTree(T t) {
        try {
            C27942d dVar = new C27942d();
            write(dVar, t);
            return dVar.mo46734a();
        } catch (IOException e) {
            throw new C28020m(e);
        }
    }

    public final void toJson(Writer writer, T t) {
        write(new C27900c(writer), t);
    }
}
