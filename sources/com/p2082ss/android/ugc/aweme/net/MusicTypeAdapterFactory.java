package com.p2082ss.android.ugc.aweme.net;

import com.bytedance.covode.number.Covode;
import com.google.gson.AbstractC28031v;
import com.google.gson.AbstractC28033w;
import com.google.gson.C27910f;
import com.google.gson.p2019b.C27895a;
import com.google.gson.p2020c.C27897a;
import com.google.gson.p2020c.C27900c;
import com.google.gson.p2020c.EnumC27899b;
import com.p2082ss.android.ugc.aweme.music.model.Music;
import com.p2082ss.android.ugc.aweme.utils.C80517gw;

/* renamed from: com.ss.android.ugc.aweme.net.MusicTypeAdapterFactory */
public class MusicTypeAdapterFactory implements AbstractC28033w {
    static {
        Covode.recordClassIndex(71925);
    }

    @Override // com.google.gson.AbstractC28033w
    public <T> AbstractC28031v<T> create(C27910f fVar, C27895a<T> aVar) {
        if (!Music.class.isAssignableFrom(aVar.rawType)) {
            return null;
        }
        final AbstractC28031v<T> a = fVar.mo46664a(this, aVar);
        return new AbstractC28031v<T>() {
            /* class com.p2082ss.android.ugc.aweme.net.MusicTypeAdapterFactory.C612981 */

            static {
                Covode.recordClassIndex(71926);
            }

            @Override // com.google.gson.AbstractC28031v
            public final T read(C27897a aVar) {
                if (aVar.mo46627f() == EnumC27899b.NULL) {
                    aVar.mo46631k();
                    return null;
                }
                T t = (T) ((Music) a.read(aVar));
                C80517gw.m139563a().mo123773a(t.getOwnerId(), t.getSecUid());
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
