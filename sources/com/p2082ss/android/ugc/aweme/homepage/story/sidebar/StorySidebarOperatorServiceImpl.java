package com.p2082ss.android.ugc.aweme.homepage.story.sidebar;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.IDetailPageShareVMService;
import com.p2082ss.android.ugc.aweme.detail.operators.AbstractC41268ae;
import com.p2082ss.android.ugc.aweme.detail.p2755vm.BaseDetailShareVM;
import com.p2082ss.android.ugc.aweme.feed.param.C49812b;
import java.util.HashMap;
import p4600h.C89378p;
import p4600h.C89387v;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.homepage.story.sidebar.StorySidebarOperatorServiceImpl */
public final class StorySidebarOperatorServiceImpl implements IDetailPageShareVMService {
    static {
        Covode.recordClassIndex(62761);
    }

    /* renamed from: com.ss.android.ugc.aweme.homepage.story.sidebar.StorySidebarOperatorServiceImpl$a */
    public static final class C53211a implements AbstractC41268ae {
        static {
            Covode.recordClassIndex(62762);
        }

        C53211a() {
        }

        @Override // com.p2082ss.android.ugc.aweme.detail.operators.AbstractC41268ae
        /* renamed from: a */
        public final C89378p<String, Class<? extends BaseDetailShareVM<?, ?, ?>>> mo70579a(C49812b bVar) {
            C89219l.m154721d(bVar, "");
            return C89387v.m154943a("story_sidebar_list", StorySidebarListVM.class);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.IDetailPageShareVMService
    /* renamed from: a */
    public final HashMap<String, AbstractC41268ae> mo57214a() {
        HashMap<String, AbstractC41268ae> hashMap = new HashMap<>();
        hashMap.put("STORY_ENTRANCE_SIDE_BAR", new C53211a());
        return hashMap;
    }
}
