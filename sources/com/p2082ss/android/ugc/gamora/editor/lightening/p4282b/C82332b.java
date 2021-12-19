package com.p2082ss.android.ugc.gamora.editor.lightening.p4282b;

import android.app.Activity;
import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.content.C0643b;
import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.C1171ab;
import androidx.lifecycle.C1175ad;
import com.C1764a;
import com.bytedance.als.AbstractC2565m;
import com.bytedance.als.C2560h;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.widget.util.C17301b;
import com.bytedance.ies.dmt.p1194ui.widget.util.C17303d;
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
import com.bytedance.scene.ktx.C22228c;
import com.bytedance.tux.p1721g.C23144b;
import com.p2082ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.aweme.property.C65350at;
import com.p2082ss.android.ugc.aweme.shortvideo.C69905c;
import com.p2082ss.android.ugc.aweme.shortvideo.C70005cr;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.C70968bl;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.C70976bp;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p2082ss.android.ugc.aweme.views.AbstractView$OnClickListenerC81432d;
import com.p2082ss.android.ugc.gamora.editor.music.AbstractC82427a;
import com.p2082ss.android.ugc.gamora.editor.toolbar.C83234t;
import com.p2082ss.android.ugc.gamora.editor.toolbar.EditToolbarViewModel;
import com.p2082ss.android.ugc.tools.utils.C84912r;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;
import java.util.LinkedHashMap;
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

/* renamed from: com.ss.android.ugc.gamora.editor.lightening.b.b */
public final class C82332b extends AbstractC22219j implements AbstractC20382b, AbstractC21566a {

    /* renamed from: a */
    static final /* synthetic */ AbstractC89286i[] f184175a = {new C89232y(C82332b.class, "mModel", "getMModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0)};

    /* renamed from: j */
    public static final C82335c f184176j = new C82335c((byte) 0);

    /* renamed from: b */
    public ImageView f184177b;

    /* renamed from: c */
    public View f184178c;

    /* renamed from: d */
    public TextView f184179d;

    /* renamed from: e */
    View f184180e;

    /* renamed from: f */
    View f184181f;

    /* renamed from: g */
    View f184182g;

    /* renamed from: h */
    public boolean f184183h;

    /* renamed from: i */
    public final C82331a f184184i;

    /* renamed from: k */
    private View f184185k;

    /* renamed from: l */
    private final AbstractC89248d f184186l = C21572a.m40504a(getDiContainer(), VideoPublishEditModel.class);

    /* renamed from: t */
    private final AbstractC89244h f184187t;

    /* renamed from: u */
    private final AbstractC89244h f184188u;

    /* renamed from: v */
    private C83234t f184189v;

    /* renamed from: w */
    private final Map<Integer, View> f184190w;

    /* renamed from: x */
    private final AbstractC89244h f184191x;

    /* renamed from: y */
    private final C21582f f184192y;

    static {
        Covode.recordClassIndex(96166);
    }

    /* renamed from: d */
    private final EditToolbarViewModel m142388d() {
        return (EditToolbarViewModel) this.f184187t.getValue();
    }

    /* renamed from: a */
    public final VideoPublishEditModel mo127452a() {
        return (VideoPublishEditModel) this.f184186l.mo23374a(this, f184175a[0]);
    }

    /* renamed from: b */
    public final boolean mo127453b() {
        return ((Boolean) this.f184191x.getValue()).booleanValue();
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final boolean getUniqueOnlyGlobal() {
        return true;
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.lightening.b.b$c */
    public static final class C82335c {
        static {
            Covode.recordClassIndex(96169);
        }

        private C82335c() {
        }

        public /* synthetic */ C82335c(byte b) {
            this();
        }
    }

    @Override // com.bytedance.p1559o.AbstractC21566a
    public final C21582f getDiContainer() {
        return this.f184192y;
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

    /* renamed from: com.ss.android.ugc.gamora.editor.lightening.b.b$b */
    public static final class C82334b extends AbstractC89220m implements AbstractC89171a<AbstractC82427a> {

        /* renamed from: a */
        final /* synthetic */ AbstractC21566a f184196a;

        static {
            Covode.recordClassIndex(96168);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C82334b(AbstractC21566a aVar) {
            super(0);
            this.f184196a = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.bytedance.als.b, com.ss.android.ugc.gamora.editor.music.a] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.p2082ss.android.ugc.gamora.editor.music.AbstractC82427a invoke() {
            /*
                r3 = this;
                com.bytedance.o.a r0 = r3.f184196a
                com.bytedance.o.f r2 = r0.getDiContainer()
                java.lang.Class<com.ss.android.ugc.gamora.editor.music.a> r1 = com.p2082ss.android.ugc.gamora.editor.music.AbstractC82427a.class
                r0 = 0
                java.lang.Object r0 = r2.mo35252b(r1, r0)
                com.bytedance.als.b r0 = (com.bytedance.als.AbstractC2547b) r0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.gamora.editor.lightening.p4282b.C82332b.C82334b.invoke():com.bytedance.als.b");
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.lightening.b.b$p */
    static final class RunnableC82349p implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C82332b f184211a;

        static {
            Covode.recordClassIndex(96183);
        }

        RunnableC82349p(C82332b bVar) {
            this.f184211a = bVar;
        }

        public final void run() {
            C82332b.m142385a(this.f184211a).requestFocus();
        }
    }

    @Override // com.bytedance.scene.AbstractC22219j
    /* renamed from: n_ */
    public final void mo22713n_() {
        super.mo22713n_();
        C83234t tVar = this.f184189v;
        if (tVar != null) {
            tVar.mo128312a();
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.lightening.b.b$d */
    static final class C82336d extends AbstractC89220m implements AbstractC89171a<Boolean> {

        /* renamed from: a */
        public static final C82336d f184197a = new C82336d();

        static {
            Covode.recordClassIndex(96170);
        }

        C82336d() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Boolean invoke() {
            return Boolean.valueOf(AVExternalServiceImpl.m113114a().configService().avsettingsConfig().enableNewMusicMarquee());
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.lightening.b.b$a */
    public static final class C82333a extends AbstractC89220m implements AbstractC89171a<EditToolbarViewModel> {

        /* renamed from: a */
        final /* synthetic */ AbstractC22219j f184193a;

        /* renamed from: b */
        final /* synthetic */ AbstractC89277c f184194b;

        /* renamed from: c */
        final /* synthetic */ AbstractC89277c f184195c;

        static {
            Covode.recordClassIndex(96167);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C82333a(AbstractC22219j jVar, AbstractC89277c cVar, AbstractC89277c cVar2) {
            super(0);
            this.f184193a = jVar;
            this.f184194b = cVar;
            this.f184195c = cVar2;
        }

        /* JADX WARN: Type inference failed for: r0v8, types: [com.ss.android.ugc.gamora.editor.toolbar.EditToolbarViewModel, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARN: Type inference failed for: r0v15, types: [com.ss.android.ugc.gamora.editor.toolbar.EditToolbarViewModel, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARNING: Unknown variable types count: 2 */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.p2082ss.android.ugc.gamora.editor.toolbar.EditToolbarViewModel invoke() {
            /*
                r6 = this;
                com.bytedance.scene.j r0 = r6.f184193a
                com.bytedance.scene.j r5 = r0.f52551o
                h.k.c r0 = r6.f184195c
                java.lang.Class r0 = p4600h.p4611f.C89170a.m154665a(r0)
                java.lang.String r3 = r0.getCanonicalName()
                java.lang.String r4 = ""
                p4600h.p4611f.p4613b.C89219l.m154716b(r3, r4)
            L_0x0013:
                if (r5 == 0) goto L_0x003a
                androidx.lifecycle.ad$b r0 = com.bytedance.jedi.arch.C20392e.f48284a     // Catch:{ as -> 0x0035 }
                androidx.lifecycle.ad r2 = com.bytedance.scene.C22267s.m41934a(r5, r0)     // Catch:{ as -> 0x0035 }
                h.k.c r0 = r6.f184195c     // Catch:{ as -> 0x0035 }
                java.lang.Class r0 = p4600h.p4611f.C89170a.m154665a(r0)     // Catch:{ as -> 0x0035 }
                java.lang.String r1 = r0.getCanonicalName()     // Catch:{ as -> 0x0035 }
                p4600h.p4611f.p4613b.C89219l.m154716b(r1, r4)     // Catch:{ as -> 0x0035 }
                h.k.c r0 = r6.f184194b     // Catch:{ as -> 0x0035 }
                java.lang.Class r0 = p4600h.p4611f.C89170a.m154665a(r0)     // Catch:{ as -> 0x0035 }
                androidx.lifecycle.ac r0 = m142395x962f96cb(r2, r1, r0)     // Catch:{ as -> 0x0035 }
                com.bytedance.jedi.arch.JediViewModel r0 = (com.bytedance.jedi.arch.JediViewModel) r0     // Catch:{ as -> 0x0035 }
                goto L_0x0038
            L_0x0035:
                com.bytedance.scene.j r5 = r5.f52551o
                goto L_0x0013
            L_0x0038:
                if (r0 != 0) goto L_0x0052
            L_0x003a:
                com.bytedance.scene.j r0 = r6.f184193a
                androidx.fragment.app.e r1 = com.bytedance.scene.ktx.C22228c.m41832b(r0)
                androidx.lifecycle.ad$b r0 = com.bytedance.jedi.arch.C20392e.f48284a
                androidx.lifecycle.ad r1 = androidx.lifecycle.C1181ae.m3881a(r1, r0)
                h.k.c r0 = r6.f184194b
                java.lang.Class r0 = p4600h.p4611f.C89170a.m154665a(r0)
                androidx.lifecycle.ac r0 = m142395x962f96cb(r1, r3, r0)
                com.bytedance.jedi.arch.JediViewModel r0 = (com.bytedance.jedi.arch.JediViewModel) r0
            L_0x0052:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.gamora.editor.lightening.p4282b.C82332b.C82333a.invoke():com.bytedance.jedi.arch.JediViewModel");
        }

        /* renamed from: com_ss_android_ugc_gamora_editor_lightening_music_LighteningChooseMusicScene$$special$$inlined$hostViewModel$1_androidx_lifecycle_VScopeLancet_get */
        public static AbstractC1174ac m142395x962f96cb(C1175ad adVar, String str, Class cls) {
            if (cls.equals(ScopeViewModel.class)) {
                return adVar.mo3984a(str, cls);
            }
            AbstractC1174ac a = adVar.mo3984a(str, cls);
            C1171ab.m3870a(a, adVar);
            return a;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.lightening.b.b$e */
    public static final class C82337e extends AbstractView$OnClickListenerC81432d {

        /* renamed from: a */
        final /* synthetic */ C82332b f184198a;

        static {
            Covode.recordClassIndex(96171);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C82337e(C82332b bVar) {
            super(600);
            this.f184198a = bVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.views.AbstractView$OnClickListenerC81432d
        /* renamed from: a */
        public final void mo77200a(View view) {
            AbstractC89171a<C89391z> aVar = this.f184198a.f184184i.f184173h;
            if (aVar == null) {
                C89219l.m154710a("openMusicPanel");
            }
            aVar.invoke();
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.lightening.b.b$f */
    public static final class C82338f extends AbstractView$OnClickListenerC81432d {

        /* renamed from: a */
        final /* synthetic */ C82332b f184199a;

        static {
            Covode.recordClassIndex(96172);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C82338f(C82332b bVar) {
            super(600);
            this.f184199a = bVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.views.AbstractView$OnClickListenerC81432d
        /* renamed from: a */
        public final void mo77200a(View view) {
            if (view != null) {
                new C23144b(view).mo37635a(this.f184199a.mo36486t().getResources().getText(R.string.few)).mo37634a(3000L).mo37637b();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.lightening.b.b$g */
    public static final class C82339g extends AbstractView$OnClickListenerC81432d {

        /* renamed from: a */
        final /* synthetic */ C82332b f184200a;

        static {
            Covode.recordClassIndex(96173);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C82339g(C82332b bVar) {
            super(600);
            this.f184200a = bVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.views.AbstractView$OnClickListenerC81432d
        /* renamed from: a */
        public final void mo77200a(View view) {
            String str;
            if (this.f184200a.mo127453b()) {
                VideoPublishEditModel a = this.f184200a.mo127452a();
                C69905c cVar = C70005cr.m123611a().f156482a;
                if (cVar == null || (str = cVar.getMusicId()) == null) {
                    str = "";
                }
                C89219l.m154716b(str, "");
                C70968bl.m125258a(a, str, "");
            }
            AbstractC89171a<C89391z> aVar = this.f184200a.f184184i.f184174i;
            if (aVar == null) {
                C89219l.m154710a("clearMusic");
            }
            aVar.invoke();
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.lightening.b.b$i */
    static final class C82341i<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C82332b f184202a;

        static {
            Covode.recordClassIndex(96175);
        }

        C82341i(C82332b bVar) {
            this.f184202a = bVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            C82332b.m142385a(this.f184202a).setText((String) obj);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.lightening.b.b$j */
    static final class C82342j<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C82332b f184203a;

        static {
            Covode.recordClassIndex(96176);
        }

        C82342j(C82332b bVar) {
            this.f184203a = bVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            final TextUtils.TruncateAt truncateAt = (TextUtils.TruncateAt) obj;
            C22228c.m41830a(this.f184203a, new Runnable(this) {
                /* class com.p2082ss.android.ugc.gamora.editor.lightening.p4282b.C82332b.C82342j.RunnableC823431 */

                /* renamed from: a */
                final /* synthetic */ C82342j f184204a;

                static {
                    Covode.recordClassIndex(96177);
                }

                {
                    this.f184204a = r1;
                }

                public final void run() {
                    C82332b.m142385a(this.f184204a.f184203a).clearFocus();
                    C82332b.m142385a(this.f184204a.f184203a).setEllipsize(truncateAt);
                }
            });
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ TextView m142385a(C82332b bVar) {
        TextView textView = bVar.f184179d;
        if (textView == null) {
            C89219l.m154710a("tvChooseMusic");
        }
        return textView;
    }

    /* renamed from: b */
    public static final /* synthetic */ ImageView m142386b(C82332b bVar) {
        ImageView imageView = bVar.f184177b;
        if (imageView == null) {
            C89219l.m154710a("ivChooseMusic");
        }
        return imageView;
    }

    /* renamed from: c */
    public static final /* synthetic */ View m142387c(C82332b bVar) {
        View view = bVar.f184178c;
        if (view == null) {
            C89219l.m154710a("ivLoadingMusic");
        }
        return view;
    }

    @Override // com.bytedance.jedi.arch.AbstractC20382b
    public final <VM1 extends JediViewModel<S1>, S1 extends AbstractC20368af> S1 getState(VM1 vm1) {
        C89219l.m154721d(vm1, "");
        return (S1) AbstractC20382b.C20383a.m38582a(this, vm1);
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.lightening.b.b$m */
    static final class C82346m<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C82332b f184208a;

        static {
            Covode.recordClassIndex(96180);
        }

        C82346m(C82332b bVar) {
            this.f184208a = bVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            Boolean bool = (Boolean) obj;
            C89219l.m154716b(bool, "");
            if (bool.booleanValue()) {
                C82332b.m142385a(this.f184208a).setVisibility(0);
            } else {
                C82332b.m142385a(this.f184208a).setVisibility(8);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.lightening.b.b$n */
    static final class C82347n<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C82332b f184209a;

        static {
            Covode.recordClassIndex(96181);
        }

        C82347n(C82332b bVar) {
            this.f184209a = bVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            Boolean bool = (Boolean) obj;
            C89219l.m154716b(bool, "");
            if (bool.booleanValue()) {
                C82332b.m142387c(this.f184209a).setVisibility(0);
                C82332b.m142386b(this.f184209a).setVisibility(8);
                return;
            }
            C82332b.m142387c(this.f184209a).clearAnimation();
            C82332b.m142387c(this.f184209a).setVisibility(8);
            C82332b.m142386b(this.f184209a).setVisibility(0);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.lightening.b.b$l */
    static final class C82345l<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C82332b f184207a;

        static {
            Covode.recordClassIndex(96179);
        }

        C82345l(C82332b bVar) {
            this.f184207a = bVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            Boolean bool = (Boolean) obj;
            C89219l.m154716b(bool, "");
            if (!bool.booleanValue() || this.f184207a.f184183h) {
                C82332b.m142386b(this.f184207a).setImageAlpha(127);
                C82332b.m142385a(this.f184207a).setAlpha(0.5f);
                return;
            }
            C82332b.m142386b(this.f184207a).setImageAlpha(255);
            C82332b.m142385a(this.f184207a).setAlpha(1.0f);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.lightening.b.b$o */
    static final class C82348o<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C82332b f184210a;

        static {
            Covode.recordClassIndex(96182);
        }

        C82348o(C82332b bVar) {
            this.f184210a = bVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            Boolean bool = (Boolean) obj;
            if (!this.f184210a.mo127453b()) {
                C89219l.m154716b(bool, "");
                if (bool.booleanValue()) {
                    if (C65350at.m117036a()) {
                        C82332b.m142386b(this.f184210a).setImageResource(2131232533);
                    } else {
                        C82332b.m142386b(this.f184210a).setImageResource(2131232531);
                    }
                } else if (C65350at.m117036a()) {
                    C82332b.m142386b(this.f184210a).setImageResource(2131232533);
                } else {
                    C82332b.m142386b(this.f184210a).setImageResource(2131232345);
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.lightening.b.b$k */
    static final class C82344k<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C82332b f184206a;

        static {
            Covode.recordClassIndex(96178);
        }

        C82344k(C82332b bVar) {
            this.f184206a = bVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            int i;
            int i2;
            float[] fArr;
            Boolean bool = (Boolean) obj;
            C82332b bVar = this.f184206a;
            C89219l.m154716b(bool, "");
            boolean booleanValue = bool.booleanValue();
            View view = bVar.f184180e;
            if (view == null) {
                C89219l.m154710a("deleteMusicUiView");
            }
            if (booleanValue) {
                i = 0;
            } else {
                i = 8;
            }
            view.setVisibility(i);
            View view2 = bVar.f184181f;
            if (view2 == null) {
                C89219l.m154710a("deleteMusicClickLayerView");
            }
            if (booleanValue) {
                i2 = 0;
            } else {
                i2 = 8;
            }
            view2.setVisibility(i2);
            View view3 = bVar.f184182g;
            if (view3 == null) {
                C89219l.m154710a("selectMusicPressLayerView");
            }
            Context u = bVar.mo36488u();
            C89219l.m154716b(u, "");
            boolean z = !booleanValue;
            C89219l.m154721d(u, "");
            float a = C84912r.m145930a(u, 24.0f);
            if (z) {
                fArr = new float[8];
                int i3 = 0;
                do {
                    fArr[i3] = a;
                    i3++;
                } while (i3 < 8);
            } else {
                fArr = new float[]{a, a, 0.0f, 0.0f, 0.0f, 0.0f, a, a};
            }
            int c = C0643b.m2378c(u, R.color.bl);
            GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, new int[]{c, c});
            gradientDrawable.setCornerRadii(fArr);
            StateListDrawable stateListDrawable = new StateListDrawable();
            stateListDrawable.addState(new int[]{16842919}, gradientDrawable);
            view3.setBackground(stateListDrawable);
        }
    }

    @Override // com.bytedance.scene.AbstractC22219j
    /* renamed from: a */
    public final void mo22704a(Bundle bundle) {
        super.mo22704a(bundle);
        selectNonNullSubscribe(m142388d(), C82350c.f184212a, new C20370ah(), new C82340h(this));
        C83234t tVar = this.f184189v;
        if (tVar != null) {
            tVar.mo128312a();
        }
        Map<Integer, View> map = this.f184190w;
        View view = this.f184185k;
        if (view == null) {
            C89219l.m154710a("chooseMusicContainer");
        }
        map.put(1, view);
        Activity activity = this.f52549m;
        Objects.requireNonNull(activity, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        VideoPublishEditModel a = mo127452a();
        EditToolbarViewModel d = m142388d();
        AbstractC22219j jVar = this.f52551o;
        Objects.requireNonNull(jVar, "null cannot be cast to non-null type com.bytedance.scene.group.GroupScene");
        C83234t tVar2 = new C83234t((ActivityC0945e) activity, a, d, (AbstractC22186b) jVar, (AbstractC82427a) this.f184188u.getValue());
        tVar2.mo128315a(this.f184190w);
        tVar2.mo128319b(this.f184190w);
        tVar2.mo128321c(this.f184190w);
        tVar2.mo128316a(this.f184190w, 48);
        if (C70976bp.m125316l(mo127452a())) {
            m142388d().f185702a.f184004c = C63244g.m114602a().mo73277e().getCombinedShootModeTipShown(true);
            tVar2.mo128313a(this.f184190w.get(1));
        }
        this.f184189v = tVar2;
        C2560h<String> hVar = this.f184184i.f184166a;
        if (hVar == null) {
            C89219l.m154710a("titleText");
        }
        hVar.mo7036a(this, new C82341i(this));
        C2560h<TextUtils.TruncateAt> hVar2 = this.f184184i.f184168c;
        if (hVar2 == null) {
            C89219l.m154710a("titleEllipsize");
        }
        hVar2.mo7036a(this, new C82342j(this));
        C2560h<Boolean> hVar3 = this.f184184i.f184169d;
        if (hVar3 == null) {
            C89219l.m154710a("deleteVisible");
        }
        hVar3.mo7036a(this, new C82344k(this));
        C2560h<Boolean> hVar4 = this.f184184i.f184170e;
        if (hVar4 == null) {
            C89219l.m154710a("titleEnabled");
        }
        hVar4.mo7036a(this, new C82345l(this));
        C2560h<Boolean> hVar5 = this.f184184i.f184167b;
        if (hVar5 == null) {
            C89219l.m154710a("titleVisible");
        }
        hVar5.mo7036a(this, new C82346m(this));
        C2560h<Boolean> hVar6 = this.f184184i.f184171f;
        if (hVar6 == null) {
            C89219l.m154710a("loadingVisible");
        }
        hVar6.mo7036a(this, new C82347n(this));
        C2560h<Boolean> hVar7 = this.f184184i.f184172g;
        if (hVar7 == null) {
            C89219l.m154710a("musicIconState");
        }
        hVar7.mo7036a(this, new C82348o(this));
        if (!this.f184183h) {
            View view2 = this.f184185k;
            if (view2 == null) {
                C89219l.m154710a("chooseMusicContainer");
            }
            view2.setOnClickListener(new C82337e(this));
        } else {
            View view3 = this.f184185k;
            if (view3 == null) {
                C89219l.m154710a("chooseMusicContainer");
            }
            view3.setOnClickListener(new C82338f(this));
        }
        View view4 = this.f184181f;
        if (view4 == null) {
            C89219l.m154710a("deleteMusicClickLayerView");
        }
        view4.setOnClickListener(new C82339g(this));
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
        View a = C1764a.m5927a(layoutInflater, R.layout.y_, viewGroup, false);
        C89219l.m154716b(a, "");
        return a;
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.lightening.b.b$h */
    static final class C82340h extends AbstractC89220m implements AbstractC89183m<AbstractC20382b, Integer, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C82332b f184201a;

        static {
            Covode.recordClassIndex(96174);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C82340h(C82332b bVar) {
            super(2);
            this.f184201a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20382b bVar, Integer num) {
            Integer num2 = num;
            C89219l.m154721d(bVar, "");
            if (num2 != null) {
                View view = this.f184201a.f52550n;
                C89219l.m154716b(view, "");
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
                    layoutParams = null;
                }
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                if (marginLayoutParams != null) {
                    marginLayoutParams.topMargin = num2.intValue();
                    View view2 = this.f184201a.f52550n;
                    C89219l.m154716b(view2, "");
                    view2.setLayoutParams(marginLayoutParams);
                }
            }
            return C89391z.f203057a;
        }
    }

    public C82332b(C21582f fVar, C82331a aVar) {
        C89219l.m154721d(fVar, "");
        C89219l.m154721d(aVar, "");
        this.f184192y = fVar;
        this.f184184i = aVar;
        AbstractC89277c a = C89204ab.m154669a(EditToolbarViewModel.class);
        this.f184187t = C89250i.m154773a((AbstractC89171a) new C82333a(this, a, a));
        this.f184188u = C89250i.m154774a(EnumC89331m.NONE, new C82334b(this));
        this.f184190w = new LinkedHashMap();
        this.f184191x = C89250i.m154773a((AbstractC89171a) C82336d.f184197a);
    }

    @Override // com.bytedance.scene.AbstractC22219j
    /* renamed from: a */
    public final void mo36473a(View view, Bundle bundle) {
        C89219l.m154721d(view, "");
        super.mo36473a(view, bundle);
        View c = mo36475c(R.id.dli);
        C89219l.m154716b(c, "");
        this.f184185k = c;
        View c2 = mo36475c(R.id.btx);
        C89219l.m154716b(c2, "");
        this.f184177b = (ImageView) c2;
        View c3 = mo36475c(R.id.etm);
        C89219l.m154716b(c3, "");
        this.f184179d = (TextView) c3;
        if (C65350at.m117036a()) {
            ImageView imageView = this.f184177b;
            if (imageView == null) {
                C89219l.m154710a("ivChooseMusic");
            }
            imageView.setImageResource(2131232533);
        } else {
            ImageView imageView2 = this.f184177b;
            if (imageView2 == null) {
                C89219l.m154710a("ivChooseMusic");
            }
            imageView2.setImageResource(2131232345);
        }
        HashMap<String, Integer> extraShareOptions = mo127452a().creativeFlowData.getExtraShareOptions();
        if (extraShareOptions != null && extraShareOptions.containsKey("tiktok_videokit_disable_music_selection")) {
            HashMap<String, Integer> extraShareOptions2 = mo127452a().creativeFlowData.getExtraShareOptions();
            if (extraShareOptions2 == null) {
                C89219l.m154715b();
            }
            Integer num = extraShareOptions2.get("tiktok_videokit_disable_music_selection");
            if (num != null && num.intValue() == 1) {
                this.f184183h = true;
            }
        }
        View c4 = mo36475c(R.id.fao);
        C89219l.m154716b(c4, "");
        this.f184180e = c4;
        View c5 = mo36475c(R.id.fap);
        C89219l.m154716b(c5, "");
        this.f184181f = c5;
        View c6 = mo36475c(R.id.fay);
        C89219l.m154716b(c6, "");
        this.f184182g = c6;
        View c7 = mo36475c(R.id.ars);
        C89219l.m154716b(c7, "");
        this.f184178c = c7;
        Typeface a = C17301b.m32033a().mo27611a(C17303d.f41573g);
        if (a != null) {
            TextView textView = this.f184179d;
            if (textView == null) {
                C89219l.m154710a("tvChooseMusic");
            }
            textView.setTypeface(a);
        }
        C22228c.m41830a(this, new RunnableC82349p(this));
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
