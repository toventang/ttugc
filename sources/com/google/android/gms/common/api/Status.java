package com.google.android.gms.common.api;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.common.internal.C25560p;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C25569b;
import java.util.Arrays;

public final class Status extends AbstractSafeParcelable implements AbstractC25485p, ReflectedParcelable {
    public static final Parcelable.Creator<Status> CREATOR = new C25492w();

    /* renamed from: a */
    public static final Status f60100a = new Status(0);

    /* renamed from: b */
    public static final Status f60101b = new Status(14);

    /* renamed from: c */
    public static final Status f60102c = new Status(8);

    /* renamed from: d */
    public static final Status f60103d = new Status(15);

    /* renamed from: e */
    public static final Status f60104e = new Status(16);

    /* renamed from: f */
    public static final Status f60105f = new Status(18);

    /* renamed from: j */
    private static final Status f60106j = new Status(17);

    /* renamed from: g */
    public final int f60107g;

    /* renamed from: h */
    public final String f60108h;

    /* renamed from: i */
    public final PendingIntent f60109i;

    /* renamed from: k */
    private final int f60110k;

    @Override // com.google.android.gms.common.api.AbstractC25485p
    /* renamed from: D_ */
    public final Status mo41384D_() {
        return this;
    }

    /* renamed from: b */
    public final boolean mo41476b() {
        if (this.f60109i != null) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public final boolean mo41477c() {
        if (this.f60107g <= 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f60110k), Integer.valueOf(this.f60107g), this.f60108h, this.f60109i});
    }

    public final String toString() {
        C25560p.C25561a a = C25560p.m49307a(this);
        String str = this.f60108h;
        if (str == null) {
            str = C25353g.m48741a(this.f60107g);
        }
        return a.mo41827a("statusCode", str).mo41827a("resolution", this.f60109i).toString();
    }

    static {
        Covode.recordClassIndex(30731);
    }

    public Status(int i) {
        this(i, null);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Status)) {
            return false;
        }
        Status status = (Status) obj;
        if (this.f60110k != status.f60110k || this.f60107g != status.f60107g || !C25560p.m49308a(this.f60108h, status.f60108h) || !C25560p.m49308a(this.f60109i, status.f60109i)) {
            return false;
        }
        return true;
    }

    public Status(int i, String str) {
        this(1, i, str, null);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C25569b.m49347a(parcel, 20293);
        C25569b.m49360b(parcel, 1, this.f60107g);
        C25569b.m49353a(parcel, 2, this.f60108h);
        C25569b.m49352a(parcel, 3, this.f60109i, i);
        C25569b.m49360b(parcel, 1000, this.f60110k);
        C25569b.m49359b(parcel, a);
    }

    public Status(int i, String str, PendingIntent pendingIntent) {
        this(1, i, str, pendingIntent);
    }

    Status(int i, int i2, String str, PendingIntent pendingIntent) {
        this.f60110k = i;
        this.f60107g = i2;
        this.f60108h = str;
        this.f60109i = pendingIntent;
    }
}
