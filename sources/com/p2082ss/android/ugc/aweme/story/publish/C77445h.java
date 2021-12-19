package com.p2082ss.android.ugc.aweme.story.publish;

import android.content.Context;
import android.graphics.Bitmap;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.services.story.IStoryPublishAnimateListener;
import com.p2082ss.android.ugc.aweme.services.story.IStoryPublishService;
import com.p2082ss.android.ugc.aweme.services.story.StoryCoverExtractConfig;
import com.p2082ss.android.ugc.aweme.shortvideo.publish.AbstractC72639k;
import com.p2082ss.android.ugc.aweme.shortvideo.publish.AbstractC72685x;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.story.publish.h */
public final class C77445h implements IStoryPublishService {

    /* renamed from: a */
    public static final C77445h f173768a = new C77445h();

    /* renamed from: b */
    private final /* synthetic */ IStoryPublishService f173769b;

    @Override // com.p2082ss.android.ugc.aweme.services.story.IStoryPublishService
    public final boolean addCallback(String str, AbstractC72639k kVar) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(kVar, "");
        return this.f173769b.addCallback(str, kVar);
    }

    @Override // com.p2082ss.android.ugc.aweme.services.story.IStoryPublishService
    public final void addPublishAnimateListener(IStoryPublishAnimateListener iStoryPublishAnimateListener) {
        C89219l.m154721d(iStoryPublishAnimateListener, "");
        this.f173769b.addPublishAnimateListener(iStoryPublishAnimateListener);
    }

    @Override // com.p2082ss.android.ugc.aweme.services.story.IStoryPublishService
    public final void getCover(String str, StoryCoverExtractConfig storyCoverExtractConfig, AbstractC89172b<? super Bitmap, C89391z> bVar) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(storyCoverExtractConfig, "");
        C89219l.m154721d(bVar, "");
        this.f173769b.getCover(str, storyCoverExtractConfig, bVar);
    }

    @Override // com.p2082ss.android.ugc.aweme.services.story.IStoryPublishService
    public final AbstractC72685x getState(String str) {
        C89219l.m154721d(str, "");
        return this.f173769b.getState(str);
    }

    @Override // com.p2082ss.android.ugc.aweme.services.story.IStoryPublishService
    public final boolean isPublishing(Context context) {
        C89219l.m154721d(context, "");
        return this.f173769b.isPublishing(context);
    }

    @Override // com.p2082ss.android.ugc.aweme.services.story.IStoryPublishService
    public final boolean isStoryPublishing() {
        return this.f173769b.isStoryPublishing();
    }

    @Override // com.p2082ss.android.ugc.aweme.services.story.IStoryPublishService
    public final boolean removeCallback(String str, AbstractC72639k kVar) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(kVar, "");
        return this.f173769b.removeCallback(str, kVar);
    }

    @Override // com.p2082ss.android.ugc.aweme.services.story.IStoryPublishService
    public final void removePublishAnimateListener(IStoryPublishAnimateListener iStoryPublishAnimateListener) {
        C89219l.m154721d(iStoryPublishAnimateListener, "");
        this.f173769b.removePublishAnimateListener(iStoryPublishAnimateListener);
    }

    @Override // com.p2082ss.android.ugc.aweme.services.story.IStoryPublishService
    public final void removePublishTask(String str) {
        C89219l.m154721d(str, "");
        this.f173769b.removePublishTask(str);
    }

    @Override // com.p2082ss.android.ugc.aweme.services.story.IStoryPublishService
    public final boolean retryPublish(String str) {
        C89219l.m154721d(str, "");
        return this.f173769b.retryPublish(str);
    }

    static {
        Covode.recordClassIndex(90478);
    }

    private C77445h() {
        IStoryPublishService a = StoryPublishServiceImpl.m135314a();
        C89219l.m154716b(a, "");
        this.f173769b = a;
    }
}
