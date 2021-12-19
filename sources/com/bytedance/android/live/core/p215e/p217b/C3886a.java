package com.bytedance.android.live.core.p215e.p217b;

import android.content.Context;
import android.content.DialogInterface;
import android.text.TextUtils;
import com.bytedance.android.live.p172a.p173a.C2908a;
import com.bytedance.android.live.p172a.p173a.p175b.C2912a;
import com.bytedance.android.livesdk.p562k.DialogC9148b;
import com.bytedance.android.livesdk.utils.C11226ao;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.bytedance.android.live.core.e.b.a */
public final class C3886a {
    static {
        Covode.recordClassIndex(4415);
    }

    /* renamed from: a */
    public static boolean m9504a(Exception exc) {
        if (!(exc instanceof C2912a) || ((C2908a) exc).getErrorCode() != 20047) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static void m9503a(Context context, Throwable th, String str) {
        if (th instanceof C2912a) {
            C2912a aVar = (C2912a) th;
            if (aVar.getErrorCode() != 20006) {
                String prompt = aVar.getPrompt();
                String alert = aVar.getAlert();
                if (!TextUtils.isEmpty(alert)) {
                    String string = context.getResources().getString(R.string.gir);
                    DialogC9148b.C9149a aVar2 = new DialogC9148b.C9149a(context);
                    aVar2.f22244a = context.getResources().getString(R.string.gj9);
                    aVar2.f22245b = alert;
                    aVar2.mo15245a((CharSequence) string, (DialogInterface.OnClickListener) null, false);
                    aVar2.f22249f = new DialogInterface$OnDismissListenerC3887b(null);
                    aVar2.mo15247a().show();
                    return;
                } else if (!TextUtils.isEmpty(prompt)) {
                    C11226ao.m19883a(context, prompt, 0);
                    return;
                } else {
                    C11226ao.m19883a(context, str, 0);
                    return;
                }
            }
        }
        C11226ao.m19883a(context, str, 0);
    }
}
