package com.p2082ss.android.ugc.aweme.app.p2324e;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.Video;
import com.p2082ss.android.ugc.aweme.share.C68863ah;
import okhttp3.C90200t;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.app.e.a */
public final class C33730a {

    /* renamed from: a */
    public static final C33730a f79894a = new C33730a();

    private C33730a() {
    }

    static {
        Covode.recordClassIndex(40625);
    }

    /* renamed from: a */
    public static final String m69052a(Aweme aweme, String str) {
        if (!(aweme == null || aweme.getVideo() == null)) {
            Video video = aweme.getVideo();
            C89219l.m154716b(video, "");
            if (video.isNeedSetCookie() && str != null && !TextUtils.isEmpty(str)) {
                Video video2 = aweme.getVideo();
                C89219l.m154716b(video2, "");
                if (!video2.isNeedSetCookie() || !C89361p.m154874b(str, "http://", false)) {
                    C90200t f = C90200t.m156802f(str);
                    if (f != null && f.mo145048c("ss_is_p_v_ss") == null) {
                        C90200t.C90201a j = f.mo145060j();
                        j.mo145070c("ss_is_p_v_ss", "1");
                        return j.toString();
                    }
                } else {
                    C68863ah.f154028b.mo109360a(str);
                    return str;
                }
            }
        }
        return str;
    }
}
