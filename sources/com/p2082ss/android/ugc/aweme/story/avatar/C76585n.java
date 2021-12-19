package com.p2082ss.android.ugc.aweme.story.avatar;

import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39100a;
import com.p2082ss.android.ugc.aweme.detail.operators.AbstractC41262aa;
import com.p2082ss.android.ugc.aweme.detail.operators.AbstractC41267ad;
import com.p2082ss.android.ugc.aweme.detail.p2750i.AbstractC41238k;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.param.C49812b;
import com.p2082ss.android.ugc.aweme.story.avatar.entry.C76527b;
import java.util.ArrayList;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.story.avatar.n */
public final class C76585n implements AbstractC41238k, AbstractC41262aa {

    /* renamed from: a */
    public final AbstractC39100a<?, ?> f171904a;

    /* renamed from: b */
    private AbstractC41267ad f171905b;

    static {
        Covode.recordClassIndex(89570);
    }

    @Override // com.p2082ss.android.ugc.aweme.detail.operators.AbstractC41262aa
    public final boolean cannotLoadLatest() {
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.detail.operators.AbstractC41262aa
    public final boolean cannotLoadMore() {
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.detail.operators.AbstractC41262aa
    public final boolean deleteItem(String str) {
        C89219l.m154721d(str, "");
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.detail.operators.AbstractC41262aa
    public final int getPageType(int i) {
        return 40;
    }

    @Override // com.p2082ss.android.ugc.aweme.detail.operators.AbstractC41262aa
    public final Object getViewModel() {
        return null;
    }

    @Override // com.p2082ss.android.ugc.aweme.detail.operators.AbstractC41262aa
    public final boolean init(Fragment fragment) {
        C89219l.m154721d(fragment, "");
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.detail.operators.AbstractC41262aa
    public final boolean isLoading() {
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.detail.operators.AbstractC41262aa
    public final void request(int i, C49812b bVar, int i2, boolean z) {
        C89219l.m154721d(bVar, "");
    }

    @Override // com.p2082ss.android.ugc.aweme.detail.operators.AbstractC41262aa
    public final void unInit() {
    }

    /* JADX DEBUG: Type inference failed for r0v3. Raw type applied. Possible types: java.util.List<?>, java.util.List<com.ss.android.ugc.aweme.feed.model.Aweme> */
    @Override // com.p2082ss.android.ugc.aweme.detail.p2750i.AbstractC41238k
    /* renamed from: a */
    public final List<Aweme> mo70559a() {
        AbstractC39100a<?, ?> aVar = this.f171904a;
        if (!(aVar instanceof C76527b)) {
            return new ArrayList();
        }
        C89219l.m154716b(aVar, "");
        return aVar.getItems();
    }

    @Override // com.p2082ss.android.ugc.aweme.detail.operators.AbstractC41262aa
    public final boolean isDataEmpty() {
        List<?> items;
        AbstractC39100a<?, ?> aVar = this.f171904a;
        if (aVar == null || (items = aVar.getItems()) == null || items.isEmpty()) {
            return true;
        }
        return false;
    }

    public C76585n(AbstractC39100a<?, ?> aVar) {
        this.f171904a = aVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.detail.operators.AbstractC41262aa
    public final void bindView(AbstractC41267ad adVar) {
        C89219l.m154721d(adVar, "");
        this.f171905b = adVar;
    }
}
