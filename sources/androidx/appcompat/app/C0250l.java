package androidx.appcompat.app;

import android.content.ClipboardManager;
import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import androidx.core.content.C0645c;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13849d;
import com.bytedance.helios.sdk.C15346a;
import com.bytedance.platform.godzilla.p1575b.p1583b.C21708b;
import com.p2082ss.android.ugc.aweme.lancet.C58027i;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;
import java.lang.reflect.Field;
import java.util.Calendar;

/* renamed from: androidx.appcompat.app.l */
final class C0250l {

    /* renamed from: a */
    private static C0250l f756a;

    /* renamed from: b */
    private final Context f757b;

    /* renamed from: c */
    private final LocationManager f758c;

    /* renamed from: d */
    private final C0251a f759d = new C0251a();

    static {
        Covode.recordClassIndex(284);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.appcompat.app.l$a */
    public static class C0251a {

        /* renamed from: a */
        boolean f760a;

        /* renamed from: b */
        long f761b;

        /* renamed from: c */
        long f762c;

        /* renamed from: d */
        long f763d;

        /* renamed from: e */
        long f764e;

        /* renamed from: f */
        long f765f;

        static {
            Covode.recordClassIndex(285);
        }

        C0251a() {
        }
    }

    /* renamed from: c */
    private boolean m832c() {
        if (this.f759d.f765f > System.currentTimeMillis()) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    private Location m831b() {
        Location a;
        Location location = null;
        if (C0645c.m2379a(this.f757b, "android.permission.ACCESS_COARSE_LOCATION") == 0) {
            location = m826a("network");
        }
        if (C0645c.m2379a(this.f757b, "android.permission.ACCESS_FINE_LOCATION") != 0 || (a = m826a("gps")) == null) {
            return location;
        }
        if (location == null || a.getTime() > location.getTime()) {
            return a;
        }
        return location;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo605a() {
        C0251a aVar = this.f759d;
        if (m832c()) {
            return aVar.f760a;
        }
        Location b = m831b();
        if (b != null) {
            m829a(b);
            return aVar.f760a;
        }
        int i = Calendar.getInstance().get(11);
        if (i < 6 || i >= 22) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    private static Context m830b(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (C58003a.f132201c && applicationContext == null) {
            return C58003a.f132199a;
        }
        return applicationContext;
    }

    /* renamed from: a */
    static C0250l m827a(Context context) {
        if (f756a == null) {
            Context b = m830b(context);
            f756a = new C0250l(b, (LocationManager) m828a(b, "location"));
        }
        return f756a;
    }

    /* renamed from: a */
    private Location m826a(String str) {
        try {
            if (this.f758c.isProviderEnabled(str)) {
                LocationManager locationManager = this.f758c;
                Pair<Boolean, Object> a = C15346a.m28238a(locationManager, new Object[]{str}, 100000, "android.location.Location", false, null);
                if (((Boolean) a.first).booleanValue()) {
                    return (Location) a.second;
                }
                C15346a.m28240a(null, locationManager, new Object[]{str}, 100000, "androidx_appcompat_app_TwilightManager_android_location_LocationManager_getLastKnownLocation(Landroid/location/LocationManager;Ljava/lang/String;)Landroid/location/Location;");
                return locationManager.getLastKnownLocation(str);
            }
        } catch (Exception unused) {
        }
        return null;
    }

    /* renamed from: a */
    private void m829a(Location location) {
        boolean z;
        long j;
        long j2;
        C0251a aVar = this.f759d;
        long currentTimeMillis = System.currentTimeMillis();
        C0249k a = C0249k.m824a();
        a.mo604a(currentTimeMillis - 86400000, location.getLatitude(), location.getLongitude());
        long j3 = a.f753a;
        a.mo604a(currentTimeMillis, location.getLatitude(), location.getLongitude());
        if (a.f755c == 1) {
            z = true;
        } else {
            z = false;
        }
        long j4 = a.f754b;
        long j5 = a.f753a;
        a.mo604a(86400000 + currentTimeMillis, location.getLatitude(), location.getLongitude());
        long j6 = a.f754b;
        if (j4 == -1 || j5 == -1) {
            j = 43200000 + currentTimeMillis;
        } else {
            if (currentTimeMillis > j5) {
                j2 = 0 + j6;
            } else if (currentTimeMillis > j4) {
                j2 = 0 + j5;
            } else {
                j2 = 0 + j4;
            }
            j = j2 + 60000;
        }
        aVar.f760a = z;
        aVar.f761b = j3;
        aVar.f762c = j4;
        aVar.f763d = j5;
        aVar.f764e = j6;
        aVar.f765f = j;
    }

    private C0250l(Context context, LocationManager locationManager) {
        this.f757b = context;
        this.f758c = locationManager;
    }

    /* renamed from: a */
    private static Object m828a(Context context, String str) {
        Object systemService;
        if (Build.VERSION.SDK_INT > 27 || !"clipboard".equals(str)) {
            if (!C58027i.f132247b && "connectivity".equals(str)) {
                try {
                    new C21708b().mo35361a();
                    C58027i.f132247b = true;
                    return context.getSystemService(str);
                } catch (Throwable unused) {
                }
            }
            return context.getSystemService(str);
        } else if (!C58027i.f132246a) {
            return context.getSystemService(str);
        } else {
            synchronized (ClipboardManager.class) {
                systemService = context.getSystemService(str);
                if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                    try {
                        Field declaredField = ClipboardManager.class.getDeclaredField("mHandler");
                        declaredField.setAccessible(true);
                        declaredField.set(systemService, new C58027i.HandlerC58028a((Handler) declaredField.get(systemService)));
                    } catch (Exception e) {
                        C13849d.m25015a(e, "ClipboardManager Handler Reflect Fail");
                    }
                }
                C58027i.f132246a = false;
            }
            return systemService;
        }
    }
}
