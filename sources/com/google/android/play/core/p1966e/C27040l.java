package com.google.android.play.core.p1966e;

import android.os.IBinder;
import android.os.IInterface;
import com.bytedance.covode.number.Covode;
import com.google.android.play.core.p1963b.AbstractC26899aq;
import com.google.android.play.core.p1963b.AbstractC26948h;
import com.google.android.play.core.p1963b.C26898ap;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.play.core.e.l */
public final /* synthetic */ class C27040l implements AbstractC26948h {

    /* renamed from: a */
    static final AbstractC26948h f64001a = new C27040l();

    static {
        Covode.recordClassIndex(32516);
    }

    private C27040l() {
    }

    @Override // com.google.android.play.core.p1963b.AbstractC26948h
    /* renamed from: a */
    public final Object mo44414a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.splitinstall.protocol.ISplitInstallService");
        return queryLocalInterface instanceof AbstractC26899aq ? queryLocalInterface : new C26898ap(iBinder);
    }
}
