package com.p2082ss.android.ugc.aweme.tools.draft.viewholder;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.C1445j;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.services.apm.api.C22708a;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.profile.C63423ai;
import com.p2082ss.android.ugc.aweme.tools.draft.C78176aw;
import com.p2082ss.android.ugc.aweme.tools.draft.p4103d.C78230a;
import com.p2082ss.android.ugc.aweme.tools.draft.p4105f.AbstractC78249a;
import com.p2082ss.android.ugc.aweme.tools.draft.viewmodel.C78467a;
import com.p2082ss.android.ugc.aweme.utils.C80493gg;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.tools.draft.viewholder.c */
public final class C78444c extends RecyclerView.AbstractC1350a<AbstractC78442a<? extends C78230a>> {

    /* renamed from: a */
    public List<C78230a> f176267a = new ArrayList();

    /* renamed from: b */
    public boolean f176268b;

    /* renamed from: c */
    public boolean f176269c;

    /* renamed from: d */
    public final AbstractC78249a f176270d;

    /* renamed from: e */
    public final C78467a f176271e;

    /* renamed from: f */
    private final String f176272f = C78444c.class.getSimpleName();

    static {
        Covode.recordClassIndex(91572);
    }

    /* Return type fixed from 'androidx.recyclerview.widget.RecyclerView$ViewHolder' to match base method */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final /* synthetic */ AbstractC78442a<? extends C78230a> onCreateViewHolder(ViewGroup viewGroup, int i) {
        return m136970a(this, viewGroup, i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final int getItemCount() {
        return this.f176267a.size();
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.draft.viewholder.c$a */
    public static final class C78445a extends GridLayoutManager.AbstractC1337c {

        /* renamed from: e */
        final /* synthetic */ C78444c f176273e;

        static {
            Covode.recordClassIndex(91573);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C78445a(C78444c cVar) {
            this.f176273e = cVar;
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.AbstractC1337c
        /* renamed from: a */
        public final int mo4342a(int i) {
            int itemViewType = this.f176273e.getItemViewType(i);
            if (itemViewType == 105 || itemViewType == 107 || itemViewType == 108) {
                return 3;
            }
            return 1;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final int getItemViewType(int i) {
        return this.f176267a.get(i).mo122123a();
    }

    /* renamed from: a */
    public final void mo122371a(List<C78230a> list) {
        C89219l.m154721d(list, "");
        C1445j.C1450d a = C1445j.m4922a(new C78443b(this.f176267a, list), true);
        C89219l.m154716b(a, "");
        a.mo4951a(this);
        this.f176267a = new ArrayList(list);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final void onAttachedToRecyclerView(RecyclerView recyclerView) {
        C89219l.m154721d(recyclerView, "");
        super.onAttachedToRecyclerView(recyclerView);
        RecyclerView.AbstractC1362i layoutManager = recyclerView.getLayoutManager();
        if (layoutManager instanceof GridLayoutManager) {
            ((GridLayoutManager) layoutManager).mo4320a(new C78445a(this));
        }
    }

    public C78444c(AbstractC78249a aVar, C78467a aVar2) {
        C89219l.m154721d(aVar, "");
        C89219l.m154721d(aVar2, "");
        this.f176270d = aVar;
        this.f176271e = aVar2;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$ViewHolder, int] */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final /* synthetic */ void onBindViewHolder(AbstractC78442a<? extends C78230a> aVar, int i) {
        AbstractC78442a<? extends C78230a> aVar2 = aVar;
        C89219l.m154721d(aVar2, "");
        if (i == C78176aw.f175577b) {
            C78176aw.m136661a(i, this.f176267a);
        }
        this.f176267a.get(i).f175702a = this.f176268b;
        this.f176267a.get(i).f175703b = this.f176269c;
        aVar2.mo122361a(this.f176267a.get(i));
    }

    /* renamed from: a */
    private static RecyclerView.ViewHolder m136970a(C78444c cVar, ViewGroup viewGroup, int i) {
        RecyclerView.ViewHolder viewHolder;
        boolean a;
        MethodCollector.m26663i(7405);
        C89219l.m154721d(viewGroup, "");
        AbstractC78249a aVar = cVar.f176270d;
        C78467a aVar2 = cVar.f176271e;
        C89219l.m154721d(viewGroup, "");
        C89219l.m154721d(aVar, "");
        C89219l.m154721d(aVar2, "");
        switch (i) {
            case 101:
                View a2 = C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), R.layout.a9s, viewGroup, false);
                C89219l.m154716b(a2, "");
                viewHolder = new DraftViewHolder(a2, aVar, aVar2);
                break;
            case 102:
                View a3 = C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), R.layout.a_0, viewGroup, false);
                C89219l.m154716b(a3, "");
                viewHolder = new C78454j(a3);
                break;
            case 103:
                View a4 = C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), R.layout.a9x, viewGroup, false);
                C89219l.m154716b(a4, "");
                viewHolder = new C78450g(a4, aVar);
                break;
            case 104:
                View a5 = C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), R.layout.a9u, viewGroup, false);
                C89219l.m154716b(a5, "");
                viewHolder = new C78446d(a5);
                break;
            case 105:
                View a6 = C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), R.layout.a9v, viewGroup, false);
                C89219l.m154716b(a6, "");
                viewHolder = new C78447e(a6);
                break;
            case 106:
                View a7 = C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), R.layout.a9z, viewGroup, false);
                C89219l.m154716b(a7, "");
                viewHolder = new NewDraftViewHolder(a7, aVar, aVar2);
                break;
            case 107:
                View a8 = C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), R.layout.a9t, viewGroup, false);
                C89219l.m154716b(a8, "");
                viewHolder = new C78452h(a8);
                break;
            case 108:
                View a9 = C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), R.layout.a9y, viewGroup, false);
                C89219l.m154716b(a9, "");
                viewHolder = new C78448f(a9, aVar);
                break;
            default:
                RuntimeException runtimeException = new RuntimeException("wrong draft type");
                MethodCollector.m26664o(7405);
                throw runtimeException;
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
        MethodCollector.m26664o(7405);
        return viewHolder;
    }
}
