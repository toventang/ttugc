package com.twitter.sdk.android.core.identity;

import android.app.Activity;
import android.content.Intent;
import com.bytedance.covode.number.Covode;
import com.twitter.sdk.android.core.AbstractC87682b;
import com.twitter.sdk.android.core.C87690h;
import com.twitter.sdk.android.core.C87804n;
import com.twitter.sdk.android.core.C87810s;
import com.twitter.sdk.android.core.C87814u;
import com.twitter.sdk.android.core.TwitterAuthConfig;
import com.twitter.sdk.android.core.TwitterAuthToken;

/* renamed from: com.twitter.sdk.android.core.identity.a */
public abstract class AbstractC87694a {

    /* renamed from: a */
    protected final int f199204a = 140;

    /* renamed from: b */
    public final TwitterAuthConfig f199205b;

    /* renamed from: c */
    public final AbstractC87682b<C87814u> f199206c;

    static {
        Covode.recordClassIndex(103683);
    }

    /* renamed from: a */
    public abstract boolean mo142138a(Activity activity);

    /* renamed from: a */
    private static String m152617a(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }

    AbstractC87694a(TwitterAuthConfig twitterAuthConfig, AbstractC87682b<C87814u> bVar, int i) {
        this.f199205b = twitterAuthConfig;
        this.f199206c = bVar;
    }

    /* renamed from: a */
    public final boolean mo142137a(int i, int i2, Intent intent) {
        if (this.f199204a != i) {
            return false;
        }
        AbstractC87682b<C87814u> bVar = this.f199206c;
        if (bVar == null) {
            return true;
        }
        if (i2 == -1) {
            String a = m152617a(intent, "tk");
            String a2 = m152617a(intent, "ts");
            String a3 = m152617a(intent, "screen_name");
            bVar.mo34386a(new C87690h<>(new C87814u(new TwitterAuthToken(a, a2), intent.getLongExtra("user_id", 0), a3), null));
            return true;
        } else if (intent == null || !intent.hasExtra("auth_error")) {
            bVar.mo34387a(new C87804n("Authorize failed."));
            return true;
        } else {
            bVar.mo34387a((C87810s) intent.getSerializableExtra("auth_error"));
            return true;
        }
    }
}
