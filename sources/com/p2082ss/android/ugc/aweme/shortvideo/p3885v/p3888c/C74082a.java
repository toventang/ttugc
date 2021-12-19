package com.p2082ss.android.ugc.aweme.shortvideo.p3885v.p3888c;

import android.os.SystemClock;
import android.util.Log;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.google.p1998c.p1999a.C27252o;
import com.kakao.usermgmt.StringSet;
import com.p2082ss.android.ugc.aweme.base.p2376g.C34588a;
import com.p2082ss.android.ugc.aweme.beauty.C34806c;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.p2341au.C33975a;
import com.p2082ss.android.ugc.aweme.p2730de.C40982q;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63238c;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63247i;
import com.p2082ss.android.ugc.aweme.property.C65357b;
import com.p2082ss.android.ugc.aweme.publish.p3619f.C65611c;
import com.p2082ss.android.ugc.aweme.publish.p3619f.C65616g;
import com.p2082ss.android.ugc.aweme.publish.p3620g.p3623c.C65630a;
import com.p2082ss.android.ugc.aweme.settings.C68743i;
import com.p2082ss.android.ugc.aweme.shortvideo.AbstractC71893j;
import com.p2082ss.android.ugc.aweme.shortvideo.C69831ai;
import com.p2082ss.android.ugc.aweme.shortvideo.C69840ar;
import com.p2082ss.android.ugc.aweme.shortvideo.C69890bl;
import com.p2082ss.android.ugc.aweme.shortvideo.C70005cr;
import com.p2082ss.android.ugc.aweme.shortvideo.C71798ef;
import com.p2082ss.android.ugc.aweme.shortvideo.C71813eq;
import com.p2082ss.android.ugc.aweme.shortvideo.SynthetiseResult;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.C70976bp;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p2082ss.android.ugc.aweme.shortvideo.p3885v.p3887b.C74080a;
import com.p2082ss.android.ugc.aweme.shortvideo.upload.C73917r;
import com.p2082ss.android.ugc.aweme.shortvideo.upload.C73920u;
import com.p2082ss.android.ugc.aweme.shortvideo.util.C73964ar;
import com.p2082ss.android.ugc.aweme.shortvideo.util.C73979bb;
import com.p2082ss.android.ugc.aweme.shortvideo.util.C74001bp;
import com.p2082ss.android.ugc.aweme.utils.C80422fe;
import com.p2082ss.android.ugc.aweme.utils.C80510gr;
import com.p2082ss.android.ugc.aweme.utils.C80540hn;
import com.p2082ss.android.ugc.aweme.video.C80720e;
import com.p2082ss.android.ugc.tools.p4344f.C84425b;
import com.p2082ss.android.ugc.tools.utils.C84896h;
import com.p2082ss.android.ugc.tools.utils.C84902i;
import com.p2082ss.android.ugc.tools.utils.C84906m;
import com.p2082ss.android.ugc.tools.utils.C84911q;
import dmt.p4542av.video.C88168aj;
import dmt.p4542av.video.C88278m;
import java.io.File;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;
import p4600h.C89378p;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.v.c.a */
public final class C74082a {

    /* renamed from: a */
    public long f166304a;

    /* renamed from: b */
    public long f166305b;

    /* renamed from: c */
    public long f166306c;

    /* renamed from: d */
    public long f166307d;

    /* renamed from: e */
    public long f166308e;

    /* renamed from: f */
    public String f166309f;

    /* renamed from: g */
    public final int f166310g;

    /* renamed from: h */
    public final int f166311h;

    /* renamed from: i */
    public SynthetiseResult f166312i;

    /* renamed from: j */
    public final String f166313j;

    /* renamed from: k */
    public double f166314k;

    /* renamed from: l */
    public long f166315l;

    /* renamed from: m */
    public String f166316m;

    /* renamed from: n */
    public final String f166317n;

    /* renamed from: o */
    public final boolean f166318o;

    /* renamed from: p */
    public C74084b f166319p;

    /* renamed from: q */
    public C71813eq f166320q;

    /* renamed from: r */
    public C74083a f166321r;

    /* renamed from: s */
    public final C74085c f166322s;

    /* renamed from: t */
    public final AbstractC71893j f166323t;

    /* renamed from: u */
    public boolean f166324u;

    /* renamed from: v */
    public boolean f166325v;

    /* renamed from: w */
    public final int f166326w;

    /* renamed from: x */
    private boolean f166327x;

    static {
        Covode.recordClassIndex(86834);
    }

    /* renamed from: a */
    public static boolean m130265a(int i) {
        return i == 1;
    }

    /* renamed from: a */
    public final void mo116472a(boolean z, Throwable th, C65616g gVar, Object obj) {
        String str = "";
        if (z) {
            C80510gr.m139545d(this.f166317n);
            try {
                m130264a(true, new C69840ar().mo110189a("resultCode", C63238c.f143575b.mo46674b(gVar)).mo110189a("args", C63238c.f143575b.mo46674b(obj)).mo110189a("result", C63238c.f143575b.mo46674b(gVar)));
            } catch (Exception e) {
                m130263a(e);
            }
        } else {
            C80510gr.m139538b(this.f166317n, C65630a.m117454c(th), th.getMessage() != null ? th.getMessage() : str);
            try {
                m130264a(false, new C69840ar().mo110189a("throwable", Log.getStackTraceString(th)).mo110189a("args", C63238c.f143575b.mo46674b(obj)).mo110189a("result", C63238c.f143575b.mo46674b(gVar)));
            } catch (Exception e2) {
                m130263a(e2);
            }
            C70005cr.m123611a().mo110449a(9);
        }
        this.f166307d = SystemClock.uptimeMillis();
        if (!m130265a(this.f166311h)) {
            C65611c cVar = null;
            if (gVar instanceof C65611c) {
                cVar = (C65611c) gVar;
            }
            C71813eq eqVar = this.f166320q;
            if (th != null) {
                str = th.toString();
            }
            eqVar.mo113472a(z, str, null, true, cVar);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.v.c.a$a */
    public static class C74083a {

        /* renamed from: a */
        public C27252o f166328a;

        /* renamed from: b */
        private Object f166329b;

        static {
            Covode.recordClassIndex(86835);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final void mo116473a() {
            if (this.f166328a.f64413a) {
                this.f166328a.mo45341c();
                C39162r.m79460a("url_upload", C69890bl.m123458a(this.f166329b).mo129406a("duration", C1764a.m5929a(Locale.US, "%.2f", new Object[]{Float.valueOf(((float) this.f166328a.mo45339a(TimeUnit.NANOSECONDS)) / 1.0E9f)})).f188764a);
            }
        }

        public C74083a(Object obj) {
            this.f166329b = obj;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.v.c.a$b */
    public static class C74084b {

        /* renamed from: a */
        public C27252o f166330a;

        static {
            Covode.recordClassIndex(86836);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final void mo116474a() {
            if (this.f166330a.f64413a) {
                this.f166330a.mo45341c();
                C39162r.m79460a("get_video_key", new C84425b().mo129406a("duration", C1764a.m5929a(Locale.US, "%.2f", new Object[]{Float.valueOf(((float) this.f166330a.mo45339a(TimeUnit.NANOSECONDS)) / 1.0E9f)})).f188764a);
            }
        }
    }

    /* renamed from: a */
    public static void m130263a(Throwable th) {
        try {
            C40982q.m82522a("aweme_upload_video_funnel", new C69840ar().mo110189a(StringSet.type, "pure_exception").mo110189a("exception", Log.getStackTraceString(th)).mo110191a());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    public final C69840ar mo116467a(C69840ar arVar) {
        if (arVar == null) {
            arVar = new C69840ar();
        }
        arVar.mo110187a("video_type", Integer.valueOf(this.f166310g)).mo110189a("item_type", this.f166323t.getClass().getSimpleName());
        return arVar;
    }

    /* renamed from: a */
    private void m130264a(boolean z, C69840ar arVar) {
        String str;
        int i;
        try {
            String stackTraceString = Log.getStackTraceString(new Exception());
            C33975a.f80359a.mo61044a("upload_video_end");
            C34588a aVar = C33975a.f80359a;
            StringBuilder sb = new StringBuilder("upload_video_end");
            if (z) {
                str = "_success";
            } else {
                str = "_failure";
            }
            aVar.mo61044a(sb.append(str).toString());
            C69840ar a = mo116467a(arVar).mo110189a(StringSet.type, "upload_video_end");
            if (z) {
                i = 0;
            } else {
                i = 1;
            }
            C40982q.m82522a("aweme_upload_video_funnel", a.mo110187a("status", Integer.valueOf(i)).mo110189a("extra", C33975a.f80359a.mo61045a()).mo110189a("stack_trace", stackTraceString).mo110191a());
            mo116468a("upload_video_end", stackTraceString);
        } catch (Exception e) {
            m130263a(e);
        }
    }

    /* renamed from: a */
    public final void mo116468a(String str, String str2) {
        JSONObject optJSONObject = C33975a.f80359a.mo61046b().optJSONObject("events");
        if (optJSONObject.optInt("upload_video_start") < optJSONObject.optInt("upload_video_end")) {
            C40982q.m82522a("aweme_upload_video_funnel", mo116467a((C69840ar) null).mo110189a(StringSet.type, str + "_abnormal_counting").mo110189a("extra", C33975a.f80359a.mo61045a()).mo110189a("stack_trace", str2).mo110191a());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.v.c.a$c */
    public class C74085c {

        /* renamed from: a */
        AbstractC71893j f166331a;

        /* renamed from: b */
        int f166332b;

        /* renamed from: c */
        String f166333c;

        /* renamed from: d */
        int f166334d;

        /* renamed from: e */
        public long f166335e;

        /* renamed from: f */
        public C27252o f166336f;

        static {
            Covode.recordClassIndex(86837);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final void mo116475a(Object obj, boolean z, boolean z2) {
            if (this.f166336f.f64413a) {
                m130274b(obj, z, z2);
                this.f166336f.mo45341c();
            }
        }

        /* renamed from: b */
        private void m130274b(Object obj, boolean z, boolean z2) {
            String str;
            C84911q.m145921a("PublishDurationMonitor LOG_END");
            long a = this.f166336f.mo45339a(TimeUnit.MILLISECONDS);
            C40982q.m82522a("type_av_compose_upload", C69890bl.m123459b(obj).mo110186a("speed", Float.valueOf((((float) this.f166331a.mo113557d(obj)) * 1.0f) / ((float) a))).mo110188a("processTime", Long.valueOf(a)).mo110191a());
            C74080a.m130261a(obj, this.f166334d, a, this.f166332b, this.f166333c, C74082a.this.f166305b, C74082a.this.f166304a, C74082a.this.f166307d, C74082a.this.f166306c, C74082a.this.f166308e, this.f166335e, z, C74082a.this.f166318o, C74082a.this.f166326w, z2, C74082a.this.f166312i, this.f166331a, C74082a.this.f166320q);
            C84911q.m145928d("PublishDurationMonitor publish_finish ".concat(String.valueOf(a)));
            if (C68743i.m121176a()) {
                C69840ar a2 = C69890bl.m123459b(obj).mo110187a("video_type", Integer.valueOf(this.f166334d));
                if (C74082a.this.f166318o) {
                    str = "1";
                } else {
                    str = "0";
                }
                C40982q.m82520a("user_publish_success_rate_parallel", 0, a2.mo110189a("retry_publish", str).mo110187a("video_upload_type", Integer.valueOf(this.f166332b)).mo110191a());
            }
        }

        C74085c(AbstractC71893j jVar, int i, String str, int i2) {
            this.f166331a = jVar;
            this.f166332b = i;
            this.f166333c = str;
            this.f166334d = i2;
        }
    }

    /* renamed from: a */
    public final void mo116470a(boolean z, C65616g gVar, Throwable th) {
        if (z) {
            C80510gr.m139546d(this.f166317n, C74001bp.m130145a(gVar));
            this.f166319p.mo116474a();
            C84911q.m145928d("Publisher create video finished.");
            return;
        }
        int a = C65630a.m117450a(th, 11);
        if (!C80422fe.m139425a(C63247i.f143610a)) {
            a = -2;
        }
        C80510gr.m139529a(this.f166317n, a, C65630a.m117455d(th), th.getMessage());
        C84911q.m145928d("Publisher create video failed.");
        C70005cr.m123611a().mo110449a(9);
    }

    /* renamed from: a */
    public final void mo116471a(boolean z, SynthetiseResult synthetiseResult, Throwable th, Object obj) {
        String str;
        String str2;
        String str3;
        long j;
        String e;
        String str4;
        String str5;
        String th2;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        String str6;
        long j2;
        this.f166325v = true;
        if (synthetiseResult != null) {
            str = "encode:" + synthetiseResult.synthetiseCPUEncode;
        } else {
            str = "";
        }
        if (z) {
            C80510gr.m139544c(this.f166317n, str);
            C84911q.m145928d("Publisher synthetise() finished, result = ".concat(String.valueOf(synthetiseResult)));
            this.f166312i = synthetiseResult;
        } else {
            C80510gr.m139528a(this.f166317n, C65630a.m117453b(th), th.getMessage());
            C84911q.m145928d("Publisher synthetise failed");
            C70005cr.m123611a().mo110449a(9);
        }
        C84425b bVar = new C84425b();
        if (z) {
            str2 = "success_synthetise";
        } else {
            str2 = "failed_synthetise";
        }
        C84425b a = bVar.mo129406a("scene", str2).mo129406a("shoot_way", this.f166313j);
        if (z) {
            str3 = "success";
        } else {
            str3 = "failed";
        }
        C39162r.m79460a("av_memory_log", a.mo129406a("synthetise_start", str3).mo129404a("dalvikPss", C73964ar.f166038a.f166040c).mo129404a("nativePss", C73964ar.f166038a.f166041d).mo129404a("otherPss", C73964ar.f166038a.f166043f).mo129404a("totalPss", C73964ar.f166038a.f166042e).f188764a);
        this.f166305b = SystemClock.uptimeMillis();
        long j3 = 0;
        if (this.f166315l > 0) {
            j = C80540hn.f180153b.mo45347a() - this.f166315l;
        } else {
            j = 0;
        }
        this.f166315l = j;
        Locale locale = Locale.US;
        double d = (double) this.f166315l;
        Double.isNaN(d);
        String a2 = C1764a.m5929a(locale, "%d", new Object[]{Integer.valueOf((int) (d / 1000000.0d))});
        C84425b a3 = new C84425b().mo129406a("duration", a2).mo129406a("status", String.valueOf(z ? 1 : 0));
        if ("upload".equals(this.f166309f)) {
            e = C65357b.m117050f();
        } else {
            e = C65357b.m117049e();
        }
        C84425b a4 = a3.mo129406a("resolution", e);
        if (C65357b.m117043a()) {
            str4 = "1";
        } else {
            str4 = "0";
        }
        C84425b a5 = a4.mo129406a("is_hardcode", str4).mo129406a("bite_rate", new StringBuilder().append(C65357b.m117047c()).toString()).mo129406a("video_quality", new StringBuilder().append(C65357b.m117048d()).toString()).mo129406a("_perf_monitor", "1").mo129406a("fps", new StringBuilder().append(this.f166314k).toString()).mo129403a("is_hd_setting", C88278m.m153408a(obj) ? 1 : 0);
        if (this.f166324u) {
            str5 = "homepage_follow";
        } else {
            str5 = "video_post_page";
        }
        C84425b a6 = a5.mo129406a("current_page", str5);
        if (th == null) {
            th2 = null;
        } else {
            th2 = th.toString();
        }
        a6.mo129406a("fail_info", th2);
        if (th instanceof C71798ef) {
            a6.mo129406a("error_code", new StringBuilder().append(((C71798ef) th).getCode()).toString());
        }
        if (this.f166310g == 0) {
            VideoPublishEditModel videoPublishEditModel = (VideoPublishEditModel) obj;
            if (C84902i.m145892a(videoPublishEditModel.mOutputFile)) {
                j3 = C84896h.m145876i(videoPublishEditModel.mOutputFile);
                i2 = C88168aj.m153239c(videoPublishEditModel.mOutputFile);
                if (!(synthetiseResult == null || synthetiseResult.outputVideoFileInfo == null)) {
                    i3 = synthetiseResult.outputVideoFileInfo.getCodecType();
                    i4 = synthetiseResult.outputVideoFileInfo.getGop();
                }
                i3 = -1;
                i4 = -1;
            } else {
                i2 = 0;
                i3 = -1;
                i4 = -1;
            }
            int[] a7 = C73979bb.m130117a(videoPublishEditModel.getPreviewInfo());
            if (a7 != null) {
                i5 = a7[8];
            } else {
                i5 = -1;
            }
            C89378p<Integer, Integer> a8 = C84906m.m145912a(videoPublishEditModel);
            if (a8.getFirst().intValue() + a8.getSecond().intValue() > 1) {
                i6 = 1;
            } else if (a8.getFirst().intValue() + a8.getSecond().intValue() == 1) {
                i6 = 0;
            } else {
                i6 = -1;
            }
            this.f166327x = videoPublishEditModel.isSyntheticHardEncode;
            if (videoPublishEditModel.isSyntheticHardEncode) {
                str6 = "hardcoding";
            } else {
                str6 = "softcoding";
            }
            a6.mo129406a("compose_coding", str6).mo129403a("file_bitrate", i2).mo129406a("file_size", C1764a.m5929a(Locale.US, "%d", new Object[]{Long.valueOf(j3 / 1024)})).mo129403a("codec_type", i3).mo129403a("gop", i4).mo129403a("source_codec_type", i5).mo129406a("original_resolution", C70976bp.m125319o(videoPublishEditModel)).mo129403a("is_multi_content", i6);
            if (C80720e.m139927b(videoPublishEditModel.getLocalTempPath())) {
                j3 += new File(videoPublishEditModel.getLocalTempPath()).length();
            }
            if (videoPublishEditModel.getLocalFinalPath() != null) {
                j3 += C84896h.m145876i(videoPublishEditModel.getLocalFinalPath());
            }
            C73917r.m130008a(this.f166316m, j3);
            C73920u.C73921a a9 = C73917r.m130006a();
            if (a9 != null) {
                a6.mo129403a("init_available_size_mb", (int) a9.f165958a).mo129403a("max_publish_usage_mb", (int) a9.f165959b).mo129406a("available_size_detail", a9.f165960c);
            }
            a6.mo129405a("select_gear_by_upload_speed", videoPublishEditModel.getUploadSpeedSettingsIndex());
            C84425b a10 = a6.mo129406a("creation_id", videoPublishEditModel.creationId).mo129406a("filter_id_list", VideoPublishEditModel.translateNullFilter(videoPublishEditModel.mCurFilterIds)).mo129406a("effect_list", videoPublishEditModel.getEditEffectList()).mo129406a("info_sticker_list", videoPublishEditModel.getInfoStickerList()).mo129406a("prop_list", videoPublishEditModel.mStickerID).mo129403a("publish_type", this.f166326w).mo129407a("beautify_used", videoPublishEditModel.faceBeautyOpen).mo129406a("publish_id", this.f166317n).mo129406a("beautify_info", C34806c.f82228a).mo129406a("content_type", videoPublishEditModel.getAvetParameter().getContentType()).mo129403a("is_hd_video", C88278m.m153410b(videoPublishEditModel) ? 1 : 0).mo129406a("content_source", videoPublishEditModel.getAvetParameter().getContentSource());
            if (synthetiseResult != null) {
                j2 = synthetiseResult.outputVideoFileInfo.getDuration();
            } else {
                j2 = -1;
            }
            a10.mo129404a("source_duration", j2);
            C74080a.m130259a(a6, synthetiseResult, obj);
            if (videoPublishEditModel.hardcodeAdaptiveResult != null) {
                a6.mo129405a("hw_opt_bitrate_set_result", Float.valueOf(videoPublishEditModel.hardcodeAdaptiveResult.getHwOptBitrate()));
                a6.mo129405a("pre_bitrate_status", Float.valueOf(videoPublishEditModel.hardcodeAdaptiveResult.getPreBitrateStatus()));
            }
        }
        if (C63244g.m114602a().mo73287o().mo104784d()) {
            i = C63244g.m114602a().mo73287o().mo104785e();
        } else {
            i = 0;
        }
        a6.mo129403a("publish_cnt", i);
        C39162r.m79460a("video_compose_end", a6.f188764a);
        C84911q.m145928d("Publisher uploadSynthetiseEndEvent: ".concat(String.valueOf(a2)));
    }

    /* renamed from: a */
    public final void mo116469a(boolean z, C65616g gVar, C69831ai aiVar, Throwable th, Object obj, boolean z2) {
        if (z) {
            this.f166308e = SystemClock.uptimeMillis();
            C80510gr.m139547e(this.f166317n);
            aiVar.materialId = gVar.f147920i;
            C63238c.f143593t.mo93791a("mus_af_post_video");
            this.f166321r.mo116473a();
            C70005cr.m123611a().mo110449a(10);
            this.f166322s.mo116475a(obj, z2, this.f166327x);
            return;
        }
        int a = C65630a.m117450a(th, 13);
        if (!C80422fe.m139425a(C63247i.f143610a)) {
            a = -2;
        }
        C80510gr.m139543c(this.f166317n, a, C65630a.m117455d(th));
        C70005cr.m123611a().mo110449a(9);
    }

    public C74082a(AbstractC71893j jVar, int i, int i2, int i3, String str, String str2, boolean z) {
        this.f166323t = jVar;
        this.f166313j = str2;
        this.f166310g = i2;
        this.f166311h = i3;
        this.f166318o = z;
        this.f166317n = str;
        this.f166326w = i;
        this.f166322s = new C74085c(jVar, i3, str2, i2);
    }
}
