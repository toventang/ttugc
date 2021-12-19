package com.p2082ss.android.ugc.aweme.deeplink;

import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.deeplink.C41055o;
import com.p2082ss.android.ugc.aweme.services.IMainService;
import com.p2082ss.android.ugc.aweme.services.MainServiceImpl;
import com.p2082ss.android.ugc.aweme.utils.C80517gw;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.deeplink.q */
public final class C41059q {

    /* renamed from: a */
    public static final C41060a f95985a = new C41060a((byte) 0);

    static {
        Covode.recordClassIndex(48929);
    }

    /* renamed from: com.ss.android.ugc.aweme.deeplink.q$a */
    public static final class C41060a {
        static {
            Covode.recordClassIndex(48930);
        }

        private C41060a() {
        }

        /* renamed from: a */
        public static boolean m82717a() {
            IMainService createIMainServicebyMonsterPlugin = MainServiceImpl.createIMainServicebyMonsterPlugin(false);
            C89219l.m154716b(createIMainServicebyMonsterPlugin, "");
            return createIMainServicebyMonsterPlugin.isAppHot();
        }

        public /* synthetic */ C41060a(byte b) {
            this();
        }

        /* renamed from: a */
        public static String m82714a(Map<String, ? extends Object> map) {
            C89219l.m154721d(map, "");
            StringBuilder sb = new StringBuilder();
            map.entrySet();
            for (Map.Entry<String, ? extends Object> entry : map.entrySet()) {
                sb.append(entry.getKey()).append("=").append(entry.getValue()).append("&");
            }
            String sb2 = sb.toString();
            C89219l.m154716b(sb2, "");
            if (TextUtils.isEmpty(sb2)) {
                return "";
            }
            Objects.requireNonNull(sb2, "null cannot be cast to non-null type java.lang.String");
            String substring = sb2.substring(0, sb2.length() - 1);
            C89219l.m154716b(substring, "");
            return substring;
        }

        /* renamed from: a */
        public static HashMap<String, Object> m82715a(String str) {
            String str2;
            HashMap<String, Object> hashMap = new HashMap<>();
            if (str == null) {
                return hashMap;
            }
            try {
                Object[] array = C89361p.m154921c(str, new String[]{"&"}).toArray(new String[0]);
                if (array != null) {
                    for (String str3 : (String[]) array) {
                        Object[] array2 = C89361p.m154921c(str3, new String[]{"="}).toArray(new String[0]);
                        if (array2 != null) {
                            String[] strArr = (String[]) array2;
                            String decode = URLDecoder.decode(strArr[0], "UTF-8");
                            C89219l.m154716b(decode, "");
                            if (strArr.length > 1) {
                                str2 = URLDecoder.decode(strArr[1], "UTF-8");
                                C89219l.m154716b(str2, "");
                            } else {
                                str2 = "";
                            }
                            hashMap.put(decode, str2);
                        } else {
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                        }
                    }
                    return hashMap;
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
            } catch (UnsupportedEncodingException e) {
                throw new AssertionError(e);
            }
        }

        /* renamed from: b */
        public static String m82719b(String str) {
            C89219l.m154721d(str, "");
            if (TextUtils.isEmpty(str)) {
                return "";
            }
            boolean z = false;
            if (C89361p.m154908a((CharSequence) str, (CharSequence) "microapp", false) || C89361p.m154908a((CharSequence) str, (CharSequence) "microgame", false)) {
                z = true;
            }
            if (!z) {
                return str;
            }
            Uri parse = Uri.parse(str);
            String queryParameter = parse.getQueryParameter("android_scheme");
            if (TextUtils.isEmpty(queryParameter)) {
                queryParameter = parse.getQueryParameter("ios_scheme");
            }
            if (TextUtils.isEmpty(queryParameter)) {
                return str;
            }
            try {
                String decode = URLDecoder.decode(str, "UTF8");
                C89219l.m154716b(decode, "");
                parse = Uri.parse(decode);
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }
            return queryParameter + "&app_id=" + parse.getQueryParameter("app_id") + "&token=" + parse.getQueryParameter("token") + "&channel=" + parse.getQueryParameter("channel") + "&iid=" + parse.getQueryParameter("iid");
        }

        /* renamed from: a */
        public static boolean m82718a(Uri uri) {
            C89219l.m154721d(uri, "");
            Set<String> queryParameterNames = uri.getQueryParameterNames();
            if (queryParameterNames != null && queryParameterNames.contains("_t")) {
                uri.getQueryParameter("_t");
                if (!TextUtils.isEmpty(uri.getQueryParameter("_t"))) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: a */
        public static String m82712a(Intent intent, String str) {
            try {
                return intent.getStringExtra(str);
            } catch (Exception unused) {
                return null;
            }
        }

        /* renamed from: a */
        public static String m82713a(String str, Uri uri) {
            String str2;
            String str3;
            if (uri != null) {
                str2 = uri.getQueryParameter("sec_uid");
            } else {
                str2 = null;
            }
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
                C80517gw.m139563a().mo123773a(str, str2);
            }
            C80517gw.m139563a();
            if (uri == null || (str3 = uri.toString()) == null) {
                str3 = "";
            }
            C80517gw.m139564a(str3, str, str2);
            return str2;
        }

        /* renamed from: a */
        public static void m82716a(Uri uri, String str) {
            String queryParameter;
            C89219l.m154721d(uri, "");
            C89219l.m154721d(str, "");
            if (TextUtils.equals(uri.getQueryParameter("gd_label"), "retarget") && (queryParameter = uri.getQueryParameter("toast")) != null) {
                C41055o.C41057b.m82702a(str, queryParameter);
            }
        }
    }
}
