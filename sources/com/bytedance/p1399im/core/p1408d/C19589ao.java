package com.bytedance.p1399im.core.p1408d;

import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.im.core.d.ao */
public final class C19589ao implements Cloneable {

    /* renamed from: a */
    public String f46505a;

    /* renamed from: b */
    public long f46506b;

    /* renamed from: c */
    public long f46507c = Long.MIN_VALUE;

    /* renamed from: d */
    public long f46508d;

    /* renamed from: e */
    public long f46509e = -1;

    static {
        Covode.recordClassIndex(22433);
    }

    /* renamed from: a */
    public final C19589ao mo31358a() {
        this.f46509e = -1;
        return this;
    }

    /* renamed from: b */
    public final boolean mo31361b() {
        if (this.f46509e > -1) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public final C19589ao clone() {
        C19589ao aoVar = new C19589ao();
        aoVar.f46505a = this.f46505a;
        aoVar.f46506b = this.f46506b;
        aoVar.mo31359a(this.f46507c);
        aoVar.mo31360b(this.f46508d);
        aoVar.mo31363c(this.f46509e);
        return aoVar;
    }

    public final String toString() {
        return "ParticipantIndexInfo{conversationId='" + this.f46505a + '\'' + ", uid=" + this.f46506b + ", minIndex=" + this.f46507c + ", readIndex=" + this.f46508d + ", readOrder=" + this.f46509e + '}';
    }

    /* renamed from: a */
    public final C19589ao mo31359a(long j) {
        if (this.f46507c < j) {
            this.f46507c = j;
        }
        return this;
    }

    /* renamed from: b */
    public final C19589ao mo31360b(long j) {
        if (this.f46508d < j) {
            this.f46508d = j;
        }
        return this;
    }

    /* renamed from: c */
    public final C19589ao mo31363c(long j) {
        if (this.f46509e < j) {
            this.f46509e = j;
        }
        return this;
    }
}
