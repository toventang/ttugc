package com.p2082ss.android.ugc.aweme.music.assem.list.cell;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.music.assem.list.cell.e */
public final class C60604e {

    /* renamed from: a */
    public final boolean f137819a;

    /* renamed from: b */
    public final boolean f137820b;

    static {
        Covode.recordClassIndex(71158);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C60604e)) {
            return false;
        }
        C60604e eVar = (C60604e) obj;
        return this.f137819a == eVar.f137819a && this.f137820b == eVar.f137820b;
    }

    public final int hashCode() {
        boolean z = this.f137819a;
        int i = 1;
        if (z) {
            z = true;
        }
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = i2 * 31;
        if (!this.f137820b) {
            i = 0;
        }
        return i5 + i;
    }

    public final String toString() {
        return "MusicStatusDiff(isPinStatusChange=" + this.f137819a + ", isCollectionStatusChange=" + this.f137820b + ")";
    }

    private /* synthetic */ C60604e() {
        this(false, false);
    }

    public C60604e(boolean z, boolean z2) {
        this.f137819a = z;
        this.f137820b = z2;
    }
}
