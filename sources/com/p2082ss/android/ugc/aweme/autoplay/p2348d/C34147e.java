package com.p2082ss.android.ugc.aweme.autoplay.p2348d;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;
import androidx.recyclerview.widget.AbstractC1491x;
import androidx.recyclerview.widget.C1481r;
import androidx.recyclerview.widget.C1494y;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4619j.C89271h;

/* renamed from: com.ss.android.ugc.aweme.autoplay.d.e */
public class C34147e extends C1494y {

    /* renamed from: b */
    public static final C34148a f80747b = new C34148a((byte) 0);

    /* renamed from: c */
    private AbstractC1491x f80748c;

    /* renamed from: d */
    private AbstractC1491x f80749d;

    /* renamed from: e */
    private RecyclerView f80750e;

    static {
        Covode.recordClassIndex(41081);
    }

    /* renamed from: com.ss.android.ugc.aweme.autoplay.d.e$a */
    public static final class C34148a {
        static {
            Covode.recordClassIndex(41082);
        }

        private C34148a() {
        }

        public /* synthetic */ C34148a(byte b) {
            this();
        }
    }

    @Override // androidx.recyclerview.widget.AbstractC1392ac
    /* renamed from: a */
    public final void mo4857a(RecyclerView recyclerView) {
        super.mo4857a(recyclerView);
        this.f80750e = recyclerView;
    }

    /* renamed from: com.ss.android.ugc.aweme.autoplay.d.e$b */
    public static final class C34149b extends C1481r {

        /* renamed from: f */
        final /* synthetic */ C34147e f80751f;

        /* renamed from: n */
        final /* synthetic */ RecyclerView.AbstractC1362i f80752n;

        static {
            Covode.recordClassIndex(41083);
        }

        @Override // androidx.recyclerview.widget.C1481r
        /* renamed from: a */
        public final float mo4862a(DisplayMetrics displayMetrics) {
            C89219l.m154721d(displayMetrics, "");
            return 100.0f / ((float) displayMetrics.densityDpi);
        }

        @Override // androidx.recyclerview.widget.C1481r
        /* renamed from: b */
        public final int mo5014b(int i) {
            return C89271h.m154772c(100, super.mo5014b(i));
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34149b(C34147e eVar, RecyclerView.AbstractC1362i iVar, Context context) {
            super(context);
            this.f80751f = eVar;
            this.f80752n = iVar;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1375r, androidx.recyclerview.widget.C1481r
        /* renamed from: a */
        public final void mo4777a(View view, RecyclerView.C1378s sVar, RecyclerView.AbstractC1375r.C1376a aVar) {
            C89219l.m154721d(view, "");
            C89219l.m154721d(sVar, "");
            C89219l.m154721d(aVar, "");
            int[] a = this.f80751f.mo4858a(this.f80752n, view);
            int i = a[0];
            int i2 = a[1];
            aVar.mo4780a(i, i2, C89271h.m154769b(mo5010a(C89271h.m154769b(Math.abs(i), Math.abs(i2))), 1), this.f4912b);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final AbstractC1491x mo60480d(RecyclerView.AbstractC1362i iVar) {
        C89219l.m154721d(iVar, "");
        if (this.f80748c == null) {
            this.f80748c = AbstractC1491x.m5056b(iVar);
        }
        AbstractC1491x xVar = this.f80748c;
        if (xVar == null) {
            C89219l.m154715b();
        }
        return xVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final AbstractC1491x mo60481e(RecyclerView.AbstractC1362i iVar) {
        C89219l.m154721d(iVar, "");
        if (this.f80749d == null) {
            this.f80749d = AbstractC1491x.m5054a(iVar);
        }
        AbstractC1491x xVar = this.f80749d;
        if (xVar == null) {
            C89219l.m154715b();
        }
        return xVar;
    }

    @Override // androidx.recyclerview.widget.C1494y, androidx.recyclerview.widget.AbstractC1392ac
    /* renamed from: a */
    public final View mo4855a(RecyclerView.AbstractC1362i iVar) {
        C89219l.m154721d(iVar, "");
        if (iVar.mo4368g()) {
            return mo60479a(iVar, mo60480d(iVar));
        }
        if (iVar.mo4366f()) {
            return mo60479a(iVar, mo60481e(iVar));
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.AbstractC1392ac
    /* renamed from: c */
    public final C1481r mo4861c(RecyclerView.AbstractC1362i iVar) {
        RecyclerView recyclerView;
        C89219l.m154721d(iVar, "");
        Context context = null;
        if (!(iVar instanceof RecyclerView.AbstractC1375r.AbstractC1377b) || (recyclerView = this.f80750e) == null || recyclerView.getContext() == null) {
            return null;
        }
        RecyclerView recyclerView2 = this.f80750e;
        if (recyclerView2 != null) {
            context = recyclerView2.getContext();
        }
        return new C34149b(this, iVar, context);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public int mo60478a(View view, AbstractC1491x xVar) {
        C89219l.m154721d(view, "");
        C89219l.m154721d(xVar, "");
        return xVar.mo5021a(view) - xVar.mo5023b();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public View mo60479a(RecyclerView.AbstractC1362i iVar, AbstractC1491x xVar) {
        int i;
        C89219l.m154721d(iVar, "");
        C89219l.m154721d(xVar, "");
        int s = iVar.mo4730s();
        View view = null;
        if (s == 0) {
            return null;
        }
        if (iVar instanceof LinearLayoutManager) {
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) iVar;
            if (linearLayoutManager.mo4374n() == linearLayoutManager.mo4685A() - 1) {
                return null;
            }
        }
        int i2 = 0;
        if (iVar.mo4727p()) {
            i = xVar.mo5023b();
        } else {
            i = 0;
        }
        int i3 = Integer.MAX_VALUE;
        int i4 = s - 1;
        if (i4 >= 0) {
            while (true) {
                View g = iVar.mo4717g(i2);
                int abs = Math.abs(xVar.mo5021a(g) - i);
                if (abs < i3) {
                    view = g;
                    i3 = abs;
                }
                if (i2 == i4) {
                    break;
                }
                i2++;
            }
        }
        return view;
    }

    @Override // androidx.recyclerview.widget.C1494y, androidx.recyclerview.widget.AbstractC1392ac
    /* renamed from: a */
    public int[] mo4858a(RecyclerView.AbstractC1362i iVar, View view) {
        C89219l.m154721d(iVar, "");
        C89219l.m154721d(view, "");
        int[] iArr = new int[2];
        int i = 0;
        do {
            iArr[i] = 0;
            i++;
        } while (i < 2);
        if (iVar.mo4366f()) {
            iArr[0] = mo60478a(view, mo60481e(iVar));
        } else {
            iArr[0] = 0;
        }
        if (iVar.mo4368g()) {
            iArr[1] = mo60478a(view, mo60480d(iVar));
        } else {
            iArr[1] = 0;
        }
        return iArr;
    }
}
