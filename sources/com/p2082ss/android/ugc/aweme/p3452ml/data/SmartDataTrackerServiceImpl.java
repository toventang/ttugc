package com.p2082ss.android.ugc.aweme.p3452ml.data;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.C16048b;
import com.p2082ss.android.ugc.C81908b;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.p3452ml.api.AbstractC60013b;
import com.p2082ss.android.ugc.aweme.p3452ml.api.C60012a;
import com.p2082ss.android.ugc.aweme.p3452ml.api.ISmartDataTrackerService;
import com.p2082ss.android.ugc.aweme.p3452ml.api.MLCommonService;
import com.p2082ss.android.ugc.aweme.p3452ml.api.SmartDataTrackerService;
import com.p2082ss.android.ugc.aweme.p3452ml.infra.AbstractC60088b;
import com.p2082ss.android.ugc.aweme.p3452ml.infra.C60095h;
import com.p2082ss.android.ugc.aweme.p3452ml.infra.InputFeaturesConfig;
import com.p2082ss.android.ugc.aweme.p3452ml.infra.SmartDataCenterApiService;
import com.p2082ss.android.ugc.aweme.p3452ml.p3453a.C59978d;
import com.p2082ss.android.ugc.aweme.p3452ml.p3454ab.C59986a;
import com.p2082ss.android.ugc.aweme.p3452ml.p3454ab.OneSmartDataTrackConfig;
import com.p2082ss.android.ugc.aweme.p3452ml.p3454ab.SmartDataTrackConfig;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4617i.AbstractC89255c;

/* renamed from: com.ss.android.ugc.aweme.ml.data.SmartDataTrackerServiceImpl */
public final class SmartDataTrackerServiceImpl extends SmartDataTrackerService implements AbstractC60013b {

    /* renamed from: a */
    private Map<String, C60024a> f136718a = new ConcurrentHashMap();

    /* renamed from: b */
    private boolean f136719b;

    /* renamed from: c */
    private boolean f136720c;

    static {
        Covode.recordClassIndex(70488);
    }

    /* renamed from: com.ss.android.ugc.aweme.ml.data.SmartDataTrackerServiceImpl$a */
    public static final class C60024a {

        /* renamed from: a */
        public int f136721a;

        /* renamed from: b */
        public final LinkedList<C60025b> f136722b = new LinkedList<>();

        /* renamed from: c */
        public final int f136723c = 16;

        /* renamed from: d */
        public String f136724d;

        /* renamed from: e */
        public OneSmartDataTrackConfig f136725e;

        static {
            Covode.recordClassIndex(70489);
        }

        public final String toString() {
            return "(scene='" + this.f136724d + "', runCount:" + this.f136721a + " config:" + this.f136725e + ')';
        }

        public C60024a(String str, OneSmartDataTrackConfig oneSmartDataTrackConfig) {
            C89219l.m154721d(str, "");
            C89219l.m154721d(oneSmartDataTrackConfig, "");
            this.f136724d = str;
            this.f136725e = oneSmartDataTrackConfig;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ml.data.SmartDataTrackerServiceImpl$b */
    public static final class C60025b {

        /* renamed from: a */
        public String f136726a;

        /* renamed from: b */
        public JSONObject f136727b;

        /* renamed from: c */
        public int f136728c;

        static {
            Covode.recordClassIndex(70490);
        }

        public final String toString() {
            return "(key:" + this.f136726a + ", waitNextRealCnt=" + this.f136728c + ", jsonData=" + this.f136727b + ')';
        }

        public C60025b(String str, JSONObject jSONObject, int i) {
            this.f136726a = str;
            this.f136728c = i;
            this.f136727b = jSONObject;
        }
    }

    /* renamed from: a */
    public static ISmartDataTrackerService m109519a() {
        MethodCollector.m26663i(13096);
        Object a = C81908b.m141854a(ISmartDataTrackerService.class, false);
        if (a != null) {
            ISmartDataTrackerService iSmartDataTrackerService = (ISmartDataTrackerService) a;
            MethodCollector.m26664o(13096);
            return iSmartDataTrackerService;
        }
        if (C81908b.f183251cA == null) {
            synchronized (ISmartDataTrackerService.class) {
                try {
                    if (C81908b.f183251cA == null) {
                        C81908b.f183251cA = new SmartDataTrackerServiceImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(13096);
                    throw th;
                }
            }
        }
        SmartDataTrackerService smartDataTrackerService = (SmartDataTrackerService) C81908b.f183251cA;
        MethodCollector.m26664o(13096);
        return smartDataTrackerService;
    }

    @Override // com.p2082ss.android.ugc.aweme.p3452ml.api.ISmartDataTrackerService
    public final void checkAndInit() {
        List<OneSmartDataTrackConfig> configList;
        if (!this.f136719b) {
            this.f136719b = true;
            if (SmartDataTrackerService.debug) {
                System.currentTimeMillis();
            }
            if (!C59986a.f136626b) {
                C59986a.f136627c = (SmartDataTrackConfig) C16048b.m29633a().mo25416a(true, "smart_data_track_config_v2", SmartDataTrackConfig.class, C59986a.f136625a);
                C59986a.f136626b = true;
            }
            SmartDataTrackConfig smartDataTrackConfig = C59986a.f136627c;
            if (!(smartDataTrackConfig == null || (configList = smartDataTrackConfig.getConfigList()) == null)) {
                for (OneSmartDataTrackConfig oneSmartDataTrackConfig : configList) {
                    configOneNewTrack(oneSmartDataTrackConfig);
                }
            }
            if (SmartDataTrackerService.debug) {
                System.currentTimeMillis();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.ml.data.SmartDataTrackerServiceImpl$c */
    public static final class RunnableC60026c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ SmartDataTrackerServiceImpl f136729a;

        /* renamed from: b */
        final /* synthetic */ C60095h f136730b;

        /* renamed from: c */
        final /* synthetic */ InputFeaturesConfig f136731c;

        /* renamed from: d */
        final /* synthetic */ AbstractC60088b f136732d;

        /* renamed from: e */
        final /* synthetic */ C60024a f136733e;

        static {
            Covode.recordClassIndex(70491);
        }

        RunnableC60026c(SmartDataTrackerServiceImpl smartDataTrackerServiceImpl, C60095h hVar, InputFeaturesConfig inputFeaturesConfig, AbstractC60088b bVar, C60024a aVar) {
            this.f136729a = smartDataTrackerServiceImpl;
            this.f136730b = hVar;
            this.f136731c = inputFeaturesConfig;
            this.f136732d = bVar;
            this.f136733e = aVar;
        }

        public final void run() {
            String str;
            Map<String, ? extends Object> map;
            String str2;
            Aweme aweme;
            try {
                C60095h hVar = this.f136730b;
                String str3 = "";
                if (hVar == null || (aweme = hVar.f136928d) == null || (str = aweme.getAid()) == null) {
                    str = str3;
                }
                C60095h hVar2 = this.f136730b;
                if (!(hVar2 == null || (str2 = hVar2.f136929e) == null)) {
                    str3 = str2;
                }
                HashMap hashMap = new HashMap(128);
                SmartDataCenterApiService.C60070b.f136882a.fillInputFeatures(hashMap, this.f136731c, this.f136730b);
                C60095h hVar3 = this.f136730b;
                if (hVar3 != null) {
                    map = hVar3.f136925a;
                } else {
                    map = null;
                }
                SmartDataTrackerServiceImpl.m109520a(hashMap, map);
                if (this.f136732d != null) {
                    SmartDataTrackerServiceImpl.m109520a(hashMap, new HashMap());
                }
                JSONObject jSONObject = new JSONObject();
                JSONObject jSONObject2 = new JSONObject(hashMap);
                jSONObject.put("scene", this.f136733e.f136724d);
                jSONObject.put("track_type", this.f136733e.f136725e.getTrackType());
                jSONObject.put("enter_type", str3);
                jSONObject.put("run_key", str);
                jSONObject.put("predict", jSONObject2.toString());
                jSONObject.put("run_count", this.f136733e.f136721a);
                if (this.f136733e.f136722b.size() > this.f136733e.f136723c) {
                    this.f136733e.f136722b.removeFirst();
                }
                this.f136733e.f136722b.addLast(new C60025b(str, jSONObject, this.f136733e.f136725e.getNextRealCnt()));
                if (SmartDataTrackerService.debug) {
                    this.f136733e.f136725e.getTrackType();
                    this.f136733e.f136722b.size();
                    hashMap.size();
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ml.data.SmartDataTrackerServiceImpl$d */
    static final class RunnableC60027d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ SmartDataTrackerServiceImpl f136734a;

        /* renamed from: b */
        final /* synthetic */ C60024a f136735b;

        /* renamed from: c */
        final /* synthetic */ InputFeaturesConfig f136736c;

        /* renamed from: d */
        final /* synthetic */ C60095h f136737d;

        static {
            Covode.recordClassIndex(70492);
        }

        RunnableC60027d(SmartDataTrackerServiceImpl smartDataTrackerServiceImpl, C60024a aVar, InputFeaturesConfig inputFeaturesConfig, C60095h hVar) {
            this.f136734a = smartDataTrackerServiceImpl;
            this.f136735b = aVar;
            this.f136736c = inputFeaturesConfig;
            this.f136737d = hVar;
        }

        public final void run() {
            Map<String, ? extends Object> map;
            try {
                ArrayList arrayList = new ArrayList();
                Iterator<C60025b> it = this.f136735b.f136722b.iterator();
                while (it.hasNext()) {
                    C60025b next = it.next();
                    next.f136728c--;
                    if (next.f136728c <= 0) {
                        arrayList.add(next);
                    }
                }
                if (!arrayList.isEmpty()) {
                    HashMap hashMap = new HashMap(128);
                    SmartDataCenterApiService.C60070b.f136882a.fillInputFeatures(hashMap, this.f136736c, this.f136737d);
                    C60095h hVar = this.f136737d;
                    if (hVar != null) {
                        map = hVar.f136925a;
                    } else {
                        map = null;
                    }
                    SmartDataTrackerServiceImpl.m109520a(hashMap, map);
                    JSONObject jSONObject = new JSONObject(hashMap);
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        JSONObject jSONObject2 = ((C60025b) it2.next()).f136727b;
                        if (jSONObject2 != null) {
                            jSONObject2.put("real", jSONObject.toString());
                            C39162r.m79461a("ml_track_data_rpt", jSONObject2);
                        }
                    }
                    this.f136735b.f136722b.removeAll(arrayList);
                    if (SmartDataTrackerService.debug) {
                        this.f136735b.f136725e.getTrackType();
                        this.f136735b.f136722b.size();
                    }
                }
            } catch (Throwable unused) {
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p3452ml.api.ISmartDataTrackerService
    public final boolean enable(String str) {
        if (str == null || !this.f136718a.containsKey(str)) {
            return false;
        }
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.p3452ml.api.ISmartDataTrackerService
    public final void configOneNewTrack(OneSmartDataTrackConfig oneSmartDataTrackConfig) {
        String scene;
        if (oneSmartDataTrackConfig != null && (scene = oneSmartDataTrackConfig.getScene()) != null && !this.f136718a.containsKey(scene)) {
            this.f136718a.put(scene, new C60024a(scene, oneSmartDataTrackConfig));
            SmartDataCenterApiService.C60070b.f136882a.addSceneModelConfig(oneSmartDataTrackConfig.getPredict());
            SmartDataCenterApiService.C60070b.f136882a.addSceneModelConfig(oneSmartDataTrackConfig.getReal());
            if (!this.f136720c) {
                this.f136720c = true;
                MLCommonService.C59997b.f136653a.addCommonEventListener("play_prepare", this);
                MLCommonService.C59997b.f136653a.addCommonEventListener("play_first_frame", this);
                MLCommonService.C59997b.f136653a.addCommonEventListener("play_call_playtime", this);
            }
        }
    }

    /* renamed from: a */
    public static void m109520a(Map<String, Object> map, Map<String, ? extends Object> map2) {
        if (map2 != null) {
            for (Map.Entry<String, ? extends Object> entry : map2.entrySet()) {
                Object value = entry.getValue();
                if (value != null) {
                    if (value instanceof Number) {
                        map.put(entry.getKey(), value);
                    } else if (value instanceof String) {
                        map.put(entry.getKey(), value);
                    } else if ((value instanceof float[]) && ((float[]) value).length < 16) {
                        map.put(entry.getKey(), value);
                    } else if ((value instanceof double[]) && ((double[]) value).length < 16) {
                        map.put(entry.getKey(), value);
                    } else if ((value instanceof int[]) && ((int[]) value).length < 16) {
                        map.put(entry.getKey(), value);
                    } else if ((value instanceof long[]) && ((long[]) value).length < 16) {
                        map.put(entry.getKey(), value);
                    }
                }
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p3452ml.api.AbstractC60013b
    /* renamed from: a */
    public final void mo97476a(String str, C60012a aVar) {
        User author;
        C89219l.m154721d(str, "");
        if (SmartDataTrackerService.debug) {
            if (aVar != null) {
                Aweme aweme = aVar.f136672d;
                if (aweme != null) {
                    aweme.getAid();
                }
                Aweme aweme2 = aVar.f136672d;
                if (!(aweme2 == null || (author = aweme2.getAuthor()) == null)) {
                    author.getNickname();
                }
            } else {
                return;
            }
        } else if (aVar == null) {
            return;
        }
        int hashCode = str.hashCode();
        if (hashCode != -1704536429) {
            if (hashCode != 1168529143) {
                if (hashCode == 1274399484 && str.equals("play_prepare")) {
                    for (Map.Entry<String, C60024a> entry : this.f136718a.entrySet()) {
                        OneSmartDataTrackConfig oneSmartDataTrackConfig = entry.getValue().f136725e;
                        String key = entry.getKey();
                        if (oneSmartDataTrackConfig.getTrackType() == 100) {
                            C60095h hVar = new C60095h();
                            hVar.f136928d = aVar.f136672d;
                            hVar.f136929e = aVar.f136673e;
                            onScenePredictCheckOrRun(key, hVar, null);
                        }
                    }
                }
            } else if (str.equals("play_call_playtime")) {
                for (Map.Entry<String, C60024a> entry2 : this.f136718a.entrySet()) {
                    OneSmartDataTrackConfig oneSmartDataTrackConfig2 = entry2.getValue().f136725e;
                    String key2 = entry2.getKey();
                    C60095h hVar2 = new C60095h();
                    hVar2.f136928d = aVar.f136672d;
                    hVar2.f136929e = aVar.f136673e;
                    if (oneSmartDataTrackConfig2.getTrackType() == 101) {
                        onScenePredictCheckOrRun(key2, hVar2, null);
                    }
                    if (key2 != null) {
                        try {
                            C60024a aVar2 = this.f136718a.get(key2);
                            if (aVar2 != null) {
                                OneSmartDataTrackConfig oneSmartDataTrackConfig3 = aVar2.f136725e;
                                InputFeaturesConfig real = oneSmartDataTrackConfig3 != null ? oneSmartDataTrackConfig3.getReal() : null;
                                LinkedList<C60025b> linkedList = aVar2.f136722b;
                                if (linkedList != null) {
                                    if (!linkedList.isEmpty()) {
                                        if (real != null) {
                                            C59978d.m109498a(new RunnableC60027d(this, aVar2, real, hVar2));
                                        }
                                    }
                                }
                            }
                        } catch (Throwable unused) {
                        }
                    }
                }
            }
        } else if (str.equals("play_first_frame")) {
            for (Map.Entry<String, C60024a> entry3 : this.f136718a.entrySet()) {
                OneSmartDataTrackConfig oneSmartDataTrackConfig4 = entry3.getValue().f136725e;
                String key3 = entry3.getKey();
                if (oneSmartDataTrackConfig4.getTrackType() == 102) {
                    C60095h hVar3 = new C60095h();
                    hVar3.f136928d = aVar.f136672d;
                    hVar3.f136929e = aVar.f136673e;
                    onScenePredictCheckOrRun(key3, hVar3, null);
                }
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p3452ml.api.ISmartDataTrackerService
    public final void onScenePredictCheckOrRun(String str, C60095h hVar, AbstractC60088b bVar) {
        if (hVar != null && str != null) {
            try {
                C60024a aVar = this.f136718a.get(str);
                if (aVar != null) {
                    aVar.f136721a++;
                    if (AbstractC89255c.Default.nextFloat() < aVar.f136725e.getReportRate()) {
                        OneSmartDataTrackConfig oneSmartDataTrackConfig = aVar.f136725e;
                        if (oneSmartDataTrackConfig != null) {
                            InputFeaturesConfig predict = oneSmartDataTrackConfig.getPredict();
                            if (predict != null) {
                                C59978d.m109498a(new RunnableC60026c(this, hVar, predict, bVar, aVar));
                            }
                        }
                    }
                }
            } catch (Throwable unused) {
            }
        }
    }
}
