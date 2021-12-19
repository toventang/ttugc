package com.p2082ss.android.ugc.aweme.shortvideo.upload;

import com.bytedance.apm.C12290b;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.p1998c.p2006h.p2007a.AbstractC27645k;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63247i;
import com.p2082ss.android.ugc.aweme.publish.p3619f.C65614f;
import com.p2082ss.android.ugc.aweme.publish.p3619f.C65616g;
import com.p2082ss.android.ugc.aweme.publish.p3620g.C65622b;
import com.p2082ss.android.ugc.aweme.publish.p3620g.p3622b.C65623a;
import com.p2082ss.android.ugc.aweme.publish.p3620g.p3623c.C65630a;
import com.p2082ss.android.ugc.aweme.settings.C68743i;
import com.p2082ss.android.ugc.aweme.shortvideo.C69840ar;
import com.p2082ss.android.ugc.aweme.shortvideo.C69890bl;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p2082ss.android.ugc.aweme.shortvideo.p3858s.C72829c;
import com.p2082ss.android.ugc.aweme.shortvideo.publish.EnumC72679r;
import com.p2082ss.android.ugc.aweme.shortvideo.publish.EnumC72680s;
import com.p2082ss.android.ugc.aweme.shortvideo.publish.EnumC72682u;
import com.p2082ss.android.ugc.aweme.shortvideo.upload.p3884d.C73896b;
import com.p2082ss.android.ugc.aweme.shortvideo.util.C74001bp;
import com.p2082ss.android.ugc.tools.p4344f.C84425b;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.upload.k */
public final class C73909k implements AbstractC27645k<C65616g> {

    /* renamed from: a */
    private final String f165934a;

    /* renamed from: b */
    private boolean f165935b;

    /* renamed from: c */
    private boolean f165936c;

    /* renamed from: d */
    private final boolean f165937d;

    /* renamed from: e */
    private final boolean f165938e;

    /* renamed from: f */
    private final C73896b f165939f;

    /* renamed from: g */
    private final VideoPublishEditModel f165940g;

    static {
        Covode.recordClassIndex(86655);
    }

    /* renamed from: a */
    public final synchronized boolean mo116348a() {
        MethodCollector.m26663i(10142);
        this.f165935b = true;
        if (!this.f165936c) {
            MethodCollector.m26664o(10142);
            return true;
        }
        MethodCollector.m26664o(10142);
        return false;
    }

    /* renamed from: a */
    private C65622b m129989a(C69840ar arVar) {
        return new C65622b(arVar).mo104805a(this.f165934a).mo104802a(this.f165940g).mo104803a(EnumC72679r.AUTH_KEY).mo104804a(EnumC72682u.VIDEO).mo104800a().mo104808b().mo104806a(this.f165937d);
    }

    @Override // com.google.p1998c.p2006h.p2007a.AbstractC27645k
    public final synchronized void onFailure(Throwable th) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        MethodCollector.m26663i(9993);
        int a = C65630a.m117450a(th, 11);
        C69840ar a2 = m129989a(new C69840ar()).mo104809c().mo104801a(new C65623a(th)).mo104807a(EnumC72680s.FAILED);
        int i = 1;
        if (C68743i.m121176a()) {
            if (this.f165939f.f165913g) {
                str5 = "1";
            } else {
                str5 = "0";
            }
            C12290b.m22060a("fetch_upload_parameters_error_parallel", 1, a2.mo110189a("click_publish", str5).mo110191a());
        }
        this.f165936c = true;
        if (!this.f165935b) {
            if (this.f165939f.f165913g) {
                str = "1";
            } else {
                str = "0";
            }
            C69840ar a3 = a2.mo110189a("click_publish", str);
            if (!this.f165938e) {
                i = 0;
            }
            C12290b.m22060a("aweme_movie_publish_error_rate_parallel", a, a3.mo110187a("is_hd_video", Integer.valueOf(i)).mo110191a());
            String d = C65630a.m117455d(th);
            C84425b a4 = C69890bl.m123458a(this.f165940g).mo129403a("status", a).mo129406a("shoot_way", this.f165940g.mShootWay);
            if (this.f165937d) {
                str2 = "1";
            } else {
                str2 = "0";
            }
            C84425b a5 = a4.mo129406a("retry_publish", str2).mo129403a("publish_step", 21).mo129403a("error_code", C65630a.m117450a(th, 11)).mo129406a("server_log_id", d);
            if (this.f165939f.f165913g) {
                str3 = "1";
            } else {
                str3 = "0";
            }
            C84425b a6 = a5.mo129406a("click_publish", str3);
            if (C72829c.m128602a(C63247i.f143610a)) {
                str4 = "1";
            } else {
                str4 = "0";
            }
            C39162r.m79460a("parallel_publish_result", a6.mo129406a("network_available", str4).mo129406a("publish_id", this.f165934a).f188764a);
        }
        MethodCollector.m26664o(9993);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.google.p1998c.p2006h.p2007a.AbstractC27645k
    public final /* synthetic */ void onSuccess(C65616g gVar) {
        String str;
        String str2;
        C65616g gVar2 = gVar;
        JSONObject a = m129989a(new C69840ar()).mo104809c().mo104807a(EnumC72680s.SUCCESS).mo110191a();
        if (C68743i.m121176a()) {
            C12290b.m22060a("fetch_upload_parameters_error_parallel", 0, a);
        }
        C12290b.m22060a("aweme_movie_publish_error_rate_parallel", 0, a);
        C84425b a2 = C69890bl.m123458a(this.f165940g).mo129403a("mob_lost_assist", 1).mo129406a("shoot_way", this.f165940g.mShootWay);
        if (this.f165937d) {
            str = "1";
        } else {
            str = "0";
        }
        C84425b a3 = a2.mo129406a("retry_publish", str).mo129403a("status", 81).mo129403a("publish_step", 21);
        C65614f b = C74001bp.m130146b(gVar2);
        if (b == null || (str2 = b.toString()) == null) {
            str2 = "";
        }
        C39162r.m79460a("parallel_publish_result", a3.mo129406a("auth_key", str2).mo129406a("publish_id", this.f165934a).f188764a);
    }

    public C73909k(String str, boolean z, boolean z2, boolean z3, VideoPublishEditModel videoPublishEditModel, C73896b bVar) {
        String str2;
        this.f165934a = str;
        this.f165935b = z;
        this.f165937d = z2;
        this.f165938e = z3;
        this.f165939f = bVar;
        this.f165940g = videoPublishEditModel;
        C12290b.m22060a("aweme_movie_publish_error_rate_parallel", -1, m129989a(new C69840ar()).mo104809c().mo104807a(EnumC72680s.START).mo110187a("is_hd_video", Integer.valueOf(z3 ? 1 : 0)).mo110191a());
        C84425b a = C69890bl.m123458a(videoPublishEditModel).mo129403a("status", -1).mo129406a("shoot_way", videoPublishEditModel.mShootWay);
        if (z2) {
            str2 = "1";
        } else {
            str2 = "0";
        }
        C39162r.m79460a("parallel_publish_result", a.mo129406a("retry_publish", str2).mo129403a("publish_step", 20).mo129406a("publish_id", str).f188764a);
    }
}
