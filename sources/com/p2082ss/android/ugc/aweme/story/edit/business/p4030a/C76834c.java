package com.p2082ss.android.ugc.aweme.story.edit.business.p4030a;

import com.bytedance.als.AbstractC2547b;
import com.bytedance.covode.number.Covode;
import com.bytedance.p1559o.C21582f;
import com.bytedance.p1559o.p1561b.C21572a;
import com.bytedance.scene.AbstractC22219j;
import com.bytedance.scene.group.AbstractC22186b;
import com.bytedance.scene.ktx.C22226a;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p2082ss.android.ugc.aweme.story.edit.C76740a;
import com.p2082ss.android.ugc.aweme.story.edit.clip.AbstractC77116a;
import com.p2082ss.android.ugc.aweme.story.edit.clip.impl.VEEditClip;
import com.p2082ss.android.ugc.gamora.editor.sticker.core.AbstractC82610a;
import com.p2082ss.android.ugc.trill.R;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89232y;
import p4600h.p4616h.AbstractC89248d;
import p4600h.p4620k.AbstractC89286i;

/* renamed from: com.ss.android.ugc.aweme.story.edit.business.a.c */
public final class C76834c extends AbstractC77116a<AbstractC76833b> implements AbstractC76833b {

    /* renamed from: a */
    static final /* synthetic */ AbstractC89286i[] f172439a = {new C89232y(C76834c.class, "editModel", "getEditModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0)};

    /* renamed from: b */
    public final AbstractC76833b f172440b = this;

    /* renamed from: c */
    final AbstractC89248d f172441c = C21572a.m40504a(getDiContainer(), VideoPublishEditModel.class);

    /* renamed from: d */
    private C76836d f172442d;

    /* renamed from: f */
    private final AbstractC22186b f172443f;

    /* renamed from: g */
    private final int f172444g = R.id.bqf;

    static {
        Covode.recordClassIndex(89830);
    }

    @Override // com.bytedance.als.AbstractC2562j
    public final /* bridge */ /* synthetic */ AbstractC2547b getApiComponent() {
        return this.f172440b;
    }

    /* renamed from: com.ss.android.ugc.aweme.story.edit.business.a.c$a */
    static final class C76835a extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C76834c f172445a;

        /* renamed from: b */
        final /* synthetic */ VEEditClip f172446b;

        static {
            Covode.recordClassIndex(89831);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C76835a(C76834c cVar, VEEditClip vEEditClip) {
            super(0);
            this.f172445a = cVar;
            this.f172446b = vEEditClip;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            C76834c cVar = this.f172445a;
            C76740a.m134322b((VideoPublishEditModel) cVar.f172441c.mo23374a(cVar, C76834c.f172439a[0]), this.f172446b.f172984g);
            this.f172445a.mo120637U();
            return C89391z.f203057a;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.story.edit.business.p4030a.AbstractC76833b
    /* renamed from: a */
    public final <T> T mo120461a(Class<T> cls) {
        C89219l.m154721d(cls, "");
        C76836d dVar = this.f172442d;
        if (dVar != null) {
            return (T) dVar.mo120463a(cls);
        }
        return null;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.ss.android.ugc.aweme.story.edit.clip.a.g] */
    @Override // com.p2082ss.android.ugc.aweme.story.edit.clip.p4042a.AbstractC77121d
    /* renamed from: b */
    public final /* synthetic */ void mo120462b(VEEditClip vEEditClip) {
        VEEditClip vEEditClip2 = vEEditClip;
        C89219l.m154721d(vEEditClip2, "");
        super.mo120462b(vEEditClip2);
        AbstractC82610a aVar = (AbstractC82610a) mo120461a(AbstractC82610a.class);
        if (aVar != null) {
            mo120638V();
            aVar.mo127678a(true, (AbstractC89171a<C89391z>) new C76835a(this, vEEditClip2));
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.ss.android.ugc.aweme.story.edit.clip.a.g] */
    @Override // com.p2082ss.android.ugc.aweme.story.edit.clip.p4042a.AbstractC77121d
    /* renamed from: a */
    public final /* synthetic */ void mo120452a(VEEditClip vEEditClip) {
        VEEditClip vEEditClip2 = vEEditClip;
        C89219l.m154721d(vEEditClip2, "");
        super.mo120452a(vEEditClip2);
        C76836d dVar = new C76836d(getDiContainer());
        this.f172442d = dVar;
        AbstractC22186b bVar = this.f172443f;
        int i = this.f172444g;
        C89219l.m154719c(bVar, "");
        C89219l.m154719c(dVar, "");
        C89219l.m154719c("StoryIsolateClipEditRootScene", "");
        C89219l.m154719c(bVar, "");
        C89219l.m154719c(dVar, "");
        C89219l.m154719c("StoryIsolateClipEditRootScene", "");
        AbstractC22219j a = bVar.mo36386a("StoryIsolateClipEditRootScene");
        if (!C89219l.m154714a(a, dVar)) {
            if (bVar.mo36421f(dVar)) {
                bVar.mo36400c(dVar);
            }
            if (a == null) {
                bVar.mo36395b(i, dVar, "StoryIsolateClipEditRootScene");
            } else if (bVar.mo36422g(a)) {
                bVar.mo36400c(a);
                bVar.mo36395b(i, dVar, "StoryIsolateClipEditRootScene");
            } else {
                bVar.mo36400c(a);
                C22226a.m41822a(bVar, i, dVar, "StoryIsolateClipEditRootScene");
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C76834c(C21582f fVar, AbstractC22186b bVar) {
        super(fVar);
        C89219l.m154721d(fVar, "");
        C89219l.m154721d(bVar, "");
        this.f172443f = bVar;
    }
}
