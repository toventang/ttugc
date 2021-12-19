package com.p2082ss.android.newmedia.redbadge.p2169a;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.newmedia.redbadge.AbstractC30151a;
import com.p2082ss.android.newmedia.redbadge.C30188d;
import com.p2082ss.android.newmedia.redbadge.p2171c.C30186a;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.ss.android.newmedia.redbadge.a.l */
public class C30163l implements AbstractC30151a {
    static {
        Covode.recordClassIndex(36665);
    }

    @Override // com.p2082ss.android.newmedia.redbadge.AbstractC30151a
    /* renamed from: a */
    public final List<String> mo53567a() {
        return Arrays.asList("com.smartisanos.launcher", "com.smartisanos.home");
    }

    @Override // com.p2082ss.android.newmedia.redbadge.AbstractC30151a
    /* renamed from: a */
    public final void mo53568a(Context context, ComponentName componentName, int i) {
        MethodCollector.m26663i(11910);
        if (context == null || componentName == null) {
            MethodCollector.m26664o(11910);
            return;
        }
        if (i < 0) {
            i = 0;
        }
        Intent intent = new Intent("com.smartisanos.launcher.new_message");
        intent.putExtra("extra_packagename", componentName.getPackageName());
        intent.putExtra("extra_componentname", componentName.getClassName());
        intent.putExtra("extra_message_count", i);
        if (C30186a.m61058a(context, intent)) {
            try {
                context.sendBroadcast(intent);
                MethodCollector.m26664o(11910);
            } catch (Throwable th) {
                C30188d dVar = new C30188d(th.getMessage());
                MethodCollector.m26664o(11910);
                throw dVar;
            }
        } else {
            Bundle bundle = new Bundle();
            bundle.putInt("badge_num", i);
            try {
                context.getContentResolver().call(Uri.parse("content://com.smartisanos.launcher.badge"), "updateMessageBadge", (String) null, bundle);
                MethodCollector.m26664o(11910);
            } catch (Throwable unused) {
                C30188d dVar2 = new C30188d("unable to resolve intent: " + intent.toString());
                MethodCollector.m26664o(11910);
                throw dVar2;
            }
        }
    }
}
