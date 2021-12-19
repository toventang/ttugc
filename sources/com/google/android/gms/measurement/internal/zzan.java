package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C25569b;
import java.util.Iterator;

public final class zzan extends AbstractSafeParcelable implements Iterable<String> {
    public static final Parcelable.Creator<zzan> CREATOR = new C26529o();

    /* renamed from: a */
    final Bundle f62577a;

    @Override // java.lang.Iterable
    public final Iterator<String> iterator() {
        return new C26528n(this);
    }

    public final String toString() {
        return this.f62577a.toString();
    }

    static {
        Covode.recordClassIndex(31963);
    }

    /* renamed from: a */
    public final Bundle mo43665a() {
        return new Bundle(this.f62577a);
    }

    zzan(Bundle bundle) {
        this.f62577a = bundle;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final String mo43669d(String str) {
        return this.f62577a.getString(str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final Long mo43667b(String str) {
        return Long.valueOf(this.f62577a.getLong(str));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final Double mo43668c(String str) {
        return Double.valueOf(this.f62577a.getDouble(str));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final Object mo43666a(String str) {
        return m52546a(this.f62577a, str);
    }

    /* renamed from: a */
    private static Object m52546a(Bundle bundle, String str) {
        try {
            return bundle.get(str);
        } catch (Exception | OutOfMemoryError unused) {
            return null;
        }
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C25569b.m49347a(parcel, 20293);
        C25569b.m49350a(parcel, 2, mo43665a());
        C25569b.m49359b(parcel, a);
    }
}
