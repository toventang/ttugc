package com.bytedance.push.frontier.setting;

import android.content.Context;
import android.os.Looper;
import com.bytedance.common.utility.p907b.RunnableC13596e;
import com.bytedance.covode.number.Covode;
import com.bytedance.push.frontier.p1594a.AbstractC21808c;
import com.bytedance.push.frontier.p1594a.AbstractC21809d;

/* renamed from: com.bytedance.push.frontier.setting.c */
public final class C21817c implements AbstractC21808c {

    /* renamed from: a */
    public C21819d f51707a = new C21819d();

    static {
        Covode.recordClassIndex(25469);
    }

    @Override // com.bytedance.push.frontier.p1594a.AbstractC21808c
    /* renamed from: a */
    public final void mo35491a(final Context context, final AbstractC21809d dVar) {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            RunnableC13596e.m24423a(new Runnable() {
                /* class com.bytedance.push.frontier.setting.C21817c.RunnableC218181 */

                static {
                    Covode.recordClassIndex(25470);
                }

                public final void run() {
                    C21817c.this.f51707a.mo35504a(context, dVar);
                }
            });
        } else {
            this.f51707a.mo35504a(context, dVar);
        }
    }
}
