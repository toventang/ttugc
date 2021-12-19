package com.p2082ss.android.ugc.aweme.commercialize.p2535b.p2536a;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.commercialize.p2535b.p2536a.C37613d;
import com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39056b;
import com.p2082ss.android.ugc.aweme.feed.model.WikipediaInfo;
import com.p2082ss.android.ugc.trill.R;
import java.util.List;
import java.util.Map;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.commercialize.b.a.b */
public final class C37611b extends AbstractC39056b<List<? extends WikipediaInfo>> {

    /* renamed from: a */
    public final AbstractC89172b<WikipediaInfo, C89391z> f88913a;

    /* renamed from: b */
    private final Map<String, String> f88914b;

    static {
        Covode.recordClassIndex(45033);
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39056b
    /* renamed from: a */
    public final RecyclerView.ViewHolder mo63163a(ViewGroup viewGroup) {
        C89219l.m154721d(viewGroup, "");
        View a = C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), R.layout.adx, viewGroup, false);
        C89219l.m154716b(a, "");
        return new C37613d(a);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, int] */
    @Override // com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39056b
    /* renamed from: a */
    public final /* synthetic */ boolean mo63165a(List<? extends WikipediaInfo> list, int i) {
        C89219l.m154721d(list, "");
        return true;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: h.f.a.b<? super com.ss.android.ugc.aweme.feed.model.WikipediaInfo, h.z> */
    /* JADX WARN: Multi-variable type inference failed */
    public C37611b(Map<String, String> map, AbstractC89172b<? super WikipediaInfo, C89391z> bVar) {
        C89219l.m154721d(map, "");
        C89219l.m154721d(bVar, "");
        this.f88914b = map;
        this.f88913a = bVar;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, int, androidx.recyclerview.widget.RecyclerView$ViewHolder, java.util.List] */
    @Override // com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39056b
    /* renamed from: a */
    public final /* synthetic */ void mo63164a(List<? extends WikipediaInfo> list, int i, RecyclerView.ViewHolder viewHolder, List list2) {
        List<? extends WikipediaInfo> list3 = list;
        C89219l.m154721d(list3, "");
        C89219l.m154721d(viewHolder, "");
        C89219l.m154721d(list2, "");
        if (viewHolder instanceof C37613d) {
            C37613d dVar = (C37613d) viewHolder;
            WikipediaInfo wikipediaInfo = (WikipediaInfo) list3.get(i);
            Map<String, String> map = this.f88914b;
            AbstractC89172b<WikipediaInfo, C89391z> bVar = this.f88913a;
            C89219l.m154721d(wikipediaInfo, "");
            C89219l.m154721d(map, "");
            C89219l.m154721d(bVar, "");
            dVar.itemView.setOnClickListener(new C37613d.View$OnClickListenerC37614a(dVar, bVar, wikipediaInfo, map));
            dVar.f88917a.setText(wikipediaInfo.getKeyword());
        }
    }
}
