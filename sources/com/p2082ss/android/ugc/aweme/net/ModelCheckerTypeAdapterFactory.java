package com.p2082ss.android.ugc.aweme.net;

import com.bytedance.covode.number.Covode;
import com.google.gson.AbstractC28031v;
import com.google.gson.AbstractC28033w;
import com.google.gson.C27910f;
import com.google.gson.C28023p;
import com.google.gson.C28027t;
import com.google.gson.p2019b.C27895a;
import com.google.gson.p2020c.C27897a;
import com.google.gson.p2020c.C27900c;
import com.google.gson.p2020c.EnumC27899b;
import com.p2082ss.android.ugc.aweme.base.api.AbstractC34479a;

/* renamed from: com.ss.android.ugc.aweme.net.ModelCheckerTypeAdapterFactory */
public final class ModelCheckerTypeAdapterFactory implements AbstractC28033w {
    static {
        Covode.recordClassIndex(71923);
    }

    @Override // com.google.gson.AbstractC28033w
    public final <T> AbstractC28031v<T> create(C27910f fVar, C27895a<T> aVar) {
        if (!AbstractC34479a.class.isAssignableFrom(aVar.rawType)) {
            return null;
        }
        AbstractC34479a.initRequiredFieldMap(aVar.rawType);
        final AbstractC28031v<T> a = fVar.mo46664a(this, aVar);
        return new AbstractC28031v<T>() {
            /* class com.p2082ss.android.ugc.aweme.net.ModelCheckerTypeAdapterFactory.C612971 */

            static {
                Covode.recordClassIndex(71924);
            }

            @Override // com.google.gson.AbstractC28031v
            public final T read(C27897a aVar) {
                if (aVar.mo46627f() == EnumC27899b.NULL) {
                    aVar.mo46631k();
                    return null;
                }
                T t = (T) ((AbstractC34479a) a.read(aVar));
                try {
                    t.checkValid();
                    return t;
                } catch (C28023p e) {
                    throw e;
                } catch (Throwable th) {
                    throw new C28027t(th);
                }
            }

            @Override // com.google.gson.AbstractC28031v
            public final void write(C27900c cVar, T t) {
                if (t == null) {
                    cVar.mo46654f();
                } else {
                    a.write(cVar, t);
                }
            }
        };
    }
}
