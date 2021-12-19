package com.p2082ss.android.ugc.aweme.feed.adapter;

import android.util.Log;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.feed.adapter.ck */
public final class C48245ck {

    /* renamed from: a */
    static boolean f111771a;

    /* renamed from: b */
    static boolean f111772b;

    /* renamed from: c */
    public static int f111773c = -1;

    /* renamed from: d */
    public static final C48245ck f111774d = new C48245ck();

    private C48245ck() {
    }

    static {
        Covode.recordClassIndex(56987);
    }

    /* renamed from: a */
    public static void m91654a(int i, float f, boolean z) {
        try {
            if (C48246cl.f111775a == null) {
                C48246cl.f111775a = Boolean.valueOf(SettingsManager.m29616a().mo25400a("widget_container_monitor", true));
            }
            Boolean bool = C48246cl.f111775a;
            if (bool == null) {
                C89219l.m154715b();
            }
            if (bool.booleanValue()) {
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append("WidgetContainerMonitor >>>");
                stringBuffer.append("alpha:" + f + " , visibility:" + i + " \n");
                stringBuffer.append("enterDislikeMode:" + f111771a + " , enterSeekBarMode:" + f111772b + " , doWidgetAlphaAnim:" + f111773c + " , isAnimate:" + z + "\n");
                String stackTraceString = Log.getStackTraceString(new Throwable());
                C89219l.m154716b(stackTraceString, "");
                int i2 = 0;
                for (Object obj : C89361p.m154921c(stackTraceString, new String[]{"\n"})) {
                    int i3 = i2 + 1;
                    if (i2 < 0) {
                        C89070n.m154520a();
                    }
                    String str = (String) obj;
                    if (i2 < 15) {
                        stringBuffer.append(str + "\n");
                    }
                    i2 = i3;
                }
                C51423a.m95791b(6, "WidgetContainerMonitor", stringBuffer.toString());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
