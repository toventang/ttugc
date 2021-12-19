package com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.p2829a;

import com.bytedance.covode.number.Covode;
import java.util.HashMap;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.a.d */
public final class C43725d extends AbstractC43727e {

    /* renamed from: a */
    public static final C43726a f101909a = new C43726a((byte) 0);

    /* renamed from: b */
    private final String f101910b;

    /* renamed from: c */
    private final Boolean f101911c;

    /* renamed from: d */
    private final Boolean f101912d = null;

    static {
        Covode.recordClassIndex(51990);
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.a.d$a */
    public static final class C43726a {
        static {
            Covode.recordClassIndex(51991);
        }

        private C43726a() {
        }

        public /* synthetic */ C43726a(byte b) {
            this();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.ecommerce.track.AbstractC45535a
    /* renamed from: a */
    public final HashMap<String, Object> mo73987a() {
        String str;
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put("button_for", this.f101910b);
        Boolean bool = this.f101911c;
        String str2 = "yes";
        if (bool != null) {
            if (bool.booleanValue()) {
                str = str2;
            } else {
                str = "no";
            }
            hashMap.put("is_address_deliverable", str);
        }
        Boolean bool2 = this.f101912d;
        if (bool2 != null) {
            if (!bool2.booleanValue()) {
                str2 = "no";
            }
            hashMap.put("is_delivery_info_complete", str2);
        }
        return hashMap;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C43725d(String str, Boolean bool, Boolean bool2) {
        super("tiktokec_order_submit_button_click");
        C89219l.m154721d(str, "");
        this.f101910b = str;
        this.f101911c = bool;
    }
}
