package com.p2082ss.android.ugc.aweme.shortvideo.p3889w;

import android.content.Context;
import android.util.Log;
import androidx.appcompat.app.ActivityC0218d;
import com.bytedance.C2536a;
import com.bytedance.als.AbstractC2562j;
import com.bytedance.als.AbstractC2565m;
import com.bytedance.als.C2559g;
import com.bytedance.als.C2560h;
import com.bytedance.als.C2563k;
import com.bytedance.als.C2564l;
import com.bytedance.covode.number.Covode;
import com.bytedance.creativex.recorder.p940b.p941a.AbstractC14177d;
import com.bytedance.creativex.recorder.p940b.p941a.AbstractC14182g;
import com.bytedance.creativex.recorder.p940b.p941a.AbstractC14189i;
import com.bytedance.creativex.recorder.p940b.p941a.AbstractC14193m;
import com.bytedance.creativex.recorder.p940b.p941a.AbstractC14195n;
import com.bytedance.creativex.recorder.p940b.p941a.AbstractC14202u;
import com.bytedance.creativex.recorder.p940b.p941a.AbstractC14205v;
import com.bytedance.creativex.recorder.p940b.p941a.C14190j;
import com.bytedance.creativex.recorder.p940b.p941a.C14196o;
import com.bytedance.creativex.recorder.p940b.p941a.C14197p;
import com.bytedance.creativex.recorder.p940b.p941a.C14200s;
import com.bytedance.creativex.recorder.p940b.p941a.C14201t;
import com.bytedance.creativex.recorder.p940b.p941a.C14206w;
import com.bytedance.creativex.recorder.p940b.p941a.C14207x;
import com.bytedance.creativex.recorder.p940b.p941a.C14208y;
import com.bytedance.creativex.recorder.p940b.p941a.EnumC14169aa;
import com.bytedance.p1559o.AbstractC21566a;
import com.bytedance.p1559o.C21582f;
import com.bytedance.p1559o.p1561b.C21572a;
import com.p2082ss.android.ugc.asve.AbstractC31048d;
import com.p2082ss.android.ugc.asve.C31012a;
import com.p2082ss.android.ugc.asve.recorder.AbstractC31213i;
import com.p2082ss.android.ugc.asve.recorder.C31117a;
import com.p2082ss.android.ugc.asve.recorder.view.ASCameraView;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;
import com.p2082ss.android.ugc.aweme.shortvideo.C69836an;
import com.p2082ss.android.ugc.aweme.shortvideo.C70650dt;
import com.p2082ss.android.ugc.aweme.shortvideo.C70748dw;
import com.p2082ss.android.ugc.aweme.shortvideo.C70764eb;
import com.p2082ss.android.ugc.aweme.shortvideo.C72461o;
import com.p2082ss.android.ugc.aweme.shortvideo.CameraComponentModel;
import com.p2082ss.android.ugc.aweme.shortvideo.SafeHandler;
import com.p2082ss.android.ugc.aweme.shortvideo.WorkSpace.Workspace;
import com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.TimeSpeedModelExtension;
import com.p2082ss.android.ugc.aweme.shortvideo.p3889w.AbstractC74163b;
import com.p2082ss.android.ugc.aweme.shortvideo.record.AbstractC72742a;
import com.p2082ss.android.ugc.aweme.sticker.SavePhotoStickerInfo;
import com.p2082ss.android.ugc.aweme.tools.C78600h;
import com.p2082ss.android.ugc.aweme.tools.C78608j;
import com.p2082ss.android.ugc.aweme.tools.C78652m;
import com.p2082ss.android.ugc.aweme.tools.EnumC78601i;
import com.p2082ss.android.ugc.aweme.tools.extract.AbstractC78554o;
import com.p2082ss.android.ugc.tools.C84401c;
import com.p2082ss.android.ugc.tools.utils.C84902i;
import com.p2082ss.android.ugc.tools.view.widget.C85052j;
import com.p2082ss.android.ugc.trill.R;
import com.p2082ss.android.vesdk.C85310ah;
import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.p4591l.C88960c;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.p4601a.C89086z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89232y;
import p4600h.p4616h.AbstractC89248d;
import p4600h.p4620k.AbstractC89286i;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.w.g */
public class C74172g<T extends AbstractC14193m> extends AbstractC2562j<T> implements AbstractC14193m, AbstractC21566a {

    /* renamed from: a */
    static final /* synthetic */ AbstractC89286i[] f166570a = {new C89232y(C74172g.class, "activity", "getActivity()Landroidx/appcompat/app/AppCompatActivity;", 0), new C89232y(C74172g.class, "cameraApi", "getCameraApi()Lcom/bytedance/creativex/recorder/camera/api/CameraApiComponent;", 0)};

    /* renamed from: p */
    public static final C74173a f166571p = new C74173a((byte) 0);

    /* renamed from: A */
    private final C2563k<C89391z> f166572A;

    /* renamed from: B */
    private final C2563k<C89391z> f166573B;

    /* renamed from: C */
    private final C2563k<C78652m> f166574C;

    /* renamed from: D */
    private final C2564l<C14201t> f166575D;

    /* renamed from: E */
    private final C2563k<C14207x> f166576E;

    /* renamed from: F */
    private final C2563k<C14207x> f166577F;

    /* renamed from: G */
    private final C2563k<C14207x> f166578G;

    /* renamed from: H */
    private final C2563k<TimeSpeedModelExtension> f166579H;

    /* renamed from: I */
    private final C2563k<C89391z> f166580I;

    /* renamed from: J */
    private final C2563k<C89391z> f166581J;

    /* renamed from: K */
    private final C2563k<C14190j> f166582K;

    /* renamed from: L */
    private final C2563k<C14196o> f166583L;

    /* renamed from: M */
    private final C2564l<Boolean> f166584M;

    /* renamed from: N */
    private final C2564l<Boolean> f166585N;

    /* renamed from: O */
    private final C2564l<Boolean> f166586O;

    /* renamed from: P */
    private final C2564l<Boolean> f166587P;

    /* renamed from: Q */
    private final C2563k<C89391z> f166588Q;

    /* renamed from: R */
    private final C2563k<C89391z> f166589R;

    /* renamed from: S */
    private final C2563k<Object> f166590S;

    /* renamed from: T */
    private final C2564l<Boolean> f166591T;

    /* renamed from: U */
    private boolean f166592U;

    /* renamed from: V */
    private final boolean f166593V;

    /* renamed from: W */
    private final AbstractC89244h f166594W;

    /* renamed from: X */
    private final AbstractC89244h f166595X;

    /* renamed from: Y */
    private final AbstractC89244h f166596Y;

    /* renamed from: Z */
    private final AbstractC89244h f166597Z;

    /* renamed from: aA */
    private final C2559g<TimeSpeedModelExtension> f166598aA;

    /* renamed from: aB */
    private final C2559g<C74162a> f166599aB;

    /* renamed from: aC */
    private final C2559g<C89391z> f166600aC;

    /* renamed from: aD */
    private final C21582f f166601aD;

    /* renamed from: aa */
    private final AbstractC89244h f166602aa;

    /* renamed from: ab */
    private final T f166603ab;

    /* renamed from: ac */
    private final C88960c<AbstractC14182g> f166604ac;

    /* renamed from: ad */
    private final C2559g<C89391z> f166605ad;

    /* renamed from: ae */
    private final C2559g<C89391z> f166606ae;

    /* renamed from: af */
    private final C2559g<C14206w> f166607af;

    /* renamed from: ag */
    private final C2559g<C14206w> f166608ag;

    /* renamed from: ah */
    private final C2560h<Boolean> f166609ah;

    /* renamed from: ai */
    private final C2560h<Boolean> f166610ai;

    /* renamed from: aj */
    private final C2560h<Boolean> f166611aj;

    /* renamed from: ak */
    private final AbstractC89244h f166612ak;

    /* renamed from: al */
    private final C2559g<Long> f166613al;

    /* renamed from: am */
    private final C2559g<C89391z> f166614am;

    /* renamed from: an */
    private final C2559g<C14208y> f166615an;

    /* renamed from: ao */
    private final C2559g<C89391z> f166616ao;

    /* renamed from: ap */
    private final C2559g<C89391z> f166617ap;

    /* renamed from: aq */
    private final C88960c<AbstractC14202u> f166618aq;

    /* renamed from: ar */
    private final C2559g<C78652m> f166619ar;

    /* renamed from: as */
    private final C2559g<C89391z> f166620as;

    /* renamed from: at */
    private final C2559g<C14190j> f166621at;

    /* renamed from: au */
    private final C2559g<C14207x> f166622au;

    /* renamed from: av */
    private final C2559g<C14196o> f166623av;

    /* renamed from: aw */
    private final C2559g<C14207x> f166624aw;

    /* renamed from: ax */
    private final C2559g<C14207x> f166625ax;

    /* renamed from: ay */
    private final C2559g<C89391z> f166626ay;

    /* renamed from: az */
    private final C2560h<C14201t> f166627az;

    /* renamed from: b */
    public final C74180b f166628b;

    /* renamed from: c */
    public final CameraComponentModel f166629c;

    /* renamed from: d */
    public final SafeHandler f166630d;

    /* renamed from: e */
    public final C2563k<C14206w> f166631e;

    /* renamed from: f */
    public final C2563k<C89391z> f166632f;

    /* renamed from: g */
    public long f166633g;

    /* renamed from: h */
    public final Map<Class<? extends Object>, AbstractC14195n> f166634h;

    /* renamed from: i */
    public Class<? extends Object> f166635i;

    /* renamed from: j */
    public String f166636j;

    /* renamed from: k */
    public final C74171f f166637k;

    /* renamed from: l */
    public int f166638l;

    /* renamed from: m */
    public AbstractC89171a<Boolean> f166639m;

    /* renamed from: n */
    public final C2560h<Boolean> f166640n;

    /* renamed from: o */
    public final C2564l<Boolean> f166641o;

    /* renamed from: q */
    private final AbstractC89248d f166642q;

    /* renamed from: r */
    private final AbstractC89248d f166643r;

    /* renamed from: s */
    private final C2563k<C89391z> f166644s;

    /* renamed from: t */
    private final C2563k<C89391z> f166645t;

    /* renamed from: u */
    private final C2563k<C14206w> f166646u;

    /* renamed from: v */
    private final C2563k<C74162a> f166647v;

    /* renamed from: w */
    private final AbstractC89244h f166648w;

    /* renamed from: x */
    private final C2563k<Long> f166649x;

    /* renamed from: y */
    private final C2563k<C89391z> f166650y;

    /* renamed from: z */
    private final C2563k<C14208y> f166651z;

    static {
        Covode.recordClassIndex(86931);
    }

    /* renamed from: V */
    private final C70764eb m130388V() {
        return (C70764eb) this.f166597Z.getValue();
    }

    /* renamed from: H */
    public final AbstractC14177d mo116643H() {
        return (AbstractC14177d) this.f166643r.mo23374a(this, f166570a[1]);
    }

    /* renamed from: I */
    public final C2564l<Boolean> mo116644I() {
        return (C2564l) this.f166648w.getValue();
    }

    /* renamed from: J */
    public final C74172g<T>.C74187c mo116645J() {
        return (C74187c) this.f166594W.getValue();
    }

    /* renamed from: K */
    public final C72461o mo116646K() {
        return (C72461o) this.f166595X.getValue();
    }

    /* renamed from: L */
    public final C70748dw mo116647L() {
        return (C70748dw) this.f166596Y.getValue();
    }

    public final ActivityC0218d cA_() {
        return (ActivityC0218d) this.f166642q.mo23374a(this, f166570a[0]);
    }

    @Override // com.bytedance.creativex.recorder.p940b.p941a.AbstractC14193m
    /* renamed from: q */
    public final C2560h<Boolean> mo22910q() {
        return (C2560h) this.f166612ak.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.w.g$a */
    public static final class C74173a {
        static {
            Covode.recordClassIndex(86932);
        }

        private C74173a() {
        }

        public /* synthetic */ C74173a(byte b) {
            this();
        }
    }

    @Override // com.bytedance.creativex.recorder.p940b.p941a.AbstractC14193m
    /* renamed from: A */
    public final C2559g<C89391z> mo22865A() {
        return this.f166617ap;
    }

    @Override // com.bytedance.creativex.recorder.p940b.p941a.AbstractC14193m
    /* renamed from: C */
    public final C2559g<C78652m> mo22867C() {
        return this.f166619ar;
    }

    @Override // com.bytedance.creativex.recorder.p940b.p941a.AbstractC14193m
    /* renamed from: D */
    public final C2559g<C89391z> mo22868D() {
        return this.f166620as;
    }

    @Override // com.bytedance.creativex.recorder.p940b.p941a.AbstractC14193m
    /* renamed from: E */
    public final C2559g<C14190j> mo22869E() {
        return this.f166621at;
    }

    @Override // com.bytedance.creativex.recorder.p940b.p941a.AbstractC14193m
    /* renamed from: F */
    public final C2559g<C14196o> mo22870F() {
        return this.f166623av;
    }

    /* renamed from: M */
    public T getApiComponent() {
        return this.f166603ab;
    }

    @Override // com.bytedance.creativex.recorder.p940b.p941a.AbstractC14193m
    /* renamed from: a */
    public final C74171f mo22871a() {
        return this.f166637k;
    }

    @Override // com.bytedance.creativex.recorder.p940b.p941a.AbstractC14193m
    /* renamed from: b */
    public final C2559g<C89391z> mo22888b() {
        return this.f166600aC;
    }

    @Override // com.bytedance.creativex.recorder.p940b.p941a.AbstractC14193m
    /* renamed from: c */
    public final C2560h<Boolean> mo22891c() {
        return this.f166640n;
    }

    @Override // com.bytedance.creativex.recorder.p940b.p941a.AbstractC14193m
    /* renamed from: d */
    public final C2560h<Boolean> mo22894d() {
        return this.f166609ah;
    }

    @Override // com.bytedance.creativex.recorder.p940b.p941a.AbstractC14193m
    /* renamed from: e */
    public final /* bridge */ /* synthetic */ C2560h mo22896e() {
        return this.f166641o;
    }

    @Override // com.bytedance.creativex.recorder.p940b.p941a.AbstractC14193m
    /* renamed from: g */
    public final C2559g<C89391z> mo22900g() {
        return this.f166605ad;
    }

    @Override // com.bytedance.p1559o.AbstractC21566a
    public C21582f getDiContainer() {
        return this.f166601aD;
    }

    @Override // com.bytedance.creativex.recorder.p940b.p941a.AbstractC14193m
    /* renamed from: h */
    public final C2559g<C14206w> mo22901h() {
        return this.f166607af;
    }

    @Override // com.bytedance.creativex.recorder.p940b.p941a.AbstractC14193m
    /* renamed from: i */
    public final C2559g<C14206w> mo22902i() {
        return this.f166608ag;
    }

    @Override // com.bytedance.creativex.recorder.p940b.p941a.AbstractC14193m
    /* renamed from: j */
    public final C2559g<C89391z> mo22903j() {
        return this.f166606ae;
    }

    @Override // com.bytedance.creativex.recorder.p940b.p941a.AbstractC14193m
    /* renamed from: k */
    public final C2559g<C14207x> mo22904k() {
        return this.f166622au;
    }

    @Override // com.bytedance.creativex.recorder.p940b.p941a.AbstractC14193m
    /* renamed from: l */
    public final C2559g<C14207x> mo22905l() {
        return this.f166624aw;
    }

    @Override // com.bytedance.creativex.recorder.p940b.p941a.AbstractC14193m
    /* renamed from: m */
    public final C2559g<C14207x> mo22906m() {
        return this.f166625ax;
    }

    @Override // com.bytedance.creativex.recorder.p940b.p941a.AbstractC14193m
    /* renamed from: n */
    public final C2559g<C89391z> mo22907n() {
        return this.f166626ay;
    }

    @Override // com.bytedance.creativex.recorder.p940b.p941a.AbstractC14193m
    /* renamed from: o */
    public final C2560h<C14201t> mo22908o() {
        return this.f166627az;
    }

    @Override // com.bytedance.creativex.recorder.p940b.p941a.AbstractC14193m
    /* renamed from: p */
    public final C2559g<C74162a> mo22909p() {
        return this.f166599aB;
    }

    @Override // com.bytedance.creativex.recorder.p940b.p941a.AbstractC14193m
    /* renamed from: r */
    public final C2559g<Long> mo22911r() {
        return this.f166613al;
    }

    @Override // com.bytedance.creativex.recorder.p940b.p941a.AbstractC14193m
    /* renamed from: s */
    public final C2559g<TimeSpeedModelExtension> mo22912s() {
        return this.f166598aA;
    }

    @Override // com.bytedance.creativex.recorder.p940b.p941a.AbstractC14193m
    /* renamed from: t */
    public final C2559g<C89391z> mo22913t() {
        return this.f166614am;
    }

    @Override // com.bytedance.creativex.recorder.p940b.p941a.AbstractC14193m
    /* renamed from: u */
    public final C2559g<C14208y> mo22914u() {
        return this.f166615an;
    }

    @Override // com.bytedance.creativex.recorder.p940b.p941a.AbstractC14193m
    /* renamed from: w */
    public final C2559g<C89391z> mo22916w() {
        return this.f166616ao;
    }

    @Override // com.bytedance.creativex.recorder.p940b.p941a.AbstractC14193m
    /* renamed from: a */
    public final void mo22882a(Class<? extends Object> cls) {
        C89219l.m154721d(cls, "");
        this.f166635i = cls;
    }

    @Override // com.bytedance.creativex.recorder.p940b.p941a.AbstractC14193m
    /* renamed from: a */
    public final void mo22884a(Class<? extends Object> cls, AbstractC14195n nVar) {
        C89219l.m154721d(cls, "");
        C89219l.m154721d(nVar, "");
        this.f166634h.put(cls, nVar);
    }

    @Override // com.bytedance.creativex.recorder.p940b.p941a.AbstractC14193m
    /* renamed from: a */
    public final void mo22881a(AbstractC89171a<Boolean> aVar) {
        C89219l.m154721d(aVar, "");
        this.f166639m = aVar;
    }

    @Override // com.bytedance.creativex.recorder.p940b.p941a.AbstractC14193m
    /* renamed from: a */
    public final void mo22878a(C14206w wVar) {
        C89219l.m154721d(wVar, "");
        m130389a(this, false, 3);
        this.f166644s.mo6999a((C89391z) null);
        if (mo116643H().mo22747A().getMediaController().mo56606a()) {
            C84401c.f188722f.mo123662d("startRecording but is pre playing wait for preplay stop");
            mo116643H().mo22747A().getMediaController().mo56621h().observe(this, new C74177ad(this, wVar));
            return;
        }
        mo116663b(wVar);
    }

    @Override // com.bytedance.creativex.recorder.p940b.p941a.AbstractC14193m
    /* renamed from: a */
    public final void mo22883a(Class<? extends Object> cls, AbstractC14189i iVar) {
        AbstractC14195n nVar;
        C89219l.m154721d(cls, "");
        C89219l.m154721d(iVar, "");
        if (this.f166634h.containsKey(cls) && (nVar = this.f166634h.get(cls)) != null) {
            nVar.mo22920a(iVar);
        }
    }

    @Override // com.bytedance.creativex.recorder.p940b.p941a.AbstractC14193m
    /* renamed from: a */
    public final void mo22886a(boolean z) {
        mo22895d(true);
        this.f166647v.mo6999a(new C74162a(z));
    }

    @Override // com.bytedance.creativex.recorder.p940b.p941a.AbstractC14193m
    /* renamed from: a */
    public void mo22879a(C14207x xVar) {
        C89219l.m154721d(xVar, "");
        if (xVar.f34485a != 5 && xVar.f34485a != 4 && xVar.f34485a != 6) {
            this.f166576E.mo6999a(xVar);
        }
    }

    @Override // com.bytedance.creativex.recorder.p940b.p941a.AbstractC14193m
    /* renamed from: a */
    public final void mo22880a(C78600h hVar) {
        C89219l.m154721d(hVar, "");
        if (!C89219l.m154714a((Object) this.f166586O.mo7034a(), (Object) true)) {
            C74171f fVar = this.f166637k;
            String str = hVar.f176645a;
            C89219l.m154716b(str, "");
            fVar.mo116641a(str);
            this.f166592U = false;
            this.f166586O.mo7019b(true);
            if (!this.f166587P.mo7034a().booleanValue()) {
                this.f166587P.mo7035a(this);
                this.f166587P.mo7036a(this, new C74202n(this, hVar));
                return;
            }
            AbstractC14195n nVar = this.f166634h.get(this.f166635i);
            if (nVar == null) {
                C89219l.m154715b();
            }
            nVar.mo22921a(hVar);
        }
    }

    @Override // com.bytedance.creativex.recorder.p940b.p941a.AbstractC14193m
    /* renamed from: a */
    public final void mo22887a(boolean z, boolean z2) {
        mo22874a(z ? EnumC14169aa.FORM_60S : EnumC14169aa.FORM_15S, z2);
        this.f166629c.f155663s = !z2;
    }

    /* renamed from: a */
    public final void mo116659a(TimeSpeedModelExtension timeSpeedModelExtension) {
        this.f166579H.mo6999a(timeSpeedModelExtension);
    }

    @Override // com.bytedance.creativex.recorder.p940b.p941a.AbstractC14193m
    /* renamed from: a */
    public final void mo22885a(String str) {
        Boolean a = this.f166640n.mo7034a();
        C89219l.m154716b(a, "");
        if (a.booleanValue()) {
            mo22880a(new C78600h("click_next"));
            return;
        }
        C14207x a2 = new C14207x(str).mo22931a(4);
        C89219l.m154716b(a2, "");
        mo22889b(a2);
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.w.g$aa */
    static final class C74174aa extends AbstractC89220m implements AbstractC89171a<C74172g<T>.C74187c> {

        /* renamed from: a */
        final /* synthetic */ C74172g f166652a;

        static {
            Covode.recordClassIndex(86933);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C74174aa(C74172g gVar) {
            super(0);
            this.f166652a = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C74172g<T>.C74187c invoke() {
            return new C74187c();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.w.g$ac */
    static final class C74176ac extends AbstractC89220m implements AbstractC89171a<C2564l<Boolean>> {

        /* renamed from: a */
        final /* synthetic */ C74172g f166655a;

        static {
            Covode.recordClassIndex(86935);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C74176ac(C74172g gVar) {
            super(0);
            this.f166655a = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C2564l<Boolean> invoke() {
            return this.f166655a.mo116644I();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.w.g$s */
    static final class C74207s extends AbstractC89220m implements AbstractC89171a<Boolean> {

        /* renamed from: a */
        public static final C74207s f166711a = new C74207s();

        static {
            Covode.recordClassIndex(86966);
        }

        C74207s() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Boolean invoke() {
            return true;
        }
    }

    /* renamed from: P */
    public final void mo116651P() {
        this.f166580I.mo6999a(C89391z.f203057a);
    }

    @Override // com.bytedance.als.AbstractC2562j
    public void onPause() {
        super.onPause();
        mo116652Q();
    }

    @Override // com.bytedance.creativex.recorder.p940b.p941a.AbstractC14193m
    /* renamed from: x */
    public final void mo22917x() {
        this.f166572A.mo6999a(C89391z.f203057a);
    }

    @Override // com.bytedance.creativex.recorder.p940b.p941a.AbstractC14193m
    /* renamed from: y */
    public final void mo22918y() {
        this.f166645t.mo6999a(C89391z.f203057a);
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.w.g$c */
    public final class C74187c implements AbstractC31213i {

        /* renamed from: a */
        long f166683a = -100;

        /* renamed from: b */
        long f166684b;

        static {
            Covode.recordClassIndex(86946);
        }

        /* renamed from: com.ss.android.ugc.aweme.shortvideo.w.g$c$a */
        static final class RunnableC74188a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C74187c f166686a;

            /* renamed from: b */
            final /* synthetic */ long f166687b;

            static {
                Covode.recordClassIndex(86947);
            }

            RunnableC74188a(C74187c cVar, long j) {
                this.f166686a = cVar;
                this.f166687b = j;
            }

            public final void run() {
                C74172g.this.mo116667d(this.f166687b);
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public C74187c() {
        }

        @Override // com.p2082ss.android.vesdk.AbstractC85541q
        public final void onCallback(int i, int i2, float f, String str) {
            if (i == C85310ah.f190965y) {
                long j = (long) (f / 1000.0f);
                if (j != this.f166683a && j != 0) {
                    if (C74172g.this.f166628b.f166674o > 0 && ((double) C74172g.this.mo116655T().value()) >= 1.0d) {
                        long e = C74172g.this.mo116668e(j);
                        if (!C74172g.this.mo116664c(e) && !C74172g.this.mo116671f(e)) {
                            long j2 = this.f166684b;
                            if (j2 != 0 && j - j2 < ((long) C74172g.this.f166628b.f166674o)) {
                                return;
                            }
                        }
                        this.f166684b = j;
                    }
                    this.f166683a = j;
                    C74172g.this.f166630d.post(new RunnableC74188a(this, j));
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.w.g$e */
    static final class C74190e extends AbstractC89220m implements AbstractC89171a<C72461o> {

        /* renamed from: a */
        final /* synthetic */ C74172g f166689a;

        static {
            Covode.recordClassIndex(86949);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C74190e(C74172g gVar) {
            super(0);
            this.f166689a = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C72461o invoke() {
            C74172g gVar = this.f166689a;
            return new C72461o(gVar, gVar.f166629c, this.f166689a.f166628b.f166660a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.w.g$h */
    static final class C74196h extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C74172g f166696a;

        /* renamed from: b */
        final /* synthetic */ C14207x f166697b;

        static {
            Covode.recordClassIndex(86955);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C74196h(C74172g gVar, C14207x xVar) {
            super(0);
            this.f166696a = gVar;
            this.f166697b = xVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            Runnable runnable = this.f166697b.f34490f;
            if (runnable != null) {
                this.f166696a.f166630d.post(runnable);
            }
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.shortvideo.w.g$k */
    public static final class C74199k extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C74172g f166701a;

        /* renamed from: b */
        final /* synthetic */ int f166702b;

        static {
            Covode.recordClassIndex(86958);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C74199k(C74172g gVar, int i) {
            super(0);
            this.f166701a = gVar;
            this.f166702b = i;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            this.f166701a.mo116660b(this.f166702b);
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.shortvideo.w.g$o */
    public static final class RunnableC74203o implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C74172g f166707a;

        static {
            Covode.recordClassIndex(86962);
        }

        RunnableC74203o(C74172g gVar) {
            this.f166707a = gVar;
        }

        public final void run() {
            this.f166707a.mo22880a(new C78600h("stop_record"));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.shortvideo.w.g$p */
    public static final class RunnableC74204p implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C74172g f166708a;

        static {
            Covode.recordClassIndex(86963);
        }

        RunnableC74204p(C74172g gVar) {
            this.f166708a = gVar;
        }

        public final void run() {
            this.f166708a.mo22880a(new C78600h("click_next"));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.shortvideo.w.g$q */
    public static final class RunnableC74205q implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C74172g f166709a;

        static {
            Covode.recordClassIndex(86964);
        }

        RunnableC74205q(C74172g gVar) {
            this.f166709a = gVar;
        }

        public final void run() {
            this.f166709a.mo22880a(new C78600h("record_full"));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.shortvideo.w.g$r */
    public static final class RunnableC74206r implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C74172g f166710a;

        static {
            Covode.recordClassIndex(86965);
        }

        RunnableC74206r(C74172g gVar) {
            this.f166710a = gVar;
        }

        public final void run() {
            this.f166710a.mo22880a(new C78600h("stop_record"));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.w.g$t */
    static final class C74208t extends AbstractC89220m implements AbstractC89171a<C2564l<Boolean>> {

        /* renamed from: a */
        final /* synthetic */ C74172g f166712a;

        static {
            Covode.recordClassIndex(86967);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C74208t(C74172g gVar) {
            super(0);
            this.f166712a = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C2564l<Boolean> invoke() {
            return new C2564l(Boolean.valueOf(this.f166712a.f166628b.f166676q));
        }
    }

    @Override // com.bytedance.creativex.recorder.p940b.p941a.AbstractC14193m
    /* renamed from: B */
    public final AbstractC88979t<AbstractC14202u> mo22866B() {
        AbstractC88979t<AbstractC14202u> c = this.f166618aq.mo143283c();
        C89219l.m154716b(c, "");
        return c;
    }

    /* renamed from: N */
    public final AbstractC78554o mo116649N() {
        return mo116643H().mo22751E();
    }

    /* renamed from: O */
    public final void mo116650O() {
        this.f166630d.post(new RunnableC74201m(this));
    }

    /* renamed from: R */
    public final int mo116653R() {
        return mo116643H().mo22757K();
    }

    /* renamed from: S */
    public final ASCameraView mo116654S() {
        return mo116643H().mo22747A();
    }

    /* renamed from: T */
    public final EnumC78601i mo116655T() {
        return mo116643H().mo22754H();
    }

    /* renamed from: U */
    public final void mo116656U() {
        this.f166586O.mo7019b(false);
    }

    @Override // com.bytedance.creativex.recorder.p940b.p941a.AbstractC14193m
    /* renamed from: f */
    public final AbstractC88979t<AbstractC14182g> mo22898f() {
        AbstractC88979t<AbstractC14182g> c = this.f166604ac.mo143283c();
        C89219l.m154716b(c, "");
        return c;
    }

    @Override // com.bytedance.creativex.recorder.p940b.p941a.AbstractC14193m
    /* renamed from: z */
    public final void mo22919z() {
        mo22872a(0);
        this.f166573B.mo6999a(C89391z.f203057a);
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.w.g$ae */
    static final class C74178ae extends AbstractC89220m implements AbstractC89171a<C70748dw> {

        /* renamed from: a */
        final /* synthetic */ C74172g f166658a;

        static {
            Covode.recordClassIndex(86937);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C74178ae(C74172g gVar) {
            super(0);
            this.f166658a = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C70748dw invoke() {
            ActivityC0218d cA_ = this.f166658a.cA_();
            AbstractC14177d H = this.f166658a.mo116643H();
            C74172g gVar = this.f166658a;
            return new C70748dw(cA_, H, gVar, gVar.f166628b);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.w.g$af */
    static final class C74179af extends AbstractC89220m implements AbstractC89171a<C70764eb> {

        /* renamed from: a */
        final /* synthetic */ C74172g f166659a;

        static {
            Covode.recordClassIndex(86938);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C74179af(C74172g gVar) {
            super(0);
            this.f166659a = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C70764eb invoke() {
            AbstractC14177d H = this.f166659a.mo116643H();
            C74172g gVar = this.f166659a;
            return new C70764eb(H, gVar, gVar.f166628b, this.f166659a.f166630d, this.f166659a.f166628b.f166667h);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.w.g$b */
    public static final class C74180b {

        /* renamed from: a */
        public AbstractC74163b f166660a;

        /* renamed from: b */
        public C74224j f166661b;

        /* renamed from: c */
        public boolean f166662c;

        /* renamed from: d */
        public AbstractC89171a<Boolean> f166663d;

        /* renamed from: e */
        public AbstractC74170e f166664e;

        /* renamed from: f */
        public AbstractC74226l f166665f;

        /* renamed from: g */
        public AbstractC89172b<? super CameraComponentModel, Integer> f166666g;

        /* renamed from: h */
        public AbstractC72742a f166667h;

        /* renamed from: i */
        public boolean f166668i;

        /* renamed from: j */
        public AbstractC14205v f166669j;

        /* renamed from: k */
        public AbstractC89172b<? super CameraComponentModel, Boolean> f166670k;

        /* renamed from: l */
        public AbstractC89172b<? super CameraComponentModel, Boolean> f166671l;

        /* renamed from: m */
        public boolean f166672m;

        /* renamed from: n */
        public AbstractC89171a<Boolean> f166673n;

        /* renamed from: o */
        public int f166674o;

        /* renamed from: p */
        public AbstractC89171a<Boolean> f166675p;

        /* renamed from: q */
        public boolean f166676q;

        static {
            Covode.recordClassIndex(86939);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C74180b)) {
                return false;
            }
            C74180b bVar = (C74180b) obj;
            return C89219l.m154714a(this.f166660a, bVar.f166660a) && C89219l.m154714a(this.f166661b, bVar.f166661b) && this.f166662c == bVar.f166662c && C89219l.m154714a(this.f166663d, bVar.f166663d) && C89219l.m154714a(this.f166664e, bVar.f166664e) && C89219l.m154714a(this.f166665f, bVar.f166665f) && C89219l.m154714a(this.f166666g, bVar.f166666g) && C89219l.m154714a(this.f166667h, bVar.f166667h) && this.f166668i == bVar.f166668i && C89219l.m154714a(this.f166669j, bVar.f166669j) && C89219l.m154714a(this.f166670k, bVar.f166670k) && C89219l.m154714a(this.f166671l, bVar.f166671l) && this.f166672m == bVar.f166672m && C89219l.m154714a(this.f166673n, bVar.f166673n) && this.f166674o == bVar.f166674o && C89219l.m154714a(this.f166675p, bVar.f166675p) && this.f166676q == bVar.f166676q;
        }

        public final int hashCode() {
            AbstractC74163b bVar = this.f166660a;
            int i = 0;
            int hashCode = (bVar != null ? bVar.hashCode() : 0) * 31;
            C74224j jVar = this.f166661b;
            int hashCode2 = (hashCode + (jVar != null ? jVar.hashCode() : 0)) * 31;
            boolean z = this.f166662c;
            int i2 = 1;
            if (z) {
                z = true;
            }
            int i3 = z ? 1 : 0;
            int i4 = z ? 1 : 0;
            int i5 = z ? 1 : 0;
            int i6 = (hashCode2 + i3) * 31;
            AbstractC89171a<Boolean> aVar = this.f166663d;
            int hashCode3 = (i6 + (aVar != null ? aVar.hashCode() : 0)) * 31;
            AbstractC74170e eVar = this.f166664e;
            int hashCode4 = (hashCode3 + (eVar != null ? eVar.hashCode() : 0)) * 31;
            AbstractC74226l lVar = this.f166665f;
            int hashCode5 = (hashCode4 + (lVar != null ? lVar.hashCode() : 0)) * 31;
            AbstractC89172b<? super CameraComponentModel, Integer> bVar2 = this.f166666g;
            int hashCode6 = (hashCode5 + (bVar2 != null ? bVar2.hashCode() : 0)) * 31;
            AbstractC72742a aVar2 = this.f166667h;
            int hashCode7 = (hashCode6 + (aVar2 != null ? aVar2.hashCode() : 0)) * 31;
            boolean z2 = this.f166668i;
            if (z2) {
                z2 = true;
            }
            int i7 = z2 ? 1 : 0;
            int i8 = z2 ? 1 : 0;
            int i9 = z2 ? 1 : 0;
            int i10 = (hashCode7 + i7) * 31;
            AbstractC14205v vVar = this.f166669j;
            int hashCode8 = (i10 + (vVar != null ? vVar.hashCode() : 0)) * 31;
            AbstractC89172b<? super CameraComponentModel, Boolean> bVar3 = this.f166670k;
            int hashCode9 = (hashCode8 + (bVar3 != null ? bVar3.hashCode() : 0)) * 31;
            AbstractC89172b<? super CameraComponentModel, Boolean> bVar4 = this.f166671l;
            int hashCode10 = (hashCode9 + (bVar4 != null ? bVar4.hashCode() : 0)) * 31;
            boolean z3 = this.f166672m;
            if (z3) {
                z3 = true;
            }
            int i11 = z3 ? 1 : 0;
            int i12 = z3 ? 1 : 0;
            int i13 = z3 ? 1 : 0;
            int i14 = (hashCode10 + i11) * 31;
            AbstractC89171a<Boolean> aVar3 = this.f166673n;
            int hashCode11 = (((i14 + (aVar3 != null ? aVar3.hashCode() : 0)) * 31) + this.f166674o) * 31;
            AbstractC89171a<Boolean> aVar4 = this.f166675p;
            if (aVar4 != null) {
                i = aVar4.hashCode();
            }
            int i15 = (hashCode11 + i) * 31;
            if (!this.f166676q) {
                i2 = 0;
            }
            return i15 + i2;
        }

        public final String toString() {
            return "Config(maxDurationCalculator=" + this.f166660a + ", recordControlSetting=" + this.f166661b + ", enableAutoRetryRecord=" + this.f166662c + ", enableTitan=" + this.f166663d + ", reactionModelCallback=" + this.f166664e + ", shutterSoundProcessor=" + this.f166665f + ", hardEncodeVerify=" + this.f166666g + ", asCameraViewDecorator=" + this.f166667h + ", enableAudioCapture=" + this.f166668i + ", startCommandAudioControlStrategy=" + this.f166669j + ", enableMicControl=" + this.f166670k + ", isForceEnableAudio=" + this.f166671l + ", enableMicWithMusicAB=" + this.f166672m + ", updateProgressByVECallback=" + this.f166673n + ", progressUpdateInterval=" + this.f166674o + ", enableNoLastRecordFrame=" + this.f166675p + ", enableRecordBtnBeforeCamInit=" + this.f166676q + ")";
        }

        public /* synthetic */ C74180b() {
            this(new AbstractC74163b.C74164a(), new C74224j(), C741811.f166677a, C741822.f166678a, AbstractC72742a.f163102a, C741833.f166679a, C741844.f166680a, C741855.f166681a, C741866.f166682a);
        }

        /* renamed from: a */
        public final void mo116674a(AbstractC72742a aVar) {
            C89219l.m154721d(aVar, "");
            this.f166667h = aVar;
        }

        /* renamed from: b */
        public final void mo116679b(AbstractC89172b<? super CameraComponentModel, Boolean> bVar) {
            C89219l.m154721d(bVar, "");
            this.f166670k = bVar;
        }

        /* renamed from: a */
        public final void mo116675a(AbstractC74163b bVar) {
            C89219l.m154721d(bVar, "");
            this.f166660a = bVar;
        }

        /* renamed from: a */
        public final void mo116676a(C74224j jVar) {
            C89219l.m154721d(jVar, "");
            this.f166661b = jVar;
        }

        /* renamed from: a */
        public final void mo116677a(AbstractC89171a<Boolean> aVar) {
            C89219l.m154721d(aVar, "");
            this.f166673n = aVar;
        }

        /* renamed from: a */
        public final void mo116678a(AbstractC89172b<? super CameraComponentModel, Integer> bVar) {
            C89219l.m154721d(bVar, "");
            this.f166666g = bVar;
        }

        private C74180b(AbstractC74163b bVar, C74224j jVar, AbstractC89171a<Boolean> aVar, AbstractC89172b<? super CameraComponentModel, Integer> bVar2, AbstractC72742a aVar2, AbstractC89172b<? super CameraComponentModel, Boolean> bVar3, AbstractC89172b<? super CameraComponentModel, Boolean> bVar4, AbstractC89171a<Boolean> aVar3, AbstractC89171a<Boolean> aVar4) {
            C89219l.m154721d(bVar, "");
            C89219l.m154721d(jVar, "");
            C89219l.m154721d(aVar, "");
            C89219l.m154721d(bVar2, "");
            C89219l.m154721d(aVar2, "");
            C89219l.m154721d(bVar3, "");
            C89219l.m154721d(bVar4, "");
            C89219l.m154721d(aVar3, "");
            C89219l.m154721d(aVar4, "");
            this.f166660a = bVar;
            this.f166661b = jVar;
            this.f166662c = true;
            this.f166663d = aVar;
            this.f166664e = null;
            this.f166665f = null;
            this.f166666g = bVar2;
            this.f166667h = aVar2;
            this.f166668i = false;
            this.f166669j = null;
            this.f166670k = bVar3;
            this.f166671l = bVar4;
            this.f166672m = false;
            this.f166673n = aVar3;
            this.f166674o = 0;
            this.f166675p = aVar4;
            this.f166676q = false;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.w.g$d */
    public final class RunnableC74189d implements Runnable {
        static {
            Covode.recordClassIndex(86948);
        }

        public final void run() {
            SafeHandler safeHandler = C74172g.this.f166630d;
            if (C74172g.this.mo116667d(C74172g.this.mo116654S().getEndFrameTimeUS() / 1000) && safeHandler != null) {
                safeHandler.post(this);
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public RunnableC74189d() {
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.w.g$i */
    static final class C74197i extends AbstractC89220m implements AbstractC89171a<C69836an> {

        /* renamed from: a */
        final /* synthetic */ C74172g f166698a;

        static {
            Covode.recordClassIndex(86956);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C74197i(C74172g gVar) {
            super(0);
            this.f166698a = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C69836an invoke() {
            AbstractC14177d H = this.f166698a.mo116643H();
            C74172g gVar = this.f166698a;
            return new C69836an(H, gVar, gVar.f166629c, this.f166698a.f166628b);
        }
    }

    @Override // com.bytedance.als.AbstractC2562j
    public void onResume() {
        super.onResume();
        this.f166586O.mo7019b(false);
        this.f166592U = true;
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.w.g$m */
    static final class RunnableC74201m implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C74172g f166704a;

        static {
            Covode.recordClassIndex(86960);
        }

        RunnableC74201m(C74172g gVar) {
            this.f166704a = gVar;
        }

        public final void run() {
            if (this.f166704a.f166628b.f166673n.invoke().booleanValue()) {
                C74172g gVar = this.f166704a;
                gVar.mo116654S().mo56927b(gVar.mo116645J());
                C74172g<T>.C74187c J = this.f166704a.mo116645J();
                J.f166683a = -100;
                J.f166684b = 0;
            }
            this.f166704a.f166632f.mo6999a(C89391z.f203057a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.w.g$ab */
    static final class RunnableC74175ab implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C74172g f166653a;

        /* renamed from: b */
        final /* synthetic */ int f166654b;

        static {
            Covode.recordClassIndex(86934);
        }

        RunnableC74175ab(C74172g gVar, int i) {
            this.f166653a = gVar;
            this.f166654b = i;
        }

        public final void run() {
            int i;
            Context applicationContext = this.f166653a.cA_().getApplicationContext();
            if (C58003a.f132201c && applicationContext == null) {
                applicationContext = C58003a.f132199a;
            }
            C74172g gVar = this.f166653a;
            int i2 = gVar.f166638l;
            gVar.f166638l = i2 + 1;
            if (i2 < 2) {
                i = R.string.fc8;
            } else {
                i = R.string.fc9;
            }
            C85052j.C85053a.m146245a(applicationContext, i, 0).mo129996a();
            C14207x a = new C14207x("process running error, error code: " + this.f166654b).mo22931a(1);
            C74172g gVar2 = this.f166653a;
            C89219l.m154716b(a, "");
            gVar2.mo22889b(a);
        }
    }

    /* renamed from: Q */
    public final void mo116652Q() {
        C84401c.f188722f.mo123658a("forceStopRecord() called");
        if (this.f166640n.mo7034a().booleanValue()) {
            Boolean a = this.f166610ai.mo7034a();
            C89219l.m154716b(a, "");
            if (!a.booleanValue()) {
                return;
            }
        }
        C84401c.f188722f.mo123658a("real forceStopRecord() called");
        C14207x a2 = new C14207x("forceStopRecord").mo22930a();
        C89219l.m154716b(a2, "");
        mo22889b(a2);
    }

    @Override // com.bytedance.als.AbstractC2562j
    public void onCreate() {
        super.onCreate();
        mo116643H().mo22772Z().mo6997a(cA_(), new C74209u(this));
        this.f166584M.mo7036a(this, new C74210v(this));
        this.f166591T.mo7036a(this, new C74211w(this));
        mo116643H().mo22827o().mo6997a(cA_(), new C74212x(this));
        mo116643H().mo22837y().mo6997a(cA_(), new C74213y(this));
        ASCameraView S = mo116654S();
        C74214z zVar = new C74214z(this);
        C89219l.m154721d(zVar, "");
        C31117a aVar = S.f74875d;
        if (aVar == null) {
            C89219l.m154710a("recorder");
        }
        aVar.mo56541a(zVar);
        this.f166586O.mo7019b(false);
        this.f166592U = true;
    }

    @Override // com.bytedance.creativex.recorder.p940b.p941a.AbstractC14193m
    /* renamed from: v */
    public final void mo22915v() {
        int N;
        m130389a(this, true, 2);
        if (mo116643H().mo22766T()) {
            N = mo116643H().mo22762P();
        } else {
            N = mo116643H().mo22760N();
        }
        if (mo116653R() == 1) {
            if (N == 0) {
                this.f166651z.mo6999a(new C14208y(false));
            } else if (N == 1) {
                this.f166651z.mo6999a(new C14208y(true));
            } else if (N == 2) {
                this.f166651z.mo6999a(new C14208y(true));
            }
        } else if (N == 0) {
            this.f166651z.mo6999a(new C14208y(false));
        } else if (N == 1) {
            this.f166651z.mo6999a(new C14208y(mo116643H().mo22763Q()));
        } else if (N == 2) {
            this.f166651z.mo6999a(new C14208y(mo116643H().mo22763Q()));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.shortvideo.w.g$f */
    public static final class C74191f extends AbstractC89220m implements AbstractC89172b<Integer, C89391z> {

        /* renamed from: a */
        public static final C74191f f166690a = new C74191f();

        static {
            Covode.recordClassIndex(86950);
        }

        C74191f() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Integer num) {
            num.intValue();
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.w.g$l */
    static final class C74200l extends AbstractC89220m implements AbstractC89172b<Integer, C89391z> {

        /* renamed from: a */
        public static final C74200l f166703a = new C74200l();

        static {
            Covode.recordClassIndex(86959);
        }

        C74200l() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Integer num) {
            num.intValue();
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.shortvideo.w.g$u */
    public static final class C74209u<T> implements AbstractC2565m<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C74172g f166713a;

        static {
            Covode.recordClassIndex(86968);
        }

        C74209u(C74172g gVar) {
            this.f166713a = gVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(C89391z zVar) {
            this.f166713a.mo116652Q();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.shortvideo.w.g$x */
    public static final class C74212x<T> implements AbstractC2565m<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C74172g f166716a;

        static {
            Covode.recordClassIndex(86971);
        }

        C74212x(C74172g gVar) {
            this.f166716a = gVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(C89391z zVar) {
            this.f166716a.mo116661b(-1L);
        }
    }

    @Override // com.bytedance.creativex.recorder.p940b.p941a.AbstractC14193m
    /* renamed from: a */
    public final void mo22873a(long j) {
        this.f166633g = j;
    }

    /* renamed from: b */
    public final void mo116660b(int i) {
        C14206w wVar = new C14206w(mo116655T());
        wVar.f34483b = i;
        mo22878a(wVar);
    }

    @Override // com.bytedance.creativex.recorder.p940b.p941a.AbstractC14193m
    /* renamed from: e */
    public final void mo22897e(boolean z) {
        this.f166591T.mo7019b(Boolean.valueOf(z));
    }

    /* renamed from: e_ */
    public final void mo116670e_(boolean z) {
        this.f166584M.mo7019b(Boolean.valueOf(z));
    }

    /* renamed from: h */
    public final void mo116672h(boolean z) {
        this.f166585N.mo7019b(Boolean.valueOf(!z));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.shortvideo.w.g$v */
    public static final class C74210v<T> implements AbstractC2565m<Boolean> {

        /* renamed from: a */
        final /* synthetic */ C74172g f166714a;

        static {
            Covode.recordClassIndex(86969);
        }

        C74210v(C74172g gVar) {
            this.f166714a = gVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Boolean bool) {
            Boolean bool2 = bool;
            AbstractC14177d H = this.f166714a.mo116643H();
            C89219l.m154716b(bool2, "");
            H.mo22817f(bool2.booleanValue());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.shortvideo.w.g$w */
    public static final class C74211w<T> implements AbstractC2565m<Boolean> {

        /* renamed from: a */
        final /* synthetic */ C74172g f166715a;

        static {
            Covode.recordClassIndex(86970);
        }

        C74211w(C74172g gVar) {
            this.f166715a = gVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Boolean bool) {
            Boolean bool2 = bool;
            AbstractC14177d H = this.f166715a.mo116643H();
            C89219l.m154716b(bool2, "");
            H.mo22819g(bool2.booleanValue());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.shortvideo.w.g$y */
    public static final class C74213y<T> implements AbstractC2565m<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C74172g f166717a;

        static {
            Covode.recordClassIndex(86972);
        }

        C74213y(C74172g gVar) {
            this.f166717a = gVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(C89391z zVar) {
            if (!this.f166717a.f166640n.mo7034a().booleanValue()) {
                this.f166717a.mo116652Q();
            }
        }
    }

    @Override // com.bytedance.creativex.recorder.p940b.p941a.AbstractC14193m
    /* renamed from: a */
    public final void mo22872a(int i) {
        AbstractC74226l lVar = this.f166628b.f166665f;
        if (lVar != null) {
            ASCameraView S = mo116654S();
            new C74199k(this, i);
            lVar.mo116639a(S);
        }
        mo116660b(i);
    }

    @Override // com.bytedance.creativex.recorder.p940b.p941a.AbstractC14193m
    /* renamed from: b */
    public final void mo22889b(C14207x xVar) {
        C89219l.m154721d(xVar, "");
        m130388V().onEvent(xVar);
    }

    @Override // com.bytedance.creativex.recorder.p940b.p941a.AbstractC14193m
    /* renamed from: c */
    public final void mo22892c(C14207x xVar) {
        C89219l.m154721d(xVar, "");
        ((C69836an) this.f166602aa.getValue()).onEvent(xVar);
    }

    @Override // com.bytedance.creativex.recorder.p940b.p941a.AbstractC14193m
    /* renamed from: f */
    public final void mo22899f(boolean z) {
        this.f166587P.mo7019b(Boolean.valueOf(z));
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.w.g$ad */
    public static final class C74177ad implements AbstractC2565m<Boolean> {

        /* renamed from: a */
        final /* synthetic */ C74172g f166656a;

        /* renamed from: b */
        final /* synthetic */ C14206w f166657b;

        static {
            Covode.recordClassIndex(86936);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Boolean bool) {
            boolean booleanValue = bool.booleanValue();
            C84401c.f188722f.mo123662d("startRecording StopPrePlayState:".concat(String.valueOf(booleanValue)));
            if (booleanValue) {
                this.f166656a.mo116663b(this.f166657b);
                this.f166656a.mo116643H().mo22747A().getMediaController().mo56621h().removeObserver(this);
            }
        }

        C74177ad(C74172g gVar, C14206w wVar) {
            this.f166656a = gVar;
            this.f166657b = wVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.w.g$j */
    public static final class C74198j implements AbstractC2565m<Boolean> {

        /* renamed from: a */
        final /* synthetic */ C74172g f166699a;

        /* renamed from: b */
        final /* synthetic */ AbstractC14182g f166700b;

        static {
            Covode.recordClassIndex(86957);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Boolean bool) {
            if (bool.booleanValue()) {
                this.f166699a.mo116643H().mo22818g().mo7037a(this);
                this.f166699a.mo116647L().mo111540a(((AbstractC14182g.C14187e) this.f166700b).f34460a);
            }
        }

        C74198j(C74172g gVar, AbstractC14182g gVar2) {
            this.f166699a = gVar;
            this.f166700b = gVar2;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.shortvideo.w.g$n */
    public static final class C74202n<T> implements AbstractC2565m<Boolean> {

        /* renamed from: a */
        final /* synthetic */ C74172g f166705a;

        /* renamed from: b */
        final /* synthetic */ C78600h f166706b;

        static {
            Covode.recordClassIndex(86961);
        }

        C74202n(C74172g gVar, C78600h hVar) {
            this.f166705a = gVar;
            this.f166706b = hVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Boolean bool) {
            if (!bool.booleanValue()) {
                return;
            }
            if (this.f166705a.f166634h.get(this.f166705a.f166635i) != null) {
                AbstractC14195n nVar = this.f166705a.f166634h.get(this.f166705a.f166635i);
                if (nVar == null) {
                    C89219l.m154715b();
                }
                nVar.mo22921a(this.f166706b);
                return;
            }
            C84401c.f188722f.mo123662d("RecordControl goNext nextActionMap curActionType is null");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.shortvideo.w.g$z */
    public static final class C74214z extends AbstractC89220m implements AbstractC89172b<Integer, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C74172g f166718a;

        static {
            Covode.recordClassIndex(86973);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C74214z(C74172g gVar) {
            super(1);
            this.f166718a = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Integer num) {
            int intValue = num.intValue();
            C74172g gVar = this.f166718a;
            gVar.mo116657a(new AbstractC14182g.C14183a(intValue));
            if (gVar.f166628b.f166662c) {
                gVar.f166630d.post(new RunnableC74175ab(gVar, intValue));
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: b */
    public final void mo116661b(long j) {
        long j2;
        if (this.f166629c.f155653i) {
            j2 = this.f166629c.f155654j;
        } else {
            j2 = this.f166629c.f155651g;
        }
        if (j > 0) {
            j2 += TimeSpeedModelExtension.calculateRealTime(j, (double) mo116655T().value());
        }
        mo116662b(C14201t.m25946a(this.f166629c.mo109891d(), j2));
    }

    /* renamed from: c */
    public final boolean mo116664c(long j) {
        long j2 = this.f166633g;
        if (j2 <= 0 || j2 >= this.f166629c.mo109899k() || j <= j2) {
            return false;
        }
        return true;
    }

    /* renamed from: e */
    public final long mo116668e(long j) {
        long calculateRealTime;
        long h;
        if (this.f166629c.f155665u == 1) {
            calculateRealTime = TimeSpeedModelExtension.calculateRealTime(j, (double) EnumC78601i.NORMAL.value());
            h = this.f166629c.mo109896h();
        } else {
            calculateRealTime = TimeSpeedModelExtension.calculateRealTime(j, (double) mo116655T().value());
            h = this.f166629c.mo109896h();
        }
        return calculateRealTime + h;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final boolean mo116671f(long j) {
        if (j >= this.f166629c.mo109899k()) {
            return true;
        }
        return false;
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.w.g$g */
    static final class C74192g extends AbstractC89220m implements AbstractC89172b<Integer, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C74172g f166691a;

        /* renamed from: b */
        final /* synthetic */ C14207x f166692b;

        static {
            Covode.recordClassIndex(86951);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C74192g(C74172g gVar, C14207x xVar) {
            super(1);
            this.f166691a = gVar;
            this.f166692b = xVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Integer num) {
            num.intValue();
            if (this.f166692b.f34485a == 4) {
                this.f166691a.f166630d.post(new Runnable(this) {
                    /* class com.p2082ss.android.ugc.aweme.shortvideo.p3889w.C74172g.C74192g.RunnableC741931 */

                    /* renamed from: a */
                    final /* synthetic */ C74192g f166693a;

                    static {
                        Covode.recordClassIndex(86952);
                    }

                    {
                        this.f166693a = r1;
                    }

                    public final void run() {
                        this.f166693a.f166691a.mo22880a(new C78600h("click_next"));
                    }
                });
            } else if (this.f166692b.f34485a == 2) {
                this.f166691a.f166630d.post(new Runnable(this) {
                    /* class com.p2082ss.android.ugc.aweme.shortvideo.p3889w.C74172g.C74192g.RunnableC741942 */

                    /* renamed from: a */
                    final /* synthetic */ C74192g f166694a;

                    static {
                        Covode.recordClassIndex(86953);
                    }

                    {
                        this.f166694a = r1;
                    }

                    public final void run() {
                        this.f166694a.f166691a.mo22880a(new C78600h("record_full"));
                    }
                });
            } else if (this.f166692b.f34485a == 5) {
                this.f166691a.f166630d.post(new Runnable(this) {
                    /* class com.p2082ss.android.ugc.aweme.shortvideo.p3889w.C74172g.C74192g.RunnableC741953 */

                    /* renamed from: a */
                    final /* synthetic */ C74192g f166695a;

                    static {
                        Covode.recordClassIndex(86954);
                    }

                    {
                        this.f166695a = r1;
                    }

                    public final void run() {
                        this.f166695a.f166691a.mo22880a(new C78600h("stop_record"));
                    }
                });
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: a */
    public final void mo116657a(AbstractC14182g gVar) {
        C89219l.m154721d(gVar, "");
        this.f166604ac.onNext(gVar);
        if (gVar instanceof AbstractC14182g.C14187e) {
            mo116643H().mo22818g().mo7036a(cA_(), new C74198j(this, gVar));
        }
    }

    /* renamed from: b */
    public final void mo116662b(C14201t tVar) {
        this.f166575D.mo7019b(tVar);
        if (tVar != null) {
            if (tVar.f34477b > 0 || this.f166629c.f155653i) {
                this.f166641o.mo7019b(true);
            }
            tVar.mo22926a();
        }
    }

    @Override // com.bytedance.creativex.recorder.p940b.p941a.AbstractC14193m
    /* renamed from: c */
    public final void mo22893c(boolean z) {
        mo22895d(z);
        if (this.f166628b.f166670k.invoke(this.f166629c).booleanValue()) {
            mo116643H().mo22782a(new C78608j(3));
        }
        mo116646K().mo114729a();
        mo116662b(C14201t.m25948a((List<TimeSpeedModelExtension>) C89086z.INSTANCE, 0L, true));
        mo22887a(this.f166629c.f155664t, false);
        this.f166586O.mo7019b(false);
        this.f166650y.mo6999a(C89391z.f203057a);
        if (!this.f166629c.f155653i) {
            this.f166641o.mo7019b(false);
        }
    }

    /* renamed from: d */
    public final void mo116666d(C14207x xVar) {
        C89219l.m154721d(xVar, "");
        mo116654S().mo56915a(new C74192g(this, xVar), new C74196h(this, xVar));
        C31012a.m63724a().mo56187a().mo56122c("StopRecordingCommandEvent, recordState=" + xVar.f34485a);
        AbstractC31048d a = C31012a.m63724a().mo56187a();
        String stackTraceString = Log.getStackTraceString(new Throwable());
        C89219l.m154716b(stackTraceString, "");
        a.mo56122c(stackTraceString);
    }

    /* renamed from: f */
    private final void m130390f(C14207x xVar) {
        long endFrameTimeUS = mo116654S().getEndFrameTimeUS() / 1000;
        C84401c.f188722f.mo123658a("handleEventRecordState,durationSDK:" + endFrameTimeUS + ",eventState:" + xVar.f34485a + ",reason:" + xVar.f34491g + ",lastRecordFrameNum:" + mo116654S().getLastRecordFrameNum() + ",enableNoLastRecordFrame:" + this.f166628b.f166675p.invoke().booleanValue());
        if (xVar.f34485a == 1) {
            mo22892c(xVar);
            this.f166629c.f155649e = this.f166628b.f166666g.invoke(this.f166629c).intValue();
        } else if ((0 > endFrameTimeUS || 10 < endFrameTimeUS) && (mo116654S().getLastRecordFrameNum() > 0 || this.f166628b.f166675p.invoke().booleanValue())) {
            mo116662b(C14201t.m25946a(this.f166629c.mo109891d(), this.f166629c.mo109896h()));
            if (xVar.f34485a == 4) {
                this.f166630d.post(new RunnableC74204p(this));
            } else if (xVar.f34485a == 2) {
                this.f166630d.post(new RunnableC74205q(this));
            } else if (xVar.f34485a == 5) {
                this.f166630d.post(new RunnableC74206r(this));
            }
        } else if (xVar.f34485a == 5) {
            this.f166630d.post(new RunnableC74203o(this));
        } else {
            mo22892c(xVar);
        }
    }

    /* renamed from: i */
    private final void m130391i(boolean z) {
        int N;
        if (mo116643H().mo22766T()) {
            N = mo116643H().mo22762P();
        } else {
            N = mo116643H().mo22760N();
        }
        if (mo116653R() == 1 || !mo116643H().mo22763Q()) {
            if (mo116653R() != 1 || !mo116643H().mo22765S()) {
                if (mo116653R() != 1 && !mo116643H().mo22763Q() && N == 3) {
                    mo116643H().mo22789a(z, this.f166651z);
                }
            } else if (N == 1) {
                mo116643H().mo22764R();
            } else if (N == 2) {
                mo116643H().mo22764R();
            } else if (N == 3) {
                mo116643H().mo22789a(z, this.f166651z);
            }
        } else if (N != 3) {
            mo116643H().mo22777a(N);
        } else {
            mo116643H().mo22789a(z, this.f166651z);
        }
    }

    @Override // com.bytedance.creativex.recorder.p940b.p941a.AbstractC14193m
    /* renamed from: a */
    public final void mo22875a(C14190j jVar) {
        C89219l.m154721d(jVar, "");
        this.f166582K.mo6999a(jVar);
    }

    /* renamed from: b */
    public final void mo116663b(C14206w wVar) {
        C84401c.f188722f.mo123662d("startRecordingAfterPrePlayStopped");
        mo116647L().onEvent(wVar);
        mo22887a(this.f166629c.f155664t, true);
        mo116643H().mo22782a(new C78608j(4));
        this.f166646u.mo6999a(wVar);
        this.f166641o.mo7019b(true);
    }

    @Override // com.bytedance.creativex.recorder.p940b.p941a.AbstractC14193m
    /* renamed from: d */
    public final void mo22895d(boolean z) {
        mo116658a(AbstractC14202u.C14203a.f34480a);
        this.f166629c.f155652h.mo110097f();
        AbstractC78554o N = mo116649N();
        if (z) {
            C70650dt d = this.f166629c.mo109891d();
            C89219l.m154716b(d, "");
            int size = d.size();
            for (int i = 0; i < size; i++) {
                AbstractC31048d a = C31012a.m63724a().mo56187a();
                String stackTraceString = Log.getStackTraceString(new Throwable());
                C89219l.m154716b(stackTraceString, "");
                a.mo56122c(stackTraceString);
                mo116654S().mo56915a(C74191f.f166690a, (AbstractC89171a<C89391z>) null);
            }
            Workspace workspace = this.f166629c.f155652h;
            C89219l.m154716b(workspace, "");
            File e = workspace.mo110096e();
            C89219l.m154716b(e, "");
            C84902i.m145886a(new File(e.getPath()));
            if (this.f166629c.f155645a != 1 && !this.f166629c.f155653i) {
                N.mo122474e().removeFileAndResetData();
            }
        }
        this.f166629c.mo109891d().clear();
        this.f166629c.mo109887a(0);
        N.mo122471b();
    }

    @Override // com.bytedance.creativex.recorder.p940b.p941a.AbstractC14193m
    /* renamed from: a */
    public final void mo22876a(C14196o oVar) {
        C89219l.m154721d(oVar, "");
        this.f166583L.mo6999a(oVar);
    }

    @Override // com.bytedance.creativex.recorder.p940b.p941a.AbstractC14193m
    /* renamed from: b */
    public final void mo22890b(boolean z) {
        mo116644I().mo7019b(Boolean.valueOf(z));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x00d3, code lost:
        if (r7 != false) goto L_0x0043;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo116667d(long r10) {
        /*
        // Method dump skipped, instructions count: 263
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.shortvideo.p3889w.C74172g.mo116667d(long):boolean");
    }

    /* renamed from: e */
    public final void mo116669e(C14207x xVar) {
        List<String> list;
        List<String> list2;
        SavePhotoStickerInfo savePhotoStickerInfo;
        C89219l.m154721d(xVar, "");
        if (mo116643H().mo22763Q()) {
            mo116643H().mo22777a(0);
        }
        mo116643H().mo22811c(true);
        this.f166577F.mo6999a(xVar);
        long endFrameTimeUS = mo116654S().getEndFrameTimeUS() / 1000;
        if (endFrameTimeUS >= 0) {
            C70650dt d = this.f166629c.mo109891d();
            C14200s sVar = xVar.f34488d;
            if (sVar != null) {
                list = sVar.f34472a;
            } else {
                list = null;
            }
            C14200s sVar2 = xVar.f34488d;
            if (sVar2 != null) {
                list2 = sVar2.f34473b;
            } else {
                list2 = null;
            }
            C14200s sVar3 = xVar.f34488d;
            if (sVar3 != null) {
                savePhotoStickerInfo = sVar3.f34474c;
            } else {
                savePhotoStickerInfo = null;
            }
            long end = d.end(endFrameTimeUS, null, list, list2, savePhotoStickerInfo, this.f166629c.f155662r, mo116643H().mo22751E().mo122475f(), xVar.f34489e);
            Float value = mo116643H().mo22825m().getValue();
            if (value != null && (true ^ C89219l.m154714a((Object) value, (Object) Float.valueOf(-1.0f)))) {
                CameraComponentModel cameraComponentModel = this.f166629c;
                C89219l.m154716b(value, "");
                cameraComponentModel.f155636A = value.floatValue();
            }
            C84401c.f188722f.mo123658a("stopRecord: video: duration of this segment: ".concat(String.valueOf(end)));
            CameraComponentModel cameraComponentModel2 = this.f166629c;
            cameraComponentModel2.mo109887a(cameraComponentModel2.mo109896h() + end);
            C84401c.f188722f.mo123658a("stopRecord: video: curShootingTotalTime: " + this.f166629c.mo109896h());
            if (end == -1) {
                try {
                    C84401c.f188722f.mo123661c("deleteLastFrag for VE without changing segments for client.reason:" + xVar.f34491g + ",recordState:" + xVar.f34485a + ", segments: " + this.f166629c.mo109891d().toString());
                    mo116654S().mo56915a(C74200l.f166703a, (AbstractC89171a<C89391z>) null);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                this.f166578G.mo6999a(xVar);
                mo22879a(xVar);
            }
        } else {
            mo116657a(new AbstractC14182g.C14185c(endFrameTimeUS));
        }
        m130390f(xVar);
        this.f166578G.mo6999a(xVar);
        mo22879a(xVar);
    }

    @Override // com.bytedance.creativex.recorder.p940b.p941a.AbstractC14193m
    /* renamed from: a */
    public final void mo22877a(C14201t tVar) {
        C89219l.m154721d(tVar, "");
        mo116662b(tVar);
    }

    /* renamed from: a */
    public final void mo116658a(AbstractC14202u uVar) {
        C89219l.m154721d(uVar, "");
        this.f166618aq.onNext(uVar);
    }

    @Override // com.bytedance.creativex.recorder.p940b.p941a.AbstractC14193m
    /* renamed from: a */
    public final void mo22874a(EnumC14169aa aaVar, boolean z) {
        boolean z2;
        C89219l.m154721d(aaVar, "");
        C2563k<C78652m> kVar = this.f166574C;
        if (aaVar == EnumC14169aa.FORM_60S) {
            z2 = true;
        } else {
            z2 = false;
        }
        kVar.mo6999a(new C78652m(z2, z));
    }

    public C74172g(C21582f fVar, AbstractC89172b<? super C74180b, C89391z> bVar) {
        C89219l.m154721d(fVar, "");
        this.f166601aD = fVar;
        C74180b bVar2 = new C74180b();
        this.f166628b = bVar2;
        if (bVar != null) {
            bVar.invoke(bVar2);
        }
        this.f166642q = C21572a.m40504a(getDiContainer(), ActivityC0218d.class);
        this.f166643r = C21572a.m40504a(getDiContainer(), AbstractC14177d.class);
        this.f166629c = mo116643H().mo22803b();
        this.f166630d = new SafeHandler(this);
        C2563k<C89391z> kVar = new C2563k<>();
        this.f166644s = kVar;
        C2563k<C89391z> kVar2 = new C2563k<>();
        this.f166645t = kVar2;
        C2563k<C14206w> kVar3 = new C2563k<>();
        this.f166631e = kVar3;
        C2563k<C14206w> kVar4 = new C2563k<>();
        this.f166646u = kVar4;
        this.f166647v = new C2563k<>();
        this.f166648w = C89250i.m154773a((AbstractC89171a) new C74208t(this));
        C2563k<Long> kVar5 = new C2563k<>();
        this.f166649x = kVar5;
        C2563k<C89391z> kVar6 = new C2563k<>();
        this.f166650y = kVar6;
        C2563k<C14208y> kVar7 = new C2563k<>();
        this.f166651z = kVar7;
        C2563k<C89391z> kVar8 = new C2563k<>();
        this.f166572A = kVar8;
        C2563k<C89391z> kVar9 = new C2563k<>();
        this.f166573B = kVar9;
        C2563k<C78652m> kVar10 = new C2563k<>();
        this.f166574C = kVar10;
        this.f166575D = new C2564l<>(null);
        C2563k<C14207x> kVar11 = new C2563k<>();
        this.f166576E = kVar11;
        C2536a aVar = new C2536a();
        this.f166577F = aVar;
        C2563k<C14207x> kVar12 = new C2563k<>();
        this.f166578G = kVar12;
        C2563k<C89391z> kVar13 = new C2563k<>();
        this.f166632f = kVar13;
        C2563k<TimeSpeedModelExtension> kVar14 = new C2563k<>();
        this.f166579H = kVar14;
        C2563k<C89391z> kVar15 = new C2563k<>();
        this.f166580I = kVar15;
        C2563k<C89391z> kVar16 = new C2563k<>();
        this.f166581J = kVar16;
        C2536a aVar2 = new C2536a();
        this.f166582K = aVar2;
        C2563k<C14196o> kVar17 = new C2563k<>();
        this.f166583L = kVar17;
        C2564l<Boolean> lVar = new C2564l<>(true);
        this.f166584M = lVar;
        C2564l<Boolean> lVar2 = new C2564l<>(false);
        this.f166585N = lVar2;
        C2564l<Boolean> lVar3 = new C2564l<>(false);
        this.f166586O = lVar3;
        this.f166587P = new C2564l<>(true);
        this.f166588Q = new C2563k<>();
        this.f166589R = new C2563k<>();
        this.f166590S = new C2563k<>();
        C2564l<Boolean> lVar4 = new C2564l<>(false);
        this.f166591T = lVar4;
        this.f166634h = new HashMap();
        this.f166635i = C14197p.class;
        this.f166592U = true;
        this.f166593V = true;
        this.f166637k = new C74171f();
        this.f166594W = C89250i.m154773a((AbstractC89171a) new C74174aa(this));
        this.f166595X = C89250i.m154773a((AbstractC89171a) new C74190e(this));
        this.f166596Y = C89250i.m154773a((AbstractC89171a) new C74178ae(this));
        this.f166597Z = C89250i.m154773a((AbstractC89171a) new C74179af(this));
        this.f166602aa = C89250i.m154773a((AbstractC89171a) new C74197i(this));
        this.f166603ab = this;
        this.f166639m = C74207s.f166711a;
        C88960c<AbstractC14182g> cVar = new C88960c<>();
        C89219l.m154716b(cVar, "");
        this.f166604ac = cVar;
        this.f166605ad = kVar;
        this.f166606ae = kVar2;
        this.f166607af = kVar4;
        this.f166608ag = kVar3;
        this.f166640n = lVar;
        this.f166609ah = lVar2;
        this.f166641o = new C2564l<>(false);
        this.f166610ai = lVar4;
        this.f166611aj = lVar3;
        this.f166612ak = C89250i.m154773a((AbstractC89171a) new C74176ac(this));
        this.f166613al = kVar5;
        this.f166614am = kVar6;
        this.f166615an = kVar7;
        this.f166616ao = kVar8;
        this.f166617ap = kVar9;
        C88960c<AbstractC14202u> cVar2 = new C88960c<>();
        C89219l.m154716b(cVar2, "");
        this.f166618aq = cVar2;
        this.f166619ar = kVar10;
        this.f166620as = kVar16;
        this.f166621at = aVar2;
        this.f166622au = kVar11;
        this.f166623av = kVar17;
        this.f166624aw = aVar;
        this.f166625ax = kVar12;
        this.f166626ay = kVar13;
        this.f166627az = this.f166575D;
        this.f166598aA = kVar14;
        this.f166599aB = this.f166647v;
        this.f166600aC = kVar15;
    }

    /* renamed from: a */
    private static /* synthetic */ void m130389a(C74172g gVar, boolean z, int i) {
        if ((i & 1) != 0) {
            z = false;
        }
        gVar.m130391i(z);
    }
}
