package com.p2082ss.android.ugc.aweme.shortvideo.upload;

import com.bytedance.apm.C12290b;
import com.bytedance.covode.number.Covode;
import com.google.p1998c.p1999a.C27252o;
import com.google.p1998c.p2006h.p2007a.AbstractC27645k;
import com.p2082ss.android.ugc.aweme.publish.p3620g.C65622b;
import com.p2082ss.android.ugc.aweme.publish.p3620g.p3622b.C65627e;
import com.p2082ss.android.ugc.aweme.publish.p3620g.p3623c.C65630a;
import com.p2082ss.android.ugc.aweme.settings.C68743i;
import com.p2082ss.android.ugc.aweme.shortvideo.C69840ar;
import com.p2082ss.android.ugc.aweme.shortvideo.C69890bl;
import com.p2082ss.android.ugc.aweme.shortvideo.SynthetiseResult;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p2082ss.android.ugc.aweme.shortvideo.publish.EnumC72679r;
import com.p2082ss.android.ugc.aweme.shortvideo.publish.EnumC72680s;
import com.p2082ss.android.ugc.aweme.shortvideo.publish.EnumC72682u;
import com.p2082ss.android.ugc.aweme.shortvideo.upload.p3884d.C73896b;
import com.p2082ss.android.ugc.aweme.utils.C80322d;
import com.p2082ss.android.ugc.tools.p4344f.C84425b;
import com.p2082ss.android.ugc.tools.utils.C84911q;
import java.io.File;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.upload.w */
public final class C73923w implements AbstractC27645k<SynthetiseResult> {

    /* renamed from: a */
    public String f165963a;

    /* renamed from: b */
    private final C27252o f165964b = C27252o.m54253a();

    /* renamed from: c */
    private final String f165965c;

    /* renamed from: d */
    private final boolean f165966d;

    /* renamed from: e */
    private final List<String> f165967e;

    /* renamed from: f */
    private final C73896b f165968f;

    /* renamed from: g */
    private final VideoPublishEditModel f165969g;

    static {
        Covode.recordClassIndex(86670);
    }

    /* renamed from: a */
    private C65622b m130015a(C69840ar arVar) {
        return new C65622b(arVar).mo104805a(this.f165965c).mo104802a(this.f165969g).mo104803a(EnumC72679r.COMPILE).mo104804a(EnumC72682u.VIDEO).mo104800a().mo104806a(this.f165966d);
    }

    @Override // com.google.p1998c.p2006h.p2007a.AbstractC27645k
    public final void onFailure(Throwable th) {
        String str;
        String str2;
        C84911q.m145921a("PublishDurationMonitor Synthetise end failed");
        int b = C65630a.m117453b(th);
        C69840ar a = m130015a(new C69840ar()).mo104808b().mo104809c().mo104801a(new C65627e(th)).mo104807a(EnumC72680s.FAILED);
        String str3 = "1";
        if (this.f165968f.f165913g) {
            str = str3;
        } else {
            str = "0";
        }
        JSONObject a2 = a.mo110189a("click_publish", str).mo110191a();
        if (this.f165969g.isMvThemeVideoType() && C68743i.m121176a()) {
            try {
                a2.put("mv_id", this.f165963a);
            } catch (JSONException e) {
                e.printStackTrace();
            }
            C12290b.m22060a("aweme_mv_edit_error_rate", b, a2);
        }
        if (C68743i.m121176a()) {
            C12290b.m22060a("aweme_synthesis_error_rate_parallel", b, a2);
        }
        C12290b.m22060a("aweme_movie_publish_error_rate_parallel", b, a2);
        C84425b a3 = C69890bl.m123458a(this.f165969g);
        if (this.f165966d) {
            str2 = str3;
        } else {
            str2 = "0";
        }
        C84425b a4 = a3.mo129406a("retry_publish", str2).mo129403a("publish_step", 11).mo129406a("shoot_way", this.f165969g.mShootWay).mo129403a("error_code", b);
        if (!this.f165968f.f165913g) {
            str3 = "0";
        }
        C80322d.m139251a("parallel_publish_result", a4.mo129406a("click_publish", str3).mo129403a("video_editor_type", this.f165969g.videoEditorType).mo129406a("publish_id", this.f165965c).f188764a);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.google.p1998c.p2006h.p2007a.AbstractC27645k
    public final /* synthetic */ void onSuccess(SynthetiseResult synthetiseResult) {
        String str;
        SynthetiseResult synthetiseResult2 = synthetiseResult;
        long a = this.f165964b.mo45339a(TimeUnit.MILLISECONDS);
        C84911q.m145921a("PublishDurationMonitor Synthetise end success durationMs:".concat(String.valueOf(a)));
        C69840ar a2 = m130015a(new C69840ar()).mo104808b().mo104809c().mo104807a(EnumC72680s.SUCCESS);
        String str2 = "1";
        if (this.f165968f.f165913g) {
            str = str2;
        } else {
            str = "0";
        }
        C69840ar a3 = a2.mo110189a("click_publish", str);
        if (new File(this.f165969g.mParallelUploadOutputFile).exists()) {
            a3.mo110186a("speed", Float.valueOf(((float) this.f165969g.getVideoLength()) / ((float) a))).mo110188a("duration", Long.valueOf(a));
        }
        if (synthetiseResult2 != null && synthetiseResult2.audioLength - synthetiseResult2.videoLength > 3000.0f) {
            a3.mo110185a("compile_lost_video", (Boolean) true).mo110189a("fileInfo", synthetiseResult2.toString());
        }
        if (!this.f165967e.isEmpty()) {
            a3.mo110189a("compile_skip_frame", this.f165967e.toString()).mo110187a("compile_skip_frame_size", Integer.valueOf(this.f165967e.size()));
        }
        JSONObject a4 = a3.mo110191a();
        if (this.f165969g.isMvThemeVideoType() && C68743i.m121176a()) {
            C12290b.m22060a("aweme_mv_edit_error_rate", 0, a4);
        }
        if (C68743i.m121176a()) {
            C12290b.m22060a("aweme_synthesis_error_rate_parallel", 0, a4);
        }
        C12290b.m22060a("aweme_movie_publish_error_rate_parallel", 0, a4);
        C84425b a5 = C69890bl.m123458a(this.f165969g);
        if (!this.f165966d) {
            str2 = "0";
        }
        C80322d.m139251a("parallel_publish_result", a5.mo129406a("retry_publish", str2).mo129406a("shoot_way", this.f165969g.mShootWay).mo129403a("publish_step", 11).mo129403a("video_editor_type", this.f165969g.videoEditorType).mo129406a("publish_id", this.f165965c).f188764a);
    }

    public C73923w(String str, boolean z, VideoPublishEditModel videoPublishEditModel, C73896b bVar, List<String> list) {
        String str2;
        this.f165965c = str;
        this.f165966d = z;
        this.f165968f = bVar;
        this.f165969g = videoPublishEditModel;
        this.f165967e = list;
        JSONObject a = m130015a(new C69840ar()).mo104808b().mo104809c().mo104807a(EnumC72680s.START).mo110191a();
        if (C68743i.m121176a()) {
            C12290b.m22060a("aweme_synthesis_error_rate_parallel", -1, a);
        }
        C12290b.m22060a("aweme_movie_publish_error_rate_parallel", -1, a);
        C84425b a2 = C69890bl.m123458a(videoPublishEditModel);
        if (z) {
            str2 = "1";
        } else {
            str2 = "0";
        }
        C80322d.m139251a("parallel_publish_result", a2.mo129406a("retry_publish", str2).mo129406a("shoot_way", videoPublishEditModel.mShootWay).mo129403a("publish_step", 10).mo129403a("video_editor_type", videoPublishEditModel.videoEditorType).mo129406a("publish_id", str).f188764a);
    }
}
