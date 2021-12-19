package com.p2082ss.android.ugc.aweme.feed.service;

import android.app.Activity;
import com.bytedance.covode.number.Covode;
import com.facebook.imagepipeline.p1890o.AbstractC24641d;

/* renamed from: com.ss.android.ugc.aweme.feed.service.a */
public final class C49912a {

    /* renamed from: a */
    private static volatile IFeedComponentService f115058a;

    static {
        Covode.recordClassIndex(59022);
    }

    /* renamed from: a */
    public static IFeedComponentService m93713a() {
        if (f115058a == null) {
            f115058a = FeedComponentServiceImpl.m93697b();
        }
        return f115058a;
    }

    /* renamed from: a */
    public static AbstractC24641d m93712a(float f) {
        return m93713a().mo84949a(f);
    }

    /* renamed from: a */
    public static Boolean m93714a(Activity activity) {
        return m93713a().mo84952a(activity);
    }

    /* renamed from: a */
    public static <T> T m93715a(Class<T> cls) {
        return (T) m93713a().mo84953a(cls);
    }
}
