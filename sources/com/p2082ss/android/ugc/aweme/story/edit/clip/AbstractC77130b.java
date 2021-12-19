package com.p2082ss.android.ugc.aweme.story.edit.clip;

import androidx.lifecycle.AbstractC1204m;
import com.bytedance.als.AbstractC2547b;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.p1559o.AbstractC21566a;
import com.bytedance.p1559o.C21582f;
import com.bytedance.p1559o.p1561b.C21572a;
import com.bytedance.ui_component.UiState;
import com.p2082ss.android.ugc.aweme.story.edit.clip.impl.AbstractC77135b;
import com.p2082ss.android.ugc.aweme.story.edit.clip.impl.VEEditClip;
import com.p2082ss.android.ugc.aweme.story.edit.clip.impl.VEEditClipCluster;
import com.p2082ss.android.ugc.aweme.story.edit.clip.p4042a.AbstractC77125f;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89232y;
import p4600h.p4616h.AbstractC89248d;
import p4600h.p4620k.AbstractC89286i;

/* renamed from: com.ss.android.ugc.aweme.story.edit.clip.b */
public abstract class AbstractC77130b<T extends JediViewModel<? extends UiState> & AbstractC1204m & AbstractC2547b> extends AbstractC77125f<T, VEEditClip, VEEditClipCluster> implements AbstractC21566a, AbstractC77135b {

    /* renamed from: e */
    static final /* synthetic */ AbstractC89286i[] f172975e = {new C89232y(AbstractC77130b.class, "clipCluster", "getClipCluster()Lcom/ss/android/ugc/aweme/story/edit/clip/impl/VEEditClipCluster;", 0)};

    /* renamed from: a */
    private final AbstractC89248d f172976a = C21572a.m40504a(getDiContainer(), VEEditClipCluster.class);

    /* renamed from: b */
    private final C21582f f172977b;

    static {
        Covode.recordClassIndex(90133);
    }

    /* renamed from: f */
    public VEEditClipCluster cF_() {
        return (VEEditClipCluster) this.f172976a.mo23374a(this, f172975e[0]);
    }

    @Override // com.bytedance.p1559o.AbstractC21566a
    public C21582f getDiContainer() {
        return this.f172977b;
    }

    public AbstractC77130b(C21582f fVar) {
        C89219l.m154721d(fVar, "");
        this.f172977b = fVar;
    }
}
