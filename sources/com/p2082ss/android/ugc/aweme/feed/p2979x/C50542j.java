package com.p2082ss.android.ugc.aweme.feed.p2979x;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.VideoUrlModel;
import com.p2082ss.android.ugc.p4261f.p4262a.p4263a.p4264a.p4265a.AbstractC81964c;

/* renamed from: com.ss.android.ugc.aweme.feed.x.j */
public final class C50542j {
    static {
        Covode.recordClassIndex(59689);
    }

    /* renamed from: a */
    public static int m94755a(Aweme aweme) {
        if (aweme == null || aweme.getVideo() == null) {
            return 0;
        }
        try {
            int b = m94757b(aweme.getVideo().getPlayAddr());
            if (b == -1) {
                return 0;
            }
            return b;
        } catch (Exception unused) {
            return 0;
        }
    }

    /* renamed from: b */
    public static int m94757b(VideoUrlModel videoUrlModel) {
        Integer valueOf;
        if (videoUrlModel == null) {
            return -1;
        }
        AbstractC81964c hitBitrate = videoUrlModel.getHitBitrate();
        if (hitBitrate == null || (valueOf = Integer.valueOf(hitBitrate.getQualityType())) == null) {
            valueOf = -1;
        }
        return valueOf.intValue();
    }

    /* renamed from: a */
    public static Integer m94756a(VideoUrlModel videoUrlModel) {
        if (videoUrlModel == null) {
            return null;
        }
        if (videoUrlModel.getHitBitrate() != null) {
            return Integer.valueOf(videoUrlModel.getHitBitrate().getBitRate());
        }
        if (videoUrlModel.getBitRate() == null || videoUrlModel.getBitRate().size() <= 0) {
            return null;
        }
        return Integer.valueOf(videoUrlModel.getBitRate().get(0).getBitRate());
    }
}
