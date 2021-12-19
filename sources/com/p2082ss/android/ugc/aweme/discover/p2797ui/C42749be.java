package com.p2082ss.android.ugc.aweme.discover.p2797ui;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.services.apm.api.C22708a;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.profile.C63423ai;
import com.p2082ss.android.ugc.aweme.utils.C80493gg;
import java.util.Collections;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.discover.ui.be */
public class C42749be<T> extends RecyclerView.AbstractC1350a<RecyclerView.ViewHolder> {

    /* renamed from: a */
    protected List<T> f99717a = Collections.emptyList();

    /* renamed from: b */
    public AbstractC42750a<T> f99718b;

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.be$a */
    public interface AbstractC42750a<T> {
        static {
            Covode.recordClassIndex(50854);
        }

        /* renamed from: a */
        RecyclerView.ViewHolder mo73013a(ViewGroup viewGroup);

        /* renamed from: a */
        void mo73014a(RecyclerView.ViewHolder viewHolder, T t);
    }

    static {
        Covode.recordClassIndex(50853);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return m85402a(this, viewGroup, i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public int getItemCount() {
        return this.f99717a.size();
    }

    /* renamed from: a */
    public final void mo73021a(List<T> list) {
        this.f99717a = list;
        notifyDataSetChanged();
    }

    public C42749be(AbstractC42750a<T> aVar) {
        this.f99718b = aVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        this.f99718b.mo73014a(viewHolder, this.f99717a.get(i));
    }

    /* renamed from: a */
    private static RecyclerView.ViewHolder m85402a(C42749be beVar, ViewGroup viewGroup, int i) {
        boolean a;
        MethodCollector.m26663i(6345);
        AbstractC42750a<T> aVar = beVar.f99718b;
        beVar.f99717a.get(i);
        RecyclerView.ViewHolder a2 = aVar.mo73013a(viewGroup);
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
        MethodCollector.m26664o(6345);
        return a2;
    }
}
