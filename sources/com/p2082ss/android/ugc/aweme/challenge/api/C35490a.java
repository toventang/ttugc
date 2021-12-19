package com.p2082ss.android.ugc.aweme.challenge.api;

import android.content.Intent;
import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.challenge.ChallengeDetailServiceImpl;
import com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39100a;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.challenge.api.a */
public final class C35490a implements IChallengeDetailService {

    /* renamed from: a */
    public static final C35490a f83707a = new C35490a();

    /* renamed from: c */
    private final /* synthetic */ IChallengeDetailService f83708c;

    @Override // com.p2082ss.android.ugc.aweme.challenge.api.IChallengeDetailService
    /* renamed from: a */
    public final Fragment mo62370a(Intent intent) {
        C89219l.m154721d(intent, "");
        return this.f83708c.mo62370a(intent);
    }

    @Override // com.p2082ss.android.ugc.aweme.challenge.api.IChallengeDetailService
    /* renamed from: a */
    public final AbstractC39100a<Aweme, ?> mo62371a() {
        return this.f83708c.mo62371a();
    }

    @Override // com.p2082ss.android.ugc.aweme.challenge.api.IChallengeDetailService
    /* renamed from: a */
    public final void mo62372a(AbstractC39100a<Aweme, ?> aVar, List<? extends Aweme> list) {
        this.f83708c.mo62372a(aVar, list);
    }

    static {
        Covode.recordClassIndex(42682);
    }

    private C35490a() {
        IChallengeDetailService b = ChallengeDetailServiceImpl.m72554b();
        C89219l.m154716b(b, "");
        this.f83708c = b;
    }
}
