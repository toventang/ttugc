package com.p2082ss.android.ugc.aweme.ecommerce.pdp.p2850b;

import com.bytedance.covode.number.Covode;
import java.util.HashMap;
import p4600h.C89378p;
import p4600h.p4601a.C89041ag;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.b.t */
public final class C44756t extends AbstractC44713g {

    /* renamed from: c */
    public static final C44757a f104418c = new C44757a((byte) 0);

    /* renamed from: a */
    public final String f104419a;

    /* renamed from: b */
    public final int f104420b;

    static {
        Covode.recordClassIndex(53142);
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.b.t$a */
    public static final class C44757a {
        static {
            Covode.recordClassIndex(53143);
        }

        private C44757a() {
        }

        public /* synthetic */ C44757a(byte b) {
            this();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.ecommerce.track.AbstractC45535a
    /* renamed from: a */
    public final HashMap<String, Object> mo73987a() {
        return C89041ag.m154428c(new C89378p("video_id", this.f104419a), new C89378p("video_whole_duration", Integer.valueOf(this.f104420b)));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C44756t(String str, int i) {
        super("tiktokec_product_detail_page_video_click");
        C89219l.m154721d(str, "");
        this.f104419a = str;
        this.f104420b = i;
    }
}
