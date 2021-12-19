package com.p2082ss.android.ugc.aweme.ufr;

import android.text.TextUtils;
import androidx.core.content.C0643b;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.keva.Keva;
import com.p2082ss.android.ugc.aweme.IAccountUserService;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.friends.AbstractC51479c;
import com.p2082ss.android.ugc.aweme.friends.AbstractC51485d;
import com.p2082ss.android.ugc.aweme.profile.model.SocialPlatformSetting;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import java.util.List;
import java.util.NoSuchElementException;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ufr.c */
public final class C79519c {

    /* renamed from: a */
    public static final C79519c f178474a = new C79519c();

    /* renamed from: com.ss.android.ugc.aweme.ufr.c$a */
    public static final class C79520a implements AbstractC51479c {

        /* renamed from: a */
        public static final C79520a f178475a = new C79520a();

        private C79520a() {
        }

        static {
            Covode.recordClassIndex(92723);
        }

        @Override // com.p2082ss.android.ugc.aweme.friends.AbstractC51479c
        /* renamed from: b */
        public final boolean mo86983b() {
            try {
                if (C0643b.m2367a(C17867d.m33078a(), "android.permission.READ_CONTACTS") != -1) {
                    return true;
                }
                return false;
            } catch (Throwable unused) {
                return false;
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.friends.AbstractC51479c
        /* renamed from: c */
        public final boolean mo86984c() {
            if (!mo86982a() || !mo86983b()) {
                return false;
            }
            return true;
        }

        @Override // com.p2082ss.android.ugc.aweme.friends.AbstractC51479c
        /* renamed from: a */
        public final boolean mo86982a() {
            IAccountUserService g = C31575b.m65865g();
            C89219l.m154716b(g, "");
            User curUser = g.getCurUser();
            C89219l.m154716b(curUser, "");
            List<SocialPlatformSetting> socialPlatformSettings = curUser.getSocialData().getSocialPlatformSettings();
            if (socialPlatformSettings == null) {
                return false;
            }
            for (SocialPlatformSetting socialPlatformSetting : socialPlatformSettings) {
                if (socialPlatformSetting.getSocialPlatform() == 1) {
                    return socialPlatformSetting.getSyncStatus();
                }
            }
            return false;
        }

        /* renamed from: a */
        public static void m138231a(boolean z) {
            IAccountUserService g = C31575b.m65865g();
            C89219l.m154716b(g, "");
            User curUser = g.getCurUser();
            C89219l.m154716b(curUser, "");
            List<SocialPlatformSetting> socialPlatformSettings = curUser.getSocialData().getSocialPlatformSettings();
            if (socialPlatformSettings != null) {
                for (T t : socialPlatformSettings) {
                    if (t.getSocialPlatform() == 1) {
                        t.setSyncStatus(z);
                        g.forceSave();
                        return;
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ufr.c$b */
    public static final class C79521b implements AbstractC51485d {

        /* renamed from: a */
        public static final C79521b f178476a = new C79521b();

        private C79521b() {
        }

        static {
            Covode.recordClassIndex(92724);
        }

        /* renamed from: c */
        private static Keva m138235c() {
            Keva repo = Keva.getRepo("tiktok_ufr_cache:facebook");
            C89219l.m154716b(repo, "");
            return repo;
        }

        @Override // com.p2082ss.android.ugc.aweme.friends.AbstractC51485d
        /* renamed from: b */
        public final boolean mo86993b() {
            if (!mo86991a()) {
                return false;
            }
            IAccountUserService g = C31575b.m65865g();
            C89219l.m154716b(g, "");
            User curUser = g.getCurUser();
            C89219l.m154716b(curUser, "");
            if (!TextUtils.isEmpty(mo86987a(curUser.getUid()))) {
                return true;
            }
            return false;
        }

        @Override // com.p2082ss.android.ugc.aweme.friends.AbstractC51485d
        /* renamed from: a */
        public final boolean mo86991a() {
            IAccountUserService g = C31575b.m65865g();
            C89219l.m154716b(g, "");
            User curUser = g.getCurUser();
            C89219l.m154716b(curUser, "");
            List<SocialPlatformSetting> socialPlatformSettings = curUser.getSocialData().getSocialPlatformSettings();
            if (socialPlatformSettings == null) {
                return false;
            }
            for (SocialPlatformSetting socialPlatformSetting : socialPlatformSettings) {
                if (socialPlatformSetting.getSocialPlatform() == 2) {
                    return socialPlatformSetting.getSyncStatus();
                }
            }
            return false;
        }

        @Override // com.p2082ss.android.ugc.aweme.friends.AbstractC51485d
        /* renamed from: b */
        public final void mo86992b(String str) {
            if (!TextUtils.isEmpty(str)) {
                m138235c().erase(str);
                m138235c().erase(C89219l.m154704a(str, (Object) "expiry_date_in_millis"));
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.friends.AbstractC51485d
        /* renamed from: c */
        public final long mo86994c(String str) {
            if (TextUtils.isEmpty(str)) {
                return -1;
            }
            return m138235c().getLong(C89219l.m154704a(str, (Object) "facebook_upload_timer"), -1);
        }

        @Override // com.p2082ss.android.ugc.aweme.friends.AbstractC51485d
        /* renamed from: d */
        public final long mo86995d(String str) {
            if (TextUtils.isEmpty(str)) {
                return -1;
            }
            return m138235c().getLong(C89219l.m154704a(str, (Object) "expiry_date_in_millis"), -1);
        }

        @Override // com.p2082ss.android.ugc.aweme.friends.AbstractC51485d
        /* renamed from: a */
        public final String mo86987a(String str) {
            String str2;
            if (TextUtils.isEmpty(str)) {
                return "";
            }
            float currentTimeMillis = ((float) System.currentTimeMillis()) / 1000.0f;
            long j = m138235c().getLong(C89219l.m154704a(str, (Object) "expiry_date_in_millis"), -1);
            if (currentTimeMillis <= 0.0f) {
                return "";
            }
            if (((float) j) > currentTimeMillis) {
                str2 = m138235c().getString(str, "");
            } else {
                str2 = "";
            }
            C89219l.m154716b(str2, "");
            return str2;
        }

        @Override // com.p2082ss.android.ugc.aweme.friends.AbstractC51485d
        /* renamed from: a */
        public final void mo86990a(boolean z) {
            IAccountUserService g = C31575b.m65865g();
            C89219l.m154716b(g, "");
            User curUser = g.getCurUser();
            C89219l.m154716b(curUser, "");
            List<SocialPlatformSetting> socialPlatformSettings = curUser.getSocialData().getSocialPlatformSettings();
            if (socialPlatformSettings != null) {
                for (T t : socialPlatformSettings) {
                    if (t.getSocialPlatform() == 2) {
                        t.setSyncStatus(z);
                        g.forceSave();
                        return;
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.friends.AbstractC51485d
        /* renamed from: a */
        public final void mo86988a(String str, long j) {
            if (!TextUtils.isEmpty(str)) {
                m138235c().storeLong(C89219l.m154704a(str, (Object) "facebook_upload_timer"), j);
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.friends.AbstractC51485d
        /* renamed from: a */
        public final void mo86989a(String str, String str2, long j) {
            C89219l.m154721d(str2, "");
            if (!TextUtils.isEmpty(str)) {
                m138235c().storeString(str, str2);
                m138235c().storeLong(C89219l.m154704a(str, (Object) "expiry_date_in_millis"), j / 1000);
            }
        }
    }

    private C79519c() {
    }

    static {
        Covode.recordClassIndex(92722);
    }
}
