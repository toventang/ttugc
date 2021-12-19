package com.p2082ss.android.ugc.aweme.ecommerce.pdp.p2850b;

import com.bytedance.covode.number.Covode;
import java.util.HashMap;
import p4600h.C89378p;
import p4600h.p4601a.C89041ag;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.b.u */
public final class C44758u extends AbstractC44713g {

    /* renamed from: c */
    public static final C44759a f104421c = new C44759a((byte) 0);

    /* renamed from: a */
    public final String f104422a;

    /* renamed from: b */
    public final int f104423b;

    static {
        Covode.recordClassIndex(53144);
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.b.u$a */
    public static final class C44759a {
        static {
            Covode.recordClassIndex(53145);
        }

        private C44759a() {
        }

        public /* synthetic */ C44759a(byte b) {
            this();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.ecommerce.track.AbstractC45535a
    /* renamed from: a */
    public final HashMap<String, Object> mo73987a() {
        return C89041ag.m154428c(new C89378p("video_id", this.f104422a), new C89378p("duration", Integer.valueOf(this.f104423b)));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C44758u(String str, int i) {
        super("tiktokec_product_detail_page_video_stay_time");
        C89219l.m154721d(str, "");
        this.f104422a = str;
        this.f104423b = i;
    }
}
