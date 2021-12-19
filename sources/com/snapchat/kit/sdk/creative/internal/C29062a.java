package com.snapchat.kit.sdk.creative.internal;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.snapchat.kit.sdk.creative.p2074d.AbstractC29058a;

/* renamed from: com.snapchat.kit.sdk.creative.internal.a */
public final class C29062a {

    /* renamed from: a */
    public final AbstractC29058a f68649a;

    /* renamed from: b */
    public final String f68650b;

    static {
        Covode.recordClassIndex(35411);
    }

    /* renamed from: a */
    public static String m58050a(Context context) {
        CharSequence applicationLabel;
        String packageName = context.getPackageName();
        PackageManager packageManager = context.getPackageManager();
        Intent intent = new Intent("android.intent.action.MAIN", (Uri) null);
        intent.setPackage(packageName);
        intent.addCategory("android.intent.category.LAUNCHER");
        for (ResolveInfo resolveInfo : packageManager.queryIntentActivities(intent, 0)) {
            if (!(resolveInfo.activityInfo == null || TextUtils.isEmpty(resolveInfo.activityInfo.nonLocalizedLabel))) {
                return resolveInfo.activityInfo.nonLocalizedLabel.toString();
            }
        }
        try {
            TextUtils.equals(packageName, C17867d.m33078a().getPackageName());
            ApplicationInfo applicationInfo = packageManager.getApplicationInfo(packageName, 0);
            if (!(applicationInfo == null || (applicationLabel = packageManager.getApplicationLabel(applicationInfo)) == null)) {
                return applicationLabel.toString();
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return null;
    }

    public C29062a(String str, AbstractC29058a aVar) {
        this.f68650b = str;
        this.f68649a = aVar;
    }
}
