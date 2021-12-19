package com.p2082ss.android.ugc.aweme.music.p3470e;

import com.bytedance.covode.number.Covode;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.music.e.f */
public final class C60769f {

    /* renamed from: a */
    public final ConcurrentHashMap<String, AbstractC60753a> f138084a = new ConcurrentHashMap<>();

    /* renamed from: b */
    public final ConcurrentHashMap<String, AbstractC60753a> f138085b = new ConcurrentHashMap<>();

    static {
        Covode.recordClassIndex(71326);
    }

    /* renamed from: a */
    public final void mo98183a() {
        for (Map.Entry<String, AbstractC60753a> entry : this.f138084a.entrySet()) {
            entry.getKey();
            entry.getValue().mo98167a();
        }
        for (Map.Entry<String, AbstractC60753a> entry2 : this.f138085b.entrySet()) {
            entry2.getKey();
            entry2.getValue().mo98167a();
        }
        this.f138084a.clear();
        this.f138085b.clear();
    }

    /* renamed from: a */
    public final void mo98184a(String str, AbstractC60753a aVar) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(aVar, "");
        if (aVar instanceof C60770g) {
            this.f138084a.put(str, aVar);
        } else {
            this.f138085b.put(str, aVar);
        }
    }

    /* renamed from: b */
    public final void mo98185b(String str, AbstractC60753a aVar) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(aVar, "");
        if (aVar instanceof C60770g) {
            this.f138084a.remove(str);
        } else {
            this.f138085b.remove(str);
        }
    }
}
