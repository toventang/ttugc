package com.p2082ss.android.newmedia.p2164b;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import com.bytedance.common.utility.C13627m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.p2082ss.android.ugc.aweme.base.utils.C34729o;
import com.p2082ss.android.ugc.tiktok.security.p4333a.C84349a;
import java.net.URISyntaxException;

/* renamed from: com.ss.android.newmedia.b.a */
public final class C30125a {
    static {
        Covode.recordClassIndex(36624);
    }

    /* renamed from: a */
    private static String m60934a() {
        return "snssdk" + C17867d.f42590n;
    }

    /* renamed from: a */
    public static String m60935a(String str) {
        if (C13627m.m24498a(str)) {
            return str;
        }
        try {
            String scheme = Uri.parse(str).getScheme();
            String a = m60934a();
            if ("sslocal".equals(scheme) || "localsdk".equals(scheme)) {
                return str.replace(scheme, a);
            }
            return str;
        } catch (Exception unused) {
            return str;
        }
    }

    /* renamed from: a */
    private static void m60936a(Context context, Intent intent) {
        C84349a.m145093a(intent, context);
        context.startActivity(intent);
    }

    /* renamed from: a */
    public static boolean m60937a(Context context, String str) {
        Intent intent;
        PackageManager packageManager;
        try {
            intent = Intent.parseUri(str, 1);
        } catch (URISyntaxException unused) {
            intent = null;
        }
        if (!(intent == null || (packageManager = C34729o.m70950a(context).getPackageManager()) == null || intent.resolveActivity(packageManager) == null)) {
            intent.addFlags(268435456);
            if (intent.getComponent() == null || !context.getPackageName().equals(intent.getComponent().getPackageName())) {
                m60936a(context, intent);
                return true;
            }
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x004a, code lost:
        if (r1.equals(r5) != false) goto L_0x004c;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m60938b(android.content.Context r7, java.lang.String r8) {
        /*
        // Method dump skipped, instructions count: 194
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.newmedia.p2164b.C30125a.m60938b(android.content.Context, java.lang.String):boolean");
    }
}
