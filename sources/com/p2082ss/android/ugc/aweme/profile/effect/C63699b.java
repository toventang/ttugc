package com.p2082ss.android.ugc.aweme.profile.effect;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.base.utils.C34728n;
import com.p2082ss.android.ugc.aweme.utils.C80471gb;
import java.util.Objects;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.profile.effect.b */
public final class C63699b extends RecyclerView.AbstractC1361h {
    static {
        Covode.recordClassIndex(75026);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1361h
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C1378s sVar) {
        C89219l.m154721d(rect, "");
        C89219l.m154721d(view, "");
        C89219l.m154721d(recyclerView, "");
        C89219l.m154721d(sVar, "");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type androidx.recyclerview.widget.GridLayoutManager.LayoutParams");
        if (((GridLayoutManager.C1336b) layoutParams).f4324a % 2 != 0) {
            if (!C80471gb.m139483a(view.getContext())) {
                rect.left = C34728n.m70946a(0.5d);
            }
            rect.right = C34728n.m70946a(0.5d);
        } else {
            if (C80471gb.m139483a(view.getContext())) {
                rect.left = C34728n.m70946a(0.5d);
            }
            rect.right = C34728n.m70946a(0.5d);
        }
        rect.bottom = C34728n.m70946a(1.0d);
    }
}
