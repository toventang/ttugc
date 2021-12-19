package com.bytedance.android.p126a.p127a;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.webkit.WebSettings;
import com.bytedance.android.p126a.p127a.p130c.AbstractC2621b;
import com.bytedance.android.p126a.p127a.p130c.C2620a;
import com.bytedance.android.p126a.p127a.p135h.C2640a;
import com.bytedance.android.p126a.p127a.p135h.C2648h;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.a.a.f */
public abstract class AbstractC2632f {
    static {
        Covode.recordClassIndex(3020);
    }

    /* renamed from: a */
    public String mo7152a() {
        Context context = C2628e.m7607d().f7905b;
        if (!TextUtils.isEmpty(C2648h.f7937a)) {
            return C2648h.f7937a;
        }
        String a = C2628e.m7607d().f7909f.mo7120a("WEB_UA_KEY");
        if (context == null) {
            C2640a.m7643a("context is null");
        } else if (!C2648h.f7938b.compareAndSet(false, true)) {
            C2640a.m7643a("already updated");
        } else {
            int i = Build.VERSION.SDK_INT;
            C2620a.m7588a(new AbstractC2621b(context) {
                /* class com.bytedance.android.p126a.p127a.p135h.C2648h.C26491 */

                /* renamed from: a */
                final /* synthetic */ Context f7939a;

                static {
                    Covode.recordClassIndex(3037);
                }

                @Override // com.bytedance.android.p126a.p127a.p130c.AbstractRunnableC2622c
                /* renamed from: a */
                public final void mo7116a() {
                    C2648h.m7664a(WebSettings.getDefaultUserAgent(this.f7939a));
                }

                {
                    this.f7939a = r1;
                }
            });
        }
        if (TextUtils.isEmpty(a)) {
            return System.getProperty("http.agent");
        }
        C2648h.f7937a = a;
        return a;
    }
}
