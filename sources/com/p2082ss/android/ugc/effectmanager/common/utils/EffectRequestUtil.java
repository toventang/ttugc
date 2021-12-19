package com.p2082ss.android.ugc.effectmanager.common.utils;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.effectmanager.EffectConfiguration;
import com.p2082ss.android.ugc.effectmanager.common.utils.DeviceUtil;
import java.util.HashMap;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.effectmanager.common.utils.EffectRequestUtil */
public final class EffectRequestUtil {
    public static final EffectRequestUtil INSTANCE = new EffectRequestUtil();

    private EffectRequestUtil() {
    }

    static {
        Covode.recordClassIndex(95512);
    }

    public static final boolean isOnlineEnv(EffectConfiguration effectConfiguration) {
        C89219l.m154719c(effectConfiguration, "");
        String channel = effectConfiguration.getChannel();
        if (channel == null) {
            return false;
        }
        return C89361p.m154908a((CharSequence) channel, (CharSequence) "online", false);
    }

    private final String buildDeviceInfo(Context context) {
        HashMap hashMap = new HashMap();
        hashMap.put("platform", 1);
        try {
            hashMap.put("gl_version", Float.valueOf(Float.parseFloat(GPUUtils.INSTANCE.getVersion())));
        } catch (Exception unused) {
        }
        hashMap.put("gl_vendor", GPUUtils.INSTANCE.getVendor());
        hashMap.put("gl_renderer", GPUUtils.INSTANCE.getRenderer());
        hashMap.put("gl_extension", GPUUtils.INSTANCE.getGlExtension());
        if (context != null) {
            DeviceUtil.MemoryInfo memoryInfo = DeviceUtil.getMemoryInfo(context);
            C89219l.m154709a((Object) memoryInfo, "");
            long totalSize = memoryInfo.getTotalSize();
            if (totalSize > 0) {
                hashMap.put("memory_total_size", Long.valueOf(totalSize));
            }
        }
        String cpuModel = DeviceUtil.getCpuModel();
        C89219l.m154709a((Object) cpuModel, "");
        hashMap.put("cpu_vendor", cpuModel);
        String str = Build.VERSION.RELEASE;
        C89219l.m154709a((Object) str, "");
        hashMap.put("os_version", str);
        String jSONObject = new JSONObject(hashMap).toString();
        C89219l.m154709a((Object) jSONObject, "");
        return jSONObject;
    }

    public final HashMap<String, String> addCommonParams(EffectConfiguration effectConfiguration) {
        C89219l.m154719c(effectConfiguration, "");
        HashMap<String, String> hashMap = new HashMap<>();
        if (!TextUtils.isEmpty(effectConfiguration.getAccessKey())) {
            String accessKey = effectConfiguration.getAccessKey();
            C89219l.m154709a((Object) accessKey, "");
            hashMap.put("access_key", accessKey);
        }
        if (!TextUtils.isEmpty(effectConfiguration.getDeviceId())) {
            String deviceId = effectConfiguration.getDeviceId();
            C89219l.m154709a((Object) deviceId, "");
            hashMap.put("device_id", deviceId);
        }
        if (!TextUtils.isEmpty(effectConfiguration.getDeviceType())) {
            String deviceType = effectConfiguration.getDeviceType();
            C89219l.m154709a((Object) deviceType, "");
            hashMap.put("device_type", deviceType);
        }
        if (!TextUtils.isEmpty(effectConfiguration.getPlatform())) {
            String platform = effectConfiguration.getPlatform();
            C89219l.m154709a((Object) platform, "");
            hashMap.put("device_platform", platform);
        }
        if (!TextUtils.isEmpty(effectConfiguration.getRegion())) {
            String region = effectConfiguration.getRegion();
            C89219l.m154709a((Object) region, "");
            hashMap.put("region", region);
        }
        if (!TextUtils.isEmpty(effectConfiguration.getSdkVersion())) {
            String sdkVersion = effectConfiguration.getSdkVersion();
            C89219l.m154709a((Object) sdkVersion, "");
            hashMap.put("sdk_version", sdkVersion);
        }
        if (!TextUtils.isEmpty(effectConfiguration.getAppVersion())) {
            String appVersion = effectConfiguration.getAppVersion();
            C89219l.m154709a((Object) appVersion, "");
            hashMap.put("app_version", appVersion);
        }
        if (!TextUtils.isEmpty(effectConfiguration.getChannel())) {
            String channel = effectConfiguration.getChannel();
            C89219l.m154709a((Object) channel, "");
            hashMap.put("channel", channel);
        }
        if (!TextUtils.isEmpty(effectConfiguration.getAppID())) {
            String appID = effectConfiguration.getAppID();
            C89219l.m154709a((Object) appID, "");
            hashMap.put("aid", appID);
        }
        if (!TextUtils.isEmpty(effectConfiguration.getAppLanguage())) {
            String appLanguage = effectConfiguration.getAppLanguage();
            C89219l.m154709a((Object) appLanguage, "");
            hashMap.put("app_language", appLanguage);
        }
        if (!CollectionUtil.isMapEmpty(effectConfiguration.getIopInfo())) {
            hashMap.putAll(effectConfiguration.getIopInfo());
        }
        if (!TextUtils.isEmpty(effectConfiguration.getGpuVersion())) {
            String gpuVersion = effectConfiguration.getGpuVersion();
            C89219l.m154709a((Object) gpuVersion, "");
            hashMap.put("gpu", gpuVersion);
        }
        if (effectConfiguration.getFilterType() > 0) {
            hashMap.put("filter_type", String.valueOf(effectConfiguration.getFilterType()));
        }
        hashMap.put("platform_ab_params", String.valueOf(effectConfiguration.getRequestStrategy()));
        hashMap.put("platform_sdk_version", EPUtils.getPlatformSDKVersion());
        hashMap.put("device_info", buildDeviceInfo(effectConfiguration.getContext()));
        return hashMap;
    }
}
