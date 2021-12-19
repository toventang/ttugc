package com.p2082ss.android.ugc.aweme.ecommerce.pdp.p2850b;

import com.bytedance.covode.number.Covode;
import java.util.HashMap;
import p4600h.C89378p;
import p4600h.p4601a.C89041ag;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.b.j */
public final class C44718j extends AbstractC44713g {

    /* renamed from: b */
    public static final C44719a f104308b = new C44719a((byte) 0);

    /* renamed from: a */
    public final String f104309a;

    static {
        Covode.recordClassIndex(53104);
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.b.j$a */
    public static final class C44719a {
        static {
            Covode.recordClassIndex(53105);
        }

        private C44719a() {
        }

        public /* synthetic */ C44719a(byte b) {
            this();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.ecommerce.track.AbstractC45535a
    /* renamed from: a */
    public final HashMap<String, Object> mo73987a() {
        return C89041ag.m154428c(new C89378p("glide_type", this.f104309a));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C44718j(String str) {
        super("tiktokec_product_detail_page_glide");
        C89219l.m154721d(str, "");
        this.f104309a = str;
    }
}
