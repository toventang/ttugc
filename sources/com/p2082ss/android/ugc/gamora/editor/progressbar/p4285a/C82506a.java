package com.p2082ss.android.ugc.gamora.editor.progressbar.p4285a;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.core.content.C0643b;
import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.AbstractC1214u;
import androidx.lifecycle.C1171ab;
import androidx.lifecycle.C1175ad;
import androidx.lifecycle.C1213t;
import androidx.lifecycle.LiveData;
import com.C1764a;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
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
import com.bytedance.keva.Keva;
import com.bytedance.p1559o.AbstractC21566a;
import com.bytedance.p1559o.C21582f;
import com.bytedance.p1559o.p1561b.C21572a;
import com.bytedance.p969f.p970a.p971a.AbstractC14552j;
import com.bytedance.p969f.p970a.p971a.C14544f;
import com.bytedance.provider.p1587vm.ScopeViewModel;
import com.bytedance.scene.AbstractC22219j;
import com.bytedance.tux.input.TuxTextView;
import com.p2082ss.android.ugc.asve.editor.AbstractC31071f;
import com.p2082ss.android.ugc.aweme.adaptation.C33398a;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.filter.FilterBean;
import com.p2082ss.android.ugc.aweme.property.C65333ac;
import com.p2082ss.android.ugc.aweme.property.C65334ad;
import com.p2082ss.android.ugc.aweme.property.C65335ae;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.C70968bl;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p2082ss.android.ugc.aweme.shortvideo.preview.AbstractC72510a;
import com.p2082ss.android.ugc.aweme.tools.C78099c;
import com.p2082ss.android.ugc.gamora.editor.filter.core.EditFilterViewModel;
import com.p2082ss.android.ugc.gamora.editor.progress.C82495f;
import com.p2082ss.android.ugc.gamora.editor.progressbar.AbstractC82503a;
import com.p2082ss.android.ugc.gamora.editor.progressbar.C82532c;
import com.p2082ss.android.ugc.gamora.editor.progressbar.C82544d;
import com.p2082ss.android.ugc.gamora.editor.progressbar.EditPreviewProgressViewModel;
import com.p2082ss.android.ugc.gamora.editor.toolbar.EditToolbarViewModel;
import com.p2082ss.android.ugc.tools.p4344f.C84425b;
import com.p2082ss.android.ugc.tools.utils.C84912r;
import com.p2082ss.android.ugc.trill.R;
import com.p2082ss.android.vesdk.C85581w;
import dmt.p4542av.video.C88296t;
import dmt.p4542av.video.VEEditorAutoStartStopArbiter;
import java.lang.reflect.Type;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89378p;
import p4600h.C89391z;
import p4600h.p4601a.C89064i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4612a.AbstractC89187q;
import p4600h.p4611f.p4612a.AbstractC89188r;
import p4600h.p4611f.p4612a.AbstractC89189s;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89204ab;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89232y;
import p4600h.p4616h.AbstractC89248d;
import p4600h.p4620k.AbstractC89277c;
import p4600h.p4620k.AbstractC89286i;
import p4600h.p4620k.AbstractC89290k;

/* renamed from: com.ss.android.ugc.gamora.editor.progressbar.a.a */
public final class C82506a extends AbstractC22219j implements AbstractC20382b, AbstractC21566a {

    /* renamed from: H */
    public static final C82510d f184510H = new C82510d((byte) 0);

    /* renamed from: a */
    static final /* synthetic */ AbstractC89286i[] f184511a = {new C89232y(C82506a.class, "editPreviewApi", "getEditPreviewApi()Lcom/ss/android/ugc/aweme/shortvideo/preview/EditPreviewApi;", 0), new C89232y(C82506a.class, "editPreviewProgressApi", "getEditPreviewProgressApi()Lcom/ss/android/ugc/gamora/editor/progressbar/EditPreviewProgressApi;", 0), new C89232y(C82506a.class, "mModel", "getMModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0)};

    /* renamed from: A */
    ImageView f184512A;

    /* renamed from: B */
    public SeekBar f184513B;

    /* renamed from: C */
    public RelativeLayout f184514C;

    /* renamed from: D */
    public C1213t<C88296t> f184515D;

    /* renamed from: E */
    public Context f184516E;

    /* renamed from: F */
    View f184517F;

    /* renamed from: G */
    public TextView f184518G;

    /* renamed from: I */
    private final AbstractC89248d f184519I = C21572a.m40504a(getDiContainer(), AbstractC72510a.class);

    /* renamed from: J */
    private final AbstractC89244h f184520J;

    /* renamed from: K */
    private final AbstractC89244h f184521K;

    /* renamed from: L */
    private final AbstractC89248d f184522L;

    /* renamed from: M */
    private final AbstractC89244h f184523M;

    /* renamed from: N */
    private final AbstractC89244h f184524N;

    /* renamed from: O */
    private final AbstractC89244h f184525O;

    /* renamed from: P */
    private final AbstractC89244h f184526P;

    /* renamed from: Q */
    private AbstractC31071f.AbstractC31073b f184527Q;

    /* renamed from: R */
    private ImageView f184528R;

    /* renamed from: S */
    private int f184529S;

    /* renamed from: T */
    private int f184530T;

    /* renamed from: U */
    private int f184531U;

    /* renamed from: V */
    private final C21582f f184532V;

    /* renamed from: b */
    final AbstractC89248d f184533b = C21572a.m40504a(getDiContainer(), AbstractC82503a.class);

    /* renamed from: c */
    final AbstractC89244h f184534c;

    /* renamed from: d */
    boolean f184535d;

    /* renamed from: e */
    public boolean f184536e;

    /* renamed from: f */
    public boolean f184537f;

    /* renamed from: g */
    public boolean f184538g;

    /* renamed from: h */
    public int f184539h;

    /* renamed from: i */
    public boolean f184540i;

    /* renamed from: j */
    public int f184541j;

    /* renamed from: k */
    public boolean f184542k;

    /* renamed from: l */
    public boolean f184543l;

    /* renamed from: t */
    public int f184544t;

    /* renamed from: u */
    public int f184545u;

    /* renamed from: v */
    public int f184546v;

    /* renamed from: w */
    public long f184547w;

    /* renamed from: x */
    public View f184548x;

    /* renamed from: y */
    public TuxTextView f184549y;

    /* renamed from: z */
    public TuxTextView f184550z;

    static {
        Covode.recordClassIndex(96350);
    }

    /* renamed from: F */
    private final EditPreviewProgressViewModel m142624F() {
        return (EditPreviewProgressViewModel) this.f184520J.getValue();
    }

    /* renamed from: G */
    private final Handler m142625G() {
        return (Handler) this.f184524N.getValue();
    }

    /* renamed from: H */
    private final Runnable m142626H() {
        return (Runnable) this.f184525O.getValue();
    }

    /* renamed from: I */
    private final Keva m142627I() {
        return (Keva) this.f184526P.getValue();
    }

    /* renamed from: a */
    public final AbstractC72510a mo127596a() {
        return (AbstractC72510a) this.f184519I.mo23374a(this, f184511a[0]);
    }

    /* renamed from: b */
    public final VideoPublishEditModel mo127599b() {
        return (VideoPublishEditModel) this.f184522L.mo23374a(this, f184511a[2]);
    }

    /* renamed from: d */
    public final AbstractC31071f mo127600d() {
        return (AbstractC31071f) this.f184523M.getValue();
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final boolean getUniqueOnlyGlobal() {
        return true;
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.progressbar.a.a$d */
    public static final class C82510d {
        static {
            Covode.recordClassIndex(96354);
        }

        private C82510d() {
        }

        public /* synthetic */ C82510d(byte b) {
            this();
        }
    }

    @Override // com.bytedance.p1559o.AbstractC21566a
    public final C21582f getDiContainer() {
        return this.f184532V;
    }

    /* Return type fixed from 'com.bytedance.jedi.arch.g' to match base method */
    @Override // com.bytedance.jedi.arch.AbstractC20367ae
    public final /* bridge */ /* synthetic */ AbstractC20477i getReceiver() {
        return this;
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.progressbar.a.a$n */
    static final class C82520n extends AbstractC89220m implements AbstractC89171a<Keva> {

        /* renamed from: a */
        public static final C82520n f184569a = new C82520n();

        static {
            Covode.recordClassIndex(96364);
        }

        C82520n() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Keva invoke() {
            return Keva.getRepo("edit_page_long_press_tips");
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.progressbar.a.a$p */
    static final class C82522p extends AbstractC89220m implements AbstractC89171a<Runnable> {

        /* renamed from: a */
        final /* synthetic */ C82506a f184571a;

        static {
            Covode.recordClassIndex(96366);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C82522p(C82506a aVar) {
            super(0);
            this.f184571a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Runnable invoke() {
            return new Runnable(this) {
                /* class com.p2082ss.android.ugc.gamora.editor.progressbar.p4285a.C82506a.C82522p.RunnableC825231 */

                /* renamed from: a */
                final /* synthetic */ C82522p f184572a;

                static {
                    Covode.recordClassIndex(96367);
                }

                {
                    this.f184572a = r1;
                }

                public final void run() {
                    if (this.f184572a.f184571a.f184518G != null) {
                        TextView textView = this.f184572a.f184571a.f184518G;
                        if (textView == null) {
                            C89219l.m154710a("longPressTips");
                        }
                        textView.setVisibility(8);
                    }
                }
            };
        }
    }

    @Override // com.bytedance.jedi.arch.AbstractC20534v
    public final AbstractC1204m getLifecycleOwner() {
        return AbstractC20382b.C20383a.m38581a(this);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final AbstractC20534v getLifecycleOwnerHolder() {
        return AbstractC20382b.C20383a.m38601b(this);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final AbstractC20367ae<AbstractC20477i> getReceiverHolder() {
        return AbstractC20382b.C20383a.m38604c(this);
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.progressbar.a.a$o */
    static final class C82521o extends AbstractC89220m implements AbstractC89171a<Handler> {

        /* renamed from: a */
        public static final C82521o f184570a = new C82521o();

        static {
            Covode.recordClassIndex(96365);
        }

        C82521o() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Handler invoke() {
            return new Handler(Looper.getMainLooper());
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.progressbar.a.a$q */
    static final class C82524q extends AbstractC89220m implements AbstractC89171a<AbstractC31071f> {

        /* renamed from: a */
        final /* synthetic */ C82506a f184573a;

        static {
            Covode.recordClassIndex(96368);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C82524q(C82506a aVar) {
            super(0);
            this.f184573a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ AbstractC31071f invoke() {
            return this.f184573a.mo127596a().mo114778C().getValue();
        }
    }

    @Override // com.bytedance.scene.AbstractC22219j
    /* renamed from: n_ */
    public final void mo22713n_() {
        super.mo22713n_();
        m142625G().removeCallbacks(m142626H());
        AbstractC31071f d = mo127600d();
        if (d != null) {
            d.mo56332b(this.f184527Q);
        }
    }

    /* renamed from: D */
    public final void mo127594D() {
        int i;
        AbstractC31071f d = mo127600d();
        if (d != null) {
            i = d.mo56370k();
        } else {
            i = 0;
        }
        this.f184545u = i;
        mo127601d(2);
        View view = this.f184517F;
        if (view == null) {
            C89219l.m154710a("mProgressTimeLayout");
        }
        view.setVisibility(0);
        ImageView imageView = this.f184512A;
        if (imageView == null) {
            C89219l.m154710a("statusImg");
        }
        imageView.setVisibility(8);
        m142624F().mo127588a(true);
        this.f184537f = true;
    }

    @Override // com.bytedance.scene.AbstractC22219j
    /* renamed from: w */
    public final void mo36490w() {
        super.mo36490w();
        if (this.f184535d || this.f184536e) {
            this.f184535d = false;
            ImageView imageView = this.f184512A;
            if (imageView == null) {
                C89219l.m154710a("statusImg");
            }
            imageView.setVisibility(8);
            View view = this.f184517F;
            if (view == null) {
                C89219l.m154710a("mProgressTimeLayout");
            }
            view.setVisibility(8);
            mo127601d(0);
            C1213t<C88296t> tVar = this.f184515D;
            if (tVar == null) {
                C89219l.m154710a("mPreviewControlOpLiveData");
            }
            tVar.setValue(C88296t.m153435a());
            this.f184536e = true;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.progressbar.a.a$a */
    public static final class C82507a extends AbstractC89220m implements AbstractC89171a<EditPreviewProgressViewModel> {

        /* renamed from: a */
        final /* synthetic */ AbstractC22219j f184551a;

        /* renamed from: b */
        final /* synthetic */ AbstractC89277c f184552b;

        /* renamed from: c */
        final /* synthetic */ AbstractC89277c f184553c;

        static {
            Covode.recordClassIndex(96351);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C82507a(AbstractC22219j jVar, AbstractC89277c cVar, AbstractC89277c cVar2) {
            super(0);
            this.f184551a = jVar;
            this.f184552b = cVar;
            this.f184553c = cVar2;
        }

        /* JADX WARN: Type inference failed for: r0v8, types: [com.ss.android.ugc.gamora.editor.progressbar.EditPreviewProgressViewModel, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARN: Type inference failed for: r0v15, types: [com.ss.android.ugc.gamora.editor.progressbar.EditPreviewProgressViewModel, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARNING: Unknown variable types count: 2 */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.p2082ss.android.ugc.gamora.editor.progressbar.EditPreviewProgressViewModel invoke() {
            /*
                r6 = this;
                com.bytedance.scene.j r0 = r6.f184551a
                com.bytedance.scene.j r5 = r0.f52551o
                h.k.c r0 = r6.f184553c
                java.lang.Class r0 = p4600h.p4611f.C89170a.m154665a(r0)
                java.lang.String r3 = r0.getCanonicalName()
                java.lang.String r4 = ""
                p4600h.p4611f.p4613b.C89219l.m154716b(r3, r4)
            L_0x0013:
                if (r5 == 0) goto L_0x003a
                androidx.lifecycle.ad$b r0 = com.bytedance.jedi.arch.C20392e.f48284a     // Catch:{ as -> 0x0035 }
                androidx.lifecycle.ad r2 = com.bytedance.scene.C22267s.m41934a(r5, r0)     // Catch:{ as -> 0x0035 }
                h.k.c r0 = r6.f184553c     // Catch:{ as -> 0x0035 }
                java.lang.Class r0 = p4600h.p4611f.C89170a.m154665a(r0)     // Catch:{ as -> 0x0035 }
                java.lang.String r1 = r0.getCanonicalName()     // Catch:{ as -> 0x0035 }
                p4600h.p4611f.p4613b.C89219l.m154716b(r1, r4)     // Catch:{ as -> 0x0035 }
                h.k.c r0 = r6.f184552b     // Catch:{ as -> 0x0035 }
                java.lang.Class r0 = p4600h.p4611f.C89170a.m154665a(r0)     // Catch:{ as -> 0x0035 }
                androidx.lifecycle.ac r0 = m142646x4221d527(r2, r1, r0)     // Catch:{ as -> 0x0035 }
                com.bytedance.jedi.arch.JediViewModel r0 = (com.bytedance.jedi.arch.JediViewModel) r0     // Catch:{ as -> 0x0035 }
                goto L_0x0038
            L_0x0035:
                com.bytedance.scene.j r5 = r5.f52551o
                goto L_0x0013
            L_0x0038:
                if (r0 != 0) goto L_0x0052
            L_0x003a:
                com.bytedance.scene.j r0 = r6.f184551a
                androidx.fragment.app.e r1 = com.bytedance.scene.ktx.C22228c.m41832b(r0)
                androidx.lifecycle.ad$b r0 = com.bytedance.jedi.arch.C20392e.f48284a
                androidx.lifecycle.ad r1 = androidx.lifecycle.C1181ae.m3881a(r1, r0)
                h.k.c r0 = r6.f184552b
                java.lang.Class r0 = p4600h.p4611f.C89170a.m154665a(r0)
                androidx.lifecycle.ac r0 = m142646x4221d527(r1, r3, r0)
                com.bytedance.jedi.arch.JediViewModel r0 = (com.bytedance.jedi.arch.JediViewModel) r0
            L_0x0052:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.gamora.editor.progressbar.p4285a.C82506a.C82507a.invoke():com.bytedance.jedi.arch.JediViewModel");
        }

        /* renamed from: com_ss_android_ugc_gamora_editor_progressbar_ui_EditPreviewProgressScene$$special$$inlined$hostViewModel$1_androidx_lifecycle_VScopeLancet_get */
        public static AbstractC1174ac m142646x4221d527(C1175ad adVar, String str, Class cls) {
            if (cls.equals(ScopeViewModel.class)) {
                return adVar.mo3984a(str, cls);
            }
            AbstractC1174ac a = adVar.mo3984a(str, cls);
            C1171ab.m3870a(a, adVar);
            return a;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.progressbar.a.a$b */
    public static final class C82508b extends AbstractC89220m implements AbstractC89171a<EditFilterViewModel> {

        /* renamed from: a */
        final /* synthetic */ AbstractC22219j f184554a;

        /* renamed from: b */
        final /* synthetic */ AbstractC89277c f184555b;

        /* renamed from: c */
        final /* synthetic */ AbstractC89277c f184556c;

        static {
            Covode.recordClassIndex(96352);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C82508b(AbstractC22219j jVar, AbstractC89277c cVar, AbstractC89277c cVar2) {
            super(0);
            this.f184554a = jVar;
            this.f184555b = cVar;
            this.f184556c = cVar2;
        }

        /* JADX WARN: Type inference failed for: r0v8, types: [com.ss.android.ugc.gamora.editor.filter.core.EditFilterViewModel, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARN: Type inference failed for: r0v15, types: [com.ss.android.ugc.gamora.editor.filter.core.EditFilterViewModel, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARNING: Unknown variable types count: 2 */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.p2082ss.android.ugc.gamora.editor.filter.core.EditFilterViewModel invoke() {
            /*
                r6 = this;
                com.bytedance.scene.j r0 = r6.f184554a
                com.bytedance.scene.j r5 = r0.f52551o
                h.k.c r0 = r6.f184556c
                java.lang.Class r0 = p4600h.p4611f.C89170a.m154665a(r0)
                java.lang.String r3 = r0.getCanonicalName()
                java.lang.String r4 = ""
                p4600h.p4611f.p4613b.C89219l.m154716b(r3, r4)
            L_0x0013:
                if (r5 == 0) goto L_0x003a
                androidx.lifecycle.ad$b r0 = com.bytedance.jedi.arch.C20392e.f48284a     // Catch:{ as -> 0x0035 }
                androidx.lifecycle.ad r2 = com.bytedance.scene.C22267s.m41934a(r5, r0)     // Catch:{ as -> 0x0035 }
                h.k.c r0 = r6.f184556c     // Catch:{ as -> 0x0035 }
                java.lang.Class r0 = p4600h.p4611f.C89170a.m154665a(r0)     // Catch:{ as -> 0x0035 }
                java.lang.String r1 = r0.getCanonicalName()     // Catch:{ as -> 0x0035 }
                p4600h.p4611f.p4613b.C89219l.m154716b(r1, r4)     // Catch:{ as -> 0x0035 }
                h.k.c r0 = r6.f184555b     // Catch:{ as -> 0x0035 }
                java.lang.Class r0 = p4600h.p4611f.C89170a.m154665a(r0)     // Catch:{ as -> 0x0035 }
                androidx.lifecycle.ac r0 = m142647x55c9a8a8(r2, r1, r0)     // Catch:{ as -> 0x0035 }
                com.bytedance.jedi.arch.JediViewModel r0 = (com.bytedance.jedi.arch.JediViewModel) r0     // Catch:{ as -> 0x0035 }
                goto L_0x0038
            L_0x0035:
                com.bytedance.scene.j r5 = r5.f52551o
                goto L_0x0013
            L_0x0038:
                if (r0 != 0) goto L_0x0052
            L_0x003a:
                com.bytedance.scene.j r0 = r6.f184554a
                androidx.fragment.app.e r1 = com.bytedance.scene.ktx.C22228c.m41832b(r0)
                androidx.lifecycle.ad$b r0 = com.bytedance.jedi.arch.C20392e.f48284a
                androidx.lifecycle.ad r1 = androidx.lifecycle.C1181ae.m3881a(r1, r0)
                h.k.c r0 = r6.f184555b
                java.lang.Class r0 = p4600h.p4611f.C89170a.m154665a(r0)
                androidx.lifecycle.ac r0 = m142647x55c9a8a8(r1, r3, r0)
                com.bytedance.jedi.arch.JediViewModel r0 = (com.bytedance.jedi.arch.JediViewModel) r0
            L_0x0052:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.gamora.editor.progressbar.p4285a.C82506a.C82508b.invoke():com.bytedance.jedi.arch.JediViewModel");
        }

        /* renamed from: com_ss_android_ugc_gamora_editor_progressbar_ui_EditPreviewProgressScene$$special$$inlined$hostViewModel$2_androidx_lifecycle_VScopeLancet_get */
        public static AbstractC1174ac m142647x55c9a8a8(C1175ad adVar, String str, Class cls) {
            if (cls.equals(ScopeViewModel.class)) {
                return adVar.mo3984a(str, cls);
            }
            AbstractC1174ac a = adVar.mo3984a(str, cls);
            C1171ab.m3870a(a, adVar);
            return a;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.progressbar.a.a$c */
    public static final class C82509c extends AbstractC89220m implements AbstractC89171a<EditToolbarViewModel> {

        /* renamed from: a */
        final /* synthetic */ AbstractC22219j f184557a;

        /* renamed from: b */
        final /* synthetic */ AbstractC89277c f184558b;

        /* renamed from: c */
        final /* synthetic */ AbstractC89277c f184559c;

        static {
            Covode.recordClassIndex(96353);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C82509c(AbstractC22219j jVar, AbstractC89277c cVar, AbstractC89277c cVar2) {
            super(0);
            this.f184557a = jVar;
            this.f184558b = cVar;
            this.f184559c = cVar2;
        }

        /* JADX WARN: Type inference failed for: r0v8, types: [com.ss.android.ugc.gamora.editor.toolbar.EditToolbarViewModel, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARN: Type inference failed for: r0v15, types: [com.ss.android.ugc.gamora.editor.toolbar.EditToolbarViewModel, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARNING: Unknown variable types count: 2 */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.p2082ss.android.ugc.gamora.editor.toolbar.EditToolbarViewModel invoke() {
            /*
                r6 = this;
                com.bytedance.scene.j r0 = r6.f184557a
                com.bytedance.scene.j r5 = r0.f52551o
                h.k.c r0 = r6.f184559c
                java.lang.Class r0 = p4600h.p4611f.C89170a.m154665a(r0)
                java.lang.String r3 = r0.getCanonicalName()
                java.lang.String r4 = ""
                p4600h.p4611f.p4613b.C89219l.m154716b(r3, r4)
            L_0x0013:
                if (r5 == 0) goto L_0x003a
                androidx.lifecycle.ad$b r0 = com.bytedance.jedi.arch.C20392e.f48284a     // Catch:{ as -> 0x0035 }
                androidx.lifecycle.ad r2 = com.bytedance.scene.C22267s.m41934a(r5, r0)     // Catch:{ as -> 0x0035 }
                h.k.c r0 = r6.f184559c     // Catch:{ as -> 0x0035 }
                java.lang.Class r0 = p4600h.p4611f.C89170a.m154665a(r0)     // Catch:{ as -> 0x0035 }
                java.lang.String r1 = r0.getCanonicalName()     // Catch:{ as -> 0x0035 }
                p4600h.p4611f.p4613b.C89219l.m154716b(r1, r4)     // Catch:{ as -> 0x0035 }
                h.k.c r0 = r6.f184558b     // Catch:{ as -> 0x0035 }
                java.lang.Class r0 = p4600h.p4611f.C89170a.m154665a(r0)     // Catch:{ as -> 0x0035 }
                androidx.lifecycle.ac r0 = m142648x69717c29(r2, r1, r0)     // Catch:{ as -> 0x0035 }
                com.bytedance.jedi.arch.JediViewModel r0 = (com.bytedance.jedi.arch.JediViewModel) r0     // Catch:{ as -> 0x0035 }
                goto L_0x0038
            L_0x0035:
                com.bytedance.scene.j r5 = r5.f52551o
                goto L_0x0013
            L_0x0038:
                if (r0 != 0) goto L_0x0052
            L_0x003a:
                com.bytedance.scene.j r0 = r6.f184557a
                androidx.fragment.app.e r1 = com.bytedance.scene.ktx.C22228c.m41832b(r0)
                androidx.lifecycle.ad$b r0 = com.bytedance.jedi.arch.C20392e.f48284a
                androidx.lifecycle.ad r1 = androidx.lifecycle.C1181ae.m3881a(r1, r0)
                h.k.c r0 = r6.f184558b
                java.lang.Class r0 = p4600h.p4611f.C89170a.m154665a(r0)
                androidx.lifecycle.ac r0 = m142648x69717c29(r1, r3, r0)
                com.bytedance.jedi.arch.JediViewModel r0 = (com.bytedance.jedi.arch.JediViewModel) r0
            L_0x0052:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.gamora.editor.progressbar.p4285a.C82506a.C82509c.invoke():com.bytedance.jedi.arch.JediViewModel");
        }

        /* renamed from: com_ss_android_ugc_gamora_editor_progressbar_ui_EditPreviewProgressScene$$special$$inlined$hostViewModel$3_androidx_lifecycle_VScopeLancet_get */
        public static AbstractC1174ac m142648x69717c29(C1175ad adVar, String str, Class cls) {
            if (cls.equals(ScopeViewModel.class)) {
                return adVar.mo3984a(str, cls);
            }
            AbstractC1174ac a = adVar.mo3984a(str, cls);
            C1171ab.m3870a(a, adVar);
            return a;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.progressbar.a.a$e */
    static final class RunnableC82511e implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C82506a f184560a;

        static {
            Covode.recordClassIndex(96355);
        }

        RunnableC82511e(C82506a aVar) {
            this.f184560a = aVar;
        }

        public final void run() {
            Integer num;
            int i;
            int intValue;
            int[] iArr = new int[2];
            C82506a.m142632d(this.f184560a).getLocationOnScreen(iArr);
            C89219l.m154721d(iArr, "");
            if (1 <= C89064i.m154474a(iArr)) {
                num = Integer.valueOf(iArr[1]);
            } else {
                num = null;
            }
            if (num == null || (intValue = num.intValue()) == -1) {
                i = -1;
            } else {
                i = Float.valueOf(((float) intValue) + C84912r.m145929a(15.0f) + ((float) C82506a.m142632d(this.f184560a).getHeight()));
            }
            C82506a aVar = this.f184560a;
            ((AbstractC14552j) this.f184560a.getDiContainer().mo35249a((Type) AbstractC14552j.class, (String) null)).mo23383a(new C14544f(1, new C82532c((AbstractC82503a) aVar.f184533b.mo23374a(aVar, C82506a.f184511a[1]), i.intValue())));
        }
    }

    /* renamed from: C */
    public final void mo127593C() {
        if (this.f184536e) {
            AbstractC31071f d = mo127600d();
            if (d != null) {
                d.mo56390u();
            }
            ImageView imageView = this.f184512A;
            if (imageView == null) {
                C89219l.m154710a("statusImg");
            }
            imageView.setVisibility(0);
            if (C65335ae.m117018c()) {
                View view = this.f184517F;
                if (view == null) {
                    C89219l.m154710a("mProgressTimeLayout");
                }
                view.setVisibility(0);
            }
            this.f184536e = false;
            mo127601d(1);
            m142628J();
            return;
        }
        C1213t<C88296t> tVar = this.f184515D;
        if (tVar == null) {
            C89219l.m154710a("mPreviewControlOpLiveData");
        }
        tVar.setValue(C88296t.m153435a());
        ImageView imageView2 = this.f184512A;
        if (imageView2 == null) {
            C89219l.m154710a("statusImg");
        }
        imageView2.setVisibility(8);
        TextView textView = this.f184518G;
        if (textView == null) {
            C89219l.m154710a("longPressTips");
        }
        textView.setVisibility(8);
        View view2 = this.f184517F;
        if (view2 == null) {
            C89219l.m154710a("mProgressTimeLayout");
        }
        view2.setVisibility(8);
        mo127601d(0);
        this.f184536e = true;
    }

    /* renamed from: E */
    public final void mo127595E() {
        int i;
        String str;
        AbstractC31071f d = mo127600d();
        if (d != null) {
            i = d.mo56370k();
        } else {
            i = 0;
        }
        this.f184546v = i;
        m142624F().mo127588a(false);
        View view = this.f184517F;
        if (view == null) {
            C89219l.m154710a("mProgressTimeLayout");
        }
        view.setVisibility(8);
        if (this.f184536e) {
            mo127601d(0);
            C1213t<C88296t> tVar = this.f184515D;
            if (tVar == null) {
                C89219l.m154710a("mPreviewControlOpLiveData");
            }
            tVar.setValue(C88296t.m153435a());
        } else {
            ImageView imageView = this.f184512A;
            if (imageView == null) {
                C89219l.m154710a("statusImg");
            }
            imageView.setVisibility(0);
            mo127601d(1);
        }
        this.f184537f = false;
        int i2 = this.f184546v;
        int i3 = this.f184545u;
        if (i2 - i3 > 0) {
            str = "forth";
        } else {
            str = "back";
        }
        mo127598a(str, "drag", i2 - i3);
    }

    /* renamed from: J */
    private final void m142628J() {
        boolean z;
        int i;
        int i2;
        if (C65335ae.m117018c()) {
            int i3 = m142627I().getInt("long_press_day_count", 0);
            int i4 = m142627I().getInt("long_press_total_count", 0);
            long j = m142627I().getLong("long_press_start_time", 0);
            if (j == 0) {
                m142627I().storeLong("long_press_start_time", System.currentTimeMillis());
            }
            if (System.currentTimeMillis() - j < 86400000) {
                z = true;
            } else {
                z = false;
            }
            C65334ad a = C65333ac.m117015a();
            if (a != null) {
                i = a.f147461a;
            } else {
                i = 0;
            }
            C65334ad a2 = C65333ac.m117015a();
            if (a2 != null) {
                i2 = a2.f147462b;
            } else {
                i2 = 0;
            }
            if (!z) {
                m142627I().storeLong("long_press_start_time", System.currentTimeMillis());
                i3 = 0;
                if (i4 >= i2) {
                    return;
                }
            } else if (i3 >= i || i4 >= i2) {
                return;
            }
            TextView textView = this.f184518G;
            if (textView == null) {
                C89219l.m154710a("longPressTips");
            }
            textView.setVisibility(0);
            m142627I().storeInt("long_press_total_count", i4 + 1);
            m142627I().storeInt("long_press_day_count", i3 + 1);
            m142625G().postDelayed(m142626H(), 3000);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.progressbar.a.a$k */
    public static final class C82517k implements SeekBar.OnSeekBarChangeListener {

        /* renamed from: a */
        final /* synthetic */ C82506a f184566a;

        static {
            Covode.recordClassIndex(96361);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C82517k(C82506a aVar) {
            this.f184566a = aVar;
        }

        public final void onStartTrackingTouch(SeekBar seekBar) {
            this.f184566a.mo127594D();
        }

        public final void onStopTrackingTouch(SeekBar seekBar) {
            this.f184566a.mo127595E();
        }

        public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
            int i2;
            if (z || this.f184566a.f184542k) {
                AbstractC31071f d = this.f184566a.mo127600d();
                if (d != null) {
                    i2 = d.mo56368j();
                } else {
                    i2 = 0;
                }
                C82506a.m142629a(this.f184566a).setValue(C88296t.m153438b((long) ((((float) i2) * ((float) i)) / 100.0f)));
                C82506a.m142629a(this.f184566a).setValue(C88296t.m153437b());
            }
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.progressbar.a.a$l */
    public static final class C82518l implements AbstractC31071f.AbstractC31073b {

        /* renamed from: a */
        final /* synthetic */ C82506a f184567a;

        static {
            Covode.recordClassIndex(96362);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C82518l(C82506a aVar) {
            this.f184567a = aVar;
        }

        @Override // com.p2082ss.android.ugc.asve.editor.AbstractC31071f.AbstractC31073b
        /* renamed from: a */
        public final void mo56404a(int i) {
            long j;
            if (!C65335ae.m117017b()) {
                if (this.f184567a.f184538g) {
                    long currentTimeMillis = System.currentTimeMillis();
                    if (currentTimeMillis - this.f184567a.f184547w > 25 || currentTimeMillis - this.f184567a.f184547w <= 0) {
                        j = 16;
                    } else {
                        j = currentTimeMillis - this.f184567a.f184547w;
                    }
                    AbstractC31071f d = this.f184567a.mo127600d();
                    if (d != null) {
                        C82506a.m142630b(this.f184567a).setText(C82495f.m142603a((float) this.f184567a.f184541j));
                        C82506a.m142631c(this.f184567a).setText(C82495f.m142603a((float) d.mo56368j()));
                    }
                    C82506a aVar = this.f184567a;
                    aVar.mo127597a(aVar.f184539h, (int) j);
                    this.f184567a.f184547w = currentTimeMillis;
                    return;
                }
                if (!this.f184567a.f184537f) {
                    SeekBar seekBar = this.f184567a.f184513B;
                    if (seekBar == null) {
                        C89219l.m154710a("progressSeek");
                    }
                    float f = (float) i;
                    AbstractC31071f d2 = this.f184567a.mo127600d();
                    if (d2 == null) {
                        C89219l.m154715b();
                    }
                    seekBar.setProgress((int) ((f / ((float) d2.mo56368j())) * 100.0f));
                }
                AbstractC31071f d3 = this.f184567a.mo127600d();
                if (d3 != null) {
                    C82506a.m142630b(this.f184567a).setText(C82495f.m142603a((float) i));
                    C82506a.m142631c(this.f184567a).setText(C82495f.m142603a((float) d3.mo56368j()));
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.progressbar.a.a$m */
    static final class View$OnClickListenerC82519m implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C82506a f184568a;

        static {
            Covode.recordClassIndex(96363);
        }

        View$OnClickListenerC82519m(C82506a aVar) {
            this.f184568a = aVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f184568a.mo127593C();
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ C1213t m142629a(C82506a aVar) {
        C1213t<C88296t> tVar = aVar.f184515D;
        if (tVar == null) {
            C89219l.m154710a("mPreviewControlOpLiveData");
        }
        return tVar;
    }

    /* renamed from: b */
    public static final /* synthetic */ TuxTextView m142630b(C82506a aVar) {
        TuxTextView tuxTextView = aVar.f184549y;
        if (tuxTextView == null) {
            C89219l.m154710a("curTime");
        }
        return tuxTextView;
    }

    /* renamed from: c */
    public static final /* synthetic */ TuxTextView m142631c(C82506a aVar) {
        TuxTextView tuxTextView = aVar.f184550z;
        if (tuxTextView == null) {
            C89219l.m154710a("totalTime");
        }
        return tuxTextView;
    }

    /* renamed from: d */
    public static final /* synthetic */ RelativeLayout m142632d(C82506a aVar) {
        RelativeLayout relativeLayout = aVar.f184514C;
        if (relativeLayout == null) {
            C89219l.m154710a("progressLayout");
        }
        return relativeLayout;
    }

    @Override // com.bytedance.jedi.arch.AbstractC20382b
    public final <VM1 extends JediViewModel<S1>, S1 extends AbstractC20368af> S1 getState(VM1 vm1) {
        C89219l.m154721d(vm1, "");
        return (S1) AbstractC20382b.C20383a.m38582a(this, vm1);
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.progressbar.a.a$i */
    static final class C82515i<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ C82506a f184564a;

        static {
            Covode.recordClassIndex(96359);
        }

        C82515i(C82506a aVar) {
            this.f184564a = aVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            C89378p pVar = (C89378p) obj;
            if (pVar != null) {
                C82506a aVar = this.f184564a;
                int intValue = ((Number) pVar.getFirst()).intValue();
                if (intValue == 1) {
                    aVar.f184542k = true;
                    aVar.mo127594D();
                } else if (intValue == 2) {
                    SeekBar seekBar = aVar.f184513B;
                    if (seekBar == null) {
                        C89219l.m154710a("progressSeek");
                    }
                    seekBar.setProgress(((Number) pVar.getSecond()).intValue());
                } else if (intValue == 3) {
                    aVar.mo127595E();
                    aVar.f184542k = false;
                }
            }
        }
    }

    public C82506a(C21582f fVar) {
        C89219l.m154721d(fVar, "");
        this.f184532V = fVar;
        AbstractC89277c a = C89204ab.m154669a(EditPreviewProgressViewModel.class);
        this.f184520J = C89250i.m154773a((AbstractC89171a) new C82507a(this, a, a));
        AbstractC89277c a2 = C89204ab.m154669a(EditFilterViewModel.class);
        this.f184521K = C89250i.m154773a((AbstractC89171a) new C82508b(this, a2, a2));
        AbstractC89277c a3 = C89204ab.m154669a(EditToolbarViewModel.class);
        this.f184534c = C89250i.m154773a((AbstractC89171a) new C82509c(this, a3, a3));
        this.f184522L = C21572a.m40504a(getDiContainer(), VideoPublishEditModel.class);
        this.f184523M = C89250i.m154773a((AbstractC89171a) new C82524q(this));
        this.f184524N = C89250i.m154773a((AbstractC89171a) C82521o.f184570a);
        this.f184525O = C89250i.m154773a((AbstractC89171a) new C82522p(this));
        this.f184526P = C89250i.m154773a((AbstractC89171a) C82520n.f184569a);
        this.f184536e = true;
        this.f184539h = -1;
        this.f184541j = -1;
        this.f184544t = -1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final void mo127601d(int i) {
        if (!C82544d.m142680b()) {
            return;
        }
        if (i == 0) {
            SeekBar seekBar = this.f184513B;
            if (seekBar == null) {
                C89219l.m154710a("progressSeek");
            }
            Context context = this.f184516E;
            if (context == null) {
                C89219l.m154710a("context");
            }
            seekBar.setThumb(C0643b.m2369a(context, (int) R.drawable.a6x));
            SeekBar seekBar2 = this.f184513B;
            if (seekBar2 == null) {
                C89219l.m154710a("progressSeek");
            }
            ViewGroup.LayoutParams layoutParams = seekBar2.getLayoutParams();
            layoutParams.height = this.f184529S;
            SeekBar seekBar3 = this.f184513B;
            if (seekBar3 == null) {
                C89219l.m154710a("progressSeek");
            }
            seekBar3.setLayoutParams(layoutParams);
        } else if (i == 1) {
            SeekBar seekBar4 = this.f184513B;
            if (seekBar4 == null) {
                C89219l.m154710a("progressSeek");
            }
            Context context2 = this.f184516E;
            if (context2 == null) {
                C89219l.m154710a("context");
            }
            seekBar4.setThumb(C0643b.m2369a(context2, (int) R.drawable.a6y));
            SeekBar seekBar5 = this.f184513B;
            if (seekBar5 == null) {
                C89219l.m154710a("progressSeek");
            }
            ViewGroup.LayoutParams layoutParams2 = seekBar5.getLayoutParams();
            layoutParams2.height = this.f184530T;
            SeekBar seekBar6 = this.f184513B;
            if (seekBar6 == null) {
                C89219l.m154710a("progressSeek");
            }
            seekBar6.setLayoutParams(layoutParams2);
        } else if (i == 2) {
            SeekBar seekBar7 = this.f184513B;
            if (seekBar7 == null) {
                C89219l.m154710a("progressSeek");
            }
            Context context3 = this.f184516E;
            if (context3 == null) {
                C89219l.m154710a("context");
            }
            seekBar7.setThumb(C0643b.m2369a(context3, (int) R.drawable.a6w));
            SeekBar seekBar8 = this.f184513B;
            if (seekBar8 == null) {
                C89219l.m154710a("progressSeek");
            }
            ViewGroup.LayoutParams layoutParams3 = seekBar8.getLayoutParams();
            layoutParams3.height = this.f184531U;
            SeekBar seekBar9 = this.f184513B;
            if (seekBar9 == null) {
                C89219l.m154710a("progressSeek");
            }
            seekBar9.setLayoutParams(layoutParams3);
        }
    }

    @Override // com.bytedance.scene.AbstractC22219j
    /* renamed from: a */
    public final void mo22704a(Bundle bundle) {
        super.mo22704a(bundle);
        this.f184515D = mo127596a().mo114833v();
        VEEditorAutoStartStopArbiter vEEditorAutoStartStopArbiter = mo127596a().mo114813d().f200144e;
        if (vEEditorAutoStartStopArbiter != null) {
            vEEditorAutoStartStopArbiter.f200068c = true;
        }
        Context s = mo36485s();
        C89219l.m154716b(s, "");
        this.f184516E = s;
        if (s == null) {
            C89219l.m154710a("context");
        }
        this.f184529S = (int) C84912r.m145930a(s, 13.0f);
        Context context = this.f184516E;
        if (context == null) {
            C89219l.m154710a("context");
        }
        this.f184530T = (int) C84912r.m145930a(context, 14.0f);
        Context context2 = this.f184516E;
        if (context2 == null) {
            C89219l.m154710a("context");
        }
        this.f184531U = (int) C84912r.m145930a(context2, 16.0f);
        View c = mo36475c(R.id.as5);
        C89219l.m154716b(c, "");
        this.f184549y = (TuxTextView) c;
        View c2 = mo36475c(R.id.as7);
        C89219l.m154716b(c2, "");
        this.f184550z = (TuxTextView) c2;
        View c3 = mo36475c(R.id.as4);
        C89219l.m154716b(c3, "");
        this.f184512A = (ImageView) c3;
        View c4 = mo36475c(R.id.arw);
        C89219l.m154716b(c4, "");
        this.f184528R = (ImageView) c4;
        View c5 = mo36475c(R.id.as3);
        C89219l.m154716b(c5, "");
        SeekBar seekBar = (SeekBar) c5;
        this.f184513B = seekBar;
        if (seekBar == null) {
            C89219l.m154710a("progressSeek");
        }
        seekBar.setEnabled(false);
        View c6 = mo36475c(R.id.as2);
        C89219l.m154716b(c6, "");
        this.f184514C = (RelativeLayout) c6;
        View c7 = mo36475c(R.id.as6);
        C89219l.m154716b(c7, "");
        this.f184517F = c7;
        View c8 = mo36475c(R.id.ch6);
        C89219l.m154716b(c8, "");
        this.f184518G = (TextView) c8;
        View view = this.f184517F;
        if (view == null) {
            C89219l.m154710a("mProgressTimeLayout");
        }
        view.setVisibility(8);
        ImageView imageView = this.f184512A;
        if (imageView == null) {
            C89219l.m154710a("statusImg");
        }
        imageView.setOnClickListener(new View$OnClickListenerC82519m(this));
        if (C65335ae.m117017b()) {
            RelativeLayout relativeLayout = this.f184514C;
            if (relativeLayout == null) {
                C89219l.m154710a("progressLayout");
            }
            relativeLayout.setVisibility(8);
        } else {
            RelativeLayout relativeLayout2 = this.f184514C;
            if (relativeLayout2 == null) {
                C89219l.m154710a("progressLayout");
            }
            ViewGroup.LayoutParams layoutParams = relativeLayout2.getLayoutParams();
            if (!(layoutParams instanceof RelativeLayout.LayoutParams)) {
                layoutParams = null;
            }
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
            if (layoutParams2 != null) {
                int c9 = C33398a.m68487c();
                if (C65335ae.m117018c()) {
                    Context context3 = this.f184516E;
                    if (context3 == null) {
                        C89219l.m154710a("context");
                    }
                    layoutParams2.bottomMargin = c9 + ((int) C84912r.m145930a(context3, 30.0f));
                } else if (C82544d.m142680b()) {
                    Context context4 = this.f184516E;
                    if (context4 == null) {
                        C89219l.m154710a("context");
                    }
                    layoutParams2.bottomMargin = c9 + ((int) C84912r.m145930a(context4, 15.0f));
                }
                RelativeLayout relativeLayout3 = this.f184514C;
                if (relativeLayout3 == null) {
                    C89219l.m154710a("progressLayout");
                }
                relativeLayout3.setLayoutParams(layoutParams2);
            }
        }
        RelativeLayout relativeLayout4 = this.f184514C;
        if (relativeLayout4 == null) {
            C89219l.m154710a("progressLayout");
        }
        relativeLayout4.post(new RunnableC82511e(this));
        if (!C82544d.m142680b()) {
            SeekBar seekBar2 = this.f184513B;
            if (seekBar2 == null) {
                C89219l.m154710a("progressSeek");
            }
            seekBar2.setVisibility(8);
        } else {
            mo127601d(0);
            SeekBar seekBar3 = this.f184513B;
            if (seekBar3 == null) {
                C89219l.m154710a("progressSeek");
            }
            seekBar3.setOnSeekBarChangeListener(new C82517k(this));
        }
        this.f184527Q = new C82518l(this);
        AbstractC31071f d = mo127600d();
        if (d != null) {
            d.mo56305a(this.f184527Q);
        }
        AbstractC20382b.C20383a.m38603b(this, m142624F(), C82525b.f184574a, new C82512f(this));
        AbstractC20382b.C20383a.m38603b(this, m142624F(), C82526c.f184575a, new C82513g(this));
        AbstractC20382b.C20383a.m38603b(this, m142624F(), C82527d.f184576a, new C82514h(this));
        m142624F().f184498b.observe(this, new C82515i(this));
        AbstractC88412b unused = selectSubscribe((EditFilterViewModel) this.f184521K.getValue(), C82528e.f184577a, new C20370ah(), new C82516j(this));
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final <VM1 extends JediViewModel<S1>, S1 extends AbstractC20368af, R> R withState(VM1 vm1, AbstractC89172b<? super S1, ? extends R> bVar) {
        C89219l.m154721d(vm1, "");
        C89219l.m154721d(bVar, "");
        return (R) AbstractC20382b.C20383a.m38593a(this, vm1, bVar);
    }

    @Override // com.bytedance.scene.AbstractC22219j
    /* renamed from: a */
    public final View mo22702a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C89219l.m154721d(layoutInflater, "");
        C89219l.m154721d(viewGroup, "");
        View a = C1764a.m5927a(layoutInflater, R.layout.asm, viewGroup, false);
        C89219l.m154716b(a, "");
        this.f184548x = a;
        if (a == null) {
            C89219l.m154710a("rootView");
        }
        return a;
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.progressbar.a.a$j */
    static final class C82516j extends AbstractC89220m implements AbstractC89183m<AbstractC20477i, C20391d<? extends FilterBean>, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C82506a f184565a;

        static {
            Covode.recordClassIndex(96360);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C82516j(C82506a aVar) {
            super(2);
            this.f184565a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20477i iVar, C20391d<? extends FilterBean> dVar) {
            C85581w.EnumC85611j jVar;
            AbstractC31071f d;
            C89219l.m154721d(iVar, "");
            C89219l.m154721d(dVar, "");
            AbstractC31071f d2 = this.f184565a.mo127600d();
            if (d2 != null) {
                jVar = d2.mo56356f();
            } else {
                jVar = null;
            }
            if (!(jVar == C85581w.EnumC85611j.STARTED || (d = this.f184565a.mo127600d()) == null)) {
                d.mo56392w();
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.progressbar.a.a$g */
    static final class C82513g extends AbstractC89220m implements AbstractC89183m<AbstractC20382b, C89391z, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C82506a f184562a;

        static {
            Covode.recordClassIndex(96357);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C82513g(C82506a aVar) {
            super(2);
            this.f184562a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20382b bVar, C89391z zVar) {
            C89219l.m154721d(bVar, "");
            C89219l.m154721d(zVar, "");
            if (!this.f184562a.f184543l) {
                if (this.f184562a.f184536e) {
                    C39162r.m79460a("click_edit_page_pause", new C84425b().mo129406a("creation_id", this.f184562a.mo127599b().creationId).mo129406a("content_source", C70968bl.m125262b(this.f184562a.mo127599b())).mo129406a("content_type", C70968bl.m125249a(this.f184562a.mo127599b())).mo129406a("shoot_way", this.f184562a.mo127599b().mShootWay).mo129403a("creation_duration", this.f184562a.mo127599b().getPreviewInfo().getPreviewVideoLength()).f188764a);
                }
                this.f184562a.mo127593C();
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.progressbar.a.a$f */
    static final class C82512f extends AbstractC89220m implements AbstractC89183m<AbstractC20382b, Integer, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C82506a f184561a;

        static {
            Covode.recordClassIndex(96356);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C82512f(C82506a aVar) {
            super(2);
            this.f184561a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20382b bVar, Integer num) {
            int i;
            String str;
            int i2;
            int intValue = num.intValue();
            C89219l.m154721d(bVar, "");
            if (!this.f184561a.f184543l && this.f184561a.f184539h != intValue) {
                Context context = this.f184561a.f184516E;
                if (context == null) {
                    C89219l.m154710a("context");
                }
                if (!C78099c.m136517a(context) || intValue == -1) {
                    if (intValue == -1) {
                        if (intValue == -1) {
                            C82506a aVar = this.f184561a;
                            AbstractC31071f d = aVar.mo127600d();
                            if (d != null) {
                                i = d.mo56370k();
                            } else {
                                i = 0;
                            }
                            aVar.f184546v = i;
                            C82506a aVar2 = this.f184561a;
                            if (aVar2.f184544t == 1) {
                                str = "back";
                            } else {
                                str = "forth";
                            }
                            aVar2.mo127598a(str, "press", this.f184561a.f184546v - this.f184561a.f184545u);
                        }
                        this.f184561a.f184539h = intValue;
                        this.f184561a.mo127597a(intValue, 0);
                    }
                } else if (intValue == 1) {
                    intValue = 0;
                } else {
                    intValue = 1;
                }
                this.f184561a.f184544t = intValue;
                C82506a aVar3 = this.f184561a;
                AbstractC31071f d2 = aVar3.mo127600d();
                if (d2 != null) {
                    i2 = d2.mo56370k();
                } else {
                    i2 = 0;
                }
                aVar3.f184545u = i2;
                this.f184561a.f184539h = intValue;
                this.f184561a.mo127597a(intValue, 0);
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.progressbar.a.a$h */
    static final class C82514h extends AbstractC89220m implements AbstractC89183m<AbstractC20382b, C89378p<? extends Integer, ? extends Integer>, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C82506a f184563a;

        static {
            Covode.recordClassIndex(96358);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C82514h(C82506a aVar) {
            super(2);
            this.f184563a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20382b bVar, C89378p<? extends Integer, ? extends Integer> pVar) {
            int intValue;
            Boolean bool;
            C89378p<? extends Integer, ? extends Integer> pVar2 = pVar;
            C89219l.m154721d(bVar, "");
            C89219l.m154721d(pVar2, "");
            C82506a aVar = this.f184563a;
            int intValue2 = ((Number) pVar2.getFirst()).intValue();
            if (intValue2 == 0) {
                aVar.f184535d = true;
            } else if (intValue2 == 1) {
                ImageView imageView = aVar.f184512A;
                if (imageView == null) {
                    C89219l.m154710a("statusImg");
                }
                imageView.setVisibility(8);
                TextView textView = aVar.f184518G;
                if (textView == null) {
                    C89219l.m154710a("longPressTips");
                }
                textView.setVisibility(8);
                View view = aVar.f184517F;
                if (view == null) {
                    C89219l.m154710a("mProgressTimeLayout");
                }
                view.setVisibility(8);
                aVar.mo127601d(0);
                aVar.f184536e = true;
            } else if (!(intValue2 != 2 || (intValue = ((Number) pVar2.getSecond()).intValue()) == 4 || intValue == 3 || intValue == 14 || intValue == 9)) {
                LiveData<Boolean> c = ((EditToolbarViewModel) aVar.f184534c.getValue()).mo128250c(intValue);
                if (c != null) {
                    bool = c.getValue();
                } else {
                    bool = null;
                }
                if (!C89219l.m154714a((Object) bool, (Object) false)) {
                    if (intValue != 5) {
                        if (intValue == 1) {
                        }
                        ImageView imageView2 = aVar.f184512A;
                        if (imageView2 == null) {
                            C89219l.m154710a("statusImg");
                        }
                        imageView2.setVisibility(8);
                        View view2 = aVar.f184517F;
                        if (view2 == null) {
                            C89219l.m154710a("mProgressTimeLayout");
                        }
                        view2.setVisibility(8);
                        aVar.mo127601d(0);
                        aVar.f184536e = true;
                    }
                    if (!aVar.f184536e) {
                        aVar.mo127593C();
                    }
                }
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: a */
    public final void mo127597a(int i, int i2) {
        int i3;
        int i4;
        int i5;
        TextView textView = this.f184518G;
        if (textView == null) {
            C89219l.m154710a("longPressTips");
        }
        textView.setVisibility(8);
        int i6 = 0;
        if (i == -1) {
            this.f184538g = false;
            ImageView imageView = this.f184528R;
            if (imageView == null) {
                C89219l.m154710a("mLongPressImg");
            }
            imageView.setVisibility(8);
            this.f184541j = -1;
            if (!this.f184536e) {
                View view = this.f184517F;
                if (view == null) {
                    C89219l.m154710a("mProgressTimeLayout");
                }
                view.setVisibility(0);
                ImageView imageView2 = this.f184512A;
                if (imageView2 == null) {
                    C89219l.m154710a("statusImg");
                }
                imageView2.setVisibility(0);
                return;
            }
            View view2 = this.f184517F;
            if (view2 == null) {
                C89219l.m154710a("mProgressTimeLayout");
            }
            view2.setVisibility(8);
            C1213t<C88296t> tVar = this.f184515D;
            if (tVar == null) {
                C89219l.m154710a("mPreviewControlOpLiveData");
            }
            tVar.setValue(C88296t.m153435a());
            return;
        }
        View view3 = this.f184517F;
        if (view3 == null) {
            C89219l.m154710a("mProgressTimeLayout");
        }
        view3.setVisibility(0);
        ImageView imageView3 = this.f184528R;
        if (imageView3 == null) {
            C89219l.m154710a("mLongPressImg");
        }
        imageView3.setVisibility(0);
        ImageView imageView4 = this.f184512A;
        if (imageView4 == null) {
            C89219l.m154710a("statusImg");
        }
        imageView4.setVisibility(8);
        ImageView imageView5 = this.f184528R;
        if (imageView5 == null) {
            C89219l.m154710a("mLongPressImg");
        }
        imageView5.setRotation(0.0f);
        if (i == 1) {
            ImageView imageView6 = this.f184528R;
            if (imageView6 == null) {
                C89219l.m154710a("mLongPressImg");
            }
            imageView6.setRotation(180.0f);
        }
        AbstractC31071f d = mo127600d();
        if (d != null) {
            if (this.f184541j == -1) {
                this.f184541j = d.mo56370k();
            }
            int j = d.mo56368j();
            if (i == 0) {
                int i7 = this.f184541j;
                if (j <= 15000) {
                    i5 = i2 * 2;
                } else {
                    i5 = i2 * 3;
                }
                i4 = i7 + i5;
            } else {
                int i8 = this.f184541j;
                if (j <= 15000) {
                    i3 = i2 * 2;
                } else {
                    i3 = i2 * 3;
                }
                i4 = i8 - i3;
            }
            if (i4 >= 0 && i4 <= j) {
                i6 = i4;
            }
            this.f184541j = i6;
            C1213t<C88296t> tVar2 = this.f184515D;
            if (tVar2 == null) {
                C89219l.m154710a("mPreviewControlOpLiveData");
            }
            tVar2.setValue(C88296t.m153436a((long) i6));
            C1213t<C88296t> tVar3 = this.f184515D;
            if (tVar3 == null) {
                C89219l.m154710a("mPreviewControlOpLiveData");
            }
            tVar3.setValue(C88296t.m153437b());
            this.f184538g = true;
        }
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final <S extends AbstractC20368af> AbstractC88412b subscribe(JediViewModel<S> jediViewModel, C20370ah<S> ahVar, AbstractC89183m<? super AbstractC20477i, ? super S, C89391z> mVar) {
        C89219l.m154721d(jediViewModel, "");
        C89219l.m154721d(ahVar, "");
        C89219l.m154721d(mVar, "");
        return AbstractC20382b.C20383a.m38583a(this, jediViewModel, ahVar, mVar);
    }

    /* renamed from: a */
    public final void mo127598a(String str, String str2, int i) {
        C39162r.m79460a("drag_edit_page_progress", new C84425b().mo129406a("creation_id", mo127599b().creationId).mo129406a("content_source", C70968bl.m125262b(mo127599b())).mo129406a("content_type", C70968bl.m125249a(mo127599b())).mo129406a("direction", str).mo129403a("drag_time", Math.abs(i)).mo129403a("is_pause", !this.f184536e ? 1 : 0).mo129406a("enter_method", str2).mo129406a("shoot_way", mo127599b().mShootWay).mo129403a("creation_duration", mo127599b().getPreviewInfo().getPreviewVideoLength()).f188764a);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20382b
    public final <S extends AbstractC20368af, A> void selectNonNullSubscribe(JediViewModel<S> jediViewModel, AbstractC89290k<S, ? extends A> kVar, C20370ah<C20373ak<A>> ahVar, AbstractC89183m<? super AbstractC20382b, ? super A, C89391z> mVar) {
        C89219l.m154721d(jediViewModel, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(ahVar, "");
        C89219l.m154721d(mVar, "");
        AbstractC20382b.C20383a.m38599a(this, jediViewModel, kVar, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final <S extends AbstractC20368af, A> AbstractC88412b selectSubscribe(JediViewModel<S> jediViewModel, AbstractC89290k<S, ? extends A> kVar, C20370ah<C20373ak<A>> ahVar, AbstractC89183m<? super AbstractC20477i, ? super A, C89391z> mVar) {
        C89219l.m154721d(jediViewModel, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(ahVar, "");
        C89219l.m154721d(mVar, "");
        return AbstractC20382b.C20383a.m38606d(this, jediViewModel, kVar, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20382b
    public final <S extends AbstractC20368af, A> void subscribeEvent(JediViewModel<S> jediViewModel, AbstractC89290k<S, ? extends C20391d<? extends A>> kVar, C20370ah<C20373ak<C20391d<A>>> ahVar, AbstractC89183m<? super AbstractC20382b, ? super A, C89391z> mVar) {
        C89219l.m154721d(jediViewModel, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(ahVar, "");
        C89219l.m154721d(mVar, "");
        AbstractC20382b.C20383a.m38602b(this, jediViewModel, kVar, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20382b
    public final <S extends AbstractC20368af, A> void subscribeMultiEvent(JediViewModel<S> jediViewModel, AbstractC89290k<S, ? extends C20365ac<? extends A>> kVar, C20370ah<C20373ak<C20365ac<A>>> ahVar, AbstractC89183m<? super AbstractC20382b, ? super A, C89391z> mVar) {
        C89219l.m154721d(jediViewModel, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(ahVar, "");
        C89219l.m154721d(mVar, "");
        AbstractC20382b.C20383a.m38605c(this, jediViewModel, kVar, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final <S extends AbstractC20368af, A, B> AbstractC88412b selectSubscribe(JediViewModel<S> jediViewModel, AbstractC89290k<S, ? extends A> kVar, AbstractC89290k<S, ? extends B> kVar2, C20370ah<C20374al<A, B>> ahVar, AbstractC89187q<? super AbstractC20477i, ? super A, ? super B, C89391z> qVar) {
        C89219l.m154721d(jediViewModel, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(kVar2, "");
        C89219l.m154721d(ahVar, "");
        C89219l.m154721d(qVar, "");
        return AbstractC20382b.C20383a.m38585a(this, jediViewModel, kVar, kVar2, ahVar, qVar);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final <S extends AbstractC20368af, T> AbstractC88412b asyncSubscribe(JediViewModel<S> jediViewModel, AbstractC89290k<S, ? extends AbstractC20362a<? extends T>> kVar, C20370ah<C20373ak<AbstractC20362a<T>>> ahVar, AbstractC89183m<? super AbstractC20477i, ? super Throwable, C89391z> mVar, AbstractC89172b<? super AbstractC20477i, C89391z> bVar, AbstractC89183m<? super AbstractC20477i, ? super T, C89391z> mVar2) {
        C89219l.m154721d(jediViewModel, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(ahVar, "");
        return AbstractC20382b.C20383a.m38584a(this, jediViewModel, kVar, ahVar, mVar, bVar, mVar2);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final <S extends AbstractC20368af, A, B, C> AbstractC88412b selectSubscribe(JediViewModel<S> jediViewModel, AbstractC89290k<S, ? extends A> kVar, AbstractC89290k<S, ? extends B> kVar2, AbstractC89290k<S, ? extends C> kVar3, C20370ah<C20375am<A, B, C>> ahVar, AbstractC89188r<? super AbstractC20477i, ? super A, ? super B, ? super C, C89391z> rVar) {
        C89219l.m154721d(jediViewModel, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(kVar2, "");
        C89219l.m154721d(kVar3, "");
        C89219l.m154721d(ahVar, "");
        C89219l.m154721d(rVar, "");
        return AbstractC20382b.C20383a.m38586a(this, jediViewModel, kVar, kVar2, kVar3, ahVar, rVar);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final <S extends AbstractC20368af, A, B, C, D> AbstractC88412b selectSubscribe(JediViewModel<S> jediViewModel, AbstractC89290k<S, ? extends A> kVar, AbstractC89290k<S, ? extends B> kVar2, AbstractC89290k<S, ? extends C> kVar3, AbstractC89290k<S, ? extends D> kVar4, C20370ah<C20376an<A, B, C, D>> ahVar, AbstractC89189s<? super AbstractC20477i, ? super A, ? super B, ? super C, ? super D, C89391z> sVar) {
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
