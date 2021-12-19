package com.p2082ss.android.ugc.effectmanager.algorithm;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.effectmanager.DownloadableModelConfig;
import com.p2082ss.android.ugc.effectmanager.common.cache.IModelCache;
import com.p2082ss.android.ugc.effectmanager.common.network.EffectNetWorkerWrapper;
import com.p2082ss.android.ugc.effectmanager.knadapt.UseKNPlatform;
import com.p2082ss.ugc.effectplatform.p4453j.C86803a;
import com.p2082ss.ugc.effectplatform.task.C86882al;
import com.p2082ss.ugc.effectplatform.task.p4457a.C86859c;
import p077b.AbstractC1729g;
import p077b.C1731i;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.C89204ab;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89232y;
import p4600h.p4620k.AbstractC89286i;

/* renamed from: com.ss.android.ugc.effectmanager.algorithm.AlgorithmModelManager */
public final class AlgorithmModelManager {
    static final /* synthetic */ AbstractC89286i[] $$delegatedProperties = {new C89232y(C89204ab.m154669a(AlgorithmModelManager.class), "knAlgorithmRepository", "getKnAlgorithmRepository()Lcom/ss/ugc/effectplatform/repository/AlgorithmRepository;")};
    public static final Companion Companion = new Companion(null);
    public static AlgorithmModelManager INSTANCE;
    private final AssetManagerWrapper assetManagerWrapper;
    private final EffectNetWorkerWrapper effectNetWorkerWrapper;
    private final AbstractC89244h knAlgorithmRepository$delegate;
    private final IModelCache modelCache;
    private final ModelConfigArbiter modelConfigArbiter;
    public final ModelFetcher modelFetcher;
    private final ModelFinder modelFinder;

    public static final synchronized AlgorithmModelManager getInstance() {
        AlgorithmModelManager instance;
        synchronized (AlgorithmModelManager.class) {
            MethodCollector.m26663i(61);
            instance = Companion.getInstance();
            MethodCollector.m26664o(61);
        }
        return instance;
    }

    private final C86803a getKnAlgorithmRepository() {
        return (C86803a) this.knAlgorithmRepository$delegate.getValue();
    }

    public static final void initialize(DownloadableModelConfig downloadableModelConfig) {
        Companion.initialize(downloadableModelConfig);
    }

    public static final boolean isInitialized() {
        return Companion.isInitialized();
    }

    /* renamed from: com.ss.android.ugc.effectmanager.algorithm.AlgorithmModelManager$Companion */
    public static final class Companion {
        static {
            Covode.recordClassIndex(95381);
        }

        private Companion() {
        }

        public final boolean isInitialized() {
            if (AlgorithmModelManager.INSTANCE != null) {
                return true;
            }
            return false;
        }

        public final synchronized AlgorithmModelManager getInstance() {
            AlgorithmModelManager algorithmModelManager;
            MethodCollector.m26663i(2844);
            if (AlgorithmModelManager.INSTANCE != null) {
                algorithmModelManager = AlgorithmModelManager.INSTANCE;
                if (algorithmModelManager == null) {
                    C89219l.m154707a();
                }
                MethodCollector.m26664o(2844);
            } else {
                IllegalStateException illegalStateException = new IllegalStateException("AlgorithmModelManager has not initialized".toString());
                MethodCollector.m26664o(2844);
                throw illegalStateException;
            }
            return algorithmModelManager;
        }

        public /* synthetic */ Companion(C89214g gVar) {
            this();
        }

        public final void initialize(DownloadableModelConfig downloadableModelConfig) {
            C89219l.m154719c(downloadableModelConfig, "");
            if (AlgorithmModelManager.INSTANCE == null) {
                AlgorithmModelManager.INSTANCE = new AlgorithmModelManager(downloadableModelConfig, null);
                return;
            }
            throw new IllegalStateException("Duplicate AlgorithmModelManager initialization");
        }
    }

    static {
        Covode.recordClassIndex(95380);
    }

    public final String findResourceUri(String str) {
        C89219l.m154719c(str, "");
        return findResourceUri(0, str);
    }

    private AlgorithmModelManager(DownloadableModelConfig downloadableModelConfig) {
        AssetManagerWrapper assetManagerWrapper2 = new AssetManagerWrapper(downloadableModelConfig.getAssetManager(), downloadableModelConfig.getExclusionPattern());
        this.assetManagerWrapper = assetManagerWrapper2;
        EffectNetWorkerWrapper effectNetWorkerWrapper2 = new EffectNetWorkerWrapper(downloadableModelConfig.getEffectNetWorker(), downloadableModelConfig.getContext());
        this.effectNetWorkerWrapper = effectNetWorkerWrapper2;
        ModelConfigArbiter modelConfigArbiter2 = new ModelConfigArbiter(downloadableModelConfig);
        this.modelConfigArbiter = modelConfigArbiter2;
        DownloadedModelStorage instance = DownloadedModelStorage.getInstance(downloadableModelConfig.getWorkspace(), downloadableModelConfig.getSdkVersion(), assetManagerWrapper2);
        C89219l.m154709a((Object) instance, "");
        this.modelCache = instance;
        this.modelFetcher = new ModelFetcher(downloadableModelConfig, modelConfigArbiter2, instance, effectNetWorkerWrapper2);
        this.modelFinder = new ModelFinder(downloadableModelConfig, modelConfigArbiter2, instance, assetManagerWrapper2);
        this.knAlgorithmRepository$delegate = C89250i.m154773a((AbstractC89171a) new AlgorithmModelManager$knAlgorithmRepository$2(downloadableModelConfig));
        modelConfigArbiter2.setIModelCache(instance);
    }

    public /* synthetic */ AlgorithmModelManager(DownloadableModelConfig downloadableModelConfig, C89214g gVar) {
        this(downloadableModelConfig);
    }

    public final void fetchResourcesWithModelNames(String[] strArr, FetchResourcesListener fetchResourcesListener) {
        C89219l.m154719c(strArr, "");
        fetchResourcesWithModelNames(0, strArr, fetchResourcesListener);
    }

    public final String findResourceUri(int i, String str) {
        C89219l.m154719c(str, "");
        if (UseKNPlatform.enableKNPlatform) {
            return getKnAlgorithmRepository().mo140039a(i, str);
        }
        return this.modelFinder.findResourceUri(i, null, str);
    }

    public final void fetchResourcesWithModelNames(int i, String[] strArr, FetchResourcesListener fetchResourcesListener) {
        C89219l.m154719c(strArr, "");
        if (UseKNPlatform.enableKNPlatform) {
            C86803a knAlgorithmRepository = getKnAlgorithmRepository();
            AlgorithmModelManager$fetchResourcesWithModelNames$1 algorithmModelManager$fetchResourcesWithModelNames$1 = new AlgorithmModelManager$fetchResourcesWithModelNames$1(fetchResourcesListener);
            C89219l.m154719c(strArr, "");
            C86859c cVar = new C86859c(knAlgorithmRepository.f195703d, knAlgorithmRepository.f195700a, knAlgorithmRepository.f195702c, knAlgorithmRepository.f195701b, strArr, i, 64);
            C86882al alVar = knAlgorithmRepository.f195703d.f195470z;
            if (alVar != null) {
                alVar.mo140600a(new C86803a.C86807d(cVar, algorithmModelManager$fetchResourcesWithModelNames$1, strArr));
                return;
            }
            return;
        }
        C1731i.m5640b(new AlgorithmModelManager$fetchResourcesWithModelNames$2(this, i, strArr), C1731i.f5562a).mo5532a((AbstractC1729g) new AlgorithmModelManager$fetchResourcesWithModelNames$3(fetchResourcesListener));
    }
}
