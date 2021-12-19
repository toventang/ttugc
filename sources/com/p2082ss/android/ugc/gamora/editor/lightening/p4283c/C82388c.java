package com.p2082ss.android.ugc.gamora.editor.lightening.p4283c;

import androidx.fragment.app.ActivityC0945e;
import com.bytedance.als.AbstractC2562j;
import com.bytedance.covode.number.Covode;
import com.bytedance.p1559o.AbstractC21566a;
import com.bytedance.p1559o.C21582f;
import com.bytedance.p1559o.p1561b.C21572a;
import com.p2082ss.android.ugc.aweme.draft.model.DraftSaveResult;
import com.p2082ss.android.ugc.aweme.edit.TTStoryUploadModel;
import com.p2082ss.android.ugc.aweme.initializer.AVServiceProxyImpl;
import com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63269z;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.aweme.services.IAVServiceProxy;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p2082ss.android.ugc.gamora.editor.AbstractC82036ac;
import com.p2082ss.android.ugc.gamora.editor.lightening.C82306a;
import com.p2082ss.android.ugc.gamora.editor.p4276c.AbstractC82074b;
import com.p2082ss.android.ugc.gamora.editor.p4276c.C82080c;
import com.p2082ss.android.ugc.gamora.editor.p4278e.AbstractC82155c;
import p4600h.C89391z;
import p4600h.p4601a.C89064i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89232y;
import p4600h.p4616h.AbstractC89248d;
import p4600h.p4620k.AbstractC89286i;

/* renamed from: com.ss.android.ugc.gamora.editor.lightening.c.c */
public final class C82388c extends AbstractC2562j<AbstractC82387b> implements AbstractC21566a, AbstractC82387b {

    /* renamed from: a */
    static final /* synthetic */ AbstractC89286i[] f184285a = {new C89232y(C82388c.class, "activity", "getActivity()Landroidx/fragment/app/FragmentActivity;", 0), new C89232y(C82388c.class, "model", "getModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0), new C89232y(C82388c.class, "musicController", "getMusicController()Lcom/ss/android/ugc/gamora/editor/IEditMusicController;", 0), new C89232y(C82388c.class, "editPreviewApi", "getEditPreviewApi()Lcom/ss/android/ugc/gamora/editor/preview/TiktokEditPreviewApi;", 0)};

    /* renamed from: b */
    public final AbstractC82387b f184286b = this;

    /* renamed from: c */
    private final AbstractC89248d f184287c = C21572a.m40504a(getDiContainer(), ActivityC0945e.class);

    /* renamed from: d */
    private final AbstractC89248d f184288d = C21572a.m40504a(getDiContainer(), VideoPublishEditModel.class);

    /* renamed from: e */
    private final AbstractC89248d f184289e = C21572a.m40504a(getDiContainer(), AbstractC82036ac.class);

    /* renamed from: f */
    private boolean f184290f;

    /* renamed from: g */
    private final AbstractC89248d f184291g = C21572a.m40504a(getDiContainer(), AbstractC82155c.class);

    /* renamed from: h */
    private final C21582f f184292h;

    static {
        Covode.recordClassIndex(96222);
    }

    /* renamed from: c */
    private final ActivityC0945e m142420c() {
        return (ActivityC0945e) this.f184287c.mo23374a(this, f184285a[0]);
    }

    /* renamed from: d */
    private final VideoPublishEditModel m142421d() {
        return (VideoPublishEditModel) this.f184288d.mo23374a(this, f184285a[1]);
    }

    /* renamed from: e */
    private final AbstractC82155c m142422e() {
        return (AbstractC82155c) this.f184291g.mo23374a(this, f184285a[3]);
    }

    /* Return type fixed from 'com.bytedance.als.b' to match base method */
    @Override // com.bytedance.als.AbstractC2562j
    public final /* bridge */ /* synthetic */ AbstractC82387b getApiComponent() {
        return this.f184286b;
    }

    @Override // com.bytedance.p1559o.AbstractC21566a
    public final C21582f getDiContainer() {
        return this.f184292h;
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.lightening.c.c$a */
    public static final class C82389a implements AbstractC63269z.AbstractC63270a {

        /* renamed from: a */
        final /* synthetic */ AbstractC89171a f184293a;

        static {
            Covode.recordClassIndex(96223);
        }

        @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63269z.AbstractC63270a
        /* renamed from: b */
        public final void mo59544b() {
        }

        @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63269z.AbstractC63270a
        /* renamed from: a */
        public final void mo59543a() {
            this.f184293a.invoke();
        }

        C82389a(AbstractC89171a aVar) {
            this.f184293a = aVar;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.lightening.c.c$b */
    static final class C82390b extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C82388c f184294a;

        static {
            Covode.recordClassIndex(96224);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C82390b(C82388c cVar) {
            super(0);
            this.f184294a = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            this.f184294a.mo127478b();
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.gamora.editor.lightening.c.c$e */
    public static final class C82393e extends AbstractC89220m implements AbstractC89171a<float[]> {

        /* renamed from: a */
        public static final C82393e f184297a = new C82393e();

        static {
            Covode.recordClassIndex(96227);
        }

        C82393e() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ float[] invoke() {
            int i;
            int i2;
            IAVServiceProxy createIAVServiceProxybyMonsterPlugin = AVServiceProxyImpl.createIAVServiceProxybyMonsterPlugin(false);
            C89219l.m154716b(createIAVServiceProxybyMonsterPlugin, "");
            int[] f = createIAVServiceProxybyMonsterPlugin.getStoryService().mo93872f();
            if (C89064i.m154474a(f) >= 0) {
                i = f[0];
            } else {
                i = 0;
            }
            float f2 = (float) i;
            if (1 <= C89064i.m154474a(f)) {
                i2 = f[1];
            } else {
                i2 = 1;
            }
            return new float[]{f2, (float) i2};
        }
    }

    /* renamed from: b */
    public final void mo127478b() {
        C82386a.m142418a(m142421d());
        m142421d().ttStoryUploadModel = new TTStoryUploadModel(0, 0, 1);
        C82080c.m142102a(new AbstractC82074b.C82076b(m142421d(), new C82391c(this), new C82392d(this)));
    }

    @Override // com.p2082ss.android.ugc.gamora.editor.lightening.p4283c.AbstractC82387b
    /* renamed from: a */
    public final void mo127476a() {
        if (C82306a.m142360b(m142421d()) && !this.f184290f) {
            this.f184290f = true;
            if (!C63244g.m114602a().mo73255A().mo93903b()) {
                C82390b bVar = new C82390b(this);
                C63244g.m114602a().mo73287o().mo104790j().mo104829a(m142420c(), "Login");
                C63244g.m114602a().mo73255A().mo93897a(m142420c(), "video_edit_page", "click_shoot", null, new C82389a(bVar));
                return;
            }
            mo127478b();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.gamora.editor.lightening.c.c$c */
    public static final class C82391c extends AbstractC89220m implements AbstractC89172b<String, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C82388c f184295a;

        static {
            Covode.recordClassIndex(96225);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C82391c(C82388c cVar) {
            super(1);
            this.f184295a = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(String str) {
            String str2 = str;
            C89219l.m154721d(str2, "");
            this.f184295a.mo127477a(str2);
            return C89391z.f203057a;
        }
    }

    public C82388c(C21582f fVar) {
        C89219l.m154721d(fVar, "");
        this.f184292h = fVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x00b4, code lost:
        if (r0.getStoryService().mo93868b() == false) goto L_0x004f;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo127477a(java.lang.String r9) {
        /*
        // Method dump skipped, instructions count: 183
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.gamora.editor.lightening.p4283c.C82388c.mo127477a(java.lang.String):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.gamora.editor.lightening.c.c$d */
    public static final class C82392d extends AbstractC89220m implements AbstractC89183m<String, DraftSaveResult, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C82388c f184296a;

        static {
            Covode.recordClassIndex(96226);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C82392d(C82388c cVar) {
            super(2);
            this.f184296a = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(String str, DraftSaveResult draftSaveResult) {
            String str2 = str;
            C89219l.m154721d(str2, "");
            C89219l.m154721d(draftSaveResult, "");
            this.f184296a.mo127477a(str2);
            return C89391z.f203057a;
        }
    }
}
