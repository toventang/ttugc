package com.p2082ss.android.ugc.aweme.tools.mvtemplate.net;

import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.mime.TypedFile;
import com.bytedance.retrofit2.p1610b.AbstractC22009q;
import com.bytedance.retrofit2.p1610b.AbstractC22012t;
import com.bytedance.retrofit2.p1610b.AbstractC22014v;
import com.bytedance.retrofit2.p1610b.AbstractC22018z;
import com.google.gson.AbstractC28019l;
import p4560f.p4561a.AbstractC88979t;

/* renamed from: com.ss.android.ugc.aweme.tools.mvtemplate.net.AfrApi */
public interface AfrApi {
    static {
        Covode.recordClassIndex(92124);
    }

    @AbstractC22012t(mo35799a = "/media/api/pic/afr")
    @AbstractC22009q
    AbstractC88979t<ImageResponse> getImageInfo(@AbstractC22018z(mo35807a = "algorithms") String str, @AbstractC22018z(mo35807a = "key") String str2, @AbstractC22018z(mo35807a = "algorithm_type") String str3, @AbstractC22014v(mo35801a = "file") TypedFile typedFile, @AbstractC22014v(mo35801a = "conf") AbstractC28019l lVar);

    @AbstractC22012t(mo35799a = "/media/api/pic/video")
    @AbstractC22009q
    AbstractC88979t<VideoResponse> getVideoInfo(@AbstractC22018z(mo35807a = "algorithm") String str, @AbstractC22018z(mo35807a = "key") String str2, @AbstractC22018z(mo35807a = "algorithm_type") int i, @AbstractC22014v(mo35801a = "file") TypedFile typedFile, @AbstractC22014v(mo35801a = "conf") AbstractC28019l lVar);
}
