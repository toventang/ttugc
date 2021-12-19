package com.p2082ss.android.ugc.aweme.net;

import com.bytedance.covode.number.Covode;
import com.google.gson.AbstractC28031v;
import com.google.gson.AbstractC28033w;
import com.google.gson.C27910f;
import com.google.gson.C28023p;
import com.google.gson.p2019b.C27895a;
import com.google.gson.p2020c.C27897a;
import com.google.gson.p2020c.C27900c;
import com.google.gson.p2020c.EnumC27899b;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;
import com.p2082ss.android.ugc.aweme.base.api.p2365a.p2367b.C34485a;

/* renamed from: com.ss.android.ugc.aweme.net.BaseResponseObjectTypeAdapterFactory */
public class BaseResponseObjectTypeAdapterFactory implements AbstractC28033w {
    static {
        Covode.recordClassIndex(71914);
    }

    @Override // com.google.gson.AbstractC28033w
    public <T> AbstractC28031v<T> create(C27910f fVar, C27895a<T> aVar) {
        if (!BaseResponse.class.isAssignableFrom(aVar.rawType)) {
            return null;
        }
        final AbstractC28031v<T> a = fVar.mo46664a(this, aVar);
        return new AbstractC28031v<T>() {
            /* class com.p2082ss.android.ugc.aweme.net.BaseResponseObjectTypeAdapterFactory.C612951 */

            static {
                Covode.recordClassIndex(71915);
            }

            @Override // com.google.gson.AbstractC28031v
            public final T read(C27897a aVar) {
                if (aVar.mo46627f() == EnumC27899b.NULL) {
                    aVar.mo46631k();
                    return null;
                }
                try {
                    T t = (T) ((BaseResponse) a.read(aVar));
                    if (t.extra != null && t.extra.now > 0) {
                        C61453p.f139505a = t.extra.now;
                    }
                    return t;
                } catch (C28023p e) {
                    if (e.getCause() instanceof C34485a) {
                        throw e.getCause();
                    }
                    throw e;
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
