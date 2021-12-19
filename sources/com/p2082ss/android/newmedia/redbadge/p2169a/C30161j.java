package com.p2082ss.android.newmedia.redbadge.p2169a;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.newmedia.redbadge.AbstractC30151a;
import com.p2082ss.android.newmedia.redbadge.C30188d;
import com.p2082ss.android.newmedia.redbadge.p2171c.C30186a;
import java.util.Collections;
import java.util.List;

/* renamed from: com.ss.android.newmedia.redbadge.a.j */
public class C30161j implements AbstractC30151a {

    /* renamed from: a */
    private static int f71924a = -1;

    /* renamed from: b */
    private int f71925b = Integer.MIN_VALUE;

    @Override // com.p2082ss.android.newmedia.redbadge.AbstractC30151a
    /* renamed from: a */
    public final List<String> mo53567a() {
        return Collections.singletonList("com.oppo.launcher");
    }

    static {
        Covode.recordClassIndex(36663);
    }

    @Override // com.p2082ss.android.newmedia.redbadge.AbstractC30151a
    /* renamed from: a */
    public final void mo53568a(Context context, ComponentName componentName, int i) {
        MethodCollector.m26663i(12055);
        if (context == null || componentName == null) {
            MethodCollector.m26664o(12055);
            return;
        }
        int i2 = this.f71925b;
        if (i2 == i || (i2 > 99 && i > 99)) {
            MethodCollector.m26664o(12055);
            return;
        }
        this.f71925b = i;
        Intent intent = new Intent("com.oppo.unsettledevent");
        intent.putExtra("pakeageName", componentName.getPackageName());
        intent.putExtra("number", i);
        intent.putExtra("upgradeNumber", i);
        if (C30186a.m61058a(context, intent)) {
            try {
                context.sendBroadcast(intent);
                if (i <= 0 && Build.VERSION.SDK_INT < 23) {
                    Intent intent2 = (Intent) intent.clone();
                    intent2.putExtra("number", -1);
                    intent2.putExtra("upgradeNumber", -1);
                    context.sendBroadcast(intent2);
                }
                MethodCollector.m26664o(12055);
            } catch (Throwable th) {
                C30188d dVar = new C30188d(th.getMessage());
                MethodCollector.m26664o(12055);
                throw dVar;
            }
        } else {
            try {
                Bundle bundle = new Bundle();
                bundle.putInt("app_badge_count", i);
                context.getContentResolver().call(Uri.parse("content://com.android.badge/badge"), "setAppBadgeCount", (String) null, bundle);
                if (i <= 0 && Build.VERSION.SDK_INT < 23) {
                    Bundle bundle2 = (Bundle) bundle.clone();
                    bundle2.putInt("app_badge_count", -1);
                    context.getContentResolver().call(Uri.parse("content://com.android.badge/badge"), "setAppBadgeCount", (String) null, bundle2);
                }
                MethodCollector.m26664o(12055);
            } catch (Throwable unused) {
                C30188d dVar2 = new C30188d("unable to resolve intent: " + intent.toString());
                MethodCollector.m26664o(12055);
                throw dVar2;
            }
        }
    }
}
