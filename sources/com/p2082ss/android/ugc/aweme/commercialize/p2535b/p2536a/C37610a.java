package com.p2082ss.android.ugc.aweme.commercialize.p2535b.p2536a;

import android.view.ViewGroup;
import androidx.lifecycle.AbstractC1204m;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.services.apm.api.C22708a;
import com.p2082ss.android.ugc.aweme.common.p2629a.C39057c;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.profile.C63423ai;
import com.p2082ss.android.ugc.aweme.shortvideo.model.AnchorPublishStruct;
import com.p2082ss.android.ugc.aweme.utils.C80493gg;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.commercialize.b.a.a */
public final class C37610a extends RecyclerView.AbstractC1350a<RecyclerView.ViewHolder> {

    /* renamed from: a */
    public List<AnchorPublishStruct> f88910a;

    /* renamed from: b */
    public final AbstractC1204m f88911b;

    /* renamed from: c */
    private final C39057c<List<AnchorPublishStruct>> f88912c;

    static {
        Covode.recordClassIndex(45032);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return m75867a(this, viewGroup, i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final int getItemCount() {
        return this.f88910a.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final void onAttachedToRecyclerView(RecyclerView recyclerView) {
        C89219l.m154721d(recyclerView, "");
        super.onAttachedToRecyclerView(recyclerView);
        this.f88912c.mo67795a();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        C89219l.m154721d(recyclerView, "");
        super.onDetachedFromRecyclerView(recyclerView);
        this.f88912c.mo67799b();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final int getItemViewType(int i) {
        if (i < this.f88910a.size()) {
            return this.f88912c.mo67792a(this.f88910a, i);
        }
        return super.getItemViewType(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        C89219l.m154721d(viewHolder, "");
        this.f88912c.mo67797a(this.f88910a, i, viewHolder);
    }

    public C37610a(List<AnchorPublishStruct> list, AbstractC1204m mVar) {
        C89219l.m154721d(list, "");
        C89219l.m154721d(mVar, "");
        this.f88910a = list;
        this.f88911b = mVar;
        C39057c<List<AnchorPublishStruct>> cVar = new C39057c<>();
        this.f88912c = cVar;
        cVar.mo67794a(new C37615e(mVar));
    }

    /* renamed from: a */
    private static RecyclerView.ViewHolder m75867a(C37610a aVar, ViewGroup viewGroup, int i) {
        boolean a;
        MethodCollector.m26663i(11407);
        C89219l.m154721d(viewGroup, "");
        RecyclerView.ViewHolder a2 = aVar.f88912c.mo67793a(viewGroup, i);
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
        MethodCollector.m26664o(11407);
        return a2;
    }
}
