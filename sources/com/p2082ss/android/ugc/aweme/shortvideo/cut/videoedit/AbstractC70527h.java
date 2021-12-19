package com.p2082ss.android.ugc.aweme.shortvideo.cut.videoedit;

import androidx.core.p036g.C0692e;
import androidx.fragment.app.ActivityC0945e;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.CutMultiVideoViewModel;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.videoedit.h */
public interface AbstractC70527h {
    static {
        Covode.recordClassIndex(82983);
    }

    /* renamed from: a */
    void mo111127a();

    /* renamed from: a */
    void mo111132a(C0692e<Float, Float> eVar, List<VideoSegment> list);

    /* renamed from: a */
    void mo111133a(C0692e<Float, Float> eVar, boolean z);

    /* renamed from: a */
    void mo111104a(List<VideoSegment> list);

    /* renamed from: a */
    void mo111105a(boolean z);

    /* renamed from: a */
    boolean mo111138a(ActivityC0945e eVar, CutMultiVideoViewModel cutMultiVideoViewModel, VideoEditViewModel videoEditViewModel, List<VideoSegment> list, int i);

    /* renamed from: a */
    boolean mo111140a(ActivityC0945e eVar, CutMultiVideoViewModel cutMultiVideoViewModel, String str);

    /* renamed from: a */
    boolean mo111141a(ActivityC0945e eVar, CutMultiVideoViewModel cutMultiVideoViewModel, List<MediaModel> list);

    /* renamed from: b */
    void mo111142b();

    /* renamed from: c */
    void mo111145c();

    /* renamed from: d */
    boolean mo111107d();

    /* renamed from: e */
    void mo111108e();

    /* renamed from: f */
    void mo111109f();

    /* renamed from: g */
    boolean mo111148g();

    int getCurrentRotate();

    float getCurrentSpeed();

    int getEditState();

    long getLeftSeekingValue();

    long getMaxCutDuration();

    long getMultiPlayingPosition();

    long getMultiSeekTime();

    C0692e<Long, Long> getPlayBoundary();

    long getPlayingPosition();

    long getRightSeekingValue();

    float getSelectedTime();

    long getSinglePlayingPosition();

    long getSingleSeekTime();

    C0692e<Float, Float> getSlideX();

    void setCurrentRotate(int i);

    void setDefaultMode(boolean z);

    void setExtractFramesInRoughMode(boolean z);

    void setLoadThumbnailDirectly(boolean z);

    void setMaxVideoLength(long j);

    void setMinVideoLength(long j);

    void setMultiEditEnableForStickPointMode(boolean z);
}
