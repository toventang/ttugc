package com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.api;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.data.C72901a;
import com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.data.C72902b;
import p4560f.p4561a.AbstractC88979t;
import p4640l.p4644b.AbstractC89719c;
import p4640l.p4644b.AbstractC89721e;
import p4640l.p4644b.AbstractC89722f;
import p4640l.p4644b.AbstractC89731o;
import p4640l.p4644b.AbstractC89736t;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.api.CountDownStickerApi */
public interface CountDownStickerApi {

    /* renamed from: a */
    public static final C72884a f163546a = C72884a.f163548b;

    static {
        Covode.recordClassIndex(85576);
    }

    @AbstractC89722f(mo144276a = "tiktok/v1/sticker/countdown/detail/")
    AbstractC88979t<C72901a> getDetail(@AbstractC89736t(mo144292a = "item_id") String str);

    @AbstractC89731o(mo144285a = "tiktok/v1/sticker/countdown/reminder/")
    @AbstractC89721e
    AbstractC88979t<C72902b> subscribe(@AbstractC89719c(mo144273a = "item_id") String str, @AbstractC89719c(mo144273a = "countdown_time") long j, @AbstractC89719c(mo144273a = "action") int i);

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.api.CountDownStickerApi$a */
    public static final class C72884a {

        /* renamed from: a */
        public static final IRetrofitFactory f163547a = RetrofitFactory.m33635a();

        /* renamed from: b */
        static final /* synthetic */ C72884a f163548b = new C72884a();

        private C72884a() {
        }

        static {
            Covode.recordClassIndex(85577);
        }
    }
}
