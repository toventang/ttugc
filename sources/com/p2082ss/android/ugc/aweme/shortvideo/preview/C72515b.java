package com.p2082ss.android.ugc.aweme.shortvideo.preview;

import android.graphics.Bitmap;
import android.view.SurfaceView;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.C1213t;
import androidx.lifecycle.LiveData;
import com.bytedance.als.AbstractC2547b;
import com.bytedance.als.AbstractC2562j;
import com.bytedance.als.AbstractC2565m;
import com.bytedance.covode.number.Covode;
import com.bytedance.creativex.editor.preview.AbstractC14088a;
import com.bytedance.creativex.editor.preview.IAudioEffectParam;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.jedi.arch.AbstractC20362a;
import com.bytedance.jedi.arch.AbstractC20367ae;
import com.bytedance.jedi.arch.AbstractC20368af;
import com.bytedance.jedi.arch.AbstractC20382b;
import com.bytedance.jedi.arch.AbstractC20477i;
import com.bytedance.jedi.arch.AbstractC20534v;
import com.bytedance.jedi.arch.C20365ac;
import com.bytedance.jedi.arch.C20370ah;
import com.bytedance.jedi.arch.C20373ak;
import com.bytedance.jedi.arch.C20374al;
import com.bytedance.jedi.arch.C20375am;
import com.bytedance.jedi.arch.C20376an;
import com.bytedance.jedi.arch.C20391d;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.p1559o.AbstractC21566a;
import com.bytedance.p1559o.C21582f;
import com.p2082ss.android.ugc.asve.editor.AbstractC31071f;
import com.p2082ss.android.ugc.aweme.effect.EffectPointModel;
import com.p2082ss.android.ugc.aweme.filter.C50648c;
import com.p2082ss.android.ugc.aweme.filter.FilterBean;
import com.p2082ss.android.ugc.aweme.filter.p2983c.C50649a;
import com.p2082ss.android.ugc.aweme.filter.repository.internal.main.C50798l;
import com.p2082ss.android.ugc.aweme.filter.repository.internal.utils.C50811a;
import com.p2082ss.android.ugc.aweme.filter.repository.p2986a.AbstractC50703k;
import com.p2082ss.android.ugc.aweme.filter.repository.p2986a.AbstractC50706n;
import com.p2082ss.android.ugc.aweme.filter.repository.p2986a.p2987a.C50687a;
import com.p2082ss.android.ugc.aweme.p2719cv.C40780g;
import com.p2082ss.android.ugc.aweme.p2719cv.C40787l;
import com.p2082ss.android.ugc.aweme.p2719cv.EnumC40793o;
import com.p2082ss.android.ugc.aweme.services.video.VEVolumeChangeOp;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.p3809b.C70936b;
import com.p2082ss.android.ugc.aweme.shortvideo.p3849o.C72462a;
import com.p2082ss.android.ugc.aweme.shortvideo.preview.AbstractC72510a;
import com.p2082ss.android.ugc.aweme.shortvideo.preview.p3851a.C72512a;
import com.p2082ss.android.ugc.tools.C84401c;
import com.p2082ss.android.vesdk.filterparam.VEBaseFilterParam;
import dmt.p4542av.video.AbstractC88248d;
import dmt.p4542av.video.C88252e;
import dmt.p4542av.video.C88271g;
import dmt.p4542av.video.C88276k;
import dmt.p4542av.video.C88288n;
import dmt.p4542av.video.C88292p;
import dmt.p4542av.video.C88295s;
import dmt.p4542av.video.C88296t;
import dmt.p4542av.video.C88297u;
import dmt.p4542av.video.C88299v;
import dmt.p4542av.video.C88300w;
import dmt.p4542av.video.VEEditorAutoStartStopArbiter;
import dmt.p4542av.video.VEPreviewMusicParams;
import dmt.p4542av.video.p4545b.AbstractC88176f;
import dmt.p4542av.video.p4545b.AbstractC88181j;
import dmt.p4542av.video.p4545b.C88227l;
import dmt.p4542av.video.p4545b.C88238s;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ScheduledExecutorService;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89386u;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4612a.AbstractC89187q;
import p4600h.p4611f.p4612a.AbstractC89188r;
import p4600h.p4611f.p4612a.AbstractC89189s;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4620k.AbstractC89290k;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.preview.b */
public class C72515b<T extends AbstractC72510a> extends AbstractC2562j<T> implements AbstractC20382b, AbstractC21566a, AbstractC72510a {

    /* renamed from: A */
    private final C1213t<Boolean> f162530A;

    /* renamed from: B */
    private final C1213t<C89391z> f162531B;

    /* renamed from: C */
    private final C1213t<C89391z> f162532C;

    /* renamed from: D */
    private final C1213t<C89391z> f162533D;

    /* renamed from: E */
    private final C1213t<C89391z> f162534E;

    /* renamed from: F */
    private final C1213t<C89391z> f162535F;

    /* renamed from: G */
    private final C1213t<C89391z> f162536G;

    /* renamed from: H */
    private final C1213t<Integer> f162537H;

    /* renamed from: I */
    private final C1213t<Integer> f162538I;

    /* renamed from: J */
    private final C1213t<Boolean> f162539J;

    /* renamed from: K */
    private final AbstractC89244h f162540K;

    /* renamed from: L */
    private final AbstractC89244h f162541L;

    /* renamed from: M */
    private final LiveData<SurfaceView> f162542M;

    /* renamed from: N */
    private final C88271g<C88292p> f162543N;

    /* renamed from: O */
    private final C88276k<C88300w> f162544O;

    /* renamed from: P */
    private final ArrayList<EffectPointModel> f162545P;

    /* renamed from: Q */
    private final C1213t<Boolean> f162546Q;

    /* renamed from: R */
    private final C1213t<C88300w> f162547R;

    /* renamed from: S */
    private final C1213t<Integer> f162548S;

    /* renamed from: T */
    private final C1213t<IAudioEffectParam> f162549T;

    /* renamed from: U */
    private final C1213t<C88296t> f162550U;

    /* renamed from: V */
    private final C1213t<VEPreviewMusicParams> f162551V;

    /* renamed from: W */
    private int f162552W;

    /* renamed from: X */
    private C1213t<Integer> f162553X;

    /* renamed from: Y */
    private final AbstractC89244h f162554Y;

    /* renamed from: Z */
    private final AbstractC89244h f162555Z;

    /* renamed from: a */
    public final C72547d f162556a;

    /* renamed from: aa */
    private final C1213t<C88297u> f162557aa;

    /* renamed from: ab */
    private final AbstractC89244h f162558ab;

    /* renamed from: ac */
    private boolean f162559ac;

    /* renamed from: ad */
    private FrameLayout f162560ad;

    /* renamed from: ae */
    private boolean f162561ae;

    /* renamed from: af */
    private C88288n f162562af;

    /* renamed from: ag */
    private final C21582f f162563ag;

    /* renamed from: ah */
    private AbstractC14088a f162564ah;

    /* renamed from: b */
    public final C1213t<C50649a> f162565b;

    /* renamed from: c */
    public final C1213t<Void> f162566c;

    /* renamed from: d */
    public final C1213t<Void> f162567d;

    /* renamed from: e */
    public final C1213t<Void> f162568e;

    /* renamed from: f */
    public final C1213t<Boolean> f162569f;

    /* renamed from: g */
    public boolean f162570g;

    /* renamed from: h */
    protected SurfaceView f162571h;

    /* renamed from: i */
    protected ImageView f162572i;

    /* renamed from: j */
    private final AbstractC89244h f162573j;

    /* renamed from: k */
    private C72462a f162574k;

    /* renamed from: l */
    private C72546c f162575l;

    /* renamed from: m */
    private final AbstractC89244h f162576m;

    /* renamed from: n */
    private final AbstractC89244h f162577n;

    /* renamed from: o */
    private boolean f162578o;

    /* renamed from: p */
    private final AbstractC89244h f162579p;

    /* renamed from: q */
    private final AbstractC89244h f162580q;

    /* renamed from: r */
    private final AbstractC89244h f162581r;

    /* renamed from: s */
    private final AbstractC89244h f162582s;

    /* renamed from: t */
    private final AbstractC89244h f162583t;

    /* renamed from: u */
    private final AbstractC89244h f162584u;

    /* renamed from: v */
    private final AbstractC89244h f162585v;

    /* renamed from: w */
    private final AbstractC89244h f162586w;

    /* renamed from: x */
    private final C1213t<Boolean> f162587x;

    /* renamed from: y */
    private final C1213t<C89391z> f162588y;

    /* renamed from: z */
    private final C1213t<C89391z> f162589z;

    static {
        Covode.recordClassIndex(85194);
    }

    /* renamed from: ac */
    private final C1213t<VEVolumeChangeOp> mo127363ac() {
        return (C1213t) this.f162580q.getValue();
    }

    /* renamed from: ad */
    private final C1213t<C88295s> mo127364ad() {
        return (C1213t) this.f162581r.getValue();
    }

    /* renamed from: ae */
    private final C1213t<Boolean> mo127365ae() {
        return (C1213t) this.f162582s.getValue();
    }

    /* renamed from: af */
    private final C1213t<Boolean> mo127366af() {
        return (C1213t) this.f162584u.getValue();
    }

    /* renamed from: ag */
    private final C1213t<AbstractC31071f> mo127367ag() {
        return (C1213t) this.f162585v.getValue();
    }

    /* renamed from: ah */
    private final C1213t<VEEditorAutoStartStopArbiter> mo127368ah() {
        return (C1213t) this.f162586w.getValue();
    }

    /* renamed from: ai */
    private final C1213t<C89386u<Boolean, Boolean, Boolean>> m127948ai() {
        return (C1213t) this.f162558ab.getValue();
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.preview.AbstractC72510a
    /* renamed from: A */
    public final C1213t<C70936b> mo114776A() {
        return (C1213t) this.f162554Y.getValue();
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.preview.AbstractC72510a
    /* renamed from: B */
    public final C1213t<Boolean> mo114777B() {
        return (C1213t) this.f162555Z.getValue();
    }

    /* renamed from: T */
    public final ActivityC0945e mo114855T() {
        return (ActivityC0945e) this.f162573j.getValue();
    }

    /* renamed from: U */
    public final C1213t<AbstractC50706n> mo114856U() {
        return (C1213t) this.f162577n.getValue();
    }

    /* renamed from: V */
    public final C1213t<AbstractC50703k> mo114857V() {
        return (C1213t) this.f162579p.getValue();
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.preview.AbstractC72510a
    /* renamed from: d */
    public final AbstractC88181j mo114813d() {
        return (AbstractC88181j) this.f162576m.getValue();
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public boolean getUniqueOnlyGlobal() {
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.preview.AbstractC72510a
    /* renamed from: h */
    public final C1213t<Boolean> mo114819h() {
        return (C1213t) this.f162540K.getValue();
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.preview.AbstractC72510a
    /* renamed from: i */
    public final C1213t<Bitmap> mo114820i() {
        return (C1213t) this.f162541L.getValue();
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.preview.AbstractC72510a
    /* renamed from: E */
    public final C1213t<C88297u> mo114780E() {
        return this.f162557aa;
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.preview.AbstractC72510a
    /* renamed from: G */
    public final AbstractC14088a mo114782G() {
        return this.f162564ah;
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.preview.AbstractC72510a
    /* renamed from: I */
    public final LiveData<Boolean> mo114784I() {
        return this.f162587x;
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.preview.AbstractC72510a
    /* renamed from: K */
    public final LiveData<C89391z> mo114786K() {
        return this.f162588y;
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.preview.AbstractC72510a
    /* renamed from: M */
    public final LiveData<C89391z> mo114788M() {
        return this.f162589z;
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.preview.AbstractC72510a
    /* renamed from: O */
    public final LiveData<C89391z> mo114790O() {
        return this.f162531B;
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.preview.AbstractC72510a
    /* renamed from: Q */
    public final LiveData<Integer> mo114792Q() {
        return this.f162537H;
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.preview.AbstractC72510a
    /* renamed from: R */
    public final LiveData<Integer> mo114793R() {
        return this.f162538I;
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.preview.AbstractC72510a
    /* renamed from: S */
    public final LiveData<Boolean> mo114794S() {
        return this.f162539J;
    }

    /* access modifiers changed from: protected */
    /* renamed from: W */
    public boolean mo114858W() {
        return this.f162559ac;
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.preview.AbstractC72510a
    /* renamed from: e */
    public final /* bridge */ /* synthetic */ LiveData mo114816e() {
        return this.f162566c;
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.preview.AbstractC72510a
    /* renamed from: f */
    public final /* bridge */ /* synthetic */ LiveData mo114817f() {
        return this.f162568e;
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.preview.AbstractC72510a
    /* renamed from: g */
    public final LiveData<SurfaceView> mo114818g() {
        return this.f162542M;
    }

    @Override // com.bytedance.als.AbstractC2562j
    public /* bridge */ /* synthetic */ AbstractC2547b getApiComponent() {
        return this;
    }

    @Override // com.bytedance.p1559o.AbstractC21566a
    public C21582f getDiContainer() {
        return this.f162563ag;
    }

    /* Return type fixed from 'com.bytedance.jedi.arch.g' to match base method */
    @Override // com.bytedance.jedi.arch.AbstractC20367ae
    public /* bridge */ /* synthetic */ AbstractC20477i getReceiver() {
        return this;
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.preview.AbstractC72510a
    /* renamed from: j */
    public final LiveData<C50649a> mo114821j() {
        return this.f162565b;
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.preview.AbstractC72510a
    /* renamed from: m */
    public final int mo114824m() {
        return this.f162552W;
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.preview.AbstractC72510a
    /* renamed from: n */
    public final C1213t<Integer> mo114825n() {
        return this.f162553X;
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.preview.AbstractC72510a
    /* renamed from: p */
    public final C88271g<C88292p> mo114827p() {
        return this.f162543N;
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.preview.AbstractC72510a
    /* renamed from: q */
    public final C88276k<C88300w> mo114828q() {
        return this.f162544O;
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.preview.AbstractC72510a
    /* renamed from: r */
    public final ArrayList<EffectPointModel> mo114829r() {
        return this.f162545P;
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.preview.AbstractC72510a
    /* renamed from: s */
    public final LiveData<Boolean> mo114830s() {
        return this.f162546Q;
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.preview.AbstractC72510a
    /* renamed from: t */
    public final LiveData<C88300w> mo114831t() {
        return this.f162547R;
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.preview.AbstractC72510a
    /* renamed from: u */
    public final LiveData<IAudioEffectParam> mo114832u() {
        return this.f162549T;
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.preview.AbstractC72510a
    /* renamed from: v */
    public final C1213t<C88296t> mo114833v() {
        return this.f162550U;
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.preview.AbstractC72510a
    /* renamed from: w */
    public final LiveData<VEPreviewMusicParams> mo114834w() {
        return this.f162551V;
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.preview.AbstractC72510a
    /* renamed from: a */
    public final boolean mo114806a(VEPreviewMusicParams vEPreviewMusicParams) {
        AbstractC31071f b;
        C89219l.m154721d(vEPreviewMusicParams, "");
        this.f162551V.setValue(vEPreviewMusicParams);
        C72462a aVar = this.f162574k;
        if (!(aVar == null || !(!C89219l.m154714a((Object) aVar.f162447b, (Object) vEPreviewMusicParams.f200086f)) || (b = mo114813d().mo142739b()) == null)) {
            b.mo56359g(aVar.f162446a);
        }
        return mo114813d().mo142733a(vEPreviewMusicParams);
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.preview.AbstractC72510a
    /* renamed from: a */
    public final void mo114805a(boolean z, boolean z2, boolean z3) {
        m127948ai().setValue(new C89386u<>(Boolean.valueOf(z), Boolean.valueOf(z2), Boolean.valueOf(z3)));
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.preview.AbstractC72510a
    /* renamed from: a */
    public final void mo114804a(boolean z) {
        VEEditorAutoStartStopArbiter vEEditorAutoStartStopArbiter = mo114813d().f200144e;
        if (vEEditorAutoStartStopArbiter != null) {
            vEEditorAutoStartStopArbiter.mo142666a(z);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.preview.AbstractC72510a
    /* renamed from: a */
    public final void mo114803a(C88297u uVar) {
        C89219l.m154721d(uVar, "");
        this.f162557aa.setValue(uVar);
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.preview.b$a */
    static final class C72516a extends AbstractC89220m implements AbstractC89171a<C1213t<VEEditorAutoStartStopArbiter>> {

        /* renamed from: a */
        public static final C72516a f162590a = new C72516a();

        static {
            Covode.recordClassIndex(85195);
        }

        C72516a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C1213t<VEEditorAutoStartStopArbiter> invoke() {
            return new C1213t();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.preview.b$ab */
    static final class C72518ab extends AbstractC89220m implements AbstractC89171a<AbstractC88181j> {

        /* renamed from: a */
        final /* synthetic */ C72515b f162592a;

        static {
            Covode.recordClassIndex(85197);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C72518ab(C72515b bVar) {
            super(0);
            this.f162592a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ AbstractC88181j invoke() {
            return this.f162592a.mo114861aa();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.preview.b$b */
    static final class C72519b extends AbstractC89220m implements AbstractC89171a<C1213t<AbstractC50703k>> {

        /* renamed from: a */
        public static final C72519b f162593a = new C72519b();

        static {
            Covode.recordClassIndex(85198);
        }

        C72519b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C1213t<AbstractC50703k> invoke() {
            return new C1213t();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.preview.b$c */
    static final class C72520c extends AbstractC89220m implements AbstractC89171a<C1213t<AbstractC50706n>> {

        /* renamed from: a */
        public static final C72520c f162594a = new C72520c();

        static {
            Covode.recordClassIndex(85199);
        }

        C72520c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C1213t<AbstractC50706n> invoke() {
            return new C1213t();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.preview.b$d */
    static final class C72521d extends AbstractC89220m implements AbstractC89171a<C1213t<Boolean>> {

        /* renamed from: a */
        public static final C72521d f162595a = new C72521d();

        static {
            Covode.recordClassIndex(85200);
        }

        C72521d() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C1213t<Boolean> invoke() {
            return new C1213t();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.preview.b$e */
    static final class C72522e extends AbstractC89220m implements AbstractC89171a<C1213t<C88295s>> {

        /* renamed from: a */
        public static final C72522e f162596a = new C72522e();

        static {
            Covode.recordClassIndex(85201);
        }

        C72522e() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C1213t<C88295s> invoke() {
            return new C1213t();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.preview.b$f */
    static final class C72523f extends AbstractC89220m implements AbstractC89171a<C1213t<Boolean>> {

        /* renamed from: a */
        public static final C72523f f162597a = new C72523f();

        static {
            Covode.recordClassIndex(85202);
        }

        C72523f() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C1213t<Boolean> invoke() {
            return new C1213t();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.preview.b$g */
    static final class C72524g extends AbstractC89220m implements AbstractC89171a<C1213t<C89386u<? extends Boolean, ? extends Boolean, ? extends Boolean>>> {

        /* renamed from: a */
        public static final C72524g f162598a = new C72524g();

        static {
            Covode.recordClassIndex(85203);
        }

        C72524g() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C1213t<C89386u<? extends Boolean, ? extends Boolean, ? extends Boolean>> invoke() {
            return new C1213t();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.preview.b$h */
    static final class C72525h extends AbstractC89220m implements AbstractC89171a<C1213t<C88299v>> {

        /* renamed from: a */
        public static final C72525h f162599a = new C72525h();

        static {
            Covode.recordClassIndex(85204);
        }

        C72525h() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C1213t<C88299v> invoke() {
            return new C1213t();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.preview.b$i */
    static final class C72526i extends AbstractC89220m implements AbstractC89171a<C1213t<AbstractC31071f>> {

        /* renamed from: a */
        public static final C72526i f162600a = new C72526i();

        static {
            Covode.recordClassIndex(85205);
        }

        C72526i() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C1213t<AbstractC31071f> invoke() {
            return new C1213t();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.preview.b$j */
    static final class C72527j extends AbstractC89220m implements AbstractC89171a<C1213t<VEVolumeChangeOp>> {

        /* renamed from: a */
        public static final C72527j f162601a = new C72527j();

        static {
            Covode.recordClassIndex(85206);
        }

        C72527j() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C1213t<VEVolumeChangeOp> invoke() {
            return new C1213t();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.preview.b$l */
    static final class C72529l extends AbstractC89220m implements AbstractC89171a<C1213t<C70936b>> {

        /* renamed from: a */
        public static final C72529l f162603a = new C72529l();

        static {
            Covode.recordClassIndex(85208);
        }

        C72529l() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C1213t<C70936b> invoke() {
            return new C1213t();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.preview.b$o */
    static final class C72534o extends AbstractC89220m implements AbstractC89171a<C1213t<Boolean>> {

        /* renamed from: a */
        public static final C72534o f162608a = new C72534o();

        static {
            Covode.recordClassIndex(85213);
        }

        C72534o() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C1213t<Boolean> invoke() {
            return new C1213t();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.preview.AbstractC72510a
    /* renamed from: C */
    public final LiveData<AbstractC31071f> mo114778C() {
        return mo127367ag();
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.preview.AbstractC72510a
    /* renamed from: D */
    public final LiveData<VEEditorAutoStartStopArbiter> mo114779D() {
        return mo127368ah();
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.preview.AbstractC72510a
    /* renamed from: F */
    public final LiveData<C89386u<Boolean, Boolean, Boolean>> mo114781F() {
        return m127948ai();
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.preview.AbstractC72510a
    /* renamed from: L */
    public final void mo114787L() {
        this.f162588y.setValue(C89391z.f203057a);
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.preview.AbstractC72510a
    /* renamed from: N */
    public final void mo114789N() {
        this.f162589z.setValue(C89391z.f203057a);
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.preview.AbstractC72510a
    /* renamed from: P */
    public final void mo114791P() {
        this.f162531B.setValue(C89391z.f203057a);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20534v
    public AbstractC1204m getLifecycleOwner() {
        return AbstractC20382b.C20383a.m38581a(this);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public AbstractC20534v getLifecycleOwnerHolder() {
        return AbstractC20382b.C20383a.m38601b(this);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public AbstractC20367ae<AbstractC20477i> getReceiverHolder() {
        return AbstractC20382b.C20383a.m38604c(this);
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.preview.AbstractC72510a
    /* renamed from: k */
    public final LiveData<AbstractC50706n> mo114822k() {
        return mo114856U();
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.preview.AbstractC72510a
    /* renamed from: l */
    public final LiveData<AbstractC50703k> mo114823l() {
        return mo114857V();
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.preview.AbstractC72510a
    /* renamed from: o */
    public final void mo114826o() {
        mo114813d().mo142747g();
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.preview.AbstractC72510a
    /* renamed from: x */
    public final LiveData<C88295s> mo114835x() {
        return mo127364ad();
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.preview.AbstractC72510a
    /* renamed from: y */
    public final LiveData<Boolean> mo114836y() {
        return mo127365ae();
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.preview.b$m */
    static final class C72530m extends AbstractC89220m implements AbstractC89171a<C1213t<Bitmap>> {

        /* renamed from: a */
        final /* synthetic */ C72515b f162604a;

        static {
            Covode.recordClassIndex(85209);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C72530m(C72515b bVar) {
            super(0);
            this.f162604a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C1213t<Bitmap> invoke() {
            C1213t tVar = new C1213t();
            tVar.observe(this.f162604a, new C72531a(this));
            return tVar;
        }

        /* renamed from: com.ss.android.ugc.aweme.shortvideo.preview.b$m$a */
        static final class C72531a<T> implements AbstractC2565m<Bitmap> {

            /* renamed from: a */
            final /* synthetic */ C72530m f162605a;

            static {
                Covode.recordClassIndex(85210);
            }

            C72531a(C72530m mVar) {
                this.f162605a = mVar;
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
            public final /* synthetic */ void onChanged(Bitmap bitmap) {
                this.f162605a.f162604a.cI_().setImageBitmap(bitmap);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.preview.b$n */
    static final class C72532n extends AbstractC89220m implements AbstractC89171a<C1213t<Boolean>> {

        /* renamed from: a */
        final /* synthetic */ C72515b f162606a;

        static {
            Covode.recordClassIndex(85211);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C72532n(C72515b bVar) {
            super(0);
            this.f162606a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C1213t<Boolean> invoke() {
            C1213t tVar = new C1213t();
            tVar.observe(this.f162606a, new C72533a(this));
            return tVar;
        }

        /* renamed from: com.ss.android.ugc.aweme.shortvideo.preview.b$n$a */
        static final class C72533a<T> implements AbstractC2565m<Boolean> {

            /* renamed from: a */
            final /* synthetic */ C72532n f162607a;

            static {
                Covode.recordClassIndex(85212);
            }

            C72533a(C72532n nVar) {
                this.f162607a = nVar;
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
            public final /* synthetic */ void onChanged(Boolean bool) {
                int i;
                Boolean bool2 = bool;
                ImageView cI_ = this.f162607a.f162606a.cI_();
                C89219l.m154716b(bool2, "");
                if (bool2.booleanValue()) {
                    i = 0;
                } else {
                    i = 8;
                }
                cI_.setVisibility(i);
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.preview.AbstractC72510a
    /* renamed from: H */
    public final FrameLayout mo114783H() {
        FrameLayout frameLayout = this.f162560ad;
        if (frameLayout == null) {
            C89219l.m154710a("frameLayout");
        }
        return frameLayout;
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.preview.AbstractC72510a
    /* renamed from: J */
    public final void mo114785J() {
        this.f162587x.setValue(false);
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.preview.AbstractC72510a
    /* renamed from: b */
    public final int mo114807b() {
        SurfaceView surfaceView = this.f162571h;
        if (surfaceView == null) {
            C89219l.m154710a("surfaceView");
        }
        return surfaceView.getWidth();
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.preview.AbstractC72510a
    /* renamed from: c */
    public final int mo114810c() {
        SurfaceView surfaceView = this.f162571h;
        if (surfaceView == null) {
            C89219l.m154710a("surfaceView");
        }
        return surfaceView.getHeight();
    }

    public final SurfaceView cH_() {
        SurfaceView surfaceView = this.f162571h;
        if (surfaceView == null) {
            C89219l.m154710a("surfaceView");
        }
        return surfaceView;
    }

    /* access modifiers changed from: protected */
    public final ImageView cI_() {
        ImageView imageView = this.f162572i;
        if (imageView == null) {
            C89219l.m154710a("firstFrameView");
        }
        return imageView;
    }

    public final AbstractC31071f cJ_() {
        return mo114813d().mo142739b();
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.preview.AbstractC72510a
    /* renamed from: z */
    public final void mo114837z() {
        mo127365ae().setValue(true);
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.preview.b$k */
    static final class C72528k extends AbstractC89220m implements AbstractC89171a<ActivityC0945e> {

        /* renamed from: a */
        final /* synthetic */ C72515b f162602a;

        static {
            Covode.recordClassIndex(85207);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C72528k(C72515b bVar) {
            super(0);
            this.f162602a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ ActivityC0945e invoke() {
            Object a = this.f162602a.getDiContainer().mo35247a(ActivityC0945e.class);
            C89219l.m154716b(a, "");
            return a;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.preview.AbstractC72510a
    /* renamed from: a */
    public final ViewGroup.MarginLayoutParams mo114795a() {
        SurfaceView surfaceView = this.f162571h;
        if (surfaceView == null) {
            C89219l.m154710a("surfaceView");
        }
        ViewGroup.LayoutParams layoutParams = surfaceView.getLayoutParams();
        Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        return (ViewGroup.MarginLayoutParams) layoutParams;
    }

    @Override // com.bytedance.als.AbstractC2562j
    public void onDestroy() {
        mo127367ag().setValue(null);
        AbstractC31071f b = mo114813d().mo142739b();
        if (b != null) {
            b.mo56387s();
        }
        super.onDestroy();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.shortvideo.preview.b$y */
    public static final class C72544y implements AbstractC88176f.AbstractC88177a {

        /* renamed from: a */
        final /* synthetic */ C72515b f162618a;

        static {
            Covode.recordClassIndex(85223);
        }

        C72544y(C72515b bVar) {
            this.f162618a = bVar;
        }

        @Override // dmt.p4542av.video.p4545b.AbstractC88176f.AbstractC88177a
        /* renamed from: a */
        public final void mo114869a() {
            if (!this.f162618a.f162570g) {
                this.f162618a.f162570g = true;
                C84401c.f188722f.mo123658a("receive prepare done event");
                this.f162618a.f162566c.postValue(null);
            }
            if (this.f162618a.f162556a.f162622b.invoke().booleanValue()) {
                C84401c.f188722f.mo123658a("receive prepare done event persist");
                this.f162618a.f162567d.postValue(null);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: aa */
    public AbstractC88181j mo114861aa() {
        C88238s sVar = this.f162556a.f162626f;
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) C40780g.m82242a(C40787l.m82269a(EnumC40793o.SCHEDULED).mo70025a(1).mo70028a());
        C89219l.m154716b(scheduledExecutorService, "");
        return new C88227l(sVar, scheduledExecutorService);
    }

    /* renamed from: ab */
    public void mo114862ab() {
        mo114813d().f200164y = new C72544y(this);
        AbstractC88181j d = mo114813d();
        ActivityC0945e T = mo114855T();
        AbstractC14088a aVar = this.f162564ah;
        SurfaceView surfaceView = this.f162571h;
        if (surfaceView == null) {
            C89219l.m154710a("surfaceView");
        }
        d.mo142714a(T, aVar, surfaceView, this);
    }

    @Override // com.bytedance.als.AbstractC2562j
    public void onStart() {
        super.onStart();
        if (this.f162561ae) {
            AbstractC31071f b = mo114813d().mo142739b();
            if (b == null) {
                C89219l.m154715b();
            }
            b.mo56381p();
            this.f162561ae = false;
            C84401c.f188722f.mo123662d("VEVideoPublishEditFragment prepare");
        }
    }

    @Override // com.bytedance.als.AbstractC2562j
    public void onStop() {
        if (this.f162556a.f162623c.invoke().booleanValue() && mo114813d().mo142739b() != null) {
            AbstractC31071f b = mo114813d().mo142739b();
            if (b == null) {
                C89219l.m154715b();
            }
            b.mo56385r();
            this.f162561ae = true;
            C84401c.f188722f.mo123662d("VEVideoPublishEditFragment releaseEngine");
        }
        super.onStop();
    }

    @Override // com.bytedance.als.AbstractC2562j
    public void onCreate() {
        super.onCreate();
        mo114862ab();
        if (this.f162564ah.getMultiSegmentPropInfo() != null) {
            mo114813d().mo142724a(this.f162564ah.getMultiSegmentPropInfo());
        }
        mo114813d().mo142749i();
        mo114813d().mo142730a(mo114858W());
        IAudioEffectParam veAudioEffectParam = this.f162564ah.getVeAudioEffectParam();
        if (veAudioEffectParam != null) {
            mo114801a(C88288n.C88289a.m153424a(veAudioEffectParam));
        }
        List<IAudioEffectParam> veAudioEffectParamList = this.f162564ah.getVeAudioEffectParamList();
        if (!(veAudioEffectParamList == null || !(!veAudioEffectParamList.isEmpty()) || veAudioEffectParamList == null)) {
            mo114801a(new C88288n("add_effect", false, null, veAudioEffectParamList, 0, 54));
        }
        mo127367ag().setValue(mo114813d().mo142739b());
        mo127368ah().setValue(mo114813d().f200144e);
        AbstractC88181j d = mo114813d();
        C1213t<C88296t> tVar = this.f162550U;
        C89219l.m154721d(tVar, "");
        d.f200131D = tVar;
        mo114856U().setValue(mo114859a(this.f162556a.f162624d.invoke()));
        mo114813d().f200155p = mo114856U().getValue();
        mo114857V().setValue(new C72537r(this));
        this.f162565b.observe(this, new C88252e());
        this.f162565b.observe(this, new C72538s(this));
        if (this.f162556a.f162627g) {
            mo114863b(new C50649a(true, this.f162575l.f162620a));
        }
        mo114813d().f200142c = this.f162549T;
        this.f162543N.observe(this, new C72535p(this));
        this.f162543N.observe(this, new C88252e());
        mo114813d().f200143d = this.f162545P;
        this.f162544O.mo142776a(this, new C72536q(this));
        this.f162544O.observe(this, new C88252e());
        mo114813d().f200140a = this.f162546Q;
        mo114813d().f200141b = this.f162547R;
        this.f162550U.observe(this, new C72541v(this));
        mo127363ac().observe(this, new C72545z(this));
        mo127363ac().observe(this, new C88252e());
        mo127364ad().observe(this, new C72540u(this));
        mo127364ad().observe(this, new C88252e());
        ((LiveData) this.f162583t.getValue()).observe(this, new C72543x(this));
        mo114777B().observe(this, new C72539t(this));
        mo127366af().observe(this, new C72542w(this));
        LiveData<SurfaceView> liveData = this.f162542M;
        Objects.requireNonNull(liveData, "null cannot be cast to non-null type androidx.lifecycle.MutableLiveData<android.view.SurfaceView>");
        C1213t tVar2 = (C1213t) liveData;
        SurfaceView surfaceView = this.f162571h;
        if (surfaceView == null) {
            C89219l.m154710a("surfaceView");
        }
        tVar2.setValue(surfaceView);
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.preview.AbstractC72510a
    /* renamed from: b */
    public final void mo114808b(int i) {
        this.f162552W = i;
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.preview.b$aa */
    public static final class C72517aa implements AbstractC50703k {

        /* renamed from: a */
        final /* synthetic */ AbstractC31071f f162591a;

        static {
            Covode.recordClassIndex(85196);
        }

        C72517aa(AbstractC31071f fVar) {
            this.f162591a = fVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.filter.repository.p2986a.AbstractC50703k
        /* renamed from: a */
        public final float mo23007a(FilterBean filterBean) {
            C89219l.m154721d(filterBean, "");
            float c = C50811a.m95161c(filterBean);
            if (c != 0.0f) {
                return c;
            }
            AbstractC31071f fVar = this.f162591a;
            String filterFolder = filterBean.getFilterFolder();
            C89219l.m154716b(filterFolder, "");
            return fVar.mo56335c(filterFolder);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.preview.b$r */
    public static final class C72537r implements AbstractC50703k {

        /* renamed from: a */
        final /* synthetic */ C72515b f162611a;

        static {
            Covode.recordClassIndex(85216);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C72537r(C72515b bVar) {
            this.f162611a = bVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.filter.repository.p2986a.AbstractC50703k
        /* renamed from: a */
        public final float mo23007a(FilterBean filterBean) {
            C89219l.m154721d(filterBean, "");
            float c = C50811a.m95161c(filterBean);
            if (c != 0.0f) {
                return c;
            }
            AbstractC88181j d = this.f162611a.mo114813d();
            String filterFolder = filterBean.getFilterFolder();
            C89219l.m154716b(filterFolder, "");
            return d.mo142719a(filterFolder);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.shortvideo.preview.b$s */
    public static final class C72538s<T> implements AbstractC2565m<C50649a> {

        /* renamed from: a */
        final /* synthetic */ C72515b f162612a;

        static {
            Covode.recordClassIndex(85217);
        }

        C72538s(C72515b bVar) {
            this.f162612a = bVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(C50649a aVar) {
            this.f162612a.mo114864c(aVar);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.preview.AbstractC72510a
    /* renamed from: a */
    public final void mo114796a(int i) {
        mo114813d().f200148i = i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public AbstractC50706n mo114859a(String str) {
        C89219l.m154721d(str, "");
        return C50798l.C50799a.m95127a(str);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20382b
    public <VM1 extends JediViewModel<S1>, S1 extends AbstractC20368af> S1 getState(VM1 vm1) {
        C89219l.m154721d(vm1, "");
        return (S1) AbstractC20382b.C20383a.m38582a(this, vm1);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.shortvideo.preview.b$p */
    public static final class C72535p<T> implements AbstractC2565m<C88292p> {

        /* renamed from: a */
        final /* synthetic */ C72515b f162609a;

        static {
            Covode.recordClassIndex(85214);
        }

        C72535p(C72515b bVar) {
            this.f162609a = bVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(C88292p pVar) {
            C88292p pVar2 = pVar;
            AbstractC88181j d = this.f162609a.mo114813d();
            C89219l.m154716b(pVar2, "");
            d.mo142734a(pVar2);
            if (this.f162609a.mo114813d().mo142739b() == null) {
                C89219l.m154715b();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.shortvideo.preview.b$t */
    public static final class C72539t<T> implements AbstractC2565m<Boolean> {

        /* renamed from: a */
        final /* synthetic */ C72515b f162613a;

        static {
            Covode.recordClassIndex(85218);
        }

        C72539t(C72515b bVar) {
            this.f162613a = bVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Boolean bool) {
            Boolean bool2 = bool;
            VEEditorAutoStartStopArbiter vEEditorAutoStartStopArbiter = this.f162613a.mo114813d().f200144e;
            if (vEEditorAutoStartStopArbiter != null) {
                C89219l.m154716b(bool2, "");
                vEEditorAutoStartStopArbiter.f200069d = bool2.booleanValue();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.shortvideo.preview.b$u */
    public static final class C72540u<T> implements AbstractC2565m<C88295s> {

        /* renamed from: a */
        final /* synthetic */ C72515b f162614a;

        static {
            Covode.recordClassIndex(85219);
        }

        C72540u(C72515b bVar) {
            this.f162614a = bVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(C88295s sVar) {
            C88295s sVar2 = sVar;
            AbstractC88181j d = this.f162614a.mo114813d();
            C89219l.m154716b(sVar2, "");
            d.mo142735a(sVar2);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.shortvideo.preview.b$v */
    public static final class C72541v<T> implements AbstractC2565m<C88296t> {

        /* renamed from: a */
        final /* synthetic */ C72515b f162615a;

        static {
            Covode.recordClassIndex(85220);
        }

        C72541v(C72515b bVar) {
            this.f162615a = bVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(C88296t tVar) {
            C88296t tVar2 = tVar;
            AbstractC88181j d = this.f162615a.mo114813d();
            C89219l.m154716b(tVar2, "");
            d.mo142736a(tVar2);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.shortvideo.preview.b$w */
    public static final class C72542w<T> implements AbstractC2565m<Boolean> {

        /* renamed from: a */
        final /* synthetic */ C72515b f162616a;

        static {
            Covode.recordClassIndex(85221);
        }

        C72542w(C72515b bVar) {
            this.f162616a = bVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Boolean bool) {
            Boolean bool2 = bool;
            VEEditorAutoStartStopArbiter vEEditorAutoStartStopArbiter = this.f162616a.mo114813d().f200144e;
            if (vEEditorAutoStartStopArbiter != null) {
                C89219l.m154716b(bool2, "");
                vEEditorAutoStartStopArbiter.f200070e = bool2.booleanValue();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.shortvideo.preview.b$x */
    public static final class C72543x<T> implements AbstractC2565m<C88299v> {

        /* renamed from: a */
        final /* synthetic */ C72515b f162617a;

        static {
            Covode.recordClassIndex(85222);
        }

        C72543x(C72515b bVar) {
            this.f162617a = bVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(C88299v vVar) {
            C88299v vVar2 = vVar;
            AbstractC88181j d = this.f162617a.mo114813d();
            C89219l.m154716b(vVar2, "");
            d.mo142737a(vVar2);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.shortvideo.preview.b$z */
    public static final class C72545z<T> implements AbstractC2565m<VEVolumeChangeOp> {

        /* renamed from: a */
        final /* synthetic */ C72515b f162619a;

        static {
            Covode.recordClassIndex(85224);
        }

        C72545z(C72515b bVar) {
            this.f162619a = bVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(VEVolumeChangeOp vEVolumeChangeOp) {
            VEVolumeChangeOp vEVolumeChangeOp2 = vEVolumeChangeOp;
            AbstractC88181j d = this.f162619a.mo114813d();
            C89219l.m154716b(vEVolumeChangeOp2, "");
            d.mo142732a(vEVolumeChangeOp2);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo114863b(C50649a aVar) {
        C89219l.m154721d(aVar, "");
        this.f162565b.postValue(aVar);
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.preview.AbstractC72510a
    /* renamed from: c */
    public final void mo114811c(int i) {
        this.f162537H.setValue(Integer.valueOf(i));
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.preview.AbstractC72510a
    /* renamed from: d */
    public final void mo114814d(int i) {
        this.f162538I.setValue(Integer.valueOf(i));
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.preview.AbstractC72510a
    /* renamed from: b */
    public final void mo114809b(boolean z) {
        FilterBean filterBean;
        AbstractC88181j d = mo114813d();
        C50649a value = this.f162565b.getValue();
        if (value != null) {
            filterBean = value.f116985b;
        } else {
            filterBean = null;
        }
        d.mo142740b(filterBean, false);
        this.f162575l.mo114870a(C50687a.m94974a());
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo114864c(C50649a aVar) {
        if (aVar == null) {
            return;
        }
        if (!aVar.f116986c) {
            mo114813d().mo142731a(aVar.f116985b, this.f162556a.f162621a.invoke().booleanValue());
        } else if (aVar.f116985b != null) {
            mo114860a(aVar.f116985b, aVar.f116987d);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.preview.AbstractC72510a
    /* renamed from: d */
    public final void mo114815d(boolean z) {
        this.f162539J.setValue(Boolean.valueOf(z));
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.preview.AbstractC72510a
    /* renamed from: c */
    public final void mo114812c(boolean z) {
        mo127366af().setValue(Boolean.valueOf(z));
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.preview.AbstractC72510a
    /* renamed from: a */
    public final void mo114799a(C50649a aVar) {
        C89219l.m154721d(aVar, "");
        this.f162565b.setValue(aVar);
        FilterBean filterBean = aVar.f116985b;
        if (filterBean != null) {
            this.f162575l.mo114870a(filterBean);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.preview.AbstractC72510a
    /* renamed from: a */
    public final void mo114800a(VEVolumeChangeOp vEVolumeChangeOp) {
        C89219l.m154721d(vEVolumeChangeOp, "");
        mo127363ac().setValue(vEVolumeChangeOp);
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.preview.AbstractC72510a
    /* renamed from: a */
    public final void mo114801a(C88288n nVar) {
        C89219l.m154721d(nVar, "");
        mo114813d().mo142727a(this.f162562af, nVar, this.f162556a.f162625e.invoke());
        this.f162562af = nVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.preview.AbstractC72510a
    /* renamed from: a */
    public final void mo114802a(C88295s sVar) {
        C89219l.m154721d(sVar, "");
        mo127364ad().setValue(sVar);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public <VM1 extends JediViewModel<S1>, S1 extends AbstractC20368af, R> R withState(VM1 vm1, AbstractC89172b<? super S1, ? extends R> bVar) {
        C89219l.m154721d(vm1, "");
        C89219l.m154721d(bVar, "");
        return (R) AbstractC20382b.C20383a.m38593a(this, vm1, bVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.shortvideo.preview.b$q */
    public static final class C72536q<T> implements AbstractC88248d<C88300w> {

        /* renamed from: a */
        final /* synthetic */ C72515b f162610a;

        static {
            Covode.recordClassIndex(85215);
        }

        C72536q(C72515b bVar) {
            this.f162610a = bVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // dmt.p4542av.video.AbstractC88248d
        /* renamed from: a */
        public final /* synthetic */ void mo114868a(C88300w wVar, C88300w wVar2) {
            C88300w wVar3 = wVar2;
            AbstractC88181j d = this.f162610a.mo114813d();
            C89219l.m154716b(wVar3, "");
            d.mo142738a(wVar, wVar3);
            if (this.f162610a.mo114813d().mo142739b() == null) {
                C89219l.m154715b();
            }
        }
    }

    /* renamed from: a */
    public final String mo114860a(FilterBean filterBean, String str) {
        return mo114813d().mo142721a(filterBean, str);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public <S extends AbstractC20368af> AbstractC88412b subscribe(JediViewModel<S> jediViewModel, C20370ah<S> ahVar, AbstractC89183m<? super AbstractC20477i, ? super S, C89391z> mVar) {
        C89219l.m154721d(jediViewModel, "");
        C89219l.m154721d(ahVar, "");
        C89219l.m154721d(mVar, "");
        return AbstractC20382b.C20383a.m38583a(this, jediViewModel, ahVar, mVar);
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.preview.AbstractC72510a
    /* renamed from: a */
    public final void mo114797a(int i, int i2, VEBaseFilterParam vEBaseFilterParam) {
        C89219l.m154721d(vEBaseFilterParam, "");
        mo114813d().mo142739b().mo56324b(i, i2, vEBaseFilterParam);
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.preview.AbstractC72510a
    /* renamed from: a */
    public void mo114798a(FilterBean filterBean, FilterBean filterBean2, float f) {
        float f2;
        if (filterBean != null && filterBean2 != null) {
            if (f < 0.0f) {
                f2 = Math.abs(f);
            } else {
                f2 = 1.0f - f;
            }
            AbstractC31071f value = mo127367ag().getValue();
            if (value == null) {
                return;
            }
            if (this.f162556a.f162621a.invoke().booleanValue()) {
                C72517aa aaVar = new C72517aa(value);
                String filterFolder = filterBean.getFilterFolder();
                String filterFolder2 = filterBean2.getFilterFolder();
                AbstractC50706n value2 = mo114856U().getValue();
                if (value2 == null) {
                    C89219l.m154715b();
                }
                C89219l.m154716b(value2, "");
                float a = C50648c.m94909a(filterBean, value2, aaVar);
                AbstractC50706n value3 = mo114856U().getValue();
                if (value3 == null) {
                    C89219l.m154715b();
                }
                C89219l.m154716b(value3, "");
                value.mo56290a(filterFolder, filterFolder2, f2, a, C50648c.m94909a(filterBean2, value3, aaVar));
                return;
            }
            value.mo56289a(filterBean.getFilterFolder(), filterBean2.getFilterFolder(), f2);
        }
    }

    private C72515b(C21582f fVar, AbstractC14088a aVar, AbstractC89172b<? super C72547d, C89391z> bVar) {
        C89219l.m154721d(fVar, "");
        C89219l.m154721d(aVar, "");
        MethodCollector.m26663i(5118);
        this.f162563ag = fVar;
        this.f162564ah = aVar;
        this.f162573j = C89250i.m154773a((AbstractC89171a) new C72528k(this));
        C72547d dVar = new C72547d();
        this.f162556a = dVar;
        if (bVar != null) {
            bVar.invoke(dVar);
        }
        this.f162560ad = new FrameLayout(mo114855T());
        this.f162571h = new C72512a(mo114855T());
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        SurfaceView surfaceView = this.f162571h;
        if (surfaceView == null) {
            C89219l.m154710a("surfaceView");
        }
        surfaceView.setLayoutParams(layoutParams);
        FrameLayout frameLayout = this.f162560ad;
        if (frameLayout == null) {
            C89219l.m154710a("frameLayout");
        }
        SurfaceView surfaceView2 = this.f162571h;
        if (surfaceView2 == null) {
            C89219l.m154710a("surfaceView");
        }
        frameLayout.addView(surfaceView2);
        this.f162572i = new ImageView(mo114855T());
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -1);
        ImageView imageView = this.f162572i;
        if (imageView == null) {
            C89219l.m154710a("firstFrameView");
        }
        imageView.setLayoutParams(layoutParams2);
        FrameLayout frameLayout2 = this.f162560ad;
        if (frameLayout2 == null) {
            C89219l.m154710a("frameLayout");
        }
        ImageView imageView2 = this.f162572i;
        if (imageView2 == null) {
            C89219l.m154710a("firstFrameView");
        }
        frameLayout2.addView(imageView2);
        ImageView imageView3 = this.f162572i;
        if (imageView3 == null) {
            C89219l.m154710a("firstFrameView");
        }
        imageView3.setScaleType(ImageView.ScaleType.FIT_XY);
        this.f162575l = new C72546c();
        this.f162576m = C89250i.m154773a((AbstractC89171a) new C72518ab(this));
        this.f162577n = C89250i.m154773a((AbstractC89171a) C72520c.f162594a);
        this.f162578o = true;
        this.f162565b = new C1213t<>();
        this.f162579p = C89250i.m154773a((AbstractC89171a) C72519b.f162593a);
        this.f162580q = C89250i.m154773a((AbstractC89171a) C72527j.f162601a);
        this.f162581r = C89250i.m154773a((AbstractC89171a) C72522e.f162596a);
        this.f162582s = C89250i.m154773a((AbstractC89171a) C72521d.f162595a);
        this.f162583t = C89250i.m154773a((AbstractC89171a) C72525h.f162599a);
        this.f162584u = C89250i.m154773a((AbstractC89171a) C72523f.f162597a);
        this.f162585v = C89250i.m154773a((AbstractC89171a) C72526i.f162600a);
        this.f162586w = C89250i.m154773a((AbstractC89171a) C72516a.f162590a);
        this.f162587x = new C1213t<>();
        this.f162588y = new C1213t<>();
        this.f162589z = new C1213t<>();
        this.f162530A = new C1213t<>();
        this.f162531B = new C1213t<>();
        this.f162532C = new C1213t<>();
        this.f162533D = new C1213t<>();
        this.f162534E = new C1213t<>();
        this.f162535F = new C1213t<>();
        this.f162536G = new C1213t<>();
        this.f162537H = new C1213t<>();
        this.f162538I = new C1213t<>();
        this.f162539J = new C1213t<>();
        this.f162566c = new C1213t<>();
        this.f162567d = new C1213t<>();
        this.f162568e = new C1213t<>();
        this.f162569f = new C1213t<>();
        this.f162540K = C89250i.m154773a((AbstractC89171a) new C72532n(this));
        this.f162541L = C89250i.m154773a((AbstractC89171a) new C72530m(this));
        this.f162542M = new C1213t();
        this.f162543N = new C88271g<>();
        this.f162544O = new C88276k<>();
        this.f162545P = new ArrayList<>();
        this.f162546Q = new C1213t<>();
        this.f162547R = new C1213t<>();
        this.f162548S = new C1213t<>();
        this.f162549T = new C1213t<>();
        this.f162550U = new C1213t<>();
        this.f162551V = new C1213t<>();
        this.f162553X = new C1213t<>();
        this.f162554Y = C89250i.m154773a((AbstractC89171a) C72529l.f162603a);
        this.f162555Z = C89250i.m154773a((AbstractC89171a) C72534o.f162608a);
        this.f162557aa = new C1213t<>();
        this.f162558ab = C89250i.m154773a((AbstractC89171a) C72524g.f162598a);
        this.f162559ac = true;
        MethodCollector.m26664o(5118);
    }

    public /* synthetic */ C72515b(C21582f fVar, AbstractC14088a aVar, AbstractC89172b bVar, byte b) {
        this(fVar, aVar, bVar);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20382b
    public <S extends AbstractC20368af, A> void selectNonNullSubscribe(JediViewModel<S> jediViewModel, AbstractC89290k<S, ? extends A> kVar, C20370ah<C20373ak<A>> ahVar, AbstractC89183m<? super AbstractC20382b, ? super A, C89391z> mVar) {
        C89219l.m154721d(jediViewModel, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(ahVar, "");
        C89219l.m154721d(mVar, "");
        AbstractC20382b.C20383a.m38599a(this, jediViewModel, kVar, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public <S extends AbstractC20368af, A> AbstractC88412b selectSubscribe(JediViewModel<S> jediViewModel, AbstractC89290k<S, ? extends A> kVar, C20370ah<C20373ak<A>> ahVar, AbstractC89183m<? super AbstractC20477i, ? super A, C89391z> mVar) {
        C89219l.m154721d(jediViewModel, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(ahVar, "");
        C89219l.m154721d(mVar, "");
        return AbstractC20382b.C20383a.m38606d(this, jediViewModel, kVar, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20382b
    public <S extends AbstractC20368af, A> void subscribeEvent(JediViewModel<S> jediViewModel, AbstractC89290k<S, ? extends C20391d<? extends A>> kVar, C20370ah<C20373ak<C20391d<A>>> ahVar, AbstractC89183m<? super AbstractC20382b, ? super A, C89391z> mVar) {
        C89219l.m154721d(jediViewModel, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(ahVar, "");
        C89219l.m154721d(mVar, "");
        AbstractC20382b.C20383a.m38602b(this, jediViewModel, kVar, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20382b
    public <S extends AbstractC20368af, A> void subscribeMultiEvent(JediViewModel<S> jediViewModel, AbstractC89290k<S, ? extends C20365ac<? extends A>> kVar, C20370ah<C20373ak<C20365ac<A>>> ahVar, AbstractC89183m<? super AbstractC20382b, ? super A, C89391z> mVar) {
        C89219l.m154721d(jediViewModel, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(ahVar, "");
        C89219l.m154721d(mVar, "");
        AbstractC20382b.C20383a.m38605c(this, jediViewModel, kVar, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public <S extends AbstractC20368af, A, B> AbstractC88412b selectSubscribe(JediViewModel<S> jediViewModel, AbstractC89290k<S, ? extends A> kVar, AbstractC89290k<S, ? extends B> kVar2, C20370ah<C20374al<A, B>> ahVar, AbstractC89187q<? super AbstractC20477i, ? super A, ? super B, C89391z> qVar) {
        C89219l.m154721d(jediViewModel, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(kVar2, "");
        C89219l.m154721d(ahVar, "");
        C89219l.m154721d(qVar, "");
        return AbstractC20382b.C20383a.m38585a(this, jediViewModel, kVar, kVar2, ahVar, qVar);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public <S extends AbstractC20368af, T> AbstractC88412b asyncSubscribe(JediViewModel<S> jediViewModel, AbstractC89290k<S, ? extends AbstractC20362a<? extends T>> kVar, C20370ah<C20373ak<AbstractC20362a<T>>> ahVar, AbstractC89183m<? super AbstractC20477i, ? super Throwable, C89391z> mVar, AbstractC89172b<? super AbstractC20477i, C89391z> bVar, AbstractC89183m<? super AbstractC20477i, ? super T, C89391z> mVar2) {
        C89219l.m154721d(jediViewModel, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(ahVar, "");
        return AbstractC20382b.C20383a.m38584a(this, jediViewModel, kVar, ahVar, mVar, bVar, mVar2);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public <S extends AbstractC20368af, A, B, C> AbstractC88412b selectSubscribe(JediViewModel<S> jediViewModel, AbstractC89290k<S, ? extends A> kVar, AbstractC89290k<S, ? extends B> kVar2, AbstractC89290k<S, ? extends C> kVar3, C20370ah<C20375am<A, B, C>> ahVar, AbstractC89188r<? super AbstractC20477i, ? super A, ? super B, ? super C, C89391z> rVar) {
        C89219l.m154721d(jediViewModel, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(kVar2, "");
        C89219l.m154721d(kVar3, "");
        C89219l.m154721d(ahVar, "");
        C89219l.m154721d(rVar, "");
        return AbstractC20382b.C20383a.m38586a(this, jediViewModel, kVar, kVar2, kVar3, ahVar, rVar);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public <S extends AbstractC20368af, A, B, C, D> AbstractC88412b selectSubscribe(JediViewModel<S> jediViewModel, AbstractC89290k<S, ? extends A> kVar, AbstractC89290k<S, ? extends B> kVar2, AbstractC89290k<S, ? extends C> kVar3, AbstractC89290k<S, ? extends D> kVar4, C20370ah<C20376an<A, B, C, D>> ahVar, AbstractC89189s<? super AbstractC20477i, ? super A, ? super B, ? super C, ? super D, C89391z> sVar) {
        C89219l.m154721d(jediViewModel, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(kVar2, "");
        C89219l.m154721d(kVar3, "");
        C89219l.m154721d(kVar4, "");
        C89219l.m154721d(ahVar, "");
        C89219l.m154721d(sVar, "");
        return AbstractC20382b.C20383a.m38587a(this, jediViewModel, kVar, kVar2, kVar3, kVar4, ahVar, sVar);
    }
}
