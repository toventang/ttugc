package com.p2082ss.android.ugc.aweme.ecommerce.pdp.p2850b;

import com.bytedance.covode.number.Covode;
import java.util.HashMap;
import p4600h.C89378p;
import p4600h.p4601a.C89041ag;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.b.h */
public final class C44714h extends AbstractC44713g {

    /* renamed from: f */
    public static final C44715a f104301f = new C44715a((byte) 0);

    /* renamed from: a */
    public final boolean f104302a;

    /* renamed from: b */
    public final long f104303b;

    /* renamed from: c */
    public final int f104304c;

    /* renamed from: d */
    public final boolean f104305d;

    static {
        Covode.recordClassIndex(53100);
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.b.h$a */
    public static final class C44715a {
        static {
            Covode.recordClassIndex(53101);
        }

        private C44715a() {
        }

        public /* synthetic */ C44715a(byte b) {
            this();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.ecommerce.track.AbstractC45535a
    /* renamed from: a */
    public final HashMap<String, Object> mo73987a() {
        String str;
        String str2;
        C89378p[] pVarArr = new C89378p[4];
        if (this.f104302a) {
            str = "full_screen";
        } else {
            str = "half_screen";
        }
        pVarArr[0] = new C89378p("page_show_type", str);
        pVarArr[1] = new C89378p("photo_view_cnt", Integer.valueOf(this.f104304c));
        pVarArr[2] = new C89378p("duration", Long.valueOf(this.f104303b));
        if (this.f104305d) {
            str2 = "yes";
        } else {
            str2 = "no";
        }
        pVarArr[3] = new C89378p("is_address_deliverable", str2);
        return C89041ag.m154428c(pVarArr);
    }

    public C44714h(boolean z, long j, int i, boolean z2) {
        super("tiktokec_product_detail_fullhalfpage_time");
        this.f104302a = z;
        this.f104303b = j;
        this.f104304c = i;
        this.f104305d = z2;
    }
}
