package com.p2082ss.android.ugc.aweme.ecommerce.pdp.p2850b;

import com.bytedance.covode.number.Covode;
import java.util.HashMap;
import p4600h.C89378p;
import p4600h.p4601a.C89041ag;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.b.e */
public final class C44710e extends AbstractC44713g {

    /* renamed from: b */
    public static final C44711a f104287b = new C44711a((byte) 0);

    /* renamed from: a */
    public final String f104288a;

    /* renamed from: c */
    private final Boolean f104289c;

    static {
        Covode.recordClassIndex(53096);
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.b.e$a */
    public static final class C44711a {
        static {
            Covode.recordClassIndex(53097);
        }

        private C44711a() {
        }

        public /* synthetic */ C44711a(byte b) {
            this();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.ecommerce.track.AbstractC45535a
    /* renamed from: a */
    public final HashMap<String, Object> mo73987a() {
        String str;
        HashMap<String, Object> c = C89041ag.m154428c(new C89378p("button_for", this.f104288a));
        Boolean bool = this.f104289c;
        if (bool != null) {
            bool.booleanValue();
            if (this.f104289c.booleanValue()) {
                str = "yes";
            } else {
                str = "no";
            }
            c.put("is_add_new_shipping", str);
        }
        return c;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C44710e(String str, Boolean bool) {
        super("tiktokec_product_detail_page_logisticsactionsheet_click");
        C89219l.m154721d(str, "");
        this.f104288a = str;
        this.f104289c = bool;
    }
}
