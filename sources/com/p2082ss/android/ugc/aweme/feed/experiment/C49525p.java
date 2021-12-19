package com.p2082ss.android.ugc.aweme.feed.experiment;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.C16048b;

/* renamed from: com.ss.android.ugc.aweme.feed.experiment.p */
public final class C49525p {

    /* renamed from: a */
    public static final C49525p f113904a = new C49525p();

    private C49525p() {
    }

    static {
        Covode.recordClassIndex(58339);
    }

    /* renamed from: b */
    public static final boolean m92762b() {
        if (m92766f() == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public static final boolean m92763c() {
        if (m92766f() == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public static final boolean m92764d() {
        if (m92766f() == 2) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    private static int m92766f() {
        FeedDescSeeMoreConfig e = m92765e();
        if (e != null) {
            return e.getGroupId();
        }
        return 0;
    }

    /* renamed from: a */
    public static final float m92761a() {
        FeedDescSeeMoreConfig e = m92765e();
        if (e != null) {
            float opacity = e.getOpacity();
            if (opacity >= 0.18f && opacity <= 0.7f) {
                return e.getOpacity();
            }
        }
        return 0.18f;
    }

    /* renamed from: e */
    private static final FeedDescSeeMoreConfig m92765e() {
        try {
            return (FeedDescSeeMoreConfig) C16048b.m29633a().mo25415a(true, "feed_desc_see_more_optimize", FeedDescSeeMoreConfig.class);
        } catch (Exception unused) {
            return new FeedDescSeeMoreConfig(0, 0.18f);
        }
    }
}
