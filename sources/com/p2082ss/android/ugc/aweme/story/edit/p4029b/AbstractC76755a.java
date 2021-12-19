package com.p2082ss.android.ugc.aweme.story.edit.p4029b;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.AbstractC70977bq;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.model.C71413b;
import com.p2082ss.android.ugc.aweme.story.edit.model.C77148a;
import com.p2082ss.android.ugc.aweme.story.edit.model.StoryEditClipModel;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.story.edit.b.a */
public abstract class AbstractC76755a implements AbstractC70977bq {

    /* renamed from: a */
    public boolean f172273a;

    /* renamed from: b */
    public final StoryEditClipModel f172274b;

    static {
        Covode.recordClassIndex(89751);
    }

    /* renamed from: a */
    public static int m134346a(int i) {
        return ((i + 16) - 1) & -16;
    }

    public AbstractC76755a(StoryEditClipModel storyEditClipModel) {
        C89219l.m154721d(storyEditClipModel, "");
        this.f172274b = storyEditClipModel;
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.edit.AbstractC70977bq
    /* renamed from: a */
    public final int mo112107a(boolean z) {
        if (z) {
            return C77148a.m134755b(this.f172274b);
        }
        StoryEditClipModel storyEditClipModel = this.f172274b;
        C89219l.m154721d(storyEditClipModel, "");
        return C71413b.m126112a(storyEditClipModel.getPreviewMediaInfo(), storyEditClipModel.isFastImport());
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.edit.AbstractC70977bq
    /* renamed from: b */
    public final int mo112110b(boolean z) {
        if (z) {
            return C77148a.m134757c(this.f172274b);
        }
        StoryEditClipModel storyEditClipModel = this.f172274b;
        C89219l.m154721d(storyEditClipModel, "");
        return C71413b.m126122b(storyEditClipModel.getPreviewMediaInfo(), storyEditClipModel.isFastImport());
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.edit.AbstractC70977bq
    /* renamed from: a */
    public final void mo112108a(boolean z, boolean z2) {
        this.f172273a = z;
        this.f172274b.getCoverPublishModel().setNeedExpandCompiledSize(z);
        this.f172274b.setVideoCanvasWidth(mo112106a());
        this.f172274b.setVideoCanvasHeight(mo112109b());
        this.f172274b.setOutVideoWidth(mo112111c());
        this.f172274b.setOutVideoHeight(mo112112d());
    }
}
