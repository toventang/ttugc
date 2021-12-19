package com.bytedance.bdlocation;

import android.content.ClipboardManager;
import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import android.util.Pair;
import androidx.core.content.C0645c;
import com.bytedance.bdlocation.p846a.C13153b;
import com.bytedance.bdlocation.p848c.C13162b;
import com.bytedance.bdlocation.utils.BDLocationDeserializer;
import com.bytedance.bdlocation.utils.BDLocationSerializer;
import com.bytedance.bdlocation.utils.C13236h;
import com.bytedance.bdlocation.utils.LocationDeserializer;
import com.bytedance.bdlocation.utils.LocationSerializer;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13849d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.helios.sdk.C15346a;
import com.bytedance.platform.godzilla.p1575b.p1583b.C21708b;
import com.google.gson.AbstractC28019l;
import com.google.gson.C27910f;
import com.google.gson.C27917g;
import com.p2082ss.android.ugc.aweme.lancet.C58027i;
import java.lang.reflect.Field;
import java.util.Collection;
import java.util.List;

/* renamed from: com.bytedance.bdlocation.f */
public final class C13182f {

    /* renamed from: a */
    public static C27910f f32181a;

    /* renamed from: b */
    public static int f32182b = 1;

    /* renamed from: c */
    public static int f32183c = 71;

    /* renamed from: d */
    private static int f32184d = 4104;

    /* renamed from: a */
    public static boolean m23709a() {
        if (m23706a(C13153b.f32063v) == f32182b) {
            return true;
        }
        return false;
    }

    static {
        Covode.recordClassIndex(15129);
        C27917g gVar = new C27917g();
        gVar.f65561a = gVar.f65561a.mo46700a(new C13236h(), false, true);
        f32181a = gVar.mo46678a(new C13236h()).mo46680a(Location.class, (Object) new LocationSerializer()).mo46680a(Location.class, (Object) new LocationDeserializer()).mo46680a(BDLocation.class, (Object) new BDLocationSerializer()).mo46680a(BDLocation.class, (Object) new BDLocationDeserializer()).mo46682b();
    }

    /* renamed from: b */
    public static boolean m23712b() {
        if (!C13153b.f32059r) {
            return true;
        }
        if (Build.VERSION.SDK_INT >= 28) {
            try {
                return ((LocationManager) m23708a(C13153b.f32063v, "location")).isLocationEnabled();
            } catch (Exception e) {
                C13162b.m23685a("location enable status error", e.getMessage(), null);
                return false;
            }
        } else {
            int i = Build.VERSION.SDK_INT;
            try {
                if (Settings.Secure.getInt(C13153b.f32063v.getContentResolver(), "location_mode") != 0) {
                    return true;
                }
                return false;
            } catch (Exception e2) {
                e2.printStackTrace();
                return false;
            }
        }
    }

    /* renamed from: a */
    public static int m23706a(Context context) {
        try {
            String[] strArr = {"android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION"};
            int i = 0;
            while (C0645c.m2379a(context, strArr[i]) != 0) {
                i++;
                if (i >= 2) {
                    return f32183c;
                }
            }
            return f32182b;
        } catch (Exception unused) {
            return f32183c;
        }
    }

    /* renamed from: a */
    public static AbstractC28019l m23707a(Object obj) {
        AbstractC28019l lVar = null;
        C13162b.m23685a("BDLocation", "Util#safeToJsonTree begin executing and src is ".concat(String.valueOf(obj)), null);
        try {
            lVar = f32181a.mo46661a(obj);
            return lVar;
        } catch (Throwable th) {
            C13162b.m23691e("BDLocation", "Util#safeToJsonTree occurs exception that " + th.getMessage());
            return lVar;
        }
    }

    /* renamed from: a */
    public static boolean m23710a(Collection collection) {
        if (collection == null || collection.isEmpty()) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static int m23711b(Context context) {
        List<String> list;
        int i;
        try {
            if (!m23712b()) {
                return 1;
            }
            LocationManager locationManager = (LocationManager) m23708a(context, "location");
            if (!(locationManager == null || C13153b.f32065x == null || C13153b.f32065x.f32339b)) {
                C13162b.m23690d("BDLocation", "Util getLocationMode start getProviders");
                Pair<Boolean, Object> a = C15346a.m28238a(locationManager, new Object[]{true}, 100013, "java.util.List", false, null);
                if (((Boolean) a.first).booleanValue()) {
                    list = (List) a.second;
                } else {
                    C15346a.m28240a(null, locationManager, new Object[]{true}, 100013, "com_bytedance_bdlocation_Util_android_location_LocationManager_getProviders(Landroid/location/LocationManager;Z)Ljava/util/List;");
                    list = locationManager.getProviders(true);
                }
                if (list != null && !list.isEmpty()) {
                    if (locationManager.isProviderEnabled("gps")) {
                        i = 2;
                    } else {
                        i = 0;
                    }
                    if (locationManager.isProviderEnabled("network")) {
                        i ^= 4;
                    }
                    if (locationManager.isProviderEnabled("passive")) {
                        i ^= 8;
                    }
                    C13162b.m23690d("BDLocation", "Util getLocationMode".concat(String.valueOf(i)));
                    return i;
                }
            }
            return 0;
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    private static Object m23708a(Context context, String str) {
        Object obj;
        MethodCollector.m26663i(3230);
        if (Build.VERSION.SDK_INT > 27 || !"clipboard".equals(str)) {
            if (!C58027i.f132247b && "connectivity".equals(str)) {
                try {
                    new C21708b().mo35361a();
                    C58027i.f132247b = true;
                    obj = context.getSystemService(str);
                } catch (Throwable unused) {
                }
            }
            obj = context.getSystemService(str);
        } else if (C58027i.f132246a) {
            synchronized (ClipboardManager.class) {
                try {
                    obj = context.getSystemService(str);
                    if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                        try {
                            Field declaredField = ClipboardManager.class.getDeclaredField("mHandler");
                            declaredField.setAccessible(true);
                            declaredField.set(obj, new C58027i.HandlerC58028a((Handler) declaredField.get(obj)));
                        } catch (Exception e) {
                            C13849d.m25015a(e, "ClipboardManager Handler Reflect Fail");
                        }
                    }
                    C58027i.f132246a = false;
                } finally {
                    MethodCollector.m26664o(3230);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }
}
