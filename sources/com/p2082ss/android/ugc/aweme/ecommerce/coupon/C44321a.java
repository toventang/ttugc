package com.p2082ss.android.ugc.aweme.ecommerce.coupon;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.ecommerce.coupon.repository.dto.Voucher;
import com.p2082ss.android.ugc.aweme.utils.C80342dg;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.coupon.a */
public final class C44321a {

    /* renamed from: d */
    public static final C44322a f103364d = new C44322a((byte) 0);
    @AbstractC27891c(mo46611a = "voucher")

    /* renamed from: a */
    public final Voucher f103365a;
    @AbstractC27891c(mo46611a = "voucher_type")

    /* renamed from: b */
    public final Integer f103366b;
    @AbstractC27891c(mo46611a = "vouchers")

    /* renamed from: c */
    public final List<Voucher> f103367c;

    static {
        Covode.recordClassIndex(52635);
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.coupon.a$a */
    public static final class C44322a {
        static {
            Covode.recordClassIndex(52636);
        }

        private C44322a() {
        }

        public /* synthetic */ C44322a(byte b) {
            this();
        }

        /* renamed from: a */
        public static C44321a m87047a(String str) {
            Object obj;
            C89219l.m154721d(str, "");
            try {
                obj = C80342dg.m139301a(str, C44321a.class);
            } catch (Exception unused) {
                obj = null;
            }
            return (C44321a) obj;
        }
    }
}
