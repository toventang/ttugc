package com.p2082ss.android.ugc.aweme.services.story;

import android.content.Context;
import android.graphics.Bitmap;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.shortvideo.publish.AbstractC72639k;
import com.p2082ss.android.ugc.aweme.shortvideo.publish.AbstractC72685x;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;

/* renamed from: com.ss.android.ugc.aweme.services.story.IStoryPublishService */
public interface IStoryPublishService {
    static {
        Covode.recordClassIndex(79986);
    }

    boolean addCallback(String str, AbstractC72639k kVar);

    void addPublishAnimateListener(IStoryPublishAnimateListener iStoryPublishAnimateListener);

    void getCover(String str, StoryCoverExtractConfig storyCoverExtractConfig, AbstractC89172b<? super Bitmap, C89391z> bVar);

    AbstractC72685x getState(String str);

    boolean isPublishing(Context context);

    boolean isStoryPublishing();

    boolean removeCallback(String str, AbstractC72639k kVar);

    void removePublishAnimateListener(IStoryPublishAnimateListener iStoryPublishAnimateListener);

    void removePublishTask(String str);

    boolean retryPublish(String str);
}
