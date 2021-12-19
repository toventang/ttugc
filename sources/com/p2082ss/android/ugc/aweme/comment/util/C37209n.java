package com.p2082ss.android.ugc.aweme.comment.util;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.comment.model.Comment;
import com.p2082ss.android.ugc.aweme.comment.p2484a.C36180f;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;

/* renamed from: com.ss.android.ugc.aweme.comment.util.n */
public final class C37209n {

    /* renamed from: a */
    public static final C37209n f87731a = new C37209n();

    private C37209n() {
    }

    static {
        Covode.recordClassIndex(44564);
    }

    /* renamed from: a */
    public static boolean m75199a(Aweme aweme, Comment comment) {
        Aweme aweme2;
        boolean z;
        Boolean bool = null;
        if (comment != null) {
            aweme2 = comment.getAliasAweme();
        } else {
            aweme2 = null;
        }
        if (aweme2 != null) {
            z = true;
        } else {
            z = false;
        }
        if (aweme != null) {
            bool = Boolean.valueOf(aweme.isAd());
        }
        if (!C36180f.m73734a() || z || bool == null || bool.booleanValue()) {
            return false;
        }
        return true;
    }
}
