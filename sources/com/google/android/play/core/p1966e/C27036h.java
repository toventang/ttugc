package com.google.android.play.core.p1966e;

import android.app.PendingIntent;
import android.content.Intent;
import com.bytedance.covode.number.Covode;
import java.util.List;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.play.core.e.h */
public final class C27036h extends AbstractC27034f {

    /* renamed from: a */
    private final int f63988a;

    /* renamed from: b */
    private final int f63989b;

    /* renamed from: c */
    private final int f63990c;

    /* renamed from: d */
    private final long f63991d;

    /* renamed from: e */
    private final long f63992e;

    /* renamed from: f */
    private final List<String> f63993f;

    /* renamed from: g */
    private final List<String> f63994g;

    /* renamed from: h */
    private final PendingIntent f63995h;

    /* renamed from: i */
    private final List<Intent> f63996i;

    static {
        Covode.recordClassIndex(32512);
    }

    C27036h(int i, int i2, int i3, long j, long j2, List<String> list, List<String> list2, PendingIntent pendingIntent, List<Intent> list3) {
        this.f63988a = i;
        this.f63989b = i2;
        this.f63990c = i3;
        this.f63991d = j;
        this.f63992e = j2;
        this.f63993f = list;
        this.f63994g = list2;
        this.f63995h = pendingIntent;
        this.f63996i = list3;
    }

    @Override // com.google.android.play.core.p1966e.AbstractC27034f
    /* renamed from: a */
    public final int mo44734a() {
        return this.f63988a;
    }

    @Override // com.google.android.play.core.p1966e.AbstractC27034f
    /* renamed from: b */
    public final int mo44735b() {
        return this.f63989b;
    }

    @Override // com.google.android.play.core.p1966e.AbstractC27034f
    /* renamed from: c */
    public final int mo44736c() {
        return this.f63990c;
    }

    @Override // com.google.android.play.core.p1966e.AbstractC27034f
    /* renamed from: d */
    public final long mo44737d() {
        return this.f63991d;
    }

    @Override // com.google.android.play.core.p1966e.AbstractC27034f
    /* renamed from: e */
    public final long mo44738e() {
        return this.f63992e;
    }

    public final boolean equals(Object obj) {
        List<String> list;
        List<String> list2;
        PendingIntent pendingIntent;
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC27034f) {
            AbstractC27034f fVar = (AbstractC27034f) obj;
            if (this.f63988a == fVar.mo44734a() && this.f63989b == fVar.mo44735b() && this.f63990c == fVar.mo44736c() && this.f63991d == fVar.mo44737d() && this.f63992e == fVar.mo44738e() && ((list = this.f63993f) != null ? list.equals(fVar.mo44742i()) : fVar.mo44742i() == null) && ((list2 = this.f63994g) != null ? list2.equals(fVar.mo44743j()) : fVar.mo44743j() == null) && ((pendingIntent = this.f63995h) != null ? pendingIntent.equals(fVar.mo44741h()) : fVar.mo44741h() == null)) {
                List<Intent> list3 = this.f63996i;
                List<Intent> k = fVar.mo44744k();
                if (list3 != null ? list3.equals(k) : k == null) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.google.android.play.core.p1966e.AbstractC27034f
    /* renamed from: h */
    public final PendingIntent mo44741h() {
        return this.f63995h;
    }

    public final int hashCode() {
        int i = this.f63988a;
        int i2 = this.f63989b;
        int i3 = this.f63990c;
        long j = this.f63991d;
        long j2 = this.f63992e;
        int i4 = (((((((((i ^ 1000003) * 1000003) ^ i2) * 1000003) ^ i3) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003;
        List<String> list = this.f63993f;
        int i5 = 0;
        int hashCode = (i4 ^ (list == null ? 0 : list.hashCode())) * 1000003;
        List<String> list2 = this.f63994g;
        int hashCode2 = (hashCode ^ (list2 == null ? 0 : list2.hashCode())) * 1000003;
        PendingIntent pendingIntent = this.f63995h;
        int hashCode3 = (hashCode2 ^ (pendingIntent == null ? 0 : pendingIntent.hashCode())) * 1000003;
        List<Intent> list3 = this.f63996i;
        if (list3 != null) {
            i5 = list3.hashCode();
        }
        return hashCode3 ^ i5;
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.play.core.p1966e.AbstractC27034f
    /* renamed from: i */
    public final List<String> mo44742i() {
        return this.f63993f;
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.play.core.p1966e.AbstractC27034f
    /* renamed from: j */
    public final List<String> mo44743j() {
        return this.f63994g;
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.play.core.p1966e.AbstractC27034f
    /* renamed from: k */
    public final List<Intent> mo44744k() {
        return this.f63996i;
    }

    public final String toString() {
        int i = this.f63988a;
        int i2 = this.f63989b;
        int i3 = this.f63990c;
        long j = this.f63991d;
        long j2 = this.f63992e;
        String valueOf = String.valueOf(this.f63993f);
        String valueOf2 = String.valueOf(this.f63994g);
        String valueOf3 = String.valueOf(this.f63995h);
        String valueOf4 = String.valueOf(this.f63996i);
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        int length3 = String.valueOf(valueOf3).length();
        StringBuilder sb = new StringBuilder(length + 251 + length2 + length3 + String.valueOf(valueOf4).length());
        sb.append("SplitInstallSessionState{sessionId=");
        sb.append(i);
        sb.append(", status=");
        sb.append(i2);
        sb.append(", errorCode=");
        sb.append(i3);
        sb.append(", bytesDownloaded=");
        sb.append(j);
        sb.append(", totalBytesToDownload=");
        sb.append(j2);
        sb.append(", moduleNamesNullable=");
        sb.append(valueOf);
        sb.append(", languagesNullable=");
        sb.append(valueOf2);
        sb.append(", resolutionIntent=");
        sb.append(valueOf3);
        sb.append(", splitFileIntents=");
        sb.append(valueOf4);
        sb.append("}");
        return sb.toString();
    }
}
