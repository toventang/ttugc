package com.p2082ss.android.ugc.aweme.commentStickerPanel;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.tools.utils.C84912r;
import java.util.Objects;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.commentStickerPanel.i */
public final class C37390i extends RecyclerView.AbstractC1361h {

    /* renamed from: a */
    private final Context f88230a;

    /* renamed from: b */
    private final float f88231b = 5.5f;

    static {
        Covode.recordClassIndex(44770);
    }

    public C37390i(Context context) {
        C89219l.m154721d(context, "");
        this.f88230a = context;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1361h
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C1378s sVar) {
        C89219l.m154721d(rect, "");
        C89219l.m154721d(view, "");
        C89219l.m154721d(recyclerView, "");
        C89219l.m154721d(sVar, "");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type androidx.recyclerview.widget.StaggeredGridLayoutManager.LayoutParams");
        int d = ((StaggeredGridLayoutManager.C1385b) layoutParams).mo4819d();
        int a = (int) C84912r.m145930a(this.f88230a, this.f88231b);
        if (d % 2 == 0) {
            rect.right = a;
        } else {
            rect.left = a;
        }
    }
}
