package com.p2082ss.android.vesdk;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.hardware.Camera;
import android.os.Bundle;
import com.bytedance.bpea.basics.PrivacyCert;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.medialib.log.C30015a;
import com.p2082ss.android.ttve.monitor.C30683b;
import com.p2082ss.android.ttve.monitor.C30693g;
import com.p2082ss.android.ttve.monitor.C30695h;
import com.p2082ss.android.ttve.nativePort.TELogcat;
import com.p2082ss.android.ttvecamera.AbstractC30753a;
import com.p2082ss.android.ttvecamera.C30840h;
import com.p2082ss.android.ttvecamera.C30844i;
import com.p2082ss.android.ttvecamera.C30853j;
import com.p2082ss.android.ttvecamera.C30933l;
import com.p2082ss.android.ttvecamera.C30956m;
import com.p2082ss.android.ttvecamera.C30966n;
import com.p2082ss.android.ttvecamera.C30969o;
import com.p2082ss.android.ttvecamera.TECameraCapture;
import com.p2082ss.android.ttvecamera.TEFrameRateRange;
import com.p2082ss.android.ttvecamera.TEFrameSizei;
import com.p2082ss.android.ttvecamera.p2192a.C30756a;
import com.p2082ss.android.ttvecamera.p2201j.AbstractC30857b;
import com.p2082ss.android.ttvecamera.p2201j.C30862c;
import com.p2082ss.android.vesdk.C85346av;
import com.p2082ss.android.vesdk.VECameraSettings;
import com.p2082ss.android.vesdk.VEListener;
import com.p2082ss.android.vesdk.VESensService;
import com.p2082ss.android.vesdk.p4386b.AbstractC85381a;
import com.p2082ss.android.vesdk.p4388d.C85455a;
import com.p2082ss.android.vesdk.p4388d.C85456b;
import com.p2082ss.android.vesdk.p4388d.C85459c;
import com.p2082ss.android.vesdk.p4388d.C85460d;
import com.p2082ss.android.vesdk.p4389e.C85462a;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.vesdk.o */
public class C85528o implements TECameraCapture.AbstractC30747a, C30933l.AbstractC30953n, C30933l.AbstractC30955p, AbstractC85381a {

    /* renamed from: a */
    public static final String f191590a = C85528o.class.getSimpleName();

    /* renamed from: b */
    protected VECameraSettings f191591b;

    /* renamed from: c */
    protected C30933l f191592c;

    /* renamed from: d */
    protected Context f191593d;

    /* renamed from: e */
    protected VESize f191594e = new VESize(1280, 720);

    /* renamed from: f */
    protected VESize f191595f = null;

    /* renamed from: g */
    protected C85346av.AbstractC85366k f191596g;

    /* renamed from: h */
    protected C85346av.AbstractC85373r f191597h;

    /* renamed from: i */
    protected VEListener.AbstractC85242k f191598i;

    /* renamed from: j */
    protected VEListener.AbstractC85225ad f191599j;

    /* renamed from: k */
    public AtomicBoolean f191600k = new AtomicBoolean(false);

    /* renamed from: l */
    public C85456b f191601l;

    /* renamed from: m */
    public boolean f191602m;

    /* renamed from: n */
    public boolean f191603n = false;

    /* renamed from: o */
    public long f191604o = 0;

    /* renamed from: p */
    public C30933l.AbstractC30946g f191605p = new C30933l.AbstractC30946g() {
        /* class com.p2082ss.android.vesdk.C85528o.C855377 */

        static {
            Covode.recordClassIndex(99706);
        }
    };

    /* renamed from: q */
    public C30933l.AbstractC30947h f191606q = new C30933l.AbstractC30947h() {
        /* class com.p2082ss.android.vesdk.C85528o.C855388 */

        static {
            Covode.recordClassIndex(99707);
        }

        @Override // com.p2082ss.android.ttvecamera.C30933l.AbstractC30947h
        /* renamed from: a */
        public final void mo56042a(int[] iArr) {
        }
    };

    /* renamed from: r */
    public TECameraCapture.AbstractC30749c f191607r = new TECameraCapture.AbstractC30749c() {
        /* class com.p2082ss.android.vesdk.C85528o.C855333 */

        static {
            Covode.recordClassIndex(99702);
        }

        @Override // com.p2082ss.android.ttvecamera.TECameraCapture.AbstractC30749c
        /* renamed from: a */
        public final TEFrameSizei mo55591a(List<TEFrameSizei> list, List<TEFrameSizei> list2) {
            if (C85528o.this.f191599j == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            for (TEFrameSizei tEFrameSizei : list) {
                arrayList.add(new VESize(tEFrameSizei.f73616a, tEFrameSizei.f73617b));
            }
            for (TEFrameSizei tEFrameSizei2 : list2) {
                arrayList2.add(new VESize(tEFrameSizei2.f73616a, tEFrameSizei2.f73617b));
            }
            VESize a = C85528o.this.f191599j.mo130308a();
            if (a == null) {
                return null;
            }
            TEFrameSizei tEFrameSizei3 = new TEFrameSizei();
            tEFrameSizei3.f73616a = a.width;
            tEFrameSizei3.f73617b = a.height;
            return tEFrameSizei3;
        }
    };

    /* renamed from: s */
    public C30933l.AbstractC30952m f191608s = new C30933l.AbstractC30952m() {
        /* class com.p2082ss.android.vesdk.C85528o.C855344 */

        static {
            Covode.recordClassIndex(99703);
        }
    };

    /* renamed from: t */
    private C85297a<C85456b> f191609t;

    /* renamed from: u */
    private TECameraCapture f191610u = new TECameraCapture(this, this.f191607r);

    /* renamed from: v */
    private int f191611v = -1;

    /* renamed from: w */
    private int f191612w = -1;

    /* renamed from: x */
    private boolean f191613x = true;

    /* renamed from: y */
    private final Object f191614y = new Object();

    /* renamed from: z */
    private AbstractC30857b.AbstractC30860a f191615z = new AbstractC30857b.AbstractC30861b() {
        /* class com.p2082ss.android.vesdk.C85528o.C855322 */

        static {
            Covode.recordClassIndex(99701);
        }

        @Override // com.p2082ss.android.ttvecamera.p2201j.AbstractC30857b.AbstractC30860a
        public final void onNewSurfaceTexture(SurfaceTexture surfaceTexture) {
            C85456b bVar = C85528o.this.f191601l;
            if (bVar != null && bVar.f191386e != null) {
                bVar.f191386e.onNewSurfaceTexture(surfaceTexture);
            }
        }

        @Override // com.p2082ss.android.ttvecamera.p2201j.AbstractC30857b.AbstractC30861b
        /* renamed from: a */
        public final void mo55889a(SurfaceTexture surfaceTexture) {
            C85456b bVar = C85528o.this.f191601l;
            if (bVar != null && bVar.f191386e != null && (bVar.f191386e instanceof C85456b.AbstractC85458b)) {
                ((C85456b.AbstractC85458b) bVar.f191386e).mo131088a(surfaceTexture, true);
            }
        }

        @Override // com.p2082ss.android.ttvecamera.p2201j.AbstractC30857b.AbstractC30861b
        /* renamed from: a */
        public final void mo55890a(Object obj) {
            C85456b bVar = C85528o.this.f191601l;
            if (bVar != null && bVar.f191386e != null && (bVar.f191386e instanceof C85456b.AbstractC85458b)) {
                ((C85456b.AbstractC85458b) bVar.f191386e).mo131090a(obj);
            }
        }

        @Override // com.p2082ss.android.ttvecamera.p2201j.AbstractC30857b.AbstractC30860a
        public final void onFrameCaptured(C30844i iVar) {
            C85456b bVar = C85528o.this.f191601l;
            if (C85528o.this.f191591b.f190723x == VECameraSettings.CAMERA_OUTPUT_MODE.SURFACE_FRAME && (C85528o.this.f191591b.f190711l.ordinal() != iVar.f73882c.f73902h || C85528o.this.f191603n || !C85528o.this.f191600k.get())) {
                C85315al.m146637a(C85528o.f191590a, "getCameraFacing:" + C85528o.this.f191591b.f190711l.ordinal() + "  frameFacing:" + iVar.f73882c.f73902h + " mSwitchCamera:" + C85528o.this.f191603n + " mIsConnected:" + C85528o.this.f191600k.get());
                if (C85528o.this.f191603n) {
                    C85528o.this.f191603n = false;
                }
            } else if (!(bVar == null || bVar.f191386e == null)) {
                bVar.f191390i = !C85528o.this.f191602m;
                bVar.f191386e.onFrameCaptured(iVar);
            }
            if (!C85528o.this.f191602m) {
                long currentTimeMillis = System.currentTimeMillis() - C85528o.this.f191604o;
                VEListener.AbstractC85242k kVar = C85528o.this.f191598i;
                if (kVar != null) {
                    kVar.mo56699a(3, 0, "Camera first frame captured");
                }
                C85528o.this.f191602m = true;
                C85315al.m146637a(C85528o.f191590a, "Camera first frame captured，consume: ".concat(String.valueOf(currentTimeMillis)));
                C30695h.m63062a(0, "te_record_camera_preview_first_frame_cost", currentTimeMillis);
                Long.valueOf(currentTimeMillis);
            }
        }
    };

    @Override // com.p2082ss.android.vesdk.p4386b.AbstractC85382b
    /* renamed from: f */
    public final VESize mo130852f() {
        return this.f191594e;
    }

    /* renamed from: a */
    public final void mo131481a(C30933l.C30934a aVar, PrivacyCert privacyCert) {
        if (!this.f191600k.get()) {
            C85315al.m146642d(f191590a, "Camera server is not connected now!!");
            return;
        }
        C30933l a = m147375a(this.f191591b);
        if (a.f74179c == 1) {
            C85315al.m146642d(f191590a, "click to switch ar camera failed, not support camera type");
            return;
        }
        int cameraState = this.f191610u.getCameraState();
        if (cameraState != 3) {
            C85315al.m146642d(f191590a, "click to switch ar camera, camera state = ".concat(String.valueOf(cameraState)));
        }
        this.f191612w = 1;
        if (a.f74179c != 2) {
            a.f74179c = 2;
        }
        a.f74202z = 2;
        a.f74177at = aVar;
        a.f74188l = true;
        a.f74143J = true;
        C30756a.C30759a.f73632a.mo55618a(this.f191593d, a);
        m147377a(a);
        this.f191610u.switchCamera(a, privacyCert);
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("resultCode", 0);
            C30683b.m63032a("vesdk_event_camera_arcore", jSONObject, "behavior");
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    @Override // com.p2082ss.android.vesdk.p4386b.AbstractC85382b
    /* renamed from: a */
    public final int mo130851a(C85297a<C85456b> aVar) {
        this.f191609t = aVar;
        if (aVar == null || aVar.mo130621b()) {
            C85315al.m146642d(f191590a, "start with empty TECapturePipeline list");
            return -100;
        }
        C85315al.m146639b(f191590a, "start with TECapturePipeline list");
        C85394bg.m146928a("start");
        int b = mo130848b();
        C85394bg.m146929b();
        return b;
    }

    @Override // com.p2082ss.android.vesdk.p4386b.AbstractC85381a
    /* renamed from: a */
    public final int mo130847a(boolean z) {
        return mo131477a(z, (PrivacyCert) null);
    }

    /* renamed from: a */
    public final int mo131477a(boolean z, PrivacyCert privacyCert) {
        C85394bg.m146928a("close");
        this.f191600k.set(false);
        m147383q();
        int disConnect = this.f191610u.disConnect(!z, privacyCert);
        C85394bg.m146929b();
        return disConnect;
    }

    /* renamed from: a */
    public final int mo131475a(VECameraSettings vECameraSettings, PrivacyCert privacyCert) {
        C30015a.f71628b = System.currentTimeMillis();
        this.f191591b = vECameraSettings;
        this.f191592c = m147375a(vECameraSettings);
        this.f191603n = true;
        if (this.f191591b.f190683M || this.f191591b.mo130183a() == VECameraSettings.CAMERA_TYPE.TYPE_VENDOR_GNOB) {
            mo131493h();
        }
        int switchCamera = this.f191610u.switchCamera(this.f191592c, privacyCert);
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("currentCamera", vECameraSettings.f190711l.name());
            jSONObject.put("resultCode", switchCamera);
            C30683b.m63032a("vesdk_event_recorder_change_camera", jSONObject, "behavior");
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return switchCamera;
    }

    /* renamed from: a */
    public final int mo131476a(final C85302aa aaVar) {
        C30966n nVar;
        if (aaVar == null) {
            nVar = null;
        } else {
            nVar = new C30966n(aaVar.f190897a, aaVar.f190898b, aaVar.f190899c, aaVar.f190900d, aaVar.f190901e);
            nVar.f74240g = aaVar.f190902f;
            nVar.f74241h = aaVar.f190903g;
            nVar.f74242i = aaVar.f190904h;
            nVar.f74243j = aaVar.f190905i;
            if (aaVar.f190906j != null) {
                nVar.f74244k = new AbstractC30753a.AbstractC30754a() {
                    /* class com.p2082ss.android.vesdk.C85528o.C855399 */

                    static {
                        Covode.recordClassIndex(99708);
                    }

                    @Override // com.p2082ss.android.ttvecamera.AbstractC30753a.AbstractC30754a
                    /* renamed from: a */
                    public final List<Camera.Area> mo55614a() {
                        return aaVar.f190906j.mo130853a();
                    }
                };
            }
            if (aaVar.f190907k != null) {
                nVar.f74245l = new AbstractC30753a.AbstractC30755b() {
                    /* class com.p2082ss.android.vesdk.C85528o.C8553010 */

                    static {
                        Covode.recordClassIndex(99699);
                    }

                    @Override // com.p2082ss.android.ttvecamera.AbstractC30753a.AbstractC30755b
                    /* renamed from: a */
                    public final List<Camera.Area> mo55615a() {
                        return aaVar.f190907k.mo130854a();
                    }
                };
            }
            if (aaVar.f190908l != null) {
                nVar.f74246m = new C30966n.AbstractC30967a() {
                    /* class com.p2082ss.android.vesdk.C85528o.C8553111 */

                    static {
                        Covode.recordClassIndex(99700);
                    }

                    @Override // com.p2082ss.android.ttvecamera.C30966n.AbstractC30967a
                    /* renamed from: a */
                    public final void mo56059a(int i, int i2, String str) {
                        aaVar.f190908l.mo115078a(i, i2);
                    }
                };
            }
        }
        return this.f191610u.focusAtPoint(nVar);
    }

    /* renamed from: a */
    public final void mo131483a(C85346av.AbstractC85366k kVar) {
        this.f191596g = kVar;
    }

    /* renamed from: a */
    public final void mo131484a(C85346av.AbstractC85373r rVar) {
        this.f191597h = rVar;
        TECameraCapture tECameraCapture = this.f191610u;
        if (tECameraCapture != null) {
            tECameraCapture.setSATZoomCallback(this.f191608s);
        }
    }

    /* renamed from: a */
    public final float[] mo131485a(C30933l.AbstractC30944e eVar) {
        return this.f191610u.getFOV(eVar);
    }

    /* renamed from: a */
    public final void mo131480a(Bundle bundle) {
        this.f191610u.setFeatureParameters(bundle);
    }

    /* renamed from: a */
    public final Bundle mo131478a(Context context) {
        Bundle bundle = new Bundle();
        bundle.putInt("device_support_wide_angle_mode", m147379m());
        bundle.putInt("device_support_antishake_mode", m147380n());
        bundle.putInt("device_support_ai_night_video", m147381o());
        bundle.putBoolean("device_support_multicamera_zoom", m147382p());
        this.f191610u.getCameraAllFeatures(context, bundle);
        return bundle;
    }

    /* renamed from: a */
    public final void mo131479a(int i) {
        this.f191610u.setExposureCompensation(i);
    }

    /* renamed from: a */
    public final int[] mo131486a(C30933l.AbstractC30947h hVar) {
        return this.f191610u.getISORange(hVar);
    }

    @Override // com.p2082ss.android.vesdk.p4386b.AbstractC85381a
    /* renamed from: a */
    public final int mo130846a() {
        return mo131473a((PrivacyCert) null);
    }

    /* renamed from: e */
    public final float mo131491e() {
        return this.f191610u.queryShaderZoomAbility(this);
    }

    /* renamed from: g */
    public final int mo131492g() {
        return this.f191610u.getCameraState();
    }

    /* renamed from: i */
    public final C30933l.C30943d mo131494i() {
        return this.f191610u.getCameraECInfo();
    }

    /* renamed from: j */
    public final boolean mo131495j() {
        return this.f191610u.isSupportedExposureCompensation();
    }

    static {
        Covode.recordClassIndex(99697);
    }

    @Override // com.p2082ss.android.vesdk.p4386b.AbstractC85381a
    /* renamed from: c */
    public final int mo130849c() {
        C85394bg.m146928a("stopPreview");
        int stop = this.f191610u.stop();
        C85394bg.m146929b();
        return stop;
    }

    @Override // com.p2082ss.android.ttvecamera.C30933l.AbstractC30955p
    public boolean enableSmooth() {
        C85346av.AbstractC85366k kVar = this.f191596g;
        if (kVar == null || !kVar.mo56703a()) {
            return false;
        }
        return true;
    }

    /* renamed from: h */
    public final void mo131493h() {
        C85315al.m146639b(f191590a, "newSurfaceTexture...");
        this.f191612w = 1;
    }

    /* renamed from: k */
    public final void mo131496k() {
        C85315al.m146637a(f191590a, "onBackGround");
        this.f191610u.changeAppLifeCycle(true);
    }

    /* renamed from: l */
    public final void mo131497l() {
        C85315al.m146637a(f191590a, "onForeGround");
        this.f191610u.changeAppLifeCycle(false);
    }

    /* renamed from: m */
    private static int m147379m() {
        return ((Integer) C85568t.m147473a().mo131557a("ve_camera_wide_angle", (Object) -1)).intValue();
    }

    /* renamed from: n */
    private static int m147380n() {
        return ((Integer) C85568t.m147473a().mo131557a("ve_camera_stablization", (Object) -1)).intValue();
    }

    /* renamed from: o */
    private static int m147381o() {
        return ((Integer) C85568t.m147473a().mo131557a("ve_camera_ai_augmentation", (Object) 0)).intValue();
    }

    /* renamed from: p */
    private static boolean m147382p() {
        return ((Boolean) C85568t.m147473a().mo131557a("ve_support_camera_multicam_zoom", (Object) false)).booleanValue();
    }

    /* renamed from: q */
    private static void m147383q() {
        VESensService.getInstance().setSensCheckObjExpectStatus(VESensService.getInstance().getIDWithName(VESensService.SENS_SERVICE_TYPE_CAMERA), VESensService.EnumC85266b.PRIVACY_STATUS_RELEASE);
    }

    /* renamed from: r */
    private static void m147384r() {
        VESensService.getInstance().setSensCheckObjExpectStatus(VESensService.getInstance().getIDWithName(VESensService.SENS_SERVICE_TYPE_CAMERA), VESensService.EnumC85266b.PRIVACY_STATUS_USING);
    }

    @Override // com.p2082ss.android.vesdk.p4386b.AbstractC85381a
    /* renamed from: d */
    public final void mo130850d() {
        C85394bg.m146928a("destroy");
        this.f191596g = null;
        this.f191608s = null;
        this.f191597h = null;
        this.f191598i = null;
        this.f191593d = null;
        this.f191607r = null;
        C30933l lVar = this.f191592c;
        if (lVar != null) {
            lVar.mo56038a();
            this.f191592c = null;
        }
        TECameraCapture.registerLogOutput(C85315al.f190970a, null);
        TECameraCapture.registerException(null);
        C85394bg.m146929b();
    }

    @Override // com.p2082ss.android.vesdk.p4386b.AbstractC85381a
    /* renamed from: b */
    public final int mo130848b() {
        int i;
        AbstractC30857b.AbstractC30860a aVar;
        C30862c.C30863a aVar2;
        C85297a<C85456b> aVar3 = this.f191609t;
        if (aVar3 == null || aVar3.mo130621b()) {
            C85315al.m146642d(f191590a, "startPreview with empty TECapturePipeline list");
            return -100;
        } else if (!this.f191600k.get()) {
            C85315al.m146641c(f191590a, "startPreview when camera is closed!");
            return -105;
        } else {
            C85394bg.m146928a("startPreview");
            boolean equals = "landscape".equals(this.f191591b.f190713n);
            boolean z = false;
            for (C85456b bVar : this.f191609t.mo130623c()) {
                if (bVar == null || !bVar.mo131104b()) {
                    C85315al.m146641c(f191590a, "pipeline is not valid");
                } else {
                    if (bVar.f191387f) {
                        aVar = this.f191615z;
                        this.f191601l = bVar;
                    } else {
                        aVar = bVar.f191386e;
                    }
                    if (bVar.f191384c == C30844i.EnumC30847b.PIXEL_FORMAT_Recorder) {
                        C85459c cVar = (C85459c) bVar;
                        if (this.f191612w == 1 && !this.f191613x) {
                            cVar.mo131103a().release();
                            cVar.mo131105a(new C85462a(cVar.f191392b));
                            if (this.f191612w == 1) {
                                this.f191612w = 0;
                            }
                        }
                        aVar2 = new C30862c.C30863a(cVar.f191385d, aVar, cVar.f191387f, cVar.mo131103a(), cVar.f191392b, cVar.f191391a);
                    } else if (bVar.f191384c == C30844i.EnumC30847b.PIXEL_FORMAT_OpenGL_OES) {
                        C85460d dVar = (C85460d) bVar;
                        if (this.f191612w == 1 && !this.f191613x) {
                            dVar.f191394b.release();
                            C85462a aVar4 = new C85462a(dVar.f191393a);
                            dVar.f191394b = aVar4;
                            if (aVar != null) {
                                aVar.onNewSurfaceTexture(aVar4);
                            }
                            if (this.f191612w == 1) {
                                this.f191612w = 0;
                            }
                            C30969o.m63686a(f191590a, "NewSurfaceTexture...");
                        }
                        aVar2 = new C30862c.C30863a(dVar.f191385d, aVar, dVar.f191387f, dVar.f191394b, dVar.f191393a);
                    } else {
                        C85455a aVar5 = (C85455a) bVar;
                        aVar2 = new C30862c.C30863a(aVar5.f191385d, aVar, aVar5.f191387f, aVar5.f191382a, aVar5.f191384c, aVar5.f191383b);
                    }
                    this.f191610u.addCameraProvider(aVar2);
                    bVar.f191388g = equals;
                    z = true;
                }
            }
            if (z) {
                i = this.f191610u.start();
            } else {
                i = -1;
            }
            C85394bg.m146929b();
            return i;
        }
    }

    /* renamed from: a */
    public final void mo131482a(VEListener.AbstractC85242k kVar) {
        this.f191598i = kVar;
    }

    /* renamed from: b */
    public final int mo131487b(float f) {
        return this.f191610u.zoomV2(f, this);
    }

    /* renamed from: a */
    public final int mo131470a(float f) {
        return this.f191610u.startZoom(f, this);
    }

    /* renamed from: b */
    public final int mo131488b(boolean z) {
        return this.f191610u.queryZoomAbility(this, z);
    }

    @Override // com.p2082ss.android.ttvecamera.TECameraCapture.AbstractC30747a
    public void onCaptureStopped(int i) {
        VEListener.AbstractC85242k kVar = this.f191598i;
        if (kVar != null) {
            kVar.mo56699a(5, i, "Camera is closed!");
        }
    }

    /* renamed from: a */
    private static void m147378a(String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("resultCode", 0);
            C30683b.m63032a(str, jSONObject, "behavior");
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: b */
    public final void mo131489b(PrivacyCert privacyCert) {
        if (!this.f191600k.get()) {
            C85315al.m146642d(f191590a, "Camera server is not connected now!!");
            return;
        }
        int cameraState = this.f191610u.getCameraState();
        if (cameraState != 3) {
            C85315al.m146642d(f191590a, "click to switch normal camera, camera state = ".concat(String.valueOf(cameraState)));
        }
        this.f191592c.f74143J = true;
        m147377a(this.f191592c);
        this.f191612w = 1;
        this.f191610u.switchCamera(this.f191592c, privacyCert);
    }

    /* renamed from: a */
    private void m147377a(C30933l lVar) {
        MethodCollector.m26663i(7680);
        int cameraState = this.f191610u.getCameraState();
        boolean z = false;
        if (cameraState != 3) {
            boolean z2 = lVar.f74143J;
            lVar.f74143J = false;
            z = z2;
        }
        C30969o.m63689d(f191590a, "tryWaitSwitchTask, state: ".concat(String.valueOf(cameraState)));
        if (z) {
            synchronized (this.f191614y) {
                int i = 10;
                while (true) {
                    try {
                        TECameraCapture tECameraCapture = this.f191610u;
                        if (tECameraCapture != null && tECameraCapture.getCameraState() != 3 && i > 0) {
                            i--;
                            try {
                                this.f191614y.wait(100);
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                            C30969o.m63688c(f191590a, "wait switch task, to mode: " + lVar.f74202z + ", try block...count:" + i);
                        }
                    } finally {
                        MethodCollector.m26664o(7680);
                    }
                }
            }
            return;
        }
        MethodCollector.m26664o(7680);
    }

    /* renamed from: a */
    private C30933l m147375a(VECameraSettings vECameraSettings) {
        boolean z;
        if (vECameraSettings == null) {
            return null;
        }
        C30933l lVar = new C30933l(this.f191593d);
        vECameraSettings.mo130192m();
        lVar.f74179c = vECameraSettings.mo130183a().ordinal();
        lVar.f74181e = vECameraSettings.f190711l.ordinal();
        lVar.f74140G = vECameraSettings.f190712m;
        lVar.f74135B = vECameraSettings.f190707h.ordinal();
        lVar.f74192p.f73616a = vECameraSettings.f190705f.height;
        lVar.f74192p.f73617b = vECameraSettings.f190705f.width;
        lVar.f74144K = vECameraSettings.f190704e;
        lVar.f74151R = vECameraSettings.f190714o;
        lVar.f74200x = vECameraSettings.f190718s;
        lVar.f74196t = vECameraSettings.f190719t;
        lVar.f74202z = vECameraSettings.f190725z.ordinal();
        this.f191594e.width = lVar.f74192p.f73616a;
        this.f191594e.height = lVar.f74192p.f73617b;
        lVar.f74142I = vECameraSettings.f190724y;
        lVar.f74186j = vECameraSettings.f190673C;
        lVar.f74197u = vECameraSettings.mo130188i();
        lVar.f74198v = vECameraSettings.mo130189j();
        lVar.f74199w = vECameraSettings.f190680J;
        lVar.f74145L = vECameraSettings.mo130194o().ordinal();
        lVar.f74136C = vECameraSettings.f190681K;
        lVar.f74163ad = vECameraSettings.f190682L.ordinal();
        lVar.f74137D = vECameraSettings.f190721v;
        C30956m.f74222a = lVar.f74137D;
        lVar.f74146M = vECameraSettings.mo130195p();
        lVar.f74147N = vECameraSettings.mo130196q();
        lVar.f74148O = vECameraSettings.mo130197r();
        lVar.f74149P = vECameraSettings.mo130198s();
        lVar.f74150Q = vECameraSettings.mo130199t();
        lVar.f74154U = vECameraSettings.mo130200u();
        lVar.f74155V = vECameraSettings.mo130201v();
        lVar.f74156W = vECameraSettings.mo130186g();
        lVar.f74157X = vECameraSettings.mo130187h();
        lVar.f74187k = vECameraSettings.f190674D;
        lVar.f74188l = vECameraSettings.f190671A;
        lVar.f74190n = vECameraSettings.mo130190k();
        lVar.f74191o = vECameraSettings.f190672B;
        lVar.f74189m = vECameraSettings.mo130193n();
        if (vECameraSettings.mo130183a() == VECameraSettings.CAMERA_TYPE.TYPE_VENDOR_GNOB) {
            Bundle bundle = lVar.f74136C;
            if (vECameraSettings.f190711l == VECameraSettings.CAMERA_FACING_ID.FACING_BACK) {
                z = true;
            } else {
                z = false;
            }
            bundle.putBoolean("enable_video_stabilization", z);
        }
        if (vECameraSettings.mo130183a() == VECameraSettings.CAMERA_TYPE.TYPE_VENDOR_RDHW) {
            if (vECameraSettings.f190711l == VECameraSettings.CAMERA_FACING_ID.FACING_FRONT) {
                lVar.f74136C.putBoolean("enable_video_stabilization", false);
                if (!VECameraSettings.m146508b()) {
                    C85315al.m146637a(f191590a, "ENABLE_VIDEO_HDR");
                    lVar.f74136C.putBoolean("enable_video_hdr", true);
                }
            } else {
                boolean d = VECameraSettings.m146510d();
                lVar.f74136C.putBoolean("enable_video_stabilization", d);
                if (d && VECameraSettings.m146509c()) {
                    lVar.f74136C.putString("noise_reduce", "fast");
                }
            }
        } else if (vECameraSettings.mo130183a() == VECameraSettings.CAMERA_TYPE.TYPE_OGXM_V2 && !VECameraSettings.m146508b()) {
            C85315al.m146637a(f191590a, "ENABLE_VIDEO_HDR");
            lVar.f74136C.putBoolean("enable_video_hdr", true);
        }
        if (vECameraSettings.f190684N) {
            lVar.f74164ae = true;
        } else {
            lVar.f74164ae = ((Boolean) C85568t.m147473a().mo131557a("ve_camera_enable_previewing_fallback", Boolean.valueOf(lVar.f74164ae))).booleanValue();
        }
        String str = f191590a;
        C85315al.m146639b(str, "camera previewing fallback enabled: " + lVar.f74164ae);
        if (vECameraSettings.f190685O) {
            lVar.f74165af = true;
        } else {
            lVar.f74165af = ((Boolean) C85568t.m147473a().mo131557a("ve_enable_background_strategy", Boolean.valueOf(lVar.f74165af))).booleanValue();
        }
        C85315al.m146639b(str, "KEY_ENABLE_BACKGROUND_STRATEGY : " + lVar.f74165af);
        if (vECameraSettings.f190686P) {
            lVar.f74166ag = true;
        } else {
            lVar.f74166ag = ((Boolean) C85568t.m147473a().mo131557a("ve_enable_open_camera1_optimize", (Object) false)).booleanValue();
        }
        C85315al.m146639b(str, "enable open camera1 opt : " + lVar.f74166ag);
        if (vECameraSettings.f190687Q) {
            lVar.f74167ah = true;
        } else {
            lVar.f74167ah = ((Boolean) C85568t.m147473a().mo131557a("ve_enable_open_camera1_crs", (Object) false)).booleanValue();
        }
        C85315al.m146639b(str, "enable open camera1 crs : " + lVar.f74167ah);
        lVar.f74153T = ((Boolean) C85568t.m147473a().mo131557a("ve_enable_new_create_capture_session", (Object) false)).booleanValue();
        C85315al.m146639b(str, "createInternalSettings, enable new create capture session = " + lVar.f74153T);
        lVar.f74158Y = vECameraSettings.f190677G;
        lVar.f74159Z = vECameraSettings.f190678H;
        lVar.f74160aa = vECameraSettings.f190679I;
        int[] f = vECameraSettings.mo130185f();
        lVar.f74180d = new TEFrameRateRange(f[0], f[1]);
        lVar.f74169aj = vECameraSettings.f190689S;
        lVar.f74171al = vECameraSettings.f190690T;
        lVar.f74136C.putBoolean("ve_enable_camera_devices_cache", ((Boolean) C85568t.m147473a().mo131557a("ve_enable_camera_devices_cache", (Object) false)).booleanValue());
        lVar.f74172am = vECameraSettings.mo130191l();
        lVar.f74185i = ((Boolean) C85568t.m147473a().mo131557a("ve_enable_camera2_zsl_capture", (Object) false)).booleanValue();
        lVar.f74173an = vECameraSettings.f190683M;
        lVar.f74174ao = ((Boolean) C85568t.m147473a().mo131557a("ve_enable_camera_api2_detect", (Object) false)).booleanValue();
        lVar.f74175ap = ((Float) C85568t.m147473a().mo131557a("ve_camera_zoom_ratio_max", Float.valueOf(-1.0f))).floatValue();
        lVar.f74176aq = ((Float) C85568t.m147473a().mo131557a("ve_camera_zoom_ratio_min", Float.valueOf(-1.0f))).floatValue();
        lVar.f74170ak = VECameraSettings.m146511e();
        return lVar;
    }

    /* renamed from: a */
    public final int mo131473a(PrivacyCert privacyCert) {
        C30933l lVar = this.f191592c;
        if (lVar == null || this.f191591b == null) {
            C30969o.m63689d(f191590a, "mCameraParams == null, please init VECameraCapture!");
            return -105;
        } else if (lVar.f74192p.f73616a <= 0 || this.f191592c.f74192p.f73617b <= 0) {
            return -100;
        } else {
            if (!this.f191600k.get()) {
                C30015a.f71627a = System.currentTimeMillis();
            }
            this.f191600k.set(true);
            if (this.f191592c.f74179c != this.f191591b.mo130183a().ordinal()) {
                this.f191592c = m147375a(this.f191591b);
            }
            C85394bg.m146928a("open");
            m147384r();
            int connect = this.f191610u.connect(this.f191592c, privacyCert);
            C85394bg.m146929b();
            return connect;
        }
    }

    /* renamed from: a */
    public final int mo131474a(VECameraSettings.CAMERA_FLASH_MODE camera_flash_mode) {
        int i;
        if (camera_flash_mode == VECameraSettings.CAMERA_FLASH_MODE.CAMERA_FLASH_OFF) {
            i = 0;
        } else if (camera_flash_mode == VECameraSettings.CAMERA_FLASH_MODE.CAMERA_FLASH_ON) {
            i = 1;
        } else if (camera_flash_mode == VECameraSettings.CAMERA_FLASH_MODE.CAMERA_FLASH_AUTO) {
            i = 3;
        } else if (camera_flash_mode == VECameraSettings.CAMERA_FLASH_MODE.CAMERA_FLASH_TORCH) {
            i = 2;
        } else if (camera_flash_mode != VECameraSettings.CAMERA_FLASH_MODE.CAMERA_FLASH_RED_EYE) {
            return -100;
        } else {
            i = 4;
        }
        return this.f191610u.switchFlashMode(i);
    }

    @Override // com.p2082ss.android.ttvecamera.TECameraCapture.AbstractC30747a
    public void onError(int i, String str) {
        VEListener.AbstractC85242k kVar = this.f191598i;
        if (kVar != null) {
            kVar.mo56700a(i, str);
        }
    }

    /* renamed from: b */
    public final boolean mo131490b(Context context, VECameraSettings vECameraSettings) {
        if (vECameraSettings.mo130183a() != VECameraSettings.CAMERA_TYPE.TYPE1) {
            boolean isARCoreSupported = this.f191610u.isARCoreSupported(context);
            C30969o.m63686a(f191590a, "isARCoreSupported : ".concat(String.valueOf(isARCoreSupported)));
            return isARCoreSupported;
        }
        C30969o.m63686a(f191590a, "isARCoreSupported : false ");
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x002b A[Catch:{ all -> 0x00d4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0034 A[Catch:{ all -> 0x00d4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x005e A[Catch:{ all -> 0x00d4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0086 A[Catch:{ all -> 0x00d4 }] */
    @Override // com.p2082ss.android.ttvecamera.TECameraCapture.AbstractC30747a
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCaptureStarted(int r8, int r9) {
        /*
        // Method dump skipped, instructions count: 218
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.vesdk.C85528o.onCaptureStarted(int, int):void");
    }

    /* renamed from: a */
    public final int mo131472a(Context context, VECameraSettings vECameraSettings) {
        C85394bg.m146928a("VECameraCapture-init");
        this.f191593d = context;
        this.f191591b = vECameraSettings;
        this.f191592c = m147375a(vECameraSettings);
        TECameraCapture.registerLogOutput(C85315al.f190970a, new C30969o.AbstractC30971b() {
            /* class com.p2082ss.android.vesdk.C85528o.C855291 */

            static {
                Covode.recordClassIndex(99698);
            }

            @Override // com.p2082ss.android.ttvecamera.C30969o.AbstractC30971b
            public final void Log(byte b, String str, String str2) {
                TELogcat.Log(b, str, str2);
            }
        });
        TECameraCapture.registerMonitor(new C30853j.AbstractC30854a() {
            /* class com.p2082ss.android.vesdk.C85528o.C855355 */

            static {
                Covode.recordClassIndex(99704);
            }

            @Override // com.p2082ss.android.ttvecamera.C30853j.AbstractC30854a
            /* renamed from: a */
            public final void mo55869a(String str, double d) {
                C30695h.m63061a(0, str, d);
            }

            @Override // com.p2082ss.android.ttvecamera.C30853j.AbstractC30854a
            /* renamed from: a */
            public final void mo55870a(String str, long j) {
                C30695h.m63062a(0, str, j);
            }

            @Override // com.p2082ss.android.ttvecamera.C30853j.AbstractC30854a
            /* renamed from: a */
            public final void mo55871a(String str, String str2) {
                C30695h.m63063a(0, str, str2);
            }
        });
        TECameraCapture.registerException(new C30840h.AbstractC30841a() {
            /* class com.p2082ss.android.vesdk.C85528o.C855366 */

            static {
                Covode.recordClassIndex(99705);
            }

            @Override // com.p2082ss.android.ttvecamera.C30840h.AbstractC30841a
            /* renamed from: a */
            public final void mo55862a(Throwable th) {
                C30693g.m63057a(th);
            }
        });
        C85394bg.m146929b();
        return 0;
    }

    @Override // com.p2082ss.android.ttvecamera.C30933l.AbstractC30955p
    public void onChange(int i, float f, boolean z) {
        C85346av.AbstractC85366k kVar = this.f191596g;
        if (kVar != null) {
            kVar.mo56701a(i, f, z);
        }
    }

    /* renamed from: a */
    private static JSONObject m147376a(String str, String str2, String str3) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("oldState", "");
            jSONObject.put("newState", "");
            jSONObject.put("error", str);
            jSONObject.put("startTime", str2);
            jSONObject.put("endTime", str3);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jSONObject;
    }

    @Override // com.p2082ss.android.ttvecamera.TECameraCapture.AbstractC30747a
    public void onInfo(int i, int i2, String str) {
        String[] split;
        int i3;
        VEListener.AbstractC85242k kVar = this.f191598i;
        C85315al.m146639b(f191590a, "onInfo, infoType = " + i + ", ext = " + i2 + ", msg = " + str + ", listener = " + kVar);
        if (1 == i) {
            Bundle bundle = new Bundle();
            bundle.putInt("device_support_wide_angle_mode", m147379m());
            bundle.putInt("device_support_antishake_mode", m147380n());
            bundle.putInt("device_support_ai_night_video", m147381o());
            bundle.putBoolean("device_support_multicamera_zoom", m147382p());
            this.f191610u.updateAllCameraFeatures(bundle);
        }
        if (kVar != null) {
            if (i != 3) {
                i3 = i;
            } else {
                i3 = 6;
            }
            kVar.mo56699a(i3, i2, str);
        }
        if (i == 0) {
            this.f191602m = false;
        } else if (i == 50) {
            if (!(str == null || (split = str.split("x")) == null || split.length != 2)) {
                TEFrameSizei tEFrameSizei = new TEFrameSizei(Integer.valueOf(split[0]).intValue(), Integer.valueOf(split[1]).intValue());
                C85456b bVar = this.f191601l;
                if (!(bVar == null || bVar.f191386e == null)) {
                    bVar.f191386e.mo131089a(tEFrameSizei);
                }
                this.f191595f = new VESize(tEFrameSizei.f73617b, tEFrameSizei.f73616a);
            }
        } else if (i == 3) {
            if (i2 == 2) {
                this.f191604o = System.currentTimeMillis();
            }
        } else if (i == 51) {
            this.f191612w = 1;
        } else if (i == 111) {
            VESensService.getInstance().setSensCheckObjStatus(VESensService.getInstance().getIDWithName(VESensService.SENS_SERVICE_TYPE_CAMERA), VESensService.EnumC85266b.PRIVACY_STATUS_USING);
        } else if (i == 110) {
            VESensService.getInstance().setSensCheckObjStatus(VESensService.getInstance().getIDWithName(VESensService.SENS_SERVICE_TYPE_CAMERA), VESensService.EnumC85266b.PRIVACY_STATUS_RELEASE);
        }
        if (i == 104) {
            C30683b.m63032a("vesdk_event_will_change_flash_mode", m147376a(str, String.valueOf(System.currentTimeMillis()), ""), "behavior");
        } else if (i == 105) {
            C30683b.m63032a("vesdk_event_did_change_flash_mode", m147376a(str, "", String.valueOf(System.currentTimeMillis())), "behavior");
        } else if (i == 106) {
            C30683b.m63032a("vesdk_event_will_start_camera", m147376a(str, String.valueOf(System.currentTimeMillis()), ""), "behavior");
        } else if (i == 107) {
            C30683b.m63032a("vesdk_event_did_start_camera", m147376a(str, "", String.valueOf(System.currentTimeMillis())), "behavior");
        } else if (i == 108) {
            C30683b.m63032a("vesdk_event_will_stop_camera", m147376a(str, String.valueOf(System.currentTimeMillis()), ""), "behavior");
        } else if (i == 109) {
            C30683b.m63032a("vesdk_event_did_stop_camera", m147376a(str, "", String.valueOf(System.currentTimeMillis())), "behavior");
        } else if (i == 113) {
            m147378a("vesdk_event_camera_stablization");
        } else if (i == 112) {
            m147378a("vesdk_event_camera_wide_angle");
        } else if (i == 114) {
            m147378a("vesdk_event_camera_zoom");
        } else if (i == 115) {
            m147378a("vesdk_event_camera_exposure_compensation");
        } else if (i == 116) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("flashMode", i2);
                jSONObject.put("resultCode", 0);
                C30683b.m63032a("vesdk_event_camera_flash_mode", jSONObject, "behavior");
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }

    @Override // com.p2082ss.android.ttvecamera.C30933l.AbstractC30955p
    public void onZoomSupport(int i, boolean z, boolean z2, float f, List<Integer> list) {
        C85346av.AbstractC85366k kVar = this.f191596g;
        if (kVar != null) {
            kVar.mo56702a(i, z, z2, f, list);
        }
    }

    /* renamed from: a */
    public final int mo131471a(int i, int i2, float f, int i3, int i4) {
        return this.f191610u.focusAtPoint(i, i2, f, i3, i4);
    }
}
