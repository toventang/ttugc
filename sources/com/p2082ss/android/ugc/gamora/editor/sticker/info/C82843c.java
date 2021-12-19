package com.p2082ss.android.ugc.gamora.editor.sticker.info;

import android.app.Activity;
import android.graphics.PointF;
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
import com.bytedance.jedi.arch.C20521k;
import com.bytedance.jedi.arch.C20526p;
import com.bytedance.jedi.arch.C20531t;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.p1559o.AbstractC21566a;
import com.bytedance.p1559o.C21582f;
import com.bytedance.p1559o.p1561b.C21572a;
import com.bytedance.p969f.p970a.p971a.AbstractC14552j;
import com.bytedance.p969f.p970a.p971a.C14544f;
import com.bytedance.p969f.p970a.p971a.GestureDetector$OnDoubleTapListenerC14546h;
import com.bytedance.provider.p1587vm.ScopeViewModel;
import com.bytedance.scene.AbstractC22219j;
import com.p2082ss.android.ugc.asve.editor.AbstractC31071f;
import com.p2082ss.android.ugc.aweme.commentStickerPanel.itemview.CommentStickerView;
import com.p2082ss.android.ugc.aweme.editSticker.interact.AbstractC45897c;
import com.p2082ss.android.ugc.aweme.editSticker.interact.p2884a.AbstractC45895b;
import com.p2082ss.android.ugc.aweme.editSticker.model.InfoStickerModel;
import com.p2082ss.android.ugc.aweme.editSticker.model.StickerItemModel;
import com.p2082ss.android.ugc.aweme.editSticker.p2879c.AbstractC45857b;
import com.p2082ss.android.ugc.aweme.editSticker.p2879c.C45856a;
import com.p2082ss.android.ugc.aweme.editSticker.text.als.EditTextStickerViewModel;
import com.p2082ss.android.ugc.aweme.editSticker.text.view.C46239q;
import com.p2082ss.android.ugc.aweme.infoSticker.C56724i;
import com.p2082ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63253l;
import com.p2082ss.android.ugc.aweme.shortvideo.SafeHandler;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditView;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.C71513p;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.AbstractC71033a;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.C71044aj;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.C71056i;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.InfoStickerEditView;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.InfoStickerViewModel;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.donation.AbstractC71109e;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.donation.EditDonationStickerViewModel;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.p3811d.C70985a;
import com.p2082ss.android.ugc.aweme.shortvideo.preview.AbstractC72510a;
import com.p2082ss.android.ugc.aweme.themechange.base.AVDmtTextView;
import com.p2082ss.android.ugc.gamora.editor.C83253u;
import com.p2082ss.android.ugc.gamora.editor.EditCommentStickerViewModel;
import com.p2082ss.android.ugc.gamora.editor.EditHashTagStickerViewModel;
import com.p2082ss.android.ugc.gamora.editor.EditMentionStickerViewModel;
import com.p2082ss.android.ugc.gamora.editor.corner.EditCornerViewModel;
import com.p2082ss.android.ugc.gamora.editor.progress.EditProgressViewModel;
import com.p2082ss.android.ugc.gamora.editor.progressbar.AbstractC82503a;
import com.p2082ss.android.ugc.gamora.editor.sticker.core.EditStickerViewModel;
import com.p2082ss.android.ugc.gamora.editor.sticker.duet.AbstractC82814a;
import com.p2082ss.android.ugc.gamora.editor.sticker.livecd.AbstractC82878a;
import com.p2082ss.android.ugc.gamora.editor.sticker.p4290qa.AbstractC82982a;
import com.p2082ss.android.ugc.gamora.editor.sticker.poll.AbstractC82957a;
import com.p2082ss.android.ugc.tools.utils.C84911q;
import com.p2082ss.android.ugc.trill.R;
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

/* renamed from: com.ss.android.ugc.gamora.editor.sticker.info.c */
public final class C82843c extends AbstractC22219j implements AbstractC20382b, AbstractC21566a {

    /* renamed from: a */
    static final /* synthetic */ AbstractC89286i[] f185164a = {new C89232y(C82843c.class, "publishEditModel", "getPublishEditModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0), new C89232y(C82843c.class, "stickerChallengeManager", "getStickerChallengeManager()Lcom/ss/android/ugc/aweme/infoSticker/StickerChallengeManager;", 0)};

    /* renamed from: l */
    public static final C82851h f185165l = new C82851h((byte) 0);

    /* renamed from: A */
    private final AbstractC89244h f185166A;

    /* renamed from: B */
    private final AbstractC89244h f185167B;

    /* renamed from: C */
    private final C21582f f185168C;

    /* renamed from: b */
    final AbstractC89248d f185169b = C21572a.m40504a(getDiContainer(), C56724i.class);

    /* renamed from: c */
    public AbstractC14552j f185170c;

    /* renamed from: d */
    final AbstractC89244h f185171d = C89250i.m154774a(EnumC89331m.NONE, new C82850g(this));

    /* renamed from: e */
    public FrameLayout f185172e;

    /* renamed from: f */
    public EditCommentStickerViewModel f185173f;

    /* renamed from: g */
    public EditTextStickerViewModel f185174g;

    /* renamed from: h */
    public EditDonationStickerViewModel f185175h;

    /* renamed from: i */
    public EditMentionStickerViewModel f185176i;

    /* renamed from: j */
    public EditHashTagStickerViewModel f185177j;

    /* renamed from: k */
    public EditStickerViewModel f185178k;

    /* renamed from: t */
    private final AbstractC89248d f185179t = C21572a.m40504a(getDiContainer(), VideoPublishEditModel.class);

    /* renamed from: u */
    private final AbstractC89244h f185180u = C89250i.m154774a(EnumC89331m.NONE, new C82844a(this));

    /* renamed from: v */
    private final AbstractC89244h f185181v;

    /* renamed from: w */
    private final AbstractC89244h f185182w;

    /* renamed from: x */
    private final AbstractC89244h f185183x;

    /* renamed from: y */
    private final AbstractC89244h f185184y;

    /* renamed from: z */
    private final AbstractC89244h f185185z;

    static {
        Covode.recordClassIndex(96699);
    }

    /* renamed from: F */
    private final EditInfoStickerViewModel m143093F() {
        return (EditInfoStickerViewModel) this.f185181v.getValue();
    }

    /* renamed from: G */
    private final C14544f m143094G() {
        return (C14544f) this.f185166A.getValue();
    }

    /* renamed from: a */
    public static float m143095a(boolean z) {
        return z ? 1.0f : 0.3137255f;
    }

    /* renamed from: C */
    public final AbstractC82814a mo127932C() {
        return (AbstractC82814a) this.f185184y.getValue();
    }

    /* renamed from: D */
    public final AbstractC82878a mo127933D() {
        return (AbstractC82878a) this.f185185z.getValue();
    }

    /* renamed from: E */
    public final C71056i mo127934E() {
        return (C71056i) this.f185167B.getValue();
    }

    /* renamed from: a */
    public final AbstractC72510a mo127935a() {
        return (AbstractC72510a) this.f185180u.getValue();
    }

    /* renamed from: b */
    public final AbstractC82957a mo127936b() {
        return (AbstractC82957a) this.f185182w.getValue();
    }

    /* renamed from: d */
    public final AbstractC82982a mo127937d() {
        return (AbstractC82982a) this.f185183x.getValue();
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final boolean getUniqueOnlyGlobal() {
        return true;
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.sticker.info.c$h */
    public static final class C82851h {
        static {
            Covode.recordClassIndex(96707);
        }

        private C82851h() {
        }

        public /* synthetic */ C82851h(byte b) {
            this();
        }
    }

    @Override // com.bytedance.p1559o.AbstractC21566a
    public final C21582f getDiContainer() {
        return this.f185168C;
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

    /* renamed from: com.ss.android.ugc.gamora.editor.sticker.info.c$a */
    public static final class C82844a extends AbstractC89220m implements AbstractC89171a<AbstractC72510a> {

        /* renamed from: a */
        final /* synthetic */ AbstractC21566a f185186a;

        static {
            Covode.recordClassIndex(96700);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C82844a(AbstractC21566a aVar) {
            super(0);
            this.f185186a = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.bytedance.als.b, com.ss.android.ugc.aweme.shortvideo.preview.a] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.p2082ss.android.ugc.aweme.shortvideo.preview.AbstractC72510a invoke() {
            /*
                r3 = this;
                com.bytedance.o.a r0 = r3.f185186a
                com.bytedance.o.f r2 = r0.getDiContainer()
                java.lang.Class<com.ss.android.ugc.aweme.shortvideo.preview.a> r1 = com.p2082ss.android.ugc.aweme.shortvideo.preview.AbstractC72510a.class
                r0 = 0
                java.lang.Object r0 = r2.mo35249a(r1, r0)
                com.bytedance.als.b r0 = (com.bytedance.als.AbstractC2547b) r0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.gamora.editor.sticker.info.C82843c.C82844a.invoke():com.bytedance.als.b");
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.sticker.info.c$b */
    public static final class C82845b extends AbstractC89220m implements AbstractC89171a<AbstractC82957a> {

        /* renamed from: a */
        final /* synthetic */ AbstractC21566a f185187a;

        static {
            Covode.recordClassIndex(96701);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C82845b(AbstractC21566a aVar) {
            super(0);
            this.f185187a = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.bytedance.als.b, com.ss.android.ugc.gamora.editor.sticker.poll.a] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.p2082ss.android.ugc.gamora.editor.sticker.poll.AbstractC82957a invoke() {
            /*
                r3 = this;
                com.bytedance.o.a r0 = r3.f185187a
                com.bytedance.o.f r2 = r0.getDiContainer()
                java.lang.Class<com.ss.android.ugc.gamora.editor.sticker.poll.a> r1 = com.p2082ss.android.ugc.gamora.editor.sticker.poll.AbstractC82957a.class
                r0 = 0
                java.lang.Object r0 = r2.mo35249a(r1, r0)
                com.bytedance.als.b r0 = (com.bytedance.als.AbstractC2547b) r0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.gamora.editor.sticker.info.C82843c.C82845b.invoke():com.bytedance.als.b");
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.sticker.info.c$c */
    public static final class C82846c extends AbstractC89220m implements AbstractC89171a<AbstractC82982a> {

        /* renamed from: a */
        final /* synthetic */ AbstractC21566a f185188a;

        static {
            Covode.recordClassIndex(96702);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C82846c(AbstractC21566a aVar) {
            super(0);
            this.f185188a = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.ss.android.ugc.gamora.editor.sticker.qa.a, com.bytedance.als.b] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.p2082ss.android.ugc.gamora.editor.sticker.p4290qa.AbstractC82982a invoke() {
            /*
                r3 = this;
                com.bytedance.o.a r0 = r3.f185188a
                com.bytedance.o.f r2 = r0.getDiContainer()
                java.lang.Class<com.ss.android.ugc.gamora.editor.sticker.qa.a> r1 = com.p2082ss.android.ugc.gamora.editor.sticker.p4290qa.AbstractC82982a.class
                r0 = 0
                java.lang.Object r0 = r2.mo35249a(r1, r0)
                com.bytedance.als.b r0 = (com.bytedance.als.AbstractC2547b) r0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.gamora.editor.sticker.info.C82843c.C82846c.invoke():com.bytedance.als.b");
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.sticker.info.c$d */
    public static final class C82847d extends AbstractC89220m implements AbstractC89171a<AbstractC82814a> {

        /* renamed from: a */
        final /* synthetic */ AbstractC21566a f185189a;

        static {
            Covode.recordClassIndex(96703);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C82847d(AbstractC21566a aVar) {
            super(0);
            this.f185189a = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.ss.android.ugc.gamora.editor.sticker.duet.a, com.bytedance.als.b] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.p2082ss.android.ugc.gamora.editor.sticker.duet.AbstractC82814a invoke() {
            /*
                r3 = this;
                com.bytedance.o.a r0 = r3.f185189a
                com.bytedance.o.f r2 = r0.getDiContainer()
                java.lang.Class<com.ss.android.ugc.gamora.editor.sticker.duet.a> r1 = com.p2082ss.android.ugc.gamora.editor.sticker.duet.AbstractC82814a.class
                r0 = 0
                java.lang.Object r0 = r2.mo35249a(r1, r0)
                com.bytedance.als.b r0 = (com.bytedance.als.AbstractC2547b) r0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.gamora.editor.sticker.info.C82843c.C82847d.invoke():com.bytedance.als.b");
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.sticker.info.c$e */
    public static final class C82848e extends AbstractC89220m implements AbstractC89171a<AbstractC82878a> {

        /* renamed from: a */
        final /* synthetic */ AbstractC21566a f185190a;

        static {
            Covode.recordClassIndex(96704);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C82848e(AbstractC21566a aVar) {
            super(0);
            this.f185190a = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.ss.android.ugc.gamora.editor.sticker.livecd.a, com.bytedance.als.b] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.p2082ss.android.ugc.gamora.editor.sticker.livecd.AbstractC82878a invoke() {
            /*
                r3 = this;
                com.bytedance.o.a r0 = r3.f185190a
                com.bytedance.o.f r2 = r0.getDiContainer()
                java.lang.Class<com.ss.android.ugc.gamora.editor.sticker.livecd.a> r1 = com.p2082ss.android.ugc.gamora.editor.sticker.livecd.AbstractC82878a.class
                r0 = 0
                java.lang.Object r0 = r2.mo35249a(r1, r0)
                com.bytedance.als.b r0 = (com.bytedance.als.AbstractC2547b) r0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.gamora.editor.sticker.info.C82843c.C82848e.invoke():com.bytedance.als.b");
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.sticker.info.c$g */
    public static final class C82850g extends AbstractC89220m implements AbstractC89171a<AbstractC82503a> {

        /* renamed from: a */
        final /* synthetic */ AbstractC21566a f185194a;

        static {
            Covode.recordClassIndex(96706);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C82850g(AbstractC21566a aVar) {
            super(0);
            this.f185194a = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.bytedance.als.b, com.ss.android.ugc.gamora.editor.progressbar.a] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.p2082ss.android.ugc.gamora.editor.progressbar.AbstractC82503a invoke() {
            /*
                r3 = this;
                com.bytedance.o.a r0 = r3.f185194a
                com.bytedance.o.f r2 = r0.getDiContainer()
                java.lang.Class<com.ss.android.ugc.gamora.editor.progressbar.a> r1 = com.p2082ss.android.ugc.gamora.editor.progressbar.AbstractC82503a.class
                r0 = 0
                java.lang.Object r0 = r2.mo35252b(r1, r0)
                com.bytedance.als.b r0 = (com.bytedance.als.AbstractC2547b) r0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.gamora.editor.sticker.info.C82843c.C82850g.invoke():com.bytedance.als.b");
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.sticker.info.c$i */
    static final class C82852i extends AbstractC89220m implements AbstractC89171a<C14544f> {

        /* renamed from: a */
        final /* synthetic */ C82843c f185195a;

        static {
            Covode.recordClassIndex(96708);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C82852i(C82843c cVar) {
            super(0);
            this.f185195a = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C14544f invoke() {
            InfoStickerEditView infoStickerEditView = this.f185195a.mo127934E().f159122d;
            C89219l.m154716b(infoStickerEditView, "");
            return new C14544f(100, infoStickerEditView.getGestureListener());
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.sticker.info.c$u */
    static final class C82865u extends AbstractC89220m implements AbstractC89171a<C71056i> {

        /* renamed from: a */
        final /* synthetic */ C82843c f185207a;

        static {
            Covode.recordClassIndex(96721);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C82865u(C82843c cVar) {
            super(0);
            this.f185207a = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C71056i invoke() {
            return new C71056i(this.f185207a.mo127935a(), (AbstractC82503a) this.f185207a.f185171d.getValue());
        }
    }

    @Override // com.bytedance.scene.AbstractC22219j
    /* renamed from: n_ */
    public final void mo22713n_() {
        super.mo22713n_();
        AbstractC14552j jVar = this.f185170c;
        if (jVar == null) {
            C89219l.m154710a("gestureService");
        }
        jVar.mo23385b(m143094G());
    }

    @Override // com.bytedance.scene.AbstractC22219j
    /* renamed from: w */
    public final void mo36490w() {
        super.mo36490w();
        C71056i E = mo127934E();
        if (E.f159144z != null) {
            E.f159144z.mo77277b();
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.sticker.info.c$m */
    static final class C82856m implements AbstractC45895b {

        /* renamed from: a */
        final /* synthetic */ C82843c f185199a;

        static {
            Covode.recordClassIndex(96712);
        }

        C82856m(C82843c cVar) {
            this.f185199a = cVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.editSticker.interact.p2884a.AbstractC45895b
        /* renamed from: a */
        public final void mo77270a() {
            this.f185199a.mo127936b().mo128021b();
            this.f185199a.mo127932C().mo127882b();
            C82843c.m143097b(this.f185199a).mo77639n();
            C82843c.m143098c(this.f185199a).mo127199a();
            C82843c.m143099d(this.f185199a).mo112370b();
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.sticker.info.c$f */
    public static final class C82849f extends AbstractC89220m implements AbstractC89171a<EditInfoStickerViewModel> {

        /* renamed from: a */
        final /* synthetic */ AbstractC22219j f185191a;

        /* renamed from: b */
        final /* synthetic */ AbstractC89277c f185192b;

        /* renamed from: c */
        final /* synthetic */ AbstractC89277c f185193c;

        static {
            Covode.recordClassIndex(96705);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C82849f(AbstractC22219j jVar, AbstractC89277c cVar, AbstractC89277c cVar2) {
            super(0);
            this.f185191a = jVar;
            this.f185192b = cVar;
            this.f185193c = cVar2;
        }

        /* JADX WARN: Type inference failed for: r0v8, types: [com.ss.android.ugc.gamora.editor.sticker.info.EditInfoStickerViewModel, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARN: Type inference failed for: r0v15, types: [com.ss.android.ugc.gamora.editor.sticker.info.EditInfoStickerViewModel, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARNING: Unknown variable types count: 2 */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.p2082ss.android.ugc.gamora.editor.sticker.info.EditInfoStickerViewModel invoke() {
            /*
                r6 = this;
                com.bytedance.scene.j r0 = r6.f185191a
                com.bytedance.scene.j r5 = r0.f52551o
                h.k.c r0 = r6.f185193c
                java.lang.Class r0 = p4600h.p4611f.C89170a.m154665a(r0)
                java.lang.String r3 = r0.getCanonicalName()
                java.lang.String r4 = ""
                p4600h.p4611f.p4613b.C89219l.m154716b(r3, r4)
            L_0x0013:
                if (r5 == 0) goto L_0x003a
                androidx.lifecycle.ad$b r0 = com.bytedance.jedi.arch.C20392e.f48284a     // Catch:{ as -> 0x0035 }
                androidx.lifecycle.ad r2 = com.bytedance.scene.C22267s.m41934a(r5, r0)     // Catch:{ as -> 0x0035 }
                h.k.c r0 = r6.f185193c     // Catch:{ as -> 0x0035 }
                java.lang.Class r0 = p4600h.p4611f.C89170a.m154665a(r0)     // Catch:{ as -> 0x0035 }
                java.lang.String r1 = r0.getCanonicalName()     // Catch:{ as -> 0x0035 }
                p4600h.p4611f.p4613b.C89219l.m154716b(r1, r4)     // Catch:{ as -> 0x0035 }
                h.k.c r0 = r6.f185192b     // Catch:{ as -> 0x0035 }
                java.lang.Class r0 = p4600h.p4611f.C89170a.m154665a(r0)     // Catch:{ as -> 0x0035 }
                androidx.lifecycle.ac r0 = m143112xa0b04ea(r2, r1, r0)     // Catch:{ as -> 0x0035 }
                com.bytedance.jedi.arch.JediViewModel r0 = (com.bytedance.jedi.arch.JediViewModel) r0     // Catch:{ as -> 0x0035 }
                goto L_0x0038
            L_0x0035:
                com.bytedance.scene.j r5 = r5.f52551o
                goto L_0x0013
            L_0x0038:
                if (r0 != 0) goto L_0x0052
            L_0x003a:
                com.bytedance.scene.j r0 = r6.f185191a
                androidx.fragment.app.e r1 = com.bytedance.scene.ktx.C22228c.m41832b(r0)
                androidx.lifecycle.ad$b r0 = com.bytedance.jedi.arch.C20392e.f48284a
                androidx.lifecycle.ad r1 = androidx.lifecycle.C1181ae.m3881a(r1, r0)
                h.k.c r0 = r6.f185192b
                java.lang.Class r0 = p4600h.p4611f.C89170a.m154665a(r0)
                androidx.lifecycle.ac r0 = m143112xa0b04ea(r1, r3, r0)
                com.bytedance.jedi.arch.JediViewModel r0 = (com.bytedance.jedi.arch.JediViewModel) r0
            L_0x0052:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.gamora.editor.sticker.info.C82843c.C82849f.invoke():com.bytedance.jedi.arch.JediViewModel");
        }

        /* renamed from: com_ss_android_ugc_gamora_editor_sticker_info_EditInfoStickerScene$$special$$inlined$hostViewModel$1_androidx_lifecycle_VScopeLancet_get */
        public static AbstractC1174ac m143112xa0b04ea(C1175ad adVar, String str, Class cls) {
            if (cls.equals(ScopeViewModel.class)) {
                return adVar.mo3984a(str, cls);
            }
            AbstractC1174ac a = adVar.mo3984a(str, cls);
            C1171ab.m3870a(a, adVar);
            return a;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.sticker.info.c$j */
    public static final class C82853j implements AbstractC71033a {

        /* renamed from: a */
        final /* synthetic */ C82843c f185196a;

        static {
            Covode.recordClassIndex(96709);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C82853j(C82843c cVar) {
            this.f185196a = cVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.AbstractC71033a
        /* renamed from: b */
        public final void mo87993b(StickerItemModel stickerItemModel) {
            C89219l.m154721d(stickerItemModel, "");
            this.f185196a.mo127934E().f159139u.infoStickerModel.removeSticker(stickerItemModel);
            C82843c cVar = this.f185196a;
            ((C56724i) cVar.f185169b.mo23374a(cVar, C82843c.f185164a[1])).mo93672a(stickerItemModel.stickerId);
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.AbstractC71033a
        /* renamed from: a */
        public final void mo87992a(StickerItemModel stickerItemModel) {
            C89219l.m154721d(stickerItemModel, "");
            if (this.f185196a.mo127934E().f159139u.infoStickerModel == null) {
                this.f185196a.mo127934E().f159139u.infoStickerModel = new InfoStickerModel(this.f185196a.mo127934E().f159139u.draftDir());
            }
            C84911q.m145928d("add infoSticker " + stickerItemModel.getId());
            this.f185196a.mo127934E().f159139u.infoStickerModel.addSticker(stickerItemModel);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.sticker.info.c$k */
    public static final class C82854k implements C71056i.AbstractC71063c {

        /* renamed from: a */
        final /* synthetic */ C82843c f185197a;

        static {
            Covode.recordClassIndex(96710);
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.C71056i.AbstractC71063c
        /* renamed from: a */
        public final int mo112262a(C71044aj ajVar, boolean z, boolean z2) {
            C89219l.m154721d(ajVar, "");
            return 0;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C82854k(C82843c cVar) {
            this.f185197a = cVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.C71056i.AbstractC71063c
        /* renamed from: a */
        public final Float mo112264a(float f) {
            return Float.valueOf(f);
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.C71056i.AbstractC71063c
        /* renamed from: a */
        public final PointF mo112263a(C71044aj ajVar, float f, float f2) {
            C89219l.m154721d(ajVar, "");
            return new PointF();
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.C71056i.AbstractC71063c
        /* renamed from: a */
        public final void mo112265a(C71044aj ajVar, int i, int i2, boolean z, boolean z2) {
            C89219l.m154721d(ajVar, "");
            if (C89219l.m154714a((Object) C82843c.m143096a(this.f185197a).mo127691n().getValue(), (Object) true) || C89219l.m154714a((Object) C82843c.m143096a(this.f185197a).mo127692o().getValue(), (Object) true)) {
                if (this.f185197a.mo127934E().f159104K != null) {
                    this.f185197a.mo127934E().mo112257g();
                }
            } else if (z) {
                this.f185197a.mo127935a().mo114805a((AbstractC72510a) true, true, true);
            } else {
                this.f185197a.mo127935a().mo114805a((AbstractC72510a) false, true, false);
                this.f185197a.mo127934E().mo112260j();
                this.f185197a.mo127936b().mo128021b();
                this.f185197a.mo127932C().mo127882b();
                C82843c.m143097b(this.f185197a).mo77639n();
                C82843c.m143098c(this.f185197a).mo127199a();
                C82843c.m143099d(this.f185197a).mo112370b();
                C82843c.m143100e(this.f185197a).mo127215b();
                C82843c.m143101f(this.f185197a).mo127228b();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.sticker.info.c$l */
    public static final class C82855l implements C71056i.AbstractC71061a {

        /* renamed from: a */
        final /* synthetic */ C82843c f185198a;

        static {
            Covode.recordClassIndex(96711);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C82855l(C82843c cVar) {
            this.f185198a = cVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.C71056i.AbstractC71061a
        /* renamed from: b */
        public final void mo112270b(boolean z) {
            this.f185198a.mo127936b().mo128017a(C82843c.m143095a(z));
            this.f185198a.mo127932C().mo127878a(C82843c.m143095a(z));
            this.f185198a.mo127937d().mo128039a(C82843c.m143095a(z));
            this.f185198a.mo127933D().mo127952a(C82843c.m143095a(z));
            C82843c.m143097b(this.f185198a).mo77606a(C82843c.m143095a(z));
            C82843c.m143098c(this.f185198a).mo127200a(C82843c.m143095a(z));
            C82843c.m143099d(this.f185198a).mo112368a(C82843c.m143095a(z));
            C82843c.m143101f(this.f185198a).mo127227a(C82843c.m143095a(z));
            C82843c.m143100e(this.f185198a).mo127214a(C82843c.m143095a(z));
            if (!z) {
                AbstractC45897c cVar = this.f185198a.mo127934E().f159104K;
                AbstractC71109e eVar = null;
                if (!(cVar instanceof C46239q)) {
                    cVar = null;
                }
                C46239q qVar = (C46239q) cVar;
                if (qVar != null) {
                    qVar.mo78534a(C82843c.m143095a(true), false);
                }
                AbstractC45897c cVar2 = this.f185198a.mo127934E().f159104K;
                if (!(cVar2 instanceof CommentStickerView)) {
                    cVar2 = null;
                }
                CommentStickerView commentStickerView = (CommentStickerView) cVar2;
                if (commentStickerView != null) {
                    commentStickerView.setAlpha(C82843c.m143095a(true));
                }
                AbstractC45897c cVar3 = this.f185198a.mo127934E().f159104K;
                if (cVar3 instanceof AbstractC71109e) {
                    eVar = cVar3;
                }
                AbstractC71109e eVar2 = eVar;
                if (eVar2 != null) {
                    eVar2.mo112347a(C82843c.m143095a(true));
                }
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.C71056i.AbstractC71061a
        /* renamed from: a */
        public final void mo112269a(boolean z) {
            this.f185198a.mo127936b().mo128017a(C82843c.m143095a(!z));
            this.f185198a.mo127936b().mo128020a(!z);
            this.f185198a.mo127932C().mo127878a(C82843c.m143095a(!z));
            this.f185198a.mo127932C().mo127881a(!z);
            this.f185198a.mo127937d().mo128039a(C82843c.m143095a(!z));
            this.f185198a.mo127937d().mo128043a(!z);
            this.f185198a.mo127933D().mo127952a(C82843c.m143095a(!z));
            this.f185198a.mo127933D().mo127955a(!z);
            C82843c.m143097b(this.f185198a).mo77606a(C82843c.m143095a(!z));
            C82843c.m143098c(this.f185198a).mo127200a(C82843c.m143095a(!z));
            C82843c.m143099d(this.f185198a).mo112368a(C82843c.m143095a(!z));
            C82843c.m143100e(this.f185198a).mo127214a(C82843c.m143095a(!z));
            C82843c.m143100e(this.f185198a).mo33689c(new EditHashTagStickerViewModel.C82012a(!z));
            C82843c.m143101f(this.f185198a).mo127227a(C82843c.m143095a(!z));
            C82843c.m143101f(this.f185198a).mo33689c(new EditMentionStickerViewModel.C82015a(!z));
            if (z) {
                AbstractC45897c cVar = this.f185198a.mo127934E().f159104K;
                AbstractC71109e eVar = null;
                if (!(cVar instanceof C46239q)) {
                    cVar = null;
                }
                C46239q qVar = (C46239q) cVar;
                if (qVar != null) {
                    qVar.mo78534a(C82843c.m143095a(true), false);
                }
                AbstractC45897c cVar2 = this.f185198a.mo127934E().f159104K;
                if (!(cVar2 instanceof CommentStickerView)) {
                    cVar2 = null;
                }
                CommentStickerView commentStickerView = (CommentStickerView) cVar2;
                if (commentStickerView != null) {
                    commentStickerView.setAlpha(C82843c.m143095a(true));
                }
                AbstractC45897c cVar3 = this.f185198a.mo127934E().f159104K;
                if (cVar3 instanceof AbstractC71109e) {
                    eVar = cVar3;
                }
                AbstractC71109e eVar2 = eVar;
                if (eVar2 != null) {
                    eVar2.mo112347a(C82843c.m143095a(true));
                }
            }
        }
    }

    /* renamed from: b */
    public static final /* synthetic */ EditTextStickerViewModel m143097b(C82843c cVar) {
        EditTextStickerViewModel editTextStickerViewModel = cVar.f185174g;
        if (editTextStickerViewModel == null) {
            C89219l.m154710a("textStickerViewModel");
        }
        return editTextStickerViewModel;
    }

    /* renamed from: c */
    public static final /* synthetic */ EditCommentStickerViewModel m143098c(C82843c cVar) {
        EditCommentStickerViewModel editCommentStickerViewModel = cVar.f185173f;
        if (editCommentStickerViewModel == null) {
            C89219l.m154710a("commentStickerViewModel");
        }
        return editCommentStickerViewModel;
    }

    /* renamed from: d */
    public static final /* synthetic */ EditDonationStickerViewModel m143099d(C82843c cVar) {
        EditDonationStickerViewModel editDonationStickerViewModel = cVar.f185175h;
        if (editDonationStickerViewModel == null) {
            C89219l.m154710a("donationStickerViewModel");
        }
        return editDonationStickerViewModel;
    }

    /* renamed from: e */
    public static final /* synthetic */ EditHashTagStickerViewModel m143100e(C82843c cVar) {
        EditHashTagStickerViewModel editHashTagStickerViewModel = cVar.f185177j;
        if (editHashTagStickerViewModel == null) {
            C89219l.m154710a("hashTagStickerViewModel");
        }
        return editHashTagStickerViewModel;
    }

    /* renamed from: f */
    public static final /* synthetic */ EditMentionStickerViewModel m143101f(C82843c cVar) {
        EditMentionStickerViewModel editMentionStickerViewModel = cVar.f185176i;
        if (editMentionStickerViewModel == null) {
            C89219l.m154710a("mentionStickerViewModel");
        }
        return editMentionStickerViewModel;
    }

    @Override // com.bytedance.jedi.arch.AbstractC20382b
    public final <VM1 extends JediViewModel<S1>, S1 extends AbstractC20368af> S1 getState(VM1 vm1) {
        C89219l.m154721d(vm1, "");
        return (S1) AbstractC20382b.C20383a.m38582a(this, vm1);
    }

    /* renamed from: a */
    public static final /* synthetic */ EditStickerViewModel m143096a(C82843c cVar) {
        EditStickerViewModel editStickerViewModel = cVar.f185178k;
        if (editStickerViewModel == null) {
            C89219l.m154710a("stickerViewModel");
        }
        return editStickerViewModel;
    }

    public C82843c(C21582f fVar) {
        C89219l.m154721d(fVar, "");
        this.f185168C = fVar;
        AbstractC89277c a = C89204ab.m154669a(EditInfoStickerViewModel.class);
        this.f185181v = C89250i.m154773a((AbstractC89171a) new C82849f(this, a, a));
        this.f185182w = C89250i.m154774a(EnumC89331m.NONE, new C82845b(this));
        this.f185183x = C89250i.m154774a(EnumC89331m.NONE, new C82846c(this));
        this.f185184y = C89250i.m154774a(EnumC89331m.NONE, new C82847d(this));
        this.f185185z = C89250i.m154774a(EnumC89331m.NONE, new C82848e(this));
        this.f185166A = C89250i.m154773a((AbstractC89171a) new C82852i(this));
        this.f185167B = C89250i.m154773a((AbstractC89171a) new C82865u(this));
    }

    @Override // com.bytedance.scene.AbstractC22219j
    /* renamed from: a */
    public final void mo22704a(Bundle bundle) {
        super.mo22704a(bundle);
        Activity activity = this.f52549m;
        Objects.requireNonNull(activity, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        ActivityC0945e eVar = (ActivityC0945e) activity;
        JediViewModel a = C20531t.m38716a(eVar).mo33800a(EditTextStickerViewModel.class);
        C89219l.m154716b(a, "");
        this.f185174g = (EditTextStickerViewModel) a;
        JediViewModel a2 = C20531t.m38716a(eVar).mo33800a(EditCommentStickerViewModel.class);
        C89219l.m154716b(a2, "");
        this.f185173f = (EditCommentStickerViewModel) a2;
        JediViewModel a3 = C20531t.m38716a(eVar).mo33800a(EditDonationStickerViewModel.class);
        C89219l.m154716b(a3, "");
        this.f185175h = (EditDonationStickerViewModel) a3;
        JediViewModel a4 = C20531t.m38716a(eVar).mo33800a(EditMentionStickerViewModel.class);
        C89219l.m154716b(a4, "");
        this.f185176i = (EditMentionStickerViewModel) a4;
        JediViewModel a5 = C20531t.m38716a(eVar).mo33800a(EditHashTagStickerViewModel.class);
        C89219l.m154716b(a5, "");
        this.f185177j = (EditHashTagStickerViewModel) a5;
        JediViewModel a6 = C20531t.m38716a(eVar).mo33800a(EditStickerViewModel.class);
        C89219l.m154716b(a6, "");
        this.f185178k = (EditStickerViewModel) a6;
        C71056i E = mo127934E();
        AbstractC31071f value = mo127935a().mo114778C().getValue();
        if (value == null) {
            C89219l.m154715b();
        }
        E.f159137s = value;
        E.f159139u = (VideoPublishEditModel) this.f185179t.mo23374a(this, f185164a[0]);
        C71056i E2 = mo127934E();
        Integer a7 = C63253l.f143623a.mo73323s().mo93858e().mo93860a();
        C89219l.m154716b(a7, "");
        E2.f159136r = a7.intValue();
        if (E2.f159136r == 0) {
            E2.f159136r = 30;
        }
        C71056i E3 = mo127934E();
        Activity activity2 = this.f52549m;
        Objects.requireNonNull(activity2, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        ActivityC0945e eVar2 = (ActivityC0945e) activity2;
        View view = this.f52550n;
        VideoPublishEditModel videoPublishEditModel = mo127934E().f159139u;
        C89219l.m154716b(videoPublishEditModel, "");
        List<MediaModel> mediaModelList = videoPublishEditModel.getMediaModelList();
        E3.f159121c = eVar2;
        E3.f159142x = mediaModelList;
        E3.f159120b = false;
        E3.f159143y = new SafeHandler(eVar2);
        GestureDetector$OnDoubleTapListenerC14546h hVar = null;
        E3.f159138t = (InfoStickerViewModel) C1181ae.m3881a(eVar2, (C1175ad.AbstractC1177b) null).mo3983a(InfoStickerViewModel.class);
        E3.f159140v = view;
        E3.f159094A = (FrameLayout) E3.f159140v.findViewById(R.id.dnk);
        E3.f159122d = (InfoStickerEditView) E3.f159140v.findViewById(R.id.bnt);
        E3.f159123e = E3.f159140v.findViewById(R.id.byg);
        E3.f159124f = E3.f159140v.findViewById(R.id.ade);
        E3.f159125g = (AVDmtTextView) E3.f159140v.findViewById(R.id.egq);
        E3.f159126h = (VideoEditView) E3.f159140v.findViewById(R.id.fcg);
        E3.f159127i = (ImageView) E3.f159140v.findViewById(R.id.a0w);
        E3.f159128j = (ImageView) E3.f159140v.findViewById(R.id.dov);
        E3.f159129k = (ImageView) E3.f159140v.findViewById(R.id.yj);
        E3.f159131m = E3.f159140v.findViewById(R.id.d1x);
        E3.f159132n = (TextView) E3.f159140v.findViewById(R.id.d1w);
        E3.f159133o = (TextView) E3.f159140v.findViewById(R.id.d20);
        E3.f159134p = (SeekBar) E3.f159140v.findViewById(R.id.d1y);
        E3.f159135q = (ViewGroup) E3.f159140v.findViewById(R.id.d1z);
        E3.f159109P = (EditCornerViewModel) C20531t.m38716a(E3.f159121c).mo33800a(EditCornerViewModel.class);
        if (C71513p.m126385a()) {
            E3.f159110Q = (EditProgressViewModel) C20531t.m38716a(E3.f159121c).mo33800a(EditProgressViewModel.class);
        }
        E3.f159108O = new C70985a(E3.f159137s, E3.f159121c, E3.f159111R);
        E3.f159108O.f158892e = 
        /*  JADX ERROR: Method code generation error
            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x01e3: IPUT  
              (wrap: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.i$4 : 0x01e0: CONSTRUCTOR  (r0v83 com.ss.android.ugc.aweme.shortvideo.edit.infosticker.i$4) = (r2v4 'E3' com.ss.android.ugc.aweme.shortvideo.edit.infosticker.i) call: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.i.4.<init>(com.ss.android.ugc.aweme.shortvideo.edit.infosticker.i):void type: CONSTRUCTOR)
              (wrap: com.ss.android.ugc.aweme.shortvideo.edit.d.a : 0x01dc: IGET  (r1v27 com.ss.android.ugc.aweme.shortvideo.edit.d.a) = (r2v4 'E3' com.ss.android.ugc.aweme.shortvideo.edit.infosticker.i) com.ss.android.ugc.aweme.shortvideo.edit.infosticker.i.O com.ss.android.ugc.aweme.shortvideo.edit.d.a)
             com.ss.android.ugc.aweme.shortvideo.edit.d.a.e com.ss.android.ugc.aweme.shortvideo.edit.d.a$a in method: com.ss.android.ugc.gamora.editor.sticker.info.c.a(android.os.Bundle):void, file: classes8.dex
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:217)
            	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:110)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:56)
            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
            	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:244)
            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:237)
            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:342)
            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:295)
            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:264)
            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
            Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x01e0: CONSTRUCTOR  (r0v83 com.ss.android.ugc.aweme.shortvideo.edit.infosticker.i$4) = (r2v4 'E3' com.ss.android.ugc.aweme.shortvideo.edit.infosticker.i) call: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.i.4.<init>(com.ss.android.ugc.aweme.shortvideo.edit.infosticker.i):void type: CONSTRUCTOR in method: com.ss.android.ugc.gamora.editor.sticker.info.c.a(android.os.Bundle):void, file: classes8.dex
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:428)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
            	... 14 more
            Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.i, state: GENERATED_AND_UNLOADED
            	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
            	... 18 more
            */
        /*
        // Method dump skipped, instructions count: 1058
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.gamora.editor.sticker.info.C82843c.mo22704a(android.os.Bundle):void");
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final <VM1 extends JediViewModel<S1>, S1 extends AbstractC20368af, R> R withState(VM1 vm1, AbstractC89172b<? super S1, ? extends R> bVar) {
        C89219l.m154721d(vm1, "");
        C89219l.m154721d(bVar, "");
        return (R) AbstractC20382b.C20383a.m38593a(this, vm1, bVar);
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.sticker.info.c$q */
    static final class C82861q extends AbstractC89220m implements AbstractC89183m<AbstractC20382b, C89391z, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C82843c f185203a;

        static {
            Covode.recordClassIndex(96717);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C82861q(C82843c cVar) {
            super(2);
            this.f185203a = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20382b bVar, C89391z zVar) {
            C89219l.m154721d(bVar, "");
            C89219l.m154721d(zVar, "");
            this.f185203a.mo127934E().mo112260j();
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.sticker.info.c$s */
    static final class C82863s extends AbstractC89220m implements AbstractC89183m<AbstractC20382b, C20526p, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C82843c f185205a;

        static {
            Covode.recordClassIndex(96719);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C82863s(C82843c cVar) {
            super(2);
            this.f185205a = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20382b bVar, C20526p pVar) {
            C89219l.m154721d(bVar, "");
            C89219l.m154721d(pVar, "");
            this.f185205a.mo127934E().f159112S = true;
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.sticker.info.c$n */
    static final class C82857n extends AbstractC89220m implements AbstractC89183m<AbstractC20382b, C89386u<? extends Float, ? extends Float, ? extends Float>, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C82843c f185200a;

        static {
            Covode.recordClassIndex(96713);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C82857n(C82843c cVar) {
            super(2);
            this.f185200a = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20382b bVar, C89386u<? extends Float, ? extends Float, ? extends Float> uVar) {
            C89386u<? extends Float, ? extends Float, ? extends Float> uVar2 = uVar;
            C89219l.m154721d(bVar, "");
            C89219l.m154721d(uVar2, "");
            InfoStickerEditView infoStickerEditView = this.f185200a.mo127934E().f159122d;
            C89219l.m154716b(infoStickerEditView, "");
            C83253u.m143651a(infoStickerEditView, ((Number) uVar2.getFirst()).floatValue(), ((Number) uVar2.getSecond()).floatValue(), ((Number) uVar2.getThird()).floatValue());
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.sticker.info.c$o */
    static final class C82858o extends AbstractC89220m implements AbstractC89183m<AbstractC20382b, C20521k, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C82843c f185201a;

        static {
            Covode.recordClassIndex(96714);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C82858o(C82843c cVar) {
            super(2);
            this.f185201a = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20382b bVar, C20521k kVar) {
            C20521k kVar2 = kVar;
            C89219l.m154721d(bVar, "");
            C89219l.m154721d(kVar2, "");
            if (kVar2.f48283b.booleanValue()) {
                C71056i E = this.f185201a.mo127934E();
                E.f159122d.mo112165a(this.f185201a.mo127934E().f159139u.infoStickerModel, false);
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.sticker.info.c$t */
    static final class C82864t extends AbstractC89220m implements AbstractC89183m<AbstractC20382b, C89378p<? extends Float, ? extends Long>, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C82843c f185206a;

        static {
            Covode.recordClassIndex(96720);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C82864t(C82843c cVar) {
            super(2);
            this.f185206a = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20382b bVar, C89378p<? extends Float, ? extends Long> pVar) {
            C89378p<? extends Float, ? extends Long> pVar2 = pVar;
            C89219l.m154721d(bVar, "");
            C89219l.m154721d(pVar2, "");
            InfoStickerEditView infoStickerEditView = this.f185206a.mo127934E().f159122d;
            C89219l.m154716b(infoStickerEditView, "");
            C83253u.m143652a(infoStickerEditView, ((Number) pVar2.getFirst()).floatValue(), ((Number) pVar2.getSecond()).longValue());
            return C89391z.f203057a;
        }
    }

    @Override // com.bytedance.scene.AbstractC22219j
    /* renamed from: a */
    public final View mo22702a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C89219l.m154721d(layoutInflater, "");
        C89219l.m154721d(viewGroup, "");
        View a = C1764a.m5927a(layoutInflater, R.layout.afr, viewGroup, false);
        C89219l.m154716b(a, "");
        return a;
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.sticker.info.c$p */
    static final class C82859p extends AbstractC89220m implements AbstractC89183m<AbstractC20382b, C20521k, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C82843c f185202a;

        static {
            Covode.recordClassIndex(96715);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C82859p(C82843c cVar) {
            super(2);
            this.f185202a = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20382b bVar, C20521k kVar) {
            C20521k kVar2 = kVar;
            C89219l.m154721d(bVar, "");
            C89219l.m154721d(kVar2, "");
            boolean booleanValue = kVar2.f48283b.booleanValue();
            C71056i E = this.f185202a.mo127934E();
            boolean z = !booleanValue;
            if (E.f159122d != null) {
                E.f159122d.setStickerHintEnable(z);
            }
            if (booleanValue) {
                this.f185202a.mo127934E().mo112244a(new AbstractC45857b() {
                    /* class com.p2082ss.android.ugc.gamora.editor.sticker.info.C82843c.C82859p.C828601 */

                    static {
                        Covode.recordClassIndex(96716);
                    }

                    @Override // com.p2082ss.android.ugc.aweme.editSticker.p2879c.AbstractC45857b
                    /* renamed from: a */
                    public final boolean mo77208a() {
                        return true;
                    }
                });
            } else {
                this.f185202a.mo127934E().mo112244a(C45856a.f106824a);
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.sticker.info.c$r */
    static final class C82862r extends AbstractC89220m implements AbstractC89183m<AbstractC20382b, C89378p<? extends Integer, ? extends Integer>, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C82843c f185204a;

        static {
            Covode.recordClassIndex(96718);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C82862r(C82843c cVar) {
            super(2);
            this.f185204a = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20382b bVar, C89378p<? extends Integer, ? extends Integer> pVar) {
            C89378p<? extends Integer, ? extends Integer> pVar2 = pVar;
            C89219l.m154721d(bVar, "");
            C89219l.m154721d(pVar2, "");
            C71056i E = this.f185204a.mo127934E();
            Integer num = (Integer) pVar2.getFirst();
            Integer num2 = (Integer) pVar2.getSecond();
            if (E.f159122d != null) {
                E.f159122d.f158998g.f159075c = num2.intValue();
            }
            if (E.f159141w) {
                if (E.f159130l != null) {
                    E.f159130l.f156540l = num.intValue();
                }
                E.f159126h.mo111131a(num.intValue());
            } else if (!(E.f159142x == null || E.f159142x.size() != 1 || E.f159142x.get(0).f134668h == ((long) num.intValue()))) {
                E.f159142x.get(0).f134668h = (long) num.intValue();
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
