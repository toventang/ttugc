package com.p2082ss.android.ugc.aweme.ecommerce.pdp.p2850b;

import com.bytedance.covode.number.Covode;
import java.util.HashMap;
import p4600h.C89378p;
import p4600h.p4601a.C89041ag;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.b.o */
public final class C44748o extends AbstractC44713g {

    /* renamed from: c */
    public static final C44749a f104411c = new C44749a((byte) 0);

    /* renamed from: a */
    public final String f104412a;

    /* renamed from: b */
    public final Boolean f104413b;

    static {
        Covode.recordClassIndex(53134);
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.b.o$a */
    public static final class C44749a {
        static {
            Covode.recordClassIndex(53135);
        }

        private C44749a() {
        }

        public /* synthetic */ C44749a(byte b) {
            this();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.ecommerce.track.AbstractC45535a
    /* renamed from: a */
    public final HashMap<String, Object> mo73987a() {
        String str;
        HashMap<String, Object> c = C89041ag.m154428c(new C89378p("action_sheet_for", this.f104412a));
        Boolean bool = this.f104413b;
        if (bool != null) {
            if (bool.booleanValue()) {
                str = "yes";
            } else {
                str = "no";
            }
            c.put("has_shipping_address", str);
        }
        return c;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C44748o(String str, Boolean bool) {
        super("tiktokec_product_detail_page_action_sheet_show");
        C89219l.m154721d(str, "");
        this.f104412a = str;
        this.f104413b = bool;
    }
}
