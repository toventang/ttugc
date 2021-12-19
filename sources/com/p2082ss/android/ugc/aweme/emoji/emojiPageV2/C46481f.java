package com.p2082ss.android.ugc.aweme.emoji.emojiPageV2;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.bytedance.covode.number.Covode;
import java.util.Objects;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.emoji.emojiPageV2.f */
public final class C46481f extends RecyclerView.AbstractC1361h {

    /* renamed from: a */
    public final int f108311a;

    /* renamed from: b */
    public final int f108312b;

    static {
        Covode.recordClassIndex(55066);
    }

    public C46481f(int i, int i2) {
        this.f108311a = i;
        this.f108312b = i2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1361h
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C1378s sVar) {
        C89219l.m154721d(rect, "");
        C89219l.m154721d(view, "");
        C89219l.m154721d(recyclerView, "");
        C89219l.m154721d(sVar, "");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type androidx.recyclerview.widget.StaggeredGridLayoutManager.LayoutParams");
        int d = ((StaggeredGridLayoutManager.C1385b) layoutParams).mo4819d() % 3;
        if (d == 0) {
            rect.left = 0;
        } else if (d == 1 || d == 2) {
            rect.left = this.f108312b;
        }
        rect.bottom = this.f108312b;
    }
}
