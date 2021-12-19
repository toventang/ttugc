package com.p2082ss.android.ugc.aweme.shoutouts.network;

import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.AbstractC21983b;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;
import p4640l.p4644b.AbstractC89731o;

/* renamed from: com.ss.android.ugc.aweme.shoutouts.network.RealShoutoutOutApi */
public final class RealShoutoutOutApi {

    /* renamed from: a */
    public static final C74446a f167425a = new C74446a((byte) 0);

    /* renamed from: com.ss.android.ugc.aweme.shoutouts.network.RealShoutoutOutApi$Api */
    public interface Api {
        static {
            Covode.recordClassIndex(87241);
        }

        @AbstractC89731o(mo144285a = "/tiktok/shoutouts/opt_out/v1")
        AbstractC21983b<BaseResponse> get();
    }

    static {
        Covode.recordClassIndex(87240);
    }

    /* renamed from: com.ss.android.ugc.aweme.shoutouts.network.RealShoutoutOutApi$a */
    public static final class C74446a {
        static {
            Covode.recordClassIndex(87242);
        }

        private C74446a() {
        }

        public /* synthetic */ C74446a(byte b) {
            this();
        }
    }
}
