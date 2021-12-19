package com.bytedance.android.live.core.p218f.p220b;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import android.view.View;
import androidx.fragment.app.ActivityC0945e;
import com.bytedance.android.live.core.p218f.p220b.p221a.C3914a;
import com.bytedance.android.live.core.p218f.p220b.p221a.C3915b;
import com.bytedance.android.live.core.p218f.p220b.p221a.C3916c;
import com.bytedance.android.live.core.p218f.p220b.p221a.C3917d;
import com.bytedance.android.live.core.p218f.p220b.p221a.C3918e;
import com.bytedance.android.live.core.p218f.p220b.p221a.C3919f;
import com.bytedance.android.live.core.p218f.p220b.p221a.C3920g;
import com.bytedance.android.live.core.p218f.p220b.p221a.C3921h;
import com.bytedance.android.livesdk.utils.C11279p;
import com.bytedance.covode.number.Covode;
import com.p2082ss.p2083a.p2084a.AbstractC29335a;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.bytedance.android.live.core.f.b.a */
public final class C3911a {

    /* renamed from: b */
    static Map<String, AbstractC3924c> f10799b = new HashMap<String, AbstractC3924c>() {
        /* class com.bytedance.android.live.core.p218f.p220b.C3911a.C39121 */

        static {
            Covode.recordClassIndex(4441);
        }

        {
            put("OPPO", new C3918e());
            put("VIVO", new C3920g());
            put("HISENSE", new C3915b());
            put("HUAWEI", new C3917d());
            put("XIAOMI", new C3921h());
            put("ASUS", new C3914a());
            put("ONEPLUS", new C3919f());
        }
    };

    /* renamed from: c */
    static Map<String, AbstractC3924c> f10800c = new HashMap<String, AbstractC3924c>() {
        /* class com.bytedance.android.live.core.p218f.p220b.C3911a.C39132 */

        static {
            Covode.recordClassIndex(4442);
        }

        {
            put("HONOR", new C3916c());
        }
    };

    /* renamed from: a */
    public boolean f10801a;

    static {
        Covode.recordClassIndex(4440);
    }

    public C3911a(Context context) {
        boolean z;
        if (m9547b(context) || m9546a(context)) {
            z = true;
        } else {
            z = false;
        }
        this.f10801a = z;
    }

    /* renamed from: a */
    private static boolean m9546a(Context context) {
        boolean z;
        boolean z2;
        try {
            String trim = Build.MANUFACTURER.toUpperCase().trim();
            String trim2 = Build.BRAND.toUpperCase().trim();
            AbstractC3924c cVar = f10799b.get(trim);
            AbstractC3924c cVar2 = f10800c.get(trim2);
            if (cVar == null || !cVar.mo9270a(context)) {
                z = false;
            } else {
                z = true;
            }
            if (cVar2 == null || cVar == cVar2 || !cVar2.mo9270a(context)) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (z || z2) {
                return true;
            }
            return false;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    /* renamed from: b */
    private static boolean m9547b(Context context) {
        ActivityC0945e a = C11279p.m20001a(context);
        if (a == null || Build.VERSION.SDK_INT < 28) {
            return false;
        }
        View decorView = a.getWindow().getDecorView();
        try {
            Object invoke = decorView.getClass().getMethod("getRootWindowInsets", new Class[0]).invoke(decorView, new Object[0]);
            Object invoke2 = invoke.getClass().getDeclaredMethod("getDisplayCutout", new Class[0]).invoke(invoke, new Object[0]);
            List list = (List) invoke2.getClass().getMethod("getBoundingRects", new Class[0]).invoke(invoke2, new Object[0]);
            if (list == null || list.size() <= 0) {
                return false;
            }
            return true;
        } catch (Exception e) {
            AbstractC29335a.m58732b("DigHoleCheck", Log.getStackTraceString(e));
            return false;
        }
    }
}
