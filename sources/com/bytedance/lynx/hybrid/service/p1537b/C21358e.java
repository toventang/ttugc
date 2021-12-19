package com.bytedance.lynx.hybrid.service.p1537b;

import com.bytedance.covode.number.Covode;
import com.bytedance.lynx.hybrid.service.p1536a.AbstractC21348a;
import java.util.concurrent.ConcurrentHashMap;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.lynx.hybrid.service.b.e */
public final class C21358e {

    /* renamed from: a */
    private final ConcurrentHashMap<String, AbstractC21348a> f50710a;

    /* renamed from: b */
    private String f50711b;

    static {
        Covode.recordClassIndex(24977);
    }

    /* renamed from: com.bytedance.lynx.hybrid.service.b.e$a */
    public static final class C21359a {

        /* renamed from: a */
        public final ConcurrentHashMap<String, AbstractC21348a> f50712a = new ConcurrentHashMap<>();

        /* renamed from: b */
        public String f50713b = "default_bid";

        static {
            Covode.recordClassIndex(24978);
        }

        /* renamed from: a */
        public final C21358e mo34961a() {
            return new C21358e(this, (byte) 0);
        }

        /* renamed from: a */
        public final C21359a mo34960a(String str) {
            C89219l.m154719c(str, "");
            this.f50713b = str;
            return this;
        }
    }

    private C21358e() {
        this.f50710a = new ConcurrentHashMap<>();
    }

    /* renamed from: a */
    public final AbstractC21348a mo34958a(String str) {
        C89219l.m154719c(str, "");
        return this.f50710a.get(str);
    }

    private C21358e(C21359a aVar) {
        this();
        this.f50711b = aVar.f50713b;
        this.f50710a.putAll(aVar.f50712a);
    }

    public /* synthetic */ C21358e(C21359a aVar, byte b) {
        this(aVar);
    }

    /* renamed from: a */
    public final void mo34959a(String str, AbstractC21348a aVar) {
        C89219l.m154719c(str, "");
        C89219l.m154719c(aVar, "");
        AbstractC21348a aVar2 = this.f50710a.get(str);
        if (aVar2 != null) {
            aVar2.mo34922u_();
        }
        String str2 = this.f50711b;
        if (str2 == null) {
            C89219l.m154710a("bid");
        }
        aVar.mo34952a(str2);
        this.f50710a.put(str, aVar);
    }
}
