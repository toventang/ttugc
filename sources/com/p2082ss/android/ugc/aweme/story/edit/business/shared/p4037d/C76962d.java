package com.p2082ss.android.ugc.aweme.story.edit.business.shared.p4037d;

import com.bytedance.als.AbstractC2562j;
import com.bytedance.covode.number.Covode;
import com.bytedance.p1559o.AbstractC21566a;
import com.bytedance.p1559o.C21582f;
import com.bytedance.p1559o.p1561b.C21572a;
import com.bytedance.scene.group.AbstractC22186b;
import com.p2082ss.android.ugc.aweme.story.edit.model.StoryEditModel;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89232y;
import p4600h.p4616h.AbstractC89248d;
import p4600h.p4620k.AbstractC89286i;

/* renamed from: com.ss.android.ugc.aweme.story.edit.business.shared.d.d */
public final class C76962d extends AbstractC2562j<AbstractC76961c> implements AbstractC21566a, AbstractC76961c {

    /* renamed from: a */
    static final /* synthetic */ AbstractC89286i[] f172676a = {new C89232y(C76962d.class, "editModel", "getEditModel()Lcom/ss/android/ugc/aweme/story/edit/model/StoryEditModel;", 0)};

    /* renamed from: b */
    public final AbstractC76961c f172677b = this;

    /* renamed from: c */
    public C76963e f172678c;

    /* renamed from: d */
    private final AbstractC89248d f172679d = C21572a.m40504a(getDiContainer(), StoryEditModel.class);

    /* renamed from: e */
    private final C21582f f172680e;

    /* renamed from: f */
    private final AbstractC22186b f172681f;

    /* renamed from: g */
    private final int f172682g = R.id.a6m;

    static {
        Covode.recordClassIndex(89958);
    }

    /* Return type fixed from 'com.bytedance.als.b' to match base method */
    @Override // com.bytedance.als.AbstractC2562j
    public final /* bridge */ /* synthetic */ AbstractC76961c getApiComponent() {
        return this.f172677b;
    }

    @Override // com.bytedance.p1559o.AbstractC21566a
    public final C21582f getDiContainer() {
        return this.f172680e;
    }

    @Override // com.bytedance.als.AbstractC2562j
    public final void onCreate() {
        super.onCreate();
        if (((StoryEditModel) this.f172679d.mo23374a(this, f172676a[0])).getClips().size() > 1) {
            C76963e eVar = new C76963e(getDiContainer());
            this.f172678c = eVar;
            this.f172681f.mo36387a(this.f172682g, eVar, "StoryClipNavigateScene");
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.story.edit.business.shared.p4037d.AbstractC76961c
    /* renamed from: a */
    public final void mo120515a(boolean z) {
        if (this.f172678c != null) {
            if (z) {
                AbstractC22186b bVar = this.f172681f;
                C76963e eVar = this.f172678c;
                if (eVar == null) {
                    C89219l.m154710a("scene");
                }
                if (!bVar.mo36422g(eVar)) {
                    AbstractC22186b bVar2 = this.f172681f;
                    C76963e eVar2 = this.f172678c;
                    if (eVar2 == null) {
                        C89219l.m154710a("scene");
                    }
                    bVar2.mo36417e(eVar2);
                    return;
                }
                return;
            }
            AbstractC22186b bVar3 = this.f172681f;
            C76963e eVar3 = this.f172678c;
            if (eVar3 == null) {
                C89219l.m154710a("scene");
            }
            if (bVar3.mo36422g(eVar3)) {
                AbstractC22186b bVar4 = this.f172681f;
                C76963e eVar4 = this.f172678c;
                if (eVar4 == null) {
                    C89219l.m154710a("scene");
                }
                bVar4.mo36413d(eVar4);
            }
        }
    }

    public C76962d(C21582f fVar, AbstractC22186b bVar) {
        C89219l.m154721d(fVar, "");
        C89219l.m154721d(bVar, "");
        this.f172680e = fVar;
        this.f172681f = bVar;
    }
}
