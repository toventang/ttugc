package com.p2082ss.android.ugc.aweme.ecommerce.pdp.p2850b;

import com.bytedance.covode.number.Covode;
import java.util.HashMap;
import p4600h.C89378p;
import p4600h.p4601a.C89041ag;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.b.l */
public final class C44742l extends AbstractC44713g {

    /* renamed from: c */
    public static final C44743a f104402c = new C44743a((byte) 0);

    /* renamed from: a */
    public final String f104403a;

    /* renamed from: b */
    public final boolean f104404b;

    static {
        Covode.recordClassIndex(53128);
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.b.l$a */
    public static final class C44743a {
        static {
            Covode.recordClassIndex(53129);
        }

        private C44743a() {
        }

        public /* synthetic */ C44743a(byte b) {
            this();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.ecommerce.track.AbstractC45535a
    /* renamed from: a */
    public final HashMap<String, Object> mo73987a() {
        String str;
        C89378p[] pVarArr = new C89378p[2];
        pVarArr[0] = new C89378p("module_for", this.f104403a);
        if (this.f104404b) {
            str = "full_screen";
        } else {
            str = "half_screen";
        }
        pVarArr[1] = new C89378p("page_show_type", str);
        return C89041ag.m154428c(pVarArr);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C44742l(String str, boolean z) {
        super("tiktokec_product_detail_page_module_show");
        C89219l.m154721d(str, "");
        this.f104403a = str;
        this.f104404b = z;
    }
}
