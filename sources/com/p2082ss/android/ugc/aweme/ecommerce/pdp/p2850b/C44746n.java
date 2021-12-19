package com.p2082ss.android.ugc.aweme.ecommerce.pdp.p2850b;

import com.bytedance.covode.number.Covode;
import java.util.HashMap;
import p4600h.C89378p;
import p4600h.p4601a.C89041ag;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.b.n */
public final class C44746n extends AbstractC44713g {

    /* renamed from: d */
    public static final C44747a f104407d = new C44747a((byte) 0);

    /* renamed from: a */
    public final String f104408a;

    /* renamed from: b */
    public final boolean f104409b;

    /* renamed from: c */
    public final String f104410c;

    static {
        Covode.recordClassIndex(53132);
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.b.n$a */
    public static final class C44747a {
        static {
            Covode.recordClassIndex(53133);
        }

        private C44747a() {
        }

        public /* synthetic */ C44747a(byte b) {
            this();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.ecommerce.track.AbstractC45535a
    /* renamed from: a */
    public final HashMap<String, Object> mo73987a() {
        String str;
        C89378p[] pVarArr = new C89378p[3];
        pVarArr[0] = new C89378p("photo_show_type", this.f104408a);
        if (this.f104409b) {
            str = "full_screen";
        } else {
            str = "half_screen";
        }
        pVarArr[1] = new C89378p("page_show_type", str);
        pVarArr[2] = new C89378p("photo_id", this.f104410c);
        return C89041ag.m154428c(pVarArr);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C44746n(String str, boolean z, String str2) {
        super("tiktokec_product_detail_page_photo_glide");
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        this.f104408a = str;
        this.f104409b = z;
        this.f104410c = str2;
    }
}
