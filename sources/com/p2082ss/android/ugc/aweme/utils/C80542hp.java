package com.p2082ss.android.ugc.aweme.utils;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.bytedance.keva.Keva;
import com.p2082ss.android.p2123b.C29736b;
import com.p2082ss.android.ugc.aweme.IAccountUserService;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;
import com.p2082ss.android.ugc.aweme.framework.p3009d.C51427a;
import com.p2082ss.android.ugc.aweme.global.config.settings.C52912c;
import com.p2082ss.android.ugc.aweme.global.config.settings.pojo.FEConfig;
import com.p2082ss.android.ugc.aweme.global.config.settings.pojo.FeConfigCollection;
import com.p2082ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import com.p2082ss.android.ugc.aweme.p2387bf.C34822d;
import com.p2082ss.android.ugc.aweme.profile.model.CommerceUserInfo;
import com.p2082ss.android.ugc.aweme.profile.model.TcmConfig;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.profile.p3575f.C63768ag;
import com.p2082ss.android.ugc.aweme.qna.services.QnaService;
import com.p2082ss.android.ugc.aweme.setting.api.ProAccountUpdateStatusApi;
import com.p2082ss.android.ugc.aweme.tcm.impl.service.TcmServiceImpl;
import p4560f.p4561a.AbstractC88406ae;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.utils.hp */
public final class C80542hp {

    /* renamed from: a */
    public static final C80543a f180154a = new C80543a((byte) 0);

    /* renamed from: com.ss.android.ugc.aweme.utils.hp$a */
    public static final class C80543a {
        static {
            Covode.recordClassIndex(93816);
        }

        /* renamed from: com.ss.android.ugc.aweme.utils.hp$a$a */
        public static final class C80544a implements AbstractC88406ae<BaseResponse> {
            static {
                Covode.recordClassIndex(93817);
            }

            @Override // p4560f.p4561a.AbstractC88406ae
            public final void onError(Throwable th) {
                C89219l.m154721d(th, "");
            }

            @Override // p4560f.p4561a.AbstractC88406ae
            public final void onSubscribe(AbstractC88412b bVar) {
                C89219l.m154721d(bVar, "");
            }

            C80544a() {
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // p4560f.p4561a.AbstractC88406ae
            public final /* synthetic */ void onSuccess(BaseResponse baseResponse) {
                boolean z;
                BaseResponse baseResponse2 = baseResponse;
                C89219l.m154721d(baseResponse2, "");
                if (baseResponse2.status_code != 0) {
                    z = true;
                } else {
                    z = false;
                }
                Keva repo = Keva.getRepo("keva_repo_qa");
                StringBuilder sb = new StringBuilder("keva_key_need_write_red_dot");
                IAccountUserService g = C31575b.m65865g();
                C89219l.m154716b(g, "");
                repo.storeBoolean(sb.append(g.getCurUserId()).toString(), z);
            }
        }

        private C80543a() {
        }

        /* renamed from: b */
        public static boolean m139619b() {
            IAccountUserService g = C31575b.m65865g();
            C89219l.m154716b(g, "");
            User curUser = g.getCurUser();
            C89219l.m154716b(curUser, "");
            return curUser.isProAccount();
        }

        /* renamed from: l */
        private static boolean m139629l() {
            IAccountUserService g = C31575b.m65865g();
            C89219l.m154716b(g, "");
            User curUser = g.getCurUser();
            C89219l.m154716b(curUser, "");
            return curUser.proAccountTcmRedDot;
        }

        /* renamed from: a */
        public static boolean m139618a() {
            Integer valueOf;
            IAccountUserService g = C31575b.m65865g();
            C89219l.m154716b(g, "");
            User curUser = g.getCurUser();
            C89219l.m154716b(curUser, "");
            CommerceUserInfo commerceUserInfo = curUser.getCommerceUserInfo();
            if (commerceUserInfo == null || (valueOf = Integer.valueOf(commerceUserInfo.getStarAtlas())) == null || valueOf.intValue() != 1) {
                return false;
            }
            return true;
        }

        /* renamed from: c */
        public static boolean m139620c() {
            IAccountUserService g = C31575b.m65865g();
            C89219l.m154716b(g, "");
            User curUser = g.getCurUser();
            C89219l.m154716b(curUser, "");
            return C34822d.m71158a(C51427a.f118503a, "tcm_pro_account", 0).getBoolean("tcm_first_dot" + curUser.getUid(), true);
        }

        /* renamed from: d */
        public static boolean m139621d() {
            FeConfigCollection feConfigCollection;
            FEConfig tcmEntrance;
            String schema;
            try {
                IESSettingsProxy iESSettingsProxy = C52912c.f121688a.f121689b;
                if (iESSettingsProxy == null || (feConfigCollection = iESSettingsProxy.getFeConfigCollection()) == null || (tcmEntrance = feConfigCollection.getTcmEntrance()) == null || (schema = tcmEntrance.getSchema()) == null) {
                    return false;
                }
                if (schema.length() == 0) {
                    return false;
                }
                return true;
            } catch (Exception e) {
                e.printStackTrace();
                return false;
            }
        }

        /* renamed from: e */
        public static boolean m139622e() {
            if (!m139621d()) {
                return false;
            }
            TcmConfig i = TcmServiceImpl.m135859j().mo121266i();
            if ((i == null || !i.getCanUseTcmConsole()) && !m139618a()) {
                if (C80545hq.m139631a()) {
                    Boolean a = C80546hr.m139632a();
                    C89219l.m154716b(a, "");
                    if (a.booleanValue()) {
                        return true;
                    }
                }
                return false;
            }
            return true;
        }

        /* renamed from: f */
        public static boolean m139623f() {
            IAccountUserService g = C31575b.m65865g();
            C89219l.m154716b(g, "");
            User curUser = g.getCurUser();
            C89219l.m154716b(curUser, "");
            if (!curUser.isEnableSubscription()) {
                return false;
            }
            Keva repo = Keva.getRepo("keva_repo_subs");
            StringBuilder sb = new StringBuilder("keva_key_red_dot");
            IAccountUserService g2 = C31575b.m65865g();
            C89219l.m154716b(g2, "");
            if (repo.getBoolean(sb.append(g2.getCurUserId()).toString(), true)) {
                return true;
            }
            return false;
        }

        /* renamed from: h */
        public static boolean m139625h() {
            if ((!m139621d() || !m139630m() || (!m139620c() && !m139629l())) && !m139624g() && !C80586is.m139724a() && !m139623f()) {
                return false;
            }
            return true;
        }

        /* renamed from: i */
        public static boolean m139626i() {
            Keva repo = Keva.getRepo("keva_repo_qa");
            StringBuilder sb = new StringBuilder("keva_key_red_dot");
            IAccountUserService g = C31575b.m65865g();
            C89219l.m154716b(g, "");
            return repo.getBoolean(sb.append(g.getCurUserId()).toString(), true);
        }

        /* renamed from: j */
        public static boolean m139627j() {
            Keva repo = Keva.getRepo("keva_repo_qa");
            StringBuilder sb = new StringBuilder("keva_key_need_write_red_dot");
            IAccountUserService g = C31575b.m65865g();
            C89219l.m154716b(g, "");
            return repo.getBoolean(sb.append(g.getCurUserId()).toString(), false);
        }

        /* renamed from: k */
        public static void m139628k() {
            ((ProAccountUpdateStatusApi) RetrofitFactory.m33635a().mo28817b(C29736b.f70924e).mo28832d().mo28858a(ProAccountUpdateStatusApi.class)).updateStatus().mo142918b(C88925a.m154180b(C88946a.f201991c)).mo142909a(C88925a.m154180b(C88946a.f201991c)).mo116431a_(new C80544a());
        }

        /* renamed from: g */
        public static boolean m139624g() {
            Keva repo = Keva.getRepo("keva_repo_qa");
            StringBuilder sb = new StringBuilder("keva_key_public_qna_setting");
            IAccountUserService g = C31575b.m65865g();
            C89219l.m154716b(g, "");
            boolean z = repo.getBoolean(sb.append(g.getCurUserId()).toString(), false);
            IAccountUserService g2 = C31575b.m65865g();
            C89219l.m154716b(g2, "");
            User curUser = g2.getCurUser();
            if (QnaService.m117969a().enablePublicQna() && !z) {
                C89219l.m154716b(curUser, "");
                if (curUser.getDisplayQnaOnProfile() == null) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: m */
        private static boolean m139630m() {
            if (C63768ag.m115321a()) {
                IAccountUserService g = C31575b.m65865g();
                C89219l.m154716b(g, "");
                User curUser = g.getCurUser();
                C89219l.m154716b(curUser, "");
                int accountType = curUser.getAccountType();
                if (!m139621d() || !m139618a() || (accountType != 2 && accountType != 1)) {
                    return false;
                }
                return true;
            } else if (!m139621d() || !m139618a() || !m139619b()) {
                return false;
            } else {
                return true;
            }
        }

        public /* synthetic */ C80543a(byte b) {
            this();
        }
    }

    static {
        Covode.recordClassIndex(93815);
    }
}
