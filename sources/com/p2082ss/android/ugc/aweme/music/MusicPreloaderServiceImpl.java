package com.p2082ss.android.ugc.aweme.music;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.C81908b;
import com.p2082ss.android.ugc.aweme.video.preload.AbstractC80873e;
import com.p2082ss.android.ugc.aweme.video.preload.AbstractC80914f;
import com.p2082ss.android.ugc.aweme.video.preload.C80937s;
import com.p2082ss.android.ugc.aweme.video.preload.VideoCachePreloader;
import com.p2082ss.android.ugc.musicprovider.AbstractC84130c;
import com.p2082ss.android.ugc.musicprovider.MusicPreloaderService;
import com.toutiao.proxyserver.C87348j;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.ConcurrentHashMap;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89187q;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.music.MusicPreloaderServiceImpl */
public final class MusicPreloaderServiceImpl implements MusicPreloaderService {

    /* renamed from: a */
    private final AbstractC89244h f137484a = C89250i.m154773a((AbstractC89171a) C60323b.f137487a);

    /* renamed from: b */
    private final AbstractC89244h f137485b = C89250i.m154773a((AbstractC89171a) C60322a.f137486a);

    static {
        Covode.recordClassIndex(70859);
    }

    /* renamed from: c */
    private ConcurrentHashMap<AbstractC89187q<String, Long, Long, C89391z>, AbstractC80914f> m110026c() {
        return (ConcurrentHashMap) this.f137484a.getValue();
    }

    /* renamed from: d */
    private ConcurrentHashMap<AbstractC84130c, AbstractC80873e> m110027d() {
        return (ConcurrentHashMap) this.f137485b.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.music.MusicPreloaderServiceImpl$a */
    static final class C60322a extends AbstractC89220m implements AbstractC89171a<ConcurrentHashMap<AbstractC84130c, AbstractC80873e>> {

        /* renamed from: a */
        public static final C60322a f137486a = new C60322a();

        static {
            Covode.recordClassIndex(70860);
        }

        C60322a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ ConcurrentHashMap<AbstractC84130c, AbstractC80873e> invoke() {
            return new ConcurrentHashMap();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.MusicPreloaderServiceImpl$b */
    static final class C60323b extends AbstractC89220m implements AbstractC89171a<ConcurrentHashMap<AbstractC89187q<? super String, ? super Long, ? super Long, ? extends C89391z>, AbstractC80914f>> {

        /* renamed from: a */
        public static final C60323b f137487a = new C60323b();

        static {
            Covode.recordClassIndex(70861);
        }

        C60323b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ ConcurrentHashMap<AbstractC89187q<? super String, ? super Long, ? super Long, ? extends C89391z>, AbstractC80914f> invoke() {
            return new ConcurrentHashMap();
        }
    }

    @Override // com.p2082ss.android.ugc.musicprovider.MusicPreloaderService
    /* renamed from: a */
    public final void mo97986a() {
        VideoCachePreloader.C80793a.f180688a.mo124027g();
    }

    /* renamed from: b */
    public static MusicPreloaderService m110025b() {
        MethodCollector.m26663i(9609);
        Object a = C81908b.m141854a(MusicPreloaderService.class, false);
        if (a != null) {
            MusicPreloaderService musicPreloaderService = (MusicPreloaderService) a;
            MethodCollector.m26664o(9609);
            return musicPreloaderService;
        }
        if (C81908b.f183264cN == null) {
            synchronized (MusicPreloaderService.class) {
                try {
                    if (C81908b.f183264cN == null) {
                        C81908b.f183264cN = new MusicPreloaderServiceImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(9609);
                    throw th;
                }
            }
        }
        MusicPreloaderServiceImpl musicPreloaderServiceImpl = (MusicPreloaderServiceImpl) C81908b.f183264cN;
        MethodCollector.m26664o(9609);
        return musicPreloaderServiceImpl;
    }

    /* renamed from: com.ss.android.ugc.aweme.music.MusicPreloaderServiceImpl$c */
    public static final class C60324c implements AbstractC80873e {

        /* renamed from: a */
        final /* synthetic */ AbstractC84130c f137488a;

        static {
            Covode.recordClassIndex(70862);
        }

        C60324c(AbstractC84130c cVar) {
            this.f137488a = cVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.video.preload.AbstractC80873e
        /* renamed from: a */
        public final void mo97991a(C87348j jVar, int i, String str) {
            C89219l.m154721d(jVar, "");
            C89219l.m154721d(str, "");
            this.f137488a.mo98196a(jVar, i, str);
        }

        @Override // com.p2082ss.android.ugc.aweme.video.preload.AbstractC80873e
        /* renamed from: a */
        public final void mo97992a(String str, int i, String str2) {
            C89219l.m154721d(str, "");
            C89219l.m154721d(str2, "");
            this.f137488a.mo98197a(str, i, str2);
        }
    }

    @Override // com.p2082ss.android.ugc.musicprovider.MusicPreloaderService
    /* renamed from: a */
    public final void mo97987a(AbstractC84130c cVar) {
        C89219l.m154721d(cVar, "");
        C60324c cVar2 = new C60324c(cVar);
        m110027d().put(cVar, cVar2);
        VideoCachePreloader.C80793a.f180688a.f180673l = new WeakReference<>(cVar2);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: h.f.a.q<? super java.lang.String, ? super java.lang.Long, ? super java.lang.Long, h.z> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.p2082ss.android.ugc.musicprovider.MusicPreloaderService
    /* renamed from: a */
    public final void mo97988a(AbstractC89187q<? super String, ? super Long, ? super Long, C89391z> qVar) {
        C89219l.m154721d(qVar, "");
        C60325d dVar = new C60325d(qVar);
        m110026c().put(qVar, dVar);
        C80937s.m140453b().mo124064a(dVar);
    }

    @Override // com.p2082ss.android.ugc.musicprovider.MusicPreloaderService
    /* renamed from: b */
    public final void mo97989b(AbstractC84130c cVar) {
        C89219l.m154721d(cVar, "");
        AbstractC80873e remove = m110027d().remove(cVar);
        if (remove != null) {
            VideoCachePreloader videoCachePreloader = VideoCachePreloader.C80793a.f180688a;
            if (videoCachePreloader.f180673l != null && videoCachePreloader.f180673l.get() == remove) {
                videoCachePreloader.f180673l = null;
            }
        }
    }

    @Override // com.p2082ss.android.ugc.musicprovider.MusicPreloaderService
    /* renamed from: b */
    public final void mo97990b(AbstractC89187q<? super String, ? super Long, ? super Long, C89391z> qVar) {
        C89219l.m154721d(qVar, "");
        AbstractC80914f remove = m110026c().remove(qVar);
        VideoCachePreloader videoCachePreloader = VideoCachePreloader.C80793a.f180688a;
        ArrayList arrayList = new ArrayList();
        for (WeakReference<AbstractC80914f> weakReference : videoCachePreloader.f180672k) {
            if (weakReference.get() == remove) {
                arrayList.add(weakReference);
            }
        }
        videoCachePreloader.f180672k.removeAll(arrayList);
    }

    /* renamed from: com.ss.android.ugc.aweme.music.MusicPreloaderServiceImpl$d */
    static final class C60325d implements AbstractC80914f {

        /* renamed from: a */
        final /* synthetic */ AbstractC89187q f137489a;

        static {
            Covode.recordClassIndex(70863);
        }

        C60325d(AbstractC89187q qVar) {
            this.f137489a = qVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.video.preload.AbstractC80914f
        /* renamed from: a */
        public final void mo84697a(String str, long j, long j2) {
            AbstractC89187q qVar = this.f137489a;
            C89219l.m154716b(str, "");
            qVar.invoke(str, Long.valueOf(j), Long.valueOf(j2));
        }
    }
}
