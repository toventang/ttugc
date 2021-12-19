package com.p2082ss.android.ugc.aweme.shortvideo.upload;

import com.bytedance.covode.number.Covode;
import com.google.p1998c.p1999a.C27252o;
import com.google.p1998c.p1999a.C27258s;
import com.google.p1998c.p2006h.p2007a.AbstractC27645k;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.p2730de.C40982q;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63247i;
import com.p2082ss.android.ugc.aweme.property.C65444e;
import com.p2082ss.android.ugc.aweme.publish.p3619f.C65616g;
import com.p2082ss.android.ugc.aweme.publish.p3620g.p3623c.C65630a;
import com.p2082ss.android.ugc.aweme.setting.C68065d;
import com.p2082ss.android.ugc.aweme.shortvideo.C69840ar;
import com.p2082ss.android.ugc.aweme.shortvideo.C69890bl;
import com.p2082ss.android.ugc.aweme.shortvideo.C71906k;
import com.p2082ss.android.ugc.aweme.shortvideo.p3858s.C72829c;
import com.p2082ss.android.ugc.aweme.shortvideo.upload.p3884d.C73896b;
import com.p2082ss.android.ugc.tools.p4344f.C84425b;
import com.p2082ss.android.ugc.tools.utils.C84911q;
import java.io.File;
import java.util.concurrent.TimeUnit;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.upload.z */
public class C73927z implements AbstractC27645k<C65616g> {

    /* renamed from: a */
    final String f165973a;

    /* renamed from: b */
    String f165974b;

    /* renamed from: c */
    private final C27252o f165975c = C27252o.m54253a();

    /* renamed from: d */
    private final C73896b f165976d;

    /* renamed from: e */
    private final UploadSpeedInfo f165977e;

    /* renamed from: f */
    private boolean f165978f;

    /* renamed from: g */
    private final int f165979g;

    /* renamed from: h */
    private final String f165980h;

    /* renamed from: i */
    private final boolean f165981i;

    /* renamed from: j */
    private final boolean f165982j;

    /* renamed from: k */
    private final int f165983k;

    /* renamed from: l */
    private final String f165984l;

    /* renamed from: m */
    private final Object f165985m;

    static {
        Covode.recordClassIndex(86674);
    }

    /* renamed from: a */
    public void mo104799a() {
        String str;
        m130018a(true);
        C69840ar b = C69890bl.m123459b(this.f165985m);
        String str2 = "1";
        if (this.f165976d.f165913g) {
            str = str2;
        } else {
            str = "0";
        }
        C69840ar a = b.mo110189a("click_publish", str);
        if (new File(this.f165973a).exists()) {
            long a2 = this.f165975c.mo45339a(TimeUnit.MILLISECONDS);
            a.mo110186a("speed", Float.valueOf(((float) new File(this.f165973a).length()) / ((float) a2))).mo110188a("duration", Long.valueOf(a2));
        }
        C84425b a3 = C69890bl.m123458a(this.f165985m).mo129403a("mob_lost_assist", 1);
        if (!this.f165981i) {
            str2 = "0";
        }
        C39162r.m79460a("parallel_publish_result", a3.mo129406a("retry_publish", str2).mo129406a("shoot_way", this.f165984l).mo129403a("status", 82).mo129403a("publish_step", 31).mo129406a("publish_id", this.f165980h).f188764a);
        C40982q.m82520a("upload_error_parallel", 0, a.mo110191a());
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.google.p1998c.p2006h.p2007a.AbstractC27645k
    public /* synthetic */ void onSuccess(C65616g gVar) {
        mo104799a();
    }

    /* renamed from: a */
    private static void m130018a(boolean z) {
        String str;
        StringBuilder sb = new StringBuilder("PublishDurationMonitor Upload End ");
        if (z) {
            str = "success";
        } else {
            str = "failed";
        }
        C84911q.m145921a(sb.append(str).toString());
    }

    @Override // com.google.p1998c.p2006h.p2007a.AbstractC27645k
    public void onFailure(Throwable th) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        m130018a(false);
        String b = C27258s.m54268b(th);
        C84911q.m145926b("Publisher UploadFailed: ".concat(String.valueOf(b)));
        int c = C65630a.m117454c(th);
        C69840ar a = C69890bl.m123459b(this.f165985m).mo110189a("exception", b);
        String str6 = "1";
        if (this.f165976d.f165913g) {
            str = str6;
        } else {
            str = "0";
        }
        C40982q.m82520a("upload_error_parallel", c, a.mo110189a("click_publish", str).mo110191a());
        C69840ar a2 = C69890bl.m123459b(this.f165985m).mo110189a("exception", b).mo110189a("event", C73924x.f165970a.mo116371a().toString()).mo110187a("videoLength", Integer.valueOf(this.f165983k)).mo110187a("is_hd_video", Integer.valueOf(this.f165982j ? 1 : 0)).mo110189a("shoot_way", this.f165984l).mo110185a("is_long_video_allowed", Boolean.valueOf(C65444e.m117163a())).mo110188a("long_video_threshold", Long.valueOf(C68065d.m120371a()));
        if (this.f165976d.f165913g) {
            str2 = str6;
        } else {
            str2 = "0";
        }
        C40982q.m82520a("aweme_movie_publish_error_rate_parallel", c, a2.mo110189a("click_publish", str2).mo110191a());
        C84425b a3 = C69890bl.m123458a(this.f165985m).mo129403a("status", c);
        if (this.f165981i) {
            str3 = str6;
        } else {
            str3 = "0";
        }
        C84425b a4 = a3.mo129406a("retry_publish", str3).mo129406a("shoot_way", this.f165984l);
        if (this.f165976d.mo116344c()) {
            str4 = str6;
        } else {
            str4 = "0";
        }
        C84425b a5 = a4.mo129406a("is_synthetic_success", str4).mo129403a("synthetic_error_code", this.f165976d.f165910d).mo129403a("publish_step", 31).mo129403a("error_code", c);
        if (this.f165976d.f165913g) {
            str5 = str6;
        } else {
            str5 = "0";
        }
        C84425b a6 = a5.mo129406a("click_publish", str5);
        if (!C72829c.m128602a(C63247i.f143610a)) {
            str6 = "0";
        }
        C39162r.m79460a("parallel_publish_result", a6.mo129406a("network_available", str6).mo129406a("publish_id", this.f165980h).f188764a);
        C71906k.f161134a.mo113563a("output file: " + this.f165973a);
        if (this.f165973a != null) {
            C71906k.f161134a.mo113563a(" size: " + new File(this.f165973a).length());
        } else {
            C71906k.f161134a.mo113563a("output file == null");
        }
    }

    public C73927z(String str, String str2, UploadSpeedInfo uploadSpeedInfo, C73896b bVar, boolean z, boolean z2, String str3, int i, int i2, String str4, boolean z3, Object obj) {
        this.f165985m = obj;
        this.f165973a = str;
        this.f165974b = str2;
        this.f165977e = uploadSpeedInfo;
        this.f165976d = bVar;
        this.f165978f = z;
        this.f165984l = str3;
        this.f165979g = i;
        this.f165980h = str4;
        this.f165982j = z2;
        this.f165983k = i2;
        this.f165981i = z3;
    }
}
