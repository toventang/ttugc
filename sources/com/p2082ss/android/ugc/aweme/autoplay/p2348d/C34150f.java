package com.p2082ss.android.ugc.aweme.autoplay.p2348d;

import android.view.View;
import androidx.recyclerview.widget.AbstractC1491x;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.autoplay.d.f */
public class C34150f extends C34147e {

    /* renamed from: c */
    public final boolean f80753c;

    /* renamed from: d */
    public final int f80754d;

    static {
        Covode.recordClassIndex(41084);
    }

    public C34150f(boolean z, int i) {
        this.f80753c = z;
        this.f80754d = i;
    }

    @Override // com.p2082ss.android.ugc.aweme.autoplay.p2348d.C34147e
    /* renamed from: a */
    public int mo60478a(View view, AbstractC1491x xVar) {
        C89219l.m154721d(view, "");
        C89219l.m154721d(xVar, "");
        if (!this.f80753c) {
            return xVar.mo5021a(view) - xVar.mo5023b();
        }
        return (this.f80754d - xVar.mo5023b()) - xVar.mo5024b(view);
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.autoplay.p2348d.C34147e
    /* renamed from: a */
    public final View mo60479a(RecyclerView.AbstractC1362i iVar, AbstractC1491x xVar) {
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
        if (!this.f80753c) {
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
        } else {
            int i5 = this.f80754d;
            int i6 = s - 1;
            if (i6 >= 0) {
                while (true) {
                    View g2 = iVar.mo4717g(i2);
                    int abs2 = Math.abs((i5 - xVar.mo5024b(g2)) - i);
                    if (abs2 < i3) {
                        view = g2;
                        i3 = abs2;
                    }
                    if (i2 == i6) {
                        break;
                    }
                    i2++;
                }
            }
        }
        return view;
    }

    @Override // androidx.recyclerview.widget.C1494y, com.p2082ss.android.ugc.aweme.autoplay.p2348d.C34147e, androidx.recyclerview.widget.AbstractC1392ac
    /* renamed from: a */
    public final int[] mo4858a(RecyclerView.AbstractC1362i iVar, View view) {
        C89219l.m154721d(iVar, "");
        C89219l.m154721d(view, "");
        int[] iArr = new int[2];
        int i = 0;
        do {
            iArr[i] = 0;
            i++;
        } while (i < 2);
        if (!iVar.mo4366f()) {
            iArr[0] = 0;
        } else if (!this.f80753c) {
            iArr[0] = mo60478a(view, mo60481e(iVar));
        } else {
            iArr[0] = mo60478a(view, mo60481e(iVar)) * -1;
        }
        if (iVar.mo4368g()) {
            iArr[1] = mo60478a(view, mo60480d(iVar));
        } else {
            iArr[1] = 0;
        }
        return iArr;
    }

    @Override // androidx.recyclerview.widget.C1494y, androidx.recyclerview.widget.AbstractC1392ac
    /* renamed from: a */
    public final int mo4854a(RecyclerView.AbstractC1362i iVar, int i, int i2) {
        View a;
        int e;
        C89219l.m154721d(iVar, "");
        if (!this.f80753c) {
            return super.mo4854a(iVar, i, i2);
        }
        if (iVar.mo4685A() == 0) {
            return -1;
        }
        if (iVar.mo4368g()) {
            a = mo60479a(iVar, mo60480d(iVar));
        } else {
            if (iVar.mo4366f()) {
                a = mo60479a(iVar, mo60481e(iVar));
            }
            return -1;
        }
        if (a == null || (e = RecyclerView.AbstractC1362i.m4426e(a)) == -1) {
            return -1;
        }
        return e;
    }
}
