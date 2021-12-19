package com.p2082ss.android.ugc.aweme.inbox.widget.multi;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.inbox.widget.multi.d */
public final class C56564d extends AbstractC56585k {

    /* renamed from: a */
    public final int f128974a;

    static {
        Covode.recordClassIndex(66387);
    }

    @Override // com.p2082ss.android.ugc.aweme.inbox.widget.multi.AbstractC56585k
    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof C56564d) && this.f128974a == ((C56564d) obj).f128974a;
        }
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.inbox.widget.multi.AbstractC56585k
    public final int hashCode() {
        return this.f128974a;
    }

    public final String toString() {
        return "FollowRequestPod(followRequestTotal=" + this.f128974a + ")";
    }

    private /* synthetic */ C56564d() {
        this(0);
    }

    @Override // com.p2082ss.android.ugc.aweme.inbox.widget.multi.AbstractC56585k
    /* renamed from: a */
    public final boolean mo93492a() {
        if (this.f128974a > 0) {
            return true;
        }
        return false;
    }

    public C56564d(int i) {
        super(13);
        this.f128974a = i;
    }
}
