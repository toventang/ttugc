package dmt.p4542av.video;

import androidx.lifecycle.AbstractC1214u;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.property.C65424dg;
import com.p2082ss.android.ugc.gamora.editor.p4274a.C82027a;
import com.p2082ss.android.ugc.gamora.editor.p4274a.C82030c;
import com.p2082ss.android.vesdk.filterparam.VEAudioSamiFilterParam;

/* access modifiers changed from: package-private */
/* renamed from: dmt.av.video.ag */
public final /* synthetic */ class C88165ag implements AbstractC1214u {

    /* renamed from: a */
    private final C88303z f200120a;

    static {
        Covode.recordClassIndex(104200);
    }

    C88165ag(C88303z zVar) {
        this.f200120a = zVar;
    }

    @Override // androidx.lifecycle.AbstractC1214u
    public final void onChanged(Object obj) {
        C88303z zVar = this.f200120a;
        C82027a aVar = (C82027a) obj;
        if (aVar.f183584b) {
            boolean z = aVar.f183583a;
            if (C82030c.m142036c()) {
                if (zVar.f200396G == null) {
                    zVar.f200396G = new VEAudioSamiFilterParam();
                    zVar.f200396G.samiType = 2;
                    zVar.f200396G.samiModelPath = C82030c.m142034a();
                    zVar.f200396G.samiParam = "{\n    \"name\":\"denoise_v2\",\n    \"version\":\"1.0\",\n    \"config\":{\n        \"denoisemode\":" + C65424dg.m117143a() + ",\n        \"denoiserate\":1.0\n    }\n}";
                }
                zVar.f200423w.mo56263a(zVar.f200423w.mo56258a(!z ? 1 : 0, 0, zVar.f200396G), zVar.f200396G);
            }
        }
    }
}
