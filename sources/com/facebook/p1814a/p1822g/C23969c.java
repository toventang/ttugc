package com.facebook.p1814a.p1822g;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.os.IBinder;
import com.bytedance.covode.number.Covode;
import com.facebook.C24872m;
import com.facebook.internal.C24699ae;
import com.facebook.internal.C24756m;
import com.facebook.internal.p1894a.p1896b.C24677a;
import java.util.LinkedList;
import java.util.concurrent.CountDownLatch;

/* renamed from: com.facebook.a.g.c */
public class C23969c {

    /* renamed from: a */
    private static final String f56735a = C23969c.class.getSimpleName();

    /* renamed from: b */
    private static Boolean f56736b;

    /* access modifiers changed from: package-private */
    /* renamed from: com.facebook.a.g.c$a */
    public enum EnumC23970a {
        MOBILE_APP_INSTALL("MOBILE_APP_INSTALL"),
        CUSTOM_APP_EVENTS("CUSTOM_APP_EVENTS");
        

        /* renamed from: c */
        private String f56740c;

        public final String toString() {
            return this.f56740c;
        }

        static {
            Covode.recordClassIndex(28091);
        }

        private EnumC23970a(String str) {
            this.f56740c = str;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.facebook.a.g.c$b */
    public static final class ServiceConnectionC23971b implements ServiceConnection {

        /* renamed from: a */
        final CountDownLatch f56741a = new CountDownLatch(1);

        /* renamed from: b */
        IBinder f56742b;

        static {
            Covode.recordClassIndex(28092);
        }

        public final void onServiceDisconnected(ComponentName componentName) {
        }

        ServiceConnectionC23971b() {
        }

        public final void onNullBinding(ComponentName componentName) {
            this.f56741a.countDown();
        }

        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            this.f56742b = iBinder;
            this.f56741a.countDown();
        }
    }

    static {
        Covode.recordClassIndex(28090);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.facebook.a.g.c$c */
    public enum EnumC23972c {
        OPERATION_SUCCESS,
        SERVICE_NOT_AVAILABLE,
        SERVICE_ERROR;

        static {
            Covode.recordClassIndex(28093);
        }
    }

    /* renamed from: a */
    public static boolean m45325a() {
        boolean z;
        if (C24677a.m47209a(C23969c.class)) {
            return false;
        }
        try {
            if (f56736b == null) {
                C24699ae.m47299a();
                if (m45322a(C24872m.f59047g) != null) {
                    z = true;
                } else {
                    z = false;
                }
                f56736b = Boolean.valueOf(z);
            }
            return f56736b.booleanValue();
        } catch (Throwable th) {
            C24677a.m47208a(th, C23969c.class);
            return false;
        }
    }

    /* renamed from: a */
    public static EnumC23972c m45324a(String str) {
        if (C24677a.m47209a(C23969c.class)) {
            return null;
        }
        try {
            return m45323a(EnumC23970a.MOBILE_APP_INSTALL, str, new LinkedList());
        } catch (Throwable th) {
            C24677a.m47208a(th, C23969c.class);
            return null;
        }
    }

    /* renamed from: a */
    private static Intent m45322a(Context context) {
        if (C24677a.m47209a(C23969c.class)) {
            return null;
        }
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null) {
                Intent intent = new Intent("ReceiverService");
                intent.setPackage("com.facebook.katana");
                if (packageManager.resolveService(intent, 0) != null && C24756m.m47401a(context, "com.facebook.katana")) {
                    return intent;
                }
                Intent intent2 = new Intent("ReceiverService");
                intent2.setPackage("com.facebook.wakizashi");
                if (packageManager.resolveService(intent2, 0) == null || !C24756m.m47401a(context, "com.facebook.wakizashi")) {
                    return null;
                }
                return intent2;
            }
            return null;
        } catch (Throwable th) {
            C24677a.m47208a(th, C23969c.class);
            return null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0042 A[Catch:{ RemoteException | InterruptedException -> 0x0068, all -> 0x0076 }] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0062 A[Catch:{ RemoteException | InterruptedException -> 0x0068, all -> 0x0076 }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static com.facebook.p1814a.p1822g.C23969c.EnumC23972c m45323a(com.facebook.p1814a.p1822g.C23969c.EnumC23970a r8, java.lang.String r9, java.util.List<com.facebook.p1814a.C23909c> r10) {
        /*
        // Method dump skipped, instructions count: 131
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.p1814a.p1822g.C23969c.m45323a(com.facebook.a.g.c$a, java.lang.String, java.util.List):com.facebook.a.g.c$c");
    }
}
