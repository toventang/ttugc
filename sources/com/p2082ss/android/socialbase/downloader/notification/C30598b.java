package com.p2082ss.android.socialbase.downloader.notification;

import android.content.Context;
import android.content.Intent;
import android.util.SparseArray;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.socialbase.downloader.downloader.C30399c;
import com.p2082ss.android.socialbase.downloader.p2182e.C30434a;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.ss.android.socialbase.downloader.notification.b */
public class C30598b {

    /* renamed from: c */
    private static volatile C30598b f73025c;

    /* renamed from: e */
    private static final Object f73026e = new Object();

    /* renamed from: a */
    private final long f73027a = 1000;

    /* renamed from: b */
    private final SparseArray<Long> f73028b = new SparseArray<>();

    /* renamed from: d */
    private final Set<String> f73029d = new HashSet();

    /* renamed from: f */
    private final SparseArray<AbstractC30597a> f73030f = new SparseArray<>();

    static {
        Covode.recordClassIndex(37131);
    }

    private C30598b() {
    }

    /* renamed from: a */
    public static C30598b m62774a() {
        MethodCollector.m26663i(11747);
        if (f73025c == null) {
            synchronized (C30598b.class) {
                try {
                    if (f73025c == null) {
                        f73025c = new C30598b();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(11747);
                    throw th;
                }
            }
        }
        C30598b bVar = f73025c;
        MethodCollector.m26664o(11747);
        return bVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final SparseArray<AbstractC30597a> mo54820b() {
        SparseArray<AbstractC30597a> sparseArray;
        MethodCollector.m26663i(11915);
        synchronized (this.f73030f) {
            try {
                sparseArray = this.f73030f;
            } finally {
                MethodCollector.m26664o(11915);
            }
        }
        return sparseArray;
    }

    /* renamed from: a */
    public final void mo54819a(int i) {
        m62776c(i);
        if (i != 0) {
            m62774a();
            m62775b(i);
        }
    }

    /* renamed from: b */
    private static void m62775b(int i) {
        Context B = C30399c.m61674B();
        if (B != null && i != 0) {
            try {
                Intent intent = new Intent(B, DownloadNotificationService.class);
                intent.setAction("android.ss.intent.action.DOWNLOAD_NOTIFICATION_CANCEL");
                intent.putExtra("DOWNLOAD_NOTIFICATION_BUNDLE_EXTRA_ID", i);
                m62773a(B, intent);
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: c */
    private AbstractC30597a m62776c(int i) {
        AbstractC30597a aVar;
        MethodCollector.m26663i(11914);
        if (i == 0) {
            MethodCollector.m26664o(11914);
            return null;
        }
        synchronized (this.f73030f) {
            try {
                aVar = this.f73030f.get(i);
                if (aVar != null) {
                    this.f73030f.remove(i);
                    C30434a.m62027b("DownloaderLogger", "removeNotificationId ".concat(String.valueOf(i)));
                }
            } finally {
                MethodCollector.m26664o(11914);
            }
        }
        return aVar;
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x003d */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.content.ComponentName m62773a(android.content.Context r9, android.content.Intent r10) {
        /*
        // Method dump skipped, instructions count: 114
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.socialbase.downloader.notification.C30598b.m62773a(android.content.Context, android.content.Intent):android.content.ComponentName");
    }
}
