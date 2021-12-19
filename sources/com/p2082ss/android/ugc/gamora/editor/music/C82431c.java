package com.p2082ss.android.ugc.gamora.editor.music;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.app.ActivityC0218d;
import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.AbstractC1204m;
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
import com.bytedance.jedi.arch.C20531t;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.p1559o.AbstractC21566a;
import com.bytedance.p1559o.C21582f;
import com.bytedance.p1559o.p1561b.C21572a;
import com.bytedance.scene.AbstractC22219j;
import com.p2082ss.android.ugc.aweme.p2722cy.p2723a.AbstractC40892g;
import com.p2082ss.android.ugc.aweme.p2722cy.p2723a.AbstractC40895j;
import com.p2082ss.android.ugc.aweme.p2722cy.p2723a.AbstractC40896k;
import com.p2082ss.android.ugc.aweme.p2722cy.p2723a.AbstractC40897l;
import com.p2082ss.android.ugc.aweme.p2724cz.AbstractC40906e;
import com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63154aa;
import com.p2082ss.android.ugc.aweme.services.video.VEVolumeChangeOp;
import com.p2082ss.android.ugc.aweme.shortvideo.C69905c;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.C70968bl;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.C70976bp;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.videolength.C71528a;
import com.p2082ss.android.ugc.aweme.shortvideo.p3839l.C71962q;
import com.p2082ss.android.ugc.aweme.shortvideo.p3853q.AbstractC72722f;
import com.p2082ss.android.ugc.aweme.shortvideo.p3853q.View$OnClickListenerC72712e;
import com.p2082ss.android.ugc.aweme.shortvideo.preview.AbstractC72510a;
import com.p2082ss.android.ugc.aweme.shortvideo.subtitle.C73211f;
import com.p2082ss.android.ugc.aweme.utils.C80285bz;
import com.p2082ss.android.ugc.gamora.editor.AbstractC82036ac;
import com.p2082ss.android.ugc.gamora.editor.C83254v;
import com.p2082ss.android.ugc.gamora.editor.cutmusic.AbstractC82104a;
import com.p2082ss.android.ugc.gamora.editor.rootscene.AbstractC82561d;
import com.p2082ss.android.ugc.gamora.editor.sticker.core.AbstractC82610a;
import com.p2082ss.android.ugc.gamora.editor.subtitle.AbstractC83094e;
import com.p2082ss.android.ugc.gamora.editor.toolbar.AbstractC83233s;
import com.p2082ss.android.ugc.tools.view.p4362a.AbstractC84919c;
import com.p2082ss.android.ugc.trill.R;
import dmt.p4542av.video.C88296t;
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

/* renamed from: com.ss.android.ugc.gamora.editor.music.c */
public final class C82431c extends AbstractC22219j implements AbstractC20382b, AbstractC21566a {

    /* renamed from: a */
    static final /* synthetic */ AbstractC89286i[] f184369a = {new C89232y(C82431c.class, "mModel", "getMModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0), new C89232y(C82431c.class, "editToolBarApi", "getEditToolBarApi()Lcom/ss/android/ugc/gamora/editor/toolbar/EditToolbarApi;", 0), new C89232y(C82431c.class, "editSubtitleApi", "getEditSubtitleApi()Lcom/ss/android/ugc/gamora/editor/subtitle/EditSubtitleApi;", 0)};

    /* renamed from: h */
    public static final C82436e f184370h = new C82436e((byte) 0);

    /* renamed from: b */
    public boolean f184371b = true;

    /* renamed from: c */
    final AbstractC89248d f184372c = C21572a.m40505b(getDiContainer(), AbstractC83233s.class);

    /* renamed from: d */
    public boolean f184373d;

    /* renamed from: e */
    public EditMusicViewModel f184374e;

    /* renamed from: f */
    final AbstractC89244h f184375f = C89250i.m154774a(EnumC89331m.NONE, new C82432a(this));

    /* renamed from: g */
    final AbstractC89244h f184376g = C89250i.m154774a(EnumC89331m.NONE, new C82433b(this));

    /* renamed from: i */
    private final AbstractC89244h f184377i = C89250i.m154773a((AbstractC89171a) new C82438g(this));

    /* renamed from: j */
    private final AbstractC89244h f184378j = C89250i.m154773a((AbstractC89171a) C82439h.f184390a);

    /* renamed from: k */
    private final AbstractC89248d f184379k = C21572a.m40504a(getDiContainer(), VideoPublishEditModel.class);

    /* renamed from: l */
    private final AbstractC89244h f184380l = C89250i.m154774a(EnumC89331m.NONE, new C82434c(this));

    /* renamed from: t */
    private final AbstractC89244h f184381t = C89250i.m154774a(EnumC89331m.NONE, new C82435d(this));

    /* renamed from: u */
    private final AbstractC89248d f184382u = C21572a.m40505b(getDiContainer(), AbstractC83094e.class);

    /* renamed from: v */
    private final C21582f f184383v;

    static {
        Covode.recordClassIndex(96271);
    }

    /* renamed from: C */
    public final AbstractC72510a mo127544C() {
        return (AbstractC72510a) this.f184380l.getValue();
    }

    /* renamed from: D */
    public final AbstractC83094e mo127545D() {
        return (AbstractC83094e) this.f184382u.mo23374a(this, f184369a[2]);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final C71962q mo127548a() {
        return (C71962q) this.f184377i.getValue();
    }

    /* renamed from: b */
    public final View$OnClickListenerC72712e mo127549b() {
        return (View$OnClickListenerC72712e) this.f184378j.getValue();
    }

    /* renamed from: d */
    public final VideoPublishEditModel mo127550d() {
        return (VideoPublishEditModel) this.f184379k.mo23374a(this, f184369a[0]);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final boolean getUniqueOnlyGlobal() {
        return true;
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.music.c$e */
    public static final class C82436e {
        static {
            Covode.recordClassIndex(96276);
        }

        private C82436e() {
        }

        public /* synthetic */ C82436e(byte b) {
            this();
        }
    }

    @Override // com.bytedance.p1559o.AbstractC21566a
    public final C21582f getDiContainer() {
        return this.f184383v;
    }

    /* Return type fixed from 'com.bytedance.jedi.arch.g' to match base method */
    @Override // com.bytedance.jedi.arch.AbstractC20367ae
    public final /* bridge */ /* synthetic */ AbstractC20477i getReceiver() {
        return this;
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.music.c$h */
    static final class C82439h extends AbstractC89220m implements AbstractC89171a<View$OnClickListenerC72712e> {

        /* renamed from: a */
        public static final C82439h f184390a = new C82439h();

        static {
            Covode.recordClassIndex(96279);
        }

        C82439h() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ View$OnClickListenerC72712e invoke() {
            return new View$OnClickListenerC72712e();
        }
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

    /* renamed from: com.ss.android.ugc.gamora.editor.music.c$a */
    public static final class C82432a extends AbstractC89220m implements AbstractC89171a<AbstractC82610a> {

        /* renamed from: a */
        final /* synthetic */ AbstractC21566a f184384a;

        static {
            Covode.recordClassIndex(96272);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C82432a(AbstractC21566a aVar) {
            super(0);
            this.f184384a = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.bytedance.als.b, com.ss.android.ugc.gamora.editor.sticker.core.a] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.p2082ss.android.ugc.gamora.editor.sticker.core.AbstractC82610a invoke() {
            /*
                r3 = this;
                com.bytedance.o.a r0 = r3.f184384a
                com.bytedance.o.f r2 = r0.getDiContainer()
                java.lang.Class<com.ss.android.ugc.gamora.editor.sticker.core.a> r1 = com.p2082ss.android.ugc.gamora.editor.sticker.core.AbstractC82610a.class
                r0 = 0
                java.lang.Object r0 = r2.mo35249a(r1, r0)
                com.bytedance.als.b r0 = (com.bytedance.als.AbstractC2547b) r0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.gamora.editor.music.C82431c.C82432a.invoke():com.bytedance.als.b");
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.music.c$b */
    public static final class C82433b extends AbstractC89220m implements AbstractC89171a<AbstractC82104a> {

        /* renamed from: a */
        final /* synthetic */ AbstractC21566a f184385a;

        static {
            Covode.recordClassIndex(96273);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C82433b(AbstractC21566a aVar) {
            super(0);
            this.f184385a = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.bytedance.als.b, com.ss.android.ugc.gamora.editor.cutmusic.a] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.p2082ss.android.ugc.gamora.editor.cutmusic.AbstractC82104a invoke() {
            /*
                r3 = this;
                com.bytedance.o.a r0 = r3.f184385a
                com.bytedance.o.f r2 = r0.getDiContainer()
                java.lang.Class<com.ss.android.ugc.gamora.editor.cutmusic.a> r1 = com.p2082ss.android.ugc.gamora.editor.cutmusic.AbstractC82104a.class
                r0 = 0
                java.lang.Object r0 = r2.mo35249a(r1, r0)
                com.bytedance.als.b r0 = (com.bytedance.als.AbstractC2547b) r0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.gamora.editor.music.C82431c.C82433b.invoke():com.bytedance.als.b");
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.music.c$c */
    public static final class C82434c extends AbstractC89220m implements AbstractC89171a<AbstractC72510a> {

        /* renamed from: a */
        final /* synthetic */ AbstractC21566a f184386a;

        static {
            Covode.recordClassIndex(96274);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C82434c(AbstractC21566a aVar) {
            super(0);
            this.f184386a = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.bytedance.als.b, com.ss.android.ugc.aweme.shortvideo.preview.a] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.p2082ss.android.ugc.aweme.shortvideo.preview.AbstractC72510a invoke() {
            /*
                r3 = this;
                com.bytedance.o.a r0 = r3.f184386a
                com.bytedance.o.f r2 = r0.getDiContainer()
                java.lang.Class<com.ss.android.ugc.aweme.shortvideo.preview.a> r1 = com.p2082ss.android.ugc.aweme.shortvideo.preview.AbstractC72510a.class
                r0 = 0
                java.lang.Object r0 = r2.mo35249a(r1, r0)
                com.bytedance.als.b r0 = (com.bytedance.als.AbstractC2547b) r0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.gamora.editor.music.C82431c.C82434c.invoke():com.bytedance.als.b");
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.music.c$d */
    public static final class C82435d extends AbstractC89220m implements AbstractC89171a<AbstractC82427a> {

        /* renamed from: a */
        final /* synthetic */ AbstractC21566a f184387a;

        static {
            Covode.recordClassIndex(96275);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C82435d(AbstractC21566a aVar) {
            super(0);
            this.f184387a = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.bytedance.als.b, com.ss.android.ugc.gamora.editor.music.a] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.p2082ss.android.ugc.gamora.editor.music.AbstractC82427a invoke() {
            /*
                r3 = this;
                com.bytedance.o.a r0 = r3.f184387a
                com.bytedance.o.f r2 = r0.getDiContainer()
                java.lang.Class<com.ss.android.ugc.gamora.editor.music.a> r1 = com.p2082ss.android.ugc.gamora.editor.music.AbstractC82427a.class
                r0 = 0
                java.lang.Object r0 = r2.mo35249a(r1, r0)
                com.bytedance.als.b r0 = (com.bytedance.als.AbstractC2547b) r0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.gamora.editor.music.C82431c.C82435d.invoke():com.bytedance.als.b");
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.music.c$g */
    static final class C82438g extends AbstractC89220m implements AbstractC89171a<C71962q> {

        /* renamed from: a */
        final /* synthetic */ C82431c f184389a;

        static {
            Covode.recordClassIndex(96278);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C82438g(C82431c cVar) {
            super(0);
            this.f184389a = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C71962q invoke() {
            return new C71962q(this.f184389a.mo127550d());
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.music.c$p */
    public static final class C82447p implements AbstractC40892g {

        /* renamed from: a */
        final /* synthetic */ C82431c f184398a;

        static {
            Covode.recordClassIndex(96287);
        }

        @Override // com.p2082ss.android.ugc.aweme.p2722cy.p2723a.AbstractC40892g
        /* renamed from: a */
        public final void mo70085a() {
            C70968bl.m125274g(this.f184398a.mo127550d());
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C82447p(C82431c cVar) {
            this.f184398a = cVar;
        }
    }

    @Override // com.bytedance.scene.AbstractC22219j
    /* renamed from: o */
    public final void mo36481o() {
        super.mo36481o();
        mo127549b().mo114976b();
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.music.c$o */
    public static final class C82446o implements View$OnClickListenerC72712e.AbstractC72715b {

        /* renamed from: a */
        final /* synthetic */ C82431c f184397a;

        static {
            Covode.recordClassIndex(96286);
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.p3853q.View$OnClickListenerC72712e.AbstractC72715b
        /* renamed from: d */
        public final void mo114985d() {
            C70968bl.m125271e(this.f184397a.mo127550d(), this.f184397a.mo36476c_(R.string.yj));
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.p3853q.View$OnClickListenerC72712e.AbstractC72715b
        /* renamed from: f */
        public final void mo114987f() {
            C82431c cVar = this.f184397a;
            AbstractC83233s sVar = (AbstractC83233s) cVar.f184372c.mo23374a(cVar, C82431c.f184369a[1]);
            if (sVar != null) {
                sVar.mo128245b(0);
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.p3853q.View$OnClickListenerC72712e.AbstractC72715b
        /* renamed from: a */
        public final void mo114981a() {
            AbstractC82036ac ap;
            this.f184397a.mo127544C().mo114833v().setValue(C88296t.m153437b());
            AbstractC22219j jVar = this.f184397a.f52551o;
            if (!(jVar instanceof C83254v)) {
                jVar = null;
            }
            AbstractC82561d dVar = (AbstractC82561d) jVar;
            if (!(dVar == null || (ap = dVar.mo127624ap()) == null)) {
                ap.mo127281h();
            }
            C70968bl.m125272f(this.f184397a.mo127550d());
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.p3853q.View$OnClickListenerC72712e.AbstractC72715b
        /* renamed from: e */
        public final void mo114986e() {
            if (C70976bp.m125317m(this.f184397a.mo127550d())) {
                this.f184397a.f184373d = true;
                EditMusicViewModel editMusicViewModel = this.f184397a.f184374e;
                if (editMusicViewModel == null) {
                    C89219l.m154710a("musicViewModel");
                }
                editMusicViewModel.mo127540b();
                ((AbstractC82610a) this.f184397a.f184375f.getValue()).mo127684g().setValue(false);
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.p3853q.View$OnClickListenerC72712e.AbstractC72715b
        /* renamed from: b */
        public final void mo114984b() {
            C82431c cVar = this.f184397a;
            if (!cVar.mo127548a().f161266f) {
                cVar.mo127548a().mo113607a(cVar.mo127550d().isMuted);
                cVar.mo127548a().f161261a = cVar.mo127549b().f163035q;
                C71962q a = cVar.mo127548a();
                Activity activity = cVar.f52549m;
                Objects.requireNonNull(activity, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
                Activity activity2 = cVar.f52549m;
                Objects.requireNonNull(activity2, "null cannot be cast to non-null type com.ss.android.ugc.tools.view.activity.AVListenableActivityRegistry");
                a.mo113606a((ActivityC0945e) activity, (AbstractC84919c) activity2);
                cVar.mo127548a().mo113609b(false);
                cVar.mo127548a().f161267g = new C82437f(cVar);
            }
            cVar.mo127547F();
            C70968bl.m125269d(this.f184397a.mo127550d(), this.f184397a.mo36476c_(R.string.z_));
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C82446o(C82431c cVar) {
            this.f184397a = cVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.p3853q.View$OnClickListenerC72712e.AbstractC72715b
        /* renamed from: a */
        public final void mo114983a(boolean z, C69905c cVar) {
            String str;
            if (this.f184397a.mo127549b().mo114979e() == 0) {
                str = "edit_page_recommend";
            } else {
                str = "edit_page_recommend_favourite";
            }
            if (cVar == null) {
                cVar = new C69905c();
            }
            this.f184397a.mo127549b();
            int a = View$OnClickListenerC72712e.m128171a();
            VideoPublishEditModel d = this.f184397a.mo127550d();
            C89219l.m154721d(d, "");
            C89219l.m154721d(str, "");
            String musicId = cVar.getMusicId();
            if (musicId == null) {
                musicId = "";
            }
            C89219l.m154716b(musicId, "");
            C70968bl.m125261a(musicId, z, a, d, str);
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.p3853q.View$OnClickListenerC72712e.AbstractC72715b
        /* renamed from: a */
        public final void mo114982a(String str, C69905c cVar, boolean z) {
            AbstractC82036ac ap;
            AbstractC22219j jVar = this.f184397a.f52551o;
            if (!(jVar instanceof C83254v)) {
                jVar = null;
            }
            AbstractC82561d dVar = (AbstractC82561d) jVar;
            if (dVar != null && (ap = dVar.mo127624ap()) != null) {
                ap.mo127276a(str, cVar, z);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.music.c$r */
    public static final class C82449r extends AbstractC40906e.C40907a {

        /* renamed from: a */
        final /* synthetic */ C82431c f184400a;

        static {
            Covode.recordClassIndex(96289);
        }

        @Override // com.p2082ss.android.ugc.aweme.p2724cz.AbstractC40904c, com.p2082ss.android.ugc.aweme.p2724cz.AbstractC40906e.C40907a
        /* renamed from: d */
        public final void mo70109d() {
            if (this.f184400a.f184373d) {
                this.f184400a.f184373d = false;
                ((AbstractC82104a) this.f184400a.f184376g.getValue()).mo127330a();
                return;
            }
            this.f184400a.mo127544C().mo114805a((AbstractC72510a) true, false, true);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C82449r(C82431c cVar) {
            this.f184400a = cVar;
        }
    }

    /* renamed from: E */
    public final boolean mo127546E() {
        if ((mo127550d().isFastImport || mo127550d().isCutSameVideoType() || mo127550d().hasOriginalSound()) && !mo127550d().isMuted) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.scene.AbstractC22219j
    /* renamed from: w */
    public final void mo36490w() {
        super.mo36490w();
        if (mo127549b().f163029k) {
            AbstractC63154aa.AbstractC63159d dVar = mo127549b().f163024f;
            if (dVar != null) {
                dVar.mo101584b();
            }
            AbstractC63154aa.AbstractC63159d dVar2 = mo127549b().f163024f;
            if (dVar2 != null) {
                dVar2.mo101589g();
            }
        }
    }

    @Override // com.bytedance.scene.AbstractC22219j
    /* renamed from: x */
    public final void mo36491x() {
        super.mo36491x();
        if (mo127549b().f163029k) {
            AbstractC63154aa.AbstractC63159d dVar = mo127549b().f163024f;
            if (dVar != null) {
                dVar.mo101574a();
            }
            AbstractC63154aa.AbstractC63159d dVar2 = mo127549b().f163024f;
            if (dVar2 != null) {
                dVar2.mo101588f();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: F */
    public final void mo127547F() {
        boolean z;
        mo127548a().mo113604a((int) (mo127550d().musicVolume * 100.0f));
        mo127548a().mo113608b((int) (mo127550d().voiceVolume * 100.0f));
        boolean z2 = true;
        if (mo127546E()) {
            if (mo127550d().mUseMusicBeforeEdit) {
                C71962q a = mo127548a();
                if (mo127550d().mMusicPath != null) {
                    z = true;
                } else {
                    z = false;
                }
                a.mo113611d(z).mo113610c(false);
            } else {
                mo127548a().mo113611d(true).mo113610c(false);
            }
            if (C70976bp.m125314j(mo127550d())) {
                C71962q a2 = mo127548a();
                if (mo127550d().mMusicPath == null) {
                    z2 = false;
                }
                a2.mo113611d(z2).mo113610c(false);
                return;
            }
            return;
        }
        C71962q a3 = mo127548a();
        if (mo127550d().mMusicPath == null) {
            z2 = false;
        }
        a3.mo113611d(z2).mo113610c(this.f184371b);
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.music.c$f */
    public static final class C82437f implements C71962q.AbstractC71966a {

        /* renamed from: a */
        final /* synthetic */ C82431c f184388a;

        static {
            Covode.recordClassIndex(96277);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C82437f(C82431c cVar) {
            this.f184388a = cVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.p3839l.C71962q.AbstractC71966a
        /* renamed from: a */
        public final void mo88207a(float f) {
            if (!this.f184388a.mo127546E()) {
                AbstractC72510a C = this.f184388a.mo127544C();
                VEVolumeChangeOp ofVoice = VEVolumeChangeOp.ofVoice(f);
                C89219l.m154716b(ofVoice, "");
                C.mo114800a(ofVoice);
            }
            this.f184388a.mo127550d().voiceVolume = f;
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.p3839l.C71962q.AbstractC71966a
        /* renamed from: b */
        public final void mo88208b(float f) {
            if (this.f184388a.mo127546E()) {
                AbstractC72510a C = this.f184388a.mo127544C();
                VEVolumeChangeOp ofMusic = VEVolumeChangeOp.ofMusic(f);
                C89219l.m154716b(ofMusic, "");
                C.mo114800a(ofMusic);
            } else if (this.f184388a.mo127550d().mMusicPath != null) {
                AbstractC72510a C2 = this.f184388a.mo127544C();
                VEVolumeChangeOp ofMusic2 = VEVolumeChangeOp.ofMusic(f);
                C89219l.m154716b(ofMusic2, "");
                C2.mo114800a(ofMusic2);
            }
            this.f184388a.mo127550d().musicVolume = f;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.music.c$m */
    public static final class C82444m implements AbstractC40895j {

        /* renamed from: a */
        final /* synthetic */ C82431c f184395a;

        static {
            Covode.recordClassIndex(96284);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C82444m(C82431c cVar) {
            this.f184395a = cVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.p2722cy.p2723a.AbstractC40895j
        /* renamed from: a */
        public final void mo70092a(View view, int i) {
            String str;
            String str2;
            C89219l.m154721d(view, "");
            C69905c a = this.f184395a.mo127549b().mo114972a(i);
            VideoPublishEditModel d = this.f184395a.mo127550d();
            if (a == null || (str = a.getMusicId()) == null) {
                str = "";
            }
            C89219l.m154716b(str, "");
            int i2 = i + 1;
            this.f184395a.mo127549b();
            int a2 = View$OnClickListenerC72712e.m128171a();
            if (this.f184395a.mo127549b().mo114979e() == 0) {
                str2 = "recommend";
            } else {
                str2 = "favorite";
            }
            C70968bl.m125256a(d, str, i2, a2, str2, false);
            this.f184395a.mo127550d().mMusicShowRank = i2;
            VideoPublishEditModel d2 = this.f184395a.mo127550d();
            this.f184395a.mo127549b();
            d2.mMusicRecType = View$OnClickListenerC72712e.m128171a();
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.music.c$n */
    public static final class C82445n implements AbstractC40896k {

        /* renamed from: a */
        final /* synthetic */ C82431c f184396a;

        static {
            Covode.recordClassIndex(96285);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C82445n(C82431c cVar) {
            this.f184396a = cVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.p2722cy.p2723a.AbstractC40896k
        /* renamed from: a */
        public final void mo70093a(int i) {
            String str;
            String str2;
            C69905c a = this.f184396a.mo127549b().mo114972a(i);
            VideoPublishEditModel d = this.f184396a.mo127550d();
            if (a == null || (str = a.getMusicId()) == null) {
                str = "";
            }
            this.f184396a.mo127549b();
            int a2 = View$OnClickListenerC72712e.m128171a();
            if (this.f184396a.mo127549b().mo114979e() == 0) {
                str2 = "recommend";
            } else {
                str2 = "favorite";
            }
            C70968bl.m125257a(d, str, a2, str2, i);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.music.c$q */
    public static final class C82448q implements AbstractC40897l {

        /* renamed from: a */
        final /* synthetic */ C82431c f184399a;

        static {
            Covode.recordClassIndex(96288);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C82448q(C82431c cVar) {
            this.f184399a = cVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.p2722cy.p2723a.AbstractC40897l
        /* renamed from: a */
        public final void mo70094a(boolean z) {
            String str;
            VideoPublishEditModel d = this.f184399a.mo127550d();
            if (z) {
                str = "recommend";
            } else {
                str = "favorite";
            }
            C70968bl.m125273f(d, str);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.music.c$s */
    public static final class C82450s implements AbstractC72722f {

        /* renamed from: a */
        final /* synthetic */ C82431c f184401a;

        static {
            Covode.recordClassIndex(96290);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C82450s(C82431c cVar) {
            this.f184401a = cVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.p3853q.AbstractC72722f
        /* renamed from: a */
        public final void mo114989a(boolean z) {
            AbstractC83094e D;
            if (!z && C73211f.m129264a(this.f184401a.mo127550d()) && (D = this.f184401a.mo127545D()) != null && D.mo128171h()) {
                AbstractC83094e D2 = this.f184401a.mo127545D();
                if (D2 != null) {
                    D2.mo128170g();
                }
                AbstractC83094e D3 = this.f184401a.mo127545D();
                if (D3 != null) {
                    D3.mo128169f();
                }
            }
        }
    }

    @Override // com.bytedance.jedi.arch.AbstractC20382b
    public final <VM1 extends JediViewModel<S1>, S1 extends AbstractC20368af> S1 getState(VM1 vm1) {
        C89219l.m154721d(vm1, "");
        return (S1) AbstractC20382b.C20383a.m38582a(this, vm1);
    }

    public C82431c(C21582f fVar) {
        C89219l.m154721d(fVar, "");
        this.f184383v = fVar;
    }

    @Override // com.bytedance.scene.AbstractC22219j
    /* renamed from: a */
    public final void mo22704a(Bundle bundle) {
        super.mo22704a(bundle);
        Activity activity = this.f52549m;
        Objects.requireNonNull(activity, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        JediViewModel a = C20531t.m38716a((ActivityC0945e) activity).mo33800a(EditMusicViewModel.class);
        C89219l.m154716b(a, "");
        this.f184374e = (EditMusicViewModel) a;
        mo127549b().f163040v = C71528a.m126416a(mo127550d()) ? 1 : 0;
        VideoPublishEditModel d = mo127550d();
        if (d.isMvThemeVideoType()) {
            if (!C80285bz.m139187a(mo127550d())) {
                View$OnClickListenerC72712e b = mo127549b();
                List<String> list = d.mvCreateVideoData.musicIds;
                b.f163022d = list;
                AbstractC63154aa.AbstractC63159d dVar = b.f163024f;
                if (dVar != null) {
                    dVar.mo101581a(list);
                }
            }
            mo127549b().f163031m = d.mIsFromDraft;
        }
        mo127549b().f163025g = mo127550d().isPhotoMvMode;
        EditMusicViewModel editMusicViewModel = this.f184374e;
        if (editMusicViewModel == null) {
            C89219l.m154710a("musicViewModel");
        }
        selectNonNullSubscribe(editMusicViewModel, C82451d.f184402a, new C20370ah(), new C82440i(this));
        EditMusicViewModel editMusicViewModel2 = this.f184374e;
        if (editMusicViewModel2 == null) {
            C89219l.m154710a("musicViewModel");
        }
        AbstractC20382b.C20383a.m38603b(this, editMusicViewModel2, C82452e.f184403a, new C82441j(this));
        EditMusicViewModel editMusicViewModel3 = this.f184374e;
        if (editMusicViewModel3 == null) {
            C89219l.m154710a("musicViewModel");
        }
        selectNonNullSubscribe(editMusicViewModel3, C82453f.f184404a, new C20370ah(), new C82442k(this));
        EditMusicViewModel editMusicViewModel4 = this.f184374e;
        if (editMusicViewModel4 == null) {
            C89219l.m154710a("musicViewModel");
        }
        selectNonNullSubscribe(editMusicViewModel4, C82454g.f184405a, new C20370ah(), new C82443l(this));
        mo127549b().f163037s = new C82444m(this);
        mo127549b().f163036r = new C82445n(this);
        mo127549b().f163028j = new C82446o(this);
        mo127549b().f163023e = new C82447p(this);
        mo127549b().f163026h = new C82448q(this);
        mo127549b().mo114975a(new C82449r(this));
        View$OnClickListenerC72712e b2 = mo127549b();
        C82450s sVar = new C82450s(this);
        C89219l.m154721d(sVar, "");
        b2.f163041w = sVar;
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final <VM1 extends JediViewModel<S1>, S1 extends AbstractC20368af, R> R withState(VM1 vm1, AbstractC89172b<? super S1, ? extends R> bVar) {
        C89219l.m154721d(vm1, "");
        C89219l.m154721d(bVar, "");
        return (R) AbstractC20382b.C20383a.m38593a(this, vm1, bVar);
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.music.c$j */
    static final class C82441j extends AbstractC89220m implements AbstractC89183m<AbstractC20382b, Integer, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C82431c f184392a;

        static {
            Covode.recordClassIndex(96281);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C82441j(C82431c cVar) {
            super(2);
            this.f184392a = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20382b bVar, Integer num) {
            num.intValue();
            C89219l.m154721d(bVar, "");
            this.f184392a.mo127549b();
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.music.c$k */
    static final class C82442k extends AbstractC89220m implements AbstractC89183m<AbstractC20382b, C69905c, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C82431c f184393a;

        static {
            Covode.recordClassIndex(96282);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C82442k(C82431c cVar) {
            super(2);
            this.f184393a = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20382b bVar, C69905c cVar) {
            C69905c cVar2 = cVar;
            C89219l.m154721d(bVar, "");
            C89219l.m154721d(cVar2, "");
            this.f184393a.mo127549b().f163039u = cVar2;
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.music.c$l */
    static final class C82443l extends AbstractC89220m implements AbstractC89183m<AbstractC20382b, C20521k, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C82431c f184394a;

        static {
            Covode.recordClassIndex(96283);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C82443l(C82431c cVar) {
            super(2);
            this.f184394a = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20382b bVar, C20521k kVar) {
            C20521k kVar2 = kVar;
            C89219l.m154721d(bVar, "");
            C89219l.m154721d(kVar2, "");
            this.f184394a.f184371b = kVar2.f48283b.booleanValue();
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.music.c$i */
    static final class C82440i extends AbstractC89220m implements AbstractC89183m<AbstractC20382b, Boolean, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C82431c f184391a;

        static {
            Covode.recordClassIndex(96280);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C82440i(C82431c cVar) {
            super(2);
            this.f184391a = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20382b bVar, Boolean bool) {
            boolean booleanValue = bool.booleanValue();
            C89219l.m154721d(bVar, "");
            this.f184391a.mo127549b().f163027i = booleanValue;
            AbstractC63154aa.AbstractC63159d dVar = this.f184391a.mo127549b().f163024f;
            if (dVar != null) {
                dVar.mo101582a(booleanValue);
            }
            return C89391z.f203057a;
        }
    }

    @Override // com.bytedance.scene.AbstractC22219j
    /* renamed from: a */
    public final View mo22702a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C89219l.m154721d(layoutInflater, "");
        C89219l.m154721d(viewGroup, "");
        View$OnClickListenerC72712e b = mo127549b();
        Activity activity = this.f52549m;
        Objects.requireNonNull(activity, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
        b.mo114974a((ActivityC0218d) activity);
        View$OnClickListenerC72712e b2 = mo127549b();
        Activity activity2 = this.f52549m;
        if (!(activity2 instanceof AbstractC84919c)) {
            activity2 = null;
        }
        b2.f163021c = (AbstractC84919c) activity2;
        View$OnClickListenerC72712e b3 = mo127549b();
        View a = C1764a.m5927a(layoutInflater, R.layout.as8, viewGroup, false);
        Objects.requireNonNull(a, "null cannot be cast to non-null type android.widget.FrameLayout");
        b3.f163020b = (FrameLayout) a;
        FrameLayout frameLayout = mo127549b().f163020b;
        if (frameLayout == null) {
            C89219l.m154715b();
        }
        return frameLayout;
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
