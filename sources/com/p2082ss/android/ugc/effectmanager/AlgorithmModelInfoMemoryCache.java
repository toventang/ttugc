package com.p2082ss.android.ugc.effectmanager;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.effectmanager.common.cache.IModelCache;
import com.p2082ss.android.ugc.effectmanager.common.logger.EPLog;
import com.p2082ss.android.ugc.effectmanager.model.LocalModelInfo;
import com.p2082ss.android.ugc.effectmanager.model.ModelInfo;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.effectmanager.AlgorithmModelInfoMemoryCache */
public final class AlgorithmModelInfoMemoryCache {
    public static final AlgorithmModelInfoMemoryCache INSTANCE = new AlgorithmModelInfoMemoryCache();
    private static final ConcurrentHashMap<String, ModelInfoCache> cache = new ConcurrentHashMap<>();
    private static final AtomicBoolean hasBuiltCache = new AtomicBoolean(false);

    private AlgorithmModelInfoMemoryCache() {
    }

    public static final boolean hasBuiltCache() {
        return hasBuiltCache.get();
    }

    static {
        Covode.recordClassIndex(95342);
    }

    public static final synchronized void clear() {
        synchronized (AlgorithmModelInfoMemoryCache.class) {
            MethodCollector.m26663i(1607);
            cache.clear();
            hasBuiltCache.set(false);
            MethodCollector.m26664o(1607);
        }
    }

    public static final synchronized void writeModelInfo(ModelInfo modelInfo) {
        synchronized (AlgorithmModelInfoMemoryCache.class) {
            MethodCollector.m26663i(1348);
            C89219l.m154719c(modelInfo, "");
            String name = modelInfo.getName();
            LocalModelInfo localModelInfo = new LocalModelInfo();
            localModelInfo.setName(name);
            localModelInfo.setMd5(modelInfo.getMD5());
            localModelInfo.setSize(modelInfo.getType());
            localModelInfo.setVersion(modelInfo.getVersion());
            localModelInfo.setBuilt(false);
            ModelInfoCache modelInfoCache = new ModelInfoCache(localModelInfo, modelInfo);
            EPLog.m141898d("AlgorithmModelInfoMemoryCache", "model: " + name + " write in cache!");
            cache.put(name, modelInfoCache);
            MethodCollector.m26664o(1348);
        }
    }

    public static final synchronized boolean isModelReady(String str) {
        synchronized (AlgorithmModelInfoMemoryCache.class) {
            MethodCollector.m26663i(1404);
            if (str == null) {
                MethodCollector.m26664o(1404);
                return false;
            }
            ModelInfoCache modelInfoCache = cache.get(str);
            if (modelInfoCache == null) {
                EPLog.m141899e("AlgorithmModelInfoMemoryCache", "model: " + str + " not in cache!");
                MethodCollector.m26664o(1404);
                return false;
            }
            LocalModelInfo localModelInfo = modelInfoCache.getLocalModelInfo();
            ModelInfo serverModelInfo = modelInfoCache.getServerModelInfo();
            if (!C89219l.m154714a((Object) localModelInfo.getVersion(), (Object) serverModelInfo.getVersion())) {
                EPLog.m141899e("AlgorithmModelInfoMemoryCache", "model: " + str + " version not match. local version: " + localModelInfo.getVersion() + ", server version: " + serverModelInfo.getVersion());
                MethodCollector.m26664o(1404);
                return false;
            } else if (localModelInfo.isBuilt()) {
                MethodCollector.m26664o(1404);
                return true;
            } else if (localModelInfo.getSize() != serverModelInfo.getType()) {
                EPLog.m141899e("AlgorithmModelInfoMemoryCache", "model: " + str + " size not match. local size: " + localModelInfo.getSize() + ", server size: " + serverModelInfo.getType());
                MethodCollector.m26664o(1404);
                return false;
            } else if (!C89219l.m154714a((Object) localModelInfo.getMD5(), (Object) serverModelInfo.getMD5())) {
                EPLog.m141899e("AlgorithmModelInfoMemoryCache", "model: " + str + " md5 not match. local md5: " + localModelInfo.getMD5() + ", server md5: " + serverModelInfo.getMD5());
                MethodCollector.m26664o(1404);
                return false;
            } else {
                MethodCollector.m26664o(1404);
                return true;
            }
        }
    }

    public final void buildCache(LoadedModelList loadedModelList, IModelCache iModelCache) {
        C89219l.m154719c(loadedModelList, "");
        C89219l.m154719c(iModelCache, "");
        Map<String, ModelInfo> modelInfoList = loadedModelList.getModelInfoList();
        if (modelInfoList.isEmpty()) {
            hasBuiltCache.set(false);
            return;
        }
        Map<String, LocalModelInfo> localModelInfoList = iModelCache.getLocalModelInfoList();
        if (localModelInfoList.isEmpty()) {
            hasBuiltCache.set(false);
            return;
        }
        C89219l.m154709a((Object) modelInfoList, "");
        for (Map.Entry<String, ModelInfo> entry : modelInfoList.entrySet()) {
            String key = entry.getKey();
            LocalModelInfo localModelInfo = localModelInfoList.get(key);
            if (localModelInfo != null) {
                ModelInfo value = entry.getValue();
                C89219l.m154709a((Object) value, "");
                ModelInfoCache modelInfoCache = new ModelInfoCache(localModelInfo, value);
                ConcurrentHashMap<String, ModelInfoCache> concurrentHashMap = cache;
                C89219l.m154709a((Object) key, "");
                concurrentHashMap.put(key, modelInfoCache);
            }
        }
        hasBuiltCache.set(true);
    }
}
