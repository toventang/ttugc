package com.bytedance.helios.sdk.utils;

import android.util.SparseArray;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.p1094b.C15371a;
import java.util.HashMap;
import p4600h.p4622m.C89361p;

/* renamed from: com.bytedance.helios.sdk.utils.i */
public final class C15488i {

    /* renamed from: a */
    public static HashMap<String, Integer> f37745a = new HashMap<>();

    /* renamed from: b */
    public static SparseArray<C15371a> f37746b;

    /* renamed from: c */
    public static final C15488i f37747c = new C15488i();

    private C15488i() {
    }

    static {
        Covode.recordClassIndex(17742);
        f37746b = new SparseArray<>(0);
        SparseArray<C15371a> sparseArray = new SparseArray<>(85);
        f37746b = sparseArray;
        sparseArray.append(100000, new C15371a(100000, 1, 2, "android/location/LocationManager", "getLastKnownLocation", "", "[]", "", "", ""));
        f37746b.append(100001, new C15371a(100001, 1, 2, "android/location/LocationManager", "requestLocationUpdates", "", "[]", "", "", ""));
        f37746b.append(100002, new C15371a(100002, 1, 2, "android/location/LocationManager", "requestSingleUpdate", "", "[]", "", "", ""));
        f37746b.append(100003, new C15371a(100003, 4, 3, "android/webkit/WebChromeClient", "onGeolocationPermissionsShowPrompt", "", "[]", "", "", ""));
        f37746b.append(100004, new C15371a(100004, 1, 2, "android/location/LocationManager", "getCurrentLocation", "", "[]", "", "", ""));
        f37746b.append(100005, new C15371a(100005, 1, 2, "android/location/LocationManager", "addGpsStatusListener", "", "[]", "", "", ""));
        f37746b.append(100006, new C15371a(100006, 1, 2, "android/location/LocationManager", "addNmeaListener", "", "[]", "", "", ""));
        f37746b.append(100007, new C15371a(100007, 1, 2, "android/location/LocationManager", "addProximityAlert", "", "[]", "", "", ""));
        f37746b.append(100008, new C15371a(100008, 1, 2, "android/location/LocationManager", "registerAntennaInfoListener", "", "[]", "", "", ""));
        f37746b.append(100009, new C15371a(100009, 1, 2, "android/location/LocationManager", "registerGnssMeasurementsCallback", "", "[]", "", "", ""));
        f37746b.append(100010, new C15371a(100010, 1, 2, "android/location/LocationManager", "registerGnssNavigationMessageCallback", "", "[]", "", "", ""));
        f37746b.append(100011, new C15371a(100011, 1, 2, "android/location/LocationManager", "registerGnssStatusCallback", "", "[]", "", "", ""));
        f37746b.append(100012, new C15371a(100012, 1, 2, "android/webkit/GeolocationPermissions$Callback", "invoke", "", "[]", "", "", ""));
        f37746b.append(100013, new C15371a(100013, 1, 2, "android/location/LocationManager", "getProviders", "", "[]", "", "", ""));
        f37746b.append(100100, new C15371a(100100, 2, 2, "android/hardware/Camera", "open", "", "[]", "", "", ""));
        f37746b.append(100101, new C15371a(100101, 2, 2, "android/hardware/Camera", "release", "", "[]", "", "", ""));
        f37746b.append(100106, new C15371a(100106, 1, 2, "android/hardware/Camera", "release", "", "[]", "", "", ""));
        f37746b.append(100200, new C15371a(100200, 4, 3, "android/hardware/camera2/CameraDevice$StateCallback", "onOpened", "", "[]", "", "", ""));
        f37746b.append(100201, new C15371a(100201, 2, 2, "android/hardware/camera2/CameraDevice", "close", "", "[]", "", "", ""));
        f37746b.append(100205, new C15371a(100205, 1, 2, "android/hardware/camera2/CameraDevice", "close", "", "[]", "", "", ""));
        f37746b.append(100400, new C15371a(100400, 2, 2, "android/media/AudioRecord", "startRecording", "", "[]", "", "", ""));
        f37746b.append(100401, new C15371a(100401, 2, 2, "android/media/AudioRecord", "stop", "", "[]", "", "", ""));
        f37746b.append(100403, new C15371a(100403, 2, 2, "android/media/AudioRecord", "release", "", "[]", "", "", ""));
        f37746b.append(100404, new C15371a(100404, 1, 2, "android/media/AudioRecord", "stop", "", "[]", "", "", ""));
        f37746b.append(100405, new C15371a(100405, 1, 2, "android/media/AudioRecord", "release", "", "[]", "", "", ""));
        f37746b.append(100500, new C15371a(100500, 2, 2, "android/media/MediaRecorder", "prepare", "", "[]", "", "", ""));
        f37746b.append(100501, new C15371a(100501, 2, 2, "android/media/MediaRecorder", "release", "", "[]", "", "", ""));
        f37746b.append(100502, new C15371a(100502, 2, 2, "android/media/MediaRecorder", "start", "", "[]", "", "", ""));
        f37746b.append(100503, new C15371a(100503, 2, 2, "android/media/MediaRecorder", "stop", "", "[]", "", "", ""));
        f37746b.append(100900, new C15371a(100900, 2, 2, "android/telephony/TelephonyManager", "getCellLocation", "", "[]", "", "", ""));
        f37746b.append(100901, new C15371a(100901, 2, 2, "android/telephony/cdma/CdmaCellLocation", "getBaseStationId", "", "[]", "", "", ""));
        f37746b.append(100902, new C15371a(100902, 2, 2, "android/telephony/cdma/CdmaCellLocation", "getBaseStationLatitude", "", "[]", "", "", ""));
        f37746b.append(100903, new C15371a(100903, 2, 2, "android/telephony/cdma/CdmaCellLocation", "getBaseStationLongitude", "", "[]", "", "", ""));
        f37746b.append(100904, new C15371a(100904, 2, 2, "android/telephony/cdma/CdmaCellLocation", "getSystemId", "", "[]", "", "", ""));
        f37746b.append(100905, new C15371a(100905, 2, 2, "android/telephony/cdma/CdmaCellLocation", "getNetworkId", "", "[]", "", "", ""));
        f37746b.append(100906, new C15371a(100906, 2, 2, "android/telephony/gsm/GsmCellLocation", "getCid", "", "[]", "", "", ""));
        f37746b.append(100907, new C15371a(100907, 2, 2, "android/telephony/gsm/GsmCellLocation", "getLac", "", "[]", "", "", ""));
        f37746b.append(100908, new C15371a(100908, 2, 2, "android/telephony/gsm/GsmCellLocation", "getPsc", "", "[]", "", "", ""));
        f37746b.append(100909, new C15371a(100909, 2, 2, "android/telephony/TelephonyManager", "getAllCellInfo", "", "[]", "", "", ""));
        f37746b.append(100910, new C15371a(100910, 2, 2, "android/telephony/TelephonyManager", "requestCellInfoUpdate", "", "[]", "", "", ""));
        f37746b.append(100911, new C15371a(100911, 4, 3, "android/telephony/PhoneStateListener", "onCellLocationChanged", "", "[]", "", "", ""));
        f37746b.append(100912, new C15371a(100912, 4, 3, "android/telephony/PhoneStateListener", "onCellInfoChanged", "", "[]", "", "", ""));
        f37746b.append(101000, new C15371a(101000, 2, 2, "android/net/wifi/WifiInfo", "getSSID", "", "[]", "", "", ""));
        f37746b.append(101001, new C15371a(101001, 2, 2, "android/net/wifi/WifiManager", "getConfiguredNetworks", "", "[]", "", "", ""));
        f37746b.append(101100, new C15371a(101100, 2, 2, "android/net/wifi/WifiInfo", "getBSSID", "", "[]", "", "", ""));
        f37746b.append(101200, new C15371a(101200, 2, 2, "android/os/Build", "getSerial", "", "[]", "", "", ""));
        f37746b.append(101300, new C15371a(101300, 2, 2, "android/app/ActivityManager", "getRecentTasks", "", "[]", "", "", ""));
        f37746b.append(101301, new C15371a(101301, 2, 2, "android/app/ActivityManager", "getRunningTasks", "", "[]", "", "", ""));
        f37746b.append(101304, new C15371a(101304, 2, 2, "android/content/pm/PackageManager", "getInstalledApplications", "", "[]", "", "", ""));
        f37746b.append(101305, new C15371a(101305, 2, 2, "android/content/pm/PackageManager", "getInstalledApplicationsAsUser", "", "[]", "", "", ""));
        f37746b.append(101306, new C15371a(101306, 2, 2, "android/view/accessibility/AccessibilityManager", "getInstalledAccessibilityServiceList", "", "[]", "", "", ""));
        f37746b.append(101308, new C15371a(101308, 2, 2, "android/content/pm/PackageManager", "getInstalledPackagesAsUser", "", "[]", "", "", ""));
        f37746b.append(101309, new C15371a(101309, 2, 2, "android/content/pm/PackageManager", "getInstalledPackages", "", "[]", "", "", ""));
        f37746b.append(101310, new C15371a(101310, 2, 2, "android/content/pm/PackageManager", "getPackagesForUid", "", "[]", "", "", ""));
        f37746b.append(101400, new C15371a(101400, 2, 2, "android/telephony/TelephonyManager", "getSimSerialNumber", "", "[]", "", "", ""));
        f37746b.append(101500, new C15371a(101500, 2, 2, "android/telephony/SubscriptionInfo", "getIccId", "", "[]", "", "", ""));
        f37746b.append(101600, new C15371a(101600, 2, 2, "android/telephony/TelephonyManager", "getDeviceId", "", "[]", "", "", ""));
        f37746b.append(101601, new C15371a(101601, 2, 2, "android/telephony/TelephonyManager", "getImei", "", "[]", "", "", ""));
        f37746b.append(101602, new C15371a(101602, 2, 2, "android/telephony/TelephonyManager", "getMeid", "", "[]", "", "", ""));
        f37746b.append(101700, new C15371a(101700, 2, 2, "android/net/wifi/WifiInfo", "getMacAddress", "", "[]", "", "", ""));
        f37746b.append(101701, new C15371a(101701, 2, 2, "java/net/NetworkInterface", "getHardwareAddress", "", "[]", "", "", ""));
        f37746b.append(101800, new C15371a(101800, 2, 2, "android/content/ClipboardManager", "clearPrimaryClip", "", "[]", "", "", ""));
        f37746b.append(101801, new C15371a(101801, 2, 2, "android/content/ClipboardManager", "addPrimaryClipChangedListener", "", "[]", "", "", ""));
        f37746b.append(101802, new C15371a(101802, 2, 2, "android/content/ClipboardManager", "removePrimaryClipChangedListener", "", "[]", "", "", ""));
        f37746b.append(101803, new C15371a(101803, 2, 2, "android/content/ClipboardManager", "getPrimaryClip", "", "[]", "", "", ""));
        f37746b.append(101804, new C15371a(101804, 2, 2, "android/content/ClipboardManager", "getText", "", "[]", "", "", ""));
        f37746b.append(101805, new C15371a(101805, 2, 2, "android/content/ClipboardManager", "hasPrimaryClip", "", "[]", "", "", ""));
        f37746b.append(101806, new C15371a(101806, 2, 2, "android/content/ClipboardManager", "hasText", "", "[]", "", "", ""));
        f37746b.append(101807, new C15371a(101807, 2, 2, "android/content/ClipboardManager", "setPrimaryClip", "", "[]", "", "", ""));
        f37746b.append(101808, new C15371a(101808, 2, 2, "android/content/ClipboardManager", "setText", "", "[]", "", "", ""));
        f37746b.append(101809, new C15371a(101809, 2, 2, "android/content/ClipboardManager", "getPrimaryClipDescription", "", "[]", "", "", ""));
        f37746b.append(101900, new C15371a(101900, 2, 2, "android/telephony/TelephonyManager", "getSubscriberId", "", "[]", "", "", ""));
        f37746b.append(102000, new C15371a(102000, 2, 2, "android/telephony/TelephonyManager", "getLine1Number", "", "[]", "", "", ""));
        f37746b.append(102001, new C15371a(102001, 2, 2, "android/telephony/TelephonyManager", "getVoiceMailNumber", "", "[]", "", "", ""));
        f37746b.append(102100, new C15371a(102100, 2, 2, "android/media/projection/MediaProjectionManager", "createScreenCaptureIntent", "", "[]", "", "", ""));
        f37746b.append(102101, new C15371a(102101, 2, 2, "android/media/projection/MediaProjectionManager", "getMediaProjection", "", "[]", "", "", ""));
        f37746b.append(102102, new C15371a(102102, 2, 2, "android/media/projection/MediaProjection", "stop", "", "[]", "", "", ""));
        f37746b.append(102300, new C15371a(102300, 2, 2, "android/net/wifi/WifiManager", "getScanResults", "", "[]", "", "", ""));
        f37746b.append(102500, new C15371a(102500, 2, 2, "android/accounts/AccountManager", "getAccounts", "", "[]", "", "", ""));
        f37746b.append(102501, new C15371a(102501, 2, 2, "android/accounts/AccountManager", "getAccountsByType", "", "[]", "", "", ""));
        f37746b.append(102502, new C15371a(102502, 2, 2, "android/accounts/AccountManager", "getAccountsByTypeAndFeatures", "", "[]", "", "", ""));
        f37746b.append(102600, new C15371a(102600, 1, 2, "android/app/Activity", "requestPermissions", "", "[]", "", "", ""));
        f37746b.append(102800, new C15371a(102800, 2, 2, "android/view/WindowManager", "addView", "", "[]", "", "", ""));
        f37746b.append(102801, new C15371a(102801, 2, 2, "android/view/WindowManager", "removeView", "", "[]", "", "", ""));
        f37746b.append(110000, new C15371a(110000, 2, 2, "java/lang/reflect/Method", "invoke", "", "[]", "", "", ""));
        m28506a();
    }

    /* renamed from: a */
    private static void m28506a() {
        f37745a = new HashMap<>(f37746b.size());
        int size = f37746b.size();
        for (int i = 0; i < size; i++) {
            C15371a valueAt = f37746b.valueAt(i);
            f37745a.put(C89361p.m154868a(valueAt.f37488d, "/", ".") + '.' + valueAt.f37489e, Integer.valueOf(valueAt.f37485a));
        }
    }
}
