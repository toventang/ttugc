package com.p2082ss.android.newmedia.redbadge;

import android.content.Context;
import android.content.Intent;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.common.util.C29843f;
import com.p2082ss.android.message.AbstractC30063b;
import com.p2082ss.android.message.C30066d;
import com.p2082ss.android.message.p2159a.C30062a;
import com.p2082ss.android.pushmanager.AbstractC30212b;
import java.util.Map;

/* renamed from: com.ss.android.newmedia.redbadge.g */
public final class C30191g implements AbstractC30063b {
    static {
        Covode.recordClassIndex(36693);
    }

    @Override // com.p2082ss.android.message.AbstractC30065c
    /* renamed from: a */
    public final void mo35684a(Context context) {
    }

    @Override // com.p2082ss.android.message.AbstractC30063b
    /* renamed from: a */
    public final void mo35686a(Context context, Map<String, String> map) {
    }

    @Override // com.p2082ss.android.message.AbstractC30065c
    /* renamed from: a */
    public final void mo35687a(Intent intent) {
    }

    @Override // com.p2082ss.android.message.AbstractC30065c
    /* renamed from: b */
    public final void mo35688b() {
    }

    @Override // com.p2082ss.android.message.AbstractC30063b
    /* renamed from: a */
    public final void mo35685a(Context context, final AbstractC30212b bVar) {
        String b;
        if (!C30062a.m60803a(context) && (b = C29843f.m60132b(context)) != null && b.endsWith(C30062a.f71751b)) {
            C30062a.f71753d = false;
            try {
                C30066d.m60817a().mo53432a(new Runnable() {
                    /* class com.p2082ss.android.newmedia.redbadge.C30191g.RunnableC301921 */

                    static {
                        Covode.recordClassIndex(36694);
                    }

                    public final void run() {
                        C30180c.m61045a(bVar);
                    }
                }, 0);
            } catch (Throwable unused) {
            }
        }
    }
}
