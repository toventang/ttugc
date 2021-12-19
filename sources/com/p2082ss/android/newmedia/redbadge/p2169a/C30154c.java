package com.p2082ss.android.newmedia.redbadge.p2169a;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.newmedia.redbadge.AbstractC30151a;
import com.p2082ss.android.newmedia.redbadge.C30188d;
import com.p2082ss.android.newmedia.redbadge.p2171c.C30186a;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.ss.android.newmedia.redbadge.a.c */
public class C30154c implements AbstractC30151a {
    static {
        Covode.recordClassIndex(36656);
    }

    @Override // com.p2082ss.android.newmedia.redbadge.AbstractC30151a
    /* renamed from: a */
    public final List<String> mo53567a() {
        return Arrays.asList("com.asus.launcher", "com.lge.launcher", "com.lge.launcher2", "com.lge.launcher3");
    }

    @Override // com.p2082ss.android.newmedia.redbadge.AbstractC30151a
    /* renamed from: a */
    public final void mo53568a(Context context, ComponentName componentName, int i) {
        if (context != null && componentName != null) {
            if (i < 0) {
                i = 0;
            }
            Intent intent = new Intent("android.intent.action.BADGE_COUNT_UPDATE");
            intent.putExtra("badge_count", i);
            intent.putExtra("badge_count_package_name", componentName.getPackageName());
            intent.putExtra("badge_count_class_name", componentName.getClassName());
            intent.putExtra("badge_vip_count", 0);
            if (C30186a.m61058a(context, intent)) {
                try {
                    context.sendBroadcast(intent);
                } catch (Throwable th) {
                    throw new C30188d(th.getMessage());
                }
            } else {
                throw new C30188d("unable to resolve intent: " + intent.toString());
            }
        }
    }
}
