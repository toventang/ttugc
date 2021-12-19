package com.p2082ss.android.ugc.effectmanager.algorithm;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.effectmanager.AlgorithmModelInfoMemoryCache;
import com.p2082ss.android.ugc.effectmanager.DownloadableModelConfig;
import com.p2082ss.android.ugc.effectmanager.EffectConfiguration;
import com.p2082ss.android.ugc.effectmanager.LoadedModelList;
import com.p2082ss.android.ugc.effectmanager.ModelEventListener;
import com.p2082ss.android.ugc.effectmanager.common.EffectRequest;
import com.p2082ss.android.ugc.effectmanager.common.Multimap;
import com.p2082ss.android.ugc.effectmanager.common.Supplier;
import com.p2082ss.android.ugc.effectmanager.common.cache.IModelCache;
import com.p2082ss.android.ugc.effectmanager.common.logger.EPLog;
import com.p2082ss.android.ugc.effectmanager.common.task.NormalTask;
import com.p2082ss.android.ugc.effectmanager.common.utils.AssetUtils;
import com.p2082ss.android.ugc.effectmanager.common.utils.EffectRequestUtil;
import com.p2082ss.android.ugc.effectmanager.common.utils.NetworkUtils;
import com.p2082ss.android.ugc.effectmanager.effect.task.task.FetchModelInfoByNameTask;
import com.p2082ss.android.ugc.effectmanager.model.DownloadableModelResponse;
import com.p2082ss.android.ugc.effectmanager.model.ModelInfo;
import com.p2082ss.ugc.effectplatform.model.algorithm.SingleAlgorithmModelResponse;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;
import p077b.C1731i;

/* renamed from: com.ss.android.ugc.effectmanager.algorithm.ModelConfigArbiter */
public class ModelConfigArbiter {
    public final DownloadableModelConfig mConfig;
    public IModelCache mIModelCache;
    private Map<String, ServerConfig> mModelListMap = new ConcurrentHashMap();
    private Map<String, ModelInfo> mSingleModelMap = new ConcurrentHashMap();
    private Supplier<C1731i<ServerConfig>> mTaskSupplier = new Supplier<C1731i<ServerConfig>>() {
        /* class com.p2082ss.android.ugc.effectmanager.algorithm.ModelConfigArbiter.C819251 */

        static {
            Covode.recordClassIndex(95392);
        }

        @Override // com.p2082ss.android.ugc.effectmanager.common.Supplier
        public C1731i<ServerConfig> get(int i) {
            return ModelConfigArbiter.this.requestServerConfig(i);
        }
    };

    static {
        Covode.recordClassIndex(95391);
    }

    public void setIModelCache(IModelCache iModelCache) {
        this.mIModelCache = iModelCache;
    }

    public C1731i<ServerConfig> requestServerConfig(final int i) {
        return C1731i.m5640b(new Callable<ServerConfig>() {
            /* class com.p2082ss.android.ugc.effectmanager.algorithm.ModelConfigArbiter.CallableC819273 */

            static {
                Covode.recordClassIndex(95394);
            }

            @Override // java.util.concurrent.Callable
            public ServerConfig call() {
                Stopwatch createStarted = Stopwatch.createStarted();
                ModelEventListener eventListener = ModelConfigArbiter.this.mConfig.getEventListener();
                try {
                    final HashMap hashMap = new HashMap();
                    hashMap.put("sdk_version", ModelConfigArbiter.this.mConfig.getSdkVersion());
                    hashMap.put("device_type", ModelConfigArbiter.this.mConfig.getDeviceType());
                    hashMap.put("status", String.valueOf(ModelConfigArbiter.this.mConfig.getModelFileEnv().ordinal()));
                    new NormalTask(null, null) {
                        /* class com.p2082ss.android.ugc.effectmanager.algorithm.ModelConfigArbiter.CallableC819273.C819281 */

                        static {
                            Covode.recordClassIndex(95395);
                        }

                        @Override // com.p2082ss.android.ugc.effectmanager.common.task.ITask
                        public void execute() {
                            EffectConfiguration effectConfiguration = ModelConfigArbiter.this.mConfig.getEffectConfiguration();
                            if (effectConfiguration != null) {
                                hashMap.putAll(EffectRequestUtil.INSTANCE.addCommonParams(effectConfiguration));
                            }
                            String loadJson = AssetUtils.loadJson(ModelConfigArbiter.this.mConfig.getAssetManager(), "model/effect_local_config.json");
                            if (!TextUtils.isEmpty(loadJson)) {
                                try {
                                    String optString = new JSONObject(loadJson).optString("tag");
                                    EPLog.m141898d("ModelConfigArbiter", "asset tag = ".concat(String.valueOf(optString)));
                                    if (!TextUtils.isEmpty(optString)) {
                                        hashMap.put("tag", optString);
                                    }
                                } catch (JSONException unused) {
                                }
                            }
                            if (i > 0) {
                                hashMap.put("busi_id", String.valueOf(i));
                            }
                        }
                    }.execute();
                    DownloadableModelResponse downloadableModelResponse = (DownloadableModelResponse) ModelConfigArbiter.this.mConfig.getJsonConverter().convertJsonToObj(ModelConfigArbiter.this.mConfig.getEffectNetWorker().execute(new EffectRequest("GET", NetworkUtils.buildRequestUrl(hashMap, ModelConfigArbiter.this.mConfig.getHosts().get(0).getItemName() + "/model/api/arithmetics"))), DownloadableModelResponse.class);
                    Multimap multimap = new Multimap();
                    if (downloadableModelResponse != null) {
                        int i = downloadableModelResponse.status_code;
                        if (i == 0) {
                            DownloadableModelResponse.Data data = downloadableModelResponse.getData();
                            if (data == null || data.getArithmetics() == null) {
                                throw new IllegalStateException("status_code == 0 but data == null, indicates there may be an internal server error");
                            }
                            Map<String, List<ModelInfo>> arithmetics = data.getArithmetics();
                            for (String str : arithmetics.keySet()) {
                                for (ModelInfo modelInfo : arithmetics.get(str)) {
                                    multimap.put(str, modelInfo);
                                }
                            }
                            if (eventListener != null) {
                                eventListener.onFetchModelList(true, null, createStarted.elapsedMillis(), ModelConfigArbiter.this.mConfig.getSdkVersion());
                            }
                            return new ServerConfig(multimap);
                        }
                        throw new IllegalStateException("status code == " + i + " , indicates there is no model config from server, sdk version is " + ModelConfigArbiter.this.mConfig.getSdkVersion());
                    }
                    throw new IllegalStateException("response == null, indicates there may be an internal server error");
                } catch (IllegalStateException e) {
                    if (eventListener != null) {
                        eventListener.onFetchModelList(false, e.getMessage(), createStarted.elapsedMillis(), ModelConfigArbiter.this.mConfig.getSdkVersion());
                    }
                    return null;
                }
            }
        }, this.mConfig.getExecutor());
    }

    public ModelConfigArbiter(DownloadableModelConfig downloadableModelConfig) {
        this.mConfig = downloadableModelConfig;
    }

    public LoadedModelList requireDecidedConfigNonBlockling(final int i) {
        ServerConfig serverConfig = this.mModelListMap.get("biz_".concat(String.valueOf(i)));
        if (serverConfig != null && serverConfig.getLoadedModelList() != null) {
            return serverConfig.getLoadedModelList();
        }
        C1731i.m5640b(new Callable<Object>() {
            /* class com.p2082ss.android.ugc.effectmanager.algorithm.ModelConfigArbiter.CallableC819305 */

            static {
                Covode.recordClassIndex(95397);
            }

            @Override // java.util.concurrent.Callable
            public Object call() {
                ModelConfigArbiter.this.requireDecidedConfig(i);
                return null;
            }
        }, C1731i.f5562a);
        return null;
    }

    public synchronized LoadedModelList requireDecidedConfig(int i) {
        MethodCollector.m26663i(1430);
        String concat = "biz_".concat(String.valueOf(i));
        ServerConfig serverConfig = this.mModelListMap.get(concat);
        if (serverConfig == null || serverConfig.getLoadedModelList() == null) {
            C1731i<ServerConfig> iVar = this.mTaskSupplier.get(i);
            try {
                iVar.mo5547f();
                if (!iVar.mo5544c()) {
                    final ServerConfig d = iVar.mo5545d();
                    if (this.mIModelCache != null) {
                        C1731i.m5640b(new Callable<Void>() {
                            /* class com.p2082ss.android.ugc.effectmanager.algorithm.ModelConfigArbiter.CallableC819294 */

                            static {
                                Covode.recordClassIndex(95396);
                            }

                            @Override // java.util.concurrent.Callable
                            public Void call() {
                                AlgorithmModelInfoMemoryCache.INSTANCE.buildCache(d.getLoadedModelList(), ModelConfigArbiter.this.mIModelCache);
                                return null;
                            }
                        }, C1731i.f5562a);
                    }
                    if (d == null) {
                        RuntimeException runtimeException = new RuntimeException("config == null");
                        MethodCollector.m26664o(1430);
                        throw runtimeException;
                    } else if (d.getLoadedModelList() != null) {
                        this.mModelListMap.put(concat, d);
                        LoadedModelList loadedModelList = d.getLoadedModelList();
                        MethodCollector.m26664o(1430);
                        return loadedModelList;
                    } else {
                        RuntimeException runtimeException2 = new RuntimeException("loadedModelList == null");
                        MethodCollector.m26664o(1430);
                        throw runtimeException2;
                    }
                } else {
                    RuntimeException runtimeException3 = new RuntimeException(iVar.mo5546e());
                    MethodCollector.m26664o(1430);
                    throw runtimeException3;
                }
            } catch (Exception e) {
                RuntimeException runtimeException4 = new RuntimeException(e);
                MethodCollector.m26664o(1430);
                throw runtimeException4;
            }
        } else {
            LoadedModelList loadedModelList2 = serverConfig.getLoadedModelList();
            MethodCollector.m26664o(1430);
            return loadedModelList2;
        }
    }

    private C1731i<ModelInfo> requestSingleModel(final int i, final String str) {
        return C1731i.m5640b(new Callable<ModelInfo>() {
            /* class com.p2082ss.android.ugc.effectmanager.algorithm.ModelConfigArbiter.CallableC819262 */

            static {
                Covode.recordClassIndex(95393);
            }

            @Override // java.util.concurrent.Callable
            public ModelInfo call() {
                SingleAlgorithmModelResponse runDirectly = new FetchModelInfoByNameTask(ModelConfigArbiter.this.mConfig, str, i, null, null, null).runDirectly();
                if (runDirectly == null || runDirectly.getData() == null || runDirectly.getData().getFile_url() == null) {
                    return null;
                }
                return new ModelInfo(runDirectly.getData());
            }
        }, this.mConfig.getExecutor());
    }

    public ModelInfo getSingleModelInfoNonBlocking(final int i, final String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        ModelInfo modelInfo = this.mSingleModelMap.get(str);
        if (modelInfo == null) {
            C1731i.m5640b(new Callable<Object>() {
                /* class com.p2082ss.android.ugc.effectmanager.algorithm.ModelConfigArbiter.CallableC819316 */

                static {
                    Covode.recordClassIndex(95398);
                }

                @Override // java.util.concurrent.Callable
                public Object call() {
                    ModelConfigArbiter.this.getSingleModelInfo(i, str);
                    return null;
                }
            }, C1731i.f5562a);
        }
        return modelInfo;
    }

    public synchronized ModelInfo getSingleModelInfo(int i, String str) {
        MethodCollector.m26663i(1471);
        if (TextUtils.isEmpty(str)) {
            MethodCollector.m26664o(1471);
            return null;
        }
        ModelInfo modelInfo = this.mSingleModelMap.get(str);
        if (modelInfo == null) {
            C1731i<ModelInfo> requestSingleModel = requestSingleModel(i, str);
            try {
                requestSingleModel.mo5547f();
                if (!requestSingleModel.mo5544c()) {
                    modelInfo = requestSingleModel.mo5545d();
                    this.mSingleModelMap.put(str, modelInfo);
                } else {
                    RuntimeException runtimeException = new RuntimeException(requestSingleModel.mo5546e());
                    MethodCollector.m26664o(1471);
                    throw runtimeException;
                }
            } catch (Exception e) {
                RuntimeException runtimeException2 = new RuntimeException(e);
                MethodCollector.m26664o(1471);
                throw runtimeException2;
            }
        }
        MethodCollector.m26664o(1471);
        return modelInfo;
    }
}
