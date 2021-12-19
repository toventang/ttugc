package com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.api;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.p2082ss.android.ugc.aweme.services.RetrofitService;
import com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.data.PollResponse;
import p4560f.p4561a.AbstractC88979t;
import p4640l.p4644b.AbstractC89719c;
import p4640l.p4644b.AbstractC89721e;
import p4640l.p4644b.AbstractC89731o;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.api.PollApi */
public interface PollApi {

    /* renamed from: a */
    public static final C72885a f163549a = C72885a.f163551b;

    static {
        Covode.recordClassIndex(85578);
    }

    @AbstractC89731o(mo144285a = "/aweme/v1/vote/option/")
    @AbstractC89721e
    AbstractC88979t<PollResponse> poll(@AbstractC89719c(mo144273a = "vote_id") long j, @AbstractC89719c(mo144273a = "option_id") long j2);

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.api.PollApi$a */
    public static final class C72885a {

        /* renamed from: a */
        public static final IRetrofitService f163550a = RetrofitService.createIRetrofitServicebyMonsterPlugin(false);

        /* renamed from: b */
        static final /* synthetic */ C72885a f163551b = new C72885a();

        private C72885a() {
        }

        static {
            Covode.recordClassIndex(85579);
        }
    }
}
