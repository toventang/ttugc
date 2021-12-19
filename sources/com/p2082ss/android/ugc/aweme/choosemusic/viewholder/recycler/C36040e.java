package com.p2082ss.android.ugc.aweme.choosemusic.viewholder.recycler;

import android.graphics.PointF;
import android.view.View;
import androidx.recyclerview.widget.AbstractC1392ac;
import androidx.recyclerview.widget.AbstractC1491x;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.choosemusic.viewholder.recycler.e */
public final class C36040e extends AbstractC1392ac {

    /* renamed from: b */
    public AbstractC1491x f85127b;

    /* renamed from: c */
    public AbstractC1491x f85128c;

    /* renamed from: d */
    private final int f85129d = 3;

    static {
        Covode.recordClassIndex(43288);
    }

    /* renamed from: d */
    private final AbstractC1491x m73471d(RecyclerView.AbstractC1362i iVar) {
        if (this.f85128c == null) {
            AbstractC1491x a = AbstractC1491x.m5054a(iVar);
            C89219l.m154716b(a, "");
            this.f85128c = a;
        }
        AbstractC1491x xVar = this.f85128c;
        if (xVar == null) {
            C89219l.m154710a("horizontalHelper");
        }
        return xVar;
    }

    /* renamed from: e */
    private final AbstractC1491x m73472e(RecyclerView.AbstractC1362i iVar) {
        if (this.f85127b == null) {
            AbstractC1491x b = AbstractC1491x.m5056b(iVar);
            C89219l.m154716b(b, "");
            this.f85127b = b;
        }
        AbstractC1491x xVar = this.f85127b;
        if (xVar == null) {
            C89219l.m154710a("verticalHelper");
        }
        return xVar;
    }

    @Override // androidx.recyclerview.widget.AbstractC1392ac
    /* renamed from: a */
    public final View mo4855a(RecyclerView.AbstractC1362i iVar) {
        C89219l.m154721d(iVar, "");
        if (iVar.mo4368g()) {
            return m73470a(iVar, m73472e(iVar));
        }
        if (iVar.mo4366f()) {
            return m73470a(iVar, m73471d(iVar));
        }
        return null;
    }

    /* renamed from: a */
    private static int m73469a(View view, AbstractC1491x xVar) {
        return xVar.mo5021a(view) - xVar.mo5023b();
    }

    /* renamed from: a */
    private final View m73470a(RecyclerView.AbstractC1362i iVar, AbstractC1491x xVar) {
        boolean z;
        if (!(iVar instanceof LinearLayoutManager)) {
            return mo4855a(iVar);
        }
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) iVar;
        int k = linearLayoutManager.mo4371k();
        if (linearLayoutManager.mo4374n() == iVar.mo4685A() - 1) {
            z = true;
        } else {
            z = false;
        }
        if (k == -1) {
            return null;
        }
        if (z) {
            return iVar.mo4358c(k);
        }
        View c = iVar.mo4358c(k);
        if (xVar.mo5024b(c) >= xVar.mo5030e(c) / 2 && xVar.mo5024b(c) > 0) {
            return c;
        }
        if (linearLayoutManager.mo4374n() == iVar.mo4685A() - 1) {
            return null;
        }
        return iVar.mo4358c(k + 1);
    }

    @Override // androidx.recyclerview.widget.AbstractC1392ac
    /* renamed from: a */
    public final int[] mo4858a(RecyclerView.AbstractC1362i iVar, View view) {
        C89219l.m154721d(iVar, "");
        C89219l.m154721d(view, "");
        int[] iArr = new int[2];
        if (iVar.mo4366f()) {
            iArr[0] = m73469a(view, m73471d(iVar));
        } else {
            iArr[0] = 0;
        }
        if (iVar.mo4368g()) {
            iArr[1] = m73469a(view, m73472e(iVar));
        } else {
            iArr[1] = 0;
        }
        return iArr;
    }

    @Override // androidx.recyclerview.widget.AbstractC1392ac
    /* renamed from: a */
    public final int mo4854a(RecyclerView.AbstractC1362i iVar, int i, int i2) {
        View a;
        int e;
        boolean z;
        PointF d;
        C89219l.m154721d(iVar, "");
        int A = iVar.mo4685A();
        if (A == 0) {
            return -1;
        }
        if (iVar.mo4368g()) {
            a = m73470a(iVar, m73472e(iVar));
        } else {
            if (iVar.mo4366f()) {
                a = m73470a(iVar, m73471d(iVar));
            }
            return -1;
        }
        if (a == null || (e = RecyclerView.AbstractC1362i.m4426e(a)) == -1) {
            return -1;
        }
        if (!iVar.mo4366f() ? i2 <= 0 : i <= 0) {
            z = false;
        } else {
            z = true;
        }
        if (!(iVar instanceof RecyclerView.AbstractC1375r.AbstractC1377b) || (d = ((RecyclerView.AbstractC1375r.AbstractC1377b) iVar).mo4360d(A - 1)) == null || (d.x >= 0.0f && d.y >= 0.0f)) {
            if (z) {
                return e + this.f85129d;
            }
            return e;
        } else if (z) {
            return e - this.f85129d;
        } else {
            return e;
        }
    }
}
