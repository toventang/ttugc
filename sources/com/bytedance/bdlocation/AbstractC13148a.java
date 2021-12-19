package com.bytedance.bdlocation;

import android.content.ClipboardManager;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.bytedance.bdlocation.p846a.C13149a;
import com.bytedance.bdlocation.p846a.C13153b;
import com.bytedance.bdlocation.p846a.C13154c;
import com.bytedance.bdlocation.p846a.C13155d;
import com.bytedance.bdlocation.p846a.C13156e;
import com.bytedance.bdlocation.p848c.C13162b;
import com.bytedance.bdlocation.p850e.AbstractC13168a;
import com.bytedance.bdlocation.p850e.C13180b;
import com.bytedance.bdlocation.p850e.p851a.C13171c;
import com.bytedance.bdlocation.p850e.p851a.C13172d;
import com.bytedance.bdlocation.p850e.p851a.C13173e;
import com.bytedance.bdlocation.p850e.p851a.C13174f;
import com.bytedance.bdlocation.p850e.p851a.C13175g;
import com.bytedance.bdlocation.p850e.p851a.C13176h;
import com.bytedance.bdlocation.p850e.p851a.C13177i;
import com.bytedance.bdlocation.p850e.p851a.C13178j;
import com.bytedance.bdlocation.p850e.p851a.C13179k;
import com.bytedance.bdlocation.p853f.C13184b;
import com.bytedance.bdlocation.p854g.C13185a;
import com.bytedance.bdlocation.service.C13190a;
import com.bytedance.bdlocation.service.QPSController;
import com.bytedance.bdlocation.utils.C13227a;
import com.bytedance.bdlocation.utils.C13233e;
import com.bytedance.bdlocation.utils.C13235g;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13849d;
import com.bytedance.platform.godzilla.p1575b.p1583b.C21708b;
import com.bytedance.retrofit2.C22099u;
import com.bytedance.retrofit2.client.C22027b;
import com.bytedance.retrofit2.mime.TypedString;
import com.bytedance.ttnet.INetworkApi;
import com.bytedance.ttnet.utils.RetrofitUtils;
import com.google.gson.AbstractC28019l;
import com.google.gson.C28022o;
import com.p2082ss.android.ugc.aweme.lancet.C58027i;
import java.lang.reflect.Field;
import java.math.BigDecimal;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import org.json.JSONObject;

/* renamed from: com.bytedance.bdlocation.a */
public abstract class AbstractC13148a implements AbstractC13160c, AbstractC13164d {
    protected Context mContext;
    protected QPSController mController;
    public AbstractC13164d mLocateCb;

    static {
        Covode.recordClassIndex(15095);
    }

    private boolean allowUploadLocationInfo(BDLocation bDLocation) {
        return true;
    }

    /* access modifiers changed from: protected */
    public abstract boolean needGeocode(BDLocation bDLocation, C13156e eVar);

    @Override // com.bytedance.bdlocation.AbstractC13164d
    public void onLocateStart(String str) {
        AbstractC13164d dVar = this.mLocateCb;
        if (dVar != null) {
            dVar.onLocateStart(str);
        }
    }

    @Override // com.bytedance.bdlocation.AbstractC13164d
    public void onLocateStop(String str) {
        AbstractC13164d dVar = this.mLocateCb;
        if (dVar != null) {
            dVar.onLocateStop(str);
        }
    }

    private boolean isNeedAddress(C13156e eVar) {
        if (eVar == null || eVar.f32084f != 0) {
            return true;
        }
        return false;
    }

    public static BDLocation getDownGradeLocation(C13156e eVar) {
        try {
            C13184b a = C13190a.m23731a().f32206a.mo21282a();
            if (a == null) {
                return null;
            }
            BDLocation bDLocation = a.f32190c;
            if (bDLocation != null) {
                if (System.currentTimeMillis() - bDLocation.f31991C < C13153b.f32054m) {
                    bDLocation.f31993E = 5;
                }
            }
            return bDLocation;
        } catch (Exception e) {
            C13162b.m23689c("BDLocation", "cache or ip locate error:" + e.getLocalizedMessage());
            return null;
        }
    }

    public static C13172d getDeviceStatus(Context context) {
        String str = null;
        if (!C13153b.f32058q) {
            return null;
        }
        C13172d dVar = new C13172d();
        dVar.f32109a = 2;
        TelephonyManager telephonyManager = (TelephonyManager) m23661xc441c551(context, "phone");
        if (telephonyManager.getSimState() == 5) {
            str = telephonyManager.getSimOperator();
        }
        dVar.f32110b = str;
        Locale locale = C13153b.f32060s;
        if (locale == null) {
            locale = Locale.getDefault();
        }
        dVar.f32112d = locale.getLanguage();
        dVar.f32111c = locale.getCountry();
        dVar.f32113e = locale.toString();
        dVar.f32114f = C13182f.m23706a(context);
        dVar.f32115g = C13153b.f32043b;
        dVar.f32117i = C13153b.f32044c;
        dVar.f32116h = C13153b.m23677e();
        return dVar;
    }

    public static BDLocation getGeocodeResult(BDLocation bDLocation) {
        T t;
        BDLocation bDLocation2 = bDLocation;
        System.currentTimeMillis();
        C13174f fVar = null;
        if (bDLocation2 != null) {
            fVar = bdLocationToGpsInfo(bDLocation2, C13153b.f32055n);
        }
        Locale locale = C13153b.f32060s;
        if (locale == null) {
            locale = Locale.getDefault();
        }
        String language = locale.getLanguage();
        String country = locale.getCountry();
        if (!TextUtils.isEmpty(country) && !TextUtils.isEmpty(language) && language.trim().equals("zh")) {
            language = language + "-" + country;
        }
        String str = C13153b.f32061t;
        C13162b.m23689c("BDRegionLocation geocode: start", "ServerApi--getGeoCodeResult");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("sys_location", new JSONObject(C13182f.f32181a.mo46674b(fVar)));
        jSONObject.put("language", language);
        jSONObject.put("world_view", str);
        TypedString typedString = new TypedString(jSONObject.toString());
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("sdk_version", "1.1.0-alpha.17");
        List<C22027b> b = C13180b.m23705b();
        AbstractC13168a aVar = C13153b.f32066y;
        if (aVar != null) {
            t = aVar.mo21274a(C13180b.m23702a(), "/ttloc/geocode/", linkedHashMap, typedString, b, true);
        } else {
            C22099u<String> execute = ((INetworkApi) RetrofitUtils.m43281a(C13180b.m23702a(), INetworkApi.class)).postBody(-1, "/ttloc/geocode/", linkedHashMap, typedString, b).execute();
            if (execute.f52261a.f52040b == 200) {
                t = execute.f52262b;
                C13162b.m23689c("BDRegionLocation geocode: success", "ServerApi--getGeoCodeResult");
                C13162b.m23689c("BDRegionLocation geocode: result", t);
            } else {
                t = "";
            }
        }
        try {
            C13176h hVar = (C13176h) C13182f.f32181a.mo46670a(new JSONObject(t).getString("data"), C13176h.class);
            if (hVar != null) {
                if (bDLocation2 == null) {
                    bDLocation2 = new BDLocation("bd_geocode");
                } else {
                    bDLocation2 = new BDLocation(bDLocation2);
                }
                C13178j jVar = hVar.f32143b;
                if (jVar != null) {
                    bDLocation2.f32009b = jVar.f32170d;
                    bDLocation2.f31995G = jVar.f32167a;
                    bDLocation2.f32016i = jVar.f32168b;
                    bDLocation2.f32022o = jVar.f32169c;
                    bDLocation2.f31996H = jVar.f32171e;
                }
                C13177i iVar = hVar.f32147f;
                int i = 0;
                if (iVar != null && !C13182f.m23710a((Collection) iVar.f32155a)) {
                    bDLocation2.f32008a = iVar.f32155a.get(0);
                }
                C13178j[] jVarArr = hVar.f32144c;
                if (jVarArr != null && jVarArr.length > 0) {
                    bDLocation2.f32010c = jVarArr[0].f32170d;
                    bDLocation2.f32017j = jVarArr[0].f32168b;
                    bDLocation2.f32023p = jVarArr[0].f32169c;
                }
                if (jVarArr != null && jVarArr.length > 1) {
                    bDLocation2.f32011d = jVarArr[1].f32170d;
                }
                C13178j jVar2 = hVar.f32145d;
                if (jVar2 != null) {
                    bDLocation2.f32012e = jVar2.f32170d;
                    bDLocation2.f31997I = jVar2.f32171e;
                    bDLocation2.f31999K = String.valueOf(jVar2.f32168b);
                    bDLocation2.f32018k = jVar2.f32168b;
                    bDLocation2.f32024q = jVar2.f32169c;
                }
                C13178j jVar3 = hVar.f32146e;
                if (jVar3 != null) {
                    bDLocation2.f32013f = jVar3.f32170d;
                    bDLocation2.f32019l = jVar3.f32168b;
                    bDLocation2.f32025r = jVar3.f32169c;
                    bDLocation2.f31998J = jVar3.f32171e;
                }
                C13179k kVar = hVar.f32152k;
                if (kVar != null) {
                    bDLocation2.f32014g = kVar.f32176d;
                    bDLocation2.f32020m = kVar.f32174b;
                    bDLocation2.f32026s = kVar.f32175c;
                }
                C13179k kVar2 = hVar.f32153l;
                if (kVar2 != null) {
                    bDLocation2.f32015h = kVar2.f32176d;
                    bDLocation2.f32021n = kVar2.f32174b;
                    bDLocation2.f32027t = kVar2.f32175c;
                }
                C13173e eVar = hVar.f32148g;
                if (!(eVar == null || eVar.f32121d == 0.0d || eVar.f32121d == 0.0d)) {
                    bDLocation2.setLatitude(eVar.f32121d);
                    bDLocation2.setLongitude(eVar.f32122e);
                }
                if (hVar.f32154m && jVar == null && jVarArr == null && jVar2 == null && jVar3 == null && iVar == null) {
                    bDLocation2 = new BDLocation("");
                }
                String str2 = hVar.f32150i;
                if (!TextUtils.isEmpty(str2)) {
                    if (str2.equals("GPSLocation")) {
                        i = 1;
                    } else if (str2.equals("WiFi")) {
                        i = 2;
                    } else if (str2.equals("bss")) {
                        i = 3;
                    } else if (str2.equals("IPLocation")) {
                        i = 6;
                    } else if (str2.equals("MCC")) {
                        i = 7;
                    }
                }
                bDLocation2.f31993E = i;
                bDLocation2.f32002N = hVar.f32154m;
                bDLocation2.f32003O = true;
                bDLocation2.f32001M = hVar;
            }
            C13162b.m23684a("BDLocation", C13182f.f32181a.mo46674b(bDLocation2));
            return bDLocation2;
        } catch (Exception e) {
            throw e;
        }
    }

    public AbstractC13148a(Context context, QPSController qPSController) {
        this.mContext = context;
        this.mController = qPSController;
    }

    private void onError(C13149a.AbstractC13151a aVar, C13154c cVar) {
        if (aVar != null) {
            aVar.mo21247a(cVar);
        }
    }

    @Override // com.bytedance.bdlocation.AbstractC13164d
    public void onLocateChange(String str, BDLocation bDLocation) {
        AbstractC13164d dVar = this.mLocateCb;
        if (dVar != null) {
            dVar.onLocateChange(str, bDLocation);
        }
    }

    @Override // com.bytedance.bdlocation.AbstractC13164d
    public void onLocateError(String str, C13154c cVar) {
        AbstractC13164d dVar = this.mLocateCb;
        if (dVar != null) {
            dVar.onLocateError(str, cVar);
        }
    }

    public static void uploadDeviceStatus(Context context, C13156e eVar) {
        C13153b.f32042a = C13182f.m23711b(context);
        uploadDeviceStatusInfo(context, eVar);
    }

    private static C13174f bdLocationToGpsInfo(BDLocation bDLocation, boolean z) {
        if (bDLocation == null) {
            return null;
        }
        C13174f fVar = new C13174f();
        fVar.f32125a = bDLocation.f32009b;
        fVar.f32128d = bDLocation.f32013f;
        fVar.f32126b = bDLocation.f32010c;
        fVar.f32127c = bDLocation.f32012e;
        if (z) {
            fVar.f32131g = bDLocation.getLatitude();
            fVar.f32130f = bDLocation.getLongitude();
        }
        fVar.f32132h = bDLocation.getTime() / 1000;
        return fVar;
    }

    private static C13175g bdLocationToLocationInfo(BDLocation bDLocation, boolean z) {
        if (bDLocation == null) {
            return null;
        }
        C13175g gVar = new C13175g();
        gVar.f32133a = bDLocation.f32009b;
        gVar.f32134b = bDLocation.f32010c;
        gVar.f32135c = bDLocation.f32012e;
        gVar.f32136d = bDLocation.f32013f;
        if (z) {
            gVar.f32137e = bDLocation.getLongitude();
            gVar.f32138f = bDLocation.getLatitude();
        }
        gVar.f32139g = bDLocation.getAltitude();
        gVar.f32141i = bDLocation.getTime() / 1000;
        gVar.f32140h = bDLocation.f32028u;
        return gVar;
    }

    /* renamed from: com_bytedance_bdlocation_BaseLocate_com_ss_android_ugc_aweme_lancet_GetSystemServiceLancet_getSystemService */
    public static Object m23661xc441c551(Context context, String str) {
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

    private static void uploadDeviceStatusInfo(Context context, C13156e eVar) {
        String str;
        if (C13153b.f32058q) {
            String str2 = "";
            if (eVar != null) {
                try {
                    str2 = eVar.f32079a;
                } catch (Exception unused) {
                    C13162b.m23689c("BDLocation", "upload device status error");
                    return;
                }
            }
            C13172d dVar = new C13172d();
            dVar.f32109a = 2;
            String str3 = null;
            if (context != null) {
                TelephonyManager telephonyManager = (TelephonyManager) C13233e.m23791a(context, "phone");
                if (telephonyManager != null && telephonyManager.getSimState() == 5) {
                    str3 = telephonyManager.getSimOperator();
                }
            }
            dVar.f32110b = str3;
            Locale locale = C13153b.f32060s;
            if (locale == null) {
                locale = Locale.getDefault();
            }
            dVar.f32112d = locale.getLanguage();
            dVar.f32111c = locale.getCountry();
            dVar.f32113e = locale.toString();
            dVar.f32114f = C13182f.m23706a(context);
            dVar.f32115g = C13153b.f32043b;
            dVar.f32117i = C13153b.f32044c;
            dVar.f32116h = C13153b.m23677e();
            C28022o oVar = new C28022o();
            oVar.mo46797a("status", C13182f.m23707a(dVar));
            oVar.mo46800a("timestamp", Long.valueOf(System.currentTimeMillis() / 1000));
            C13162b.m23684a("BDLocation", "device status:" + C13182f.f32181a.mo46672a((AbstractC28019l) oVar));
            TypedString typedString = new TypedString(oVar.toString());
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("sdk_version", "1.1.0-alpha.17");
            if (C13180b.m23704a(C13180b.m23703a("/ttloc/new_submit/", typedString, linkedHashMap, C13180b.m23705b()), str2, "upload device status success", "upload device status failed")) {
                str = "1";
            } else {
                str = "region_location_new_submit_error";
            }
            C13235g.m23792a(str2, str);
        }
    }

    private void onLocationChanged(C13149a.AbstractC13151a aVar, C13185a aVar2, BDLocation bDLocation) {
        if (aVar != null) {
            aVar.mo21246a(bDLocation);
        }
        if (aVar2 != null) {
            aVar2.onLocateChange(getLocateName(), bDLocation);
        }
    }

    private void startLocateUpload(Context context, BDLocation bDLocation, C13156e eVar) {
        if (C13153b.f32046e && C13153b.f32048g) {
            C13227a.f32333a.f32335c.execute(new RunnableC13158b(this, context, eVar, bDLocation));
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void lambda$startLocateUpload$0$BaseLocate(Context context, C13156e eVar, BDLocation bDLocation) {
        try {
            if (C13153b.m23676d()) {
                uploadDeviceStatusInfo(context, eVar);
            } else if (allowUploadLocationInfo(bDLocation)) {
                uploadLocInfo(context, bDLocation, eVar);
            }
        } catch (Exception e) {
            C13162b.m23685a("BDLocation", getLocateName(), e);
        }
    }

    public static void uploadLocInfo(Context context, BDLocation bDLocation, C13156e eVar) {
        String str;
        String str2;
        if (C13153b.f32047f || C13153b.f32058q) {
            C13171c cVar = null;
            if (eVar != null) {
                str = eVar.f32079a;
            } else {
                str = null;
            }
            if (C13153b.f32047f) {
                cVar = new C13171c();
                if (bDLocation != null) {
                    cVar.f32108a = bdLocationToLocationInfo(new BDLocation(bDLocation), C13153b.f32055n);
                }
            }
            C13172d deviceStatus = getDeviceStatus(context);
            C13162b.m23690d("BDRegionLocation Upload: start", "ServerApi--uploadLocationInfo");
            if (!C13153b.f32065x.f32339b) {
                C28022o oVar = new C28022o();
                if (str != null) {
                    oVar.mo46801a("upload_source", str);
                }
                oVar.mo46797a("location", C13182f.m23707a(cVar));
                oVar.mo46797a("status", C13182f.m23707a(deviceStatus));
                oVar.mo46800a("timestamp", Long.valueOf(System.currentTimeMillis() / 1000));
                C13162b.m23689c("BDLocation", "submit:" + C13182f.f32181a.mo46672a((AbstractC28019l) oVar));
                TypedString typedString = new TypedString(oVar.toString());
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put("sdk_version", "1.1.0-alpha.17");
                if (C13180b.m23704a(C13180b.m23703a("/ttloc/new_submit/", typedString, linkedHashMap, C13180b.m23705b()), str, "upload location info success", "upload location info failed")) {
                    str2 = "1";
                } else {
                    str2 = "region_location_new_submit_error";
                }
                C13235g.m23792a(str, str2);
            }
        }
    }

    public final void geocodeAndCallback(BDLocation bDLocation, C13156e eVar, C13149a.AbstractC13151a aVar) {
        BDLocation bDLocation2;
        this.mController.callback(bDLocation);
        try {
            if (!C13167e.m23700a(bDLocation)) {
                if (C13153b.f32057p >= 0) {
                    bDLocation.f32031x = new BigDecimal(bDLocation.f32031x).setScale(C13153b.f32057p, 4).doubleValue();
                    bDLocation.f32032y = new BigDecimal(bDLocation.f32032y).setScale(C13153b.f32057p, 4).doubleValue();
                    bDLocation.f32028u = C13153b.f32057p;
                }
                C13162b.m23689c("BDLocation", getLocateName() + " onLocationChanged: " + bDLocation.toString());
                long currentTimeMillis = System.currentTimeMillis();
                BDLocation bDLocation3 = null;
                if (needGeocode(bDLocation, eVar) && isNeedAddress(eVar)) {
                    C13155d dVar = new C13155d(bDLocation.getLatitude(), bDLocation.getLongitude(), bDLocation.getProvider());
                    C13190a a = C13190a.m23731a();
                    if (!(eVar.f32084f == 0 || (bDLocation3 = a.f32209d.geocode(dVar, "wgs")) == null)) {
                        bDLocation3 = C13167e.m23697a(bDLocation, bDLocation3);
                    }
                }
                long currentTimeMillis2 = System.currentTimeMillis();
                C13185a aVar2 = eVar.f32083e;
                long j = currentTimeMillis2 - currentTimeMillis;
                if (aVar2.f32195e == 0) {
                    aVar2.f32195e = j;
                }
                if (bDLocation3 == null) {
                    bDLocation2 = bDLocation;
                } else {
                    bDLocation2 = bDLocation3;
                }
                startLocateUpload(this.mContext, new BDLocation(bDLocation2), new C13156e(eVar));
                if (bDLocation3 != null) {
                    onLocationChanged(aVar, eVar.f32083e, C13167e.m23697a(bDLocation, bDLocation3));
                } else {
                    onLocationChanged(aVar, eVar.f32083e, bDLocation);
                }
            } else {
                onError(aVar, new C13154c("SDK callback null!", getLocateName(), "26"));
            }
        } catch (Exception e) {
            C13162b.m23685a(getLocateName(), "", e);
            onError(aVar, new C13154c(e, getLocateName(), "24"));
        }
    }
}
