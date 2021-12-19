package emotes.model;

import com.bytedance.android.live.base.model.emoji.C2976e;
import com.bytedance.android.p150e.p151a.p152a.AbstractC2724b;
import com.bytedance.android.p150e.p151a.p152a.C2730f;
import com.bytedance.android.p150e.p151a.p152a.C2731g;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;

/* renamed from: emotes.model.a */
public final class C88386a implements AbstractC2724b<EmoteListResult> {
    static {
        Covode.recordClassIndex(104428);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.p150e.p151a.p152a.AbstractC2724b
    /* renamed from: a */
    public final /* synthetic */ EmoteListResult mo7304a(C2730f fVar) {
        return m153576b(fVar);
    }

    /* renamed from: b */
    public static EmoteListResult m153576b(C2730f fVar) {
        EmoteListResult emoteListResult = new EmoteListResult();
        emoteListResult.emoteList = new ArrayList();
        long a = fVar.mo7307a();
        while (true) {
            int b = fVar.mo7310b();
            if (b == -1) {
                fVar.mo7309a(a);
                return emoteListResult;
            } else if (b != 1) {
                C2731g.m7903c(fVar);
            } else {
                emoteListResult.emoteList.add(C2976e.m8299b(fVar));
            }
        }
    }
}
