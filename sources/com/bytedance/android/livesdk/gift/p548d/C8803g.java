package com.bytedance.android.livesdk.gift.p548d;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.gift.p551g.p552a.EnumC8809a;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.livesdk.gift.d.g */
public final class C8803g {

    /* renamed from: a */
    public User f21679a;

    /* renamed from: b */
    public String f21680b;

    /* renamed from: c */
    public EnumC8809a f21681c;

    /* renamed from: d */
    public Runnable f21682d;

    /* renamed from: e */
    public long f21683e;

    static {
        Covode.recordClassIndex(9681);
    }

    public C8803g() {
        this(null);
    }

    public C8803g(User user) {
        this.f21681c = EnumC8809a.DEFAULT;
        this.f21679a = user;
    }

    public C8803g(User user, long j) {
        this.f21681c = EnumC8809a.DEFAULT;
        this.f21679a = user;
        this.f21683e = j;
    }
}
