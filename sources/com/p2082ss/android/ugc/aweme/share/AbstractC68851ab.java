package com.p2082ss.android.ugc.aweme.share;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17873f;
import com.bytedance.ies.ugc.aweme.rich.p1268a.C18129a;
import com.bytedance.tux.p1721g.C23144b;
import com.google.p1998c.p2006h.p2007a.AbstractFutureC27655q;
import com.p2082ss.android.common.applog.C29803q;
import com.p2082ss.android.ugc.aweme.IAccountUserService;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.account.model.AbstractC32846a;
import com.p2082ss.android.ugc.aweme.app.api.Api;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.awemeservice.AwemeService;
import com.p2082ss.android.ugc.aweme.base.p2368b.p2369a.C34501a;
import com.p2082ss.android.ugc.aweme.commercialize.log.C38189j;
import com.p2082ss.android.ugc.aweme.commercialize.media.impl.service.CommerceMediaServiceImpl;
import com.p2082ss.android.ugc.aweme.commercialize.p2540e.p2541a.C37699a;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.detail.p2751ui.DetailActivity;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.p2082ss.android.ugc.aweme.feed.model.PromoteEntryCheck;
import com.p2082ss.android.ugc.aweme.feed.p2963q.C49888x;
import com.p2082ss.android.ugc.aweme.initializer.C56784n;
import com.p2082ss.android.ugc.aweme.livewallpaper.p3414b.C58833b;
import com.p2082ss.android.ugc.aweme.login.C58957c;
import com.p2082ss.android.ugc.aweme.main.AbstractC59105l;
import com.p2082ss.android.ugc.aweme.main.MainActivity;
import com.p2082ss.android.ugc.aweme.model.p3458a.C60104a;
import com.p2082ss.android.ugc.aweme.music.model.Music;
import com.p2082ss.android.ugc.aweme.mvtemplate.impl.MovieReuseServiceImpl;
import com.p2082ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p2082ss.android.ugc.aweme.profile.api.AwemeApi;
import com.p2082ss.android.ugc.aweme.profile.model.CommercePermissionStruct;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.prop.impl.PropReuseServiceImpl;
import com.p2082ss.android.ugc.aweme.services.IExternalService;
import com.p2082ss.android.ugc.aweme.services.RetrofitService;
import com.p2082ss.android.ugc.aweme.setting.api.PromoteEntryCheckApi;
import com.p2082ss.android.ugc.aweme.setting.p3732ui.AdSettingsActivity;
import com.p2082ss.android.ugc.aweme.share.improve.DialogC69104b;
import com.p2082ss.android.ugc.aweme.share.improve.p3757b.C69115d;
import com.p2082ss.android.ugc.aweme.sharer.AbstractC69581b;
import com.p2082ss.android.ugc.aweme.sharer.p3782ui.C69684e;
import com.p2082ss.android.ugc.aweme.sharer.p3782ui.DialogC69695i;
import com.p2082ss.android.ugc.aweme.sharer.p3782ui.SharePackage;
import com.p2082ss.android.ugc.aweme.shortvideo.p3839l.C71924b;
import com.p2082ss.android.ugc.aweme.shortvideo.p3839l.C71949p;
import com.p2082ss.android.ugc.aweme.shortvideo.view.ProgressDialogC74145d;
import com.p2082ss.android.ugc.aweme.tools.detail.IMovieReuseService;
import com.p2082ss.android.ugc.aweme.utils.C80422fe;
import com.p2082ss.android.ugc.aweme.utils.C80519gy;
import com.p2082ss.android.ugc.aweme.utils.C80580in;
import com.p2082ss.android.ugc.aweme.video.C80720e;
import com.p2082ss.android.ugc.aweme.wiki.AddWikiActivity;
import com.p2082ss.android.ugc.tiktok.security.p4333a.C84349a;
import com.p2082ss.android.ugc.trill.R;
import com.p2082ss.android.ugc.trill.share.p4384a.AbstractC85156a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import p077b.C1731i;
import p4600h.p4601a.C89041ag;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.share.ab */
public abstract class AbstractC68851ab implements ShareDependService {
    static {
        Covode.recordClassIndex(81152);
    }

    @Override // com.p2082ss.android.ugc.aweme.share.ShareDependService
    /* renamed from: a */
    public void mo109332a(Context context, Aweme aweme, String str, String str2, String str3) {
        C89219l.m154721d(context, "");
        C89219l.m154721d(aweme, "");
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C89219l.m154721d(str3, "");
    }

    @Override // com.p2082ss.android.ugc.aweme.share.ShareDependService
    /* renamed from: c */
    public boolean mo109350c() {
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.share.ShareDependService
    /* renamed from: a */
    public final void mo109342a(String str, C33744d dVar) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(dVar, "");
        C39162r.m79460a(str, dVar.f79943a);
    }

    @Override // com.p2082ss.android.ugc.aweme.share.ShareDependService
    /* renamed from: a */
    public final void mo109334a(Context context, String str) {
        Aweme d = AwemeService.m70060b().mo60690d(str);
        AwemeRawAd awemeRawAd = null;
        C38189j.m77489a(context, "share", d, C38189j.m77468a(context, d, false, (Map<String, String>) null));
        if (d != null) {
            awemeRawAd = d.getAwemeRawAd();
        }
        C18129a.m33746a("landing_ad", "share", awemeRawAd).mo28897a("anchor_id", C80519gy.m139579b(d)).mo28897a("room_id", C80519gy.m139578a(d)).mo28902c();
    }

    @Override // com.p2082ss.android.ugc.aweme.share.ShareDependService
    /* renamed from: a */
    public final void mo109336a(Context context, boolean z) {
        C89219l.m154721d(context, "");
        ((AbstractC85156a) C34501a.m70486a(context, AbstractC85156a.class)).mo60940a(z);
    }

    @Override // com.p2082ss.android.ugc.aweme.share.ShareDependService
    /* renamed from: a */
    public final void mo109343a(String str, Aweme aweme, Activity activity, String str2, Map<String, String> map, boolean z, boolean z2) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(aweme, "");
        C89219l.m154721d(activity, "");
        C89219l.m154721d(str2, "");
        C89219l.m154721d(map, "");
        C71924b bVar = new C71924b();
        bVar.f161168a = str;
        bVar.f161169b = map;
        bVar.f161180m = z;
        bVar.f161181n = z2;
        bVar.mo113570a(aweme, activity, str2);
    }

    @Override // com.p2082ss.android.ugc.aweme.share.ShareDependService
    /* renamed from: a */
    public final void mo109335a(Context context, String str, int i) {
        C89219l.m154721d(context, "");
        C89219l.m154721d(str, "");
        MovieReuseServiceImpl.m110905a().mo98780a(context, Integer.valueOf(IMovieReuseService.C78106a.f175373a), str, Integer.valueOf(i), null, null);
    }

    @Override // com.p2082ss.android.ugc.aweme.share.ShareDependService
    /* renamed from: a */
    public final void mo109337a(Aweme aweme, Activity activity, String str) {
        Resources resources;
        C89219l.m154721d(aweme, "");
        C89219l.m154721d(activity, "");
        C89219l.m154721d(str, "");
        C71949p pVar = new C71949p();
        C89219l.m154721d(aweme, "");
        C89219l.m154721d(activity, "");
        C89219l.m154721d(str, "");
        pVar.f161228a = activity;
        pVar.f161230c = aweme;
        pVar.f161229b = str;
        IExternalService a = AVExternalServiceImpl.m113114a();
        C89219l.m154716b(a, "");
        if (C80580in.m139687c()) {
            new C23144b(activity).mo37640e(R.string.dcr).mo37637b();
        } else if (a.configService().avsettingsConfig().needLoginBeforeRecord()) {
            C58957c.m108318a(activity, str, "click_stitch_button");
        } else if (!AVExternalServiceImpl.m113114a().publishService().isPublishable()) {
            new C23144b(activity).mo37640e(R.string.f94).mo37637b();
        } else if (aweme.getAuthor() == null) {
        } else {
            if (!C80720e.m139939e()) {
                new C23144b(activity).mo37640e(R.string.feu).mo37637b();
            } else if (C80720e.m139940f() < 20971520) {
                new C23144b(activity).mo37640e(R.string.fev).mo37637b();
            } else if (!C80422fe.m139425a(activity)) {
                new C23144b(activity).mo37640e(R.string.dcr).mo37637b();
            } else if (CommerceMediaServiceImpl.m77578f().mo66514b(aweme.getMusic())) {
                new C23144b(activity).mo37640e(R.string.fq9).mo37637b();
            } else {
                if (pVar.f161231d == null) {
                    Activity activity2 = pVar.f161228a;
                    Activity activity3 = pVar.f161228a;
                    pVar.f161231d = ProgressDialogC74145d.m130371a(activity2, (activity3 == null || (resources = activity3.getResources()) == null) ? null : resources.getString(R.string.bde));
                }
                ProgressDialogC74145d dVar = pVar.f161231d;
                if (dVar != null) {
                    dVar.setIndeterminate(false);
                }
                ProgressDialogC74145d dVar2 = pVar.f161231d;
                if (dVar2 != null) {
                    dVar2.setProgress(0);
                }
                C1731i.m5640b(new C71949p.CallableC71953d(aweme), C1731i.f5562a).mo5534a(new C71949p.C71954e(pVar), C1731i.f5564c, null);
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.share.ShareDependService
    /* renamed from: a */
    public final void mo109341a(String str, Context context) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(context, "");
        HashMap hashMap = new HashMap();
        hashMap.put("anchor_type", "analytics");
        AddWikiActivity.C81638a.m141514a(context, str, hashMap, C89041ag.m154415a());
    }

    @Override // com.p2082ss.android.ugc.aweme.share.ShareDependService
    /* renamed from: a */
    public final void mo109333a(Context context, Aweme aweme, boolean z, ArrayList<String> arrayList, String str, int i, boolean z2) {
        C89219l.m154721d(context, "");
        C89219l.m154721d(aweme, "");
        C89219l.m154721d(arrayList, "");
        C89219l.m154721d(str, "");
        C60104a.C60105a aVar = new C60104a.C60105a();
        aVar.f136997g = Integer.valueOf(i);
        if (aweme.getMusic() != null) {
            Music music = aweme.getMusic();
            C89219l.m154716b(music, "");
            C89219l.m154721d(music, "");
            aVar.f136991a = music;
        }
        if (z) {
            C60104a.C60105a a = aVar.mo97710a("green_screen");
            String aid = aweme.getAid();
            C89219l.m154716b(aid, "");
            C89219l.m154721d(aid, "");
            a.f136992b = aid;
        } else {
            aVar.mo97712b("prop_auto");
        }
        C89219l.m154721d("prop_reuse", "");
        aVar.f136994d = "prop_reuse";
        PropReuseServiceImpl.m116994c().mo104484a(context, arrayList, aVar.mo97711a(), z2);
    }

    @Override // com.p2082ss.android.ugc.aweme.share.ShareDependService
    /* renamed from: b */
    public final boolean mo109348b() {
        Activity j = C17873f.m33102j();
        if (j == null) {
            return false;
        }
        if (j instanceof MainActivity) {
            MainActivity mainActivity = (MainActivity) j;
            if (mainActivity.isMainTabVisible()) {
                if (mainActivity.getCurFragment() == null || !(mainActivity.getCurFragment() instanceof AbstractC59105l)) {
                    return true;
                }
                Fragment curFragment = mainActivity.getCurFragment();
                Objects.requireNonNull(curFragment, "null cannot be cast to non-null type com.ss.android.ugc.aweme.main.IMainFragment");
                if (!((AbstractC59105l) curFragment).mo96549n()) {
                    return true;
                }
                IAccountUserService g = C31575b.m65865g();
                C89219l.m154716b(g, "");
                if (!g.isLogin()) {
                    return false;
                }
                return true;
            }
        }
        return j instanceof DetailActivity;
    }

    @Override // com.p2082ss.android.ugc.aweme.share.ShareDependService
    /* renamed from: a */
    public final void mo109344a(boolean z) {
        C49888x.f114991e = z;
    }

    @Override // com.p2082ss.android.ugc.aweme.share.ShareDependService
    /* renamed from: a */
    public final AbstractC32846a mo109323a(User user) {
        C89219l.m154721d(user, "");
        return new C56784n(user);
    }

    @Override // com.p2082ss.android.ugc.aweme.share.ShareDependService
    /* renamed from: b */
    public final int mo109346b(Aweme aweme) {
        CommercePermissionStruct commercePermission;
        C89219l.m154721d(aweme, "");
        User author = aweme.getAuthor();
        if (author == null || !C31575b.m65865g().isMe(author.getUid()) || (commercePermission = C31575b.m65865g().getCurUser().getCommercePermission()) == null || commercePermission.topItem != 1) {
            return 0;
        }
        return 1;
    }

    @Override // com.p2082ss.android.ugc.aweme.share.ShareDependService
    /* renamed from: c */
    public final boolean mo109351c(Aweme aweme) {
        C89219l.m154721d(aweme, "");
        if (aweme == null || aweme.getAuthor() == null || !TextUtils.equals(aweme.getAuthorUid(), C31575b.m65865g().getCurUserId())) {
            return false;
        }
        if (C31575b.m65865g().getCurUser().getCommerceUserLevel() == 0 && aweme.getAuthor() != null && aweme.getAuthor().getCommerceUserLevel() == 0) {
            return false;
        }
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.share.ShareDependService
    /* renamed from: a */
    public final AbstractFutureC27655q<PromoteEntryCheck> mo109322a(String str, String str2) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        return ((PromoteEntryCheckApi) RetrofitService.createIRetrofitServicebyMonsterPlugin(false).createNewRetrofit(Api.f79771d).create(PromoteEntryCheckApi.class)).getPromoteEntryCheck(str, str2);
    }

    @Override // com.p2082ss.android.ugc.aweme.share.ShareDependService
    /* renamed from: a */
    public final AbstractC69581b mo109325a(SharePackage sharePackage, String str) {
        C89219l.m154721d(sharePackage, "");
        C89219l.m154721d(str, "");
        return new C69115d(sharePackage, str, (byte) 0);
    }

    @Override // com.p2082ss.android.ugc.aweme.share.ShareDependService
    /* renamed from: c */
    public final void mo109349c(Context context, Aweme aweme) {
        C89219l.m154721d(context, "");
        C89219l.m154721d(aweme, "");
        C38189j.m77489a(context, "open_url_h5", aweme, C38189j.m77468a(context, aweme, false, (Map<String, String>) null));
        C18129a.m33746a("landing_ad", "open_url_h5", aweme.getAwemeRawAd()).mo28902c();
    }

    @Override // com.p2082ss.android.ugc.aweme.share.ShareDependService
    /* renamed from: d */
    public final void mo109352d(Context context, Aweme aweme) {
        C89219l.m154721d(context, "");
        C89219l.m154721d(aweme, "");
        C89219l.m154721d(context, "");
        C89219l.m154721d(aweme, "");
        Intent intent = new Intent(context, AdSettingsActivity.class);
        intent.putExtra("id", aweme.getAid());
        AdSettingsActivity.f153198d = aweme;
        C84349a.m145093a(intent, context);
        context.startActivity(intent);
    }

    @Override // com.p2082ss.android.ugc.aweme.share.ShareDependService
    /* renamed from: b */
    public final void mo109347b(Context context, Aweme aweme) {
        C89219l.m154721d(context, "");
        C89219l.m154721d(aweme, "");
        C38189j.m77489a(context, "copy", aweme, C38189j.m77468a(context, aweme, false, (Map<String, String>) null));
        C18129a.m33746a("landing_ad", "copy", aweme.getAwemeRawAd()).mo28902c();
    }

    @Override // com.p2082ss.android.ugc.aweme.share.ShareDependService
    /* renamed from: a */
    public final String mo109327a(Aweme aweme, int i) {
        String str;
        String str2;
        String str3;
        C89219l.m154721d(aweme, "");
        if (aweme == null) {
            return "";
        }
        HashMap hashMap = new HashMap();
        String aid = aweme.getAid();
        if (aweme.isAd()) {
            str2 = String.valueOf(aweme.getAwemeRawAd().getAdId());
            str3 = String.valueOf(aweme.getAwemeRawAd().getCreativeId());
            str = aweme.getAwemeRawAd().getLogExtra();
        } else {
            str = "";
            str2 = str;
            str3 = str2;
        }
        if (!TextUtils.isEmpty(str2)) {
            hashMap.put("ad_id", str2);
        }
        if (!TextUtils.isEmpty(str3)) {
            hashMap.put("creative_id", str3);
        }
        if (!TextUtils.isEmpty("")) {
            hashMap.put("ad_category", "");
        }
        if (!TextUtils.isEmpty(str)) {
            hashMap.put("log_extra", str);
        }
        if (!TextUtils.isEmpty("")) {
            hashMap.put("dislike_source", "");
        }
        hashMap.put("channel_id", String.valueOf(i));
        C29803q.m60037b(hashMap, true);
        AwemeApi.f144001e.disLikeAweme(aid, hashMap).execute();
        return aid;
    }

    @Override // com.p2082ss.android.ugc.aweme.share.ShareDependService
    /* renamed from: a */
    public final void mo109329a(Activity activity, Aweme aweme) {
        C89219l.m154721d(activity, "");
        C89219l.m154721d(aweme, "");
        new C58833b(activity).mo96239c(aweme);
    }

    @Override // com.p2082ss.android.ugc.aweme.share.ShareDependService
    /* renamed from: a */
    public final void mo109330a(Context context, Aweme aweme) {
        C89219l.m154721d(context, "");
        C89219l.m154721d(aweme, "");
        C38189j.m77489a(context, "report", aweme, C38189j.m77468a(context, aweme, false, (Map<String, String>) null));
        C18129a.m33746a("landing_ad", "report", aweme.getAwemeRawAd()).mo28902c();
    }

    @Override // com.p2082ss.android.ugc.aweme.share.ShareDependService
    /* renamed from: a */
    public final DialogC69695i mo109326a(Activity activity, C69684e eVar, int i) {
        C89219l.m154721d(activity, "");
        C89219l.m154721d(eVar, "");
        return new DialogC69104b(activity, eVar, i);
    }

    @Override // com.p2082ss.android.ugc.aweme.share.ShareDependService
    /* renamed from: a */
    public final void mo109331a(Context context, Aweme aweme, String str) {
        C89219l.m154721d(context, "");
        C89219l.m154721d(aweme, "");
        C89219l.m154721d(str, "");
        if (!C37699a.m76314s(aweme)) {
            return;
        }
        if (!C37699a.m76218U(aweme) || (C37699a.m76218U(aweme) && !TextUtils.equals(null, "chat_merge"))) {
            C18129a.m33746a("draw_ad", "share", aweme.getAwemeRawAd()).mo28897a("anchor_id", C80519gy.m139579b(aweme)).mo28897a("room_id", C80519gy.m139578a(aweme)).mo28902c();
        }
    }
}
