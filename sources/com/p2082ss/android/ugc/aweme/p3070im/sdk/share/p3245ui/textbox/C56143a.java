package com.p2082ss.android.ugc.aweme.p3070im.sdk.share.p3245ui.textbox;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.share.ui.textbox.a */
public final class C56143a {

    /* renamed from: a */
    public final int f128065a = R.string.ci4;

    /* renamed from: b */
    public final int f128066b = 15;

    static {
        Covode.recordClassIndex(65944);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C56143a)) {
            return false;
        }
        C56143a aVar = (C56143a) obj;
        return this.f128065a == aVar.f128065a && this.f128066b == aVar.f128066b;
    }

    public final int hashCode() {
        return (this.f128065a * 31) + this.f128066b;
    }

    public final String toString() {
        return "NeutralToastText(resId=" + this.f128065a + ", multiSelectLimit=" + this.f128066b + ")";
    }
}
