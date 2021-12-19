package com.p2082ss.android.ugc.aweme.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import java.util.concurrent.Callable;
import p077b.C1731i;

/* renamed from: com.ss.android.ugc.aweme.views.WrapLinearLayoutManager */
public class WrapLinearLayoutManager extends LinearLayoutManager {

    /* renamed from: e */
    RecyclerView.AbstractC1350a f181994e;

    static {
        Covode.recordClassIndex(94796);
    }

    public WrapLinearLayoutManager() {
    }

    public WrapLinearLayoutManager(int i) {
        super(i, false);
    }

    /* renamed from: a */
    public static void m141200a(final RecyclerView.AbstractC1350a aVar) {
        if (aVar != null) {
            C1731i.m5640b(new Callable<Void>() {
                /* class com.p2082ss.android.ugc.aweme.views.WrapLinearLayoutManager.CallableC814281 */

                static {
                    Covode.recordClassIndex(94797);
                }

                /* access modifiers changed from: private */
                /* renamed from: a */
                public Void call() {
                    try {
                        aVar.notifyDataSetChanged();
                        return null;
                    } catch (Exception e) {
                        C51423a.m95788a(aVar.getClass().getName(), e);
                        return null;
                    }
                }
            }, C1731i.f5564c);
        }
    }

    /* renamed from: a */
    private IndexOutOfBoundsException m141199a(IndexOutOfBoundsException indexOutOfBoundsException) {
        if (this.f181994e == null) {
            return indexOutOfBoundsException;
        }
        IndexOutOfBoundsException indexOutOfBoundsException2 = new IndexOutOfBoundsException(this.f181994e.getClass().getName());
        indexOutOfBoundsException2.initCause(indexOutOfBoundsException);
        return indexOutOfBoundsException2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1362i
    /* renamed from: a */
    public final void mo4692a(RecyclerView.AbstractC1350a aVar, RecyclerView.AbstractC1350a aVar2) {
        super.mo4692a(aVar, aVar2);
        this.f181994e = aVar2;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC1362i
    /* renamed from: c */
    public void mo4337c(RecyclerView.C1372o oVar, RecyclerView.C1378s sVar) {
        try {
            super.mo4337c(oVar, sVar);
        } catch (IndexOutOfBoundsException e) {
            if (this.f181994e != null) {
                C51423a.m95788a(this.f181994e.getClass().getName(), m141199a(e));
            }
        } catch (IllegalArgumentException e2) {
            e = e2;
            if (this.f181994e != null) {
                String name = this.f181994e.getClass().getName();
                if (this.f181994e != null) {
                    e = new IllegalArgumentException(this.f181994e.getClass().getName(), e);
                }
                C51423a.m95788a(name, e);
            }
        } catch (NullPointerException e3) {
            if (this.f181994e != null) {
                C51423a.m95788a(this.f181994e.getClass().getName(), e3);
                m141200a(this.f181994e);
            }
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC1362i
    /* renamed from: a */
    public final int mo4312a(int i, RecyclerView.C1372o oVar, RecyclerView.C1378s sVar) {
        try {
            return super.mo4312a(i, oVar, sVar);
        } catch (IndexOutOfBoundsException e) {
            if (this.f181994e == null) {
                return 0;
            }
            C51423a.m95788a(this.f181994e.getClass().getName(), m141199a(e));
            return 0;
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC1362i
    /* renamed from: b */
    public final int mo4331b(int i, RecyclerView.C1372o oVar, RecyclerView.C1378s sVar) {
        try {
            return super.mo4331b(i, oVar, sVar);
        } catch (IndexOutOfBoundsException e) {
            if (this.f181994e != null) {
                C51423a.m95788a(this.f181994e.getClass().getName(), m141199a(e));
            }
            return 0;
        } catch (NullPointerException e2) {
            if (this.f181994e != null) {
                C51423a.m95788a(this.f181994e.getClass().getName(), e2);
                m141200a(this.f181994e);
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
            if (this.f181994e == null) {
                return null;
            }
            C51423a.m95788a(this.f181994e.getClass().getName(), m141199a(e));
            return null;
        }
    }
}
