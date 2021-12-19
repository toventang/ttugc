package com.p2082ss.android.ugc.aweme.shoutouts.network;

import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.AbstractC21983b;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;
import p4640l.p4644b.AbstractC89719c;
import p4640l.p4644b.AbstractC89721e;
import p4640l.p4644b.AbstractC89731o;

/* renamed from: com.ss.android.ugc.aweme.shoutouts.network.EditProductApi */
public final class EditProductApi {

    /* renamed from: a */
    public static final C74445a f167424a = new C74445a((byte) 0);

    /* renamed from: com.ss.android.ugc.aweme.shoutouts.network.EditProductApi$Api */
    public interface Api {
        static {
            Covode.recordClassIndex(87238);
        }

        @AbstractC89731o(mo144285a = "/tiktok/shoutouts/product/edit/v1")
        @AbstractC89721e
        AbstractC21983b<BaseResponse> get(@AbstractC89719c(mo144273a = "product_id") String str, @AbstractC89719c(mo144273a = "product") String str2);
    }

    static {
        Covode.recordClassIndex(87237);
    }

    /* renamed from: com.ss.android.ugc.aweme.shoutouts.network.EditProductApi$a */
    public static final class C74445a {
        static {
            Covode.recordClassIndex(87239);
        }

        private C74445a() {
        }

        public /* synthetic */ C74445a(byte b) {
            this();
        }
    }
}
