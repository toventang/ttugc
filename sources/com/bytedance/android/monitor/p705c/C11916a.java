package com.bytedance.android.monitor.p705c;

import android.app.Application;
import com.bytedance.android.monitor.HybridMonitor;
import com.bytedance.android.monitor.p710h.C11937b;
import com.bytedance.android.monitor.p714l.C11949c;
import com.bytedance.covode.number.Covode;
import java.io.File;

/* renamed from: com.bytedance.android.monitor.c.a */
public final class C11916a {

    /* renamed from: a */
    public static boolean f28465a;

    /* renamed from: b */
    public static boolean f28466b;

    static {
        Covode.recordClassIndex(13642);
    }

    /* renamed from: a */
    public static void m21020a(boolean z, boolean z2) {
        f28465a = z;
        Application application = HybridMonitor.getInstance().getApplication();
        if (z2 && application != null) {
            File file = new File(C11949c.m21087a(application, "monitor_data_switch"), "is_debug");
            if (z) {
                C11949c.m21093b(file);
            } else {
                C11949c.m21088a(file);
                return;
            }
        } else if (!z) {
            return;
        }
        C11937b.f28558a = true;
    }

    /* renamed from: b */
    public static void m21021b(boolean z, boolean z2) {
        f28466b = z;
        Application application = HybridMonitor.getInstance().getApplication();
        if (z2 && application != null) {
            File file = new File(C11949c.m21087a(application, "monitor_data_switch"), "is_output_file");
            if (z) {
                C11949c.m21093b(file);
            } else {
                C11949c.m21088a(file);
            }
        }
    }
}
