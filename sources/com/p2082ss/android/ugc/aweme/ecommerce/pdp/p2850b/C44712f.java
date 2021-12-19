package com.p2082ss.android.ugc.aweme.ecommerce.pdp.p2850b;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.ecommerce.track.AbstractC45535a;
import java.util.HashMap;
import p4600h.C89378p;
import p4600h.p4601a.C89041ag;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.b.f */
public final class C44712f extends AbstractC45535a {

    /* renamed from: a */
    public final boolean f104290a;

    /* renamed from: b */
    public final long f104291b;

    /* renamed from: c */
    public final long f104292c;

    /* renamed from: d */
    public final boolean f104293d;

    /* renamed from: e */
    public final int f104294e;

    /* renamed from: f */
    public final String f104295f;

    /* renamed from: g */
    public final int f104296g;

    /* renamed from: h */
    public final long f104297h;

    /* renamed from: i */
    public final long f104298i;

    /* renamed from: j */
    public final int f104299j;

    static {
        Covode.recordClassIndex(53098);
    }

    @Override // com.p2082ss.android.ugc.aweme.ecommerce.track.AbstractC45535a
    /* renamed from: a */
    public final HashMap<String, Object> mo73987a() {
        String str;
        String str2;
        C89378p[] pVarArr = new C89378p[8];
        if (this.f104290a) {
            str = "full";
        } else {
            str = "half";
        }
        pVarArr[0] = new C89378p("style", str);
        if (this.f104293d) {
            str2 = "video";
        } else {
            str2 = "";
        }
        pVarArr[1] = new C89378p("business", str2);
        pVarArr[2] = new C89378p("retry_count", Integer.valueOf(this.f104294e));
        pVarArr[3] = new C89378p("preload_type", Integer.valueOf(this.f104296g));
        pVarArr[4] = new C89378p("template", this.f104295f);
        pVarArr[5] = new C89378p("start_click_to_now", Long.valueOf(this.f104297h));
        pVarArr[6] = new C89378p("image_load_duration", Long.valueOf(this.f104298i));
        pVarArr[7] = new C89378p("load_success", Integer.valueOf(this.f104299j));
        return C89041ag.m154428c(pVarArr);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C44712f(boolean z, long j, long j2, boolean z2, int i, String str, int i2, long j3, long j4, int i3) {
        super("rd_tiktokec_anchor_product_detail_duration");
        C89219l.m154721d(str, "");
        this.f104290a = z;
        this.f104291b = j;
        this.f104292c = j2;
        this.f104293d = z2;
        this.f104294e = i;
        this.f104295f = str;
        this.f104296g = i2;
        this.f104297h = j3;
        this.f104298i = j4;
        this.f104299j = i3;
    }
}
