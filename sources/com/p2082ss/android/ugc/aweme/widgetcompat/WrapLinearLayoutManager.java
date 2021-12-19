package com.p2082ss.android.ugc.aweme.widgetcompat;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.p2730de.C40970e;
import java.util.concurrent.Callable;
import p077b.C1731i;

/* renamed from: com.ss.android.ugc.aweme.widgetcompat.WrapLinearLayoutManager */
public class WrapLinearLayoutManager extends LinearLayoutManager {

    /* renamed from: a */
    RecyclerView.AbstractC1350a f182531a;

    static {
        Covode.recordClassIndex(95035);
    }

    public WrapLinearLayoutManager() {
    }

    public WrapLinearLayoutManager(byte b) {
        super(0, false);
    }

    /* renamed from: a */
    public static void m141490a(final RecyclerView.AbstractC1350a aVar) {
        if (aVar != null) {
            C1731i.m5640b(new Callable<Void>() {
                /* class com.p2082ss.android.ugc.aweme.widgetcompat.WrapLinearLayoutManager.CallableC816351 */

                static {
                    Covode.recordClassIndex(95036);
                }

                /* access modifiers changed from: private */
                /* renamed from: a */
                public Void call() {
                    try {
                        aVar.notifyDataSetChanged();
                        return null;
                    } catch (Exception e) {
                        aVar.getClass().getName();
                        C40970e.m82488b(e);
                        return null;
                    }
                }
            }, C1731i.f5564c);
        }
    }

    /* renamed from: a */
    private IndexOutOfBoundsException m141489a(IndexOutOfBoundsException indexOutOfBoundsException) {
        if (this.f182531a == null) {
            return indexOutOfBoundsException;
        }
        IndexOutOfBoundsException indexOutOfBoundsException2 = new IndexOutOfBoundsException(this.f182531a.getClass().getName());
        indexOutOfBoundsException2.initCause(indexOutOfBoundsException);
        return indexOutOfBoundsException2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1362i
    /* renamed from: a */
    public final void mo4692a(RecyclerView.AbstractC1350a aVar, RecyclerView.AbstractC1350a aVar2) {
        super.mo4692a(aVar, aVar2);
        this.f182531a = aVar2;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC1362i
    /* renamed from: c */
    public final void mo4337c(RecyclerView.C1372o oVar, RecyclerView.C1378s sVar) {
        try {
            super.mo4337c(oVar, sVar);
        } catch (IndexOutOfBoundsException e) {
            if (this.f182531a != null) {
                this.f182531a.getClass().getName();
                C40970e.m82488b(m141489a(e));
            }
        } catch (IllegalArgumentException e2) {
            e = e2;
            if (this.f182531a != null) {
                this.f182531a.getClass().getName();
                if (this.f182531a != null) {
                    e = new IllegalArgumentException(this.f182531a.getClass().getName(), e);
                }
                C40970e.m82488b(e);
            }
        } catch (NullPointerException e3) {
            if (this.f182531a != null) {
                this.f182531a.getClass().getName();
                C40970e.m82488b(e3);
                m141490a(this.f182531a);
            }
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC1362i
    /* renamed from: a */
    public final int mo4312a(int i, RecyclerView.C1372o oVar, RecyclerView.C1378s sVar) {
        try {
            return super.mo4312a(i, oVar, sVar);
        } catch (IndexOutOfBoundsException e) {
            if (this.f182531a == null) {
                return 0;
            }
            this.f182531a.getClass().getName();
            C40970e.m82488b(m141489a(e));
            return 0;
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC1362i
    /* renamed from: b */
    public final int mo4331b(int i, RecyclerView.C1372o oVar, RecyclerView.C1378s sVar) {
        try {
            return super.mo4331b(i, oVar, sVar);
        } catch (IndexOutOfBoundsException e) {
            if (this.f182531a != null) {
                this.f182531a.getClass().getName();
                C40970e.m82488b(m141489a(e));
            }
            return 0;
        } catch (NullPointerException e2) {
            if (this.f182531a != null) {
                this.f182531a.getClass().getName();
                C40970e.m82488b(e2);
                m141490a(this.f182531a);
            }
            return 0;
        }
    }

    public WrapLinearLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC1362i
    /* renamed from: a */
    public final View mo4314a(View view, int i, RecyclerView.C1372o oVar, RecyclerView.C1378s sVar) {
        try {
            return super.mo4314a(view, i, oVar, sVar);
        } catch (IndexOutOfBoundsException e) {
            if (this.f182531a == null) {
                return null;
            }
            this.f182531a.getClass().getName();
            C40970e.m82488b(m141489a(e));
            return null;
        }
    }
}
