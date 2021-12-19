package androidx.recyclerview.widget;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;

/* renamed from: androidx.recyclerview.widget.x */
public abstract class AbstractC1491x {

    /* renamed from: a */
    public final RecyclerView.AbstractC1362i f4932a;

    /* renamed from: b */
    int f4933b;

    /* renamed from: c */
    final Rect f4934c;

    static {
        Covode.recordClassIndex(1629);
    }

    /* renamed from: a */
    public abstract int mo5021a(View view);

    /* renamed from: a */
    public abstract void mo5022a(int i);

    /* renamed from: b */
    public abstract int mo5023b();

    /* renamed from: b */
    public abstract int mo5024b(View view);

    /* renamed from: c */
    public abstract int mo5025c();

    /* renamed from: c */
    public abstract int mo5026c(View view);

    /* renamed from: d */
    public abstract int mo5027d();

    /* renamed from: d */
    public abstract int mo5028d(View view);

    /* renamed from: e */
    public abstract int mo5029e();

    /* renamed from: e */
    public abstract int mo5030e(View view);

    /* renamed from: f */
    public abstract int mo5031f();

    /* renamed from: f */
    public abstract int mo5032f(View view);

    /* renamed from: g */
    public abstract int mo5033g();

    /* renamed from: h */
    public abstract int mo5034h();

    /* renamed from: a */
    public final int mo5020a() {
        if (Integer.MIN_VALUE == this.f4933b) {
            return 0;
        }
        return mo5029e() - this.f4933b;
    }

    /* renamed from: a */
    public static AbstractC1491x m5054a(RecyclerView.AbstractC1362i iVar) {
        return new AbstractC1491x(iVar) {
            /* class androidx.recyclerview.widget.AbstractC1491x.C14921 */

            static {
                Covode.recordClassIndex(1630);
            }

            @Override // androidx.recyclerview.widget.AbstractC1491x
            /* renamed from: b */
            public final int mo5023b() {
                return this.f4932a.mo4731t();
            }

            @Override // androidx.recyclerview.widget.AbstractC1491x
            /* renamed from: d */
            public final int mo5027d() {
                return this.f4932a.f4485J;
            }

            @Override // androidx.recyclerview.widget.AbstractC1491x
            /* renamed from: f */
            public final int mo5031f() {
                return this.f4932a.mo4733v();
            }

            @Override // androidx.recyclerview.widget.AbstractC1491x
            /* renamed from: g */
            public final int mo5033g() {
                return this.f4932a.f4483H;
            }

            @Override // androidx.recyclerview.widget.AbstractC1491x
            /* renamed from: h */
            public final int mo5034h() {
                return this.f4932a.f4484I;
            }

            @Override // androidx.recyclerview.widget.AbstractC1491x
            /* renamed from: c */
            public final int mo5025c() {
                return this.f4932a.f4485J - this.f4932a.mo4733v();
            }

            @Override // androidx.recyclerview.widget.AbstractC1491x
            /* renamed from: e */
            public final int mo5029e() {
                return (this.f4932a.f4485J - this.f4932a.mo4731t()) - this.f4932a.mo4733v();
            }

            @Override // androidx.recyclerview.widget.AbstractC1491x
            /* renamed from: a */
            public final void mo5022a(int i) {
                this.f4932a.mo4719h(i);
            }

            @Override // androidx.recyclerview.widget.AbstractC1491x
            /* renamed from: a */
            public final int mo5021a(View view) {
                return RecyclerView.AbstractC1362i.m4431o(view) - ((RecyclerView.C1367j) view.getLayoutParams()).leftMargin;
            }

            @Override // androidx.recyclerview.widget.AbstractC1491x
            /* renamed from: b */
            public final int mo5024b(View view) {
                return RecyclerView.AbstractC1362i.m4433q(view) + ((RecyclerView.C1367j) view.getLayoutParams()).rightMargin;
            }

            @Override // androidx.recyclerview.widget.AbstractC1491x
            /* renamed from: d */
            public final int mo5028d(View view) {
                this.f4932a.mo4689a(view, this.f4934c);
                return this.f4934c.left;
            }

            @Override // androidx.recyclerview.widget.AbstractC1491x
            /* renamed from: c */
            public final int mo5026c(View view) {
                this.f4932a.mo4689a(view, this.f4934c);
                return this.f4934c.right;
            }

            @Override // androidx.recyclerview.widget.AbstractC1491x
            /* renamed from: f */
            public final int mo5032f(View view) {
                RecyclerView.C1367j jVar = (RecyclerView.C1367j) view.getLayoutParams();
                return RecyclerView.AbstractC1362i.m4430n(view) + jVar.topMargin + jVar.bottomMargin;
            }

            @Override // androidx.recyclerview.widget.AbstractC1491x
            /* renamed from: e */
            public final int mo5030e(View view) {
                RecyclerView.C1367j jVar = (RecyclerView.C1367j) view.getLayoutParams();
                return RecyclerView.AbstractC1362i.m4429m(view) + jVar.leftMargin + jVar.rightMargin;
            }
        };
    }

    /* renamed from: b */
    public static AbstractC1491x m5056b(RecyclerView.AbstractC1362i iVar) {
        return new AbstractC1491x(iVar) {
            /* class androidx.recyclerview.widget.AbstractC1491x.C14932 */

            static {
                Covode.recordClassIndex(1631);
            }

            @Override // androidx.recyclerview.widget.AbstractC1491x
            /* renamed from: b */
            public final int mo5023b() {
                return this.f4932a.mo4732u();
            }

            @Override // androidx.recyclerview.widget.AbstractC1491x
            /* renamed from: d */
            public final int mo5027d() {
                return this.f4932a.f4486K;
            }

            @Override // androidx.recyclerview.widget.AbstractC1491x
            /* renamed from: f */
            public final int mo5031f() {
                return this.f4932a.mo4734w();
            }

            @Override // androidx.recyclerview.widget.AbstractC1491x
            /* renamed from: g */
            public final int mo5033g() {
                return this.f4932a.f4484I;
            }

            @Override // androidx.recyclerview.widget.AbstractC1491x
            /* renamed from: h */
            public final int mo5034h() {
                return this.f4932a.f4483H;
            }

            @Override // androidx.recyclerview.widget.AbstractC1491x
            /* renamed from: c */
            public final int mo5025c() {
                return this.f4932a.f4486K - this.f4932a.mo4734w();
            }

            @Override // androidx.recyclerview.widget.AbstractC1491x
            /* renamed from: e */
            public final int mo5029e() {
                return (this.f4932a.f4486K - this.f4932a.mo4732u()) - this.f4932a.mo4734w();
            }

            @Override // androidx.recyclerview.widget.AbstractC1491x
            /* renamed from: a */
            public final void mo5022a(int i) {
                this.f4932a.mo4721i(i);
            }

            @Override // androidx.recyclerview.widget.AbstractC1491x
            /* renamed from: a */
            public final int mo5021a(View view) {
                return RecyclerView.AbstractC1362i.m4432p(view) - ((RecyclerView.C1367j) view.getLayoutParams()).topMargin;
            }

            @Override // androidx.recyclerview.widget.AbstractC1491x
            /* renamed from: b */
            public final int mo5024b(View view) {
                return RecyclerView.AbstractC1362i.m4434r(view) + ((RecyclerView.C1367j) view.getLayoutParams()).bottomMargin;
            }

            @Override // androidx.recyclerview.widget.AbstractC1491x
            /* renamed from: d */
            public final int mo5028d(View view) {
                this.f4932a.mo4689a(view, this.f4934c);
                return this.f4934c.top;
            }

            @Override // androidx.recyclerview.widget.AbstractC1491x
            /* renamed from: c */
            public final int mo5026c(View view) {
                this.f4932a.mo4689a(view, this.f4934c);
                return this.f4934c.bottom;
            }

            @Override // androidx.recyclerview.widget.AbstractC1491x
            /* renamed from: f */
            public final int mo5032f(View view) {
                RecyclerView.C1367j jVar = (RecyclerView.C1367j) view.getLayoutParams();
                return RecyclerView.AbstractC1362i.m4429m(view) + jVar.leftMargin + jVar.rightMargin;
            }

            @Override // androidx.recyclerview.widget.AbstractC1491x
            /* renamed from: e */
            public final int mo5030e(View view) {
                RecyclerView.C1367j jVar = (RecyclerView.C1367j) view.getLayoutParams();
                return RecyclerView.AbstractC1362i.m4430n(view) + jVar.topMargin + jVar.bottomMargin;
            }
        };
    }

    private AbstractC1491x(RecyclerView.AbstractC1362i iVar) {
        this.f4933b = Integer.MIN_VALUE;
        this.f4934c = new Rect();
        this.f4932a = iVar;
    }

    /* synthetic */ AbstractC1491x(RecyclerView.AbstractC1362i iVar, byte b) {
        this(iVar);
    }

    /* renamed from: a */
    public static AbstractC1491x m5055a(RecyclerView.AbstractC1362i iVar, int i) {
        if (i == 0) {
            return m5054a(iVar);
        }
        if (i == 1) {
            return m5056b(iVar);
        }
        throw new IllegalArgumentException("invalid orientation");
    }
}
