package com.bytedance.ammt.mmt;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.bytedance.ammt.mmt.impl.GraphicMMTPlugin;
import com.bytedance.ammt.mmt.impl.NativeMMTPlugin;
import com.bytedance.covode.number.Covode;
import com.kakao.usermgmt.StringSet;

/* renamed from: com.bytedance.ammt.mmt.b */
public final class C2571b extends BroadcastReceiver {

    /* renamed from: a */
    public static String f7737a = "com.bytedance.ammt.mmt.DUMP";

    /* renamed from: b */
    public static String f7738b = "com.bytedance.ammt.mmt.START";

    static {
        Covode.recordClassIndex(2956);
    }

    /* renamed from: a */
    private static String m7504a(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }

    public final void onReceive(Context context, Intent intent) {
        GraphicMMTPlugin c;
        NativeMMTPlugin c2;
        if ("com.bytedance.ammt.mmt.DUMP".equals(intent.getAction())) {
            if (m7504a(intent, StringSet.type).equals("native") && (c2 = NativeMMTPlugin.m7520c()) != null && c2.f7736c) {
                C2569a.m7495a();
                String b = C2569a.m7498b(context);
                String a = m7504a(intent, "output");
                if (a != null) {
                    c2.mo7049a(b, a);
                }
                c2.mo7050b();
            }
            if (m7504a(intent, StringSet.type).equals("graphic") && (c = GraphicMMTPlugin.m7513c()) != null && c.f7736c) {
                C2569a.m7495a();
                String b2 = C2569a.m7498b(context);
                String a2 = m7504a(intent, "output");
                if (a2 != null) {
                    c.mo7049a(b2, a2);
                }
                c.mo7050b();
            }
        }
    }
}
