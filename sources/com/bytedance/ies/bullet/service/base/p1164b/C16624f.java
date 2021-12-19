package com.bytedance.ies.bullet.service.base.p1164b;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.service.base.p1163a.AbstractC16568c;
import java.util.concurrent.ConcurrentHashMap;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.bullet.service.base.b.f */
public final class C16624f {

    /* renamed from: a */
    final ConcurrentHashMap<String, AbstractC16568c> f39781a;

    /* renamed from: b */
    private String f39782b;

    static {
        Covode.recordClassIndex(19061);
    }

    /* renamed from: com.bytedance.ies.bullet.service.base.b.f$a */
    public static final class C16625a {

        /* renamed from: a */
        public final ConcurrentHashMap<String, AbstractC16568c> f39783a = new ConcurrentHashMap<>();

        /* renamed from: b */
        public String f39784b = "default_bid";

        static {
            Covode.recordClassIndex(19062);
        }

        /* renamed from: a */
        public final C16624f mo26385a() {
            return new C16624f(this, (byte) 0);
        }

        /* renamed from: a */
        public final C16625a mo26384a(String str) {
            C89219l.m154719c(str, "");
            this.f39784b = str;
            return this;
        }

        /* renamed from: a */
        public final <T extends AbstractC16568c> C16625a mo26383a(Class<? extends T> cls, T t) {
            C89219l.m154719c(cls, "");
            C89219l.m154719c(t, "");
            ConcurrentHashMap<String, AbstractC16568c> concurrentHashMap = this.f39783a;
            String name = cls.getName();
            C89219l.m154709a((Object) name, "");
            concurrentHashMap.put(name, t);
            return this;
        }
    }

    private C16624f() {
        this.f39781a = new ConcurrentHashMap<>();
    }

    /* renamed from: a */
    public final AbstractC16568c mo26381a(String str) {
        C89219l.m154719c(str, "");
        return this.f39781a.get(str);
    }

    private C16624f(C16625a aVar) {
        this();
        this.f39782b = aVar.f39784b;
        this.f39781a.putAll(aVar.f39783a);
    }

    public /* synthetic */ C16624f(C16625a aVar, byte b) {
        this(aVar);
    }

    /* renamed from: a */
    public final void mo26382a(String str, AbstractC16568c cVar) {
        C89219l.m154719c(str, "");
        C89219l.m154719c(cVar, "");
        AbstractC16568c cVar2 = this.f39781a.get(str);
        if (cVar2 != null) {
            cVar2.mo25929a();
        }
        String str2 = this.f39782b;
        if (str2 == null) {
            C89219l.m154710a("bid");
        }
        cVar.mo26322b(str2);
        this.f39781a.put(str, cVar);
    }
}
