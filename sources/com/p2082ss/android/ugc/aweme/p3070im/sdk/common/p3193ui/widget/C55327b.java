package com.p2082ss.android.ugc.aweme.p3070im.sdk.common.p3193ui.widget;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import androidx.core.p035f.C0687g;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import java.util.Locale;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.common.ui.widget.b */
public final class C55327b extends RecyclerView.AbstractC1361h {

    /* renamed from: a */
    private final int f126512a;

    /* renamed from: b */
    private final int f126513b;

    /* renamed from: c */
    private final int f126514c;

    static {
        Covode.recordClassIndex(65092);
    }

    public C55327b(int i, int i2, int i3) {
        this.f126512a = i;
        this.f126513b = i2;
        this.f126514c = i3;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1361h
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C1378s sVar) {
        C89219l.m154721d(rect, "");
        C89219l.m154721d(view, "");
        C89219l.m154721d(recyclerView, "");
        C89219l.m154721d(sVar, "");
        int d = RecyclerView.m4277d(view);
        RecyclerView.AbstractC1350a adapter = recyclerView.getAdapter();
        if (adapter != null) {
            int itemCount = adapter.getItemCount();
            int i = Build.VERSION.SDK_INT;
            if (C0687g.m2442a(Locale.getDefault()) == 1) {
                if (d == 0) {
                    rect.right = this.f126512a;
                } else {
                    rect.right = this.f126513b;
                }
                if (d == itemCount - 1) {
                    rect.left = this.f126514c;
                    return;
                }
                return;
            }
            if (d == 0) {
                rect.left = this.f126512a;
            } else {
                rect.left = this.f126513b;
            }
            if (d == itemCount - 1) {
                rect.right = this.f126514c;
            }
        }
    }
}
