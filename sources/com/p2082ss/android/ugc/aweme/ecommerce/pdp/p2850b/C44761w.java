package com.p2082ss.android.ugc.aweme.ecommerce.pdp.p2850b;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.ecommerce.track.AbstractC45535a;
import java.util.HashMap;
import p4600h.C89378p;
import p4600h.p4601a.C89041ag;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.b.w */
public final class C44761w extends AbstractC45535a {

    /* renamed from: a */
    public final boolean f104425a;

    /* renamed from: b */
    public final long f104426b;

    /* renamed from: c */
    public final int f104427c;

    static {
        Covode.recordClassIndex(53147);
    }

    @Override // com.p2082ss.android.ugc.aweme.ecommerce.track.AbstractC45535a
    /* renamed from: a */
    public final HashMap<String, Object> mo73987a() {
        String str;
        C89378p[] pVarArr = new C89378p[3];
        if (this.f104425a) {
            str = "full";
        } else {
            str = "half";
        }
        pVarArr[0] = new C89378p("style", str);
        pVarArr[1] = new C89378p("start_click_to_now", Long.valueOf(this.f104426b));
        pVarArr[2] = new C89378p("product_quantity", Integer.valueOf(this.f104427c));
        return C89041ag.m154428c(pVarArr);
    }

    public C44761w(boolean z, long j, int i) {
        super("rd_tiktokec_anchor_sku_duration");
        this.f104425a = z;
        this.f104426b = j;
        this.f104427c = i;
    }
}
