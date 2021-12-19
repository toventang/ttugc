package com.p2082ss.android.ugc.aweme.shoutouts.network;

import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.AbstractC21983b;
import com.bytedance.retrofit2.p1610b.AbstractC22000h;
import com.bytedance.retrofit2.p1610b.AbstractC22018z;

/* renamed from: com.ss.android.ugc.aweme.shoutouts.network.ShoutoutOrderListApi */
public final class ShoutoutOrderListApi {

    /* renamed from: a */
    public static final C74447a f167426a = new C74447a((byte) 0);

    /* renamed from: com.ss.android.ugc.aweme.shoutouts.network.ShoutoutOrderListApi$Api */
    public interface Api {
        static {
            Covode.recordClassIndex(87244);
        }

        @AbstractC22000h(mo35789a = "/tiktok/shoutouts/order/list/v1")
        AbstractC21983b<C74450b> get(@AbstractC22018z(mo35807a = "filter") int i, @AbstractC22018z(mo35807a = "product_id") String str, @AbstractC22018z(mo35807a = "count") int i2);
    }

    static {
        Covode.recordClassIndex(87243);
    }

    /* renamed from: com.ss.android.ugc.aweme.shoutouts.network.ShoutoutOrderListApi$a */
    public static final class C74447a {
        static {
            Covode.recordClassIndex(87245);
        }

        private C74447a() {
        }

        public /* synthetic */ C74447a(byte b) {
            this();
        }
    }
}
