package com.p2082ss.android.ugc.aweme.watermark.p4236a;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.TextUtils;
import com.bytedance.common.utility.C13607d;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.facebook.p1902j.p1903a.C24801b;
import com.p2082ss.android.ugc.aweme.base.utils.C34719f;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.lancet.C58029j;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;
import com.p2082ss.android.ugc.aweme.p2719cv.C40780g;
import com.p2082ss.android.ugc.aweme.p2730de.C40969d;
import com.p2082ss.android.ugc.aweme.p2730de.C40970e;
import com.p2082ss.android.ugc.aweme.p2730de.C40972g;
import com.p2082ss.android.ugc.aweme.p2730de.C40978m;
import com.p2082ss.android.ugc.aweme.p2730de.C40982q;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63238c;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.aweme.shortvideo.C69840ar;
import com.p2082ss.android.ugc.aweme.shortvideo.C70637di;
import com.p2082ss.android.ugc.aweme.shortvideo.C70638dj;
import com.p2082ss.android.ugc.aweme.shortvideo.p3793af.p3794a.AbstractC69815a;
import com.p2082ss.android.ugc.aweme.shortvideo.p3793af.p3794a.AbstractC69820d;
import com.p2082ss.android.ugc.aweme.shortvideo.p3793af.p3794a.AbstractC69822f;
import com.p2082ss.android.ugc.aweme.shortvideo.p3793af.p3794a.C69818c;
import com.p2082ss.android.ugc.aweme.video.C80720e;
import com.p2082ss.android.ugc.aweme.watermark.C81488b;
import com.p2082ss.android.ugc.aweme.watermark.C81502l;
import com.p2082ss.android.ugc.aweme.watermark.C81504n;
import com.p2082ss.android.ugc.aweme.watermark.C81505o;
import com.p2082ss.android.ugc.aweme.watermark.C81506p;
import com.p2082ss.android.ugc.tools.p4344f.C84425b;
import com.p2082ss.android.ugc.tools.utils.C84896h;
import com.p2082ss.android.ugc.tools.utils.C84911q;
import com.p2082ss.android.vesdk.C85581w;
import com.p2082ss.android.vesdk.EnumC85399bi;
import com.p2082ss.android.vesdk.VEUtils;
import com.p2082ss.android.vesdk.VEVideoEncodeSettings;
import com.p2082ss.android.vesdk.VEWatermarkParam;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;
import p077b.C1731i;
import p4600h.C89391z;

/* renamed from: com.ss.android.ugc.aweme.watermark.a.d */
public final class C81480d implements AbstractC81475a {

    /* renamed from: d */
    private static final String f182160d;

    /* renamed from: e */
    private static final String f182161e;

    /* renamed from: a */
    final Context f182162a;

    /* renamed from: b */
    public C81506p f182163b;

    /* renamed from: c */
    long f182164c;

    /* renamed from: f */
    private boolean f182165f;

    /* renamed from: g */
    private boolean f182166g;

    /* renamed from: h */
    private AbstractC69822f f182167h;

    /* renamed from: i */
    private AbstractC69815a f182168i;

    /* renamed from: j */
    private VEUtils.VEVideoFileInfo f182169j;

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final void mo125194d() {
        AbstractC69815a aVar = this.f182168i;
        if (aVar != null) {
            aVar.mo110165b();
        }
    }

    /* renamed from: e */
    private static boolean m141285e() {
        try {
            return C34719f.C34720a.f82009a.mo61395c();
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.watermark.p4236a.AbstractC81475a
    /* renamed from: a */
    public final void mo125182a() {
        this.f182165f = true;
        this.f182166g = true;
        mo125194d();
        AbstractC69822f fVar = this.f182167h;
        if (fVar != null) {
            fVar.mo110167a();
        }
    }

    public C81480d() {
        Context applicationContext = C63238c.f143574a.getApplicationContext();
        if (C58003a.f132201c && applicationContext == null) {
            applicationContext = C58003a.f132199a;
        }
        this.f182162a = applicationContext;
        C80720e.m139917a(f182161e, false);
    }

    /* renamed from: c */
    public static boolean m141284c() {
        if (C58029j.f132253e && C58029j.m104846b() && !C58029j.m104847c()) {
            return C58029j.f132253e;
        }
        boolean e = m141285e();
        C58029j.f132253e = e;
        return e;
    }

    static {
        Covode.recordClassIndex(94853);
        String str = C70637di.f158101d + "share/";
        f182160d = str;
        f182161e = str + "pic/";
    }

    /* renamed from: f */
    private void m141286f() {
        int i;
        C81506p pVar = this.f182163b;
        if (pVar != null && pVar.f182238d != null && this.f182168i == null) {
            if (this.f182163b.f182242h) {
                i = 2;
            } else {
                i = -1;
            }
            int width = this.f182163b.f182238d.getWidth();
            int height = this.f182163b.f182238d.getHeight();
            this.f182168i = C81502l.m141336a(i, this.f182163b.f182238d.getPlayAddrH264().getBitRatedRatioUri(), false, new int[]{width, height});
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.watermark.p4236a.AbstractC81475a
    /* renamed from: b */
    public final void mo125184b() {
        C81506p pVar;
        C81506p pVar2 = this.f182163b;
        if (pVar2 != null) {
            if (pVar2.f182239e) {
                m141286f();
                this.f182168i.mo110164a(true, this.f182163b.f182237c);
                this.f182168i.mo110164a(false, this.f182163b.f182237c);
            }
            if (this.f182163b.f182242h && C63238c.f143582i.mo93760b() && this.f182162a != null && (pVar = this.f182163b) != null) {
                int width = pVar.f182238d.getWidth();
                int height = this.f182163b.f182238d.getHeight();
                ArrayList arrayList = new ArrayList();
                arrayList.add(Integer.valueOf(width));
                arrayList.add(Integer.valueOf(height));
                C63244g.m114602a().mo73288p().mo125206a(arrayList, this.f182163b.f182235a, this.f182163b.f182237c, null, null);
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.watermark.p4236a.AbstractC81475a
    /* renamed from: b */
    public final void mo125185b(C81506p pVar) {
        this.f182163b = pVar;
    }

    /* renamed from: a */
    private C85581w.EnumC85613l m141283a(int[] iArr) {
        C85581w.EnumC85613l lVar;
        if (C63238c.f143582i.mo93759a() == 0 && this.f182163b.f182242h) {
            try {
                iArr[0] = Integer.parseInt(C84896h.m145872e(this.f182163b.f182235a).extractMetadata(18));
            } catch (Exception unused) {
                iArr[0] = 560;
            }
            lVar = C85581w.EnumC85613l.VIDEO_OUT_RATIO_1_1;
        } else if (C63238c.f143582i.mo93759a() != 1 || !this.f182163b.f182242h) {
            lVar = C85581w.EnumC85613l.VIDEO_OUT_RATIO_ORIGINAL;
        } else {
            lVar = C85581w.EnumC85613l.VIDEO_OUT_RATIO_16_9;
        }
        if (this.f182163b.f182244j) {
            return C85581w.EnumC85613l.VIDEO_OUT_RATIO_16_9;
        }
        return lVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.watermark.p4236a.AbstractC81475a
    /* renamed from: a */
    public final void mo125183a(C81506p pVar) {
        boolean z;
        boolean z2;
        this.f182163b = pVar;
        C40978m.m82501a(pVar.f182235a, "inputPath can't be null", new Object[0]);
        C40978m.m82501a(this.f182163b.f182236b, "outPath can't be null", new Object[0]);
        C40978m.m82501a(this.f182163b.f182237c, "author can't be null", new Object[0]);
        C40978m.m82501a(this.f182163b.f182238d, "video can't be null", new Object[0]);
        boolean z3 = true;
        if (this.f182163b.f182239e || this.f182163b.f182240f || this.f182163b.f182249o) {
            z = true;
        } else {
            z = false;
        }
        C40978m.m82502a(z, "watermark invoked with error parameters", new Object[0]);
        File file = new File(this.f182163b.f182236b);
        File parentFile = file.getParentFile();
        if (parentFile.isDirectory() || parentFile.mkdirs()) {
            z2 = true;
        } else {
            z2 = false;
        }
        C40978m.m82502a(z2, "create output dir failed \noutPath = " + this.f182163b.f182236b + "\noutPath isExist = " + file.exists() + "\noutPath isfile =  " + file.isFile() + "\noutDir  = " + parentFile.getPath() + "\noutDir.isDirectory() = " + parentFile.isDirectory() + "\noutDir.mkdirs() = " + parentFile.mkdirs(), new Object[0]);
        boolean z4 = this.f182163b.f182239e;
        boolean d = C63244g.m114602a().mo73288p().mo125209d();
        if (((!this.f182163b.f182242h && !this.f182163b.f182240f) || !C63238c.f143582i.mo93760b()) && !d) {
            z3 = false;
        }
        VEUtils.VEVideoFileInfo videoFileInfo = VEUtils.getVideoFileInfo(this.f182163b.f182235a);
        this.f182169j = videoFileInfo;
        if (videoFileInfo == null) {
            if (this.f182163b.f182241g != null) {
                this.f182163b.f182241g.mo125228b(-1);
            } else {
                return;
            }
        }
        this.f182165f = false;
        this.f182166g = false;
        C1731i.m5640b(new CallableC81482e(this, z3, z4, this.f182163b.f182249o), C40780g.m82241a());
    }

    /* renamed from: a */
    public final void mo125192a(int i, int i2, String str) {
        mo125194d();
        if (this.f182163b.f182241g != null) {
            this.f182163b.f182241g.mo125228b(i2);
        }
        if (!this.f182165f) {
            this.f182165f = true;
            C40969d.m82483a("mTmpPath", this.f182163b.f182235a);
            C40969d.m82483a("mOutPath", this.f182163b.f182236b);
            C40970e.m82487a((Throwable) new Exception("WaterMarkComposer ret: ".concat(String.valueOf(i))));
            if (m141284c()) {
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

    /* renamed from: a */
    public final void mo125193a(boolean z, int i, int i2, String str) {
        boolean z2;
        if (!this.f182166g) {
            this.f182166g = true;
            long currentTimeMillis = System.currentTimeMillis() - this.f182164c;
            long i3 = C84896h.m145876i(this.f182163b.f182235a);
            if (!C84896h.f189732b || !C84896h.m145869b(this.f182163b.f182235a)) {
                z2 = TextUtils.equals(C40972g.m82493b(new File(this.f182163b.f182235a).getPath()), "20");
            } else {
                z2 = C84896h.m145875h(this.f182163b.f182235a).endsWith("/mp4");
            }
            if (z) {
                C40982q.m82520a("save_video_success_rate", 0, new C69840ar().mo110188a("watermark_duration", Long.valueOf(currentTimeMillis)).mo110188a("download_rate", Long.valueOf(this.f182163b.f182247m)).mo110188a("download_duration", Long.valueOf(this.f182163b.f182248n)).mo110185a("isInstagram", Boolean.valueOf(this.f182163b.f182242h)).mo110188a("file_size", Long.valueOf(i3)).mo110189a("url", this.f182163b.f182246l).mo110185a("needWaterMark", (Boolean) true).mo110189a("ret", "null").mo110189a("ext", "null").mo110189a("msg", "null").mo110185a("isMp4", Boolean.valueOf(z2)).mo110191a());
            } else {
                C40982q.m82520a("save_video_success_rate", 2, new C69840ar().mo110188a("watermark_duration", Long.valueOf(currentTimeMillis)).mo110188a("download_rate", Long.valueOf(this.f182163b.f182247m)).mo110188a("download_duration", Long.valueOf(this.f182163b.f182248n)).mo110185a("isInstagram", Boolean.valueOf(this.f182163b.f182242h)).mo110188a("file_size", Long.valueOf(i3)).mo110189a("url", this.f182163b.f182246l).mo110185a("needWaterMark", (Boolean) true).mo110187a("ret", Integer.valueOf(i)).mo110187a("ext", Integer.valueOf(i2)).mo110189a("msg", str).mo110185a("isMp4", Boolean.valueOf(z2)).mo110191a());
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ C89391z mo125191a(boolean z, boolean z2, boolean z3, int i, int i2, List list, List list2, String str, String str2) {
        C81504n nVar;
        boolean z4;
        VEWatermarkParam vEWatermarkParam;
        C81488b bVar;
        C81505o oVar;
        String str3 = str2;
        MethodCollector.m26663i(6862);
        if (z) {
            if (TextUtils.isEmpty(str3)) {
                str3 = null;
            }
            nVar = new C81504n(list2, str, str3, new ArrayList());
        } else {
            nVar = null;
        }
        if (z2 || z3) {
            z4 = true;
        } else {
            z4 = false;
        }
        int[] iArr = {i, i2};
        if (z4) {
            m141286f();
            if (m141283a(iArr) == C85581w.EnumC85613l.VIDEO_OUT_RATIO_16_9 && ((!C81502l.m141339b(iArr[1], iArr[0]) || !this.f182163b.f182242h) && !this.f182163b.f182249o)) {
                double d = (double) iArr[0];
                Double.isNaN(d);
                int i3 = (int) (d * 1.7777777777777777d);
                iArr[1] = i3;
                C81502l.f182213b = (i3 - iArr[1]) / 2;
            }
            C81502l.f182214c = this.f182169j;
            C81502l.f182212a = this.f182169j.duration;
            vEWatermarkParam = C81502l.m141338a(this.f182168i, this.f182163b.f182237c, new int[]{iArr[0], iArr[1]}, false, "", this.f182163b.f182242h);
        } else {
            vEWatermarkParam = null;
        }
        VEVideoEncodeSettings a = C81502l.m141337a(iArr[0], iArr[1]);
        if (!z4 || vEWatermarkParam != null) {
            if (!this.f182163b.f182249o || this.f182163b.f182250p == null) {
                bVar = null;
            } else {
                int[] iArr2 = new int[10];
                VEUtils.getVideoFileInfo(this.f182163b.f182235a, iArr2);
                Bitmap decodeFile = BitmapFactory.decodeFile(this.f182163b.f182250p);
                if (decodeFile != null) {
                    bVar = new C81488b(iArr2[3], iArr[0], iArr[1], this.f182163b.f182250p, decodeFile.getHeight(), decodeFile.getWidth(), this.f182163b.f182251q);
                } else {
                    bVar = null;
                }
                vEWatermarkParam.position = EnumC85399bi.TL;
            }
            oVar = new C81505o(this.f182163b.f182235a, this.f182163b.f182236b, vEWatermarkParam, a, bVar);
            if (nVar != null) {
                String str4 = nVar.f182222b;
                if (new File(str4).exists() && str4 != null) {
                    oVar.f182228a = nVar;
                }
            }
            if (this.f182163b.f182245k) {
                oVar.f182232e = -1;
            }
        } else {
            C84911q.m145926b("need interWatermark,but watermark param is null ,maybe the image data is invalid");
            oVar = null;
        }
        nVar.mo125219a(list);
        if (oVar == null) {
            mo125192a(-1, 0, "create VideoWatermarkParam error");
            MethodCollector.m26664o(6862);
            return null;
        }
        if (this.f182167h == null) {
            this.f182167h = new C69818c(C70638dj.f158102e + C13607d.m24442b(this.f182163b.f182235a));
        }
        this.f182167h.mo110169a(oVar, new AbstractC69820d() {
            /* class com.p2082ss.android.ugc.aweme.watermark.p4236a.C81480d.C814811 */

            static {
                Covode.recordClassIndex(94854);
            }

            @Override // com.p2082ss.android.ugc.aweme.shortvideo.p3793af.p3794a.AbstractC69820d
            /* renamed from: a */
            public final void mo110171a() {
                C81480d.this.mo125193a(true, -1, -1, null);
                C81480d dVar = C81480d.this;
                dVar.mo125194d();
                if (dVar.f182163b.f182241g != null) {
                    dVar.f182163b.f182241g.mo125227a(dVar.f182163b.f182236b);
                }
                if (C81480d.m141284c()) {
                    C40982q.m82520a("aweme_download_synthesis_error_rate", 0, (JSONObject) null);
                    C39162r.m79460a("add_watermark", new C84425b().mo129406a("enter_from", "download_video").f188764a);
                }
            }

            @Override // com.p2082ss.android.ugc.aweme.shortvideo.p3793af.p3794a.AbstractC69820d
            /* renamed from: a */
            public final void mo110172a(float f) {
                if (C81480d.this.f182163b.f182241g != null) {
                    C81480d.this.f182163b.f182241g.mo125226a((int) (f * 100.0f));
                }
            }

            @Override // com.p2082ss.android.ugc.aweme.shortvideo.p3793af.p3794a.AbstractC69820d
            /* renamed from: a */
            public final void mo110173a(int i, String str, int i2) {
                C81480d.this.mo125192a(i, i2, str);
                C81480d.this.mo125193a(false, i, i2, str);
            }
        });
        MethodCollector.m26664o(6862);
        return null;
    }
}
