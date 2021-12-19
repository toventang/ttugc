package emotes.model;

import com.bytedance.android.live.base.model.emoji.C2975d;
import com.bytedance.android.p150e.p151a.p152a.AbstractC2724b;
import com.bytedance.android.p150e.p151a.p152a.C2730f;
import com.bytedance.android.p150e.p151a.p152a.C2731g;
import com.bytedance.covode.number.Covode;

/* renamed from: emotes.model.b */
public final class C88387b implements AbstractC2724b<SubEmoteDetailResult> {
    static {
        Covode.recordClassIndex(104429);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.p150e.p151a.p152a.AbstractC2724b
    /* renamed from: a */
    public final /* synthetic */ SubEmoteDetailResult mo7304a(C2730f fVar) {
        SubEmoteDetailResult subEmoteDetailResult = new SubEmoteDetailResult();
        long a = fVar.mo7307a();
        while (true) {
            int b = fVar.mo7310b();
            if (b == -1) {
                fVar.mo7309a(a);
                return subEmoteDetailResult;
            } else if (b == 1) {
                subEmoteDetailResult.stableEmoteDetail = C88386a.m153576b(fVar);
            } else if (b == 2) {
                subEmoteDetailResult.currentEmoteDetail = C88386a.m153576b(fVar);
            } else if (b == 3) {
                subEmoteDetailResult.emoteConfig = C2975d.m8297b(fVar);
            } else if (b != 4) {
                C2731g.m7903c(fVar);
            } else {
                subEmoteDetailResult.currentState = fVar.mo7313e();
            }
        }
    }
}
