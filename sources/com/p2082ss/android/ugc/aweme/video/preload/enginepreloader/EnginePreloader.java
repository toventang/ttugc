package com.p2082ss.android.ugc.aweme.video.preload.enginepreloader;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Pair;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.p2082ss.android.ugc.aweme.lancet.C58016d;
import com.p2082ss.android.ugc.aweme.p2441cf.p2442a.C35469d;
import com.p2082ss.android.ugc.aweme.p2690cr.AbstractC40381g;
import com.p2082ss.android.ugc.aweme.p2690cr.C40353e;
import com.p2082ss.android.ugc.aweme.player.sdk.p3552a.C63028o;
import com.p2082ss.android.ugc.aweme.player.sdk.p3552a.C63029p;
import com.p2082ss.android.ugc.aweme.player.sdk.p3553b.AbstractC63057c;
import com.p2082ss.android.ugc.aweme.player.sdk.p3553b.C63059e;
import com.p2082ss.android.ugc.aweme.video.preload.AbstractC80872d;
import com.p2082ss.android.ugc.aweme.video.preload.AbstractC80914f;
import com.p2082ss.android.ugc.aweme.video.preload.AbstractC80915g;
import com.p2082ss.android.ugc.aweme.video.preload.AbstractC80918i;
import com.p2082ss.android.ugc.aweme.video.preload.AbstractC80921k;
import com.p2082ss.android.ugc.aweme.video.preload.AbstractC80929n;
import com.p2082ss.android.ugc.aweme.video.preload.C80922l;
import com.p2082ss.android.ugc.aweme.video.preload.C80923m;
import com.p2082ss.android.ugc.aweme.video.preload.C80933o;
import com.p2082ss.android.ugc.aweme.video.preload.EnumC80868c;
import com.p2082ss.android.ugc.aweme.video.preload.IVideoPreloadConfig;
import com.p2082ss.android.ugc.aweme.video.preload.PreloadSessionManager;
import com.p2082ss.android.ugc.aweme.video.preload.api.AbstractC80846e;
import com.p2082ss.android.ugc.aweme.video.preload.api.AbstractC80853k;
import com.p2082ss.android.ugc.aweme.video.preload.p4216c.RunnableC80869a;
import com.p2082ss.android.ugc.p4261f.p4262a.p4263a.p4264a.p4265a.AbstractC81964c;
import com.p2082ss.android.ugc.playerkit.exp.C84191b;
import com.p2082ss.android.ugc.playerkit.model.C84198b;
import com.p2082ss.android.ugc.playerkit.model.C84199c;
import com.p2082ss.android.ugc.playerkit.model.C84202f;
import com.p2082ss.android.ugc.playerkit.model.C84207k;
import com.p2082ss.android.ugc.playerkit.model.C84223u;
import com.p2082ss.android.ugc.playerkit.model.C84224v;
import com.p2082ss.android.ugc.playerkit.model.C84227x;
import com.p2082ss.android.ugc.playerkit.p4324d.C84186a;
import com.p2082ss.android.ugc.playerkit.p4324d.C84189d;
import com.p2082ss.android.ugc.playerkit.session.C84229a;
import com.p2082ss.android.ugc.playerkit.simapicommon.C84231a;
import com.p2082ss.android.ugc.playerkit.simapicommon.p4325a.C84237e;
import com.p2082ss.android.ugc.playerkit.simapicommon.p4325a.C84241i;
import com.p2082ss.android.ugc.playerkit.videoview.p4326a.C84253c;
import com.p2082ss.mediakit.medialoader.AVMDLCopyOperation;
import com.p2082ss.mediakit.medialoader.AVMDLCopyOperationListener;
import com.p2082ss.mediakit.medialoader.LoaderEventInfo;
import com.p2082ss.mediakit.medialoader.LoaderListener;
import com.p2082ss.ttvideoengine.AbstractC86424f;
import com.p2082ss.ttvideoengine.C86313ai;
import com.p2082ss.ttvideoengine.C86385d;
import com.p2082ss.ttvideoengine.C86611q;
import com.p2082ss.ttvideoengine.C86648u;
import com.p2082ss.ttvideoengine.EnumC86649v;
import com.p2082ss.ttvideoengine.p4408b.C86367a;
import com.p2082ss.ttvideoengine.p4417j.AbstractC86517e;
import com.p2082ss.ttvideoengine.p4417j.C86534o;
import com.p2082ss.ttvideoengine.p4417j.C86535p;
import com.p2082ss.ttvideoengine.p4421n.p4423b.AbstractC86586h;
import com.p2082ss.ttvideoengine.p4421n.p4424c.AbstractC86592c;
import com.p2082ss.ttvideoengine.p4430s.C86641i;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.video.preload.enginepreloader.EnginePreloader */
public class EnginePreloader implements AbstractC80915g {

    /* renamed from: n */
    private static int f180817n = -1;

    /* renamed from: o */
    private static final String f180818o = AbstractC80918i.EnumC80919a.MediaLoader.getCacheDirName();

    /* renamed from: A */
    private Map<String, String> f180819A;

    /* renamed from: B */
    private AbstractC86592c f180820B = new AbstractC86592c() {
        /* class com.p2082ss.android.ugc.aweme.video.preload.enginepreloader.EnginePreloader.C808752 */

        static {
            Covode.recordClassIndex(94174);
        }

        @Override // com.p2082ss.ttvideoengine.p4421n.p4424c.AbstractC86592c
        /* renamed from: a */
        public final void mo101152a(AbstractC86517e eVar, Map<String, String> map, int i, Object obj) {
            if (eVar != null) {
                String b = eVar.mo137744b(2);
                if (!TextUtils.isEmpty(b) && i == 2) {
                    C63059e a = C63028o.m113705a(map, EnginePreloader.this.f180834k.get(b));
                    new StringBuilder("preload onAfterSelect videoModel ").append(eVar).append(" sourceId ").append(b).append(" params ").append(map).append(" wrapper ").append(a).append(" selectType ").append(i).append(" userData ").append(obj);
                    if (a != null) {
                        EnginePreloader.this.f180835l.getBitrateSelectListener().mo101045b(2, i, a);
                        EnginePreloader.this.f180835l.getBitrateSelectListener().mo101043a(2, i, a.f143244i);
                        map.put("video_bitrarte_user_selected", String.valueOf(a.f143244i.f143252a));
                    }
                    PreloadSessionManager.PreloadSession b2 = PreloadSessionManager.f180657a.mo124004b(b);
                    String str = map.get("speed");
                    if (!TextUtils.isEmpty(str)) {
                        try {
                            b2.speed = Integer.parseInt(str);
                        } catch (Throwable unused) {
                        }
                    }
                    int i2 = 0;
                    String str2 = map.get("video_bitrarte");
                    if (!TextUtils.isEmpty(str2)) {
                        try {
                            i2 = Integer.parseInt(str2);
                        } catch (Throwable unused2) {
                        }
                    }
                    String str3 = "";
                    List<C86534o> b3 = eVar.mo137745b();
                    if (b3 != null && b3.size() > 0) {
                        for (C86534o oVar : b3) {
                            if (oVar != null && i2 == oVar.mo137724a(3)) {
                                str3 = oVar.mo137726b(15);
                            }
                        }
                    }
                    if (!TextUtils.isEmpty(str3)) {
                        if (!TextUtils.isEmpty(str3) && !TextUtils.isEmpty(b)) {
                            EnginePreloader.this.mo124237a(str3, b);
                        }
                        EnginePreloader.m140309g();
                    }
                }
            }
        }
    };

    /* renamed from: C */
    private String f180821C = null;

    /* renamed from: D */
    private LoaderListener f180822D = new LoaderListener() {
        /* class com.p2082ss.android.ugc.aweme.video.preload.enginepreloader.EnginePreloader.C808763 */

        static {
            Covode.recordClassIndex(94175);
        }

        @Override // com.p2082ss.mediakit.medialoader.LoaderListener
        public final void onLoaderTaskCancel(final LoaderEventInfo loaderEventInfo) {
            C84231a.f188311c.post(new Runnable() {
                /* class com.p2082ss.android.ugc.aweme.video.preload.enginepreloader.EnginePreloader.C808763.RunnableC808793 */

                static {
                    Covode.recordClassIndex(94178);
                }

                public final void run() {
                    for (WeakReference<AbstractC80914f> weakReference : EnginePreloader.this.f180824a) {
                        EnginePreloader.m140304a(weakReference.get(), 2, loaderEventInfo);
                    }
                }
            });
        }

        @Override // com.p2082ss.mediakit.medialoader.LoaderListener
        public final void onLoaderTaskCompleted(final LoaderEventInfo loaderEventInfo) {
            C84231a.f188311c.post(new Runnable() {
                /* class com.p2082ss.android.ugc.aweme.video.preload.enginepreloader.EnginePreloader.C808763.RunnableC808782 */

                static {
                    Covode.recordClassIndex(94177);
                }

                public final void run() {
                    for (WeakReference<AbstractC80914f> weakReference : EnginePreloader.this.f180824a) {
                        EnginePreloader.m140304a(weakReference.get(), 1, loaderEventInfo);
                    }
                }
            });
        }

        @Override // com.p2082ss.mediakit.medialoader.LoaderListener
        public final void onLoaderTaskStart(final LoaderEventInfo loaderEventInfo) {
            C84231a.f188311c.post(new Runnable() {
                /* class com.p2082ss.android.ugc.aweme.video.preload.enginepreloader.EnginePreloader.C808763.RunnableC808771 */

                static {
                    Covode.recordClassIndex(94176);
                }

                public final void run() {
                    for (WeakReference<AbstractC80914f> weakReference : EnginePreloader.this.f180824a) {
                        EnginePreloader.m140304a(weakReference.get(), 0, loaderEventInfo);
                    }
                }
            });
        }
    };

    /* renamed from: E */
    private final ConcurrentHashMap<String, C84253c> f180823E = new ConcurrentHashMap<>();

    /* renamed from: a */
    public final List<WeakReference<AbstractC80914f>> f180824a = new CopyOnWriteArrayList();

    /* renamed from: b */
    C80922l f180825b;

    /* renamed from: c */
    C80886a f180826c;

    /* renamed from: d */
    public Handler f180827d = new Handler(Looper.getMainLooper());

    /* renamed from: e */
    public Map<String, List<C84224v>> f180828e = Collections.synchronizedMap(new LinkedHashMap<String, List<C84224v>>() {
        /* class com.p2082ss.android.ugc.aweme.video.preload.enginepreloader.EnginePreloader.C808741 */

        static {
            Covode.recordClassIndex(94173);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.util.Map$Entry] */
        /* access modifiers changed from: protected */
        @Override // java.util.LinkedHashMap
        public final boolean removeEldestEntry(Map.Entry<String, List<C84224v>> entry) {
            if (size() > 15) {
                return true;
            }
            return false;
        }
    });

    /* renamed from: f */
    public ConcurrentHashMap<String, String> f180829f = new ConcurrentHashMap<>();

    /* renamed from: g */
    final List<AbstractC80921k> f180830g = new CopyOnWriteArrayList();

    /* renamed from: h */
    volatile String f180831h;

    /* renamed from: i */
    public Map<String, Integer> f180832i = new ConcurrentHashMap();

    /* renamed from: j */
    public Map<String, C84241i> f180833j = new ConcurrentHashMap();

    /* renamed from: k */
    public final Map<String, C63059e> f180834k = new ConcurrentHashMap();

    /* renamed from: l */
    public final IVideoPreloadConfig f180835l = C80933o.m140451a();

    /* renamed from: m */
    public AbstractC80897f f180836m;

    /* renamed from: p */
    private volatile boolean f180837p;

    /* renamed from: q */
    private volatile boolean f180838q;

    /* renamed from: r */
    private int f180839r;

    /* renamed from: s */
    private boolean f180840s;

    /* renamed from: t */
    private Handler f180841t;

    /* renamed from: u */
    private File f180842u;

    /* renamed from: v */
    private volatile boolean f180843v;

    /* renamed from: w */
    private volatile boolean f180844w = false;

    /* renamed from: x */
    private int f180845x = 819200;

    /* renamed from: y */
    private volatile boolean f180846y = false;

    /* renamed from: z */
    private ConcurrentLinkedQueue<String> f180847z = new ConcurrentLinkedQueue<>();

    @Override // com.p2082ss.android.ugc.aweme.video.preload.AbstractC80915g
    /* renamed from: d */
    public final String mo124020d() {
        return "engine";
    }

    @Override // com.p2082ss.android.ugc.aweme.video.preload.AbstractC80915g
    /* renamed from: e */
    public final C80923m mo124022e(C84241i iVar) {
        return null;
    }

    @Override // com.p2082ss.android.ugc.aweme.video.preload.AbstractC80915g
    /* renamed from: f */
    public final boolean mo124025f() {
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.video.preload.AbstractC80915g
    /* renamed from: h */
    public final List<C84227x> mo124028h(C84241i iVar) {
        return null;
    }

    @Override // com.p2082ss.android.ugc.aweme.video.preload.AbstractC80915g
    /* renamed from: a */
    public final boolean mo124012a(C84241i iVar) {
        if (iVar == null) {
            return false;
        }
        String bitRatedRatioUri = iVar.getBitRatedRatioUri();
        if (!TextUtils.isEmpty(iVar.getDashVideoId())) {
            C86535p b = C80887a.m140363b(iVar.getDashVideoId());
            if (b == null || C80887a.m140360a(b) <= 0) {
                return false;
            }
            return true;
        } else if (C84191b.m144794u()) {
            if (m140307d(bitRatedRatioUri) > 0) {
                return true;
            }
            return false;
        } else if (C86385d.C86400h.f193679a.mo137394j(bitRatedRatioUri) != null) {
            return true;
        } else {
            return false;
        }
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x05f8, code lost:
        if (r7 != null) goto L_0x05ff;
     */
    /* JADX WARNING: Removed duplicated region for block: B:182:0x0951  */
    /* JADX WARNING: Removed duplicated region for block: B:185:0x0964  */
    /* JADX WARNING: Removed duplicated region for block: B:278:0x0cc0  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00de A[Catch:{ all -> 0x0ce5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x02af A[Catch:{ all -> 0x0ce5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x04f1 A[Catch:{ all -> 0x0ce5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x04f8 A[Catch:{ all -> 0x0ce5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x04fe A[Catch:{ all -> 0x0ce5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x053d A[Catch:{ all -> 0x0ce5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x05d7 A[Catch:{ all -> 0x0ce5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x05df A[Catch:{ all -> 0x0ce5 }] */
    @Override // com.p2082ss.android.ugc.aweme.video.preload.AbstractC80915g
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo124011a() {
        /*
        // Method dump skipped, instructions count: 3336
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.video.preload.enginepreloader.EnginePreloader.mo124011a():boolean");
    }

    @Override // com.p2082ss.android.ugc.aweme.video.preload.AbstractC80915g
    /* renamed from: a */
    public final void mo124010a(Map<String, String> map) {
        if (this.f180837p) {
            m140306b(map);
        } else {
            this.f180819A = map;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.video.preload.AbstractC80915g
    /* renamed from: a */
    public final boolean mo124014a(List<C84241i> list, int i, List<C84241i> list2, int i2) {
        if (this.f180835l.isPlayerPreferchCaption() && list != null && !list.isEmpty()) {
            for (C84241i iVar : list) {
                if (iVar != null) {
                    String sourceId = iVar.getSourceId();
                    C1764a.m5928a("addTask: key:%s, vid:%s, limit:%s", new Object[]{sourceId, sourceId, Integer.valueOf(i)});
                    C86313ai.m148644a(sourceId, sourceId, iVar.getUrlList().get(0), (long) i);
                    mo124236a(iVar, i, sourceId);
                    this.f180836m.mo124295a(iVar, i);
                }
            }
        }
        if (this.f180835l.isPlayerPreferchTtsAudio() && list2 != null && !list2.isEmpty()) {
            if (this.f180835l.playerPreferchTtsAudioSize() > 0) {
                i2 = this.f180835l.playerPreferchTtsAudioSize();
            }
            for (C84241i iVar2 : list2) {
                if (iVar2 != null) {
                    String sourceId2 = iVar2.getSourceId();
                    C1764a.m5928a("addTask: key:%s, vid:%s, limit:%s", new Object[]{sourceId2, sourceId2, Integer.valueOf(i2)});
                    C86313ai.m148644a(sourceId2, sourceId2, iVar2.getUrlList().get(0), (long) i2);
                    mo124236a(iVar2, i2, sourceId2);
                    this.f180836m.mo124295a(iVar2, i2);
                }
            }
        }
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.video.preload.AbstractC80915g
    /* renamed from: a */
    public final boolean mo124013a(final C84241i iVar, int i, final AbstractC80929n nVar, AbstractC80915g.C80916a aVar) {
        final int i2;
        final boolean z;
        iVar.getSourceId();
        iVar.getBitRatedRatioUri();
        m140309g();
        boolean z2 = false;
        z2 = false;
        z2 = false;
        z2 = false;
        z2 = false;
        z2 = false;
        z2 = false;
        z2 = false;
        z2 = false;
        int i3 = 0;
        z2 = false;
        z2 = false;
        z2 = false;
        z2 = false;
        if (this.f180837p && iVar != null) {
            final String sourceId = iVar.getSourceId();
            if (!(i == -1 || i == 0) || (i2 = this.f180839r) <= 0) {
                i2 = i;
            }
            final PreloadSessionManager.PreloadSession b = PreloadSessionManager.f180657a.mo124004b(iVar.getSourceId());
            if (b == null) {
                b = PreloadSessionManager.f180657a.mo124003a(iVar.getSourceId());
                z = true;
            } else {
                z = false;
            }
            int h = mo124239h();
            String str = null;
            if (iVar.isColdBoot()) {
                if (TextUtils.isEmpty(iVar.getDashVideoModelStr())) {
                    C84223u selectedBitrateForColdBoot = this.f180835l.getSelectedBitrateForColdBoot(iVar);
                    if (!(selectedBitrateForColdBoot == null || selectedBitrateForColdBoot.f188230a == null)) {
                        String str2 = selectedBitrateForColdBoot.f188235f;
                        C84229a.f188297a.mo129049a(str2, selectedBitrateForColdBoot.f188236g);
                        if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(sourceId)) {
                            mo124237a(str2, sourceId);
                        }
                        if (selectedBitrateForColdBoot.f188230a instanceof String) {
                            str = (String) selectedBitrateForColdBoot.f188230a;
                        }
                        if (!TextUtils.isEmpty(str)) {
                            C86313ai.m148645a(str2, str2, new String[]{str}, (long) i2, mo124235a(nVar.f180956a));
                            mo124236a(iVar, i2, str2);
                            this.f180836m.mo124295a(iVar, i2);
                            z2 = true;
                        }
                    }
                } else {
                    try {
                        C86535p a = C80887a.m140361a(iVar.getDashVideoModelStr());
                        if (!(a == null || a.f194859d == null)) {
                            String str3 = a.f194859d.f194919h;
                            if (!TextUtils.isEmpty(str3) && !TextUtils.isEmpty(sourceId)) {
                                mo124237a(str3, sourceId);
                            }
                            m140309g();
                            iVar.setDashVideoId(str3);
                            C80887a.m140362a(str3, a);
                            C84229a.f188297a.mo129053c(sourceId, a.f194859d.f194919h);
                            EnumC86649v a2 = C80903j.m140383a(this.f180835l.getProperResolution(sourceId, new C63029p(a)));
                            if (a2 == null || a2 == EnumC86649v.Undefine) {
                                a2 = C86313ai.m148635a(a, C80887a.f180873a, 1, (AbstractC86586h) null);
                            }
                            iVar.getSourceId();
                            C86385d dVar = C86385d.C86400h.f193679a;
                            C86648u uVar = new C86648u(a, a2, (long) i);
                            uVar.f195295j = null;
                            dVar.mo137368a(uVar);
                            mo124236a(iVar, i, iVar.getDashVideoId());
                            this.f180836m.mo124295a(iVar, i2);
                        }
                    } catch (Throwable unused) {
                    }
                }
            } else if (TextUtils.isEmpty(iVar.getDashVideoModelStr())) {
                if (!this.f180840s) {
                    C84253c a3 = this.f180835l.createVideoUrlProcessor().mo124208a(iVar, C84199c.f187979a.getPlayerType());
                    if (a3 == null || a3.f188430a == null || a3.f188430a.length <= 0) {
                        m140309g();
                    } else {
                        m140309g();
                        C84229a.f188297a.mo129049a(a3.f188432c, a3.f188434e);
                        if (this.f180835l.getExperiment().PlayerAbMedialoaderEnablePreconneExp() == 1) {
                            for (String str4 : a3.f188430a) {
                                m140308e(str4);
                            }
                        }
                        int PlayerAbPreloadSizeOffsetThresholdExp = this.f180835l.getExperiment().PlayerAbPreloadSizeOffsetThresholdExp();
                        long j = (long) i2;
                        if (iVar.getSize() > j && iVar.getSize() - j <= ((long) PlayerAbPreloadSizeOffsetThresholdExp)) {
                            i2 = (int) iVar.getSize();
                        }
                        iVar.getSourceId();
                        String str5 = a3.f188432c;
                        if (!TextUtils.isEmpty(str5) && !TextUtils.isEmpty(sourceId)) {
                            mo124237a(str5, sourceId);
                        }
                        C86313ai.m148645a(a3.f188432c, a3.f188432c, a3.f188430a, (long) i2, mo124235a(nVar.f180956a));
                        mo124236a(iVar, i2, a3.f188432c);
                        this.f180836m.mo124295a(iVar, i2);
                    }
                } else {
                    String uri = iVar.getUri();
                    m140309g();
                    if (this.f180835l.getExperiment().PlayerAbMedialoaderEnablePreconneExp() == 1) {
                        List<String> urlList = iVar.getUrlList();
                        if (iVar.getBitRate() != null && iVar.getBitRate().size() > 0) {
                            urlList = iVar.getBitRate().get(0).urlList();
                        }
                        if (urlList != null) {
                            for (String str6 : urlList) {
                                m140308e(str6);
                            }
                        }
                    }
                    C808858 r16 = !m140312k() ? new AbstractC86424f() {
                        /* class com.p2082ss.android.ugc.aweme.video.preload.enginepreloader.EnginePreloader.C808858 */

                        /* renamed from: a */
                        C84253c f180865a;

                        static {
                            Covode.recordClassIndex(94184);
                        }

                        @Override // com.p2082ss.ttvideoengine.AbstractC86424f
                        /* renamed from: d */
                        public final String mo124264d() {
                            return EnginePreloader.this.mo124235a(nVar.f180956a);
                        }

                        @Override // com.p2082ss.ttvideoengine.AbstractC86424f
                        /* renamed from: a */
                        public final String[] mo124261a() {
                            if (this.f180865a == null) {
                                int h = EnginePreloader.this.mo124239h();
                                this.f180865a = EnginePreloader.this.f180835l.createVideoUrlProcessor().mo124208a(iVar, C84199c.f187979a.getPlayerType());
                                if (b != null && (EnginePreloader.this.mo124018c(iVar) <= 0 || z)) {
                                    b.speed = h;
                                }
                            }
                            C84253c cVar = this.f180865a;
                            if (cVar != null) {
                                return cVar.f188430a;
                            }
                            return null;
                        }

                        @Override // com.p2082ss.ttvideoengine.AbstractC86424f
                        /* renamed from: c */
                        public final String mo124263c() {
                            String str;
                            if (this.f180865a == null) {
                                mo124261a();
                            }
                            EnginePreloader.this.mo124236a(iVar, i2, this.f180865a.f188432c);
                            C84253c cVar = this.f180865a;
                            if (cVar != null) {
                                str = cVar.f188432c;
                            } else {
                                str = null;
                            }
                            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(sourceId)) {
                                EnginePreloader.this.mo124237a(str, sourceId);
                            }
                            EnginePreloader.m140309g();
                            return str;
                        }

                        @Override // com.p2082ss.ttvideoengine.AbstractC86424f
                        /* renamed from: b */
                        public final long mo124262b() {
                            if (this.f180865a == null) {
                                mo124261a();
                            }
                            int i = i2;
                            if (this.f180865a != null) {
                                int PlayerAbPreloadSizeOffsetThresholdExp = EnginePreloader.this.f180835l.getExperiment().PlayerAbPreloadSizeOffsetThresholdExp();
                                if (this.f180865a.f188433d != null) {
                                    if (this.f180865a.f188433d.getSize() > i2 && this.f180865a.f188433d.getSize() - i2 <= PlayerAbPreloadSizeOffsetThresholdExp) {
                                        i = this.f180865a.f188433d.getSize();
                                    }
                                } else if (iVar.getSize() > ((long) i2) && iVar.getSize() - ((long) i2) <= ((long) PlayerAbPreloadSizeOffsetThresholdExp)) {
                                    i = (int) iVar.getSize();
                                }
                            }
                            EnginePreloader.m140309g();
                            return (long) i;
                        }
                    } : null;
                    iVar.getSourceId();
                    List<C84237e> bitRate = iVar.getBitRate();
                    bitRate.size();
                    for (int i4 = 0; i4 < bitRate.size(); i4++) {
                        List<String> urlList2 = bitRate.get(i4).urlList();
                        if (urlList2 != null && urlList2.size() > 0) {
                            bitRate.get(i4).urlList().get(0);
                            C86385d dVar2 = C86385d.C86400h.f193679a;
                            String str7 = bitRate.get(i4).urlList().get(0);
                            if (dVar2.f193572d != 0 || TextUtils.isEmpty(str7)) {
                                C86641i.m150113b("DataLoaderHelper", "[predown]  state or url is invalid, not allow predown");
                            } else if (dVar2.f193579k.mLoaderType <= 0) {
                                C86641i.m150113b("DataLoaderHelper", "[predown]  loader type is http, not allow predown");
                            } else {
                                dVar2.f193586r.lock();
                                try {
                                    C86641i.m150113b("DataLoaderHelper", "[predown] start predown for url: ".concat(String.valueOf(str7)));
                                    if (dVar2.f193578j != null) {
                                        dVar2.f193578j.p2pPredown(str7);
                                    }
                                    C86641i.m150113b("DataLoaderHelper", "[predown] end predown for url");
                                } finally {
                                    dVar2.f193586r.unlock();
                                }
                            }
                        }
                    }
                    if (m140312k()) {
                        C63059e a4 = m140301a(iVar, (AbstractC63057c) null);
                        if (a4 != null) {
                            C86648u uVar2 = new C86648u(C63028o.m113707a(a4), EnumC86649v.Auto, (long) i2);
                            uVar2.f195294i = 1;
                            C86385d.C86400h.f193679a.mo137368a(uVar2);
                        }
                    } else {
                        C86611q qVar = new C86611q(uri, uri, (long) i2, r16, mo124235a(nVar.f180956a));
                        if (aVar != null) {
                            if (aVar.f180913a == 1) {
                                qVar.f195154g = 100;
                            } else if (aVar.f180913a == 2) {
                                qVar.f195154g = 10000;
                            }
                        }
                        Object[] objArr = new Object[4];
                        objArr[0] = uri;
                        objArr[1] = uri;
                        objArr[2] = Integer.valueOf(i2);
                        if (aVar != null) {
                            i3 = aVar.f180913a;
                        }
                        objArr[3] = Integer.valueOf(i3);
                        C1764a.m5928a("addTask: key:%s, vid:%s, limit:%s, priority:%s", objArr);
                        C86385d.C86400h.f193679a.mo137367a(qVar);
                    }
                    mo124236a(iVar, i2, uri);
                    this.f180836m.mo124295a(iVar, i2);
                }
                z2 = true;
            } else {
                C86535p a5 = C80887a.m140361a(iVar.getDashVideoModelStr());
                if (!(a5 == null || a5.f194859d == null)) {
                    String str8 = a5.f194859d.f194919h;
                    if (!TextUtils.isEmpty(str8) && !TextUtils.isEmpty(sourceId)) {
                        mo124237a(str8, sourceId);
                    }
                    m140309g();
                    iVar.setDashVideoId(str8);
                    C80887a.m140362a(str8, a5);
                    C84229a.f188297a.mo129053c(sourceId, a5.f194859d.f194919h);
                    EnumC86649v a6 = C80903j.m140383a(this.f180835l.getProperResolution(sourceId, new C63029p(a5)));
                    if (m140312k()) {
                        a6 = EnumC86649v.Auto;
                    } else if (a6 == null || a6 == EnumC86649v.Undefine) {
                        a6 = C86313ai.m148635a(a5, C80887a.f180873a, 1, (AbstractC86586h) null);
                    }
                    iVar.getSourceId();
                    C86648u uVar3 = new C86648u(a5, a6, (long) i);
                    if (m140312k()) {
                        uVar3.f195294i = 1;
                    }
                    m140301a(iVar, new C63029p(a5));
                    C86385d.C86400h.f193679a.mo137368a(uVar3);
                    mo124236a(iVar, i, iVar.getDashVideoId());
                    this.f180836m.mo124295a(iVar, i2);
                }
            }
            if (b != null && (mo124018c(iVar) <= 0 || z)) {
                b.speed = h;
            }
        }
        return z2;
    }

    /* renamed from: a */
    public final void mo124236a(C84241i iVar, int i, String str) {
        if (str != null && iVar != null) {
            this.f180832i.put(str, Integer.valueOf(i));
            this.f180833j.put(str, iVar);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.video.preload.AbstractC80915g
    /* renamed from: a */
    public final void mo124009a(C84241i iVar, String str, boolean z, AbstractC80872d dVar) {
        String str2;
        if (iVar == null) {
            m140303a(dVar);
        } else if (!TextUtils.isEmpty(iVar.getDashVideoModelStr())) {
            m140303a(dVar);
        } else {
            if (m140312k()) {
                AbstractC81964c e = C84229a.f188297a.mo129055e(iVar.getSourceId());
                str2 = e != null ? e.getUrlKey() : iVar.getUrlKey();
            } else {
                str2 = this.f180835l.createVideoUrlProcessor() != null ? this.f180835l.createVideoUrlProcessor().mo124208a(iVar, C84199c.f187979a.getPlayerType()).f188432c : "";
            }
            if (TextUtils.isEmpty(str2)) {
                m140303a(dVar);
                return;
            }
            C86367a aVar = new C86367a(str2, str, true, new C80894c(dVar));
            C86385d dVar2 = C86385d.C86400h.f193679a;
            AVMDLCopyOperation aVMDLCopyOperation = new AVMDLCopyOperation(aVar.f193484a, aVar.f193485b, aVar.f193486c, new AVMDLCopyOperationListener(aVar) {
                /* class com.p2082ss.ttvideoengine.C86385d.C863872 */

                /* renamed from: a */
                final /* synthetic */ C86367a f193596a;

                static {
                    Covode.recordClassIndex(101615);
                }

                {
                    this.f193596a = r2;
                }

                @Override // com.p2082ss.mediakit.medialoader.AVMDLCopyOperationListener
                public final void onCopyComplete(boolean z, int i, String str) {
                    if (this.f193596a.f193487d != null) {
                        this.f193596a.f193487d.mo124291a(z);
                    }
                }
            });
            if (dVar2.f193572d == 0) {
                dVar2.f193586r.lock();
                try {
                    if (dVar2.f193578j != null) {
                        dVar2.f193578j.asyncCopyOperation(aVMDLCopyOperation);
                    }
                } catch (Throwable unused) {
                }
                dVar2.f193586r.unlock();
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.video.preload.AbstractC80915g
    /* renamed from: a */
    public final void mo124008a(AbstractC80921k kVar) {
        if (kVar != null && !this.f180830g.contains(kVar)) {
            this.f180830g.add(kVar);
        }
    }

    /* renamed from: a */
    public final void mo124237a(String str, String str2) {
        if (this.f180847z.size() > 50) {
            this.f180829f.remove(this.f180847z.poll());
        }
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            this.f180847z.add(str);
            m140309g();
            this.f180829f.put(str, str2);
        }
    }

    /* renamed from: g */
    public static void m140309g() {
        C84231a.m144834a().isDebug();
    }

    @Override // com.p2082ss.android.ugc.aweme.video.preload.AbstractC80915g
    /* renamed from: e */
    public final File mo124023e() {
        return this.f180842u;
    }

    static {
        Covode.recordClassIndex(94172);
    }

    /* renamed from: k */
    private boolean m140312k() {
        if (!C84191b.m144779f().useNative || !this.f180843v || !this.f180844w) {
            return false;
        }
        return true;
    }

    /* renamed from: h */
    public final int mo124239h() {
        int i;
        int d = this.f180835l.getSpeedManager().mo124215d();
        if (((double) d) <= 0.0d && (i = f180817n) > 0) {
            d = i;
        }
        f180817n = d;
        return d;
    }

    /* renamed from: j */
    private String m140311j() {
        if (!TextUtils.isEmpty(this.f180821C)) {
            return this.f180821C;
        }
        Application application = C84231a.f188309a;
        if (application == null) {
            return null;
        }
        File a = m140302a(application);
        if (C84231a.m144834a().isDebug()) {
            a = C84186a.m144765a(application);
        }
        if (TextUtils.equals("playback_simulator_test", C84231a.m144834a().getChannel())) {
            a = C84186a.m144765a(application);
        }
        if (a == null) {
            return null;
        }
        String absolutePath = a.getAbsolutePath();
        this.f180821C = absolutePath;
        return absolutePath;
    }

    @Override // com.p2082ss.android.ugc.aweme.video.preload.AbstractC80915g
    /* renamed from: c */
    public final void mo124019c() {
        C86385d dVar = C86385d.C86400h.f193679a;
        if (dVar.f193572d == 0) {
            dVar.f193586r.lock();
            try {
                if (dVar.f193578j == null) {
                    C86641i.m150117e("DataLoaderHelper", "mInnerDataLoader == null");
                } else {
                    dVar.f193578j.clearAllCaches();
                }
            } catch (Throwable unused) {
            }
            dVar.f193586r.unlock();
        }
    }

    public EnginePreloader() {
        AbstractC80853k.C80857b bVar = AbstractC80853k.C80857b.f180796a;
        this.f180836m = new C80905l(new C80902i(bVar), bVar);
        if (((Boolean) C84191b.f187904h.getValue()).booleanValue()) {
            HandlerThread handlerThread = new HandlerThread("SC_Preload_Thread", ((Number) C84191b.f187905i.getValue()).intValue());
            handlerThread.start();
            this.f180841t = new Handler(handlerThread.getLooper());
        }
    }

    /* renamed from: i */
    private void m140310i() {
        long j;
        try {
            m140311j();
            HashMap hashMap = new HashMap();
            EnumC80868c[] values = EnumC80868c.values();
            int i = 0;
            for (EnumC80868c cVar : values) {
                if (cVar == null || TextUtils.isEmpty(cVar.getCacheDir())) {
                    j = -1;
                } else {
                    Long l = this.f180835l.getExperiment().getExCacheDirSizeConfig().get(cVar.getCacheDir());
                    if (l == null || l.longValue() <= 0) {
                        j = cVar.getSizeMB();
                    } else {
                        j = l.longValue();
                    }
                }
                boolean z = true;
                boolean z2 = !TextUtils.isEmpty(cVar.getCacheDir());
                if (j <= 0) {
                    z = false;
                }
                if (z2 && z) {
                    hashMap.put(mo124235a(cVar), Long.valueOf(j));
                }
            }
            if (hashMap.size() > 0) {
                String[] strArr = new String[hashMap.size()];
                long[] jArr = new long[hashMap.size()];
                for (Map.Entry entry : hashMap.entrySet()) {
                    strArr[i] = (String) entry.getKey();
                    jArr[i] = ((Long) entry.getValue()).longValue() * 1048576;
                    i++;
                }
                Pair pair = new Pair(strArr, jArr);
                C86385d dVar = C86385d.C86400h.f193679a;
                String[] strArr2 = (String[]) pair.first;
                long[] jArr2 = (long[]) pair.second;
                C86641i.m150113b("DataLoaderHelper", "setcustom paths and maxcaches ");
                dVar.f193586r.lock();
                try {
                    dVar.f193579k.setCacheInfoList(strArr2, jArr2);
                } finally {
                    dVar.f193586r.unlock();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: l */
    private void m140313l() {
        List<C84202f> engineStaticOptionList = this.f180835l.getExperiment().engineStaticOptionList();
        if (engineStaticOptionList != null && engineStaticOptionList.size() > 0) {
            for (C84202f fVar : engineStaticOptionList) {
                if (fVar.f188009b != null) {
                    try {
                        if (fVar.f188010c == 1) {
                            C86313ai.m148689e(fVar.f188008a, ((Integer) fVar.f188009b).intValue());
                        } else if (fVar.f188010c == 2) {
                            C86313ai.m148674b(fVar.f188008a, ((Long) fVar.f188009b).longValue());
                        } else if (fVar.f188010c == 4) {
                            C86313ai.m148639a(fVar.f188008a, (String) fVar.f188009b);
                        } else if (fVar.f188010c == 5) {
                            C86313ai.m148639a(fVar.f188008a, ((JSONObject) fVar.f188009b).toString());
                        } else if (fVar.f188010c == 6) {
                            C86313ai.m148639a(fVar.f188008a, ((JSONArray) fVar.f188009b).toString());
                        }
                    } catch (Exception unused) {
                    }
                }
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.video.preload.AbstractC80915g
    /* renamed from: b */
    public final void mo124016b() {
        m140309g();
        C86385d.C86400h.f193679a.mo137390h();
        Map<String, Integer> map = this.f180832i;
        if (map != null) {
            map.clear();
        }
        this.f180834k.clear();
        if (this.f180833j != null) {
            ArrayList<C84241i> arrayList = new ArrayList(this.f180833j.values());
            this.f180833j.clear();
            for (AbstractC80921k kVar : this.f180830g) {
                kVar.mo80919a(arrayList);
            }
            for (C84241i iVar : arrayList) {
                this.f180836m.mo124296a(iVar, EnumC80893b.Cancel);
            }
        }
    }

    /* renamed from: a */
    private static void m140303a(AbstractC80872d dVar) {
        if (dVar != null) {
            dVar.mo115013a();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.video.preload.AbstractC80915g
    /* renamed from: a */
    public final long mo124005a(String str) {
        if (C86385d.C86400h.f193679a != null) {
            return m140307d(str);
        }
        return 0;
    }

    @Override // com.p2082ss.android.ugc.aweme.video.preload.AbstractC80915g
    /* renamed from: b */
    public final long mo124015b(String str) {
        C86385d.C86388a j = C86385d.C86400h.f193679a.mo137394j(str);
        if (j != null) {
            return j.f193599b;
        }
        return 0;
    }

    /* renamed from: a */
    private static File m140302a(Context context) {
        if (C58016d.f132221b != null && C58016d.f132224e) {
            return C58016d.f132221b;
        }
        File cacheDir = context.getCacheDir();
        C58016d.f132221b = cacheDir;
        return cacheDir;
    }

    /* renamed from: e */
    private void m140308e(String str) {
        if (!TextUtils.isEmpty(str) && this.f180835l.getExperiment().EnablePreloaderPreConnect().booleanValue()) {
            C86385d.C86400h.f193679a.mo137376b(str);
        }
    }

    /* renamed from: d */
    private static long m140307d(String str) {
        long j = 0;
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        if (C84191b.m144794u()) {
            return C86385d.C86400h.f193679a.mo137382d(str);
        }
        C86385d.C86388a j2 = C86385d.C86400h.f193679a.mo137394j(str);
        if (j2 != null) {
            j = j2.f193600c;
        }
        return (long) ((int) j);
    }

    @Override // com.p2082ss.android.ugc.aweme.video.preload.AbstractC80915g
    /* renamed from: b */
    public final boolean mo124017b(C84241i iVar) {
        long j;
        if (iVar == null) {
            return false;
        }
        C86385d.C86388a j2 = C86385d.C86400h.f193679a.mo137394j(iVar.getBitRatedRatioUri());
        if (j2 != null) {
            j = j2.f193600c;
        } else {
            j = 0;
        }
        int i = (int) j;
        if (i <= 0 || ((long) i) != j2.f193599b) {
            return false;
        }
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.video.preload.AbstractC80915g
    /* renamed from: c */
    public final int mo124018c(C84241i iVar) {
        long d;
        if (iVar == null) {
            return 0;
        }
        String bitRatedRatioUri = iVar.getBitRatedRatioUri();
        if (!TextUtils.isEmpty(iVar.getDashVideoId())) {
            C86535p b = C80887a.m140363b(iVar.getDashVideoId());
            if (b == null) {
                return 0;
            }
            d = C80887a.m140360a(b);
        } else {
            d = m140307d(bitRatedRatioUri);
        }
        return (int) d;
    }

    @Override // com.p2082ss.android.ugc.aweme.video.preload.AbstractC80915g
    /* renamed from: f */
    public final C84224v mo124024f(C84241i iVar) {
        String dashVideoId;
        List<C84224v> list;
        if (TextUtils.isEmpty(iVar.getDashVideoId())) {
            dashVideoId = iVar.getBitRatedRatioUri();
        } else {
            dashVideoId = iVar.getDashVideoId();
        }
        if (TextUtils.isEmpty(dashVideoId) || !this.f180828e.containsKey(dashVideoId) || (list = this.f180828e.get(dashVideoId)) == null || list.size() <= 0) {
            return null;
        }
        return list.get(list.size() - 1);
    }

    /* renamed from: b */
    private void m140306b(Map<String, String> map) {
        if (this.f180835l.getExperiment().PlayerAbMedialoaderEnableBackupDnsIPExp() == 1 && map != null) {
            try {
                if (map.size() > 0) {
                    for (String str : map.keySet()) {
                        C86385d.C86400h.f193679a.mo137370a(str, map.get(str));
                    }
                }
            } catch (Throwable th) {
                C84231a.m144836b().ensureNotReachHere(th, "setDnsBackupIpMap fail.");
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.video.preload.AbstractC80915g
    /* renamed from: g */
    public final List<C84224v> mo124026g(C84241i iVar) {
        String dashVideoId;
        if (TextUtils.isEmpty(iVar.getDashVideoId())) {
            dashVideoId = iVar.getBitRatedRatioUri();
        } else {
            dashVideoId = iVar.getDashVideoId();
        }
        List<C84224v> list = this.f180828e.get(dashVideoId);
        if (C84231a.m144834a().isDebug() || this.f180835l.getExperiment().EnableGetCDNLogExperiment()) {
            while (true) {
                JSONObject c = C86385d.C86400h.f193679a.mo137379c(dashVideoId);
                m140309g();
                if (c == null) {
                    break;
                }
                C84198b bVar = (C84198b) C35469d.m72531a(c.toString(), C84198b.class);
                bVar.f187953a = 1;
                C84224v vVar = new C84224v(bVar);
                if (list != null) {
                    list.add(vVar);
                } else {
                    list = new ArrayList<>();
                    list.add(vVar);
                }
            }
        }
        return list;
    }

    /* renamed from: a */
    private static boolean m140305a(File file) {
        MethodCollector.m26663i(11);
        try {
            C40353e.C40356c cVar = (C40353e.C40356c) SettingsManager.m29616a().mo25397a("storage_intercepter_key", C40353e.C40356c.class, AbstractC40381g.f94567a);
            if (C40353e.m81545a(file.getAbsolutePath(), cVar)) {
                C40353e.m81540a(file, new RuntimeException(), "exception_delete_log", C40353e.m81542a(cVar));
            }
            if (C40353e.m81549c(file.getAbsolutePath(), cVar)) {
                C40353e.m81540a(file, new RuntimeException(), "exception_handle", C40353e.m81542a(cVar));
                MethodCollector.m26664o(11);
                return false;
            }
        } catch (Throwable unused) {
        }
        boolean delete = file.delete();
        MethodCollector.m26664o(11);
        return delete;
    }

    /* renamed from: c */
    public final void mo124238c(String str) {
        this.f180832i.remove(str);
        C84241i remove = this.f180833j.remove(str);
        if (remove != null) {
            this.f180836m.mo124296a(remove, EnumC80893b.Failed);
            for (AbstractC80921k kVar : this.f180830g) {
                kVar.mo80918a(remove);
            }
            if (!TextUtils.isEmpty(remove.getSourceId())) {
                this.f180834k.remove(remove.getSourceId());
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.video.preload.AbstractC80915g
    /* renamed from: d */
    public final void mo124021d(C84241i iVar) {
        String dashVideoId;
        if (iVar != null) {
            if (TextUtils.isEmpty(iVar.getDashVideoId())) {
                dashVideoId = iVar.getBitRatedRatioUri();
            } else {
                dashVideoId = iVar.getDashVideoId();
            }
            C86385d dVar = C86385d.C86400h.f193679a;
            if (!TextUtils.isEmpty(dashVideoId)) {
                if (dVar.f193578j == null || dVar.f193572d != 0) {
                    C86641i.m150117e("DataLoaderHelper", "need start mdl first");
                } else {
                    dVar.f193586r.lock();
                    try {
                        C86385d.C86392d d = dVar.f193573e.mo137421d(dashVideoId);
                        if (d != null) {
                            C86385d.m148967a(d);
                        } else {
                            C86385d.C86392d d2 = dVar.f193574f.mo137421d(dashVideoId);
                            if (d2 != null) {
                                if (d2.f193620j != null) {
                                    d2.f193620j.mo137469a();
                                }
                                C86385d.m148967a(d2);
                            } else {
                                C86385d.C86392d d3 = dVar.f193575g.mo137421d(dashVideoId);
                                if (d3 != null) {
                                    dVar.f193578j.cancel(dashVideoId);
                                    C86385d.m148967a(d3);
                                }
                            }
                        }
                        C86641i.m150110a("DataLoaderHelper", "[preload] cancel preload task. key = ".concat(String.valueOf(dashVideoId)));
                    } catch (Throwable unused) {
                    }
                    dVar.f193586r.unlock();
                }
            }
            this.f180832i.remove(dashVideoId);
            C84241i remove = this.f180833j.remove(dashVideoId);
            if (remove != null) {
                this.f180836m.mo124296a(remove, EnumC80893b.Cancel);
                ArrayList arrayList = new ArrayList();
                arrayList.add(remove);
                for (AbstractC80921k kVar : this.f180830g) {
                    kVar.mo80919a(arrayList);
                }
                if (!TextUtils.isEmpty(remove.getSourceId())) {
                    this.f180834k.remove(remove.getSourceId());
                }
            }
        }
    }

    /* renamed from: a */
    public final String mo124235a(EnumC80868c cVar) {
        if (cVar == null || TextUtils.isEmpty(cVar.getCacheDir())) {
            return null;
        }
        File file = new File(m140311j(), cVar.getCacheDir());
        if (!file.isDirectory()) {
            m140305a(file);
        }
        if (!file.exists()) {
            file.mkdirs();
        }
        return file.getAbsolutePath();
    }

    @Override // com.p2082ss.android.ugc.aweme.video.preload.AbstractC80915g
    /* renamed from: a */
    public final void mo124007a(AbstractC80914f fVar) {
        for (WeakReference<AbstractC80914f> weakReference : this.f180824a) {
            if (weakReference.get() == fVar) {
                return;
            }
        }
        this.f180824a.add(new WeakReference<>(fVar));
    }

    /* renamed from: com.ss.android.ugc.aweme.video.preload.enginepreloader.EnginePreloader$a */
    static class C80886a extends RunnableC80869a {
        static {
            Covode.recordClassIndex(94185);
        }

        C80886a(AbstractC80846e eVar, int i) {
            super(new RunnableC80896e(eVar), i);
        }
    }

    /* renamed from: a */
    private C63059e m140301a(C84241i iVar, AbstractC63057c cVar) {
        if (!m140312k() || iVar == null) {
            return null;
        }
        C63059e a = C84189d.m144771a(iVar, cVar);
        if (this.f180835l.getBitrateSelectListener() != null) {
            this.f180835l.getBitrateSelectListener().mo101044a(2, 2, a);
        }
        iVar.getSourceId();
        this.f180834k.size();
        if (!(iVar.getSourceId() == null || a == null)) {
            this.f180834k.put(iVar.getSourceId(), a);
        }
        return a;
    }

    /* renamed from: a */
    public static void m140304a(AbstractC80914f fVar, int i, LoaderEventInfo loaderEventInfo) {
        if (fVar != null) {
            C84207k kVar = new C84207k();
            kVar.f188025a = i;
            kVar.f188026b = loaderEventInfo.fileHash;
            kVar.f188027c = loaderEventInfo.taskType;
            kVar.f188028d = loaderEventInfo.bytesLoaded;
            kVar.f188030f = loaderEventInfo.off;
            kVar.f188031g = loaderEventInfo.endOff;
            kVar.f188029e = loaderEventInfo.loadDurationMs;
            C84207k.m144804a(kVar);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.video.preload.AbstractC80915g
    /* renamed from: a */
    public final Object mo124006a(C84241i iVar, String str, String[] strArr) {
        return C86385d.C86400h.f193679a.mo137358a(str, iVar.getSourceId(), 0L, strArr, (EnumC86649v) null, (String) null, (C86534o) null, (String) null, (String) null, false, false, (String) null);
    }
}
