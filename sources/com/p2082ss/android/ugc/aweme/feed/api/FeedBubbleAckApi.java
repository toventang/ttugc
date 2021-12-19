package com.p2082ss.android.ugc.aweme.feed.api;

import com.bytedance.covode.number.Covode;
import p4560f.p4561a.AbstractC88410b;
import p4640l.p4644b.AbstractC89719c;
import p4640l.p4644b.AbstractC89721e;
import p4640l.p4644b.AbstractC89731o;

/* renamed from: com.ss.android.ugc.aweme.feed.api.FeedBubbleAckApi */
public interface FeedBubbleAckApi {

    /* renamed from: a */
    public static final C48324a f111989a = C48324a.f111990a;

    static {
        Covode.recordClassIndex(57080);
    }

    @AbstractC89731o(mo144285a = "/tiktok/v1/bubble/ack/")
    @AbstractC89721e
    AbstractC88410b sendBubbleAck(@AbstractC89719c(mo144273a = "biz") int i, @AbstractC89719c(mo144273a = "type") int i2);

    /* renamed from: com.ss.android.ugc.aweme.feed.api.FeedBubbleAckApi$a */
    public static final class C48324a {

        /* renamed from: a */
        static final /* synthetic */ C48324a f111990a = new C48324a();

        private C48324a() {
        }

        static {
            Covode.recordClassIndex(57081);
        }
    }
}
