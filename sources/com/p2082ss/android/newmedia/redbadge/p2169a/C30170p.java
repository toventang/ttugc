package com.p2082ss.android.newmedia.redbadge.p2169a;

import android.content.ComponentName;
import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.newmedia.redbadge.AbstractC30151a;
import com.p2082ss.android.newmedia.redbadge.C30188d;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.ss.android.newmedia.redbadge.a.p */
public class C30170p implements AbstractC30151a {
    static {
        Covode.recordClassIndex(36672);
    }

    @Override // com.p2082ss.android.newmedia.redbadge.AbstractC30151a
    /* renamed from: a */
    public final List<String> mo53567a() {
        return Arrays.asList("com.miui.miuilite", "com.miui.home", "com.miui.miuihome", "com.miui.miuihome2", "com.miui.mihome", "com.miui.mihome2", "com.i.miui.launcher");
    }

    @Override // com.p2082ss.android.newmedia.redbadge.AbstractC30151a
    /* renamed from: a */
    public final void mo53568a(Context context, ComponentName componentName, int i) {
        Object obj;
        Object obj2 = "";
        if (context != null && componentName != null) {
            if (i < 0) {
                i = 0;
            }
            try {
                Object newInstance = Class.forName("android.app.MiuiNotification").newInstance();
                Field declaredField = newInstance.getClass().getDeclaredField("messageCount");
                declaredField.setAccessible(true);
                if (i == 0) {
                    obj = obj2;
                } else {
                    try {
                        obj = Integer.valueOf(i);
                    } catch (Throwable unused) {
                        declaredField.set(newInstance, Integer.valueOf(i));
                        return;
                    }
                }
                declaredField.set(newInstance, String.valueOf(obj));
            } catch (Throwable unused2) {
                throw new C30188d(th.getMessage());
            }
        }
    }
}
