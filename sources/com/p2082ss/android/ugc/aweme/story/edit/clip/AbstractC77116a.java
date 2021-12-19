package com.p2082ss.android.ugc.aweme.story.edit.clip;

import com.bytedance.als.AbstractC2547b;
import com.bytedance.covode.number.Covode;
import com.bytedance.p1559o.AbstractC21566a;
import com.bytedance.p1559o.C21582f;
import com.bytedance.p1559o.p1561b.C21572a;
import com.p2082ss.android.ugc.aweme.story.edit.clip.impl.AbstractC77135b;
import com.p2082ss.android.ugc.aweme.story.edit.clip.impl.VEEditClip;
import com.p2082ss.android.ugc.aweme.story.edit.clip.impl.VEEditClipCluster;
import com.p2082ss.android.ugc.aweme.story.edit.clip.p4042a.AbstractC77121d;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89232y;
import p4600h.p4616h.AbstractC89248d;
import p4600h.p4620k.AbstractC89286i;

/* renamed from: com.ss.android.ugc.aweme.story.edit.clip.a */
public abstract class AbstractC77116a<Api extends AbstractC2547b> extends AbstractC77121d<Api, VEEditClip, VEEditClipCluster> implements AbstractC21566a, AbstractC77135b {

    /* renamed from: e */
    static final /* synthetic */ AbstractC89286i[] f172965e = {new C89232y(AbstractC77116a.class, "clipCluster", "getClipCluster()Lcom/ss/android/ugc/aweme/story/edit/clip/impl/VEEditClipCluster;", 0)};

    /* renamed from: a */
    private final AbstractC89248d f172966a = C21572a.m40504a(getDiContainer(), VEEditClipCluster.class);

    /* renamed from: b */
    private final C21582f f172967b;

    static {
        Covode.recordClassIndex(90119);
    }

    /* renamed from: cE_ */
    public final VEEditClipCluster cF_() {
        return (VEEditClipCluster) this.f172966a.mo23374a(this, f172965e[0]);
    }

    @Override // com.bytedance.p1559o.AbstractC21566a
    public C21582f getDiContainer() {
        return this.f172967b;
    }

    public AbstractC77116a(C21582f fVar) {
        C89219l.m154721d(fVar, "");
        this.f172967b = fVar;
    }
}
