package com.p2082ss.android.ugc.aweme.sticker.view.internal.search;

import android.graphics.Rect;
import android.util.SparseArray;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.tools.utils.C84912r;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.sticker.view.internal.search.SearchFlowLayoutManager */
public final class SearchFlowLayoutManager extends RecyclerView.AbstractC1362i {

    /* renamed from: a */
    private final SparseArray<View> f171370a = new SparseArray<>();

    /* renamed from: b */
    private final SparseArray<Rect> f171371b = new SparseArray<>();

    /* renamed from: c */
    private int f171372c;

    /* renamed from: d */
    private int f171373d;

    /* renamed from: e */
    private int f171374e;

    /* renamed from: f */
    private int f171375f;

    static {
        Covode.recordClassIndex(89248);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1362i
    /* renamed from: a */
    public final int mo4312a(int i, RecyclerView.C1372o oVar, RecyclerView.C1378s sVar) {
        return i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1362i
    /* renamed from: f */
    public final boolean mo4366f() {
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1362i
    /* renamed from: g */
    public final boolean mo4368g() {
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1362i
    /* renamed from: x_ */
    public final boolean mo4340x_() {
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1362i
    /* renamed from: b */
    public final RecyclerView.C1367j mo4334b() {
        return new RecyclerView.C1367j(-2, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1362i
    /* renamed from: a */
    public final void mo4692a(RecyclerView.AbstractC1350a<?> aVar, RecyclerView.AbstractC1350a<?> aVar2) {
        mo4729r();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1362i
    /* renamed from: c */
    public final void mo4337c(RecyclerView.C1372o oVar, RecyclerView.C1378s sVar) {
        int A = mo4685A();
        for (int i = 0; i < A; i++) {
            View view = this.f171370a.get(i);
            C89219l.m154716b(view, "");
            Rect rect = this.f171371b.get(i);
            C89219l.m154716b(rect, "");
            Rect rect2 = rect;
            m4418a(view, rect2.left, rect2.top, rect2.right, rect2.bottom);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1362i
    /* renamed from: b */
    public final int mo4331b(int i, RecyclerView.C1372o oVar, RecyclerView.C1378s sVar) {
        int i2 = this.f171374e;
        int i3 = this.f171373d;
        int i4 = 0;
        if (i2 - i3 <= 0) {
            return 0;
        }
        int i5 = this.f171375f;
        int i6 = i + i5;
        if (i6 >= 0) {
            if (i6 > i2 - i3) {
                i4 = i2 - i3;
            } else {
                i4 = i6;
            }
        }
        int i7 = i4 - i5;
        mo4721i(-i7);
        this.f171375f = i4;
        return i7;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1362i
    /* renamed from: a */
    public final void mo4694a(RecyclerView.C1372o oVar, RecyclerView.C1378s sVar, int i, int i2) {
        C89219l.m154721d(oVar, "");
        C89219l.m154721d(sVar, "");
        super.mo4694a(oVar, sVar, i, i2);
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int a = (int) C84912r.m145929a(12.0f);
        mo4711c(oVar);
        oVar.mo4756a();
        this.f171370a.clear();
        this.f171374e = 0;
        this.f171372c = (size - mo4733v()) - mo4731t();
        int t = mo4731t();
        int u = mo4732u();
        int A = mo4685A();
        for (int i3 = 0; i3 < A; i3++) {
            View b = oVar.mo4762b(i3);
            C89219l.m154716b(b, "");
            mo4710c(b);
            mo4725l(b);
            this.f171370a.put(i3, b);
        }
        int A2 = mo4685A();
        int i4 = u;
        for (int i5 = 0; i5 < A2; i5++) {
            View view = this.f171370a.get(i5);
            C89219l.m154716b(view, "");
            View view2 = view;
            int m = m4429m(view2);
            int n = m4430n(view2);
            if (m > this.f171372c - t) {
                t = mo4731t();
                i4 = u;
            }
            int i6 = n + i4;
            this.f171371b.put(i5, new Rect(t, i4, t + m, i6));
            t += m + a;
            if (i6 >= u) {
                u = i6 + a;
            }
        }
        int u2 = u - mo4732u();
        this.f171374e = u2;
        int u3 = u2 + mo4732u() + mo4734w();
        if (mode == Integer.MIN_VALUE ? u3 <= size2 : mode != 1073741824) {
            size2 = u3;
        }
        this.f171373d = (size2 - mo4732u()) - mo4734w();
        mo4714d(size, size2);
    }
}
