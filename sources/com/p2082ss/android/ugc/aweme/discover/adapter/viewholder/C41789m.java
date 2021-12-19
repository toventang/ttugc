package com.p2082ss.android.ugc.aweme.discover.adapter.viewholder;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39060f;
import com.p2082ss.android.ugc.aweme.discover.model.SearchIntermediateViewModel;
import com.p2082ss.android.ugc.aweme.discover.model.suggest.Word;
import com.p2082ss.android.ugc.aweme.discover.p2797ui.AbstractC42664al;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.discover.adapter.viewholder.m */
public final class C41789m extends AbstractC39060f<Word> {

    /* renamed from: a */
    public boolean f97471a;

    /* renamed from: b */
    public final AbstractC42664al.AbstractC42668d f97472b;

    /* renamed from: c */
    public final String f97473c;

    /* renamed from: d */
    public final SearchIntermediateViewModel f97474d;

    /* renamed from: e */
    public final Fragment f97475e;

    static {
        Covode.recordClassIndex(49704);
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39073l
    /* renamed from: a */
    public final void mo60186a(RecyclerView.ViewHolder viewHolder, int i) {
        C89219l.m154721d(viewHolder, "");
        Word word = (Word) mo63369e().get(i);
        if (viewHolder instanceof C41779i) {
            C41779i iVar = (C41779i) viewHolder;
            iVar.f97456i = this.f97471a;
            iVar.mo70930a(word, this.f97473c);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39073l
    /* renamed from: a */
    public final RecyclerView.ViewHolder mo60184a(ViewGroup viewGroup, int i) {
        C89219l.m154721d(viewGroup, "");
        AbstractC42664al.AbstractC42668d dVar = this.f97472b;
        SearchIntermediateViewModel searchIntermediateViewModel = this.f97474d;
        Fragment fragment = this.f97475e;
        C89219l.m154721d(viewGroup, "");
        View a = C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), R.layout.avb, viewGroup, false);
        C89219l.m154716b(a, "");
        return new C41779i(a, dVar, searchIntermediateViewModel, fragment);
    }

    public C41789m(AbstractC42664al.AbstractC42668d dVar, String str, SearchIntermediateViewModel searchIntermediateViewModel, Fragment fragment) {
        C89219l.m154721d(str, "");
        this.f97472b = dVar;
        this.f97473c = str;
        this.f97474d = searchIntermediateViewModel;
        this.f97475e = fragment;
    }
}
