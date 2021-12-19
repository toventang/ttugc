package com.bytedance.android.livesdk.utils;

import android.content.Context;
import android.content.DialogInterface;
import android.text.TextUtils;
import com.bytedance.android.live.p172a.p173a.p175b.C2912a;
import com.bytedance.android.livesdk.p562k.DialogC9148b;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.bytedance.android.livesdk.utils.f */
public final class C11264f {
    static {
        Covode.recordClassIndex(12896);
    }

    /* renamed from: a */
    public static void m19957a(Context context, Throwable th) {
        if (th != null && context != null) {
            if (th instanceof C2912a) {
                C2912a aVar = (C2912a) th;
                String alert = aVar.getAlert();
                String prompt = aVar.getPrompt();
                if (!TextUtils.isEmpty(alert)) {
                    m19956a(context, alert, context.getResources().getString(R.string.gir));
                } else if (!TextUtils.isEmpty(prompt)) {
                    C11226ao.m19883a(context, prompt, 0);
                }
            } else {
                C11226ao.m19882a(context, (int) R.string.gj8);
            }
        }
    }

    /* renamed from: a */
    private static void m19956a(Context context, String str, String str2) {
        if (context != null) {
            DialogC9148b.C9149a aVar = new DialogC9148b.C9149a(context);
            aVar.f22244a = context.getResources().getString(R.string.gj9);
            aVar.f22245b = str;
            aVar.mo15245a((CharSequence) str2, (DialogInterface.OnClickListener) null, false);
            aVar.mo15247a().show();
        }
    }

    /* renamed from: a */
    public static void m19958a(Context context, Throwable th, int i) {
        if (th != null && context != null) {
            if (th instanceof C2912a) {
                C2912a aVar = (C2912a) th;
                String prompt = aVar.getPrompt();
                String alert = aVar.getAlert();
                if (!TextUtils.isEmpty(alert)) {
                    m19956a(context, alert, context.getResources().getString(R.string.gir));
                } else if (!TextUtils.isEmpty(prompt)) {
                    C11226ao.m19883a(context, prompt, 0);
                } else {
                    C11226ao.m19882a(context, i);
                }
            } else {
                C11226ao.m19882a(context, i);
            }
        }
    }
}
