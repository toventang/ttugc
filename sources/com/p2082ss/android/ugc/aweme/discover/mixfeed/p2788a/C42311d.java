package com.p2082ss.android.ugc.aweme.discover.mixfeed.p2788a;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.discover.model.VideoTag;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.Video;

/* renamed from: com.ss.android.ugc.aweme.discover.mixfeed.a.d */
public final class C42311d {

    /* renamed from: a */
    public static final C42311d f98550a = new C42311d();

    private C42311d() {
    }

    static {
        Covode.recordClassIndex(50254);
    }

    /* renamed from: a */
    public static final String m84672a(Aweme aweme) {
        VideoTag videoTag;
        String englishTitle;
        if (aweme != null) {
            if (aweme.getNewLabel() == 1) {
                return "New";
            }
            Video video = aweme.getVideo();
            if (video == null || (videoTag = video.getVideoTag()) == null || (englishTitle = videoTag.getEnglishTitle()) == null) {
                return "";
            }
            return englishTitle;
        }
        return "";
    }
}
