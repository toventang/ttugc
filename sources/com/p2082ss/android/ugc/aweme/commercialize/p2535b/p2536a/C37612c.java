package com.p2082ss.android.ugc.aweme.commercialize.p2535b.p2536a;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.services.apm.api.C22708a;
import com.p2082ss.android.ugc.aweme.common.p2629a.C39057c;
import com.p2082ss.android.ugc.aweme.feed.model.WikipediaInfo;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.profile.C63423ai;
import com.p2082ss.android.ugc.aweme.utils.C80493gg;
import java.util.List;
import java.util.Map;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.commercialize.b.a.c */
public final class C37612c extends RecyclerView.AbstractC1350a<RecyclerView.ViewHolder> {

    /* renamed from: a */
    public final List<WikipediaInfo> f88915a;

    /* renamed from: b */
    private final C39057c<List<WikipediaInfo>> f88916b;

    static {
        Covode.recordClassIndex(45034);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return m75871a(this, viewGroup, i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final int getItemCount() {
        return this.f88915a.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final void onAttachedToRecyclerView(RecyclerView recyclerView) {
        C89219l.m154721d(recyclerView, "");
        super.onAttachedToRecyclerView(recyclerView);
        this.f88916b.mo67795a();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        C89219l.m154721d(recyclerView, "");
        super.onDetachedFromRecyclerView(recyclerView);
        this.f88916b.mo67799b();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final int getItemViewType(int i) {
        if (i < this.f88915a.size()) {
            return this.f88916b.mo67792a(this.f88915a, i);
        }
        return super.getItemViewType(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        C89219l.m154721d(viewHolder, "");
        this.f88916b.mo67797a(this.f88915a, i, viewHolder);
    }

    public C37612c(List<WikipediaInfo> list, Map<String, String> map, AbstractC89172b<? super WikipediaInfo, C89391z> bVar) {
        C89219l.m154721d(list, "");
        C89219l.m154721d(map, "");
        C89219l.m154721d(bVar, "");
        this.f88915a = list;
        C39057c<List<WikipediaInfo>> cVar = new C39057c<>();
        this.f88916b = cVar;
        cVar.mo67794a(new C37611b(map, bVar));
    }

    /* renamed from: a */
    private static RecyclerView.ViewHolder m75871a(C37612c cVar, ViewGroup viewGroup, int i) {
        boolean a;
        MethodCollector.m26663i(11251);
        C89219l.m154721d(viewGroup, "");
        RecyclerView.ViewHolder a2 = cVar.f88916b.mo67793a(viewGroup, i);
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
        MethodCollector.m26664o(11251);
        return a2;
    }
}
