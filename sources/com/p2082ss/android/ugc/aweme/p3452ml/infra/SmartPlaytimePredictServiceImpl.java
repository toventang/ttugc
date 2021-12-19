package com.p2082ss.android.ugc.aweme.p3452ml.infra;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.ugc.appcontext.C17873f;
import com.p2082ss.android.ugc.C81908b;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.p3452ml.api.AbstractC60013b;
import com.p2082ss.android.ugc.aweme.p3452ml.api.C60012a;
import com.p2082ss.android.ugc.aweme.p3452ml.api.MLCommonService;
import com.p2082ss.android.ugc.aweme.p3452ml.infra.SmartMLSceneService;
import com.p2082ss.android.ugc.aweme.p3452ml.p3454ab.OnePlaytimePredictConfig;
import com.p2082ss.android.ugc.aweme.p3452ml.p3454ab.SmartPlaytimePredictConfig;
import com.p2082ss.android.ugc.aweme.p3452ml.p3454ab.SmartPlaytimePredictExperiment;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ml.infra.SmartPlaytimePredictServiceImpl */
public final class SmartPlaytimePredictServiceImpl extends SmartPlaytimePredictService implements AbstractC60013b {

    /* renamed from: a */
    private Map<String, C60101l> f136901a = new ConcurrentHashMap();

    /* renamed from: b */
    private boolean f136902b;

    /* renamed from: c */
    private boolean f136903c;

    /* renamed from: d */
    private boolean f136904d;

    /* renamed from: e */
    private boolean f136905e;

    static {
        Covode.recordClassIndex(70579);
    }

    /* renamed from: a */
    public static ISmartPlaytimePredictService m109549a() {
        MethodCollector.m26663i(10838);
        Object a = C81908b.m141854a(ISmartPlaytimePredictService.class, false);
        if (a != null) {
            ISmartPlaytimePredictService iSmartPlaytimePredictService = (ISmartPlaytimePredictService) a;
            MethodCollector.m26664o(10838);
            return iSmartPlaytimePredictService;
        }
        if (C81908b.f183262cL == null) {
            synchronized (ISmartPlaytimePredictService.class) {
                try {
                    if (C81908b.f183262cL == null) {
                        C81908b.f183262cL = new SmartPlaytimePredictServiceImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(10838);
                    throw th;
                }
            }
        }
        SmartPlaytimePredictService smartPlaytimePredictService = (SmartPlaytimePredictService) C81908b.f183262cL;
        MethodCollector.m26664o(10838);
        return smartPlaytimePredictService;
    }

    @Override // com.p2082ss.android.ugc.aweme.p3452ml.infra.ISmartPlaytimePredictService
    public final void checkAndInit() {
        List<OnePlaytimePredictConfig> serviceList;
        if (!this.f136902b) {
            this.f136902b = true;
            SmartPlaytimePredictConfig playtimePredictServiceConfig = SmartPlaytimePredictExperiment.INSTANCE.getPlaytimePredictServiceConfig();
            if (!(playtimePredictServiceConfig == null || (serviceList = playtimePredictServiceConfig.getServiceList()) == null || serviceList.isEmpty())) {
                for (OnePlaytimePredictConfig onePlaytimePredictConfig : serviceList) {
                    configOneNewService(onePlaytimePredictConfig);
                }
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p3452ml.infra.ISmartPlaytimePredictService
    public final boolean enable(String str) {
        if (str == null || str.length() == 0 || !this.f136901a.containsKey(str)) {
            return false;
        }
        return SmartMLSceneService.C60072b.f136884a.enable(str);
    }

    @Override // com.p2082ss.android.ugc.aweme.p3452ml.infra.ISmartPlaytimePredictService
    public final void ensureEnvAvailable(String str) {
        if (str != null && str.length() != 0 && this.f136901a.containsKey(str)) {
            SmartMLSceneService.C60072b.f136884a.ensureEnvAvailable(str);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p3452ml.infra.ISmartPlaytimePredictService
    public final void configOneNewService(OnePlaytimePredictConfig onePlaytimePredictConfig) {
        SmartSceneConfig sceneConfig;
        String scene;
        String str;
        if (onePlaytimePredictConfig != null && (sceneConfig = onePlaytimePredictConfig.getSceneConfig()) != null && (scene = sceneConfig.getScene()) != null && !this.f136901a.containsKey(scene)) {
            SmartMLSceneService.C60072b.f136884a.configSceneModel(scene, onePlaytimePredictConfig.getSceneConfig());
            C60101l lVar = new C60101l(scene, onePlaytimePredictConfig);
            this.f136901a.put(scene, lVar);
            if (!this.f136903c && onePlaytimePredictConfig.getTrigger() == 2) {
                this.f136903c = true;
                MLCommonService.C59997b.f136653a.addCommonEventListener("play_call_playtime", this);
            } else if (!this.f136904d && onePlaytimePredictConfig.getTrigger() == 1) {
                this.f136904d = true;
                MLCommonService.C59997b.f136653a.addCommonEventListener("play_first_frame", this);
            }
            if (onePlaytimePredictConfig.getRealConfig() != null) {
                this.f136905e = true;
                if (!this.f136903c) {
                    this.f136903c = true;
                    MLCommonService.C59997b.f136653a.addCommonEventListener("play_call_playtime", this);
                }
                ISmartMLSceneService iSmartMLSceneService = SmartMLSceneService.C60072b.f136884a;
                SmartSceneConfig sceneConfig2 = onePlaytimePredictConfig.getSceneConfig();
                if (sceneConfig2 != null) {
                    str = sceneConfig2.getScene();
                } else {
                    str = null;
                }
                iSmartMLSceneService.setReportRunMonitorInterceptor(str, lVar);
            }
        }
    }

    /* renamed from: a */
    private void m109550a(String str, Aweme aweme) {
        C60095h hVar = new C60095h();
        hVar.f136928d = aweme;
        predict(str, hVar, null, null);
    }

    /* renamed from: a */
    private static void m109551a(String str, AbstractC60091e eVar) {
        C60100k lastSuccessRunResult = SmartMLSceneService.C60072b.f136884a.lastSuccessRunResult(str);
        if (lastSuccessRunResult == null) {
            SmartMLSceneService.C60072b.f136884a.lastRunErrorCode(str);
            if (eVar != null) {
                eVar.mo97502a(false, null);
            }
        } else if (eVar != null) {
            eVar.mo97502a(true, lastSuccessRunResult);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p3452ml.api.AbstractC60013b
    /* renamed from: a */
    public final void mo97476a(String str, C60012a aVar) {
        C89219l.m154721d(str, "");
        int hashCode = str.hashCode();
        if (hashCode != -1704536429) {
            if (hashCode == 1168529143 && str.equals("play_call_playtime")) {
                for (Map.Entry<String, C60101l> entry : this.f136901a.entrySet()) {
                    if (entry.getValue().f136974g.getTrigger() == 2) {
                        m109550a(entry.getKey(), aVar != null ? aVar.f136672d : null);
                    }
                }
                if (this.f136905e && aVar != null) {
                    Aweme aweme = aVar.f136672d;
                    long j = aVar.f136669a;
                    if (aweme != null) {
                        C89219l.m154721d(aweme, "");
                        if (!C60093g.f136920c.isEmpty()) {
                            ArrayList arrayList = new ArrayList();
                            Iterator<C60093g> it = C60093g.f136920c.iterator();
                            while (it.hasNext()) {
                                C60093g next = it.next();
                                if (next.mo97625a(aweme, j)) {
                                    C39162r.m79461a("ml_scene_run", next.f136922a);
                                    arrayList.add(next);
                                }
                            }
                            if (!arrayList.isEmpty()) {
                                C60093g.f136920c.removeAll(arrayList);
                            }
                        }
                    }
                }
            }
        } else if (str.equals("play_first_frame")) {
            for (Map.Entry<String, C60101l> entry2 : this.f136901a.entrySet()) {
                if (entry2.getValue().f136974g.getTrigger() == 1) {
                    m109550a(entry2.getKey(), aVar != null ? aVar.f136672d : null);
                }
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p3452ml.infra.ISmartPlaytimePredictService
    public final void predict(String str, C60095h hVar, AbstractC60088b bVar, AbstractC60091e eVar) {
        if (str != null && str.length() != 0 && this.f136901a.containsKey(str)) {
            C60101l lVar = this.f136901a.get(str);
            if (lVar == null) {
                if (eVar != null) {
                    eVar.mo97502a(false, null);
                }
            } else if (C17873f.f42636l) {
                m109551a(str, eVar);
            } else if (lVar.f136974g.getSkipCount() <= 0 || lVar.f136968a >= lVar.f136974g.getSkipCount()) {
                if (lVar.f136974g.getRunTimeGap() > 0) {
                    long currentTimeMillis = System.currentTimeMillis();
                    if (currentTimeMillis - lVar.f136970c < ((long) lVar.f136974g.getRunTimeGap())) {
                        m109551a(str, eVar);
                        return;
                    }
                    lVar.f136970c = currentTimeMillis;
                }
                if (lVar.f136974g.getRunFeedGap() > 0) {
                    if (lVar.f136971d < lVar.f136974g.getRunFeedGap()) {
                        lVar.f136971d++;
                        m109551a(str, eVar);
                        return;
                    }
                    lVar.f136971d = 0;
                }
                lVar.f136972e++;
                SmartMLSceneService.C60072b.f136884a.runDelay(str, (long) lVar.f136974g.getRunDelay(), hVar, bVar, eVar);
            } else {
                lVar.f136968a++;
                m109551a(str, eVar);
            }
        } else if (eVar != null) {
            eVar.mo97502a(false, null);
        }
    }
}
