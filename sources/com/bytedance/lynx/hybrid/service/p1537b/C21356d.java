package com.bytedance.lynx.hybrid.service.p1537b;

import com.bytedance.covode.number.Covode;
import com.bytedance.lynx.hybrid.service.p1536a.AbstractC21348a;
import com.bytedance.lynx.hybrid.service.p1537b.C21353c;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.lynx.hybrid.service.b.d */
public class C21356d implements AbstractC21348a {

    /* renamed from: b */
    public static final C21357a f50708b = new C21357a((byte) 0);

    /* renamed from: a */
    private String f50709a = "default_bid";

    static {
        Covode.recordClassIndex(24975);
    }

    @Override // com.bytedance.lynx.hybrid.service.p1536a.AbstractC21348a
    /* renamed from: u_ */
    public void mo34922u_() {
    }

    /* renamed from: com.bytedance.lynx.hybrid.service.b.d$a */
    public static final class C21357a {
        static {
            Covode.recordClassIndex(24976);
        }

        private C21357a() {
        }

        public /* synthetic */ C21357a(byte b) {
            this();
        }
    }

    @Override // com.bytedance.lynx.hybrid.service.p1536a.AbstractC21348a
    /* renamed from: b */
    public final String mo34953b() {
        return this.f50709a;
    }

    @Override // com.bytedance.lynx.hybrid.service.p1536a.AbstractC21348a
    /* renamed from: a */
    public final void mo34952a(String str) {
        C89219l.m154719c(str, "");
        this.f50709a = str;
    }

    /* renamed from: a */
    public final <T extends AbstractC21348a> T mo34957a(Class<T> cls) {
        C89219l.m154719c(cls, "");
        return (T) C21353c.C21354a.m40102a().mo34955a(this.f50709a, cls);
    }
}
