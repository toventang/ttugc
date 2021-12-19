package com.p2082ss.android.ugc.aweme.shortvideo.p3839l;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.out.AVExternalServiceImpl;
import java.util.concurrent.Callable;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.shortvideo.l.c */
public final /* synthetic */ class CallableC71936c implements Callable {

    /* renamed from: a */
    private final Aweme f161210a;

    static {
        Covode.recordClassIndex(84485);
    }

    CallableC71936c(Aweme aweme) {
        this.f161210a = aweme;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return AVExternalServiceImpl.m113114a().configService().privacyConfig().checkDuetReactPermission(this.f161210a.getAid(), 1);
    }
}
