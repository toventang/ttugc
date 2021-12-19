package com.google.firebase.iid;

import android.util.Log;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.p1940d.AbstractC25619a;
import com.google.android.gms.p1940d.AbstractC25631h;
import java.io.IOException;

/* access modifiers changed from: package-private */
/* renamed from: com.google.firebase.iid.ak */
public final /* synthetic */ class C27768ak implements AbstractC25619a {

    /* renamed from: a */
    static final AbstractC25619a f65245a = new C27768ak();

    static {
        Covode.recordClassIndex(33356);
    }

    private C27768ak() {
    }

    @Override // com.google.android.gms.p1940d.AbstractC25619a
    /* renamed from: a */
    public final Object mo41863a(AbstractC25631h hVar) {
        if (hVar.mo41882b()) {
            return hVar.mo41886d();
        }
        if (Log.isLoggable("FirebaseInstanceId", 3)) {
            String.valueOf(String.valueOf(hVar.mo41887e())).length();
        }
        throw new IOException("SERVICE_NOT_AVAILABLE");
    }
}
