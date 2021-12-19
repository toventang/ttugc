package com.p2082ss.android.ugc.aweme.discover.p2768d.p2769a;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39056b;
import com.p2082ss.android.ugc.aweme.discover.model.TrendingData;
import com.p2082ss.android.ugc.aweme.discover.p2797ui.AbstractC42664al;
import com.p2082ss.android.ugc.aweme.search.C67590l;
import com.p2082ss.android.ugc.aweme.search.middlepage.C67659a;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.discover.d.a.f */
public final class C41919f extends AbstractC39056b<List<? extends Object>> {

    /* renamed from: a */
    public AbstractC42664al.AbstractC42669e f97787a;

    static {
        Covode.recordClassIndex(49845);
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39056b
    /* renamed from: a */
    public final RecyclerView.ViewHolder mo63163a(ViewGroup viewGroup) {
        C89219l.m154721d(viewGroup, "");
        AbstractC42664al.AbstractC42669e eVar = this.f97787a;
        C89219l.m154721d(viewGroup, "");
        View a = C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), R.layout.aw5, viewGroup, false);
        C89219l.m154716b(a, "");
        return new C67659a(a, eVar);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, int] */
    @Override // com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39056b
    /* renamed from: a */
    public final /* synthetic */ boolean mo63165a(List<? extends Object> list, int i) {
        ArrayList<C67590l> arrayList;
        List<? extends Object> list2 = list;
        C89219l.m154721d(list2, "");
        Object obj = list2.get(i);
        if ((obj instanceof TrendingData) && (arrayList = ((TrendingData) obj).billboardInfo) != null && !arrayList.isEmpty()) {
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
        Objects.requireNonNull(obj, "null cannot be cast to non-null type com.ss.android.ugc.aweme.discover.model.TrendingData");
        ((C67659a) viewHolder).mo106644a((TrendingData) obj);
    }
}
