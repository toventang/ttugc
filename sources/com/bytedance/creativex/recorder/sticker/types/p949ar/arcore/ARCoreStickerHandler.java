package com.bytedance.creativex.recorder.sticker.types.p949ar.arcore;

import android.app.Activity;
import android.text.TextUtils;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.bpea.basics.C13349j;
import com.bytedance.bpea.basics.C13350k;
import com.bytedance.bpea.basics.PrivacyCert;
import com.bytedance.bpea.store.p878a.C13401b;
import com.bytedance.covode.number.Covode;
import com.bytedance.creativex.recorder.p940b.p941a.AbstractC14177d;
import com.p2082ss.android.ttvecamera.C30933l;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.sticker.p3970p.C75466g;
import com.p2082ss.android.ugc.aweme.sticker.presenter.AbstractC75591e;
import com.p2082ss.android.ugc.aweme.sticker.presenter.handler.AbstractC75614b;
import com.p2082ss.android.ugc.aweme.sticker.presenter.handler.p3980c.C75618a;
import com.p2082ss.android.ugc.aweme.sticker.presenter.handler.p3980c.C75619b;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;
import com.p2082ss.android.ugc.tools.utils.C84911q;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.creativex.recorder.sticker.types.ar.arcore.ARCoreStickerHandler */
public final class ARCoreStickerHandler extends AbstractC75614b implements AbstractC33974au, AbstractC75591e {

    /* renamed from: a */
    public final AbstractC14177d f34853a;

    /* renamed from: b */
    private final Activity f34854b;

    static {
        Covode.recordClassIndex(16474);
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.presenter.handler.AbstractC75614b
    /* renamed from: a */
    public final void mo23212a(C75619b bVar, C75618a aVar) {
        C89219l.m154721d(bVar, "");
        C89219l.m154721d(aVar, "");
    }

    @Override // androidx.lifecycle.AbstractC1202k
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
    }

    /* renamed from: com.bytedance.creativex.recorder.sticker.types.ar.arcore.ARCoreStickerHandler$a */
    static final class RunnableC14399a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ ARCoreStickerHandler f34855a;

        /* renamed from: b */
        final /* synthetic */ C30933l.C30934a f34856b;

        static {
            Covode.recordClassIndex(16475);
        }

        RunnableC14399a(ARCoreStickerHandler aRCoreStickerHandler, C30933l.C30934a aVar) {
            this.f34855a = aRCoreStickerHandler;
            this.f34856b = aVar;
        }

        public final void run() {
            this.f34855a.f34853a.mo22790a(true, this.f34856b, new PrivacyCert(new C13349j("1086"), "Open the camera on the shooting page to preview and shoot the video.", new C13350k[]{C13401b.m24107a()}));
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.presenter.handler.AbstractC75614b
    /* renamed from: a */
    public final void mo23210a() {
        this.f34853a.mo22790a(false, new C30933l.C30934a(), new PrivacyCert(new C13349j("1087"), "Open the camera on the shooting page to preview and shoot the video.", new C13350k[]{C13401b.m24107a()}));
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.presenter.handler.AbstractC75614b
    /* renamed from: a */
    public final boolean mo23213a(C75618a aVar) {
        C89219l.m154721d(aVar, "");
        Effect effect = aVar.f170022a;
        if (!C75466g.m132359k(effect)) {
            return false;
        }
        return effect.getTypes().contains("ARCore");
    }

    public ARCoreStickerHandler(Activity activity, AbstractC1204m mVar, AbstractC14177d dVar) {
        C89219l.m154721d(activity, "");
        C89219l.m154721d(mVar, "");
        C89219l.m154721d(dVar, "");
        this.f34854b = activity;
        this.f34853a = dVar;
        mVar.getLifecycle().mo4012a(this);
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.presenter.AbstractC75591e
    /* renamed from: a */
    public final void mo23211a(int i, int i2, int i3, String str) {
        if (i == 80) {
            C84911q.m145928d("ARCoreStickerHandler received msg");
            if (TextUtils.isEmpty(str)) {
                C84911q.m145928d("ARCoreStickerHandler arg3 is empty");
                return;
            }
            try {
                C30933l.C30934a aVar = new C30933l.C30934a();
                JSONObject jSONObject = new JSONObject(str);
                aVar.f74203a = C30933l.C30934a.EnumC30935a.values()[jSONObject.optInt("augmentedFaceMode", 0)];
                aVar.f74204b = C30933l.C30934a.EnumC30936b.values()[jSONObject.optInt("cloudAnchorMode", 0)];
                aVar.f74205c = C30933l.C30934a.EnumC30937c.values()[jSONObject.optInt("depthMode", 0)];
                aVar.f74206d = C30933l.C30934a.EnumC30938d.values()[jSONObject.optInt("focusMode", 0)];
                aVar.f74207e = C30933l.C30934a.EnumC30939e.values()[jSONObject.optInt("lightEstimationMode", 0)];
                aVar.f74208f = C30933l.C30934a.EnumC30940f.values()[jSONObject.optInt("planeFindingMode", 0)];
                this.f34854b.runOnUiThread(new RunnableC14399a(this, aVar));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
