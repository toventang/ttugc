package com.google.android.play.core.p1961a;

import android.app.PendingIntent;
import com.bytedance.covode.number.Covode;
import java.util.Objects;

/* renamed from: com.google.android.play.core.a.w */
final class C26761w extends AbstractC26736a {

    /* renamed from: a */
    private final String f63393a;

    /* renamed from: b */
    private final int f63394b;

    /* renamed from: c */
    private final int f63395c;

    /* renamed from: d */
    private final int f63396d;

    /* renamed from: e */
    private final Integer f63397e;

    /* renamed from: f */
    private final int f63398f;

    /* renamed from: g */
    private final long f63399g;

    /* renamed from: h */
    private final long f63400h;

    /* renamed from: i */
    private final long f63401i;

    /* renamed from: j */
    private final long f63402j;

    /* renamed from: k */
    private final PendingIntent f63403k;

    /* renamed from: l */
    private final PendingIntent f63404l;

    /* renamed from: m */
    private final PendingIntent f63405m;

    /* renamed from: n */
    private final PendingIntent f63406n;

    static {
        Covode.recordClassIndex(32233);
    }

    C26761w(String str, int i, int i2, int i3, Integer num, int i4, long j, long j2, long j3, long j4, PendingIntent pendingIntent, PendingIntent pendingIntent2, PendingIntent pendingIntent3, PendingIntent pendingIntent4) {
        Objects.requireNonNull(str, "Null packageName");
        this.f63393a = str;
        this.f63394b = i;
        this.f63395c = i2;
        this.f63396d = i3;
        this.f63397e = num;
        this.f63398f = i4;
        this.f63399g = j;
        this.f63400h = j2;
        this.f63401i = j3;
        this.f63402j = j4;
        this.f63403k = pendingIntent;
        this.f63404l = pendingIntent2;
        this.f63405m = pendingIntent3;
        this.f63406n = pendingIntent4;
    }

    @Override // com.google.android.play.core.p1961a.AbstractC26736a
    /* renamed from: a */
    public final String mo44387a() {
        return this.f63393a;
    }

    @Override // com.google.android.play.core.p1961a.AbstractC26736a
    /* renamed from: b */
    public final int mo44388b() {
        return this.f63394b;
    }

    @Override // com.google.android.play.core.p1961a.AbstractC26736a
    /* renamed from: c */
    public final int mo44389c() {
        return this.f63395c;
    }

    @Override // com.google.android.play.core.p1961a.AbstractC26736a
    /* renamed from: d */
    public final int mo44390d() {
        return this.f63396d;
    }

    @Override // com.google.android.play.core.p1961a.AbstractC26736a
    /* renamed from: e */
    public final Integer mo44391e() {
        return this.f63397e;
    }

    public final boolean equals(Object obj) {
        Integer num;
        PendingIntent pendingIntent;
        PendingIntent pendingIntent2;
        PendingIntent pendingIntent3;
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC26736a) {
            AbstractC26736a aVar = (AbstractC26736a) obj;
            if (this.f63393a.equals(aVar.mo44387a()) && this.f63394b == aVar.mo44388b() && this.f63395c == aVar.mo44389c() && this.f63396d == aVar.mo44390d() && ((num = this.f63397e) != null ? num.equals(aVar.mo44391e()) : aVar.mo44391e() == null) && this.f63398f == aVar.mo44392f() && this.f63399g == aVar.mo44393g() && this.f63400h == aVar.mo44394h() && this.f63401i == aVar.mo44395i() && this.f63402j == aVar.mo44396j() && ((pendingIntent = this.f63403k) != null ? pendingIntent.equals(aVar.mo44397k()) : aVar.mo44397k() == null) && ((pendingIntent2 = this.f63404l) != null ? pendingIntent2.equals(aVar.mo44398l()) : aVar.mo44398l() == null) && ((pendingIntent3 = this.f63405m) != null ? pendingIntent3.equals(aVar.mo44399m()) : aVar.mo44399m() == null)) {
                PendingIntent pendingIntent4 = this.f63406n;
                PendingIntent n = aVar.mo44400n();
                if (pendingIntent4 != null ? pendingIntent4.equals(n) : n == null) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.google.android.play.core.p1961a.AbstractC26736a
    /* renamed from: f */
    public final int mo44392f() {
        return this.f63398f;
    }

    @Override // com.google.android.play.core.p1961a.AbstractC26736a
    /* renamed from: g */
    public final long mo44393g() {
        return this.f63399g;
    }

    @Override // com.google.android.play.core.p1961a.AbstractC26736a
    /* renamed from: h */
    public final long mo44394h() {
        return this.f63400h;
    }

    public final int hashCode() {
        int hashCode = (((((((this.f63393a.hashCode() ^ 1000003) * 1000003) ^ this.f63394b) * 1000003) ^ this.f63395c) * 1000003) ^ this.f63396d) * 1000003;
        Integer num = this.f63397e;
        int i = 0;
        int hashCode2 = num == null ? 0 : num.hashCode();
        int i2 = this.f63398f;
        long j = this.f63399g;
        long j2 = this.f63400h;
        long j3 = this.f63401i;
        long j4 = this.f63402j;
        int i3 = (((((((((((hashCode ^ hashCode2) * 1000003) ^ i2) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003) ^ ((int) ((j3 >>> 32) ^ j3))) * 1000003) ^ ((int) ((j4 >>> 32) ^ j4))) * 1000003;
        PendingIntent pendingIntent = this.f63403k;
        int hashCode3 = (i3 ^ (pendingIntent == null ? 0 : pendingIntent.hashCode())) * 1000003;
        PendingIntent pendingIntent2 = this.f63404l;
        int hashCode4 = (hashCode3 ^ (pendingIntent2 == null ? 0 : pendingIntent2.hashCode())) * 1000003;
        PendingIntent pendingIntent3 = this.f63405m;
        int hashCode5 = (hashCode4 ^ (pendingIntent3 == null ? 0 : pendingIntent3.hashCode())) * 1000003;
        PendingIntent pendingIntent4 = this.f63406n;
        if (pendingIntent4 != null) {
            i = pendingIntent4.hashCode();
        }
        return hashCode5 ^ i;
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.play.core.p1961a.AbstractC26736a
    /* renamed from: i */
    public final long mo44395i() {
        return this.f63401i;
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.play.core.p1961a.AbstractC26736a
    /* renamed from: j */
    public final long mo44396j() {
        return this.f63402j;
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.play.core.p1961a.AbstractC26736a
    /* renamed from: k */
    public final PendingIntent mo44397k() {
        return this.f63403k;
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.play.core.p1961a.AbstractC26736a
    /* renamed from: l */
    public final PendingIntent mo44398l() {
        return this.f63404l;
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.play.core.p1961a.AbstractC26736a
    /* renamed from: m */
    public final PendingIntent mo44399m() {
        return this.f63405m;
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.play.core.p1961a.AbstractC26736a
    /* renamed from: n */
    public final PendingIntent mo44400n() {
        return this.f63406n;
    }

    public final String toString() {
        String str = this.f63393a;
        int i = this.f63394b;
        int i2 = this.f63395c;
        int i3 = this.f63396d;
        String valueOf = String.valueOf(this.f63397e);
        int i4 = this.f63398f;
        long j = this.f63399g;
        long j2 = this.f63400h;
        long j3 = this.f63401i;
        long j4 = this.f63402j;
        String valueOf2 = String.valueOf(this.f63403k);
        String valueOf3 = String.valueOf(this.f63404l);
        String valueOf4 = String.valueOf(this.f63405m);
        String valueOf5 = String.valueOf(this.f63406n);
        int length = str.length();
        int length2 = String.valueOf(valueOf).length();
        int length3 = String.valueOf(valueOf2).length();
        int length4 = String.valueOf(valueOf3).length();
        StringBuilder sb = new StringBuilder(length + 463 + length2 + length3 + length4 + String.valueOf(valueOf4).length() + String.valueOf(valueOf5).length());
        sb.append("AppUpdateInfo{packageName=");
        sb.append(str);
        sb.append(", availableVersionCode=");
        sb.append(i);
        sb.append(", updateAvailability=");
        sb.append(i2);
        sb.append(", installStatus=");
        sb.append(i3);
        sb.append(", clientVersionStalenessDays=");
        sb.append(valueOf);
        sb.append(", updatePriority=");
        sb.append(i4);
        sb.append(", bytesDownloaded=");
        sb.append(j);
        sb.append(", totalBytesToDownload=");
        sb.append(j2);
        sb.append(", additionalSpaceRequired=");
        sb.append(j3);
        sb.append(", assetPackStorageSize=");
        sb.append(j4);
        sb.append(", immediateUpdateIntent=");
        sb.append(valueOf2);
        sb.append(", flexibleUpdateIntent=");
        sb.append(valueOf3);
        sb.append(", immediateDestructiveUpdateIntent=");
        sb.append(valueOf4);
        sb.append(", flexibleDestructiveUpdateIntent=");
        sb.append(valueOf5);
        sb.append("}");
        return sb.toString();
    }
}
