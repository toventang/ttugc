package com.google.android.gms.common.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.common.internal.C25565r;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C25569b;

public final class Scope extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<Scope> CREATOR = new C25491v();

    /* renamed from: a */
    public final String f60098a;

    /* renamed from: b */
    private final int f60099b;

    public final String toString() {
        return this.f60098a;
    }

    public final int hashCode() {
        return this.f60098a.hashCode();
    }

    static {
        Covode.recordClassIndex(30730);
    }

    public Scope(String str) {
        this(1, str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Scope)) {
            return false;
        }
        return this.f60098a.equals(((Scope) obj).f60098a);
    }

    Scope(int i, String str) {
        C25565r.m49317a(str, (Object) "scopeUri must not be null or empty");
        this.f60099b = i;
        this.f60098a = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C25569b.m49347a(parcel, 20293);
        C25569b.m49360b(parcel, 1, this.f60099b);
        C25569b.m49353a(parcel, 2, this.f60098a);
        C25569b.m49359b(parcel, a);
    }
}
