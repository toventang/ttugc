package com.p2082ss.android.ugc.navi;

import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.C1213t;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.AbstractC34936bt;
import com.p2082ss.android.ugc.aweme.IProfileNaviService;
import com.p2082ss.android.ugc.aweme.ProfileNaviServiceImpl;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.utils.C80537hk;
import java.util.LinkedList;
import java.util.List;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.navi.NaviProfileCarouselViewModel */
public final class NaviProfileCarouselViewModel extends AbstractC1174ac {

    /* renamed from: a */
    public final C1213t<LinkedList<AbstractC34936bt>> f187830a = new C1213t<>();

    /* renamed from: b */
    public boolean f187831b = true;

    /* renamed from: c */
    public int f187832c;

    static {
        Covode.recordClassIndex(98065);
    }

    /* renamed from: a */
    public final void mo128990a(User user) {
        C89219l.m154721d(user, "");
        if (this.f187831b) {
            ProfileNaviServiceImpl.m65406a().mo57244a((IProfileNaviService) this.f187832c, 0, (AbstractC89183m) new C84164a(this, user));
        }
    }

    /* renamed from: com.ss.android.ugc.navi.NaviProfileCarouselViewModel$a */
    static final class C84164a extends AbstractC89220m implements AbstractC89183m<Integer, List<? extends AbstractC34936bt>, C89391z> {

        /* renamed from: a */
        final /* synthetic */ NaviProfileCarouselViewModel f187833a;

        /* renamed from: b */
        final /* synthetic */ User f187834b;

        static {
            Covode.recordClassIndex(98066);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C84164a(NaviProfileCarouselViewModel naviProfileCarouselViewModel, User user) {
            super(2);
            this.f187833a = naviProfileCarouselViewModel;
            this.f187834b = user;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(Integer num, List<? extends AbstractC34936bt> list) {
            LinkedList<AbstractC34936bt> value;
            List<? extends AbstractC34936bt> list2 = list;
            if (num.intValue() == 0) {
                if (list2 == null) {
                    this.f187833a.f187831b = false;
                } else {
                    this.f187833a.f187832c += list2.size();
                    if (this.f187833a.f187830a.getValue() == null) {
                        this.f187833a.f187830a.setValue(new LinkedList<>());
                    }
                    for (AbstractC34936bt btVar : list2) {
                        if (C80537hk.m139613a(btVar.mo61818a()) && C80537hk.m139613a(btVar.mo61819b())) {
                            if ((!C80537hk.m139613a(this.f187834b.naviId) || !C89219l.m154714a((Object) this.f187834b.naviId, (Object) btVar.mo61818a())) && (value = this.f187833a.f187830a.getValue()) != null) {
                                value.add(btVar);
                            }
                        }
                    }
                    this.f187833a.f187830a.postValue(this.f187833a.f187830a.getValue());
                }
            }
            return C89391z.f203057a;
        }
    }
}
