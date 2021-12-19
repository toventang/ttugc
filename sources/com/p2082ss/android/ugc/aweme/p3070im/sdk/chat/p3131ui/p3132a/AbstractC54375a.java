package com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.p3132a;

import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.common.utility.collection.C13603b;
import com.bytedance.covode.number.Covode;
import com.bytedance.p1399im.core.p1408d.C19538ai;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3080b.HandlerC53707g;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3080b.p3081a.AbstractC53632a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.viewholder.AbstractC54482a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.viewholder.C54542d;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.ui.a.a */
public abstract class AbstractC54375a extends RecyclerView.AbstractC1350a<AbstractC54482a> implements HandlerC53707g.AbstractC53708a {

    /* renamed from: a */
    protected RecyclerView f124542a;

    /* renamed from: b */
    public List<C19538ai> f124543b;

    /* renamed from: c */
    protected Set<AbstractC53632a> f124544c = new HashSet();

    /* renamed from: d */
    private List<AbstractC54482a> f124545d = new ArrayList();

    static {
        Covode.recordClassIndex(64078);
    }

    AbstractC54375a() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final void mo91457d() {
        for (AbstractC54482a aVar : this.f124545d) {
            aVar.mo91577f();
        }
        this.f124545d.clear();
    }

    /* renamed from: a */
    public void mo91454a(AbstractC53632a aVar) {
        this.f124544c.add(aVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
        this.f124542a = recyclerView;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        super.onDetachedFromRecyclerView(recyclerView);
        this.f124542a = null;
    }

    /* renamed from: b */
    public void onViewDetachedFromWindow(AbstractC54482a aVar) {
        super.onViewDetachedFromWindow(aVar);
        this.f124545d.remove(aVar);
        aVar.mo91577f();
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3080b.HandlerC53707g.AbstractC53708a
    /* renamed from: a */
    public void mo90256a(int i) {
        for (AbstractC53632a aVar : this.f124544c) {
            aVar.mo90195a(this.f124543b);
        }
        C54542d.m100005f();
    }

    /* renamed from: a */
    public void onViewAttachedToWindow(AbstractC54482a aVar) {
        super.onViewAttachedToWindow(aVar);
        aVar.mo91576e();
        this.f124545d.add(aVar);
        C19538ai aiVar = aVar.f124823s;
        if (!(aiVar == null || C13603b.m24435a((Collection) this.f124543b) || !aiVar.equals(this.f124543b.get(0)))) {
            for (AbstractC53632a aVar2 : this.f124544c) {
                aVar2.mo90199e();
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3080b.HandlerC53707g.AbstractC53708a
    /* renamed from: a */
    public void mo90257a(Object obj, int i) {
        for (AbstractC53632a aVar : this.f124544c) {
            aVar.mo90195a(this.f124543b);
        }
    }
}
