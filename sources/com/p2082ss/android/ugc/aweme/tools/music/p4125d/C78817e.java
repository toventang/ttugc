package com.p2082ss.android.ugc.aweme.tools.music.p4125d;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.services.apm.api.C22708a;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.p2722cy.p2723a.AbstractC40895j;
import com.p2082ss.android.ugc.aweme.profile.C63423ai;
import com.p2082ss.android.ugc.aweme.shortvideo.C69905c;
import com.p2082ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.p2082ss.android.ugc.aweme.tools.music.p4128e.C78821b;
import com.p2082ss.android.ugc.aweme.utils.C80493gg;
import com.p2082ss.android.ugc.tools.utils.C84904k;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.tools.music.d.e */
public final class C78817e extends C78759b {

    /* renamed from: o */
    private List<MusicModel> f177136o;

    static {
        Covode.recordClassIndex(91960);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a, com.p2082ss.android.ugc.aweme.tools.music.p4125d.C78759b
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return m137578a(this, viewGroup, i);
    }

    @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63154aa.AbstractC63163h
    /* renamed from: a */
    public final void mo101600a(C69905c cVar) {
        if (C84904k.m145909a(this.f177136o)) {
            this.f177136o = new ArrayList();
        }
        if (cVar != null) {
            List<MusicModel> list = this.f177136o;
            if (list == null) {
                C89219l.m154715b();
            }
            list.add(0, C78821b.C78822a.m137588a(cVar));
            notifyDataSetChanged();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63154aa.AbstractC63163h
    /* renamed from: a */
    public final void mo101601a(List<C69905c> list) {
        if (!C84904k.m145909a(list) && C84904k.m145909a(this.f177136o)) {
            if (list == null) {
                C89219l.m154715b();
            }
            for (C69905c cVar : list) {
                List<MusicModel> list2 = this.f177136o;
                if (list2 == null) {
                    C89219l.m154715b();
                }
                list2.add(C78821b.C78822a.m137588a(cVar));
            }
            notifyDataSetChanged();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C78817e(List<MusicModel> list, AbstractC40895j jVar) {
        super(list, jVar);
        C89219l.m154721d(jVar, "");
        this.f177136o = list;
    }

    /* renamed from: a */
    private static RecyclerView.ViewHolder m137578a(C78817e eVar, ViewGroup viewGroup, int i) {
        RecyclerView.ViewHolder viewHolder;
        boolean a;
        MethodCollector.m26663i(3788);
        C89219l.m154721d(viewGroup, "");
        if (eVar.getItemViewType(i) == 0) {
            View a2 = C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), R.layout.dn, viewGroup, false);
            C89219l.m154716b(a2, "");
            viewHolder = new C78814d(a2, eVar);
        } else {
            View a3 = C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), R.layout.dl, viewGroup, false);
            C89219l.m154716b(a3, "");
            viewHolder = new C78818f(a3, eVar);
        }
        try {
            if (viewHolder.itemView.getParent() != null) {
                try {
                    a = SettingsManager.m29616a().mo25400a("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (a) {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("onCreateViewHolder getParent() != null crash hook, holder ").append(viewHolder.getClass().getName()).append(" parent ").append(viewGroup.getClass().getName()).append(" viewType ").append(i);
                    C22708a.m42800a(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) viewHolder.itemView.getParent();
                    if (viewGroup2 != null) {
                        viewGroup2.removeView(viewHolder.itemView);
                    }
                }
            }
        } catch (Exception e) {
            C63423ai.m115002a(e);
            C51423a.m95786a(e);
        }
        C80493gg.f180088a = viewHolder.getClass().getName();
        MethodCollector.m26664o(3788);
        return viewHolder;
    }
}
