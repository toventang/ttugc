package com.p2082ss.android.ugc.aweme.deeplink.p2735d;

import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.kakao.usermgmt.StringSet;
import com.p2082ss.android.newmedia.p2166d.C30132b;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33743c;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.p4173ug.UgCommonServiceImpl;
import java.util.HashMap;
import java.util.UUID;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.deeplink.d.c */
public final class C41039c {

    /* renamed from: a */
    public static long f95928a;

    /* renamed from: b */
    public static long f95929b;

    /* renamed from: c */
    public static boolean f95930c;

    /* renamed from: d */
    public static String f95931d;

    /* renamed from: e */
    public static String f95932e;

    /* renamed from: f */
    public static String f95933f = "old";

    /* renamed from: g */
    public static String f95934g = "normal_deeplink";

    /* renamed from: h */
    public static boolean f95935h;

    /* renamed from: i */
    public static boolean f95936i;

    /* renamed from: j */
    public static final C41039c f95937j = new C41039c();

    /* renamed from: k */
    private static long f95938k;

    /* renamed from: l */
    private static long f95939l;

    /* renamed from: m */
    private static HashMap<String, Long> f95940m = new HashMap<>();

    /* renamed from: n */
    private static String f95941n = "";

    private C41039c() {
    }

    static {
        Covode.recordClassIndex(48909);
    }

    /* renamed from: a */
    public static boolean m82669a() {
        if (C89219l.m154714a((Object) f95934g, (Object) "normal_deeplink") || C89219l.m154714a((Object) f95934g, (Object) "semantic")) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static void m82666a(String str) {
        C89219l.m154721d(str, "");
        f95934g = str;
    }

    /* renamed from: d */
    public static final void m82677d(String str) {
        C89219l.m154721d(str, "");
        f95932e = str;
    }

    /* renamed from: b */
    private static boolean m82673b(Uri uri) {
        String str;
        if (uri != null) {
            str = uri.getHost();
        } else {
            str = null;
        }
        if (TextUtils.equals("shortlink", str)) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public static final void m82675c(String str) {
        C89219l.m154721d(str, "");
        f95940m.put(str, Long.valueOf(System.currentTimeMillis()));
    }

    /* renamed from: b */
    private static void m82671b(Intent intent) {
        C89219l.m154721d(intent, "");
        boolean equals = TextUtils.equals(m82670b(intent, "dl_from"), "af");
        String str = "facebook";
        boolean equals2 = TextUtils.equals(m82670b(intent, "dl_from"), str);
        boolean b = C30132b.m60955b(intent, "is_from_self");
        boolean b2 = C30132b.m60955b(intent, "from_notification");
        if (equals) {
            str = "appsflyer";
        } else if (!equals2) {
            if (b2) {
                str = "push";
            } else if (b) {
                str = "self";
            } else {
                str = "other";
            }
        }
        f95931d = str;
    }

    /* renamed from: c */
    private static String m82674c(Uri uri) {
        if (uri != null) {
            String queryParameter = uri.getQueryParameter("params_url");
            if (!TextUtils.isEmpty(queryParameter)) {
                String queryParameter2 = Uri.parse(queryParameter).getQueryParameter("utm_source");
                if (!TextUtils.isEmpty(queryParameter2)) {
                    return queryParameter2;
                }
            }
        }
        return null;
    }

    /* renamed from: d */
    private static final void m82676d(Uri uri) {
        if (uri != null) {
            UgCommonServiceImpl.m138290j().mo123110h().mo123166a(uri, m82669a(), f95929b - f95928a, f95930c);
        }
        f95931d = null;
        f95932e = null;
        f95938k = 0;
        f95939l = 0;
        f95934g = "normal_deeplink";
        f95928a = 0;
        f95929b = 0;
        f95935h = false;
        f95936i = false;
        f95940m.clear();
    }

    /* renamed from: a */
    public static final void m82663a(Intent intent) {
        String str;
        String str2;
        C89219l.m154721d(intent, "");
        Uri data = intent.getData();
        if (!m82673b(data) && !intent.getBooleanExtra("is_short_link", false)) {
            f95938k = System.currentTimeMillis();
            String uuid = UUID.randomUUID().toString();
            C89219l.m154716b(uuid, "");
            f95941n = uuid;
            if (data == null || (str = data.getQueryParameter("sharer_biz")) == null) {
                str = "";
            }
            C89219l.m154716b(str, "");
            C33743c cVar = new C33743c();
            if (data != null) {
                str2 = data.toString();
            } else {
                str2 = null;
            }
            C39162r.m79461a("deep_link_start", cVar.mo59976a("url", str2).mo59976a(StringSet.type, f95931d).mo59975a("startTime", Long.valueOf(f95938k)).mo59976a("linkVersion", f95933f).mo59976a("event_id", f95941n).mo59976a("sharer_biz", str).mo59977a());
        }
    }

    /* renamed from: b */
    public static final void m82672b(String str) {
        C89219l.m154721d(str, "");
        long currentTimeMillis = System.currentTimeMillis();
        Long l = f95940m.get(str);
        if (l == null) {
            l = 0L;
        }
        C89219l.m154716b(l, "");
        C39162r.m79461a("deep_link_node_info", new C33743c().mo59976a(StringSet.type, f95931d).mo59976a("enter_to", f95932e).mo59976a("node_name", str).mo59975a("cost_time", Long.valueOf(currentTimeMillis - l.longValue())).mo59976a("link_version", f95933f).mo59977a());
    }

    /* renamed from: a */
    private static void m82665a(Uri uri) {
        if (uri != null) {
            String a = C89219l.m154704a(uri.getHost(), (Object) uri.getPath());
            if (C89361p.m154874b(a, "user/homepage", false)) {
                a = "mine";
            } else if (C89361p.m154874b(a, "discovery", false)) {
                a = "discovery";
            } else if (C89361p.m154874b(a, "user/find_friends", false)) {
                a = "friends";
            } else if (C89361p.m154874b(a, "profile", false)) {
                a = "others_homepage";
            } else if (C89361p.m154874b(a, "detail", false) || C89361p.m154874b(a, "item", false)) {
                a = "detail";
            } else if (C89361p.m154874b(a, "live", false)) {
                a = "live";
            } else if (C89361p.m154874b(a, "notification", false)) {
                a = "notification";
            } else if (C89361p.m154874b(a, "challenge/detail", false)) {
                a = "challenge_detail";
            } else if (C89361p.m154874b(a, "music/detail", false)) {
                a = "music_detail";
            } else if (C89361p.m154874b(a, "webview", false)) {
                a = "webview";
            } else if (C89361p.m154874b(a, "messages/group", false)) {
                a = "message_group";
            }
            f95932e = a;
        }
    }

    /* renamed from: b */
    private static String m82670b(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static final void m82664a(Intent intent, String str) {
        C89219l.m154721d(intent, "");
        C89219l.m154721d(str, "");
        m82671b(intent);
        m82665a(intent.getData());
        f95933f = str;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0070, code lost:
        if (r5.length() == 0) goto L_0x0072;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x011f, code lost:
        if (r5 != null) goto L_0x006c;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m82668a(java.lang.String r12, int r13, android.net.Uri r14, java.lang.String r15) {
        /*
        // Method dump skipped, instructions count: 295
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.deeplink.p2735d.C41039c.m82668a(java.lang.String, int, android.net.Uri, java.lang.String):void");
    }
}
