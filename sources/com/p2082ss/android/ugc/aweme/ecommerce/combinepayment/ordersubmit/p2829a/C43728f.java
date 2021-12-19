package com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.p2829a;

import com.bytedance.covode.number.Covode;
import java.util.HashMap;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.a.f */
public final class C43728f extends AbstractC43738i {

    /* renamed from: a */
    public static final C43729a f101913a = new C43729a((byte) 0);

    /* renamed from: b */
    private final long f101914b;

    /* renamed from: c */
    private final long f101915c;

    /* renamed from: d */
    private final int f101916d;

    static {
        Covode.recordClassIndex(51993);
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.a.f$a */
    public static final class C43729a {
        static {
            Covode.recordClassIndex(51994);
        }

        private C43729a() {
        }

        public /* synthetic */ C43729a(byte b) {
            this();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.ecommerce.track.AbstractC45535a, com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.p2829a.AbstractC43738i
    /* renamed from: a */
    public final HashMap<String, Object> mo73987a() {
        HashMap<String, Object> hashMap = new HashMap<>();
        HashMap<String, Object> a = super.mo73987a();
        if (a != null) {
            hashMap.putAll(a);
        }
        hashMap.put("duration", Long.valueOf(this.f101914b));
        hashMap.put("api_duration", Long.valueOf(this.f101915c));
        hashMap.put("retry_count", Integer.valueOf(this.f101916d));
        return hashMap;
    }

    public C43728f(long j, long j2, int i) {
        super("rd_tiktokec_anchor_order_submit_duration");
        this.f101914b = j;
        this.f101915c = j2;
        this.f101916d = i;
    }
}
