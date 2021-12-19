package com.bytedance.router.util;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.router.RoutesConfig;
import com.p2082ss.android.ugc.aweme.lancet.p3386c.C58014b;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public final class Util {
    static {
        Covode.recordClassIndex(25911);
    }

    public static boolean isLegalUrl(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return Uri.parse(str).isHierarchical();
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0020 */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x002b A[Catch:{ NameNotFoundException -> 0x002e }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int getAppVersionCode(android.content.Context r4) {
        /*
            android.content.pm.PackageManager r3 = r4.getPackageManager()
            r2 = -1
            java.lang.String r1 = r4.getPackageName()     // Catch:{ NameNotFoundException -> 0x0020 }
            r0 = 128(0x80, float:1.794E-43)
            android.content.pm.ApplicationInfo r1 = m41586x94e9ea9b(r3, r1, r0)     // Catch:{ NameNotFoundException -> 0x0020 }
            if (r1 == 0) goto L_0x0020
            android.os.Bundle r0 = r1.metaData     // Catch:{ NameNotFoundException -> 0x0020 }
            if (r0 == 0) goto L_0x0020
            android.os.Bundle r1 = r1.metaData     // Catch:{ NameNotFoundException -> 0x0020 }
            java.lang.String r0 = "UPDATE_VERSION_CODE"
            int r2 = r1.getInt(r0, r2)     // Catch:{ NameNotFoundException -> 0x0020 }
            if (r2 <= 0) goto L_0x0020
            return r2
        L_0x0020:
            java.lang.String r1 = r4.getPackageName()     // Catch:{ NameNotFoundException -> 0x002e }
            r0 = 0
            android.content.pm.PackageInfo r0 = r3.getPackageInfo(r1, r0)     // Catch:{ NameNotFoundException -> 0x002e }
            if (r0 == 0) goto L_0x002e
            int r0 = r0.versionCode     // Catch:{ NameNotFoundException -> 0x002e }
            return r0
        L_0x002e:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.router.util.Util.getAppVersionCode(android.content.Context):int");
    }

    public static String getRealRouteUrl(String str) {
        Uri parse = Uri.parse(str);
        if (!parse.isHierarchical()) {
            return null;
        }
        if (!TextUtils.isEmpty(parse.getScheme())) {
            return "//" + parse.getAuthority() + parse.getPath();
        }
        return str;
    }

    public static String getRouteUrl(String str) {
        Uri parse = Uri.parse(str);
        if (!parse.isHierarchical()) {
            return null;
        }
        if (!TextUtils.isEmpty(parse.getScheme())) {
            return parse.getScheme() + "://" + parse.getAuthority() + parse.getPath();
        }
        return "//" + parse.getAuthority() + parse.getPath();
    }

    public static Map<String, String> sliceUrlParams(String str) {
        if (TextUtils.isEmpty(str)) {
            Logger.m41578e("Slice url params but the url is null!!!");
            return Collections.EMPTY_MAP;
        }
        Uri parse = Uri.parse(str);
        if (!parse.isHierarchical()) {
            return Collections.EMPTY_MAP;
        }
        HashMap hashMap = new HashMap();
        for (String str2 : parse.getQueryParameterNames()) {
            if (!TextUtils.isEmpty(str2)) {
                String queryParameter = parse.getQueryParameter(str2);
                if (queryParameter == null) {
                    queryParameter = "";
                }
                hashMap.put(str2, queryParameter);
            }
        }
        return hashMap;
    }

    public static String completeUrl(String str, String str2) {
        if (!TextUtils.isEmpty(Uri.parse(str2).getScheme())) {
            return str2;
        }
        if (str2.startsWith("//")) {
            return str + ':' + str2;
        }
        return str + "://" + str2;
    }

    public static boolean isLegalUrl(String str, RoutesConfig routesConfig) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        Uri parse = Uri.parse(str);
        if (!parse.isHierarchical()) {
            return false;
        }
        String scheme = parse.getScheme();
        if (TextUtils.isEmpty(scheme) || scheme.equals(routesConfig.getScheme())) {
            return true;
        }
        String[] otherSchemes = routesConfig.getOtherSchemes();
        if (otherSchemes != null && otherSchemes.length > 0) {
            for (String str2 : otherSchemes) {
                if (scheme.equals(str2)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: com_bytedance_router_util_Util_com_ss_android_ugc_aweme_lancet_process_AwemeMetaDataLancet_getApplicationInfo */
    public static ApplicationInfo m41586x94e9ea9b(PackageManager packageManager, String str, int i) {
        if (!TextUtils.equals(str, C17867d.m33078a().getPackageName()) || i != 128) {
            return packageManager.getApplicationInfo(str, i);
        }
        if (C58014b.f132218a == null) {
            C58014b.f132218a = packageManager.getApplicationInfo(str, i);
        }
        return C58014b.f132218a;
    }
}
