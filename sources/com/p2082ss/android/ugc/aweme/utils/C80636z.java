package com.p2082ss.android.ugc.aweme.utils;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.AwemeStatus;
import com.p2082ss.android.ugc.aweme.feed.p2979x.C50545m;
import com.p2082ss.android.ugc.aweme.profile.model.User;

/* renamed from: com.ss.android.ugc.aweme.utils.z */
public final class C80636z {

    /* renamed from: a */
    public static final C80636z f180289a = new C80636z();

    private C80636z() {
    }

    static {
        Covode.recordClassIndex(93910);
    }

    /* renamed from: b */
    public static boolean m139817b(Aweme aweme) {
        AwemeStatus status;
        if (aweme == null || (status = aweme.getStatus()) == null || status.getPrivateStatus() != 0) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public static boolean m139818c(Aweme aweme) {
        AwemeStatus status;
        if (aweme == null || (status = aweme.getStatus()) == null || status.getPrivateStatus() != 2) {
            return false;
        }
        return true;
    }

    /* renamed from: d */
    public static boolean m139819d(Aweme aweme) {
        AwemeStatus status;
        if (aweme == null || (status = aweme.getStatus()) == null || status.getPrivateStatus() != 1) {
            return false;
        }
        return true;
    }

    /* renamed from: e */
    public static boolean m139820e(Aweme aweme) {
        User author;
        if (aweme == null || (author = aweme.getAuthor()) == null || author.getFollowStatus() != 2) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public static boolean m139821f(Aweme aweme) {
        User author;
        if (aweme == null || (author = aweme.getAuthor()) == null || author.getFollowStatus() != 1) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static boolean m139816a(Aweme aweme) {
        AwemeStatus status;
        if (aweme == null || (status = aweme.getStatus()) == null || status.getPrivateStatus() != 2) {
            return false;
        }
        User author = aweme.getAuthor();
        if ((author == null || author.getFollowStatus() != 2) && !C50545m.m94762a(aweme)) {
            return true;
        }
        return false;
    }
}
