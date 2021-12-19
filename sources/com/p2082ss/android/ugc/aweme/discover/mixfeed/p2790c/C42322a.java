package com.p2082ss.android.ugc.aweme.discover.mixfeed.p2790c;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.services.apm.api.C22708a;
import com.p2082ss.android.ugc.aweme.discover.adapter.C41618ai;
import com.p2082ss.android.ugc.aweme.discover.mixfeed.p2789b.C42314a;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.music.model.Music;
import com.p2082ss.android.ugc.aweme.p2817e.AbstractC43302a;
import com.p2082ss.android.ugc.aweme.profile.C63423ai;
import com.p2082ss.android.ugc.aweme.search.p3695k.C67568r;
import com.p2082ss.android.ugc.aweme.utils.C80493gg;
import java.util.ArrayList;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.discover.mixfeed.c.a */
public final class C42322a extends RecyclerView.AbstractC1350a<RecyclerView.ViewHolder> implements AbstractC43302a {

    /* renamed from: a */
    public List<Music> f98570a = new ArrayList();

    /* renamed from: b */
    private C67568r f98571b;

    /* renamed from: c */
    private C42314a f98572c;

    static {
        Covode.recordClassIndex(50265);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return m84687a(viewGroup, i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final int getItemCount() {
        return this.f98570a.size();
    }

    @Override // com.p2082ss.android.ugc.aweme.p2817e.AbstractC43302a
    /* renamed from: a */
    public final void mo70994a(C42314a aVar, C67568r rVar) {
        this.f98572c = aVar;
        this.f98571b = rVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        String str;
        String str2 = "";
        C89219l.m154721d(viewHolder, str2);
        Music music = this.f98570a.get(i);
        if (viewHolder instanceof C41618ai) {
            C41618ai aiVar = (C41618ai) viewHolder;
            aiVar.f97063i = this.f98572c;
            C67568r rVar = this.f98571b;
            if (rVar == null) {
                rVar = C67568r.C67569a.m119673a();
            }
            aiVar.mo70880a(rVar);
            aiVar.mo70820b("general_search");
            music.setSoundsListType(3);
            C67568r rVar2 = this.f98571b;
            if (!(rVar2 == null || (str = rVar2.f151311f) == null)) {
                str2 = str;
            }
            aiVar.mo70818a(music, str2);
        }
    }

    /* renamed from: a */
    private static RecyclerView.ViewHolder m84687a(ViewGroup viewGroup, int i) {
        boolean a;
        MethodCollector.m26663i(7489);
        C89219l.m154721d(viewGroup, "");
        C41618ai a2 = C41618ai.C41623a.m83582a(viewGroup, null);
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
        MethodCollector.m26664o(7489);
        return a2;
    }
}
