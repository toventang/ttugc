package com.p2082ss.android.ugc.asve.recorder.p2219a;

import android.text.TextUtils;
import com.bytedance.bpea.basics.PrivacyCert;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.asve.context.AbstractC31040h;
import com.p2082ss.android.ugc.asve.p2212a.AbstractC31014b;
import com.p2082ss.android.vesdk.C85310ah;
import com.p2082ss.android.vesdk.C85346av;
import com.p2082ss.android.vesdk.C85519k;
import com.p2082ss.android.vesdk.C85521l;
import com.p2082ss.android.vesdk.audio.AbstractC85340h;
import com.p2082ss.android.vesdk.audio.C85342j;
import com.p2082ss.android.vesdk.filterparam.VEAudioLoudnessBalanceFilter;
import com.p2082ss.android.vesdk.p4385a.C85298a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.asve.recorder.a.c */
public final class C31125c implements AbstractC31123a {

    /* renamed from: c */
    public static final C31126a f74580c = new C31126a((byte) 0);

    /* renamed from: a */
    final C85519k f74581a = new C85519k();

    /* renamed from: b */
    public AbstractC31014b f74582b;

    /* renamed from: d */
    private AbstractC85340h f74583d;

    /* renamed from: e */
    private String f74584e;

    /* renamed from: f */
    private final C85346av f74585f;

    /* renamed from: g */
    private final AbstractC31040h f74586g;

    static {
        Covode.recordClassIndex(37768);
    }

    /* renamed from: com.ss.android.ugc.asve.recorder.a.c$a */
    public static final class C31126a {
        static {
            Covode.recordClassIndex(37769);
        }

        private C31126a() {
        }

        public /* synthetic */ C31126a(byte b) {
            this();
        }
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.p2219a.AbstractC31123a
    /* renamed from: a */
    public final C85519k mo56570a() {
        return this.f74581a;
    }

    /* renamed from: com.ss.android.ugc.asve.recorder.a.c$c */
    public static final class C31128c implements AbstractC31014b.AbstractC31015a {

        /* renamed from: a */
        final /* synthetic */ C31125c f74588a;

        static {
            Covode.recordClassIndex(37771);
        }

        @Override // com.p2082ss.android.ugc.asve.p2212a.AbstractC31014b.AbstractC31015a
        /* renamed from: a */
        public final void mo56118a() {
            this.f74588a.f74581a.mo131428b();
        }

        @Override // com.p2082ss.android.ugc.asve.p2212a.AbstractC31014b.AbstractC31015a
        /* renamed from: b */
        public final void mo56119b() {
            this.f74588a.f74581a.mo131425a();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C31128c(C31125c cVar) {
            this.f74588a = cVar;
        }
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.p2219a.AbstractC31123a
    /* renamed from: b */
    public final void mo56576b() {
        this.f74581a.release(null);
        this.f74581a.mo131429b(this.f74583d);
        if (TextUtils.equals(this.f74584e, "record")) {
            this.f74584e = null;
            this.f74585f.mo130782b(false);
            this.f74581a.mo131429b(null);
        }
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.p2219a.AbstractC31124b
    /* renamed from: c */
    public final void mo56578c(PrivacyCert privacyCert) {
        mo56571a(privacyCert);
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.p2219a.AbstractC31124b
    /* renamed from: d */
    public final void mo56579d(PrivacyCert privacyCert) {
        mo56577b(privacyCert);
    }

    /* renamed from: com.ss.android.ugc.asve.recorder.a.c$b */
    public static final class C31127b implements AbstractC85340h {

        /* renamed from: a */
        final /* synthetic */ C31125c f74587a;

        static {
            Covode.recordClassIndex(37770);
        }

        @Override // com.p2082ss.android.vesdk.audio.AbstractC85340h
        public final void onError(int i, int i2, String str) {
        }

        @Override // com.p2082ss.android.vesdk.audio.AbstractC85340h
        public final void onReceive(C85342j jVar) {
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C31127b(C31125c cVar) {
            this.f74587a = cVar;
        }

        @Override // com.p2082ss.android.vesdk.audio.AbstractC85340h
        public final void onInfo(int i, int i2, double d, Object obj) {
            AbstractC31014b bVar;
            if (i == C85310ah.f190925M) {
                AbstractC31014b bVar2 = this.f74587a.f74582b;
                if (bVar2 != null) {
                    bVar2.mo56110j();
                }
            } else if (i == C85310ah.f190926N) {
                AbstractC31014b bVar3 = this.f74587a.f74582b;
                if (bVar3 != null) {
                    bVar3.mo56112l();
                }
            } else if (i == C85310ah.f190927O && (bVar = this.f74587a.f74582b) != null) {
                bVar.mo56114n();
            }
        }
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.p2219a.AbstractC31123a
    /* renamed from: a */
    public final int mo56569a(int i) {
        return this.f74585f.mo130685I().mo130889a(i);
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.p2219a.AbstractC31123a
    /* renamed from: b */
    public final int mo56574b(int i) {
        return this.f74585f.mo130685I().mo130893b(i);
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.p2219a.AbstractC31123a
    /* renamed from: a */
    public final int mo56568a(double d) {
        VEAudioLoudnessBalanceFilter vEAudioLoudnessBalanceFilter = new VEAudioLoudnessBalanceFilter();
        vEAudioLoudnessBalanceFilter.targetLoudness = d;
        return this.f74585f.mo130685I().mo130891a(vEAudioLoudnessBalanceFilter);
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.p2219a.AbstractC31123a
    /* renamed from: b */
    public final int mo56575b(String str) {
        C89219l.m154721d(str, "");
        return this.f74585f.mo130685I().mo130890a(new C85298a("audio mic detect delay", str));
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.p2219a.AbstractC31123a
    /* renamed from: a */
    public final void mo56571a(PrivacyCert privacyCert) {
        AbstractC31014b bVar;
        AbstractC31014b bVar2 = this.f74582b;
        if (bVar2 != null) {
            bVar2.mo56111k();
        }
        int start = this.f74581a.start(privacyCert);
        if (start != 0 && (bVar = this.f74582b) != null) {
            bVar.mo56100b(start, "Mic open failed in earlier stage");
        }
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.p2219a.AbstractC31123a
    /* renamed from: a */
    public final void mo56572a(AbstractC31014b bVar) {
        this.f74582b = bVar;
        if (bVar != null) {
            bVar.mo56097a(new C31128c(this));
        }
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.p2219a.AbstractC31123a
    /* renamed from: b */
    public final void mo56577b(PrivacyCert privacyCert) {
        AbstractC31014b bVar;
        AbstractC31014b bVar2 = this.f74582b;
        if (bVar2 != null) {
            bVar2.mo56113m();
        }
        int stop = this.f74581a.stop(privacyCert);
        if (stop != 0 && (bVar = this.f74582b) != null) {
            bVar.mo56102c(stop, "Mic close failed in earlier stage");
        }
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.p2219a.AbstractC31123a
    /* renamed from: a */
    public final void mo56573a(String str) {
        C85521l.C85522a aVar;
        AbstractC31014b bVar;
        C89219l.m154721d(str, "");
        C31127b bVar2 = new C31127b(this);
        this.f74583d = bVar2;
        this.f74584e = str;
        this.f74581a.mo131427a(bVar2);
        int hashCode = str.hashCode();
        if (hashCode != -934908847) {
            if (hashCode == 106541 && str.equals("ktv")) {
                aVar = new C85521l.C85522a(null).mo131431a(true);
            }
            throw new IllegalArgumentException("not a supported mode ".concat(String.valueOf(str)));
        }
        if (str.equals("record")) {
            this.f74585f.mo130782b(true);
            aVar = new C85521l.C85522a();
            AbstractC31040h hVar = this.f74586g;
            C89219l.m154721d(aVar, "");
            C89219l.m154721d(hVar, "");
            if (hVar.mo56164k().invoke().booleanValue()) {
                aVar.mo131430a(1);
            }
        }
        throw new IllegalArgumentException("not a supported mode ".concat(String.valueOf(str)));
        AbstractC31014b bVar3 = this.f74582b;
        if (bVar3 != null) {
            bVar3.mo56109i();
        }
        if (this.f74581a.init(aVar.f191584a) != 0 && (bVar = this.f74582b) != null) {
            bVar.mo56098a("Mic init failed in earlier stage");
        }
    }

    public C31125c(C85346av avVar, AbstractC31040h hVar) {
        C89219l.m154721d(avVar, "");
        C89219l.m154721d(hVar, "");
        this.f74585f = avVar;
        this.f74586g = hVar;
    }
}
