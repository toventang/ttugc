package com.p2082ss.android.ugc.gamora.editor.subtitle;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.AbstractC1214u;
import com.bytedance.als.AbstractC2565m;
import com.bytedance.als.C2560h;
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
import com.bytedance.scene.AbstractC22219j;
import com.p2082ss.android.ugc.asve.editor.AbstractC31071f;
import com.p2082ss.android.ugc.aweme.editSticker.p2879c.AbstractC45857b;
import com.p2082ss.android.ugc.aweme.editSticker.p2879c.C45856a;
import com.p2082ss.android.ugc.aweme.p2730de.C40963b;
import com.p2082ss.android.ugc.aweme.shortvideo.C70636dh;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.C70968bl;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.p3816c.AbstractC71087a;
import com.p2082ss.android.ugc.aweme.shortvideo.preview.AbstractC72510a;
import com.p2082ss.android.ugc.aweme.sticker.data.C75309d;
import com.p2082ss.android.ugc.aweme.sticker.data.C75313h;
import com.p2082ss.android.ugc.aweme.sticker.data.EnumC75306a;
import com.p2082ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.p2082ss.android.ugc.aweme.sticker.view.C76113a;
import com.p2082ss.android.ugc.gamora.editor.sticker.core.EditStickerViewModel;
import com.p2082ss.android.ugc.gamora.editor.sticker.info.EditInfoStickerViewModel;
import com.p2082ss.android.ugc.gamora.editor.subtitle.C83090d;
import com.p2082ss.android.ugc.tools.utils.C84892d;
import com.p2082ss.android.vesdk.VESize;
import java.util.List;
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
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89232y;
import p4600h.p4616h.AbstractC89248d;
import p4600h.p4620k.AbstractC89286i;
import p4600h.p4620k.AbstractC89290k;

/* renamed from: com.ss.android.ugc.gamora.editor.subtitle.b */
public final class C83076b extends AbstractC22219j implements AbstractC20382b, AbstractC21566a {

    /* renamed from: a */
    static final /* synthetic */ AbstractC89286i[] f185641a = {new C89232y(C83076b.class, "publishEditModel", "getPublishEditModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0)};

    /* renamed from: f */
    public static final C83079c f185642f = new C83079c((byte) 0);

    /* renamed from: b */
    public AbstractC14552j f185643b;

    /* renamed from: c */
    public List<C75313h> f185644c;

    /* renamed from: d */
    public EditStickerViewModel f185645d;

    /* renamed from: e */
    final AbstractC89244h f185646e = C89250i.m154773a((AbstractC89171a) new C83080d(this));

    /* renamed from: g */
    private final AbstractC89244h f185647g = C89250i.m154774a(EnumC89331m.NONE, new C83078b(this));

    /* renamed from: h */
    private final AbstractC89244h f185648h = C89250i.m154774a(EnumC89331m.NONE, new C83077a(this));

    /* renamed from: i */
    private final AbstractC89248d f185649i = C21572a.m40504a(getDiContainer(), VideoPublishEditModel.class);

    /* renamed from: j */
    private final AbstractC89244h f185650j = C89250i.m154773a((AbstractC89171a) new C83087j(this));

    /* renamed from: k */
    private final AbstractC89244h f185651k = C89250i.m154773a((AbstractC89171a) new C83088k(this));

    /* renamed from: l */
    private final C21582f f185652l;

    static {
        Covode.recordClassIndex(96951);
    }

    /* renamed from: E */
    private final C14544f m143458E() {
        return (C14544f) this.f185650j.getValue();
    }

    /* renamed from: C */
    public final C83070a mo128177C() {
        return (C83070a) this.f185651k.getValue();
    }

    /* renamed from: a */
    public final AbstractC83094e mo128179a() {
        return (AbstractC83094e) this.f185647g.getValue();
    }

    /* renamed from: b */
    public final AbstractC72510a mo128184b() {
        return (AbstractC72510a) this.f185648h.getValue();
    }

    /* renamed from: d */
    public final VideoPublishEditModel mo128185d() {
        return (VideoPublishEditModel) this.f185649i.mo23374a(this, f185641a[0]);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final boolean getUniqueOnlyGlobal() {
        return true;
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.subtitle.b$c */
    public static final class C83079c {
        static {
            Covode.recordClassIndex(96954);
        }

        private C83079c() {
        }

        public /* synthetic */ C83079c(byte b) {
            this();
        }
    }

    @Override // com.bytedance.p1559o.AbstractC21566a
    public final C21582f getDiContainer() {
        return this.f185652l;
    }

    /* Return type fixed from 'com.bytedance.jedi.arch.g' to match base method */
    @Override // com.bytedance.jedi.arch.AbstractC20367ae
    public final /* bridge */ /* synthetic */ AbstractC20477i getReceiver() {
        return this;
    }

    @Override // com.bytedance.scene.AbstractC22219j
    /* renamed from: v */
    public final void mo36489v() {
        super.mo36489v();
    }

    @Override // com.bytedance.scene.AbstractC22219j
    /* renamed from: y */
    public final void mo36492y() {
        super.mo36492y();
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

    /* renamed from: com.ss.android.ugc.gamora.editor.subtitle.b$a */
    public static final class C83077a extends AbstractC89220m implements AbstractC89171a<AbstractC72510a> {

        /* renamed from: a */
        final /* synthetic */ AbstractC21566a f185653a;

        static {
            Covode.recordClassIndex(96952);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C83077a(AbstractC21566a aVar) {
            super(0);
            this.f185653a = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.bytedance.als.b, com.ss.android.ugc.aweme.shortvideo.preview.a] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.p2082ss.android.ugc.aweme.shortvideo.preview.AbstractC72510a invoke() {
            /*
                r3 = this;
                com.bytedance.o.a r0 = r3.f185653a
                com.bytedance.o.f r2 = r0.getDiContainer()
                java.lang.Class<com.ss.android.ugc.aweme.shortvideo.preview.a> r1 = com.p2082ss.android.ugc.aweme.shortvideo.preview.AbstractC72510a.class
                r0 = 0
                java.lang.Object r0 = r2.mo35249a(r1, r0)
                com.bytedance.als.b r0 = (com.bytedance.als.AbstractC2547b) r0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.gamora.editor.subtitle.C83076b.C83077a.invoke():com.bytedance.als.b");
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.subtitle.b$b */
    public static final class C83078b extends AbstractC89220m implements AbstractC89171a<AbstractC83094e> {

        /* renamed from: a */
        final /* synthetic */ AbstractC21566a f185654a;

        static {
            Covode.recordClassIndex(96953);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C83078b(AbstractC21566a aVar) {
            super(0);
            this.f185654a = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.ss.android.ugc.gamora.editor.subtitle.e, com.bytedance.als.b] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.p2082ss.android.ugc.gamora.editor.subtitle.AbstractC83094e invoke() {
            /*
                r3 = this;
                com.bytedance.o.a r0 = r3.f185654a
                com.bytedance.o.f r2 = r0.getDiContainer()
                java.lang.Class<com.ss.android.ugc.gamora.editor.subtitle.e> r1 = com.p2082ss.android.ugc.gamora.editor.subtitle.AbstractC83094e.class
                r0 = 0
                java.lang.Object r0 = r2.mo35252b(r1, r0)
                com.bytedance.als.b r0 = (com.bytedance.als.AbstractC2547b) r0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.gamora.editor.subtitle.C83076b.C83078b.invoke():com.bytedance.als.b");
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.subtitle.b$j */
    static final class C83087j extends AbstractC89220m implements AbstractC89171a<C14544f> {

        /* renamed from: a */
        final /* synthetic */ C83076b f185662a;

        static {
            Covode.recordClassIndex(96962);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C83087j(C83076b bVar) {
            super(0);
            this.f185662a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C14544f invoke() {
            return new C14544f(325, this.f185662a.mo128177C().f159188r);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.subtitle.b$k */
    static final class C83088k extends AbstractC89220m implements AbstractC89171a<C83070a> {

        /* renamed from: a */
        final /* synthetic */ C83076b f185663a;

        static {
            Covode.recordClassIndex(96963);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C83088k(C83076b bVar) {
            super(0);
            this.f185663a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C83070a invoke() {
            return new C83070a(this.f185663a.mo128184b());
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.subtitle.b$d */
    static final class C83080d extends AbstractC89220m implements AbstractC89171a<EditInfoStickerViewModel> {

        /* renamed from: a */
        final /* synthetic */ C83076b f185655a;

        static {
            Covode.recordClassIndex(96955);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C83080d(C83076b bVar) {
            super(0);
            this.f185655a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ EditInfoStickerViewModel invoke() {
            Activity activity = this.f185655a.f52549m;
            Objects.requireNonNull(activity, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
            JediViewModel a = C20531t.m38716a((ActivityC0945e) activity).mo33800a(EditInfoStickerViewModel.class);
            C89219l.m154716b(a, "");
            return a;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.subtitle.b$e */
    public static final class C83081e implements AbstractC71087a {

        /* renamed from: a */
        final /* synthetic */ C83076b f185656a;

        static {
            Covode.recordClassIndex(96956);
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.p3816c.AbstractC71087a
        /* renamed from: a */
        public final void mo112337a(View view) {
            C89219l.m154721d(view, "");
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.p3816c.AbstractC71087a
        /* renamed from: b */
        public final void mo112339b() {
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.p3816c.AbstractC71087a
        /* renamed from: d */
        public final void mo112342d() {
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
        /* renamed from: a */
        public final void mo112336a() {
            C70968bl.m125263b(this.f185656a.mo128185d(), "menu");
            AbstractC83094e a = this.f185656a.mo128179a();
            if (a != null) {
                a.mo128166b();
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.p3816c.AbstractC71087a
        /* renamed from: c */
        public final void mo112341c() {
            AbstractC83094e a = this.f185656a.mo128179a();
            if (a != null) {
                a.mo128164a(null);
            }
            this.f185656a.mo128177C().mo112285d();
            this.f185656a.mo128185d().captionStruct = null;
            C70968bl.m125255a(this.f185656a.mo128185d(), "click_menu", 1, 0, "");
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C83081e(C83076b bVar) {
            this.f185656a = bVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.p3816c.AbstractC71087a
        /* renamed from: b */
        public final void mo112340b(boolean z) {
            if (z) {
                EditStickerViewModel editStickerViewModel = this.f185656a.f185645d;
                if (editStickerViewModel == null) {
                    C89219l.m154710a("editStickerViewModel");
                }
                editStickerViewModel.mo127680b(5);
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.p3816c.AbstractC71087a
        /* renamed from: a */
        public final void mo112338a(boolean z) {
            ((EditInfoStickerViewModel) this.f185656a.f185646e.getValue()).mo127929i();
            if (z) {
                this.f185656a.mo128184b().mo114805a((AbstractC72510a) true, true, true);
            } else {
                this.f185656a.mo128184b().mo114805a((AbstractC72510a) false, true, false);
            }
        }
    }

    @Override // com.bytedance.scene.AbstractC22219j
    /* renamed from: n_ */
    public final void mo22713n_() {
        super.mo22713n_();
        AbstractC14552j jVar = this.f185643b;
        if (jVar == null) {
            C89219l.m154710a("gestureService");
        }
        jVar.mo23385b(m143458E());
    }

    /* renamed from: D */
    public final InteractStickerStruct mo128178D() {
        int i;
        int i2;
        if (mo128185d().captionStruct == null) {
            return null;
        }
        InteractStickerStruct interactStickerStruct = new InteractStickerStruct();
        interactStickerStruct.setIndex(11);
        interactStickerStruct.setCaptionStruct(mo128185d().captionStruct);
        C75309d captionStruct = interactStickerStruct.getCaptionStruct();
        if (captionStruct != null) {
            if (mo128177C().f159178h < 0) {
                i2 = C83090d.f185668t - mo128177C().f159178h;
            } else {
                i2 = C83090d.f185668t;
            }
            captionStruct.setMarginStart(Integer.valueOf(i2));
        }
        C75309d captionStruct2 = interactStickerStruct.getCaptionStruct();
        if (captionStruct2 != null) {
            captionStruct2.setVideoWidth(Integer.valueOf(C70636dh.m124831b(C40963b.m82473a()) - (mo128177C().f159178h * 2)));
        }
        C75309d captionStruct3 = interactStickerStruct.getCaptionStruct();
        if (captionStruct3 != null) {
            if (mo128177C().f159179i < 0) {
                i = C83090d.f185667s - mo128177C().f159179i;
            } else {
                i = C83090d.f185667s;
            }
            captionStruct3.setMarginTop(Integer.valueOf(i));
        }
        C75309d captionStruct4 = interactStickerStruct.getCaptionStruct();
        if (captionStruct4 != null) {
            View view = this.f52550n;
            C89219l.m154716b(view, "");
            captionStruct4.setMarginBottom(Integer.valueOf((view.getHeight() - C76113a.m133465a(mo36485s())) + C76113a.getTbMargin()));
        }
        interactStickerStruct.setType(11);
        return interactStickerStruct;
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.subtitle.b$f */
    public static final class C83082f implements C83090d.AbstractC83093b {

        /* renamed from: a */
        final /* synthetic */ C83076b f185657a;

        static {
            Covode.recordClassIndex(96957);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C83082f(C83076b bVar) {
            this.f185657a = bVar;
        }

        @Override // com.p2082ss.android.ugc.gamora.editor.subtitle.C83090d.AbstractC83093b
        /* renamed from: a */
        public final void mo128186a(int i) {
            C75309d dVar = this.f185657a.mo128185d().captionStruct;
            if (dVar != null) {
                dVar.setLocation(i);
            }
        }
    }

    /* renamed from: a */
    public final void mo128180a(AbstractC14552j jVar) {
        C89219l.m154721d(jVar, "");
        this.f185643b = jVar;
    }

    @Override // com.bytedance.jedi.arch.AbstractC20382b
    public final <VM1 extends JediViewModel<S1>, S1 extends AbstractC20368af> S1 getState(VM1 vm1) {
        C89219l.m154721d(vm1, "");
        return (S1) AbstractC20382b.C20383a.m38582a(this, vm1);
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.subtitle.b$g */
    static final class C83083g<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ C83076b f185658a;

        static {
            Covode.recordClassIndex(96958);
        }

        C83083g(C83076b bVar) {
            this.f185658a = bVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            AbstractC31071f fVar = (AbstractC31071f) obj;
            if (fVar != null) {
                this.f185658a.mo128177C().mo112306a(fVar, this.f185658a.mo128184b());
            }
        }
    }

    /* renamed from: a */
    public final void mo128181a(C75309d dVar) {
        if (dVar != null) {
            mo128177C().mo128174a(dVar.getUtterances());
            mo128177C().mo128173a(dVar.getLocation());
            this.f185644c = dVar.getUtterances();
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.subtitle.b$h */
    static final class C83084h<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C83076b f185659a;

        static {
            Covode.recordClassIndex(96959);
        }

        C83084h(C83076b bVar) {
            this.f185659a = bVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            List<C75313h> list = (List) obj;
            this.f185659a.mo128177C().mo128174a(list);
            if (C84892d.m145850a(this.f185659a.f185644c) && !C84892d.m145850a(list)) {
                this.f185659a.mo128177C().mo128173a(EnumC75306a.LEFT_BOTTOM.getValue());
            }
            this.f185659a.f185644c = list;
            this.f185659a.mo128177C().mo112446q();
        }
    }

    /* renamed from: a */
    public final void mo128182a(VESize vESize) {
        C89219l.m154721d(vESize, "");
        mo128177C().f159187q = vESize;
    }

    public C83076b(C21582f fVar) {
        C89219l.m154721d(fVar, "");
        this.f185652l = fVar;
    }

    @Override // com.bytedance.scene.AbstractC22219j
    /* renamed from: a */
    public final void mo22704a(Bundle bundle) {
        C2560h<List<C75313h>> a;
        super.mo22704a(bundle);
        mo128184b().mo114778C().observe(this, new C83083g(this));
        AbstractC83094e a2 = mo128179a();
        if (!(a2 == null || (a = a2.mo128162a()) == null)) {
            a.mo7036a(this, new C83084h(this));
        }
        EditStickerViewModel editStickerViewModel = this.f185645d;
        if (editStickerViewModel == null) {
            C89219l.m154710a("editStickerViewModel");
        }
        selectNonNullSubscribe(editStickerViewModel, C83089c.f185664a, new C20370ah(), new C83085i(this));
        mo128177C().f159184n = new C83081e(this);
        C83070a C = mo128177C();
        C83082f fVar = new C83082f(this);
        C89219l.m154721d(fVar, "");
        C83090d dVar = C.f185633a;
        if (dVar != null) {
            dVar.setOnCaptionStickerListener(fVar);
        }
        C.f185628A = fVar;
    }

    /* renamed from: a */
    public final void mo128183a(boolean z) {
        mo128177C().f159175e = z;
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final <VM1 extends JediViewModel<S1>, S1 extends AbstractC20368af, R> R withState(VM1 vm1, AbstractC89172b<? super S1, ? extends R> bVar) {
        C89219l.m154721d(vm1, "");
        C89219l.m154721d(bVar, "");
        return (R) AbstractC20382b.C20383a.m38593a(this, vm1, bVar);
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.subtitle.b$i */
    static final class C83085i extends AbstractC89220m implements AbstractC89183m<AbstractC20382b, C20521k, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C83076b f185660a;

        static {
            Covode.recordClassIndex(96960);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C83085i(C83076b bVar) {
            super(2);
            this.f185660a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20382b bVar, C20521k kVar) {
            C20521k kVar2 = kVar;
            C89219l.m154721d(bVar, "");
            C89219l.m154721d(kVar2, "");
            boolean booleanValue = kVar2.f48283b.booleanValue();
            this.f185660a.mo128177C().f159194x = !booleanValue;
            if (booleanValue) {
                this.f185660a.mo128177C().mo112307a(new AbstractC45857b(this) {
                    /* class com.p2082ss.android.ugc.gamora.editor.subtitle.C83076b.C83085i.C830861 */

                    /* renamed from: a */
                    final /* synthetic */ C83085i f185661a;

                    static {
                        Covode.recordClassIndex(96961);
                    }

                    @Override // com.p2082ss.android.ugc.aweme.editSticker.p2879c.AbstractC45857b
                    /* renamed from: a */
                    public final boolean mo77208a() {
                        this.f185661a.f185660a.mo128177C().mo112319i();
                        return true;
                    }

                    /* JADX WARN: Incorrect args count in method signature: ()V */
                    {
                        this.f185661a = r1;
                    }
                });
            } else {
                this.f185660a.mo128177C().mo112307a(C45856a.f106824a);
            }
            return C89391z.f203057a;
        }
    }

    @Override // com.bytedance.scene.AbstractC22219j
    /* renamed from: a */
    public final View mo22702a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        MethodCollector.m26663i(11889);
        C89219l.m154721d(layoutInflater, "");
        C89219l.m154721d(viewGroup, "");
        Activity activity = this.f52549m;
        if (activity != null) {
            JediViewModel a = C20531t.m38716a((ActivityC0945e) activity).mo33800a(EditStickerViewModel.class);
            C89219l.m154716b(a, "");
            this.f185645d = (EditStickerViewModel) a;
            if (mo128184b().mo114778C().getValue() != null) {
                mo128177C().mo112314b(this.f52549m, (FrameLayout) viewGroup);
                AbstractC14552j jVar = this.f185643b;
                if (jVar == null) {
                    C89219l.m154710a("gestureService");
                }
                jVar.mo23383a(m143458E());
            }
            mo128177C().f185635c = mo128185d();
            mo128177C().mo112306a(mo128184b().mo114778C().getValue(), mo128184b());
            mo128177C().f159189s = false;
            View view = new View(viewGroup.getContext());
            MethodCollector.m26664o(11889);
            return view;
        }
        NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        MethodCollector.m26664o(11889);
        throw nullPointerException;
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
