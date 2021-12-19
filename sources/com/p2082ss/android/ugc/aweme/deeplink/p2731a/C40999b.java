package com.p2082ss.android.ugc.aweme.deeplink.p2731a;

import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.deeplink.C41061r;
import com.p2082ss.android.ugc.aweme.service.EOYServiceImpl;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.ss.android.ugc.aweme.deeplink.a.b */
public final class C40999b extends AbstractC40998a {

    /* renamed from: a */
    private static final Map<String, Integer> f95875a = new HashMap() {
        /* class com.p2082ss.android.ugc.aweme.deeplink.p2731a.C40999b.C410001 */

        static {
            Covode.recordClassIndex(48863);
        }

        {
            put("(?:share/)?@.*/video/(\\w+)/?", 0);
            put("(?:share/)?@.*/live/(\\w+)/?", 1);
            put("(?:share/)?@([\\w\\.]+)/?", 2);
            put("(?:share/)?tag/([^/?]+)", 3);
            put("(?:share/)?music/[^/?]*-(\\d+)(?=(?:[?/]|$))", 4);
            put("(?:share/)?playlist-music/[^/?]*-(\\d+)(?=(?:[?/]|$))", 25);
            put("(?:share/)?stickers?/(?:detail/)?(?:.*-)?(\\w+)/?", 5);
            put("(?:share/)?question/[^/?]*-(\\d+)(?=(?:[?/]|$))", 23);
            put("(?:share/)?discover/([^/?]+)", 24);
        }
    };

    static {
        Covode.recordClassIndex(48862);
    }

    @Override // com.p2082ss.android.ugc.aweme.deeplink.p2731a.AbstractC40998a
    /* renamed from: a */
    public final Uri mo70209a(Uri uri) {
        String str;
        String str2;
        if (uri != null) {
            String[] a = C41061r.C41062a.m82720a();
            int i = 0;
            int i2 = 0;
            while (true) {
                str = "";
                if (i2 >= 34) {
                    str2 = str;
                    break;
                } else if (TextUtils.equals(a[i2], uri.getHost())) {
                    str2 = a[i2];
                    break;
                } else {
                    i2++;
                }
            }
            if (!str2.isEmpty()) {
                String uri2 = uri.toString();
                if (TextUtils.equals(uri.getPath(), "/") && uri.getQueryParameterNames().isEmpty()) {
                    return Uri.parse("snssdk1180://feed");
                }
                if (TextUtils.isEmpty(uri.getPath()) && uri.getQueryParameterNames().isEmpty()) {
                    return Uri.parse("snssdk1180://feed");
                }
                if (Pattern.compile("@([\\w\\.]+)/live").matcher(uri.toString()).find()) {
                    return m82612a(uri, 18, uri.getPathSegments().get(0));
                }
                if (Pattern.compile("(?:share/)?discover/([^/?]+)").matcher(uri.toString()).find()) {
                    List<String> pathSegments = uri.getPathSegments();
                    if (pathSegments != null && pathSegments.size() > 1) {
                        str = pathSegments.get(1);
                    }
                    return m82612a(uri, 24, str);
                } else if (Pattern.compile("api/social/invitation/redirect/").matcher(uri.toString()).find() || (Pattern.compile("(?:share/)?@([\\w\\.]+)/?").matcher(uri.toString()).find() && !TextUtils.isEmpty(uri.getQueryParameter("invitation_code")))) {
                    return m82612a(uri, 22, str);
                } else {
                    if (Pattern.compile("ask-on-tiktok-2021").matcher(uri.toString()).find()) {
                        String a2 = EOYServiceImpl.m120048b().mo106955a();
                        if (a2 == null || a2.isEmpty()) {
                            return null;
                        }
                        return Uri.parse(a2);
                    }
                    Iterator<String> it = f95875a.keySet().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        String next = it.next();
                        Matcher matcher = Pattern.compile("https://" + str2 + "/" + next).matcher(uri2);
                        if (matcher.find()) {
                            if (matcher.groupCount() > 0) {
                                str = matcher.group(1);
                            }
                            i = f95875a.get(next).intValue();
                        }
                    }
                    return m82612a(uri, i, str);
                }
            }
        }
        return null;
    }
}
