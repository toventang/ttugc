package com.p2082ss.android.ugc.aweme.publish.p3620g.p3621a;

import com.bytedance.apm.C12290b;
import com.bytedance.covode.number.Covode;
import com.google.p1998c.p2006h.p2007a.AbstractC27645k;
import com.p2082ss.android.ugc.aweme.base.C34611o;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63247i;
import com.p2082ss.android.ugc.aweme.publish.p3620g.C65622b;
import com.p2082ss.android.ugc.aweme.publish.p3620g.p3622b.C65624b;
import com.p2082ss.android.ugc.aweme.publish.p3620g.p3623c.C65630a;
import com.p2082ss.android.ugc.aweme.settings.C68743i;
import com.p2082ss.android.ugc.aweme.shortvideo.C69831ai;
import com.p2082ss.android.ugc.aweme.shortvideo.C69840ar;
import com.p2082ss.android.ugc.aweme.shortvideo.C69890bl;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p2082ss.android.ugc.aweme.shortvideo.p3858s.C72829c;
import com.p2082ss.android.ugc.aweme.shortvideo.publish.EnumC72679r;
import com.p2082ss.android.ugc.aweme.shortvideo.publish.EnumC72680s;
import com.p2082ss.android.ugc.aweme.shortvideo.publish.EnumC72682u;
import com.p2082ss.android.ugc.aweme.shortvideo.upload.C73913n;
import com.p2082ss.android.ugc.tools.p4344f.C84425b;
import com.p2082ss.android.ugc.tools.utils.C84911q;
import java.io.File;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.publish.g.a.a */
public final class C65619a implements AbstractC27645k<C69831ai> {

    /* renamed from: a */
    private final C73913n f147928a;

    /* renamed from: b */
    private final String f147929b;

    /* renamed from: c */
    private final boolean f147930c;

    /* renamed from: d */
    private final boolean f147931d;

    /* renamed from: e */
    private final VideoPublishEditModel f147932e;

    static {
        Covode.recordClassIndex(77110);
    }

    /* renamed from: a */
    private C65622b m117422a(C69840ar arVar) {
        return new C65622b(arVar).mo104805a(this.f147929b).mo104802a(this.f147932e).mo104803a(EnumC72679r.CREATE_AWEME).mo104804a(EnumC72682u.VIDEO).mo104800a().mo104806a(this.f147930c);
    }

    @Override // com.google.p1998c.p2006h.p2007a.AbstractC27645k
    public final void onFailure(Throwable th) {
        String str;
        C84911q.m145921a("PublishDurationMonitor CreateAweme End failed");
        int a = C65630a.m117450a(th, 13);
        String d = C65630a.m117455d(th);
        JSONObject a2 = m117422a(new C69840ar()).mo104808b().mo104809c().mo104801a(new C65624b(th)).mo104807a(EnumC72680s.FAILED).mo110189a("server_log_id", d).mo110187a("is_hd_video", Integer.valueOf(this.f147931d ? 1 : 0)).mo110191a();
        if (this.f147932e.isMvThemeVideoType() && C68743i.m121176a()) {
            C12290b.m22060a("aweme_mv_publish_error_rate", a, a2);
        }
        C12290b.m22060a("aweme_movie_publish_error_rate_parallel", a, a2);
        C84425b a3 = C69890bl.m123458a(this.f147932e).mo129403a("status", a).mo129405a("shoot_way", this.f147932e);
        String str2 = "1";
        if (this.f147930c) {
            str = str2;
        } else {
            str = "0";
        }
        C84425b a4 = a3.mo129406a("retry_publish", str).mo129406a("publish_id", this.f147929b).mo129403a("publish_step", 41).mo129403a("error_code", C65630a.m117450a(th, 13)).mo129406a("server_log_id", d);
        if (!C72829c.m128602a(C63247i.f143610a)) {
            str2 = "0";
        }
        C39162r.m79460a("parallel_publish_result", a4.mo129406a("network_available", str2).f188764a);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.google.p1998c.p2006h.p2007a.AbstractC27645k
    public final /* synthetic */ void onSuccess(C69831ai aiVar) {
        String str;
        C84911q.m145921a("PublishDurationMonitor CreateAweme End success");
        JSONObject a = m117422a(new C69840ar()).mo104808b().mo104809c().mo104807a(EnumC72680s.SUCCESS).mo110187a("is_hd_video", Integer.valueOf(this.f147931d ? 1 : 0)).mo110191a();
        if (this.f147932e.isMvThemeVideoType() && C68743i.m121176a()) {
            C12290b.m22060a("aweme_mv_publish_error_rate", 0, a);
        }
        C12290b.m22060a("aweme_movie_publish_error_rate_parallel", 0, a);
        C84425b a2 = C69890bl.m123458a(this.f147932e).mo129403a("status", 0).mo129406a("shoot_way", this.f147932e.mShootWay);
        if (this.f147930c) {
            str = "1";
        } else {
            str = "0";
        }
        C39162r.m79460a("parallel_publish_result", a2.mo129406a("retry_publish", str).mo129406a("publish_id", this.f147929b).mo129403a("publish_step", 41).f188764a);
        C73913n nVar = this.f147928a;
        long length = new File(this.f147932e.mParallelUploadOutputFile).length();
        if (nVar.f165941a.f64413a) {
            if (C68743i.m121176a()) {
                C34611o.m70668a("publish_log_parallel", new C69840ar().mo110188a("duration", Long.valueOf(nVar.f165941a.mo45339a(TimeUnit.MILLISECONDS))).mo110186a("upload_speed", Float.valueOf((((float) length) * 1.0f) / ((float) nVar.f165941a.mo45339a(TimeUnit.MILLISECONDS)))).mo110191a());
            }
            nVar.f165941a.mo45341c();
        }
    }

    public C65619a(C73913n nVar, String str, boolean z, boolean z2, VideoPublishEditModel videoPublishEditModel) {
        String str2;
        this.f147928a = nVar;
        this.f147929b = str;
        this.f147930c = z;
        this.f147931d = z2;
        this.f147932e = videoPublishEditModel;
        C84425b a = C69890bl.m123458a(videoPublishEditModel);
        if (z) {
            str2 = "1";
        } else {
            str2 = "0";
        }
        C39162r.m79460a("parallel_publish_result", a.mo129406a("retry_publish", str2).mo129406a("shoot_way", videoPublishEditModel.mShootWay).mo129403a("publish_step", 40).mo129406a("publish_id", str).f188764a);
    }
}
