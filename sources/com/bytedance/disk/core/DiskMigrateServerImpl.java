package com.bytedance.disk.core;

import android.content.Context;
import android.os.ConditionVariable;
import com.bytedance.covode.number.Covode;
import com.bytedance.disk.p960d.C14438a;
import com.bytedance.disk.p961e.AbstractC14443b;
import com.bytedance.disk.p961e.AbstractC14448c;
import com.bytedance.disk.p961e.p963b.C14444a;
import com.bytedance.disk.p966h.C14468a;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.concurrent.atomic.AtomicBoolean;

public class DiskMigrateServerImpl implements AbstractC14443b {

    /* renamed from: a */
    private static boolean f34910a;

    /* renamed from: b */
    private static volatile DiskMigrateServerImpl f34911b;

    /* renamed from: c */
    private Context f34912c;

    /* renamed from: d */
    private volatile C14438a f34913d;

    /* renamed from: e */
    private AtomicBoolean f34914e = new AtomicBoolean(false);

    /* renamed from: f */
    private ConditionVariable f34915f = new ConditionVariable(false);

    /* renamed from: g */
    private int f34916g = -1;

    /* renamed from: h */
    private int f34917h = -1;

    /* renamed from: i */
    private AbstractC14448c f34918i = null;

    static {
        Covode.recordClassIndex(16513);
    }

    public static DiskMigrateServerImpl getInstance() {
        if (f34911b == null && f34910a) {
            C14468a.m26437a("DMSI", "DiskMigrateServerImpl not inited!", null, new Object[0]);
        }
        return f34911b;
    }

    public void start() {
        MethodCollector.m26663i(3895);
        if (!this.f34914e.get()) {
            synchronized (this) {
                try {
                    Context context = this.f34912c;
                    int i = this.f34916g;
                    int i2 = this.f34917h;
                    AbstractC14448c cVar = this.f34918i;
                    if (C14438a.f34926a == null) {
                        synchronized (C14438a.class) {
                            try {
                                if (C14438a.f34926a == null) {
                                    C14438a.f34926a = new C14438a(context, i, i2, cVar);
                                }
                            } catch (Throwable th) {
                                MethodCollector.m26664o(3895);
                                throw th;
                            }
                        }
                    }
                    if (C14438a.f34926a == null) {
                        C14468a.m26437a("MigManager", "MigrationManager must be init before getInstance!", null, new Object[0]);
                    }
                    this.f34913d = C14438a.f34926a;
                    this.f34914e.set(true);
                    this.f34915f.open();
                } finally {
                    MethodCollector.m26664o(3895);
                }
            }
            return;
        }
        MethodCollector.m26664o(3895);
    }

    private DiskMigrateServerImpl(Context context) {
        this.f34912c = context;
        C14444a.m26379a(context);
    }

    @Override // com.bytedance.disk.p961e.AbstractC14443b
    /* renamed from: a */
    public final String mo23261a(String str) {
        if (this.f34913d != null) {
            return this.f34913d.mo23268a(str, 2);
        }
        return str;
    }

    public static void init(Context context) {
        MethodCollector.m26663i(3886);
        if (f34911b == null) {
            synchronized (DiskMigrateServerImpl.class) {
                try {
                    if (f34911b == null) {
                        f34911b = new DiskMigrateServerImpl(context);
                    }
                } finally {
                    MethodCollector.m26664o(3886);
                }
            }
            return;
        }
        MethodCollector.m26664o(3886);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0021, code lost:
        if (r11 > 5000) goto L_0x000b;
     */
    @Override // com.bytedance.disk.p961e.AbstractC14443b
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo23262a(long r11) {
        /*
            r10 = this;
            r1 = 5000(0x1388, double:2.4703E-320)
            r3 = 0
            int r0 = (r11 > r3 ? 1 : (r11 == r3 ? 0 : -1))
            if (r0 > 0) goto L_0x001f
            r11 = 5000(0x1388, double:2.4703E-320)
        L_0x000a:
            r1 = r11
        L_0x000b:
            long r8 = java.lang.System.currentTimeMillis()
            android.os.ConditionVariable r0 = r10.f34915f
            r0.block(r1)
            com.bytedance.disk.d.a r0 = r10.f34913d
            r6 = 0
            r7 = 0
            java.lang.String r5 = "DMSI"
            if (r0 == 0) goto L_0x002f
            com.bytedance.disk.d.a r0 = r10.f34913d
            goto L_0x0024
        L_0x001f:
            int r0 = (r11 > r1 ? 1 : (r11 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x000a
            goto L_0x000b
        L_0x0024:
            com.bytedance.disk.a.a r0 = r0.f34927b     // Catch:{ Exception -> 0x002a }
            r0.mo23243a(r1)     // Catch:{ Exception -> 0x002a }
            goto L_0x0036
        L_0x002a:
            r0 = move-exception
            com.bytedance.disk.p960d.C14438a.m26359a(r0)
            goto L_0x0036
        L_0x002f:
            java.lang.Object[] r1 = new java.lang.Object[r7]
            java.lang.String r0 = "waitForServiceReady error!"
            com.bytedance.disk.p966h.C14468a.m26437a(r5, r0, r6, r1)
        L_0x0036:
            long r3 = java.lang.System.currentTimeMillis()
            long r3 = r3 - r8
            r1 = 2000(0x7d0, double:9.88E-321)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x0048
            java.lang.Object[] r1 = new java.lang.Object[r7]
            java.lang.String r0 = "waitForServiceReady wait too long time"
            com.bytedance.disk.p966h.C14468a.m26437a(r5, r0, r6, r1)
        L_0x0048:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.disk.core.DiskMigrateServerImpl.mo23262a(long):void");
    }

    @Override // com.bytedance.disk.p961e.AbstractC14443b
    /* renamed from: a */
    public final int mo23260a(String str, String str2) {
        if (this.f34913d != null) {
            return this.f34913d.mo23267a(str, str2);
        }
        return -1;
    }

    public void config(int i, int i2, AbstractC14448c cVar) {
        MethodCollector.m26663i(3889);
        synchronized (this) {
            try {
                if (this.f34914e.get()) {
                    if (f34910a) {
                        C14468a.m26438a("DMSI", "service has start! please call this method before start", new Object[0]);
                    }
                    return;
                }
                this.f34916g = i;
                this.f34917h = i2;
                this.f34918i = cVar;
                C14468a.f34997a = cVar;
                MethodCollector.m26664o(3889);
            } finally {
                MethodCollector.m26664o(3889);
            }
        }
    }
}
