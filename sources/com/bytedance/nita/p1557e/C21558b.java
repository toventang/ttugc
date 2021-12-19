package com.bytedance.nita.p1557e;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.ActivityC0945e;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.lang.reflect.Field;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.nita.e.b */
public final class C21558b {

    /* renamed from: a */
    public static final C21558b f51160a = new C21558b();

    /* renamed from: b */
    private static Field f51161b;

    private C21558b() {
    }

    static {
        Covode.recordClassIndex(25199);
        try {
            f51161b = View.class.getDeclaredField("mContext");
        } catch (Exception e) {
            e.printStackTrace();
            f51161b = null;
        }
    }

    /* renamed from: a */
    public static boolean m40491a(Context context) {
        C89219l.m154719c(context, "");
        if (!(context instanceof ActivityC0945e)) {
            return true;
        }
        int i = Build.VERSION.SDK_INT;
        ActivityC0945e eVar = (ActivityC0945e) context;
        if (eVar.isDestroyed() || eVar.isFinishing()) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static void m40490a(View view, Activity activity) {
        C89219l.m154719c(view, "");
        C89219l.m154719c(activity, "");
        System.currentTimeMillis();
        m40492b(view, activity);
        System.currentTimeMillis();
    }

    /* renamed from: c */
    private static void m40493c(View view, Activity activity) {
        C89219l.m154719c(view, "");
        C89219l.m154719c(activity, "");
        try {
            Field field = f51161b;
            if (field != null) {
                field.setAccessible(true);
                field.set(view, activity);
                field.setAccessible(false);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: b */
    private static void m40492b(View view, Activity activity) {
        MethodCollector.m26663i(3151);
        synchronized (view) {
            try {
                if (!(view.getContext() instanceof Activity) || (!C89219l.m154714a(view.getContext(), activity))) {
                    m40493c(view, activity);
                    if (view instanceof ViewGroup) {
                        int i = 0;
                        int childCount = ((ViewGroup) view).getChildCount() - 1;
                        if (childCount >= 0) {
                            while (true) {
                                View childAt = ((ViewGroup) view).getChildAt(i);
                                C89219l.m154709a((Object) childAt, "");
                                m40492b(childAt, activity);
                                if (i == childCount) {
                                    break;
                                }
                                i++;
                            }
                        }
                    }
                }
            } finally {
                MethodCollector.m26664o(3151);
            }
        }
    }
}
