package com.p2082ss.android.ugc.aweme.ftc;

import com.bytedance.als.AbstractC2565m;
import com.bytedance.covode.number.Covode;
import com.bytedance.creativex.recorder.p940b.p941a.C14188h;
import com.p2082ss.android.ugc.aweme.common.C39099e;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.shortvideo.util.C74002bq;
import com.p2082ss.android.ugc.aweme.shortvideo.util.C74049z;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;
import com.p2082ss.android.ugc.tools.p4344f.C84425b;
import com.p2082ss.android.ugc.tools.utils.C84911q;
import dmt.p4542av.video.p4547d.C88250b;

/* renamed from: com.ss.android.ugc.aweme.ftc.u */
final /* synthetic */ class C52801u implements AbstractC2565m {

    /* renamed from: a */
    private final FTCVideoRecordNewActivity f121497a;

    static {
        Covode.recordClassIndex(62200);
    }

    C52801u(FTCVideoRecordNewActivity fTCVideoRecordNewActivity) {
        this.f121497a = fTCVideoRecordNewActivity;
    }

    @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
    public final void onChanged(Object obj) {
        String str;
        String str2;
        FTCVideoRecordNewActivity fTCVideoRecordNewActivity = this.f121497a;
        C14188h hVar = (C14188h) obj;
        if (!fTCVideoRecordNewActivity.f119432x) {
            long j = hVar.f34461a;
            long j2 = hVar.f34462b;
            fTCVideoRecordNewActivity.f119432x = true;
            T value = fTCVideoRecordNewActivity.mo87540l().getCurSelectedFilter().f7727a.getValue();
            Effect effect = fTCVideoRecordNewActivity.f119415g.f155827l;
            String str3 = "";
            if (effect != null) {
                str2 = effect.getEffectId();
                str = effect.getName();
            } else {
                str = str3;
                str2 = str;
            }
            long longExtra = fTCVideoRecordNewActivity.getIntent().getLongExtra("extra_start_record_time", 0);
            long j3 = j - longExtra;
            int intExtra = fTCVideoRecordNewActivity.getIntent().getIntExtra("sdk_load_ve_so_status", -1);
            long longExtra2 = fTCVideoRecordNewActivity.getIntent().getLongExtra("preload_ve_so_cost_time", -1);
            int intExtra2 = fTCVideoRecordNewActivity.getIntent().getIntExtra("preload_ve_so_task_status", -1);
            long longExtra3 = fTCVideoRecordNewActivity.getIntent().getLongExtra("extra_decompress_time", -10086);
            C84911q.m145921a("So decompress: VideoRecordNewActivity, decompress time:".concat(String.valueOf(longExtra3)));
            boolean a = C88250b.m153360a();
            long longExtra4 = fTCVideoRecordNewActivity.getIntent().getLongExtra("effect_download_duration", -1);
            C39162r.m79460a("tool_performance_record_first_frame", new C84425b().mo129403a("sdk_load_ve_so_status", intExtra).mo129403a("preload_ve_so_task_status", intExtra2).mo129404a("preload_ve_so_cost_time", longExtra2).mo129404a("extra_decompress_time", longExtra3).mo129404a("first_frame_duration", j3).mo129404a("effect_first_frame_duration", j2 - j).mo129404a("total_first_frame_duration", j2 - longExtra).mo129406a("shoot_way", fTCVideoRecordNewActivity.f119415g.f155831p).mo129406a("enter_from", fTCVideoRecordNewActivity.f119415g.f155837v).mo129406a("creation_id", fTCVideoRecordNewActivity.f119415g.f155830o).mo129407a("cold_start", a).mo129404a("effect_download_duration", longExtra4).mo129404a("music_download_duration", fTCVideoRecordNewActivity.getIntent().getLongExtra("music_download_duration", -1)).mo129404a("video_download_duration", fTCVideoRecordNewActivity.getIntent().getLongExtra("video_download_duration", -1)).mo129406a("camera_type", C74049z.m130207a(fTCVideoRecordNewActivity.f119401A.mo22747A().getCurrentCameraType())).f188764a);
            C84425b a2 = new C84425b().mo129406a("creation_id", fTCVideoRecordNewActivity.f119415g.f155830o).mo129406a("shoot_way", fTCVideoRecordNewActivity.f119415g.f155831p).mo129403a("draft_id", fTCVideoRecordNewActivity.f119415g.f155740A);
            if (value != null) {
                str3 = value.getEnName();
            }
            C84425b a3 = a2.mo129406a("filter_list", str3).mo129403a("filter_id_list", value != null ? value.getId() : 0).mo129406a("enter_from", fTCVideoRecordNewActivity.f119415g.f155837v).mo129406a("prop_id", fTCVideoRecordNewActivity.mo87541m().mo128896D().mo128847c()).mo129406a("mv_id", str2).mo129406a("mv_name", str).mo129407a("cold_start", a).mo129404a("download_res_time", fTCVideoRecordNewActivity.getIntent().getLongExtra("extra_start_record_download_res_time", 0)).mo129406a("camera_type", C74049z.m130207a(fTCVideoRecordNewActivity.f119401A.mo22747A().getCurrentCameraType()));
            a3.mo129403a("brightness", C39099e.m79372a(fTCVideoRecordNewActivity));
            if (longExtra > 0 && j3 > 0) {
                a3 = a3;
                a3.mo129404a("duration", j3);
            }
            C39162r.m79460a("enter_video_shoot_page", a3.f188764a);
            C39162r.m79460a("tool_performance_4k_video_import", new C84425b().mo129407a("is_4k_enable", C74002bq.m130147a()).f188764a);
        }
    }
}
