package com.google.android.gms.common.stats;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.common.internal.safeparcel.C25569b;
import java.util.List;

public final class WakeLockEvent extends StatsEvent {
    public static final Parcelable.Creator<WakeLockEvent> CREATOR = new C25592e();

    /* renamed from: a */
    private final int f60664a;

    /* renamed from: b */
    private final long f60665b;

    /* renamed from: c */
    private int f60666c;

    /* renamed from: d */
    private final String f60667d;

    /* renamed from: e */
    private final String f60668e;

    /* renamed from: f */
    private final String f60669f;

    /* renamed from: g */
    private final int f60670g;

    /* renamed from: h */
    private final List<String> f60671h;

    /* renamed from: i */
    private final String f60672i;

    /* renamed from: j */
    private final long f60673j;

    /* renamed from: k */
    private int f60674k;

    /* renamed from: l */
    private final String f60675l;

    /* renamed from: m */
    private final float f60676m;

    /* renamed from: n */
    private final long f60677n;

    /* renamed from: o */
    private final boolean f60678o;

    /* renamed from: p */
    private long f60679p;

    @Override // com.google.android.gms.common.stats.StatsEvent
    /* renamed from: a */
    public final long mo41844a() {
        return this.f60665b;
    }

    @Override // com.google.android.gms.common.stats.StatsEvent
    /* renamed from: b */
    public final int mo41845b() {
        return this.f60666c;
    }

    @Override // com.google.android.gms.common.stats.StatsEvent
    /* renamed from: c */
    public final long mo41846c() {
        return this.f60679p;
    }

    static {
        Covode.recordClassIndex(30996);
    }

    @Override // com.google.android.gms.common.stats.StatsEvent
    /* renamed from: d */
    public final String mo41847d() {
        String join;
        String str = this.f60667d;
        int i = this.f60670g;
        List<String> list = this.f60671h;
        String str2 = "";
        if (list == null) {
            join = str2;
        } else {
            join = TextUtils.join(",", list);
        }
        int i2 = this.f60674k;
        String str3 = this.f60668e;
        if (str3 == null) {
            str3 = str2;
        }
        String str4 = this.f60675l;
        if (str4 == null) {
            str4 = str2;
        }
        float f = this.f60676m;
        String str5 = this.f60669f;
        if (str5 != null) {
            str2 = str5;
        }
        return new StringBuilder(String.valueOf(str).length() + 51 + String.valueOf(join).length() + String.valueOf(str3).length() + String.valueOf(str4).length() + String.valueOf(str2).length()).append("\t").append(str).append("\t").append(i).append("\t").append(join).append("\t").append(i2).append("\t").append(str3).append("\t").append(str4).append("\t").append(f).append("\t").append(str2).append("\t").append(this.f60678o).toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C25569b.m49347a(parcel, 20293);
        C25569b.m49360b(parcel, 1, this.f60664a);
        C25569b.m49349a(parcel, 2, mo41844a());
        C25569b.m49353a(parcel, 4, this.f60667d);
        C25569b.m49360b(parcel, 5, this.f60670g);
        C25569b.m49354a(parcel, 6, this.f60671h);
        C25569b.m49349a(parcel, 8, this.f60673j);
        C25569b.m49353a(parcel, 10, this.f60668e);
        C25569b.m49360b(parcel, 11, mo41845b());
        C25569b.m49353a(parcel, 12, this.f60672i);
        C25569b.m49353a(parcel, 13, this.f60675l);
        C25569b.m49360b(parcel, 14, this.f60674k);
        float f = this.f60676m;
        C25569b.m49348a(parcel, 15, 4);
        parcel.writeFloat(f);
        C25569b.m49349a(parcel, 16, this.f60677n);
        C25569b.m49353a(parcel, 17, this.f60669f);
        C25569b.m49355a(parcel, 18, this.f60678o);
        C25569b.m49359b(parcel, a);
    }

    public WakeLockEvent(long j, int i, String str, int i2, List<String> list, String str2, long j2, int i3, String str3, String str4, float f, long j3, String str5) {
        this(2, j, i, str, i2, list, str2, j2, i3, str3, str4, f, j3, null, false);
    }

    WakeLockEvent(int i, long j, int i2, String str, int i3, List<String> list, String str2, long j2, int i4, String str3, String str4, float f, long j3, String str5, boolean z) {
        this.f60664a = i;
        this.f60665b = j;
        this.f60666c = i2;
        this.f60667d = str;
        this.f60668e = str3;
        this.f60669f = str5;
        this.f60670g = i3;
        this.f60679p = -1;
        this.f60671h = list;
        this.f60672i = str2;
        this.f60673j = j2;
        this.f60674k = i4;
        this.f60675l = str4;
        this.f60676m = f;
        this.f60677n = j3;
        this.f60678o = z;
    }
}
