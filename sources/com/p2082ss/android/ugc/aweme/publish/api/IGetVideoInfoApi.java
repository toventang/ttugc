package com.p2082ss.android.ugc.aweme.publish.api;

import com.bytedance.covode.number.Covode;
import p4560f.p4561a.AbstractC88403ab;
import p4640l.p4644b.AbstractC89722f;
import p4640l.p4644b.AbstractC89736t;

/* renamed from: com.ss.android.ugc.aweme.publish.api.IGetVideoInfoApi */
public interface IGetVideoInfoApi {
    static {
        Covode.recordClassIndex(76995);
    }

    @AbstractC89722f(mo144276a = "/tiktok/v1/video/query_url/")
    AbstractC88403ab<C65509b> getVideoInfoByURL(@AbstractC89736t(mo144292a = "video_url") String str);
}
