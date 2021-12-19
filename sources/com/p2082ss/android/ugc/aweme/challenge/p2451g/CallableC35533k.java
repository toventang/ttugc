package com.p2082ss.android.ugc.aweme.challenge.p2451g;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.challenge.api.ChallengeApi;
import com.p2082ss.android.ugc.aweme.challenge.model.SearchSugChallengeList;
import java.util.Objects;
import java.util.concurrent.Callable;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.challenge.g.k */
public final class CallableC35533k implements Callable<Object> {

    /* renamed from: a */
    boolean f83794a;

    /* renamed from: b */
    public final C35527f f83795b;

    /* renamed from: c */
    private final String f83796c;

    /* renamed from: d */
    private final String f83797d;

    static {
        Covode.recordClassIndex(42729);
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        this.f83795b.mIsLoading = false;
        if (!this.f83794a) {
            String str = this.f83796c;
            SearchSugChallengeList searchSugChallengeList = ChallengeApi.f83702g.searchSugChallenge(str, this.f83797d).get();
            searchSugChallengeList.setKeyword(str);
            if (!this.f83794a) {
                C89219l.m154716b(searchSugChallengeList, "");
                return searchSugChallengeList;
            }
            throw new C35532j();
        }
        throw new C35532j();
    }

    public CallableC35533k(C35527f fVar, Object[] objArr) {
        C89219l.m154721d(fVar, "");
        C89219l.m154721d(objArr, "");
        this.f83795b = fVar;
        Object obj = objArr[0];
        Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.String");
        this.f83796c = (String) obj;
        Object obj2 = objArr[1];
        Objects.requireNonNull(obj2, "null cannot be cast to non-null type kotlin.String");
        this.f83797d = (String) obj2;
    }
}
