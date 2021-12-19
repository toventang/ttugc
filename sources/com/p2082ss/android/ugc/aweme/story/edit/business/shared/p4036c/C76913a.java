package com.p2082ss.android.ugc.aweme.story.edit.business.shared.p4036c;

import com.bytedance.covode.number.Covode;
import com.bytedance.p1559o.AbstractC21566a;
import com.bytedance.p1559o.C21582f;
import com.bytedance.p1559o.p1561b.C21572a;
import com.bytedance.scene.group.AbstractC22186b;
import com.p2082ss.android.ugc.asve.editor.AbstractC31071f;
import com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63154aa;
import com.p2082ss.android.ugc.aweme.shortvideo.C69905c;
import com.p2082ss.android.ugc.aweme.shortvideo.C70005cr;
import com.p2082ss.android.ugc.aweme.shortvideo.C70625d;
import com.p2082ss.android.ugc.aweme.shortvideo.cutmusic.C70612k;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.C70968bl;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.C70976bp;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p2082ss.android.ugc.aweme.shortvideo.p3853q.View$OnClickListenerC72712e;
import com.p2082ss.android.ugc.aweme.story.edit.C76740a;
import com.p2082ss.android.ugc.aweme.story.edit.business.shared.p4036c.C76918b;
import com.p2082ss.android.ugc.aweme.story.edit.clip.AbstractC77130b;
import com.p2082ss.android.ugc.aweme.story.edit.clip.impl.C77134a;
import com.p2082ss.android.ugc.aweme.story.edit.clip.impl.VEEditClip;
import com.p2082ss.android.ugc.aweme.story.edit.clip.p4042a.C77118b;
import com.p2082ss.android.ugc.aweme.story.edit.model.StoryEditClipModel;
import com.p2082ss.android.ugc.aweme.story.edit.model.StoryEditMusicModel;
import com.p2082ss.android.ugc.gamora.editor.cutmusic.AbstractC82104a;
import com.p2082ss.android.ugc.gamora.editor.music.EditMusicViewModel;
import com.p2082ss.android.ugc.trill.R;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.EnumC89331m;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89232y;
import p4600h.p4611f.p4613b.C89233z;
import p4600h.p4616h.AbstractC89248d;
import p4600h.p4620k.AbstractC89286i;

/* renamed from: com.ss.android.ugc.aweme.story.edit.business.shared.c.a */
public final class C76913a extends AbstractC77130b<EditMusicViewModel> {

    /* renamed from: a */
    static final /* synthetic */ AbstractC89286i[] f172585a = {new C89232y(C76913a.class, "model", "getModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0)};

    /* renamed from: b */
    final AbstractC22186b f172586b;

    /* renamed from: c */
    public final int f172587c = R.id.c7m;

    /* renamed from: d */
    private final AbstractC89248d f172588d = C21572a.m40504a(getDiContainer(), VideoPublishEditModel.class);

    /* renamed from: f */
    private final AbstractC89244h f172589f = C89250i.m154774a(EnumC89331m.NONE, new C76914a(this));

    /* renamed from: k */
    private final AbstractC89244h f172590k;

    /* renamed from: l */
    private final AbstractC89171a<EditMusicViewModel> f172591l;

    static {
        Covode.recordClassIndex(89909);
    }

    /* renamed from: g */
    private final C76918b m134516g() {
        return (C76918b) this.f172590k.getValue();
    }

    /* renamed from: a */
    public final AbstractC82104a mo120489a() {
        return (AbstractC82104a) this.f172589f.getValue();
    }

    @Override // com.bytedance.ui_component.AbstractC23520b
    /* renamed from: b */
    public final AbstractC89171a<EditMusicViewModel> mo23031b() {
        return this.f172591l;
    }

    @Override // com.bytedance.ui_component.AbstractC23520b
    /* renamed from: e */
    public final AbstractC22186b mo23034e() {
        return this.f172586b;
    }

    /* renamed from: com.ss.android.ugc.aweme.story.edit.business.shared.c.a$d */
    static final class C76917d extends AbstractC89220m implements AbstractC89171a<EditMusicViewModel> {

        /* renamed from: a */
        public static final C76917d f172598a = new C76917d();

        static {
            Covode.recordClassIndex(89913);
        }

        C76917d() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ EditMusicViewModel invoke() {
            return new EditMusicViewModel();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.edit.business.shared.c.a$a */
    public static final class C76914a extends AbstractC89220m implements AbstractC89171a<AbstractC82104a> {

        /* renamed from: a */
        final /* synthetic */ AbstractC21566a f172592a;

        static {
            Covode.recordClassIndex(89910);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C76914a(AbstractC21566a aVar) {
            super(0);
            this.f172592a = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.bytedance.als.b, com.ss.android.ugc.gamora.editor.cutmusic.a] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.p2082ss.android.ugc.gamora.editor.cutmusic.AbstractC82104a invoke() {
            /*
                r3 = this;
                com.bytedance.o.a r0 = r3.f172592a
                com.bytedance.o.f r2 = r0.getDiContainer()
                java.lang.Class<com.ss.android.ugc.gamora.editor.cutmusic.a> r1 = com.p2082ss.android.ugc.gamora.editor.cutmusic.AbstractC82104a.class
                r0 = 0
                java.lang.Object r0 = r2.mo35249a(r1, r0)
                com.bytedance.als.b r0 = (com.bytedance.als.AbstractC2547b) r0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.story.edit.business.shared.p4036c.C76913a.C76914a.invoke():com.bytedance.als.b");
        }
    }

    @Override // com.bytedance.ui_component.AbstractC23520b
    /* renamed from: d */
    public final void mo23033d() {
        m134516g().mo120491C().mo114978d();
    }

    /* renamed from: com.ss.android.ugc.aweme.story.edit.business.shared.c.a$c */
    static final class C76916c extends AbstractC89220m implements AbstractC89171a<C76918b> {

        /* renamed from: a */
        final /* synthetic */ C76913a f172596a;

        /* renamed from: b */
        final /* synthetic */ C21582f f172597b;

        static {
            Covode.recordClassIndex(89912);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C76916c(C76913a aVar, C21582f fVar) {
            super(0);
            this.f172596a = aVar;
            this.f172597b = fVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C76918b invoke() {
            C76918b bVar = new C76918b(this.f172597b);
            this.f172596a.f172586b.mo36387a(this.f172596a.f172587c, bVar, "MusicScene");
            return bVar;
        }
    }

    @Override // com.bytedance.ui_component.AbstractC23520b
    /* renamed from: c */
    public final void mo23032c() {
        AbstractC31071f fVar;
        C76918b g = m134516g();
        View$OnClickListenerC72712e C = g.mo120491C();
        VEEditClip vEEditClip = (VEEditClip) C77118b.m134706a(g.cF_());
        if (vEEditClip != null) {
            fVar = C77134a.m134735a(vEEditClip);
        } else {
            fVar = null;
        }
        C.f163038t = fVar;
        g.mo120491C().mo114977c();
        g.mo120494G().mo127539a(C70976bp.m125317m(g.mo120497J()));
        g.mo120498K();
        g.mo120491C().mo114973a(1, true);
        AbstractC63154aa.AbstractC63159d dVar = g.mo120491C().f163024f;
        if (dVar != null) {
            dVar.mo101590k();
        }
        C89233z.C89234a aVar = new C89233z.C89234a();
        aVar.element = false;
        g.withState(g.mo120494G(), new C76918b.C76937q(aVar));
        if (aVar.element) {
            C70968bl.m125276h(g.mo120497J());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.edit.business.shared.c.a$b */
    public static final class C76915b implements C70612k.AbstractC70613a {

        /* renamed from: a */
        final /* synthetic */ C76913a f172593a;

        /* renamed from: b */
        final /* synthetic */ C69905c f172594b;

        /* renamed from: c */
        final /* synthetic */ int f172595c;

        static {
            Covode.recordClassIndex(89911);
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.cutmusic.C70612k.AbstractC70613a
        /* renamed from: a */
        public final void mo87581a(C70625d dVar) {
            this.f172593a.mo120489a().mo127332a(dVar, this.f172594b.duration, this.f172595c);
        }

        C76915b(C76913a aVar, C69905c cVar, int i) {
            this.f172593a = aVar;
            this.f172594b = cVar;
            this.f172595c = i;
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.ss.android.ugc.aweme.story.edit.clip.a.g] */
    @Override // com.p2082ss.android.ugc.aweme.story.edit.clip.p4042a.AbstractC77125f
    /* renamed from: a */
    public final /* synthetic */ void mo120490a(VEEditClip vEEditClip) {
        C69905c cVar;
        StoryEditMusicModel editMusicModel;
        VEEditClip vEEditClip2 = vEEditClip;
        C89219l.m154721d(vEEditClip2, "");
        super.mo120490a(vEEditClip2);
        StoryEditClipModel d = C77134a.m134739d(this);
        if (d != null) {
            C76740a.m134324c(d, (VideoPublishEditModel) this.f172588d.mo23374a(this, f172585a[0]));
        }
        C70005cr a = C70005cr.m123611a();
        StoryEditClipModel d2 = C77134a.m134739d(this);
        if (d2 == null || (editMusicModel = d2.getEditMusicModel()) == null) {
            cVar = null;
        } else {
            cVar = editMusicModel.getCurrentMusic();
        }
        a.mo70083a(cVar);
        mo38334j().mo33689c(EditMusicViewModel.C82423g.f184358a);
        C69905c currentMusic = vEEditClip2.f172984g.getEditMusicModel().getCurrentMusic();
        if (currentMusic != null) {
            int musicStart = vEEditClip2.f172984g.getEditMusicModel().getMusicStart();
            if (currentMusic.getMusicWaveData() != null) {
                C70625d a2 = C70612k.m124744a(currentMusic);
                AbstractC82104a a3 = mo120489a();
                if (a2 == null) {
                    C89219l.m154715b();
                }
                a3.mo127332a(a2, currentMusic.duration, musicStart);
            } else if (currentMusic.path != null) {
                C70612k.m124747a(currentMusic.path, new C76915b(this, currentMusic, musicStart));
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C76913a(C21582f fVar, AbstractC22186b bVar) {
        super(fVar);
        C89219l.m154721d(fVar, "");
        C89219l.m154721d(bVar, "");
        this.f172586b = bVar;
        this.f172590k = C89250i.m154773a((AbstractC89171a) new C76916c(this, fVar));
        this.f172591l = C76917d.f172598a;
    }
}
