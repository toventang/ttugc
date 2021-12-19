package com.p2082ss.android.ugc.aweme.discover.p2768d.p2769a;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39056b;
import com.p2082ss.android.ugc.aweme.discover.adapter.viewholder.C41773f;
import com.p2082ss.android.ugc.aweme.discover.p2797ui.AbstractC42664al;
import com.p2082ss.android.ugc.trill.R;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.discover.d.a.d */
public final class C41916d extends AbstractC39056b<List<? extends Object>> {

    /* renamed from: a */
    public AbstractC42664al.AbstractC42666b f97782a;

    static {
        Covode.recordClassIndex(49842);
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.d.a.d$a */
    public static final class C41917a {

        /* renamed from: a */
        public static final C41917a f97783a = new C41917a();

        private C41917a() {
        }

        static {
            Covode.recordClassIndex(49843);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39056b
    /* renamed from: a */
    public final RecyclerView.ViewHolder mo63163a(ViewGroup viewGroup) {
        C89219l.m154721d(viewGroup, "");
        AbstractC42664al.AbstractC42666b bVar = this.f97782a;
        C89219l.m154721d(viewGroup, "");
        View a = C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), R.layout.auy, viewGroup, false);
        C89219l.m154716b(a, "");
        return new C41773f(a, bVar);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, int] */
    @Override // com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39056b
    /* renamed from: a */
    public final /* synthetic */ boolean mo63165a(List<? extends Object> list, int i) {
        List<? extends Object> list2 = list;
        C89219l.m154721d(list2, "");
        return list2.get(i) instanceof C41917a;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, int, androidx.recyclerview.widget.RecyclerView$ViewHolder, java.util.List] */
    @Override // com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39056b
    /* renamed from: a */
    public final /* synthetic */ void mo63164a(List<? extends Object> list, int i, RecyclerView.ViewHolder viewHolder, List list2) {
        C89219l.m154721d(list, "");
        C89219l.m154721d(viewHolder, "");
        C89219l.m154721d(list2, "");
    }
}
