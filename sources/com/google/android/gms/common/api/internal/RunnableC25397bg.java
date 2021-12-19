package com.google.android.gms.common.api.internal;

import com.bytedance.covode.number.Covode;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.internal.C25450f;
import com.google.android.gms.common.internal.AbstractC25551l;

/* renamed from: com.google.android.gms.common.api.internal.bg */
final class RunnableC25397bg implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ ConnectionResult f60270a;

    /* renamed from: b */
    private final /* synthetic */ C25450f.C25452b f60271b;

    static {
        Covode.recordClassIndex(30796);
    }

    public final void run() {
        C25450f.C25451a<?> aVar = C25450f.this.f60415l.get(this.f60271b.f60434b);
        if (aVar != null) {
            if (this.f60270a.mo41434b()) {
                this.f60271b.f60435c = true;
                if (this.f60271b.f60433a.mo41494i()) {
                    this.f60271b.mo41705a();
                    return;
                }
                try {
                    this.f60271b.f60433a.mo41489a((AbstractC25551l) null, this.f60271b.f60433a.mo41497l());
                } catch (SecurityException unused) {
                    aVar.mo41581a(new ConnectionResult(10));
                }
            } else {
                aVar.mo41581a(this.f60270a);
            }
        }
    }

    RunnableC25397bg(C25450f.C25452b bVar, ConnectionResult connectionResult) {
        this.f60271b = bVar;
        this.f60270a = connectionResult;
    }
}
