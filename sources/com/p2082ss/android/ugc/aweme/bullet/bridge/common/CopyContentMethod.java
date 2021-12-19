package com.p2082ss.android.ugc.aweme.bullet.bridge.common;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Handler;
import android.os.Looper;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.bpea.basics.PrivacyCert;
import com.bytedance.bpea.store.policy.PrivacyPolicyStore;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.p1129c.p1136e.p1137a.C16248b;
import com.bytedance.tux.p1721g.C23144b;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.utils.C80228av;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.bullet.bridge.common.CopyContentMethod */
public final class CopyContentMethod extends BaseBridgeMethod implements AbstractC33974au {

    /* renamed from: b */
    private final String f82583b = "copyContent";

    static {
        Covode.recordClassIndex(42089);
    }

    @Override // com.p2082ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, androidx.lifecycle.AbstractC1202k
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    @Override // com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16192q
    /* renamed from: d */
    public final String mo25752d() {
        return this.f82583b;
    }

    /* renamed from: com.ss.android.ugc.aweme.bullet.bridge.common.CopyContentMethod$a */
    static final class RunnableC35006a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Context f82584a;

        /* renamed from: b */
        final /* synthetic */ String f82585b;

        static {
            Covode.recordClassIndex(42090);
        }

        RunnableC35006a(Context context, String str) {
            this.f82584a = context;
            this.f82585b = str;
        }

        public final void run() {
            for (Context context = this.f82584a; context != null; context = ((ContextWrapper) context).getBaseContext()) {
                if (context instanceof Activity) {
                    Activity activity = (Activity) context;
                    if (activity != null) {
                        new C23144b(activity).mo37635a(this.f82585b).mo37637b();
                        return;
                    }
                    return;
                } else if (!(context instanceof ContextWrapper)) {
                    return;
                }
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CopyContentMethod(C16248b bVar) {
        super(bVar);
        C89219l.m154721d(bVar, "");
    }

    @Override // com.p2082ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod
    /* renamed from: a */
    public final void mo61866a(JSONObject jSONObject, BaseBridgeMethod.AbstractC34965a aVar) {
        C89219l.m154721d(jSONObject, "");
        C89219l.m154721d(aVar, "");
        Context e = mo26893e();
        if (e != null) {
            String optString = jSONObject.optString("content");
            String optString2 = jSONObject.optString("toastMsg");
            if (optString == null || optString.length() == 0 || optString2 == null || optString2.length() == 0) {
                aVar.mo61871a(-1, "content or toastMsg is empty");
                return;
            }
            try {
                C80228av.m139063a(optString, optString, e, PrivacyCert.Builder.Companion.with("bpea-217").usage("").tag("CopyContentMethod_handle").policies(PrivacyPolicyStore.getClipboardPrivacyPolicy()).build());
            } catch (Exception e2) {
                C51423a.m95788a("", e2);
            }
            new Handler(Looper.getMainLooper()).post(new RunnableC35006a(e, optString2));
            aVar.mo61872a((Object) null);
        }
    }
}
