package com.p2082ss.android.ugc.gamora.editor;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.AbstractC1214u;
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
import com.bytedance.jedi.arch.C20531t;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.p1559o.AbstractC21566a;
import com.bytedance.p1559o.C21582f;
import com.bytedance.p1559o.p1561b.C21572a;
import com.bytedance.p969f.p970a.p971a.AbstractC14552j;
import com.bytedance.p969f.p970a.p971a.C14544f;
import com.bytedance.scene.AbstractC22219j;
import com.p2082ss.android.ugc.asve.editor.AbstractC31071f;
import com.p2082ss.android.ugc.aweme.editSticker.compile.C45859b;
import com.p2082ss.android.ugc.aweme.editSticker.interact.AbstractC45899e;
import com.p2082ss.android.ugc.aweme.editSticker.model.InfoStickerModel;
import com.p2082ss.android.ugc.aweme.editSticker.model.StickerItemModel;
import com.p2082ss.android.ugc.aweme.editSticker.p2879c.AbstractC45857b;
import com.p2082ss.android.ugc.aweme.editSticker.p2879c.C45856a;
import com.p2082ss.android.ugc.aweme.editSticker.text.als.EditTextStickerViewModel;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.C71073b;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.EnumC71088d;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.donation.EditDonationStickerViewModel;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.p3816c.AbstractC71087a;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.p3820a.AbstractC71276a;
import com.p2082ss.android.ugc.aweme.shortvideo.preview.AbstractC72510a;
import com.p2082ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.p2082ss.android.ugc.aweme.story.p4047g.p4052c.p4053a.C77268b;
import com.p2082ss.android.ugc.gamora.editor.sticker.AbstractC82581b;
import com.p2082ss.android.ugc.gamora.editor.sticker.core.EditStickerViewModel;
import com.p2082ss.android.ugc.gamora.editor.sticker.duet.AbstractC82814a;
import com.p2082ss.android.ugc.gamora.editor.sticker.info.EditInfoStickerViewModel;
import com.p2082ss.android.ugc.gamora.editor.sticker.livecd.EditLiveCDStickerViewModel;
import com.p2082ss.android.ugc.gamora.editor.sticker.poll.EditPollStickerViewModel;
import com.p2082ss.android.vesdk.VESize;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import p077b.C1731i;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.EnumC89331m;
import p4600h.p4601a.C89070n;
import p4600h.p4601a.C89086z;
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

/* renamed from: com.ss.android.ugc.gamora.editor.a */
public abstract class AbstractC82018a<T> extends AbstractC22219j implements AbstractC20382b, AbstractC21566a, AbstractC82581b {

    /* renamed from: a */
    static final /* synthetic */ AbstractC89286i[] f183560a = {new C89232y(AbstractC82018a.class, "mModel", "getMModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0)};

    /* renamed from: b */
    public AbstractC71276a<T> f183561b = mo127250d();

    /* renamed from: c */
    public EditInfoStickerViewModel f183562c;

    /* renamed from: d */
    public AbstractC14552j f183563d;

    /* renamed from: e */
    private final AbstractC89244h f183564e = C89250i.m154774a(EnumC89331m.NONE, new C82019a(this));

    /* renamed from: f */
    private final AbstractC89248d f183565f = C21572a.m40504a(getDiContainer(), VideoPublishEditModel.class);

    /* renamed from: g */
    private EditTextStickerViewModel f183566g;

    /* renamed from: h */
    private EditPollStickerViewModel f183567h;

    /* renamed from: i */
    private final AbstractC89244h f183568i = C89250i.m154774a(EnumC89331m.NONE, new C82020b(this));

    /* renamed from: j */
    private EditCommentStickerViewModel f183569j;

    /* renamed from: k */
    private EditLiveCDStickerViewModel f183570k;

    /* renamed from: l */
    private EditDonationStickerViewModel f183571l;

    /* renamed from: t */
    private EditStickerViewModel f183572t;

    /* renamed from: u */
    private final AbstractC89244h f183573u = C89250i.m154773a((AbstractC89171a) new C82025f(this));

    /* renamed from: v */
    private final C21582f f183574v;

    static {
        Covode.recordClassIndex(95842);
    }

    /* renamed from: O */
    private final C14544f m141998O() {
        return (C14544f) this.f183573u.getValue();
    }

    /* renamed from: C */
    public abstract int mo127229C();

    /* renamed from: D */
    public abstract void mo127230D();

    /* renamed from: a */
    public final AbstractC72510a mo127242a() {
        return (AbstractC72510a) this.f183564e.getValue();
    }

    /* renamed from: b */
    public final VideoPublishEditModel mo127248b() {
        return (VideoPublishEditModel) this.f183565f.mo23374a(this, f183560a[0]);
    }

    /* renamed from: d */
    public abstract AbstractC71276a<T> mo127250d();

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public boolean getUniqueOnlyGlobal() {
        return true;
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.a$c */
    public static final class C82021c implements AbstractC71087a {

        /* renamed from: a */
        final /* synthetic */ AbstractC82018a f183577a;

        static {
            Covode.recordClassIndex(95845);
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.p3816c.AbstractC71087a
        /* renamed from: a */
        public final void mo112337a(View view) {
            C89219l.m154721d(view, "");
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.p3816c.AbstractC71087a
        /* renamed from: c */
        public final void mo112341c() {
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.p3816c.AbstractC71087a
        /* renamed from: d */
        public final void mo112342d() {
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.p3816c.AbstractC71087a
        /* renamed from: b */
        public final void mo112339b() {
            mo112336a();
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.p3816c.AbstractC71087a
        /* renamed from: e */
        public final void mo112343e() {
            this.f183577a.mo127242a().mo114805a((AbstractC72510a) true, true, true);
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.p3816c.AbstractC71087a
        /* renamed from: f */
        public final void mo112344f() {
            this.f183577a.mo127242a().mo114805a((AbstractC72510a) true, false, true);
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.p3816c.AbstractC71087a
        /* renamed from: a */
        public final void mo112336a() {
            this.f183577a.mo127242a().mo114815d(false);
            this.f183577a.mo127242a().mo114805a((AbstractC72510a) false, true, false);
            this.f183577a.mo127230D();
            this.f183577a.f183561b.mo112710s();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C82021c(AbstractC82018a aVar) {
            this.f183577a = aVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.p3816c.AbstractC71087a
        /* renamed from: b */
        public final void mo112340b(boolean z) {
            if (z) {
                this.f183577a.mo127240N();
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.p3816c.AbstractC71087a
        /* renamed from: a */
        public final void mo112338a(boolean z) {
            this.f183577a.mo127240N();
            if (z) {
                this.f183577a.mo127242a().mo114805a((AbstractC72510a) true, true, true);
            } else {
                this.f183577a.mo127242a().mo114805a((AbstractC72510a) false, true, false);
            }
        }
    }

    @Override // com.bytedance.p1559o.AbstractC21566a
    public C21582f getDiContainer() {
        return this.f183574v;
    }

    /* Return type fixed from 'com.bytedance.jedi.arch.g' to match base method */
    @Override // com.bytedance.jedi.arch.AbstractC20367ae
    public /* bridge */ /* synthetic */ AbstractC20477i getReceiver() {
        return this;
    }

    /* renamed from: J */
    public final boolean mo127236J() {
        return this.f183561b.mo112283b();
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

    /* renamed from: com.ss.android.ugc.gamora.editor.a$a */
    public static final class C82019a extends AbstractC89220m implements AbstractC89171a<AbstractC72510a> {

        /* renamed from: a */
        final /* synthetic */ AbstractC21566a f183575a;

        static {
            Covode.recordClassIndex(95843);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C82019a(AbstractC21566a aVar) {
            super(0);
            this.f183575a = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.bytedance.als.b, com.ss.android.ugc.aweme.shortvideo.preview.a] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.p2082ss.android.ugc.aweme.shortvideo.preview.AbstractC72510a invoke() {
            /*
                r3 = this;
                com.bytedance.o.a r0 = r3.f183575a
                com.bytedance.o.f r2 = r0.getDiContainer()
                java.lang.Class<com.ss.android.ugc.aweme.shortvideo.preview.a> r1 = com.p2082ss.android.ugc.aweme.shortvideo.preview.AbstractC72510a.class
                r0 = 0
                java.lang.Object r0 = r2.mo35249a(r1, r0)
                com.bytedance.als.b r0 = (com.bytedance.als.AbstractC2547b) r0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.gamora.editor.AbstractC82018a.C82019a.invoke():com.bytedance.als.b");
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.a$b */
    public static final class C82020b extends AbstractC89220m implements AbstractC89171a<AbstractC82814a> {

        /* renamed from: a */
        final /* synthetic */ AbstractC21566a f183576a;

        static {
            Covode.recordClassIndex(95844);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C82020b(AbstractC21566a aVar) {
            super(0);
            this.f183576a = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.ss.android.ugc.gamora.editor.sticker.duet.a, com.bytedance.als.b] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.p2082ss.android.ugc.gamora.editor.sticker.duet.AbstractC82814a invoke() {
            /*
                r3 = this;
                com.bytedance.o.a r0 = r3.f183576a
                com.bytedance.o.f r2 = r0.getDiContainer()
                java.lang.Class<com.ss.android.ugc.gamora.editor.sticker.duet.a> r1 = com.p2082ss.android.ugc.gamora.editor.sticker.duet.AbstractC82814a.class
                r0 = 0
                java.lang.Object r0 = r2.mo35249a(r1, r0)
                com.bytedance.als.b r0 = (com.bytedance.als.AbstractC2547b) r0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.gamora.editor.AbstractC82018a.C82020b.invoke():com.bytedance.als.b");
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.a$f */
    static final class C82025f extends AbstractC89220m implements AbstractC89171a<C14544f> {

        /* renamed from: a */
        final /* synthetic */ AbstractC82018a f183581a;

        static {
            Covode.recordClassIndex(95849);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C82025f(AbstractC82018a aVar) {
            super(0);
            this.f183581a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C14544f invoke() {
            return new C14544f(300, this.f183581a.f183561b.f159188r);
        }
    }

    /* renamed from: K */
    public final int mo127237K() {
        return this.f183561b.f159183m.size();
    }

    /* renamed from: L */
    public final String mo127238L() {
        String p = this.f183561b.mo112326p();
        C89219l.m154716b(p, "");
        return p;
    }

    /* renamed from: H */
    public final List<InteractStickerStruct> mo127234H() {
        List<StickerItemModel> list;
        InfoStickerModel infoStickerModel = mo127248b().infoStickerModel;
        if (infoStickerModel == null || (list = infoStickerModel.stickers) == null || list.isEmpty()) {
            return C89086z.INSTANCE;
        }
        return this.f183561b.mo112706a(list);
    }

    /* renamed from: I */
    public final List<String> mo127235I() {
        List<StickerItemModel> list;
        InfoStickerModel infoStickerModel = mo127248b().infoStickerModel;
        if (infoStickerModel == null || (list = infoStickerModel.stickers) == null || list.isEmpty()) {
            return C89086z.INSTANCE;
        }
        return this.f183561b.mo112446q();
    }

    /* renamed from: M */
    public final void mo127239M() {
        mo127242a().mo114805a((AbstractC72510a) false, true, false);
        mo127230D();
        this.f183561b.mo112711t();
    }

    @Override // com.bytedance.scene.AbstractC22219j
    /* renamed from: n_ */
    public final void mo22713n_() {
        super.mo22713n_();
        C77268b bVar = this.f183561b.f159749c;
        if (bVar != null) {
            bVar.mo120870a();
        }
        AbstractC14552j jVar = this.f183563d;
        if (jVar == null) {
            C89219l.m154710a("gestureService");
        }
        jVar.mo23385b(m141998O());
    }

    /* renamed from: F */
    public void mo127232F() {
        mo127242a().mo114778C().observe(this, new C82022d(this));
        EditStickerViewModel editStickerViewModel = this.f183572t;
        if (editStickerViewModel == null) {
            C89219l.m154710a("editStickerViewModel");
        }
        selectNonNullSubscribe(editStickerViewModel, C82037b.f183597a, new C20370ah(), new C82023e(this));
    }

    /* renamed from: G */
    public final void mo127233G() {
        this.f183561b.mo112306a(mo127242a().mo114778C().getValue(), mo127242a());
        List<InteractStickerStruct> a = C71073b.m125565a(mo127248b().getMainBusinessContext(), mo127229C(), EnumC71088d.TRACK_PAGE_EDIT);
        if (!(a == null || a.isEmpty())) {
            C89070n.m154530a((List) a, (Comparator) C82026g.f183582a);
            mo127230D();
            for (InteractStickerStruct interactStickerStruct : a) {
                this.f183561b.mo112311a(interactStickerStruct, (Boolean) false);
            }
        }
    }

    /* renamed from: N */
    public final void mo127240N() {
        EditInfoStickerViewModel editInfoStickerViewModel = this.f183562c;
        if (editInfoStickerViewModel == null) {
            C89219l.m154710a("editInfoStickerViewModel");
        }
        editInfoStickerViewModel.mo127929i();
        EditTextStickerViewModel editTextStickerViewModel = this.f183566g;
        if (editTextStickerViewModel == null) {
            C89219l.m154710a("editTextStickerViewModel");
        }
        editTextStickerViewModel.mo77639n();
        ((AbstractC82814a) this.f183568i.getValue()).mo127882b();
        EditCommentStickerViewModel editCommentStickerViewModel = this.f183569j;
        if (editCommentStickerViewModel == null) {
            C89219l.m154710a("editCommentStickerViewModel");
        }
        editCommentStickerViewModel.mo127199a();
        EditPollStickerViewModel editPollStickerViewModel = this.f183567h;
        if (editPollStickerViewModel == null) {
            C89219l.m154710a("editPollStickerViewModel");
        }
        editPollStickerViewModel.mo128021b();
        EditDonationStickerViewModel editDonationStickerViewModel = this.f183571l;
        if (editDonationStickerViewModel == null) {
            C89219l.m154710a("editDonationStickerViewModel");
        }
        editDonationStickerViewModel.mo112370b();
        EditLiveCDStickerViewModel editLiveCDStickerViewModel = this.f183570k;
        if (editLiveCDStickerViewModel == null) {
            C89219l.m154710a("editLiveCDStickerViewModel");
        }
        editLiveCDStickerViewModel.mo127962h();
    }

    /* renamed from: E */
    public void mo127231E() {
        Activity activity = this.f52549m;
        Objects.requireNonNull(activity, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        JediViewModel a = C20531t.m38716a((ActivityC0945e) activity).mo33800a(EditInfoStickerViewModel.class);
        C89219l.m154716b(a, "");
        this.f183562c = (EditInfoStickerViewModel) a;
        Activity activity2 = this.f52549m;
        Objects.requireNonNull(activity2, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        JediViewModel a2 = C20531t.m38716a((ActivityC0945e) activity2).mo33800a(EditTextStickerViewModel.class);
        C89219l.m154716b(a2, "");
        this.f183566g = (EditTextStickerViewModel) a2;
        Activity activity3 = this.f52549m;
        Objects.requireNonNull(activity3, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        JediViewModel a3 = C20531t.m38716a((ActivityC0945e) activity3).mo33800a(EditCommentStickerViewModel.class);
        C89219l.m154716b(a3, "");
        this.f183569j = (EditCommentStickerViewModel) a3;
        Activity activity4 = this.f52549m;
        Objects.requireNonNull(activity4, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        JediViewModel a4 = C20531t.m38716a((ActivityC0945e) activity4).mo33800a(EditPollStickerViewModel.class);
        C89219l.m154716b(a4, "");
        this.f183567h = (EditPollStickerViewModel) a4;
        Activity activity5 = this.f52549m;
        Objects.requireNonNull(activity5, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        JediViewModel a5 = C20531t.m38716a((ActivityC0945e) activity5).mo33800a(EditDonationStickerViewModel.class);
        C89219l.m154716b(a5, "");
        this.f183571l = (EditDonationStickerViewModel) a5;
        Activity activity6 = this.f52549m;
        Objects.requireNonNull(activity6, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        JediViewModel a6 = C20531t.m38716a((ActivityC0945e) activity6).mo33800a(EditLiveCDStickerViewModel.class);
        C89219l.m154716b(a6, "");
        this.f183570k = (EditLiveCDStickerViewModel) a6;
        Activity activity7 = this.f52549m;
        Objects.requireNonNull(activity7, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        JediViewModel a7 = C20531t.m38716a((ActivityC0945e) activity7).mo33800a(EditStickerViewModel.class);
        C89219l.m154716b(a7, "");
        this.f183572t = (EditStickerViewModel) a7;
    }

    /* renamed from: a */
    public final void mo127243a(AbstractC14552j jVar) {
        C89219l.m154721d(jVar, "");
        this.f183563d = jVar;
    }

    @Override // com.bytedance.jedi.arch.AbstractC20382b
    public <VM1 extends JediViewModel<S1>, S1 extends AbstractC20368af> S1 getState(VM1 vm1) {
        C89219l.m154721d(vm1, "");
        return (S1) AbstractC20382b.C20383a.m38582a(this, vm1);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.gamora.editor.a$d */
    public static final class C82022d<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ AbstractC82018a f183578a;

        static {
            Covode.recordClassIndex(95846);
        }

        C82022d(AbstractC82018a aVar) {
            this.f183578a = aVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            AbstractC31071f fVar = (AbstractC31071f) obj;
            if (fVar != null) {
                this.f183578a.f183561b.mo112306a(fVar, this.f183578a.mo127242a());
            }
        }
    }

    /* renamed from: b */
    public final void mo127249b(String str) {
        C89219l.m154721d(str, "");
        this.f183561b.f159747a = str;
    }

    @Override // com.bytedance.scene.AbstractC22219j
    /* renamed from: a */
    public final void mo22704a(Bundle bundle) {
        super.mo22704a(bundle);
        mo127231E();
        mo127232F();
        this.f183561b.f159184n = new C82021c(this);
    }

    public AbstractC82018a(C21582f fVar) {
        C89219l.m154721d(fVar, "");
        this.f183574v = fVar;
    }

    /* renamed from: a */
    public final void mo127244a(AbstractC45899e eVar) {
        C89219l.m154721d(eVar, "");
        this.f183561b.f159176f = eVar;
    }

    /* renamed from: a */
    public final void mo127245a(VESize vESize) {
        C89219l.m154721d(vESize, "");
        this.f183561b.f159187q = vESize;
    }

    /* renamed from: a */
    public final void mo127246a(String str) {
        C89219l.m154721d(str, "");
        this.f183561b.mo112279a(str);
    }

    /* renamed from: a */
    public final void mo127247a(boolean z) {
        this.f183561b.f159175e = z;
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public <VM1 extends JediViewModel<S1>, S1 extends AbstractC20368af, R> R withState(VM1 vm1, AbstractC89172b<? super S1, ? extends R> bVar) {
        C89219l.m154721d(vm1, "");
        C89219l.m154721d(bVar, "");
        return (R) AbstractC20382b.C20383a.m38593a(this, vm1, bVar);
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.a$g */
    static final class C82026g<T> implements Comparator {

        /* renamed from: a */
        public static final C82026g f183582a = new C82026g();

        static {
            Covode.recordClassIndex(95850);
        }

        C82026g() {
        }

        @Override // java.util.Comparator
        public final /* synthetic */ int compare(Object obj, Object obj2) {
            InteractStickerStruct interactStickerStruct = (InteractStickerStruct) obj;
            InteractStickerStruct interactStickerStruct2 = (InteractStickerStruct) obj2;
            C89219l.m154716b(interactStickerStruct, "");
            int index = interactStickerStruct.getIndex();
            C89219l.m154716b(interactStickerStruct2, "");
            return index - interactStickerStruct2.getIndex();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.gamora.editor.a$e */
    public static final class C82023e extends AbstractC89220m implements AbstractC89183m<AbstractC20382b, C20521k, C89391z> {

        /* renamed from: a */
        final /* synthetic */ AbstractC82018a f183579a;

        static {
            Covode.recordClassIndex(95847);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C82023e(AbstractC82018a aVar) {
            super(2);
            this.f183579a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20382b bVar, C20521k kVar) {
            C20521k kVar2 = kVar;
            C89219l.m154721d(bVar, "");
            C89219l.m154721d(kVar2, "");
            boolean booleanValue = kVar2.f48283b.booleanValue();
            this.f183579a.f183561b.f159194x = !booleanValue;
            if (booleanValue) {
                this.f183579a.f183561b.mo112307a(new AbstractC45857b(this) {
                    /* class com.p2082ss.android.ugc.gamora.editor.AbstractC82018a.C82023e.C820241 */

                    /* renamed from: a */
                    final /* synthetic */ C82023e f183580a;

                    static {
                        Covode.recordClassIndex(95848);
                    }

                    @Override // com.p2082ss.android.ugc.aweme.editSticker.p2879c.AbstractC45857b
                    /* renamed from: a */
                    public final boolean mo77208a() {
                        this.f183580a.f183579a.f183561b.mo112319i();
                        return true;
                    }

                    /* JADX WARN: Incorrect args count in method signature: ()V */
                    {
                        this.f183580a = r1;
                    }
                });
            } else {
                this.f183579a.f183561b.mo112307a(C45856a.f106824a);
            }
            return C89391z.f203057a;
        }
    }

    @Override // com.bytedance.scene.AbstractC22219j
    /* renamed from: a */
    public final View mo22702a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C89219l.m154721d(layoutInflater, "");
        C89219l.m154721d(viewGroup, "");
        FrameLayout frameLayout = (FrameLayout) viewGroup;
        C89219l.m154721d(frameLayout, "");
        this.f183561b.f159189s = false;
        AbstractC31071f value = mo127242a().mo114778C().getValue();
        if (value != null) {
            this.f183561b.f159187q = value.mo56330b();
            this.f183561b.mo112276a(this.f52549m, frameLayout);
            AbstractC14552j jVar = this.f183563d;
            if (jVar == null) {
                C89219l.m154710a("gestureService");
            }
            jVar.mo23383a(m141998O());
        }
        return new View(frameLayout.getContext());
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

    /* renamed from: a */
    public final C1731i<List<C45859b>> mo127241a(String str, int i, int i2, int i3, int i4) {
        C89219l.m154721d(str, "");
        return this.f183561b.mo112709b(str, i, i2, i3, i4);
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
