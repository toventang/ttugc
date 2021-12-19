package com.p2082ss.android.vesdk;

import android.content.Context;
import android.graphics.Bitmap;
import android.opengl.EGLContext;
import android.text.TextUtils;
import android.util.Log;
import android.view.Surface;
import com.bef.effectsdk.message.MessageCenter;
import com.bytedance.bpea.basics.PrivacyCert;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.medialib.model.EnigmaResult;
import com.p2082ss.android.medialib.presenter.AbstractC30029f;
import com.p2082ss.android.ttve.editorInfo.C30652a;
import com.p2082ss.android.ttve.model.VEFrame;
import com.p2082ss.android.ttve.model.VETrackParams;
import com.p2082ss.android.ttve.monitor.C30683b;
import com.p2082ss.android.ttve.monitor.C30689e;
import com.p2082ss.android.ttve.monitor.C30695h;
import com.p2082ss.android.ttvecamera.C30969o;
import com.p2082ss.android.vesdk.C85568t;
import com.p2082ss.android.vesdk.VEListener;
import com.p2082ss.android.vesdk.faceinfo.C85471b;
import com.p2082ss.android.vesdk.faceinfo.C85474d;
import com.p2082ss.android.vesdk.faceinfo.C85475e;
import com.p2082ss.android.vesdk.filterparam.VEEffectFilterParam;
import com.p2082ss.android.vesdk.lens.VEAdaptiveSharpenParams;
import com.p2082ss.android.vesdk.lens.VEBaseRecorderLensParams;
import com.p2082ss.android.vesdk.lens.VEModelDownload;
import com.p2082ss.android.vesdk.lens.VETaintSceneDetectParams;
import com.p2082ss.android.vesdk.model.BefTextLayout;
import com.p2082ss.android.vesdk.model.BefTextLayoutResult;
import com.p2082ss.android.vesdk.model.VEPrePlayParams;
import com.p2082ss.android.vesdk.p4386b.AbstractC85382b;
import com.p2082ss.android.vesdk.p4387c.AbstractC85401a;
import com.p2082ss.android.vesdk.p4391g.C85509a;
import com.p2082ss.android.vesdk.runtime.AbstractC85556e;
import com.p2082ss.android.vesdk.runtime.VEMapBufferInfo;
import com.p2082ss.android.vesdk.runtime.VERuntime;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.vesdk.av */
public final class C85346av {

    /* renamed from: a */
    public AbstractC85556e f191059a;

    /* renamed from: b */
    protected AbstractC85508g f191060b;

    /* renamed from: c */
    public VEModelDownload.AbstractC85523a f191061c;

    /* renamed from: d */
    private VERuntime f191062d;

    /* renamed from: e */
    private int f191063e;

    /* renamed from: com.ss.android.vesdk.av$a */
    public interface AbstractC85355a {
        static {
            Covode.recordClassIndex(99467);
        }
    }

    /* renamed from: com.ss.android.vesdk.av$b */
    public interface AbstractC85356b {
        static {
            Covode.recordClassIndex(99468);
        }

        /* renamed from: a */
        void mo116956a(int i);
    }

    /* renamed from: com.ss.android.vesdk.av$c */
    public static class C85357c {

        /* renamed from: a */
        public int f191092a;

        /* renamed from: b */
        public String f191093b;

        static {
            Covode.recordClassIndex(99469);
        }
    }

    /* renamed from: com.ss.android.vesdk.av$d */
    public interface AbstractC85358d {
        static {
            Covode.recordClassIndex(99470);
        }

        /* renamed from: a */
        void mo115054a(Bitmap bitmap, int i);
    }

    /* renamed from: com.ss.android.vesdk.av$e */
    public interface AbstractC85359e {
        static {
            Covode.recordClassIndex(99471);
        }

        /* renamed from: a */
        void mo56638a(int i);
    }

    /* renamed from: com.ss.android.vesdk.av$f */
    public interface AbstractC85360f {
        static {
            Covode.recordClassIndex(99472);
        }
    }

    /* renamed from: com.ss.android.vesdk.av$g */
    public interface AbstractC85361g {
        static {
            Covode.recordClassIndex(99473);
        }

        /* renamed from: a */
        BefTextLayoutResult mo56094a(String str, BefTextLayout befTextLayout);
    }

    /* renamed from: com.ss.android.vesdk.av$h */
    public interface AbstractC85362h {
        static {
            Covode.recordClassIndex(99474);
        }

        /* renamed from: a */
        void mo56832a(int i);

        /* renamed from: a */
        void mo56833a(String[] strArr);
    }

    /* renamed from: com.ss.android.vesdk.av$i */
    public interface AbstractC85363i {

        /* renamed from: com.ss.android.vesdk.av$i$a */
        public static class C85364a {

            /* renamed from: a */
            public boolean f191094a;

            /* renamed from: b */
            public VEFrame.EnumC30668a f191095b = VEFrame.EnumC30668a.TEPixFmt_OpenGL_RGBA8;

            static {
                Covode.recordClassIndex(99476);
            }
        }

        static {
            Covode.recordClassIndex(99475);
        }

        /* renamed from: a */
        C85364a mo130838a();

        /* renamed from: a */
        void mo130839a(VEFrame vEFrame);
    }

    /* renamed from: com.ss.android.vesdk.av$j */
    public interface AbstractC85365j {
        static {
            Covode.recordClassIndex(99477);
        }

        /* renamed from: a */
        void mo56846a(EGLContext eGLContext, int i, int i2, int i3, int i4, long j, long j2);
    }

    /* renamed from: com.ss.android.vesdk.av$k */
    public interface AbstractC85366k {
        static {
            Covode.recordClassIndex(99478);
        }

        /* renamed from: a */
        void mo56701a(int i, float f, boolean z);

        /* renamed from: a */
        void mo56702a(int i, boolean z, boolean z2, float f, List<Integer> list);

        /* renamed from: a */
        boolean mo56703a();
    }

    /* renamed from: com.ss.android.vesdk.av$l */
    public interface AbstractC85367l {
        static {
            Covode.recordClassIndex(99479);
        }

        /* renamed from: a */
        void mo56830a(String[] strArr, double[] dArr, boolean[] zArr);
    }

    /* renamed from: com.ss.android.vesdk.av$m */
    public interface AbstractC85368m {
        static {
            Covode.recordClassIndex(99480);
        }
    }

    /* renamed from: com.ss.android.vesdk.av$n */
    public interface AbstractC85369n {
        static {
            Covode.recordClassIndex(99481);
        }

        /* renamed from: a */
        void mo56829a(C85471b bVar, C85474d dVar);
    }

    /* renamed from: com.ss.android.vesdk.av$o */
    public interface AbstractC85370o {
        static {
            Covode.recordClassIndex(99482);
        }
    }

    /* renamed from: com.ss.android.vesdk.av$p */
    public interface AbstractC85371p {
        static {
            Covode.recordClassIndex(99483);
        }
    }

    /* renamed from: com.ss.android.vesdk.av$q */
    public interface AbstractC85372q {
        static {
            Covode.recordClassIndex(99484);
        }

        /* renamed from: a */
        void mo56562a(int i, float f, int i2);
    }

    /* renamed from: com.ss.android.vesdk.av$r */
    public interface AbstractC85373r {
        static {
            Covode.recordClassIndex(99485);
        }
    }

    /* renamed from: com.ss.android.vesdk.av$s */
    public interface AbstractC85374s {
        static {
            Covode.recordClassIndex(99486);
        }

        /* renamed from: a */
        void mo56831a(C85475e eVar);
    }

    static {
        Covode.recordClassIndex(99458);
    }

    /* renamed from: a */
    public final void mo130737a(VEListener.AbstractC85230ai aiVar) {
        this.f191060b.f191465W = aiVar;
    }

    /* renamed from: a */
    public final int mo130698a(VEVideoEncodeSettings vEVideoEncodeSettings, VEAudioEncodeSettings vEAudioEncodeSettings, C85322ar arVar, boolean z) {
        C85394bg.m146928a("VERecorder-init");
        try {
            int a = this.f191060b.mo130946a(null, vEVideoEncodeSettings, vEAudioEncodeSettings, arVar, this.f191059a.mo56847a(), this.f191062d.f191645d.mo131522a(), z);
            C85394bg.m146929b();
            return a;
        } catch (NullPointerException e) {
            throw new C85615x(-1, "init failed: VESDK need to be init: " + Log.getStackTraceString(e));
        } catch (Throwable th) {
            C85394bg.m146929b();
            throw th;
        }
    }

    /* renamed from: a */
    public final int mo130703a(AbstractC85556e eVar) {
        int a = this.f191060b.mo130950a(eVar);
        if (a == 0) {
            this.f191059a = eVar;
        }
        return a;
    }

    /* renamed from: a */
    public final void mo130735a(VECameraSettings vECameraSettings) {
        this.f191060b.f191513as = vECameraSettings;
    }

    /* renamed from: a */
    public final void mo130761a(boolean z) {
        this.f191060b.f191517aw = z;
    }

    /* renamed from: a */
    public final void mo130753a(C85579v vVar) {
        AbstractC85508g gVar = this.f191060b;
        gVar.f191518ax = vVar;
        gVar.f191520az = EnumC85329au.DUET;
        try {
            C30683b.m63032a("vesdk_event_recorder_init_duet", new JSONObject(vVar.toString()), "behavior");
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    public final void mo130719a() {
        this.f191060b.mo131034d();
    }

    /* renamed from: a */
    public final void mo130743a(C85328at atVar) {
        AbstractC85508g gVar = this.f191060b;
        gVar.f191519ay = atVar;
        gVar.f191520az = EnumC85329au.REACTION;
    }

    /* renamed from: a */
    public final void mo130725a(int i) {
        this.f191060b.mo131012b(i);
    }

    /* renamed from: a */
    public final void mo130726a(int i, int i2, int i3, int i4) {
        this.f191060b.mo130969a(i, i2, i3, i4);
    }

    /* renamed from: b */
    public final int[] mo130783b() {
        return this.f191060b.mo131042e();
    }

    /* renamed from: a */
    public final int[] mo130767a(int i, int i2, int i3, int i4, float f) {
        return this.f191060b.mo131002a(i, i2, i3, i4, f);
    }

    /* renamed from: a */
    public final boolean mo130765a(int i, int i2) {
        return this.f191060b.mo131020b(i, i2);
    }

    /* renamed from: a */
    public final void mo130720a(double d) {
        this.f191060b.mo130964a(d);
    }

    /* renamed from: a */
    public final void mo130759a(String str, String str2, String str3) {
        this.f191060b.mo130994a(str, str2, str3);
    }

    /* renamed from: a */
    public final void mo130756a(String str, String str2) {
        this.f191060b.mo130991a(str, str2);
    }

    /* renamed from: a */
    public final int mo130707a(String str, int i, int i2) {
        return this.f191060b.mo130955a(str, (long) i, -1, i2);
    }

    /* renamed from: b */
    public final void mo130782b(boolean z) {
        this.f191060b.mo131019b(z);
    }

    /* renamed from: a */
    public final void mo130760a(List<C85390bd> list, String str, int i, VEListener.AbstractC85241j jVar) {
        this.f191060b.mo130995a(list, str, i, jVar);
    }

    /* renamed from: a */
    public final void mo130724a(final float f, final VEListener.AbstractC85241j jVar) {
        this.f191060b.mo130967a(f, new VEListener.AbstractC85241j() {
            /* class com.p2082ss.android.vesdk.C85346av.C853504 */

            static {
                Covode.recordClassIndex(99462);
            }

            @Override // com.p2082ss.android.vesdk.VEListener.AbstractC85241j
            /* renamed from: a */
            public final void mo56563a(int i) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("speed", (double) f);
                    jSONObject.put("resultCode", i);
                    C30683b.m63032a("vesdk_event_recorder_start_record_async", jSONObject, "behavior");
                } catch (JSONException e) {
                    e.printStackTrace();
                }
                VEListener.AbstractC85241j jVar = jVar;
                if (jVar != null) {
                    jVar.mo56563a(i);
                }
            }
        });
    }

    /* renamed from: a */
    public final void mo130738a(final VEListener.AbstractC85241j jVar) {
        this.f191060b.mo131014b(new VEListener.AbstractC85241j() {
            /* class com.p2082ss.android.vesdk.C85346av.C853515 */

            static {
                Covode.recordClassIndex(99463);
            }

            @Override // com.p2082ss.android.vesdk.VEListener.AbstractC85241j
            /* renamed from: a */
            public final void mo56563a(int i) {
                int i2;
                JSONObject jSONObject = new JSONObject();
                if (i > 0) {
                    i2 = 0;
                } else {
                    i2 = -1;
                }
                try {
                    jSONObject.put("resultCode", i2);
                    C30683b.m63032a("vesdk_event_recorder_record_finish", jSONObject, "behavior");
                } catch (JSONException e) {
                    e.printStackTrace();
                }
                VEListener.AbstractC85241j jVar = jVar;
                if (jVar != null) {
                    jVar.mo56563a(i);
                }
            }
        });
    }

    /* renamed from: b */
    public final void mo130779b(VEListener.AbstractC85241j jVar) {
        this.f191060b.mo131027c(jVar);
    }

    /* renamed from: a */
    public final void mo130763a(boolean z, PrivacyCert privacyCert) {
        this.f191060b.mo130998a(z, privacyCert);
    }

    /* renamed from: a */
    public final void mo130734a(PrivacyCert privacyCert) {
        this.f191060b.mo130975a(privacyCert);
    }

    /* renamed from: b */
    public final void mo130778b(PrivacyCert privacyCert) {
        this.f191060b.mo131013b(privacyCert);
    }

    /* renamed from: a */
    public final void mo130730a(long j) {
        this.f191060b.mo130971a(j);
    }

    /* renamed from: a */
    public final void mo130755a(String str, final int i, final int i2, Bitmap.CompressFormat compressFormat, final AbstractC85359e eVar) {
        final long currentTimeMillis = System.currentTimeMillis();
        this.f191060b.mo130953a(str, i, i2, compressFormat, new AbstractC85359e() {
            /* class com.p2082ss.android.vesdk.C85346av.C853537 */

            /* renamed from: a */
            final /* synthetic */ boolean f191082a = false;

            /* renamed from: c */
            final /* synthetic */ boolean f191084c;

            static {
                Covode.recordClassIndex(99465);
            }

            @Override // com.p2082ss.android.vesdk.C85346av.AbstractC85359e
            /* renamed from: a */
            public final void mo56638a(int i) {
                String str;
                if (this.f191082a) {
                    C30695h.m63062a(0, "te_record_shot_screen_time", System.currentTimeMillis() - currentTimeMillis);
                }
                if (this.f191084c) {
                    str = "te_record_shot_screen_with_effect_ret";
                } else {
                    str = "te_record_shot_screen_without_effect_ret";
                }
                C30695h.m63062a(0, str, (long) i);
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("width", i);
                    jSONObject.put("height", i2);
                    if (this.f191082a) {
                        jSONObject.put("tag", "takePicture");
                        C30683b.m63032a("vesdk_event_recorder_take_picture", jSONObject, "behavior");
                    } else {
                        jSONObject.put("tag", "shotScreen");
                        C30683b.m63032a("vesdk_event_recorder_shot_screen", jSONObject, "behavior");
                    }
                } catch (JSONException e) {
                    e.printStackTrace();
                }
                eVar.mo56638a(i);
            }

            {
                this.f191084c = true;
            }
        });
    }

    /* renamed from: a */
    public final void mo130727a(int i, int i2, AbstractC85358d dVar) {
        new C85509a();
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("width", i);
            jSONObject.put("height", i2);
            jSONObject.put("tag", "shotScreen");
            C30683b.m63032a("vesdk_event_recorder_shot_screen", jSONObject, "behavior");
        } catch (JSONException e) {
            e.printStackTrace();
        }
        this.f191060b.mo130935a(i, i2, dVar);
    }

    /* renamed from: a */
    public final void mo130750a(final C85388bc bcVar) {
        final long currentTimeMillis = System.currentTimeMillis();
        C30652a.m63004a("ve_use_camera", 1);
        new AbstractC85359e() {
            /* class com.p2082ss.android.vesdk.C85346av.C853548 */

            static {
                Covode.recordClassIndex(99466);
            }

            @Override // com.p2082ss.android.vesdk.C85346av.AbstractC85359e
            /* renamed from: a */
            public final void mo56638a(int i) {
                String str;
                if (bcVar.f191141h) {
                    C30695h.m63062a(0, "te_record_shot_screen_time", System.currentTimeMillis() - currentTimeMillis);
                }
                if (bcVar.f191135b) {
                    str = "te_record_shot_screen_with_effect_ret";
                } else {
                    str = "te_record_shot_screen_without_effect_ret";
                }
                C30695h.m63062a(0, str, (long) i);
                try {
                    JSONObject jSONObject = new JSONObject();
                    if (bcVar.f191134a != null) {
                        jSONObject.put("width", bcVar.f191134a.width);
                    }
                    jSONObject.put("height", bcVar.f191134a.height);
                    if (bcVar.f191141h) {
                        jSONObject.put("tag", "takePicture");
                        C30683b.m63032a("vesdk_event_recorder_take_picture", jSONObject, "behavior");
                    } else {
                        jSONObject.put("tag", "shotScreen");
                        C30683b.m63032a("vesdk_event_recorder_shot_screen", jSONObject, "behavior");
                    }
                } catch (JSONException e) {
                    e.printStackTrace();
                }
                if (bcVar.f191144k != null) {
                    bcVar.f191144k.mo56638a(i);
                }
            }
        };
        this.f191060b.mo130947a(bcVar);
    }

    /* renamed from: a */
    public final void mo130749a(AbstractC85382b bVar) {
        this.f191060b.mo130987a(bVar);
    }

    /* renamed from: a */
    public final void mo130732a(Surface surface, final VEListener.AbstractC85241j jVar) {
        this.f191060b.mo130973a(surface, new VEListener.AbstractC85241j() {
            /* class com.p2082ss.android.vesdk.C85346av.C853471 */

            static {
                Covode.recordClassIndex(99459);
            }

            @Override // com.p2082ss.android.vesdk.VEListener.AbstractC85241j
            /* renamed from: a */
            public final void mo56563a(int i) {
                VEListener.AbstractC85241j jVar = jVar;
                if (jVar != null) {
                    jVar.mo56563a(i);
                }
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("resultCode", i);
                    C30683b.m63032a("vesdk_event_recorder_start_preview_async", jSONObject, "behavior");
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /* renamed from: a */
    public final void mo130739a(VEListener.AbstractC85241j jVar, boolean z) {
        this.f191060b.mo130978a(jVar, z);
    }

    /* renamed from: a */
    public final void mo130731a(Surface surface) {
        this.f191060b.mo130941a(surface);
    }

    /* renamed from: a */
    public final void mo130741a(VEVolumeParam vEVolumeParam) {
        this.f191060b.mo130979a(vEVolumeParam);
    }

    /* renamed from: a */
    public final VEFrame mo130718a(C85357c cVar) {
        return this.f191060b.mo130963a(cVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:7:0x0028  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo130705a(java.lang.String r8, float r9) {
        /*
        // Method dump skipped, instructions count: 112
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.vesdk.C85346av.mo130705a(java.lang.String, float):int");
    }

    /* renamed from: a */
    public final int mo130704a(String str) {
        return m146677e(str);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0044  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0024  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo130757a(java.lang.String r12, java.lang.String r13, float r14, float r15, float r16) {
        /*
        // Method dump skipped, instructions count: 111
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.vesdk.C85346av.mo130757a(java.lang.String, java.lang.String, float, float, float):void");
    }

    /* renamed from: a */
    public final int mo130706a(String str, float f, float f2) {
        C85509a aVar = new C85509a();
        aVar.mo131333a("iesve_verecorder_set_bigeyes_smallface_level", f).mo131334a("old", 1);
        C30689e.m63052a("iesve_verecorder_set_bigeyes_smallface", 1, aVar);
        this.f191060b.mo130952a(str, f, f2);
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("strResPath", str);
            jSONObject.put("fEyeIntensity", String.valueOf(f));
            jSONObject.put("fCheekIntensity", String.valueOf(f2));
            jSONObject.put("resultCode", 0);
            C30683b.m63032a("vesdk_event_recorder_face_reshape", jSONObject, "behavior");
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return 0;
    }

    /* renamed from: a */
    public final int mo130708a(String str, int i, int i2, String str2) {
        VEEffectFilterParam vEEffectFilterParam = new VEEffectFilterParam();
        vEEffectFilterParam.effectPath = str;
        vEEffectFilterParam.stickerId = i;
        vEEffectFilterParam.reqId = i2;
        vEEffectFilterParam.stickerTag = str2;
        return mo130701a(vEEffectFilterParam);
    }

    /* renamed from: a */
    public final int mo130701a(VEEffectFilterParam vEEffectFilterParam) {
        return this.f191060b.mo131332b(vEEffectFilterParam);
    }

    /* renamed from: a */
    public final void mo130721a(float f) {
        this.f191060b.mo131011b(f);
    }

    /* renamed from: a */
    public final void mo130747a(AbstractC85369n nVar) {
        this.f191060b.mo130984a(nVar);
    }

    /* renamed from: a */
    public final void mo130746a(AbstractC85367l lVar) {
        this.f191060b.mo130983a(lVar);
    }

    /* renamed from: a */
    public final void mo130736a(VECherEffectParam vECherEffectParam) {
        this.f191060b.mo130976a(vECherEffectParam);
    }

    /* renamed from: a */
    public final void mo130748a(AbstractC85374s sVar) {
        this.f191060b.mo130986a(sVar);
    }

    /* renamed from: a */
    public final void mo130728a(int i, long j, long j2, String str) {
        this.f191060b.mo130970a(i, j, j2, str);
    }

    /* renamed from: a */
    public final void mo130733a(MessageCenter.Listener listener) {
        this.f191060b.mo130974a(listener);
    }

    /* renamed from: a */
    public final void mo130764a(float[] fArr, double d) {
        this.f191060b.mo131000a(fArr, d);
    }

    /* renamed from: a */
    public final void mo130754a(Runnable runnable) {
        this.f191060b.mo130990a(runnable);
    }

    /* renamed from: a */
    public final void mo130722a(float f, float f2, float f3) {
        this.f191060b.mo130965a(f, f2, f3);
    }

    /* renamed from: a */
    public final int mo130711a(boolean z, boolean z2, boolean z3, boolean z4) {
        return this.f191060b.mo130958a(z, z2, z3, z4);
    }

    /* renamed from: a */
    public final int mo130712a(double[] dArr, double d) {
        return this.f191060b.mo130959a(dArr, d);
    }

    /* renamed from: a */
    public final int mo130700a(AbstractC85362h hVar) {
        return this.f191060b.mo130945a(hVar);
    }

    /* renamed from: a */
    public final int mo130699a(AbstractC85361g gVar) {
        return this.f191060b.mo130944a(gVar);
    }

    /* renamed from: a */
    public final void mo130742a(AbstractC85313aj ajVar) {
        this.f191060b.mo130980a(ajVar);
    }

    /* renamed from: b */
    public final void mo130780b(AbstractC85313aj ajVar) {
        this.f191060b.mo131015b(ajVar);
    }

    /* renamed from: a */
    public final void mo130744a(AbstractC85356b bVar, int i) {
        AbstractC85508g gVar = this.f191060b;
        if (gVar != null) {
            gVar.mo130981a(bVar, i);
        }
    }

    /* renamed from: b */
    public final void mo130777b(int i) {
        this.f191060b.mo131043f(i);
    }

    /* renamed from: b */
    public final void mo130781b(String str, String str2) {
        this.f191060b.mo131018b(str, str2);
    }

    /* renamed from: a */
    public final int mo130713a(String[] strArr) {
        return this.f191060b.mo130960a(strArr);
    }

    /* renamed from: a */
    public final int mo130709a(String str, String str2, float f) {
        int a = this.f191060b.mo130956a(str, str2, f);
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("path", str);
            jSONObject.put("nodeTag", str2);
            jSONObject.put("nodeValue", String.valueOf(f));
            jSONObject.put("resultCode", String.valueOf(a));
            C30683b.m63032a("vesdk_event_recorder_composer", jSONObject, "behavior");
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return a;
    }

    /* renamed from: a */
    public final int mo130717a(String[] strArr, String[] strArr2, float[] fArr) {
        return this.f191060b.mo130962a(strArr, strArr2, fArr);
    }

    /* renamed from: a */
    public final int mo130714a(String[] strArr, int i) {
        return this.f191060b.mo130961a(strArr, i);
    }

    /* renamed from: a */
    public final int mo130715a(String[] strArr, int i, String[] strArr2) {
        VEEffectParams vEEffectParams = new VEEffectParams();
        vEEffectParams.TYPE = VEEffectParams.EFFECT_TYPE_SET_COMPOSER_WITH_TAG;
        vEEffectParams.intValueOne = i;
        vEEffectParams.stringArrayOne = new ArrayList<>(Arrays.asList(strArr));
        vEEffectParams.stringArrayTwo = new ArrayList<>(Arrays.asList(strArr2));
        C85315al.m146641c("VERecorder", "setComposerNodesWithTag...");
        if (vEEffectParams.stringArrayOne.size() == i && vEEffectParams.stringArrayTwo.size() == i) {
            int a = this.f191060b.mo130942a(vEEffectParams);
            try {
                JSONObject jSONObject = new JSONObject();
                String str = null;
                jSONObject.put("path", strArr != null ? Arrays.toString(strArr) : null);
                if (strArr2 != null) {
                    str = Arrays.toString(strArr2);
                }
                jSONObject.put("nodeTag", str);
                jSONObject.put("nodeValue", String.valueOf(i));
                jSONObject.put("resultCode", String.valueOf(a));
                C30683b.m63032a("vesdk_event_recorder_composer", jSONObject, "behavior");
            } catch (JSONException e) {
                e.printStackTrace();
            }
            return a;
        }
        C85315al.m146642d("VERecorder", "Nodes size=" + vEEffectParams.stringArrayOne.size() + ", tags size=" + vEEffectParams.stringArrayTwo.size() + ", but nodeNum=" + i);
        return -100;
    }

    /* renamed from: a */
    public final int mo130716a(String[] strArr, int i, String[] strArr2, int i2, String[] strArr3) {
        VEEffectParams vEEffectParams = new VEEffectParams();
        vEEffectParams.TYPE = VEEffectParams.EFFECT_TYPE_REPLACE_COMPOSER_WITH_TAG;
        vEEffectParams.intValueOne = i;
        vEEffectParams.intValueTwo = i2;
        vEEffectParams.stringArrayOne = new ArrayList<>(Arrays.asList(strArr));
        vEEffectParams.stringArrayTwo = new ArrayList<>(Arrays.asList(strArr2));
        vEEffectParams.stringArrayThree = new ArrayList<>(Arrays.asList(strArr3));
        C85315al.m146641c("VERecorder", "replaceComposerNodes...");
        return this.f191060b.mo130942a(vEEffectParams);
    }

    /* renamed from: a */
    public final void mo130723a(float f, float f2, float f3, float f4) {
        this.f191060b.mo130966a(f, f2, f3, f4);
    }

    /* renamed from: a */
    public final void mo130762a(boolean z, long j) {
        this.f191060b.mo130997a(z, j);
    }

    /* renamed from: a */
    public final boolean mo130766a(C85392bf bfVar, int i) {
        if (bfVar.f191161b == null || i < 0) {
            return false;
        }
        return this.f191060b.mo131001a(bfVar, i);
    }

    /* renamed from: a */
    public final int mo130710a(boolean z, String str) {
        return this.f191060b.mo130957a(z, str);
    }

    /* renamed from: a */
    public final void mo130752a(AbstractC85541q qVar) {
        this.f191060b.mo130989a(qVar);
    }

    /* renamed from: a */
    public final int mo130702a(VEPrePlayParams vEPrePlayParams) {
        return this.f191060b.mo130949a(vEPrePlayParams);
    }

    /* renamed from: a */
    public final void mo130751a(VEBaseRecorderLensParams vEBaseRecorderLensParams, final AbstractC85372q qVar) {
        int i = vEBaseRecorderLensParams.algorithmFlag;
        if (i != 15) {
            if (i == 21) {
                final VETaintSceneDetectParams vETaintSceneDetectParams = (VETaintSceneDetectParams) vEBaseRecorderLensParams;
                VEModelDownload.AbstractC85523a aVar = this.f191061c;
                if (aVar != null) {
                    aVar.mo115159a("lens_taint_scene_detect", "TaintSceneDetectModel", new VEModelDownload.AbstractC85524b() {
                        /* class com.p2082ss.android.vesdk.C85346av.C853493 */

                        static {
                            Covode.recordClassIndex(99461);
                        }

                        @Override // com.p2082ss.android.vesdk.lens.VEModelDownload.AbstractC85524b
                        /* renamed from: a */
                        public final void mo130840a() {
                            C85315al.m146642d("VERecorder", "get model path failure!");
                        }

                        @Override // com.p2082ss.android.vesdk.lens.VEModelDownload.AbstractC85524b
                        /* renamed from: a */
                        public final void mo130841a(String str) {
                            vETaintSceneDetectParams.modelPath = str;
                            C85346av.this.f191060b.mo130988a(vETaintSceneDetectParams, qVar);
                        }
                    });
                    return;
                }
                return;
            } else if (i == 24) {
                C85568t.C85573d a = C85568t.m147473a().mo131556a("ve_asf_amount");
                if (!(a == null || a.f191742b == null || !(a.f191742b instanceof Float))) {
                    ((VEAdaptiveSharpenParams) vEBaseRecorderLensParams).amount = ((Float) a.f191742b).floatValue();
                }
                C85568t.C85573d a2 = C85568t.m147473a().mo131556a("ve_asf_over_ratio");
                if (!(a2 == null || a2.f191742b == null || !(a2.f191742b instanceof Float))) {
                    ((VEAdaptiveSharpenParams) vEBaseRecorderLensParams).overRatio = ((Float) a2.f191742b).floatValue();
                }
                C85568t.C85573d a3 = C85568t.m147473a().mo131556a("ve_asf_gpu_power_level");
                if (!(a3 == null || a3.f191742b == null || !(a3.f191742b instanceof Integer))) {
                    ((VEAdaptiveSharpenParams) vEBaseRecorderLensParams).powerLevelPara = ((Integer) a3.f191742b).intValue();
                    C85315al.m146637a("VERecorder", "powerLevelPara: " + a3.f191742b);
                }
                C85568t.C85573d a4 = C85568t.m147473a().mo131556a("ve_asf_init_delay_frame_cnt");
                if (!(a4 == null || a4.f191742b == null || !(a4.f191742b instanceof Integer))) {
                    ((VEAdaptiveSharpenParams) vEBaseRecorderLensParams).initDelayFrameCnt = ((Integer) a4.f191742b).intValue();
                    C85315al.m146637a("VERecorder", "initDelayFrameCnt: " + a4.f191742b);
                }
                C85568t.C85573d a5 = C85568t.m147473a().mo131556a("ve_asf_process_delay_frame_cnt");
                if (!(a5 == null || a5.f191742b == null || !(a5.f191742b instanceof Integer))) {
                    ((VEAdaptiveSharpenParams) vEBaseRecorderLensParams).processDelayFrameCnt = ((Integer) a5.f191742b).intValue();
                }
                this.f191060b.mo130988a(vEBaseRecorderLensParams, qVar);
                return;
            } else if (i != 27) {
                if (i == 28) {
                    this.f191060b.mo130988a(vEBaseRecorderLensParams, qVar);
                    return;
                }
                return;
            }
        }
        this.f191060b.mo130988a(vEBaseRecorderLensParams, qVar);
    }

    /* renamed from: a */
    public final void mo130729a(int i, VESafeAreaParams[] vESafeAreaParamsArr) {
        this.f191060b.mo130939a(i, vESafeAreaParamsArr);
    }

    /* renamed from: a */
    public final void mo130740a(VEListener.AbstractC85246o oVar) {
        m146676b("", "", oVar);
    }

    /* renamed from: a */
    public final void mo130745a(final AbstractC85365j jVar) {
        C853482 r0;
        if (jVar == null) {
            r0 = null;
        } else {
            r0 = new AbstractC85363i() {
                /* class com.p2082ss.android.vesdk.C85346av.C853482 */

                static {
                    Covode.recordClassIndex(99460);
                }

                @Override // com.p2082ss.android.vesdk.C85346av.AbstractC85363i
                /* renamed from: a */
                public final AbstractC85363i.C85364a mo130838a() {
                    boolean z;
                    AbstractC85363i.C85364a aVar = new AbstractC85363i.C85364a();
                    aVar.f191095b = VEFrame.EnumC30668a.TEPixFmt_OpenGL_RGBA8;
                    if (jVar != null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    aVar.f191094a = z;
                    return aVar;
                }

                @Override // com.p2082ss.android.vesdk.C85346av.AbstractC85363i
                /* renamed from: a */
                public final void mo130839a(VEFrame vEFrame) {
                    long j;
                    if (jVar != null) {
                        if (vEFrame == null || vEFrame.getFormat() != VEFrame.EnumC30668a.TEPixFmt_OpenGL_RGBA8) {
                            jVar.mo56846a(null, 0, 10, 0, 0, 0, 0);
                            return;
                        }
                        VEFrame.TextureFrame textureFrame = (VEFrame.TextureFrame) vEFrame.getFrame();
                        AbstractC85365j jVar = jVar;
                        EGLContext eGLContext = textureFrame.f73342a;
                        int i = textureFrame.f73343b;
                        int width = vEFrame.getWidth();
                        int height = vEFrame.getHeight();
                        long timeStamp = vEFrame.getTimeStamp();
                        if (C85346av.this.f191060b != null) {
                            j = C85346av.this.f191060b.mo131056l();
                        } else {
                            j = 0;
                        }
                        jVar.mo56846a(eGLContext, i, 10, width, height, timeStamp, j);
                    }
                }
            };
        }
        this.f191060b.mo130982a(r0);
    }

    /* renamed from: A */
    public final int mo130677A() {
        return this.f191060b.f191530bj;
    }

    /* renamed from: B */
    public final float mo130678B() {
        return this.f191060b.f191531bk;
    }

    /* renamed from: C */
    public final double mo130679C() {
        return this.f191060b.f191533bm;
    }

    /* renamed from: D */
    public final double mo130680D() {
        return this.f191060b.f191534bn;
    }

    /* renamed from: E */
    public final double mo130681E() {
        return this.f191060b.f191535bo;
    }

    /* renamed from: F */
    public final double mo130682F() {
        return this.f191060b.f191536bp;
    }

    /* renamed from: G */
    public final float[] mo130683G() {
        return this.f191060b.mo131065p();
    }

    /* renamed from: H */
    public final AbstractC30029f mo130684H() {
        return this.f191060b.mo131076z();
    }

    /* renamed from: I */
    public final AbstractC85401a mo130685I() {
        return this.f191060b.mo131025c();
    }

    /* renamed from: J */
    public final void mo130686J() {
        this.f191060b.mo130926A();
    }

    /* renamed from: K */
    public final int mo130687K() {
        return this.f191060b.mo131066q();
    }

    /* renamed from: d */
    public final float mo130793d() {
        return this.f191060b.mo131046g();
    }

    /* renamed from: e */
    public final int mo130801e() {
        return this.f191060b.mo131048h();
    }

    /* renamed from: h */
    public final long mo130809h() {
        return this.f191060b.mo131058m();
    }

    /* renamed from: i */
    public final int mo130811i() {
        return this.f191060b.mo131060n();
    }

    /* renamed from: k */
    public final void mo130815k() {
        this.f191060b.mo131070t();
    }

    /* renamed from: l */
    public final void mo130817l() {
        this.f191060b.mo131051i();
    }

    /* renamed from: m */
    public final long mo130819m() {
        return this.f191060b.mo131072v();
    }

    /* renamed from: p */
    public final void mo130825p() {
        this.f191060b.mo131071u();
    }

    /* renamed from: q */
    public final EnigmaResult mo130827q() {
        return this.f191060b.mo131075y();
    }

    /* renamed from: r */
    public final C85519k mo130829r() {
        return this.f191060b.f191463U;
    }

    /* renamed from: s */
    public final int mo130830s() {
        return this.f191060b.f191521ba;
    }

    /* renamed from: t */
    public final int mo130831t() {
        return this.f191060b.f191522bb;
    }

    /* renamed from: u */
    public final int mo130832u() {
        return this.f191060b.f191523bc;
    }

    /* renamed from: v */
    public final float mo130833v() {
        return this.f191060b.f191524bd;
    }

    /* renamed from: w */
    public final int mo130834w() {
        return this.f191060b.f191526bf;
    }

    /* renamed from: x */
    public final float mo130835x() {
        return this.f191060b.f191527bg;
    }

    /* renamed from: y */
    public final int mo130836y() {
        return this.f191060b.f191528bh;
    }

    /* renamed from: z */
    public final int mo130837z() {
        return this.f191060b.f191529bi;
    }

    /* renamed from: g */
    public static int m146678g() {
        C85315al.m146637a("VERecorder", "startRecord in mp4 mode...");
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /* renamed from: j */
    public final long mo130814j() {
        return this.f191060b.mo131056l();
    }

    /* renamed from: n */
    public final VEMapBufferInfo mo130821n() {
        C85315al.m146637a("VERecorder", "get intermediate path from effect");
        return this.f191060b.mo131073w();
    }

    /* renamed from: f */
    public final String[] mo130807f() {
        return this.f191060b.mo131053j();
    }

    /* renamed from: o */
    public final void mo130823o() {
        C85315al.m146641c("VERecorder", "onDestroy...");
        AbstractC85508g gVar = this.f191060b;
        if (gVar != null) {
            gVar.mo131062o();
        }
        AbstractC85556e eVar = this.f191059a;
        if (eVar != null) {
            if (eVar.f191704b != null) {
                eVar.f191704b.clear();
                eVar.f191704b = null;
            }
            if (eVar.f191705c != null) {
                eVar.f191705c.clear();
                eVar.f191705c = null;
            }
        }
    }

    /* renamed from: c */
    public final int[] mo130791c() {
        return this.f191060b.mo131045f();
    }

    /* renamed from: g */
    public final void mo130808g(boolean z) {
        this.f191060b.mo130996a(z);
    }

    /* renamed from: j */
    public final int mo130813j(boolean z) {
        return this.f191060b.mo131050i(z);
    }

    /* renamed from: n */
    public final void mo130822n(boolean z) {
        this.f191060b.mo131059m(z);
    }

    /* renamed from: o */
    public final void mo130824o(boolean z) {
        this.f191060b.mo131064p(z);
    }

    /* renamed from: b */
    public final float mo130768b(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1.0f;
        }
        return this.f191060b.mo130927a(str);
    }

    /* renamed from: f */
    public final void mo130806f(boolean z) {
        AbstractC85508g gVar = this.f191060b;
        gVar.f191541bu = z;
        if (gVar.f191541bu) {
            C85315al.m146637a("TERecorderBase", "attach VEAudioCapture from other");
        }
    }

    /* renamed from: h */
    public final void mo130810h(boolean z) {
        this.f191060b.mo131036d(z);
    }

    /* renamed from: i */
    public final void mo130812i(boolean z) {
        this.f191060b.mo131049h(z);
    }

    /* renamed from: k */
    public final void mo130816k(boolean z) {
        this.f191060b.mo131052j(z);
    }

    /* renamed from: l */
    public final void mo130818l(boolean z) {
        this.f191060b.mo131055k(z);
    }

    /* renamed from: m */
    public final void mo130820m(boolean z) {
        this.f191060b.mo131057l(z);
    }

    /* renamed from: p */
    public final void mo130826p(boolean z) {
        this.f191060b.mo131061n(z);
    }

    /* renamed from: d */
    public final int mo130795d(int i) {
        return this.f191060b.mo131039e(i);
    }

    /* renamed from: e */
    public final void mo130803e(VEListener.AbstractC85241j jVar) {
        this.f191060b.mo131040e(jVar);
    }

    /* renamed from: q */
    public final void mo130828q(boolean z) {
        long j;
        if (z) {
            j = 1;
        } else {
            j = 0;
        }
        C30652a.m63004a("te_lens_adaptive_sharpen", j);
        this.f191060b.mo131067q(z);
    }

    /* renamed from: c */
    public final int mo130787c(String str) {
        return this.f191060b.mo131007b(str);
    }

    /* renamed from: e */
    public final void mo130804e(boolean z) {
        this.f191060b.mo131044f(z);
    }

    /* renamed from: e */
    private int m146677e(String str) {
        String str2;
        C85509a aVar = new C85509a();
        if (!TextUtils.isEmpty(str)) {
            String[] split = str.split(File.separator);
            if (split.length > 0) {
                str2 = split[split.length - 1];
                float min = Math.min(1.0f, Math.max(0.0f, 0.0f));
                aVar.mo131335a("iesve_verecorder_set_filter_click_idfilter_id", str2).mo131334a("old", 1);
                C30689e.m63052a("iesve_verecorder_set_filter_click", 1, aVar);
                this.f191060b.mo131008b(str, min);
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("filterId", str2);
                jSONObject.put("intensity", String.valueOf(min));
                jSONObject.put("tag", "setFilter");
                jSONObject.put("resultCode", 0);
                C30683b.m63032a("vesdk_event_recorder_single_filter", jSONObject, "behavior");
                return 0;
            }
        }
        str2 = "";
        float min2 = Math.min(1.0f, Math.max(0.0f, 0.0f));
        aVar.mo131335a("iesve_verecorder_set_filter_click_idfilter_id", str2).mo131334a("old", 1);
        C30689e.m63052a("iesve_verecorder_set_filter_click", 1, aVar);
        this.f191060b.mo131008b(str, min2);
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("filterId", str2);
            jSONObject2.put("intensity", String.valueOf(min2));
            jSONObject2.put("tag", "setFilter");
            jSONObject2.put("resultCode", 0);
            C30683b.m63032a("vesdk_event_recorder_single_filter", jSONObject2, "behavior");
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return 0;
    }

    /* renamed from: c */
    public final void mo130788c(int i) {
        this.f191060b.mo131035d(i);
    }

    /* renamed from: d */
    public final int mo130797d(VEListener.AbstractC85241j jVar) {
        return this.f191060b.mo131032d(jVar);
    }

    /* renamed from: b */
    public final int mo130772b(AbstractC85362h hVar) {
        return this.f191060b.mo131006b(hVar);
    }

    /* renamed from: c */
    public final void mo130789c(VEListener.AbstractC85241j jVar) {
        this.f191060b.mo130977a(jVar);
    }

    /* renamed from: c */
    public final void mo130790c(boolean z) {
        this.f191060b.mo131047g(z);
    }

    /* renamed from: d */
    public final void mo130799d(String str) {
        this.f191060b.mo131028c(str);
    }

    /* renamed from: d */
    public final boolean mo130800d(boolean z) {
        C85509a aVar = new C85509a();
        aVar.mo131335a("iesve_verecorder_use_sharedtexture", String.valueOf(z)).mo131334a("old", 1);
        C30689e.m63052a("iesve_verecorder_use_sharedtexture", 1, aVar);
        return this.f191060b.mo131041e(z);
    }

    /* renamed from: a */
    public final int mo130696a(Bitmap bitmap) {
        return this.f191060b.mo130940a(bitmap);
    }

    public C85346av(AbstractC85556e eVar, Context context) {
        this(eVar, context, (byte) 0);
    }

    /* renamed from: b */
    public final int mo130770b(float f, float f2) {
        return this.f191060b.mo131004b(f, f2);
    }

    /* renamed from: c */
    public final int mo130785c(float f, float f2) {
        return mo130770b(f, f2);
    }

    /* renamed from: f */
    public final int mo130805f(float f, float f2) {
        return this.f191060b.mo131038e(f, f2);
    }

    /* renamed from: d */
    public final int mo130794d(float f, float f2) {
        return this.f191060b.mo131022c(f, f2);
    }

    /* renamed from: e */
    public final int mo130802e(float f, float f2) {
        return this.f191060b.mo131030d(f, f2);
    }

    /* renamed from: c */
    public final int mo130786c(int i, int i2) {
        return this.f191060b.mo131031d(i, i2);
    }

    /* renamed from: b */
    public final int mo130771b(int i, int i2) {
        return this.f191060b.mo131023c(i, i2);
    }

    /* renamed from: d */
    public final int mo130796d(int i, int i2) {
        return this.f191060b.mo130934a(i, i2, 0L);
    }

    /* renamed from: a */
    public final int mo130689a(float f, float f2) {
        C85509a aVar = new C85509a();
        aVar.mo131333a("iesve_verecorder_set_beauty_level", f).mo131334a("old", 1);
        C30689e.m63052a("iesve_verecorder_set_beauty_level", 1, aVar);
        this.f191060b.mo130930a(f, f2);
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("fSmoothIntensity", String.valueOf(f));
            jSONObject.put("fBrightenIntensity", String.valueOf(f));
            jSONObject.put("resultCode", 0);
            C30683b.m63032a("vesdk_event_recorder_beauty_face_intensity", jSONObject, "behavior");
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return 0;
    }

    /* renamed from: a */
    public final int mo130691a(int i, float f) {
        C85509a aVar = new C85509a();
        aVar.mo131333a("iesve_verecorder_" + C85527n.m147374a(i) + "_level", f).mo131334a("old", 1);
        C30689e.m63052a("iesve_verecorder_" + C85527n.m147374a(i) + "_level", 1, aVar);
        return this.f191060b.mo130932a(i, f);
    }

    /* renamed from: d */
    public final int mo130798d(String str, String str2) {
        if (str2 != null) {
            return this.f191060b.mo131033d(str, str2);
        }
        C85315al.m146642d("VERecorder", "Illegal argument. imagePath can't be null. Consider using empty string to cancel.");
        return -100;
    }

    /* renamed from: a */
    public final int mo130694a(int i, VETrackParams vETrackParams) {
        return this.f191060b.mo130937a(i, vETrackParams);
    }

    /* renamed from: a */
    public final int mo130695a(int i, String str) {
        C85509a aVar = new C85509a();
        aVar.mo131334a("iesve_verecorder_set_beauty_algorithm", i).mo131334a("old", 1);
        C30689e.m63052a("iesve_verecorder_set_beauty_algorithm", 1, aVar);
        this.f191060b.mo130938a(i, str);
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("beautyFaceType", String.valueOf(i));
            jSONObject.put("strBeautyFaceRes", str);
            jSONObject.put("resultCode", 0);
            C30683b.m63032a("vesdk_event_recorder_beauty_face", jSONObject, "behavior");
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return 0;
    }

    /* renamed from: b */
    public final int mo130775b(String[] strArr, int i) {
        return this.f191060b.mo131010b(strArr, i);
    }

    /* renamed from: c */
    public final int[] mo130792c(String str, String str2) {
        if (str == null || str2 == null) {
            return new int[]{-1, 0};
        }
        return this.f191060b.mo131029c(str, str2);
    }

    /* renamed from: a */
    public final void mo130758a(String str, String str2, VEListener.AbstractC85246o oVar) {
        m146676b(str, str2, oVar);
    }

    private C85346av(AbstractC85556e eVar, Context context, byte b) {
        this.f191063e = -1;
        this.f191059a = eVar;
        this.f191062d = VERuntime.EnumC85549a.INSTANCE.f191667b;
        this.f191060b = new C85410d(context, this.f191059a);
    }

    /* renamed from: a */
    public final int mo130693a(int i, int i2, boolean z) {
        return this.f191060b.mo130936a(i, i2, z);
    }

    /* renamed from: b */
    private void m146676b(String str, String str2, final VEListener.AbstractC85246o oVar) {
        try {
            this.f191059a.mo131525d();
            this.f191059a.mo131526e();
            final String b = this.f191059a.mo56848b();
            final String c = this.f191059a.mo56849c();
            final String str3 = b + ".tmp";
            final String str4 = c + ".tmp";
            C85616y.m147701a(str3);
            C85616y.m147701a(str4);
            C85616y.m147704a(b, str3);
            C85616y.m147704a(c, str4);
            this.f191060b.mo130993a(b, c, 0, str, str2, new VEListener.AbstractC85241j() {
                /* class com.p2082ss.android.vesdk.C85346av.C853526 */

                static {
                    Covode.recordClassIndex(99464);
                }

                @Override // com.p2082ss.android.vesdk.VEListener.AbstractC85241j
                /* renamed from: a */
                public final void mo56563a(int i) {
                    if (!C85616y.m147705b(b) && C85616y.m147705b(str3)) {
                        C85616y.m147704a(str3, b);
                        if (!C85616y.m147705b(c) && C85616y.m147705b(str4)) {
                            C85616y.m147704a(str4, c);
                        }
                        C30969o.m63686a("VERecorder", "Concat failed. Restore concat file.");
                    }
                    VEListener.AbstractC85246o oVar = oVar;
                    if (oVar != null) {
                        oVar.mo56637a(i, b, c);
                    }
                }
            });
        } catch (C85615x e) {
            C30969o.m63689d("VERecorder", "No need to concat because: " + e.getMsgDes());
            if (oVar != null) {
                oVar.mo56637a(-108, "", "");
            }
        }
    }

    /* renamed from: b */
    public final int mo130773b(String str, float f, float f2) {
        C85509a aVar = new C85509a();
        aVar.mo131333a("iesve_verecorder_set_lipstick_and_blusher_level", f).mo131334a("old", 1);
        C30689e.m63052a("iesve_verecorder_set_lipstick_and_blusher_level", 1, aVar);
        this.f191060b.mo131009b(str, f, f2);
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("strResPath", str);
            jSONObject.put("fLipstickIntensity", String.valueOf(f));
            jSONObject.put("fBlusherIntensity", String.valueOf(f));
            jSONObject.put("resultCode", 0);
            C30683b.m63032a("vesdk_event_recorder_face_make_up_intensity", jSONObject, "behavior");
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return 0;
    }

    /* renamed from: a */
    public final int mo130697a(VEVideoEncodeSettings vEVideoEncodeSettings, VEAudioEncodeSettings vEAudioEncodeSettings, C85322ar arVar) {
        return mo130698a(vEVideoEncodeSettings, vEAudioEncodeSettings, arVar, false);
    }

    /* renamed from: b */
    public final int mo130776b(String[] strArr, int i, String[] strArr2) {
        VEEffectParams vEEffectParams = new VEEffectParams();
        vEEffectParams.TYPE = VEEffectParams.EFFECT_TYPE_APPEND_COMPOSER_WITH_TAG;
        vEEffectParams.intValueOne = i;
        vEEffectParams.stringArrayOne = new ArrayList<>(Arrays.asList(strArr));
        vEEffectParams.stringArrayTwo = new ArrayList<>(Arrays.asList(strArr2));
        C85315al.m146641c("VERecorder", "appendComposerNodes...");
        if (vEEffectParams.stringArrayOne.size() == i && vEEffectParams.stringArrayTwo.size() == i) {
            return this.f191060b.mo130942a(vEEffectParams);
        }
        C85315al.m146642d("VERecorder", "Nodes size=" + vEEffectParams.stringArrayOne.size() + ", tags size=" + vEEffectParams.stringArrayTwo.size() + ", but nodeNum=" + i);
        return -100;
    }

    /* renamed from: a */
    public final int mo130692a(int i, float f, float f2, int i2) {
        return this.f191060b.mo130933a(i, f, f2, i2);
    }

    /* renamed from: a */
    public final int mo130688a(double d, double d2, double d3, double d4) {
        return this.f191060b.mo130928a(d, d2, d3, d4);
    }

    /* renamed from: c */
    public final int mo130784c(double d, double d2, double d3, double d4) {
        return this.f191060b.mo131021c(d, d2, d3, d4);
    }

    /* renamed from: b */
    public final int mo130769b(double d, double d2, double d3, double d4) {
        return this.f191060b.mo131003b(d, d2, d3, d4);
    }

    /* renamed from: b */
    public final int mo130774b(String str, int i, int i2, String str2) {
        return this.f191060b.mo130954a(str, i, i2, str2);
    }

    /* renamed from: a */
    public final int mo130690a(float f, float f2, float f3, float f4, float f5) {
        return this.f191060b.mo130931a(f, f2, f3, f4, f5);
    }
}
