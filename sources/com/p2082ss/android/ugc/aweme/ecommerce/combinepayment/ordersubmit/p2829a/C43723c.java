package com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.p2829a;

import com.bytedance.covode.number.Covode;
import java.util.HashMap;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.a.c */
public final class C43723c extends AbstractC43738i {

    /* renamed from: a */
    public static final C43724a f101904a = new C43724a((byte) 0);

    /* renamed from: b */
    private final boolean f101905b;

    /* renamed from: c */
    private final boolean f101906c;

    /* renamed from: d */
    private final Boolean f101907d;

    /* renamed from: e */
    private final String f101908e;

    static {
        Covode.recordClassIndex(51988);
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.a.c$a */
    public static final class C43724a {
        static {
            Covode.recordClassIndex(51989);
        }

        private C43724a() {
        }

        public /* synthetic */ C43724a(byte b) {
            this();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.ecommerce.track.AbstractC45535a, com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.p2829a.AbstractC43738i
    /* renamed from: a */
    public final HashMap<String, Object> mo73987a() {
        String str;
        String str2;
        HashMap<String, Object> hashMap = new HashMap<>();
        HashMap<String, Object> a = super.mo73987a();
        if (a != null) {
            hashMap.putAll(a);
        }
        String str3 = "yes";
        if (this.f101905b) {
            str = str3;
        } else {
            str = "no";
        }
        hashMap.put("is_retry", str);
        if (this.f101906c) {
            str2 = str3;
        } else {
            str2 = "no";
        }
        hashMap.put("is_success", str2);
        Boolean bool = this.f101907d;
        if (bool != null) {
            if (!bool.booleanValue()) {
                str3 = "no";
            }
            hashMap.put("is_incomplete_data", str3);
        }
        String str4 = this.f101908e;
        if (str4 != null) {
            hashMap.put("error_code", str4);
        }
        return hashMap;
    }

    public C43723c(boolean z, boolean z2, Boolean bool, String str) {
        super("rd_tiktokec_first_bill_info_request_result");
        this.f101905b = z;
        this.f101906c = z2;
        this.f101907d = bool;
        this.f101908e = str;
    }
}
