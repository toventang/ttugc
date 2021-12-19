package com.p2082ss.android.ugc.aweme.setting;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import com.google.gson.AbstractC28019l;
import com.google.gson.C27910f;
import com.p2082ss.android.ugc.aweme.account.util.C33048q;
import com.p2082ss.android.ugc.aweme.app.C33594aj;
import com.p2082ss.android.ugc.aweme.app.C33842s;
import com.p2082ss.android.ugc.aweme.app.SharePrefCache;
import com.p2082ss.android.ugc.aweme.main.p3433f.C59091c;
import com.p2082ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p2082ss.android.ugc.aweme.setting.model.C68174d;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81915c;
import p077b.C1731i;

/* renamed from: com.ss.android.ugc.aweme.setting.bc */
public final class C68017bc extends AbstractC68041bz {
    static {
        Covode.recordClassIndex(80213);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ Object mo108640a() {
        mo108643b(C68174d.m120420a());
        AbstractC81915c.m141874a(new C59091c());
        return null;
    }

    @Override // com.p2082ss.android.ugc.aweme.setting.AbstractC68041bz
    /* renamed from: b */
    public final void mo108643b(C68174d dVar) {
        if (dVar != null) {
            super.mo108643b(dVar);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.setting.AbstractC68041bz
    /* renamed from: a */
    public final void mo108642a(Object obj) {
        if (obj instanceof Exception) {
            ((Exception) obj).printStackTrace();
            C68052ce.f152437b.mo108672a(1, false);
            return;
        }
        C68052ce.f152437b.mo108672a(1, true);
        if (obj instanceof AbstractC28019l) {
            C1731i.m5640b(new CallableC68018bd(this), C1731i.f5564c);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.setting.AbstractC68022bh
    /* renamed from: a */
    public final void mo108641a(C68174d dVar) {
        if (dVar != null) {
            boolean z = false;
            C33048q.m67692c().edit().putInt("disable_age_gate", SettingsManager.m29616a().mo25394a("disable_age_gate", 0)).apply();
            C33048q.m67692c().edit().putInt("ftc_age_enable", SettingsManager.m29616a().mo25394a("ftc_age_enable", 0)).apply();
            C27910f fVar = new C27910f();
            C33842s sVar = C33842s.C33843a.f80132a;
            if (sVar.f80112g == null) {
                sVar.f80112g = new C33594aj<>("is_show_gif_button", (Integer) 0);
            }
            sVar.f80112g.mo59940b(Integer.valueOf(SettingsManager.m29616a().mo25394a("is_show_gif_button", 0)));
            SharePrefCache.inst().getWeakNetPreLoadSwitch().mo59940b(Integer.valueOf(SettingsManager.m29616a().mo25394a("weak_net_pre_load_switch", 1)));
            SharePrefCache.inst().getIsPrivateAvailable().mo59940b(Boolean.valueOf(AVExternalServiceImpl.m113114a().configService().avsettingsConfig().isPrivateAvailable()));
            SharePrefCache.inst().getLongVideoPermitted().mo59940b(Boolean.valueOf(AVExternalServiceImpl.m113114a().configService().avsettingsConfig().isPrivateAvailable()));
            C33594aj<String> userResidence = SharePrefCache.inst().getUserResidence();
            String a = SettingsManager.m29616a().mo25398a("region_of_residence", "");
            if (a.contains("İ")) {
                a = a.replace((char) 304, 'I');
            }
            userResidence.mo59940b(a);
            SharePrefCache.inst().getUserCurrentRegion().mo59940b(SettingsManager.m29616a().mo25398a("current_region", ""));
            SharePrefCache.inst().getAdLandingPageConfig().mo59940b(fVar.mo46674b(C68174d.m120425f()));
            SharePrefCache.inst().getEnableBindItemCallOMSDK().mo59940b(Integer.valueOf(SettingsManager.m29616a().mo25394a("enableBindItemCallOMSDK", 0)));
            SharePrefCache.inst().getDownloadSdkConfig().mo59940b(fVar.mo46674b(C68174d.m120426g()));
            SharePrefCache.inst().getFollowUserThreshold().mo59940b(Integer.valueOf(SettingsManager.m29616a().mo25394a("show_follow_tab_following_limit", 0)));
            SharePrefCache.inst().setShowInvitedContactsFriends(Boolean.valueOf(SettingsManager.m29616a().mo25400a("show_invite_friends_entry", false)));
            SharePrefCache.inst().getShowPromoteLicense().mo59940b(Integer.valueOf(SettingsManager.m29616a().mo25394a("show_creator_license_210", 0)));
            SharePrefCache.inst().getIsEuropeCountry().mo59940b(Boolean.valueOf(SettingsManager.m29616a().mo25400a("is_europe_country", false)));
            SharePrefCache.inst().getReferralEntrance().mo59940b(SettingsManager.m29616a().mo25398a("referral_program_url", ""));
            C33594aj<Boolean> q = C33842s.C33843a.f80132a.mo60073q();
            if (SettingsManager.m29616a().mo25394a("comment_setting_enable", 0) == 1) {
                z = true;
            }
            q.mo59940b(Boolean.valueOf(z));
        }
    }
}
