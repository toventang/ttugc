package com.p2082ss.android.ugc.aweme.relation.viewmodel;

import androidx.p046f.p047a.AbstractC0924b;
import com.bytedance.assem.arch.p794a.AbstractC12644a;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.relation.api.AbstractC66862c;
import javax.p4631a.AbstractC89405a;

/* renamed from: com.ss.android.ugc.aweme.relation.viewmodel.c */
public final class C67101c implements AbstractC0924b<RecFriendsListViewModel> {

    /* renamed from: a */
    private final AbstractC89405a<AbstractC12644a<AbstractC66862c>> f150484a;

    static {
        Covode.recordClassIndex(78683);
    }

    /* Return type fixed from 'androidx.lifecycle.ac' to match base method */
    @Override // androidx.p046f.p047a.AbstractC0924b
    /* renamed from: a */
    public final /* synthetic */ RecFriendsListViewModel mo3262a() {
        return new RecFriendsListViewModel(this.f150484a.get());
    }

    C67101c(AbstractC89405a<AbstractC12644a<AbstractC66862c>> aVar) {
        this.f150484a = aVar;
    }
}
