package com.bytedance.lobby.twitter;

import android.app.Application;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.lobby.C20879a;
import com.bytedance.lobby.C20892d;
import com.bytedance.lobby.internal.BaseProvider;
import com.twitter.sdk.android.core.C87794k;
import com.twitter.sdk.android.core.C87805o;
import com.twitter.sdk.android.core.TwitterAuthConfig;

class TwitterProvider<T> extends BaseProvider<T> {

    /* renamed from: b */
    private static final boolean f49496b = C20879a.f49364a;

    /* renamed from: d */
    private Application f49497d;

    static {
        Covode.recordClassIndex(24539);
    }

    @Override // com.bytedance.lobby.internal.BaseProvider
    /* renamed from: d */
    public final void mo34346d() {
        String str;
        String str2 = this.f49454c.f49403c;
        Bundle bundle = this.f49454c.f49404d;
        if (bundle != null) {
            str = bundle.getString("twitter_consumer_secret");
        } else {
            str = "";
        }
        if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str)) {
            C87805o.C87806a aVar = new C87805o.C87806a(this.f49497d);
            aVar.f199454b = Boolean.valueOf(f49496b);
            aVar.f199453a = new TwitterAuthConfig(this.f49454c.f49403c, str);
            C87794k.m152809a(aVar.mo142263a());
        } else if (f49496b) {
            throw new NullPointerException("Cannot initialize Twitter SDK with an incomplete consumer credentials.");
        }
    }

    TwitterProvider(Application application, C20892d dVar) {
        super(application, dVar);
        this.f49497d = application;
    }
}
