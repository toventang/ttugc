package com.p2082ss.android.ugc.aweme.discover.p2797ui.p2806c;

import android.content.res.Resources;
import android.graphics.Rect;
import android.util.TypedValue;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.base.widget.AbstractC34766g;
import com.p2082ss.android.ugc.aweme.utils.C80471gb;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4615g.C89241a;

/* renamed from: com.ss.android.ugc.aweme.discover.ui.c.e */
public final class C42825e extends RecyclerView.AbstractC1361h {

    /* renamed from: a */
    public final boolean f99877a;

    /* renamed from: b */
    private final int f99878b = 2;

    /* renamed from: c */
    private final int f99879c;

    /* renamed from: d */
    private final boolean f99880d;

    static {
        Covode.recordClassIndex(50929);
    }

    public C42825e(int i) {
        this.f99879c = i;
        this.f99880d = true;
        this.f99877a = true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1361h
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C1378s sVar) {
        int i;
        int a;
        int a2;
        int i2;
        C89219l.m154721d(rect, "");
        C89219l.m154721d(view, "");
        C89219l.m154721d(recyclerView, "");
        C89219l.m154721d(sVar, "");
        int d = RecyclerView.m4277d(view);
        RecyclerView.AbstractC1350a adapter = recyclerView.getAdapter();
        if ((adapter instanceof AbstractC34766g) && ((AbstractC34766g) adapter).mo61481b() != null) {
            if (d != 0) {
                d++;
            } else {
                return;
            }
        }
        if (recyclerView.getLayoutManager() instanceof GridLayoutManager) {
            GridLayoutManager gridLayoutManager = (GridLayoutManager) recyclerView.getLayoutManager();
            if (gridLayoutManager == null) {
                C89219l.m154715b();
            }
            GridLayoutManager.AbstractC1337c cVar = gridLayoutManager.f4321g;
            int a3 = cVar.mo4343a(d, this.f99878b);
            int a4 = cVar.mo4342a(d);
            boolean a5 = C80471gb.m139482a();
            if (this.f99877a) {
                int i3 = this.f99878b;
                if (a4 == i3) {
                    return;
                }
                if (!a5) {
                    int i4 = this.f99879c;
                    rect.left = i4 - ((a3 * i4) / i3);
                    a = ((a3 + 1) * this.f99879c) / this.f99878b;
                } else {
                    int i5 = this.f99879c;
                    rect.right = i5 - ((a3 * i5) / i3);
                    rect.left = ((a3 + 1) * this.f99879c) / this.f99878b;
                    return;
                }
            } else if (a3 == 0) {
                if (!a5) {
                    a2 = this.f99879c * 2;
                } else {
                    Resources system = Resources.getSystem();
                    C89219l.m154709a((Object) system, "");
                    a2 = (int) (((float) C89241a.m154730a(TypedValue.applyDimension(1, 7.0f, system.getDisplayMetrics()))) / 2.0f);
                }
                rect.left = a2;
                if (!a5) {
                    Resources system2 = Resources.getSystem();
                    C89219l.m154709a((Object) system2, "");
                    i2 = (int) (((float) C89241a.m154730a(TypedValue.applyDimension(1, 7.0f, system2.getDisplayMetrics()))) / 2.0f);
                } else {
                    i2 = this.f99879c * 2;
                }
                rect.right = i2;
                return;
            } else {
                if (!a5) {
                    Resources system3 = Resources.getSystem();
                    C89219l.m154709a((Object) system3, "");
                    i = (int) (((float) C89241a.m154730a(TypedValue.applyDimension(1, 7.0f, system3.getDisplayMetrics()))) / 2.0f);
                } else {
                    i = this.f99879c * 2;
                }
                rect.left = i;
                if (!a5) {
                    a = this.f99879c * 2;
                } else {
                    Resources system4 = Resources.getSystem();
                    C89219l.m154709a((Object) system4, "");
                    a = (int) (((float) C89241a.m154730a(TypedValue.applyDimension(1, 7.0f, system4.getDisplayMetrics()))) / 2.0f);
                }
            }
            rect.right = a;
        }
    }
}
