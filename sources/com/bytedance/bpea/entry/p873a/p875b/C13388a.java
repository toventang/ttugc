package com.bytedance.bpea.entry.p873a.p875b;

import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Looper;
import com.bytedance.bpea.basics.AbstractC13343d;
import com.bytedance.bpea.entry.common.C13397a;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.C15346a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.bpea.entry.a.b.a */
public final class C13388a {

    /* renamed from: a */
    public static final C13389a f32684a = new C13389a((byte) 0);

    static {
        Covode.recordClassIndex(15385);
    }

    /* renamed from: a */
    public static final void m24074a(LocationManager locationManager, String str, long j, LocationListener locationListener, Looper looper, AbstractC13343d dVar) {
        C13389a.m24076a(locationManager, str, j, locationListener, looper, dVar);
    }

    /* renamed from: com.bytedance.bpea.entry.a.b.a$a */
    public static final class C13389a {
        static {
            Covode.recordClassIndex(15386);
        }

        /* renamed from: a */
        private static void m24075a(LocationManager locationManager, String str, long j, float f, LocationListener locationListener, Looper looper) {
            Float valueOf = Float.valueOf(0.0f);
            if (!((Boolean) C15346a.m28238a(locationManager, new Object[]{str, Long.valueOf(j), valueOf, locationListener, looper}, 100001, "void", false, null).first).booleanValue()) {
                C15346a.m28240a(null, locationManager, new Object[]{str, Long.valueOf(j), valueOf, locationListener, looper}, 100001, "com_bytedance_bpea_entry_api_location_LocationEntry$Companion_android_location_LocationManager_requestLocationUpdates(Landroid/location/LocationManager;Ljava/lang/String;JFLandroid/location/LocationListener;Landroid/os/Looper;)V");
                locationManager.requestLocationUpdates(str, j, 0.0f, locationListener, looper);
            }
        }

        private C13389a() {
        }

        public /* synthetic */ C13389a(byte b) {
            this();
        }

        /* renamed from: a */
        public static void m24076a(LocationManager locationManager, String str, long j, LocationListener locationListener, Looper looper, AbstractC13343d dVar) {
            C89219l.m154719c(locationManager, "");
            C89219l.m154719c(str, "");
            C89219l.m154719c(locationListener, "");
            C13397a.C13398a.m24086d(dVar, "location_requestLocationUpdates");
            m24075a(locationManager, str, j, 0.0f, locationListener, looper);
        }
    }
}
