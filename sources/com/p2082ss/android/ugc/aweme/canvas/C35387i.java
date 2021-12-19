package com.p2082ss.android.ugc.aweme.canvas;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.initializer.AVServiceProxyImpl;
import com.p2082ss.android.ugc.aweme.p2730de.C40982q;
import com.p2082ss.android.ugc.aweme.services.IAVServiceProxy;
import com.p2082ss.android.ugc.aweme.shortvideo.C69840ar;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.canvas.i */
public final class C35387i {

    /* renamed from: a */
    public long f83483a;

    /* renamed from: b */
    private final boolean f83484b;

    /* renamed from: c */
    private final int f83485c;

    static {
        Covode.recordClassIndex(42561);
    }

    /* renamed from: a */
    public final void mo62288a() {
        String str;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("duration", (int) ((System.currentTimeMillis() - this.f83483a) / ((long) this.f83485c)));
        C69840ar a = new C69840ar().mo110187a("pictureCount", Integer.valueOf(this.f83485c));
        if (this.f83484b) {
            str = "story";
        } else {
            IAVServiceProxy createIAVServiceProxybyMonsterPlugin = AVServiceProxyImpl.createIAVServiceProxybyMonsterPlugin(false);
            C89219l.m154716b(createIAVServiceProxybyMonsterPlugin, "");
            if (createIAVServiceProxybyMonsterPlugin.getStoryService().mo93871e()) {
                str = "lightening";
            } else {
                str = "main";
            }
        }
        C40982q.m82523a("aweme_photo_canvas_generate_duration", jSONObject, a.mo110189a("business", str).mo110191a());
    }

    public /* synthetic */ C35387i(boolean z) {
        this(z, 1);
    }

    public C35387i(boolean z, int i) {
        this.f83484b = z;
        this.f83485c = i;
    }
}
