package com.google.android.play.core.p1961a;

import android.os.IBinder;
import android.os.IInterface;
import com.bytedance.covode.number.Covode;
import com.google.android.play.core.p1963b.AbstractC26931bv;
import com.google.android.play.core.p1963b.AbstractC26948h;
import com.google.android.play.core.p1963b.C26930bu;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.play.core.a.m */
public final /* synthetic */ class C26751m implements AbstractC26948h {

    /* renamed from: a */
    static final AbstractC26948h f63371a = new C26751m();

    static {
        Covode.recordClassIndex(32223);
    }

    private C26751m() {
    }

    @Override // com.google.android.play.core.p1963b.AbstractC26948h
    /* renamed from: a */
    public final Object mo44414a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.appupdate.protocol.IAppUpdateService");
        return queryLocalInterface instanceof AbstractC26931bv ? queryLocalInterface : new C26930bu(iBinder);
    }
}
