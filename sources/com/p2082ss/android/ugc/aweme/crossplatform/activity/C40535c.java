package com.p2082ss.android.ugc.aweme.crossplatform.activity;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.services.apm.api.C22708a;
import com.bytedance.tux.input.TuxTextView;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.profile.C63423ai;
import com.p2082ss.android.ugc.aweme.utils.C80493gg;
import com.p2082ss.android.ugc.trill.R;
import java.util.LinkedList;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.crossplatform.activity.c */
public final class C40535c extends RecyclerView.AbstractC1350a<C40536d> {

    /* renamed from: a */
    public LinkedList<C40545l> f94853a;

    static {
        Covode.recordClassIndex(48356);
    }

    /* Return type fixed from 'androidx.recyclerview.widget.RecyclerView$ViewHolder' to match base method */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final /* synthetic */ C40536d onCreateViewHolder(ViewGroup viewGroup, int i) {
        return m81837a(viewGroup, i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final int getItemCount() {
        return this.f94853a.size();
    }

    /* renamed from: a */
    public final void mo69664a(LinkedList<C40545l> linkedList) {
        C89219l.m154721d(linkedList, "");
        this.f94853a = linkedList;
        notifyDataSetChanged();
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$ViewHolder, int] */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final /* synthetic */ void onBindViewHolder(C40536d dVar, int i) {
        C40536d dVar2 = dVar;
        C89219l.m154721d(dVar2, "");
        C40545l lVar = this.f94853a.get(i);
        C89219l.m154716b(lVar, "");
        C40545l lVar2 = lVar;
        C89219l.m154721d(lVar2, "");
        dVar2.f94855b = i;
        dVar2.f94854a = lVar2;
        View view = dVar2.itemView;
        C89219l.m154716b(view, "");
        TuxTextView tuxTextView = (TuxTextView) view.findViewById(R.id.f_2);
        C89219l.m154716b(tuxTextView, "");
        tuxTextView.setText(lVar2.f94872a);
        View view2 = dVar2.itemView;
        C89219l.m154716b(view2, "");
        TuxTextView tuxTextView2 = (TuxTextView) view2.findViewById(R.id.cj9);
        C89219l.m154716b(tuxTextView2, "");
        tuxTextView2.setText(lVar2.f94873b);
    }

    /* renamed from: a */
    private static RecyclerView.ViewHolder m81837a(ViewGroup viewGroup, int i) {
        boolean a;
        MethodCollector.m26663i(3968);
        C89219l.m154721d(viewGroup, "");
        View a2 = C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), R.layout.v4, null, false);
        C89219l.m154716b(a2, "");
        C40536d dVar = new C40536d(a2);
        try {
            if (dVar.itemView.getParent() != null) {
                try {
                    a = SettingsManager.m29616a().mo25400a("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (a) {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("onCreateViewHolder getParent() != null crash hook, holder ").append(dVar.getClass().getName()).append(" parent ").append(viewGroup.getClass().getName()).append(" viewType ").append(i);
                    C22708a.m42800a(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) dVar.itemView.getParent();
                    if (viewGroup2 != null) {
                        viewGroup2.removeView(dVar.itemView);
                    }
                }
            }
        } catch (Exception e) {
            C63423ai.m115002a(e);
            C51423a.m95786a(e);
        }
        C80493gg.f180088a = dVar.getClass().getName();
        MethodCollector.m26664o(3968);
        return dVar;
    }
}
