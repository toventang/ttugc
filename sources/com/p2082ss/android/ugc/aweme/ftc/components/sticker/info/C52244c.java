package com.p2082ss.android.ugc.aweme.ftc.components.sticker.info;

import android.app.Activity;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.C1171ab;
import androidx.lifecycle.C1175ad;
import androidx.lifecycle.C1181ae;
import com.C1764a;
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
import com.bytedance.jedi.arch.C20531t;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.p1559o.AbstractC21566a;
import com.bytedance.p1559o.C21582f;
import com.bytedance.p1559o.p1561b.C21572a;
import com.bytedance.p969f.p970a.p971a.AbstractC14552j;
import com.bytedance.p969f.p970a.p971a.C14544f;
import com.bytedance.provider.p1587vm.ScopeViewModel;
import com.bytedance.scene.AbstractC22219j;
import com.p2082ss.android.ugc.asve.editor.AbstractC31071f;
import com.p2082ss.android.ugc.aweme.adaptation.C33398a;
import com.p2082ss.android.ugc.aweme.commentStickerPanel.itemview.CommentStickerView;
import com.p2082ss.android.ugc.aweme.editSticker.interact.AbstractC45897c;
import com.p2082ss.android.ugc.aweme.editSticker.interact.AbstractC45904h;
import com.p2082ss.android.ugc.aweme.editSticker.interact.p2884a.AbstractC45895b;
import com.p2082ss.android.ugc.aweme.editSticker.model.InfoStickerModel;
import com.p2082ss.android.ugc.aweme.editSticker.model.StickerItemModel;
import com.p2082ss.android.ugc.aweme.editSticker.p2883f.C45883b;
import com.p2082ss.android.ugc.aweme.editSticker.text.view.C46239q;
import com.p2082ss.android.ugc.aweme.ftc.components.corner.FTCEditCornerViewModel;
import com.p2082ss.android.ugc.aweme.ftc.components.sticker.C52154a;
import com.p2082ss.android.ugc.aweme.ftc.components.sticker.core.FTCEditStickerViewModel;
import com.p2082ss.android.ugc.aweme.ftc.components.sticker.info.C52264i;
import com.p2082ss.android.ugc.aweme.ftc.components.sticker.info.FTCInfoStickerEditView;
import com.p2082ss.android.ugc.aweme.ftc.components.sticker.p3030a.C52155a;
import com.p2082ss.android.ugc.aweme.ftc.components.sticker.text.FTCEditTextStickerViewModel;
import com.p2082ss.android.ugc.aweme.infoSticker.C56724i;
import com.p2082ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.p2082ss.android.ugc.aweme.shortvideo.C70635dg;
import com.p2082ss.android.ugc.aweme.shortvideo.C70636dh;
import com.p2082ss.android.ugc.aweme.shortvideo.SafeHandler;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditView;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.AbstractC71033a;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.donation.AbstractC71109e;
import com.p2082ss.android.ugc.aweme.shortvideo.preview.AbstractC72510a;
import com.p2082ss.android.ugc.aweme.themechange.base.AVDmtTextView;
import com.p2082ss.android.ugc.gamora.editor.C83253u;
import com.p2082ss.android.ugc.tools.utils.C84908o;
import com.p2082ss.android.ugc.tools.utils.C84911q;
import com.p2082ss.android.ugc.trill.R;
import com.p2082ss.android.vesdk.VESize;
import java.util.List;
import java.util.Objects;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89378p;
import p4600h.C89386u;
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

/* renamed from: com.ss.android.ugc.aweme.ftc.components.sticker.info.c */
public final class C52244c extends AbstractC22219j implements AbstractC20382b, AbstractC21566a {

    /* renamed from: a */
    static final /* synthetic */ AbstractC89286i[] f120363a = {new C89232y(C52244c.class, "publishEditModel", "getPublishEditModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0), new C89232y(C52244c.class, "stickerChallengeManager", "getStickerChallengeManager()Lcom/ss/android/ugc/aweme/infoSticker/StickerChallengeManager;", 0)};

    /* renamed from: e */
    public static final C52249e f120364e = new C52249e((byte) 0);

    /* renamed from: b */
    public AbstractC14552j f120365b;

    /* renamed from: c */
    final AbstractC89248d f120366c = C21572a.m40504a(getDiContainer(), C56724i.class);

    /* renamed from: d */
    public FrameLayout f120367d;

    /* renamed from: f */
    private final AbstractC89244h f120368f = C89250i.m154774a(EnumC89331m.NONE, new C52245a(this));

    /* renamed from: g */
    private final AbstractC89248d f120369g = C21572a.m40504a(getDiContainer(), VideoPublishEditModel.class);

    /* renamed from: h */
    private final AbstractC89244h f120370h;

    /* renamed from: i */
    private final AbstractC89244h f120371i;

    /* renamed from: j */
    private final AbstractC89244h f120372j;

    /* renamed from: k */
    private final AbstractC89244h f120373k;

    /* renamed from: l */
    private final C21582f f120374l;

    static {
        Covode.recordClassIndex(61632);
    }

    /* renamed from: D */
    private final FTCEditInfoStickerViewModel m97072D() {
        return (FTCEditInfoStickerViewModel) this.f120370h.getValue();
    }

    /* renamed from: a */
    public static float m97073a(boolean z) {
        return z ? 1.0f : 0.3137255f;
    }

    /* renamed from: C */
    public final C52264i mo87988C() {
        return (C52264i) this.f120373k.getValue();
    }

    /* renamed from: a */
    public final AbstractC72510a mo87989a() {
        return (AbstractC72510a) this.f120368f.getValue();
    }

    /* renamed from: b */
    public final FTCEditTextStickerViewModel mo87990b() {
        return (FTCEditTextStickerViewModel) this.f120371i.getValue();
    }

    /* renamed from: d */
    public final FTCEditStickerViewModel mo87991d() {
        return (FTCEditStickerViewModel) this.f120372j.getValue();
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final boolean getUniqueOnlyGlobal() {
        return true;
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.components.sticker.info.c$e */
    public static final class C52249e {
        static {
            Covode.recordClassIndex(61637);
        }

        private C52249e() {
        }

        public /* synthetic */ C52249e(byte b) {
            this();
        }
    }

    @Override // com.bytedance.p1559o.AbstractC21566a
    public final C21582f getDiContainer() {
        return this.f120374l;
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

    /* renamed from: com.ss.android.ugc.aweme.ftc.components.sticker.info.c$a */
    public static final class C52245a extends AbstractC89220m implements AbstractC89171a<AbstractC72510a> {

        /* renamed from: a */
        final /* synthetic */ AbstractC21566a f120375a;

        static {
            Covode.recordClassIndex(61633);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C52245a(AbstractC21566a aVar) {
            super(0);
            this.f120375a = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.bytedance.als.b, com.ss.android.ugc.aweme.shortvideo.preview.a] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.p2082ss.android.ugc.aweme.shortvideo.preview.AbstractC72510a invoke() {
            /*
                r3 = this;
                com.bytedance.o.a r0 = r3.f120375a
                com.bytedance.o.f r2 = r0.getDiContainer()
                java.lang.Class<com.ss.android.ugc.aweme.shortvideo.preview.a> r1 = com.p2082ss.android.ugc.aweme.shortvideo.preview.AbstractC72510a.class
                r0 = 0
                java.lang.Object r0 = r2.mo35249a(r1, r0)
                com.bytedance.als.b r0 = (com.bytedance.als.AbstractC2547b) r0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.ftc.components.sticker.info.C52244c.C52245a.invoke():com.bytedance.als.b");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.components.sticker.info.c$i */
    static final class C52253i implements AbstractC45895b {

        /* renamed from: a */
        final /* synthetic */ C52244c f120388a;

        static {
            Covode.recordClassIndex(61641);
        }

        C52253i(C52244c cVar) {
            this.f120388a = cVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.editSticker.interact.p2884a.AbstractC45895b
        /* renamed from: a */
        public final void mo77270a() {
            this.f120388a.mo87990b().mo88060k();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.components.sticker.info.c$n */
    static final class C52258n extends AbstractC89220m implements AbstractC89171a<C52264i> {

        /* renamed from: a */
        final /* synthetic */ C52244c f120393a;

        static {
            Covode.recordClassIndex(61646);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C52258n(C52244c cVar) {
            super(0);
            this.f120393a = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C52264i invoke() {
            return new C52264i(this.f120393a.mo87989a());
        }
    }

    @Override // com.bytedance.scene.AbstractC22219j
    /* renamed from: w */
    public final void mo36490w() {
        super.mo36490w();
        C52264i C = mo87988C();
        if (C.f120454y != null) {
            C.f120454y.mo77277b();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.components.sticker.info.c$b */
    public static final class C52246b extends AbstractC89220m implements AbstractC89171a<FTCEditInfoStickerViewModel> {

        /* renamed from: a */
        final /* synthetic */ AbstractC22219j f120376a;

        /* renamed from: b */
        final /* synthetic */ AbstractC89277c f120377b;

        /* renamed from: c */
        final /* synthetic */ AbstractC89277c f120378c;

        static {
            Covode.recordClassIndex(61634);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C52246b(AbstractC22219j jVar, AbstractC89277c cVar, AbstractC89277c cVar2) {
            super(0);
            this.f120376a = jVar;
            this.f120377b = cVar;
            this.f120378c = cVar2;
        }

        /* JADX WARN: Type inference failed for: r0v8, types: [com.ss.android.ugc.aweme.ftc.components.sticker.info.FTCEditInfoStickerViewModel, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARN: Type inference failed for: r0v15, types: [com.ss.android.ugc.aweme.ftc.components.sticker.info.FTCEditInfoStickerViewModel, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARNING: Unknown variable types count: 2 */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.p2082ss.android.ugc.aweme.ftc.components.sticker.info.FTCEditInfoStickerViewModel invoke() {
            /*
                r6 = this;
                com.bytedance.scene.j r0 = r6.f120376a
                com.bytedance.scene.j r5 = r0.f52551o
                h.k.c r0 = r6.f120378c
                java.lang.Class r0 = p4600h.p4611f.C89170a.m154665a(r0)
                java.lang.String r3 = r0.getCanonicalName()
                java.lang.String r4 = ""
                p4600h.p4611f.p4613b.C89219l.m154716b(r3, r4)
            L_0x0013:
                if (r5 == 0) goto L_0x003a
                androidx.lifecycle.ad$b r0 = com.bytedance.jedi.arch.C20392e.f48284a     // Catch:{ as -> 0x0035 }
                androidx.lifecycle.ad r2 = com.bytedance.scene.C22267s.m41934a(r5, r0)     // Catch:{ as -> 0x0035 }
                h.k.c r0 = r6.f120378c     // Catch:{ as -> 0x0035 }
                java.lang.Class r0 = p4600h.p4611f.C89170a.m154665a(r0)     // Catch:{ as -> 0x0035 }
                java.lang.String r1 = r0.getCanonicalName()     // Catch:{ as -> 0x0035 }
                p4600h.p4611f.p4613b.C89219l.m154716b(r1, r4)     // Catch:{ as -> 0x0035 }
                h.k.c r0 = r6.f120377b     // Catch:{ as -> 0x0035 }
                java.lang.Class r0 = p4600h.p4611f.C89170a.m154665a(r0)     // Catch:{ as -> 0x0035 }
                androidx.lifecycle.ac r0 = m97081xabd88106(r2, r1, r0)     // Catch:{ as -> 0x0035 }
                com.bytedance.jedi.arch.JediViewModel r0 = (com.bytedance.jedi.arch.JediViewModel) r0     // Catch:{ as -> 0x0035 }
                goto L_0x0038
            L_0x0035:
                com.bytedance.scene.j r5 = r5.f52551o
                goto L_0x0013
            L_0x0038:
                if (r0 != 0) goto L_0x0052
            L_0x003a:
                com.bytedance.scene.j r0 = r6.f120376a
                androidx.fragment.app.e r1 = com.bytedance.scene.ktx.C22228c.m41832b(r0)
                androidx.lifecycle.ad$b r0 = com.bytedance.jedi.arch.C20392e.f48284a
                androidx.lifecycle.ad r1 = androidx.lifecycle.C1181ae.m3881a(r1, r0)
                h.k.c r0 = r6.f120377b
                java.lang.Class r0 = p4600h.p4611f.C89170a.m154665a(r0)
                androidx.lifecycle.ac r0 = m97081xabd88106(r1, r3, r0)
                com.bytedance.jedi.arch.JediViewModel r0 = (com.bytedance.jedi.arch.JediViewModel) r0
            L_0x0052:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.ftc.components.sticker.info.C52244c.C52246b.invoke():com.bytedance.jedi.arch.JediViewModel");
        }

        /* renamed from: com_ss_android_ugc_aweme_ftc_components_sticker_info_FTCEditInfoStickerScene$$special$$inlined$hostViewModel$1_androidx_lifecycle_VScopeLancet_get */
        public static AbstractC1174ac m97081xabd88106(C1175ad adVar, String str, Class cls) {
            if (cls.equals(ScopeViewModel.class)) {
                return adVar.mo3984a(str, cls);
            }
            AbstractC1174ac a = adVar.mo3984a(str, cls);
            C1171ab.m3870a(a, adVar);
            return a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.components.sticker.info.c$c */
    public static final class C52247c extends AbstractC89220m implements AbstractC89171a<FTCEditTextStickerViewModel> {

        /* renamed from: a */
        final /* synthetic */ AbstractC22219j f120379a;

        /* renamed from: b */
        final /* synthetic */ AbstractC89277c f120380b;

        /* renamed from: c */
        final /* synthetic */ AbstractC89277c f120381c;

        static {
            Covode.recordClassIndex(61635);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C52247c(AbstractC22219j jVar, AbstractC89277c cVar, AbstractC89277c cVar2) {
            super(0);
            this.f120379a = jVar;
            this.f120380b = cVar;
            this.f120381c = cVar2;
        }

        /* JADX WARN: Type inference failed for: r0v8, types: [com.bytedance.jedi.arch.JediViewModel, com.ss.android.ugc.aweme.ftc.components.sticker.text.FTCEditTextStickerViewModel] */
        /* JADX WARN: Type inference failed for: r0v15, types: [com.bytedance.jedi.arch.JediViewModel, com.ss.android.ugc.aweme.ftc.components.sticker.text.FTCEditTextStickerViewModel] */
        /* JADX WARNING: Unknown variable types count: 2 */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.p2082ss.android.ugc.aweme.ftc.components.sticker.text.FTCEditTextStickerViewModel invoke() {
            /*
                r6 = this;
                com.bytedance.scene.j r0 = r6.f120379a
                com.bytedance.scene.j r5 = r0.f52551o
                h.k.c r0 = r6.f120381c
                java.lang.Class r0 = p4600h.p4611f.C89170a.m154665a(r0)
                java.lang.String r3 = r0.getCanonicalName()
                java.lang.String r4 = ""
                p4600h.p4611f.p4613b.C89219l.m154716b(r3, r4)
            L_0x0013:
                if (r5 == 0) goto L_0x003a
                androidx.lifecycle.ad$b r0 = com.bytedance.jedi.arch.C20392e.f48284a     // Catch:{ as -> 0x0035 }
                androidx.lifecycle.ad r2 = com.bytedance.scene.C22267s.m41934a(r5, r0)     // Catch:{ as -> 0x0035 }
                h.k.c r0 = r6.f120381c     // Catch:{ as -> 0x0035 }
                java.lang.Class r0 = p4600h.p4611f.C89170a.m154665a(r0)     // Catch:{ as -> 0x0035 }
                java.lang.String r1 = r0.getCanonicalName()     // Catch:{ as -> 0x0035 }
                p4600h.p4611f.p4613b.C89219l.m154716b(r1, r4)     // Catch:{ as -> 0x0035 }
                h.k.c r0 = r6.f120380b     // Catch:{ as -> 0x0035 }
                java.lang.Class r0 = p4600h.p4611f.C89170a.m154665a(r0)     // Catch:{ as -> 0x0035 }
                androidx.lifecycle.ac r0 = m97082xbf805487(r2, r1, r0)     // Catch:{ as -> 0x0035 }
                com.bytedance.jedi.arch.JediViewModel r0 = (com.bytedance.jedi.arch.JediViewModel) r0     // Catch:{ as -> 0x0035 }
                goto L_0x0038
            L_0x0035:
                com.bytedance.scene.j r5 = r5.f52551o
                goto L_0x0013
            L_0x0038:
                if (r0 != 0) goto L_0x0052
            L_0x003a:
                com.bytedance.scene.j r0 = r6.f120379a
                androidx.fragment.app.e r1 = com.bytedance.scene.ktx.C22228c.m41832b(r0)
                androidx.lifecycle.ad$b r0 = com.bytedance.jedi.arch.C20392e.f48284a
                androidx.lifecycle.ad r1 = androidx.lifecycle.C1181ae.m3881a(r1, r0)
                h.k.c r0 = r6.f120380b
                java.lang.Class r0 = p4600h.p4611f.C89170a.m154665a(r0)
                androidx.lifecycle.ac r0 = m97082xbf805487(r1, r3, r0)
                com.bytedance.jedi.arch.JediViewModel r0 = (com.bytedance.jedi.arch.JediViewModel) r0
            L_0x0052:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.ftc.components.sticker.info.C52244c.C52247c.invoke():com.bytedance.jedi.arch.JediViewModel");
        }

        /* renamed from: com_ss_android_ugc_aweme_ftc_components_sticker_info_FTCEditInfoStickerScene$$special$$inlined$hostViewModel$2_androidx_lifecycle_VScopeLancet_get */
        public static AbstractC1174ac m97082xbf805487(C1175ad adVar, String str, Class cls) {
            if (cls.equals(ScopeViewModel.class)) {
                return adVar.mo3984a(str, cls);
            }
            AbstractC1174ac a = adVar.mo3984a(str, cls);
            C1171ab.m3870a(a, adVar);
            return a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.components.sticker.info.c$d */
    public static final class C52248d extends AbstractC89220m implements AbstractC89171a<FTCEditStickerViewModel> {

        /* renamed from: a */
        final /* synthetic */ AbstractC22219j f120382a;

        /* renamed from: b */
        final /* synthetic */ AbstractC89277c f120383b;

        /* renamed from: c */
        final /* synthetic */ AbstractC89277c f120384c;

        static {
            Covode.recordClassIndex(61636);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C52248d(AbstractC22219j jVar, AbstractC89277c cVar, AbstractC89277c cVar2) {
            super(0);
            this.f120382a = jVar;
            this.f120383b = cVar;
            this.f120384c = cVar2;
        }

        /* JADX WARN: Type inference failed for: r0v8, types: [com.bytedance.jedi.arch.JediViewModel, com.ss.android.ugc.aweme.ftc.components.sticker.core.FTCEditStickerViewModel] */
        /* JADX WARN: Type inference failed for: r0v15, types: [com.bytedance.jedi.arch.JediViewModel, com.ss.android.ugc.aweme.ftc.components.sticker.core.FTCEditStickerViewModel] */
        /* JADX WARNING: Unknown variable types count: 2 */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.p2082ss.android.ugc.aweme.ftc.components.sticker.core.FTCEditStickerViewModel invoke() {
            /*
                r6 = this;
                com.bytedance.scene.j r0 = r6.f120382a
                com.bytedance.scene.j r5 = r0.f52551o
                h.k.c r0 = r6.f120384c
                java.lang.Class r0 = p4600h.p4611f.C89170a.m154665a(r0)
                java.lang.String r3 = r0.getCanonicalName()
                java.lang.String r4 = ""
                p4600h.p4611f.p4613b.C89219l.m154716b(r3, r4)
            L_0x0013:
                if (r5 == 0) goto L_0x003a
                androidx.lifecycle.ad$b r0 = com.bytedance.jedi.arch.C20392e.f48284a     // Catch:{ as -> 0x0035 }
                androidx.lifecycle.ad r2 = com.bytedance.scene.C22267s.m41934a(r5, r0)     // Catch:{ as -> 0x0035 }
                h.k.c r0 = r6.f120384c     // Catch:{ as -> 0x0035 }
                java.lang.Class r0 = p4600h.p4611f.C89170a.m154665a(r0)     // Catch:{ as -> 0x0035 }
                java.lang.String r1 = r0.getCanonicalName()     // Catch:{ as -> 0x0035 }
                p4600h.p4611f.p4613b.C89219l.m154716b(r1, r4)     // Catch:{ as -> 0x0035 }
                h.k.c r0 = r6.f120383b     // Catch:{ as -> 0x0035 }
                java.lang.Class r0 = p4600h.p4611f.C89170a.m154665a(r0)     // Catch:{ as -> 0x0035 }
                androidx.lifecycle.ac r0 = m97083xd3282808(r2, r1, r0)     // Catch:{ as -> 0x0035 }
                com.bytedance.jedi.arch.JediViewModel r0 = (com.bytedance.jedi.arch.JediViewModel) r0     // Catch:{ as -> 0x0035 }
                goto L_0x0038
            L_0x0035:
                com.bytedance.scene.j r5 = r5.f52551o
                goto L_0x0013
            L_0x0038:
                if (r0 != 0) goto L_0x0052
            L_0x003a:
                com.bytedance.scene.j r0 = r6.f120382a
                androidx.fragment.app.e r1 = com.bytedance.scene.ktx.C22228c.m41832b(r0)
                androidx.lifecycle.ad$b r0 = com.bytedance.jedi.arch.C20392e.f48284a
                androidx.lifecycle.ad r1 = androidx.lifecycle.C1181ae.m3881a(r1, r0)
                h.k.c r0 = r6.f120383b
                java.lang.Class r0 = p4600h.p4611f.C89170a.m154665a(r0)
                androidx.lifecycle.ac r0 = m97083xd3282808(r1, r3, r0)
                com.bytedance.jedi.arch.JediViewModel r0 = (com.bytedance.jedi.arch.JediViewModel) r0
            L_0x0052:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.ftc.components.sticker.info.C52244c.C52248d.invoke():com.bytedance.jedi.arch.JediViewModel");
        }

        /* renamed from: com_ss_android_ugc_aweme_ftc_components_sticker_info_FTCEditInfoStickerScene$$special$$inlined$hostViewModel$3_androidx_lifecycle_VScopeLancet_get */
        public static AbstractC1174ac m97083xd3282808(C1175ad adVar, String str, Class cls) {
            if (cls.equals(ScopeViewModel.class)) {
                return adVar.mo3984a(str, cls);
            }
            AbstractC1174ac a = adVar.mo3984a(str, cls);
            C1171ab.m3870a(a, adVar);
            return a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.components.sticker.info.c$f */
    public static final class C52250f implements AbstractC71033a {

        /* renamed from: a */
        final /* synthetic */ C52244c f120385a;

        static {
            Covode.recordClassIndex(61638);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C52250f(C52244c cVar) {
            this.f120385a = cVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.AbstractC71033a
        /* renamed from: b */
        public final void mo87993b(StickerItemModel stickerItemModel) {
            C89219l.m154721d(stickerItemModel, "");
            this.f120385a.mo87988C().f120449t.infoStickerModel.removeSticker(stickerItemModel);
            C52244c cVar = this.f120385a;
            ((C56724i) cVar.f120366c.mo23374a(cVar, C52244c.f120363a[1])).mo93672a(stickerItemModel.stickerId);
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.AbstractC71033a
        /* renamed from: a */
        public final void mo87992a(StickerItemModel stickerItemModel) {
            C89219l.m154721d(stickerItemModel, "");
            if (this.f120385a.mo87988C().f120449t.infoStickerModel == null) {
                this.f120385a.mo87988C().f120449t.infoStickerModel = new InfoStickerModel(this.f120385a.mo87988C().f120449t.draftDir());
            }
            C84911q.m145928d("add infoSticker " + stickerItemModel.getId());
            this.f120385a.mo87988C().f120449t.infoStickerModel.addSticker(stickerItemModel);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.components.sticker.info.c$g */
    public static final class C52251g implements C52264i.AbstractC52270b {

        /* renamed from: a */
        final /* synthetic */ C52244c f120386a;

        static {
            Covode.recordClassIndex(61639);
        }

        @Override // com.p2082ss.android.ugc.aweme.ftc.components.sticker.info.C52264i.AbstractC52270b
        /* renamed from: a */
        public final int mo87994a(C52154a aVar, boolean z, boolean z2) {
            C89219l.m154721d(aVar, "");
            return 0;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C52251g(C52244c cVar) {
            this.f120386a = cVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.ftc.components.sticker.info.C52264i.AbstractC52270b
        /* renamed from: a */
        public final Float mo87996a(float f) {
            return Float.valueOf(f);
        }

        @Override // com.p2082ss.android.ugc.aweme.ftc.components.sticker.info.C52264i.AbstractC52270b
        /* renamed from: a */
        public final PointF mo87995a(C52154a aVar, float f, float f2) {
            C89219l.m154721d(aVar, "");
            return new PointF();
        }

        @Override // com.p2082ss.android.ugc.aweme.ftc.components.sticker.info.C52264i.AbstractC52270b
        /* renamed from: a */
        public final void mo87997a(C52154a aVar, int i, int i2, boolean z, boolean z2) {
            C89219l.m154721d(aVar, "");
            if (C89219l.m154714a((Object) this.f120386a.mo87991d().mo87903i().getValue(), (Object) true) || C89219l.m154714a((Object) this.f120386a.mo87991d().mo87904j().getValue(), (Object) true)) {
                if (this.f120386a.mo87988C().f120419J != null) {
                    this.f120386a.mo87988C().mo88025f();
                }
            } else if (z) {
                this.f120386a.mo87989a().mo114805a((AbstractC72510a) true, true, true);
            } else {
                this.f120386a.mo87989a().mo114805a((AbstractC72510a) false, true, false);
                this.f120386a.mo87988C().mo88027h();
                this.f120386a.mo87990b().mo88060k();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.components.sticker.info.c$h */
    public static final class C52252h implements C52264i.AbstractC52269a {

        /* renamed from: a */
        final /* synthetic */ C52244c f120387a;

        static {
            Covode.recordClassIndex(61640);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C52252h(C52244c cVar) {
            this.f120387a = cVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.ftc.components.sticker.info.C52264i.AbstractC52269a
        /* renamed from: b */
        public final void mo87999b(boolean z) {
            this.f120387a.mo87990b().mo88040a(C52244c.m97073a(z));
            if (!z) {
                AbstractC45897c cVar = this.f120387a.mo87988C().f120419J;
                if (!(cVar instanceof C46239q)) {
                    cVar = null;
                }
                C46239q qVar = (C46239q) cVar;
                if (qVar != null) {
                    qVar.mo78534a(C52244c.m97073a(true), false);
                }
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.ftc.components.sticker.info.C52264i.AbstractC52269a
        /* renamed from: a */
        public final void mo87998a(boolean z) {
            this.f120387a.mo87990b().mo88040a(C52244c.m97073a(!z));
            if (z) {
                AbstractC45897c cVar = this.f120387a.mo87988C().f120419J;
                AbstractC71109e eVar = null;
                if (!(cVar instanceof C46239q)) {
                    cVar = null;
                }
                C46239q qVar = (C46239q) cVar;
                if (qVar != null) {
                    qVar.mo78534a(C52244c.m97073a(true), false);
                }
                AbstractC45897c cVar2 = this.f120387a.mo87988C().f120419J;
                if (!(cVar2 instanceof CommentStickerView)) {
                    cVar2 = null;
                }
                CommentStickerView commentStickerView = (CommentStickerView) cVar2;
                if (commentStickerView != null) {
                    commentStickerView.setAlpha(C52244c.m97073a(true));
                }
                AbstractC45897c cVar3 = this.f120387a.mo87988C().f120419J;
                if (cVar3 instanceof AbstractC71109e) {
                    eVar = cVar3;
                }
                AbstractC71109e eVar2 = eVar;
                if (eVar2 != null) {
                    eVar2.mo112347a(C52244c.m97073a(true));
                }
            }
        }
    }

    @Override // com.bytedance.jedi.arch.AbstractC20382b
    public final <VM1 extends JediViewModel<S1>, S1 extends AbstractC20368af> S1 getState(VM1 vm1) {
        C89219l.m154721d(vm1, "");
        return (S1) AbstractC20382b.C20383a.m38582a(this, vm1);
    }

    public C52244c(C21582f fVar) {
        C89219l.m154721d(fVar, "");
        this.f120374l = fVar;
        AbstractC89277c a = C89204ab.m154669a(FTCEditInfoStickerViewModel.class);
        this.f120370h = C89250i.m154773a((AbstractC89171a) new C52246b(this, a, a));
        AbstractC89277c a2 = C89204ab.m154669a(FTCEditTextStickerViewModel.class);
        this.f120371i = C89250i.m154773a((AbstractC89171a) new C52247c(this, a2, a2));
        AbstractC89277c a3 = C89204ab.m154669a(FTCEditStickerViewModel.class);
        this.f120372j = C89250i.m154773a((AbstractC89171a) new C52248d(this, a3, a3));
        this.f120373k = C89250i.m154773a((AbstractC89171a) new C52258n(this));
    }

    @Override // com.bytedance.scene.AbstractC22219j
    /* renamed from: a */
    public final void mo22704a(Bundle bundle) {
        super.mo22704a(bundle);
        Objects.requireNonNull(this.f52549m, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        C52264i C = mo87988C();
        AbstractC31071f value = mo87989a().mo114778C().getValue();
        if (value == null) {
            C89219l.m154715b();
        }
        int i = 0;
        C.f120447r = value;
        C.f120449t = (VideoPublishEditModel) this.f120369g.mo23374a(this, f120363a[0]);
        C52264i C2 = mo87988C();
        Activity activity = this.f52549m;
        Objects.requireNonNull(activity, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        ActivityC0945e eVar = (ActivityC0945e) activity;
        View view = this.f52550n;
        VideoPublishEditModel videoPublishEditModel = mo87988C().f120449t;
        C89219l.m154716b(videoPublishEditModel, "");
        List<MediaModel> mediaModelList = videoPublishEditModel.getMediaModelList();
        C2.f120432c = eVar;
        C2.f120452w = mediaModelList;
        C2.f120431b = false;
        C2.f120453x = new SafeHandler(eVar);
        C2.f120448s = (FTCInfoStickerViewModel) C1181ae.m3881a(eVar, (C1175ad.AbstractC1177b) null).mo3983a(FTCInfoStickerViewModel.class);
        C2.f120450u = view;
        C2.f120455z = (FrameLayout) C2.f120450u.findViewById(R.id.dnk);
        C2.f120433d = (FTCInfoStickerEditView) C2.f120450u.findViewById(R.id.bnt);
        C2.f120434e = C2.f120450u.findViewById(R.id.byg);
        C2.f120435f = C2.f120450u.findViewById(R.id.ade);
        C2.f120436g = (AVDmtTextView) C2.f120450u.findViewById(R.id.egq);
        C2.f120437h = (VideoEditView) C2.f120450u.findViewById(R.id.fcg);
        C2.f120438i = (ImageView) C2.f120450u.findViewById(R.id.a0w);
        C2.f120439j = (ImageView) C2.f120450u.findViewById(R.id.dov);
        C2.f120440k = (ImageView) C2.f120450u.findViewById(R.id.yj);
        C2.f120442m = C2.f120450u.findViewById(R.id.d1x);
        C2.f120443n = (TextView) C2.f120450u.findViewById(R.id.d1w);
        C2.f120444o = (TextView) C2.f120450u.findViewById(R.id.d20);
        C2.f120445p = (SeekBar) C2.f120450u.findViewById(R.id.d1y);
        C2.f120446q = (ViewGroup) C2.f120450u.findViewById(R.id.d1z);
        C2.f120424P = (FTCEditCornerViewModel) C20531t.m38716a(C2.f120432c).mo33800a(FTCEditCornerViewModel.class);
        C2.f120423N = new C52155a(C2.f120447r, C2.f120432c, C2.f120425Q);
        C2.f120423N.f120168e = new C52155a.AbstractC52156a() {
            /* class com.p2082ss.android.ugc.aweme.ftc.components.sticker.info.C52264i.C522684 */

            static {
                Covode.recordClassIndex(61656);
            }

            @Override // com.p2082ss.android.ugc.aweme.ftc.components.sticker.p3030a.C52155a.AbstractC52156a
            /* renamed from: a */
            public final void mo87883a() {
                C52264i.this.mo88018a(false, (AbstractC45904h) null, true);
            }

            @Override // com.p2082ss.android.ugc.aweme.ftc.components.sticker.p3030a.C52155a.AbstractC52156a
            /* renamed from: b */
            public final void mo87885b() {
                C52264i.this.f120433d.post(new RunnableC52240ai(this));
            }

            @Override // com.p2082ss.android.ugc.aweme.ftc.components.sticker.p3030a.C52155a.AbstractC52156a
            /* renamed from: a */
            public final void mo87884a(String str, C52154a aVar) {
                C52264i.this.f120433d.post(new RunnableC52239ah(this, aVar, str));
            }
        };
        if (C2.f120446q != null) {
            C2.f120446q.setOnTouchListener(new View$OnTouchListenerC52271j(C2));
        }
        C2.f120433d.f120330y = C2.f120430a;
        C2.f120433d.setVisibility(0);
        FTCInfoStickerEditView fTCInfoStickerEditView = C2.f120433d;
        ActivityC0945e eVar2 = C2.f120432c;
        SafeHandler safeHandler = C2.f120453x;
        AbstractC31071f fVar = C2.f120447r;
        VideoPublishEditModel videoPublishEditModel2 = C2.f120449t;
        View view2 = C2.f120450u;
        fTCInfoStickerEditView.f120311e = fVar;
        fTCInfoStickerEditView.f120312f = safeHandler;
        fTCInfoStickerEditView.f120296B = eVar2;
        fTCInfoStickerEditView.f120313g = new C52263h(fTCInfoStickerEditView, fTCInfoStickerEditView.f120311e, view2);
        fTCInfoStickerEditView.f120297C = new FTCInfoStickerEditView.C52229b(fTCInfoStickerEditView, (byte) 0);
        fTCInfoStickerEditView.f120298D.f163452l = videoPublishEditModel2;
        if ((fTCInfoStickerEditView.f120309c == 0 || fTCInfoStickerEditView.f120310d == 0) && fTCInfoStickerEditView.f120311e != null) {
            VESize b = fTCInfoStickerEditView.f120311e.mo56330b();
            fTCInfoStickerEditView.f120309c = b.width;
            fTCInfoStickerEditView.f120310d = b.height;
            fTCInfoStickerEditView.f120307a = (C70636dh.m124831b(fTCInfoStickerEditView.getContext()) - fTCInfoStickerEditView.f120309c) >> 1;
            if (!C70635dg.m124827a(fTCInfoStickerEditView.f120309c, fTCInfoStickerEditView.f120310d)) {
                i = (((C70636dh.m124836e(fTCInfoStickerEditView.getContext()) - C33398a.f79357a.mo59455f()) - C33398a.f79357a.mo59453d()) - fTCInfoStickerEditView.f120310d) / 2;
            }
            fTCInfoStickerEditView.f120308b = i;
        }
        C2.f120435f.setVisibility(8);
        C2.f120433d.setOnInfoStickerTimeEdit(new C52272k(C2));
        C2.f120433d.setOnInfoStickerPinEditClick(new C52283v(C2));
        C2.f120433d.setITimeEditListener(C2);
        C2.f120433d.setPinHelper(C2.f120423N);
        C2.f120455z.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver$OnGlobalLayoutListenerC52232aa(C2));
        if (C2.f120430a) {
            C2.f120454y.mo77276a();
        }
        C2.f120433d.setStickerOnMoveListener(new C52264i.AbstractC52270b() {
            /* class com.p2082ss.android.ugc.aweme.ftc.components.sticker.info.C52264i.C522662 */

            static {
                Covode.recordClassIndex(61654);
            }

            @Override // com.p2082ss.android.ugc.aweme.ftc.components.sticker.info.C52264i.AbstractC52270b
            /* renamed from: a */
            public final Float mo87996a(float f) {
                if (C52264i.this.f120415F != null) {
                    return Float.valueOf(C52264i.this.f120415F.mo77312a(f));
                }
                return Float.valueOf(f);
            }

            @Override // com.p2082ss.android.ugc.aweme.ftc.components.sticker.info.C52264i.AbstractC52270b
            /* renamed from: a */
            public final int mo87994a(C52154a aVar, boolean z, boolean z2) {
                if (C52264i.this.f120415F == null) {
                    return -1;
                }
                if (z) {
                    C52264i.this.f120415F.mo77320b();
                } else if (aVar != null && !C52264i.this.mo88019a() && !C52264i.this.mo88021b()) {
                    return C52264i.this.f120415F.mo77313a(aVar.mo87878c((float) C52264i.this.f120412C), z2);
                }
                return -1;
            }

            @Override // com.p2082ss.android.ugc.aweme.ftc.components.sticker.info.C52264i.AbstractC52270b
            /* renamed from: a */
            public final PointF mo87995a(C52154a aVar, float f, float f2) {
                if (C52264i.this.f120415F == null || aVar == null) {
                    return new PointF(0.0f, 0.0f);
                }
                PointF[] c = aVar.mo87878c((float) C52264i.this.f120412C);
                for (PointF pointF : c) {
                    pointF.x += f;
                    pointF.y += f2;
                }
                return C52264i.this.f120415F.mo77316a(c, f, f2);
            }

            @Override // com.p2082ss.android.ugc.aweme.ftc.components.sticker.info.C52264i.AbstractC52270b
            /* renamed from: a */
            public final void mo87997a(C52154a aVar, int i, int i2, boolean z, boolean z2) {
                boolean z3;
                boolean z4;
                int i3 = -C33398a.f79357a.mo59453d();
                if (!z2) {
                    if (z && C52264i.this.f120433d.f120317k == C52264i.f120409O) {
                        C52264i.this.f120447r.mo56336c(aVar.f120151b.getId(), 1.0f);
                    }
                    if (C52264i.this.f120448s.f120340c == null || !C52264i.this.f120448s.f120340c.getValue().booleanValue()) {
                        z3 = false;
                    } else {
                        z3 = true;
                    }
                    if (C52264i.this.f120448s.f120341d == null || !C52264i.this.f120448s.f120341d.getValue().booleanValue()) {
                        z4 = false;
                    } else {
                        z4 = true;
                    }
                    if (C52264i.this.f120448s == null || (!z3 && !z4)) {
                        Rect rect = C52264i.this.f120414E;
                        float f = (float) C52264i.this.f120412C;
                        float f2 = (float) i3;
                        int length = aVar.f120159j.length;
                        PointF[] pointFArr = new PointF[length];
                        for (int i4 = 0; i4 < length; i4++) {
                            pointFArr[i4] = new PointF();
                            pointFArr[i4].x = aVar.f120159j[i4].x;
                            pointFArr[i4].y = aVar.f120159j[i4].y;
                        }
                        for (int i5 = 0; i5 < length; i5++) {
                            PointF pointF = pointFArr[i5];
                            C84908o.m145916a(pointF, aVar.f120154e.centerX(), aVar.f120154e.centerY(), (float) Math.toRadians((double) aVar.f120151b.rotateAngle));
                            pointF.x -= f;
                            pointF.y -= f2;
                        }
                        boolean a = C45883b.m88524a(rect, pointFArr);
                        if (C52264i.this.f120454y != null) {
                            int a2 = C52264i.this.f120454y.mo77275a(i, i2, z, a);
                            C52264i iVar = C52264i.this;
                            if (a2 == 1) {
                                if (iVar.f120447r != null) {
                                    iVar.f120447r.mo56336c(aVar.f120151b.getId(), 0.3137255f);
                                }
                            } else if (a2 == 3) {
                                if (iVar.f120433d != null) {
                                    FTCInfoStickerEditView fTCInfoStickerEditView = iVar.f120433d;
                                    if (fTCInfoStickerEditView.f120318m != null) {
                                        fTCInfoStickerEditView.f120318m.f120335a = null;
                                    }
                                    if (iVar.f120433d.f120313g != null) {
                                        C52263h hVar = iVar.f120433d.f120313g;
                                        hVar.f120401d.mo56359g(aVar.f120151b.getId());
                                        hVar.f120398a.remove(aVar);
                                        hVar.f120399b = null;
                                        if (hVar.f120402e != null) {
                                            hVar.f120402e.mo87993b(aVar.f120151b);
                                        }
                                        iVar.f120433d.f120320o = true;
                                    }
                                }
                            } else if (a2 == 4 && iVar.f120447r != null) {
                                iVar.f120447r.mo56336c(aVar.f120151b.getId(), 1.0f);
                            }
                        }
                    }
                }
                if (!(C52264i.this.f120454y == null || C52264i.this.f120447r == null)) {
                    C52264i.this.f120447r.mo56336c(aVar.f120151b.getId(), 1.0f);
                }
                if (C52264i.this.f120417H != null) {
                    C52264i.this.f120417H.mo87997a(aVar, i, i2, z, z2);
                }
                if (C52264i.this.mo88019a() || C52264i.this.mo88021b()) {
                    C52264i.this.f120447r.mo56392w();
                }
            }
        });
        C2.f120433d.f120313g.f120404g = new C52233ab(C2);
        C52264i C3 = mo87988C();
        FrameLayout frameLayout = this.f120367d;
        if (frameLayout == null) {
            C89219l.m154710a("borderLineLayout");
        }
        if (!(C3.f120447r == null || frameLayout == null)) {
            C3.f120455z.post(new RunnableC52235ad(C3, frameLayout));
        }
        mo87988C().f120411B = mo87989a().mo114819h();
        mo87988C().f120410A = mo87989a().mo114820i();
        FTCInfoStickerViewModel fTCInfoStickerViewModel = mo87988C().f120448s;
        C89219l.m154716b(fTCInfoStickerViewModel, "");
        fTCInfoStickerViewModel.f120340c = mo87991d().mo87903i();
        FTCInfoStickerViewModel fTCInfoStickerViewModel2 = mo87988C().f120448s;
        C89219l.m154716b(fTCInfoStickerViewModel2, "");
        fTCInfoStickerViewModel2.f120341d = mo87991d().mo87904j();
        FTCInfoStickerViewModel fTCInfoStickerViewModel3 = mo87988C().f120448s;
        C89219l.m154716b(fTCInfoStickerViewModel3, "");
        fTCInfoStickerViewModel3.f120338a = mo87989a().mo114833v();
        FTCInfoStickerViewModel fTCInfoStickerViewModel4 = mo87988C().f120448s;
        C89219l.m154716b(fTCInfoStickerViewModel4, "");
        fTCInfoStickerViewModel4.f120339b = mo87989a().mo114780E();
        AbstractC20382b.C20383a.m38603b(this, m97072D(), C52259d.f120394a, new C52254j(this));
        AbstractC20382b.C20383a.m38603b(this, m97072D(), C52260e.f120395a, new C52255k(this));
        AbstractC20382b.C20383a.m38603b(this, m97072D(), C52261f.f120396a, new C52256l(this));
        AbstractC20382b.C20383a.m38603b(this, m97072D(), C52262g.f120397a, new C52257m(this));
        C52264i C4 = mo87988C();
        C4.f120433d.setStickerDataChangeListener(new C52250f(this));
        mo87988C().f120417H = new C52251g(this);
        mo87988C().f120418I = new C52252h(this);
        C52264i C5 = mo87988C();
        C52253i iVar = new C52253i(this);
        if (!(C5.f120433d == null || C5.f120433d.f120313g == null)) {
            C5.f120433d.f120313g.f120403f = iVar;
        }
        AbstractC14552j jVar = this.f120365b;
        if (jVar == null) {
            C89219l.m154710a("gestureService");
        }
        FTCInfoStickerEditView fTCInfoStickerEditView2 = mo87988C().f120433d;
        C89219l.m154716b(fTCInfoStickerEditView2, "");
        jVar.mo23383a(new C14544f(100, fTCInfoStickerEditView2.getGestureListener()));
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final <VM1 extends JediViewModel<S1>, S1 extends AbstractC20368af, R> R withState(VM1 vm1, AbstractC89172b<? super S1, ? extends R> bVar) {
        C89219l.m154721d(vm1, "");
        C89219l.m154721d(bVar, "");
        return (R) AbstractC20382b.C20383a.m38593a(this, vm1, bVar);
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.components.sticker.info.c$j */
    static final class C52254j extends AbstractC89220m implements AbstractC89183m<AbstractC20382b, C89391z, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C52244c f120389a;

        static {
            Covode.recordClassIndex(61642);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C52254j(C52244c cVar) {
            super(2);
            this.f120389a = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20382b bVar, C89391z zVar) {
            C89219l.m154721d(bVar, "");
            C89219l.m154721d(zVar, "");
            this.f120389a.mo87988C().mo88027h();
            return C89391z.f203057a;
        }
    }

    @Override // com.bytedance.scene.AbstractC22219j
    /* renamed from: a */
    public final View mo22702a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C89219l.m154721d(layoutInflater, "");
        C89219l.m154721d(viewGroup, "");
        View a = C1764a.m5927a(layoutInflater, R.layout.a30, viewGroup, false);
        C89219l.m154716b(a, "");
        return a;
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.components.sticker.info.c$l */
    static final class C52256l extends AbstractC89220m implements AbstractC89183m<AbstractC20382b, C89378p<? extends Float, ? extends Long>, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C52244c f120391a;

        static {
            Covode.recordClassIndex(61644);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C52256l(C52244c cVar) {
            super(2);
            this.f120391a = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20382b bVar, C89378p<? extends Float, ? extends Long> pVar) {
            C89378p<? extends Float, ? extends Long> pVar2 = pVar;
            C89219l.m154721d(bVar, "");
            C89219l.m154721d(pVar2, "");
            FTCInfoStickerEditView fTCInfoStickerEditView = this.f120391a.mo87988C().f120433d;
            C89219l.m154716b(fTCInfoStickerEditView, "");
            C83253u.m143652a(fTCInfoStickerEditView, ((Number) pVar2.getFirst()).floatValue(), ((Number) pVar2.getSecond()).longValue());
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.components.sticker.info.c$m */
    static final class C52257m extends AbstractC89220m implements AbstractC89183m<AbstractC20382b, C89386u<? extends Float, ? extends Float, ? extends Float>, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C52244c f120392a;

        static {
            Covode.recordClassIndex(61645);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C52257m(C52244c cVar) {
            super(2);
            this.f120392a = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20382b bVar, C89386u<? extends Float, ? extends Float, ? extends Float> uVar) {
            C89386u<? extends Float, ? extends Float, ? extends Float> uVar2 = uVar;
            C89219l.m154721d(bVar, "");
            C89219l.m154721d(uVar2, "");
            FTCInfoStickerEditView fTCInfoStickerEditView = this.f120392a.mo87988C().f120433d;
            C89219l.m154716b(fTCInfoStickerEditView, "");
            C83253u.m143651a(fTCInfoStickerEditView, ((Number) uVar2.getFirst()).floatValue(), ((Number) uVar2.getSecond()).floatValue(), ((Number) uVar2.getThird()).floatValue());
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.components.sticker.info.c$k */
    static final class C52255k extends AbstractC89220m implements AbstractC89183m<AbstractC20382b, C89378p<? extends Integer, ? extends Integer>, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C52244c f120390a;

        static {
            Covode.recordClassIndex(61643);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C52255k(C52244c cVar) {
            super(2);
            this.f120390a = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20382b bVar, C89378p<? extends Integer, ? extends Integer> pVar) {
            C89378p<? extends Integer, ? extends Integer> pVar2 = pVar;
            C89219l.m154721d(bVar, "");
            C89219l.m154721d(pVar2, "");
            C52264i C = this.f120390a.mo87988C();
            Integer num = (Integer) pVar2.getFirst();
            Integer num2 = (Integer) pVar2.getSecond();
            if (C.f120433d != null) {
                C.f120433d.f120313g.f120400c = num2.intValue();
            }
            if (C.f120451v) {
                if (C.f120441l != null) {
                    C.f120441l.f156540l = num.intValue();
                }
                C.f120437h.mo111131a(num.intValue());
            }
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
