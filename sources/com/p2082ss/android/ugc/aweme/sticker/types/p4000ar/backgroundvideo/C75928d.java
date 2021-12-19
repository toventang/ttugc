package com.p2082ss.android.ugc.aweme.sticker.types.p4000ar.backgroundvideo;

import androidx.lifecycle.AbstractC1204m;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.services.ISDKService;
import com.p2082ss.android.ugc.aweme.shortvideo.C70638dj;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;
import com.p2082ss.android.ugc.tools.utils.C84896h;
import com.p2082ss.android.ugc.tools.utils.C84902i;
import com.p2082ss.android.ugc.tools.utils.C84911q;
import java.io.File;
import org.json.JSONObject;
import p4600h.p4611f.p4612a.AbstractC89187q;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.sticker.types.ar.backgroundvideo.d */
public final class C75928d {

    /* renamed from: f */
    public static final C75929a f170543f = new C75929a((byte) 0);

    /* renamed from: a */
    final String f170544a;

    /* renamed from: b */
    public final String f170545b;

    /* renamed from: c */
    public final String f170546c;

    /* renamed from: d */
    public final String f170547d = (C70638dj.f158105h + "background_v");

    /* renamed from: e */
    public final String f170548e = (C70638dj.f158105h + "background_a");

    /* renamed from: g */
    private final AbstractC1204m f170549g;

    /* renamed from: h */
    private final Effect f170550h;

    static {
        Covode.recordClassIndex(88869);
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.types.ar.backgroundvideo.d$a */
    public static final class C75929a {
        static {
            Covode.recordClassIndex(88870);
        }

        private C75929a() {
        }

        public /* synthetic */ C75929a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.types.ar.backgroundvideo.d$b */
    public static final class C75930b implements ISDKService.SplitCallback {

        /* renamed from: a */
        final /* synthetic */ C75928d f170551a;

        /* renamed from: b */
        final /* synthetic */ AbstractC89187q f170552b;

        static {
            Covode.recordClassIndex(88871);
        }

        @Override // com.p2082ss.android.ugc.aweme.services.ISDKService.SplitCallback
        public final boolean checkIsCanceled() {
            return ISDKService.SplitCallback.DefaultImpls.checkIsCanceled(this);
        }

        @Override // com.p2082ss.android.ugc.aweme.services.ISDKService.SplitCallback
        public final void onFail() {
            this.f170552b.invoke(false, this.f170551a.f170547d, this.f170551a.f170548e);
        }

        C75930b(C75928d dVar, AbstractC89187q qVar) {
            this.f170551a = dVar;
            this.f170552b = qVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.services.ISDKService.SplitCallback
        public final void onSuccess(int i, int i2) {
            C84896h.m145865a(this.f170551a.f170545b, this.f170551a.f170547d);
            C84902i.m145893a(this.f170551a.f170546c, this.f170551a.f170548e);
            this.f170552b.invoke(true, this.f170551a.f170547d, this.f170551a.f170548e);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final String mo119585a() {
        try {
            return this.f170550h.getUnzipPath() + new JSONObject(this.f170550h.getSdkExtra()).optJSONObject("vl").optString("vPath");
        } catch (Exception unused) {
            C84911q.m145926b("BackgroundVideo, parse sticker extra fail, " + this.f170550h + ".sdkExtra");
            return "";
        }
    }

    public C75928d(AbstractC1204m mVar, Effect effect) {
        C89219l.m154721d(mVar, "");
        C89219l.m154721d(effect, "");
        this.f170549g = mVar;
        this.f170550h = effect;
        String str = effect.getUnzipPath() + File.separator + "res_split";
        this.f170544a = str;
        this.f170545b = str + File.separator + "background_v";
        this.f170546c = str + File.separator + "background_a";
    }
}
