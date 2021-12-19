package com.p2082ss.android.ugc.aweme.video.preload;

import android.os.Handler;
import android.os.HandlerThread;
import android.text.TextUtils;
import android.util.LruCache;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.p2441cf.p2442a.C35468c;
import com.p2082ss.android.ugc.aweme.video.preload.AbstractC80915g;
import com.p2082ss.android.ugc.aweme.video.preload.AbstractC80918i;
import com.p2082ss.android.ugc.aweme.video.preload.AbstractC80929n;
import com.p2082ss.android.ugc.playerkit.C84180b;
import com.p2082ss.android.ugc.playerkit.model.C84224v;
import com.p2082ss.android.ugc.playerkit.model.C84227x;
import com.p2082ss.android.ugc.playerkit.session.C84229a;
import com.p2082ss.android.ugc.playerkit.simapicommon.C84231a;
import com.p2082ss.android.ugc.playerkit.simapicommon.p4325a.C84239g;
import com.p2082ss.android.ugc.playerkit.simapicommon.p4325a.C84241i;
import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.video.preload.VideoPreloadManager */
public class VideoPreloadManager implements AbstractC80918i {

    /* renamed from: a */
    public AbstractC80915g f180713a;

    /* renamed from: b */
    public Map<String, String> f180714b;

    /* renamed from: c */
    public String f180715c;

    /* renamed from: d */
    public LruCache<String, Long> f180716d = new LruCache<>(1048576);

    /* renamed from: e */
    private final IVideoPreloadConfig f180717e = C80933o.m140451a();

    /* renamed from: f */
    private AbstractC80917h f180718f;

    /* renamed from: g */
    private Handler f180719g;

    static {
        Covode.recordClassIndex(94096);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.video.preload.VideoPreloadManager$a */
    public static abstract class AbstractRunnableC80805a implements Runnable {
        static {
            Covode.recordClassIndex(94102);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public abstract boolean mo124094a();

        private AbstractRunnableC80805a() {
        }

        public void run() {
            mo124094a();
        }

        /* synthetic */ AbstractRunnableC80805a(byte b) {
            this();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.video.preload.AbstractC80918i
    /* renamed from: a */
    public final boolean mo124069a(C84241i iVar) {
        if (iVar != null) {
            if (iVar.getHitBitrate() == null) {
                iVar.setHitBitrate(C84229a.f188297a.mo129055e(iVar.getSourceId()));
            }
            if (TextUtils.isEmpty(iVar.getDashVideoId())) {
                iVar.setDashVideoId(C84229a.f188297a.mo129057g(iVar.getSourceId()));
            }
        }
        return mo124087h().mo124012a(iVar);
    }

    @Override // com.p2082ss.android.ugc.aweme.video.preload.AbstractC80918i
    /* renamed from: a */
    public final boolean mo124071a(C84241i iVar, int i, AbstractC80929n nVar, AbstractC80915g.C80916a aVar, List<C84241i> list, List<C84241i> list2, int i2) {
        if (!C84180b.m144763a(iVar)) {
            return false;
        }
        return m140178a(new AbstractRunnableC80805a(i, iVar, nVar, aVar, list, 0, list2, i2) {
            /* class com.p2082ss.android.ugc.aweme.video.preload.VideoPreloadManager.C808001 */

            /* renamed from: a */
            final /* synthetic */ int f180720a;

            /* renamed from: b */
            final /* synthetic */ C84241i f180721b;

            /* renamed from: c */
            final /* synthetic */ AbstractC80929n f180722c;

            /* renamed from: d */
            final /* synthetic */ AbstractC80915g.C80916a f180723d;

            /* renamed from: e */
            final /* synthetic */ List f180724e;

            /* renamed from: f */
            final /* synthetic */ int f180725f = 0;

            /* renamed from: g */
            final /* synthetic */ List f180726g;

            /* renamed from: h */
            final /* synthetic */ int f180727h;

            static {
                Covode.recordClassIndex(94097);
            }

            /* access modifiers changed from: package-private */
            @Override // com.p2082ss.android.ugc.aweme.video.preload.VideoPreloadManager.AbstractRunnableC80805a
            /* renamed from: a */
            public final boolean mo124094a() {
                VideoPreloadManager.this.mo124068a();
                boolean a = VideoPreloadManager.this.mo124087h().mo124013a(this.f180721b, Math.max(this.f180720a, 0), this.f180722c, this.f180723d);
                boolean a2 = VideoPreloadManager.this.mo124087h().mo124014a(this.f180724e, this.f180725f, this.f180726g, this.f180727h);
                if (a) {
                    VideoPreloadManager.this.f180716d.put(this.f180721b.getUri(), 0L);
                }
                if (a2) {
                    List list = this.f180724e;
                    if (list != null && !list.isEmpty()) {
                        for (C84239g gVar : this.f180724e) {
                            if (gVar != null) {
                                VideoPreloadManager.this.f180716d.put(gVar.getUri(), 0L);
                            }
                        }
                    }
                    List list2 = this.f180726g;
                    if (list2 != null && !list2.isEmpty()) {
                        for (C84239g gVar2 : this.f180726g) {
                            if (gVar2 != null) {
                                VideoPreloadManager.this.f180716d.put(gVar2.getUri(), 0L);
                            }
                        }
                    }
                }
                if (!a || !a2) {
                    return false;
                }
                return true;
            }

            {
                this.f180720a = r3;
                this.f180721b = r4;
                this.f180722c = r5;
                this.f180723d = r6;
                this.f180724e = r7;
                this.f180726g = r9;
                this.f180727h = r10;
            }
        });
    }

    @Override // com.p2082ss.android.ugc.aweme.video.preload.AbstractC80918i
    /* renamed from: a */
    public final boolean mo124072a(C84241i iVar, int i, List list, List list2, int i2) {
        return mo124071a(iVar, i, AbstractC80929n.C80931b.f180958b, null, list, list2, i2);
    }

    @Override // com.p2082ss.android.ugc.aweme.video.preload.AbstractC80918i
    /* renamed from: a */
    public final boolean mo124070a(C84241i iVar, int i, AbstractC80929n nVar) {
        return mo124076b(iVar, i, nVar);
    }

    @Override // com.p2082ss.android.ugc.aweme.video.preload.AbstractC80918i
    /* renamed from: e */
    public final AbstractC80915g mo124082e() {
        return mo124087h();
    }

    @Override // com.p2082ss.android.ugc.aweme.video.preload.AbstractC80918i
    /* renamed from: c */
    public final void mo124078c() {
        m140178a(new AbstractRunnableC80805a() {
            /* class com.p2082ss.android.ugc.aweme.video.preload.VideoPreloadManager.C808023 */

            static {
                Covode.recordClassIndex(94099);
            }

            /* access modifiers changed from: package-private */
            @Override // com.p2082ss.android.ugc.aweme.video.preload.VideoPreloadManager.AbstractRunnableC80805a
            /* renamed from: a */
            public final boolean mo124094a() {
                VideoPreloadManager.this.mo124087h().mo124019c();
                return false;
            }
        });
    }

    @Override // com.p2082ss.android.ugc.aweme.video.preload.AbstractC80918i
    /* renamed from: d */
    public final void mo124080d() {
        mo124087h().mo124016b();
    }

    @Override // com.p2082ss.android.ugc.aweme.video.preload.AbstractC80918i
    /* renamed from: f */
    public final String mo124083f() {
        return mo124087h().mo124020d();
    }

    @Override // com.p2082ss.android.ugc.aweme.video.preload.AbstractC80918i
    /* renamed from: g */
    public final boolean mo124085g() {
        return mo124087h().mo124025f();
    }

    /* renamed from: i */
    private synchronized AbstractC80917h m140179i() {
        AbstractC80917h hVar;
        MethodCollector.m26663i(5913);
        if (this.f180718f == null) {
            this.f180718f = new AbstractC80917h() {
                /* class com.p2082ss.android.ugc.aweme.video.preload.VideoPreloadManager.C808034 */

                /* renamed from: a */
                Map<AbstractC80918i.EnumC80919a, AbstractC80915g> f180732a = new HashMap();

                static {
                    Covode.recordClassIndex(94100);
                }

                @Override // com.p2082ss.android.ugc.aweme.video.preload.AbstractC80917h
                /* renamed from: a */
                public final AbstractC80915g mo124095a(AbstractC80918i.EnumC80919a aVar) {
                    if (this.f180732a.containsKey(aVar)) {
                        return this.f180732a.get(aVar);
                    }
                    AbstractC80915g gVar = (AbstractC80915g) C35468c.m72529a(aVar.f180915a);
                    gVar.mo124011a();
                    this.f180732a.put(aVar, gVar);
                    return gVar;
                }
            };
        }
        hVar = this.f180718f;
        MethodCollector.m26664o(5913);
        return hVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.video.preload.AbstractC80918i
    /* renamed from: b */
    public final File mo124074b() {
        return mo124087h().mo124023e();
    }

    /* renamed from: j */
    private synchronized Handler m140180j() {
        Handler handler;
        IVideoPreloadConfig iVideoPreloadConfig;
        MethodCollector.m26663i(6058);
        if (this.f180719g == null && (iVideoPreloadConfig = this.f180717e) != null && iVideoPreloadConfig.useSyncPreloadStyle()) {
            HandlerThread handlerThread = new HandlerThread("VideoPreloadHandlerThread");
            handlerThread.start();
            this.f180719g = new Handler(handlerThread.getLooper());
        }
        handler = this.f180719g;
        MethodCollector.m26664o(6058);
        return handler;
    }

    /* renamed from: h */
    public final AbstractC80915g mo124087h() {
        MethodCollector.m26663i(6060);
        AbstractC80915g gVar = this.f180713a;
        if (gVar != null) {
            MethodCollector.m26664o(6060);
            return gVar;
        }
        synchronized (this) {
            try {
                if (this.f180713a == null) {
                    AbstractC80915g a = m140179i().mo124095a(this.f180717e.getExperiment().PreloadTypeExperiment());
                    this.f180713a = a;
                    this.f180715c = a.mo124020d();
                    Map<String, String> map = this.f180714b;
                    if (map != null) {
                        this.f180713a.mo124010a(map);
                    }
                }
            } catch (Throwable th) {
                MethodCollector.m26664o(6060);
                throw th;
            }
        }
        AbstractC80915g gVar2 = this.f180713a;
        MethodCollector.m26664o(6060);
        return gVar2;
    }

    @Override // com.p2082ss.android.ugc.aweme.video.preload.AbstractC80918i
    /* renamed from: a */
    public final boolean mo124068a() {
        return mo124087h().mo124011a();
    }

    @Override // com.p2082ss.android.ugc.aweme.video.preload.AbstractC80918i
    /* renamed from: a */
    public final void mo124065a(AbstractC80921k kVar) {
        mo124087h().mo124008a(kVar);
    }

    @Override // com.p2082ss.android.ugc.aweme.video.preload.AbstractC80918i
    /* renamed from: d */
    public final int mo124079d(C84241i iVar) {
        return mo124077c(iVar);
    }

    @Override // com.p2082ss.android.ugc.aweme.video.preload.AbstractC80918i
    /* renamed from: f */
    public final boolean mo124084f(C84241i iVar) {
        return mo124086g(iVar);
    }

    @Override // com.p2082ss.android.ugc.aweme.video.preload.AbstractC80918i
    /* renamed from: g */
    public final boolean mo124086g(C84241i iVar) {
        return mo124070a(iVar, 0, AbstractC80929n.C80931b.f180958b);
    }

    @Override // com.p2082ss.android.ugc.aweme.video.preload.AbstractC80918i
    /* renamed from: i */
    public final void mo124089i(C84241i iVar) {
        mo124087h().mo124021d(iVar);
    }

    @Override // com.p2082ss.android.ugc.aweme.video.preload.AbstractC80918i
    /* renamed from: a */
    public final long mo124061a(String str) {
        return mo124087h().mo124005a(str);
    }

    @Override // com.p2082ss.android.ugc.aweme.video.preload.AbstractC80918i
    /* renamed from: b */
    public final long mo124073b(String str) {
        return mo124087h().mo124015b(str);
    }

    @Override // com.p2082ss.android.ugc.aweme.video.preload.AbstractC80918i
    /* renamed from: h */
    public final void mo124088h(final C84241i iVar) {
        m140178a(new AbstractRunnableC80805a() {
            /* class com.p2082ss.android.ugc.aweme.video.preload.VideoPreloadManager.C808012 */

            static {
                Covode.recordClassIndex(94098);
            }

            /* access modifiers changed from: package-private */
            @Override // com.p2082ss.android.ugc.aweme.video.preload.VideoPreloadManager.AbstractRunnableC80805a
            /* renamed from: a */
            public final boolean mo124094a() {
                if (VideoPreloadManager.this.f180716d.get(iVar.getUri()) != null) {
                    C84231a.m144836b().monitorStatusRate("aweme_media_play_stastics_log", 0, null);
                } else {
                    C84231a.m144836b().monitorStatusRate("aweme_media_play_stastics_log", 1, null);
                }
                return false;
            }
        });
    }

    @Override // com.p2082ss.android.ugc.aweme.video.preload.AbstractC80918i
    /* renamed from: j */
    public final C80923m mo124090j(C84241i iVar) {
        if (iVar != null) {
            return mo124087h().mo124022e(iVar);
        }
        return null;
    }

    @Override // com.p2082ss.android.ugc.aweme.video.preload.AbstractC80918i
    /* renamed from: k */
    public final List<C84227x> mo124091k(C84241i iVar) {
        return mo124087h().mo124028h(iVar);
    }

    @Override // com.p2082ss.android.ugc.aweme.video.preload.AbstractC80918i
    /* renamed from: l */
    public final List<C84224v> mo124092l(C84241i iVar) {
        return mo124087h().mo124026g(iVar);
    }

    @Override // com.p2082ss.android.ugc.aweme.video.preload.AbstractC80918i
    /* renamed from: m */
    public final C84224v mo124093m(C84241i iVar) {
        return mo124087h().mo124024f(iVar);
    }

    /* renamed from: a */
    private boolean m140178a(AbstractRunnableC80805a aVar) {
        IVideoPreloadConfig iVideoPreloadConfig = this.f180717e;
        if (iVideoPreloadConfig == null || !iVideoPreloadConfig.useSyncPreloadStyle()) {
            return aVar.mo124094a();
        }
        if (m140180j() == null) {
            return true;
        }
        m140180j().post(aVar);
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.video.preload.AbstractC80918i
    /* renamed from: e */
    public final long mo124081e(C84241i iVar) {
        if (iVar != null) {
            return mo124087h().mo124015b(iVar.getBitRatedRatioUri());
        }
        return -1;
    }

    @Override // com.p2082ss.android.ugc.aweme.video.preload.AbstractC80918i
    /* renamed from: a */
    public final AbstractC80915g mo124062a(AbstractC80918i.EnumC80919a aVar) {
        return m140179i().mo124095a(aVar);
    }

    @Override // com.p2082ss.android.ugc.aweme.video.preload.AbstractC80918i
    /* renamed from: b */
    public final boolean mo124075b(C84241i iVar) {
        if (!mo124069a(iVar) || !mo124087h().mo124017b(iVar)) {
            return false;
        }
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.video.preload.AbstractC80918i
    /* renamed from: c */
    public final int mo124077c(C84241i iVar) {
        if (iVar != null) {
            if (iVar.getHitBitrate() == null) {
                iVar.setHitBitrate(C84229a.f188297a.mo129055e(iVar.getSourceId()));
            }
            if (TextUtils.isEmpty(iVar.getDashVideoId())) {
                iVar.setDashVideoId(C84229a.f188297a.mo129057g(iVar.getSourceId()));
            }
        }
        return mo124087h().mo124018c(iVar);
    }

    @Override // com.p2082ss.android.ugc.aweme.video.preload.AbstractC80918i
    /* renamed from: a */
    public final void mo124064a(AbstractC80914f fVar) {
        if (fVar != null) {
            mo124068a();
            if (this.f180713a != null) {
                mo124087h().mo124007a(fVar);
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.video.preload.AbstractC80918i
    /* renamed from: a */
    public final void mo124067a(final Map<String, String> map) {
        m140178a(new AbstractRunnableC80805a() {
            /* class com.p2082ss.android.ugc.aweme.video.preload.VideoPreloadManager.C808045 */

            static {
                Covode.recordClassIndex(94101);
            }

            /* access modifiers changed from: package-private */
            @Override // com.p2082ss.android.ugc.aweme.video.preload.VideoPreloadManager.AbstractRunnableC80805a
            /* renamed from: a */
            public final boolean mo124094a() {
                if (VideoPreloadManager.this.f180713a == null) {
                    VideoPreloadManager.this.f180714b = map;
                    return false;
                }
                VideoPreloadManager.this.mo124087h().mo124010a(map);
                return false;
            }
        });
    }

    @Override // com.p2082ss.android.ugc.aweme.video.preload.AbstractC80918i
    /* renamed from: a */
    public final Object mo124063a(C84241i iVar, String str, String[] strArr) {
        return mo124087h().mo124006a(iVar, str, strArr);
    }

    @Override // com.p2082ss.android.ugc.aweme.video.preload.AbstractC80918i
    /* renamed from: b */
    public final boolean mo124076b(C84241i iVar, int i, AbstractC80929n nVar) {
        return mo124071a(iVar, i, nVar, null, null, null, 0);
    }

    @Override // com.p2082ss.android.ugc.aweme.video.preload.AbstractC80918i
    /* renamed from: a */
    public final void mo124066a(C84241i iVar, String str, AbstractC80872d dVar) {
        mo124087h().mo124009a(iVar, str, true, dVar);
    }
}
