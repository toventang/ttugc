package com.p2082ss.android.ugc.aweme.feed.adapter;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.friends.model.SuperAccountList;
import com.p2082ss.android.ugc.aweme.friends.model.UserWithAweme;
import com.p2082ss.android.ugc.aweme.net.C61354g;
import com.p2082ss.android.ugc.aweme.p2426bw.p2427a.AbstractC35320a;
import com.p2082ss.android.ugc.aweme.social.api.IRecommendUserApi;
import com.p2082ss.android.ugc.aweme.social.api.RecommendUserApiService;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.feed.adapter.at */
public final class C48165at extends AbstractC35320a<SuperAccountList> {

    /* renamed from: a */
    public List<String> f111558a;

    /* renamed from: b */
    private final IRecommendUserApi f111559b = RecommendUserApiService.f167940a;

    static {
        Covode.recordClassIndex(56907);
    }

    /* renamed from: a */
    public final void mo80300a() {
        this.f111559b.recommendSuperAccount().mo5532a(new C61354g(this.mHandler));
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.p2082ss.android.ugc.aweme.p2426bw.p2427a.AbstractC35320a
    public final /* synthetic */ void handleData(SuperAccountList superAccountList) {
        SuperAccountList superAccountList2 = superAccountList;
        if (this.mQueryType == 1) {
            super.handleData(superAccountList2);
        } else if (this.mQueryType == 4) {
            if (this.mData != null) {
                List<UserWithAweme> userList = ((SuperAccountList) this.mData).getUserList();
                userList.addAll(superAccountList2.getUserList());
                this.mData = superAccountList2;
                ((SuperAccountList) this.mData).userList = userList;
            } else {
                this.mData = superAccountList2;
            }
        }
        List<String> list = this.f111558a;
        if (list == null) {
            this.f111558a = new ArrayList();
        } else {
            list.clear();
        }
        if (!(superAccountList2 == null || superAccountList2.getUserList() == null)) {
            for (UserWithAweme userWithAweme : superAccountList2.getUserList()) {
                this.f111558a.add(userWithAweme.getUser().getUid());
            }
        }
    }
}
