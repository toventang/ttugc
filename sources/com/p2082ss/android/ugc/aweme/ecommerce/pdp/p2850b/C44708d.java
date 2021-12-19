package com.p2082ss.android.ugc.aweme.ecommerce.pdp.p2850b;

import com.bytedance.covode.number.Covode;
import java.util.HashMap;
import p4600h.C89387v;
import p4600h.p4601a.C89041ag;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.b.d */
public final class C44708d extends AbstractC44713g {

    /* renamed from: d */
    public static final C44709a f104283d = new C44709a((byte) 0);

    /* renamed from: a */
    public final String f104284a;

    /* renamed from: b */
    public final Boolean f104285b;

    /* renamed from: c */
    public final Boolean f104286c;

    static {
        Covode.recordClassIndex(53094);
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.b.d$a */
    public static final class C44709a {
        static {
            Covode.recordClassIndex(53095);
        }

        private C44709a() {
        }

        public /* synthetic */ C44709a(byte b) {
            this();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.ecommerce.track.AbstractC45535a
    /* renamed from: a */
    public final HashMap<String, Object> mo73987a() {
        String str;
        HashMap<String, Object> c = C89041ag.m154428c(C89387v.m154943a("button_for", this.f104284a));
        Boolean bool = this.f104285b;
        String str2 = "1";
        if (bool != null) {
            if (bool.booleanValue()) {
                str = str2;
            } else {
                str = "0";
            }
            c.put("is_clickable", str);
        }
        Boolean bool2 = this.f104286c;
        if (bool2 != null) {
            if (!bool2.booleanValue()) {
                str2 = "0";
            }
            c.put("is_buy_with_coupon", str2);
        }
        return c;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C44708d(String str, Boolean bool, Boolean bool2) {
        super("tiktokec_product_detail_page_button_click");
        C89219l.m154721d(str, "");
        this.f104284a = str;
        this.f104285b = bool;
        this.f104286c = bool2;
    }
}
