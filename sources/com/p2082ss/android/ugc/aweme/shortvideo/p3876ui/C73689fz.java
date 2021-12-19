package com.p2082ss.android.ugc.aweme.shortvideo.p3876ui;

import android.text.TextUtils;
import com.bytedance.als.AbstractC2565m;
import com.bytedance.covode.number.Covode;
import com.bytedance.creativex.recorder.filter.p942a.AbstractC14210a;
import com.bytedance.creativex.recorder.p940b.p941a.C14188h;
import com.p2082ss.android.ugc.aweme.common.C39099e;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.aweme.shortvideo.util.C73933a;
import com.p2082ss.android.ugc.aweme.shortvideo.util.C73967at;
import com.p2082ss.android.ugc.aweme.shortvideo.util.C74002bq;
import com.p2082ss.android.ugc.aweme.shortvideo.util.C74049z;
import com.p2082ss.android.ugc.aweme.shortvideo.util.performance.C74029a;
import com.p2082ss.android.ugc.aweme.shoutouts.C74418d;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;
import com.p2082ss.android.ugc.tools.p4344f.C84425b;
import com.p2082ss.android.ugc.tools.utils.C84911q;
import dmt.p4542av.video.p4547d.C88250b;
import java.lang.reflect.Type;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.fz */
final /* synthetic */ class C73689fz implements AbstractC2565m {

    /* renamed from: a */
    private final VideoRecordNewActivity f165524a;

    static {
        Covode.recordClassIndex(86427);
    }

    C73689fz(VideoRecordNewActivity videoRecordNewActivity) {
        this.f165524a = videoRecordNewActivity;
    }

    @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
    public final void onChanged(Object obj) {
        String str;
        String str2;
        String str3;
        VideoRecordNewActivity videoRecordNewActivity = this.f165524a;
        C14188h hVar = (C14188h) obj;
        if (!videoRecordNewActivity.f164831z) {
            long j = hVar.f34461a;
            long j2 = hVar.f34462b;
            videoRecordNewActivity.f164831z = true;
            T value = ((AbstractC14210a) videoRecordNewActivity.f164811f.mo35249a((Type) AbstractC14210a.class, (String) null)).getCurSelectedFilter().f7727a.getValue();
            Effect effect = videoRecordNewActivity.f164812g.f155827l;
            String str4 = "";
            if (effect != null) {
                str2 = effect.getEffectId();
                str = effect.getName();
            } else {
                str = str4;
                str2 = str;
            }
            long longExtra = videoRecordNewActivity.getIntent().getLongExtra("extra_start_record_time", 0);
            long j3 = j - longExtra;
            int intExtra = videoRecordNewActivity.getIntent().getIntExtra("sdk_load_ve_so_status", -1);
            long longExtra2 = videoRecordNewActivity.getIntent().getLongExtra("preload_ve_so_cost_time", -1);
            int intExtra2 = videoRecordNewActivity.getIntent().getIntExtra("preload_ve_so_task_status", -1);
            long longExtra3 = videoRecordNewActivity.getIntent().getLongExtra("extra_decompress_time", -10086);
            C84911q.m145921a("So decompress: VideoRecordNewActivity, decompress time:".concat(String.valueOf(longExtra3)));
            boolean a = C88250b.m153360a();
            long longExtra4 = videoRecordNewActivity.getIntent().getLongExtra("effect_download_duration", -1);
            C74029a.m130192a("tool_performance_record_first_frame", new C84425b().mo129403a("sdk_load_ve_so_status", intExtra).mo129403a("preload_ve_so_task_status", intExtra2).mo129404a("preload_ve_so_cost_time", longExtra2).mo129404a("extra_decompress_time", longExtra3).mo129404a("first_frame_duration", j3).mo129404a("effect_first_frame_duration", j2 - j).mo129404a("total_first_frame_duration", j2 - longExtra).mo129406a("shoot_way", videoRecordNewActivity.f164812g.f155831p).mo129406a("enter_from", videoRecordNewActivity.f164812g.f155837v).mo129406a("creation_id", videoRecordNewActivity.f164812g.f155830o).mo129407a("cold_start", a).mo129404a("effect_download_duration", longExtra4).mo129404a("music_download_duration", videoRecordNewActivity.getIntent().getLongExtra("music_download_duration", -1)).mo129404a("video_download_duration", videoRecordNewActivity.getIntent().getLongExtra("video_download_duration", -1)).mo129406a("camera_type", C74049z.m130207a(videoRecordNewActivity.f164792F.mo22747A().getCurrentCameraType())).f188764a);
            C84425b a2 = new C84425b().mo129406a("creation_id", videoRecordNewActivity.f164812g.f155830o).mo129406a("shoot_way", videoRecordNewActivity.f164812g.f155831p);
            if (value != null) {
                str4 = value.getEnName();
            }
            int i = 0;
            C84425b a3 = a2.mo129406a("filter_name", str4).mo129403a("filter_id", value != null ? value.getId() : 0).mo129406a("enter_from", videoRecordNewActivity.f164812g.f155837v).mo129406a("prop_id", videoRecordNewActivity.mo116002r().mo128896D().mo128847c()).mo129406a("mv_id", str2).mo129406a("mv_name", str).mo129407a("cold_start", a).mo129405a("app_mem_use", C73933a.C73934a.m130028a("av_video_record_init").getFirst()).mo129405a("availble_mem", C73933a.C73934a.m130028a("av_video_record_init").getSecond()).mo129404a("download_res_time", videoRecordNewActivity.getIntent().getLongExtra("extra_start_record_download_res_time", 0)).mo129406a("camera_type", C74049z.m130207a(videoRecordNewActivity.f164792F.mo22747A().getCurrentCameraType()));
            if (videoRecordNewActivity.f164812g.f155740A != 0) {
                a3.mo129403a("draft_id", videoRecordNewActivity.f164812g.f155740A);
            }
            if (!TextUtils.isEmpty(videoRecordNewActivity.f164812g.f155841z)) {
                a3.mo129406a("channel", videoRecordNewActivity.f164812g.f155841z);
            }
            if (!TextUtils.isEmpty(videoRecordNewActivity.f164812g.f155821f)) {
                a3.mo129406a("open_platform_share_id", videoRecordNewActivity.f164812g.f155821f);
            }
            if (!TextUtils.isEmpty(videoRecordNewActivity.f164812g.f155741B)) {
                a3.mo129406a("new_draft_id", videoRecordNewActivity.f164812g.f155741B);
                if (videoRecordNewActivity.f164812g.f155818c == 0) {
                    a3.mo129406a("enter_method", "click_back_button");
                    str3 = "general_draft_list";
                } else {
                    str3 = null;
                }
                a3.mo129406a("draft_way", str3);
            }
            a3.mo129403a("brightness", C39099e.m79372a(videoRecordNewActivity));
            if (longExtra > 0 && j3 > 0) {
                a3.mo129404a("duration", j3);
            }
            if (TextUtils.equals(videoRecordNewActivity.f164812g.f155837v, "super_entrance")) {
                a3.mo129403a("is_special_icon", 1);
            }
            if (videoRecordNewActivity.f164812g.mo110033i()) {
                a3.mo129406a("shoot_entrance", videoRecordNewActivity.f164812g.f155831p);
                a3.mo129403a("reviewed", videoRecordNewActivity.f164812g.f155765Z.getReviewed());
                if (!TextUtils.isEmpty(videoRecordNewActivity.f164812g.f155765Z.getOrderId())) {
                    a3.mo129406a(C74418d.MOD_ORDER_ID, videoRecordNewActivity.f164812g.f155765Z.getOrderId());
                }
            }
            if ("story".equals(videoRecordNewActivity.f164812g.f155831p)) {
                a3.mo129406a("shoot_entrance", "story").mo129406a("enter_method", videoRecordNewActivity.f164812g.f155838w);
            }
            a3.mo129406a("shoot_page", "video_shoot_page").mo129403a("is_from_duet_button", videoRecordNewActivity.f164812g.f155785aS);
            a3.mo129406a("is_westwindow_exist", videoRecordNewActivity.f164812g.f155782aP);
            if (videoRecordNewActivity.f164812g.mo110041q()) {
                a3.mo129403a("is_restore_crash", 1);
                if (C63244g.m114602a().mo73276d().mo101837f()) {
                    a3.mo129406a("enter_method", "click_continue_popup");
                } else {
                    a3.mo129406a("enter_method", "click_back_button");
                }
            }
            if (C63244g.m114602a().mo73287o().mo104784d()) {
                i = C63244g.m114602a().mo73287o().mo104785e();
            }
            a3.mo129403a("publish_cnt", i);
            C73967at.m130094a("enter_video_shoot_page");
            C39162r.m79460a("enter_video_shoot_page", a3.f188764a);
            C39162r.m79460a("tool_performance_4k_video_import", new C84425b().mo129407a("is_4k_enable", C74002bq.m130147a()).f188764a);
        }
    }
}
