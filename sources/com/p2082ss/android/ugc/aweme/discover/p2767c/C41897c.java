package com.p2082ss.android.ugc.aweme.discover.p2767c;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.services.apm.api.C22708a;
import com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39056b;
import com.p2082ss.android.ugc.aweme.common.p2629a.C39057c;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.profile.C63423ai;
import com.p2082ss.android.ugc.aweme.utils.C80493gg;
import java.util.ArrayList;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.discover.c.c */
public class C41897c<T> extends RecyclerView.AbstractC1350a<RecyclerView.ViewHolder> {

    /* renamed from: a */
    private final C39057c<List<T>> f97748a = new C39057c<>();

    /* renamed from: j */
    public final List<T> f97749j = new ArrayList();

    static {
        Covode.recordClassIndex(49823);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return m83935a(this, viewGroup, i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public int getItemCount() {
        return this.f97749j.size();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.aweme.discover.c.c<T> */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public final C41897c<?> mo71056a(AbstractC39056b<List<T>> bVar) {
        C89219l.m154721d(bVar, "");
        this.f97748a.mo67794a(bVar);
        return this;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public int getItemViewType(int i) {
        return this.f97748a.mo67792a(this.f97749j, i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public boolean onFailedToRecycleView(RecyclerView.ViewHolder viewHolder) {
        C89219l.m154721d(viewHolder, "");
        return this.f97748a.mo67800b(viewHolder);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
        C89219l.m154721d(viewHolder, "");
        this.f97748a.mo67801c(viewHolder);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public void onViewDetachedFromWindow(RecyclerView.ViewHolder viewHolder) {
        C89219l.m154721d(viewHolder, "");
        this.f97748a.mo67802d(viewHolder);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public void onViewRecycled(RecyclerView.ViewHolder viewHolder) {
        C89219l.m154721d(viewHolder, "");
        this.f97748a.mo67796a(viewHolder);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        C89219l.m154721d(viewHolder, "");
        this.f97748a.mo67797a(this.f97749j, i, viewHolder);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i, List<Object> list) {
        C89219l.m154721d(viewHolder, "");
        C89219l.m154721d(list, "");
        this.f97748a.mo67798a(this.f97749j, i, viewHolder, list);
    }

    /* renamed from: a */
    private static RecyclerView.ViewHolder m83935a(C41897c cVar, ViewGroup viewGroup, int i) {
        boolean a;
        MethodCollector.m26663i(12518);
        C89219l.m154721d(viewGroup, "");
        RecyclerView.ViewHolder a2 = cVar.f97748a.mo67793a(viewGroup, i);
        C89219l.m154716b(a2, "");
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
        MethodCollector.m26664o(12518);
        return a2;
    }
}
