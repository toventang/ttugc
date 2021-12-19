package com.p2082ss.android.ugc.gamora.editor.toolbar;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.ActivityC0218d;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.C0643b;
import androidx.fragment.app.ActivityC0945e;
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
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.C16048b;
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
import com.bytedance.jedi.arch.C20523m;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.p1559o.AbstractC21566a;
import com.bytedance.p1559o.C21582f;
import com.bytedance.p1559o.p1561b.C21572a;
import com.bytedance.provider.p1587vm.ScopeViewModel;
import com.bytedance.scene.AbstractC22219j;
import com.bytedance.scene.group.AbstractC22186b;
import com.p2082ss.android.ugc.asve.editor.AbstractC31071f;
import com.p2082ss.android.ugc.aweme.canvas.C35369ac;
import com.p2082ss.android.ugc.aweme.canvas.C35405p;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.component.music.MusicService;
import com.p2082ss.android.ugc.aweme.experiment.C46787cd;
import com.p2082ss.android.ugc.aweme.initializer.AVServiceProxyImpl;
import com.p2082ss.android.ugc.aweme.music.model.Music;
import com.p2082ss.android.ugc.aweme.mvtheme.C61288d;
import com.p2082ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63218be;
import com.p2082ss.android.ugc.aweme.property.C65332ab;
import com.p2082ss.android.ugc.aweme.property.C65350at;
import com.p2082ss.android.ugc.aweme.property.C65393cf;
import com.p2082ss.android.ugc.aweme.services.IAVServiceProxy;
import com.p2082ss.android.ugc.aweme.setting.C68062ck;
import com.p2082ss.android.ugc.aweme.shortvideo.C69905c;
import com.p2082ss.android.ugc.aweme.shortvideo.C70005cr;
import com.p2082ss.android.ugc.aweme.shortvideo.C71817eu;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.AbstractC71396l;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.C70968bl;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.C70976bp;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.C71393k;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.C71397m;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.C71529w;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.p3809b.C70935a;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.p3809b.C70939d;
import com.p2082ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.p2082ss.android.ugc.aweme.shortvideo.preview.AbstractC72510a;
import com.p2082ss.android.ugc.aweme.utils.C80510gr;
import com.p2082ss.android.ugc.aweme.views.AbstractView$OnClickListenerC81432d;
import com.p2082ss.android.ugc.gamora.editor.AbstractC82036ac;
import com.p2082ss.android.ugc.gamora.editor.C83098t;
import com.p2082ss.android.ugc.gamora.editor.C83395y;
import com.p2082ss.android.ugc.gamora.editor.lightening.C82306a;
import com.p2082ss.android.ugc.gamora.editor.music.AbstractC82427a;
import com.p2082ss.android.ugc.gamora.editor.progressbar.AbstractC82503a;
import com.p2082ss.android.ugc.gamora.editor.toolbar.C83234t;
import com.p2082ss.android.ugc.tools.p4344f.C84425b;
import com.p2082ss.android.ugc.tools.utils.C84904k;
import com.p2082ss.android.ugc.trill.R;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Callable;
import p077b.AbstractC1729g;
import p077b.C1731i;
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

/* renamed from: com.ss.android.ugc.gamora.editor.toolbar.g */
public class C83184g extends AbstractC22186b implements AbstractC20382b, AbstractC21566a {

    /* renamed from: b */
    static final /* synthetic */ AbstractC89286i[] f185872b = {new C89232y(C83184g.class, "mModel", "getMModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0), new C89232y(C83184g.class, "editMusicApi", "getEditMusicApi()Lcom/ss/android/ugc/gamora/editor/music/EditMusicApi;", 0), new C89232y(C83184g.class, "musicController", "getMusicController()Lcom/ss/android/ugc/gamora/editor/IEditMusicController;", 0), new C89232y(C83184g.class, "editPreviewProgressApi", "getEditPreviewProgressApi()Lcom/ss/android/ugc/gamora/editor/progressbar/EditPreviewProgressApi;", 0)};

    /* renamed from: w */
    public static final C83188d f185873w = new C83188d((byte) 0);

    /* renamed from: A */
    private final AbstractC89248d f185874A = new C83187c(this, this);

    /* renamed from: B */
    private final AbstractC89244h f185875B = C89250i.m154774a(EnumC89331m.NONE, new C83185a(this));

    /* renamed from: C */
    private final AbstractC89248d f185876C = C21572a.m40505b(getDiContainer(), AbstractC82503a.class);

    /* renamed from: D */
    private View f185877D;

    /* renamed from: E */
    private final AbstractC89244h f185878E = C89250i.m154773a((AbstractC89171a) C83189e.f185903a);

    /* renamed from: F */
    private final boolean f185879F = C65350at.m117036a();

    /* renamed from: G */
    private final C21582f f185880G;

    /* renamed from: c */
    public ConstraintLayout f185881c;

    /* renamed from: d */
    protected ImageView f185882d;

    /* renamed from: e */
    public TextView f185883e;

    /* renamed from: f */
    public ViewGroup f185884f;

    /* renamed from: g */
    public final Map<Integer, View> f185885g = new LinkedHashMap();

    /* renamed from: h */
    public C71397m f185886h;

    /* renamed from: i */
    final AbstractC89248d f185887i = C21572a.m40504a(getDiContainer(), AbstractC82036ac.class);

    /* renamed from: j */
    public View f185888j;

    /* renamed from: k */
    public ImageView f185889k;

    /* renamed from: l */
    public TextView f185890l;

    /* renamed from: t */
    public View f185891t;

    /* renamed from: u */
    public Animator f185892u;

    /* renamed from: v */
    public View f185893v;

    /* renamed from: x */
    private final AbstractC89244h f185894x;

    /* renamed from: y */
    private final AbstractC89248d f185895y = C21572a.m40504a(getDiContainer(), VideoPublishEditModel.class);

    /* renamed from: z */
    private C83234t f185896z;

    static {
        Covode.recordClassIndex(97068);
    }

    /* renamed from: Q */
    private final AbstractC82427a m143590Q() {
        return (AbstractC82427a) this.f185874A.mo23374a(this, f185872b[1]);
    }

    /* access modifiers changed from: protected */
    /* renamed from: F */
    public final EditToolbarViewModel mo128297F() {
        return (EditToolbarViewModel) this.f185894x.getValue();
    }

    /* access modifiers changed from: protected */
    /* renamed from: G */
    public final VideoPublishEditModel mo128298G() {
        return (VideoPublishEditModel) this.f185895y.mo23374a(this, f185872b[0]);
    }

    /* renamed from: I */
    public final AbstractC72510a mo128300I() {
        return (AbstractC72510a) this.f185875B.getValue();
    }

    /* renamed from: J */
    public final AbstractC82503a mo128301J() {
        return (AbstractC82503a) this.f185876C.mo23374a(this, f185872b[3]);
    }

    /* renamed from: K */
    public final boolean mo128302K() {
        return ((Boolean) this.f185878E.getValue()).booleanValue();
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public boolean getUniqueOnlyGlobal() {
        return true;
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.toolbar.g$d */
    public static final class C83188d {
        static {
            Covode.recordClassIndex(97072);
        }

        private C83188d() {
        }

        public /* synthetic */ C83188d(byte b) {
            this();
        }
    }

    @Override // com.bytedance.p1559o.AbstractC21566a
    public C21582f getDiContainer() {
        return this.f185880G;
    }

    /* Return type fixed from 'com.bytedance.jedi.arch.g' to match base method */
    @Override // com.bytedance.jedi.arch.AbstractC20367ae
    public /* bridge */ /* synthetic */ AbstractC20477i getReceiver() {
        return this;
    }

    /* renamed from: M */
    public final boolean mo128304M() {
        return mo128298G().isStickPointMode;
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

    /* renamed from: com.ss.android.ugc.gamora.editor.toolbar.g$a */
    public static final class C83185a extends AbstractC89220m implements AbstractC89171a<AbstractC72510a> {

        /* renamed from: a */
        final /* synthetic */ AbstractC21566a f185897a;

        static {
            Covode.recordClassIndex(97069);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C83185a(AbstractC21566a aVar) {
            super(0);
            this.f185897a = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.bytedance.als.b, com.ss.android.ugc.aweme.shortvideo.preview.a] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.p2082ss.android.ugc.aweme.shortvideo.preview.AbstractC72510a invoke() {
            /*
                r3 = this;
                com.bytedance.o.a r0 = r3.f185897a
                com.bytedance.o.f r2 = r0.getDiContainer()
                java.lang.Class<com.ss.android.ugc.aweme.shortvideo.preview.a> r1 = com.p2082ss.android.ugc.aweme.shortvideo.preview.AbstractC72510a.class
                r0 = 0
                java.lang.Object r0 = r2.mo35249a(r1, r0)
                com.bytedance.als.b r0 = (com.bytedance.als.AbstractC2547b) r0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.gamora.editor.toolbar.C83184g.C83185a.invoke():com.bytedance.als.b");
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.toolbar.g$f */
    static final class CallableC83190f<V> implements Callable {

        /* renamed from: a */
        final /* synthetic */ String f185904a;

        static {
            Covode.recordClassIndex(97074);
        }

        CallableC83190f(String str) {
            this.f185904a = str;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            return MusicService.m81198m().mo69293a(this.f185904a);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: H */
    public final ImageView mo128299H() {
        ImageView imageView = this.f185882d;
        if (imageView == null) {
            C89219l.m154710a("mBackImageView");
        }
        return imageView;
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.toolbar.g$e */
    static final class C83189e extends AbstractC89220m implements AbstractC89171a<Boolean> {

        /* renamed from: a */
        public static final C83189e f185903a = new C83189e();

        static {
            Covode.recordClassIndex(97073);
        }

        C83189e() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Boolean invoke() {
            return Boolean.valueOf(AVExternalServiceImpl.m113114a().configService().avsettingsConfig().enableNewMusicMarquee());
        }
    }

    /* renamed from: R */
    private final boolean m143591R() {
        if (!mo128298G().isPhotoMvMode || mo128298G().getOriginal() != 1) {
            return false;
        }
        return true;
    }

    /* renamed from: L */
    public final boolean mo128303L() {
        if (mo128298G().isStickPointMode || mo128298G().isTemplateMv()) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.scene.AbstractC22219j
    /* renamed from: n_ */
    public final void mo22713n_() {
        super.mo22713n_();
        Animator animator = this.f185892u;
        if (animator != null) {
            animator.cancel();
        }
        C83234t tVar = this.f185896z;
        if (tVar != null) {
            tVar.mo128312a();
        }
    }

    /* renamed from: P */
    public final int mo128307P() {
        if (this.f185879F) {
            if (mo128298G().isAudioEnhance) {
                return 2131232656;
            }
            return 2131232654;
        } else if (mo128298G().isAudioEnhance) {
            return 2131232655;
        } else {
            return 2131232653;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.toolbar.g$v */
    static final class C83206v extends AbstractC89220m implements AbstractC89183m<AbstractC20382b, List<? extends C83395y>, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C83184g f185920a;

        static {
            Covode.recordClassIndex(97090);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C83206v(C83184g gVar) {
            super(2);
            this.f185920a = gVar;
        }

        /* renamed from: com.ss.android.ugc.gamora.editor.toolbar.g$v$a */
        public static final class C83207a implements AbstractC71396l {

            /* renamed from: a */
            final /* synthetic */ C83206v f185921a;

            static {
                Covode.recordClassIndex(97091);
            }

            @Override // com.p2082ss.android.ugc.aweme.shortvideo.edit.AbstractC71396l
            /* renamed from: a */
            public final void mo112876a() {
                C39162r.m79460a("click_more_icon", new C84425b().mo129406a("creation_id", this.f185921a.f185920a.mo128298G().creationId).mo129406a("enter_from", "video_edit_page").mo129406a("shoot_way", this.f185921a.f185920a.mo128298G().mShootWay).mo129406a("content_type", C70968bl.m125249a(this.f185921a.f185920a.mo128298G())).mo129406a("content_source", C70968bl.m125262b(this.f185921a.f185920a.mo128298G())).mo129403a("is_multi_content", C70968bl.m125279k(this.f185921a.f185920a.mo128298G())).f188764a);
            }

            C83207a(C83206v vVar) {
                this.f185921a = vVar;
            }
        }

        /* renamed from: com.ss.android.ugc.gamora.editor.toolbar.g$v$b */
        public static final class C83208b extends AbstractView$OnClickListenerC81432d {

            /* renamed from: a */
            final /* synthetic */ View f185922a;

            /* renamed from: b */
            final /* synthetic */ C83395y f185923b;

            /* renamed from: c */
            final /* synthetic */ C83206v f185924c;

            /* renamed from: d */
            final /* synthetic */ List f185925d;

            /* renamed from: e */
            final /* synthetic */ Map f185926e;

            static {
                Covode.recordClassIndex(97092);
            }

            @Override // com.p2082ss.android.ugc.aweme.views.AbstractView$OnClickListenerC81432d
            /* renamed from: a */
            public final void mo77200a(View view) {
                if (((C71393k) this.f185922a).mo112870b()) {
                    this.f185924c.f185920a.mo128297F().f185703b = true;
                    ((C71393k) this.f185922a).mo112869a();
                } else {
                    this.f185924c.f185920a.mo128297F().f185703b = false;
                }
                this.f185924c.f185920a.mo128297F().mo128237a(this.f185923b.f186262a);
            }

            C83208b(View view, C83395y yVar, C83206v vVar, List list, Map map) {
                this.f185922a = view;
                this.f185923b = yVar;
                this.f185924c = vVar;
                this.f185925d = list;
                this.f185926e = map;
            }
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20382b bVar, List<? extends C83395y> list) {
            MethodCollector.m26663i(12035);
            List<? extends C83395y> list2 = list;
            C89219l.m154721d(bVar, "");
            C89219l.m154721d(list2, "");
            ArrayList arrayList = new ArrayList();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (T t : list2) {
                Activity activity = this.f185920a.f52549m;
                if (activity == null) {
                    C89219l.m154715b();
                }
                C89219l.m154716b(activity, "");
                C71393k a = C71393k.C71394a.m126095a(activity, t.f186264c, t.f186263b);
                arrayList.add(a);
                linkedHashMap.put(Integer.valueOf(t.f186262a), a);
                a.setOnClickListener(new C83208b(a, t, this, arrayList, linkedHashMap));
            }
            this.f185920a.f185885g.clear();
            this.f185920a.f185885g.putAll(linkedHashMap);
            C83184g.m143601g(this.f185920a).removeAllViews();
            C71397m mVar = this.f185920a.f185886h;
            if (mVar != null) {
                mVar.mo112879c();
            }
            C83184g gVar = this.f185920a;
            ViewGroup g = C83184g.m143601g(this.f185920a);
            Activity activity2 = this.f185920a.f52549m;
            if (activity2 == null) {
                C89219l.m154715b();
            }
            C89219l.m154716b(activity2, "");
            C71397m mVar2 = new C71397m(g, arrayList, activity2);
            mVar2.mo112877a();
            mVar2.f159984a = new C83207a(this);
            gVar.f185886h = mVar2;
            this.f185920a.mo128305N();
            C89391z zVar = C89391z.f203057a;
            MethodCollector.m26664o(12035);
            return zVar;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.toolbar.g$b */
    public static final class C83186b extends AbstractC89220m implements AbstractC89171a<EditToolbarViewModel> {

        /* renamed from: a */
        final /* synthetic */ AbstractC22219j f185898a;

        /* renamed from: b */
        final /* synthetic */ AbstractC89277c f185899b;

        /* renamed from: c */
        final /* synthetic */ AbstractC89277c f185900c;

        static {
            Covode.recordClassIndex(97070);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C83186b(AbstractC22219j jVar, AbstractC89277c cVar, AbstractC89277c cVar2) {
            super(0);
            this.f185898a = jVar;
            this.f185899b = cVar;
            this.f185900c = cVar2;
        }

        /* JADX WARN: Type inference failed for: r0v8, types: [com.ss.android.ugc.gamora.editor.toolbar.EditToolbarViewModel, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARN: Type inference failed for: r0v15, types: [com.ss.android.ugc.gamora.editor.toolbar.EditToolbarViewModel, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARNING: Unknown variable types count: 2 */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.p2082ss.android.ugc.gamora.editor.toolbar.EditToolbarViewModel invoke() {
            /*
                r6 = this;
                com.bytedance.scene.j r0 = r6.f185898a
                com.bytedance.scene.j r5 = r0.f52551o
                h.k.c r0 = r6.f185900c
                java.lang.Class r0 = p4600h.p4611f.C89170a.m154665a(r0)
                java.lang.String r3 = r0.getCanonicalName()
                java.lang.String r4 = ""
                p4600h.p4611f.p4613b.C89219l.m154716b(r3, r4)
            L_0x0013:
                if (r5 == 0) goto L_0x003a
                androidx.lifecycle.ad$b r0 = com.bytedance.jedi.arch.C20392e.f48284a     // Catch:{ as -> 0x0035 }
                androidx.lifecycle.ad r2 = com.bytedance.scene.C22267s.m41934a(r5, r0)     // Catch:{ as -> 0x0035 }
                h.k.c r0 = r6.f185900c     // Catch:{ as -> 0x0035 }
                java.lang.Class r0 = p4600h.p4611f.C89170a.m154665a(r0)     // Catch:{ as -> 0x0035 }
                java.lang.String r1 = r0.getCanonicalName()     // Catch:{ as -> 0x0035 }
                p4600h.p4611f.p4613b.C89219l.m154716b(r1, r4)     // Catch:{ as -> 0x0035 }
                h.k.c r0 = r6.f185899b     // Catch:{ as -> 0x0035 }
                java.lang.Class r0 = p4600h.p4611f.C89170a.m154665a(r0)     // Catch:{ as -> 0x0035 }
                androidx.lifecycle.ac r0 = m143619xe2f36117(r2, r1, r0)     // Catch:{ as -> 0x0035 }
                com.bytedance.jedi.arch.JediViewModel r0 = (com.bytedance.jedi.arch.JediViewModel) r0     // Catch:{ as -> 0x0035 }
                goto L_0x0038
            L_0x0035:
                com.bytedance.scene.j r5 = r5.f52551o
                goto L_0x0013
            L_0x0038:
                if (r0 != 0) goto L_0x0052
            L_0x003a:
                com.bytedance.scene.j r0 = r6.f185898a
                androidx.fragment.app.e r1 = com.bytedance.scene.ktx.C22228c.m41832b(r0)
                androidx.lifecycle.ad$b r0 = com.bytedance.jedi.arch.C20392e.f48284a
                androidx.lifecycle.ad r1 = androidx.lifecycle.C1181ae.m3881a(r1, r0)
                h.k.c r0 = r6.f185899b
                java.lang.Class r0 = p4600h.p4611f.C89170a.m154665a(r0)
                androidx.lifecycle.ac r0 = m143619xe2f36117(r1, r3, r0)
                com.bytedance.jedi.arch.JediViewModel r0 = (com.bytedance.jedi.arch.JediViewModel) r0
            L_0x0052:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.gamora.editor.toolbar.C83184g.C83186b.invoke():com.bytedance.jedi.arch.JediViewModel");
        }

        /* renamed from: com_ss_android_ugc_gamora_editor_toolbar_EditTitlebarScene$$special$$inlined$hostViewModel$1_androidx_lifecycle_VScopeLancet_get */
        public static AbstractC1174ac m143619xe2f36117(C1175ad adVar, String str, Class cls) {
            if (cls.equals(ScopeViewModel.class)) {
                return adVar.mo3984a(str, cls);
            }
            AbstractC1174ac a = adVar.mo3984a(str, cls);
            C1171ab.m3870a(a, adVar);
            return a;
        }
    }

    /* renamed from: S */
    private final void m143592S() {
        Drawable a;
        if (mo128298G().isAutoEnhanceEnable(C70935a.m125235a())) {
            EditToolbarViewModel F = mo128297F();
            if (mo128298G().autoEnhanceOn) {
                Activity activity = this.f52549m;
                if (activity == null) {
                    C89219l.m154715b();
                }
                a = C0643b.m2369a(activity, C83249x.m143648a().mo128311a(1));
                if (a == null) {
                    C89219l.m154715b();
                }
            } else {
                Activity activity2 = this.f52549m;
                if (activity2 == null) {
                    C89219l.m154715b();
                }
                a = C0643b.m2369a(activity2, C83249x.m143648a().mo128311a(2));
                if (a == null) {
                    C89219l.m154715b();
                }
            }
            C89219l.m154716b(a, "");
            F.mo128240a(new C83131a(a, mo128298G().autoEnhanceOn, C70939d.m125237b()));
        }
    }

    /* renamed from: T */
    private final void m143593T() {
        if (!C70976bp.m125310f(mo128298G())) {
            C71529w.m126419a("voice", -1);
        } else {
            C71529w.m126419a("voice", C71529w.f160309g);
        }
        if (mo128298G().canvasVideoData != null) {
            IAVServiceProxy createIAVServiceProxybyMonsterPlugin = AVServiceProxyImpl.createIAVServiceProxybyMonsterPlugin(false);
            C89219l.m154716b(createIAVServiceProxybyMonsterPlugin, "");
            if (createIAVServiceProxybyMonsterPlugin.getStoryService().mo93871e()) {
                if (C35369ac.f83453a) {
                    C71529w.m126419a("canvas_gesture", C71529w.f160310h);
                }
            } else if (C35405p.f83539a) {
                C71529w.m126419a("canvas_gesture", C71529w.f160310h);
            }
        }
        if (C71817eu.m126803n(mo128298G()) && C70976bp.m125301a(mo128298G())) {
            C71529w.m126419a("cut_optimized", C71529w.f160311i);
        }
    }

    /* renamed from: N */
    public final void mo128305N() {
        C83234t tVar = this.f185896z;
        if (tVar != null) {
            tVar.mo128312a();
        }
        Activity activity = this.f52549m;
        Objects.requireNonNull(activity, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        VideoPublishEditModel G = mo128298G();
        EditToolbarViewModel F = mo128297F();
        AbstractC22219j jVar = this.f52551o;
        Objects.requireNonNull(jVar, "null cannot be cast to non-null type com.bytedance.scene.group.GroupScene");
        C83234t tVar2 = new C83234t((ActivityC0945e) activity, G, F, (AbstractC22186b) jVar, m143590Q());
        tVar2.mo128315a(this.f185885g);
        tVar2.mo128319b(this.f185885g);
        tVar2.mo128321c(this.f185885g);
        tVar2.mo128316a(this.f185885g, 80);
        View view = this.f185885g.get(1);
        if (view != null) {
            Objects.requireNonNull(view, "null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.edit.EditToolBarItem");
            tVar2.mo128314a(this, (C71393k) view);
        }
        View view2 = this.f185885g.get(9);
        if (view2 != null) {
            Objects.requireNonNull(view2, "null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.edit.EditToolBarItem");
            C71393k kVar = (C71393k) view2;
            C89219l.m154721d(this, "");
            C89219l.m154721d(kVar, "");
            selectNonNullSubscribe(tVar2.f185956e, C83246u.f185979a, new C20370ah(), new C83234t.C83237b(tVar2, kVar));
        }
        this.f185896z = tVar2;
    }

    /* renamed from: E */
    public List<C83395y> mo62771E() {
        Serializable serializable;
        int i;
        boolean z;
        C69905c cVar;
        int i2;
        int i3;
        int i4;
        ArrayList<String> arrayList;
        Intent intent;
        ArrayList arrayList2 = new ArrayList();
        Activity activity = this.f52549m;
        C61288d dVar = null;
        if (activity == null || (intent = activity.getIntent()) == null) {
            serializable = null;
        } else {
            serializable = intent.getSerializableExtra("key_mv_theme_data");
        }
        if (serializable instanceof C61288d) {
            dVar = serializable;
        }
        C61288d dVar2 = dVar;
        if (dVar2 == null || (arrayList = dVar2.selectMediaList) == null) {
            i = 0;
        } else {
            i = arrayList.size();
        }
        if (i > 1) {
            z = true;
        } else {
            z = false;
        }
        int i5 = 2131232574;
        int i6 = 2131232550;
        if (!"slideshow".equals(C71817eu.m126792c(mo128298G())) || !z) {
            if (C65393cf.m117090a() == 3 && !C82306a.m142357a()) {
                m143595a(arrayList2);
            }
            if (C65393cf.m117092c() && !C82306a.m142357a()) {
                if (!this.f185879F) {
                    i5 = 2131232573;
                }
                arrayList2.add(new C83395y(4, i5, R.string.g3w));
            }
            if (!this.f185879F) {
                i6 = 2131232549;
            }
            arrayList2.add(new C83395y(5, i6, R.string.bvz));
            int i7 = 2131232197;
            if (C71817eu.m126803n(mo128298G())) {
                if (!this.f185879F) {
                    i7 = 2131232196;
                }
                arrayList2.add(new C83395y(15, i7, R.string.bj5));
            } else if (C70976bp.m125308d(mo128298G())) {
                if (!this.f185879F) {
                    i7 = 2131232196;
                }
                arrayList2.add(new C83395y(13, i7, R.string.bj5));
            }
            if (C65393cf.m117090a() == 2 && !C82306a.m142357a()) {
                m143595a(arrayList2);
            }
            if (C70976bp.m125310f(mo128298G())) {
                if (this.f185879F) {
                    i4 = 2131232588;
                } else {
                    i4 = 2131232587;
                }
                arrayList2.add(new C83395y(6, i4, R.string.z6));
            }
            if (C70976bp.m125313i(mo128298G())) {
                if (this.f185879F) {
                    i3 = 2131232562;
                } else {
                    i3 = 2131232561;
                }
                arrayList2.add(new C83395y(10, i3, R.string.ax4));
            }
            if (C65393cf.m117090a() == 0 || C82306a.m142357a()) {
                m143595a(arrayList2);
            }
            int i8 = 2131232590;
            if (!C70976bp.m125316l(mo128298G())) {
                if (!mo128298G().isDuet() && !mo128298G().isReaction() && !C70976bp.m125305b(mo128298G())) {
                    if (this.f185879F) {
                        i2 = 2131232544;
                    } else {
                        i2 = 2131232543;
                    }
                    arrayList2.add(new C83395y(8, i2, R.string.b3k));
                }
                if (!this.f185879F) {
                    i8 = 2131232589;
                }
                arrayList2.add(new C83395y(7, i8, R.string.fzc));
            } else if (mo128298G().isReaction() || mo128298G().isDuet() || C70976bp.m125305b(mo128298G())) {
                if (!this.f185879F) {
                    i8 = 2131232589;
                }
                arrayList2.add(new C83395y(7, i8, R.string.fzc));
            }
            if (mo128298G().isAutoEnhanceEnable(C70935a.m125235a())) {
                arrayList2.add(new C83395y(9, C83249x.m143648a().mo128311a(1), R.string.bix));
            }
            if ((C65332ab.m117014a() || C16048b.m29633a().mo25412a(true, "studio_audio_enhance_type_android", 0) == 1) && ((cVar = C70005cr.m123611a().f156482a) == null || !cVar.isPgc())) {
                arrayList2.add(new C83395y(14, mo128307P(), R.string.dgq));
            }
            return arrayList2;
        }
        if (C65393cf.m117092c() && !C82306a.m142357a()) {
            if (!this.f185879F) {
                i5 = 2131232573;
            }
            arrayList2.add(new C83395y(4, i5, R.string.g3w));
        }
        if (!this.f185879F) {
            i6 = 2131232549;
        }
        arrayList2.add(new C83395y(5, i6, R.string.bvz));
        if (mo128298G().isAutoEnhanceEnable(C70935a.m125235a())) {
            arrayList2.add(new C83395y(9, C83249x.m143648a().mo128311a(1), R.string.bix));
        }
        return arrayList2;
    }

    /* renamed from: O */
    public final void mo128306O() {
        mo128297F().mo128242a(mo62771E());
        boolean z = false;
        IAVServiceProxy createIAVServiceProxybyMonsterPlugin = AVServiceProxyImpl.createIAVServiceProxybyMonsterPlugin(false);
        C89219l.m154716b(createIAVServiceProxybyMonsterPlugin, "");
        AbstractC63218be storyService = createIAVServiceProxybyMonsterPlugin.getStoryService();
        boolean z2 = true;
        if (storyService.mo93868b() || storyService.mo93869c() || storyService.mo93870d()) {
            mo128297F().mo128248b(false);
        } else {
            if (mo128298G().mIsFromDraft && !C46787cd.m90133a()) {
                if (mo128298G().isDuet() || mo128298G().isUploadVideo() || mo128298G().isReaction() || ((mo128298G().isMvThemeVideoType() && !m143591R()) || ((mo128298G().isDuet() && !mo128298G().duetFilesExist()) || mo128298G().isCutSameVideoType()))) {
                    mo128297F().mo128248b(false);
                } else {
                    mo128297F().mo128248b(true);
                }
                if (C82306a.m142358a(mo128298G())) {
                    mo128297F().mo128248b(true);
                    mo128297F().mo128241a("");
                } else if (m143591R()) {
                    mo128297F().mo128248b(true);
                    EditToolbarViewModel F = mo128297F();
                    Activity activity = this.f52549m;
                    if (activity == null) {
                        C89219l.m154715b();
                    }
                    C89219l.m154716b(activity, "");
                    String string = activity.getResources().getString(R.string.az0);
                    C89219l.m154716b(string, "");
                    F.mo128241a(string);
                } else if (mo128298G().mShootMode == 2 && mo128298G().getOriginal() == 1) {
                    mo128297F().mo128248b(false);
                }
            } else if (mo128298G().mIsFromDraft && C46787cd.m90133a()) {
                mo128297F().mo128248b(false);
            }
            if (mo128298G().draftFromShoot) {
                mo128297F().mo128248b(true);
            }
        }
        m143592S();
        if (mo128298G().isStickPointMode) {
            mo128297F().mo128254d(8, false);
            mo128297F().mo128254d(7, false);
            mo128297F().mo128246b(7, false);
        }
        if (C70976bp.m125312h(mo128298G())) {
            if (mo128298G().veAudioRecorderParam == null || !mo128298G().veAudioRecorderParam.hasRecord()) {
                mo128297F().mo128254d(6, false);
            } else {
                mo128297F().mo128254d(6, true);
            }
        }
        if ((!mo128298G().hasOriginalAudio() || mo128298G().voiceVolume <= 0.0f) && !mo128298G().hasRecord()) {
            mo128297F().mo128254d(11, false);
        } else {
            mo128297F().mo128254d(11, true);
        }
        if (mo128298G().isDuet() || mo128298G().isReaction() || mo128298G().mMusicPath == null || mo128298G().isStickPointMode) {
            z2 = false;
        }
        C69905c cVar = C70005cr.m123611a().f156482a;
        if (!mo128298G().isMvThemeVideoType() || cVar == null || C84904k.m145909a(mo128298G().mvCreateVideoData.musicIds) || !mo128298G().mvCreateVideoData.musicIds.contains(cVar.getMusicId())) {
            z = z2;
        }
        if (C70976bp.m125316l(mo128298G())) {
            AbstractC82427a Q = m143590Q();
            if (Q != null) {
                Q.mo127539a(z);
            }
        } else {
            mo128297F().mo128246b(8, z);
            LiveData<AbstractC31071f> C = mo128300I().mo114778C();
            Activity t = mo36486t();
            Objects.requireNonNull(t, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
            C.observe((ActivityC0218d) t, new C83209w(this));
        }
        m143593T();
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.toolbar.g$x */
    public static final class C83210x extends AbstractView$OnClickListenerC81432d {

        /* renamed from: a */
        final /* synthetic */ C83184g f185928a;

        static {
            Covode.recordClassIndex(97094);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C83210x(C83184g gVar) {
            this.f185928a = gVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.views.AbstractView$OnClickListenerC81432d
        /* renamed from: a */
        public final void mo77200a(View view) {
            C89219l.m154721d(view, "");
            this.f185928a.mo128300I().mo114785J();
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.toolbar.g$y */
    public static final class C83211y extends AbstractView$OnClickListenerC81432d {

        /* renamed from: a */
        final /* synthetic */ C83184g f185929a;

        static {
            Covode.recordClassIndex(97095);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C83211y(C83184g gVar) {
            this.f185929a = gVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.views.AbstractView$OnClickListenerC81432d
        /* renamed from: a */
        public final void mo77200a(View view) {
            C89219l.m154721d(view, "");
            C80510gr.m139527a("camera_start");
            this.f185929a.mo128300I().mo114785J();
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.toolbar.g$h */
    static final class View$OnClickListenerC83192h implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C83184g f185906a;

        static {
            Covode.recordClassIndex(97076);
        }

        View$OnClickListenerC83192h(C83184g gVar) {
            this.f185906a = gVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f185906a.mo128297F().mo128237a(1);
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ TextView m143594a(C83184g gVar) {
        TextView textView = gVar.f185890l;
        if (textView == null) {
            C89219l.m154710a("tvChooseMusic");
        }
        return textView;
    }

    /* renamed from: b */
    public static final /* synthetic */ View m143596b(C83184g gVar) {
        View view = gVar.f185893v;
        if (view == null) {
            C89219l.m154710a("removeMusicView");
        }
        return view;
    }

    /* renamed from: c */
    public static final /* synthetic */ ImageView m143597c(C83184g gVar) {
        ImageView imageView = gVar.f185889k;
        if (imageView == null) {
            C89219l.m154710a("ivChooseMusic");
        }
        return imageView;
    }

    /* renamed from: d */
    public static final /* synthetic */ View m143598d(C83184g gVar) {
        View view = gVar.f185891t;
        if (view == null) {
            C89219l.m154710a("loadingMusicView");
        }
        return view;
    }

    /* renamed from: e */
    public static final /* synthetic */ View m143599e(C83184g gVar) {
        View view = gVar.f185888j;
        if (view == null) {
            C89219l.m154710a("chooseMusicContainer");
        }
        return view;
    }

    /* renamed from: f */
    public static final /* synthetic */ TextView m143600f(C83184g gVar) {
        TextView textView = gVar.f185883e;
        if (textView == null) {
            C89219l.m154710a("mTvBackTip");
        }
        return textView;
    }

    /* renamed from: g */
    public static final /* synthetic */ ViewGroup m143601g(C83184g gVar) {
        ViewGroup viewGroup = gVar.f185884f;
        if (viewGroup == null) {
            C89219l.m154710a("mToolbarContainer");
        }
        return viewGroup;
    }

    /* renamed from: h */
    public static final /* synthetic */ ConstraintLayout m143602h(C83184g gVar) {
        ConstraintLayout constraintLayout = gVar.f185881c;
        if (constraintLayout == null) {
            C89219l.m154710a("titleLayout");
        }
        return constraintLayout;
    }

    @Override // com.bytedance.jedi.arch.AbstractC20382b
    public <VM1 extends JediViewModel<S1>, S1 extends AbstractC20368af> S1 getState(VM1 vm1) {
        C89219l.m154721d(vm1, "");
        return (S1) AbstractC20382b.C20383a.m38582a(this, vm1);
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.toolbar.g$k */
    static final class C83195k<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ C83184g f185909a;

        static {
            Covode.recordClassIndex(97079);
        }

        C83195k(C83184g gVar) {
            this.f185909a = gVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            boolean z;
            Boolean bool = (Boolean) obj;
            C89219l.m154716b(bool, "");
            int i = 0;
            if (bool.booleanValue() || this.f185909a.mo128304M()) {
                z = true;
            } else {
                z = false;
            }
            View e = C83184g.m143599e(this.f185909a);
            if (!z) {
                i = 8;
            }
            e.setVisibility(i);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.toolbar.g$m */
    static final class C83197m<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ C83184g f185911a;

        static {
            Covode.recordClassIndex(97081);
        }

        C83197m(C83184g gVar) {
            this.f185911a = gVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            int i;
            Boolean bool = (Boolean) obj;
            if (bool != null) {
                if (bool.booleanValue()) {
                    AbstractC82503a J = this.f185911a.mo128301J();
                    if (J != null) {
                        J.mo127589b();
                    }
                } else {
                    AbstractC82503a J2 = this.f185911a.mo128301J();
                    if (J2 != null) {
                        J2.mo127591c();
                    }
                }
                ViewGroup g = C83184g.m143601g(this.f185911a);
                if (bool.booleanValue()) {
                    i = 0;
                } else {
                    i = 8;
                }
                g.setVisibility(i);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.gamora.editor.toolbar.g$w */
    public static final class C83209w<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ C83184g f185927a;

        static {
            Covode.recordClassIndex(97093);
        }

        C83209w(C83184g gVar) {
            this.f185927a = gVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            if (obj != null && C70976bp.m125298a(this.f185927a.mo128300I()) > this.f185927a.mo128298G().mCurMusicLength) {
                this.f185927a.mo128297F().mo128254d(8, false);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.toolbar.g$g */
    static final class C83191g<TTaskResult, TContinuationResult> implements AbstractC1729g {

        /* renamed from: a */
        final /* synthetic */ C83184g f185905a;

        static {
            Covode.recordClassIndex(97075);
        }

        C83191g(C83184g gVar) {
            this.f185905a = gVar;
        }

        @Override // p077b.AbstractC1729g
        public final /* synthetic */ Object then(C1731i iVar) {
            MusicModel convertToMusicModel;
            C89219l.m154716b(iVar, "");
            if (!(iVar.mo5545d() == null || (convertToMusicModel = ((Music) iVar.mo5545d()).convertToMusicModel()) == null)) {
                C83184g.m143594a(this.f185905a).setText(convertToMusicModel.getName() + "-" + convertToMusicModel.getSinger());
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.toolbar.g$i */
    static final class View$OnClickListenerC83193i implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C83184g f185907a;

        static {
            Covode.recordClassIndex(97077);
        }

        View$OnClickListenerC83193i(C83184g gVar) {
            this.f185907a = gVar;
        }

        public final void onClick(View view) {
            String str;
            ClickAgent.onClick(view);
            VideoPublishEditModel G = this.f185907a.mo128298G();
            C69905c cVar = C70005cr.m123611a().f156482a;
            if (cVar == null || (str = cVar.getMusicId()) == null) {
                str = "";
            }
            C89219l.m154716b(str, "");
            C70968bl.m125258a(G, str, "");
            C70005cr.m123611a().mo70083a((C69905c) null);
            C83184g gVar = this.f185907a;
            ((AbstractC82036ac) gVar.f185887i.mo23374a(gVar, C83184g.f185872b[2])).mo127274a();
            C83184g.m143594a(this.f185907a).setText(R.string.fsz);
            C83184g.m143596b(this.f185907a).setVisibility(8);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.toolbar.g$u */
    static final class C83205u<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ C83184g f185919a;

        static {
            Covode.recordClassIndex(97089);
        }

        C83205u(C83184g gVar) {
            this.f185919a = gVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            Boolean bool = (Boolean) obj;
            C89219l.m154716b(bool, "");
            if (bool.booleanValue()) {
                C83184g.m143600f(this.f185919a).setVisibility(8);
                C83184g.m143601g(this.f185919a).setVisibility(8);
                if (this.f185919a.f185888j != null) {
                    C83184g.m143599e(this.f185919a).setVisibility(8);
                    return;
                }
                return;
            }
            C83184g.m143600f(this.f185919a).setVisibility(0);
            C83184g.m143601g(this.f185919a).setVisibility(0);
            if (this.f185919a.f185888j != null) {
                C83184g.m143599e(this.f185919a).setVisibility(0);
            }
        }
    }

    public C83184g(C21582f fVar) {
        C89219l.m154721d(fVar, "");
        this.f185880G = fVar;
        AbstractC89277c a = C89204ab.m154669a(EditToolbarViewModel.class);
        this.f185894x = C89250i.m154773a((AbstractC89171a) new C83186b(this, a, a));
    }

    /* renamed from: a */
    private final void m143595a(List<C83395y> list) {
        int i;
        if (!C70976bp.m125315k(mo128298G())) {
            return;
        }
        if (mo128298G().hasOriginalAudio() || C70976bp.m125313i(mo128298G())) {
            if (!this.f185879F) {
                i = 2131232575;
            } else if (mo128298G().hasSubtitle()) {
                i = 2131232578;
            } else {
                i = 2131232577;
            }
            list.add(new C83395y(11, i, R.string.x3));
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.toolbar.g$c */
    public static final class C83187c implements AbstractC89248d<Object, AbstractC82427a> {

        /* renamed from: a */
        final /* synthetic */ AbstractC21566a f185901a;

        /* renamed from: b */
        final /* synthetic */ C83184g f185902b;

        static {
            Covode.recordClassIndex(97071);
        }

        public C83187c(AbstractC21566a aVar, C83184g gVar) {
            this.f185901a = aVar;
            this.f185902b = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4616h.AbstractC89248d
        /* renamed from: a */
        public final /* synthetic */ AbstractC82427a mo23374a(Object obj, AbstractC89286i iVar) {
            C89219l.m154721d(obj, "");
            C89219l.m154721d(iVar, "");
            Object b = this.f185901a.getDiContainer().mo35252b(AbstractC82427a.class, null);
            if (C70976bp.m125316l(this.f185902b.mo128298G())) {
                return b;
            }
            return null;
        }
    }

    @Override // com.bytedance.scene.AbstractC22219j, com.bytedance.scene.group.AbstractC22186b
    /* renamed from: a */
    public final /* synthetic */ View mo22702a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return mo22702a(layoutInflater, viewGroup);
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.toolbar.g$p */
    static final class C83200p extends AbstractC89220m implements AbstractC89183m<AbstractC20382b, C89391z, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C83184g f185914a;

        static {
            Covode.recordClassIndex(97084);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C83200p(C83184g gVar) {
            super(2);
            this.f185914a = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20382b bVar, C89391z zVar) {
            C89219l.m154721d(bVar, "");
            C89219l.m154721d(zVar, "");
            this.f185914a.mo128306O();
            return C89391z.f203057a;
        }
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public <VM1 extends JediViewModel<S1>, S1 extends AbstractC20368af, R> R withState(VM1 vm1, AbstractC89172b<? super S1, ? extends R> bVar) {
        C89219l.m154721d(vm1, "");
        C89219l.m154721d(bVar, "");
        return (R) AbstractC20382b.C20383a.m38593a(this, vm1, bVar);
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.toolbar.g$l */
    static final class C83196l extends AbstractC89220m implements AbstractC89183m<AbstractC20382b, C89391z, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C83184g f185910a;

        static {
            Covode.recordClassIndex(97080);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C83196l(C83184g gVar) {
            super(2);
            this.f185910a = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20382b bVar, C89391z zVar) {
            C89219l.m154721d(bVar, "");
            C89219l.m154721d(zVar, "");
            C71397m mVar = this.f185910a.f185886h;
            if (mVar != null) {
                mVar.mo112879c();
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.toolbar.g$q */
    static final class C83201q extends AbstractC89220m implements AbstractC89183m<AbstractC20382b, Boolean, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C83184g f185915a;

        static {
            Covode.recordClassIndex(97085);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C83201q(C83184g gVar) {
            super(2);
            this.f185915a = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20382b bVar, Boolean bool) {
            int i;
            boolean booleanValue = bool.booleanValue();
            C89219l.m154721d(bVar, "");
            ImageView H = this.f185915a.mo128299H();
            if (booleanValue) {
                i = 0;
            } else {
                i = 8;
            }
            H.setVisibility(i);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.toolbar.g$t */
    static final class C83204t extends AbstractC89220m implements AbstractC89183m<AbstractC20382b, String, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C83184g f185918a;

        static {
            Covode.recordClassIndex(97088);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C83204t(C83184g gVar) {
            super(2);
            this.f185918a = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20382b bVar, String str) {
            String str2 = str;
            C89219l.m154721d(bVar, "");
            C89219l.m154721d(str2, "");
            C83184g.m143600f(this.f185918a).setText(str2);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.toolbar.g$o */
    static final class C83199o extends AbstractC89220m implements AbstractC89183m<AbstractC20382b, Integer, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C83184g f185913a;

        static {
            Covode.recordClassIndex(97083);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C83199o(C83184g gVar) {
            super(2);
            this.f185913a = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20382b bVar, Integer num) {
            int intValue = num.intValue();
            C89219l.m154721d(bVar, "");
            ViewGroup.LayoutParams layoutParams = C83184g.m143602h(this.f185913a).getLayoutParams();
            if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
                layoutParams = null;
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            if (marginLayoutParams != null) {
                marginLayoutParams.topMargin = intValue;
                C83184g.m143602h(this.f185913a).setLayoutParams(marginLayoutParams);
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.toolbar.g$r */
    static final class C83202r extends AbstractC89220m implements AbstractC89183m<AbstractC20382b, C89391z, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C83184g f185916a;

        static {
            Covode.recordClassIndex(97086);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C83202r(C83184g gVar) {
            super(2);
            this.f185916a = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20382b bVar, C89391z zVar) {
            C89219l.m154721d(bVar, "");
            C89219l.m154721d(zVar, "");
            View view = this.f185916a.f185885g.get(14);
            if (view != null) {
                Objects.requireNonNull(view, "null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.edit.EditToolBarItem");
                ((C71393k) view).setIcon(this.f185916a.mo128307P());
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.toolbar.g$s */
    static final class C83203s extends AbstractC89220m implements AbstractC89183m<AbstractC20382b, Boolean, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C83184g f185917a;

        static {
            Covode.recordClassIndex(97087);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C83203s(C83184g gVar) {
            super(2);
            this.f185917a = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20382b bVar, Boolean bool) {
            TextView textView;
            int i;
            boolean booleanValue = bool.booleanValue();
            C89219l.m154721d(bVar, "");
            if (this.f185917a.mo128302K() || C65393cf.m117091b()) {
                textView = C83184g.m143600f(this.f185917a);
            } else {
                textView = C83184g.m143600f(this.f185917a);
                if (booleanValue) {
                    i = 0;
                    textView.setVisibility(i);
                    return C89391z.f203057a;
                }
            }
            i = 8;
            textView.setVisibility(i);
            return C89391z.f203057a;
        }
    }

    @Override // com.bytedance.scene.group.AbstractC22186b
    /* renamed from: b */
    public final ViewGroup mo36393b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C89219l.m154721d(layoutInflater, "");
        C89219l.m154721d(viewGroup, "");
        View a = C1764a.m5927a(layoutInflater, R.layout.asl, viewGroup, false);
        Objects.requireNonNull(a, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout");
        ConstraintLayout constraintLayout = (ConstraintLayout) a;
        this.f185881c = constraintLayout;
        if (constraintLayout == null) {
            C89219l.m154710a("titleLayout");
        }
        return constraintLayout;
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.toolbar.g$n */
    static final class C83198n extends AbstractC89220m implements AbstractC89183m<AbstractC20382b, Boolean, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C83184g f185912a;

        static {
            Covode.recordClassIndex(97082);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C83198n(C83184g gVar) {
            super(2);
            this.f185912a = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20382b bVar, Boolean bool) {
            boolean booleanValue = bool.booleanValue();
            C89219l.m154721d(bVar, "");
            if (booleanValue) {
                View view = this.f185912a.f185885g.get(11);
                if (view != null) {
                    Objects.requireNonNull(view, "null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.edit.EditToolBarItem");
                    ((C71393k) view).setIcon(2131232578);
                }
            } else {
                View view2 = this.f185912a.f185885g.get(11);
                if (view2 != null) {
                    Objects.requireNonNull(view2, "null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.edit.EditToolBarItem");
                    ((C71393k) view2).setIcon(2131232577);
                }
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.toolbar.g$j */
    static final class C83194j extends AbstractC89220m implements AbstractC89183m<AbstractC20382b, C20523m, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C83184g f185908a;

        static {
            Covode.recordClassIndex(97078);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C83194j(C83184g gVar) {
            super(2);
            this.f185908a = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20382b bVar, C20523m mVar) {
            C20523m mVar2 = mVar;
            C89219l.m154721d(bVar, "");
            C89219l.m154721d(mVar2, "");
            int intValue = mVar2.f48283b.intValue();
            if (intValue == 0) {
                C83184g.m143594a(this.f185908a).setText(R.string.fsz);
                C83184g.m143597c(this.f185908a).setVisibility(0);
                C83184g.m143598d(this.f185908a).setVisibility(8);
                Animator animator = this.f185908a.f185892u;
                if (animator != null) {
                    animator.cancel();
                }
                C83184g.m143596b(this.f185908a).setVisibility(8);
            } else if (intValue == 1) {
                C69905c cVar = C70005cr.m123611a().f156482a;
                if (cVar != null) {
                    C83184g.m143594a(this.f185908a).setText(cVar.getName() + "-" + cVar.authorName);
                }
                C83184g.m143597c(this.f185908a).setVisibility(0);
                C83184g.m143598d(this.f185908a).setVisibility(8);
                Animator animator2 = this.f185908a.f185892u;
                if (animator2 != null) {
                    animator2.cancel();
                }
                if (!this.f185908a.mo128303L()) {
                    C83184g.m143596b(this.f185908a).setVisibility(0);
                }
            } else if (intValue == 2) {
                C83184g.m143594a(this.f185908a).setText(this.f185908a.mo36486t().getResources().getText(R.string.g1j));
                C83184g.m143597c(this.f185908a).setVisibility(8);
                C83184g.m143598d(this.f185908a).setVisibility(0);
                Animator animator3 = this.f185908a.f185892u;
                if (animator3 != null) {
                    animator3.start();
                }
                C83184g.m143596b(this.f185908a).setVisibility(8);
            }
            return C89391z.f203057a;
        }
    }

    @Override // com.bytedance.scene.AbstractC22219j
    /* renamed from: a */
    public final void mo36473a(View view, Bundle bundle) {
        int i;
        LiveData<Boolean> a;
        int i2;
        C89219l.m154721d(view, "");
        super.mo36473a(view, bundle);
        View c = mo36475c(R.id.pf);
        C89219l.m154716b(c, "");
        this.f185882d = (ImageView) c;
        if (!mo128298G().mIsFromDraft || (!(mo128298G().mOrigin == 0 || mo128298G().recordMode == 1) || !C46787cd.m90133a())) {
            ImageView imageView = this.f185882d;
            if (imageView == null) {
                C89219l.m154710a("mBackImageView");
            }
            if (C68062ck.m120368a()) {
                i = 2131232190;
            } else {
                i = 2131232188;
            }
            imageView.setImageResource(i);
        } else {
            ImageView imageView2 = this.f185882d;
            if (imageView2 == null) {
                C89219l.m154710a("mBackImageView");
            }
            if (C68062ck.m120368a()) {
                i2 = 2131232192;
            } else {
                i2 = 2131232420;
            }
            imageView2.setImageResource(i2);
        }
        ImageView imageView3 = this.f185882d;
        if (imageView3 == null) {
            C89219l.m154710a("mBackImageView");
        }
        imageView3.setOnClickListener(new C83210x(this));
        View c2 = mo36475c(R.id.esq);
        C89219l.m154716b(c2, "");
        TextView textView = (TextView) c2;
        this.f185883e = textView;
        if (textView == null) {
            C89219l.m154710a("mTvBackTip");
        }
        textView.setOnClickListener(new C83211y(this));
        View c3 = mo36475c(R.id.c7f);
        C89219l.m154716b(c3, "");
        this.f185884f = (ViewGroup) c3;
        if (!C65393cf.m117091b() && mo128302K() && !mo128298G().isDuet() && !mo128298G().isReaction() && !C82306a.m142357a() && mo128298G().canvasVideoData == null) {
            View c4 = mo36475c(R.id.dlj);
            C89219l.m154716b(c4, "");
            this.f185888j = c4;
            if (c4 == null) {
                C89219l.m154710a("chooseMusicContainer");
            }
            c4.setVisibility(0);
            View c5 = mo36475c(R.id.btz);
            C89219l.m154716b(c5, "");
            this.f185889k = (ImageView) c5;
            View c6 = mo36475c(R.id.bu0);
            C89219l.m154716b(c6, "");
            this.f185891t = c6;
            View c7 = mo36475c(R.id.etn);
            C89219l.m154716b(c7, "");
            this.f185890l = (TextView) c7;
            View c8 = mo36475c(R.id.dul);
            C89219l.m154716b(c8, "");
            this.f185877D = c8;
            View c9 = mo36475c(R.id.ccg);
            C89219l.m154716b(c9, "");
            this.f185893v = c9;
            View view2 = this.f185888j;
            if (view2 == null) {
                C89219l.m154710a("chooseMusicContainer");
            }
            Drawable background = view2.getBackground();
            C89219l.m154716b(background, "");
            background.setAlpha(127);
            View view3 = this.f185891t;
            if (view3 == null) {
                C89219l.m154710a("loadingMusicView");
            }
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view3, "rotation", 0.0f, 360.0f);
            ofFloat.setRepeatCount(-1);
            ofFloat.setDuration(1000L);
            ofFloat.setInterpolator(new LinearInterpolator());
            this.f185892u = ofFloat;
            View view4 = this.f185877D;
            if (view4 == null) {
                C89219l.m154710a("chooseMusicPressLayer");
            }
            view4.setOnClickListener(new View$OnClickListenerC83192h(this));
            View view5 = this.f185893v;
            if (view5 == null) {
                C89219l.m154710a("removeMusicView");
            }
            view5.setOnClickListener(new View$OnClickListenerC83193i(this));
            if (C83098t.m143513a(mo128298G())) {
                C69905c cVar = C70005cr.m123611a().f156482a;
                if (cVar != null) {
                    TextView textView2 = this.f185890l;
                    if (textView2 == null) {
                        C89219l.m154710a("tvChooseMusic");
                    }
                    textView2.setText(cVar.getName() + "-" + cVar.authorName);
                }
                if (mo128298G().isTemplateMv() && mo128298G().mvCreateVideoData != null && !C84904k.m145909a(mo128298G().mvCreateVideoData.musicIds)) {
                    String str = mo128298G().mvCreateVideoData.musicIds.get(0);
                    C89219l.m154716b(str, "");
                    C1731i.m5640b(new CallableC83190f(str), C1731i.f5562a).mo5534a(new C83191g(this), C1731i.f5564c, null);
                }
                if (!mo128303L()) {
                    View view6 = this.f185893v;
                    if (view6 == null) {
                        C89219l.m154710a("removeMusicView");
                    }
                    view6.setVisibility(0);
                }
            }
            if (mo128298G().isStickPointMode) {
                if (!mo128298G().isStickPointMode) {
                    View view7 = this.f185877D;
                    if (view7 == null) {
                        C89219l.m154710a("chooseMusicPressLayer");
                    }
                    view7.setEnabled(false);
                }
                ImageView imageView4 = this.f185889k;
                if (imageView4 == null) {
                    C89219l.m154710a("ivChooseMusic");
                }
                imageView4.setImageAlpha(127);
                TextView textView3 = this.f185890l;
                if (textView3 == null) {
                    C89219l.m154710a("tvChooseMusic");
                }
                textView3.setAlpha(0.5f);
                View view8 = this.f185893v;
                if (view8 == null) {
                    C89219l.m154710a("removeMusicView");
                }
                view8.setVisibility(8);
            } else {
                selectNonNullSubscribe(mo128297F(), C83212h.f185930a, new C20370ah(), new C83194j(this));
                LiveData<Boolean> d = mo128297F().mo128253d(1);
                if (d != null) {
                    d.observe(this, new C83195k(this));
                }
            }
        }
        selectNonNullSubscribe(mo128297F(), C83213i.f185931a, new C20370ah(), new C83201q(this));
        selectNonNullSubscribe(mo128297F(), C83219o.f185937a, new C20370ah(), new C83203s(this));
        selectNonNullSubscribe(mo128297F(), C83220p.f185938a, new C20370ah(), new C83204t(this));
        AbstractC82503a J = mo128301J();
        if (!(J == null || (a = J.mo127585a()) == null)) {
            a.observe(this, new C83205u(this));
        }
        selectNonNullSubscribe(mo128297F(), C83221q.f185939a, new C20370ah(), new C83206v(this));
        AbstractC20382b.C20383a.m38603b(this, mo128297F(), C83214j.f185932a, new C83196l(this));
        C1213t<Boolean> j = mo128297F().mo128260j();
        Activity activity = this.f52549m;
        Objects.requireNonNull(activity, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        j.observe((ActivityC0945e) activity, new C83197m(this));
        if (C65350at.m117036a()) {
            selectNonNullSubscribe(mo128297F(), C83215k.f185933a, new C20370ah(), new C83198n(this));
        }
        selectNonNullSubscribe(mo128297F(), C83216l.f185934a, new C20370ah(), new C83199o(this));
        AbstractC20382b.C20383a.m38603b(this, mo128297F(), C83217m.f185935a, new C83200p(this));
        AbstractC20382b.C20383a.m38603b(this, mo128297F(), C83218n.f185936a, new C83202r(this));
        mo128306O();
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public <S extends AbstractC20368af> AbstractC88412b subscribe(JediViewModel<S> jediViewModel, C20370ah<S> ahVar, AbstractC89183m<? super AbstractC20477i, ? super S, C89391z> mVar) {
        C89219l.m154721d(jediViewModel, "");
        C89219l.m154721d(ahVar, "");
        C89219l.m154721d(mVar, "");
        return AbstractC20382b.C20383a.m38583a(this, jediViewModel, ahVar, mVar);
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
