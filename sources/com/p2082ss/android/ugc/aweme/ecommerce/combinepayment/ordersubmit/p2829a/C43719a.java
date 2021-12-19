package com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.p2829a;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.account.util.C33039i;
import com.p2082ss.android.ugc.aweme.utils.C80342dg;
import java.util.Map;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.a.a */
public final class C43719a {

    /* renamed from: d */
    public static final C43720a f101898d = new C43720a((byte) 0);
    @AbstractC27891c(mo46611a = "refresh")

    /* renamed from: a */
    public final int f101899a;
    @AbstractC27891c(mo46611a = "count")

    /* renamed from: b */
    public final Integer f101900b;
    @AbstractC27891c(mo46611a = "cart_item")

    /* renamed from: c */
    public final Map<String, String> f101901c;

    static {
        Covode.recordClassIndex(51984);
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.a.a$a */
    public static final class C43720a {
        static {
            Covode.recordClassIndex(51985);
        }

        private C43720a() {
        }

        public /* synthetic */ C43720a(byte b) {
            this();
        }

        /* renamed from: a */
        public static C43719a m86706a(String str) {
            Object obj;
            C89219l.m154721d(str, "");
            try {
                obj = C80342dg.m139301a(str, C43719a.class);
            } catch (Exception unused) {
                obj = null;
            }
            C43719a aVar = (C43719a) obj;
            if (aVar == null) {
                return new C43719a();
            }
            return aVar;
        }
    }

    public /* synthetic */ C43719a() {
        this(1, null, null);
    }

    /* renamed from: a */
    public final String mo74430a() {
        String b = C33039i.m67673a().mo46674b(this);
        if (b == null) {
            return "{}";
        }
        return b;
    }

    public C43719a(int i, Integer num, Map<String, String> map) {
        this.f101899a = i;
        this.f101900b = num;
        this.f101901c = map;
    }
}
