package com.bytedance.ies.bullet.service.p1178g.p1181c;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.p1129c.p1136e.p1137a.C16248b;
import com.bytedance.ies.bullet.service.base.p1164b.C16616a;
import com.bytedance.ies.bullet.service.base.web.AbstractC16679f;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.bullet.service.g.c.b */
public final class C16874b extends C16616a implements AbstractC16679f {

    /* renamed from: a */
    public static final C16875a f40098a = new C16875a((byte) 0);

    /* renamed from: b */
    private final String f40099b;

    static {
        Covode.recordClassIndex(19314);
    }

    /* renamed from: com.bytedance.ies.bullet.service.g.c.b$a */
    public static final class C16875a {
        static {
            Covode.recordClassIndex(19315);
        }

        private C16875a() {
        }

        public /* synthetic */ C16875a(byte b) {
            this();
        }
    }

    public /* synthetic */ C16874b() {
        this("__prerender");
    }

    private C16874b(String str) {
        C89219l.m154719c(str, "");
        this.f40099b = str;
    }

    @Override // com.bytedance.ies.bullet.service.base.web.AbstractC16679f
    /* renamed from: a */
    public final Object mo26491a(Object obj) {
        C89219l.m154719c(obj, "");
        return new C16871a(this.f40099b, this, (C16248b) obj);
    }
}
