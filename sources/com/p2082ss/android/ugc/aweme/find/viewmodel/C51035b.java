package com.p2082ss.android.ugc.aweme.find.viewmodel;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.p1445a.p1453f.AbstractC20191d;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;
import com.p2082ss.android.ugc.aweme.friends.model.NewRecommendList;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.social.api.RecommendUserApiService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.p4567d.AbstractC88434g;
import p4600h.p4601a.C89086z;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.find.viewmodel.b */
public final class C51035b extends AbstractC20191d<C51038d, FindFriendsState> {

    /* renamed from: a */
    public List<? extends User> f117719a = C89086z.INSTANCE;

    /* renamed from: b */
    public final C51034a f117720b = new C51034a(0, 1);

    /* renamed from: f */
    public final C51034a f117721f = new C51034a(1, 1);

    static {
        Covode.recordClassIndex(60219);
    }

    @Override // com.bytedance.jedi.p1445a.p1453f.AbstractC20179a
    /* renamed from: a */
    public final /* synthetic */ AbstractC88979t mo33481a(Object obj) {
        boolean z;
        C51038d dVar = (C51038d) obj;
        C89219l.m154721d(dVar, "");
        if (dVar.f117728b == 0) {
            z = true;
        } else {
            z = false;
        }
        AbstractC88979t<R> d = RecommendUserApiService.f167940a.fetchRecommendList4FindFriends(Integer.valueOf(dVar.f117727a), Integer.valueOf(dVar.f117728b), dVar.f117729c).mo143292d(new C51036a(this, z, new ArrayList(), dVar));
        C89219l.m154716b(d, "");
        return d;
    }

    /* renamed from: com.ss.android.ugc.aweme.find.viewmodel.b$a */
    static final class C51036a<T, R> implements AbstractC88434g {

        /* renamed from: a */
        final /* synthetic */ C51035b f117722a;

        /* renamed from: b */
        final /* synthetic */ boolean f117723b;

        /* renamed from: c */
        final /* synthetic */ List f117724c;

        /* renamed from: d */
        final /* synthetic */ C51038d f117725d;

        static {
            Covode.recordClassIndex(60220);
        }

        C51036a(C51035b bVar, boolean z, List list, C51038d dVar) {
            this.f117722a = bVar;
            this.f117723b = z;
            this.f117724c = list;
            this.f117725d = dVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88434g
        public final /* synthetic */ Object apply(Object obj) {
            String str;
            NewRecommendList newRecommendList = (NewRecommendList) obj;
            C89219l.m154721d(newRecommendList, "");
            for (T t : newRecommendList.getUserList()) {
                BaseResponse.ServerTimeExtra serverTimeExtra = newRecommendList.extra;
                if (serverTimeExtra == null || (str = serverTimeExtra.logid) == null) {
                    str = "";
                }
                t.setRequestId(str);
            }
            if (!this.f117723b) {
                newRecommendList.getUserList().addAll(0, this.f117722a.f117719a);
            }
            this.f117722a.f117719a = newRecommendList.getUserList();
            Iterator<T> it = newRecommendList.getUserList().iterator();
            while (it.hasNext()) {
                this.f117724c.add(new C51034a(it.next(), 2));
            }
            if (!this.f117724c.isEmpty()) {
                if (newRecommendList.getNewUserCount() > 0) {
                    this.f117724c.add(0, this.f117722a.f117720b);
                    if (this.f117724c.size() > newRecommendList.getNewUserCount() + 1) {
                        this.f117724c.add(newRecommendList.getNewUserCount() + 1, this.f117722a.f117721f);
                    }
                } else {
                    this.f117724c.add(0, this.f117722a.f117721f);
                }
            }
            if (this.f117725d.f117728b == 0) {
                return new FindFriendsState(new C51039e(1), this.f117724c, newRecommendList.hasMore(), newRecommendList.getCursor(), null, null, false, null, 240, null);
            }
            return new FindFriendsState(new C51039e(2), this.f117724c, newRecommendList.hasMore(), newRecommendList.getCursor(), null, null, false, null, 240, null);
        }
    }
}
