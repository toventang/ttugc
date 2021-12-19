package com.bytedance.bdlocation.service;

import android.content.ClipboardManager;
import android.content.Context;
import android.location.Geocoder;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import androidx.core.content.C0643b;
import com.bytedance.bdlocation.AbstractC13148a;
import com.bytedance.bdlocation.BDLocation;
import com.bytedance.bdlocation.C13167e;
import com.bytedance.bdlocation.C13182f;
import com.bytedance.bdlocation.p846a.C13149a;
import com.bytedance.bdlocation.p846a.C13153b;
import com.bytedance.bdlocation.p846a.C13154c;
import com.bytedance.bdlocation.p846a.C13155d;
import com.bytedance.bdlocation.p846a.C13156e;
import com.bytedance.bdlocation.p848c.C13162b;
import com.bytedance.bpea.entry.p873a.p875b.C13388a;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13849d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.platform.godzilla.p1575b.p1583b.C21708b;
import com.p2082ss.android.ugc.aweme.lancet.C58027i;
import java.lang.reflect.Field;
import java.util.Locale;

public class SystemBaseLocationImpl extends AbstractC13148a {
    private volatile boolean isChanged;
    public boolean isSingle;
    public C13149a.AbstractC13151a mCallback;
    private LocationListener mGPSListener = new LocationListener() {
        /* class com.bytedance.bdlocation.service.SystemBaseLocationImpl.C131892 */

        static {
            Covode.recordClassIndex(15138);
        }

        public final void onProviderEnabled(String str) {
            SystemBaseLocationImpl.this.mNetworkDisabled = false;
        }

        public final void onProviderDisabled(String str) {
            C13162b.m23688b("BDLocation", "SysLocation:onProviderDisabled:".concat(String.valueOf(str)));
            SystemBaseLocationImpl.this.mGpsDisabled = true;
            SystemBaseLocationImpl.this.checkAndCallback();
        }

        public final void onLocationChanged(Location location) {
            if (SystemBaseLocationImpl.this.getLocationChange()) {
                C13162b.m23690d("BDLocation", "Network Location Changed!");
                return;
            }
            C13162b.m23690d("BDRegionLocation locationstatus GPS onLocationChanged:", "SystemBaseLocationImpl-mNetWorkListener");
            try {
                if (!C13190a.m23731a().f32207b.mo21325a() || SystemBaseLocationImpl.this.isSingle) {
                    SystemBaseLocationImpl.this.stopLocation();
                }
                SystemBaseLocationImpl systemBaseLocationImpl = SystemBaseLocationImpl.this;
                systemBaseLocationImpl.mLastLocation = systemBaseLocationImpl.transform(location, 1);
                SystemBaseLocationImpl systemBaseLocationImpl2 = SystemBaseLocationImpl.this;
                systemBaseLocationImpl2.geocodeAndCallback(systemBaseLocationImpl2.mLastLocation, SystemBaseLocationImpl.this.mOption, SystemBaseLocationImpl.this.mCallback);
            } catch (Exception e) {
                C13162b.m23685a("BDLocation", "SysLocation:GPS listener error", e);
            }
        }

        public final void onStatusChanged(String str, int i, Bundle bundle) {
            C13162b.m23688b("BDRegionLocation GPS onStatusChanged:", "provider:".concat(String.valueOf(str)));
            C13162b.m23688b("BDRegionLocation GPS onStatusChanged:", "status:".concat(String.valueOf(i)));
        }
    };
    public boolean mGpsDisabled;
    public BDLocation mLastLocation;
    private LocationManager mManager;
    private LocationListener mNetWorkListener = new LocationListener() {
        /* class com.bytedance.bdlocation.service.SystemBaseLocationImpl.C131881 */

        static {
            Covode.recordClassIndex(15137);
        }

        public final void onProviderEnabled(String str) {
            SystemBaseLocationImpl.this.mNetworkDisabled = false;
        }

        public final void onProviderDisabled(String str) {
            C13162b.m23688b("BDLocation", "SysLocation:onProviderDisabled:".concat(String.valueOf(str)));
            SystemBaseLocationImpl.this.mNetworkDisabled = true;
            SystemBaseLocationImpl.this.checkAndCallback();
        }

        public final void onLocationChanged(Location location) {
            try {
                if (SystemBaseLocationImpl.this.getLocationChange()) {
                    C13162b.m23690d("BDLocation", "Network Location Changed!");
                    return;
                }
                C13162b.m23690d("BDRegionLocation locationstatus network onLocationChanged:", "SystemBaseLocationImpl-mNetWorkListener");
                if (!C13190a.m23731a().f32207b.mo21325a() || SystemBaseLocationImpl.this.isSingle) {
                    SystemBaseLocationImpl.this.stopLocation();
                }
                SystemBaseLocationImpl systemBaseLocationImpl = SystemBaseLocationImpl.this;
                systemBaseLocationImpl.mLastLocation = systemBaseLocationImpl.transform(location, 4);
                SystemBaseLocationImpl systemBaseLocationImpl2 = SystemBaseLocationImpl.this;
                systemBaseLocationImpl2.geocodeAndCallback(systemBaseLocationImpl2.mLastLocation, SystemBaseLocationImpl.this.mOption, SystemBaseLocationImpl.this.mCallback);
            } catch (Exception e) {
                C13162b.m23685a("BDLocation", "SysLocation:network listener error", e);
            }
        }

        public final void onStatusChanged(String str, int i, Bundle bundle) {
            C13162b.m23688b("BDRegionLocation network onStatusChanged:", "provider:".concat(String.valueOf(str)));
            C13162b.m23688b("BDRegionLocation network onStatusChanged:", "status:".concat(String.valueOf(i)));
        }
    };
    public boolean mNetworkDisabled;
    public C13156e mOption;

    static {
        Covode.recordClassIndex(15136);
    }

    @Override // com.bytedance.bdlocation.AbstractC13160c
    public String getLocateName() {
        return "Android";
    }

    @Override // com.bytedance.bdlocation.AbstractC13148a
    public boolean needGeocode(BDLocation bDLocation, C13156e eVar) {
        return true;
    }

    private boolean isBackground() {
        return C13153b.f32065x.f32339b;
    }

    public void checkAndCallback() {
        if (checkProviderDisabled(this.mOption.f32088j)) {
            geocodeAndCallback(null, this.mOption, this.mCallback);
        }
    }

    public boolean getLocationChange() {
        MethodCollector.m26663i(4556);
        synchronized (this) {
            try {
                if (this.isChanged) {
                    return true;
                }
                this.isChanged = true;
                MethodCollector.m26664o(4556);
                return false;
            } finally {
                MethodCollector.m26664o(4556);
            }
        }
    }

    @Override // com.bytedance.bdlocation.AbstractC13160c
    public void stopLocation() {
        try {
            this.mManager.removeUpdates(this.mNetWorkListener);
            this.mManager.removeUpdates(this.mGPSListener);
            C13162b.m23690d("BDRegionLocation locationstatus", "stop");
        } catch (Exception unused) {
            C13162b.m23690d("BDRegionLocation locationstatus", "stop Exception");
        }
    }

    public void setLocation(BDLocation bDLocation) {
        this.mLastLocation = bDLocation;
    }

    private boolean checkProviderDisabled(int i) {
        if (i == 2) {
            if (!this.mGpsDisabled || !this.mNetworkDisabled) {
                return false;
            }
            return true;
        } else if (i == 0) {
            return this.mNetworkDisabled;
        } else {
            return this.mGpsDisabled;
        }
    }

    public BDLocation transform(Location location, int i) {
        return transform(location, i, false);
    }

    public SystemBaseLocationImpl(Context context, QPSController qPSController) {
        super(context, qPSController);
        this.mContext = context;
        this.mManager = (LocationManager) m23728x328f92cd(context, "location");
    }

    private void onBackgroundError(C13156e eVar, C13149a.AbstractC13151a aVar) {
        C13154c cVar = new C13154c("No positioning in the background", "Unknown", "36");
        eVar.f32083e.mo21290a(cVar);
        eVar.f32083e.mo21292c();
        aVar.mo21247a(cVar);
    }

    /* renamed from: com_bytedance_bdlocation_service_SystemBaseLocationImpl_com_ss_android_ugc_aweme_lancet_GetSystemServiceLancet_getSystemService */
    public static Object m23728x328f92cd(Context context, String str) {
        Object obj;
        MethodCollector.m26663i(4372);
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
                    MethodCollector.m26664o(4372);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }

    @Override // com.bytedance.bdlocation.AbstractC13160c
    public BDLocation geocode(C13155d dVar, String str) {
        if (!"wgs".equals(str)) {
            return null;
        }
        BDLocation bDLocation = new BDLocation(dVar.f32075a);
        bDLocation.setLatitude(dVar.f32077c);
        bDLocation.setLongitude(dVar.f32076b);
        try {
            C13162b.m23690d("BDRegionLocation geocode", "geocode");
            Context context = this.mContext;
            if (!Geocoder.isPresent()) {
                return null;
            }
            Locale locale = C13153b.f32060s;
            if (locale == null) {
                locale = Locale.getDefault();
            }
            return C13167e.m23698a(new Geocoder(context, locale).getFromLocation(bDLocation.getLatitude(), bDLocation.getLongitude(), 10), bDLocation);
        } catch (Exception e) {
            C13162b.m23686a("SysLocation:geocode error", e);
            return null;
        }
    }

    private BDLocation transform(Location location, int i, boolean z) {
        if (location == null) {
            return null;
        }
        BDLocation bDLocation = new BDLocation(location);
        bDLocation.f31993E = i;
        bDLocation.f31994F = z;
        return bDLocation;
    }

    @Override // com.bytedance.bdlocation.AbstractC13160c
    public void startLocation(C13149a.AbstractC13151a aVar, C13156e eVar, Looper looper) {
        boolean z;
        long j;
        if (!C13182f.m23712b()) {
            aVar.mo21247a(new C13154c("Location service is not turned on. Please turn on the location service switch in settings", "Android", "1"));
            return;
        }
        this.mCallback = aVar;
        this.mOption = eVar;
        if (eVar.f32081c == 0) {
            z = true;
        } else {
            z = false;
        }
        this.isSingle = z;
        this.isChanged = false;
        try {
            if (eVar.f32081c > 0) {
                j = eVar.f32081c;
            } else {
                j = 300;
            }
            String[] strArr = {"android.permission.ACCESS_FINE_LOCATION"};
            Context context = C13153b.f32063v;
            if (context != null) {
                int i = 0;
                while (true) {
                    String str = strArr[0];
                    if (TextUtils.isEmpty(str) || C0643b.m2367a(context, str) != 0) {
                        i++;
                        if (i > 0) {
                            break;
                        }
                    } else {
                        C13162b.m23690d("BDLocation", "SystemBaseLocationImpl start requestLocationUpdates before check background");
                        if (!isBackground()) {
                            C13153b.f32042a = C13182f.m23711b(this.mContext);
                            if (eVar.f32088j == 0) {
                                C13162b.m23690d("BDLocation", "SystemBaseLocationImpl start requestLocationUpdates only NETWORK_PROVIDER");
                                if (!isBackground()) {
                                    C13162b.m23690d("BDLocation", "SystemBaseLocationImpl start requestLocationUpdates only NETWORK_PROVIDER0");
                                    C13388a.m24074a(this.mManager, "network", j, this.mNetWorkListener, looper, eVar.f32089k);
                                } else {
                                    onBackgroundError(eVar, aVar);
                                    return;
                                }
                            } else if (eVar.f32088j == 1) {
                                C13162b.m23690d("BDLocation", "SystemBaseLocationImpl start requestLocationUpdates only GPS_PROVIDER");
                                if (!isBackground()) {
                                    C13162b.m23690d("BDLocation", "SystemBaseLocationImpl start requestLocationUpdates only GPS_PROVIDER0");
                                    C13388a.m24074a(this.mManager, "gps", j, this.mGPSListener, looper, eVar.f32089k);
                                } else {
                                    onBackgroundError(eVar, aVar);
                                    return;
                                }
                            } else {
                                C13162b.m23690d("BDLocation", "SystemBaseLocationImpl start requestLocationUpdates NETWORK_PROVIDER and GPS_PROVIDER");
                                if (!isBackground()) {
                                    C13162b.m23690d("BDLocation", "SystemBaseLocationImpl start requestLocationUpdates NETWORK_PROVIDER and GPS_PROVIDER 0");
                                    C13388a.m24074a(this.mManager, "network", j, this.mNetWorkListener, looper, eVar.f32089k);
                                    if (!isBackground()) {
                                        C13162b.m23690d("BDLocation", "SystemBaseLocationImpl start requestLocationUpdates NETWORK_PROVIDER and GPS_PROVIDER 1");
                                        C13388a.m24074a(this.mManager, "gps", j, this.mGPSListener, looper, eVar.f32089k);
                                    }
                                } else {
                                    onBackgroundError(eVar, aVar);
                                    return;
                                }
                            }
                        } else {
                            onBackgroundError(eVar, aVar);
                            return;
                        }
                    }
                }
            }
            onLocateStart("Android");
            C13162b.m23689c("BDRegionLocation locationstatus", "start---isSingle:" + this.isSingle);
        } catch (Exception e) {
            C13162b.m23689c("BDRegionLocation locationstatus", "start---Exception");
            throw new RuntimeException(e);
        }
    }
}
