package com.p1795d.p1796a.p1797a.p1798a;

import android.content.Context;
import android.os.Handler;
import android.view.WindowManager;
import com.bytedance.covode.number.Covode;
import com.p1795d.p1796a.p1797a.p1798a.p1799a.C23760a;
import com.p1795d.p1796a.p1797a.p1798a.p1799a.C23763d;
import com.p1795d.p1796a.p1797a.p1798a.p1802c.C23784b;
import com.p1795d.p1796a.p1797a.p1798a.p1802c.C23788d;
import com.p1795d.p1796a.p1797a.p1798a.p1802c.C23791f;
import com.p1795d.p1796a.p1797a.p1798a.p1804e.C23798b;
import com.p1795d.p1796a.p1797a.p1798a.p1804e.C23801d;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;

/* renamed from: com.d.a.a.a.a */
public final class C23759a {

    /* renamed from: a */
    public static C23782c f56213a = new C23782c();

    static {
        Covode.recordClassIndex(27867);
    }

    /* renamed from: a */
    public static void m44907a(Context context) {
        C23782c cVar = f56213a;
        Context applicationContext = context.getApplicationContext();
        if (C58003a.f132201c && applicationContext == null) {
            applicationContext = C58003a.f132199a;
        }
        C23801d.m44992a(applicationContext, "Application Context cannot be null");
        if (!cVar.f56268a) {
            cVar.f56268a = true;
            C23791f a = C23791f.m44969a();
            a.f56291b = new C23763d(new Handler(), applicationContext, new C23760a(), a);
            C23784b bVar = C23784b.f56272a;
            Context applicationContext2 = applicationContext.getApplicationContext();
            if (C58003a.f132201c && applicationContext2 == null) {
                applicationContext2 = C58003a.f132199a;
            }
            bVar.f56273b = applicationContext2;
            C23798b.f56300b = applicationContext.getResources().getDisplayMetrics().density;
            C23798b.f56299a = (WindowManager) C23798b.m44981a(applicationContext, "window");
            C23788d dVar = C23788d.f56283a;
            Context applicationContext3 = applicationContext.getApplicationContext();
            if (C58003a.f132201c && applicationContext3 == null) {
                applicationContext3 = C58003a.f132199a;
            }
            dVar.f56284b = applicationContext3;
        }
    }
}
