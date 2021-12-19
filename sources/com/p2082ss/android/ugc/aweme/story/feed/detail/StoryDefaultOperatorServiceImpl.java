package com.p2082ss.android.ugc.aweme.story.feed.detail;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.JediViewModel;
import com.p2082ss.android.ugc.aweme.IDetailPageOperatorService;
import com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39100a;
import com.p2082ss.android.ugc.aweme.detail.operators.AbstractC41262aa;
import com.p2082ss.android.ugc.aweme.detail.operators.AbstractC41265ab;
import com.p2082ss.android.ugc.aweme.feed.param.C49812b;
import com.p2082ss.android.ugc.aweme.story.avatar.C76585n;
import java.util.HashMap;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.story.feed.detail.StoryDefaultOperatorServiceImpl */
public final class StoryDefaultOperatorServiceImpl implements IDetailPageOperatorService {
    static {
        Covode.recordClassIndex(90246);
    }

    /* renamed from: com.ss.android.ugc.aweme.story.feed.detail.StoryDefaultOperatorServiceImpl$a */
    public static final class C77234a implements AbstractC41265ab {
        static {
            Covode.recordClassIndex(90247);
        }

        C77234a() {
        }

        @Override // com.p2082ss.android.ugc.aweme.detail.operators.AbstractC41265ab
        /* renamed from: a */
        public final AbstractC41262aa mo62369a(C49812b bVar, AbstractC39100a<?, ?> aVar, JediViewModel<?> jediViewModel) {
            C89219l.m154721d(bVar, "");
            return new C77238a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.feed.detail.StoryDefaultOperatorServiceImpl$b */
    public static final class C77235b implements AbstractC41265ab {
        static {
            Covode.recordClassIndex(90248);
        }

        C77235b() {
        }

        @Override // com.p2082ss.android.ugc.aweme.detail.operators.AbstractC41265ab
        /* renamed from: a */
        public final AbstractC41262aa mo62369a(C49812b bVar, AbstractC39100a<?, ?> aVar, JediViewModel<?> jediViewModel) {
            C89219l.m154721d(bVar, "");
            return new C77243b();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.feed.detail.StoryDefaultOperatorServiceImpl$c */
    public static final class C77236c implements AbstractC41265ab {
        static {
            Covode.recordClassIndex(90249);
        }

        C77236c() {
        }

        @Override // com.p2082ss.android.ugc.aweme.detail.operators.AbstractC41265ab
        /* renamed from: a */
        public final AbstractC41262aa mo62369a(C49812b bVar, AbstractC39100a<?, ?> aVar, JediViewModel<?> jediViewModel) {
            C89219l.m154721d(bVar, "");
            return new C76585n(aVar);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.IDetailPageOperatorService
    /* renamed from: a */
    public final HashMap<String, AbstractC41265ab> mo57213a() {
        HashMap<String, AbstractC41265ab> hashMap = new HashMap<>();
        hashMap.put("STORY_ENTRANCE_DEFAULT", new C77234a());
        hashMap.put("STORY_ENTRANCE_COMMON", new C77235b());
        C77236c cVar = new C77236c();
        hashMap.put("STORY_ENTRANCE_MINE", cVar);
        hashMap.put("STORY_ENTRANCE_OTHER", cVar);
        hashMap.put("STORY_ENTRANCE_AVATAR", cVar);
        hashMap.put("STORY_ENTRANCE_PREVIEW", cVar);
        return hashMap;
    }
}
