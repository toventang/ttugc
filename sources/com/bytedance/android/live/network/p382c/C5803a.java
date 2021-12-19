package com.bytedance.android.live.network.p382c;

import com.bytedance.android.live.C4139e;
import com.bytedance.android.live.core.p215e.p216a.C3882b;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.live.network.model.C5820b;
import com.bytedance.android.live.network.response.RequestError;
import com.bytedance.android.livesdk.model.Extra;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.bytedance.android.live.network.c.a */
public final class C5803a {
    static {
        Covode.recordClassIndex(6403);
    }

    /* renamed from: a */
    public static void m12713a(int i, C3882b bVar, String str) {
        throw new C5820b(i, bVar.f10735c, str).setPrompt(bVar.f10734b);
    }

    /* renamed from: a */
    public static void m12714a(int i, RequestError requestError, Extra extra, String str) {
        m12715a(i, requestError, C4139e.C4140a.f11575b.mo46674b(extra), str);
    }

    /* renamed from: a */
    public static void m12715a(int i, RequestError requestError, String str, String str2) {
        if (requestError == null) {
            requestError = new RequestError();
            requestError.prompts = C3966y.m9657a((int) R.string.gt_);
        }
        throw new C5820b(i, requestError.url, str2).setErrorMsg(requestError.message).setPrompt(requestError.prompts).setAlert(requestError.alert).setExtra(str);
    }
}
