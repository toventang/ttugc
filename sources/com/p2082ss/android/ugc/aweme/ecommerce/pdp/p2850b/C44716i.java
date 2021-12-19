package com.p2082ss.android.ugc.aweme.ecommerce.pdp.p2850b;

import com.bytedance.covode.number.Covode;
import java.util.HashMap;
import p4600h.C89378p;
import p4600h.p4601a.C89041ag;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.b.i */
public final class C44716i extends AbstractC44713g {

    /* renamed from: b */
    public static final C44717a f104306b = new C44717a((byte) 0);

    /* renamed from: a */
    public final boolean f104307a;

    static {
        Covode.recordClassIndex(53102);
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.b.i$a */
    public static final class C44717a {
        static {
            Covode.recordClassIndex(53103);
        }

        private C44717a() {
        }

        public /* synthetic */ C44717a(byte b) {
            this();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.ecommerce.track.AbstractC45535a
    /* renamed from: a */
    public final HashMap<String, Object> mo73987a() {
        String str;
        C89378p[] pVarArr = new C89378p[1];
        if (this.f104307a) {
            str = "full_screen";
        } else {
            str = "half_screen";
        }
        pVarArr[0] = new C89378p("page_show_type", str);
        return C89041ag.m154428c(pVarArr);
    }

    public C44716i(boolean z) {
        super("tiktokec_product_detail_fullhalfpage_show");
        this.f104307a = z;
    }
}
