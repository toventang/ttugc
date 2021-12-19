package com.bytedance.android.livesdk.lynx.lynxcard;

import android.view.View;
import com.bytedance.android.livesdk.container.p513j.C8273c;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.livesdk.lynx.lynxcard.a */
public final class C9367a {

    /* renamed from: a */
    public final C8273c f22854a;

    /* renamed from: b */
    public final View f22855b;

    /* renamed from: c */
    public final int f22856c;

    static {
        Covode.recordClassIndex(10874);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9367a)) {
            return false;
        }
        C9367a aVar = (C9367a) obj;
        return C89219l.m154714a(this.f22854a, aVar.f22854a) && C89219l.m154714a(this.f22855b, aVar.f22855b) && this.f22856c == aVar.f22856c;
    }

    public final int hashCode() {
        C8273c cVar = this.f22854a;
        int i = 0;
        int hashCode = (cVar != null ? cVar.hashCode() : 0) * 31;
        View view = this.f22855b;
        if (view != null) {
            i = view.hashCode();
        }
        return ((hashCode + i) * 31) + this.f22856c;
    }

    public final String toString() {
        return "AddData(lynxCardView=" + this.f22854a + ", preview=" + this.f22855b + ", priority=" + this.f22856c + ")";
    }

    public C9367a(C8273c cVar, View view, int i) {
        C89219l.m154721d(cVar, "");
        this.f22854a = cVar;
        this.f22855b = view;
        this.f22856c = i;
    }
}
