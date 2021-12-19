package com.airbnb.epoxy;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.services.apm.api.C22708a;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.profile.C63423ai;
import com.p2082ss.android.ugc.aweme.utils.C80493gg;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.airbnb.epoxy.d */
public abstract class AbstractC1931d extends RecyclerView.AbstractC1350a<C1974u> {

    /* renamed from: a */
    public int f5793a = 1;

    /* renamed from: b */
    final C1933e f5794b = new C1933e();

    /* renamed from: c */
    ViewHolderState f5795c = new ViewHolderState();

    /* renamed from: d */
    public final GridLayoutManager.AbstractC1337c f5796d;

    /* renamed from: e */
    private final C1923am f5797e = new C1923am();

    static {
        Covode.recordClassIndex(2122);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract List<? extends AbstractC1956s<?>> mo5715a();

    /* renamed from: a */
    public void mo5716a(View view) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo5718a(C1974u uVar, AbstractC1956s<?> sVar) {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo5719a(C1974u uVar, AbstractC1956s<?> sVar, int i, AbstractC1956s<?> sVar2) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo5720a(RuntimeException runtimeException) {
    }

    /* renamed from: b */
    public void mo5721b(View view) {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean mo5723b() {
        return false;
    }

    /* renamed from: b */
    public boolean mo5724b(int i) {
        return false;
    }

    /* Return type fixed from 'androidx.recyclerview.widget.RecyclerView$ViewHolder' to match base method */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public /* synthetic */ C1974u onCreateViewHolder(ViewGroup viewGroup, int i) {
        return m6142a(this, viewGroup, i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public C1933e mo5725c() {
        return this.f5794b;
    }

    /* renamed from: d */
    public final boolean mo5726d() {
        if (this.f5793a > 1) {
            return true;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public int getItemCount() {
        return mo5715a().size();
    }

    public AbstractC1931d() {
        C19321 r0 = new GridLayoutManager.AbstractC1337c() {
            /* class com.airbnb.epoxy.AbstractC1931d.C19321 */

            static {
                Covode.recordClassIndex(2123);
            }

            @Override // androidx.recyclerview.widget.GridLayoutManager.AbstractC1337c
            /* renamed from: a */
            public final int mo4342a(int i) {
                try {
                    AbstractC1956s<?> a = AbstractC1931d.this.mo5714a(i);
                    AbstractC1931d.this.getItemCount();
                    return a.mo5801g();
                } catch (IndexOutOfBoundsException e) {
                    AbstractC1931d.this.mo5720a(e);
                    return 1;
                }
            }
        };
        this.f5796d = r0;
        setHasStableIds(true);
        r0.f4328c = true;
    }

    /* renamed from: b */
    public void onViewDetachedFromWindow(C1974u uVar) {
        uVar.mo5821b();
        uVar.mo5819a();
    }

    /* renamed from: a */
    public final AbstractC1956s<?> mo5714a(int i) {
        return (AbstractC1956s) mo5715a().get(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public long getItemId(int i) {
        return ((AbstractC1956s) mo5715a().get(i)).f5838a;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public int getItemViewType(int i) {
        C1923am amVar = this.f5797e;
        AbstractC1956s<?> a = mo5714a(i);
        amVar.f5772a = a;
        return C1923am.m6126a(a);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$ViewHolder] */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public /* synthetic */ boolean onFailedToRecycleView(C1974u uVar) {
        C1974u uVar2 = uVar;
        return uVar2.mo5821b().mo5796c(uVar2.mo5819a());
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public int mo5713a(AbstractC1956s<?> sVar) {
        int size = mo5715a().size();
        for (int i = 0; i < size; i++) {
            if (sVar == mo5715a().get(i)) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: a */
    public void onViewAttachedToWindow(C1974u uVar) {
        uVar.mo5821b();
        uVar.mo5819a();
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$ViewHolder] */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public /* synthetic */ void onViewRecycled(C1974u uVar) {
        C1974u uVar2 = uVar;
        uVar2.mo5821b();
        this.f5794b.f5799a.mo2082b(uVar2.getItemId());
        AbstractC1956s<?> b = uVar2.mo5821b();
        uVar2.mo5822c();
        uVar2.f5894a.mo5794b(uVar2.mo5819a());
        uVar2.f5894a = null;
        uVar2.f5895b = null;
        mo5718a(uVar2, b);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$ViewHolder, int] */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public /* synthetic */ void onBindViewHolder(C1974u uVar, int i) {
        onBindViewHolder(uVar, i, Collections.emptyList());
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void onBindViewHolder(C1974u uVar, int i, List<Object> list) {
        AbstractC1956s<?> a = mo5714a(i);
        AbstractC1956s<?> sVar = null;
        if (mo5723b()) {
            long itemId = getItemId(i);
            if (!list.isEmpty()) {
                Iterator<Object> it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    C1940j jVar = (C1940j) it.next();
                    if (jVar.f5808a == null) {
                        AbstractC1956s<?> a2 = jVar.f5809b.mo2078a(itemId, null);
                        if (a2 != null) {
                            sVar = a2;
                            break;
                        }
                    } else if (jVar.f5808a.f5838a == itemId) {
                        sVar = jVar.f5808a;
                        break;
                    }
                }
            }
        }
        uVar.mo5820a(a, sVar, list, i);
        if (list.isEmpty()) {
            uVar.mo5821b();
        }
        this.f5794b.f5799a.mo2083b(uVar.getItemId(), uVar);
        if (mo5723b()) {
            mo5719a(uVar, a, i, sVar);
        }
    }

    /* renamed from: a */
    private static RecyclerView.ViewHolder m6142a(AbstractC1931d dVar, ViewGroup viewGroup, int i) {
        boolean a;
        C1974u uVar = new C1974u(C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), dVar.f5797e.mo5702a(dVar, i).mo5795c(), viewGroup, false));
        try {
            if (uVar.itemView.getParent() != null) {
                try {
                    a = SettingsManager.m29616a().mo25400a("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (a) {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("onCreateViewHolder getParent() != null crash hook, holder ").append(uVar.getClass().getName()).append(" parent ").append(viewGroup.getClass().getName()).append(" viewType ").append(i);
                    C22708a.m42800a(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) uVar.itemView.getParent();
                    if (viewGroup2 != null) {
                        viewGroup2.removeView(uVar.itemView);
                    }
                }
            }
        } catch (Exception e) {
            C63423ai.m115002a(e);
            C51423a.m95786a(e);
        }
        C80493gg.f180088a = uVar.getClass().getName();
        return uVar;
    }
}
