package com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.p2829a;

import com.bytedance.covode.number.Covode;
import java.util.HashMap;
import p4600h.C89378p;
import p4600h.p4601a.C89041ag;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.a.b */
public final class C43721b extends AbstractC43727e {

    /* renamed from: a */
    public static final C43722a f101902a = new C43722a((byte) 0);

    /* renamed from: b */
    private final String f101903b;

    static {
        Covode.recordClassIndex(51986);
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.a.b$a */
    public static final class C43722a {
        static {
            Covode.recordClassIndex(51987);
        }

        private C43722a() {
        }

        public /* synthetic */ C43722a(byte b) {
            this();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.ecommerce.track.AbstractC45535a
    /* renamed from: a */
    public final HashMap<String, Object> mo73987a() {
        return C89041ag.m154428c(new C89378p("button_for", "add address"), new C89378p("button_place", this.f101903b));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C43721b(String str) {
        super("tiktokec_order_submit_add_address_click");
        C89219l.m154721d(str, "");
        this.f101903b = str;
    }
}
