package com.p2082ss.android.ugc.aweme.ftc.components.sticker.text;

import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.AbstractC1214u;
import androidx.lifecycle.C1175ad;
import androidx.lifecycle.C1181ae;
import androidx.lifecycle.LiveData;
import com.bytedance.covode.number.Covode;
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
import com.bytedance.jedi.arch.C20524n;
import com.bytedance.jedi.arch.C20526p;
import com.bytedance.jedi.arch.C20531t;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.p1559o.AbstractC21566a;
import com.bytedance.p1559o.C21582f;
import com.bytedance.p1559o.p1561b.C21572a;
import com.bytedance.p969f.p970a.p971a.AbstractC14552j;
import com.bytedance.p969f.p970a.p971a.C14544f;
import com.p2082ss.android.ugc.asve.editor.AbstractC31071f;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.editSticker.C45866d;
import com.p2082ss.android.ugc.aweme.editSticker.interact.AbstractC45899e;
import com.p2082ss.android.ugc.aweme.editSticker.interact.p2884a.AbstractC45895b;
import com.p2082ss.android.ugc.aweme.editSticker.interact.view.AbstractC45913a;
import com.p2082ss.android.ugc.aweme.editSticker.interact.view.AbstractC45920e;
import com.p2082ss.android.ugc.aweme.editSticker.model.InfoStickerModel;
import com.p2082ss.android.ugc.aweme.editSticker.model.StickerItemModel;
import com.p2082ss.android.ugc.aweme.editSticker.p2880d.AbstractC45872e;
import com.p2082ss.android.ugc.aweme.editSticker.p2883f.C45883b;
import com.p2082ss.android.ugc.aweme.editSticker.p2883f.C45889g;
import com.p2082ss.android.ugc.aweme.editSticker.text.bean.C46110t;
import com.p2082ss.android.ugc.aweme.editSticker.text.bean.InnerEffectTextLayoutConfig;
import com.p2082ss.android.ugc.aweme.editSticker.text.bean.TextStickerData;
import com.p2082ss.android.ugc.aweme.editSticker.text.bean.TextStickerTextWrap;
import com.p2082ss.android.ugc.aweme.editSticker.text.p2885a.C45989b;
import com.p2082ss.android.ugc.aweme.editSticker.text.p2886b.AbstractC46045a;
import com.p2082ss.android.ugc.aweme.editSticker.text.p2887c.AbstractC46118d;
import com.p2082ss.android.ugc.aweme.editSticker.text.p2887c.AbstractC46119e;
import com.p2082ss.android.ugc.aweme.editSticker.text.p2887c.AbstractC46120f;
import com.p2082ss.android.ugc.aweme.editSticker.text.p2887c.C46123i;
import com.p2082ss.android.ugc.aweme.editSticker.text.view.C46224i;
import com.p2082ss.android.ugc.aweme.editSticker.text.view.C46239q;
import com.p2082ss.android.ugc.aweme.ftc.C52534f;
import com.p2082ss.android.ugc.aweme.ftc.components.sticker.hint.C52215a;
import com.p2082ss.android.ugc.aweme.ftc.components.sticker.hint.FTCStickerHintTextViewModel;
import com.p2082ss.android.ugc.aweme.ftc.components.sticker.text.p3031a.C52310a;
import com.p2082ss.android.ugc.aweme.shortvideo.C70747dv;
import com.p2082ss.android.ugc.aweme.shortvideo.SafeHandler;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p2082ss.android.ugc.aweme.story.p4047g.p4052c.p4053a.C77268b;
import com.p2082ss.android.ugc.tools.p4344f.C84425b;
import com.p2082ss.android.ugc.trill.R;
import com.p2082ss.android.vesdk.VESize;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4600h.C89378p;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4612a.AbstractC89187q;
import p4600h.p4611f.p4612a.AbstractC89188r;
import p4600h.p4611f.p4612a.AbstractC89189s;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89232y;
import p4600h.p4616h.AbstractC89248d;
import p4600h.p4620k.AbstractC89286i;
import p4600h.p4620k.AbstractC89290k;

/* renamed from: com.ss.android.ugc.aweme.ftc.components.sticker.text.c */
public class C52314c implements AbstractC20382b, AbstractC21566a, C77268b.AbstractC77269a {

    /* renamed from: a */
    static final /* synthetic */ AbstractC89286i[] f120532a = {new C89232y(C52314c.class, "publishEditModel", "getPublishEditModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0)};

    /* renamed from: u */
    public static final C52315a f120533u = new C52315a((byte) 0);

    /* renamed from: A */
    private int f120534A;

    /* renamed from: B */
    private boolean f120535B;

    /* renamed from: C */
    private boolean f120536C;

    /* renamed from: D */
    private C89378p<Integer, Integer> f120537D;

    /* renamed from: E */
    private final C21582f f120538E;

    /* renamed from: F */
    private final ActivityC0945e f120539F;

    /* renamed from: G */
    private final AbstractC14552j f120540G;

    /* renamed from: H */
    private final C46224i f120541H;

    /* renamed from: I */
    private final AbstractC52360s f120542I;

    /* renamed from: J */
    private final int f120543J;

    /* renamed from: b */
    protected FTCEditTextStickerViewModel f120544b;

    /* renamed from: c */
    public FTCStickerHintTextViewModel f120545c;

    /* renamed from: d */
    View f120546d;

    /* renamed from: e */
    public C46239q f120547e;

    /* renamed from: f */
    public AbstractC46119e f120548f;

    /* renamed from: g */
    public AbstractC45895b f120549g;

    /* renamed from: h */
    public AbstractC89172b<? super C46239q, C89391z> f120550h;

    /* renamed from: i */
    public AbstractC46120f f120551i;

    /* renamed from: j */
    public AbstractC45872e f120552j;

    /* renamed from: k */
    public final C52534f f120553k;

    /* renamed from: l */
    public AbstractC89183m<? super C46239q, ? super C46239q, C89391z> f120554l;

    /* renamed from: m */
    public AbstractC46118d f120555m;

    /* renamed from: n */
    protected SafeHandler f120556n;

    /* renamed from: o */
    public long f120557o;

    /* renamed from: p */
    public final FrameLayout f120558p;

    /* renamed from: q */
    public final AbstractC45899e f120559q;

    /* renamed from: r */
    public final LiveData<AbstractC31071f> f120560r;

    /* renamed from: s */
    public Rect f120561s;

    /* renamed from: t */
    public AbstractC45920e f120562t;

    /* renamed from: v */
    private final AbstractC89248d f120563v;

    /* renamed from: w */
    private C77268b f120564w;

    /* renamed from: x */
    private C52310a f120565x;

    /* renamed from: y */
    private Runnable f120566y;

    /* renamed from: z */
    private int f120567z;

    static {
        Covode.recordClassIndex(61704);
    }

    /* renamed from: b */
    public final VideoPublishEditModel mo88107b() {
        return (VideoPublishEditModel) this.f120563v.mo23374a(this, f120532a[0]);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public boolean getUniqueOnlyGlobal() {
        return true;
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.components.sticker.text.c$a */
    public static final class C52315a {
        static {
            Covode.recordClassIndex(61705);
        }

        private C52315a() {
        }

        public /* synthetic */ C52315a(byte b) {
            this();
        }
    }

    @Override // com.bytedance.p1559o.AbstractC21566a
    public C21582f getDiContainer() {
        return this.f120538E;
    }

    /* Return type fixed from 'com.bytedance.jedi.arch.g' to match base method */
    @Override // com.bytedance.jedi.arch.AbstractC20367ae
    public /* bridge */ /* synthetic */ AbstractC20477i getReceiver() {
        return this;
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.components.sticker.text.c$y */
    public static final class RunnableC52339y implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C52314c f120594a;

        /* renamed from: b */
        private int f120595b = -1;

        /* renamed from: c */
        private Runnable f120596c = new RunnableC52340a(this);

        static {
            Covode.recordClassIndex(61729);
        }

        /* renamed from: com.ss.android.ugc.aweme.ftc.components.sticker.text.c$y$a */
        static final class RunnableC52340a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ RunnableC52339y f120597a;

            static {
                Covode.recordClassIndex(61730);
            }

            RunnableC52340a(RunnableC52339y yVar) {
                this.f120597a = yVar;
            }

            public final void run() {
                int i = Build.VERSION.SDK_INT;
            }
        }

        public final void run() {
            AbstractC31071f value;
            int k;
            Runnable runnable = this.f120596c;
            if (runnable != null) {
                runnable.run();
                this.f120596c = null;
            }
            this.f120594a.mo88109c().postDelayed(this, 16);
            LiveData<AbstractC31071f> liveData = this.f120594a.f120560r;
            if (!(liveData == null || (value = liveData.getValue()) == null || !this.f120594a.mo88102a().mo88061l() || (k = value.mo56370k()) == this.f120595b)) {
                this.f120595b = k;
                long j = (long) k;
                for (C46239q qVar : this.f120594a.mo88102a().f120487a) {
                    qVar.setPlayPosition(j);
                    qVar.mo78581o();
                }
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        RunnableC52339y(C52314c cVar) {
            this.f120594a = cVar;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.ftc.components.sticker.text.c$c */
    public static final class RunnableC52317c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C46239q f120570a;

        static {
            Covode.recordClassIndex(61707);
        }

        RunnableC52317c(C46239q qVar) {
            this.f120570a = qVar;
        }

        public final void run() {
            this.f120570a.setShowHelpBox(true);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.components.sticker.text.c$f */
    public static final class C52320f implements C46224i.AbstractC46231c {

        /* renamed from: a */
        final /* synthetic */ C46224i f120574a;

        /* renamed from: b */
        final /* synthetic */ C52314c f120575b;

        static {
            Covode.recordClassIndex(61710);
        }

        @Override // com.p2082ss.android.ugc.aweme.editSticker.text.view.C46224i.AbstractC46231c
        /* renamed from: a */
        public final void mo77582a() {
            C52314c cVar = this.f120575b;
            cVar.mo88104a(cVar.f120547e);
        }

        @Override // com.p2082ss.android.ugc.aweme.editSticker.text.view.C46224i.AbstractC46231c
        /* renamed from: b */
        public final void mo77583b() {
            this.f120574a.mo78325c();
        }

        C52320f(C46224i iVar, C52314c cVar) {
            this.f120574a = iVar;
            this.f120575b = cVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.components.sticker.text.c$i */
    static final class C52323i implements C46224i.AbstractC46230b {

        /* renamed from: a */
        final /* synthetic */ C46224i f120578a;

        static {
            Covode.recordClassIndex(61713);
        }

        C52323i(C46224i iVar) {
            this.f120578a = iVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.editSticker.text.view.C46224i.AbstractC46230b
        /* renamed from: a */
        public final void mo77584a() {
            this.f120578a.mo78325c();
        }
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

    /* renamed from: com.ss.android.ugc.aweme.ftc.components.sticker.text.c$d */
    public static final class C52318d implements AbstractC46045a {

        /* renamed from: a */
        final /* synthetic */ C52314c f120571a;

        static {
            Covode.recordClassIndex(61708);
        }

        @Override // com.p2082ss.android.ugc.aweme.editSticker.text.p2886b.AbstractC46045a
        /* renamed from: a */
        public final boolean mo77579a() {
            return this.f120571a.mo88102a().mo88055f();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C52318d(C52314c cVar) {
            this.f120571a = cVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.components.sticker.text.c$e */
    public static final class C52319e implements AbstractC46120f {

        /* renamed from: a */
        final /* synthetic */ C46224i f120572a;

        /* renamed from: b */
        final /* synthetic */ C52314c f120573b;

        static {
            Covode.recordClassIndex(61709);
        }

        @Override // com.p2082ss.android.ugc.aweme.editSticker.text.p2887c.AbstractC46120f
        /* renamed from: a */
        public final void mo77580a() {
            AbstractC46120f fVar = this.f120573b.f120551i;
            if (fVar != null) {
                fVar.mo77580a();
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.editSticker.text.p2887c.AbstractC46120f
        /* renamed from: b */
        public final void mo77581b() {
            AbstractC46120f fVar = this.f120573b.f120551i;
            if (fVar != null) {
                fVar.mo77581b();
            }
            C46239q qVar = this.f120573b.f120547e;
            if (qVar != null) {
                qVar.mo78577k();
            }
            this.f120572a.mo78325c();
        }

        C52319e(C46224i iVar, C52314c cVar) {
            this.f120572a = iVar;
            this.f120573b = cVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.components.sticker.text.c$h */
    static final class C52322h implements AbstractC45895b {

        /* renamed from: a */
        final /* synthetic */ C52314c f120577a;

        static {
            Covode.recordClassIndex(61712);
        }

        C52322h(C52314c cVar) {
            this.f120577a = cVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.editSticker.interact.p2884a.AbstractC45895b
        /* renamed from: a */
        public final void mo77270a() {
            this.f120577a.mo88102a().f120490d.mo6999a(C89391z.f203057a);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final FTCEditTextStickerViewModel mo88102a() {
        FTCEditTextStickerViewModel fTCEditTextStickerViewModel = this.f120544b;
        if (fTCEditTextStickerViewModel == null) {
            C89219l.m154710a("textStickerViewModel");
        }
        return fTCEditTextStickerViewModel;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final SafeHandler mo88109c() {
        SafeHandler safeHandler = this.f120556n;
        if (safeHandler == null) {
            C89219l.m154710a("safeHandler");
        }
        return safeHandler;
    }

    /* renamed from: e */
    public final void mo88111e() {
        FTCEditTextStickerViewModel fTCEditTextStickerViewModel = this.f120544b;
        if (fTCEditTextStickerViewModel == null) {
            C89219l.m154710a("textStickerViewModel");
        }
        fTCEditTextStickerViewModel.f120487a.clear();
    }

    @Override // androidx.lifecycle.AbstractC1204m
    public AbstractC1196i getLifecycle() {
        AbstractC1196i lifecycle = this.f120539F.getLifecycle();
        C89219l.m154716b(lifecycle, "");
        return lifecycle;
    }

    /* renamed from: l */
    private static int m97218l() {
        C45989b a = C45989b.m88764a();
        C89219l.m154716b(a, "");
        if (a.mo77598d() <= 0) {
            return 28;
        }
        C45989b a2 = C45989b.m88764a();
        C89219l.m154716b(a2, "");
        return a2.mo77598d();
    }

    /* renamed from: j */
    public final void mo88116j() {
        AbstractC45899e eVar = this.f120559q;
        if (eVar != null) {
            eVar.mo77277b();
        }
        SafeHandler safeHandler = this.f120556n;
        if (safeHandler == null) {
            C89219l.m154710a("safeHandler");
        }
        Runnable runnable = this.f120566y;
        if (runnable == null) {
            C89219l.m154710a("mNonInfoStickerPlayingRefreshTask");
        }
        safeHandler.post(runnable);
    }

    /* renamed from: k */
    public final void mo88117k() {
        SafeHandler safeHandler = this.f120556n;
        if (safeHandler == null) {
            C89219l.m154710a("safeHandler");
        }
        Runnable runnable = this.f120566y;
        if (runnable == null) {
            C89219l.m154710a("mNonInfoStickerPlayingRefreshTask");
        }
        safeHandler.removeCallbacks(runnable);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.ftc.components.sticker.text.c$b */
    public static final class RunnableC52316b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C52314c f120568a;

        /* renamed from: b */
        final /* synthetic */ C46239q f120569b;

        static {
            Covode.recordClassIndex(61706);
        }

        RunnableC52316b(C52314c cVar, C46239q qVar) {
            this.f120568a = cVar;
            this.f120569b = qVar;
        }

        public final void run() {
            FTCStickerHintTextViewModel fTCStickerHintTextViewModel = this.f120568a.f120545c;
            if (fTCStickerHintTextViewModel == null) {
                C89219l.m154710a("hintTextViewModel");
            }
            fTCStickerHintTextViewModel.mo87921b().postValue(new C52215a(this.f120569b.getHelpRect().left + (this.f120569b.getHelpRect().width() / 2.0f), this.f120569b.getHelpRect().top, R.string.axu, 1));
        }
    }

    /* renamed from: g */
    public final void mo88113g() {
        MethodCollector.m26663i(11206);
        FTCEditTextStickerViewModel fTCEditTextStickerViewModel = this.f120544b;
        if (fTCEditTextStickerViewModel == null) {
            C89219l.m154710a("textStickerViewModel");
        }
        ListIterator<C46239q> listIterator = fTCEditTextStickerViewModel.f120487a.listIterator();
        while (listIterator.hasNext()) {
            C46239q next = listIterator.next();
            this.f120558p.removeView(next);
            listIterator.remove();
            AbstractC46119e eVar = this.f120548f;
            if (eVar != null) {
                eVar.mo78308a(next);
            }
        }
        this.f120547e = null;
        MethodCollector.m26664o(11206);
    }

    /* renamed from: i */
    public final void mo88115i() {
        View view;
        View view2;
        FTCEditTextStickerViewModel fTCEditTextStickerViewModel = this.f120544b;
        if (fTCEditTextStickerViewModel == null) {
            C89219l.m154710a("textStickerViewModel");
        }
        if (!fTCEditTextStickerViewModel.mo88066q() || (view2 = this.f120546d) == null || view2.getVisibility() != 8) {
            View view3 = this.f120546d;
            if (view3 != null && view3.getVisibility() == 0 && (view = this.f120546d) != null) {
                view.setVisibility(8);
                return;
            }
            return;
        }
        View view4 = this.f120546d;
        if (view4 != null) {
            view4.setVisibility(0);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.components.sticker.text.c$g */
    public static final class C52321g implements AbstractC46120f {

        /* renamed from: a */
        final /* synthetic */ C52314c f120576a;

        static {
            Covode.recordClassIndex(61711);
        }

        @Override // com.p2082ss.android.ugc.aweme.editSticker.text.p2887c.AbstractC46120f
        /* renamed from: a */
        public final void mo77580a() {
            View view;
            this.f120576a.mo88102a().f120491e.mo6999a(new C89378p<>(false, false));
            C52314c cVar = this.f120576a;
            View view2 = cVar.f120546d;
            if (!(view2 == null || view2.getVisibility() != 0 || (view = cVar.f120546d) == null)) {
                view.setVisibility(8);
            }
            VideoPublishEditModel b = this.f120576a.mo88107b();
            C89219l.m154721d(b, "");
            C84425b a = new C84425b().mo129406a("creation_id", b.creationId).mo129406a("group_id", C70747dv.m124972a());
            if (b.draftId != 0) {
                a.mo129403a("draft_id", b.draftId);
            }
            C39162r.m79460a("click_text_entrance", a.f188764a);
        }

        @Override // com.p2082ss.android.ugc.aweme.editSticker.text.p2887c.AbstractC46120f
        /* renamed from: b */
        public final void mo77581b() {
            this.f120576a.mo88102a().f120491e.mo6999a(new C89378p<>(true, false));
            this.f120576a.mo88115i();
            VideoPublishEditModel b = this.f120576a.mo88107b();
            C89219l.m154721d(b, "");
            C84425b a = new C84425b().mo129406a("creation_id", b.creationId).mo129406a("group_id", C70747dv.m124972a());
            if (b.draftId != 0) {
                a.mo129403a("draft_id", b.draftId);
            }
            C39162r.m79460a("text_complete", a.f188764a);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C52321g(C52314c cVar) {
            this.f120576a = cVar;
        }
    }

    /* renamed from: m */
    private final void m97219m() {
        AbstractC45920e eVar;
        View contentView;
        MethodCollector.m26663i(11676);
        ViewGroup.LayoutParams layoutParams = this.f120558p.getLayoutParams();
        this.f120561s = new Rect(0, 0, layoutParams.width, layoutParams.height);
        AbstractC45920e eVar2 = this.f120562t;
        if (!(eVar2 == null || (contentView = eVar2.getContentView()) == null || contentView.getParent() == null)) {
            ViewParent parent = contentView.getParent();
            if (parent != null) {
                ((ViewGroup) parent).removeView(contentView);
            } else {
                NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
                MethodCollector.m26664o(11676);
                throw nullPointerException;
            }
        }
        AbstractC45913a aVar = C45866d.m88490c().f106821d;
        if (aVar != null) {
            eVar = aVar.mo77311a(this.f120539F, this.f120567z);
        } else {
            eVar = null;
        }
        this.f120562t = eVar;
        if (eVar != null) {
            this.f120558p.addView(eVar.getContentView());
            MethodCollector.m26664o(11676);
            return;
        }
        MethodCollector.m26664o(11676);
    }

    /* renamed from: f */
    public final void mo88112f() {
        InfoStickerModel a;
        List<StickerItemModel> list;
        AbstractC31071f value;
        VESize b;
        FTCEditTextStickerViewModel fTCEditTextStickerViewModel = this.f120544b;
        if (fTCEditTextStickerViewModel == null) {
            C89219l.m154710a("textStickerViewModel");
        }
        boolean z = !fTCEditTextStickerViewModel.mo88061l();
        boolean z2 = false;
        AbstractC52360s sVar = this.f120542I;
        if (sVar != null && (a = sVar.mo87918a()) != null && (list = a.stickers) != null) {
            Iterator<StickerItemModel> it = list.iterator();
            while (it.hasNext()) {
                StickerItemModel next = it.next();
                if (next.type == 2) {
                    if (z) {
                        if (!z2) {
                            C89378p<Integer, Integer> pVar = null;
                            LiveData<AbstractC31071f> liveData = this.f120560r;
                            if (!(liveData == null || (value = liveData.getValue()) == null || (b = value.mo56330b()) == null)) {
                                pVar = new C89378p<>(Integer.valueOf(b.width), Integer.valueOf(b.height));
                            }
                            mo88106a(pVar);
                            z2 = true;
                        }
                        TextStickerData textStickerData = (TextStickerData) C45866d.m88489b().mo46670a(next.extra, TextStickerData.class);
                        if (textStickerData != null) {
                            FTCEditTextStickerViewModel fTCEditTextStickerViewModel2 = this.f120544b;
                            if (fTCEditTextStickerViewModel2 == null) {
                                C89219l.m154710a("textStickerViewModel");
                            }
                            fTCEditTextStickerViewModel2.mo88043a(textStickerData);
                        }
                    }
                    it.remove();
                }
            }
        }
    }

    /* renamed from: h */
    public final void mo88114h() {
        C89378p<Integer, Integer> pVar = this.f120537D;
        if (pVar != null && pVar.getFirst().intValue() != 0 && pVar.getSecond().intValue() != 0) {
            int[] a = C45889g.m88533a(this.f120558p, pVar.getFirst().intValue(), pVar.getSecond().intValue());
            this.f120567z = a[0];
            this.f120534A = a[1];
            m97219m();
        }
    }

    /* renamed from: d */
    public final void mo88110d() {
        C45989b.m88764a().mo77590a(this.f120558p.getContext());
        ActivityC0945e eVar = this.f120539F;
        JediViewModel a = C20531t.m38716a(eVar).mo33800a(FTCEditTextStickerViewModel.class);
        C89219l.m154716b(a, "");
        this.f120544b = (FTCEditTextStickerViewModel) a;
        AbstractC1174ac a2 = C1181ae.m3881a(eVar, (C1175ad.AbstractC1177b) null).mo3983a(FTCStickerHintTextViewModel.class);
        C89219l.m154716b(a2, "");
        this.f120545c = (FTCStickerHintTextViewModel) a2;
        this.f120556n = new SafeHandler(this.f120539F);
        FTCEditTextStickerViewModel fTCEditTextStickerViewModel = this.f120544b;
        if (fTCEditTextStickerViewModel == null) {
            C89219l.m154710a("textStickerViewModel");
        }
        this.f120565x = new C52310a(fTCEditTextStickerViewModel);
        AbstractC14552j jVar = this.f120540G;
        C52310a aVar = this.f120565x;
        if (aVar == null) {
            C89219l.m154710a("gestureListener");
        }
        jVar.mo23383a(new C14544f(200, aVar));
        C77268b bVar = new C77268b(this.f120539F, null);
        bVar.mo120871a(this);
        this.f120564w = bVar;
        AbstractC45899e eVar2 = this.f120559q;
        if (eVar2 != null) {
            eVar2.mo77276a();
        }
        FTCEditTextStickerViewModel fTCEditTextStickerViewModel2 = this.f120544b;
        if (fTCEditTextStickerViewModel2 == null) {
            C89219l.m154710a("textStickerViewModel");
        }
        fTCEditTextStickerViewModel2.mo88064o().observe(this.f120539F, new C52324j(this));
        FTCEditTextStickerViewModel fTCEditTextStickerViewModel3 = this.f120544b;
        if (fTCEditTextStickerViewModel3 == null) {
            C89219l.m154710a("textStickerViewModel");
        }
        AbstractC89290k kVar = C52346g.f120603a;
        C20370ah ahVar = new C20370ah();
        ahVar.f48250a = true;
        selectSubscribe(fTCEditTextStickerViewModel3, kVar, ahVar, new C52335u(this));
        FTCEditTextStickerViewModel fTCEditTextStickerViewModel4 = this.f120544b;
        if (fTCEditTextStickerViewModel4 == null) {
            C89219l.m154710a("textStickerViewModel");
        }
        AbstractC89290k kVar2 = C52355p.f120612a;
        C20370ah ahVar2 = new C20370ah();
        ahVar2.f48250a = true;
        subscribeEvent(fTCEditTextStickerViewModel4, kVar2, ahVar2, new C52338x(this));
        FTCEditTextStickerViewModel fTCEditTextStickerViewModel5 = this.f120544b;
        if (fTCEditTextStickerViewModel5 == null) {
            C89219l.m154710a("textStickerViewModel");
        }
        AbstractC89290k kVar3 = C52356q.f120613a;
        C20370ah ahVar3 = new C20370ah();
        ahVar3.f48250a = true;
        selectSubscribe(fTCEditTextStickerViewModel5, kVar3, ahVar3, new C52325k(this));
        FTCEditTextStickerViewModel fTCEditTextStickerViewModel6 = this.f120544b;
        if (fTCEditTextStickerViewModel6 == null) {
            C89219l.m154710a("textStickerViewModel");
        }
        AbstractC89290k kVar4 = C52343d.f120600a;
        C20370ah ahVar4 = new C20370ah();
        ahVar4.f48250a = true;
        selectSubscribe(fTCEditTextStickerViewModel6, kVar4, ahVar4, new C52326l(this));
        FTCEditTextStickerViewModel fTCEditTextStickerViewModel7 = this.f120544b;
        if (fTCEditTextStickerViewModel7 == null) {
            C89219l.m154710a("textStickerViewModel");
        }
        AbstractC89290k kVar5 = C52344e.f120601a;
        C20370ah ahVar5 = new C20370ah();
        ahVar5.f48250a = true;
        selectSubscribe(fTCEditTextStickerViewModel7, kVar5, ahVar5, new C52327m(this));
        FTCEditTextStickerViewModel fTCEditTextStickerViewModel8 = this.f120544b;
        if (fTCEditTextStickerViewModel8 == null) {
            C89219l.m154710a("textStickerViewModel");
        }
        AbstractC89290k kVar6 = C52345f.f120602a;
        C20370ah ahVar6 = new C20370ah();
        ahVar6.f48250a = true;
        selectSubscribe(fTCEditTextStickerViewModel8, kVar6, ahVar6, new C52328n(this));
        FTCEditTextStickerViewModel fTCEditTextStickerViewModel9 = this.f120544b;
        if (fTCEditTextStickerViewModel9 == null) {
            C89219l.m154710a("textStickerViewModel");
        }
        AbstractC89290k kVar7 = C52347h.f120604a;
        C20370ah ahVar7 = new C20370ah();
        ahVar7.f48250a = true;
        selectSubscribe(fTCEditTextStickerViewModel9, kVar7, ahVar7, new C52329o(this));
        FTCEditTextStickerViewModel fTCEditTextStickerViewModel10 = this.f120544b;
        if (fTCEditTextStickerViewModel10 == null) {
            C89219l.m154710a("textStickerViewModel");
        }
        AbstractC89290k kVar8 = C52348i.f120605a;
        C20370ah ahVar8 = new C20370ah();
        ahVar8.f48250a = true;
        selectSubscribe(fTCEditTextStickerViewModel10, kVar8, ahVar8, new C52330p(this));
        FTCEditTextStickerViewModel fTCEditTextStickerViewModel11 = this.f120544b;
        if (fTCEditTextStickerViewModel11 == null) {
            C89219l.m154710a("textStickerViewModel");
        }
        AbstractC89290k kVar9 = C52349j.f120606a;
        C20370ah ahVar9 = new C20370ah();
        ahVar9.f48250a = true;
        subscribeEvent(fTCEditTextStickerViewModel11, kVar9, ahVar9, new C52331q(this));
        FTCEditTextStickerViewModel fTCEditTextStickerViewModel12 = this.f120544b;
        if (fTCEditTextStickerViewModel12 == null) {
            C89219l.m154710a("textStickerViewModel");
        }
        AbstractC89290k kVar10 = C52350k.f120607a;
        C20370ah ahVar10 = new C20370ah();
        ahVar10.f48250a = true;
        selectSubscribe(fTCEditTextStickerViewModel12, kVar10, ahVar10, new C52332r(this));
        FTCEditTextStickerViewModel fTCEditTextStickerViewModel13 = this.f120544b;
        if (fTCEditTextStickerViewModel13 == null) {
            C89219l.m154710a("textStickerViewModel");
        }
        AbstractC89290k kVar11 = C52351l.f120608a;
        C20370ah ahVar11 = new C20370ah();
        ahVar11.f48250a = true;
        selectSubscribe(fTCEditTextStickerViewModel13, kVar11, ahVar11, new C52333s(this));
        FTCEditTextStickerViewModel fTCEditTextStickerViewModel14 = this.f120544b;
        if (fTCEditTextStickerViewModel14 == null) {
            C89219l.m154710a("textStickerViewModel");
        }
        AbstractC89290k kVar12 = C52352m.f120609a;
        C20370ah ahVar12 = new C20370ah();
        ahVar12.f48250a = true;
        selectSubscribe(fTCEditTextStickerViewModel14, kVar12, ahVar12, new C52334t(this));
        FTCEditTextStickerViewModel fTCEditTextStickerViewModel15 = this.f120544b;
        if (fTCEditTextStickerViewModel15 == null) {
            C89219l.m154710a("textStickerViewModel");
        }
        AbstractC89290k kVar13 = C52353n.f120610a;
        C20370ah ahVar13 = new C20370ah();
        ahVar13.f48250a = true;
        subscribeEvent(fTCEditTextStickerViewModel15, kVar13, ahVar13, new C52336v(this));
        FTCEditTextStickerViewModel fTCEditTextStickerViewModel16 = this.f120544b;
        if (fTCEditTextStickerViewModel16 == null) {
            C89219l.m154710a("textStickerViewModel");
        }
        AbstractC89290k kVar14 = C52354o.f120611a;
        C20370ah ahVar14 = new C20370ah();
        ahVar14.f48250a = true;
        subscribeEvent(fTCEditTextStickerViewModel16, kVar14, ahVar14, new C52337w(this));
        this.f120551i = new C52321g(this);
        this.f120549g = new C52322h(this);
        C46224i iVar = this.f120541H;
        iVar.setInputLayoutShowListener(new C52319e(iVar, this));
        iVar.setTextStickerUpdateListener(new C52323i(iVar));
        iVar.setVisibleController(new C52320f(iVar, this));
        mo88112f();
        this.f120566y = new RunnableC52339y(this);
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.components.sticker.text.c$z */
    public static final class C52342z implements AbstractC46118d {

        /* renamed from: a */
        final /* synthetic */ C52314c f120599a;

        static {
            Covode.recordClassIndex(61732);
        }

        @Override // com.p2082ss.android.ugc.aweme.editSticker.text.p2887c.AbstractC46118d
        /* renamed from: b */
        public final void mo77569b(C46239q qVar) {
            C89219l.m154721d(qVar, "");
        }

        @Override // com.p2082ss.android.ugc.aweme.editSticker.text.p2887c.AbstractC46118d
        /* renamed from: c */
        public final void mo77570c(C46239q qVar) {
            C89219l.m154721d(qVar, "");
        }

        @Override // com.p2082ss.android.ugc.aweme.editSticker.text.p2887c.AbstractC46118d
        /* renamed from: d */
        public final void mo77571d(C46239q qVar) {
            C89219l.m154721d(qVar, "");
        }

        @Override // com.p2082ss.android.ugc.aweme.editSticker.text.p2887c.AbstractC46118d
        /* renamed from: e */
        public final void mo77572e(C46239q qVar) {
            C89219l.m154721d(qVar, "");
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C52342z(C52314c cVar) {
            this.f120599a = cVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.editSticker.text.p2887c.AbstractC46118d
        /* renamed from: a */
        public final float mo77563a(float f) {
            AbstractC45920e eVar = this.f120599a.f120562t;
            if (eVar != null) {
                return eVar.mo77312a(f);
            }
            return f;
        }

        @Override // com.p2082ss.android.ugc.aweme.editSticker.text.p2887c.AbstractC46118d
        /* renamed from: a */
        public final void mo77566a(C46239q qVar) {
            C89219l.m154721d(qVar, "");
            this.f120599a.mo88102a().mo88050a(true);
            this.f120599a.mo88102a().mo88060k();
            AbstractC89172b<? super C46239q, C89391z> bVar = this.f120599a.f120550h;
            if (bVar != null) {
                bVar.invoke(qVar);
            }
            AbstractC45872e eVar = this.f120599a.f120552j;
            if (eVar != null) {
                eVar.mo77234b();
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.editSticker.text.p2887c.AbstractC46118d
        /* renamed from: a */
        public final void mo77568a(C46239q qVar, boolean z) {
            C89219l.m154721d(qVar, "");
            AbstractC46118d dVar = this.f120599a.f120555m;
            if (dVar != null) {
                dVar.mo77568a(qVar, z);
            }
            if (z) {
                C52314c cVar = this.f120599a;
                if (!((FTCEditTextStickerViewState) cVar.getState(cVar.mo88102a())).getInTimeEditView()) {
                    if (System.currentTimeMillis() - this.f120599a.f120557o > 500) {
                        this.f120599a.mo88102a().f120492f.mo6999a((Boolean) false);
                        this.f120599a.f120547e = qVar;
                        this.f120599a.mo88104a(qVar);
                        if (this.f120599a.f120548f != null) {
                            AbstractC46119e eVar = this.f120599a.f120548f;
                            if (eVar == null) {
                                C89219l.m154715b();
                            }
                            eVar.mo78311c(qVar);
                        }
                        this.f120599a.f120557o = System.currentTimeMillis();
                        AbstractC45872e eVar2 = this.f120599a.f120552j;
                        if (eVar2 != null) {
                            eVar2.mo77232a();
                            return;
                        }
                        return;
                    }
                    return;
                }
            }
            if (this.f120599a.f120549g != null) {
                AbstractC45895b bVar = this.f120599a.f120549g;
                if (bVar == null) {
                    C89219l.m154715b();
                }
                bVar.mo77270a();
                if (this.f120599a.f120547e != null) {
                    C52314c cVar2 = this.f120599a;
                    cVar2.mo88108b(cVar2.f120547e);
                }
            }
            this.f120599a.mo88102a().mo88060k();
        }

        @Override // com.p2082ss.android.ugc.aweme.editSticker.text.p2887c.AbstractC46118d
        /* renamed from: a */
        public final int mo77564a(C46239q qVar, boolean z, boolean z2) {
            C89219l.m154721d(qVar, "");
            AbstractC45920e eVar = this.f120599a.f120562t;
            if (eVar == null) {
                return -1;
            }
            if (!z) {
                return eVar.mo77313a(qVar.getAnglePointListForBlock(), z2);
            }
            eVar.mo77320b();
            return -1;
        }

        @Override // com.p2082ss.android.ugc.aweme.editSticker.text.p2887c.AbstractC46118d
        /* renamed from: a */
        public final PointF mo77565a(C46239q qVar, float f, float f2) {
            C89219l.m154721d(qVar, "");
            AbstractC45920e eVar = this.f120599a.f120562t;
            if (eVar == null) {
                return new PointF(0.0f, 0.0f);
            }
            PointF[] anglePointList = qVar.getAnglePointList();
            for (PointF pointF : anglePointList) {
                pointF.x += f;
                pointF.y += f2;
            }
            return eVar.mo77316a(anglePointList, f, f2);
        }

        @Override // com.p2082ss.android.ugc.aweme.editSticker.text.p2887c.AbstractC46118d
        /* renamed from: a */
        public final void mo77567a(C46239q qVar, RectF rectF, C46123i iVar) {
            C89219l.m154721d(qVar, "");
            C89219l.m154721d(rectF, "");
            C89219l.m154721d(iVar, "");
            if (!iVar.f107377c) {
                this.f120599a.mo88108b(qVar);
            }
            if (!iVar.f107378d && !iVar.f107379e) {
                boolean a = C45883b.m88524a(this.f120599a.f120561s, qVar.getAnglePointList());
                AbstractC45899e eVar = this.f120599a.f120559q;
                if (eVar != null) {
                    this.f120599a.mo88105a(qVar, eVar.mo77275a(iVar.f107375a, iVar.f107376b, iVar.f107377c, a));
                }
            }
            if (this.f120599a.f120559q != null) {
                qVar.setAlpha(1.0f);
            }
            AbstractC46119e eVar2 = this.f120599a.f120548f;
            if (eVar2 != null) {
                eVar2.mo78309a(qVar, new C46123i(iVar.f107375a, iVar.f107376b, iVar.f107377c, iVar.f107378d, iVar.f107379e));
            }
        }
    }

    @Override // com.bytedance.jedi.arch.AbstractC20382b
    public <VM1 extends JediViewModel<S1>, S1 extends AbstractC20368af> S1 getState(VM1 vm1) {
        C89219l.m154721d(vm1, "");
        return (S1) AbstractC20382b.C20383a.m38582a(this, vm1);
    }

    @Override // com.p2082ss.android.ugc.aweme.story.p4047g.p4052c.p4053a.C77268b.AbstractC77269a
    /* renamed from: a */
    public final void mo77523a(int i) {
        if (this.f120536C) {
            C46239q qVar = this.f120547e;
            if (qVar != null) {
                qVar.mo78578l();
            }
            this.f120541H.mo78497g();
            this.f120541H.mo78487a(i);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.story.p4047g.p4052c.p4053a.C77268b.AbstractC77269a
    /* renamed from: c */
    public final void mo77540c(int i) {
        if (this.f120541H.mo78513i()) {
            this.f120541H.mo78491b(i);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.components.sticker.text.c$j */
    static final class C52324j<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ C52314c f120579a;

        static {
            Covode.recordClassIndex(61714);
        }

        C52324j(C52314c cVar) {
            this.f120579a = cVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            C89378p pVar = (C89378p) obj;
            if (pVar != null) {
                FTCEditTextStickerViewModel a = this.f120579a.mo88102a();
                float floatValue = ((Number) pVar.getFirst()).floatValue();
                boolean booleanValue = ((Boolean) pVar.getSecond()).booleanValue();
                for (C46239q qVar : a.f120487a) {
                    qVar.mo78534a(floatValue, booleanValue);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo88106a(C89378p<Integer, Integer> pVar) {
        if (pVar != null && this.f120537D == null) {
            this.f120537D = pVar;
            mo88114h();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo88104a(C46239q qVar) {
        this.f120536C = true;
        if (qVar == null) {
            C46224i iVar = this.f120541H;
            FTCEditTextStickerViewModel fTCEditTextStickerViewModel = this.f120544b;
            if (fTCEditTextStickerViewModel == null) {
                C89219l.m154710a("textStickerViewModel");
            }
            iVar.mo78489a("", "", fTCEditTextStickerViewModel.mo88065p());
            this.f120547e = null;
            return;
        }
        C46224i iVar2 = this.f120541H;
        List<TextStickerTextWrap> textWrapList = qVar.getTextWrapList();
        int curMode = qVar.getCurMode();
        int curColor = qVar.getCurColor();
        int curAlignTxt = qVar.getCurAlignTxt();
        String curFontType = qVar.getCurFontType();
        TextStickerData data = qVar.getData();
        if (data == null) {
            C89219l.m154715b();
        }
        int fontSize = data.getFontSize();
        FTCEditTextStickerViewModel fTCEditTextStickerViewModel2 = this.f120544b;
        if (fTCEditTextStickerViewModel2 == null) {
            C89219l.m154710a("textStickerViewModel");
        }
        iVar2.mo78323a(textWrapList, curMode, curColor, curAlignTxt, curFontType, false, fontSize, fTCEditTextStickerViewModel2.mo88065p());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x006b, code lost:
        if (r2 != r7) goto L_0x0042;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo88108b(com.p2082ss.android.ugc.aweme.editSticker.text.view.C46239q r7) {
        /*
        // Method dump skipped, instructions count: 118
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.ftc.components.sticker.text.C52314c.mo88108b(com.ss.android.ugc.aweme.editSticker.text.view.q):void");
    }

    @Override // com.p2082ss.android.ugc.aweme.story.p4047g.p4052c.p4053a.C77268b.AbstractC77269a
    /* renamed from: b */
    public final void mo77535b(int i) {
        MethodCollector.m26663i(11837);
        if (!this.f120536C) {
            MethodCollector.m26664o(11837);
            return;
        }
        this.f120541H.mo78512h();
        List<TextStickerTextWrap> textWrapList = this.f120541H.getTextWrapList();
        C89219l.m154716b(textWrapList, "");
        InnerEffectTextLayoutConfig innerEffectTextLayoutConfig = null;
        if (C46110t.m88969e(textWrapList)) {
            C46239q qVar = this.f120547e;
            if (qVar != null) {
                qVar.getData();
                int curTxtMode = this.f120541H.getCurTxtMode();
                int curColor = this.f120541H.getCurColor();
                int alignTxt = this.f120541H.getAlignTxt();
                C45989b a = C45989b.m88764a();
                C89219l.m154716b(a, "");
                qVar.mo78536a(curTxtMode, curColor, alignTxt, a.f107109d);
                qVar.setFontSize(m97218l());
                TextStickerData data = qVar.getData();
                if (data != null) {
                    innerEffectTextLayoutConfig = data.getEffectTextLayoutConfig();
                }
                qVar.mo78544b(textWrapList, innerEffectTextLayoutConfig);
            } else {
                FTCEditTextStickerViewModel fTCEditTextStickerViewModel = this.f120544b;
                if (fTCEditTextStickerViewModel == null) {
                    C89219l.m154710a("textStickerViewModel");
                }
                if (fTCEditTextStickerViewModel.f120487a.size() >= this.f120543J) {
                    C45866d.m88492e().mo77255a(this.f120539F, R.string.cm9);
                } else {
                    int curTxtMode2 = this.f120541H.getCurTxtMode();
                    int curColor2 = this.f120541H.getCurColor();
                    int alignTxt2 = this.f120541H.getAlignTxt();
                    C45989b a2 = C45989b.m88764a();
                    C89219l.m154716b(a2, "");
                    TextStickerData textStickerData = new TextStickerData("", curTxtMode2, curColor2, alignTxt2, a2.f107109d, null, 0, 0, 0, 0, 0.0f, 0.0f, 0.0f, 0.0f, false, false, 0, null, null, 0, null, null, 0, null, null, null, null, null, false, 536870880, null);
                    Point editInputScreenCenterPoint = this.f120541H.getEditInputScreenCenterPoint();
                    C89219l.m154716b(editInputScreenCenterPoint, "");
                    textStickerData.setEditCenterPoint(editInputScreenCenterPoint);
                    textStickerData.setTextWrapList(textWrapList);
                    textStickerData.setFontSize(m97218l());
                    mo88103a(textStickerData, false);
                }
            }
        } else {
            C46239q qVar2 = this.f120547e;
            if (qVar2 != null) {
                this.f120558p.removeView(qVar2);
                FTCEditTextStickerViewModel fTCEditTextStickerViewModel2 = this.f120544b;
                if (fTCEditTextStickerViewModel2 == null) {
                    C89219l.m154710a("textStickerViewModel");
                }
                fTCEditTextStickerViewModel2.mo88046a(qVar2);
            }
            this.f120547e = null;
        }
        this.f120536C = false;
        AbstractC46120f fVar = this.f120551i;
        if (fVar != null) {
            fVar.mo77581b();
            MethodCollector.m26664o(11837);
            return;
        }
        MethodCollector.m26664o(11837);
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.components.sticker.text.c$q */
    static final class C52331q extends AbstractC89220m implements AbstractC89183m<AbstractC20382b, C89391z, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C52314c f120586a;

        static {
            Covode.recordClassIndex(61721);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C52331q(C52314c cVar) {
            super(2);
            this.f120586a = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20382b bVar, C89391z zVar) {
            C89219l.m154721d(bVar, "");
            C89219l.m154721d(zVar, "");
            this.f120586a.mo88112f();
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.components.sticker.text.c$s */
    static final class C52333s extends AbstractC89220m implements AbstractC89183m<AbstractC20477i, C20526p, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C52314c f120588a;

        static {
            Covode.recordClassIndex(61723);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C52333s(C52314c cVar) {
            super(2);
            this.f120588a = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20477i iVar, C20526p pVar) {
            C89219l.m154721d(iVar, "");
            this.f120588a.mo88114h();
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.components.sticker.text.c$v */
    static final class C52336v extends AbstractC89220m implements AbstractC89183m<AbstractC20382b, C89391z, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C52314c f120591a;

        static {
            Covode.recordClassIndex(61726);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C52336v(C52314c cVar) {
            super(2);
            this.f120591a = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20382b bVar, C89391z zVar) {
            C89219l.m154721d(bVar, "");
            C89219l.m154721d(zVar, "");
            this.f120591a.mo88113g();
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.components.sticker.text.c$w */
    static final class C52337w extends AbstractC89220m implements AbstractC89183m<AbstractC20382b, C89391z, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C52314c f120592a;

        static {
            Covode.recordClassIndex(61727);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C52337w(C52314c cVar) {
            super(2);
            this.f120592a = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20382b bVar, C89391z zVar) {
            C89219l.m154721d(bVar, "");
            C89219l.m154721d(zVar, "");
            this.f120592a.mo88115i();
            return C89391z.f203057a;
        }
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public <VM1 extends JediViewModel<S1>, S1 extends AbstractC20368af, R> R withState(VM1 vm1, AbstractC89172b<? super S1, ? extends R> bVar) {
        C89219l.m154721d(vm1, "");
        C89219l.m154721d(bVar, "");
        return (R) AbstractC20382b.C20383a.m38593a(this, vm1, bVar);
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.components.sticker.text.c$l */
    static final class C52326l extends AbstractC89220m implements AbstractC89183m<AbstractC20477i, C20391d<? extends AbstractC46119e>, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C52314c f120581a;

        static {
            Covode.recordClassIndex(61716);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C52326l(C52314c cVar) {
            super(2);
            this.f120581a = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20477i iVar, C20391d<? extends AbstractC46119e> dVar) {
            T t;
            C20391d<? extends AbstractC46119e> dVar2 = dVar;
            C89219l.m154721d(iVar, "");
            C52314c cVar = this.f120581a;
            if (dVar2 != null) {
                t = dVar2.f48283b;
            } else {
                t = null;
            }
            cVar.f120548f = t;
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.components.sticker.text.c$m */
    static final class C52327m extends AbstractC89220m implements AbstractC89183m<AbstractC20477i, C20391d<? extends AbstractC89183m<? super C46239q, ? super C46239q, ? extends C89391z>>, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C52314c f120582a;

        static {
            Covode.recordClassIndex(61717);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C52327m(C52314c cVar) {
            super(2);
            this.f120582a = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20477i iVar, C20391d<? extends AbstractC89183m<? super C46239q, ? super C46239q, ? extends C89391z>> dVar) {
            T t;
            C20391d<? extends AbstractC89183m<? super C46239q, ? super C46239q, ? extends C89391z>> dVar2 = dVar;
            C89219l.m154721d(iVar, "");
            C52314c cVar = this.f120582a;
            if (dVar2 != null) {
                t = dVar2.f48283b;
            } else {
                t = null;
            }
            cVar.f120554l = t;
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.components.sticker.text.c$n */
    static final class C52328n extends AbstractC89220m implements AbstractC89183m<AbstractC20477i, C20391d<? extends AbstractC89172b<? super C46239q, ? extends C89391z>>, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C52314c f120583a;

        static {
            Covode.recordClassIndex(61718);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C52328n(C52314c cVar) {
            super(2);
            this.f120583a = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20477i iVar, C20391d<? extends AbstractC89172b<? super C46239q, ? extends C89391z>> dVar) {
            T t;
            C20391d<? extends AbstractC89172b<? super C46239q, ? extends C89391z>> dVar2 = dVar;
            C89219l.m154721d(iVar, "");
            C52314c cVar = this.f120583a;
            if (dVar2 != null) {
                t = dVar2.f48283b;
            } else {
                t = null;
            }
            cVar.f120550h = t;
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.components.sticker.text.c$o */
    static final class C52329o extends AbstractC89220m implements AbstractC89183m<AbstractC20477i, C20391d<? extends AbstractC46118d>, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C52314c f120584a;

        static {
            Covode.recordClassIndex(61719);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C52329o(C52314c cVar) {
            super(2);
            this.f120584a = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20477i iVar, C20391d<? extends AbstractC46118d> dVar) {
            T t;
            C20391d<? extends AbstractC46118d> dVar2 = dVar;
            C89219l.m154721d(iVar, "");
            C52314c cVar = this.f120584a;
            if (dVar2 != null) {
                t = dVar2.f48283b;
            } else {
                t = null;
            }
            cVar.f120555m = t;
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.components.sticker.text.c$p */
    static final class C52330p extends AbstractC89220m implements AbstractC89183m<AbstractC20477i, C20391d<? extends AbstractC45872e>, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C52314c f120585a;

        static {
            Covode.recordClassIndex(61720);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C52330p(C52314c cVar) {
            super(2);
            this.f120585a = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20477i iVar, C20391d<? extends AbstractC45872e> dVar) {
            T t;
            C20391d<? extends AbstractC45872e> dVar2 = dVar;
            C89219l.m154721d(iVar, "");
            C52314c cVar = this.f120585a;
            if (dVar2 != null) {
                t = dVar2.f48283b;
            } else {
                t = null;
            }
            cVar.f120552j = t;
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.components.sticker.text.c$r */
    static final class C52332r extends AbstractC89220m implements AbstractC89183m<AbstractC20477i, C20391d<? extends C89378p<? extends Integer, ? extends Integer>>, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C52314c f120587a;

        static {
            Covode.recordClassIndex(61722);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C52332r(C52314c cVar) {
            super(2);
            this.f120587a = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20477i iVar, C20391d<? extends C89378p<? extends Integer, ? extends Integer>> dVar) {
            T t;
            C20391d<? extends C89378p<? extends Integer, ? extends Integer>> dVar2 = dVar;
            C89219l.m154721d(iVar, "");
            C52314c cVar = this.f120587a;
            if (dVar2 != null) {
                t = dVar2.f48283b;
            } else {
                t = null;
            }
            cVar.mo88106a((C89378p<Integer, Integer>) t);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.components.sticker.text.c$t */
    static final class C52334t extends AbstractC89220m implements AbstractC89183m<AbstractC20477i, C20391d<? extends C46239q>, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C52314c f120589a;

        static {
            Covode.recordClassIndex(61724);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C52334t(C52314c cVar) {
            super(2);
            this.f120589a = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20477i iVar, C20391d<? extends C46239q> dVar) {
            T t;
            C20391d<? extends C46239q> dVar2 = dVar;
            C89219l.m154721d(iVar, "");
            C52314c cVar = this.f120589a;
            if (dVar2 != null) {
                t = dVar2.f48283b;
            } else {
                t = null;
            }
            cVar.mo88104a((C46239q) t);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.components.sticker.text.c$u */
    static final class C52335u extends AbstractC89220m implements AbstractC89183m<AbstractC20477i, C20391d<? extends C46239q>, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C52314c f120590a;

        static {
            Covode.recordClassIndex(61725);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C52335u(C52314c cVar) {
            super(2);
            this.f120590a = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20477i iVar, C20391d<? extends C46239q> dVar) {
            T t;
            C20391d<? extends C46239q> dVar2 = dVar;
            C89219l.m154721d(iVar, "");
            C52314c cVar = this.f120590a;
            if (dVar2 != null) {
                t = dVar2.f48283b;
            } else {
                t = null;
            }
            cVar.mo88108b(t);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.components.sticker.text.c$k */
    static final class C52325k extends AbstractC89220m implements AbstractC89183m<AbstractC20477i, C20524n<TextStickerData, Boolean>, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C52314c f120580a;

        static {
            Covode.recordClassIndex(61715);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C52325k(C52314c cVar) {
            super(2);
            this.f120580a = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20477i iVar, C20524n<TextStickerData, Boolean> nVar) {
            T t;
            C20524n<TextStickerData, Boolean> nVar2 = nVar;
            C89219l.m154721d(iVar, "");
            if (!(nVar2 == null || (t = nVar2.f48283b) == null)) {
                this.f120580a.mo88103a((TextStickerData) t.getFirst(), ((Boolean) t.getSecond()).booleanValue());
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.components.sticker.text.c$x */
    static final class C52338x extends AbstractC89220m implements AbstractC89183m<AbstractC20382b, C89391z, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C52314c f120593a;

        static {
            Covode.recordClassIndex(61728);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C52338x(C52314c cVar) {
            super(2);
            this.f120593a = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20382b bVar, C89391z zVar) {
            C89219l.m154721d(bVar, "");
            C89219l.m154721d(zVar, "");
            FTCStickerHintTextViewModel fTCStickerHintTextViewModel = this.f120593a.f120545c;
            if (fTCStickerHintTextViewModel == null) {
                C89219l.m154710a("hintTextViewModel");
            }
            fTCStickerHintTextViewModel.mo87920a().postValue(true);
            return C89391z.f203057a;
        }
    }

    /* renamed from: a */
    public final void mo88103a(TextStickerData textStickerData, boolean z) {
        MethodCollector.m26663i(11359);
        this.f120541H.setData(textStickerData);
        ActivityC0945e eVar = this.f120539F;
        SafeHandler safeHandler = this.f120556n;
        if (safeHandler == null) {
            C89219l.m154710a("safeHandler");
        }
        C46239q qVar = new C46239q(eVar, safeHandler, textStickerData, true, new C52318d(this), true);
        qVar.f107763w = this.f120552j;
        FTCEditTextStickerViewModel fTCEditTextStickerViewModel = this.f120544b;
        if (fTCEditTextStickerViewModel == null) {
            C89219l.m154710a("textStickerViewModel");
        }
        C89219l.m154721d(qVar, "");
        fTCEditTextStickerViewModel.f120487a.add(0, qVar);
        qVar.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        this.f120558p.addView(qVar);
        AbstractC46119e eVar2 = this.f120548f;
        if (eVar2 != null) {
            eVar2.mo78310b(qVar);
        }
        this.f120547e = qVar;
        C89219l.m154721d(qVar, "");
        qVar.setOnEditClickListener(new C52342z(this));
        qVar.mo78535a(this.f120567z, this.f120534A);
        this.f120541H.mo78321a();
        if (!z) {
            qVar.postDelayed(new RunnableC52316b(this, qVar), 500);
        }
        if (textStickerData.getAutoSelect()) {
            qVar.post(new RunnableC52317c(qVar));
        }
        MethodCollector.m26664o(11359);
    }

    /* renamed from: a */
    public final void mo88105a(C46239q qVar, int i) {
        MethodCollector.m26663i(11519);
        if (i == 1) {
            qVar.mo78534a(0.3137255f, false);
            MethodCollector.m26664o(11519);
        } else if (i != 3) {
            if (i == 4) {
                qVar.mo78534a(0.3137255f, true);
            }
            MethodCollector.m26664o(11519);
        } else {
            this.f120558p.removeView(qVar);
            FTCEditTextStickerViewModel fTCEditTextStickerViewModel = this.f120544b;
            if (fTCEditTextStickerViewModel == null) {
                C89219l.m154710a("textStickerViewModel");
            }
            fTCEditTextStickerViewModel.mo88046a(qVar);
            this.f120547e = null;
            AbstractC46119e eVar = this.f120548f;
            if (eVar != null) {
                eVar.mo78308a(qVar);
            }
            this.f120535B = true;
            MethodCollector.m26664o(11519);
        }
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

    public /* synthetic */ C52314c(C21582f fVar, ActivityC0945e eVar, AbstractC14552j jVar, FrameLayout frameLayout, C46224i iVar, AbstractC45899e eVar2, LiveData liveData, AbstractC52360s sVar, int i) {
        this(fVar, eVar, jVar, frameLayout, iVar, eVar2, liveData, sVar, i, new Rect());
    }

    private C52314c(C21582f fVar, ActivityC0945e eVar, AbstractC14552j jVar, FrameLayout frameLayout, C46224i iVar, AbstractC45899e eVar2, LiveData<AbstractC31071f> liveData, AbstractC52360s sVar, int i, Rect rect) {
        C89219l.m154721d(fVar, "");
        C89219l.m154721d(eVar, "");
        C89219l.m154721d(jVar, "");
        C89219l.m154721d(frameLayout, "");
        C89219l.m154721d(iVar, "");
        this.f120538E = fVar;
        this.f120539F = eVar;
        this.f120540G = jVar;
        this.f120558p = frameLayout;
        this.f120541H = iVar;
        this.f120559q = eVar2;
        this.f120560r = liveData;
        this.f120542I = sVar;
        this.f120543J = i;
        this.f120561s = rect;
        this.f120562t = null;
        this.f120563v = C21572a.m40504a(getDiContainer(), VideoPublishEditModel.class);
        this.f120553k = C52534f.f120954a;
    }
}
