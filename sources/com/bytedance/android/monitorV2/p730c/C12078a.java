package com.bytedance.android.monitorV2.p730c;

import android.app.Application;
import com.bytedance.android.monitorV2.HybridMultiMonitor;
import com.bytedance.android.monitorV2.p737i.C12115b;
import com.bytedance.android.monitorV2.p740l.C12127d;
import com.bytedance.covode.number.Covode;
import java.io.File;

/* renamed from: com.bytedance.android.monitorV2.c.a */
public final class C12078a {

    /* renamed from: a */
    public static boolean f28942a;

    /* renamed from: b */
    public static boolean f28943b;

    static {
        Covode.recordClassIndex(13807);
    }

    /* renamed from: a */
    public static void m21503a(boolean z, boolean z2) {
        f28942a = z;
        Application application = HybridMultiMonitor.getInstance().getApplication();
        if (z2 && application != null) {
            File file = new File(C12127d.m21637a(application, "monitor_data_switch"), "is_debug");
            if (z) {
                C12127d.m21643b(file);
            } else {
                C12127d.m21638a(file);
                return;
            }
        } else if (!z) {
            return;
        }
        C12115b.f29133a = true;
    }

    /* renamed from: b */
    public static void m21504b(boolean z, boolean z2) {
        f28943b = z;
        Application application = HybridMultiMonitor.getInstance().getApplication();
        if (z2 && application != null) {
            File file = new File(C12127d.m21637a(application, "monitor_data_switch"), "is_output_file");
            if (z) {
                C12127d.m21643b(file);
            } else {
                C12127d.m21638a(file);
            }
        }
    }
}
