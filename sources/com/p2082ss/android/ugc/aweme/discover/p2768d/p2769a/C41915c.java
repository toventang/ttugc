package com.p2082ss.android.ugc.aweme.discover.p2768d.p2769a;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.common.utility.collection.C13603b;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39056b;
import com.p2082ss.android.ugc.aweme.discover.adapter.viewholder.C41770e;
import com.p2082ss.android.ugc.aweme.discover.model.SearchHistory;
import com.p2082ss.android.ugc.aweme.discover.p2797ui.AbstractC42664al;
import com.p2082ss.android.ugc.aweme.search.C67446h;
import com.p2082ss.android.ugc.trill.R;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.discover.d.a.c */
public final class C41915c extends AbstractC39056b<List<? extends Object>> {

    /* renamed from: a */
    public AbstractC42664al.AbstractC42666b f97781a;

    static {
        Covode.recordClassIndex(49841);
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39056b
    /* renamed from: a */
    public final RecyclerView.ViewHolder mo63163a(ViewGroup viewGroup) {
        C89219l.m154721d(viewGroup, "");
        AbstractC42664al.AbstractC42666b bVar = this.f97781a;
        C89219l.m154721d(viewGroup, "");
        View a = C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), R.layout.avq, viewGroup, false);
        C89219l.m154716b(a, "");
        return new C41770e(a, bVar);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, int] */
    @Override // com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39056b
    /* renamed from: a */
    public final /* synthetic */ boolean mo63165a(List<? extends Object> list, int i) {
        List<? extends Object> list2 = list;
        C89219l.m154721d(list2, "");
        Object obj = list2.get(i);
        if (!(obj instanceof List)) {
            obj = null;
        }
        List list3 = (List) obj;
        if (list3 != null && !C13603b.m24435a((Collection) list3) && (list3.get(0) instanceof SearchHistory)) {
            return true;
        }
        return false;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, int, androidx.recyclerview.widget.RecyclerView$ViewHolder, java.util.List] */
    @Override // com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39056b
    /* renamed from: a */
    public final /* synthetic */ void mo63164a(List<? extends Object> list, int i, RecyclerView.ViewHolder viewHolder, List list2) {
        List<? extends Object> list3 = list;
        C89219l.m154721d(list3, "");
        C89219l.m154721d(viewHolder, "");
        C89219l.m154721d(list2, "");
        Object obj = list3.get(i);
        C41770e eVar = (C41770e) viewHolder;
        Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.collections.List<com.ss.android.ugc.aweme.discover.model.SearchHistory>");
        List list4 = (List) obj;
        C89219l.m154721d(list4, "");
        eVar.f97442b.clear();
        eVar.f97442b.addAll(list4);
        eVar.f97443c.setVisibility(8);
        eVar.f97441a.notifyDataSetChanged();
        C67446h.f151111a.mo106215d().mo73134a("search_transfer_history_words_show");
    }
}
