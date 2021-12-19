package com.p2082ss.android.ugc.aweme.app;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.newmedia.C30128d;
import com.p2082ss.android.ugc.aweme.bullet.utils.C35301c;
import com.p2082ss.android.ugc.tiktok.security.p4333a.C84349a;

/* renamed from: com.ss.android.ugc.aweme.app.d */
public final class C33722d {

    /* renamed from: a */
    public static final String f79884a = "webview";

    /* renamed from: b */
    public static final String f79885b = "open_url";

    /* renamed from: c */
    public static final String f79886c = "is_from_self";

    /* renamed from: d */
    public static final String f79887d = "com.ss.android.sdk.";

    /* renamed from: e */
    public static final C33723a f79888e = new C33723a((byte) 0);

    /* renamed from: com.ss.android.ugc.aweme.app.d$a */
    public static final class C33723a {
        static {
            Covode.recordClassIndex(40618);
        }

        private C33723a() {
        }

        public /* synthetic */ C33723a(byte b) {
            this();
        }

        /* renamed from: a */
        private static String m69043a(String str) {
            String str2;
            if (C30128d.m60946a(str)) {
                return C35301c.m72249b(str);
            }
            Uri parse = Uri.parse(str);
            String queryParameter = parse.getQueryParameter("url");
            if (queryParameter != null) {
                str2 = C35301c.m72249b(queryParameter);
            } else {
                str2 = null;
            }
            return String.valueOf(C35301c.m72245a(parse, "url", str2));
        }

        /* renamed from: a */
        private static void m69044a(Context context, Intent intent) {
            C84349a.m145093a(intent, context);
            context.startActivity(intent);
        }

        /* renamed from: a */
        public final boolean mo59966a(Context context, String str) {
            return m69045a(context, str, (String) null, false);
        }

        /* JADX WARNING: Removed duplicated region for block: B:82:0x0144  */
        /* JADX WARNING: Removed duplicated region for block: B:88:0x0150  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static boolean m69045a(android.content.Context r12, java.lang.String r13, java.lang.String r14, boolean r15) {
            /*
            // Method dump skipped, instructions count: 340
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.app.C33722d.C33723a.m69045a(android.content.Context, java.lang.String, java.lang.String, boolean):boolean");
        }

        /* JADX WARNING: Code restructure failed: missing block: B:91:0x017b, code lost:
            if (r1.getFromNotificationIds().contains(r2) == false) goto L_0x017d;
         */
        /* JADX WARNING: Removed duplicated region for block: B:103:0x01b8  */
        /* JADX WARNING: Removed duplicated region for block: B:104:0x01bf  */
        /* JADX WARNING: Removed duplicated region for block: B:106:0x01c2  */
        /* JADX WARNING: Removed duplicated region for block: B:108:0x01c9  */
        /* JADX WARNING: Removed duplicated region for block: B:110:0x01ce  */
        /* JADX WARNING: Removed duplicated region for block: B:113:0x01dd  */
        /* JADX WARNING: Removed duplicated region for block: B:116:0x01f3  */
        /* JADX WARNING: Removed duplicated region for block: B:119:0x01fa  */
        /* JADX WARNING: Removed duplicated region for block: B:122:0x020b  */
        /* JADX WARNING: Removed duplicated region for block: B:125:0x021c  */
        /* JADX WARNING: Removed duplicated region for block: B:128:0x022d  */
        /* JADX WARNING: Removed duplicated region for block: B:131:0x023e  */
        /* JADX WARNING: Removed duplicated region for block: B:134:0x0261  */
        /* JADX WARNING: Removed duplicated region for block: B:135:0x026e  */
        /* JADX WARNING: Removed duplicated region for block: B:136:0x0270  */
        /* JADX WARNING: Removed duplicated region for block: B:99:0x019e  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static android.content.Intent m69042a(android.content.Context r26, android.net.Uri r27, boolean r28, boolean r29) {
            /*
            // Method dump skipped, instructions count: 631
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.app.C33722d.C33723a.m69042a(android.content.Context, android.net.Uri, boolean, boolean):android.content.Intent");
        }
    }

    static {
        Covode.recordClassIndex(40617);
    }
}
