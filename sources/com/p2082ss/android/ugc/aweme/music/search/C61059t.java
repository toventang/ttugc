package com.p2082ss.android.ugc.aweme.music.search;

import androidx.p046f.p047a.AbstractC0924b;
import com.bytedance.assem.arch.p794a.AbstractC12644a;
import com.bytedance.covode.number.Covode;
import javax.p4631a.AbstractC89405a;

/* renamed from: com.ss.android.ugc.aweme.music.search.t */
public final class C61059t implements AbstractC0924b<SearchMusicListViewModel> {

    /* renamed from: a */
    private final AbstractC89405a<AbstractC12644a<AbstractC61057r>> f138540a;

    static {
        Covode.recordClassIndex(71650);
    }

    /* Return type fixed from 'androidx.lifecycle.ac' to match base method */
    @Override // androidx.p046f.p047a.AbstractC0924b
    /* renamed from: a */
    public final /* synthetic */ SearchMusicListViewModel mo3262a() {
        return new SearchMusicListViewModel(this.f138540a.get());
    }

    C61059t(AbstractC89405a<AbstractC12644a<AbstractC61057r>> aVar) {
        this.f138540a = aVar;
    }
}
