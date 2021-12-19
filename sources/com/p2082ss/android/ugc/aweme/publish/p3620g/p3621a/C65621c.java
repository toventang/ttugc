package com.p2082ss.android.ugc.aweme.publish.p3620g.p3621a;

import com.bytedance.covode.number.Covode;
import com.google.p1998c.p1999a.C27252o;
import com.google.p1998c.p1999a.C27258s;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.p2730de.C40982q;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63247i;
import com.p2082ss.android.ugc.aweme.publish.p3619f.C65616g;
import com.p2082ss.android.ugc.aweme.publish.p3620g.C65622b;
import com.p2082ss.android.ugc.aweme.publish.p3620g.p3622b.C65628f;
import com.p2082ss.android.ugc.aweme.publish.p3620g.p3623c.C65630a;
import com.p2082ss.android.ugc.aweme.settings.C68743i;
import com.p2082ss.android.ugc.aweme.shortvideo.C69840ar;
import com.p2082ss.android.ugc.aweme.shortvideo.C69890bl;
import com.p2082ss.android.ugc.aweme.shortvideo.C71906k;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p2082ss.android.ugc.aweme.shortvideo.p3858s.C72829c;
import com.p2082ss.android.ugc.aweme.shortvideo.publish.EnumC72679r;
import com.p2082ss.android.ugc.aweme.shortvideo.publish.EnumC72680s;
import com.p2082ss.android.ugc.aweme.shortvideo.publish.EnumC72682u;
import com.p2082ss.android.ugc.aweme.shortvideo.upload.C73927z;
import com.p2082ss.android.ugc.aweme.shortvideo.upload.p3884d.C73896b;
import com.p2082ss.android.ugc.tools.p4344f.C84425b;
import com.p2082ss.android.ugc.tools.utils.C84911q;
import java.io.File;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.publish.g.a.c */
public final class C65621c extends C73927z {

    /* renamed from: c */
    private final C27252o f147934c;

    /* renamed from: d */
    private final C73896b f147935d;

    /* renamed from: e */
    private final String f147936e;

    /* renamed from: f */
    private final boolean f147937f;

    /* renamed from: g */
    private final boolean f147938g;

    /* renamed from: h */
    private final VideoPublishEditModel f147939h;

    static {
        Covode.recordClassIndex(77112);
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.upload.C73927z
    /* renamed from: a */
    public final void mo104799a() {
        String str;
        m117424a(true);
        C69840ar a = m117423a(new C69840ar()).mo104808b().mo104809c().mo104807a(EnumC72680s.SUCCESS);
        String str2 = "1";
        if (this.f147935d.f165913g) {
            str = str2;
        } else {
            str = "0";
        }
        C69840ar a2 = a.mo110189a("click_publish", str);
        if (new File(this.f147939h.mParallelUploadOutputFile).exists()) {
            long a3 = this.f147934c.mo45339a(TimeUnit.MILLISECONDS);
            a2.mo110186a("speed", Float.valueOf(((float) new File(this.f147939h.mParallelUploadOutputFile).length()) / ((float) a3))).mo110188a("duration", Long.valueOf(a3));
        }
        JSONObject a4 = a2.mo110191a();
        if (C68743i.m121176a()) {
            C40982q.m82520a("upload_error_parallel", 0, a4);
        }
        C40982q.m82520a("aweme_movie_publish_error_rate_parallel", 0, a4);
        C84425b a5 = C69890bl.m123458a(this.f147939h).mo129403a("mob_lost_assist", 1);
        if (!this.f147937f) {
            str2 = "0";
        }
        C39162r.m79460a("parallel_publish_result", a5.mo129406a("retry_publish", str2).mo129406a("shoot_way", this.f147939h.mShootWay).mo129403a("status", 82).mo129403a("publish_step", 31).mo129406a("publish_id", this.f147936e).f188764a);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.p2082ss.android.ugc.aweme.shortvideo.upload.C73927z, com.google.p1998c.p2006h.p2007a.AbstractC27645k
    public final /* synthetic */ void onSuccess(C65616g gVar) {
        mo104799a();
    }

    /* renamed from: a */
    private static void m117424a(boolean z) {
        String str;
        StringBuilder sb = new StringBuilder("PublishDurationMonitor Upload End ");
        if (z) {
            str = "success";
        } else {
            str = "failed";
        }
        C84911q.m145921a(sb.append(str).toString());
    }

    /* renamed from: a */
    private C65622b m117423a(C69840ar arVar) {
        return new C65622b(arVar).mo104805a(this.f147936e).mo104802a(this.f147939h).mo104803a(EnumC72679r.UPLOAD).mo104804a(EnumC72682u.VIDEO).mo104800a().mo104806a(this.f147937f);
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.upload.C73927z, com.google.p1998c.p2006h.p2007a.AbstractC27645k
    public final void onFailure(Throwable th) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        m117424a(false);
        String str6 = "";
        if (th != null) {
            String b = C27258s.m54268b(th);
            C89219l.m154716b(b, str6);
            str6 = b;
        }
        C84911q.m145926b("Publisher UploadFailed: ".concat(String.valueOf(str6)));
        int c = C65630a.m117454c(th);
        String str7 = "1";
        if (C68743i.m121176a()) {
            C69840ar a = C69890bl.m123459b(this.f147939h).mo110189a("exception", str6);
            if (this.f147935d.f165913g) {
                str5 = str7;
            } else {
                str5 = "0";
            }
            C40982q.m82520a("upload_error_parallel", c, a.mo110189a("click_publish", str5).mo110191a());
        }
        C69840ar a2 = m117423a(new C69840ar()).mo104808b().mo104809c().mo104801a(new C65628f(th)).mo104807a(EnumC72680s.FAILED).mo110187a("is_hd_video", Integer.valueOf(this.f147938g ? 1 : 0));
        if (this.f147935d.f165913g) {
            str = str7;
        } else {
            str = "0";
        }
        C40982q.m82520a("aweme_movie_publish_error_rate_parallel", c, a2.mo110189a("click_publish", str).mo110191a());
        C84425b a3 = C69890bl.m123458a(this.f147939h).mo129403a("status", c);
        if (this.f147937f) {
            str2 = str7;
        } else {
            str2 = "0";
        }
        C84425b a4 = a3.mo129406a("retry_publish", str2).mo129406a("shoot_way", this.f147939h.mShootWay);
        if (this.f147935d.mo116344c()) {
            str3 = str7;
        } else {
            str3 = "0";
        }
        C84425b a5 = a4.mo129406a("is_synthetic_success", str3).mo129403a("synthetic_error_code", this.f147935d.f165910d).mo129403a("publish_step", 31).mo129403a("error_code", c);
        if (this.f147935d.f165913g) {
            str4 = str7;
        } else {
            str4 = "0";
        }
        C84425b a6 = a5.mo129406a("click_publish", str4);
        if (!C72829c.m128602a(C63247i.f143610a)) {
            str7 = "0";
        }
        C39162r.m79460a("parallel_publish_result", a6.mo129406a("network_available", str7).mo129406a("publish_id", this.f147936e).f188764a);
        C71906k.f161134a.mo113563a("output file: " + this.f147939h.mParallelUploadOutputFile);
        if (this.f147939h.mParallelUploadOutputFile != null) {
            C71906k.f161134a.mo113563a(" size: " + new File(this.f147939h.mParallelUploadOutputFile).length());
        } else {
            C71906k.f161134a.mo113563a("output file == null");
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C65621c(com.p2082ss.android.ugc.aweme.shortvideo.upload.p3884d.C73896b r19, boolean r20, boolean r21, int r22, java.lang.String r23, boolean r24, com.p2082ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r25) {
        /*
        // Method dump skipped, instructions count: 124
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.publish.p3620g.p3621a.C65621c.<init>(com.ss.android.ugc.aweme.shortvideo.upload.d.b, boolean, boolean, int, java.lang.String, boolean, com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel):void");
    }
}
