package com.p2082ss.android.newmedia.redbadge.p2169a;

import android.content.ComponentName;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.newmedia.redbadge.AbstractC30151a;
import com.p2082ss.android.newmedia.redbadge.C30188d;
import java.util.Collections;
import java.util.List;

/* renamed from: com.ss.android.newmedia.redbadge.a.r */
public class C30172r implements AbstractC30151a {

    /* renamed from: a */
    private final Uri f71932a = Uri.parse("content://com.android.badge/badge");

    static {
        Covode.recordClassIndex(36674);
    }

    @Override // com.p2082ss.android.newmedia.redbadge.AbstractC30151a
    /* renamed from: a */
    public final List<String> mo53567a() {
        return Collections.singletonList("com.zui.launcher");
    }

    @Override // com.p2082ss.android.newmedia.redbadge.AbstractC30151a
    /* renamed from: a */
    public final void mo53568a(Context context, ComponentName componentName, int i) {
        MethodCollector.m26663i(11257);
        if (context == null || componentName == null) {
            MethodCollector.m26664o(11257);
            return;
        }
        if (i < 0) {
            i = 0;
        }
        try {
            Bundle bundle = new Bundle();
            bundle.putInt("app_badge_count", i);
            context.getContentResolver().call(this.f71932a, "setAppBadgeCount", (String) null, bundle);
            MethodCollector.m26664o(11257);
        } catch (Throwable th) {
            C30188d dVar = new C30188d(th.getMessage());
            MethodCollector.m26664o(11257);
            throw dVar;
        }
    }
}
