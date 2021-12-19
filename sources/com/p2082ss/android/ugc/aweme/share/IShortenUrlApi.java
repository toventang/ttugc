package com.p2082ss.android.ugc.aweme.share;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.share.model.ShortenModel;
import p4560f.p4561a.AbstractC88973n;
import p4640l.p4644b.AbstractC89719c;
import p4640l.p4644b.AbstractC89721e;
import p4640l.p4644b.AbstractC89731o;

/* renamed from: com.ss.android.ugc.aweme.share.IShortenUrlApi */
public interface IShortenUrlApi {
    static {
        Covode.recordClassIndex(81103);
    }

    @AbstractC89731o(mo144285a = "/tiktok/share/link/shorten/v1/")
    @AbstractC89721e
    AbstractC88973n<ShortenModel> getShareLinkShortenUel(@AbstractC89719c(mo144273a = "scene") int i, @AbstractC89719c(mo144273a = "platform_id") String str, @AbstractC89719c(mo144273a = "share_url") String str2);
}
