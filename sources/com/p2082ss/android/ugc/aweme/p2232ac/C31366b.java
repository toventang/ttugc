package com.p2082ss.android.ugc.aweme.p2232ac;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.ac.b */
public final class C31366b extends AbstractC31365a {

    /* renamed from: a */
    public final boolean f75142a;

    static {
        Covode.recordClassIndex(38068);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof C31366b) && this.f75142a == ((C31366b) obj).f75142a;
        }
        return true;
    }

    public final int hashCode() {
        boolean z = this.f75142a;
        if (z) {
            return 1;
        }
        return z ? 1 : 0;
    }

    public final String toString() {
        return "LogoutContext(isChildrenModeUser=" + this.f75142a + ")";
    }

    public C31366b(boolean z) {
        this.f75142a = z;
    }
}
