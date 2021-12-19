package com.p2082ss.android.ugc.aweme.ttep;

import android.text.TextUtils;
import com.bytedance.als.AbstractC2565m;
import com.bytedance.covode.number.Covode;
import com.bytedance.creativex.recorder.filter.p942a.AbstractC14210a;
import com.bytedance.creativex.recorder.p940b.p941a.C14188h;
import com.p2082ss.android.ugc.aweme.common.C39099e;
import com.p2082ss.android.ugc.aweme.common.C39162r;
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

/* renamed from: com.ss.android.ugc.aweme.ttep.w */
final /* synthetic */ class C79331w implements AbstractC2565m {

    /* renamed from: a */
    private final TTEPEffectPreviewActivity f178239a;

    static {
        Covode.recordClassIndex(92524);
    }

    C79331w(TTEPEffectPreviewActivity tTEPEffectPreviewActivity) {
        this.f178239a = tTEPEffectPreviewActivity;
    }

    @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
    public final void onChanged(Object obj) {
        String str;
        String str2;
        String str3;
        TTEPEffectPreviewActivity tTEPEffectPreviewActivity = this.f178239a;
        C14188h hVar = (C14188h) obj;
        if (!tTEPEffectPreviewActivity.f177947x) {
            long j = hVar.f34461a;
            long j2 = hVar.f34462b;
            tTEPEffectPreviewActivity.f177947x = true;
            T value = ((AbstractC14210a) tTEPEffectPreviewActivity.f177929f.mo35249a((Type) AbstractC14210a.class, (String) null)).getCurSelectedFilter().f7727a.getValue();
            Effect effect = tTEPEffectPreviewActivity.f177930g.f155827l;
            String str4 = "";
            if (effect != null) {
                str2 = effect.getEffectId();
                str = effect.getName();
            } else {
                str = str4;
                str2 = str;
            }
            long longExtra = tTEPEffectPreviewActivity.getIntent().getLongExtra("extra_start_record_time", 0);
            long j3 = j - longExtra;
            int intExtra = tTEPEffectPreviewActivity.getIntent().getIntExtra("sdk_load_ve_so_status", -1);
            long longExtra2 = tTEPEffectPreviewActivity.getIntent().getLongExtra("preload_ve_so_cost_time", -1);
            int intExtra2 = tTEPEffectPreviewActivity.getIntent().getIntExtra("preload_ve_so_task_status", -1);
            long longExtra3 = tTEPEffectPreviewActivity.getIntent().getLongExtra("extra_decompress_time", -10086);
            C84911q.m145921a("So decompress: TTEPEffectPreviewActivity, decompress time:".concat(String.valueOf(longExtra3)));
            boolean a = C88250b.m153360a();
            long longExtra4 = tTEPEffectPreviewActivity.getIntent().getLongExtra("effect_download_duration", -1);
            C74029a.m130192a("tool_performance_record_first_frame", new C84425b().mo129403a("sdk_load_ve_so_status", intExtra).mo129403a("preload_ve_so_task_status", intExtra2).mo129404a("preload_ve_so_cost_time", longExtra2).mo129404a("extra_decompress_time", longExtra3).mo129404a("first_frame_duration", j3).mo129404a("effect_first_frame_duration", j2 - j).mo129404a("total_first_frame_duration", j2 - longExtra).mo129406a("shoot_way", tTEPEffectPreviewActivity.f177930g.f155831p).mo129406a("enter_from", tTEPEffectPreviewActivity.f177930g.f155837v).mo129406a("creation_id", tTEPEffectPreviewActivity.f177930g.f155830o).mo129407a("cold_start", a).mo129404a("effect_download_duration", longExtra4).mo129404a("music_download_duration", tTEPEffectPreviewActivity.getIntent().getLongExtra("music_download_duration", -1)).mo129404a("video_download_duration", tTEPEffectPreviewActivity.getIntent().getLongExtra("video_download_duration", -1)).mo129406a("camera_type", C74049z.m130207a(tTEPEffectPreviewActivity.f177914C.mo22747A().getCurrentCameraType())).f188764a);
            C84425b a2 = new C84425b().mo129406a("creation_id", tTEPEffectPreviewActivity.f177930g.f155830o).mo129406a("shoot_way", tTEPEffectPreviewActivity.f177930g.f155831p);
            if (value != null) {
                str4 = value.getEnName();
            }
            C84425b a3 = a2.mo129406a("filter_list", str4).mo129403a("filter_id_list", value != null ? value.getId() : 0).mo129406a("enter_from", tTEPEffectPreviewActivity.f177930g.f155837v).mo129406a("prop_id", tTEPEffectPreviewActivity.mo122954q().mo128896D().mo128847c()).mo129406a("mv_id", str2).mo129406a("mv_name", str).mo129407a("cold_start", a).mo129405a("app_mem_use", C73933a.C73934a.m130028a("av_video_record_init").getFirst()).mo129405a("availble_mem", C73933a.C73934a.m130028a("av_video_record_init").getSecond()).mo129404a("download_res_time", tTEPEffectPreviewActivity.getIntent().getLongExtra("extra_start_record_download_res_time", 0)).mo129406a("camera_type", C74049z.m130207a(tTEPEffectPreviewActivity.f177914C.mo22747A().getCurrentCameraType()));
            if (tTEPEffectPreviewActivity.f177930g.f155740A != 0) {
                a3.mo129403a("draft_id", tTEPEffectPreviewActivity.f177930g.f155740A);
            }
            if (!TextUtils.isEmpty(tTEPEffectPreviewActivity.f177930g.f155841z)) {
                a3.mo129406a("channel", tTEPEffectPreviewActivity.f177930g.f155841z);
            }
            if (!TextUtils.isEmpty(tTEPEffectPreviewActivity.f177930g.f155821f)) {
                a3.mo129406a("open_platform_share_id", tTEPEffectPreviewActivity.f177930g.f155821f);
            }
            if (!TextUtils.isEmpty(tTEPEffectPreviewActivity.f177930g.f155741B)) {
                a3.mo129406a("new_draft_id", tTEPEffectPreviewActivity.f177930g.f155741B);
                if (tTEPEffectPreviewActivity.f177930g.f155818c == 0) {
                    a3.mo129406a("enter_method", "click_back_button");
                    str3 = "general_draft_list";
                } else {
                    str3 = null;
                }
                a3.mo129406a("draft_way", str3);
            }
            a3.mo129403a("brightness", C39099e.m79372a(tTEPEffectPreviewActivity));
            if (longExtra > 0 && j3 > 0) {
                a3 = a3;
                a3.mo129404a("duration", j3);
            }
            if (TextUtils.equals(tTEPEffectPreviewActivity.f177930g.f155837v, "super_entrance")) {
                a3.mo129403a("is_special_icon", 1);
            }
            if (tTEPEffectPreviewActivity.f177930g.mo110033i()) {
                a3.mo129406a("shoot_entrance", tTEPEffectPreviewActivity.f177930g.f155831p);
                a3.mo129403a("reviewed", tTEPEffectPreviewActivity.f177930g.f155765Z.getReviewed());
                if (!TextUtils.isEmpty(tTEPEffectPreviewActivity.f177930g.f155765Z.getOrderId())) {
                    a3.mo129406a(C74418d.MOD_ORDER_ID, tTEPEffectPreviewActivity.f177930g.f155765Z.getOrderId());
                }
            }
            C73967at.m130094a("enter_video_shoot_page");
            C39162r.m79460a("enter_video_shoot_page", a3.f188764a);
            C39162r.m79460a("tool_performance_4k_video_import", new C84425b().mo129407a("is_4k_enable", C74002bq.m130147a()).f188764a);
        }
    }
}
