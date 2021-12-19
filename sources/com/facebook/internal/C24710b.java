package com.facebook.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.net.Uri;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.facebook.C24006ab;
import com.facebook.C24798j;
import com.facebook.C24872m;
import java.lang.reflect.Method;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.facebook.internal.b */
public class C24710b {

    /* renamed from: d */
    private static final String f58671d = C24710b.class.getCanonicalName();

    /* renamed from: g */
    private static C24710b f58672g;

    /* renamed from: a */
    public String f58673a;

    /* renamed from: b */
    public String f58674b;

    /* renamed from: c */
    public boolean f58675c;

    /* renamed from: e */
    private String f58676e;

    /* renamed from: f */
    private long f58677f;

    /* access modifiers changed from: package-private */
    /* renamed from: com.facebook.internal.b$a */
    public static final class C24711a implements IInterface {

        /* renamed from: a */
        private IBinder f58678a;

        static {
            Covode.recordClassIndex(28864);
        }

        public final IBinder asBinder() {
            return this.f58678a;
        }

        /* renamed from: a */
        public final String mo40547a() {
            Parcel obtain = Parcel.obtain();
            Parcel obtain2 = Parcel.obtain();
            try {
                obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                this.f58678a.transact(1, obtain, obtain2, 0);
                obtain2.readException();
                return obtain2.readString();
            } finally {
                obtain2.recycle();
                obtain.recycle();
            }
        }

        /* renamed from: b */
        public final boolean mo40549b() {
            Parcel obtain = Parcel.obtain();
            Parcel obtain2 = Parcel.obtain();
            try {
                obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                boolean z = true;
                obtain.writeInt(1);
                this.f58678a.transact(2, obtain, obtain2, 0);
                obtain2.readException();
                if (obtain2.readInt() == 0) {
                    z = false;
                }
                return z;
            } finally {
                obtain2.recycle();
                obtain.recycle();
            }
        }

        C24711a(IBinder iBinder) {
            this.f58678a = iBinder;
        }
    }

    static {
        Covode.recordClassIndex(28863);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.facebook.internal.b$b */
    public static final class ServiceConnectionC24712b implements ServiceConnection {

        /* renamed from: a */
        AtomicBoolean f58679a;

        /* renamed from: b */
        final BlockingQueue<IBinder> f58680b;

        static {
            Covode.recordClassIndex(28865);
        }

        public final void onServiceDisconnected(ComponentName componentName) {
        }

        private ServiceConnectionC24712b() {
            this.f58679a = new AtomicBoolean(false);
            this.f58680b = new LinkedBlockingDeque();
        }

        /* synthetic */ ServiceConnectionC24712b(byte b) {
            this();
        }

        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            if (iBinder != null) {
                try {
                    this.f58680b.put(iBinder);
                } catch (InterruptedException unused) {
                }
            }
        }
    }

    /* renamed from: a */
    public final String mo40546a() {
        if (!C24872m.m47685a() || !C24006ab.m45408c()) {
            return null;
        }
        return this.f58676e;
    }

    /* renamed from: a */
    private static C24710b m47328a(C24710b bVar) {
        bVar.f58677f = System.currentTimeMillis();
        f58672g = bVar;
        return bVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x002e, code lost:
        if (r0 != false) goto L_0x0030;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static com.facebook.internal.C24710b m47330c(android.content.Context r5) {
        /*
        // Method dump skipped, instructions count: 127
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.internal.C24710b.m47330c(android.content.Context):com.facebook.internal.b");
    }

    /* renamed from: b */
    private static C24710b m47329b(Context context) {
        Object a;
        try {
            Method a2 = C24693ad.m47240a("com.google.android.gms.common.GooglePlayServicesUtil", "isGooglePlayServicesAvailable", Context.class);
            if (a2 != null) {
                Object a3 = C24693ad.m47230a((Object) null, a2, context);
                if (a3 instanceof Integer) {
                    if (((Integer) a3).intValue() == 0) {
                        Method a4 = C24693ad.m47240a("com.google.android.gms.ads.identifier.AdvertisingIdClient", "getAdvertisingIdInfo", Context.class);
                        if (a4 == null || (a = C24693ad.m47230a((Object) null, a4, context)) == null) {
                            return null;
                        }
                        Method a5 = C24693ad.m47239a(a.getClass(), "getId", new Class[0]);
                        Method a6 = C24693ad.m47239a(a.getClass(), "isLimitAdTrackingEnabled", new Class[0]);
                        if (a5 == null || a6 == null) {
                            return null;
                        }
                        C24710b bVar = new C24710b();
                        bVar.f58676e = (String) C24693ad.m47230a(a, a5, new Object[0]);
                        bVar.f58675c = ((Boolean) C24693ad.m47230a(a, a6, new Object[0])).booleanValue();
                        return bVar;
                    }
                }
            }
            return null;
        } catch (Exception e) {
            C24693ad.m47255a("android_id", e);
            return null;
        }
    }

    /* renamed from: a */
    public static C24710b m47327a(Context context) {
        Throwable th;
        Uri uri;
        String installerPackageName;
        MethodCollector.m26663i(6755);
        C24710b b = m47329b(context);
        if (b == null && (b = m47330c(context)) == null) {
            b = new C24710b();
        }
        try {
            if (Looper.myLooper() != Looper.getMainLooper()) {
                if (f58672g != null) {
                    long currentTimeMillis = System.currentTimeMillis();
                    C24710b bVar = f58672g;
                    if (currentTimeMillis - bVar.f58677f < 3600000) {
                        MethodCollector.m26664o(6755);
                        return bVar;
                    }
                }
                String[] strArr = {"aid", "androidid", "limit_tracking"};
                ProviderInfo resolveContentProvider = context.getPackageManager().resolveContentProvider("com.facebook.katana.provider.AttributionIdProvider", 0);
                ProviderInfo resolveContentProvider2 = context.getPackageManager().resolveContentProvider("com.facebook.wakizashi.provider.AttributionIdProvider", 0);
                if (resolveContentProvider != null && C24756m.m47401a(context, resolveContentProvider.packageName)) {
                    uri = Uri.parse("content://com.facebook.katana.provider.AttributionIdProvider");
                } else if (resolveContentProvider2 == null || !C24756m.m47401a(context, resolveContentProvider2.packageName)) {
                    uri = null;
                } else {
                    uri = Uri.parse("content://com.facebook.wakizashi.provider.AttributionIdProvider");
                }
                PackageManager packageManager = context.getPackageManager();
                if (!(packageManager == null || (installerPackageName = packageManager.getInstallerPackageName(context.getPackageName())) == null)) {
                    b.f58674b = installerPackageName;
                }
                if (uri == null) {
                    C24710b a = m47328a(b);
                    MethodCollector.m26664o(6755);
                    return a;
                }
                Cursor query = context.getContentResolver().query(uri, strArr, null, null, null);
                if (query != null) {
                    try {
                        if (query.moveToFirst()) {
                            int columnIndex = query.getColumnIndex("aid");
                            int columnIndex2 = query.getColumnIndex("androidid");
                            int columnIndex3 = query.getColumnIndex("limit_tracking");
                            b.f58673a = query.getString(columnIndex);
                            if (columnIndex2 > 0 && columnIndex3 > 0 && b.mo40546a() == null) {
                                b.f58676e = query.getString(columnIndex2);
                                b.f58675c = Boolean.parseBoolean(query.getString(columnIndex3));
                            }
                            query.close();
                            C24710b a2 = m47328a(b);
                            MethodCollector.m26664o(6755);
                            return a2;
                        }
                    } catch (Exception unused) {
                        if (query != null) {
                            query.close();
                        }
                        MethodCollector.m26664o(6755);
                        return null;
                    } catch (Throwable th2) {
                        th = th2;
                        if (query != null) {
                            query.close();
                        }
                        MethodCollector.m26664o(6755);
                        throw th;
                    }
                }
                C24710b a3 = m47328a(b);
                if (query != null) {
                    query.close();
                }
                MethodCollector.m26664o(6755);
                return a3;
            }
            C24798j jVar = new C24798j("getAttributionIdentifiers cannot be called on the main thread.");
            MethodCollector.m26664o(6755);
            throw jVar;
        } catch (Exception unused2) {
            MethodCollector.m26664o(6755);
            return null;
        } catch (Throwable th3) {
            th = th3;
            MethodCollector.m26664o(6755);
            throw th;
        }
    }
}
