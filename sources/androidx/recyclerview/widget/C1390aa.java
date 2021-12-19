package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;

/* renamed from: androidx.recyclerview.widget.aa */
final class C1390aa {
    static {
        Covode.recordClassIndex(1528);
    }

    /* renamed from: a */
    static int m4763a(RecyclerView.C1378s sVar, AbstractC1491x xVar, View view, View view2, RecyclerView.AbstractC1362i iVar, boolean z) {
        if (iVar.mo4730s() == 0 || sVar.mo4782a() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return Math.abs(RecyclerView.AbstractC1362i.m4426e(view) - RecyclerView.AbstractC1362i.m4426e(view2)) + 1;
        }
        return Math.min(xVar.mo5029e(), xVar.mo5024b(view2) - xVar.mo5021a(view));
    }

    /* renamed from: b */
    static int m4765b(RecyclerView.C1378s sVar, AbstractC1491x xVar, View view, View view2, RecyclerView.AbstractC1362i iVar, boolean z) {
        if (iVar.mo4730s() == 0 || sVar.mo4782a() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return sVar.mo4782a();
        }
        return (int) ((((float) (xVar.mo5024b(view2) - xVar.mo5021a(view))) / ((float) (Math.abs(RecyclerView.AbstractC1362i.m4426e(view) - RecyclerView.AbstractC1362i.m4426e(view2)) + 1))) * ((float) sVar.mo4782a()));
    }

    /* renamed from: a */
    static int m4764a(RecyclerView.C1378s sVar, AbstractC1491x xVar, View view, View view2, RecyclerView.AbstractC1362i iVar, boolean z, boolean z2) {
        int max;
        if (iVar.mo4730s() == 0 || sVar.mo4782a() == 0 || view == null || view2 == null) {
            return 0;
        }
        int min = Math.min(RecyclerView.AbstractC1362i.m4426e(view), RecyclerView.AbstractC1362i.m4426e(view2));
        int max2 = Math.max(RecyclerView.AbstractC1362i.m4426e(view), RecyclerView.AbstractC1362i.m4426e(view2));
        if (z2) {
            max = Math.max(0, (sVar.mo4782a() - max2) - 1);
        } else {
            max = Math.max(0, min);
        }
        if (!z) {
            return max;
        }
        return Math.round((((float) max) * (((float) Math.abs(xVar.mo5024b(view2) - xVar.mo5021a(view))) / ((float) (Math.abs(RecyclerView.AbstractC1362i.m4426e(view) - RecyclerView.AbstractC1362i.m4426e(view2)) + 1)))) + ((float) (xVar.mo5023b() - xVar.mo5021a(view))));
    }
}
