package com.twitter.sdk.android.core.models;

import com.bytedance.covode.number.Covode;
import com.google.gson.AbstractC28031v;
import com.google.gson.AbstractC28033w;
import com.google.gson.C27910f;
import com.google.gson.p2019b.C27895a;
import com.google.gson.p2020c.C27897a;
import com.google.gson.p2020c.C27900c;
import java.util.Collections;
import java.util.Map;

public class SafeMapAdapter implements AbstractC28033w {
    static {
        Covode.recordClassIndex(103798);
    }

    @Override // com.google.gson.AbstractC28033w
    public <T> AbstractC28031v<T> create(C27910f fVar, final C27895a<T> aVar) {
        final AbstractC28031v<T> a = fVar.mo46664a(this, aVar);
        return new AbstractC28031v<T>() {
            /* class com.twitter.sdk.android.core.models.SafeMapAdapter.C877981 */

            static {
                Covode.recordClassIndex(103799);
            }

            @Override // com.google.gson.AbstractC28031v
            public final T read(C27897a aVar) {
                T t = (T) a.read(aVar);
                if (Map.class.isAssignableFrom(aVar.rawType)) {
                    return t == null ? (T) Collections.EMPTY_MAP : (T) Collections.unmodifiableMap(t);
                }
                return t;
            }

            @Override // com.google.gson.AbstractC28031v
            public final void write(C27900c cVar, T t) {
                a.write(cVar, t);
            }
        };
    }
}
