package com.p2082ss.android.ugc.aweme.feed.feedwidget.widgetcore;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.feed.feedwidget.widgetcore.n */
public final class C49557n {

    /* renamed from: a */
    public static final C49557n f113983a = new C49557n();

    private C49557n() {
    }

    static {
        Covode.recordClassIndex(58398);
    }

    /* renamed from: a */
    public static boolean m92869a(Aweme aweme) {
        if (aweme == null || !aweme.isAd() || aweme.getAwemeRawAd() == null) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public static boolean m92870b(Aweme aweme) {
        if (aweme == null || aweme.getAuthor() == null) {
            return false;
        }
        User author = aweme.getAuthor();
        if (author == null) {
            C89219l.m154715b();
        }
        if (!author.isAdFake()) {
            return true;
        }
        return false;
    }
}
