package com.bytedance.ugc.p1744a.p1745a;

import android.view.View;
import android.view.ViewGroup;
import com.bytedance.covode.number.Covode;
import com.bytedance.ugc.p1744a.C23487a;
import com.bytedance.ugc.p1744a.C23497b;
import com.bytedance.ugc.p1744a.C23500c;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ugc.a.a.f */
public final class C23495f extends C23500c.AbstractC23501a {

    /* renamed from: a */
    public static final C23495f f55701a = new C23495f();

    private C23495f() {
    }

    static {
        Covode.recordClassIndex(27497);
    }

    @Override // com.bytedance.ugc.p1744a.C23500c.AbstractC23501a
    /* renamed from: a */
    public final boolean mo19176a(C23497b bVar, View view, int i, int i2, int i3, int i4, int i5, int i6, C23500c.AbstractC23501a aVar) {
        C89219l.m154719c(bVar, "");
        C89219l.m154719c(view, "");
        if (!(view instanceof ViewGroup)) {
            return false;
        }
        if (C23500c.AbstractC23501a.C23502a.m44204a(view)) {
            return true;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        bVar.mo38239a(i3, i4, i5, i6, C23500c.AbstractC23501a.C23502a.m44203a(viewGroup.getBackground()));
        int childCount = viewGroup.getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = viewGroup.getChildAt(i7);
            if (childAt != null) {
                int left = ((i + childAt.getLeft()) - viewGroup.getScrollX()) + ((int) childAt.getTranslationX());
                int top = ((i2 + childAt.getTop()) - viewGroup.getScrollY()) + ((int) childAt.getTranslationY());
                int right = ((i + childAt.getRight()) - viewGroup.getScrollX()) + ((int) childAt.getTranslationX());
                int bottom = ((i2 + childAt.getBottom()) - viewGroup.getScrollY()) + ((int) childAt.getTranslationY());
                if (left < i5 && top < i6 && right > i3 && bottom > i4 && left < right && top < bottom) {
                    C23487a.m44186a(bVar, childAt, left, top, Math.max(i3, left), Math.max(i4, top), Math.min(i5, right), Math.min(i6, bottom), aVar);
                }
            }
        }
        return true;
    }
}
