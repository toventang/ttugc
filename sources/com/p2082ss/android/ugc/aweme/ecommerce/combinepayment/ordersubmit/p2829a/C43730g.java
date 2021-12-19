package com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.p2829a;

import com.bytedance.covode.number.Covode;
import java.util.HashMap;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.a.g */
public final class C43730g extends AbstractC43727e {

    /* renamed from: a */
    public static final C43731a f101917a = new C43731a((byte) 0);

    /* renamed from: b */
    private final String f101918b;

    /* renamed from: c */
    private final boolean f101919c;

    /* renamed from: d */
    private final boolean f101920d;

    static {
        Covode.recordClassIndex(51995);
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.a.g$a */
    public static final class C43731a {
        static {
            Covode.recordClassIndex(51996);
        }

        private C43731a() {
        }

        public /* synthetic */ C43731a(byte b) {
            this();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.ecommerce.track.AbstractC45535a
    /* renamed from: a */
    public final HashMap<String, Object> mo73987a() {
        String str;
        HashMap<String, Object> hashMap = new HashMap<>();
        String str2 = this.f101918b;
        if (str2 != null) {
            hashMap.put("error_code", str2);
        }
        String str3 = "yes";
        if (this.f101919c) {
            str = str3;
        } else {
            str = "no";
        }
        hashMap.put("is_retry", str);
        if (!this.f101920d) {
            str3 = "no";
        }
        hashMap.put("is_first_enter", str3);
        return hashMap;
    }

    public C43730g(String str, boolean z, boolean z2) {
        super("tiktokec_order_submit_load_fail");
        this.f101918b = str;
        this.f101919c = z;
        this.f101920d = z2;
    }
}
