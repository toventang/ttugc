package com.p2082ss.android.ugc.aweme.ecommerce.pdp.p2850b;

import com.bytedance.covode.number.Covode;
import java.util.HashMap;
import p4600h.C89378p;
import p4600h.p4601a.C89041ag;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.b.q */
public final class C44752q extends AbstractC44713g {

    /* renamed from: b */
    public static final C44753a f104415b = new C44753a((byte) 0);

    /* renamed from: a */
    public final String f104416a;

    static {
        Covode.recordClassIndex(53138);
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.b.q$a */
    public static final class C44753a {
        static {
            Covode.recordClassIndex(53139);
        }

        private C44753a() {
        }

        public /* synthetic */ C44753a(byte b) {
            this();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.ecommerce.track.AbstractC45535a
    /* renamed from: a */
    public final HashMap<String, Object> mo73987a() {
        return C89041ag.m154428c(new C89378p("shop_id", this.f104416a));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C44752q(String str) {
        super("tiktokec_report_entrance_show");
        C89219l.m154721d(str, "");
        this.f104416a = str;
    }
}
