package com.p2082ss.android.ugc.aweme.share.improve.pkg;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.kakao.usermgmt.StringSet;
import com.p2082ss.android.ugc.aweme.IAccountUserService;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.base.share.ShareInfo;
import com.p2082ss.android.ugc.aweme.common.C39088c;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.p2969u.C49955a;
import com.p2082ss.android.ugc.aweme.feed.p2969u.C49966c;
import com.p2082ss.android.ugc.aweme.metrics.C59206ab;
import com.p2082ss.android.ugc.aweme.profile.model.GeneralPermission;
import com.p2082ss.android.ugc.aweme.profile.model.ProfileBadgeStruct;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.share.C68863ah;
import com.p2082ss.android.ugc.aweme.share.improve.p3755a.C69005ar;
import com.p2082ss.android.ugc.aweme.share.improve.p3755a.C69037c;
import com.p2082ss.android.ugc.aweme.share.improve.p3757b.C69109b;
import com.p2082ss.android.ugc.aweme.share.improve.p3758c.C69123a;
import com.p2082ss.android.ugc.aweme.share.improve.p3758c.C69124b;
import com.p2082ss.android.ugc.aweme.sharer.AbstractC69581b;
import com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractC69690f;
import com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractC69693h;
import com.p2082ss.android.ugc.aweme.sharer.p3782ui.SharePackage;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i.C79459a;
import com.p2082ss.android.ugc.aweme.utils.C80580in;
import com.p2082ss.android.ugc.trill.R;
import java.util.List;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.share.improve.pkg.UserSharePackage */
public final class UserSharePackage extends LinkDefaultSharePackage {

    /* renamed from: b */
    public static final C69241a f154770b = new C69241a((byte) 0);

    /* renamed from: a */
    public User f154771a;

    static {
        Covode.recordClassIndex(81569);
    }

    /* renamed from: com.ss.android.ugc.aweme.share.improve.pkg.UserSharePackage$a */
    public static final class C69241a {
        static {
            Covode.recordClassIndex(81570);
        }

        private C69241a() {
        }

        public /* synthetic */ C69241a(byte b) {
            this();
        }

        /* renamed from: a */
        public static boolean m122368a(User user) {
            ProfileBadgeStruct profileBadge;
            C89219l.m154721d(user, "");
            if (user.getProfileBadge() == null || (profileBadge = user.getProfileBadge()) == null || !profileBadge.getShouldShow()) {
                if (user.getProfileBadge() == null) {
                    return false;
                }
                String uid = user.getUid();
                IAccountUserService g = C31575b.m65865g();
                C89219l.m154716b(g, "");
                User curUser = g.getCurUser();
                C89219l.m154716b(curUser, "");
                if (C89219l.m154714a((Object) uid, (Object) curUser.getUid())) {
                    return true;
                }
                return false;
            }
            return true;
        }

        /* renamed from: com.ss.android.ugc.aweme.share.improve.pkg.UserSharePackage$a$a */
        public static final class C69242a implements AbstractC69690f {

            /* renamed from: a */
            final /* synthetic */ UserSharePackage f154772a;

            /* renamed from: b */
            final /* synthetic */ String f154773b;

            /* renamed from: c */
            final /* synthetic */ Activity f154774c;

            /* renamed from: d */
            final /* synthetic */ User f154775d;

            /* renamed from: e */
            final /* synthetic */ Handler f154776e;

            static {
                Covode.recordClassIndex(81571);
            }

            @Override // com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractC69690f
            /* renamed from: a */
            public final void mo60845a(SharePackage sharePackage, Context context) {
                C89219l.m154721d(sharePackage, "");
                C89219l.m154721d(context, "");
                AbstractC69690f.C69691a.m123095b(sharePackage, context);
            }

            @Override // com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractC69690f
            /* renamed from: b */
            public final void mo60847b(SharePackage sharePackage, Context context) {
                C89219l.m154721d(sharePackage, "");
                C89219l.m154721d(context, "");
                AbstractC69690f.C69691a.m123093a(sharePackage, context);
            }

            @Override // com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractC69690f
            /* renamed from: a */
            public final void mo60846a(AbstractC69693h hVar, SharePackage sharePackage, Context context) {
                C89219l.m154721d(hVar, "");
                C89219l.m154721d(sharePackage, "");
                C89219l.m154721d(context, "");
                if (hVar instanceof C69037c) {
                    C69241a.m122366a("copy", this.f154775d);
                    C69241a.m122367a(hVar.mo61919c(), true, context, this.f154775d);
                } else if (hVar instanceof C69005ar) {
                    C69241a.m122366a("report", this.f154775d);
                }
            }

            @Override // com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractC69660b
            /* renamed from: a */
            public final void mo60844a(AbstractC69581b bVar, boolean z, SharePackage sharePackage, Context context) {
                C89219l.m154721d(bVar, "");
                C89219l.m154721d(context, "");
                C69241a.m122367a(bVar.mo109548a(), z, context, this.f154775d);
                if (bVar instanceof C69109b) {
                    C69241a.m122366a("copy", this.f154775d);
                }
            }

            public C69242a(UserSharePackage userSharePackage, String str, Activity activity, User user, Handler handler) {
                this.f154772a = userSharePackage;
                this.f154773b = str;
                this.f154774c = activity;
                this.f154775d = user;
                this.f154776e = handler;
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.share.improve.pkg.UserSharePackage$a$b */
        public static final class C69243b implements AbstractC69690f {

            /* renamed from: a */
            final /* synthetic */ UserSharePackage f154777a;

            /* renamed from: b */
            final /* synthetic */ String f154778b;

            /* renamed from: c */
            final /* synthetic */ Activity f154779c;

            /* renamed from: d */
            final /* synthetic */ User f154780d;

            static {
                Covode.recordClassIndex(81572);
            }

            @Override // com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractC69690f
            /* renamed from: a */
            public final void mo60845a(SharePackage sharePackage, Context context) {
                C89219l.m154721d(sharePackage, "");
                C89219l.m154721d(context, "");
                AbstractC69690f.C69691a.m123095b(sharePackage, context);
            }

            @Override // com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractC69690f
            /* renamed from: b */
            public final void mo60847b(SharePackage sharePackage, Context context) {
                C89219l.m154721d(sharePackage, "");
                C89219l.m154721d(context, "");
                AbstractC69690f.C69691a.m123093a(sharePackage, context);
            }

            @Override // com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractC69690f
            /* renamed from: a */
            public final void mo60846a(AbstractC69693h hVar, SharePackage sharePackage, Context context) {
                C89219l.m154721d(hVar, "");
                C89219l.m154721d(sharePackage, "");
                C89219l.m154721d(context, "");
                AbstractC69690f.C69691a.m123094a(hVar, sharePackage, context);
            }

            public C69243b(UserSharePackage userSharePackage, String str, Activity activity, User user) {
                this.f154777a = userSharePackage;
                this.f154778b = str;
                this.f154779c = activity;
                this.f154780d = user;
            }

            @Override // com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractC69660b
            /* renamed from: a */
            public final void mo60844a(AbstractC69581b bVar, boolean z, SharePackage sharePackage, Context context) {
                C89219l.m154721d(bVar, "");
                C89219l.m154721d(context, "");
                C69241a.m122367a(bVar.mo109548a(), z, context, this.f154780d);
                C39162r.m79460a("share_person", new C33744d().mo59983a("platform", bVar.mo109548a()).mo59983a("enter_method", "click_head").mo59983a("enter_from", this.f154778b).mo59983a("author_id", this.f154780d.getUid()).f79943a);
            }
        }

        /* renamed from: a */
        public static void m122366a(String str, User user) {
            String str2;
            C89219l.m154721d(str, "");
            if (user != null) {
                C59206ab.C59207a b = C59206ab.m108755a("share_person").mo96746b("platform", str).mo96746b("target_id", user.getUid());
                if (C80580in.m139694g(user)) {
                    str2 = "personal_homepage";
                } else {
                    str2 = "others_homepage";
                }
                b.mo96746b("enter_from", str2).mo96792f();
            }
        }

        /* renamed from: a */
        public static UserSharePackage m122365a(User user, Context context, List<? extends Aweme> list) {
            String str;
            String str2;
            String str3;
            String str4;
            String shareUrl;
            String a;
            String b;
            C89219l.m154721d(user, "");
            C89219l.m154721d(context, "");
            SharePackage.C69654a aVar = new SharePackage.C69654a();
            String uid = user.getUid();
            C89219l.m154716b(uid, "");
            SharePackage.C69654a b2 = aVar.mo109806b(uid);
            String string = context.getString(R.string.u8);
            C89219l.m154716b(string, "");
            SharePackage.C69654a a2 = b2.mo109804a("app_name", string);
            ShareInfo shareInfo = user.getShareInfo();
            if (shareInfo == null || (str = shareInfo.getShareTitle()) == null) {
                str = "";
            }
            SharePackage.C69654a c = a2.mo109807c(str);
            ShareInfo shareInfo2 = user.getShareInfo();
            if (shareInfo2 == null || (str2 = shareInfo2.getShareDesc()) == null) {
                str2 = "";
            }
            SharePackage.C69654a d = c.mo109808d(str2);
            ShareInfo shareInfo3 = user.getShareInfo();
            if (shareInfo3 == null || (shareUrl = shareInfo3.getShareUrl()) == null || (a = C69124b.m122224a(shareUrl)) == null || (b = C69124b.m122226b(a)) == null || (str3 = C69124b.m122228c(b)) == null) {
                str3 = "";
            }
            SharePackage.C69654a a3 = d.mo109809e(str3).mo109803a("user");
            String uid2 = user.getUid();
            if (uid2 == null) {
                uid2 = "";
            }
            SharePackage.C69654a a4 = a3.mo109804a("uid", uid2);
            String secUid = user.getSecUid();
            if (secUid == null) {
                secUid = "";
            }
            SharePackage.C69654a a5 = a4.mo109804a("sec_user_id", secUid);
            String nickname = user.getNickname();
            if (nickname == null) {
                nickname = "";
            }
            SharePackage.C69654a a6 = a5.mo109804a(StringSet.name, nickname);
            String uniqueId = user.getUniqueId();
            if (uniqueId == null || uniqueId.length() == 0) {
                str4 = user.getShortId();
                if (str4 == null) {
                    str4 = "";
                }
            } else {
                str4 = user.getUniqueId();
            }
            C89219l.m154716b(str4, "");
            SharePackage.C69654a a7 = a6.mo109804a("desc", str4);
            if (!C80580in.m139685b(user, C80580in.m139694g(user)) && list != null && list.size() >= 3) {
                C69123a.m122221a(a7.f155499f, "aweme_cover_list", list);
            }
            a7.f155499f.putSerializable("video_cover", user.getAvatarMedium());
            UserSharePackage userSharePackage = new UserSharePackage(a7);
            userSharePackage.f154771a = user;
            return userSharePackage;
        }

        /* renamed from: a */
        public static void m122367a(String str, boolean z, Context context, User user) {
            C89219l.m154721d(str, "");
            C89219l.m154721d(context, "");
            if (z && user != null) {
                C39088c cVar = new C39088c();
                cVar.mo67838a(new C49955a());
                C49966c.C49967a aVar = new C49966c.C49967a();
                aVar.f115215a = user.getUid();
                aVar.f115216b = 1;
                aVar.f115221g = 4;
                aVar.f115222h = str;
                cVar.mo57616a(aVar.mo85008a());
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UserSharePackage(SharePackage.C69654a aVar) {
        super(aVar);
        C89219l.m154721d(aVar, "");
    }

    @Override // com.p2082ss.android.ugc.aweme.sharer.p3782ui.SharePackage
    /* renamed from: a */
    public final boolean mo109574a(AbstractC69693h hVar, Context context) {
        String shareProfileToast;
        C89219l.m154721d(hVar, "");
        C89219l.m154721d(context, "");
        if (!(hVar instanceof C69037c)) {
            return false;
        }
        User user = this.f154771a;
        if (user == null) {
            C89219l.m154710a("user");
        }
        GeneralPermission generalPermission = user.getGeneralPermission();
        String str = null;
        if (generalPermission != null) {
            str = generalPermission.getShareProfileToast();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        User user2 = this.f154771a;
        if (user2 == null) {
            C89219l.m154710a("user");
        }
        GeneralPermission generalPermission2 = user2.getGeneralPermission();
        if (generalPermission2 == null || (shareProfileToast = generalPermission2.getShareProfileToast()) == null) {
            return true;
        }
        new C79459a(context).mo123052a(shareProfileToast).mo123053a();
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.sharer.p3782ui.SharePackage
    /* renamed from: a */
    public final boolean mo109573a(AbstractC69581b bVar, Context context, AbstractC89172b<? super Boolean, C89391z> bVar2) {
        String shareProfileToast;
        C89219l.m154721d(bVar, "");
        C89219l.m154721d(context, "");
        C89219l.m154721d(bVar2, "");
        User user = this.f154771a;
        if (user == null) {
            C89219l.m154710a("user");
        }
        GeneralPermission generalPermission = user.getGeneralPermission();
        String str = null;
        if (generalPermission != null) {
            str = generalPermission.getShareProfileToast();
        }
        if (!TextUtils.isEmpty(str)) {
            User user2 = this.f154771a;
            if (user2 == null) {
                C89219l.m154710a("user");
            }
            GeneralPermission generalPermission2 = user2.getGeneralPermission();
            if (!(generalPermission2 == null || (shareProfileToast = generalPermission2.getShareProfileToast()) == null)) {
                new C79459a(context).mo123052a(shareProfileToast).mo123053a();
            }
            bVar2.invoke(true);
            return true;
        }
        C68863ah.f154028b.mo109361a(bVar.mo109548a(), 0);
        return false;
    }
}
