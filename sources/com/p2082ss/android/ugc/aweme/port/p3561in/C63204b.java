package com.p2082ss.android.ugc.aweme.port.p3561in;

import android.app.Application;
import com.bef.effectsdk.ResourceFinder;
import com.bytedance.common.utility.p907b.C13590c;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.C16041a;
import com.bytedance.ies.abmock.C16048b;
import com.bytedance.ies.abmock.SettingsManager;
import com.google.gson.C27910f;
import com.p2082ss.android.ugc.asve.AbstractC31048d;
import com.p2082ss.android.ugc.asve.C31012a;
import com.p2082ss.android.ugc.asve.context.AbstractC31036e;
import com.p2082ss.android.ugc.asve.context.PreviewSize;
import com.p2082ss.android.ugc.asve.editor.AbstractC31074g;
import com.p2082ss.android.ugc.asve.editor.C31069d;
import com.p2082ss.android.ugc.asve.recorder.AbstractC31132c;
import com.p2082ss.android.ugc.aweme.global.config.settings.C52912c;
import com.p2082ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import com.p2082ss.android.ugc.aweme.p2730de.C40971f;
import com.p2082ss.android.ugc.aweme.p2730de.C40982q;
import com.p2082ss.android.ugc.aweme.property.C65336af;
import com.p2082ss.android.ugc.aweme.property.C65406cr;
import com.p2082ss.android.ugc.aweme.property.C65460eo;
import com.p2082ss.android.ugc.aweme.setting.C68436u;
import com.p2082ss.android.ugc.aweme.setting.p3721i.C68097h;
import com.p2082ss.android.ugc.aweme.shortvideo.util.C73991bj;
import com.p2082ss.android.vesdk.C85515j;
import com.p2082ss.android.vesdk.VEListener;
import dmt.p4542av.video.p4547d.C88251c;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import org.json.JSONObject;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.port.in.b */
public final class C63204b implements AbstractC31036e {

    /* renamed from: b */
    private final AbstractC89244h f143529b = C89250i.m154773a((AbstractC89171a) C63207b.f143541a);

    /* renamed from: c */
    private final ExecutorService f143530c;

    /* renamed from: d */
    private final AbstractC89244h f143531d;

    /* renamed from: e */
    private final AbstractC89244h f143532e;

    /* renamed from: f */
    private final AbstractC89244h f143533f;

    /* renamed from: g */
    private final File f143534g;

    /* renamed from: h */
    private final C27910f f143535h;

    /* renamed from: i */
    private C65460eo f143536i;

    /* renamed from: j */
    private final ResourceFinder f143537j;

    /* renamed from: k */
    private final C85515j f143538k;

    static {
        Covode.recordClassIndex(74477);
    }

    @Override // com.p2082ss.android.ugc.asve.context.AbstractC31036e
    /* renamed from: a */
    public final AbstractC31048d mo56187a() {
        return (AbstractC31048d) this.f143531d.getValue();
    }

    @Override // com.p2082ss.android.ugc.asve.context.AbstractC31036e
    /* renamed from: b */
    public final AbstractC31132c mo56188b() {
        return (AbstractC31132c) this.f143532e.getValue();
    }

    @Override // com.p2082ss.android.ugc.asve.context.AbstractC31036e
    /* renamed from: c */
    public final VEListener.AbstractC85235d mo56189c() {
        return (VEListener.AbstractC85235d) this.f143533f.getValue();
    }

    /* renamed from: t */
    public final boolean mo101683t() {
        return ((Boolean) this.f143529b.getValue()).booleanValue();
    }

    @Override // com.p2082ss.android.ugc.asve.context.AbstractC31036e
    /* renamed from: d */
    public final ResourceFinder mo56190d() {
        return this.f143537j;
    }

    @Override // com.p2082ss.android.ugc.asve.context.AbstractC31036e
    /* renamed from: e */
    public final File mo56191e() {
        return this.f143534g;
    }

    @Override // com.p2082ss.android.ugc.asve.context.AbstractC31036e
    /* renamed from: m */
    public final C85515j mo56199m() {
        return this.f143538k;
    }

    /* renamed from: com.ss.android.ugc.aweme.port.in.b$a */
    static final class C63205a extends AbstractC89220m implements AbstractC89171a<C632061> {

        /* renamed from: a */
        final /* synthetic */ C63204b f143539a;

        static {
            Covode.recordClassIndex(74478);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C63205a(C63204b bVar) {
            super(0);
            this.f143539a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C632061 invoke() {
            return new AbstractC31048d(this) {
                /* class com.p2082ss.android.ugc.aweme.port.p3561in.C63204b.C63205a.C632061 */

                /* renamed from: a */
                final /* synthetic */ C63205a f143540a;

                static {
                    Covode.recordClassIndex(74479);
                }

                /* JADX WARN: Incorrect args count in method signature: ()V */
                {
                    this.f143540a = r1;
                }

                @Override // com.p2082ss.android.ugc.asve.AbstractC31048d
                /* renamed from: a */
                public final void mo56120a(String str) {
                    C89219l.m154721d(str, "");
                    if (!this.f143540a.f143539a.mo101683t()) {
                        C73991bj.m130132c(str);
                    }
                }

                @Override // com.p2082ss.android.ugc.asve.AbstractC31048d
                /* renamed from: b */
                public final void mo56121b(String str) {
                    C89219l.m154721d(str, "");
                    if (!this.f143540a.f143539a.mo101683t()) {
                        C73991bj.m130131b(str);
                    }
                }

                @Override // com.p2082ss.android.ugc.asve.AbstractC31048d
                /* renamed from: c */
                public final void mo56122c(String str) {
                    C89219l.m154721d(str, "");
                    if (!this.f143540a.f143539a.mo101683t()) {
                        C73991bj.m130128a(str);
                    }
                }

                @Override // com.p2082ss.android.ugc.asve.AbstractC31048d
                /* renamed from: d */
                public final void mo56123d(String str) {
                    C89219l.m154721d(str, "");
                    if (!this.f143540a.f143539a.mo101683t()) {
                        C73991bj.m130133d(str);
                    }
                }
            };
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.port.in.b$c */
    static final class C63208c extends AbstractC89220m implements AbstractC89171a<C632091> {

        /* renamed from: a */
        public static final C63208c f143542a = new C63208c();

        static {
            Covode.recordClassIndex(74481);
        }

        C63208c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C632091 invoke() {
            return new AbstractC31132c() {
                /* class com.p2082ss.android.ugc.aweme.port.p3561in.C63204b.C63208c.C632091 */

                static {
                    Covode.recordClassIndex(74482);
                }

                @Override // com.p2082ss.android.vesdk.VEListener.AbstractC85224ac
                /* renamed from: a */
                public final void mo101684a(String str, JSONObject jSONObject) {
                    C89219l.m154721d(str, "");
                    C89219l.m154721d(jSONObject, "");
                    C40982q.m82522a(str, jSONObject);
                }

                @Override // com.p2082ss.android.ugc.asve.recorder.AbstractC31132c
                /* renamed from: a */
                public final void mo56583a(Throwable th, String str) {
                    C89219l.m154721d(th, "");
                    C89219l.m154721d(str, "");
                    C40971f.m82490a(th, str);
                }
            };
        }
    }

    @Override // com.p2082ss.android.ugc.asve.context.AbstractC31036e
    /* renamed from: i */
    public final boolean mo56195i() {
        return C68436u.m120866a();
    }

    @Override // com.p2082ss.android.ugc.asve.context.AbstractC31036e
    /* renamed from: s */
    public final AbstractC31074g mo56205s() {
        return new C31069d();
    }

    @Override // com.p2082ss.android.ugc.asve.context.AbstractC31036e
    /* renamed from: g */
    public final boolean mo56193g() {
        return SettingsManager.m29616a().mo25400a("enable_h264_hw_decoder", false);
    }

    @Override // com.p2082ss.android.ugc.asve.context.AbstractC31036e
    /* renamed from: j */
    public final int mo56196j() {
        return SettingsManager.m29616a().mo25394a("min_size_bytevc1_hw_decoder", 1090);
    }

    @Override // com.p2082ss.android.ugc.asve.context.AbstractC31036e
    /* renamed from: k */
    public final int mo56197k() {
        return SettingsManager.m29616a().mo25394a("high_fps_lower_limit_bytevc1_hw_decoder", 40);
    }

    @Override // com.p2082ss.android.ugc.asve.context.AbstractC31036e
    /* renamed from: l */
    public final int mo56198l() {
        return SettingsManager.m29616a().mo25394a("high_fps_min_side_bytevc1_hw_decoder", 1070);
    }

    @Override // com.p2082ss.android.ugc.asve.context.AbstractC31036e
    /* renamed from: o */
    public final String mo56201o() {
        String a = SettingsManager.m29616a().mo25398a("ve_runtime_config", "");
        C89219l.m154716b(a, "");
        return a;
    }

    @Override // com.p2082ss.android.ugc.asve.context.AbstractC31036e
    /* renamed from: p */
    public final boolean mo56202p() {
        return C16048b.m29633a().mo25421a(true, "enable_effect_async_api", false);
    }

    @Override // com.p2082ss.android.ugc.asve.context.AbstractC31036e
    /* renamed from: q */
    public final boolean mo56203q() {
        if (C65336af.m117022a() == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: com.ss.android.ugc.aweme.port.in.b$b */
    static final class C63207b extends AbstractC89220m implements AbstractC89171a<Boolean> {

        /* renamed from: a */
        public static final C63207b f143541a = new C63207b();

        static {
            Covode.recordClassIndex(74480);
        }

        C63207b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Boolean invoke() {
            return Boolean.valueOf(((Boolean) C68097h.f152498a.getValue()).booleanValue());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.port.in.b$d */
    static final class C63210d extends AbstractC89220m implements AbstractC89171a<C88251c> {

        /* renamed from: a */
        public static final C63210d f143543a = new C63210d();

        static {
            Covode.recordClassIndex(74483);
        }

        C63210d() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C88251c invoke() {
            if (C16048b.m29633a().mo25421a(true, "enable_ve_upload_applog", true)) {
                return new C88251c();
            }
            return null;
        }
    }

    @Override // com.p2082ss.android.ugc.asve.context.AbstractC31036e
    /* renamed from: f */
    public final int mo56192f() {
        return SettingsManager.m29616a().mo25394a("enable_ve_single_gl", 0) | C16048b.m29633a().mo25412a(true, "enable_ve_cache_gl_context", 0) | 1024 | C16048b.m29633a().mo25412a(true, "enable_sdk_input_cross_platform", 0) | 65536 | 512;
    }

    @Override // com.p2082ss.android.ugc.asve.context.AbstractC31036e
    /* renamed from: h */
    public final int mo56194h() {
        try {
            IESSettingsProxy iESSettingsProxy = C52912c.f121688a.f121689b;
            C89219l.m154716b(iESSettingsProxy, "");
            Integer hdHwDecoderMinSideSize = iESSettingsProxy.getHdHwDecoderMinSideSize();
            C89219l.m154716b(hdHwDecoderMinSideSize, "");
            int intValue = hdHwDecoderMinSideSize.intValue();
            if (intValue <= 720 || intValue >= 2200) {
                return 1090;
            }
            return intValue;
        } catch (C16041a unused) {
            return 1090;
        }
    }

    @Override // com.p2082ss.android.ugc.asve.context.AbstractC31036e
    /* renamed from: n */
    public final PreviewSize mo56200n() {
        C27910f fVar = this.f143535h;
        boolean z = true;
        String a = C16048b.m29633a().mo25417a(true, "ve_camera_preview_size", "");
        if (!(a == null || a.length() == 0)) {
            z = false;
        }
        Object obj = null;
        if (!z) {
            try {
                obj = fVar.mo46670a(a, PreviewSize.class);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return (PreviewSize) obj;
    }

    @Override // com.p2082ss.android.ugc.asve.context.AbstractC31036e
    /* renamed from: r */
    public final Map<String, Object> mo56204r() {
        C65460eo eoVar = this.f143536i;
        HashMap hashMap = new HashMap();
        for (Map.Entry<String, C65406cr.AbstractC65407a> entry : C65460eo.m117186b().entrySet()) {
            hashMap.put(entry.getKey(), eoVar.mo104600a(entry.getValue()).getFirst());
        }
        return hashMap;
    }

    public C63204b(Application application, C27910f fVar, C65460eo eoVar, ResourceFinder resourceFinder, C85515j jVar) {
        C89219l.m154721d(application, "");
        C89219l.m154721d(fVar, "");
        C89219l.m154721d(eoVar, "");
        C89219l.m154721d(jVar, "");
        this.f143535h = fVar;
        this.f143536i = eoVar;
        this.f143537j = resourceFinder;
        this.f143538k = jVar;
        ExecutorService executorService = C13590c.f33035a;
        C89219l.m154716b(executorService, "");
        this.f143530c = executorService;
        this.f143531d = C89250i.m154773a((AbstractC89171a) new C63205a(this));
        this.f143532e = C89250i.m154773a((AbstractC89171a) C63208c.f143542a);
        this.f143533f = C89250i.m154773a((AbstractC89171a) C63210d.f143543a);
        this.f143534g = new File(C31012a.m63726b().getFilesDir(), "vesdk");
    }
}
