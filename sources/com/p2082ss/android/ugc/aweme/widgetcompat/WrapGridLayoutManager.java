package com.p2082ss.android.ugc.aweme.widgetcompat;

import android.content.Context;
import android.graphics.PointF;
import android.util.AttributeSet;
import androidx.recyclerview.widget.C1481r;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.p2730de.C40970e;

/* renamed from: com.ss.android.ugc.aweme.widgetcompat.WrapGridLayoutManager */
public class WrapGridLayoutManager extends GridLayoutManager {

    /* renamed from: L */
    RecyclerView.AbstractC1350a f182529L;

    static {
        Covode.recordClassIndex(95033);
    }

    public WrapGridLayoutManager() {
        super(3, 1, false);
    }

    public WrapGridLayoutManager(Context context, int i) {
        super(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1362i
    /* renamed from: a */
    public final void mo4692a(RecyclerView.AbstractC1350a aVar, RecyclerView.AbstractC1350a aVar2) {
        super.mo4692a(aVar, aVar2);
        this.f182529L = aVar2;
    }

    @Override // androidx.recyclerview.widget.GridLayoutManager, androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC1362i
    /* renamed from: c */
    public final void mo4337c(RecyclerView.C1372o oVar, RecyclerView.C1378s sVar) {
        try {
            super.mo4337c(oVar, sVar);
        } catch (IndexOutOfBoundsException unused) {
        } catch (NullPointerException e) {
            if (this.f182529L != null) {
                this.f182529L.getClass().getName();
                C40970e.m82488b(e);
                WrapLinearLayoutManager.m141490a(this.f182529L);
            }
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC1362i
    /* renamed from: a */
    public final void mo4354a(RecyclerView recyclerView, RecyclerView.C1378s sVar, int i) {
        C816341 r1 = new C1481r(recyclerView.getContext()) {
            /* class com.p2082ss.android.ugc.aweme.widgetcompat.WrapGridLayoutManager.C816341 */

            static {
                Covode.recordClassIndex(95034);
            }

            @Override // androidx.recyclerview.widget.C1481r
            /* renamed from: b */
            public final int mo5014b(int i) {
                return super.mo5014b(i) * 3;
            }

            @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1375r
            /* renamed from: c */
            public final PointF mo4778c(int i) {
                return WrapGridLayoutManager.this.mo4360d(i);
            }
        };
        r1.f4515g = i;
        mo4695a(r1);
    }

    @Override // androidx.recyclerview.widget.GridLayoutManager, androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC1362i
    /* renamed from: b */
    public final int mo4331b(int i, RecyclerView.C1372o oVar, RecyclerView.C1378s sVar) {
        try {
            return super.mo4331b(i, oVar, sVar);
        } catch (IndexOutOfBoundsException unused) {
            return 0;
        } catch (NullPointerException e) {
            if (this.f182529L != null) {
                this.f182529L.getClass().getName();
                C40970e.m82488b(e);
                WrapLinearLayoutManager.m141490a(this.f182529L);
            }
            return 0;
        }
    }

    public WrapGridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}
