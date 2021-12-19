package com.bytedance.router.net;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.router.dynamic.RouterConfig;
import com.bytedance.router.dynamic.ServerParam;
import com.p2082ss.android.ugc.aweme.lancet.p3386c.C58014b;
import java.util.HashMap;
import java.util.Map;

public class SmartRouterApi {
    private static Map<String, String> sCommonParams;

    public static class ApiResult<T> {
        public int errorCode = -1;
        public T result;

        static {
            Covode.recordClassIndex(25896);
        }
    }

    static {
        Covode.recordClassIndex(25895);
    }

    public static boolean reportRouterConfig(Context context, ServerParam serverParam, RouterConfig routerConfig) {
        return false;
    }

    private static Map<String, String> getCommonParams(Context context) {
        Map<String, String> map = sCommonParams;
        if (map != null) {
            return map;
        }
        sCommonParams = new HashMap();
        try {
            sCommonParams.put("version_code", String.valueOf(context.getPackageManager().getPackageInfo(context.getPackageName(), 128).versionCode));
            Bundle bundle = m41564x8c3e9be8(context.getPackageManager(), context.getPackageName(), 128).metaData;
            if (bundle != null) {
                sCommonParams.put("update_version_code", String.valueOf(bundle.getInt("UPDATE_VERSION_CODE")));
            }
            sCommonParams.put("device_platform", "android");
            sCommonParams.put("os_api", String.valueOf(Build.VERSION.SDK_INT));
        } catch (Exception e) {
            sCommonParams = null;
            e.printStackTrace();
        }
        return sCommonParams;
    }

    private static String getRouterConfigTag(Context context) {
        Map<String, String> commonParams = getCommonParams(context);
        String str = "";
        if (commonParams == null) {
            return str;
        }
        String str2 = sCommonParams.get("version_code");
        String str3 = sCommonParams.get("update_version_code");
        if (!TextUtils.isEmpty(str2)) {
            str = str + str2;
        }
        if (!TextUtils.isEmpty(str3)) {
            return str + "_" + str2;
        }
        return str;
    }

    public static ApiResult<RouterConfig> requestConfig(Context context, ServerParam serverParam) {
        return new ApiResult<>();
    }

    /* renamed from: com_bytedance_router_net_SmartRouterApi_com_ss_android_ugc_aweme_lancet_process_AwemeMetaDataLancet_getApplicationInfo */
    public static ApplicationInfo m41564x8c3e9be8(PackageManager packageManager, String str, int i) {
        if (!TextUtils.equals(str, C17867d.m33078a().getPackageName()) || i != 128) {
            return packageManager.getApplicationInfo(str, i);
        }
        if (C58014b.f132218a == null) {
            C58014b.f132218a = packageManager.getApplicationInfo(str, i);
        }
        return C58014b.f132218a;
    }
}
