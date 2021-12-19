package com.bytedance.android.livesdk.browser.jsbridge.newmethods;

import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.livesdk.utils.C11226ao;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.web.jsbridge2.AbstractC18337f;
import com.bytedance.ies.web.jsbridge2.C18338g;
import com.google.gson.p2018a.AbstractC27891c;

public class ToastMethod extends AbstractC18337f<Params, Object> {
    static {
        Covode.recordClassIndex(7815);
    }

    /* access modifiers changed from: package-private */
    public static final class Params {
        @AbstractC27891c(mo46611a = "position")
        int position;
        @AbstractC27891c(mo46611a = "text")
        String text;

        static {
            Covode.recordClassIndex(7816);
        }

        Params() {
        }
    }

    public Object invoke(Params params, C18338g gVar) {
        if (params.position == 1) {
            C11226ao.m19883a(C3966y.m9669e(), params.text, 0);
            return null;
        }
        C11226ao.m19883a(gVar.f43859a, params.text, 0);
        return null;
    }
}
