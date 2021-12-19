package com.bytedance.jedi.ext.adapter.p1467b;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.jedi.ext.adapter.p1467b.AbstractC20630e;
import com.bytedance.jedi.ext.adapter.p1467b.C20633f;
import com.bytedance.services.apm.api.C22708a;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.profile.C63423ai;
import com.p2082ss.android.ugc.aweme.utils.C80493gg;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.jedi.ext.adapter.b.d */
public abstract class AbstractC20629d<VH extends AbstractC20630e<?>, M extends C20633f<VH>> extends RecyclerView.AbstractC1350a<VH> implements AbstractC20628c<VH, M> {
    static {
        Covode.recordClassIndex(24161);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract Object mo33838a(int i, boolean z);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo33884a(AbstractC20638g<VH> gVar);

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public /* synthetic */ RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return m38854a(this, viewGroup, i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final int getItemViewType(int i) {
        return mo33883b().mo33895b(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        C89219l.m154719c(recyclerView, "");
        mo33883b().mo33894a(recyclerView);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        C89219l.m154719c(recyclerView, "");
        mo33883b().mo33896b(recyclerView);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public /* synthetic */ void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        C89219l.m154719c(viewHolder, "");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public /* synthetic */ void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i, List list) {
        AbstractC20630e eVar = (AbstractC20630e) viewHolder;
        C89219l.m154719c(eVar, "");
        C89219l.m154719c(list, "");
        mo33883b();
        C20633f.m38860a(eVar, mo33838a(i, true), i, list);
    }

    /* renamed from: a */
    private static RecyclerView.ViewHolder m38854a(AbstractC20629d dVar, ViewGroup viewGroup, int i) {
        boolean a;
        C89219l.m154719c(viewGroup, "");
        AbstractC20630e a2 = dVar.mo33883b().mo33890a(viewGroup, i);
        try {
            if (a2.itemView.getParent() != null) {
                try {
                    a = SettingsManager.m29616a().mo25400a("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (a) {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("onCreateViewHolder getParent() != null crash hook, holder ").append(a2.getClass().getName()).append(" parent ").append(viewGroup.getClass().getName()).append(" viewType ").append(i);
                    C22708a.m42800a(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) a2.itemView.getParent();
                    if (viewGroup2 != null) {
                        viewGroup2.removeView(a2.itemView);
                    }
                }
            }
        } catch (Exception e) {
            C63423ai.m115002a(e);
            C51423a.m95786a(e);
        }
        C80493gg.f180088a = a2.getClass().getName();
        return a2;
    }
}
