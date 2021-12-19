package com.p2082ss.android.ugc.aweme.relation.viewmodel;

import android.app.Activity;
import com.bytedance.common.utility.collection.C13603b;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17873f;
import com.bytedance.jedi.arch.JediViewModel;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;
import com.p2082ss.android.ugc.aweme.friends.api.AbstractC51474a;
import com.p2082ss.android.ugc.aweme.friends.model.ContactModelV2;
import com.p2082ss.android.ugc.aweme.friends.model.FriendList;
import com.p2082ss.android.ugc.aweme.friends.p3015e.C51488a;
import com.p2082ss.android.ugc.aweme.friends.p3019i.C51519c;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.relation.C66823a;
import com.p2082ss.android.ugc.aweme.relation.p3673b.C66870b;
import com.p2082ss.android.ugc.aweme.relation.p3674c.EnumC66892b;
import com.p2082ss.android.ugc.aweme.social.monitor.AbstractC74739d;
import com.p2082ss.android.ugc.aweme.social.monitor.C74740e;
import com.p2082ss.android.ugc.aweme.ufr.C79515b;
import com.p2082ss.android.ugc.aweme.ufr.C79519c;
import com.p2082ss.android.ugc.aweme.ufr.C79546d;
import com.p2082ss.android.ugc.aweme.ufr.EnumC79549g;
import com.p2082ss.android.ugc.aweme.ufr.p4172a.C79496a;
import com.p2082ss.android.ugc.aweme.utils.C80580in;
import java.util.Collection;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.AbstractC88984x;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4560f.p4561a.p4567d.AbstractC88434g;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.relation.viewmodel.SocialRecRequestViewModel */
public final class SocialRecRequestViewModel extends JediViewModel<SocialRecRequestState> {

    /* renamed from: c */
    public static final C67045a f150417c = new C67045a((byte) 0);

    /* renamed from: a */
    public AbstractC88412b f150418a;

    /* renamed from: b */
    public boolean f150419b;

    static {
        Covode.recordClassIndex(78626);
    }

    /* renamed from: com.ss.android.ugc.aweme.relation.viewmodel.SocialRecRequestViewModel$a */
    public static final class C67045a {
        static {
            Covode.recordClassIndex(78627);
        }

        private C67045a() {
        }

        public /* synthetic */ C67045a(byte b) {
            this();
        }
    }

    /* renamed from: a */
    public final void mo105921a(String str, int i, int i2, String str2) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        if (i == 1) {
            boolean a = C79519c.C79520a.f178475a.mo86982a();
            if (!C79519c.C79520a.f178475a.mo86983b()) {
                mo33689c(C67078q.f150458a);
            } else if (a) {
                m118746a(false);
            } else {
                m118742a();
            }
        } else if (i != 2) {
            if (i == 3) {
                if (i2 != EnumC66892b.NEW_VERSION_CONTACT.getValue()) {
                    m118744a(str, i2);
                } else if (!C79519c.C79520a.f178475a.mo86983b()) {
                    mo33689c(C67080s.f150460a);
                } else if (C79519c.C79520a.f178475a.mo86982a()) {
                    mo33689c(C67079r.f150459a);
                    m118746a(true);
                } else {
                    m118744a(str, i2);
                }
            }
        } else if (C79519c.C79521b.f178476a.mo86991a()) {
            m118743a(str);
        } else {
            m118745a(str, str2);
        }
    }

    /* renamed from: b */
    private final void m118747b() {
        AbstractC88412b d = AbstractC88979t.m154307b(2, TimeUnit.SECONDS).mo143289d(new C67060h(this));
        C89219l.m154716b(d, "");
        mo33680a(d);
    }

    /* Return type fixed from 'com.bytedance.jedi.arch.af' to match base method */
    @Override // com.bytedance.jedi.arch.JediViewModel
    /* renamed from: d */
    public final /* synthetic */ SocialRecRequestState mo23027d() {
        return new SocialRecRequestState(false, false, false, false, false, false, null, 0, 0, false, 1023, null);
    }

    /* renamed from: a */
    private final void m118742a() {
        m118747b();
        C51488a.m95930b("login_onboarding", "user", "contact", "login", "uid", "process", null);
        int a = C66870b.m118583a();
        C79519c.C79520a.m138231a(true);
        C74740e eVar = C74740e.f167996b;
        UUID randomUUID = UUID.randomUUID();
        C89219l.m154716b(randomUUID, "");
        AbstractC74739d a2 = eVar.mo117778a(a, randomUUID);
        AbstractC88412b a3 = AbstractC51474a.m95881a().syncSocialRelationStatusInRx(1, true).mo143267a((AbstractC88434g<? super BaseResponse, ? extends AbstractC88984x<? extends R>>) new C67062i(this, a2), false).mo143267a((AbstractC88434g<? super R, ? extends AbstractC88984x<? extends R>>) new C67064j(a2, a), false).mo143292d(C67065k.f150443a).mo143304h(5, TimeUnit.SECONDS).mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143254a(new C67066l(this), new C67069m(this));
        C89219l.m154716b(a3, "");
        mo33680a(a3);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.relation.viewmodel.SocialRecRequestViewModel$e */
    public static final class C67053e<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ SocialRecRequestViewModel f150429a;

        static {
            Covode.recordClassIndex(78635);
        }

        C67053e(SocialRecRequestViewModel socialRecRequestViewModel) {
            this.f150429a = socialRecRequestViewModel;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            this.f150429a.mo33689c(C670541.f150430a);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.relation.viewmodel.SocialRecRequestViewModel$g */
    public static final class C67058g<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ SocialRecRequestViewModel f150434a;

        static {
            Covode.recordClassIndex(78640);
        }

        C67058g(SocialRecRequestViewModel socialRecRequestViewModel) {
            this.f150434a = socialRecRequestViewModel;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            this.f150434a.mo33689c(C670591.f150435a);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.relation.viewmodel.SocialRecRequestViewModel$h */
    public static final class C67060h<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ SocialRecRequestViewModel f150436a;

        static {
            Covode.recordClassIndex(78642);
        }

        C67060h(SocialRecRequestViewModel socialRecRequestViewModel) {
            this.f150436a = socialRecRequestViewModel;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            this.f150436a.mo33689c(C670611.f150437a);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.relation.viewmodel.SocialRecRequestViewModel$m */
    public static final class C67069m<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ SocialRecRequestViewModel f150447a;

        static {
            Covode.recordClassIndex(78651);
        }

        C67069m(SocialRecRequestViewModel socialRecRequestViewModel) {
            this.f150447a = socialRecRequestViewModel;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            this.f150447a.mo33689c(C670701.f150448a);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.relation.viewmodel.SocialRecRequestViewModel$p */
    public static final class C67076p<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ SocialRecRequestViewModel f150456a;

        static {
            Covode.recordClassIndex(78658);
        }

        C67076p(SocialRecRequestViewModel socialRecRequestViewModel) {
            this.f150456a = socialRecRequestViewModel;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            this.f150456a.mo33689c(C670771.f150457a);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.relation.viewmodel.SocialRecRequestViewModel$y */
    public static final class C67097y<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ SocialRecRequestViewModel f150479a;

        static {
            Covode.recordClassIndex(78679);
        }

        C67097y(SocialRecRequestViewModel socialRecRequestViewModel) {
            this.f150479a = socialRecRequestViewModel;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            this.f150479a.mo33689c(C670981.f150480a);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.relation.viewmodel.SocialRecRequestViewModel$c */
    public static final class C67047c<T, R> implements AbstractC88434g {

        /* renamed from: a */
        public static final C67047c f150422a = new C67047c();

        static {
            Covode.recordClassIndex(78629);
        }

        C67047c() {
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88434g
        public final /* synthetic */ Object apply(Object obj) {
            C66823a aVar = (C66823a) obj;
            C89219l.m154721d(aVar, "");
            FriendList friendList = new FriendList();
            friendList.setFriends(aVar.f150074a);
            return friendList;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.relation.viewmodel.SocialRecRequestViewModel$i */
    public static final class C67062i<T, R> implements AbstractC88434g {

        /* renamed from: a */
        final /* synthetic */ SocialRecRequestViewModel f150438a;

        /* renamed from: b */
        final /* synthetic */ AbstractC74739d f150439b;

        static {
            Covode.recordClassIndex(78644);
        }

        C67062i(SocialRecRequestViewModel socialRecRequestViewModel, AbstractC74739d dVar) {
            this.f150438a = socialRecRequestViewModel;
            this.f150439b = dVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88434g
        public final /* synthetic */ Object apply(Object obj) {
            C89219l.m154721d(obj, "");
            this.f150438a.mo33689c(C670631.f150440a);
            this.f150438a.f150419b = true;
            return C66870b.m118586a(this.f150439b, true);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.relation.viewmodel.SocialRecRequestViewModel$k */
    public static final class C67065k<T, R> implements AbstractC88434g {

        /* renamed from: a */
        public static final C67065k f150443a = new C67065k();

        static {
            Covode.recordClassIndex(78647);
        }

        C67065k() {
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88434g
        public final /* synthetic */ Object apply(Object obj) {
            C66823a aVar = (C66823a) obj;
            C89219l.m154721d(aVar, "");
            FriendList friendList = new FriendList();
            friendList.setFriends(aVar.f150074a);
            return friendList;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.relation.viewmodel.SocialRecRequestViewModel$q */
    public static final class C67078q extends AbstractC89220m implements AbstractC89172b<SocialRecRequestState, SocialRecRequestState> {

        /* renamed from: a */
        public static final C67078q f150458a = new C67078q();

        static {
            Covode.recordClassIndex(78660);
        }

        C67078q() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ SocialRecRequestState invoke(SocialRecRequestState socialRecRequestState) {
            SocialRecRequestState socialRecRequestState2 = socialRecRequestState;
            C89219l.m154721d(socialRecRequestState2, "");
            return SocialRecRequestState.copy$default(socialRecRequestState2, false, false, false, false, false, true, null, 0, 0, false, 991, null);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.relation.viewmodel.SocialRecRequestViewModel$r */
    public static final class C67079r extends AbstractC89220m implements AbstractC89172b<SocialRecRequestState, SocialRecRequestState> {

        /* renamed from: a */
        public static final C67079r f150459a = new C67079r();

        static {
            Covode.recordClassIndex(78661);
        }

        C67079r() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ SocialRecRequestState invoke(SocialRecRequestState socialRecRequestState) {
            SocialRecRequestState socialRecRequestState2 = socialRecRequestState;
            C89219l.m154721d(socialRecRequestState2, "");
            return SocialRecRequestState.copy$default(socialRecRequestState2, false, false, false, false, false, false, null, 1, 0, false, 895, null);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.relation.viewmodel.SocialRecRequestViewModel$s */
    public static final class C67080s extends AbstractC89220m implements AbstractC89172b<SocialRecRequestState, SocialRecRequestState> {

        /* renamed from: a */
        public static final C67080s f150460a = new C67080s();

        static {
            Covode.recordClassIndex(78662);
        }

        C67080s() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ SocialRecRequestState invoke(SocialRecRequestState socialRecRequestState) {
            SocialRecRequestState socialRecRequestState2 = socialRecRequestState;
            C89219l.m154721d(socialRecRequestState2, "");
            return SocialRecRequestState.copy$default(socialRecRequestState2, false, false, false, false, false, true, null, 0, 0, false, 991, null);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.relation.viewmodel.SocialRecRequestViewModel$u */
    public static final class C67090u<T, R> implements AbstractC88434g {

        /* renamed from: a */
        final /* synthetic */ SocialRecRequestViewModel f150471a;

        /* renamed from: b */
        final /* synthetic */ AbstractC74739d f150472b;

        static {
            Covode.recordClassIndex(78672);
        }

        C67090u(SocialRecRequestViewModel socialRecRequestViewModel, AbstractC74739d dVar) {
            this.f150471a = socialRecRequestViewModel;
            this.f150472b = dVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88434g
        public final /* synthetic */ Object apply(Object obj) {
            C89219l.m154721d(obj, "");
            this.f150471a.mo33689c(C670911.f150473a);
            return C66870b.m118586a(this.f150472b, true);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.relation.viewmodel.SocialRecRequestViewModel$w */
    public static final class C67093w<T, R> implements AbstractC88434g {

        /* renamed from: a */
        public static final C67093w f150475a = new C67093w();

        static {
            Covode.recordClassIndex(78675);
        }

        C67093w() {
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88434g
        public final /* synthetic */ Object apply(Object obj) {
            C66823a aVar = (C66823a) obj;
            C89219l.m154721d(aVar, "");
            FriendList friendList = new FriendList();
            friendList.setFriends(aVar.f150074a);
            return friendList;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.relation.viewmodel.SocialRecRequestViewModel$b */
    public static final class C67046b<T, R> implements AbstractC88434g {

        /* renamed from: a */
        final /* synthetic */ AbstractC74739d f150420a;

        /* renamed from: b */
        final /* synthetic */ int f150421b;

        static {
            Covode.recordClassIndex(78628);
        }

        C67046b(AbstractC74739d dVar, int i) {
            this.f150420a = dVar;
            this.f150421b = i;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88434g
        public final /* synthetic */ Object apply(Object obj) {
            List list = (List) obj;
            C89219l.m154721d(list, "");
            if (!C13603b.m24435a((Collection) list)) {
                return C51519c.m95981a(list, this.f150420a, this.f150421b);
            }
            AbstractC88979t b = AbstractC88979t.m154310b(new C66823a());
            C89219l.m154716b(b, "");
            return b;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.relation.viewmodel.SocialRecRequestViewModel$f */
    public static final class C67055f<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ SocialRecRequestViewModel f150431a;

        static {
            Covode.recordClassIndex(78637);
        }

        C67055f(SocialRecRequestViewModel socialRecRequestViewModel) {
            this.f150431a = socialRecRequestViewModel;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            List friends;
            final FriendList friendList = (FriendList) obj;
            if (friendList == null || (friends = friendList.getFriends()) == null || friends.isEmpty()) {
                this.f150431a.mo33689c(C670561.f150432a);
            } else {
                this.f150431a.mo33689c(new AbstractC89172b<SocialRecRequestState, SocialRecRequestState>() {
                    /* class com.p2082ss.android.ugc.aweme.relation.viewmodel.SocialRecRequestViewModel.C67055f.C670572 */

                    static {
                        Covode.recordClassIndex(78639);
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    @Override // p4600h.p4611f.p4612a.AbstractC89172b
                    public final /* synthetic */ SocialRecRequestState invoke(SocialRecRequestState socialRecRequestState) {
                        SocialRecRequestState socialRecRequestState2 = socialRecRequestState;
                        C89219l.m154721d(socialRecRequestState2, "");
                        return SocialRecRequestState.copy$default(socialRecRequestState2, false, false, false, false, false, false, friendList, 0, 0, false, 959, null);
                    }
                });
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.relation.viewmodel.SocialRecRequestViewModel$j */
    public static final class C67064j<T, R> implements AbstractC88434g {

        /* renamed from: a */
        final /* synthetic */ AbstractC74739d f150441a;

        /* renamed from: b */
        final /* synthetic */ int f150442b;

        static {
            Covode.recordClassIndex(78646);
        }

        C67064j(AbstractC74739d dVar, int i) {
            this.f150441a = dVar;
            this.f150442b = i;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88434g
        public final /* synthetic */ Object apply(Object obj) {
            List list = (List) obj;
            C89219l.m154721d(list, "");
            if (!C13603b.m24435a((Collection) list)) {
                return C51519c.m95981a(list, this.f150441a, this.f150442b);
            }
            AbstractC88979t b = AbstractC88979t.m154310b(new C66823a());
            C89219l.m154716b(b, "");
            return b;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.relation.viewmodel.SocialRecRequestViewModel$l */
    public static final class C67066l<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ SocialRecRequestViewModel f150444a;

        static {
            Covode.recordClassIndex(78648);
        }

        C67066l(SocialRecRequestViewModel socialRecRequestViewModel) {
            this.f150444a = socialRecRequestViewModel;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            List friends;
            final FriendList friendList = (FriendList) obj;
            if (friendList == null || (friends = friendList.getFriends()) == null || friends.isEmpty()) {
                this.f150444a.mo33689c(C670671.f150445a);
            } else {
                this.f150444a.mo33689c(new AbstractC89172b<SocialRecRequestState, SocialRecRequestState>() {
                    /* class com.p2082ss.android.ugc.aweme.relation.viewmodel.SocialRecRequestViewModel.C67066l.C670682 */

                    static {
                        Covode.recordClassIndex(78650);
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    @Override // p4600h.p4611f.p4612a.AbstractC89172b
                    public final /* synthetic */ SocialRecRequestState invoke(SocialRecRequestState socialRecRequestState) {
                        SocialRecRequestState socialRecRequestState2 = socialRecRequestState;
                        C89219l.m154721d(socialRecRequestState2, "");
                        return SocialRecRequestState.copy$default(socialRecRequestState2, false, false, false, false, false, false, friendList, 0, 0, false, 959, null);
                    }
                });
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.relation.viewmodel.SocialRecRequestViewModel$n */
    public static final class C67071n<T, R> implements AbstractC88434g {

        /* renamed from: a */
        final /* synthetic */ SocialRecRequestViewModel f150449a;

        /* renamed from: b */
        final /* synthetic */ String f150450b;

        /* renamed from: c */
        final /* synthetic */ int f150451c;

        static {
            Covode.recordClassIndex(78653);
        }

        C67071n(SocialRecRequestViewModel socialRecRequestViewModel, String str, int i) {
            this.f150449a = socialRecRequestViewModel;
            this.f150450b = str;
            this.f150451c = i;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88434g
        public final /* synthetic */ Object apply(Object obj) {
            C89219l.m154721d(obj, "");
            this.f150449a.mo33689c(C670721.f150452a);
            this.f150449a.f150419b = true;
            return AbstractC51474a.m95881a().getSocialFriendsWithScene("facebook", C79519c.C79521b.f178476a.mo86987a(this.f150450b), null, Long.valueOf(C79519c.C79521b.f178476a.mo86995d(this.f150450b)), Integer.valueOf(this.f150451c));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.relation.viewmodel.SocialRecRequestViewModel$o */
    public static final class C67073o<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ SocialRecRequestViewModel f150453a;

        static {
            Covode.recordClassIndex(78655);
        }

        C67073o(SocialRecRequestViewModel socialRecRequestViewModel) {
            this.f150453a = socialRecRequestViewModel;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            List friends;
            final FriendList friendList = (FriendList) obj;
            if (friendList == null || (friends = friendList.getFriends()) == null || friends.isEmpty()) {
                this.f150453a.mo33689c(C670741.f150454a);
            } else {
                this.f150453a.mo33689c(new AbstractC89172b<SocialRecRequestState, SocialRecRequestState>() {
                    /* class com.p2082ss.android.ugc.aweme.relation.viewmodel.SocialRecRequestViewModel.C67073o.C670752 */

                    static {
                        Covode.recordClassIndex(78657);
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    @Override // p4600h.p4611f.p4612a.AbstractC89172b
                    public final /* synthetic */ SocialRecRequestState invoke(SocialRecRequestState socialRecRequestState) {
                        SocialRecRequestState socialRecRequestState2 = socialRecRequestState;
                        C89219l.m154721d(socialRecRequestState2, "");
                        return SocialRecRequestState.copy$default(socialRecRequestState2, false, false, false, false, false, false, friendList, 0, 0, false, 959, null);
                    }
                });
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.relation.viewmodel.SocialRecRequestViewModel$v */
    public static final class C67092v<T, R> implements AbstractC88434g {

        /* renamed from: a */
        final /* synthetic */ AbstractC74739d f150474a;

        static {
            Covode.recordClassIndex(78674);
        }

        C67092v(AbstractC74739d dVar) {
            this.f150474a = dVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88434g
        public final /* synthetic */ Object apply(Object obj) {
            List list = (List) obj;
            C89219l.m154721d(list, "");
            if (!C13603b.m24435a((Collection) list)) {
                return C51519c.m95981a(list, this.f150474a, 4);
            }
            AbstractC88979t b = AbstractC88979t.m154310b(new C66823a());
            C89219l.m154716b(b, "");
            return b;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.relation.viewmodel.SocialRecRequestViewModel$x */
    public static final class C67094x<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ SocialRecRequestViewModel f150476a;

        static {
            Covode.recordClassIndex(78676);
        }

        C67094x(SocialRecRequestViewModel socialRecRequestViewModel) {
            this.f150476a = socialRecRequestViewModel;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            List friends;
            FriendList friendList = (FriendList) obj;
            if (!(friendList == null || (friends = friendList.getFriends()) == null || !(!friends.isEmpty()))) {
                this.f150476a.mo33689c(C670951.f150477a);
            }
            this.f150476a.mo33689c(C670962.f150478a);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.relation.viewmodel.SocialRecRequestViewModel$d */
    public static final class C67048d<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ SocialRecRequestViewModel f150423a;

        /* renamed from: b */
        final /* synthetic */ boolean f150424b;

        static {
            Covode.recordClassIndex(78630);
        }

        C67048d(SocialRecRequestViewModel socialRecRequestViewModel, boolean z) {
            this.f150423a = socialRecRequestViewModel;
            this.f150424b = z;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            List friends;
            List friends2;
            final FriendList friendList = (FriendList) obj;
            if (this.f150424b) {
                if (!(friendList == null || (friends2 = friendList.getFriends()) == null || !(!friends2.isEmpty()))) {
                    this.f150423a.mo33689c(C670491.f150425a);
                }
                this.f150423a.mo33689c(C670502.f150426a);
            } else if (friendList == null || (friends = friendList.getFriends()) == null || friends.isEmpty()) {
                this.f150423a.mo33689c(C670513.f150427a);
            } else {
                this.f150423a.mo33689c(new AbstractC89172b<SocialRecRequestState, SocialRecRequestState>() {
                    /* class com.p2082ss.android.ugc.aweme.relation.viewmodel.SocialRecRequestViewModel.C67048d.C670524 */

                    static {
                        Covode.recordClassIndex(78634);
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    @Override // p4600h.p4611f.p4612a.AbstractC89172b
                    public final /* synthetic */ SocialRecRequestState invoke(SocialRecRequestState socialRecRequestState) {
                        SocialRecRequestState socialRecRequestState2 = socialRecRequestState;
                        C89219l.m154721d(socialRecRequestState2, "");
                        return SocialRecRequestState.copy$default(socialRecRequestState2, false, false, false, false, false, false, friendList, 0, 0, false, 959, null);
                    }
                });
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.relation.viewmodel.SocialRecRequestViewModel$t */
    public static final class C67081t<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ SocialRecRequestViewModel f150461a;

        /* renamed from: b */
        final /* synthetic */ String f150462b;

        static {
            Covode.recordClassIndex(78663);
        }

        C67081t(SocialRecRequestViewModel socialRecRequestViewModel, String str) {
            this.f150461a = socialRecRequestViewModel;
            this.f150462b = str;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            C79546d dVar = (C79546d) obj;
            if (dVar.f178517b.f178518a && dVar.f178516a == EnumC79549g.SYNC_STATUS) {
                this.f150461a.mo33689c(C670821.f150463a);
                this.f150461a.f150419b = true;
                String a = C79519c.C79521b.f178476a.mo86987a(this.f150462b);
                long d = C79519c.C79521b.f178476a.mo86995d(this.f150462b);
                SocialRecRequestViewModel socialRecRequestViewModel = this.f150461a;
                AbstractC88412b a2 = AbstractC51474a.m95881a().getSocialFriendsWithScene("facebook", a, null, Long.valueOf(d), 4).mo143304h(5, TimeUnit.SECONDS).mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143254a(new AbstractC88433f(this) {
                    /* class com.p2082ss.android.ugc.aweme.relation.viewmodel.SocialRecRequestViewModel.C67081t.C670832 */

                    /* renamed from: a */
                    final /* synthetic */ C67081t f150464a;

                    static {
                        Covode.recordClassIndex(78665);
                    }

                    {
                        this.f150464a = r1;
                    }

                    @Override // p4560f.p4561a.p4567d.AbstractC88433f
                    public final /* synthetic */ void accept(Object obj) {
                        List friends;
                        FriendList friendList = (FriendList) obj;
                        if (!(friendList == null || (friends = friendList.getFriends()) == null || !(!friends.isEmpty()))) {
                            this.f150464a.f150461a.mo33689c(C670841.f150465a);
                        }
                        this.f150464a.f150461a.mo33689c(C670852.f150466a);
                    }
                }, new AbstractC88433f(this) {
                    /* class com.p2082ss.android.ugc.aweme.relation.viewmodel.SocialRecRequestViewModel.C67081t.C670863 */

                    /* renamed from: a */
                    final /* synthetic */ C67081t f150467a;

                    static {
                        Covode.recordClassIndex(78668);
                    }

                    {
                        this.f150467a = r1;
                    }

                    @Override // p4560f.p4561a.p4567d.AbstractC88433f
                    public final /* synthetic */ void accept(Object obj) {
                        this.f150467a.f150461a.mo33689c(C670871.f150468a);
                    }
                });
                C89219l.m154716b(a2, "");
                socialRecRequestViewModel.mo33680a(a2);
                AbstractC88412b bVar = this.f150461a.f150418a;
                if (bVar != null) {
                    bVar.dispose();
                }
                this.f150461a.f150418a = null;
            } else if (dVar.f178516a == EnumC79549g.REQUEST_ACTUAL_PERMISSION) {
                if (!dVar.f178517b.f178518a) {
                    AbstractC88412b bVar2 = this.f150461a.f150418a;
                    if (bVar2 != null) {
                        bVar2.dispose();
                    }
                    this.f150461a.f150418a = null;
                    this.f150461a.mo33689c(C670884.f150469a);
                }
            } else if (dVar.f178516a == EnumC79549g.REQUEST_UID_PERMISSION && !dVar.f178517b.f178518a) {
                AbstractC88412b bVar3 = this.f150461a.f150418a;
                if (bVar3 != null) {
                    bVar3.dispose();
                }
                this.f150461a.f150418a = null;
                this.f150461a.mo33689c(C670895.f150470a);
            }
        }
    }

    /* renamed from: a */
    private final void m118743a(String str) {
        m118747b();
        int a = C66870b.m118583a();
        AbstractC88412b a2 = AbstractC51474a.m95881a().getSocialFriendsWithScene("facebook", C79519c.C79521b.f178476a.mo86987a(str), null, Long.valueOf(C79519c.C79521b.f178476a.mo86995d(str)), Integer.valueOf(a)).mo143304h(5, TimeUnit.SECONDS).mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143254a(new C67055f(this), new C67058g(this));
        C89219l.m154716b(a2, "");
        mo33680a(a2);
    }

    /* renamed from: a */
    private final void m118746a(boolean z) {
        int a;
        m118747b();
        if (z) {
            a = 4;
        } else {
            a = C66870b.m118583a();
        }
        C74740e eVar = C74740e.f167996b;
        UUID randomUUID = UUID.randomUUID();
        C89219l.m154716b(randomUUID, "");
        AbstractC74739d a2 = eVar.mo117778a(a, randomUUID);
        AbstractC88412b a3 = C66870b.m118586a(a2, true).mo143267a((AbstractC88434g<? super List<ContactModelV2>, ? extends AbstractC88984x<? extends R>>) new C67046b(a2, a), false).mo143292d(C67047c.f150422a).mo143304h(5, TimeUnit.SECONDS).mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143254a(new C67048d(this, z), new C67053e(this));
        C89219l.m154716b(a3, "");
        mo33680a(a3);
    }

    /* renamed from: a */
    private final void m118744a(String str, int i) {
        if (i == EnumC66892b.NEW_VERSION_FACEBOOK.getValue()) {
            Activity j = C17873f.m33102j();
            if (j != null) {
                User b = C80580in.m139683b();
                C89219l.m154716b(b, "");
                this.f150418a = C79515b.m138227a(j, C79496a.class, b.getUid(), "version_update", "auto", false).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143289d(new C67081t(this, str));
                return;
            }
            return;
        }
        C51488a.m95930b("version_update", "user", "contact", "auto", "uid", "process", null);
        C79519c.C79520a.m138231a(true);
        C74740e eVar = C74740e.f167996b;
        UUID randomUUID = UUID.randomUUID();
        C89219l.m154716b(randomUUID, "");
        AbstractC74739d a = eVar.mo117778a(4, randomUUID);
        AbstractC88412b a2 = AbstractC51474a.m95881a().syncSocialRelationStatusInRx(1, true).mo143267a((AbstractC88434g<? super BaseResponse, ? extends AbstractC88984x<? extends R>>) new C67090u(this, a), false).mo143267a((AbstractC88434g<? super R, ? extends AbstractC88984x<? extends R>>) new C67092v(a), false).mo143292d(C67093w.f150475a).mo143304h(5, TimeUnit.SECONDS).mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143254a(new C67094x(this), new C67097y(this));
        C89219l.m154716b(a2, "");
        mo33680a(a2);
    }

    /* renamed from: a */
    private final void m118745a(String str, String str2) {
        m118747b();
        C51488a.m95930b("login_onboarding", "user", "facebook", "login", "uid", str2, null);
        int a = C66870b.m118583a();
        C79519c.C79521b.f178476a.mo86990a(true);
        AbstractC88412b a2 = AbstractC51474a.m95881a().syncSocialRelationStatusInRx(2, true).mo143267a((AbstractC88434g<? super BaseResponse, ? extends AbstractC88984x<? extends R>>) new C67071n(this, str, a), false).mo143304h(5, TimeUnit.SECONDS).mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143254a(new C67073o(this), new C67076p(this));
        C89219l.m154716b(a2, "");
        mo33680a(a2);
    }
}
