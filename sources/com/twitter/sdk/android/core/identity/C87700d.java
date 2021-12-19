package com.twitter.sdk.android.core.identity;

import android.app.Activity;
import android.content.Intent;
import com.bytedance.covode.number.Covode;
import com.twitter.sdk.android.core.AbstractC87682b;
import com.twitter.sdk.android.core.C87814u;
import com.twitter.sdk.android.core.TwitterAuthConfig;

/* renamed from: com.twitter.sdk.android.core.identity.d */
final class C87700d extends AbstractC87694a {
    static {
        Covode.recordClassIndex(103689);
    }

    @Override // com.twitter.sdk.android.core.identity.AbstractC87694a
    /* renamed from: a */
    public final boolean mo142138a(Activity activity) {
        Intent intent = new Intent(activity, OAuthActivity.class);
        intent.putExtra("auth_config", this.f199205b);
        activity.startActivityForResult(intent, this.f199204a);
        return true;
    }

    C87700d(TwitterAuthConfig twitterAuthConfig, AbstractC87682b<C87814u> bVar) {
        super(twitterAuthConfig, bVar, 140);
    }
}
