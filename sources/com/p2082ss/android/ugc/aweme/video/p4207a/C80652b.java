package com.p2082ss.android.ugc.aweme.video.p4207a;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.feed.model.Video;
import java.util.LinkedHashMap;
import java.util.Map;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89206ad;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.video.a.b */
public final class C80652b {

    /* renamed from: a */
    private final Map<Object, Object> f180337a = new LinkedHashMap();

    static {
        Covode.recordClassIndex(93931);
    }

    /* renamed from: a */
    private <T> AbstractC89172b<T, Video> m139868a(Class<T> cls) {
        C89219l.m154721d(cls, "");
        Object obj = this.f180337a.get(cls);
        if (obj == null) {
            return null;
        }
        if (!C89206ad.m154678a(obj, 1)) {
            obj = null;
        }
        return (AbstractC89172b) obj;
    }

    /* renamed from: a */
    public final <T> void mo123842a(Class<T> cls, AbstractC89172b<? super T, ? extends Video> bVar) {
        C89219l.m154721d(cls, "");
        C89219l.m154721d(bVar, "");
        this.f180337a.put(cls, bVar);
    }

    /* renamed from: a */
    public final <T> Video mo123841a(Class<T> cls, T t) {
        C89219l.m154721d(cls, "");
        AbstractC89172b<T, Video> a = m139868a(cls);
        if (a != null) {
            return a.invoke(t);
        }
        return null;
    }
}
