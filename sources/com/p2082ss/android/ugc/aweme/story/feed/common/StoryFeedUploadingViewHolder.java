package com.p2082ss.android.ugc.aweme.story.feed.common;

import android.graphics.Bitmap;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.feed.adapter.C48238ce;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.Video;
import com.p2082ss.android.ugc.aweme.story.publish.C77429f;
import org.greenrobot.eventbus.AbstractC90253j;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.story.feed.common.StoryFeedUploadingViewHolder */
public final class StoryFeedUploadingViewHolder extends StoryVideoViewHolder implements AbstractC90253j {
    static {
        Covode.recordClassIndex(90177);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StoryFeedUploadingViewHolder(C48238ce ceVar) {
        super(ceVar);
        C89219l.m154721d(ceVar, "");
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.adapter.AbstractC48234cd, com.p2082ss.android.ugc.aweme.feed.adapter.VideoViewCell
    /* renamed from: a */
    public final void mo80071a(Video video) {
        String scheduleId;
        super.mo80071a(video);
        Aweme aweme = this.f111308j;
        if (aweme != null && (scheduleId = aweme.getScheduleId()) != null) {
            C89219l.m154721d(scheduleId, "");
            Bitmap bitmap = C77429f.f173732g.get(scheduleId);
            if (bitmap != null) {
                this.f111472r.setImageBitmap(bitmap);
            }
        }
    }
}
