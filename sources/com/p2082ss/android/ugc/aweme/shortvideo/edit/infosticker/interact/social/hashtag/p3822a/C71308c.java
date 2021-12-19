package com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.hashtag.p3822a;

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
import com.p2082ss.android.ugc.aweme.p2722cy.p2723a.AbstractC40895j;
import com.p2082ss.android.ugc.aweme.profile.C63423ai;
import com.p2082ss.android.ugc.aweme.utils.C80493gg;
import com.p2082ss.android.ugc.aweme.video.hashtag.C80735b;
import com.p2082ss.android.ugc.trill.R;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.hashtag.a.c */
public final class C71308c extends RecyclerView.AbstractC1350a<C71305b> implements AbstractC40895j {

    /* renamed from: a */
    public final List<C80735b> f159812a;

    /* renamed from: b */
    private final AbstractC40895j f159813b;

    static {
        Covode.recordClassIndex(83829);
    }

    /* Return type fixed from 'androidx.recyclerview.widget.RecyclerView$ViewHolder' to match base method */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final /* synthetic */ C71305b onCreateViewHolder(ViewGroup viewGroup, int i) {
        return m125998a(this, viewGroup, i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final int getItemCount() {
        return this.f159812a.size();
    }

    public C71308c(List<C80735b> list, AbstractC40895j jVar) {
        C89219l.m154721d(list, "");
        C89219l.m154721d(jVar, "");
        this.f159812a = list;
        this.f159813b = jVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.p2722cy.p2723a.AbstractC40895j
    /* renamed from: a */
    public final void mo70092a(View view, int i) {
        C89219l.m154721d(view, "");
        AbstractC40895j jVar = this.f159813b;
        if (jVar != null) {
            jVar.mo70092a(view, i);
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$ViewHolder, int] */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final /* synthetic */ void onBindViewHolder(C71305b bVar, int i) {
        C71305b bVar2 = bVar;
        C89219l.m154721d(bVar2, "");
        C80735b bVar3 = this.f159812a.get(i);
        C89219l.m154721d(bVar3, "");
        TuxTextView tuxTextView = bVar2.f159808a;
        if (tuxTextView != null) {
            tuxTextView.setText("# " + bVar3.f180510a.challengeName);
        }
    }

    /* renamed from: a */
    private static RecyclerView.ViewHolder m125998a(C71308c cVar, ViewGroup viewGroup, int i) {
        boolean a;
        MethodCollector.m26663i(13912);
        C89219l.m154721d(viewGroup, "");
        C89219l.m154721d(viewGroup, "");
        View a2 = C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), R.layout.dh, viewGroup, false);
        C89219l.m154716b(a2, "");
        C71305b bVar = new C71305b(a2, cVar);
        try {
            if (bVar.itemView.getParent() != null) {
                try {
                    a = SettingsManager.m29616a().mo25400a("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (a) {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("onCreateViewHolder getParent() != null crash hook, holder ").append(bVar.getClass().getName()).append(" parent ").append(viewGroup.getClass().getName()).append(" viewType ").append(i);
                    C22708a.m42800a(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) bVar.itemView.getParent();
                    if (viewGroup2 != null) {
                        viewGroup2.removeView(bVar.itemView);
                    }
                }
            }
        } catch (Exception e) {
            C63423ai.m115002a(e);
            C51423a.m95786a(e);
        }
        C80493gg.f180088a = bVar.getClass().getName();
        MethodCollector.m26664o(13912);
        return bVar;
    }
}
