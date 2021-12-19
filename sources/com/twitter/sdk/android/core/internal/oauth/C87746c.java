package com.twitter.sdk.android.core.internal.oauth;

import com.bytedance.covode.number.Covode;
import com.twitter.sdk.android.core.C87794k;
import com.twitter.sdk.android.core.TwitterAuthConfig;
import com.twitter.sdk.android.core.TwitterAuthToken;
import com.twitter.sdk.android.core.internal.p4498a.C87717f;
import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Locale;
import java.util.Map;
import java.util.TreeMap;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import p4632k.C89427i;

/* access modifiers changed from: package-private */
/* renamed from: com.twitter.sdk.android.core.internal.oauth.c */
public final class C87746c {

    /* renamed from: a */
    private static final SecureRandom f199290a = new SecureRandom();

    /* renamed from: b */
    private final TwitterAuthConfig f199291b;

    /* renamed from: c */
    private final TwitterAuthToken f199292c;

    /* renamed from: d */
    private final String f199293d;

    /* renamed from: e */
    private final String f199294e;

    /* renamed from: f */
    private final String f199295f;

    /* renamed from: g */
    private final Map<String, String> f199296g;

    static {
        Covode.recordClassIndex(103742);
    }

    /* renamed from: c */
    private static String m152715c() {
        return Long.toString(System.currentTimeMillis() / 1000);
    }

    /* renamed from: a */
    public final String mo142204a() {
        String b = m152714b();
        String c = m152715c();
        return m152711a(b, c, m152709a(m152710a(b, c)));
    }

    /* renamed from: b */
    private static String m152714b() {
        return String.valueOf(System.nanoTime()) + String.valueOf(Math.abs(f199290a.nextLong()));
    }

    /* renamed from: a */
    private String m152709a(String str) {
        String str2;
        try {
            TwitterAuthToken twitterAuthToken = this.f199292c;
            if (twitterAuthToken != null) {
                str2 = twitterAuthToken.f199174c;
            } else {
                str2 = null;
            }
            String str3 = C87717f.m152645a(this.f199291b.f199172b) + '&' + C87717f.m152645a(str2);
            byte[] bytes = str.getBytes("UTF8");
            SecretKeySpec secretKeySpec = new SecretKeySpec(str3.getBytes("UTF8"), "HmacSHA1");
            Mac instance = Mac.getInstance("HmacSHA1");
            instance.init(secretKeySpec);
            byte[] doFinal = instance.doFinal(bytes);
            return C89427i.m155137of(doFinal, 0, doFinal.length).base64();
        } catch (InvalidKeyException unused) {
            C87794k.m152811c().mo142112a();
            return "";
        } catch (NoSuchAlgorithmException unused2) {
            C87794k.m152811c().mo142112a();
            return "";
        } catch (UnsupportedEncodingException unused3) {
            C87794k.m152811c().mo142112a();
            return "";
        }
    }

    /* renamed from: a */
    private static String m152712a(TreeMap<String, String> treeMap) {
        StringBuilder sb = new StringBuilder();
        int size = treeMap.size();
        int i = 0;
        for (Map.Entry<String, String> entry : treeMap.entrySet()) {
            sb.append(C87717f.m152648b(C87717f.m152648b(entry.getKey()))).append("%3D").append(C87717f.m152648b(C87717f.m152648b(entry.getValue())));
            i++;
            if (i < size) {
                sb.append("%26");
            }
        }
        return sb.toString();
    }

    /* renamed from: a */
    private String m152710a(String str, String str2) {
        URI create = URI.create(this.f199295f);
        TreeMap<String, String> a = C87717f.m152647a(create, true);
        Map<String, String> map = this.f199296g;
        if (map != null) {
            a.putAll(map);
        }
        String str3 = this.f199293d;
        if (str3 != null) {
            a.put("oauth_callback", str3);
        }
        a.put("oauth_consumer_key", this.f199291b.f199171a);
        a.put("oauth_nonce", str);
        a.put("oauth_signature_method", "HMAC-SHA1");
        a.put("oauth_timestamp", str2);
        TwitterAuthToken twitterAuthToken = this.f199292c;
        if (!(twitterAuthToken == null || twitterAuthToken.f199173b == null)) {
            a.put("oauth_token", this.f199292c.f199173b);
        }
        a.put("oauth_version", "1.0");
        return this.f199294e.toUpperCase(Locale.ENGLISH) + '&' + C87717f.m152648b(create.getScheme() + "://" + create.getHost() + create.getPath()) + '&' + m152712a(a);
    }

    /* renamed from: a */
    private static void m152713a(StringBuilder sb, String str, String str2) {
        if (str2 != null) {
            sb.append(' ').append(C87717f.m152648b(str)).append("=\"").append(C87717f.m152648b(str2)).append("\",");
        }
    }

    /* renamed from: a */
    private String m152711a(String str, String str2, String str3) {
        String str4;
        StringBuilder sb = new StringBuilder("OAuth");
        m152713a(sb, "oauth_callback", this.f199293d);
        m152713a(sb, "oauth_consumer_key", this.f199291b.f199171a);
        m152713a(sb, "oauth_nonce", str);
        m152713a(sb, "oauth_signature", str3);
        m152713a(sb, "oauth_signature_method", "HMAC-SHA1");
        m152713a(sb, "oauth_timestamp", str2);
        TwitterAuthToken twitterAuthToken = this.f199292c;
        if (twitterAuthToken != null) {
            str4 = twitterAuthToken.f199173b;
        } else {
            str4 = null;
        }
        m152713a(sb, "oauth_token", str4);
        m152713a(sb, "oauth_version", "1.0");
        return sb.substring(0, sb.length() - 1);
    }

    C87746c(TwitterAuthConfig twitterAuthConfig, TwitterAuthToken twitterAuthToken, String str, String str2, String str3, Map<String, String> map) {
        this.f199291b = twitterAuthConfig;
        this.f199292c = twitterAuthToken;
        this.f199293d = str;
        this.f199294e = str2;
        this.f199295f = str3;
        this.f199296g = map;
    }
}
