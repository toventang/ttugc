package com.bytedance.disk.p960d;

import android.content.Context;
import android.os.Process;
import android.os.RemoteException;
import com.bytedance.covode.number.Covode;
import com.bytedance.disk.core.BinderC14435a;
import com.bytedance.disk.p956a.AbstractC14423a;
import com.bytedance.disk.p961e.AbstractC14448c;
import com.bytedance.disk.p961e.p962a.C14442a;
import com.bytedance.disk.p961e.p963b.C14444a;
import com.bytedance.disk.p965g.BinderC14455a;
import com.bytedance.disk.p966h.C14468a;
import com.bytedance.disk.p966h.C14473c;
import com.bytedance.disk.parcel.ClientProxyConfig;
import com.bytedance.disk.parcel.MigrationItem;
import com.bytedance.disk.parcel.MigrationOpt;
import com.bytedance.frameworks.apm.trace.MethodCollector;

/* renamed from: com.bytedance.disk.d.a */
public class C14438a {

    /* renamed from: a */
    public static volatile C14438a f34926a;

    /* renamed from: b */
    public AbstractC14423a f34927b;

    /* renamed from: c */
    private Context f34928c;

    /* renamed from: d */
    private int f34929d = -1;

    /* renamed from: e */
    private int f34930e = -1;

    static {
        Covode.recordClassIndex(16517);
    }

    /* renamed from: a */
    public static void m26359a(Exception exc) {
        if (exc instanceof RemoteException) {
            C14468a.m26437a("MigManager", "transact with remote failed!", exc, new Object[0]);
        } else {
            C14468a.m26437a("MigManager", "handleException", exc, new Object[0]);
        }
    }

    /* renamed from: a */
    private int m26357a(MigrationOpt migrationOpt) {
        int i = -1;
        MigrationItem migrationItem = null;
        try {
            int i2 = 0;
            migrationItem = this.f34927b.mo23242a(migrationOpt, false, false);
            if (migrationItem != null) {
                if (migrationItem.mo23312c()) {
                    i2 = 3;
                } else if (migrationItem.mo23314d()) {
                    i2 = 4;
                } else if (migrationItem.mo23316e()) {
                    i2 = 7;
                }
                i = migrationItem.f35015f | i2;
            }
        } catch (RemoteException e) {
            m26359a(e);
        } catch (Throwable th) {
            MigrationItem.C14482a.m26483a(null);
            throw th;
        }
        MigrationItem.C14482a.m26483a(migrationItem);
        return i;
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: b */
    private int m26360b(String str, String str2) {
        MigrationOpt a = MigrationOpt.C14484a.m26488a();
        a.f35020b = "trig-" + C14442a.m26374a(4);
        a.f35021c = str;
        a.f35022d = str2;
        a.f35023e = 0;
        a.f35024f = C14473c.m26441a(str);
        if (a.f35024f == 0) {
            a.f35024f = C14473c.m26441a(str2);
        }
        try {
            int a2 = this.f34927b.mo23241a(a, 4);
            MigrationOpt.C14484a.m26489a(a);
            return a2;
        } catch (RemoteException e) {
            m26359a(e);
            MigrationOpt.C14484a.m26489a(a);
            return -1;
        } catch (Throwable th) {
            MigrationOpt.C14484a.m26489a(a);
            throw th;
        }
    }

    /* renamed from: a */
    public final int mo23267a(String str, String str2) {
        MigrationOpt a = MigrationOpt.C14484a.m26488a();
        a.f35020b = "check-".concat(String.valueOf(str));
        a.f35021c = str;
        a.f35022d = str2;
        int i = 0;
        a.f35023e = 0;
        a.f35024f = C14473c.m26441a(str);
        if (a.f35024f == 0) {
            a.f35024f = C14473c.m26441a(str2);
        }
        if (a.f35024f == 0) {
            a.f35024f = 1;
        }
        MigrationItem migrationItem = null;
        int i2 = -1;
        try {
            migrationItem = this.f34927b.mo23242a(a, true, false);
            if (migrationItem != null) {
                if (migrationItem.mo23312c()) {
                    i = 3;
                } else if (migrationItem.mo23314d()) {
                    i = 4;
                } else if (migrationItem.mo23316e()) {
                    i = 7;
                }
                i2 = migrationItem.f35015f | i;
            }
        } catch (RemoteException e) {
            m26359a(e);
        } catch (Throwable th) {
            MigrationItem.C14482a.m26483a(null);
            throw th;
        }
        MigrationItem.C14482a.m26483a(migrationItem);
        return i2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x0060 A[SYNTHETIC, Splitter:B:23:0x0060] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m26358a(final com.bytedance.disk.parcel.MigrationItem r11, int r12) {
        /*
        // Method dump skipped, instructions count: 169
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.disk.p960d.C14438a.m26358a(com.bytedance.disk.parcel.MigrationItem, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:68:0x01a4  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String mo23268a(java.lang.String r15, int r16) {
        /*
        // Method dump skipped, instructions count: 442
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.disk.p960d.C14438a.mo23268a(java.lang.String, int):java.lang.String");
    }

    public C14438a(Context context, int i, int i2, AbstractC14448c cVar) {
        MethodCollector.m26663i(1934);
        C14444a.m26379a(context);
        this.f34928c = context;
        if (BinderC14455a.f34958a == null) {
            synchronized (BinderC14455a.class) {
                try {
                    if (BinderC14455a.f34958a == null) {
                        BinderC14455a.f34958a = new BinderC14455a(context, i, i2, cVar);
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(1934);
                    throw th;
                }
            }
        }
        BinderC14455a aVar = BinderC14455a.f34958a;
        synchronized (aVar.f34961d) {
            try {
                ClientProxyConfig clientProxyConfig = new ClientProxyConfig();
                clientProxyConfig.f35007a = true;
                clientProxyConfig.f35009c = BinderC14435a.m26355a();
                clientProxyConfig.f35008b = Process.myPid();
                aVar.f34961d.put(clientProxyConfig.f35008b, clientProxyConfig);
            } catch (Throwable th2) {
                MethodCollector.m26664o(1934);
                throw th2;
            }
        }
        this.f34927b = aVar;
        MethodCollector.m26664o(1934);
    }
}
