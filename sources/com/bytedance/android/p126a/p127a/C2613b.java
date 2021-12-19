package com.bytedance.android.p126a.p127a;

import android.os.SystemClock;
import android.view.View;
import com.bytedance.android.p126a.p127a.p130c.AbstractC2621b;
import com.bytedance.android.p126a.p127a.p130c.C2620a;
import com.bytedance.android.p126a.p127a.p131d.AbstractC2625a;
import com.bytedance.android.p126a.p127a.p135h.C2640a;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.a.a.b */
public final class C2613b {
    static {
        Covode.recordClassIndex(3001);
    }

    C2613b() {
    }

    /* renamed from: a */
    public final void mo7118a(final View view, final AbstractC2625a aVar) {
        if (!C2628e.m7607d().mo7138b()) {
            C2640a.m7643a("ByteAdTracker is not available now");
            return;
        }
        final long uptimeMillis = SystemClock.uptimeMillis();
        C2620a.m7588a(new AbstractC2621b() {
            /* class com.bytedance.android.p126a.p127a.C2613b.C26141 */

            static {
                Covode.recordClassIndex(3002);
            }

            @Override // com.bytedance.android.p126a.p127a.p130c.AbstractRunnableC2622c
            /* renamed from: a */
            public final void mo7116a() {
                C2619c.m7582a().mo7127a(SystemClock.uptimeMillis() - uptimeMillis);
                C2628e.m7607d().f7907d.mo7115a(view, aVar);
            }
        });
    }
}
