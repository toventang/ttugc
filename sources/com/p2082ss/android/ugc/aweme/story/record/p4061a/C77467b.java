package com.p2082ss.android.ugc.aweme.story.record.p4061a;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.opengl.EGLContext;
import android.view.SurfaceHolder;
import android.view.ViewGroup;
import androidx.appcompat.app.ActivityC0218d;
import com.bytedance.als.C2563k;
import com.bytedance.bpea.basics.PrivacyCert;
import com.bytedance.bpea.entry.common.DataType;
import com.bytedance.common.utility.C13617h;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.dialog.C17197a;
import com.bytedance.p1559o.C21582f;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;
import com.p2082ss.android.ugc.aweme.p2730de.C40970e;
import com.p2082ss.android.ugc.aweme.p2730de.C40982q;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63236br;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63248j;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63254m;
import com.p2082ss.android.ugc.aweme.property.C65337ag;
import com.p2082ss.android.ugc.aweme.property.C65369bi;
import com.p2082ss.android.ugc.aweme.property.C65425dh;
import com.p2082ss.android.ugc.aweme.shortvideo.C69840ar;
import com.p2082ss.android.ugc.aweme.shortvideo.C71827ew;
import com.p2082ss.android.ugc.aweme.shortvideo.CameraComponentModel;
import com.p2082ss.android.ugc.aweme.shortvideo.p3833f.C71833a;
import com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.TimeSpeedModelExtension;
import com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.task.C73806f;
import com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.task.EnumC73804d;
import com.p2082ss.android.ugc.aweme.shortvideo.record.C72796k;
import com.p2082ss.android.ugc.aweme.shortvideo.util.C73975b;
import com.p2082ss.android.ugc.aweme.shortvideo.util.C73996bl;
import com.p2082ss.android.ugc.aweme.shortvideo.util.performance.CameraFirstFramePerformanceMonitor;
import com.p2082ss.android.ugc.aweme.story.record.C77582h;
import com.p2082ss.android.ugc.aweme.story.record.p4062b.C77481b;
import com.p2082ss.android.ugc.aweme.story.record.p4062b.C77487d;
import com.p2082ss.android.ugc.aweme.story.record.p4067g.C77570d;
import com.p2082ss.android.ugc.aweme.story.record.p4070j.C77608b;
import com.p2082ss.android.ugc.aweme.tools.C78599g;
import com.p2082ss.android.ugc.aweme.utils.C80322d;
import com.p2082ss.android.ugc.aweme.utils.C80417f;
import com.p2082ss.android.ugc.aweme.utils.C80492gf;
import com.p2082ss.android.ugc.aweme.utils.C80510gr;
import com.p2082ss.android.ugc.tools.p4344f.C84425b;
import com.p2082ss.android.ugc.tools.utils.C84911q;
import com.p2082ss.android.ugc.trill.R;
import com.p2082ss.android.vesdk.runtime.VERuntime;
import dmt.p4542av.video.C88151a;
import java.io.File;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.story.record.a.b */
public class C77467b extends C72796k<AbstractC77466a> implements AbstractC77466a {

    /* renamed from: W */
    protected C77582h f173797W;

    /* renamed from: X */
    boolean f173798X;

    /* renamed from: Y */
    final C2563k<C89391z> f173799Y;

    /* renamed from: Z */
    public AbstractC89183m<String, String, String> f173800Z;

    /* renamed from: aa */
    private String f173801aa;

    /* renamed from: ab */
    private boolean f173802ab;

    static {
        Covode.recordClassIndex(90502);
    }

    /* renamed from: ak */
    public final C77582h mo22938ak() {
        return this.f173797W;
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.record.C72796k, com.p2082ss.android.ugc.aweme.shortvideo.record.C72809t
    /* renamed from: ap */
    public final void mo115086ap() {
        super.mo115086ap();
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.record.C72809t
    /* renamed from: a */
    public final void mo115108a(boolean z, int i, String str) {
        C80510gr.m139533a("camera_error", "3", "onCameraOpenFailed : errorCode," + i + "msg :" + str + " permission : " + C77570d.m135569a(this.f163382p));
        if (z) {
            C77481b.f173814a.mo116016b(this.f163382p);
            return;
        }
        ActivityC0218d dVar = this.f163382p;
        C77470d dVar2 = new C77470d(this);
        C77471e eVar = new C77471e(this);
        C89219l.m154721d(dVar, "");
        C89219l.m154721d(dVar2, "");
        C89219l.m154721d(eVar, "");
        if (C77570d.f173974a == null) {
            C17197a.C17200a a = new C17197a.C17200a(dVar).mo27194b(R.string.v0).mo27195b(R.string.v1, (DialogInterface.OnClickListener) new C77570d.DialogInterface$OnClickListenerC77571a(dVar2), false).mo27190a(R.string.as2, (DialogInterface.OnClickListener) new C77570d.DialogInterface$OnClickListenerC77572b(dVar, eVar), false);
            a.f41067M = false;
            Dialog b = a.mo27193a().mo27184b();
            b.setOnDismissListener(C77570d.DialogInterface$OnDismissListenerC77573c.f173979a);
            C77570d.f173974a = b;
        }
        Dialog dialog = C77570d.f173974a;
        if (dialog != null && (dVar instanceof Activity) && !dVar.isFinishing() && !dialog.isShowing()) {
            try {
                dialog.show();
                C71827ew.m126824a(dialog);
            } catch (Exception e) {
                C40970e.m82485a(e.toString());
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.record.C72809t
    /* renamed from: a */
    public final void mo115109a(String[] strArr, double[] dArr, boolean[] zArr) {
        super.mo115109a(strArr, dArr, zArr);
        C71833a.m126846a(this.f163389w.f155658n);
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.record.C72809t
    /* renamed from: a */
    public final void mo115106a(File file, int i) {
        C69840ar a = new C69840ar().mo110187a("error_code", Integer.valueOf(i));
        a.mo110187a("segment_count", Integer.valueOf(this.f163389w.mo109891d().size()));
        StringBuilder sb = new StringBuilder();
        Iterator it = this.f163389w.mo109891d().iterator();
        while (it.hasNext()) {
            sb.append(((TimeSpeedModelExtension) it.next()).getDuration()).append(",");
        }
        if (sb.length() == 0) {
            a.mo110189a("video_durations", "");
        } else {
            a.mo110189a("video_durations", sb.substring(0, sb.length() - 1));
        }
        a.mo110188a("total_duration", Long.valueOf(this.f163389w.f155651g));
        a.mo110189a("path", file.getPath());
        if (file.isDirectory()) {
            a.mo110189a("file_path", C73996bl.m130140a(file.list(), ","));
        }
        a.mo110189a("enter_from", new StringBuilder().append(this.f163382p.getIntent().getIntExtra("record_from", 0)).toString());
        a.mo110187a("is_story", (Integer) 1);
        JSONObject a2 = a.mo110191a();
        C40982q.m82522a("aweme_draft_edit_error", a2);
        C84911q.m145921a(a2.toString() + " RestoreType: " + this.f163389w.f155645a);
        super.mo115106a(file, i);
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.record.C72809t
    /* renamed from: aG */
    public final boolean mo115116aG() {
        return C65369bi.m117065a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: al */
    public final /* synthetic */ C89391z mo22939al() {
        this.f163382p.finish();
        return null;
    }

    /* access modifiers changed from: package-private */
    @Override // com.p2082ss.android.ugc.aweme.shortvideo.record.C72809t
    /* renamed from: am */
    public final /* synthetic */ C89391z mo22940am() {
        this.f163382p.finish();
        return null;
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.record.C72809t
    /* renamed from: aA */
    public final void mo115110aA() {
        super.mo115110aA();
        C73975b.C73976a.f166071a.step("av_video_record_init", "camera open start");
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.record.C72809t
    /* renamed from: aB */
    public final void mo115111aB() {
        super.mo115111aB();
        C73975b.C73976a.f166071a.end("av_video_record_change_camera", "changeCamera#onFirstFrame");
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.record.C72809t
    /* renamed from: aC */
    public final void mo115112aC() {
        if (C80510gr.f180107b) {
            C80510gr.f180107b = false;
            C80510gr.m139537b("camera_success");
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.record.C72809t
    /* renamed from: aD */
    public final void mo115113aD() {
        C40970e.m82485a("initMediaProcess() called");
        super.mo115113aD();
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.record.C72809t
    /* renamed from: aJ */
    public final void mo115119aJ() {
        C40970e.m82485a("resetAllPlayStatus() called");
        super.mo115119aJ();
        C71833a.m126843a();
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.record.C72809t
    /* renamed from: aK */
    public final void mo115120aK() {
        super.mo115120aK();
        if (this.f173800Z != null) {
            this.f163390x.mo122466a(this.f173800Z);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.record.C72809t
    /* renamed from: aL */
    public final void mo115121aL() {
        super.mo115121aL();
        C88151a.m153230a("extracting_frame", "extract_shot");
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.record.C72809t
    /* renamed from: aM */
    public final void mo115122aM() {
        super.mo115122aM();
        C88151a.m153229a("extracting_frame");
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.record.C72809t
    /* renamed from: at */
    public final void mo115132at() {
        super.mo115132at();
        C40970e.m82485a("closeWavFile() called");
    }

    /* renamed from: an */
    private static JSONObject m135430an() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(DataType.AUDIO, false);
            jSONObject.put("is_story", 1);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jSONObject;
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.record.C72809t
    /* renamed from: aH */
    public final void mo115117aH() {
        super.mo115117aH();
        if (this.f163389w.mo109889b()) {
            C40970e.m82485a("initDuet() called");
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.record.C72809t
    /* renamed from: au */
    public final void mo115133au() {
        super.mo115133au();
        C40970e.m82485a("lackPermission() called");
        C40982q.m82520a("checkPermission", 1, m135430an());
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.record.C72809t, com.bytedance.als.AbstractC2562j
    public void onCreate() {
        super.onCreate();
        this.f163386t.mo56545c().mo56652a(new C77472f(this));
        C73806f.m129873a(EnumC73804d.RECORD_ON_CREATE);
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.record.C72809t, com.bytedance.als.AbstractC2562j
    public void onDestroy() {
        super.onDestroy();
        C73806f.m129873a(EnumC73804d.RECORD_ON_DESTROY);
        if (C65369bi.m117065a()) {
            VERuntime.EnumC85549a.INSTANCE.f191667b.f191650i = false;
            VERuntime.EnumC85549a.INSTANCE.f191667b.f191651j = false;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.record.C72796k, com.p2082ss.android.ugc.aweme.shortvideo.record.C72809t
    /* renamed from: aq */
    public final void mo115087aq() {
        super.mo115087aq();
        C84911q.m145921a("StoryCameraCoreComponent => surfaceCreated isFirstSurfaceCreated: " + this.f163238b + " isOpenCameraSuccess: " + this.f163239c);
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.record.C72796k, com.p2082ss.android.ugc.aweme.shortvideo.record.C72809t, com.bytedance.als.AbstractC2562j
    public void onResume() {
        super.onResume();
        C73806f.m129873a(EnumC73804d.RECORD_ON_RESUME);
        if (C65369bi.m117065a() && !this.f173802ab) {
            this.f163386t.mo56545c().f74654o.mo131493h();
        }
        if (this.f173802ab) {
            this.f173802ab = false;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.record.C72809t
    /* renamed from: aF */
    public final void mo115115aF() {
        C40970e.m82485a("initDuetAndReaction() called");
        File e = this.f163389w.f155652h.mo110096e();
        if (!e.exists() || (e.exists() && e.isDirectory() && (e.listFiles() == null || e.listFiles().length == 0))) {
            for (int i = 0; i < this.f163389w.mo109891d().size(); i++) {
                this.f163385s.mo56915a((AbstractC89172b<? super Integer, C89391z>) null, (AbstractC89171a<C89391z>) null);
            }
            this.f163389w.mo109891d().clear();
            this.f163389w.mo109887a(0);
        }
        super.mo115115aF();
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.record.C72809t
    /* renamed from: a */
    public final void mo115100a(long j) {
        super.mo115100a(j);
        C80322d.m139251a("tool_performance_record_fetch_frames", new C84425b().mo129404a("duration", j).mo129403a("is_story", 1).f188764a);
    }

    /* renamed from: a */
    static final /* synthetic */ C89391z m135429a(C21582f fVar) {
        C63236br.m114584a(((ActivityC0218d) fVar.mo35249a(ActivityC0218d.class, (String) null)).getApplication(), C63254m.f143624a, new C63248j().mo101728a(), C63244g.m114602a().mo73289q()).mo101716a(C63254m.f143624a.mo101717a());
        VERuntime.m147433a(C65337ag.m117023a());
        return C89391z.f203057a;
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.record.C72796k, com.p2082ss.android.ugc.aweme.shortvideo.record.C72809t
    /* renamed from: c */
    public final void mo115088c(int i) {
        C73975b.C73976a.f166071a.step("av_video_record_init", "camera open success");
        super.mo115088c(i);
        C40982q.m82520a("aweme_open_camera_error_rate", 0, new C69840ar().mo110185a("useVERecoder", (Boolean) true).mo110187a("is_story", (Integer) 1).mo110191a());
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.record.C72809t
    /* renamed from: d */
    public final void mo115142d(int i) {
        super.mo115142d(i);
        C40982q.m82520a("aweme_open_camera_error_rate", 0, new C69840ar().mo110185a("useVERecoder", (Boolean) true).mo110187a("is_story", (Integer) 1).mo110191a());
        C73975b.C73976a.f166071a.step("av_video_record_change_camera", "changeCamera#onOpenSuccess");
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.record.C72809t
    /* renamed from: e */
    public final void mo115144e(int i) {
        this.f173797W.f173992a.mo56801b("CreationID", this.f173801aa);
        C40970e.m82485a("onNativeInitCallBack() called with: ret = [" + i + "]");
        C40982q.m82520a("aweme_camera_preview_init_fail", 0, new C69840ar().mo110187a("is_story", (Integer) 1).mo110191a());
        super.mo115144e(i);
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.record.C72809t
    /* renamed from: f */
    public final void mo115146f(int i) {
        C40970e.m82485a("onNativeInitCallBack() called with: ret = [" + i + "]");
        super.mo115146f(i);
        C71833a.m126843a();
        String str = "currentWidth:" + this.f163300A + "    currentHeight:" + this.f163301B + "      availableMem:";
        try {
            StringBuilder append = new StringBuilder().append(str).append(C80417f.m139403a(this.f163382p)).append(" currentPIDMem:");
            Context applicationContext = this.f163382p.getApplicationContext();
            if (C58003a.f132201c) {
                if (applicationContext == null) {
                    applicationContext = C58003a.f132199a;
                }
            }
            StringBuilder append2 = append.append(C80417f.m139404b(applicationContext)).append("hasUsedMem:");
            Context applicationContext2 = this.f163382p.getApplication().getApplicationContext();
            if (C58003a.f132201c) {
                if (applicationContext2 == null) {
                    applicationContext2 = C58003a.f132199a;
                }
            }
            str = append2.append(C80417f.m139405c(applicationContext2)).toString();
        } catch (Exception e) {
            e.printStackTrace();
        }
        C40970e.m82487a((Throwable) new Exception("init failed detail: ".concat(String.valueOf(str))));
        C40982q.m82520a("aweme_camera_preview_init_fail", 1, new C69840ar().mo110187a("errorCode", Integer.valueOf(i)).mo110189a("errorDesc", "").mo110189a("exception", str).mo110187a("is_story", (Integer) 1).mo110191a());
        C80510gr.m139533a("camera_error", "3", "native init failed , ve result = ".concat(String.valueOf(i)));
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.record.C72796k, com.p2082ss.android.ugc.aweme.shortvideo.record.C72809t
    /* renamed from: a */
    public final void mo115084a(SurfaceHolder surfaceHolder) {
        C84911q.m145921a("StoryCameraCoreComponent => surfaceCreated isFirstSurfaceCreated: " + this.f163238b + " isOpenCameraSuccess: " + this.f163239c);
        C40982q.m82522a("zoom_info_log", new C69840ar().mo110189a("camera_surface_view_size", "w = " + this.f163383q.getWidth() + "   h = " + this.f163383q.getHeight()).mo110191a());
        super.mo115084a(surfaceHolder);
    }

    @Override // com.bytedance.creativex.recorder.p940b.p941a.AbstractC14179f, com.p2082ss.android.ugc.aweme.shortvideo.record.C72809t
    /* renamed from: b */
    public final void mo22805b(float f, float f2) {
        if (!C65425dh.f147580a) {
            f += 100.0f;
        }
        mo115124aO();
        if (f >= 0.0f) {
            C77608b.m135596a(this.f163382p, f2);
            ActivityC0218d dVar = this.f163382p;
            C89219l.m154721d(dVar, "");
            float b = (f - C13628n.m24520b(dVar, 35.0f)) / C77608b.m135596a(dVar, f2);
            if (b > 0.98f) {
                b = 1.0f;
            }
            mo115141c(b);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.record.C72809t
    /* renamed from: e */
    public final void mo115145e(int i, int i2) {
        C40970e.m82485a("onNativeInitHardEncoderRetCallback() called with: isCPUEncode = [" + i + "]");
        super.mo115145e(i, i2);
        if (this.f163389w.f155645a == 0) {
            C71833a.m126844a(this.f163389w.f155649e);
        }
        C63244g.m114602a().mo73277e().setRecordUseSuccessRecordProfile(i2);
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.record.C72809t
    /* renamed from: f */
    public final void mo115147f(int i, int i2) {
        if (!this.f163302C) {
            C40982q.m82522a("zoom_info_log", new C69840ar().mo110187a("is_story", (Integer) 1).mo110189a("camera_preview_size", "w = " + i + "   h = " + i2).mo110191a());
        }
        super.mo115147f(i, i2);
    }

    @Override // com.bytedance.creativex.recorder.p940b.p941a.AbstractC14179f, com.p2082ss.android.ugc.aweme.shortvideo.record.C72809t
    /* renamed from: a */
    public final int mo22773a(C78599g gVar, PrivacyCert privacyCert, String str) {
        C73975b.C73976a.f166071a.start("av_video_record_change_camera", "switchFrontRearCamera");
        return super.mo22773a(gVar, privacyCert, str);
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.record.C72809t
    /* renamed from: a */
    public final void mo115095a(int i, float f, boolean z) {
        super.mo115095a(i, f, z);
        C40982q.m82522a("zoom_info_log", new C69840ar().mo110189a("camera_zoom_size", " size = ".concat(String.valueOf(f))).mo110187a("is_story", (Integer) 1).mo110191a());
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.record.C72809t
    /* renamed from: b */
    public final void mo115139b(int i, int i2, String str) {
        super.mo115139b(i, i2, str);
        C40982q.m82520a("aweme_open_camera_error_rate", i2, new C69840ar().mo110185a("useVERecoder", (Boolean) true).mo110187a("is_story", (Integer) 1).mo110189a("errorDesc", str).mo110191a());
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.record.C72809t
    /* renamed from: a */
    public final void mo115096a(int i, int i2, double d) {
        super.mo115096a(i, i2, d);
        C40970e.m82485a("initWavFile() called with: sampleRate = [" + i + "], channels = [" + i2 + "], speed = [" + d + "]");
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.record.C72809t
    /* renamed from: a */
    public final void mo115097a(int i, int i2, String str) {
        super.mo115097a(i, i2, str);
        C40982q.m82520a("aweme_open_camera_error_rate", i2, new C69840ar().mo110185a("useVERecoder", (Boolean) true).mo110189a("errorDesc", str).mo110187a("is_story", (Integer) 1).mo110191a());
    }

    public C77467b(ViewGroup viewGroup, C21582f fVar, CameraComponentModel cameraComponentModel, String str) {
        this(viewGroup, fVar, cameraComponentModel, new C77487d(), str);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private C77467b(android.view.ViewGroup r11, com.bytedance.p1559o.C21582f r12, com.p2082ss.android.ugc.aweme.shortvideo.CameraComponentModel r13, com.p2082ss.android.ugc.aweme.shortvideo.record.AbstractC72769aq r14, java.lang.String r15) {
        /*
            r10 = this;
            com.ss.android.ugc.aweme.story.record.b.c r6 = com.p2082ss.android.ugc.aweme.story.record.p4062b.C77486c.f173820a
            com.ss.android.ugc.aweme.story.record.b.b r7 = com.p2082ss.android.ugc.aweme.story.record.p4062b.C77481b.f173814a
            com.ss.android.ugc.aweme.story.record.a.c r8 = new com.ss.android.ugc.aweme.story.record.a.c
            r3 = r12
            r8.<init>(r3)
            com.ss.android.ugc.aweme.port.in.u r0 = com.p2082ss.android.ugc.aweme.port.p3561in.C63244g.m114602a()
            com.ss.android.ugc.aweme.record.d r2 = r0.mo73284l()
            com.ss.android.vesdk.j r1 = com.p2082ss.android.ugc.aweme.shortvideo.C71815es.m126788a()
            java.lang.String r0 = ""
            p4600h.p4611f.p4613b.C89219l.m154716b(r1, r0)
            r2.initVESDK(r1)
            com.ss.android.ugc.aweme.story.record.b.a r9 = new com.ss.android.ugc.aweme.story.record.b.a
            r9.<init>()
            r2 = r10
            r4 = r13
            r5 = r14
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            r2 = 5957(0x1745, float:8.348E-42)
            com.bytedance.frameworks.apm.trace.MethodCollector.m26663i(r2)
            r0 = 1
            r10.f173802ab = r0
            r10.f173798X = r0
            com.bytedance.als.k r0 = new com.bytedance.als.k
            r0.<init>()
            r10.f173799Y = r0
            r0 = 0
            r10.f173800Z = r0
            r10.f173801aa = r15
            com.ss.android.ugc.aweme.shortvideo.x.a r1 = r10.mo115130ar()
            com.ss.android.ugc.aweme.story.record.h r0 = new com.ss.android.ugc.aweme.story.record.h
            r0.<init>(r1)
            r10.f173797W = r0
            com.ss.android.ugc.asve.recorder.view.ASCameraView r0 = r10.f163385s
            r11.addView(r0)
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.story.record.p4061a.C77467b.<init>(android.view.ViewGroup, com.bytedance.o.f, com.ss.android.ugc.aweme.shortvideo.CameraComponentModel, com.ss.android.ugc.aweme.shortvideo.record.aq, java.lang.String):void");
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.record.C72809t
    /* renamed from: a */
    public final void mo115099a(int i, boolean z, boolean z2, float f, List<Integer> list) {
        String str;
        super.mo115099a(i, z, z2, f, list);
        C69840ar a = new C69840ar().mo110187a("is_story", (Integer) 1).mo110187a("cameraType", Integer.valueOf(i)).mo110185a("supportZoom", Boolean.valueOf(z)).mo110185a("supportSmooth", Boolean.valueOf(z2)).mo110186a("maxZoom", Float.valueOf(f));
        if (C13617h.m24466b(list)) {
            str = new StringBuilder().append(list.get(0)).toString();
        } else {
            str = " ";
        }
        C40982q.m82522a("zoom_info_log", a.mo110189a("ratios", str).mo110191a());
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.record.C72809t
    /* renamed from: a */
    public final void mo115102a(EGLContext eGLContext, int i, int i2, int i3, int i4, long j) {
        C80492gf.m139514b();
        C73806f.m129873a(EnumC73804d.RECORD_ON_FIRST_FRAME);
        C73975b.C73976a.f166071a.end(CameraFirstFramePerformanceMonitor.f166157a, "camera frame available");
        super.mo115102a(eGLContext, i, i2, i3, i4, j);
    }
}
