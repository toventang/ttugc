package com.lynx.tasm.behavior.p2052ui.list;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.bytedance.covode.number.Covode;

/* renamed from: com.lynx.tasm.behavior.ui.list.ListLayoutManager */
public final class ListLayoutManager {
    static {
        Covode.recordClassIndex(34675);
    }

    /* renamed from: com.lynx.tasm.behavior.ui.list.ListLayoutManager$ListGridLayoutManager */
    public static class ListGridLayoutManager extends GridLayoutManager {

        /* renamed from: L */
        private UIList f67357L;

        static {
            Covode.recordClassIndex(34676);
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager, androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC1362i
        /* renamed from: x_ */
        public final boolean mo4340x_() {
            return false;
        }

        @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC1362i
        /* renamed from: g */
        public final boolean mo4368g() {
            if (!this.f67357L.f67364f) {
                return false;
            }
            return super.mo4368g();
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager, androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC1362i
        /* renamed from: a */
        public final void mo4324a(RecyclerView.C1378s sVar) {
            super.mo4324a(sVar);
            this.f67357L.mo49550b();
        }

        public ListGridLayoutManager(Context context, int i, UIList uIList) {
            super(i);
            this.f67357L = uIList;
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager, androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC1362i
        /* renamed from: b */
        public final int mo4331b(int i, RecyclerView.C1372o oVar, RecyclerView.C1378s sVar) {
            int b = super.mo4331b(i, oVar, sVar);
            this.f67357L.f67363e.mo49572a(i, b);
            return b;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1362i
        /* renamed from: b */
        public final void mo4702b(View view, int i, int i2, int i3, int i4) {
            if (((GridLayoutManager.C1336b) view.getLayoutParams()).f4325b != ((GridLayoutManager) this).f4316b) {
                super.mo4702b(view, i, i2, i3, i4);
            } else {
                ListLayoutManager.m57216a(this, view, i2, i4);
            }
        }
    }

    /* renamed from: com.lynx.tasm.behavior.ui.list.ListLayoutManager$ListLinearLayoutManager */
    public static class ListLinearLayoutManager extends LinearLayoutManager {

        /* renamed from: a */
        private UIList f67358a;

        static {
            Covode.recordClassIndex(34677);
        }

        @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC1362i
        /* renamed from: x_ */
        public final boolean mo4340x_() {
            return false;
        }

        @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC1362i
        /* renamed from: g */
        public final boolean mo4368g() {
            if (!this.f67358a.f67364f) {
                return false;
            }
            return super.mo4368g();
        }

        public ListLinearLayoutManager(UIList uIList) {
            this.f67358a = uIList;
        }

        @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC1362i
        /* renamed from: a */
        public final void mo4324a(RecyclerView.C1378s sVar) {
            super.mo4324a(sVar);
            this.f67358a.mo49550b();
        }

        @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC1362i
        /* renamed from: b */
        public final int mo4331b(int i, RecyclerView.C1372o oVar, RecyclerView.C1378s sVar) {
            int b = super.mo4331b(i, oVar, sVar);
            this.f67358a.f67363e.mo49572a(i, b);
            return b;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1362i
        /* renamed from: b */
        public final void mo4702b(View view, int i, int i2, int i3, int i4) {
            if (!this.f67358a.f67361c.mo49592a(((RecyclerView.C1367j) view.getLayoutParams()).f4500c.getBindingAdapterPosition())) {
                super.mo4702b(view, i, i2, i3, i4);
            } else {
                ListLayoutManager.m57216a(this, view, i2, i4);
            }
        }
    }

    /* renamed from: com.lynx.tasm.behavior.ui.list.ListLayoutManager$a */
    static class C28622a extends StaggeredGridLayoutManager {

        /* renamed from: l */
        private UIList f67359l;

        static {
            Covode.recordClassIndex(34678);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1362i, androidx.recyclerview.widget.StaggeredGridLayoutManager
        /* renamed from: x_ */
        public final boolean mo4340x_() {
            return false;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1362i, androidx.recyclerview.widget.StaggeredGridLayoutManager
        /* renamed from: g */
        public final boolean mo4368g() {
            if (!this.f67359l.f67364f) {
                return false;
            }
            return super.mo4368g();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1362i, androidx.recyclerview.widget.StaggeredGridLayoutManager
        /* renamed from: a */
        public final void mo4324a(RecyclerView.C1378s sVar) {
            super.mo4324a(sVar);
            this.f67359l.mo49550b();
        }

        public C28622a(int i, UIList uIList) {
            super(i, 1);
            this.f67359l = uIList;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1362i, androidx.recyclerview.widget.StaggeredGridLayoutManager
        /* renamed from: b */
        public final int mo4331b(int i, RecyclerView.C1372o oVar, RecyclerView.C1378s sVar) {
            try {
                int b = super.mo4331b(i, oVar, sVar);
                this.f67359l.f67363e.mo49572a(i, b);
                return b;
            } catch (NullPointerException unused) {
                return 0;
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1362i
        /* renamed from: b */
        public final void mo4702b(View view, int i, int i2, int i3, int i4) {
            if (!((StaggeredGridLayoutManager.C1385b) view.getLayoutParams()).f4602b) {
                super.mo4702b(view, i, i2, i3, i4);
            } else {
                ListLayoutManager.m57216a(this, view, i2, i4);
            }
        }
    }

    /* renamed from: a */
    public static void m57216a(RecyclerView.AbstractC1362i iVar, View view, int i, int i2) {
        int i3 = iVar.f4485J;
        int measuredWidth = view.getMeasuredWidth();
        int t = iVar.mo4731t();
        int v = iVar.mo4733v();
        int i4 = i3 - measuredWidth;
        if (i4 <= 0) {
            t = 0;
        } else {
            int i5 = v + t;
            int i6 = i4 - i5;
            if (i6 < 0) {
                double d = (double) t;
                double d2 = (double) i5;
                Double.isNaN(d);
                Double.isNaN(d2);
                double d3 = (double) i6;
                Double.isNaN(d3);
                t += (int) (d3 * (d / d2));
            }
        }
        view.layout(t, i, view.getMeasuredWidth() + t, i2);
    }
}
