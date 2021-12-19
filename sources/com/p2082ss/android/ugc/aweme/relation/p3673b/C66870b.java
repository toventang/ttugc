package com.p2082ss.android.ugc.aweme.relation.p3673b;

import android.app.Activity;
import androidx.fragment.app.ActivityC0945e;
import com.bytedance.common.utility.collection.C13603b;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerpermissions.C17770j;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.ies.ugc.appcontext.C17879g;
import com.p2082ss.android.sdk.p2174a.C30223b;
import com.p2082ss.android.ugc.aweme.IAccountUserService;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;
import com.p2082ss.android.ugc.aweme.experiment.C46978gk;
import com.p2082ss.android.ugc.aweme.friends.AbstractC51485d;
import com.p2082ss.android.ugc.aweme.friends.api.AbstractC51474a;
import com.p2082ss.android.ugc.aweme.friends.model.ContactModelV2;
import com.p2082ss.android.ugc.aweme.friends.model.Friend;
import com.p2082ss.android.ugc.aweme.friends.model.FriendList;
import com.p2082ss.android.ugc.aweme.friends.p3015e.C51488a;
import com.p2082ss.android.ugc.aweme.friends.p3019i.C51519c;
import com.p2082ss.android.ugc.aweme.friends.service.C51648a;
import com.p2082ss.android.ugc.aweme.profile.model.SocialDataStruct;
import com.p2082ss.android.ugc.aweme.profile.model.SocialPlatformSetting;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.relation.C66823a;
import com.p2082ss.android.ugc.aweme.relation.C66865b;
import com.p2082ss.android.ugc.aweme.relation.EnumC66889c;
import com.p2082ss.android.ugc.aweme.relation.p3672a.C66824a;
import com.p2082ss.android.ugc.aweme.relation.p3674c.C66893c;
import com.p2082ss.android.ugc.aweme.relation.p3674c.EnumC66892b;
import com.p2082ss.android.ugc.aweme.relation.recommend.C66994m;
import com.p2082ss.android.ugc.aweme.social.monitor.AbstractC74739d;
import com.p2082ss.android.ugc.aweme.social.monitor.C74740e;
import com.p2082ss.android.ugc.aweme.ufr.C79519c;
import com.p2082ss.android.ugc.aweme.utils.C80241be;
import com.p2082ss.android.ugc.aweme.utils.C80580in;
import com.p2082ss.android.ugc.trill.R;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.AbstractC88982v;
import p4560f.p4561a.AbstractC88983w;
import p4560f.p4561a.AbstractC88984x;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4567d.AbstractC88434g;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89378p;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.relation.b.b */
public final class C66870b {

    /* renamed from: a */
    public static final C66870b f150146a = new C66870b();

    /* renamed from: com.ss.android.ugc.aweme.relation.b.b$c */
    public static final class C66873c implements AbstractC66875d {

        /* renamed from: a */
        public static final C66874a f150147a = new C66874a((byte) 0);

        static {
            Covode.recordClassIndex(78448);
        }

        @Override // com.p2082ss.android.ugc.aweme.relation.p3673b.C66870b.AbstractC66875d
        /* renamed from: c */
        public final int mo105819c() {
            return 2;
        }

        /* renamed from: com.ss.android.ugc.aweme.relation.b.b$c$a */
        public static final class C66874a {
            static {
                Covode.recordClassIndex(78449);
            }

            private C66874a() {
            }

            public /* synthetic */ C66874a(byte b) {
                this();
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.relation.p3673b.C66870b.AbstractC66875d
        /* renamed from: b */
        public final boolean mo105818b() {
            int i;
            List<SocialPlatformSetting> socialPlatformSettings;
            IAccountUserService g = C31575b.m65865g();
            C89219l.m154716b(g, "");
            User curUser = g.getCurUser();
            C89219l.m154716b(curUser, "");
            SocialDataStruct socialData = curUser.getSocialData();
            if (socialData != null && (socialPlatformSettings = socialData.getSocialPlatformSettings()) != null) {
                Iterator<SocialPlatformSetting> it = socialPlatformSettings.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    SocialPlatformSetting next = it.next();
                    if (next.getSocialPlatform() == 2) {
                        i = next.getOnBoardingRecStrategy();
                        break;
                    }
                }
            }
            i = 0;
            return C66888c.m118626b(i);
        }

        @Override // com.p2082ss.android.ugc.aweme.relation.p3673b.C66870b.AbstractC66875d
        /* renamed from: a */
        public final C89378p<Boolean, Boolean> mo105815a() {
            List<SocialPlatformSetting> socialPlatformSettings;
            IAccountUserService g = C31575b.m65865g();
            C89219l.m154716b(g, "");
            User curUser = g.getCurUser();
            C89219l.m154716b(curUser, "");
            SocialDataStruct socialData = curUser.getSocialData();
            boolean z = true;
            if (!(socialData == null || (socialPlatformSettings = socialData.getSocialPlatformSettings()) == null)) {
                for (SocialPlatformSetting socialPlatformSetting : socialPlatformSettings) {
                    if (socialPlatformSetting.getSocialPlatform() == 2) {
                        if (socialPlatformSetting.getSyncStatus() || !socialPlatformSetting.getDisplayConsentPage()) {
                            z = false;
                        }
                        return new C89378p<>(Boolean.valueOf(z), Boolean.valueOf(socialPlatformSetting.getSyncStatus()));
                    }
                }
            }
            return new C89378p<>(true, true);
        }

        @Override // com.p2082ss.android.ugc.aweme.relation.p3673b.C66870b.AbstractC66875d
        /* renamed from: a */
        public final boolean mo105817a(EnumC66889c cVar) {
            boolean z;
            C89219l.m154721d(cVar, "");
            int e = C66870b.m118594e(2);
            if (cVar.getType() != EnumC66889c.TRIGGER_IN_JOURNEY_FRONT.getType() || !C66888c.m118628d(e)) {
                z = true;
            } else {
                z = false;
            }
            if (cVar.getType() != EnumC66889c.TRIGGER_IN_JOURNEY_BACK.getType() || !C66888c.m118627c(e)) {
                return z;
            }
            return false;
        }

        @Override // com.p2082ss.android.ugc.aweme.relation.p3673b.C66870b.AbstractC66875d
        /* renamed from: a */
        public final boolean mo105816a(ActivityC0945e eVar) {
            C89219l.m154721d(eVar, "");
            if (!C66888c.m118625a(C66870b.m118594e(2))) {
                return false;
            }
            IAccountUserService g = C31575b.m65865g();
            C89219l.m154716b(g, "");
            if (!g.isLogin() || C80580in.m139691e()) {
                return false;
            }
            C31575b.m65859a();
            if ((!C89219l.m154714a((Object) C31575b.f75524a.mo57075k().getLatestLoginMethodName(), (Object) "facebook")) || !C30223b.f72086a.mo53668a("facebook")) {
                return false;
            }
            AbstractC51485d g2 = C51648a.f118980a.mo87327g();
            IAccountUserService g3 = C31575b.m65865g();
            C89219l.m154716b(g3, "");
            if (g2.mo86987a(g3.getCurUserId()).length() != 0 && C66870b.m118589b(2)) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.relation.b.b$d */
    public interface AbstractC66875d {
        static {
            Covode.recordClassIndex(78450);
        }

        /* renamed from: a */
        C89378p<Boolean, Boolean> mo105815a();

        /* renamed from: a */
        boolean mo105816a(ActivityC0945e eVar);

        /* renamed from: a */
        boolean mo105817a(EnumC66889c cVar);

        /* renamed from: b */
        boolean mo105818b();

        /* renamed from: c */
        int mo105819c();
    }

    /* renamed from: com.ss.android.ugc.aweme.relation.b.b$e */
    public static final class C66876e implements AbstractC66875d {

        /* renamed from: a */
        public static final C66877a f150148a = new C66877a((byte) 0);

        /* renamed from: b */
        private final AbstractC89244h f150149b = C89250i.m154773a((AbstractC89171a) C66878b.f150150a);

        static {
            Covode.recordClassIndex(78451);
        }

        /* renamed from: d */
        private final int m118619d() {
            return ((Number) this.f150149b.getValue()).intValue();
        }

        @Override // com.p2082ss.android.ugc.aweme.relation.p3673b.C66870b.AbstractC66875d
        /* renamed from: a */
        public final boolean mo105817a(EnumC66889c cVar) {
            C89219l.m154721d(cVar, "");
            return false;
        }

        @Override // com.p2082ss.android.ugc.aweme.relation.p3673b.C66870b.AbstractC66875d
        /* renamed from: c */
        public final int mo105819c() {
            return 3;
        }

        /* renamed from: com.ss.android.ugc.aweme.relation.b.b$e$a */
        public static final class C66877a {
            static {
                Covode.recordClassIndex(78452);
            }

            private C66877a() {
            }

            public /* synthetic */ C66877a(byte b) {
                this();
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.relation.b.b$e$b */
        static final class C66878b extends AbstractC89220m implements AbstractC89171a<Integer> {

            /* renamed from: a */
            public static final C66878b f150150a = new C66878b();

            static {
                Covode.recordClassIndex(78453);
            }

            C66878b() {
                super(0);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // p4600h.p4611f.p4612a.AbstractC89171a
            public final /* synthetic */ Integer invoke() {
                return Integer.valueOf(C66865b.m118574b());
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.relation.p3673b.C66870b.AbstractC66875d
        /* renamed from: b */
        public final boolean mo105818b() {
            int d = m118619d();
            if (2 <= d && 3 >= d) {
                return true;
            }
            return false;
        }

        @Override // com.p2082ss.android.ugc.aweme.relation.p3673b.C66870b.AbstractC66875d
        /* renamed from: a */
        public final C89378p<Boolean, Boolean> mo105815a() {
            boolean z;
            if (C66865b.m118575c() || C66865b.m118576d()) {
                z = true;
            } else {
                z = false;
            }
            return new C89378p<>(Boolean.valueOf(z), false);
        }

        @Override // com.p2082ss.android.ugc.aweme.relation.p3673b.C66870b.AbstractC66875d
        /* renamed from: a */
        public final boolean mo105816a(ActivityC0945e eVar) {
            C89219l.m154721d(eVar, "");
            if (C66865b.m118578f()) {
                return false;
            }
            if (m118619d() <= 1) {
                m118619d();
                return false;
            }
            IAccountUserService g = C31575b.m65865g();
            C89219l.m154716b(g, "");
            if (g.isLogin() && !C80580in.m139691e() && !C66865b.m118579g()) {
                return true;
            }
            return false;
        }
    }

    private C66870b() {
    }

    /* renamed from: com.ss.android.ugc.aweme.relation.b.b$b */
    public static final class C66872b implements AbstractC66875d {
        static {
            Covode.recordClassIndex(78447);
        }

        @Override // com.p2082ss.android.ugc.aweme.relation.p3673b.C66870b.AbstractC66875d
        /* renamed from: a */
        public final boolean mo105816a(ActivityC0945e eVar) {
            C89219l.m154721d(eVar, "");
            return false;
        }

        @Override // com.p2082ss.android.ugc.aweme.relation.p3673b.C66870b.AbstractC66875d
        /* renamed from: a */
        public final boolean mo105817a(EnumC66889c cVar) {
            C89219l.m154721d(cVar, "");
            return true;
        }

        @Override // com.p2082ss.android.ugc.aweme.relation.p3673b.C66870b.AbstractC66875d
        /* renamed from: b */
        public final boolean mo105818b() {
            return false;
        }

        @Override // com.p2082ss.android.ugc.aweme.relation.p3673b.C66870b.AbstractC66875d
        /* renamed from: c */
        public final int mo105819c() {
            return 0;
        }

        @Override // com.p2082ss.android.ugc.aweme.relation.p3673b.C66870b.AbstractC66875d
        /* renamed from: a */
        public final C89378p<Boolean, Boolean> mo105815a() {
            return new C89378p<>(true, true);
        }
    }

    static {
        Covode.recordClassIndex(78445);
    }

    /* renamed from: a */
    public static int m118583a() {
        IAccountUserService g = C31575b.m65865g();
        C89219l.m154716b(g, "");
        if (g.isNewUser()) {
            return 2;
        }
        return 3;
    }

    /* renamed from: com.ss.android.ugc.aweme.relation.b.b$a */
    public static final class C66871a implements AbstractC66875d {
        static {
            Covode.recordClassIndex(78446);
        }

        @Override // com.p2082ss.android.ugc.aweme.relation.p3673b.C66870b.AbstractC66875d
        /* renamed from: c */
        public final int mo105819c() {
            return 1;
        }

        @Override // com.p2082ss.android.ugc.aweme.relation.p3673b.C66870b.AbstractC66875d
        /* renamed from: b */
        public final boolean mo105818b() {
            int i;
            List<SocialPlatformSetting> socialPlatformSettings;
            IAccountUserService g = C31575b.m65865g();
            C89219l.m154716b(g, "");
            User curUser = g.getCurUser();
            C89219l.m154716b(curUser, "");
            SocialDataStruct socialData = curUser.getSocialData();
            if (socialData != null && (socialPlatformSettings = socialData.getSocialPlatformSettings()) != null) {
                Iterator<SocialPlatformSetting> it = socialPlatformSettings.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    SocialPlatformSetting next = it.next();
                    if (next.getSocialPlatform() == 1) {
                        i = next.getOnBoardingRecStrategy();
                        break;
                    }
                }
            }
            i = 0;
            return C66888c.m118626b(i);
        }

        @Override // com.p2082ss.android.ugc.aweme.relation.p3673b.C66870b.AbstractC66875d
        /* renamed from: a */
        public final C89378p<Boolean, Boolean> mo105815a() {
            List<SocialPlatformSetting> socialPlatformSettings;
            IAccountUserService g = C31575b.m65865g();
            C89219l.m154716b(g, "");
            User curUser = g.getCurUser();
            C89219l.m154716b(curUser, "");
            SocialDataStruct socialData = curUser.getSocialData();
            if (!(socialData == null || (socialPlatformSettings = socialData.getSocialPlatformSettings()) == null)) {
                for (SocialPlatformSetting socialPlatformSetting : socialPlatformSettings) {
                    if (socialPlatformSetting.getSocialPlatform() == 1) {
                        return new C89378p<>(Boolean.valueOf(!C79519c.C79520a.f178475a.mo86984c()), Boolean.valueOf(socialPlatformSetting.getSyncStatus()));
                    }
                }
            }
            return new C89378p<>(true, true);
        }

        @Override // com.p2082ss.android.ugc.aweme.relation.p3673b.C66870b.AbstractC66875d
        /* renamed from: a */
        public final boolean mo105816a(ActivityC0945e eVar) {
            C89219l.m154721d(eVar, "");
            if (!C66888c.m118625a(C66870b.m118594e(1))) {
                return false;
            }
            IAccountUserService g = C31575b.m65865g();
            C89219l.m154716b(g, "");
            if (g.isLogin() && !C80580in.m139691e() && C66870b.m118589b(1) && !C17770j.m32954a((Activity) eVar, "android.permission.READ_CONTACTS")) {
                return true;
            }
            return false;
        }

        @Override // com.p2082ss.android.ugc.aweme.relation.p3673b.C66870b.AbstractC66875d
        /* renamed from: a */
        public final boolean mo105817a(EnumC66889c cVar) {
            C89219l.m154721d(cVar, "");
            boolean z = true;
            int e = C66870b.m118594e(1);
            if (cVar.getType() == EnumC66889c.TRIGGER_IN_JOURNEY_FRONT.getType() && C66888c.m118628d(e)) {
                z = false;
            }
            if (cVar.getType() != EnumC66889c.TRIGGER_IN_JOURNEY_BACK.getType() || !C66888c.m118627c(e)) {
                return z;
            }
            return false;
        }
    }

    /* renamed from: b */
    private static AbstractC88979t<FriendList<Friend>> m118587b() {
        int a = m118583a();
        C79519c.C79521b bVar = C79519c.C79521b.f178476a;
        IAccountUserService g = C31575b.m65865g();
        C89219l.m154716b(g, "");
        String a2 = bVar.mo86987a(g.getCurUserId());
        C79519c.C79521b bVar2 = C79519c.C79521b.f178476a;
        IAccountUserService g2 = C31575b.m65865g();
        C89219l.m154716b(g2, "");
        AbstractC88979t<FriendList<Friend>> a3 = AbstractC51474a.m95881a().getSocialFriendsWithScene("facebook", a2, null, Long.valueOf(bVar2.mo86995d(g2.getCurUserId())), Integer.valueOf(a)).mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143261a(C88391a.m153580a(C88392a.f200660a));
        C89219l.m154716b(a3, "");
        return a3;
    }

    /* renamed from: c */
    private static AbstractC88979t<FriendList<Friend>> m118591c() {
        C51488a.m95930b("login_onboarding", "user", "facebook", "login", "uid", "auto", null);
        int a = m118583a();
        C79519c.C79521b.f178476a.mo86990a(true);
        AbstractC88979t<R> a2 = AbstractC51474a.m95881a().syncSocialRelationStatusInRx(2, true).mo143267a((AbstractC88434g<? super BaseResponse, ? extends AbstractC88984x<? extends R>>) new C66886m(a), false).mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143261a(C88391a.m153580a(C88392a.f200660a));
        C89219l.m154716b(a2, "");
        return a2;
    }

    /* renamed from: d */
    private static AbstractC88979t<FriendList<Friend>> m118593d() {
        int a = m118583a();
        C74740e eVar = C74740e.f167996b;
        int a2 = m118583a();
        UUID randomUUID = UUID.randomUUID();
        C89219l.m154716b(randomUUID, "");
        AbstractC74739d a3 = eVar.mo117778a(a2, randomUUID);
        AbstractC88979t<R> a4 = m118586a(a3, true).mo143267a((AbstractC88434g<? super List<ContactModelV2>, ? extends AbstractC88984x<? extends R>>) new C66880g(a3, a), false).mo143292d(C66881h.f150155a).mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143261a(C88391a.m153580a(C88392a.f200660a));
        C89219l.m154716b(a4, "");
        return a4;
    }

    /* renamed from: e */
    private static AbstractC88979t<FriendList<Friend>> m118595e() {
        int a = m118583a();
        C79519c.C79520a.m138231a(true);
        C74740e eVar = C74740e.f167996b;
        int a2 = m118583a();
        UUID randomUUID = UUID.randomUUID();
        C89219l.m154716b(randomUUID, "");
        AbstractC74739d a3 = eVar.mo117778a(a2, randomUUID);
        AbstractC88979t<R> a4 = AbstractC51474a.m95881a().syncSocialRelationStatusInRx(1, true).mo143267a((AbstractC88434g<? super BaseResponse, ? extends AbstractC88984x<? extends R>>) new C66883j(a3), false).mo143267a((AbstractC88434g<? super R, ? extends AbstractC88984x<? extends R>>) new C66884k(a3, a), false).mo143292d(C66885l.f150160a).mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143261a(C88391a.m153580a(C88392a.f200660a));
        C89219l.m154716b(a4, "");
        return a4;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.relation.b.b$i */
    public static final class C66882i<T> implements AbstractC88983w {

        /* renamed from: a */
        public static final C66882i f150156a = new C66882i();

        static {
            Covode.recordClassIndex(78457);
        }

        C66882i() {
        }

        @Override // p4560f.p4561a.AbstractC88983w
        public final void subscribe(AbstractC88982v<FriendList<Friend>> vVar) {
            C89219l.m154721d(vVar, "");
            vVar.mo143024a(new Exception("social platform not support!"));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.relation.b.b$n */
    public static final class C66887n<T> implements AbstractC88983w {

        /* renamed from: a */
        public static final C66887n f150162a = new C66887n();

        static {
            Covode.recordClassIndex(78462);
        }

        C66887n() {
        }

        @Override // p4560f.p4561a.AbstractC88983w
        public final void subscribe(AbstractC88982v<FriendList<Friend>> vVar) {
            C89219l.m154721d(vVar, "");
            vVar.mo143024a(new Exception("social platform not support!"));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.relation.b.b$f */
    public static final class C66879f<T> implements AbstractC88983w {

        /* renamed from: a */
        final /* synthetic */ AbstractC74739d f150151a;

        /* renamed from: b */
        final /* synthetic */ boolean f150152b;

        static {
            Covode.recordClassIndex(78454);
        }

        C66879f(AbstractC74739d dVar, boolean z) {
            this.f150151a = dVar;
            this.f150152b = z;
        }

        @Override // p4560f.p4561a.AbstractC88983w
        public final void subscribe(AbstractC88982v<List<ContactModelV2>> vVar) {
            C89219l.m154721d(vVar, "");
            this.f150151a.mo117782a();
            List<ContactModelV2> a = C80241be.m139077a(C17867d.m33078a(), this.f150151a, this.f150152b);
            C89219l.m154716b(a, "");
            vVar.mo143031a(a);
            vVar.mo143023a();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.relation.b.b$h */
    public static final class C66881h<T, R> implements AbstractC88434g {

        /* renamed from: a */
        public static final C66881h f150155a = new C66881h();

        static {
            Covode.recordClassIndex(78456);
        }

        C66881h() {
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88434g
        public final /* synthetic */ Object apply(Object obj) {
            C66823a aVar = (C66823a) obj;
            C89219l.m154721d(aVar, "");
            FriendList friendList = new FriendList();
            friendList.setFriends(aVar.f150074a);
            friendList.setLogPbBean(aVar.f150075b);
            return friendList;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.relation.b.b$j */
    public static final class C66883j<T, R> implements AbstractC88434g {

        /* renamed from: a */
        final /* synthetic */ AbstractC74739d f150157a;

        static {
            Covode.recordClassIndex(78458);
        }

        C66883j(AbstractC74739d dVar) {
            this.f150157a = dVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88434g
        public final /* synthetic */ Object apply(Object obj) {
            C89219l.m154721d(obj, "");
            this.f150157a.mo117782a();
            return C66870b.m118586a(this.f150157a, true);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.relation.b.b$l */
    public static final class C66885l<T, R> implements AbstractC88434g {

        /* renamed from: a */
        public static final C66885l f150160a = new C66885l();

        static {
            Covode.recordClassIndex(78460);
        }

        C66885l() {
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88434g
        public final /* synthetic */ Object apply(Object obj) {
            C66823a aVar = (C66823a) obj;
            C89219l.m154721d(aVar, "");
            FriendList friendList = new FriendList();
            friendList.setFriends(aVar.f150074a);
            friendList.setLogPbBean(aVar.f150075b);
            return friendList;
        }
    }

    /* renamed from: f */
    private final AbstractC88979t<FriendList<Friend>> m118596f(int i) {
        if (i == 1) {
            return m118593d();
        }
        if (i == 2) {
            return m118587b();
        }
        AbstractC88979t<FriendList<Friend>> a = AbstractC88979t.m154294a(C66882i.f150156a);
        C89219l.m154716b(a, "");
        return a;
    }

    /* renamed from: g */
    private static AbstractC88979t<FriendList<Friend>> m118597g(int i) {
        if (i == 1) {
            return m118595e();
        }
        if (i == 2) {
            return m118591c();
        }
        AbstractC88979t<FriendList<Friend>> a = AbstractC88979t.m154294a(C66887n.f150162a);
        C89219l.m154716b(a, "");
        return a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.relation.b.b$g */
    public static final class C66880g<T, R> implements AbstractC88434g {

        /* renamed from: a */
        final /* synthetic */ AbstractC74739d f150153a;

        /* renamed from: b */
        final /* synthetic */ int f150154b;

        static {
            Covode.recordClassIndex(78455);
        }

        C66880g(AbstractC74739d dVar, int i) {
            this.f150153a = dVar;
            this.f150154b = i;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88434g
        public final /* synthetic */ Object apply(Object obj) {
            List list = (List) obj;
            C89219l.m154721d(list, "");
            if (!C13603b.m24435a((Collection) list)) {
                return C51519c.m95981a(list, this.f150153a, this.f150154b);
            }
            AbstractC88979t b = AbstractC88979t.m154310b(new C66823a());
            C89219l.m154716b(b, "");
            return b;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.relation.b.b$k */
    public static final class C66884k<T, R> implements AbstractC88434g {

        /* renamed from: a */
        final /* synthetic */ AbstractC74739d f150158a;

        /* renamed from: b */
        final /* synthetic */ int f150159b;

        static {
            Covode.recordClassIndex(78459);
        }

        C66884k(AbstractC74739d dVar, int i) {
            this.f150158a = dVar;
            this.f150159b = i;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88434g
        public final /* synthetic */ Object apply(Object obj) {
            List list = (List) obj;
            C89219l.m154721d(list, "");
            if (!C13603b.m24435a((Collection) list)) {
                return C51519c.m95981a(list, this.f150158a, this.f150159b);
            }
            AbstractC88979t b = AbstractC88979t.m154310b(new C66823a());
            C89219l.m154716b(b, "");
            return b;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.relation.b.b$m */
    public static final class C66886m<T, R> implements AbstractC88434g {

        /* renamed from: a */
        final /* synthetic */ int f150161a;

        static {
            Covode.recordClassIndex(78461);
        }

        C66886m(int i) {
            this.f150161a = i;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88434g
        public final /* synthetic */ Object apply(Object obj) {
            C89219l.m154721d(obj, "");
            C79519c.C79521b bVar = C79519c.C79521b.f178476a;
            IAccountUserService g = C31575b.m65865g();
            C89219l.m154716b(g, "");
            String a = bVar.mo86987a(g.getCurUserId());
            C79519c.C79521b bVar2 = C79519c.C79521b.f178476a;
            IAccountUserService g2 = C31575b.m65865g();
            C89219l.m154716b(g2, "");
            return AbstractC51474a.m95881a().getSocialFriendsWithScene("facebook", a, null, Long.valueOf(bVar2.mo86995d(g2.getCurUserId())), Integer.valueOf(this.f150161a));
        }
    }

    /* renamed from: a */
    public static AbstractC66875d m118585a(int i) {
        if (i == 1) {
            return new C66871a();
        }
        if (i == 2) {
            return new C66873c();
        }
        if (i != 3) {
            return new C66872b();
        }
        return new C66876e();
    }

    /* renamed from: e */
    public static int m118594e(int i) {
        List<SocialPlatformSetting> socialPlatformSettings;
        IAccountUserService g = C31575b.m65865g();
        C89219l.m154716b(g, "");
        User curUser = g.getCurUser();
        C89219l.m154716b(curUser, "");
        SocialDataStruct socialData = curUser.getSocialData();
        if (!(socialData == null || (socialPlatformSettings = socialData.getSocialPlatformSettings()) == null)) {
            for (SocialPlatformSetting socialPlatformSetting : socialPlatformSettings) {
                if (socialPlatformSetting.getSocialPlatform() == i) {
                    return socialPlatformSetting.getOnBoardingRecStrategy();
                }
            }
        }
        return 0;
    }

    /* renamed from: b */
    public static boolean m118589b(int i) {
        C66893c a = C66893c.C66894a.m118637a();
        boolean z = a.f150175a.getBoolean("go_through_social_recommend_flow".concat(String.valueOf(i)), false);
        C66893c a2 = C66893c.C66894a.m118637a();
        long j = a2.f150175a.getLong("go_through_time_ms".concat(String.valueOf(i)), -1);
        if (!z || System.currentTimeMillis() > j + (((long) C46978gk.m90258a()) * 86400000)) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public static C66824a m118590c(int i) {
        if (i == 1) {
            String string = C17879g.m33106c().getString(R.string.bwv);
            C89219l.m154716b(string, "");
            String string2 = C17879g.m33106c().getString(R.string.bwt);
            C89219l.m154716b(string2, "");
            String string3 = C17879g.m33106c().getString(R.string.mj);
            C89219l.m154716b(string3, "");
            String string4 = C17879g.m33106c().getString(R.string.md);
            C89219l.m154716b(string4, "");
            String string5 = C17879g.m33106c().getString(R.string.me);
            C89219l.m154716b(string5, "");
            String string6 = C17879g.m33106c().getString(R.string.atd);
            C89219l.m154716b(string6, "");
            return new C66824a(1, string, R.drawable.a_2, string2, string3, string4, string5, string6, EnumC66892b.CONSENT.getValue());
        } else if (i != 2) {
            return null;
        } else {
            String string7 = C17879g.m33106c().getString(R.string.bwv);
            C89219l.m154716b(string7, "");
            String string8 = C17879g.m33106c().getString(R.string.mi);
            C89219l.m154716b(string8, "");
            String string9 = C17879g.m33106c().getString(R.string.mg);
            C89219l.m154716b(string9, "");
            String string10 = C17879g.m33106c().getString(R.string.md);
            C89219l.m154716b(string10, "");
            String string11 = C17879g.m33106c().getString(R.string.me);
            C89219l.m154716b(string11, "");
            String string12 = C17879g.m33106c().getString(R.string.gfn);
            C89219l.m154716b(string12, "");
            return new C66824a(2, string7, 2131232081, string8, string9, string10, string11, string12, EnumC66892b.CONSENT.getValue());
        }
    }

    /* renamed from: d */
    public static C66994m m118592d(int i) {
        if (i == 1) {
            String string = C17879g.m33106c().getString(R.string.bb);
            C89219l.m154716b(string, "");
            String string2 = C17879g.m33106c().getString(R.string.b_);
            C89219l.m154716b(string2, "");
            String string3 = C17879g.m33106c().getString(R.string.b9);
            C89219l.m154716b(string3, "");
            String string4 = C17879g.m33106c().getString(R.string.fqr);
            C89219l.m154716b(string4, "");
            return new C66994m(1, string, string2, string3, string4);
        } else if (i == 2) {
            String string5 = C17879g.m33106c().getString(R.string.bb);
            C89219l.m154716b(string5, "");
            String string6 = C17879g.m33106c().getString(R.string.b_);
            C89219l.m154716b(string6, "");
            String string7 = C17879g.m33106c().getString(R.string.b9);
            C89219l.m154716b(string7, "");
            String string8 = C17879g.m33106c().getString(R.string.cfo);
            C89219l.m154716b(string8, "");
            return new C66994m(2, string5, string6, string7, string8);
        } else if (i != 3) {
            return null;
        } else {
            String string9 = C17879g.m33106c().getString(R.string.bb);
            C89219l.m154716b(string9, "");
            String string10 = C17879g.m33106c().getString(R.string.b_);
            C89219l.m154716b(string10, "");
            String string11 = C17879g.m33106c().getString(R.string.baq);
            C89219l.m154716b(string11, "");
            String string12 = C17879g.m33106c().getString(R.string.cfo);
            C89219l.m154716b(string12, "");
            return new C66994m(3, string9, string10, string11, string12);
        }
    }

    /* renamed from: b */
    public static void m118588b(int i, int i2) {
        C66893c.C66894a.m118637a().mo105822a(i, i2);
    }

    /* renamed from: a */
    public final AbstractC88979t<FriendList<Friend>> mo105814a(boolean z, int i) {
        if (z) {
            return m118596f(i);
        }
        return m118597g(i);
    }

    /* renamed from: a */
    public static AbstractC88979t<List<ContactModelV2>> m118586a(AbstractC74739d dVar, boolean z) {
        C89219l.m154721d(dVar, "");
        AbstractC88979t<List<ContactModelV2>> a = AbstractC88979t.m154294a(new C66879f(dVar, z));
        C89219l.m154716b(a, "");
        return a;
    }

    /* renamed from: a */
    public static C66824a m118584a(int i, int i2) {
        if (i2 == EnumC66892b.NEW_VERSION_FACEBOOK.getValue()) {
            String string = C17879g.m33106c().getString(R.string.df1);
            C89219l.m154716b(string, "");
            String string2 = C17879g.m33106c().getString(R.string.df0);
            C89219l.m154716b(string2, "");
            String string3 = C17879g.m33106c().getString(R.string.dez);
            C89219l.m154716b(string3, "");
            String string4 = C17879g.m33106c().getString(R.string.md);
            C89219l.m154716b(string4, "");
            String string5 = C17879g.m33106c().getString(R.string.me);
            C89219l.m154716b(string5, "");
            String string6 = C17879g.m33106c().getString(R.string.gfn);
            C89219l.m154716b(string6, "");
            return new C66824a(i, string, 2131232081, string2, string3, string4, string5, string6, i2);
        } else if (i2 != EnumC66892b.NEW_VERSION_CONTACT.getValue()) {
            return null;
        } else {
            String string7 = C17879g.m33106c().getString(R.string.df1);
            C89219l.m154716b(string7, "");
            String string8 = C17879g.m33106c().getString(R.string.dey);
            C89219l.m154716b(string8, "");
            String string9 = C17879g.m33106c().getString(R.string.dex);
            C89219l.m154716b(string9, "");
            String string10 = C17879g.m33106c().getString(R.string.md);
            C89219l.m154716b(string10, "");
            String string11 = C17879g.m33106c().getString(R.string.me);
            C89219l.m154716b(string11, "");
            String string12 = C17879g.m33106c().getString(R.string.atd);
            C89219l.m154716b(string12, "");
            return new C66824a(i, string7, R.drawable.a_2, string8, string9, string10, string11, string12, i2);
        }
    }
}
