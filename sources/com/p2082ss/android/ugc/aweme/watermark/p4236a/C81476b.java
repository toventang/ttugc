package com.p2082ss.android.ugc.aweme.watermark.p4236a;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.common.utility.C13607d;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.p1445a.p1454g.p1455a.C20198c;
import com.facebook.p1902j.p1903a.C24801b;
import com.p2082ss.android.ugc.aweme.base.utils.C34719f;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.feed.model.Video;
import com.p2082ss.android.ugc.aweme.lancet.C58029j;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;
import com.p2082ss.android.ugc.aweme.p2719cv.C40780g;
import com.p2082ss.android.ugc.aweme.p2730de.C40969d;
import com.p2082ss.android.ugc.aweme.p2730de.C40970e;
import com.p2082ss.android.ugc.aweme.p2730de.C40972g;
import com.p2082ss.android.ugc.aweme.p2730de.C40982q;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63238c;
import com.p2082ss.android.ugc.aweme.shortvideo.C69840ar;
import com.p2082ss.android.ugc.aweme.shortvideo.C70637di;
import com.p2082ss.android.ugc.aweme.shortvideo.C70638dj;
import com.p2082ss.android.ugc.aweme.shortvideo.p3793af.p3794a.AbstractC69815a;
import com.p2082ss.android.ugc.aweme.shortvideo.p3793af.p3794a.AbstractC69820d;
import com.p2082ss.android.ugc.aweme.shortvideo.p3793af.p3794a.AbstractC69822f;
import com.p2082ss.android.ugc.aweme.shortvideo.p3793af.p3794a.C69816b;
import com.p2082ss.android.ugc.aweme.video.C80720e;
import com.p2082ss.android.ugc.aweme.watermark.C81502l;
import com.p2082ss.android.ugc.aweme.watermark.C81505o;
import com.p2082ss.android.ugc.aweme.watermark.C81506p;
import com.p2082ss.android.ugc.tools.p4340c.C84402a;
import com.p2082ss.android.ugc.tools.p4344f.C84425b;
import com.p2082ss.android.ugc.tools.utils.C84896h;
import com.p2082ss.android.ugc.tools.utils.C84902i;
import com.p2082ss.android.vesdk.C85581w;
import com.p2082ss.android.vesdk.VEUtils;
import java.io.File;
import org.json.JSONObject;
import p077b.C1731i;

/* renamed from: com.ss.android.ugc.aweme.watermark.a.b */
public final class C81476b implements AbstractC81475a {

    /* renamed from: a */
    public static final String f182137a;

    /* renamed from: i */
    private static final String f182138i;

    /* renamed from: b */
    public final Context f182139b;

    /* renamed from: c */
    public String f182140c;

    /* renamed from: d */
    public C81506p f182141d;

    /* renamed from: e */
    private long f182142e = -1;

    /* renamed from: f */
    private String f182143f;

    /* renamed from: g */
    private String f182144g;

    /* renamed from: h */
    private JSONObject f182145h;

    /* renamed from: j */
    private boolean f182146j;

    /* renamed from: k */
    private boolean f182147k;

    /* renamed from: l */
    private String f182148l;

    /* renamed from: m */
    private long f182149m;

    /* renamed from: n */
    private AbstractC69822f f182150n;

    /* renamed from: o */
    private AbstractC69815a f182151o;

    /* renamed from: p */
    private VEUtils.VEVideoFileInfo f182152p;

    /* renamed from: f */
    private static boolean m141268f() {
        try {
            return C34719f.C34720a.f82009a.mo61395c();
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.watermark.p4236a.AbstractC81475a
    /* renamed from: a */
    public final void mo125182a() {
        this.f182146j = true;
        this.f182147k = true;
        mo125189d();
        AbstractC69822f fVar = this.f182150n;
        if (fVar != null) {
            fVar.mo110167a();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final void mo125189d() {
        this.f182140c = null;
        this.f182148l = null;
        AbstractC69815a aVar = this.f182151o;
        if (aVar != null) {
            aVar.mo110165b();
        }
    }

    public C81476b() {
        Context applicationContext = C63238c.f143574a.getApplicationContext();
        if (C58003a.f132201c && applicationContext == null) {
            applicationContext = C58003a.f132199a;
        }
        this.f182139b = applicationContext;
        C80720e.m139917a(f182137a, false);
    }

    /* renamed from: c */
    public static boolean m141266c() {
        if (C58029j.f132253e && C58029j.m104846b() && !C58029j.m104847c()) {
            return C58029j.f132253e;
        }
        boolean f = m141268f();
        C58029j.f132253e = f;
        return f;
    }

    static {
        Covode.recordClassIndex(94849);
        String str = C70637di.f158101d + "share/";
        f182138i = str;
        f182137a = str + "pic/";
    }

    /* renamed from: e */
    private void m141267e() {
        String str = this.f182140c;
        if (str == null || !C84902i.m145892a(str)) {
            final String h = this.f182141d.f182237c.mo58665h();
            try {
                C84402a.m145177a(this.f182141d.f182237c.mo58664g(), new C84402a.AbstractC84406b() {
                    /* class com.p2082ss.android.ugc.aweme.watermark.p4236a.C81476b.C814782 */

                    static {
                        Covode.recordClassIndex(94851);
                    }

                    @Override // com.p2082ss.android.ugc.tools.p4340c.C84402a.AbstractC84406b
                    /* renamed from: a */
                    public final void mo88264a(Exception exc) {
                    }

                    /* JADX WARNING: Removed duplicated region for block: B:54:0x0274  */
                    /* JADX WARNING: Removed duplicated region for block: B:56:0x027e  */
                    /* JADX WARNING: Removed duplicated region for block: B:58:0x02a4  */
                    @Override // com.p2082ss.android.ugc.tools.p4340c.C84402a.AbstractC84406b
                    /* renamed from: a */
                    /* Code decompiled incorrectly, please refer to instructions dump. */
                    public final void mo88263a(com.facebook.p1844d.AbstractC24157c<com.facebook.common.p1836h.C24117a<com.facebook.imagepipeline.p1885j.AbstractC24454c>> r29) {
                        /*
                        // Method dump skipped, instructions count: 768
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.watermark.p4236a.C81476b.C814782.mo88263a(com.facebook.d.c):void");
                    }
                });
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.watermark.p4236a.AbstractC81475a
    /* renamed from: b */
    public final void mo125184b() {
        C81506p pVar = this.f182141d;
        if (pVar != null) {
            if (pVar.f182239e) {
                m141269g();
                this.f182151o.mo110164a(true, this.f182141d.f182237c);
                this.f182151o.mo110164a(false, this.f182141d.f182237c);
            }
            if (this.f182141d.f182242h && C63238c.f143582i.mo93760b()) {
                m141267e();
            }
        }
    }

    /* renamed from: g */
    private void m141269g() {
        int i;
        C81506p pVar = this.f182141d;
        if (pVar != null && pVar.f182238d != null && this.f182151o == null) {
            if (this.f182141d.f182242h) {
                i = 2;
            } else {
                i = -1;
            }
            int width = this.f182141d.f182238d.getWidth();
            int height = this.f182141d.f182238d.getHeight();
            this.f182151o = C81502l.m141336a(i, this.f182141d.f182238d.getPlayAddrH264().getBitRatedRatioUri(), false, new int[]{width, height});
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.watermark.p4236a.AbstractC81475a
    /* renamed from: b */
    public final void mo125185b(C81506p pVar) {
        this.f182141d = pVar;
    }

    /* renamed from: a */
    private C85581w.EnumC85613l m141265a(int[] iArr) {
        C85581w.EnumC85613l lVar;
        if (C63238c.f143582i.mo93759a() == 0 && this.f182141d.f182242h) {
            try {
                iArr[0] = Integer.parseInt(C84896h.m145872e(this.f182141d.f182235a).extractMetadata(18));
            } catch (Exception unused) {
                iArr[0] = 560;
            }
            lVar = C85581w.EnumC85613l.VIDEO_OUT_RATIO_1_1;
        } else if (C63238c.f143582i.mo93759a() != 1 || !this.f182141d.f182242h) {
            lVar = C85581w.EnumC85613l.VIDEO_OUT_RATIO_ORIGINAL;
        } else {
            lVar = C85581w.EnumC85613l.VIDEO_OUT_RATIO_16_9;
        }
        if (this.f182141d.f182244j) {
            return C85581w.EnumC85613l.VIDEO_OUT_RATIO_16_9;
        }
        return lVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.watermark.p4236a.AbstractC81475a
    /* renamed from: a */
    public final void mo125183a(C81506p pVar) {
        boolean z;
        boolean z2;
        this.f182141d = pVar;
        C20198c.m38191a(pVar.f182235a, "inputPath can't be null");
        C20198c.m38191a(this.f182141d.f182236b, "outPath can't be null");
        C20198c.m38191a(this.f182141d.f182237c, "author can't be null");
        C20198c.m38191a(this.f182141d.f182238d, "video can't be null");
        boolean z3 = true;
        if (this.f182141d.f182239e || this.f182141d.f182240f || this.f182141d.f182249o) {
            z = true;
        } else {
            z = false;
        }
        C20198c.m38192a(z, "watermark invoked with error parameters");
        File file = new File(this.f182141d.f182236b);
        File parentFile = file.getParentFile();
        if (parentFile.isDirectory() || parentFile.mkdirs()) {
            z2 = true;
        } else {
            z2 = false;
        }
        C20198c.m38192a(z2, "create output dir failed \noutPath = " + this.f182141d.f182236b + "\noutPath isExist = " + file.exists() + "\noutPath isfile =  " + file.isFile() + "\noutDir  = " + parentFile.getPath() + "\noutDir.isDirectory() = " + parentFile.isDirectory() + "\noutDir.mkdirs() = " + parentFile.mkdirs());
        boolean z4 = this.f182141d.f182239e;
        if (!this.f182141d.f182245k) {
            z3 = this.f182141d.f182240f;
        } else if (!this.f182141d.f182242h || !C63238c.f143582i.mo93760b()) {
            z3 = false;
        }
        VEUtils.VEVideoFileInfo videoFileInfo = VEUtils.getVideoFileInfo(this.f182141d.f182235a.toString());
        this.f182152p = videoFileInfo;
        if (videoFileInfo == null) {
            if (this.f182141d.f182241g != null) {
                this.f182141d.f182241g.mo125228b(-1);
            } else {
                return;
            }
        }
        this.f182146j = false;
        this.f182147k = false;
        C1731i.m5640b(new CallableC81479c(this, z4, this.f182141d.f182249o, z3), C40780g.m82241a());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ Void mo125186a(boolean z, boolean z2, boolean z3) {
        boolean z4;
        this.f182149m = System.currentTimeMillis();
        this.f182142e = System.currentTimeMillis();
        this.f182143f = "download_time";
        this.f182144g = "add_watermark";
        this.f182145h = null;
        Video video = this.f182141d.f182238d;
        int width = video.getWidth();
        int height = video.getHeight();
        if (z || z2) {
            z4 = true;
        } else {
            z4 = false;
        }
        C81505o a = m141264a(z4, z3, new int[]{width, height});
        if (a == null) {
            mo125187a(-1, 0, "create VideoWatermarkParam error");
            return null;
        }
        if (this.f182150n == null) {
            this.f182150n = new C69816b(C70638dj.f158102e + C13607d.m24442b(this.f182141d.f182235a.toString()));
        }
        this.f182150n.mo110169a(a, new AbstractC69820d() {
            /* class com.p2082ss.android.ugc.aweme.watermark.p4236a.C81476b.C814771 */

            static {
                Covode.recordClassIndex(94850);
            }

            @Override // com.p2082ss.android.ugc.aweme.shortvideo.p3793af.p3794a.AbstractC69820d
            /* renamed from: a */
            public final void mo110171a() {
                C81476b.this.mo125188a(true, -1, -1, null);
                C81476b bVar = C81476b.this;
                bVar.mo125189d();
                if (bVar.f182141d.f182241g != null) {
                    bVar.f182141d.f182241g.mo125227a(bVar.f182141d.f182236b);
                }
                if (C81476b.m141266c()) {
                    C40982q.m82520a("aweme_download_synthesis_error_rate", 0, (JSONObject) null);
                    C39162r.m79460a("add_watermark", new C84425b().mo129406a("enter_from", "download_video").f188764a);
                }
            }

            @Override // com.p2082ss.android.ugc.aweme.shortvideo.p3793af.p3794a.AbstractC69820d
            /* renamed from: a */
            public final void mo110172a(float f) {
                if (C81476b.this.f182141d.f182241g != null) {
                    C81476b.this.f182141d.f182241g.mo125226a((int) (f * 100.0f));
                }
            }

            @Override // com.p2082ss.android.ugc.aweme.shortvideo.p3793af.p3794a.AbstractC69820d
            /* renamed from: a */
            public final void mo110173a(int i, String str, int i2) {
                C81476b.this.mo125187a(i, i2, str);
                C81476b.this.mo125188a(false, i, i2, str);
            }
        });
        return null;
    }

    /* renamed from: a */
    public final void mo125187a(int i, int i2, String str) {
        mo125189d();
        if (this.f182141d.f182241g != null) {
            this.f182141d.f182241g.mo125228b(i2);
        }
        if (!this.f182146j) {
            this.f182146j = true;
            C40969d.m82483a("mTmpPath", this.f182141d.f182235a.toString());
            C40969d.m82483a("mOutPath", this.f182141d.f182236b);
            C40970e.m82487a((Throwable) new Exception("WaterMarkComposer ret: ".concat(String.valueOf(i))));
            if (m141266c()) {
                C40982q.m82520a("aweme_download_synthesis_error_rate", 1, (JSONObject) null);
            }
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("netWorkQuality", C24801b.C24802a.f58850a.mo40614a().toString());
                jSONObject.put("netWorkSpeed", (int) C24801b.C24802a.f58850a.mo40616b());
                jSONObject.put("ret", i);
                jSONObject.put("ext", i2);
                jSONObject.put("msg", str);
                C40982q.m82521a("aweme_movie_synthesis_log", "video_download_compose", jSONObject);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:79:0x02fd  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x0339  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0350  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private com.p2082ss.android.ugc.aweme.watermark.C81505o m141264a(boolean r24, boolean r25, int[] r26) {
        /*
        // Method dump skipped, instructions count: 857
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.watermark.p4236a.C81476b.m141264a(boolean, boolean, int[]):com.ss.android.ugc.aweme.watermark.o");
    }

    /* renamed from: a */
    public final void mo125188a(boolean z, int i, int i2, String str) {
        boolean z2;
        if (!this.f182147k) {
            this.f182147k = true;
            long currentTimeMillis = System.currentTimeMillis() - this.f182149m;
            long i3 = C84896h.m145876i(this.f182141d.f182235a);
            if (!C84896h.f189732b || !C84896h.m145869b(this.f182141d.f182235a)) {
                z2 = TextUtils.equals(C40972g.m82493b(new File(this.f182141d.f182235a).getPath()), "20");
            } else {
                z2 = C84896h.m145875h(this.f182141d.f182235a).endsWith("/mp4");
            }
            if (z) {
                C40982q.m82520a("save_video_success_rate", 0, new C69840ar().mo110188a("watermark_duration", Long.valueOf(currentTimeMillis)).mo110188a("download_rate", Long.valueOf(this.f182141d.f182247m)).mo110188a("download_duration", Long.valueOf(this.f182141d.f182248n)).mo110185a("isInstagram", Boolean.valueOf(this.f182141d.f182242h)).mo110188a("file_size", Long.valueOf(i3)).mo110189a("url", this.f182141d.f182246l).mo110185a("needWaterMark", (Boolean) true).mo110189a("ret", "null").mo110189a("ext", "null").mo110189a("msg", "null").mo110185a("isMp4", Boolean.valueOf(z2)).mo110191a());
            } else {
                C40982q.m82520a("save_video_success_rate", 2, new C69840ar().mo110188a("watermark_duration", Long.valueOf(currentTimeMillis)).mo110188a("download_rate", Long.valueOf(this.f182141d.f182247m)).mo110188a("download_duration", Long.valueOf(this.f182141d.f182248n)).mo110185a("isInstagram", Boolean.valueOf(this.f182141d.f182242h)).mo110188a("file_size", Long.valueOf(i3)).mo110189a("url", this.f182141d.f182246l).mo110185a("needWaterMark", (Boolean) true).mo110187a("ret", Integer.valueOf(i)).mo110187a("ext", Integer.valueOf(i2)).mo110189a("msg", str).mo110185a("isMp4", Boolean.valueOf(z2)).mo110191a());
            }
        }
    }
}
