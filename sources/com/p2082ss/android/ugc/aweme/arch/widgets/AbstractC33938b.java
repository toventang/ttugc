package com.p2082ss.android.ugc.aweme.arch.widgets;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.arch.widgets.base.C33947e;
import com.p2082ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39060f;
import java.util.ArrayList;

/* renamed from: com.ss.android.ugc.aweme.arch.widgets.b */
public abstract class AbstractC33938b extends AbstractC39060f {

    /* renamed from: a */
    protected C33947e f80255a;

    /* renamed from: b */
    protected DataCenter f80256b;

    /* renamed from: c */
    protected RecyclerView f80257c;

    /* renamed from: d */
    private ArrayList<ListItemWidget> f80258d = new ArrayList<>();

    static {
        Covode.recordClassIndex(40860);
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39073l
    /* renamed from: a */
    public RecyclerView.ViewHolder mo60184a(ViewGroup viewGroup, int i) {
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract ListItemWidget mo60187b(int i);

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a, com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39063h
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
        this.f80257c = recyclerView;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a, com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39063h
    public void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        super.onDetachedFromRecyclerView(recyclerView);
        this.f80257c = null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final ListItemWidget mo60185a(int i) {
        if (i < this.f80258d.size()) {
            return this.f80258d.get(i);
        }
        ListItemWidget b = mo60187b(i);
        this.f80255a.mo60219a(b);
        this.f80258d.add(b);
        return b;
    }

    public AbstractC33938b(C33947e eVar, DataCenter dataCenter) {
        this.f80255a = eVar;
        this.f80256b = dataCenter;
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39073l
    /* renamed from: a */
    public final void mo60186a(RecyclerView.ViewHolder viewHolder, int i) {
        if (viewHolder instanceof C33937a) {
            C33937a aVar = (C33937a) viewHolder;
            ListItemWidget listItemWidget = aVar.f80254a;
            if (!(listItemWidget == null || listItemWidget.f80253a == null || listItemWidget.f80253a.getLayoutPosition() != i)) {
                listItemWidget.f80253a = null;
            }
            aVar.f80254a = mo60185a(i);
            aVar.f80254a.mo60183a(aVar);
        }
    }
}
