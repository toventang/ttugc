package com.p2082ss.android.ugc.aweme.shortvideo.edit.multiedit.view;

import android.animation.AnimatorListenerAdapter;
import android.view.View;
import androidx.core.p036g.C0692e;
import androidx.fragment.app.ActivityC0945e;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.CutMultiVideoViewModel;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.videoedit.AbstractC70516a;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.videoedit.C70542w;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditViewModel;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.multiedit.p3828c.AbstractC71433b;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.multiedit.view.a */
public interface AbstractC71496a {
    static {
        Covode.recordClassIndex(84037);
    }

    /* renamed from: a */
    AbstractC70516a mo113189a();

    /* renamed from: a */
    void mo113190a(int i, int i2);

    /* renamed from: a */
    void mo113191a(View.OnClickListener onClickListener);

    /* renamed from: a */
    void mo113192a(C0692e<Float, Float> eVar);

    /* renamed from: a */
    void mo113193a(ActivityC0945e eVar, int i, AnimatorListenerAdapter animatorListenerAdapter);

    /* renamed from: a */
    void mo113194a(ActivityC0945e eVar, View view, boolean z);

    /* renamed from: a */
    void mo113195a(ActivityC0945e eVar, CutMultiVideoViewModel cutMultiVideoViewModel, List<? extends MediaModel> list, boolean z, C70542w wVar);

    /* renamed from: a */
    void mo113196a(ActivityC0945e eVar, VideoEditViewModel videoEditViewModel, CutMultiVideoViewModel cutMultiVideoViewModel, List<? extends VideoSegment> list);

    /* renamed from: a */
    void mo113197a(VideoSegment videoSegment);

    /* renamed from: a */
    void mo113198a(AbstractC71433b bVar);

    /* renamed from: a */
    void mo113199a(List<? extends VideoSegment> list);

    /* renamed from: a */
    void mo113200a(boolean z);

    /* renamed from: a */
    void mo113201a(boolean z, int i);

    /* renamed from: b */
    void mo113202b(C0692e<Float, Float> eVar);

    /* renamed from: b */
    void mo113203b(ActivityC0945e eVar, int i, AnimatorListenerAdapter animatorListenerAdapter);

    /* renamed from: b */
    void mo113204b(VideoSegment videoSegment);

    /* renamed from: b */
    void mo113205b(boolean z);

    /* renamed from: b */
    boolean mo113206b();

    /* renamed from: c */
    void mo113207c();

    /* renamed from: c */
    void mo113208c(boolean z);

    /* renamed from: d */
    C0692e<Float, Float> mo113209d();

    /* renamed from: e */
    boolean mo113210e();

    /* renamed from: f */
    void mo113211f();

    /* renamed from: g */
    void mo113212g();

    /* renamed from: h */
    void mo113213h();

    /* renamed from: i */
    void mo113214i();

    /* renamed from: j */
    void mo113215j();

    /* renamed from: k */
    void mo113216k();
}
