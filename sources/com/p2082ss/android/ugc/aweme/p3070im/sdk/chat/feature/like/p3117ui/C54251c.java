package com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.like.p3117ui;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.IMUser;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.like.ui.c */
public final class C54251c {

    /* renamed from: a */
    public int f124275a;

    /* renamed from: b */
    public IMUser f124276b;

    /* renamed from: c */
    public int f124277c;

    static {
        Covode.recordClassIndex(63941);
    }

    public C54251c() {
        this(0, null, 0, 7);
    }

    private C54251c(int i, IMUser iMUser, int i2) {
        this.f124275a = i;
        this.f124276b = iMUser;
        this.f124277c = i2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C54251c(int i, IMUser iMUser, int i2, int i3) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? null : iMUser, (i3 & 4) != 0 ? 0 : i2);
    }
}
