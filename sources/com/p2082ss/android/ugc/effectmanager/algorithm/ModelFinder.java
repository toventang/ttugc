package com.p2082ss.android.ugc.effectmanager.algorithm;

import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.effectmanager.DownloadableModelConfig;
import com.p2082ss.android.ugc.effectmanager.LoadedModelList;
import com.p2082ss.android.ugc.effectmanager.ModelEventListener;
import com.p2082ss.android.ugc.effectmanager.common.ModelNameProcessor;
import com.p2082ss.android.ugc.effectmanager.common.cache.IModelCache;
import com.p2082ss.android.ugc.effectmanager.common.listener.IMonitorService;
import com.p2082ss.android.ugc.effectmanager.common.logger.EPLog;
import com.p2082ss.android.ugc.effectmanager.common.monitor.EPMonitor;
import com.p2082ss.android.ugc.effectmanager.common.monitor.MonitorTrace;
import com.p2082ss.android.ugc.effectmanager.common.utils.EventJsonBuilder;
import com.p2082ss.android.ugc.effectmanager.common.utils.MD5Utils;
import com.p2082ss.android.ugc.effectmanager.model.ExtendedUrlModel;
import com.p2082ss.android.ugc.effectmanager.model.LocalModelInfo;
import com.p2082ss.android.ugc.effectmanager.model.ModelInfo;
import java.io.File;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.effectmanager.algorithm.ModelFinder */
public final class ModelFinder {
    private final String TAG = "ModelFinder";
    private final AssetManagerWrapper assetManagerWrapper;
    private final DownloadableModelConfig config;
    private final IModelCache modelCache;
    private final ModelConfigArbiter modelConfigArbiter;

    static {
        Covode.recordClassIndex(95408);
    }

    public final boolean isResourceAvailable(String str) {
        if (str == null) {
            C89219l.m154707a();
        }
        if (queryResourceUri(str, null) != null) {
            return true;
        }
        return false;
    }

    private final boolean isExactBuiltInResource(String str) {
        AssetManagerWrapper assetManagerWrapper2 = this.assetManagerWrapper;
        if (assetManagerWrapper2 != null) {
            return assetManagerWrapper2.exists("model/".concat(String.valueOf(str)));
        }
        return false;
    }

    private final void monitorStatusRateSuccess(String str) {
        IMonitorService monitorService = this.config.getMonitorService();
        if (monitorService != null) {
            monitorService.monitorStatusRate("find_resource_uri_success_rate", 0, EventJsonBuilder.newBuilder().addValuePair("app_id", this.config.getAppId()).addValuePair("access_key", this.config.getAccessKey()).addValuePair("model_name", str).addValuePair("effect_platform_type", (Integer) 0).build());
        }
    }

    public final void onModelNotFound(String str) {
        C89219l.m154719c(str, "");
        RuntimeException runtimeException = new RuntimeException("model not found neither in asset nor disk ".concat(String.valueOf(str)));
        try {
            ModelEventListener eventListener = this.config.getEventListener();
            if (eventListener != null) {
                eventListener.onModelNotFound(null, runtimeException);
            }
        } catch (Throwable unused) {
        }
    }

    public final void monitorStatusRateFail(MonitorTrace monitorTrace, String str) {
        List<String> list;
        long j;
        C89219l.m154719c(str, "");
        IMonitorService monitorService = this.config.getMonitorService();
        if (monitorService != null) {
            EventJsonBuilder addValuePair = EventJsonBuilder.newBuilder().addValuePair("app_id", this.config.getAppId()).addValuePair("access_key", this.config.getAccessKey()).addValuePair("model_name", str);
            if (monitorTrace != null) {
                list = monitorTrace.getStepList();
            } else {
                list = null;
            }
            EventJsonBuilder addValuePair2 = addValuePair.addValuePair("monitor_trace", list);
            if (monitorTrace != null) {
                j = monitorTrace.getDuration();
            } else {
                j = 0;
            }
            monitorService.monitorStatusRate("find_resource_uri_success_rate", 1, addValuePair2.addValuePair("duration", Long.valueOf(j)).addValuePair("effect_platform_type", (Integer) 0).build());
        }
    }

    public final String queryResourceUri(String str, MonitorTrace monitorTrace) {
        boolean z;
        String str2;
        C89219l.m154719c(str, "");
        String nameOfModel = ModelNameProcessor.getNameOfModel(str);
        EPMonitor.traceStep(monitorTrace, "ResourceFinder#findResourceUri::modelName = ".concat(String.valueOf(nameOfModel)));
        IModelCache iModelCache = this.modelCache;
        C89219l.m154709a((Object) nameOfModel, "");
        LocalModelInfo localModelInfoByName = iModelCache.getLocalModelInfoByName(nameOfModel, monitorTrace);
        if (localModelInfoByName != null) {
            z = true;
        } else {
            z = false;
        }
        EPMonitor.traceStep(monitorTrace, "ResourceFinder#findResourceUri::isResourceDownloaded = ".concat(String.valueOf(z)));
        if (z) {
            if (localModelInfoByName == null) {
                C89219l.m154707a();
            }
            str2 = localModelInfoByName.getUri().toString();
        } else if (isExactBuiltInResource(str)) {
            str2 = "asset://model/".concat(String.valueOf(str));
        } else {
            str2 = null;
        }
        EPMonitor.traceStep(monitorTrace, "ResourceFinder#findResourceUri::Result Uri = ".concat(String.valueOf(str2)));
        return str2;
    }

    public final String findResourceUri(int i, String str, String str2) {
        C89219l.m154719c(str2, "");
        MonitorTrace monitorTrace = new MonitorTrace(str2);
        EPMonitor.traceBegin(monitorTrace);
        EPLog.m141898d(this.TAG, "findResourceUri::nameStr = ".concat(String.valueOf(str2)));
        String queryResourceUri = queryResourceUri(str2, monitorTrace);
        EPMonitor.traceStep(monitorTrace, "findResourceUri = ".concat(String.valueOf(queryResourceUri)));
        try {
            String nameOfModel = ModelNameProcessor.getNameOfModel(str2);
            EPMonitor.traceStep(monitorTrace, "findResourceUri::nameOfModel = ".concat(String.valueOf(nameOfModel)));
            C89219l.m154709a((Object) nameOfModel, "");
            if (checkModelMd5(nameOfModel, str2, i, monitorTrace)) {
                return "asset://md5_error";
            }
        } catch (Exception e) {
            EPMonitor.traceStep(monitorTrace, "findResourceUri::Exception occurred, cause=" + e.getMessage());
            EPLog.m141900e(this.TAG, "findResourceUri::nameStr = ".concat(String.valueOf(str2)), e);
        }
        if (queryResourceUri == null) {
            EPMonitor.traceStep(monitorTrace, "findResourceUri::uri not found");
            EPMonitor.traceEnd(monitorTrace);
            EPLog.m141899e(this.TAG, "findResourceUri::nameStr = " + str2 + " returned not_found");
            return "asset://not_found";
        }
        EPMonitor.traceEnd(monitorTrace);
        monitorStatusRateSuccess(str2);
        EPLog.m141898d(this.TAG, "findResourceUri::nameStr = " + str2 + " returned result: " + queryResourceUri);
        return queryResourceUri;
    }

    public ModelFinder(DownloadableModelConfig downloadableModelConfig, ModelConfigArbiter modelConfigArbiter2, IModelCache iModelCache, AssetManagerWrapper assetManagerWrapper2) {
        C89219l.m154719c(downloadableModelConfig, "");
        C89219l.m154719c(iModelCache, "");
        this.config = downloadableModelConfig;
        this.modelConfigArbiter = modelConfigArbiter2;
        this.modelCache = iModelCache;
        this.assetManagerWrapper = assetManagerWrapper2;
    }

    private final boolean checkModelMd5(String str, String str2, int i, MonitorTrace monitorTrace) {
        LoadedModelList requireDecidedConfigNonBlockling;
        ExtendedUrlModel extendedUrlModel;
        ModelInfo singleModelInfoNonBlocking;
        LocalModelInfo localModelInfoByName = this.modelCache.getLocalModelInfoByName(str, monitorTrace);
        if (localModelInfoByName == null || isExactBuiltInResource(str2)) {
            return false;
        }
        EPMonitor.traceStep(monitorTrace, "findResourceUri::localModel exist and is not buildIn model");
        ModelConfigArbiter modelConfigArbiter2 = this.modelConfigArbiter;
        if (!(modelConfigArbiter2 == null || (requireDecidedConfigNonBlockling = modelConfigArbiter2.requireDecidedConfigNonBlockling(i)) == null)) {
            try {
                extendedUrlModel = requireDecidedConfigNonBlockling.getDownloadUrl(str);
            } catch (IllegalArgumentException e) {
                EPLog.m141900e(this.TAG, "model info not found in model list!", e);
                ModelConfigArbiter modelConfigArbiter3 = this.modelConfigArbiter;
                if (!(modelConfigArbiter3 == null || (singleModelInfoNonBlocking = modelConfigArbiter3.getSingleModelInfoNonBlocking(i, str)) == null)) {
                    extendedUrlModel = singleModelInfoNonBlocking.getFileUrl();
                }
            }
            if (extendedUrlModel != null) {
                Uri uri = localModelInfoByName.getUri();
                C89219l.m154709a((Object) uri, "");
                String path = uri.getPath();
                if (path == null) {
                    C89219l.m154707a();
                }
                String fileMD5 = MD5Utils.getFileMD5(new File(path), monitorTrace);
                String uri2 = extendedUrlModel.getUri();
                if (TextUtils.equals(fileMD5, uri2)) {
                    return false;
                }
                String str3 = str2 + " md5 = " + fileMD5 + " expectedMd5 = " + uri2;
                EPMonitor.traceStep(monitorTrace, "findResourceUri::errorMessage = ".concat(String.valueOf(str3)));
                EPMonitor.traceEnd(monitorTrace);
                EPLog.m141899e(this.TAG, "findResourceUri() return asset://md5_error\n".concat(String.valueOf(str3)));
                onModelNotFound(str3);
                monitorStatusRateFail(monitorTrace, str2);
                return true;
            }
        }
        EPLog.m141899e(this.TAG, "expected model info not found in model list!");
        return false;
    }
}
