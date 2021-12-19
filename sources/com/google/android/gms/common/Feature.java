package com.google.android.gms.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.common.internal.C25560p;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C25569b;
import com.kakao.usermgmt.StringSet;
import java.util.Arrays;

public class Feature extends AbstractSafeParcelable {
    public static final Parcelable.Creator<Feature> CREATOR = new C25580l();

    /* renamed from: a */
    public final String f60086a;

    /* renamed from: b */
    private final int f60087b;

    /* renamed from: c */
    private final long f60088c;

    static {
        Covode.recordClassIndex(30723);
    }

    /* renamed from: a */
    public final long mo41439a() {
        long j = this.f60088c;
        if (j == -1) {
            return (long) this.f60087b;
        }
        return j;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f60086a, Long.valueOf(mo41439a())});
    }

    public String toString() {
        return C25560p.m49307a(this).mo41827a(StringSet.name, this.f60086a).mo41827a("version", Long.valueOf(mo41439a())).toString();
    }

    public boolean equals(Object obj) {
        if (obj instanceof Feature) {
            Feature feature = (Feature) obj;
            String str = this.f60086a;
            if (((str == null || !str.equals(feature.f60086a)) && (this.f60086a != null || feature.f60086a != null)) || mo41439a() != feature.mo41439a()) {
                return false;
            }
            return true;
        }
        return false;
    }

    public Feature(String str, long j) {
        this.f60086a = str;
        this.f60088c = j;
        this.f60087b = -1;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C25569b.m49347a(parcel, 20293);
        C25569b.m49353a(parcel, 1, this.f60086a);
        C25569b.m49360b(parcel, 2, this.f60087b);
        C25569b.m49349a(parcel, 3, mo41439a());
        C25569b.m49359b(parcel, a);
    }

    public Feature(String str, int i, long j) {
        this.f60086a = str;
        this.f60087b = i;
        this.f60088c = j;
    }
}
