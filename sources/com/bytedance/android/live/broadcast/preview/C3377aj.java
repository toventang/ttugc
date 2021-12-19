package com.bytedance.android.live.broadcast.preview;

import android.net.Uri;
import androidx.fragment.app.DialogInterface$OnCancelListenerC0944d;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.live.p176b.AbstractC2928f;
import com.bytedance.android.live.p176b.AbstractC2939m;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveIntroLynxUrl;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.live.broadcast.preview.aj */
public final class C3377aj {

    /* renamed from: a */
    public static final C3377aj f9600a = new C3377aj();

    private C3377aj() {
    }

    static {
        Covode.recordClassIndex(3861);
    }

    /* renamed from: a */
    public static DialogInterface$OnCancelListenerC0944d m8813a(boolean z) {
        String str;
        boolean z2;
        String str2;
        String value = LiveIntroLynxUrl.INSTANCE.getValue();
        Uri parse = Uri.parse(value);
        boolean z3 = false;
        AbstractC2939m e = ((AbstractC2928f) C6193a.m13435a(AbstractC2928f.class)).createLynxDialogBuilder(value, "").mo7682a(8, 8).mo7687b(m8812a(parse, "height", 438)).mo7681a(m8812a(parse, "width", (int) C3966y.m9668e(C3966y.m9664c()))).mo7690c(m8812a(parse, "margin", 0)).mo7696e(80);
        if (z) {
            str = "right";
        } else {
            str = "bottom";
        }
        AbstractC2939m d = e.mo7694d(str);
        if (m8812a(parse, "show_close", 0) == 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        AbstractC2939m e2 = d.mo7695d(z2).mo7689b(true).mo7697e("0.5");
        if (parse == null || (str2 = parse.toString()) == null) {
            str2 = "";
        }
        C89219l.m154716b(str2, "");
        AbstractC2939m c = e2.mo7691c(str2);
        if (m8812a(parse, "landscape_custom_height", 0) == 1) {
            z3 = true;
        }
        return c.mo7685a(z3).mo7686a();
    }

    /* renamed from: a */
    private static int m8812a(Uri uri, String str, int i) {
        if (uri == null) {
            return i;
        }
        try {
            String queryParameter = uri.getQueryParameter(str);
            if (queryParameter != null) {
                return Integer.parseInt(queryParameter);
            }
            return i;
        } catch (Throwable unused) {
            return 0;
        }
    }
}
