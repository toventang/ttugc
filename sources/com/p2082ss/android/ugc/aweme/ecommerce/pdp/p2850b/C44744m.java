package com.p2082ss.android.ugc.aweme.ecommerce.pdp.p2850b;

import com.bytedance.covode.number.Covode;
import java.util.HashMap;
import p4600h.C89378p;
import p4600h.p4601a.C89041ag;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.b.m */
public final class C44744m extends AbstractC44713g {

    /* renamed from: b */
    public static final C44745a f104405b = new C44745a((byte) 0);

    /* renamed from: a */
    public final String f104406a;

    static {
        Covode.recordClassIndex(53130);
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.b.m$a */
    public static final class C44745a {
        static {
            Covode.recordClassIndex(53131);
        }

        private C44745a() {
        }

        public /* synthetic */ C44745a(byte b) {
            this();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.ecommerce.track.AbstractC45535a
    /* renamed from: a */
    public final HashMap<String, Object> mo73987a() {
        return C89041ag.m154428c(new C89378p("photo_id", this.f104406a));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C44744m(String str) {
        super("tiktokec_product_detail_page_photo_click");
        C89219l.m154721d(str, "");
        this.f104406a = str;
    }
}
