package com.p2082ss.android.ugc.aweme.net;

import com.bytedance.covode.number.Covode;
import com.google.gson.AbstractC28031v;
import com.google.gson.AbstractC28033w;
import com.google.gson.C27910f;
import com.google.gson.p2019b.C27895a;
import com.google.gson.p2020c.C27897a;
import com.google.gson.p2020c.C27900c;
import com.google.gson.p2020c.EnumC27899b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: com.ss.android.ugc.aweme.net.CollectionTypeAdapterFactory */
public final class CollectionTypeAdapterFactory implements AbstractC28033w {
    static {
        Covode.recordClassIndex(71916);
    }

    @Override // com.google.gson.AbstractC28033w
    public final <T> AbstractC28031v<T> create(C27910f fVar, C27895a<T> aVar) {
        if (!Collection.class.isAssignableFrom(aVar.rawType)) {
            return null;
        }
        final AbstractC28031v<T> a = fVar.mo46664a(this, aVar);
        return new AbstractC28031v<T>() {
            /* class com.p2082ss.android.ugc.aweme.net.CollectionTypeAdapterFactory.C612961 */

            static {
                Covode.recordClassIndex(71917);
            }

            @Override // com.google.gson.AbstractC28031v
            public final T read(C27897a aVar) {
                if (aVar.mo46627f() == EnumC27899b.NULL) {
                    aVar.mo46631k();
                    return null;
                }
                T t = (T) ((Collection) a.read(aVar));
                if (t instanceof ArrayList) {
                    T t2 = t;
                    for (int size = t2.size() - 1; size >= 0; size--) {
                        if (t2.get(size) == null) {
                            t2.remove(size);
                        }
                    }
                    return t2;
                }
                Iterator it = t.iterator();
                while (it.hasNext()) {
                    if (it.next() == null) {
                        it.remove();
                    }
                }
                return t;
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
