package com.p2082ss.android.ugc.aweme.story.edit.business.shared;

import com.bytedance.als.AbstractC2547b;
import com.bytedance.covode.number.Covode;
import com.bytedance.p1559o.C21582f;
import com.bytedance.p1559o.p1561b.C21572a;
import com.bytedance.scene.group.AbstractC22186b;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p2082ss.android.ugc.aweme.story.edit.clip.AbstractC77116a;
import com.p2082ss.android.ugc.aweme.story.edit.clip.impl.VEEditClip;
import com.p2082ss.android.ugc.trill.R;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89232y;
import p4600h.p4616h.AbstractC89248d;
import p4600h.p4620k.AbstractC89286i;

/* renamed from: com.ss.android.ugc.aweme.story.edit.business.shared.b */
public final class C76853b extends AbstractC77116a<AbstractC76841a> implements AbstractC76841a {

    /* renamed from: a */
    static final /* synthetic */ AbstractC89286i[] f172474a = {new C89232y(C76853b.class, "videoPublishEditModel", "getVideoPublishEditModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0)};

    /* renamed from: b */
    public final AbstractC76841a f172475b = this;

    /* renamed from: c */
    private final AbstractC89248d f172476c = C21572a.m40504a(getDiContainer(), VideoPublishEditModel.class);

    /* renamed from: d */
    private final AbstractC89244h f172477d;

    /* renamed from: f */
    private final AbstractC22186b f172478f;

    /* renamed from: g */
    private final int f172479g = R.id.dzb;

    static {
        Covode.recordClassIndex(89849);
    }

    @Override // com.bytedance.als.AbstractC2562j
    public final /* bridge */ /* synthetic */ AbstractC2547b getApiComponent() {
        return this.f172475b;
    }

    /* renamed from: com.ss.android.ugc.aweme.story.edit.business.shared.b$a */
    static final class C76854a extends AbstractC89220m implements AbstractC89171a<C76873c> {

        /* renamed from: a */
        final /* synthetic */ C21582f f172480a;

        static {
            Covode.recordClassIndex(89850);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C76854a(C21582f fVar) {
            super(0);
            this.f172480a = fVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C76873c invoke() {
            return new C76873c(this.f172480a);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.story.edit.clip.p4042a.AbstractC77121d, com.bytedance.als.AbstractC2562j
    public final void onCreate() {
        super.onCreate();
        this.f172478f.mo36387a(this.f172479g, (C76873c) this.f172477d.getValue(), "StorySharedClipEditRootScene");
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.ss.android.ugc.aweme.story.edit.clip.a.g] */
    @Override // com.p2082ss.android.ugc.aweme.story.edit.clip.p4042a.AbstractC77121d
    /* renamed from: a */
    public final /* synthetic */ void mo120452a(VEEditClip vEEditClip) {
        VEEditClip vEEditClip2 = vEEditClip;
        C89219l.m154721d(vEEditClip2, "");
        super.mo120452a(vEEditClip2);
        ((VideoPublishEditModel) this.f172476c.mo23374a(this, f172474a[0])).setPreviewInfo(vEEditClip2.f172984g.getPreviewMediaInfo());
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C76853b(C21582f fVar, AbstractC22186b bVar) {
        super(fVar);
        C89219l.m154721d(fVar, "");
        C89219l.m154721d(bVar, "");
        this.f172478f = bVar;
        this.f172477d = C89250i.m154773a((AbstractC89171a) new C76854a(fVar));
    }
}
