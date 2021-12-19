package com.p2082ss.android.ugc.aweme.choosemusic.viewholder.p2475a;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.choosemusic.viewholder.C36052t;
import com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39056b;
import com.p2082ss.android.ugc.aweme.music.model.MusicSearchHistory;
import com.p2082ss.android.ugc.trill.R;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.choosemusic.viewholder.a.b */
public final class C36003b extends AbstractC39056b<List<? extends MusicSearchHistory>> {
    static {
        Covode.recordClassIndex(43249);
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39056b
    /* renamed from: a */
    public final RecyclerView.ViewHolder mo63163a(ViewGroup viewGroup) {
        C89219l.m154721d(viewGroup, "");
        View a = C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), R.layout.aap, viewGroup, false);
        C89219l.m154716b(a, "");
        return new C36052t(a);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, int] */
    @Override // com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39056b
    /* renamed from: a */
    public final /* synthetic */ boolean mo63165a(List<? extends MusicSearchHistory> list, int i) {
        List<? extends MusicSearchHistory> list2 = list;
        C89219l.m154721d(list2, "");
        if (((MusicSearchHistory) list2.get(i)).type != Integer.MAX_VALUE) {
            return true;
        }
        return false;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, int, androidx.recyclerview.widget.RecyclerView$ViewHolder, java.util.List] */
    @Override // com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39056b
    /* renamed from: a */
    public final /* synthetic */ void mo63164a(List<? extends MusicSearchHistory> list, int i, RecyclerView.ViewHolder viewHolder, List list2) {
        List<? extends MusicSearchHistory> list3 = list;
        C89219l.m154721d(list3, "");
        C89219l.m154721d(viewHolder, "");
        C89219l.m154721d(list2, "");
        MusicSearchHistory musicSearchHistory = (MusicSearchHistory) list3.get(i);
        C36052t tVar = (C36052t) viewHolder;
        C89219l.m154721d(musicSearchHistory, "");
        tVar.f85161a.setText(musicSearchHistory.keyword);
        tVar.f85162b.setOnClickListener(new C36052t.View$OnClickListenerC36053a(musicSearchHistory));
        tVar.f85161a.setOnClickListener(new C36052t.View$OnClickListenerC36054b(musicSearchHistory));
    }
}
