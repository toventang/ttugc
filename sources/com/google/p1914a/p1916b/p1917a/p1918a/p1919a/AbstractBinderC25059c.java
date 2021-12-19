package com.google.p1914a.p1916b.p1917a.p1918a.p1919a;

import android.os.Bundle;
import android.os.Parcel;
import com.bytedance.covode.number.Covode;
import com.google.p1914a.p1915a.BinderC25055b;
import com.google.p1914a.p1915a.C25056c;

/* renamed from: com.google.a.b.a.a.a.c */
public abstract class AbstractBinderC25059c extends BinderC25055b implements AbstractC25060d {
    static {
        Covode.recordClassIndex(30423);
    }

    public AbstractBinderC25059c() {
        super("com.google.android.play.core.install.protocol.IInstallServiceCallback");
    }

    @Override // com.google.p1914a.p1915a.BinderC25055b
    /* renamed from: a */
    public final boolean mo40969a(int i, Parcel parcel) {
        if (i == 1) {
            mo40974a((Bundle) C25056c.m48025a(parcel, Bundle.CREATOR));
        } else if (i == 2) {
            mo40975b((Bundle) C25056c.m48025a(parcel, Bundle.CREATOR));
        } else if (i != 3) {
            return false;
        } else {
            C25056c.m48025a(parcel, Bundle.CREATOR);
        }
        return true;
    }
}
