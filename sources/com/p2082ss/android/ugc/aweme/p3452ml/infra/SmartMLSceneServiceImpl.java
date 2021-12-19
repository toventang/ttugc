package com.p2082ss.android.ugc.aweme.p3452ml.infra;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.C81908b;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.p3452ml.api.SmartDataTrackerService;
import com.p2082ss.android.ugc.aweme.p3452ml.infra.SmartDataCenterApiService;
import com.p2082ss.android.ugc.aweme.p3452ml.infra.p3457a.AbstractC60081a;
import com.p2082ss.android.ugc.aweme.p3452ml.infra.p3457a.AbstractC60086f;
import com.p2082ss.android.ugc.aweme.p3452ml.infra.p3457a.C60087g;
import com.p2082ss.android.ugc.aweme.p3452ml.p3453a.C59978d;
import com.p2082ss.android.ugc.aweme.p3452ml.p3454ab.C59991f;
import com.p2082ss.android.ugc.aweme.p3452ml.p3454ab.OneSmartDataTrackConfig;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;
import p4600h.p4617i.AbstractC89255c;

/* renamed from: com.ss.android.ugc.aweme.ml.infra.SmartMLSceneServiceImpl */
public final class SmartMLSceneServiceImpl extends SmartMLSceneService {

    /* renamed from: a */
    public static final C60073a f136886a = new C60073a((byte) 0);

    /* renamed from: b */
    private Map<String, C60096i> f136887b = new ConcurrentHashMap();

    static {
        Covode.recordClassIndex(70571);
    }

    /* renamed from: com.ss.android.ugc.aweme.ml.infra.SmartMLSceneServiceImpl$a */
    public static final class C60073a {
        static {
            Covode.recordClassIndex(70572);
        }

        private C60073a() {
        }

        public /* synthetic */ C60073a(byte b) {
            this();
        }
    }

    /* renamed from: a */
    public static ISmartMLSceneService m109545a() {
        MethodCollector.m26663i(10993);
        Object a = C81908b.m141854a(ISmartMLSceneService.class, false);
        if (a != null) {
            ISmartMLSceneService iSmartMLSceneService = (ISmartMLSceneService) a;
            MethodCollector.m26664o(10993);
            return iSmartMLSceneService;
        }
        if (C81908b.f183261cK == null) {
            synchronized (ISmartMLSceneService.class) {
                try {
                    if (C81908b.f183261cK == null) {
                        C81908b.f183261cK = new SmartMLSceneServiceImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(10993);
                    throw th;
                }
            }
        }
        SmartMLSceneService smartMLSceneService = (SmartMLSceneService) C81908b.f183261cK;
        MethodCollector.m26664o(10993);
        return smartMLSceneService;
    }

    /* renamed from: com.ss.android.ugc.aweme.ml.infra.SmartMLSceneServiceImpl$b */
    static final class RunnableC60074b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ SmartMLSceneServiceImpl f136888a;

        /* renamed from: b */
        final /* synthetic */ C60096i f136889b;

        /* renamed from: c */
        final /* synthetic */ AbstractC60086f f136890c;

        /* renamed from: d */
        final /* synthetic */ C60095h f136891d;

        /* renamed from: e */
        final /* synthetic */ AbstractC60091e f136892e;

        /* renamed from: f */
        final /* synthetic */ SmartSceneConfig f136893f;

        /* renamed from: g */
        final /* synthetic */ String f136894g;

        /* renamed from: h */
        final /* synthetic */ AbstractC60088b f136895h;

        /* renamed from: i */
        final /* synthetic */ long f136896i;

        static {
            Covode.recordClassIndex(70573);
        }

        RunnableC60074b(SmartMLSceneServiceImpl smartMLSceneServiceImpl, C60096i iVar, AbstractC60086f fVar, C60095h hVar, AbstractC60091e eVar, SmartSceneConfig smartSceneConfig, String str, AbstractC60088b bVar, long j) {
            this.f136888a = smartMLSceneServiceImpl;
            this.f136889b = iVar;
            this.f136890c = fVar;
            this.f136891d = hVar;
            this.f136892e = eVar;
            this.f136893f = smartSceneConfig;
            this.f136894g = str;
            this.f136895h = bVar;
            this.f136896i = j;
        }

        public final void run() {
            try {
                final C60097j a = this.f136889b.mo97627a();
                SmartMLSceneServiceImpl.m109546a(this.f136889b);
                if (!this.f136890c.mo97617a()) {
                    this.f136889b.f136933d++;
                    this.f136889b.f136931b = false;
                    SmartMLSceneServiceImpl.m109547a(false, -2, null, this.f136892e, this.f136889b);
                    return;
                }
                if (this.f136893f.getTrack() != null && SmartDataTrackerService.C60001b.f136657a.enable(this.f136894g)) {
                    SmartDataTrackerService.C60001b.f136657a.onScenePredictCheckOrRun(this.f136894g, this.f136891d, this.f136895h);
                }
                if (a != null) {
                    if (a.f136946a) {
                        a.f136952g.f136963a = System.currentTimeMillis();
                        a.f136947b++;
                    }
                    if (a.f136946a) {
                        a.f136953h.f136963a = System.currentTimeMillis();
                    }
                }
                SmartSceneConfig smartSceneConfig = this.f136893f;
                C60095h hVar = this.f136891d;
                AbstractC60088b bVar = this.f136895h;
                if (SmartMLSceneService.debug) {
                    System.currentTimeMillis();
                }
                C60087g gVar = new C60087g();
                if (smartSceneConfig.getFeatures() != null) {
                    HashMap hashMap = new HashMap();
                    SmartDataCenterApiService.C60070b.f136882a.fillInputFeatures(hashMap, smartSceneConfig.getFeatures(), hVar);
                    gVar.mo97622a().putAll(hashMap);
                }
                if (hVar != null) {
                    Map<String, ? extends Object> map = hVar.f136925a;
                    if (map != null) {
                        gVar.mo97622a().putAll(map);
                    }
                    float[] fArr = hVar.f136926b;
                    if (fArr != null) {
                        gVar.f136918b = fArr;
                    }
                    byte[] bArr = hVar.f136927c;
                    if (bArr != null) {
                        gVar.f136919c = bArr;
                    }
                }
                if (bVar != null) {
                    gVar.mo97622a();
                }
                if (SmartMLSceneService.debug) {
                    System.currentTimeMillis();
                    smartSceneConfig.getScene();
                }
                if (a != null && a.f136946a) {
                    a.f136953h.f136964b = System.currentTimeMillis();
                }
                this.f136890c.mo97615a(gVar, new AbstractC60081a(this) {
                    /* class com.p2082ss.android.ugc.aweme.p3452ml.infra.SmartMLSceneServiceImpl.RunnableC60074b.C600751 */

                    /* renamed from: a */
                    final /* synthetic */ RunnableC60074b f136897a;

                    static {
                        Covode.recordClassIndex(70574);
                    }

                    {
                        this.f136897a = r1;
                    }

                    @Override // com.p2082ss.android.ugc.aweme.p3452ml.infra.p3457a.AbstractC60081a
                    /* renamed from: a */
                    public final void mo97584a(boolean z, int i, C60100k kVar) {
                        Aweme aweme;
                        C60097j jVar = a;
                        if (jVar != null) {
                            C60095h hVar = this.f136897a.f136891d;
                            if (hVar == null || (aweme = hVar.f136928d) == null || aweme.getAid() == null) {
                                String.valueOf(this.f136897a.f136889b.f136932c);
                            }
                            AbstractC60086f fVar = this.f136897a.f136890c;
                            if (jVar.f136946a) {
                                jVar.f136952g.f136964b = System.currentTimeMillis();
                                jVar.f136954i = i;
                                if (!jVar.f136949d) {
                                    jVar.f136949d = true;
                                    if (AbstractC89255c.Default.nextFloat() < C59991f.f136641b) {
                                        C39162r.m79461a("ml_scene_init", jVar.mo97629a(fVar));
                                    }
                                }
                                if (AbstractC89255c.Default.nextFloat() < C59991f.f136642c) {
                                    JSONObject a = jVar.mo97630a(kVar, fVar);
                                    AbstractC60089c cVar = jVar.f136950e;
                                    if (cVar == null || !cVar.mo97624a(a)) {
                                        C39162r.m79461a("ml_scene_run", a);
                                    }
                                }
                            }
                        }
                        SmartMLSceneServiceImpl.m109547a(z, i, kVar, this.f136897a.f136892e, this.f136897a.f136889b);
                        this.f136897a.f136889b.f136931b = false;
                        if (!z) {
                            this.f136897a.f136889b.f136934e++;
                        }
                        if (SmartMLSceneService.debug) {
                            System.currentTimeMillis();
                        }
                    }
                });
            } catch (Throwable unused) {
                this.f136889b.f136931b = false;
                SmartMLSceneServiceImpl.m109547a(false, -6, null, this.f136892e, this.f136889b);
            }
        }
    }

    /* renamed from: a */
    public static void m109546a(C60096i iVar) {
        if (!iVar.f136935f) {
            C60097j a = iVar.mo97627a();
            if (a != null) {
                a.mo97631a();
            }
            AbstractC60086f fVar = iVar.f136930a;
            if (fVar != null) {
                fVar.mo97620c();
            }
            if (a != null) {
                a.mo97632b();
            }
            iVar.f136935f = true;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p3452ml.infra.ISmartMLSceneService
    public final boolean enable(String str) {
        C60096i iVar;
        AbstractC60086f fVar;
        if (str == null || str.length() == 0 || (iVar = this.f136887b.get(str)) == null || (fVar = iVar.f136930a) == null || !fVar.mo97621d()) {
            return false;
        }
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.p3452ml.infra.ISmartMLSceneService
    public final void ensureEnvAvailable(String str) {
        C60096i iVar;
        if (str != null && str.length() != 0 && (iVar = this.f136887b.get(str)) != null) {
            m109546a(iVar);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p3452ml.infra.ISmartMLSceneService
    public final int lastRunErrorCode(String str) {
        C60096i iVar;
        if (str == null || str.length() == 0 || (iVar = this.f136887b.get(str)) == null) {
            return -100;
        }
        return iVar.f136937h;
    }

    @Override // com.p2082ss.android.ugc.aweme.p3452ml.infra.ISmartMLSceneService
    public final C60100k lastSuccessRunResult(String str) {
        C60096i iVar;
        if (str == null || str.length() == 0 || (iVar = this.f136887b.get(str)) == null) {
            return null;
        }
        return iVar.f136938i;
    }

    @Override // com.p2082ss.android.ugc.aweme.p3452ml.infra.ISmartMLSceneService
    public final void setReportRunMonitorInterceptor(String str, AbstractC60089c cVar) {
        C60096i iVar;
        C60097j a;
        if (str != null && str.length() != 0 && (iVar = this.f136887b.get(str)) != null && (a = iVar.mo97627a()) != null) {
            a.f136950e = cVar;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p3452ml.infra.ISmartMLSceneService
    public final void configSceneModel(String str, SmartSceneConfig smartSceneConfig) {
        if (str == null || str.length() == 0 || smartSceneConfig == null || !TextUtils.equals(str, smartSceneConfig.getScene())) {
            if (SmartMLSceneService.debug) {
                new Throwable("params invalid, scene:".concat(String.valueOf(str)));
            }
        } else if (!this.f136887b.containsKey(str)) {
            this.f136887b.put(str, new C60096i(str, smartSceneConfig));
            SmartDataCenterApiService.C60070b.f136882a.addSceneModelConfig(smartSceneConfig.getFeatures());
            OneSmartDataTrackConfig track = smartSceneConfig.getTrack();
            if (track != null) {
                SmartDataTrackerService.C60001b.f136657a.configOneNewTrack(track);
            }
            C60096i iVar = this.f136887b.get(str);
            if (iVar != null) {
                iVar.mo97627a();
            }
        } else if (SmartMLSceneService.debug) {
            new Throwable("scene repeated, scene:".concat(String.valueOf(str)));
        }
    }

    /* renamed from: a */
    public static void m109547a(boolean z, int i, C60100k kVar, AbstractC60091e eVar, C60096i iVar) {
        if (iVar != null) {
            if (!z || kVar == null) {
                iVar.f136934e++;
            } else {
                iVar.f136938i = kVar;
                iVar.f136934e = 0;
            }
            iVar.f136936g = z;
            iVar.f136937h = i;
            iVar.f136932c++;
        }
        if (eVar != null) {
            eVar.mo97502a(z, kVar);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p3452ml.infra.ISmartMLSceneService
    public final void runDelay(String str, long j, C60095h hVar, AbstractC60088b bVar, AbstractC60091e eVar) {
        long j2;
        if (str == null || str.length() == 0) {
            m109547a(false, -1, null, eVar, null);
            return;
        }
        C60096i iVar = this.f136887b.get(str);
        if (iVar != null) {
            AbstractC60086f fVar = iVar.f136930a;
            SmartSceneConfig smartSceneConfig = iVar.f136940k;
            if (!(fVar == null || smartSceneConfig == null)) {
                if (!fVar.mo97619b()) {
                    iVar.f136933d++;
                    m109547a(false, -2, null, eVar, iVar);
                    return;
                } else if (iVar.f136934e > 16) {
                    iVar.f136932c++;
                    if (iVar.f136936g) {
                        if (eVar != null) {
                            eVar.mo97502a(iVar.f136936g, iVar.f136938i);
                            return;
                        }
                        return;
                    } else if (eVar != null) {
                        eVar.mo97502a(iVar.f136936g, null);
                        return;
                    } else {
                        return;
                    }
                } else {
                    iVar.f136931b = true;
                    if (SmartMLSceneService.debug) {
                        j2 = System.currentTimeMillis();
                    } else {
                        j2 = 0;
                    }
                    C59978d.m109499a(new RunnableC60074b(this, iVar, fVar, hVar, eVar, smartSceneConfig, str, bVar, j2), j);
                    return;
                }
            }
        }
        m109547a(false, -1, null, eVar, iVar);
    }
}
