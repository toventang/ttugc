package com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.api;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.data.PollDetailResponse;
import p4560f.p4561a.AbstractC88979t;
import p4640l.p4644b.AbstractC89722f;
import p4640l.p4644b.AbstractC89736t;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.api.PollDetailApi */
public interface PollDetailApi {

    /* renamed from: a */
    public static final C72886a f163552a = C72886a.f163553a;

    static {
        Covode.recordClassIndex(85580);
    }

    @AbstractC89722f(mo144276a = "/aweme/v1/vote/option/userlist/")
    AbstractC88979t<PollDetailResponse> getPollDetail(@AbstractC89736t(mo144292a = "vote_id") long j, @AbstractC89736t(mo144292a = "option_id") long j2, @AbstractC89736t(mo144292a = "offset") int i);

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.api.PollDetailApi$a */
    public static final class C72886a {

        /* renamed from: a */
        static final /* synthetic */ C72886a f163553a = new C72886a();

        private C72886a() {
        }

        static {
            Covode.recordClassIndex(85581);
        }
    }
}
