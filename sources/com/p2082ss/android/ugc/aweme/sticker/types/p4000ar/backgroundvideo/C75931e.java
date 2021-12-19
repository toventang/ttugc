package com.p2082ss.android.ugc.aweme.sticker.types.p4000ar.backgroundvideo;

import android.text.TextUtils;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.services.ISDKService;
import com.p2082ss.android.ugc.aweme.shortvideo.C70638dj;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;
import com.p2082ss.android.ugc.tools.utils.C84896h;
import com.p2082ss.android.ugc.tools.utils.C84902i;
import com.p2082ss.android.ugc.tools.utils.C84911q;
import java.io.File;
import org.json.JSONArray;
import org.json.JSONObject;
import p4600h.p4611f.p4612a.AbstractC89187q;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4617i.AbstractC89255c;
import p4600h.p4619j.C89271h;

/* renamed from: com.ss.android.ugc.aweme.sticker.types.ar.backgroundvideo.e */
public final class C75931e {

    /* renamed from: f */
    public static final C75932a f170553f = new C75932a((byte) 0);

    /* renamed from: a */
    final String f170554a;

    /* renamed from: b */
    public String f170555b;

    /* renamed from: c */
    public String f170556c;

    /* renamed from: d */
    public final String f170557d = (C70638dj.f158105h + "background_v");

    /* renamed from: e */
    public final String f170558e = (C70638dj.f158105h + "background_a");

    /* renamed from: g */
    private final AbstractC1204m f170559g;

    /* renamed from: h */
    private final Effect f170560h;

    static {
        Covode.recordClassIndex(88872);
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.types.ar.backgroundvideo.e$a */
    public static final class C75932a {
        static {
            Covode.recordClassIndex(88873);
        }

        private C75932a() {
        }

        public /* synthetic */ C75932a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.types.ar.backgroundvideo.e$b */
    public static final class C75933b implements ISDKService.SplitCallback {

        /* renamed from: a */
        final /* synthetic */ C75931e f170561a;

        /* renamed from: b */
        final /* synthetic */ AbstractC89187q f170562b;

        static {
            Covode.recordClassIndex(88874);
        }

        @Override // com.p2082ss.android.ugc.aweme.services.ISDKService.SplitCallback
        public final boolean checkIsCanceled() {
            return ISDKService.SplitCallback.DefaultImpls.checkIsCanceled(this);
        }

        @Override // com.p2082ss.android.ugc.aweme.services.ISDKService.SplitCallback
        public final void onFail() {
            this.f170562b.invoke(false, this.f170561a.f170557d, this.f170561a.f170558e);
        }

        C75933b(C75931e eVar, AbstractC89187q qVar) {
            this.f170561a = eVar;
            this.f170562b = qVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.services.ISDKService.SplitCallback
        public final void onSuccess(int i, int i2) {
            C84896h.m145865a(this.f170561a.f170555b, this.f170561a.f170557d);
            C84902i.m145893a(this.f170561a.f170556c, this.f170561a.f170558e);
            this.f170562b.invoke(true, this.f170561a.f170557d, this.f170561a.f170558e);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final String[] mo119586a() {
        JSONArray optJSONArray;
        String[] strArr = {"", ""};
        if (TextUtils.isEmpty(this.f170560h.getSdkExtra())) {
            return strArr;
        }
        try {
            JSONObject optJSONObject = new JSONObject(this.f170560h.getSdkExtra()).optJSONObject("vl");
            if (!(optJSONObject == null || (optJSONArray = optJSONObject.optJSONArray("multi_vPath")) == null)) {
                if (optJSONArray.length() > 0) {
                    JSONArray optJSONArray2 = optJSONObject.optJSONArray("multi_aPath");
                    int a = C89271h.m154763a(C89271h.m154766a(0, optJSONArray.length()), AbstractC89255c.Default);
                    strArr[0] = this.f170560h.getUnzipPath() + optJSONArray.getString(a);
                    if (optJSONArray2 != null && a < optJSONArray2.length()) {
                        strArr[1] = this.f170560h.getUnzipPath() + optJSONArray2.getString(a);
                    }
                }
            }
            return strArr;
        } catch (Exception unused) {
            C84911q.m145926b("BackgroundVideo, parse sticker extra fail, " + this.f170560h + ".sdkExtra");
            return strArr;
        }
    }

    public C75931e(AbstractC1204m mVar, Effect effect) {
        C89219l.m154721d(mVar, "");
        C89219l.m154721d(effect, "");
        this.f170559g = mVar;
        this.f170560h = effect;
        String str = effect.getUnzipPath() + File.separator + "res_split";
        this.f170554a = str;
        this.f170555b = str + File.separator + "background_v";
        this.f170556c = str + File.separator + "background_a";
    }
}
