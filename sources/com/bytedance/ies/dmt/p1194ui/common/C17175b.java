package com.bytedance.ies.dmt.p1194ui.common;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.p1195a.AbstractC17152b;

/* renamed from: com.bytedance.ies.dmt.ui.common.b */
public final class C17175b {

    /* renamed from: a */
    public int f40921a;

    static {
        Covode.recordClassIndex(19633);
    }

    /* renamed from: a */
    public static boolean m31706a(int i) {
        return i == 1;
    }

    private C17175b() {
        this.f40921a = 1;
    }

    /* renamed from: com.bytedance.ies.dmt.ui.common.b$a */
    public static class C17176a {

        /* renamed from: a */
        public static C17175b f40922a = new C17175b((byte) 0);

        static {
            Covode.recordClassIndex(19634);
        }
    }

    /* renamed from: a */
    public static boolean m31705a() {
        if (C17176a.f40922a.f40921a == 1) {
            return true;
        }
        return false;
    }

    /* synthetic */ C17175b(byte b) {
        this();
    }

    /* renamed from: b */
    public static boolean m31708b(Context context) {
        if (C17176a.f40922a.f40921a == 0 || m31707a(context)) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static boolean m31707a(Context context) {
        Context context2;
        while (true) {
            context2 = null;
            if (context != null) {
                if (!(context instanceof Activity)) {
                    if (!(context instanceof ContextWrapper)) {
                        break;
                    }
                    context = ((ContextWrapper) context).getBaseContext();
                } else {
                    context2 = context;
                    break;
                }
            } else {
                break;
            }
        }
        if (context2 instanceof AbstractC17152b) {
            return true;
        }
        return false;
    }
}
