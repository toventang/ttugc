package com.p2082ss.android.ugc.aweme.detail.api;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63238c;
import com.p2082ss.android.ugc.aweme.shortvideo.AVApiImpl;

/* renamed from: com.ss.android.ugc.aweme.detail.api.a */
public final class C41108a {

    /* renamed from: a */
    private static final String f96102a = (AVApiImpl.m123134b().mo109850a() + "/aweme/v1/aweme/react_duet/limit/reference/");

    /* renamed from: a */
    public static C41109b m82810a() {
        if (!C63238c.f143594u.mo93901a()) {
            return (C41109b) AVApiImpl.m123134b().mo109849a(f96102a, C41109b.class);
        }
        throw new IllegalStateException("Cannot access in ftc");
    }

    static {
        Covode.recordClassIndex(48987);
    }
}
