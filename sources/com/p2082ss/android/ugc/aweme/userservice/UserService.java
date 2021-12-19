package com.p2082ss.android.ugc.aweme.userservice;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.jedi.p1445a.p1446a.AbstractC20129c;
import com.bytedance.jedi.p1445a.p1448c.AbstractC20168e;
import com.bytedance.jedi.p1445a.p1448c.C20165b;
import com.bytedance.jedi.p1445a.p1448c.C20169f;
import com.p2082ss.android.ugc.C81908b;
import com.p2082ss.android.ugc.aweme.arch.widgets.base.C33943c;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;
import com.p2082ss.android.ugc.aweme.base.livedata.C34603a;
import com.p2082ss.android.ugc.aweme.notice.repo.p3515a.C61615a;
import com.p2082ss.android.ugc.aweme.notice.repo.p3515a.C61616b;
import com.p2082ss.android.ugc.aweme.profile.model.BlockStatus;
import com.p2082ss.android.ugc.aweme.profile.model.FollowStatus;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.userservice.api.C80103a;
import com.p2082ss.android.ugc.aweme.userservice.api.IUserService;
import com.p2082ss.android.ugc.aweme.userservice.jedi.C80104a;
import com.p2082ss.android.ugc.aweme.userservice.jedi.p4198a.C80113d;
import com.p2082ss.android.ugc.aweme.userservice.jedi.p4198a.C80115f;
import java.util.HashMap;
import java.util.Map;
import p4560f.p4561a.AbstractC88403ab;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.AbstractC88984x;
import p4560f.p4561a.p4568e.p4570b.C88466b;
import p4560f.p4561a.p4568e.p4573e.p4578e.C88777o;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4591l.C88962d;
import p4600h.C89378p;
import p4600h.C89387v;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.userservice.UserService */
public class UserService implements IUserService {

    /* renamed from: a */
    public C80115f f179484a = C80104a.f179497b;

    /* renamed from: b */
    public Map<String, C88962d<C89378p<C80103a, FollowStatus>>> f179485b = new HashMap();

    static {
        Covode.recordClassIndex(93341);
    }

    @Override // com.p2082ss.android.ugc.aweme.userservice.api.IUserService
    /* renamed from: a */
    public final AbstractC20129c<String, User> mo123560a() {
        return C80104a.f179496a;
    }

    @Override // com.p2082ss.android.ugc.aweme.userservice.api.IUserService
    /* renamed from: b */
    public final C33943c<FollowStatus> mo123566b() {
        return C34603a.C34604a.f81659a.mo61063a("#FollowStatus");
    }

    @Override // com.p2082ss.android.ugc.aweme.userservice.api.IUserService
    /* renamed from: c */
    public final C33943c<BlockStatus> mo123567c() {
        return C34603a.C34604a.f81659a.mo61063a("#BlockStatus");
    }

    /* renamed from: d */
    public static IUserService m138861d() {
        MethodCollector.m26663i(4619);
        Object a = C81908b.m141854a(IUserService.class, false);
        if (a != null) {
            IUserService iUserService = (IUserService) a;
            MethodCollector.m26664o(4619);
            return iUserService;
        }
        if (C81908b.f183390et == null) {
            synchronized (IUserService.class) {
                try {
                    if (C81908b.f183390et == null) {
                        C81908b.f183390et = new UserService();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(4619);
                    throw th;
                }
            }
        }
        UserService userService = (UserService) C81908b.f183390et;
        MethodCollector.m26664o(4619);
        return userService;
    }

    @Override // com.p2082ss.android.ugc.aweme.userservice.api.IUserService
    /* renamed from: a */
    public final AbstractC88979t<C20169f<User>> mo123564a(String str) {
        C80115f fVar = this.f179484a;
        C89219l.m154721d(str, "");
        return C20165b.m38137a(fVar.f179515e).mo33475a(str, new AbstractC20168e[0]);
    }

    @Override // com.p2082ss.android.ugc.aweme.userservice.api.IUserService
    /* renamed from: a */
    public final AbstractC88979t<BaseResponse> mo123565a(String str, String str2) {
        C80115f fVar = this.f179484a;
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        return fVar.f179513c.mo33487c(new C80113d(str, str2));
    }

    @Override // com.p2082ss.android.ugc.aweme.userservice.api.IUserService
    /* renamed from: a */
    public final FollowStatus mo123561a(String str, int i, String str2) {
        FollowStatus a = CommonFollowApi.m138860a(str, str2, i, -1, -1, "", -1, "", null);
        this.f179484a.f179514d.onNext(new C89378p<>(new C80103a(str, str2, i, -1, -1, "", -1, null, null, null), a));
        return a;
    }

    @Override // com.p2082ss.android.ugc.aweme.userservice.api.IUserService
    /* renamed from: a */
    public final AbstractC88403ab<FollowStatus> mo123563a(String str, String str2, int i, int i2, int i3, String str3, int i4) {
        C80103a aVar;
        Integer num;
        C80115f fVar = this.f179484a;
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C61615a a = C61616b.m111627a(str);
        C89378p pVar = null;
        if (a != null) {
            pVar = C89387v.m154943a(a, 1);
        } else {
            C61615a b = C61616b.m111629b(str);
            if (b != null) {
                pVar = C89387v.m154943a(b, 0);
            }
            aVar = new C80103a(str, str2, i, i2, i3, str3, i4);
            AbstractC88979t c = fVar.f179512b.mo33487c(aVar);
            C80115f.C80118a aVar2 = new C80115f.C80118a(fVar, pVar, str, aVar);
            C88466b.m153697a((Object) aVar2, "onAfterNext is null");
            AbstractC88403ab<FollowStatus> a2 = AbstractC88403ab.m153601a((AbstractC88984x) C88925a.m154171a(new C88777o(c, aVar2)));
            C89219l.m154716b(a2, "");
            return a2;
        }
        if (!(pVar == null || (num = (Integer) pVar.getSecond()) == null || (num.intValue() != 1 && num.intValue() != 0))) {
            C61615a aVar3 = (C61615a) pVar.getFirst();
            aVar = new C80103a(str, str2, i, i2, i3, str3, i4, aVar3.f139820b, aVar3.f139821c, (Integer) pVar.getSecond());
            AbstractC88979t c2 = fVar.f179512b.mo33487c(aVar);
            C80115f.C80118a aVar22 = new C80115f.C80118a(fVar, pVar, str, aVar);
            C88466b.m153697a((Object) aVar22, "onAfterNext is null");
            AbstractC88403ab<FollowStatus> a22 = AbstractC88403ab.m153601a((AbstractC88984x) C88925a.m154171a(new C88777o(c2, aVar22)));
            C89219l.m154716b(a22, "");
            return a22;
        }
        aVar = new C80103a(str, str2, i, i2, i3, str3, i4);
        AbstractC88979t c22 = fVar.f179512b.mo33487c(aVar);
        C80115f.C80118a aVar222 = new C80115f.C80118a(fVar, pVar, str, aVar);
        C88466b.m153697a((Object) aVar222, "onAfterNext is null");
        AbstractC88403ab<FollowStatus> a222 = AbstractC88403ab.m153601a((AbstractC88984x) C88925a.m154171a(new C88777o(c22, aVar222)));
        C89219l.m154716b(a222, "");
        return a222;
    }

    @Override // com.p2082ss.android.ugc.aweme.userservice.api.IUserService
    /* renamed from: a */
    public final FollowStatus mo123562a(String str, String str2, int i, int i2, int i3, String str3, int i4, String str4, Map<String, String> map) {
        FollowStatus a = CommonFollowApi.m138860a(str, str2, i, i2, i3, str3, i4, str4, map);
        this.f179484a.f179514d.onNext(new C89378p<>(new C80103a(str, str2, i, i3, i2, str3, i4, null, null, null), a));
        return a;
    }
}
