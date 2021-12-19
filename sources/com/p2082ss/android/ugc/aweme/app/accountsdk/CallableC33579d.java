package com.p2082ss.android.ugc.aweme.app.accountsdk;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.app.accountsdk.d */
final /* synthetic */ class CallableC33579d implements Callable {

    /* renamed from: a */
    private final User f79746a;

    /* renamed from: b */
    private final User f79747b;

    static {
        Covode.recordClassIndex(40469);
    }

    CallableC33579d(User user, User user2) {
        this.f79746a = user;
        this.f79747b = user2;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return C33578c.m68790a(this.f79746a, this.f79747b);
    }
}
