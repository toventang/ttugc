package com.p2082ss.android.ugc.aweme.story.edit.p4029b;

import com.bytedance.covode.number.Covode;
import com.bytedance.p1559o.AbstractC21566a;
import com.bytedance.p1559o.C21582f;
import com.p2082ss.android.ugc.aweme.story.edit.model.StoryEditClipModel;
import com.p2082ss.android.ugc.aweme.story.edit.model.StoryEditModel;
import dmt.p4542av.video.p4545b.AbstractC88181j;
import dmt.p4542av.video.p4545b.C88229m;
import dmt.p4542av.video.p4545b.C88238s;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.story.edit.b.d */
public final class C76758d implements AbstractC21566a, AbstractC89183m<StoryEditModel, StoryEditClipModel, AbstractC88181j> {

    /* renamed from: a */
    private final C21582f f172280a;

    /* renamed from: b */
    private final AbstractC89172b<AbstractC88181j, C89391z> f172281b;

    static {
        Covode.recordClassIndex(89754);
    }

    @Override // com.bytedance.p1559o.AbstractC21566a
    public final C21582f getDiContainer() {
        return this.f172280a;
    }

    /* renamed from: com.ss.android.ugc.aweme.story.edit.b.d$a */
    static final class C76759a extends AbstractC89220m implements AbstractC89171a<Boolean> {

        /* renamed from: a */
        public static final C76759a f172282a = new C76759a();

        static {
            Covode.recordClassIndex(89755);
        }

        C76759a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Boolean invoke() {
            return true;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: h.f.a.b<? super dmt.av.video.b.j, h.z> */
    /* JADX WARN: Multi-variable type inference failed */
    public C76758d(C21582f fVar, AbstractC89172b<? super AbstractC88181j, C89391z> bVar) {
        C89219l.m154721d(fVar, "");
        C89219l.m154721d(bVar, "");
        this.f172280a = fVar;
        this.f172281b = bVar;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // p4600h.p4611f.p4612a.AbstractC89183m
    public final /* synthetic */ AbstractC88181j invoke(StoryEditModel storyEditModel, StoryEditClipModel storyEditClipModel) {
        StoryEditClipModel storyEditClipModel2 = storyEditClipModel;
        C89219l.m154721d(storyEditModel, "");
        C89219l.m154721d(storyEditClipModel2, "");
        C88238s sVar = new C88238s();
        sVar.f200274b = 3;
        sVar.mo142772a(C76759a.f172282a);
        AbstractC88181j a = C88229m.m153326a(storyEditClipModel2.getVideoEditorType(), sVar);
        this.f172281b.invoke(a);
        return a;
    }
}
