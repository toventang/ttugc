package com.twitter.sdk.android.core.internal.oauth;

import com.bytedance.covode.number.Covode;
import com.twitter.sdk.android.core.TwitterAuthConfig;
import com.twitter.sdk.android.core.TwitterAuthToken;
import java.util.Map;

/* renamed from: com.twitter.sdk.android.core.internal.oauth.b */
public final class C87745b {
    static {
        Covode.recordClassIndex(103741);
    }

    /* renamed from: b */
    private static C87746c m152708b(TwitterAuthConfig twitterAuthConfig, TwitterAuthToken twitterAuthToken, String str, String str2, String str3, Map<String, String> map) {
        return new C87746c(twitterAuthConfig, twitterAuthToken, str, str2, str3, map);
    }

    /* renamed from: a */
    public static String m152707a(TwitterAuthConfig twitterAuthConfig, TwitterAuthToken twitterAuthToken, String str, String str2, String str3, Map<String, String> map) {
        return m152708b(twitterAuthConfig, twitterAuthToken, str, str2, str3, map).mo142204a();
    }
}
