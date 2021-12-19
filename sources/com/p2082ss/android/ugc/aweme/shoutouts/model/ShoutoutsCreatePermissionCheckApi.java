package com.p2082ss.android.ugc.aweme.shoutouts.model;

import com.bytedance.covode.number.Covode;
import p4560f.p4561a.AbstractC88403ab;
import p4640l.p4644b.AbstractC89722f;
import p4640l.p4644b.AbstractC89736t;

/* renamed from: com.ss.android.ugc.aweme.shoutouts.model.ShoutoutsCreatePermissionCheckApi */
public interface ShoutoutsCreatePermissionCheckApi {

    /* renamed from: a */
    public static final C74430a f167383a = C74430a.f167384a;

    static {
        Covode.recordClassIndex(87208);
    }

    @AbstractC89722f(mo144276a = "/tiktok/shoutouts/product/rating/create_permission/check/v1")
    AbstractC88403ab<C74437a> checkPermission(@AbstractC89736t(mo144292a = "product_id") String str, @AbstractC89736t(mo144292a = "order_id") String str2);

    /* renamed from: com.ss.android.ugc.aweme.shoutouts.model.ShoutoutsCreatePermissionCheckApi$a */
    public static final class C74430a {

        /* renamed from: a */
        static final /* synthetic */ C74430a f167384a = new C74430a();

        private C74430a() {
        }

        static {
            Covode.recordClassIndex(87209);
        }
    }
}
