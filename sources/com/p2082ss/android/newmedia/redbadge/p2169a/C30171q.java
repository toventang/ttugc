package com.p2082ss.android.newmedia.redbadge.p2169a;

import android.content.ComponentName;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.newmedia.redbadge.AbstractC30151a;
import com.p2082ss.android.newmedia.redbadge.C30188d;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.newmedia.redbadge.a.q */
public class C30171q implements AbstractC30151a {
    static {
        Covode.recordClassIndex(36673);
    }

    @Override // com.p2082ss.android.newmedia.redbadge.AbstractC30151a
    /* renamed from: a */
    public final List<String> mo53567a() {
        return new ArrayList(0);
    }

    @Override // com.p2082ss.android.newmedia.redbadge.AbstractC30151a
    /* renamed from: a */
    public final void mo53568a(Context context, ComponentName componentName, int i) {
        MethodCollector.m26663i(13347);
        if (context == null || componentName == null) {
            MethodCollector.m26664o(13347);
            return;
        }
        if (i < 0) {
            i = 0;
        }
        Bundle bundle = new Bundle();
        bundle.putInt("app_badge_count", i);
        bundle.putString("app_badge_component_name", componentName.flattenToString());
        try {
            context.getContentResolver().call(Uri.parse("content://com.android.launcher3.cornermark.unreadbadge"), "setAppUnreadCount", (String) null, bundle);
            MethodCollector.m26664o(13347);
        } catch (Throwable th) {
            C30188d dVar = new C30188d(th.getMessage());
            MethodCollector.m26664o(13347);
            throw dVar;
        }
    }
}
