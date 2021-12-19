package com.p2082ss.android.newmedia.redbadge.p2169a;

import android.content.ComponentName;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.newmedia.redbadge.AbstractC30151a;
import com.p2082ss.android.newmedia.redbadge.C30188d;
import java.util.Collections;
import java.util.List;

/* renamed from: com.ss.android.newmedia.redbadge.a.o */
public class C30169o implements AbstractC30151a {
    static {
        Covode.recordClassIndex(36671);
    }

    @Override // com.p2082ss.android.newmedia.redbadge.AbstractC30151a
    /* renamed from: a */
    public final List<String> mo53567a() {
        return Collections.singletonList("com.transsion.XOSLauncher");
    }

    @Override // com.p2082ss.android.newmedia.redbadge.AbstractC30151a
    /* renamed from: a */
    public final void mo53568a(Context context, ComponentName componentName, int i) {
        MethodCollector.m26663i(13424);
        Bundle bundle = new Bundle();
        try {
            bundle.putString("package", context.getPackageName());
            bundle.putString("class", componentName.getClassName());
            bundle.putInt("badgenumber", i);
            int i2 = Build.VERSION.SDK_INT;
            context.getContentResolver().call(Uri.parse("content://com.transsion.XOSLauncher.unreadprovider"), "change_badge", (String) null, bundle);
            MethodCollector.m26664o(13424);
        } catch (Exception e) {
            e.printStackTrace();
            C30188d dVar = new C30188d(e.getMessage(), e);
            MethodCollector.m26664o(13424);
            throw dVar;
        }
    }
}
