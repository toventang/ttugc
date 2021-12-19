package com.p2082ss.android.ugc.aweme.p3070im.sdk.share.panel.p3238a.p3239a;

import android.widget.LinearLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.input.TuxCheckBox;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.share.panel.a.a.b */
public final class C55967b {

    /* renamed from: a */
    public final LinearLayout f127624a;

    /* renamed from: b */
    public final TuxCheckBox f127625b;

    static {
        Covode.recordClassIndex(65761);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C55967b)) {
            return false;
        }
        C55967b bVar = (C55967b) obj;
        return C89219l.m154714a(this.f127624a, bVar.f127624a) && C89219l.m154714a(this.f127625b, bVar.f127625b);
    }

    public final int hashCode() {
        LinearLayout linearLayout = this.f127624a;
        int i = 0;
        int hashCode = (linearLayout != null ? linearLayout.hashCode() : 0) * 31;
        TuxCheckBox tuxCheckBox = this.f127625b;
        if (tuxCheckBox != null) {
            i = tuxCheckBox.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "ShareCreateGroupPayload(layout=" + this.f127624a + ", checkboxView=" + this.f127625b + ")";
    }

    public C55967b(LinearLayout linearLayout, TuxCheckBox tuxCheckBox) {
        C89219l.m154721d(linearLayout, "");
        C89219l.m154721d(tuxCheckBox, "");
        this.f127624a = linearLayout;
        this.f127625b = tuxCheckBox;
    }
}
