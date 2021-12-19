package com.p2082ss.android.ugc.aweme.commercialize.model;

import android.os.Build;
import android.util.ArrayMap;
import com.bytedance.covode.number.Covode;
import com.facebook.drawee.p1855f.C24246a;
import com.google.gson.p2018a.AbstractC27891c;
import com.kakao.usermgmt.StringSet;
import com.p2082ss.android.ugc.aweme.IAccountUserService;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.base.C34577e;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import com.p2082ss.android.ugc.aweme.base.p2379ui.RemoteImageView;
import com.p2082ss.android.ugc.aweme.commercialize.api.CommerceSettingsApi;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.profile.model.AvatarDecoration;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.trill.R;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.commercialize.model.n */
public final class C38245n {

    /* renamed from: d */
    public static final C38246a f90369d = new C38246a((byte) 0);
    @AbstractC27891c(mo46611a = "id")

    /* renamed from: a */
    public String f90370a;
    @AbstractC27891c(mo46611a = StringSet.name)

    /* renamed from: b */
    public String f90371b;
    @AbstractC27891c(mo46611a = "image")

    /* renamed from: c */
    public UrlModel f90372c;

    static {
        Covode.recordClassIndex(45729);
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.model.n$a */
    public static final class C38246a {
        static {
            Covode.recordClassIndex(45730);
        }

        private C38246a() {
        }

        public /* synthetic */ C38246a(byte b) {
            this();
        }

        /* renamed from: a */
        private static boolean m77603a(UrlModel urlModel) {
            List<String> urlList;
            if (urlModel == null || (urlList = urlModel.getUrlList()) == null || urlList.isEmpty()) {
                return false;
            }
            return true;
        }

        /* renamed from: b */
        public static Long m77605b(User user) {
            AvatarDecoration c;
            if (user == null || (c = m77606c(user)) == null) {
                return null;
            }
            return Long.valueOf(c.getId());
        }

        /* renamed from: c */
        private static AvatarDecoration m77606c(User user) {
            String str;
            C31575b.m65859a();
            IAccountUserService e = C31575b.f75524a.mo57069e();
            C89219l.m154716b(e, "");
            User curUser = e.getCurUser();
            String uid = user.getUid();
            if (curUser != null) {
                str = curUser.getUid();
            } else {
                str = null;
            }
            if (C89219l.m154714a((Object) uid, (Object) str)) {
                user = curUser;
            }
            C89219l.m154716b(user, "");
            return user.getAvatarDecoration();
        }

        /* renamed from: a */
        public static boolean m77604a(User user) {
            AvatarDecoration c;
            String name;
            C38256t tVar = CommerceSettingsApi.f88905a;
            if (tVar != null && tVar.f90413d) {
                UrlModel urlModel = null;
                if (!(user == null || (c = m77606c(user)) == null || (name = c.getName()) == null || name.length() == 0)) {
                    if (c != null) {
                        urlModel = c.getSourceUrl();
                    }
                    if (m77603a(urlModel)) {
                        return true;
                    }
                }
            }
            return false;
        }

        /* renamed from: a */
        public static void m77601a(User user, RemoteImageView remoteImageView) {
            UrlModel urlModel;
            AvatarDecoration c;
            if (remoteImageView != null) {
                if (user == null || (c = m77606c(user)) == null) {
                    urlModel = null;
                } else {
                    urlModel = c.getSourceUrl();
                }
                if (m77603a(urlModel)) {
                    C24246a aVar = (C24246a) remoteImageView.getHierarchy();
                    if (aVar != null) {
                        aVar.mo39966c(R.color.c9);
                    }
                    C24246a aVar2 = (C24246a) remoteImageView.getHierarchy();
                    if (aVar2 != null) {
                        aVar2.mo39970d(R.color.c9);
                    }
                    C34577e.m70592a(remoteImageView, urlModel);
                }
            }
        }

        /* renamed from: a */
        public static void m77602a(User user, String str) {
            String str2;
            Long b = m77605b(user);
            if (user != null) {
                str2 = user.getUid();
            } else {
                str2 = null;
            }
            if (b != null) {
                b.longValue();
                if (str2 != null) {
                    int i = Build.VERSION.SDK_INT;
                    ArrayMap arrayMap = new ArrayMap(4);
                    arrayMap.put("dec_id", String.valueOf(b.longValue()));
                    arrayMap.put("enter_from", str);
                    arrayMap.put("author_id", str2);
                    C39162r.m79460a("show_head_decoration", arrayMap);
                }
            }
        }
    }
}
