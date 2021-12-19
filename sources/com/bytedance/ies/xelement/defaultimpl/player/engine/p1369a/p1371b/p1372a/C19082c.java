package com.bytedance.ies.xelement.defaultimpl.player.engine.p1369a.p1371b.p1372a;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import com.bytedance.android.livesdk.livesetting.watchlive.InteractFirstFrameTimeOutDurationSetting;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1377a.AbstractC19156a;
import com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1377a.AbstractC19163h;
import com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1377a.AbstractC19168m;
import com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1377a.EnumC19157b;
import com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1377a.EnumC19167l;
import com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1377a.EnumC19170o;
import com.bytedance.ies.xelement.defaultimpl.player.engine.p1369a.p1370a.C19067b;
import com.bytedance.ies.xelement.p1364b.C19004g;
import com.p2082ss.ttvideoengine.AbstractC86369ba;
import com.p2082ss.ttvideoengine.AbstractC86651x;
import com.p2082ss.ttvideoengine.C86313ai;
import com.p2082ss.ttvideoengine.EnumC86649v;
import com.p2082ss.ttvideoengine.p4417j.C86535p;
import com.p2082ss.ttvideoengine.p4430s.C86633c;
import java.io.FileDescriptor;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4619j.C89271h;

/* renamed from: com.bytedance.ies.xelement.defaultimpl.player.engine.a.b.a.c */
public final class C19082c implements AbstractC19163h {

    /* renamed from: h */
    public static final C19083a f45196h = new C19083a((byte) 0);

    /* renamed from: a */
    public final int f45197a = 300;

    /* renamed from: b */
    public boolean f45198b;

    /* renamed from: c */
    public boolean f45199c;

    /* renamed from: d */
    public volatile boolean f45200d;

    /* renamed from: e */
    public volatile boolean f45201e;

    /* renamed from: f */
    public volatile long f45202f;

    /* renamed from: g */
    public final AbstractC19156a f45203g;

    /* renamed from: i */
    private final AbstractC89244h f45204i;

    /* renamed from: com.bytedance.ies.xelement.defaultimpl.player.engine.a.b.a.c$b */
    static final class C19084b implements AbstractC86369ba {

        /* renamed from: a */
        public static final C19085a f45205a = new C19085a((byte) 0);

        /* renamed from: b */
        private long f45206b = Long.MIN_VALUE;

        /* renamed from: c */
        private long f45207c = Long.MIN_VALUE;

        /* renamed from: d */
        private final Handler f45208d = new Handler(Looper.getMainLooper());

        /* renamed from: e */
        private final C19082c f45209e;

        /* renamed from: f */
        private final AbstractC19156a f45210f;

        static {
            Covode.recordClassIndex(21847);
        }

        @Override // com.p2082ss.ttvideoengine.AbstractC86369ba
        /* renamed from: a */
        public final void mo16745a(int i) {
        }

        @Override // com.p2082ss.ttvideoengine.AbstractC86369ba
        /* renamed from: a */
        public final void mo16748a(C86313ai aiVar, int i, int i2) {
        }

        /* renamed from: com.bytedance.ies.xelement.defaultimpl.player.engine.a.b.a.c$b$a */
        public static final class C19085a {
            static {
                Covode.recordClassIndex(21848);
            }

            private C19085a() {
            }

            public /* synthetic */ C19085a(byte b) {
                this();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: com.bytedance.ies.xelement.defaultimpl.player.engine.a.b.a.c$b$b */
        public static final class RunnableC19086b implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C19084b f45211a;

            static {
                Covode.recordClassIndex(21849);
            }

            RunnableC19086b(C19084b bVar) {
                this.f45211a = bVar;
            }

            public final void run() {
                this.f45211a.mo30449a();
            }
        }

        /* renamed from: com.bytedance.ies.xelement.defaultimpl.player.engine.a.b.a.c$b$c */
        static final class RunnableC19087c implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C19084b f45212a;

            static {
                Covode.recordClassIndex(21850);
            }

            RunnableC19087c(C19084b bVar) {
                this.f45212a = bVar;
            }

            public final void run() {
                this.f45212a.mo30449a();
            }
        }

        /* renamed from: a */
        public final void mo30449a() {
            long e = this.f45209e.mo30435e();
            if (e != this.f45206b) {
                this.f45210f.mo30480b(this.f45209e, e);
                if (Math.abs(e - this.f45207c) >= 500) {
                    this.f45210f.mo30473a(this.f45209e, e);
                    this.f45207c = e;
                }
                this.f45206b = e;
            }
            this.f45208d.postAtTime(new RunnableC19086b(this), this, SystemClock.uptimeMillis() + 50);
        }

        @Override // com.p2082ss.ttvideoengine.AbstractC86369ba
        /* renamed from: a */
        public final void mo16746a(C86313ai aiVar) {
            this.f45210f.mo30472a(this.f45209e);
        }

        @Override // com.p2082ss.ttvideoengine.AbstractC86369ba
        /* renamed from: d */
        public final void mo16754d(C86313ai aiVar) {
            this.f45210f.mo30484d(this.f45209e);
        }

        @Override // com.p2082ss.ttvideoengine.AbstractC86369ba
        /* renamed from: b */
        public final void mo16750b(C86313ai aiVar) {
            this.f45210f.mo30479b(this.f45209e);
            C19082c cVar = this.f45209e;
            cVar.f45200d = true;
            if (cVar.f45201e) {
                cVar.mo30424a(-1);
            }
        }

        @Override // com.p2082ss.ttvideoengine.AbstractC86369ba
        /* renamed from: c */
        public final void mo16752c(C86313ai aiVar) {
            this.f45210f.mo30482c(this.f45209e);
            this.f45210f.mo30475a(this.f45209e, EnumC19170o.PLAYBACK_STATE_START);
            C19082c cVar = this.f45209e;
            long j = cVar.f45202f;
            cVar.f45202f = 0;
            if (j > 0) {
                cVar.mo30425a(j, (AbstractC19168m) null);
            }
        }

        @Override // com.p2082ss.ttvideoengine.AbstractC86369ba
        /* renamed from: a */
        public final void mo16749a(C86633c cVar) {
            EnumC19157b bVar;
            if (cVar == null || !(cVar.mo137899b() == 1001 || cVar.mo137899b() == 1003 || cVar.mo137899b() == 1000)) {
                bVar = EnumC19157b.UNKNOWN;
            } else {
                bVar = EnumC19157b.NETWORK_ERROR;
            }
            C19004g.f44970a.mo30157c("TTAudioEngineImpl", " ---> onError()  internal  --- errorCode is " + bVar.name());
            this.f45210f.mo30471a(bVar);
        }

        @Override // com.p2082ss.ttvideoengine.AbstractC86369ba
        /* renamed from: c */
        public final void mo16753c(C86313ai aiVar, int i) {
            this.f45210f.mo30486e(this.f45209e);
        }

        @Override // com.p2082ss.ttvideoengine.AbstractC86369ba
        /* renamed from: d */
        public final void mo16755d(C86313ai aiVar, int i) {
            this.f45210f.mo30488f(this.f45209e);
        }

        public C19084b(C19082c cVar, AbstractC19156a aVar) {
            C89219l.m154719c(cVar, "");
            C89219l.m154719c(aVar, "");
            this.f45209e = cVar;
            this.f45210f = aVar;
        }

        @Override // com.p2082ss.ttvideoengine.AbstractC86369ba
        /* renamed from: b */
        public final void mo16751b(C86313ai aiVar, int i) {
            EnumC19167l lVar;
            if (i == 1) {
                lVar = EnumC19167l.LOAD_STATE_PLAYABLE;
            } else if (i != 2) {
                lVar = EnumC19167l.LOAD_STATE_ERROR;
            } else {
                lVar = EnumC19167l.LOAD_STATE_STALLED;
            }
            lVar.name();
            this.f45210f.mo30474a(this.f45209e, lVar);
        }

        @Override // com.p2082ss.ttvideoengine.AbstractC86369ba
        /* renamed from: a */
        public final void mo16747a(C86313ai aiVar, int i) {
            if (i == 1) {
                this.f45209e.f45201e = false;
            } else if (i == 2) {
                this.f45209e.f45201e = false;
            }
            C19083a.m35528a(i).name();
            if (i == 1) {
                this.f45208d.postAtTime(new RunnableC19087c(this), this, SystemClock.uptimeMillis() + 50);
            } else {
                this.f45210f.mo30473a(this.f45209e, this.f45209e.mo30435e());
                this.f45208d.removeCallbacksAndMessages(this);
            }
            this.f45210f.mo30475a(this.f45209e, C19083a.m35528a(i));
        }
    }

    static {
        Covode.recordClassIndex(21845);
    }

    /* renamed from: k */
    private final C86313ai m35507k() {
        return (C86313ai) this.f45204i.getValue();
    }

    /* renamed from: com.bytedance.ies.xelement.defaultimpl.player.engine.a.b.a.c$a */
    public static final class C19083a {
        static {
            Covode.recordClassIndex(21846);
        }

        private C19083a() {
        }

        public /* synthetic */ C19083a(byte b) {
            this();
        }

        /* renamed from: a */
        public static EnumC19170o m35528a(int i) {
            if (i == 0) {
                return EnumC19170o.PLAYBACK_STATE_STOPPED;
            }
            if (i == 1) {
                return EnumC19170o.PLAYBACK_STATE_PLAYING;
            }
            if (i == 2) {
                return EnumC19170o.PLAYBACK_STATE_PAUSED;
            }
            if (i != 3) {
                return EnumC19170o.PLAYBACK_STATE_STOPPED;
            }
            return EnumC19170o.PLAYBACK_STATE_ERROR;
        }
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1377a.AbstractC19163h
    /* renamed from: f */
    public final long mo30436f() {
        return (long) m35507k().f193376x;
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1377a.AbstractC19163h
    /* renamed from: g */
    public final int mo30437g() {
        return m35507k().f193377y;
    }

    /* renamed from: l */
    private final void m35508l() {
        this.f45199c = false;
        this.f45200d = false;
        this.f45201e = false;
        this.f45202f = 0;
    }

    /* renamed from: m */
    private final boolean m35509m() {
        if (m35507k().f193374v == 2) {
            return true;
        }
        return false;
    }

    /* renamed from: n */
    private final boolean m35510n() {
        if (m35507k().f193374v == 0) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1377a.AbstractC19163h
    /* renamed from: d */
    public final EnumC19170o mo30434d() {
        return C19083a.m35528a(m35507k().f193374v);
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1377a.AbstractC19163h
    /* renamed from: e */
    public final long mo30435e() {
        return (long) m35507k().mo137267s();
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1377a.AbstractC19163h
    /* renamed from: h */
    public final long mo30438h() {
        return m35507k().mo137243i();
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1377a.AbstractC19163h
    /* renamed from: a */
    public final void mo30423a() {
        C19004g.f44970a.mo30155a("TTAudioEngineImpl", " ---> stop(),  already stop ?: " + m35510n());
        if (!m35510n()) {
            m35507k().mo137258m();
        }
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1377a.AbstractC19163h
    /* renamed from: b */
    public final void mo30431b() {
        C19004g.f44970a.mo30155a("TTAudioEngineImpl", " ---> stop(),  already pause ?: " + m35509m());
        if (!m35509m()) {
            m35507k().mo137255l();
        }
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1377a.AbstractC19163h
    /* renamed from: c */
    public final void mo30433c() {
        C19004g gVar = C19004g.f44970a;
        StringBuilder sb = new StringBuilder(" ---> resume(),  isPlaying ?: ");
        boolean z = true;
        if (m35507k().f193374v != 1) {
            z = false;
        }
        gVar.mo30155a("TTAudioEngineImpl", sb.append(z).toString());
        if (m35509m()) {
            m35507k().mo137251k();
        }
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1377a.AbstractC19163h
    /* renamed from: i */
    public final void mo30439i() {
        C19004g.f44970a.mo30155a("TTAudioEngineImpl", " ---> release(),  mIsEngineInstantiate ?: " + this.f45198b);
        if (this.f45198b) {
            m35507k().mo137173a((AbstractC86369ba) null);
            m35507k().mo137261n();
            return;
        }
        C19004g.f44970a.mo30157c("TTAudioEngineImpl", "TTVideoEngine is not instantiate, ignore release.");
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1377a.AbstractC19163h
    /* renamed from: j */
    public final boolean mo30440j() {
        try {
            Object a = C19067b.m35456a(m35507k()).mo30415a("mIsPlayComplete", Boolean.TYPE);
            C89219l.m154709a(a, "");
            return ((Boolean) a).booleanValue();
        } catch (Throwable unused) {
            return false;
        }
    }

    /* renamed from: com.bytedance.ies.xelement.defaultimpl.player.engine.a.b.a.c$c */
    static final class C19088c extends AbstractC89220m implements AbstractC89171a<C86313ai> {

        /* renamed from: a */
        final /* synthetic */ C19082c f45213a;

        /* renamed from: b */
        final /* synthetic */ Context f45214b;

        static {
            Covode.recordClassIndex(21851);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C19088c(C19082c cVar, Context context) {
            super(0);
            this.f45213a = cVar;
            this.f45214b = context;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C86313ai invoke() {
            C86313ai aiVar = new C86313ai(this.f45214b, 0);
            aiVar.mo137242h(false);
            aiVar.f192898aI = "TTAudioEngineImpl";
            aiVar.mo137230f(160, 1);
            aiVar.mo137230f(402, 1);
            aiVar.mo137230f(27, 1);
            aiVar.mo137230f(416, 0);
            aiVar.mo137230f(314, 1);
            aiVar.mo137230f(28, 6);
            aiVar.mo137230f(18, 1);
            aiVar.mo137230f(415, 1);
            aiVar.mo137230f(0, this.f45213a.f45197a);
            aiVar.f192912aW = true;
            C19082c cVar = this.f45213a;
            aiVar.mo137173a(new C19084b(cVar, cVar.f45203g));
            this.f45213a.f45198b = true;
            return aiVar;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.ies.xelement.defaultimpl.player.engine.a.b.a.c$d */
    public static final class C19089d implements AbstractC86651x {

        /* renamed from: a */
        final /* synthetic */ C19082c f45215a;

        /* renamed from: b */
        final /* synthetic */ AbstractC19168m f45216b;

        /* renamed from: c */
        final /* synthetic */ long f45217c;

        static {
            Covode.recordClassIndex(21852);
        }

        C19089d(C19082c cVar, AbstractC19168m mVar, long j) {
            this.f45215a = cVar;
            this.f45216b = mVar;
            this.f45217c = j;
        }

        @Override // com.p2082ss.ttvideoengine.AbstractC86651x
        /* renamed from: a */
        public final void mo30452a(boolean z) {
            AbstractC19168m mVar = this.f45216b;
            if (mVar != null) {
                mVar.mo30489a(this.f45217c, z);
            }
            this.f45215a.f45199c = false;
        }
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1377a.AbstractC19163h
    /* renamed from: a */
    public final void mo30424a(long j) {
        C19004g.f44970a.mo30155a("TTAudioEngineImpl", " ---> play(),  startPlayTime is ".concat(String.valueOf(j)));
        this.f45201e = true;
        if (this.f45200d) {
            m35507k().mo137251k();
        }
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1377a.AbstractC19163h
    /* renamed from: b */
    public final void mo30432b(String str) {
        C19004g.f44970a.mo30155a("TTAudioEngineImpl", " ---> setDirectURL(),  playUrl is ".concat(String.valueOf(str)));
        m35508l();
        m35507k().mo137241h(str);
        m35507k().mo137247j();
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1377a.AbstractC19163h
    /* renamed from: a */
    public final void mo30428a(String str) {
        C19004g.f44970a.mo30155a("TTAudioEngineImpl", " ---> setLocalURL(),  localFilePath is ".concat(String.valueOf(str)));
        m35508l();
        m35507k().mo137231f(str);
        m35507k().mo137247j();
    }

    public C19082c(Context context, AbstractC19156a aVar) {
        C89219l.m154719c(context, "");
        C89219l.m154719c(aVar, "");
        this.f45203g = aVar;
        this.f45204i = C89250i.m154773a((AbstractC89171a) new C19088c(this, context));
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1377a.AbstractC19163h
    /* renamed from: a */
    public final void mo30425a(long j, AbstractC19168m mVar) {
        C19004g.f44970a.mo30155a("TTAudioEngineImpl", " ---> seekToTime(),  time is ?: " + j + ",   mIsSeeking : " + this.f45199c);
        if (!this.f45199c && j >= 0) {
            this.f45199c = true;
            long a = C89271h.m154764a(0L, mo30436f() - InteractFirstFrameTimeOutDurationSetting.DEFAULT);
            if (j > a) {
                j = a;
            }
            m35507k().mo137163a((int) j, new C19089d(this, mVar, j));
        } else if (mVar != null) {
            mVar.mo30489a(j, false);
        }
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1377a.AbstractC19163h
    /* renamed from: a */
    public final void mo30426a(EnumC86649v vVar, C86535p pVar) {
        m35508l();
        if (pVar == null) {
            C19004g.f44970a.mo30155a("TTAudioEngineImpl", "videoMode is empty");
            return;
        }
        m35507k().mo137176a(pVar);
        m35507k().mo137178a(vVar);
        m35507k().mo137247j();
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1377a.AbstractC19163h
    /* renamed from: a */
    public final void mo30429a(String str, String str2) {
        C19004g.f44970a.mo30155a("TTAudioEngineImpl", " ---> setDirectUrlUseDataLoader(),  playUrl is " + str + ",   cacheKey is " + str2);
        m35508l();
        m35507k().mo137199b(str, str2);
        m35507k().mo137247j();
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1377a.AbstractC19163h
    /* renamed from: a */
    public final void mo30427a(FileDescriptor fileDescriptor, long j, long j2) {
        String str;
        C19004g gVar = C19004g.f44970a;
        StringBuilder sb = new StringBuilder(" ---> setDataSource(),  FileDescriptor is ");
        if (fileDescriptor != null) {
            str = fileDescriptor.toString();
        } else {
            str = null;
        }
        gVar.mo30155a("TTAudioEngineImpl", sb.append(str).toString());
        m35508l();
        m35507k().mo137181a(fileDescriptor, j, j2);
    }
}
