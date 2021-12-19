package com.p2082ss.android.ugc.gamora.editor.sticker.donation;

import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.AbstractC0952i;
import androidx.fragment.app.ActivityC0945e;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.AbstractC1214u;
import androidx.lifecycle.C1171ab;
import androidx.lifecycle.C1175ad;
import androidx.lifecycle.C1213t;
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
import com.bytedance.jedi.arch.C20521k;
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
import com.p2082ss.android.ugc.aweme.editSticker.interact.AbstractC45898d;
import com.p2082ss.android.ugc.aweme.editSticker.interact.AbstractC45899e;
import com.p2082ss.android.ugc.aweme.editSticker.interact.view.C45922g;
import com.p2082ss.android.ugc.aweme.editSticker.model.InfoStickerModel;
import com.p2082ss.android.ugc.aweme.editSticker.model.StickerItemModel;
import com.p2082ss.android.ugc.aweme.editSticker.p2879c.AbstractC45857b;
import com.p2082ss.android.ugc.aweme.editSticker.p2879c.C45856a;
import com.p2082ss.android.ugc.aweme.editSticker.text.als.AbstractC46036a;
import com.p2082ss.android.ugc.aweme.infoSticker.C56724i;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.C70968bl;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.C71073b;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.EnumC71088d;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.donation.C71100a;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.donation.C71101b;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.donation.C71105c;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.donation.C71106d;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.donation.DonationStickerView;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.donation.EditDonationStickerState;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.donation.EditDonationStickerViewModel;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.p3816c.AbstractC71087a;
import com.p2082ss.android.ugc.aweme.shortvideo.preview.AbstractC72510a;
import com.p2082ss.android.ugc.aweme.shortvideo.util.ToolSafeHandler;
import com.p2082ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.p2082ss.android.ugc.aweme.tools.p4115e.AbstractC78484a;
import com.p2082ss.android.ugc.aweme.tools.p4115e.AbstractC78486c;
import com.p2082ss.android.ugc.gamora.editor.AbstractC82035ab;
import com.p2082ss.android.ugc.gamora.editor.EditHashTagStickerViewModel;
import com.p2082ss.android.ugc.gamora.editor.EditMentionStickerViewModel;
import com.p2082ss.android.ugc.gamora.editor.sticker.core.EditStickerViewModel;
import com.p2082ss.android.ugc.gamora.editor.sticker.donation.p4289c.AbstractC82771b;
import com.p2082ss.android.ugc.gamora.editor.sticker.donation.p4289c.C82772c;
import com.p2082ss.android.ugc.gamora.editor.sticker.duet.AbstractC82814a;
import com.p2082ss.android.ugc.gamora.editor.sticker.info.AbstractC82839a;
import com.p2082ss.android.ugc.gamora.editor.sticker.panel.AbstractC82905a;
import com.p2082ss.android.ugc.gamora.editor.sticker.poll.AbstractC82957a;
import com.p2082ss.android.vesdk.VESize;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
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

/* renamed from: com.ss.android.ugc.gamora.editor.sticker.donation.c */
public final class C82747c extends AbstractC22219j implements AbstractC20382b, AbstractC21566a, AbstractC82791h {

    /* renamed from: a */
    static final /* synthetic */ AbstractC89286i[] f184963a = {new C89232y(C82747c.class, "publishEditModel", "getPublishEditModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0), new C89232y(C82747c.class, "stickerChallengeManager", "getStickerChallengeManager()Lcom/ss/android/ugc/aweme/infoSticker/StickerChallengeManager;", 0)};

    /* renamed from: t */
    public static final C82755h f184964t = new C82755h((byte) 0);

    /* renamed from: A */
    private Runnable f184965A;

    /* renamed from: B */
    private final AbstractC89244h f184966B;

    /* renamed from: C */
    private final AbstractC89244h f184967C;

    /* renamed from: D */
    private final C21582f f184968D;

    /* renamed from: b */
    final AbstractC89244h f184969b = C89250i.m154774a(EnumC89331m.NONE, new C82754g(this));

    /* renamed from: c */
    final AbstractC89244h f184970c = C89250i.m154774a(EnumC89331m.NONE, new C82748a(this));

    /* renamed from: d */
    final AbstractC89244h f184971d = C89250i.m154774a(EnumC89331m.NONE, new C82749b(this));

    /* renamed from: e */
    public EditDonationStickerViewModel f184972e;

    /* renamed from: f */
    public EditMentionStickerViewModel f184973f;

    /* renamed from: g */
    public EditHashTagStickerViewModel f184974g;

    /* renamed from: h */
    final AbstractC89248d f184975h = C21572a.m40504a(getDiContainer(), C56724i.class);

    /* renamed from: i */
    public ToolSafeHandler f184976i;

    /* renamed from: j */
    public AbstractC78486c<View> f184977j;

    /* renamed from: k */
    public FrameLayout f184978k;

    /* renamed from: l */
    public AbstractC82035ab f184979l;

    /* renamed from: u */
    private AbstractC14552j f184980u;

    /* renamed from: v */
    private final AbstractC89244h f184981v = C89250i.m154774a(EnumC89331m.NONE, new C82750c(this));

    /* renamed from: w */
    private final AbstractC89244h f184982w = C89250i.m154774a(EnumC89331m.NONE, new C82751d(this));

    /* renamed from: x */
    private final AbstractC89244h f184983x = C89250i.m154774a(EnumC89331m.NONE, new C82752e(this));

    /* renamed from: y */
    private final AbstractC89248d f184984y = C21572a.m40504a(getDiContainer(), VideoPublishEditModel.class);

    /* renamed from: z */
    private final AbstractC89244h f184985z;

    static {
        Covode.recordClassIndex(96597);
    }

    /* renamed from: M */
    private final VideoPublishEditModel m142902M() {
        return (VideoPublishEditModel) this.f184984y.mo23374a(this, f184963a[0]);
    }

    /* renamed from: N */
    private final EditStickerViewModel m142903N() {
        return (EditStickerViewModel) this.f184985z.getValue();
    }

    /* renamed from: O */
    private final C14544f m142904O() {
        return (C14544f) this.f184967C.getValue();
    }

    /* renamed from: C */
    public final C71101b mo127748C() {
        return (C71101b) this.f184966B.getValue();
    }

    /* renamed from: a */
    public final AbstractC46036a mo127758a() {
        return (AbstractC46036a) this.f184981v.getValue();
    }

    /* renamed from: b */
    public final AbstractC82839a mo127769b() {
        return (AbstractC82839a) this.f184982w.getValue();
    }

    /* renamed from: d */
    public final AbstractC72510a mo127773d() {
        return (AbstractC72510a) this.f184983x.getValue();
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final boolean getUniqueOnlyGlobal() {
        return true;
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.sticker.donation.c$h */
    public static final class C82755h {
        static {
            Covode.recordClassIndex(96605);
        }

        private C82755h() {
        }

        public /* synthetic */ C82755h(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.sticker.donation.c$j */
    public static final class C82757j implements AbstractC71087a {

        /* renamed from: a */
        final /* synthetic */ C82747c f184998a;

        static {
            Covode.recordClassIndex(96607);
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.p3816c.AbstractC71087a
        /* renamed from: c */
        public final void mo112341c() {
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.p3816c.AbstractC71087a
        /* renamed from: e */
        public final void mo112343e() {
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.p3816c.AbstractC71087a
        /* renamed from: f */
        public final void mo112344f() {
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.p3816c.AbstractC71087a
        /* renamed from: b */
        public final void mo112339b() {
            mo112336a();
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.p3816c.AbstractC71087a
        /* renamed from: a */
        public final void mo112336a() {
            C82747c cVar = this.f184998a;
            Activity activity = cVar.f52549m;
            Objects.requireNonNull(activity, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
            AbstractC0952i supportFragmentManager = ((ActivityC0945e) activity).getSupportFragmentManager();
            C89219l.m154716b(supportFragmentManager, "");
            cVar.mo127759a(supportFragmentManager);
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.p3816c.AbstractC71087a
        /* renamed from: d */
        public final void mo112342d() {
            C82747c cVar = this.f184998a;
            ((C56724i) cVar.f184975h.mo23374a(cVar, C82747c.f184963a[1])).mo93672a(this.f184998a.mo127748C().f159240b);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C82757j(C82747c cVar) {
            this.f184998a = cVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.p3816c.AbstractC71087a
        /* renamed from: a */
        public final void mo112337a(View view) {
            C89219l.m154721d(view, "");
            C82747c.m142905a(this.f184998a).mo112369a(true);
            if (this.f184998a.f184977j != null) {
                AbstractC78486c<View> cVar = this.f184998a.f184977j;
                if (cVar == null) {
                    C89219l.m154715b();
                }
                cVar.mo87979a(view);
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.p3816c.AbstractC71087a
        /* renamed from: a */
        public final void mo112338a(boolean z) {
            this.f184998a.mo127769b().mo127929i();
            this.f184998a.mo127758a().mo77639n();
            if (!z || this.f184998a.mo127757L()) {
                this.f184998a.mo127773d().mo114805a((AbstractC72510a) false, true, false);
            } else {
                this.f184998a.mo127773d().mo114805a((AbstractC72510a) true, true, true);
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.p3816c.AbstractC71087a
        /* renamed from: b */
        public final void mo112340b(boolean z) {
            if (z) {
                EditHashTagStickerViewModel editHashTagStickerViewModel = this.f184998a.f184974g;
                if (editHashTagStickerViewModel == null) {
                    C89219l.m154710a("editHashTagStickerViewModel");
                }
                editHashTagStickerViewModel.mo127215b();
                EditMentionStickerViewModel editMentionStickerViewModel = this.f184998a.f184973f;
                if (editMentionStickerViewModel == null) {
                    C89219l.m154710a("editMentionStickerViewModel");
                }
                editMentionStickerViewModel.mo127228b();
                this.f184998a.mo127769b().mo127929i();
                ((AbstractC82957a) this.f184998a.f184970c.getValue()).mo128021b();
                ((AbstractC82814a) this.f184998a.f184971d.getValue()).mo127882b();
                this.f184998a.mo127758a().mo77639n();
            }
        }
    }

    @Override // com.bytedance.p1559o.AbstractC21566a
    public final C21582f getDiContainer() {
        return this.f184968D;
    }

    /* Return type fixed from 'com.bytedance.jedi.arch.g' to match base method */
    @Override // com.bytedance.jedi.arch.AbstractC20367ae
    public final /* bridge */ /* synthetic */ AbstractC20477i getReceiver() {
        return this;
    }

    @Override // com.p2082ss.android.ugc.gamora.editor.sticker.donation.AbstractC82791h
    /* renamed from: a */
    public final void mo127766a(String str) {
        C89219l.m154721d(str, "");
        mo127748C().mo112279a(str);
    }

    @Override // com.p2082ss.android.ugc.gamora.editor.sticker.donation.AbstractC82791h
    /* renamed from: a */
    public final void mo127765a(VESize vESize) {
        C89219l.m154721d(vESize, "");
        mo127748C().f159187q = vESize;
    }

    @Override // com.p2082ss.android.ugc.gamora.editor.sticker.donation.AbstractC82791h
    /* renamed from: a */
    public final void mo127767a(boolean z) {
        mo127748C().f159175e = z;
    }

    @Override // com.p2082ss.android.ugc.gamora.editor.sticker.donation.AbstractC82791h
    /* renamed from: a */
    public final void mo127764a(AbstractC82035ab abVar) {
        C89219l.m154721d(abVar, "");
        this.f184979l = abVar;
    }

    @Override // com.p2082ss.android.ugc.gamora.editor.sticker.donation.AbstractC82791h
    /* renamed from: a */
    public final boolean mo127768a(View view) {
        C89219l.m154721d(view, "");
        return view instanceof DonationStickerView;
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.sticker.donation.c$p */
    public static final class RunnableC82764p implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C82747c f185005a;

        /* renamed from: b */
        private int f185006b = -1;

        /* renamed from: c */
        private Runnable f185007c = new RunnableC82765a(this);

        static {
            Covode.recordClassIndex(96614);
        }

        /* renamed from: com.ss.android.ugc.gamora.editor.sticker.donation.c$p$a */
        static final class RunnableC82765a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ RunnableC82764p f185008a;

            static {
                Covode.recordClassIndex(96615);
            }

            RunnableC82765a(RunnableC82764p pVar) {
                this.f185008a = pVar;
            }

            public final void run() {
                int i = Build.VERSION.SDK_INT;
            }
        }

        public final void run() {
            int k;
            Runnable runnable = this.f185007c;
            C71106d dVar = null;
            if (runnable != null) {
                runnable.run();
                this.f185007c = null;
            }
            C82747c.m142906b(this.f185005a).postDelayed(this, 16);
            AbstractC31071f value = this.f185005a.mo127773d().mo114778C().getValue();
            if (value != null && this.f185005a.mo127749D() && (k = value.mo56370k()) != this.f185006b) {
                this.f185006b = k;
                C71101b C = this.f185005a.mo127748C();
                long j = (long) k;
                C45922g gVar = C.f159182l;
                if (!(gVar instanceof C71106d)) {
                    gVar = null;
                }
                C71106d dVar2 = (C71106d) gVar;
                if (dVar2 != null) {
                    dVar2.setPlayPosition(j);
                }
                if (C.f159241c) {
                    C45922g gVar2 = C.f159182l;
                    if (gVar2 instanceof C71106d) {
                        dVar = gVar2;
                    }
                    C71106d dVar3 = (C71106d) dVar;
                    if (dVar3 != null) {
                        dVar3.mo112378r();
                        return;
                    }
                    return;
                }
                C45922g gVar3 = C.f159182l;
                if (gVar3 instanceof C71106d) {
                    dVar = gVar3;
                }
                C71106d dVar4 = dVar;
                if (dVar4 != null && dVar4.f159249q.mo112349b()) {
                    dVar4.post(new C71106d.RunnableC71107a(dVar4));
                }
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        RunnableC82764p(C82747c cVar) {
            this.f185005a = cVar;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.sticker.donation.c$s */
    static final class C82769s extends AbstractC89220m implements AbstractC89171a<C71101b> {

        /* renamed from: a */
        public static final C82769s f185012a = new C82769s();

        static {
            Covode.recordClassIndex(96619);
        }

        C82769s() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C71101b invoke() {
            return new C71101b();
        }
    }

    @Override // com.p2082ss.android.ugc.gamora.editor.sticker.donation.AbstractC82791h
    /* renamed from: H */
    public final void mo127753H() {
        mo127748C().mo112285d();
    }

    @Override // com.p2082ss.android.ugc.gamora.editor.sticker.donation.AbstractC82791h
    /* renamed from: I */
    public final void mo127754I() {
        mo127748C().mo112321k();
    }

    @Override // com.p2082ss.android.ugc.gamora.editor.sticker.donation.AbstractC82791h
    /* renamed from: J */
    public final void mo127755J() {
        mo127748C().mo112324n();
    }

    @Override // com.p2082ss.android.ugc.gamora.editor.sticker.donation.AbstractC82791h
    /* renamed from: K */
    public final AbstractC45898d mo127756K() {
        return mo127748C();
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

    /* renamed from: com.ss.android.ugc.gamora.editor.sticker.donation.c$a */
    public static final class C82748a extends AbstractC89220m implements AbstractC89171a<AbstractC82957a> {

        /* renamed from: a */
        final /* synthetic */ AbstractC21566a f184986a;

        static {
            Covode.recordClassIndex(96598);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C82748a(AbstractC21566a aVar) {
            super(0);
            this.f184986a = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.bytedance.als.b, com.ss.android.ugc.gamora.editor.sticker.poll.a] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.p2082ss.android.ugc.gamora.editor.sticker.poll.AbstractC82957a invoke() {
            /*
                r3 = this;
                com.bytedance.o.a r0 = r3.f184986a
                com.bytedance.o.f r2 = r0.getDiContainer()
                java.lang.Class<com.ss.android.ugc.gamora.editor.sticker.poll.a> r1 = com.p2082ss.android.ugc.gamora.editor.sticker.poll.AbstractC82957a.class
                r0 = 0
                java.lang.Object r0 = r2.mo35249a(r1, r0)
                com.bytedance.als.b r0 = (com.bytedance.als.AbstractC2547b) r0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.gamora.editor.sticker.donation.C82747c.C82748a.invoke():com.bytedance.als.b");
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.sticker.donation.c$b */
    public static final class C82749b extends AbstractC89220m implements AbstractC89171a<AbstractC82814a> {

        /* renamed from: a */
        final /* synthetic */ AbstractC21566a f184987a;

        static {
            Covode.recordClassIndex(96599);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C82749b(AbstractC21566a aVar) {
            super(0);
            this.f184987a = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.ss.android.ugc.gamora.editor.sticker.duet.a, com.bytedance.als.b] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.p2082ss.android.ugc.gamora.editor.sticker.duet.AbstractC82814a invoke() {
            /*
                r3 = this;
                com.bytedance.o.a r0 = r3.f184987a
                com.bytedance.o.f r2 = r0.getDiContainer()
                java.lang.Class<com.ss.android.ugc.gamora.editor.sticker.duet.a> r1 = com.p2082ss.android.ugc.gamora.editor.sticker.duet.AbstractC82814a.class
                r0 = 0
                java.lang.Object r0 = r2.mo35249a(r1, r0)
                com.bytedance.als.b r0 = (com.bytedance.als.AbstractC2547b) r0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.gamora.editor.sticker.donation.C82747c.C82749b.invoke():com.bytedance.als.b");
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.sticker.donation.c$c */
    public static final class C82750c extends AbstractC89220m implements AbstractC89171a<AbstractC46036a> {

        /* renamed from: a */
        final /* synthetic */ AbstractC21566a f184988a;

        static {
            Covode.recordClassIndex(96600);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C82750c(AbstractC21566a aVar) {
            super(0);
            this.f184988a = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.bytedance.als.b, com.ss.android.ugc.aweme.editSticker.text.als.a] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.p2082ss.android.ugc.aweme.editSticker.text.als.AbstractC46036a invoke() {
            /*
                r3 = this;
                com.bytedance.o.a r0 = r3.f184988a
                com.bytedance.o.f r2 = r0.getDiContainer()
                java.lang.Class<com.ss.android.ugc.aweme.editSticker.text.als.a> r1 = com.p2082ss.android.ugc.aweme.editSticker.text.als.AbstractC46036a.class
                r0 = 0
                java.lang.Object r0 = r2.mo35249a(r1, r0)
                com.bytedance.als.b r0 = (com.bytedance.als.AbstractC2547b) r0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.gamora.editor.sticker.donation.C82747c.C82750c.invoke():com.bytedance.als.b");
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.sticker.donation.c$d */
    public static final class C82751d extends AbstractC89220m implements AbstractC89171a<AbstractC82839a> {

        /* renamed from: a */
        final /* synthetic */ AbstractC21566a f184989a;

        static {
            Covode.recordClassIndex(96601);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C82751d(AbstractC21566a aVar) {
            super(0);
            this.f184989a = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.bytedance.als.b, com.ss.android.ugc.gamora.editor.sticker.info.a] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.p2082ss.android.ugc.gamora.editor.sticker.info.AbstractC82839a invoke() {
            /*
                r3 = this;
                com.bytedance.o.a r0 = r3.f184989a
                com.bytedance.o.f r2 = r0.getDiContainer()
                java.lang.Class<com.ss.android.ugc.gamora.editor.sticker.info.a> r1 = com.p2082ss.android.ugc.gamora.editor.sticker.info.AbstractC82839a.class
                r0 = 0
                java.lang.Object r0 = r2.mo35249a(r1, r0)
                com.bytedance.als.b r0 = (com.bytedance.als.AbstractC2547b) r0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.gamora.editor.sticker.donation.C82747c.C82751d.invoke():com.bytedance.als.b");
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.sticker.donation.c$e */
    public static final class C82752e extends AbstractC89220m implements AbstractC89171a<AbstractC72510a> {

        /* renamed from: a */
        final /* synthetic */ AbstractC21566a f184990a;

        static {
            Covode.recordClassIndex(96602);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C82752e(AbstractC21566a aVar) {
            super(0);
            this.f184990a = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.bytedance.als.b, com.ss.android.ugc.aweme.shortvideo.preview.a] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.p2082ss.android.ugc.aweme.shortvideo.preview.AbstractC72510a invoke() {
            /*
                r3 = this;
                com.bytedance.o.a r0 = r3.f184990a
                com.bytedance.o.f r2 = r0.getDiContainer()
                java.lang.Class<com.ss.android.ugc.aweme.shortvideo.preview.a> r1 = com.p2082ss.android.ugc.aweme.shortvideo.preview.AbstractC72510a.class
                r0 = 0
                java.lang.Object r0 = r2.mo35249a(r1, r0)
                com.bytedance.als.b r0 = (com.bytedance.als.AbstractC2547b) r0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.gamora.editor.sticker.donation.C82747c.C82752e.invoke():com.bytedance.als.b");
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.sticker.donation.c$g */
    public static final class C82754g extends AbstractC89220m implements AbstractC89171a<AbstractC82905a> {

        /* renamed from: a */
        final /* synthetic */ AbstractC21566a f184994a;

        static {
            Covode.recordClassIndex(96604);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C82754g(AbstractC21566a aVar) {
            super(0);
            this.f184994a = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.ss.android.ugc.gamora.editor.sticker.panel.a, com.bytedance.als.b] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.p2082ss.android.ugc.gamora.editor.sticker.panel.AbstractC82905a invoke() {
            /*
                r3 = this;
                com.bytedance.o.a r0 = r3.f184994a
                com.bytedance.o.f r2 = r0.getDiContainer()
                java.lang.Class<com.ss.android.ugc.gamora.editor.sticker.panel.a> r1 = com.p2082ss.android.ugc.gamora.editor.sticker.panel.AbstractC82905a.class
                r0 = 0
                java.lang.Object r0 = r2.mo35252b(r1, r0)
                com.bytedance.als.b r0 = (com.bytedance.als.AbstractC2547b) r0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.gamora.editor.sticker.donation.C82747c.C82754g.invoke():com.bytedance.als.b");
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.sticker.donation.c$q */
    static final class C82767q extends AbstractC89220m implements AbstractC89171a<C14544f> {

        /* renamed from: a */
        final /* synthetic */ C82747c f185010a;

        static {
            Covode.recordClassIndex(96617);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C82767q(C82747c cVar) {
            super(0);
            this.f185010a = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C14544f invoke() {
            return new C14544f(300, this.f185010a.mo127748C().f159188r);
        }
    }

    /* renamed from: D */
    public final boolean mo127749D() {
        if (mo127748C().f159182l != null) {
            return true;
        }
        return false;
    }

    @Override // com.p2082ss.android.ugc.gamora.editor.sticker.donation.AbstractC82791h
    /* renamed from: E */
    public final InteractStickerStruct mo127750E() {
        return mo127748C().mo112284c();
    }

    @Override // com.p2082ss.android.ugc.gamora.editor.sticker.donation.AbstractC82791h
    /* renamed from: F */
    public final boolean mo127751F() {
        return mo127748C().mo112283b();
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.sticker.donation.c$r */
    public static final class C82768r implements AbstractC82792i {

        /* renamed from: a */
        final /* synthetic */ C82747c f185011a;

        static {
            Covode.recordClassIndex(96618);
        }

        @Override // com.p2082ss.android.ugc.gamora.editor.sticker.donation.AbstractC82792i
        /* renamed from: a */
        public final void mo79550a() {
            C82747c cVar = this.f185011a;
            cVar.mo127773d().mo114804a(false);
            AbstractC31071f value = cVar.mo127773d().mo114778C().getValue();
            if (value != null) {
                value.mo56388t();
            }
        }

        @Override // com.p2082ss.android.ugc.gamora.editor.sticker.donation.AbstractC82792i
        /* renamed from: b */
        public final void mo79552b() {
            C82747c cVar = this.f185011a;
            cVar.mo127773d().mo114804a(true);
            AbstractC31071f value = cVar.mo127773d().mo114778C().getValue();
            if (value != null) {
                value.mo56390u();
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C82768r(C82747c cVar) {
            this.f185011a = cVar;
        }

        @Override // com.p2082ss.android.ugc.gamora.editor.sticker.donation.AbstractC82792i
        /* renamed from: a */
        public final void mo79551a(AbstractC82771b bVar) {
            String str;
            AbstractC82771b bVar2;
            C89219l.m154721d(bVar, "");
            AbstractC82905a aVar = (AbstractC82905a) this.f185011a.f184969b.getValue();
            if (aVar != null) {
                aVar.mo127989a((AbstractC82905a) false, (boolean) "click_button");
            }
            if (this.f185011a.mo127749D()) {
                C71101b C = this.f185011a.mo127748C();
                C89219l.m154721d(bVar, "");
                C71106d dVar = null;
                if (bVar.getAddTime() == null) {
                    C71105c cVar = C.f159239a;
                    if (cVar == null || (bVar2 = cVar.f159245a) == null) {
                        str = null;
                    } else {
                        str = bVar2.getAddTime();
                    }
                    bVar.setAddTime(str);
                }
                C71105c cVar2 = C.f159239a;
                if (cVar2 != null) {
                    cVar2.f159245a = bVar;
                }
                C45922g gVar = C.f159182l;
                if (gVar instanceof C71106d) {
                    dVar = gVar;
                }
                C71106d dVar2 = dVar;
                if (dVar2 != null) {
                    C89219l.m154721d(bVar, "");
                    dVar2.f159249q.mo112348a(bVar);
                    return;
                }
                return;
            }
            C82747c cVar3 = this.f185011a;
            C71105c cVar4 = new C71105c(bVar, 14);
            cVar3.mo127748C().mo112306a(cVar3.mo127773d().mo114778C().getValue(), cVar3.mo127773d());
            cVar3.mo127748C().mo112371a(cVar4, true, false);
        }
    }

    @Override // com.p2082ss.android.ugc.gamora.editor.sticker.donation.AbstractC82791h
    /* renamed from: L */
    public final boolean mo127757L() {
        EditDonationStickerViewModel editDonationStickerViewModel = this.f184972e;
        if (editDonationStickerViewModel == null) {
            C89219l.m154710a("donationStickerViewModel");
        }
        return ((EditDonationStickerState) editDonationStickerViewModel.mo33676a(getLifecycleOwner())).getInTimeEditView();
    }

    @Override // com.bytedance.scene.AbstractC22219j
    /* renamed from: n_ */
    public final void mo22713n_() {
        super.mo22713n_();
        AbstractC14552j jVar = this.f184980u;
        if (jVar == null) {
            C89219l.m154710a("gestureService");
        }
        jVar.mo23385b(m142904O());
    }

    @Override // com.bytedance.scene.AbstractC22219j
    /* renamed from: w */
    public final void mo36490w() {
        super.mo36490w();
        ToolSafeHandler toolSafeHandler = this.f184976i;
        if (toolSafeHandler == null) {
            C89219l.m154710a("safeHandler");
        }
        Runnable runnable = this.f184965A;
        if (runnable == null) {
            C89219l.m154710a("mNonInfoStickerPlayingRefreshTask");
        }
        toolSafeHandler.postDelayed(runnable, 200);
    }

    @Override // com.bytedance.scene.AbstractC22219j
    /* renamed from: x */
    public final void mo36491x() {
        super.mo36491x();
        ToolSafeHandler toolSafeHandler = this.f184976i;
        if (toolSafeHandler == null) {
            C89219l.m154710a("safeHandler");
        }
        Runnable runnable = this.f184965A;
        if (runnable == null) {
            C89219l.m154710a("mNonInfoStickerPlayingRefreshTask");
        }
        toolSafeHandler.removeCallbacks(runnable);
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.sticker.donation.c$f */
    public static final class C82753f extends AbstractC89220m implements AbstractC89171a<EditStickerViewModel> {

        /* renamed from: a */
        final /* synthetic */ AbstractC22219j f184991a;

        /* renamed from: b */
        final /* synthetic */ AbstractC89277c f184992b;

        /* renamed from: c */
        final /* synthetic */ AbstractC89277c f184993c;

        static {
            Covode.recordClassIndex(96603);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C82753f(AbstractC22219j jVar, AbstractC89277c cVar, AbstractC89277c cVar2) {
            super(0);
            this.f184991a = jVar;
            this.f184992b = cVar;
            this.f184993c = cVar2;
        }

        /* JADX WARN: Type inference failed for: r0v8, types: [com.bytedance.jedi.arch.JediViewModel, com.ss.android.ugc.gamora.editor.sticker.core.EditStickerViewModel] */
        /* JADX WARN: Type inference failed for: r0v15, types: [com.bytedance.jedi.arch.JediViewModel, com.ss.android.ugc.gamora.editor.sticker.core.EditStickerViewModel] */
        /* JADX WARNING: Unknown variable types count: 2 */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.p2082ss.android.ugc.gamora.editor.sticker.core.EditStickerViewModel invoke() {
            /*
                r6 = this;
                com.bytedance.scene.j r0 = r6.f184991a
                com.bytedance.scene.j r5 = r0.f52551o
                h.k.c r0 = r6.f184993c
                java.lang.Class r0 = p4600h.p4611f.C89170a.m154665a(r0)
                java.lang.String r3 = r0.getCanonicalName()
                java.lang.String r4 = ""
                p4600h.p4611f.p4613b.C89219l.m154716b(r3, r4)
            L_0x0013:
                if (r5 == 0) goto L_0x003a
                androidx.lifecycle.ad$b r0 = com.bytedance.jedi.arch.C20392e.f48284a     // Catch:{ as -> 0x0035 }
                androidx.lifecycle.ad r2 = com.bytedance.scene.C22267s.m41934a(r5, r0)     // Catch:{ as -> 0x0035 }
                h.k.c r0 = r6.f184993c     // Catch:{ as -> 0x0035 }
                java.lang.Class r0 = p4600h.p4611f.C89170a.m154665a(r0)     // Catch:{ as -> 0x0035 }
                java.lang.String r1 = r0.getCanonicalName()     // Catch:{ as -> 0x0035 }
                p4600h.p4611f.p4613b.C89219l.m154716b(r1, r4)     // Catch:{ as -> 0x0035 }
                h.k.c r0 = r6.f184992b     // Catch:{ as -> 0x0035 }
                java.lang.Class r0 = p4600h.p4611f.C89170a.m154665a(r0)     // Catch:{ as -> 0x0035 }
                androidx.lifecycle.ac r0 = m142939x82ff90ea(r2, r1, r0)     // Catch:{ as -> 0x0035 }
                com.bytedance.jedi.arch.JediViewModel r0 = (com.bytedance.jedi.arch.JediViewModel) r0     // Catch:{ as -> 0x0035 }
                goto L_0x0038
            L_0x0035:
                com.bytedance.scene.j r5 = r5.f52551o
                goto L_0x0013
            L_0x0038:
                if (r0 != 0) goto L_0x0052
            L_0x003a:
                com.bytedance.scene.j r0 = r6.f184991a
                androidx.fragment.app.e r1 = com.bytedance.scene.ktx.C22228c.m41832b(r0)
                androidx.lifecycle.ad$b r0 = com.bytedance.jedi.arch.C20392e.f48284a
                androidx.lifecycle.ad r1 = androidx.lifecycle.C1181ae.m3881a(r1, r0)
                h.k.c r0 = r6.f184992b
                java.lang.Class r0 = p4600h.p4611f.C89170a.m154665a(r0)
                androidx.lifecycle.ac r0 = m142939x82ff90ea(r1, r3, r0)
                com.bytedance.jedi.arch.JediViewModel r0 = (com.bytedance.jedi.arch.JediViewModel) r0
            L_0x0052:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.gamora.editor.sticker.donation.C82747c.C82753f.invoke():com.bytedance.jedi.arch.JediViewModel");
        }

        /* renamed from: com_ss_android_ugc_gamora_editor_sticker_donation_EditDonationStickerScene$$special$$inlined$hostViewModel$1_androidx_lifecycle_VScopeLancet_get */
        public static AbstractC1174ac m142939x82ff90ea(C1175ad adVar, String str, Class cls) {
            if (cls.equals(ScopeViewModel.class)) {
                return adVar.mo3984a(str, cls);
            }
            AbstractC1174ac a = adVar.mo3984a(str, cls);
            C1171ab.m3870a(a, adVar);
            return a;
        }
    }

    @Override // com.p2082ss.android.ugc.gamora.editor.sticker.donation.AbstractC82791h
    /* renamed from: G */
    public final void mo127752G() {
        List<StickerItemModel> list;
        mo127748C().mo112306a(mo127773d().mo114778C().getValue(), mo127773d());
        C71105c cVar = new C71105c(null, 15);
        List<InteractStickerStruct> a = C71073b.m125565a(m142902M().getMainBusinessContext(), 4, EnumC71088d.TRACK_PAGE_EDIT);
        InfoStickerModel infoStickerModel = m142902M().infoStickerModel;
        if (!(infoStickerModel == null || (list = infoStickerModel.stickers) == null)) {
            Iterator<StickerItemModel> it = list.iterator();
            while (it.hasNext()) {
                StickerItemModel next = it.next();
                if (next.type == 7) {
                    cVar.f159245a = (AbstractC82771b) C63244g.m114602a().mo73257C().getRetrofitFactoryGson().mo46670a(next.extra, C82772c.class);
                    cVar.f159247c = next.startTime;
                    cVar.f159248d = next.endTime;
                    mo127748C().mo112279a(next.path);
                    mo127748C().f159240b = next.stickerId;
                    it.remove();
                }
            }
        }
        if (a != null && !a.isEmpty() && cVar.f159245a != null) {
            cVar.f159246b = a.get(0);
            mo127748C().mo112371a(cVar, false, true);
            mo127748C().mo112310a(a.get(0));
        }
    }

    @Override // com.p2082ss.android.ugc.gamora.editor.sticker.donation.AbstractC82791h
    /* renamed from: a */
    public final void mo127760a(AbstractC14552j jVar) {
        C89219l.m154721d(jVar, "");
        this.f184980u = jVar;
    }

    @Override // com.p2082ss.android.ugc.gamora.editor.sticker.donation.AbstractC82791h
    /* renamed from: b */
    public final boolean mo127772b(View view) {
        C89219l.m154721d(view, "");
        return view instanceof C71106d;
    }

    /* renamed from: a */
    public static final /* synthetic */ EditDonationStickerViewModel m142905a(C82747c cVar) {
        EditDonationStickerViewModel editDonationStickerViewModel = cVar.f184972e;
        if (editDonationStickerViewModel == null) {
            C89219l.m154710a("donationStickerViewModel");
        }
        return editDonationStickerViewModel;
    }

    /* renamed from: b */
    public static final /* synthetic */ ToolSafeHandler m142906b(C82747c cVar) {
        ToolSafeHandler toolSafeHandler = cVar.f184976i;
        if (toolSafeHandler == null) {
            C89219l.m154710a("safeHandler");
        }
        return toolSafeHandler;
    }

    @Override // com.bytedance.jedi.arch.AbstractC20382b
    public final <VM1 extends JediViewModel<S1>, S1 extends AbstractC20368af> S1 getState(VM1 vm1) {
        C89219l.m154721d(vm1, "");
        return (S1) AbstractC20382b.C20383a.m38582a(this, vm1);
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.sticker.donation.c$k */
    static final class C82758k<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ C82747c f184999a;

        static {
            Covode.recordClassIndex(96608);
        }

        C82758k(C82747c cVar) {
            this.f184999a = cVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            AbstractC31071f fVar = (AbstractC31071f) obj;
            if (fVar != null) {
                this.f184999a.mo127748C().mo112306a(fVar, this.f184999a.mo127773d());
            }
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.sticker.donation.c$m */
    static final class C82760m<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ C82747c f185001a;

        static {
            Covode.recordClassIndex(96610);
        }

        C82760m(C82747c cVar) {
            this.f185001a = cVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            Float f = (Float) obj;
            if (f != null) {
                this.f185001a.mo127748C().mo112305a(f.floatValue());
            }
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.sticker.donation.c$n */
    static final class C82761n<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ C82747c f185002a;

        static {
            Covode.recordClassIndex(96611);
        }

        C82761n(C82747c cVar) {
            this.f185002a = cVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            Boolean bool = (Boolean) obj;
            EditDonationStickerViewModel a = C82747c.m142905a(this.f185002a);
            if (bool == null) {
                C89219l.m154715b();
            }
            a.mo112369a(bool.booleanValue());
        }
    }

    @Override // com.p2082ss.android.ugc.gamora.editor.sticker.donation.AbstractC82791h
    /* renamed from: a */
    public final void mo127761a(AbstractC45899e eVar) {
        C89219l.m154721d(eVar, "");
        mo127748C().f159176f = eVar;
    }

    @Override // com.p2082ss.android.ugc.gamora.editor.sticker.donation.AbstractC82791h
    /* renamed from: b */
    public final void mo127770b(String str) {
        C89219l.m154721d(str, "");
        mo127748C().f159240b = str;
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.sticker.donation.c$i */
    static final class C82756i<TTaskResult, TContinuationResult> implements AbstractC1729g {

        /* renamed from: a */
        final /* synthetic */ C82747c f184995a;

        /* renamed from: b */
        final /* synthetic */ AbstractC31071f f184996b;

        /* renamed from: c */
        final /* synthetic */ AbstractC82035ab f184997c;

        static {
            Covode.recordClassIndex(96606);
        }

        C82756i(C82747c cVar, AbstractC31071f fVar, AbstractC82035ab abVar) {
            this.f184995a = cVar;
            this.f184996b = fVar;
            this.f184997c = abVar;
        }

        @Override // p077b.AbstractC1729g
        public final /* synthetic */ Object then(C1731i iVar) {
            int i;
            String str = "";
            C89219l.m154716b(iVar, str);
            C71100a aVar = (C71100a) iVar.mo5545d();
            if (aVar != null) {
                C71105c cVar = aVar.f159236a;
                String b = C63244g.m114602a().mo73257C().getRetrofitFactoryGson().mo46674b(cVar.f159245a);
                int j = this.f184996b.mo56368j();
                if (cVar.f159248d != 0) {
                    i = cVar.f159247c;
                    j = cVar.f159248d;
                } else {
                    i = 0;
                }
                String str2 = this.f184995a.mo127748C().f159240b;
                if (str2 != null) {
                    str = str2;
                }
                StickerItemModel stickerItemModel = new StickerItemModel(str, aVar.stickerPath, b, aVar.index, false, i, j, 7);
                stickerItemModel.isImageStickerLayer = true;
                this.f184997c.mo87638a(stickerItemModel);
            }
            return C89391z.f203057a;
        }
    }

    @Override // com.p2082ss.android.ugc.gamora.editor.sticker.donation.AbstractC82791h
    /* renamed from: b */
    public final void mo127771b(boolean z) {
        C71101b C = mo127748C();
        C.f159241c = z;
        if (C.f159241c) {
            C45922g gVar = C.f159182l;
            if (!(gVar instanceof C71106d)) {
                gVar = null;
            }
            C71106d dVar = (C71106d) gVar;
            if (dVar != null) {
                dVar.mo112378r();
            }
        }
    }

    public C82747c(C21582f fVar) {
        C89219l.m154721d(fVar, "");
        this.f184968D = fVar;
        AbstractC89277c a = C89204ab.m154669a(EditStickerViewModel.class);
        this.f184985z = C89250i.m154773a((AbstractC89171a) new C82753f(this, a, a));
        this.f184966B = C89250i.m154773a((AbstractC89171a) C82769s.f185012a);
        this.f184967C = C89250i.m154773a((AbstractC89171a) new C82767q(this));
    }

    @Override // com.bytedance.scene.AbstractC22219j
    /* renamed from: a */
    public final void mo22704a(Bundle bundle) {
        super.mo22704a(bundle);
        Activity activity = this.f52549m;
        Objects.requireNonNull(activity, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        JediViewModel a = C20531t.m38716a((ActivityC0945e) activity).mo33800a(EditDonationStickerViewModel.class);
        C89219l.m154716b(a, "");
        this.f184972e = (EditDonationStickerViewModel) a;
        Activity activity2 = this.f52549m;
        Objects.requireNonNull(activity2, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        JediViewModel a2 = C20531t.m38716a((ActivityC0945e) activity2).mo33800a(EditMentionStickerViewModel.class);
        C89219l.m154716b(a2, "");
        this.f184973f = (EditMentionStickerViewModel) a2;
        Activity activity3 = this.f52549m;
        Objects.requireNonNull(activity3, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        JediViewModel a3 = C20531t.m38716a((ActivityC0945e) activity3).mo33800a(EditHashTagStickerViewModel.class);
        C89219l.m154716b(a3, "");
        this.f184974g = (EditHashTagStickerViewModel) a3;
        mo127773d().mo114778C().observe(this, new C82758k(this));
        EditDonationStickerViewModel editDonationStickerViewModel = this.f184972e;
        if (editDonationStickerViewModel == null) {
            C89219l.m154710a("donationStickerViewModel");
        }
        AbstractC20382b.C20383a.m38603b(this, editDonationStickerViewModel, C82777d.f185042a, new C82759l(this));
        EditDonationStickerViewModel editDonationStickerViewModel2 = this.f184972e;
        if (editDonationStickerViewModel2 == null) {
            C89219l.m154710a("donationStickerViewModel");
        }
        editDonationStickerViewModel2.mo112367a().observe(this, new C82760m(this));
        m142903N().mo127691n().observe(this, new C82761n(this));
        EditDonationStickerViewModel editDonationStickerViewModel3 = this.f184972e;
        if (editDonationStickerViewModel3 == null) {
            C89219l.m154710a("donationStickerViewModel");
        }
        C1213t<Boolean> n = m142903N().mo127691n();
        C89219l.m154721d(n, "");
        editDonationStickerViewModel3.f159231a = n;
        selectNonNullSubscribe(m142903N(), C82778e.f185043a, new C20370ah(), new C82762o(this));
        mo127748C().f159184n = new C82757j(this);
        Activity activity4 = this.f52549m;
        Objects.requireNonNull(activity4, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        this.f184976i = new ToolSafeHandler((ActivityC0945e) activity4);
        this.f184965A = new RunnableC82764p(this);
    }

    @Override // com.p2082ss.android.ugc.gamora.editor.sticker.donation.AbstractC82791h
    /* renamed from: a */
    public final void mo127759a(AbstractC0952i iVar) {
        C89219l.m154721d(iVar, "");
        C82745b bVar = new C82745b(m142902M().mShootWay, m142902M().creationId, C70968bl.m125262b(m142902M()), C70968bl.m125249a(m142902M()));
        C89219l.m154721d(iVar, "");
        C89219l.m154721d(bVar, "");
        Fragment a = iVar.mo3551a("EditSelectDonationOrganizationDialogFragment");
        if (!(a instanceof C82779f)) {
            a = null;
        }
        C82779f fVar = (C82779f) a;
        if (fVar == null) {
            fVar = new C82779f();
        }
        Bundle bundle = new Bundle();
        bundle.putSerializable("mob_params", bVar);
        fVar.setArguments(bundle);
        if (!fVar.isAdded()) {
            iVar.mo3552a().mo3456a(fVar, "EditSelectDonationOrganizationDialogFragment").mo3473c();
        }
        fVar.f185045a = new C82768r(this);
    }

    @Override // com.p2082ss.android.ugc.gamora.editor.sticker.donation.AbstractC82791h
    /* renamed from: a */
    public final void mo127762a(AbstractC78484a<C45922g, C45922g> aVar) {
        C89219l.m154721d(aVar, "");
        mo127748C().f159195y = aVar;
    }

    @Override // com.p2082ss.android.ugc.gamora.editor.sticker.donation.AbstractC82791h
    /* renamed from: a */
    public final void mo127763a(AbstractC78486c<View> cVar) {
        C89219l.m154721d(cVar, "");
        this.f184977j = cVar;
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final <VM1 extends JediViewModel<S1>, S1 extends AbstractC20368af, R> R withState(VM1 vm1, AbstractC89172b<? super S1, ? extends R> bVar) {
        C89219l.m154721d(vm1, "");
        C89219l.m154721d(bVar, "");
        return (R) AbstractC20382b.C20383a.m38593a(this, vm1, bVar);
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.sticker.donation.c$l */
    static final class C82759l extends AbstractC89220m implements AbstractC89183m<AbstractC20382b, C89391z, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C82747c f185000a;

        static {
            Covode.recordClassIndex(96609);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C82759l(C82747c cVar) {
            super(2);
            this.f185000a = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20382b bVar, C89391z zVar) {
            C89219l.m154721d(bVar, "");
            C89219l.m154721d(zVar, "");
            this.f185000a.mo127748C().mo112324n();
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.sticker.donation.c$o */
    static final class C82762o extends AbstractC89220m implements AbstractC89183m<AbstractC20382b, C20521k, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C82747c f185003a;

        static {
            Covode.recordClassIndex(96612);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C82762o(C82747c cVar) {
            super(2);
            this.f185003a = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20382b bVar, C20521k kVar) {
            C20521k kVar2 = kVar;
            C89219l.m154721d(bVar, "");
            C89219l.m154721d(kVar2, "");
            boolean booleanValue = kVar2.f48283b.booleanValue();
            this.f185003a.mo127748C().f159194x = !booleanValue;
            if (booleanValue) {
                this.f185003a.mo127748C().mo112307a(new AbstractC45857b(this) {
                    /* class com.p2082ss.android.ugc.gamora.editor.sticker.donation.C82747c.C82762o.C827631 */

                    /* renamed from: a */
                    final /* synthetic */ C82762o f185004a;

                    static {
                        Covode.recordClassIndex(96613);
                    }

                    @Override // com.p2082ss.android.ugc.aweme.editSticker.p2879c.AbstractC45857b
                    /* renamed from: a */
                    public final boolean mo77208a() {
                        this.f185004a.f185003a.mo127748C().mo112319i();
                        return true;
                    }

                    /* JADX WARN: Incorrect args count in method signature: ()V */
                    {
                        this.f185004a = r1;
                    }
                });
            } else {
                this.f185003a.mo127748C().mo112307a(C45856a.f106824a);
            }
            return C89391z.f203057a;
        }
    }

    @Override // com.bytedance.scene.AbstractC22219j
    /* renamed from: a */
    public final View mo22702a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        MethodCollector.m26663i(8713);
        C89219l.m154721d(layoutInflater, "");
        C89219l.m154721d(viewGroup, "");
        FrameLayout frameLayout = (FrameLayout) viewGroup;
        mo127748C().f159189s = false;
        AbstractC31071f value = mo127773d().mo114778C().getValue();
        if (value != null) {
            mo127748C().f159187q = value.mo56330b();
            mo127748C().mo112276a(this.f52549m, frameLayout);
            AbstractC14552j jVar = this.f184980u;
            if (jVar == null) {
                C89219l.m154710a("gestureService");
            }
            jVar.mo23383a(m142904O());
        }
        this.f184978k = frameLayout;
        View view = new View(layoutInflater.getContext());
        MethodCollector.m26664o(8713);
        return view;
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final <S extends AbstractC20368af> AbstractC88412b subscribe(JediViewModel<S> jediViewModel, C20370ah<S> ahVar, AbstractC89183m<? super AbstractC20477i, ? super S, C89391z> mVar) {
        C89219l.m154721d(jediViewModel, "");
        C89219l.m154721d(ahVar, "");
        C89219l.m154721d(mVar, "");
        return AbstractC20382b.C20383a.m38583a(this, jediViewModel, ahVar, mVar);
    }

    @Override // com.p2082ss.android.ugc.gamora.editor.sticker.AbstractC82581b
    /* renamed from: a */
    public final C1731i<C89391z> mo127435a(AbstractC31071f fVar, AbstractC82035ab abVar, AbstractC89172b<? super String, String> bVar) {
        String str;
        C89219l.m154721d(fVar, "");
        C89219l.m154721d(abVar, "");
        if (mo127748C().mo112283b()) {
            if (bVar == null || (str = bVar.invoke("donation_sticker")) == null) {
                str = mo127748C().mo112326p();
            }
            C89219l.m154716b(str, "");
            int a = abVar.mo87631T().mo112106a();
            int b = abVar.mo87631T().mo112109b();
            int i = fVar.mo56330b().width;
            int i2 = fVar.mo56330b().height;
            C89219l.m154721d(str, "");
            C71101b C = mo127748C();
            C89219l.m154721d(str, "");
            C1731i<TContinuationResult> c = C.mo112304a(str, a, b, i, i2).mo5542c(new C71101b.C71103b(C));
            C89219l.m154716b(c, "");
            C1731i<TContinuationResult> c2 = c.mo5543c(new C82756i(this, fVar, abVar), C1731i.f5564c);
            C89219l.m154716b(c2, "");
            return c2;
        }
        C1731i<C89391z> a2 = C1731i.m5633a(C89391z.f203057a);
        C89219l.m154716b(a2, "");
        return a2;
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
