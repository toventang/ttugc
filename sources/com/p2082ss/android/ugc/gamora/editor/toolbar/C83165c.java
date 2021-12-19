package com.p2082ss.android.ugc.gamora.editor.toolbar;

import android.app.Activity;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.AbstractC1214u;
import androidx.lifecycle.C1171ab;
import androidx.lifecycle.C1175ad;
import com.C1764a;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.dialog.C17197a;
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
import com.bytedance.p1559o.p1561b.C21572a;
import com.bytedance.provider.p1587vm.ScopeViewModel;
import com.bytedance.scene.AbstractC22219j;
import com.bytedance.scene.group.AbstractC22186b;
import com.facebook.drawee.view.SimpleDraweeView;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.aweme.property.C65335ae;
import com.p2082ss.android.ugc.aweme.property.C65350at;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.C70976bp;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.C71393k;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p2082ss.android.ugc.aweme.shortvideo.preview.AbstractC72510a;
import com.p2082ss.android.ugc.aweme.shortvideo.util.C73991bj;
import com.p2082ss.android.ugc.aweme.shoutouts.C74418d;
import com.p2082ss.android.ugc.aweme.shoutouts.C74428i;
import com.p2082ss.android.ugc.aweme.themechange.base.AVDmtTextView;
import com.p2082ss.android.ugc.aweme.tools.C78099c;
import com.p2082ss.android.ugc.aweme.views.AbstractView$OnClickListenerC81432d;
import com.p2082ss.android.ugc.gamora.editor.C83395y;
import com.p2082ss.android.ugc.gamora.editor.music.AbstractC82427a;
import com.p2082ss.android.ugc.gamora.editor.p4277d.C82145a;
import com.p2082ss.android.ugc.gamora.editor.progress.AbstractC82478a;
import com.p2082ss.android.ugc.gamora.editor.progressbar.AbstractC82503a;
import com.p2082ss.android.ugc.tools.p4344f.C84425b;
import com.p2082ss.android.ugc.trill.R;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.EnumC89331m;
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

/* renamed from: com.ss.android.ugc.gamora.editor.toolbar.c */
public final class C83165c extends AbstractC22219j implements AbstractC20382b, AbstractC21566a {

    /* renamed from: a */
    static final /* synthetic */ AbstractC89286i[] f185833a = {new C89232y(C83165c.class, "mModel", "getMModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0), new C89232y(C83165c.class, "editMusicApi", "getEditMusicApi()Lcom/ss/android/ugc/gamora/editor/music/EditMusicApi;", 0)};

    /* renamed from: k */
    public static final C83171f f185834k = new C83171f((byte) 0);

    /* renamed from: b */
    final AbstractC89244h f185835b = C89250i.m154774a(EnumC89331m.NONE, new C83168c(this));

    /* renamed from: c */
    public FrameLayout f185836c;

    /* renamed from: d */
    public RelativeLayout f185837d;

    /* renamed from: e */
    public View f185838e;

    /* renamed from: f */
    SeekBarHelpLinearLayout f185839f;

    /* renamed from: g */
    public EditProcessBarView f185840g;

    /* renamed from: h */
    public final Map<Integer, View> f185841h = new LinkedHashMap();

    /* renamed from: i */
    C83234t f185842i;

    /* renamed from: j */
    final AbstractC89248d f185843j = new C83170e(this, this);

    /* renamed from: l */
    private final AbstractC89244h f185844l;

    /* renamed from: t */
    private final AbstractC89248d f185845t = C21572a.m40504a(getDiContainer(), VideoPublishEditModel.class);

    /* renamed from: u */
    private final AbstractC89244h f185846u = C89250i.m154774a(EnumC89331m.NONE, new C83166a(this));

    /* renamed from: v */
    private final AbstractC89244h f185847v = C89250i.m154774a(EnumC89331m.NONE, new C83169d(this));

    /* renamed from: w */
    private final boolean f185848w = C65350at.m117036a();

    /* renamed from: x */
    private final C21582f f185849x;

    static {
        Covode.recordClassIndex(97049);
    }

    /* renamed from: C */
    public final AbstractC82503a mo128291C() {
        return (AbstractC82503a) this.f185847v.getValue();
    }

    /* renamed from: a */
    public final EditToolbarViewModel mo128293a() {
        return (EditToolbarViewModel) this.f185844l.getValue();
    }

    /* renamed from: b */
    public final VideoPublishEditModel mo128294b() {
        return (VideoPublishEditModel) this.f185845t.mo23374a(this, f185833a[0]);
    }

    /* renamed from: d */
    public final AbstractC72510a mo128295d() {
        return (AbstractC72510a) this.f185846u.getValue();
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final boolean getUniqueOnlyGlobal() {
        return true;
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.toolbar.c$f */
    public static final class C83171f {
        static {
            Covode.recordClassIndex(97055);
        }

        private C83171f() {
        }

        public /* synthetic */ C83171f(byte b) {
            this();
        }
    }

    @Override // com.bytedance.p1559o.AbstractC21566a
    public final C21582f getDiContainer() {
        return this.f185849x;
    }

    /* Return type fixed from 'com.bytedance.jedi.arch.g' to match base method */
    @Override // com.bytedance.jedi.arch.AbstractC20367ae
    public final /* bridge */ /* synthetic */ AbstractC20477i getReceiver() {
        return this;
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

    /* renamed from: com.ss.android.ugc.gamora.editor.toolbar.c$a */
    public static final class C83166a extends AbstractC89220m implements AbstractC89171a<AbstractC72510a> {

        /* renamed from: a */
        final /* synthetic */ AbstractC21566a f185850a;

        static {
            Covode.recordClassIndex(97050);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C83166a(AbstractC21566a aVar) {
            super(0);
            this.f185850a = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.bytedance.als.b, com.ss.android.ugc.aweme.shortvideo.preview.a] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.p2082ss.android.ugc.aweme.shortvideo.preview.AbstractC72510a invoke() {
            /*
                r3 = this;
                com.bytedance.o.a r0 = r3.f185850a
                com.bytedance.o.f r2 = r0.getDiContainer()
                java.lang.Class<com.ss.android.ugc.aweme.shortvideo.preview.a> r1 = com.p2082ss.android.ugc.aweme.shortvideo.preview.AbstractC72510a.class
                r0 = 0
                java.lang.Object r0 = r2.mo35249a(r1, r0)
                com.bytedance.als.b r0 = (com.bytedance.als.AbstractC2547b) r0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.gamora.editor.toolbar.C83165c.C83166a.invoke():com.bytedance.als.b");
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.toolbar.c$c */
    public static final class C83168c extends AbstractC89220m implements AbstractC89171a<AbstractC82478a> {

        /* renamed from: a */
        final /* synthetic */ AbstractC21566a f185854a;

        static {
            Covode.recordClassIndex(97052);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C83168c(AbstractC21566a aVar) {
            super(0);
            this.f185854a = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.ss.android.ugc.gamora.editor.progress.a, com.bytedance.als.b] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.p2082ss.android.ugc.gamora.editor.progress.AbstractC82478a invoke() {
            /*
                r3 = this;
                com.bytedance.o.a r0 = r3.f185854a
                com.bytedance.o.f r2 = r0.getDiContainer()
                java.lang.Class<com.ss.android.ugc.gamora.editor.progress.a> r1 = com.p2082ss.android.ugc.gamora.editor.progress.AbstractC82478a.class
                r0 = 0
                java.lang.Object r0 = r2.mo35252b(r1, r0)
                com.bytedance.als.b r0 = (com.bytedance.als.AbstractC2547b) r0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.gamora.editor.toolbar.C83165c.C83168c.invoke():com.bytedance.als.b");
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.toolbar.c$d */
    public static final class C83169d extends AbstractC89220m implements AbstractC89171a<AbstractC82503a> {

        /* renamed from: a */
        final /* synthetic */ AbstractC21566a f185855a;

        static {
            Covode.recordClassIndex(97053);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C83169d(AbstractC21566a aVar) {
            super(0);
            this.f185855a = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.bytedance.als.b, com.ss.android.ugc.gamora.editor.progressbar.a] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.p2082ss.android.ugc.gamora.editor.progressbar.AbstractC82503a invoke() {
            /*
                r3 = this;
                com.bytedance.o.a r0 = r3.f185855a
                com.bytedance.o.f r2 = r0.getDiContainer()
                java.lang.Class<com.ss.android.ugc.gamora.editor.progressbar.a> r1 = com.p2082ss.android.ugc.gamora.editor.progressbar.AbstractC82503a.class
                r0 = 0
                java.lang.Object r0 = r2.mo35252b(r1, r0)
                com.bytedance.als.b r0 = (com.bytedance.als.AbstractC2547b) r0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.gamora.editor.toolbar.C83165c.C83169d.invoke():com.bytedance.als.b");
        }
    }

    /* renamed from: D */
    public final boolean mo128292D() {
        if (mo128294b().mShoutOutsData == null || !C89219l.m154714a((Object) C74418d.MODE_SEND, (Object) mo128294b().mShoutOutsData.getShoutOutsMode())) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.scene.AbstractC22219j
    /* renamed from: n_ */
    public final void mo22713n_() {
        super.mo22713n_();
        C83234t tVar = this.f185842i;
        if (tVar != null) {
            tVar.mo128312a();
        }
        EditProcessBarView editProcessBarView = this.f185840g;
        if (editProcessBarView != null) {
            editProcessBarView.f185698d.cancel();
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.toolbar.c$b */
    public static final class C83167b extends AbstractC89220m implements AbstractC89171a<EditToolbarViewModel> {

        /* renamed from: a */
        final /* synthetic */ AbstractC22219j f185851a;

        /* renamed from: b */
        final /* synthetic */ AbstractC89277c f185852b;

        /* renamed from: c */
        final /* synthetic */ AbstractC89277c f185853c;

        static {
            Covode.recordClassIndex(97051);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C83167b(AbstractC22219j jVar, AbstractC89277c cVar, AbstractC89277c cVar2) {
            super(0);
            this.f185851a = jVar;
            this.f185852b = cVar;
            this.f185853c = cVar2;
        }

        /* JADX WARN: Type inference failed for: r0v8, types: [com.ss.android.ugc.gamora.editor.toolbar.EditToolbarViewModel, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARN: Type inference failed for: r0v15, types: [com.ss.android.ugc.gamora.editor.toolbar.EditToolbarViewModel, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARNING: Unknown variable types count: 2 */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.p2082ss.android.ugc.gamora.editor.toolbar.EditToolbarViewModel invoke() {
            /*
                r6 = this;
                com.bytedance.scene.j r0 = r6.f185851a
                com.bytedance.scene.j r5 = r0.f52551o
                h.k.c r0 = r6.f185853c
                java.lang.Class r0 = p4600h.p4611f.C89170a.m154665a(r0)
                java.lang.String r3 = r0.getCanonicalName()
                java.lang.String r4 = ""
                p4600h.p4611f.p4613b.C89219l.m154716b(r3, r4)
            L_0x0013:
                if (r5 == 0) goto L_0x003a
                androidx.lifecycle.ad$b r0 = com.bytedance.jedi.arch.C20392e.f48284a     // Catch:{ as -> 0x0035 }
                androidx.lifecycle.ad r2 = com.bytedance.scene.C22267s.m41934a(r5, r0)     // Catch:{ as -> 0x0035 }
                h.k.c r0 = r6.f185853c     // Catch:{ as -> 0x0035 }
                java.lang.Class r0 = p4600h.p4611f.C89170a.m154665a(r0)     // Catch:{ as -> 0x0035 }
                java.lang.String r1 = r0.getCanonicalName()     // Catch:{ as -> 0x0035 }
                p4600h.p4611f.p4613b.C89219l.m154716b(r1, r4)     // Catch:{ as -> 0x0035 }
                h.k.c r0 = r6.f185852b     // Catch:{ as -> 0x0035 }
                java.lang.Class r0 = p4600h.p4611f.C89170a.m154665a(r0)     // Catch:{ as -> 0x0035 }
                androidx.lifecycle.ac r0 = m143586xf6e940c0(r2, r1, r0)     // Catch:{ as -> 0x0035 }
                com.bytedance.jedi.arch.JediViewModel r0 = (com.bytedance.jedi.arch.JediViewModel) r0     // Catch:{ as -> 0x0035 }
                goto L_0x0038
            L_0x0035:
                com.bytedance.scene.j r5 = r5.f52551o
                goto L_0x0013
            L_0x0038:
                if (r0 != 0) goto L_0x0052
            L_0x003a:
                com.bytedance.scene.j r0 = r6.f185851a
                androidx.fragment.app.e r1 = com.bytedance.scene.ktx.C22228c.m41832b(r0)
                androidx.lifecycle.ad$b r0 = com.bytedance.jedi.arch.C20392e.f48284a
                androidx.lifecycle.ad r1 = androidx.lifecycle.C1181ae.m3881a(r1, r0)
                h.k.c r0 = r6.f185852b
                java.lang.Class r0 = p4600h.p4611f.C89170a.m154665a(r0)
                androidx.lifecycle.ac r0 = m143586xf6e940c0(r1, r3, r0)
                com.bytedance.jedi.arch.JediViewModel r0 = (com.bytedance.jedi.arch.JediViewModel) r0
            L_0x0052:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.gamora.editor.toolbar.C83165c.C83167b.invoke():com.bytedance.jedi.arch.JediViewModel");
        }

        /* renamed from: com_ss_android_ugc_gamora_editor_toolbar_EditBottomBarScene$$special$$inlined$hostViewModel$1_androidx_lifecycle_VScopeLancet_get */
        public static AbstractC1174ac m143586xf6e940c0(C1175ad adVar, String str, Class cls) {
            if (cls.equals(ScopeViewModel.class)) {
                return adVar.mo3984a(str, cls);
            }
            AbstractC1174ac a = adVar.mo3984a(str, cls);
            C1171ab.m3870a(a, adVar);
            return a;
        }
    }

    @Override // com.bytedance.scene.AbstractC22219j
    /* renamed from: e */
    public final void mo36416e(Bundle bundle) {
        super.mo36416e(bundle);
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.toolbar.c$n */
    public static final class C83179n extends AbstractView$OnClickListenerC81432d {

        /* renamed from: a */
        final /* synthetic */ C83165c f185867a;

        static {
            Covode.recordClassIndex(97063);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C83179n(C83165c cVar) {
            super(600);
            this.f185867a = cVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.views.AbstractView$OnClickListenerC81432d
        /* renamed from: a */
        public final void mo77200a(View view) {
            String str;
            this.f185867a.mo128295d().mo114787L();
            AbstractC82478a aVar = (AbstractC82478a) this.f185867a.f185835b.getValue();
            if (aVar != null) {
                aVar.mo127562a(-1);
            }
            AbstractC82503a C = this.f185867a.mo128291C();
            if (C != null) {
                C.mo127587a(0, -1);
            }
            if (this.f185867a.mo128292D()) {
                C83165c cVar = this.f185867a;
                if (cVar.f52549m != null) {
                    Activity activity = cVar.f52549m;
                    if (activity == null) {
                        C89219l.m154715b();
                    }
                    C89219l.m154716b(activity, "");
                    if (!activity.isFinishing()) {
                        C17197a.C17200a aVar2 = new C17197a.C17200a(cVar.f52549m);
                        C17197a.C17200a a = aVar2.mo27189a(R.string.g83);
                        String string = cVar.mo36486t().getResources().getString(R.string.g82);
                        C89219l.m154716b(string, "");
                        Object[] objArr = new Object[1];
                        C74428i shoutOutSettingsModel = AVExternalServiceImpl.m113114a().shoutOutsService().getShoutOutSettingsModel();
                        if (!TextUtils.isEmpty(shoutOutSettingsModel.f167375a)) {
                            str = shoutOutSettingsModel.f167375a;
                            if (str == null) {
                                C89219l.m154715b();
                            }
                        } else {
                            str = "24";
                        }
                        objArr[0] = str;
                        String a2 = C1764a.m5928a(string, Arrays.copyOf(objArr, 1));
                        C89219l.m154716b(a2, "");
                        a.f41071b = a2;
                        a.mo27190a(R.string.bx, (DialogInterface.OnClickListener) new DialogInterface$OnClickListenerC83180o(cVar), false);
                        aVar2.mo27193a().mo27185c();
                        C84425b bVar = new C84425b();
                        if (cVar.mo128294b().isShoutout()) {
                            bVar.mo129406a("enter_from", "video_edit_page");
                            bVar.mo129403a("reviewed", cVar.mo128294b().mShoutOutsData.getReviewed());
                            if (!TextUtils.isEmpty(cVar.mo128294b().mShoutOutsData.getOrderId())) {
                                bVar.mo129406a(C74418d.MOD_ORDER_ID, cVar.mo128294b().mShoutOutsData.getOrderId());
                            }
                        }
                        C39162r.m79460a("show_submitting_thanks_pop_up", bVar.f188764a);
                        return;
                    }
                    return;
                }
                return;
            }
            C73991bj.m130128a("VEVideoPublishEditActivity nextStep OnClick");
            this.f185867a.mo128295d().mo114789N();
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ RelativeLayout m143574a(C83165c cVar) {
        RelativeLayout relativeLayout = cVar.f185837d;
        if (relativeLayout == null) {
            C89219l.m154710a("bottomLayout");
        }
        return relativeLayout;
    }

    /* renamed from: b */
    public static final /* synthetic */ FrameLayout m143575b(C83165c cVar) {
        FrameLayout frameLayout = cVar.f185836c;
        if (frameLayout == null) {
            C89219l.m154710a("bottomBarRootLayout");
        }
        return frameLayout;
    }

    @Override // com.bytedance.jedi.arch.AbstractC20382b
    public final <VM1 extends JediViewModel<S1>, S1 extends AbstractC20368af> S1 getState(VM1 vm1) {
        C89219l.m154721d(vm1, "");
        return (S1) AbstractC20382b.C20383a.m38582a(this, vm1);
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.toolbar.c$l */
    static final class C83177l<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ C83165c f185865a;

        static {
            Covode.recordClassIndex(97061);
        }

        C83177l(C83165c cVar) {
            this.f185865a = cVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            int i;
            Boolean bool = (Boolean) obj;
            FrameLayout b = C83165c.m143575b(this.f185865a);
            C89219l.m154716b(bool, "");
            if (bool.booleanValue()) {
                i = 0;
            } else {
                i = 8;
            }
            b.setVisibility(i);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.toolbar.c$g */
    public static final class C83172g extends AbstractView$OnClickListenerC81432d {

        /* renamed from: a */
        final /* synthetic */ C71393k f185858a;

        /* renamed from: b */
        final /* synthetic */ C83395y f185859b;

        /* renamed from: c */
        final /* synthetic */ C83165c f185860c;

        static {
            Covode.recordClassIndex(97056);
        }

        @Override // com.p2082ss.android.ugc.aweme.views.AbstractView$OnClickListenerC81432d
        /* renamed from: a */
        public final void mo77200a(View view) {
            if (this.f185858a.mo112870b()) {
                this.f185860c.mo128293a().f185703b = true;
                this.f185858a.mo112869a();
            } else {
                this.f185860c.mo128293a().f185703b = false;
            }
            this.f185860c.mo128293a().mo128237a(this.f185859b.f186262a);
        }

        C83172g(C71393k kVar, C83395y yVar, C83165c cVar) {
            this.f185858a = kVar;
            this.f185859b = yVar;
            this.f185860c = cVar;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.toolbar.c$i */
    static final class C83174i<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ C83165c f185862a;

        static {
            Covode.recordClassIndex(97058);
        }

        C83174i(C83165c cVar) {
            this.f185862a = cVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            int i;
            Boolean bool = (Boolean) obj;
            if (bool != null) {
                View view = this.f185862a.f185838e;
                if (view == null) {
                    C89219l.m154710a("nextStep");
                }
                int i2 = 0;
                if (bool.booleanValue()) {
                    i = 0;
                } else {
                    i = 8;
                }
                view.setVisibility(i);
                EditProcessBarView editProcessBarView = this.f185862a.f185840g;
                if (editProcessBarView != null) {
                    if (!bool.booleanValue()) {
                        i2 = 8;
                    }
                    editProcessBarView.setVisibility(i2);
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.toolbar.c$m */
    static final class C83178m<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ C83165c f185866a;

        static {
            Covode.recordClassIndex(97062);
        }

        C83178m(C83165c cVar) {
            this.f185866a = cVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            int i;
            Boolean bool = (Boolean) obj;
            if (this.f185866a.f185836c != null) {
                FrameLayout b = C83165c.m143575b(this.f185866a);
                C89219l.m154716b(bool, "");
                if (bool.booleanValue()) {
                    i = 8;
                } else {
                    i = 0;
                }
                b.setVisibility(i);
            }
        }
    }

    public C83165c(C21582f fVar) {
        C89219l.m154721d(fVar, "");
        this.f185849x = fVar;
        AbstractC89277c a = C89204ab.m154669a(EditToolbarViewModel.class);
        this.f185844l = C89250i.m154773a((AbstractC89171a) new C83167b(this, a, a));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:82:0x0207, code lost:
        if (com.p2082ss.android.ugc.aweme.property.p3609a.C65330a.m117012a() != false) goto L_0x0209;
     */
    @Override // com.bytedance.scene.AbstractC22219j
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo22704a(android.os.Bundle r17) {
        /*
        // Method dump skipped, instructions count: 898
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.gamora.editor.toolbar.C83165c.mo22704a(android.os.Bundle):void");
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.toolbar.c$e */
    public static final class C83170e implements AbstractC89248d<Object, AbstractC82427a> {

        /* renamed from: a */
        final /* synthetic */ AbstractC21566a f185856a;

        /* renamed from: b */
        final /* synthetic */ C83165c f185857b;

        static {
            Covode.recordClassIndex(97054);
        }

        public C83170e(AbstractC21566a aVar, C83165c cVar) {
            this.f185856a = aVar;
            this.f185857b = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4616h.AbstractC89248d
        /* renamed from: a */
        public final /* synthetic */ AbstractC82427a mo23374a(Object obj, AbstractC89286i iVar) {
            C89219l.m154721d(obj, "");
            C89219l.m154721d(iVar, "");
            Object b = this.f185856a.getDiContainer().mo35252b(AbstractC82427a.class, null);
            if (C70976bp.m125316l(this.f185857b.mo128294b())) {
                return b;
            }
            return null;
        }
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final <VM1 extends JediViewModel<S1>, S1 extends AbstractC20368af, R> R withState(VM1 vm1, AbstractC89172b<? super S1, ? extends R> bVar) {
        C89219l.m154721d(vm1, "");
        C89219l.m154721d(bVar, "");
        return (R) AbstractC20382b.C20383a.m38593a(this, vm1, bVar);
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.toolbar.c$k */
    static final class C83176k extends AbstractC89220m implements AbstractC89183m<AbstractC20382b, Integer, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C83165c f185864a;

        static {
            Covode.recordClassIndex(97060);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C83176k(C83165c cVar) {
            super(2);
            this.f185864a = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20382b bVar, Integer num) {
            int intValue = num.intValue();
            C89219l.m154721d(bVar, "");
            ViewGroup.LayoutParams layoutParams = C83165c.m143574a(this.f185864a).getLayoutParams();
            if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
                layoutParams = null;
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            if (marginLayoutParams != null) {
                marginLayoutParams.height = intValue;
                C83165c.m143574a(this.f185864a).setLayoutParams(marginLayoutParams);
            }
            return C89391z.f203057a;
        }
    }

    @Override // com.bytedance.scene.AbstractC22219j
    /* renamed from: a */
    public final View mo22702a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C89219l.m154721d(layoutInflater, "");
        C89219l.m154721d(viewGroup, "");
        if (this.f52549m != null) {
            Activity activity = this.f52549m;
            if (activity == null) {
                C89219l.m154715b();
            }
            C89219l.m154716b(activity, "");
            if (C82145a.m142163a(activity)) {
                View a = C1764a.m5927a(layoutInflater, R.layout.as1, viewGroup, false);
                C89219l.m154716b(a, "");
                return a;
            }
        }
        View a2 = C1764a.m5927a(layoutInflater, R.layout.as0, viewGroup, false);
        C89219l.m154716b(a2, "");
        return a2;
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.toolbar.c$j */
    static final class C83175j extends AbstractC89220m implements AbstractC89183m<AbstractC20382b, Boolean, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C83165c f185863a;

        static {
            Covode.recordClassIndex(97059);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C83175j(C83165c cVar) {
            super(2);
            this.f185863a = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20382b bVar, Boolean bool) {
            boolean booleanValue = bool.booleanValue();
            C89219l.m154721d(bVar, "");
            if (booleanValue) {
                View view = this.f185863a.f185841h.get(11);
                if (view != null) {
                    Objects.requireNonNull(view, "null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.edit.EditToolBarItem");
                    ((C71393k) view).setIcon(2131232578);
                }
            } else {
                View view2 = this.f185863a.f185841h.get(11);
                if (view2 != null) {
                    Objects.requireNonNull(view2, "null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.edit.EditToolBarItem");
                    ((C71393k) view2).setIcon(2131232577);
                }
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.toolbar.c$o */
    static final class DialogInterface$OnClickListenerC83180o implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C83165c f185868a;

        static {
            Covode.recordClassIndex(97064);
        }

        DialogInterface$OnClickListenerC83180o(C83165c cVar) {
            this.f185868a = cVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            C73991bj.m130128a("VEVideoPublishEditActivity nextStep OnClick");
            this.f185868a.mo128295d().mo114789N();
            if (this.f185868a.mo128294b().isShoutout()) {
                C84425b bVar = new C84425b();
                bVar.mo129406a("enter_from", "video_edit_page");
                bVar.mo129403a("reviewed", this.f185868a.mo128294b().mShoutOutsData.getReviewed());
                if (!TextUtils.isEmpty(this.f185868a.mo128294b().mShoutOutsData.getOrderId())) {
                    bVar.mo129406a(C74418d.MOD_ORDER_ID, this.f185868a.mo128294b().mShoutOutsData.getOrderId());
                }
                C39162r.m79460a("submit_shoutouts_order_video", bVar.f188764a);
            }
        }
    }

    @Override // com.bytedance.scene.AbstractC22219j
    /* renamed from: a */
    public final void mo36473a(View view, Bundle bundle) {
        C89219l.m154721d(view, "");
        super.mo36473a(view, bundle);
        View c = mo36475c(R.id.dpf);
        C89219l.m154716b(c, "");
        this.f185836c = (FrameLayout) c;
        View c2 = mo36475c(R.id.c3e);
        C89219l.m154716b(c2, "");
        this.f185837d = (RelativeLayout) c2;
        View c3 = mo36475c(R.id.uf);
        C89219l.m154716b(c3, "");
        this.f185839f = (SeekBarHelpLinearLayout) c3;
        View c4 = mo36475c(R.id.csd);
        C89219l.m154716b(c4, "");
        this.f185838e = c4;
        EditProcessBarView editProcessBarView = (EditProcessBarView) mo36475c(R.id.d_6);
        this.f185840g = editProcessBarView;
        if (editProcessBarView == null) {
            C89219l.m154715b();
        }
        editProcessBarView.setVisibility(8);
        if (C65335ae.m117020e()) {
            SeekBarHelpLinearLayout seekBarHelpLinearLayout = this.f185839f;
            if (seekBarHelpLinearLayout == null) {
                C89219l.m154710a("bottomBarContainer");
            }
            seekBarHelpLinearLayout.setEditPreviewProgressApi(mo128291C());
        }
        View view2 = this.f185838e;
        if (view2 == null) {
            C89219l.m154710a("nextStep");
        }
        view2.setOnClickListener(new C83179n(this));
        if (this.f52549m != null) {
            Activity activity = this.f52549m;
            if (activity == null) {
                C89219l.m154715b();
            }
            C89219l.m154716b(activity, "");
            if (C82145a.m142163a(activity)) {
                Activity activity2 = this.f52549m;
                if (activity2 == null) {
                    C89219l.m154715b();
                }
                if (C78099c.m136517a(activity2)) {
                    View view3 = this.f185838e;
                    if (view3 == null) {
                        C89219l.m154710a("nextStep");
                    }
                    C89219l.m154716b(activity2, "");
                    view3.setBackground(activity2.getResources().getDrawable(R.drawable.e2));
                } else {
                    View view4 = this.f185838e;
                    if (view4 == null) {
                        C89219l.m154710a("nextStep");
                    }
                    C89219l.m154716b(activity2, "");
                    view4.setBackground(activity2.getResources().getDrawable(R.drawable.e1));
                }
            }
        }
        if (mo128292D() && this.f52549m != null) {
            Activity activity3 = this.f52549m;
            if (activity3 == null) {
                C89219l.m154715b();
            }
            C89219l.m154716b(activity3, "");
            if (!C82145a.m142163a(activity3)) {
                View view5 = this.f185838e;
                if (view5 == null) {
                    C89219l.m154710a("nextStep");
                }
                Objects.requireNonNull(view5, "null cannot be cast to non-null type android.widget.TextView");
                ((TextView) view5).setText(R.string.fvs);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.toolbar.c$h */
    static final class C83173h extends AbstractC89220m implements AbstractC89183m<AbstractC20382b, List<? extends C83395y>, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C83165c f185861a;

        static {
            Covode.recordClassIndex(97057);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C83173h(C83165c cVar) {
            super(2);
            this.f185861a = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20382b bVar, List<? extends C83395y> list) {
            HashMap<String, Integer> extraShareOptions;
            HashMap<String, Integer> extraShareOptions2;
            Integer num;
            List<? extends C83395y> list2 = list;
            C89219l.m154721d(bVar, "");
            C89219l.m154721d(list2, "");
            C83165c cVar = this.f185861a;
            SeekBarHelpLinearLayout seekBarHelpLinearLayout = cVar.f185839f;
            if (seekBarHelpLinearLayout == null) {
                C89219l.m154710a("bottomBarContainer");
            }
            seekBarHelpLinearLayout.removeAllViews();
            cVar.f185841h.clear();
            for (T t : list2) {
                Activity activity = cVar.f52549m;
                if (activity == null) {
                    C89219l.m154715b();
                }
                C89219l.m154716b(activity, "");
                C71393k a = C71393k.C71394a.m126095a(activity, t.f186264c, t.f186263b);
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                layoutParams.leftMargin = (int) C13628n.m24520b(cVar.mo36483q(), 4.0f);
                SeekBarHelpLinearLayout seekBarHelpLinearLayout2 = cVar.f185839f;
                if (seekBarHelpLinearLayout2 == null) {
                    C89219l.m154710a("bottomBarContainer");
                }
                seekBarHelpLinearLayout2.addView(a, layoutParams);
                cVar.f185841h.put(Integer.valueOf(t.f186262a), a);
                a.setOnClickListener(new C83172g(a, t, cVar));
                if (t.f186262a == 1 && (extraShareOptions = cVar.mo128294b().creativeFlowData.getExtraShareOptions()) != null && extraShareOptions.containsKey("tiktok_videokit_disable_music_selection") && (extraShareOptions2 = cVar.mo128294b().creativeFlowData.getExtraShareOptions()) != null && (num = extraShareOptions2.get("tiktok_videokit_disable_music_selection")) != null && num.intValue() == 1) {
                    cVar.mo128294b();
                    AVDmtTextView aVDmtTextView = a.f159981a;
                    if (aVDmtTextView == null) {
                        C89219l.m154710a("mToolTv");
                    }
                    aVDmtTextView.setAlpha(0.5f);
                    SimpleDraweeView simpleDraweeView = a.f159982b;
                    if (simpleDraweeView == null) {
                        C89219l.m154710a("mToolIv");
                    }
                    simpleDraweeView.setAlpha(0.5f);
                    a.setOnClickListener(new C71393k.C71395b(a));
                }
            }
            C83234t tVar = cVar.f185842i;
            if (tVar != null) {
                tVar.mo128312a();
            }
            Activity activity2 = cVar.f52549m;
            Objects.requireNonNull(activity2, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
            VideoPublishEditModel b = cVar.mo128294b();
            EditToolbarViewModel a2 = cVar.mo128293a();
            AbstractC22219j jVar = cVar.f52551o;
            Objects.requireNonNull(jVar, "null cannot be cast to non-null type com.bytedance.scene.group.GroupScene");
            C83234t tVar2 = new C83234t((ActivityC0945e) activity2, b, a2, (AbstractC22186b) jVar, (AbstractC82427a) cVar.f185843j.mo23374a(cVar, C83165c.f185833a[1]));
            tVar2.mo128315a(cVar.f185841h);
            tVar2.mo128319b(cVar.f185841h);
            tVar2.mo128321c(cVar.f185841h);
            tVar2.mo128316a(cVar.f185841h, 48);
            if (C70976bp.m125316l(cVar.mo128294b())) {
                cVar.mo128293a().f185702a.f184004c = C63244g.m114602a().mo73277e().getCombinedShootModeTipShown(true);
                tVar2.mo128313a(cVar.f185841h.get(1));
            }
            View view = cVar.f185841h.get(1);
            if (view != null) {
                Objects.requireNonNull(view, "null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.edit.EditToolBarItem");
                tVar2.mo128314a(cVar, (C71393k) view);
            }
            cVar.f185842i = tVar2;
            return C89391z.f203057a;
        }
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final <S extends AbstractC20368af> AbstractC88412b subscribe(JediViewModel<S> jediViewModel, C20370ah<S> ahVar, AbstractC89183m<? super AbstractC20477i, ? super S, C89391z> mVar) {
        C89219l.m154721d(jediViewModel, "");
        C89219l.m154721d(ahVar, "");
        C89219l.m154721d(mVar, "");
        return AbstractC20382b.C20383a.m38583a(this, jediViewModel, ahVar, mVar);
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
