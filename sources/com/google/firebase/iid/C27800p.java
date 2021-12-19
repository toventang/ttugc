package com.google.firebase.iid;

import android.content.BroadcastReceiver;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.p1940d.AbstractC25626c;
import com.google.android.gms.p1940d.AbstractC25631h;

/* renamed from: com.google.firebase.iid.p */
final /* synthetic */ class C27800p implements AbstractC25626c {

    /* renamed from: a */
    private final boolean f65311a;

    /* renamed from: b */
    private final BroadcastReceiver.PendingResult f65312b;

    static {
        Covode.recordClassIndex(33388);
    }

    C27800p(boolean z, BroadcastReceiver.PendingResult pendingResult) {
        this.f65311a = z;
        this.f65312b = pendingResult;
    }

    @Override // com.google.android.gms.p1940d.AbstractC25626c
    /* renamed from: a */
    public final void mo36732a(AbstractC25631h hVar) {
        int i;
        try {
            boolean z = this.f65311a;
            BroadcastReceiver.PendingResult pendingResult = this.f65312b;
            if (z) {
                if (hVar.mo41882b()) {
                    i = ((Integer) hVar.mo41886d()).intValue();
                } else {
                    i = 500;
                }
                pendingResult.setResultCode(i);
            }
            pendingResult.finish();
        } catch (Throwable unused) {
            getClass().getName();
        }
    }
}
