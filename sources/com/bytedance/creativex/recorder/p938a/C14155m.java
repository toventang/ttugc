package com.bytedance.creativex.recorder.p938a;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.creativex.recorder.gesture.api.AbstractC14315b;
import com.bytedance.creativex.recorder.gesture.api.C14316c;
import com.bytedance.creativex.recorder.p938a.C14110g;
import com.bytedance.creativex.recorder.p938a.p939a.AbstractC14099a;
import com.bytedance.creativex.recorder.p940b.p941a.AbstractC14177d;
import com.bytedance.creativex.recorder.p940b.p941a.C14171ac;
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
import com.bytedance.scene.AbstractC22219j;
import com.bytedance.scene.ktx.C22227b;
import com.bytedance.scene.navigation.C22239d;
import com.p2082ss.android.ugc.aweme.tools.beauty.C77885e;
import com.p2082ss.android.ugc.aweme.tools.beauty.C77898f;
import com.p2082ss.android.ugc.aweme.tools.beauty.impl.view.C77989b;
import com.p2082ss.android.ugc.aweme.tools.beauty.impl.view.C77990c;
import com.p2082ss.android.ugc.aweme.tools.beauty.impl.view.C77991d;
import com.p2082ss.android.ugc.aweme.tools.beauty.impl.view.C78007e;
import com.p2082ss.android.ugc.aweme.tools.beauty.impl.view.C78011f;
import com.p2082ss.android.ugc.aweme.tools.beauty.impl.view.InternalBeautyPanel;
import com.p2082ss.android.ugc.aweme.tools.beauty.p4085b.p4086a.C77859d;
import com.p2082ss.android.ugc.aweme.tools.beauty.p4085b.p4086a.C77861e;
import com.p2082ss.android.ugc.aweme.tools.beauty.p4085b.p4086a.C77866h;
import com.p2082ss.android.ugc.aweme.tools.beauty.p4091e.C77886a;
import com.p2082ss.android.ugc.aweme.tools.beauty.p4091e.p4093b.AbstractC77893a;
import com.p2082ss.android.ugc.aweme.tools.beauty.p4091e.p4093b.AbstractC77897c;
import com.p2082ss.android.ugc.aweme.tools.beauty.p4094f.C77899a;
import com.p2082ss.android.ugc.aweme.tools.beauty.service.AbstractC78054d;
import com.p2082ss.android.ugc.aweme.tools.beauty.service.AbstractC78056f;
import com.p2082ss.android.ugc.aweme.tools.beauty.service.p4097a.C78046a;
import com.p2082ss.android.ugc.aweme.tools.beauty.views.ComposerBeautyViewImpl;
import com.p2082ss.android.ugc.tools.view.widget.C85052j;
import com.p2082ss.android.ugc.trill.R;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
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

/* renamed from: com.bytedance.creativex.recorder.a.m */
public final class C14155m extends AbstractC22219j implements AbstractC20382b, AbstractC21566a {

    /* renamed from: a */
    static final /* synthetic */ AbstractC89286i[] f34418a = {new C89232y(C14155m.class, "beautyApi", "getBeautyApi()Lcom/bytedance/creativex/recorder/beauty/api/BeautyApiComponent;", 0), new C89232y(C14155m.class, "cameraApiComponent", "getCameraApiComponent()Lcom/bytedance/creativex/recorder/camera/api/CameraApiComponent;", 0), new C89232y(C14155m.class, "gestureApiComponent", "getGestureApiComponent()Lcom/bytedance/creativex/recorder/gesture/api/GestureApiComponent;", 0)};

    /* renamed from: f */
    public static final C14156a f34419f = new C14156a((byte) 0);

    /* renamed from: b */
    final AbstractC89248d f34420b;

    /* renamed from: c */
    TextView f34421c;

    /* renamed from: d */
    public final C14110g f34422d;

    /* renamed from: e */
    public final AbstractC89172b<AbstractC78056f.AbstractC78057a, AbstractC78056f.AbstractC78057a> f34423e;

    /* renamed from: g */
    private final AbstractC89248d f34424g;

    /* renamed from: h */
    private final AbstractC89248d f34425h;

    /* renamed from: i */
    private final AbstractC89244h f34426i;

    /* renamed from: j */
    private AbstractC78056f f34427j;

    /* renamed from: k */
    private final AbstractC89172b<C77861e, C89391z> f34428k;

    /* renamed from: l */
    private final C21582f f34429l;

    /* renamed from: t */
    private final C78046a f34430t;

    /* renamed from: u */
    private final AbstractC77893a f34431u;

    /* renamed from: v */
    private final AbstractC89171a<Integer> f34432v;

    static {
        Covode.recordClassIndex(16224);
    }

    /* renamed from: d */
    private final AbstractC78056f.AbstractC78057a m25777d() {
        return (AbstractC78056f.AbstractC78057a) this.f34426i.getValue();
    }

    /* renamed from: a */
    public final AbstractC14099a mo22703a() {
        return (AbstractC14099a) this.f34424g.mo23374a(this, f34418a[0]);
    }

    /* renamed from: b */
    public final AbstractC14177d mo22706b() {
        return (AbstractC14177d) this.f34425h.mo23374a(this, f34418a[1]);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final boolean getUniqueOnlyGlobal() {
        return true;
    }

    /* renamed from: com.bytedance.creativex.recorder.a.m$a */
    public static final class C14156a {
        static {
            Covode.recordClassIndex(16225);
        }

        private C14156a() {
        }

        public /* synthetic */ C14156a(byte b) {
            this();
        }
    }

    /* renamed from: com.bytedance.creativex.recorder.a.m$d */
    public static final class C14162d implements AbstractC77897c {
        static {
            Covode.recordClassIndex(16231);
        }

        C14162d() {
        }

        @Override // com.p2082ss.android.ugc.aweme.tools.beauty.p4091e.p4093b.AbstractC77897c
        /* renamed from: a */
        public final void mo22725a(Context context, String str) {
            C89219l.m154721d(context, "");
            C89219l.m154721d(str, "");
            C85052j.C85053a.m146246a(context, str, 0).mo129996a();
        }
    }

    /* renamed from: com.bytedance.creativex.recorder.a.m$f */
    public static final class C14164f implements AbstractC77893a {
        static {
            Covode.recordClassIndex(16233);
        }

        C14164f() {
        }

        @Override // com.p2082ss.android.ugc.aweme.tools.beauty.p4091e.p4093b.AbstractC77893a
        /* renamed from: a */
        public final void mo22726a(AbstractC77893a.C77894a aVar) {
            C89219l.m154721d(aVar, "");
            AlertDialog.Builder builder = new AlertDialog.Builder(aVar.f174765a);
            builder.setTitle(aVar.f174766b).setMessage(aVar.f174767c).setPositiveButton(aVar.f174768d, new DialogInterface$OnClickListenerC14165a(aVar)).setNegativeButton(aVar.f174769e, new DialogInterface$OnClickListenerC14166b(aVar));
            AlertDialog create = builder.create();
            create.setCanceledOnTouchOutside(false);
            create.setCancelable(false);
            create.show();
        }

        /* renamed from: com.bytedance.creativex.recorder.a.m$f$a */
        static final class DialogInterface$OnClickListenerC14165a implements DialogInterface.OnClickListener {

            /* renamed from: a */
            final /* synthetic */ AbstractC77893a.C77894a f34439a;

            static {
                Covode.recordClassIndex(16234);
            }

            DialogInterface$OnClickListenerC14165a(AbstractC77893a.C77894a aVar) {
                this.f34439a = aVar;
            }

            public final void onClick(DialogInterface dialogInterface, int i) {
                AbstractC77893a.AbstractC77895b bVar = this.f34439a.f174770f;
                if (bVar != null) {
                    bVar.mo121546a();
                }
            }
        }

        /* renamed from: com.bytedance.creativex.recorder.a.m$f$b */
        static final class DialogInterface$OnClickListenerC14166b implements DialogInterface.OnClickListener {

            /* renamed from: a */
            final /* synthetic */ AbstractC77893a.C77894a f34440a;

            static {
                Covode.recordClassIndex(16235);
            }

            DialogInterface$OnClickListenerC14166b(AbstractC77893a.C77894a aVar) {
                this.f34440a = aVar;
            }

            public final void onClick(DialogInterface dialogInterface, int i) {
                AbstractC77893a.AbstractC77895b bVar = this.f34440a.f174770f;
                if (bVar != null) {
                    bVar.mo121547b();
                }
            }
        }
    }

    @Override // com.bytedance.p1559o.AbstractC21566a
    public final C21582f getDiContainer() {
        return this.f34429l;
    }

    @Override // com.bytedance.jedi.arch.AbstractC20534v
    public final AbstractC1204m getLifecycleOwner() {
        return this;
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final AbstractC20534v getLifecycleOwnerHolder() {
        return this;
    }

    /* Return type fixed from 'com.bytedance.jedi.arch.g' to match base method */
    @Override // com.bytedance.jedi.arch.AbstractC20367ae
    public final /* bridge */ /* synthetic */ AbstractC20477i getReceiver() {
        return this;
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final AbstractC20367ae<AbstractC20477i> getReceiverHolder() {
        return this;
    }

    /* renamed from: com.bytedance.creativex.recorder.a.m$b */
    static final class C14157b extends AbstractC89220m implements AbstractC89171a<AbstractC78056f.AbstractC78057a> {

        /* renamed from: a */
        final /* synthetic */ C14155m f34433a;

        static {
            Covode.recordClassIndex(16226);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14157b(C14155m mVar) {
            super(0);
            this.f34433a = mVar;
        }

        /* renamed from: com.bytedance.creativex.recorder.a.m$b$a */
        public static final class C14158a extends C77899a {

            /* renamed from: a */
            final /* synthetic */ C14157b f34434a;

            static {
                Covode.recordClassIndex(16227);
            }

            @Override // com.p2082ss.android.ugc.aweme.tools.beauty.service.AbstractC78056f.AbstractC78057a, com.p2082ss.android.ugc.aweme.tools.beauty.p4094f.C77899a
            /* renamed from: a */
            public final void mo22723a() {
                this.f34434a.f34433a.mo22706b().mo22779a(new C14171ac(false, false, 6));
            }

            @Override // com.p2082ss.android.ugc.aweme.tools.beauty.service.AbstractC78056f.AbstractC78057a, com.p2082ss.android.ugc.aweme.tools.beauty.p4094f.C77899a
            /* renamed from: b */
            public final void mo22724b() {
                AbstractC1196i lifecycle = this.f34434a.f34433a.getLifecycle();
                C89219l.m154716b(lifecycle, "");
                if (lifecycle.mo4011a().isAtLeast(AbstractC1196i.EnumC1199b.CREATED)) {
                    C22239d a = C22227b.m41825a(this.f34434a.f34433a);
                    if (a == null) {
                        C89219l.m154715b();
                    }
                    a.mo36524E();
                    C14155m mVar = this.f34434a.f34433a;
                    AbstractC14315b bVar = (AbstractC14315b) mVar.f34420b.mo23374a(mVar, C14155m.f34418a[2]);
                    if (bVar != null) {
                        C14316c.m26118a(bVar, false);
                    }
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C14158a(C14157b bVar, AbstractC78054d dVar) {
                super(dVar);
                this.f34434a = bVar;
            }
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ AbstractC78056f.AbstractC78057a invoke() {
            AbstractC78056f.AbstractC78057a invoke;
            C14158a aVar = new C14158a(this, this.f34433a.mo22703a());
            AbstractC89172b<AbstractC78056f.AbstractC78057a, AbstractC78056f.AbstractC78057a> bVar = this.f34433a.f34423e;
            return (bVar == null || (invoke = bVar.invoke(aVar)) == null) ? aVar : invoke;
        }
    }

    @Override // com.bytedance.scene.AbstractC22219j
    /* renamed from: n_ */
    public final void mo22713n_() {
        super.mo22713n_();
        mo22706b().mo22779a(new C14171ac(true, false, 6));
        AbstractC78056f fVar = this.f34427j;
        if (fVar != null) {
            fVar.mo121671c();
        }
        this.f34427j = null;
        this.f34422d.f34314g.mo22747A().getEffectController().mo56795b();
    }

    public /* synthetic */ C14155m(C21582f fVar) {
        this(fVar, new C78046a(), null, null, null);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20382b
    public final <VM1 extends JediViewModel<S1>, S1 extends AbstractC20368af> S1 getState(VM1 vm1) {
        C89219l.m154721d(vm1, "");
        return (S1) AbstractC20382b.C20383a.m38582a(this, vm1);
    }

    /* renamed from: com.bytedance.creativex.recorder.a.m$c */
    static final class C14159c extends AbstractC89220m implements AbstractC89172b<C77861e, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C14155m f34435a;

        static {
            Covode.recordClassIndex(16228);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14159c(C14155m mVar) {
            super(1);
            this.f34435a = mVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C77861e eVar) {
            C77861e eVar2 = eVar;
            C89219l.m154721d(eVar2, "");
            C141601 r1 = new AbstractC89172b<C77859d, C89391z>(this) {
                /* class com.bytedance.creativex.recorder.p938a.C14155m.C14159c.C141601 */

                /* renamed from: a */
                final /* synthetic */ C14159c f34436a;

                static {
                    Covode.recordClassIndex(16229);
                }

                {
                    this.f34436a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ C89391z invoke(C77859d dVar) {
                    boolean z;
                    C77859d dVar2 = dVar;
                    C89219l.m154721d(dVar2, "");
                    int itemShape = this.f34436a.f34435a.mo22703a().mo22659i().mo121637u().getItemShape();
                    boolean z2 = false;
                    if (itemShape == 0 || itemShape != 1) {
                        z = true;
                    } else {
                        z = false;
                    }
                    dVar2.f174673e = z;
                    if (this.f34436a.f34435a.mo22703a().mo22655d() && !this.f34436a.f34435a.mo22703a().mo22656e()) {
                        z2 = true;
                    }
                    dVar2.f174685q = z2;
                    dVar2.f174686r = this.f34436a.f34435a.mo22703a().mo22656e();
                    return C89391z.f203057a;
                }
            };
            C89219l.m154721d(r1, "");
            r1.invoke(eVar2.f174691c);
            C141612 r12 = new AbstractC89172b<C77866h, C89391z>(this) {
                /* class com.bytedance.creativex.recorder.p938a.C14155m.C14159c.C141612 */

                /* renamed from: a */
                final /* synthetic */ C14159c f34437a;

                static {
                    Covode.recordClassIndex(16230);
                }

                {
                    this.f34437a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ C89391z invoke(C77866h hVar) {
                    C77866h hVar2 = hVar;
                    C89219l.m154721d(hVar2, "");
                    hVar2.f174714b = this.f34437a.f34435a.mo22703a().mo22659i().mo121637u().getHasTitle();
                    return C89391z.f203057a;
                }
            };
            C89219l.m154721d(r12, "");
            r12.invoke(eVar2.f174693e);
            eVar2.f174736n = this.f34435a.f34422d.f34313f;
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.bytedance.creativex.recorder.a.m$g */
    static final class C14167g extends AbstractC89220m implements AbstractC89172b<Boolean, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C14155m f34441a;

        static {
            Covode.recordClassIndex(16236);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14167g(C14155m mVar) {
            super(1);
            this.f34441a = mVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Boolean bool) {
            TextView textView;
            TextView textView2;
            if (bool.booleanValue()) {
                C14155m mVar = this.f34441a;
                TextView textView3 = mVar.f34421c;
                if ((textView3 == null || textView3.getVisibility() != 0) && (textView2 = mVar.f34421c) != null) {
                    textView2.setVisibility(0);
                }
            } else {
                C14155m mVar2 = this.f34441a;
                TextView textView4 = mVar2.f34421c;
                if ((textView4 == null || textView4.getVisibility() != 8) && (textView = mVar2.f34421c) != null) {
                    textView.setVisibility(8);
                }
            }
            return C89391z.f203057a;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r7v4, resolved type: com.ss.android.ugc.aweme.tools.beauty.impl.view.InternalBeautyPanel */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.scene.AbstractC22219j
    /* renamed from: a */
    public final void mo22704a(Bundle bundle) {
        ComposerBeautyViewImpl composerBeautyViewImpl;
        super.mo22704a(bundle);
        C77886a.f174757n = true;
        C14162d dVar = new C14162d();
        C89219l.m154721d(dVar, "");
        C77886a.f174746c = dVar;
        C77886a.f174747d = new C14163e(this);
        AbstractC77893a aVar = this.f34431u;
        if (aVar == null) {
            aVar = new C14164f();
        }
        C89219l.m154721d(aVar, "");
        C77886a.f174748e = aVar;
        FrameLayout frameLayout = (FrameLayout) this.f52550n.findViewById(R.id.dfw);
        AbstractC78056f fVar = this.f34427j;
        if (fVar == null) {
            C89219l.m154716b(frameLayout, "");
            if (C77886a.f174761r) {
                C77898f fVar2 = new C77898f(mo22703a().mo22659i(), this.f34430t, this.f34428k);
                Activity t = mo36486t();
                C89219l.m154716b(t, "");
                AbstractC78056f.AbstractC78057a d = m25777d();
                boolean z = C77886a.f174758o;
                C89219l.m154721d(t, "");
                C89219l.m154721d(frameLayout, "");
                C89219l.m154721d(d, "");
                InternalBeautyPanel.C77983a aVar2 = new InternalBeautyPanel.C77983a(t, frameLayout, fVar2.f174772b);
                aVar2.f174948d = fVar2.f174773c;
                fVar2.f174771a.f174735m = z;
                C77861e eVar = fVar2.f174771a;
                C89219l.m154721d(eVar, "");
                aVar2.f174945a = eVar;
                aVar2.f174946b = d;
                InternalBeautyPanel internalBeautyPanel = new InternalBeautyPanel(aVar2.f174949e, aVar2.f174950f, aVar2.f174951g, aVar2.f174945a, (byte) 0);
                internalBeautyPanel.setContainer(aVar2.f174950f);
                internalBeautyPanel.f174935l = aVar2.f174946b;
                C77990c cVar = internalBeautyPanel.f174925b;
                if (cVar == null) {
                    C89219l.m154710a("listBusiness");
                }
                cVar.f174965c = internalBeautyPanel.f174935l;
                C77991d dVar2 = internalBeautyPanel.f174931h;
                if (dVar2 == null) {
                    C89219l.m154710a("beautyResetBusiness");
                }
                dVar2.f174969b = internalBeautyPanel.f174935l;
                C78007e eVar2 = internalBeautyPanel.f174929f;
                if (eVar2 == null) {
                    C89219l.m154710a("seekBarBusiness");
                }
                eVar2.f174994b = internalBeautyPanel.f174935l;
                C77989b bVar = internalBeautyPanel.f174933j;
                if (bVar == null) {
                    C89219l.m154710a("enableViewBusiness");
                }
                bVar.f174959b = internalBeautyPanel.f174935l;
                if (aVar2.f174947c != null) {
                    internalBeautyPanel.f174936m = aVar2.f174947c;
                    C77990c cVar2 = internalBeautyPanel.f174925b;
                    if (cVar2 == null) {
                        C89219l.m154710a("listBusiness");
                    }
                    cVar2.f174964b = internalBeautyPanel.f174936m;
                    C78007e eVar3 = internalBeautyPanel.f174929f;
                    if (eVar3 == null) {
                        C89219l.m154710a("seekBarBusiness");
                    }
                    eVar3.f174995c = internalBeautyPanel.f174936m;
                    C77991d dVar3 = internalBeautyPanel.f174931h;
                    if (dVar3 == null) {
                        C89219l.m154710a("beautyResetBusiness");
                    }
                    dVar3.f174970c = internalBeautyPanel.f174936m;
                    C78011f fVar3 = internalBeautyPanel.f174927d;
                    if (fVar3 == null) {
                        C89219l.m154710a("tabViewBusiness");
                    }
                    fVar3.f175004c = internalBeautyPanel.f174936m;
                }
                internalBeautyPanel.f174937n.f174956a = aVar2.f174948d;
                composerBeautyViewImpl = internalBeautyPanel;
            } else {
                C77885e eVar4 = new C77885e(mo22703a().mo22659i(), this.f34430t, this.f34428k);
                Activity t2 = mo36486t();
                C89219l.m154716b(t2, "");
                AbstractC78056f.AbstractC78057a d2 = m25777d();
                boolean z2 = C77886a.f174758o;
                C89219l.m154721d(t2, "");
                C89219l.m154721d(frameLayout, "");
                C89219l.m154721d(d2, "");
                ComposerBeautyViewImpl.C78069a aVar3 = new ComposerBeautyViewImpl.C78069a(t2, frameLayout, eVar4.f174743b);
                aVar3.f175242b = d2;
                aVar3.f175243c = eVar4.f174744c;
                eVar4.f174742a.f174735m = z2;
                C77861e eVar5 = eVar4.f174742a;
                C89219l.m154721d(eVar5, "");
                aVar3.f175244d = eVar5;
                ComposerBeautyViewImpl composerBeautyViewImpl2 = new ComposerBeautyViewImpl(aVar3.f175245e, aVar3.f175247g, aVar3.f175244d, (byte) 0);
                if (aVar3.f175241a != null) {
                    composerBeautyViewImpl2.setBeautyOnInteractListener(aVar3.f175241a);
                }
                composerBeautyViewImpl2.setContainer(aVar3.f175246f);
                composerBeautyViewImpl2.setBeautyViewListener(aVar3.f175242b);
                composerBeautyViewImpl2.setBeautyBuried(aVar3.f175243c);
                composerBeautyViewImpl = composerBeautyViewImpl2;
            }
            this.f34427j = composerBeautyViewImpl;
        } else {
            C89219l.m154716b(frameLayout, "");
            fVar.setContainer(frameLayout);
        }
        this.f34430t.mo121780b();
        AbstractC78056f fVar4 = this.f34427j;
        if (fVar4 != null) {
            fVar4.mo121670b();
        }
        C14110g gVar = this.f34422d;
        C89219l.m154721d(this, "");
        gVar.f34315h.mo22659i().mo121619i().mo70310a(this, new C14110g.C14114d(gVar));
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final <VM1 extends JediViewModel<S1>, S1 extends AbstractC20368af, R> R withState(VM1 vm1, AbstractC89172b<? super S1, ? extends R> bVar) {
        C89219l.m154721d(vm1, "");
        C89219l.m154721d(bVar, "");
        return (R) AbstractC20382b.C20383a.m38593a(this, vm1, bVar);
    }

    /* renamed from: com.bytedance.creativex.recorder.a.m$e */
    static final class C14163e extends AbstractC89220m implements AbstractC89183m<Context, String, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C14155m f34438a;

        static {
            Covode.recordClassIndex(16232);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14163e(C14155m mVar) {
            super(2);
            this.f34438a = mVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(Context context, String str) {
            C89219l.m154721d(context, "");
            C89219l.m154721d(str, "");
            AbstractC89183m<Context, String, C89391z> f = this.f34438a.mo22703a().mo22657f();
            if (f != null) {
                f.invoke(context, str);
            }
            return C89391z.f203057a;
        }
    }

    @Override // com.bytedance.scene.AbstractC22219j
    /* renamed from: a */
    public final View mo22702a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C89219l.m154721d(layoutInflater, "");
        C89219l.m154721d(viewGroup, "");
        View a = C1764a.m5927a(layoutInflater, R.layout.bhn, viewGroup, false);
        this.f34421c = (TextView) a.findViewById(R.id.et5);
        C14110g gVar = this.f34422d;
        gVar.f34314g.mo22747A().getEffectController().mo56778a(new C14110g.C14115e(gVar));
        C89219l.m154716b(a, "");
        return a;
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

    /* JADX DEBUG: Multi-variable search result rejected for r9v0, resolved type: h.f.a.b<? super com.ss.android.ugc.aweme.tools.beauty.service.f$a, ? extends com.ss.android.ugc.aweme.tools.beauty.service.f$a> */
    /* JADX WARN: Multi-variable type inference failed */
    public C14155m(C21582f fVar, C78046a aVar, AbstractC77893a aVar2, AbstractC89171a<Integer> aVar3, AbstractC89172b<? super AbstractC78056f.AbstractC78057a, ? extends AbstractC78056f.AbstractC78057a> bVar) {
        C89219l.m154721d(fVar, "");
        C89219l.m154721d(aVar, "");
        this.f34429l = fVar;
        this.f34430t = aVar;
        this.f34431u = aVar2;
        this.f34432v = aVar3;
        this.f34423e = bVar;
        this.f34424g = C21572a.m40504a(getDiContainer(), AbstractC14099a.class);
        this.f34425h = C21572a.m40504a(getDiContainer(), AbstractC14177d.class);
        this.f34420b = C21572a.m40505b(getDiContainer(), AbstractC14315b.class);
        this.f34422d = new C14110g(mo22706b(), mo22703a(), new C14167g(this));
        this.f34426i = C89250i.m154773a((AbstractC89171a) new C14157b(this));
        this.f34428k = new C14159c(this);
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
