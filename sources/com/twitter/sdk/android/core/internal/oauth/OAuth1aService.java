package com.twitter.sdk.android.core.internal.oauth;

import android.net.Uri;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.twitter.sdk.android.core.AbstractC87682b;
import com.twitter.sdk.android.core.C87690h;
import com.twitter.sdk.android.core.C87804n;
import com.twitter.sdk.android.core.C87808q;
import com.twitter.sdk.android.core.C87810s;
import com.twitter.sdk.android.core.TwitterAuthConfig;
import com.twitter.sdk.android.core.TwitterAuthToken;
import com.twitter.sdk.android.core.internal.C87750q;
import com.twitter.sdk.android.core.internal.p4498a.C87717f;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.TreeMap;
import okhttp3.AbstractC90031ad;
import p4640l.AbstractC89716b;
import p4640l.p4644b.AbstractC89725i;
import p4640l.p4644b.AbstractC89731o;
import p4640l.p4644b.AbstractC89736t;

public final class OAuth1aService extends AbstractC87747d {

    /* renamed from: a */
    public OAuthApi f199276a = ((OAuthApi) this.f199300e.mo144318a(OAuthApi.class));

    public interface OAuthApi {
        static {
            Covode.recordClassIndex(103731);
        }

        @AbstractC89731o(mo144285a = "/oauth/access_token")
        AbstractC89716b<AbstractC90031ad> getAccessToken(@AbstractC89725i(mo144281a = "Authorization") String str, @AbstractC89736t(mo144292a = "oauth_verifier") String str2);

        @AbstractC89731o(mo144285a = "/oauth/request_token")
        AbstractC89716b<AbstractC90031ad> getTempToken(@AbstractC89725i(mo144281a = "Authorization") String str);
    }

    static {
        Covode.recordClassIndex(103729);
    }

    /* renamed from: a */
    public final AbstractC87682b<AbstractC90031ad> mo142189a(final AbstractC87682b<OAuthResponse> bVar) {
        return new AbstractC87682b<AbstractC90031ad>() {
            /* class com.twitter.sdk.android.core.internal.oauth.OAuth1aService.C877391 */

            static {
                Covode.recordClassIndex(103730);
            }

            @Override // com.twitter.sdk.android.core.AbstractC87682b
            /* renamed from: a */
            public final void mo34387a(C87810s sVar) {
                bVar.mo34387a(sVar);
            }

            @Override // com.twitter.sdk.android.core.AbstractC87682b
            /* renamed from: a */
            public final void mo34386a(C87690h<AbstractC90031ad> hVar) {
                Throwable th;
                MethodCollector.m26663i(5124);
                StringBuilder sb = new StringBuilder();
                try {
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(hVar.f199190a.byteStream()));
                    while (true) {
                        try {
                            String readLine = bufferedReader.readLine();
                            if (readLine != null) {
                                sb.append(readLine);
                            } else {
                                try {
                                    break;
                                } catch (IOException e) {
                                    bVar.mo34387a(new C87804n(e.getMessage(), e));
                                    MethodCollector.m26664o(5124);
                                    return;
                                }
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            bufferedReader.close();
                            MethodCollector.m26664o(5124);
                            throw th;
                        }
                    }
                    bufferedReader.close();
                    String sb2 = sb.toString();
                    OAuthResponse a = OAuth1aService.m152694a(sb2);
                    if (a == null) {
                        bVar.mo34387a(new C87804n("Failed to parse auth response: ".concat(String.valueOf(sb2))));
                        MethodCollector.m26664o(5124);
                        return;
                    }
                    bVar.mo34386a(new C87690h(a, null));
                    MethodCollector.m26664o(5124);
                } catch (Throwable th3) {
                    th = th3;
                    MethodCollector.m26664o(5124);
                    throw th;
                }
            }
        };
    }

    /* renamed from: a */
    public static String m152695a(TwitterAuthConfig twitterAuthConfig) {
        return Uri.parse("twittersdk://callback").buildUpon().appendQueryParameter("version", "3.2.0.11").appendQueryParameter("app", twitterAuthConfig.f199171a).build().toString();
    }

    /* renamed from: a */
    public static OAuthResponse m152694a(String str) {
        long j;
        TreeMap<String, String> a = C87717f.m152646a(str, false);
        String str2 = a.get("oauth_token");
        String str3 = a.get("oauth_token_secret");
        String str4 = a.get("screen_name");
        if (a.containsKey("user_id")) {
            j = Long.parseLong(a.get("user_id"));
        } else {
            j = 0;
        }
        if (str2 == null || str3 == null) {
            return null;
        }
        return new OAuthResponse(new TwitterAuthToken(str2, str3), str4, j);
    }

    public OAuth1aService(C87808q qVar, C87750q qVar2) {
        super(qVar, qVar2);
    }
}
