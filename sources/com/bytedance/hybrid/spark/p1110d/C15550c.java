package com.bytedance.hybrid.spark.p1110d;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.hybrid.spark.p1107a.AbstractC15510f;
import com.bytedance.lynx.p1507a.p1508a.p1510b.C21137b;
import p4600h.C89388w;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.hybrid.spark.d.c */
public final class C15550c implements AbstractC15510f {

    /* renamed from: a */
    private final C21137b f37907a;

    /* renamed from: b */
    private final View f37908b;

    static {
        Covode.recordClassIndex(17812);
    }

    @Override // com.bytedance.hybrid.spark.p1107a.AbstractC15510f
    /* renamed from: a */
    public final void mo25251a() {
        String gravity = this.f37907a.getGravity();
        int hashCode = gravity.hashCode();
        if (hashCode != -1383228885) {
            if (hashCode == -1364013995 && gravity.equals("center")) {
                ViewGroup.LayoutParams layoutParams = this.f37908b.getLayoutParams();
                if (layoutParams != null) {
                    ((FrameLayout.LayoutParams) layoutParams).gravity = 17;
                    return;
                }
                throw new C89388w("null cannot be cast to non-null type");
            }
        } else if (gravity.equals("bottom")) {
            ViewGroup.LayoutParams layoutParams2 = this.f37908b.getLayoutParams();
            if (layoutParams2 != null) {
                ((FrameLayout.LayoutParams) layoutParams2).gravity = 81;
                return;
            }
            throw new C89388w("null cannot be cast to non-null type");
        }
        ViewGroup.LayoutParams layoutParams3 = this.f37908b.getLayoutParams();
        if (layoutParams3 != null) {
            ((FrameLayout.LayoutParams) layoutParams3).gravity = 81;
            return;
        }
        throw new C89388w("null cannot be cast to non-null type");
    }

    public C15550c(C21137b bVar, View view) {
        C89219l.m154719c(bVar, "");
        C89219l.m154719c(view, "");
        this.f37907a = bVar;
        this.f37908b = view;
    }
}
