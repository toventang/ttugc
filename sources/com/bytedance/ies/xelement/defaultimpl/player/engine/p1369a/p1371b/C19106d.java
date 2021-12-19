package com.bytedance.ies.xelement.defaultimpl.player.engine.p1369a.p1371b;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import com.bytedance.android.livesdk.livesetting.pullstream.LiveNetAdaptiveHurryTimeSetting;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xelement.defaultimpl.player.engine.api.common.PlayModel;
import com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1377a.AbstractC19156a;
import com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1377a.AbstractC19159d;
import com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1377a.AbstractC19163h;
import com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1377a.AbstractC19164i;
import com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1377a.AbstractC19165j;
import com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1377a.AbstractC19168m;
import com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1377a.C19169n;
import com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1377a.EnumC19157b;
import com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1377a.EnumC19167l;
import com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1377a.EnumC19170o;
import com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1377a.EnumC19172q;
import com.bytedance.ies.xelement.defaultimpl.player.engine.p1369a.p1371b.p1372a.C19075b;
import com.bytedance.ies.xelement.defaultimpl.player.engine.p1369a.p1371b.p1372a.C19090d;
import com.bytedance.ies.xelement.p1364b.C18993a;
import com.bytedance.ies.xelement.p1364b.C19004g;
import com.bytedance.ies.xelement.p1364b.EnumC19011l;
import com.p2082ss.ttvideoengine.EnumC86649v;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.xelement.defaultimpl.player.engine.a.b.d */
public final class C19106d implements AbstractC19156a, AbstractC19165j {

    /* renamed from: g */
    public static final String f45237g = C19106d.class.getSimpleName();

    /* renamed from: h */
    public static final C19108b f45238h = new C19108b((byte) 0);

    /* renamed from: a */
    public C19169n f45239a;

    /* renamed from: b */
    long f45240b;

    /* renamed from: c */
    public AbstractC19164i f45241c = new C19090d();

    /* renamed from: d */
    public final Context f45242d;

    /* renamed from: e */
    public final AbstractC19159d f45243e;

    /* renamed from: f */
    public final C18993a f45244f;

    /* renamed from: i */
    private final AbstractC89244h f45245i = C89250i.m154773a((AbstractC89171a) new C19110d(this));

    /* renamed from: j */
    private EnumC19109c f45246j = EnumC19109c.INIT;

    /* renamed from: a */
    public final AbstractC19163h mo30470a() {
        return (AbstractC19163h) this.f45245i.getValue();
    }

    /* renamed from: com.bytedance.ies.xelement.defaultimpl.player.engine.a.b.d$b */
    public static final class C19108b {
        static {
            Covode.recordClassIndex(21871);
        }

        private C19108b() {
        }

        public /* synthetic */ C19108b(byte b) {
            this();
        }
    }

    /* renamed from: a */
    public final void mo30476a(C19169n nVar) {
        this.f45239a = nVar;
        m35585g();
    }

    /* renamed from: g */
    private final void m35585g() {
        this.f45246j = EnumC19109c.INIT;
        m35583a(this);
    }

    /* renamed from: b */
    public final void mo30477b() {
        if (this.f45239a != null) {
            mo30470a().mo30433c();
        }
    }

    /* renamed from: c */
    public final EnumC19170o mo30481c() {
        if (this.f45239a == null) {
            return EnumC19170o.PLAYBACK_STATE_STOPPED;
        }
        return mo30470a().mo30434d();
    }

    /* renamed from: d */
    public final long mo30483d() {
        if (this.f45239a == null) {
            return 0;
        }
        return mo30470a().mo30436f();
    }

    /* renamed from: f */
    public final void mo30487f() {
        this.f45239a = null;
        mo30470a().mo30439i();
    }

    /* renamed from: com.bytedance.ies.xelement.defaultimpl.player.engine.a.b.d$d */
    static final class C19110d extends AbstractC89220m implements AbstractC89171a<AbstractC19163h> {

        /* renamed from: a */
        final /* synthetic */ C19106d f45256a;

        static {
            Covode.recordClassIndex(21873);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C19110d(C19106d dVar) {
            super(0);
            this.f45256a = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ AbstractC19163h invoke() {
            return this.f45256a.f45241c.mo30422a(this.f45256a.f45242d, new C19107a());
        }
    }

    static {
        Covode.recordClassIndex(21869);
    }

    /* renamed from: e */
    public final long mo30485e() {
        if (this.f45239a == null) {
            return 0;
        }
        return (mo30483d() * ((long) mo30470a().mo30437g())) / 100;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.ies.xelement.defaultimpl.player.engine.a.b.d$c */
    public enum EnumC19109c {
        AFD(3000),
        LOCAL_FILE(LiveNetAdaptiveHurryTimeSetting.DEFAULT),
        PRELOAD_CACHE(1000),
        VIDEO_MODEL(500),
        PLAY_URL(0),
        INIT(-1);
        

        /* renamed from: g */
        final int f45255g;

        static {
            Covode.recordClassIndex(21872);
        }

        private EnumC19109c(int i) {
            this.f45255g = i;
        }
    }

    /* renamed from: com.bytedance.ies.xelement.defaultimpl.player.engine.a.b.d$a */
    final class C19107a implements AbstractC19156a {
        static {
            Covode.recordClassIndex(21870);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public C19107a() {
        }

        @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1377a.AbstractC19156a
        /* renamed from: a */
        public final void mo30472a(AbstractC19163h hVar) {
            C89219l.m154719c(hVar, "");
            C19106d.this.f45243e.mo30459b();
        }

        @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1377a.AbstractC19156a
        /* renamed from: b */
        public final void mo30479b(AbstractC19163h hVar) {
            C89219l.m154719c(hVar, "");
            C19106d.this.f45243e.mo30462d();
        }

        @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1377a.AbstractC19156a
        /* renamed from: c */
        public final void mo30482c(AbstractC19163h hVar) {
            C89219l.m154719c(hVar, "");
            C89219l.m154719c(hVar, "");
        }

        @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1377a.AbstractC19156a
        /* renamed from: d */
        public final void mo30484d(AbstractC19163h hVar) {
            C89219l.m154719c(hVar, "");
            C19106d.this.f45243e.mo30463e();
        }

        @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1377a.AbstractC19156a
        /* renamed from: e */
        public final void mo30486e(AbstractC19163h hVar) {
            C89219l.m154719c(hVar, "");
            C89219l.m154719c(hVar, "");
        }

        @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1377a.AbstractC19156a
        /* renamed from: f */
        public final void mo30488f(AbstractC19163h hVar) {
            C89219l.m154719c(hVar, "");
            C89219l.m154719c(hVar, "");
        }

        @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1377a.AbstractC19156a
        /* renamed from: a */
        public final void mo30471a(EnumC19157b bVar) {
            String str;
            C89219l.m154719c(bVar, "");
            C19004g.f44970a.mo30156b(C19106d.f45237g, "Playable: " + C19106d.this.f45239a + ", occurred an error " + bVar.getMsg());
            C19106d.this.mo30478b(bVar);
            EnumC19011l lVar = EnumC19011l.DEFAULT;
            if (C19106d.this.mo30470a() instanceof C19075b) {
                lVar = EnumC19011l.LIGHT;
            }
            C18993a aVar = C19106d.this.f45244f;
            String desc = lVar.getDesc();
            StringBuilder sb = new StringBuilder("play error and to switchResources, currentPlayable: ");
            C19169n nVar = C19106d.this.f45239a;
            String str2 = null;
            if (nVar != null) {
                str = nVar.toString();
            } else {
                str = null;
            }
            String sb2 = sb.append(str).toString();
            C19169n nVar2 = C19106d.this.f45239a;
            if (nVar2 != null) {
                str2 = nVar2.toString();
            }
            aVar.mo30148a(-1, desc, false, sb2, str2, -1);
        }

        @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1377a.AbstractC19156a
        /* renamed from: a */
        public final void mo30473a(AbstractC19163h hVar, long j) {
            C89219l.m154719c(hVar, "");
            C19106d.this.f45243e.mo30453a(j);
        }

        @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1377a.AbstractC19156a
        /* renamed from: b */
        public final void mo30480b(AbstractC19163h hVar, long j) {
            C89219l.m154719c(hVar, "");
            C19106d.this.f45243e.mo30460b(j);
        }

        @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1377a.AbstractC19156a
        /* renamed from: a */
        public final void mo30474a(AbstractC19163h hVar, EnumC19167l lVar) {
            C89219l.m154719c(hVar, "");
            C89219l.m154719c(lVar, "");
            C19106d.this.f45243e.mo30455a(lVar);
        }

        @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1377a.AbstractC19156a
        /* renamed from: a */
        public final void mo30475a(AbstractC19163h hVar, EnumC19170o oVar) {
            C89219l.m154719c(hVar, "");
            C89219l.m154719c(oVar, "");
            C19106d.this.f45243e.mo30457a(oVar);
        }
    }

    /* renamed from: a */
    private static /* synthetic */ void m35583a(C19106d dVar) {
        dVar.mo30478b(EnumC19157b.INVALIDATE_PLAYER_MODEL);
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1377a.AbstractC19156a
    /* renamed from: e */
    public final void mo30486e(AbstractC19163h hVar) {
        C89219l.m154719c(hVar, "");
        C89219l.m154719c(hVar, "");
    }

    /* renamed from: a */
    private final boolean m35584a(EnumC19109c cVar) {
        EnumC19109c cVar2 = this.f45246j;
        if (cVar2 == EnumC19109c.INIT) {
            this.f45246j = cVar;
            return true;
        } else if (cVar2.f45255g <= cVar.f45255g) {
            return false;
        } else {
            this.f45246j = cVar;
            return true;
        }
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1377a.AbstractC19156a
    /* renamed from: b */
    public final void mo30479b(AbstractC19163h hVar) {
        C89219l.m154719c(hVar, "");
        C89219l.m154719c(hVar, "");
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1377a.AbstractC19156a
    /* renamed from: c */
    public final void mo30482c(AbstractC19163h hVar) {
        C89219l.m154719c(hVar, "");
        C89219l.m154719c(hVar, "");
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1377a.AbstractC19156a
    /* renamed from: d */
    public final void mo30484d(AbstractC19163h hVar) {
        C89219l.m154719c(hVar, "");
        C89219l.m154719c(hVar, "");
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1377a.AbstractC19156a
    /* renamed from: f */
    public final void mo30488f(AbstractC19163h hVar) {
        C89219l.m154719c(hVar, "");
        C89219l.m154719c(hVar, "");
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1377a.AbstractC19156a
    /* renamed from: a */
    public final void mo30471a(EnumC19157b bVar) {
        C89219l.m154719c(bVar, "");
        C89219l.m154719c(bVar, "");
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1377a.AbstractC19156a
    /* renamed from: a */
    public final void mo30472a(AbstractC19163h hVar) {
        C89219l.m154719c(hVar, "");
        C89219l.m154719c(hVar, "");
    }

    /* renamed from: b */
    public final void mo30478b(EnumC19157b bVar) {
        C19169n nVar = this.f45239a;
        if (nVar != null) {
            if (nVar.f45319d == null || !m35584a(EnumC19109c.AFD)) {
                String str = nVar.f45317b;
                if (str == null || str.length() <= 0 || !m35584a(EnumC19109c.LOCAL_FILE)) {
                    String str2 = nVar.f45318c;
                    if (str2 == null || str2.length() <= 0 || !nVar.mo30519a() || !m35584a(EnumC19109c.PRELOAD_CACHE)) {
                        PlayModel playModel = nVar.f45320e;
                        if (playModel != null && playModel.getVideoModelJsonObj() != null && m35584a(EnumC19109c.VIDEO_MODEL)) {
                            PlayModel playModel2 = nVar.f45320e;
                            if (playModel2 != null) {
                                AbstractC19163h a = mo30470a();
                                EnumC86649v resolution = playModel2.getResolution();
                                playModel2.getEncryptType();
                                a.mo30426a(resolution, playModel2.getVideoModel());
                            }
                        } else if (!nVar.mo30519a() || !m35584a(EnumC19109c.PLAY_URL)) {
                            this.f45246j = EnumC19109c.INIT;
                            this.f45243e.mo30454a(bVar);
                        } else {
                            mo30470a().mo30432b(nVar.f45316a);
                        }
                    } else {
                        mo30470a().mo30429a(nVar.f45316a, nVar.f45318c);
                    }
                } else {
                    mo30470a().mo30428a(nVar.f45317b);
                }
            } else {
                AssetFileDescriptor assetFileDescriptor = nVar.f45319d;
                if (assetFileDescriptor != null) {
                    mo30470a().mo30427a(assetFileDescriptor.getFileDescriptor(), assetFileDescriptor.getStartOffset(), assetFileDescriptor.getDeclaredLength());
                }
            }
        }
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1377a.AbstractC19165j
    /* renamed from: a */
    public final void mo30377a(AbstractC19164i iVar) {
        C89219l.m154719c(iVar, "");
        this.f45241c = iVar;
    }

    /* renamed from: com.bytedance.ies.xelement.defaultimpl.player.engine.a.b.d$e */
    public static final class C19111e implements AbstractC19168m {

        /* renamed from: a */
        final /* synthetic */ C19106d f45257a;

        /* renamed from: b */
        final /* synthetic */ AbstractC19168m f45258b;

        static {
            Covode.recordClassIndex(21874);
        }

        C19111e(C19106d dVar, AbstractC19168m mVar) {
            this.f45257a = dVar;
            this.f45258b = mVar;
        }

        @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1377a.AbstractC19168m
        /* renamed from: a */
        public final void mo30489a(long j, boolean z) {
            EnumC19172q qVar;
            AbstractC19168m mVar = this.f45258b;
            if (mVar != null) {
                mVar.mo30489a(j, z);
            }
            AbstractC19159d dVar = this.f45257a.f45243e;
            if (z) {
                qVar = EnumC19172q.SEEK_SUCCESS;
            } else {
                qVar = EnumC19172q.SEEK_FAILED;
            }
            dVar.mo30458a(qVar);
        }
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1377a.AbstractC19156a
    /* renamed from: b */
    public final void mo30480b(AbstractC19163h hVar, long j) {
        C89219l.m154719c(hVar, "");
        C89219l.m154719c(hVar, "");
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1377a.AbstractC19156a
    /* renamed from: a */
    public final void mo30473a(AbstractC19163h hVar, long j) {
        C89219l.m154719c(hVar, "");
        C89219l.m154719c(hVar, "");
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1377a.AbstractC19156a
    /* renamed from: a */
    public final void mo30474a(AbstractC19163h hVar, EnumC19167l lVar) {
        C89219l.m154719c(hVar, "");
        C89219l.m154719c(lVar, "");
        C89219l.m154719c(hVar, "");
        C89219l.m154719c(lVar, "");
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1377a.AbstractC19156a
    /* renamed from: a */
    public final void mo30475a(AbstractC19163h hVar, EnumC19170o oVar) {
        C89219l.m154719c(hVar, "");
        C89219l.m154719c(oVar, "");
        C89219l.m154719c(hVar, "");
        C89219l.m154719c(oVar, "");
    }

    public C19106d(Context context, AbstractC19159d dVar, C18993a aVar) {
        C89219l.m154719c(context, "");
        C89219l.m154719c(dVar, "");
        C89219l.m154719c(aVar, "");
        this.f45242d = context;
        this.f45243e = dVar;
        this.f45244f = aVar;
    }
}
