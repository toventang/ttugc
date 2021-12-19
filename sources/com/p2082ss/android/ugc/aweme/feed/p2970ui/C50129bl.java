package com.p2082ss.android.ugc.aweme.feed.p2970ui;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.C16048b;
import com.p2082ss.android.ugc.aweme.base.utils.C34728n;
import com.p2082ss.android.ugc.aweme.base.widget.C34745b;
import java.util.Objects;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.bl */
public final class C50129bl extends C34745b {

    /* renamed from: a */
    public int f115718a = 1;

    static {
        Covode.recordClassIndex(59255);
    }

    public C50129bl() {
        super(2, 1);
    }

    @Override // com.p2082ss.android.ugc.aweme.base.widget.C34745b, androidx.recyclerview.widget.RecyclerView.AbstractC1361h
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C1378s sVar) {
        C89219l.m154721d(rect, "");
        C89219l.m154721d(view, "");
        C89219l.m154721d(recyclerView, "");
        C89219l.m154721d(sVar, "");
        super.getItemOffsets(rect, view, recyclerView, sVar);
        int d = RecyclerView.m4277d(view);
        RecyclerView.AbstractC1350a adapter = recyclerView.getAdapter();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type androidx.recyclerview.widget.GridLayoutManager.LayoutParams");
        if (((GridLayoutManager.C1336b) layoutParams).f4324a % 2 == 0) {
            rect.left = C34728n.m70946a((double) this.f115718a);
            double d2 = (double) this.f115718a;
            Double.isNaN(d2);
            rect.right = C34728n.m70946a(d2 / 2.0d);
        } else {
            double d3 = (double) this.f115718a;
            Double.isNaN(d3);
            rect.left = C34728n.m70946a(d3 / 2.0d);
            rect.right = C34728n.m70946a((double) this.f115718a);
        }
        if (C16048b.m29633a().mo25412a(true, "video_search_show_style", 0) == 5) {
            double d4 = (double) this.f115718a;
            Double.isNaN(d4);
            rect.bottom = C34728n.m70946a(d4 - 3.0d);
            if ((adapter == null || adapter.getItemViewType(0) != 0) && d == 1) {
                rect.top = C34728n.m70946a(3.0d);
                return;
            }
            return;
        }
        rect.bottom = C34728n.m70946a((double) this.f115718a);
    }
}
