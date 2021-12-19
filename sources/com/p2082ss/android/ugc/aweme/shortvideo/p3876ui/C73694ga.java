package com.p2082ss.android.ugc.aweme.shortvideo.p3876ui;

import com.bytedance.als.AbstractC2565m;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.tools.EnumC78601i;
import com.p2082ss.android.ugc.tools.p4344f.C84425b;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.ga */
final /* synthetic */ class C73694ga implements AbstractC2565m {

    /* renamed from: a */
    private final VideoRecordNewActivity f165533a;

    static {
        Covode.recordClassIndex(86432);
    }

    C73694ga(VideoRecordNewActivity videoRecordNewActivity) {
        this.f165533a = videoRecordNewActivity;
    }

    @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
    public final void onChanged(Object obj) {
        VideoRecordNewActivity videoRecordNewActivity = this.f165533a;
        EnumC78601i H = videoRecordNewActivity.f164792F.mo22754H();
        if (videoRecordNewActivity.f164812g != null) {
            C39162r.m79460a("choose_speed_mode", new C84425b().mo129406a("creation_id", videoRecordNewActivity.f164812g.f155830o).mo129406a("shoot_way", videoRecordNewActivity.f164812g.f155831p).mo129403a("draft_id", videoRecordNewActivity.f164812g.f155740A).mo129406a("speed_mode", H.description()).mo129406a("shoot_page", "video_shoot_page").mo129406a("shoot_tab_name", videoRecordNewActivity.f164812g.mo110042r()).f188764a);
        }
    }
}
