package com.p2082ss.android.ugc.aweme.detail.operators;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.jedi.arch.ext.list.CommonListViewModel;
import com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39100a;
import com.p2082ss.android.ugc.aweme.feed.param.C49812b;

/* renamed from: com.ss.android.ugc.aweme.detail.operators.t */
public final class C41315t extends C41283c {
    static {
        Covode.recordClassIndex(49203);
    }

    @Override // com.p2082ss.android.ugc.aweme.detail.operators.C41283c, com.p2082ss.android.ugc.aweme.detail.operators.AbstractC41266ac
    /* renamed from: a */
    public final AbstractC41262aa mo70577a(String str, C49812b bVar, AbstractC39100a aVar, JediViewModel jediViewModel) {
        str.hashCode();
        if (!str.equals("from_music_detail")) {
            return super.mo70577a(str, bVar, aVar, jediViewModel);
        }
        return new C41271b((CommonListViewModel) jediViewModel);
    }
}
