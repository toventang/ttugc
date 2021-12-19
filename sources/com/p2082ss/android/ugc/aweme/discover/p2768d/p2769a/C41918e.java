package com.p2082ss.android.ugc.aweme.discover.p2768d.p2769a;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39056b;
import com.p2082ss.android.ugc.aweme.discover.adapter.viewholder.C41782j;
import com.p2082ss.android.ugc.aweme.discover.model.SearchIntermediateViewModel;
import com.p2082ss.android.ugc.aweme.discover.model.suggest.TypeWords;
import com.p2082ss.android.ugc.aweme.discover.model.suggest.Word;
import com.p2082ss.android.ugc.aweme.discover.p2797ui.AbstractC42664al;
import com.p2082ss.android.ugc.trill.R;
import java.util.List;
import java.util.Objects;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.discover.d.a.e */
public final class C41918e extends AbstractC39056b<List<? extends Object>> {

    /* renamed from: a */
    public AbstractC42664al.AbstractC42668d f97784a;

    /* renamed from: b */
    public SearchIntermediateViewModel f97785b;

    /* renamed from: c */
    public Fragment f97786c;

    static {
        Covode.recordClassIndex(49844);
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39056b
    /* renamed from: a */
    public final RecyclerView.ViewHolder mo63163a(ViewGroup viewGroup) {
        C89219l.m154721d(viewGroup, "");
        AbstractC42664al.AbstractC42668d dVar = this.f97784a;
        SearchIntermediateViewModel searchIntermediateViewModel = this.f97785b;
        Fragment fragment = this.f97786c;
        C89219l.m154721d(viewGroup, "");
        View a = C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), R.layout.av6, viewGroup, false);
        C89219l.m154716b(a, "");
        return new C41782j(a, dVar, searchIntermediateViewModel, fragment);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, int] */
    @Override // com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39056b
    /* renamed from: a */
    public final /* synthetic */ boolean mo63165a(List<? extends Object> list, int i) {
        List<? extends Object> list2 = list;
        C89219l.m154721d(list2, "");
        Object obj = list2.get(i);
        if (!(obj instanceof TypeWords)) {
            return false;
        }
        TypeWords typeWords = (TypeWords) obj;
        if (typeWords.words != null) {
            List<Word> list3 = typeWords.words;
            if (list3 == null) {
                C89219l.m154715b();
            }
            if (list3.size() == 0) {
                return false;
            }
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
        Objects.requireNonNull(obj, "null cannot be cast to non-null type com.ss.android.ugc.aweme.discover.model.suggest.TypeWords");
        ((C41782j) viewHolder).mo70946a((TypeWords) obj);
    }
}
