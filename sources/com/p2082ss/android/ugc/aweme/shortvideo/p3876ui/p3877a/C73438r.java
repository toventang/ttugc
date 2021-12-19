package com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.p3877a;

import android.content.Context;
import android.opengl.EGLContext;
import android.view.SurfaceHolder;
import androidx.appcompat.app.ActivityC0218d;
import com.bytedance.als.C2559g;
import com.bytedance.als.C2563k;
import com.bytedance.bpea.basics.PrivacyCert;
import com.bytedance.bpea.entry.common.DataType;
import com.bytedance.common.utility.C13617h;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.creativex.recorder.filter.p943b.C14224b;
import com.bytedance.creativex.recorder.p940b.p941a.AbstractC14209z;
import com.bytedance.p1559o.C21582f;
import com.p2082ss.android.ttve.model.VETrackParams;
import com.p2082ss.android.ugc.asve.recorder.effect.composer.ComposerInfo;
import com.p2082ss.android.ugc.aweme.experiment.C46981gn;
import com.p2082ss.android.ugc.aweme.experiment.C46982go;
import com.p2082ss.android.ugc.aweme.filter.FilterBean;
import com.p2082ss.android.ugc.aweme.filter.repository.internal.utils.C50811a;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;
import com.p2082ss.android.ugc.aweme.p2730de.C40970e;
import com.p2082ss.android.ugc.aweme.p2730de.C40982q;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63236br;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63238c;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63248j;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63254m;
import com.p2082ss.android.ugc.aweme.property.C65337ag;
import com.p2082ss.android.ugc.aweme.property.C65347aq;
import com.p2082ss.android.ugc.aweme.property.C65369bi;
import com.p2082ss.android.ugc.aweme.property.C65425dh;
import com.p2082ss.android.ugc.aweme.shortvideo.C69837ao;
import com.p2082ss.android.ugc.aweme.shortvideo.C69840ar;
import com.p2082ss.android.ugc.aweme.shortvideo.CameraComponentModel;
import com.p2082ss.android.ugc.aweme.shortvideo.p3833f.C71833a;
import com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.TimeSpeedModelExtension;
import com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.permissionmanager.C73773g;
import com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.permissionmanager.C73787i;
import com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.task.C73806f;
import com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.task.EnumC73804d;
import com.p2082ss.android.ugc.aweme.shortvideo.p3892x.C74322m;
import com.p2082ss.android.ugc.aweme.shortvideo.record.AbstractC72769aq;
import com.p2082ss.android.ugc.aweme.shortvideo.record.C72796k;
import com.p2082ss.android.ugc.aweme.shortvideo.record.p3856a.C72744a;
import com.p2082ss.android.ugc.aweme.shortvideo.util.C73975b;
import com.p2082ss.android.ugc.aweme.shortvideo.util.C73980bc;
import com.p2082ss.android.ugc.aweme.shortvideo.util.C73996bl;
import com.p2082ss.android.ugc.aweme.shortvideo.util.performance.CameraFirstFramePerformanceMonitor;
import com.p2082ss.android.ugc.aweme.tools.C78599g;
import com.p2082ss.android.ugc.aweme.utils.C80322d;
import com.p2082ss.android.ugc.aweme.utils.C80417f;
import com.p2082ss.android.ugc.aweme.utils.C80492gf;
import com.p2082ss.android.ugc.aweme.utils.C80510gr;
import com.p2082ss.android.ugc.tools.C84401c;
import com.p2082ss.android.ugc.tools.p4344f.C84425b;
import com.p2082ss.android.ugc.tools.utils.C84911q;
import com.p2082ss.android.vesdk.runtime.VERuntime;
import dmt.p4542av.video.C88151a;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.a.r */
public class C73438r extends C72796k<AbstractC14209z> implements AbstractC14209z {

    /* renamed from: W */
    protected C74322m f164976W;

    /* renamed from: X */
    protected C72744a f164977X;

    /* renamed from: Y */
    boolean f164978Y;

    /* renamed from: Z */
    final C2563k<C89391z> f164979Z;

    /* renamed from: aa */
    final C2563k<C89391z> f164980aa;

    /* renamed from: ab */
    private String f164981ab;

    /* renamed from: ac */
    private boolean f164982ac;

    /* renamed from: ad */
    private boolean f164983ad;

    static {
        Covode.recordClassIndex(86175);
    }

    @Override // com.bytedance.creativex.recorder.p940b.p941a.AbstractC14179f, com.p2082ss.android.ugc.aweme.shortvideo.record.C72809t
    /* renamed from: a */
    public final boolean mo22792a(boolean z, boolean z2) {
        return false;
    }

    @Override // com.bytedance.creativex.recorder.p940b.p941a.AbstractC14209z
    /* renamed from: ak */
    public final C2559g<C89391z> mo22938ak() {
        return this.f164980aa;
    }

    @Override // com.bytedance.creativex.recorder.p940b.p941a.AbstractC14209z
    /* renamed from: al */
    public final C2559g<C89391z> mo22939al() {
        return this.f164979Z;
    }

    @Override // com.bytedance.creativex.recorder.p940b.p941a.AbstractC14209z
    /* renamed from: am */
    public final C72744a mo22940am() {
        return this.f164977X;
    }

    @Override // com.bytedance.creativex.recorder.p940b.p941a.AbstractC14209z
    /* renamed from: an */
    public final C74322m mo22941an() {
        return this.f164976W;
    }

    @Override // com.bytedance.creativex.recorder.p940b.p941a.AbstractC14209z
    /* renamed from: a */
    public final void mo22937a(FilterBean filterBean, Float f) {
        float floatValue;
        C74322m mVar = this.f164976W;
        if (f == null) {
            floatValue = 0.0f;
        } else {
            floatValue = f.floatValue();
        }
        if (filterBean == null) {
            return;
        }
        if (C50811a.m95159a(filterBean)) {
            if (mVar.f167133b != null) {
                mVar.f167135d.remove(mVar.f167133b.getFilterFolder());
            }
            String filterFolder = filterBean.getFilterFolder();
            if (!(filterFolder == null || mVar.f167133b == null || !mVar.f167135d.containsKey(filterFolder))) {
                Integer num = mVar.f167135d.get(filterFolder);
                if (num.intValue() == 1) {
                    mVar.mo116955b(filterBean.getFilterFilePath(), mVar.f167133b.getFilterFilePath(), 1.0f);
                } else if (num.intValue() == 2) {
                    mVar.mo116955b(mVar.f167133b.getFilterFolder(), filterBean.getFilterFolder(), 0.0f);
                }
                mVar.f167135d.remove(filterFolder);
            }
            if (!mVar.f167135d.isEmpty()) {
                ArrayList arrayList = new ArrayList();
                for (String str : mVar.f167135d.keySet()) {
                    arrayList.add(new ComposerInfo(str + ":Filter_intensity", "", ""));
                    arrayList.add(new ComposerInfo(str + ":leftSlidePosition", "", ""));
                    arrayList.add(new ComposerInfo(str + ":rightSlidePosition", "", ""));
                }
                mVar.f167132a.mo56820a(arrayList);
                mVar.f167135d.clear();
            }
            if (mVar.f167133b != null) {
                mVar.f167132a.mo56822a(C74322m.m130760a(mVar.f167133b), C74322m.m130761a(filterBean, floatValue), 500);
                mVar.f167135d.put(filterBean.getFilterFilePath(), 3);
            } else {
                mVar.f167132a.mo56822a(new ArrayList(), C74322m.m130761a(filterBean, floatValue), 500);
                mVar.f167135d.put(filterBean.getFilterFolder(), 3);
            }
            mVar.f167133b = filterBean;
            mVar.f167134c = floatValue;
            return;
        }
        mVar.mo116940b(filterBean.getFilterFolder(), floatValue);
    }

    @Override // com.bytedance.creativex.recorder.p940b.p941a.AbstractC14209z
    /* renamed from: a */
    public final void mo22936a(FilterBean filterBean) {
        C74322m mVar = this.f164976W;
        if (filterBean == null) {
            mVar.mo116929a("");
        } else if (C50811a.m95159a(filterBean)) {
            mVar.f167132a.mo56820a(C74322m.m130760a(filterBean));
            mVar.f167133b = null;
            mVar.f167134c = 0.0f;
            mVar.f167135d.clear();
        } else {
            mVar.mo116929a("");
        }
    }

    @Override // com.bytedance.creativex.recorder.p940b.p941a.AbstractC14179f, com.p2082ss.android.ugc.aweme.shortvideo.record.C72809t
    /* renamed from: a */
    public final void mo22780a(C14224b bVar, C14224b bVar2, float f) {
        C74322m mVar = this.f164976W;
        boolean a = C50811a.m95159a(bVar.f34511a);
        boolean a2 = C50811a.m95159a(bVar2.f34511a);
        float abs = f < 0.0f ? Math.abs(f) : 1.0f - f;
        if (!a || !a2) {
            mVar.f167132a.mo56786a(mVar.mo116954a(bVar), mVar.mo116954a(bVar2), abs, bVar.f34512b, bVar2.f34512b);
            return;
        }
        if (Math.abs(f) < 0.05f) {
            abs = f <= 0.0f ? 0.0f : 1.0f;
        }
        String filterFolder = bVar.f34511a.getFilterFolder();
        String filterFolder2 = bVar2.f34511a.getFilterFolder();
        if (abs == 0.0f) {
            if (mVar.f167135d.containsKey(filterFolder)) {
                mVar.mo116955b(filterFolder, filterFolder2, 0.0f);
                mVar.f167132a.mo56794b(new String[]{bVar.f34511a.getFilterFolder()}, 1);
                mVar.f167135d.remove(filterFolder);
            }
        } else if (abs != 1.0f) {
            if (!mVar.f167135d.containsKey(filterFolder)) {
                mVar.f167132a.mo56759a(new String[]{filterFolder + ":leftSlidePosition:0"}, 1);
                mVar.f167132a.mo56758a(filterFolder, "Filter_intensity", bVar.f34512b);
                mVar.f167135d.put(filterFolder, 1);
            }
            if (!mVar.f167135d.containsKey(filterFolder2)) {
                mVar.f167132a.mo56759a(new String[]{filterFolder2 + ":rightSlidePosition:1"}, 1);
                mVar.f167132a.mo56758a(filterFolder2, "Filter_intensity", bVar2.f34512b);
                mVar.f167135d.put(filterFolder2, 2);
            }
            mVar.mo116955b(filterFolder, filterFolder2, abs);
        } else if (mVar.f167135d.containsKey(filterFolder2)) {
            mVar.mo116955b(filterFolder, filterFolder2, 1.0f);
            mVar.f167132a.mo56794b(new String[]{bVar2.f34511a.getFilterFolder()}, 1);
            mVar.f167135d.remove(filterFolder2);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.record.C72809t
    /* renamed from: a */
    public final void mo115108a(boolean z, int i, String str) {
        boolean a = C73787i.f165654a.mo116239a(this.f163382p);
        C80510gr.m139533a("camera_error", "3", "onCameraOpenFailed : errorCode," + i + "msg :" + str + " permission : " + a);
        if (a) {
            C73432p.f164966a.mo116016b(this.f163382p);
            return;
        }
        boolean a2 = C46981gn.m90261a();
        boolean a3 = C46982go.m90262a();
        if (a2 || a3) {
            C73773g.m129834a(this.f163382p, new C73441t(this));
        } else {
            C73980bc.m130118a(this.f163382p, new C73442u(this), new C73443v(this));
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
    public final void mo115102a(EGLContext eGLContext, int i, int i2, int i3, int i4, long j) {
        C80492gf.m139514b();
        C73806f.m129873a(EnumC73804d.RECORD_ON_FIRST_FRAME);
        C73975b.C73976a.f166071a.end(CameraFirstFramePerformanceMonitor.f166157a, "camera frame available");
        super.mo115102a(eGLContext, i, i2, i3, i4, j);
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.record.C72796k, com.p2082ss.android.ugc.aweme.shortvideo.record.C72809t
    /* renamed from: a */
    public final void mo115084a(SurfaceHolder surfaceHolder) {
        C84911q.m145921a("TikTokCameraCoreComponent => surfaceCreated isFirstSurfaceCreated: " + this.f163238b + " isOpenCameraSuccess: " + this.f163239c + " cameraClosedByLive: " + this.f164982ac);
        C40982q.m82522a("zoom_info_log", new C69840ar().mo110189a("camera_surface_view_size", "w = " + this.f163383q.getWidth() + "   h = " + this.f163383q.getHeight()).mo110191a());
        super.mo115084a(surfaceHolder);
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
        JSONObject a2 = a.mo110191a();
        C40982q.m82522a("aweme_draft_edit_error", a2);
        C84911q.m145921a(a2.toString() + " RestoreType: " + this.f163389w.f155645a);
        super.mo115106a(file, i);
    }

    @Override // com.bytedance.creativex.recorder.p940b.p941a.AbstractC14177d, com.p2082ss.android.ugc.aweme.shortvideo.record.C72796k
    /* renamed from: a */
    public final void mo22739a(PrivacyCert privacyCert) {
        C84401c.f188722f.mo123662d("TAG openCamera cameraClosedByLive: " + this.f164982ac);
        super.mo22739a(privacyCert);
        this.f164982ac = false;
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.record.C72809t
    /* renamed from: aG */
    public final boolean mo115116aG() {
        return C65369bi.m117065a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: aU */
    public final /* synthetic */ C89391z mo116048aU() {
        this.f163382p.finish();
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: aV */
    public final /* synthetic */ C89391z mo116049aV() {
        this.f163382p.finish();
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: aW */
    public final /* synthetic */ C89391z mo116050aW() {
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

    /* renamed from: aX */
    private static JSONObject m129545aX() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(DataType.AUDIO, false);
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
    /* renamed from: aI */
    public final void mo115118aI() {
        if (this.f163389w.mo109890c()) {
            C40970e.m82485a("initReaction() called");
            if (this.f164977X == null) {
                this.f164977X = new C72744a(this.f163382p, this.f163385s, this);
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.record.C72809t
    /* renamed from: au */
    public final void mo115133au() {
        super.mo115133au();
        C40970e.m82485a("lackPermission() called");
        C40982q.m82520a("checkPermission", 1, m129545aX());
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.record.C72809t, com.bytedance.als.AbstractC2562j
    public void onCreate() {
        super.onCreate();
        this.f163386t.mo56545c().mo56652a(new C73444w(this));
        C73806f.m129873a(EnumC73804d.RECORD_ON_CREATE);
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.record.C72809t, com.bytedance.als.AbstractC2562j
    public void onDestroy() {
        super.onDestroy();
        if (C65369bi.m117065a()) {
            VERuntime.EnumC85549a.INSTANCE.f191667b.f191650i = false;
            VERuntime.EnumC85549a.INSTANCE.f191667b.f191651j = false;
        }
        C73806f.m129873a(EnumC73804d.RECORD_ON_DESTROY);
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.record.C72796k, com.p2082ss.android.ugc.aweme.shortvideo.record.C72809t
    /* renamed from: aq */
    public final void mo115087aq() {
        super.mo115087aq();
        C84911q.m145921a("TikTokCameraCoreComponent => surfaceCreated isFirstSurfaceCreated: " + this.f163238b + " isOpenCameraSuccess: " + this.f163239c + " cameraClosedByLive: " + this.f164982ac);
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.record.C72796k, com.p2082ss.android.ugc.aweme.shortvideo.record.C72809t, com.bytedance.als.AbstractC2562j
    public void onResume() {
        super.onResume();
        C73806f.m129873a(EnumC73804d.RECORD_ON_RESUME);
        if (C65369bi.m117065a() && !this.f164983ad) {
            this.f163386t.mo56545c().f74654o.mo131493h();
        }
        if (this.f164983ad) {
            this.f164983ad = false;
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

    /* renamed from: a */
    static final /* synthetic */ C89391z m129544a(C21582f fVar) {
        C63236br.m114584a(((ActivityC0218d) fVar.mo35249a(ActivityC0218d.class, (String) null)).getApplication(), C63254m.f143624a, new C63248j().mo101728a(), C63238c.f143571I).mo101716a(C63254m.f143624a.mo101717a());
        VERuntime.m147433a(C65337ag.m117023a());
        return C89391z.f203057a;
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.record.C72796k, com.p2082ss.android.ugc.aweme.shortvideo.record.C72809t
    /* renamed from: c */
    public final void mo115088c(int i) {
        C73975b.C73976a.f166071a.step("av_video_record_init", "camera open success");
        super.mo115088c(i);
        C40982q.m82520a("aweme_open_camera_error_rate", 0, new C69840ar().mo110185a("useVERecoder", (Boolean) true).mo110191a());
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.record.C72809t
    /* renamed from: d */
    public final void mo115142d(int i) {
        super.mo115142d(i);
        C40982q.m82520a("aweme_open_camera_error_rate", 0, new C69840ar().mo110185a("useVERecoder", (Boolean) true).mo110191a());
        C73975b.C73976a.f166071a.step("av_video_record_change_camera", "changeCamera#onOpenSuccess");
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.record.C72809t
    /* renamed from: e */
    public final void mo115144e(int i) {
        if (this.f164981ab != null) {
            this.f164976W.f167132a.mo56801b("CreationID", this.f164981ab);
        }
        C40970e.m82485a("onNativeInitCallBack() called with: ret = [" + i + "]");
        C40982q.m82520a("aweme_camera_preview_init_fail", 0, (JSONObject) null);
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
        C40982q.m82520a("aweme_camera_preview_init_fail", 1, new C69840ar().mo110187a("errorCode", Integer.valueOf(i)).mo110189a("errorDesc", "").mo110189a("exception", str).mo110191a());
        C80510gr.m139533a("camera_error", "3", "native init failed , ve result = ".concat(String.valueOf(i)));
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.record.C72809t
    /* renamed from: a */
    public final void mo115100a(long j) {
        super.mo115100a(j);
        C80322d.m139251a("tool_performance_record_fetch_frames", new C84425b().mo129404a("duration", j).f188764a);
    }

    @Override // com.bytedance.creativex.recorder.p940b.p941a.AbstractC14209z
    /* renamed from: b */
    public final void mo22942b(int i, int i2) {
        this.f163387u.mo130796d(i, i2);
    }

    @Override // com.bytedance.creativex.recorder.p940b.p941a.AbstractC14209z
    /* renamed from: c */
    public final void mo22943c(int i, int i2) {
        this.f163387u.mo130786c(i, i2);
    }

    @Override // com.bytedance.creativex.recorder.p940b.p941a.AbstractC14209z
    /* renamed from: a */
    public final int mo22933a(int i, VETrackParams vETrackParams) {
        this.f163387u.mo130687K();
        return this.f163387u.mo130694a(i, vETrackParams);
    }

    @Override // com.bytedance.creativex.recorder.p940b.p941a.AbstractC14177d, com.p2082ss.android.ugc.aweme.shortvideo.record.C72796k
    /* renamed from: c */
    public final void mo22743c(boolean z, PrivacyCert privacyCert) {
        super.mo22743c(z, privacyCert);
        this.f164982ac = true;
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.record.C72809t
    /* renamed from: f */
    public final void mo115147f(int i, int i2) {
        if (!this.f163302C) {
            C40982q.m82522a("zoom_info_log", new C69840ar().mo110189a("camera_preview_size", "w = " + i + "   h = " + i2).mo110191a());
        }
        super.mo115147f(i, i2);
    }

    @Override // com.bytedance.creativex.recorder.p940b.p941a.AbstractC14179f, com.p2082ss.android.ugc.aweme.shortvideo.record.C72809t
    /* renamed from: b */
    public final void mo22805b(float f, float f2) {
        float a;
        if (!C65425dh.f147580a) {
            f += 100.0f;
        }
        mo115124aO();
        if (f >= 0.0f) {
            C69837ao.m123398a(this.f163382p, f2);
            if (C65425dh.f147580a) {
                ActivityC0218d dVar = this.f163382p;
                C89219l.m154721d(dVar, "");
                a = C69837ao.m123398a(dVar, f2);
            } else {
                ActivityC0218d dVar2 = this.f163382p;
                C89219l.m154721d(dVar2, "");
                f -= C13628n.m24520b(dVar2, 35.0f);
                a = C69837ao.m123398a(dVar2, f2);
            }
            float f3 = f / a;
            if (!C65347aq.m117033a() && f3 > 0.98f) {
                f3 = 1.0f;
            }
            mo115141c(f3);
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

    @Override // com.bytedance.creativex.recorder.p940b.p941a.AbstractC14209z
    /* renamed from: a */
    public final void mo22934a(int i, int i2) {
        this.f163387u.mo130771b(i, i2);
        this.f163387u.mo130687K();
    }

    @Override // com.bytedance.creativex.recorder.p940b.p941a.AbstractC14209z
    /* renamed from: a */
    public final void mo22935a(int i, int i2, boolean z) {
        this.f163387u.mo130693a(i, i2, z);
    }

    public C73438r(C21582f fVar, CameraComponentModel cameraComponentModel, String str) {
        this(fVar, cameraComponentModel, new C73357ab(), str);
    }

    @Override // com.bytedance.creativex.recorder.p940b.p941a.AbstractC14179f, com.p2082ss.android.ugc.aweme.shortvideo.record.C72809t
    /* renamed from: a */
    public final int mo22773a(C78599g gVar, PrivacyCert privacyCert, String str) {
        C73975b.C73976a.f166071a.start("av_video_record_change_camera", "switchFrontRearCamera");
        return super.mo22773a(gVar, privacyCert, str);
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.record.C72809t
    /* renamed from: b */
    public final void mo115139b(int i, int i2, String str) {
        super.mo115139b(i, i2, str);
        C40982q.m82520a("aweme_open_camera_error_rate", i2, new C69840ar().mo110185a("useVERecoder", (Boolean) true).mo110189a("errorDesc", str).mo110191a());
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.record.C72809t
    /* renamed from: a */
    public final void mo115095a(int i, float f, boolean z) {
        super.mo115095a(i, f, z);
        C40982q.m82522a("zoom_info_log", new C69840ar().mo110189a("camera_zoom_size", " size = ".concat(String.valueOf(f))).mo110191a());
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
        C40982q.m82520a("aweme_open_camera_error_rate", i2, new C69840ar().mo110185a("useVERecoder", (Boolean) true).mo110189a("errorDesc", str).mo110191a());
    }

    private C73438r(C21582f fVar, CameraComponentModel cameraComponentModel, AbstractC72769aq aqVar, String str) {
        super(fVar, cameraComponentModel, aqVar, C73437q.f164972a, C73432p.f164966a, new C73440s(fVar, cameraComponentModel), C73431o.m129538a());
        this.f164978Y = true;
        this.f164979Z = new C2563k<>();
        this.f164982ac = false;
        this.f164983ad = true;
        this.f164980aa = new C2563k<>();
        this.f164981ab = str;
        this.f164976W = new C74322m(mo115130ar(), this.f163387u);
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.record.C72809t
    /* renamed from: a */
    public final void mo115099a(int i, boolean z, boolean z2, float f, List<Integer> list) {
        String str;
        super.mo115099a(i, z, z2, f, list);
        C69840ar a = new C69840ar().mo110187a("cameraType", Integer.valueOf(i)).mo110185a("supportZoom", Boolean.valueOf(z)).mo110185a("supportSmooth", Boolean.valueOf(z2)).mo110186a("maxZoom", Float.valueOf(f));
        if (C13617h.m24466b(list)) {
            str = new StringBuilder().append(list.get(0)).toString();
        } else {
            str = " ";
        }
        C40982q.m82522a("zoom_info_log", a.mo110189a("ratios", str).mo110191a());
    }
}
