package com.p2082ss.android.ugc.effectmanager;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.effectmanager.DownloadableModelSupportLibraryLoader;
import com.p2082ss.android.ugc.effectmanager.algorithm.AlgorithmModelManager;
import com.p2082ss.android.ugc.effectmanager.algorithm.AssetManagerWrapper;
import com.p2082ss.android.ugc.effectmanager.algorithm.DownloadedModelStorage;
import com.p2082ss.android.ugc.effectmanager.algorithm.FetchResourcesListener;
import com.p2082ss.android.ugc.effectmanager.algorithm.ModelConfigArbiter;
import com.p2082ss.android.ugc.effectmanager.common.ModelNameProcessor;
import com.p2082ss.android.ugc.effectmanager.common.logger.EPLog;
import com.p2082ss.android.ugc.effectmanager.common.network.EffectNetWorkerWrapper;
import com.p2082ss.android.ugc.effectmanager.common.utils.EffectUtils;
import com.p2082ss.android.ugc.effectmanager.common.utils.Preconditions;
import com.p2082ss.android.ugc.effectmanager.effect.bridge.EffectFetcher;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;
import com.p2082ss.android.ugc.effectmanager.knadapt.KNEPDecryptor;
import com.p2082ss.android.ugc.effectmanager.knadapt.KNLibraryLoader;
import com.p2082ss.android.ugc.effectmanager.knadapt.KNResourceFinder;
import com.p2082ss.android.ugc.effectmanager.knadapt.ModelListenerAdaptKt;
import com.p2082ss.android.ugc.effectmanager.knadapt.UseKNPlatform;
import com.p2082ss.android.ugc.effectmanager.model.LocalModelInfo;
import com.p2082ss.ugc.effectplatform.C86717b;
import com.p2082ss.ugc.effectplatform.C86756c;
import com.p2082ss.ugc.effectplatform.algorithm.C86705b;
import com.p2082ss.ugc.effectplatform.algorithm.C86709e;
import com.p2082ss.ugc.effectplatform.algorithm.C86716i;
import com.p2082ss.ugc.effectplatform.model.C86843g;
import com.p2082ss.ugc.effectplatform.p4451h.AbstractC86796e;
import com.p2082ss.ugc.effectplatform.p4453j.C86803a;
import com.p2082ss.ugc.effectplatform.task.C86861aa;
import com.p2082ss.ugc.effectplatform.task.C86867ab;
import com.p2082ss.ugc.effectplatform.task.C86882al;
import com.p2082ss.ugc.effectplatform.task.p4457a.C86855a;
import com.p2082ss.ugc.effectplatform.task.p4457a.C86859c;
import com.p2082ss.ugc.effectplatform.util.C86990h;
import com.p2082ss.ugc.effectplatform.util.C87006t;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Callable;
import p077b.AbstractC1729g;
import p077b.C1731i;
import p4519d.p4520a.p4532e.C88060b;
import p4600h.C89388w;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.effectmanager.DownloadableModelSupport */
public final class DownloadableModelSupport {
    private static DownloadableModelSupport INSTANCE;
    static DownloadableModelSupportLibraryLoader sLibraryLoader = new DownloadableModelSupportLibraryLoader.SystemLoader();
    private final DownloadableModelConfig config;
    private final AssetManagerWrapper mAssetManagerWrapper;
    private DownloadableModelSupportEffectFetcher mEffectFetcher;
    private boolean mEnableKotlinNative = UseKNPlatform.enableKNPlatform;
    private KNResourceFinder mKNResourceFinder;
    private final DownloadedModelStorage mModelCache;
    public ModelConfigArbiter mModelConfigArbiter;
    private final EffectNetWorkerWrapper mNetWorker;
    private DownloadableModelSupportResourceFinder mResourceFinder;
    private final String mSdkVersion;
    private final String mWorkspace;

    /* renamed from: com.ss.android.ugc.effectmanager.DownloadableModelSupport$EventListener */
    public interface EventListener extends ModelEventListener {
        static {
            Covode.recordClassIndex(95359);
        }
    }

    public static boolean isInitialized() {
        if (INSTANCE != null) {
            return true;
        }
        return false;
    }

    public final EffectFetcher getEffectFetcher() {
        return getEffectFetcherInternal();
    }

    /* access modifiers changed from: package-private */
    public final DownloadableModelSupportEffectFetcher getEffectFetcherInternal() {
        return INSTANCE.getOrCreateEffectFetcher();
    }

    public final DownloadableModelSupportResourceFinder getResourceFinder() {
        return getOrCreateResourceFinder();
    }

    static {
        Covode.recordClassIndex(95353);
    }

    public static DownloadableModelSupport getInstance() {
        DownloadableModelSupport downloadableModelSupport = INSTANCE;
        if (downloadableModelSupport != null) {
            return downloadableModelSupport;
        }
        throw new IllegalStateException("downloadableModelSupport not initialize");
    }

    private void initializeOnStart() {
        ModelConfigArbiter modelConfigArbiter = new ModelConfigArbiter(this.config);
        this.mModelConfigArbiter = modelConfigArbiter;
        modelConfigArbiter.setIModelCache(this.mModelCache);
    }

    public static void loadSo() {
        if (UseKNPlatform.enableKNPlatform) {
            C86705b.f195527b.mo139942a();
        } else {
            DownloadableModelLibraryLoader.INSTANCE.loadLibrary();
        }
    }

    private DownloadableModelSupportResourceFinder getOrCreateKNResourceFinder() {
        if (this.mKNResourceFinder == null) {
            this.mKNResourceFinder = new KNResourceFinder(C86709e.C86710a.m150208a().mo139947a());
        }
        return this.mKNResourceFinder;
    }

    public final DownloadableModelSupportEffectFetcher getOrCreateEffectFetcher() {
        if (this.mEffectFetcher == null) {
            this.mEffectFetcher = new DownloadableModelSupportEffectFetcher(this.config, this.mModelCache, this.mNetWorker, this.mModelConfigArbiter);
        }
        return this.mEffectFetcher;
    }

    private DownloadableModelSupportResourceFinder getOrCreateResourceFinder() {
        if (this.mEnableKotlinNative && C86709e.C86710a.m150209b()) {
            return getOrCreateKNResourceFinder();
        }
        if (this.mResourceFinder == null) {
            this.mResourceFinder = new DownloadableModelSupportResourceFinder(this.mModelConfigArbiter, this.mModelCache, this.config, this.mAssetManagerWrapper);
        }
        return this.mResourceFinder;
    }

    public final void requestModelInfoBackGround() {
        C86882al alVar;
        if (!this.mEnableKotlinNative || !C86709e.C86710a.m150209b()) {
            if (this.mModelConfigArbiter.requireDecidedConfigNonBlockling(0) == null) {
                C1731i.m5640b(new Callable<Void>() {
                    /* class com.p2082ss.android.ugc.effectmanager.DownloadableModelSupport.CallableC819181 */

                    static {
                        Covode.recordClassIndex(95354);
                    }

                    @Override // java.util.concurrent.Callable
                    public Void call() {
                        DownloadableModelSupport.this.mModelConfigArbiter.requireDecidedConfig(0);
                        return null;
                    }
                }, C1731i.f5562a);
            }
        } else if (C86861aa.f195830d.get(C86867ab.m150481a(0)) == null && (alVar = C86709e.C86710a.m150208a().f195537b.f195470z) != null) {
            alVar.mo140600a(new C86709e.C86710a.C86711a(C87006t.m150696a()));
        }
    }

    private boolean checkModelReadyLocal(String str) {
        boolean isResourceAvailable = getOrCreateResourceFinder().isResourceAvailable(str);
        try {
            if (!getEffectFetcherInternal().collectNeedDownloadModelsListNonBlocking(new String[]{str}).isEmpty()) {
                isResourceAvailable = false;
            }
            return isResourceAvailable;
        } catch (Exception unused) {
            return false;
        }
    }

    public static void setLibraryLoader(DownloadableModelSupportLibraryLoader downloadableModelSupportLibraryLoader) {
        sLibraryLoader = (DownloadableModelSupportLibraryLoader) Preconditions.checkNotNull(downloadableModelSupportLibraryLoader);
        KNLibraryLoader kNLibraryLoader = new KNLibraryLoader(downloadableModelSupportLibraryLoader);
        C89219l.m154719c(kNLibraryLoader, "");
        C86709e.f195534d = kNLibraryLoader;
        C89219l.m154719c(kNLibraryLoader, "");
        C86705b.f195526a = kNLibraryLoader;
    }

    private DownloadableModelSupport(DownloadableModelConfig downloadableModelConfig) {
        AssetManagerWrapper assetManagerWrapper = new AssetManagerWrapper(downloadableModelConfig.getAssetManager(), downloadableModelConfig.getExclusionPattern());
        this.mAssetManagerWrapper = assetManagerWrapper;
        String workspace = downloadableModelConfig.getWorkspace();
        this.mWorkspace = workspace;
        this.mNetWorker = new EffectNetWorkerWrapper(downloadableModelConfig.getEffectNetWorker(), downloadableModelConfig.getContext());
        String sdkVersion = downloadableModelConfig.getSdkVersion();
        this.mSdkVersion = sdkVersion;
        this.config = downloadableModelConfig;
        this.mModelCache = DownloadedModelStorage.getInstance(workspace, sdkVersion, assetManagerWrapper);
    }

    public static void initialize(DownloadableModelConfig downloadableModelConfig) {
        Objects.requireNonNull(downloadableModelConfig);
        if (INSTANCE == null) {
            DownloadableModelSupport downloadableModelSupport = new DownloadableModelSupport(downloadableModelConfig);
            INSTANCE = downloadableModelSupport;
            downloadableModelSupport.initializeOnStart();
            if (UseKNPlatform.enableKNPlatform && downloadableModelConfig.getKNEffectConfig() != null && !C86709e.C86710a.m150209b()) {
                C86709e.m150203a(downloadableModelConfig.getKNEffectConfig());
            }
            if (!UseKNPlatform.enableKNPlatform) {
                if (downloadableModelConfig.getKNEffectConfig() != null) {
                    C86990h.f196147b.f199870a = downloadableModelConfig.getKNEffectConfig().f195463s.f199870a;
                }
                C86756c.f195652a = KNEPDecryptor.INSTANCE;
                return;
            }
            return;
        }
        throw new IllegalStateException("Duplicate initialization");
    }

    public final List<LocalModelInfo> getLocalModelInfo(List<String> list) {
        List<C86843g> list2;
        if (this.mEnableKotlinNative && C86709e.C86710a.m150209b()) {
            C86803a aVar = C86709e.C86710a.m150208a().f195536a;
            if (list == null || list.isEmpty()) {
                list2 = new ArrayList<>();
            } else {
                Object[] array = list.toArray(new String[0]);
                if (array != null) {
                    String[] a = C86716i.m150217a((String[]) array);
                    C86855a aVar2 = aVar.mo140038a().f195521a;
                    list2 = new C86859c(aVar2.f195813d, aVar2.f195810a, aVar2.f195811b, aVar2.f195812c, null, 0, 112).mo140586a(a);
                } else {
                    throw new C89388w("null cannot be cast to non-null type");
                }
            }
            ArrayList arrayList = new ArrayList();
            for (C86843g gVar : list2) {
                LocalModelInfo fromFile = LocalModelInfo.fromFile(gVar.f195769d);
                fromFile.setSize(gVar.mo140170c());
                fromFile.setName(gVar.mo140166a());
                fromFile.setVersion(gVar.mo140168b());
                arrayList.add(fromFile);
            }
            return arrayList;
        } else if (list == null || list.isEmpty()) {
            return new ArrayList();
        } else {
            return getOrCreateEffectFetcher().collectLocalModelInfo(C86716i.m150217a((String[]) list.toArray(new String[list.size()])));
        }
    }

    public final void fetchResourcesNeededByRequirements(final List<String> list, final IFetchModelListener iFetchModelListener) {
        if (!this.mEnableKotlinNative || !C86709e.C86710a.m150209b()) {
            C1731i.m5640b(new Callable<Void>() {
                /* class com.p2082ss.android.ugc.effectmanager.DownloadableModelSupport.CallableC819203 */

                static {
                    Covode.recordClassIndex(95356);
                }

                @Override // java.util.concurrent.Callable
                public Void call() {
                    DownloadableModelSupport.this.getOrCreateEffectFetcher().fetchModels(list, null);
                    return null;
                }
            }, C1731i.f5562a).mo5532a((AbstractC1729g) new AbstractC1729g<Void, Void>() {
                /* class com.p2082ss.android.ugc.effectmanager.DownloadableModelSupport.C819192 */

                static {
                    Covode.recordClassIndex(95355);
                }

                @Override // p077b.AbstractC1729g
                public Void then(C1731i<Void> iVar) {
                    if (iVar.mo5544c()) {
                        IFetchModelListener iFetchModelListener = iFetchModelListener;
                        if (iFetchModelListener == null) {
                            return null;
                        }
                        iFetchModelListener.onFailed(iVar.mo5546e());
                        return null;
                    }
                    IFetchModelListener iFetchModelListener2 = iFetchModelListener;
                    if (iFetchModelListener2 == null) {
                        return null;
                    }
                    iFetchModelListener2.onSuccess((String[]) list.toArray(new String[0]));
                    return null;
                }
            });
        } else {
            C86709e.C86710a.m150208a().mo139948a(list, ModelListenerAdaptKt.toKNListener(iFetchModelListener));
        }
    }

    public final void fetchResourcesNeededByRequirements(String[] strArr, IFetchModelListener iFetchModelListener) {
        if (!this.mEnableKotlinNative || !C86709e.C86710a.m150209b()) {
            fetchResourcesNeededByRequirements(Arrays.asList(strArr), iFetchModelListener);
        } else {
            C86709e.C86710a.m150208a().mo139948a(Arrays.asList(strArr), ModelListenerAdaptKt.toKNListener(iFetchModelListener));
        }
    }

    public final boolean areRequirementsReady(EffectManager effectManager, Effect effect) {
        String str;
        if (this.mEnableKotlinNative && C86709e.C86710a.m150209b()) {
            return C86709e.C86710a.m150208a().mo139949a(effect);
        }
        if (EffectUtils.isRequirementsInvalid(effect)) {
            StringBuilder append = new StringBuilder("decrypt error effect_id: ").append(effect.getId()).append(", effect_name: ").append(effect.getName()).append(", requirements_sec: ");
            if (effect.getRequirements_sec() != null) {
                str = effect.getRequirements_sec().toString();
            } else {
                str = "";
            }
            EPLog.m141898d("DownloadableModelSupport", append.append(str).toString());
            return false;
        }
        String[] resourceNameArrayOfEffect = AlgorithmUtils.getResourceNameArrayOfEffect(effect);
        if (resourceNameArrayOfEffect == null || resourceNameArrayOfEffect.length == 0) {
            EPLog.m141898d("DownloadableModelSupport", "effect: " + effect.getEffectId() + " name: " + effect.getName() + " returned empty resourceNameArrayOfEffect");
            return true;
        }
        this.mModelCache.checkDiskLruCache();
        for (String str2 : resourceNameArrayOfEffect) {
            if ((!AlgorithmModelInfoMemoryCache.hasBuiltCache() || !AlgorithmModelInfoMemoryCache.isModelReady(ModelNameProcessor.getNameOfModel(str2))) && !checkModelReadyLocal(str2)) {
                return false;
            }
        }
        return true;
    }

    public final boolean isEffectReady(EffectManager effectManager, Effect effect) {
        boolean z;
        if (!this.mEnableKotlinNative || !C86709e.C86710a.m150209b() || effectManager.getKNEffectPlatform() == null) {
            long currentTimeMillis = System.currentTimeMillis();
            boolean isEffectDownloaded = effectManager.isEffectDownloaded(effect);
            if (isEffectDownloaded) {
                isEffectDownloaded = areRequirementsReady(effectManager, effect);
            }
            EPLog.m141898d("DownloadableModelSupport", "effect: " + effect.getEffectId() + " name: " + effect.getName() + " result: " + isEffectDownloaded + " time cost: " + (System.currentTimeMillis() - currentTimeMillis) + "ms");
            return isEffectDownloaded;
        }
        C86709e a = C86709e.C86710a.m150208a();
        C86717b kNEffectPlatform = effectManager.getKNEffectPlatform();
        C89219l.m154719c(kNEffectPlatform, "");
        C89219l.m154719c(effect, "");
        long currentTimeMillis2 = System.currentTimeMillis();
        if (kNEffectPlatform.mo139966a(effect)) {
            z = a.mo139949a(effect);
        } else {
            z = false;
        }
        C88060b.m153135a("isEffectReady", "effect: " + effect.getEffect_id() + ", name:" + effect.getName() + ", result: " + z + ", time cost: " + (System.currentTimeMillis() - currentTimeMillis2) + " ms");
        return z;
    }

    public final void fetchResourcesWithModelNames(int i, String[] strArr, FetchResourcesListener fetchResourcesListener) {
        if (!AlgorithmModelManager.isInitialized()) {
            AlgorithmModelManager.initialize(this.config);
        }
        AlgorithmModelManager.getInstance().fetchResourcesWithModelNames(i, strArr, fetchResourcesListener);
    }

    public final void fetchResourcesByRequirementsAndModelNames(final String[] strArr, final Map<String, List<String>> map, final IFetchResourceListener iFetchResourceListener) {
        if (!this.mEnableKotlinNative || !C86709e.C86710a.m150209b()) {
            C1731i.m5640b(new Callable<Void>() {
                /* class com.p2082ss.android.ugc.effectmanager.DownloadableModelSupport.CallableC819225 */

                static {
                    Covode.recordClassIndex(95358);
                }

                @Override // java.util.concurrent.Callable
                public Void call() {
                    DownloadableModelSupport.this.getOrCreateEffectFetcher().fetchModels(Arrays.asList(strArr), map);
                    return null;
                }
            }, C1731i.f5562a).mo5532a((AbstractC1729g) new AbstractC1729g<Void, Void>() {
                /* class com.p2082ss.android.ugc.effectmanager.DownloadableModelSupport.C819214 */

                static {
                    Covode.recordClassIndex(95357);
                }

                @Override // p077b.AbstractC1729g
                public Void then(C1731i<Void> iVar) {
                    if (iVar.mo5544c()) {
                        IFetchResourceListener iFetchResourceListener = iFetchResourceListener;
                        if (iFetchResourceListener == null) {
                            return null;
                        }
                        iFetchResourceListener.onFailure(iVar.mo5546e());
                        return null;
                    }
                    IFetchResourceListener iFetchResourceListener2 = iFetchResourceListener;
                    if (iFetchResourceListener2 == null) {
                        return null;
                    }
                    iFetchResourceListener2.onSuccess(DownloadableModelSupport.this.getResourceFinder().getEffectHandle());
                    return null;
                }
            });
            return;
        }
        C86709e a = C86709e.C86710a.m150208a();
        AbstractC86796e<Long> kNListener = IFetchResourceListenerKt.toKNListener(iFetchResourceListener);
        C89219l.m154719c(strArr, "");
        C89219l.m154719c(map, "");
        C86803a aVar = a.f195536a;
        C89219l.m154719c(strArr, "");
        C89219l.m154719c(map, "");
        C86882al alVar = aVar.f195703d.f195470z;
        if (alVar != null) {
            alVar.mo140600a(new C86803a.C86805b(aVar, strArr, map, kNListener, C87006t.m150696a()));
        }
    }
}
