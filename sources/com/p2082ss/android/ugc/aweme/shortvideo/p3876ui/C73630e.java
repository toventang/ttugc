package com.p2082ss.android.ugc.aweme.shortvideo.p3876ui;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.services.apm.api.C22708a;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.profile.C63423ai;
import com.p2082ss.android.ugc.aweme.shortvideo.p3787a.C69747b;
import com.p2082ss.android.ugc.aweme.shortvideo.publish.C72683v;
import com.p2082ss.android.ugc.aweme.utils.C80493gg;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.e */
public final class C73630e extends RecyclerView.AbstractC1350a<RecyclerView.ViewHolder> {

    /* renamed from: a */
    public List<? extends C72683v> f165453a;

    /* renamed from: b */
    public final boolean f165454b = false;

    /* renamed from: c */
    private final C69747b<List<C72683v>> f165455c;

    static {
        Covode.recordClassIndex(86368);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return m129764a(this, viewGroup, i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final int getItemCount() {
        return this.f165453a.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final void onAttachedToRecyclerView(RecyclerView recyclerView) {
        C89219l.m154721d(recyclerView, "");
        super.onAttachedToRecyclerView(recyclerView);
        this.f165455c.mo110111a();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        C89219l.m154721d(recyclerView, "");
        super.onDetachedFromRecyclerView(recyclerView);
        this.f165455c.mo110113b();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.aweme.shortvideo.a.b<java.util.List<com.ss.android.ugc.aweme.shortvideo.publish.v>> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final int getItemViewType(int i) {
        if (i < this.f165453a.size()) {
            return this.f165455c.mo110108a((List<C72683v>) this.f165453a, i);
        }
        return super.getItemViewType(i);
    }

    public C73630e(List<? extends C72683v> list) {
        C89219l.m154721d(list, "");
        this.f165453a = list;
        C69747b<List<C72683v>> bVar = new C69747b<>();
        this.f165455c = bVar;
        bVar.mo110110a(new C73506bh(false)).mo110110a(new C73511bj(false));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.aweme.shortvideo.a.b<java.util.List<com.ss.android.ugc.aweme.shortvideo.publish.v>> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        C89219l.m154721d(viewHolder, "");
        this.f165455c.mo110112a(this.f165453a, i, viewHolder);
    }

    /* renamed from: a */
    private static RecyclerView.ViewHolder m129764a(C73630e eVar, ViewGroup viewGroup, int i) {
        boolean a;
        MethodCollector.m26663i(10407);
        C89219l.m154721d(viewGroup, "");
        RecyclerView.ViewHolder a2 = eVar.f165455c.mo110109a(viewGroup, i);
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
        MethodCollector.m26664o(10407);
        return a2;
    }
}
