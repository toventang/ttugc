package com.p2082ss.android.ugc.aweme.mix.services;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.AbstractC0952i;
import androidx.fragment.app.AbstractC0976n;
import androidx.fragment.app.ActivityC0945e;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.dialog.C17197a;
import com.bytedance.ies.watcher.C18285c;
import com.bytedance.keva.Keva;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.dialog.C23023b;
import com.bytedance.tux.dialog.p1713b.C23024a;
import com.bytedance.tux.dialog.p1713b.C23025b;
import com.bytedance.tux.dialog.p1713b.C23028c;
import com.bytedance.tux.sheet.sheet.C23226a;
import com.p2082ss.android.ugc.C81908b;
import com.p2082ss.android.ugc.aweme.IAccountUserService;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.PlayListInfo;
import com.p2082ss.android.ugc.aweme.mix.addfeed.AddFeedToMixFragment;
import com.p2082ss.android.ugc.aweme.mix.api.AbstractC59387a;
import com.p2082ss.android.ugc.aweme.mix.api.AbstractC59388b;
import com.p2082ss.android.ugc.aweme.mix.api.AbstractC59389c;
import com.p2082ss.android.ugc.aweme.mix.api.AbstractC59390d;
import com.p2082ss.android.ugc.aweme.mix.api.AbstractC59393g;
import com.p2082ss.android.ugc.aweme.mix.api.MixFeedApi;
import com.p2082ss.android.ugc.aweme.mix.mixdetail.C59701o;
import com.p2082ss.android.ugc.aweme.mix.p3446a.C59330a;
import com.p2082ss.android.ugc.aweme.mix.p3448c.C59412a;
import com.p2082ss.android.ugc.aweme.mix.p3448c.C59413b;
import com.p2082ss.android.ugc.aweme.mix.p3449d.C59530a;
import com.p2082ss.android.ugc.aweme.mix.p3450e.C59537a;
import com.p2082ss.android.ugc.aweme.mix.p3450e.C59538b;
import com.p2082ss.android.ugc.aweme.mix.p3451f.C59622b;
import com.p2082ss.android.ugc.aweme.mix.profile.entry.C59911c;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.tiktok.security.p4333a.C84349a;
import com.p2082ss.android.ugc.trill.R;
import java.util.Arrays;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89233z;

/* renamed from: com.ss.android.ugc.aweme.mix.services.MixFeedService */
public final class MixFeedService implements IMixFeedService {

    /* renamed from: a */
    public static final C59923a f136499a = new C59923a((byte) 0);

    static {
        Covode.recordClassIndex(70339);
    }

    @Override // com.p2082ss.android.ugc.aweme.mix.services.IMixFeedService
    /* renamed from: d */
    public final int mo97328d() {
        return 100;
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.services.MixFeedService$a */
    public static final class C59923a {
        static {
            Covode.recordClassIndex(70340);
        }

        private C59923a() {
        }

        public /* synthetic */ C59923a(byte b) {
            this();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.mix.services.IMixFeedService
    /* renamed from: a */
    public final void mo97312a(Context context, Bundle bundle, int i, String str, String str2) {
        C89219l.m154721d(context, "");
        C89219l.m154721d(bundle, "");
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        Intent buildIntent = SmartRouter.buildRoute(context, "//mix/create_page").buildIntent();
        bundle.putInt("open_fragment_type", i);
        bundle.putString("enter_from", str);
        bundle.putString("enter_method", str2);
        buildIntent.putExtras(bundle);
        m109434a(context, buildIntent);
    }

    @Override // com.p2082ss.android.ugc.aweme.mix.services.IMixFeedService
    /* renamed from: a */
    public final void mo97313a(Context context, Bundle bundle, String str, String str2, Long l, String str3) {
        C89219l.m154721d(context, "");
        C89219l.m154721d(bundle, "");
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C89219l.m154721d(str3, "");
        Intent buildIntent = SmartRouter.buildRoute(context, "//mix/chang_play_list_name").buildIntent();
        bundle.putString("user_last_name", str);
        bundle.putString("mix_id", str2);
        bundle.putString("enter_from", str3);
        if (l != null) {
            l.longValue();
            bundle.putLong("moderated_rename_timestamp", l.longValue());
        }
        buildIntent.putExtras(bundle);
        m109434a(context, buildIntent);
    }

    @Override // com.p2082ss.android.ugc.aweme.mix.services.IMixFeedService
    /* renamed from: a */
    public final boolean mo97324a(Aweme aweme) {
        PlayListInfo playListInfo;
        return (aweme == null || (playListInfo = aweme.playlist_info) == null || TextUtils.isEmpty(playListInfo.getMixId())) ? false : true;
    }

    @Override // com.p2082ss.android.ugc.aweme.mix.services.IMixFeedService
    /* renamed from: a */
    public final void mo97315a(Context context, String str, Aweme aweme, String str2, String str3, String str4, String str5, boolean z, C59538b bVar, String str6) {
        C89219l.m154721d(str2, "");
        C89219l.m154721d(str3, "");
        C59537a a = m109433a(str, aweme, str2, str3, str4, str5, z, bVar, (Float) null, str6);
        if (context != null) {
            C18285c.m34003a("playlist_first_render_cost_time");
            C18285c.m34003a("playlist_first_open_dialog_cost_time");
            SmartRoute withParam = SmartRouter.buildRoute(context, "aweme://mix/detail").withParam("video_from", a.getMVideoFrom()).withParam("enter_from", a.getMEventType()).withParam("mix_video_list_params", a);
            C59538b searchParam = a.getSearchParam();
            String str7 = null;
            SmartRoute withParam2 = withParam.withParam("playlist_search_id", searchParam != null ? searchParam.getSearchId() : null);
            C59538b searchParam2 = a.getSearchParam();
            SmartRoute withParam3 = withParam2.withParam("is_from_video", searchParam2 != null ? searchParam2.isFromVideo() : null);
            C59538b searchParam3 = a.getSearchParam();
            if (searchParam3 != null) {
                str7 = searchParam3.getSearchType();
            }
            withParam3.withParam("key_search_type", str7).withParam("key_playlist_previous_page", a.getPreviousPage()).withParam("key_playlist_from_group_id", a.getEnterGroupId()).open();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.mix.services.IMixFeedService
    /* renamed from: a */
    public final void mo97314a(Context context, String str, Aweme aweme, String str2, String str3, String str4, String str5, C59538b bVar, Float f, String str6) {
        C89219l.m154721d(str2, "");
        C89219l.m154721d(str3, "");
        C59537a a = m109433a(str, aweme, str2, str3, str4, str5, true, bVar, f, str6);
        if (context != null) {
            SmartRouter.buildRoute(context, "aweme://mix/detail").buildIntent();
            C18285c.m34003a("playlist_first_render_cost_time");
            C18285c.m34003a("playlist_first_open_dialog_cost_time");
            SmartRoute withParam = SmartRouter.buildRoute(context, "aweme://mix/detail").withParam("video_from", a.getMVideoFrom()).withParam("enter_from", a.getMEventType()).withParam("mix_video_list_params", a);
            C59538b searchParam = a.getSearchParam();
            String str7 = null;
            SmartRoute withParam2 = withParam.withParam("playlist_search_id", searchParam != null ? searchParam.getSearchId() : null);
            C59538b searchParam2 = a.getSearchParam();
            SmartRoute withParam3 = withParam2.withParam("is_from_video", searchParam2 != null ? searchParam2.isFromVideo() : null);
            C59538b searchParam3 = a.getSearchParam();
            if (searchParam3 != null) {
                str7 = searchParam3.getSearchType();
            }
            withParam3.withParam("key_search_type", str7).withParam("key_playlist_previous_page", a.getPreviousPage()).withParam("key_playlist_from_group_id", a.getEnterGroupId()).open();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.mix.services.IMixFeedService
    /* renamed from: a */
    public final void mo97316a(AbstractC59390d dVar) {
        C89219l.m154721d(dVar, "");
        C89219l.m154721d(dVar, "");
        C31575b.m65859a();
        IAccountUserService e = C31575b.f75524a.mo57069e();
        C89219l.m154716b(e, "");
        String curUserId = e.getCurUserId();
        C31575b.m65859a();
        IAccountUserService e2 = C31575b.f75524a.mo57069e();
        C89219l.m154716b(e2, "");
        String curSecUserId = e2.getCurSecUserId();
        MixFeedApi a = MixFeedApi.C59385a.m109095a();
        C89219l.m154716b(curUserId, "");
        C89219l.m154716b(curSecUserId, "");
        C89219l.m154716b(a.getUserMixList(curUserId, 0, curSecUserId).mo142918b(C88925a.m154180b(C88946a.f201991c)).mo142909a(C88391a.m153580a(C88392a.f200660a)).mo142915a(new C59530a.C59533c(curUserId, dVar), new C59530a.C59534d(dVar)), "");
    }

    @Override // com.p2082ss.android.ugc.aweme.mix.services.IMixFeedService
    /* renamed from: a */
    public final void mo97322a(boolean z) {
        IAccountUserService g = C31575b.m65865g();
        C89219l.m154716b(g, "");
        User curUser = g.getCurUser();
        C89219l.m154716b(curUser, "");
        Keva repo = Keva.getRepo("play_list_" + curUser.getUid(), 0);
        C89219l.m154716b(repo, "");
        repo.storeBoolean("show_personal_account_tis_flag", z);
    }

    @Override // com.p2082ss.android.ugc.aweme.mix.services.IMixFeedService
    /* renamed from: a */
    public final void mo97320a(String str, String str2, String str3, String str4, C59538b bVar) {
        String str5 = str3;
        String str6 = str2;
        String str7 = str;
        String str8 = "";
        if (str7 == null) {
            str7 = str8;
        }
        if (str6 == null) {
            str6 = str8;
        }
        if (str5 == null) {
            str5 = str8;
        }
        if (str4 != null) {
            str8 = str4;
        }
        C59330a.m109036a(str7, str6, str5, str8, null, null, null, bVar, 112);
    }

    @Override // com.p2082ss.android.ugc.aweme.mix.services.IMixFeedService
    /* renamed from: a */
    public final void mo97321a(String str, String str2, String str3, String str4, String str5, C59538b bVar) {
        String str6 = str;
        String str7 = str2;
        String str8 = str4;
        String str9 = "";
        if (str6 == null) {
            str6 = str9;
        }
        if (str7 == null) {
            str7 = str9;
        }
        if (str8 == null) {
            str8 = str9;
        }
        if (str3 != null) {
            str9 = str3;
        }
        C59330a.m109035a(str6, str7, str8, str9, 0, str5, null, null, null, bVar, 448);
    }

    @Override // com.p2082ss.android.ugc.aweme.mix.services.IMixFeedService
    /* renamed from: a */
    public final void mo97319a(String str, String str2, String str3, String str4, float f, C59538b bVar) {
        String searchId;
        String str5 = "";
        if (str == null) {
            str = str5;
        }
        if (str2 == null) {
            str2 = str5;
        }
        if (str3 == null) {
            str3 = str5;
        }
        if (str4 == null) {
            str4 = str5;
        }
        C89219l.m154721d(str, str5);
        C89219l.m154721d(str2, str5);
        C89219l.m154721d(str3, str5);
        C89219l.m154721d(str4, str5);
        C33744d a = new C33744d().mo59983a("enter_from", str).mo59983a("playlist_id", str2).mo59983a("group_id", str3).mo59983a("author_id", str4).mo59979a("video_current_time", f);
        if (!(bVar == null || (searchId = bVar.getSearchId()) == null)) {
            str5 = searchId;
        }
        C33744d a2 = a.mo59983a("search_id", str5);
        String str6 = null;
        C33744d a3 = a2.mo59982a("is_from_video", bVar != null ? bVar.isFromVideo() : null);
        if (bVar != null) {
            str6 = bVar.getSearchType();
        }
        C39162r.m79460a("click_playlist_entrance", a3.mo59983a("search_type", str6).f79943a);
    }

    @Override // com.p2082ss.android.ugc.aweme.mix.services.IMixFeedService
    /* renamed from: a */
    public final void mo97317a(String str, String str2, Context context) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C89219l.m154721d(context, "");
        m109435k().mo97312a(context, new Bundle(), (C59413b.m109112a() == 1 || C59413b.m109112a() == 2) ? 2 : 1, str, str2);
    }

    @Override // com.p2082ss.android.ugc.aweme.mix.services.IMixFeedService
    /* renamed from: a */
    public final void mo97318a(String str, String str2, AbstractC59389c cVar) {
        C89219l.m154721d(cVar, "");
        if (str != null && str2 != null) {
            C89219l.m154721d(str, "");
            C89219l.m154721d(str2, "");
            C89219l.m154721d(cVar, "");
            C89219l.m154716b(MixFeedApi.C59385a.m109095a().getUserMixList(str, 0, str2).mo142918b(C88925a.m154180b(C88946a.f201991c)).mo142909a(C88391a.m153580a(C88392a.f200660a)).mo142915a(new C59530a.C59535e(str, cVar), new C59530a.C59536f(cVar)), "");
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.mix.services.IMixFeedService
    /* renamed from: c */
    public final boolean mo97327c() {
        return C59622b.m109207a();
    }

    @Override // com.p2082ss.android.ugc.aweme.mix.services.IMixFeedService
    /* renamed from: h */
    public final int mo97332h() {
        return C59413b.m109112a();
    }

    @Override // com.p2082ss.android.ugc.aweme.mix.services.IMixFeedService
    /* renamed from: a */
    public final boolean mo97323a() {
        return C59622b.m109207a();
    }

    @Override // com.p2082ss.android.ugc.aweme.mix.services.IMixFeedService
    /* renamed from: g */
    public final void mo97331g() {
        C59330a.m109032a("", 1, "video_post_page", "split_longvideo");
    }

    @Override // com.p2082ss.android.ugc.aweme.mix.services.IMixFeedService
    /* renamed from: i */
    public final boolean mo97333i() {
        if (C59412a.m109111a() == 1) {
            return true;
        }
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.mix.services.IMixFeedService
    /* renamed from: j */
    public final boolean mo97334j() {
        if (C59412a.m109111a() == 2) {
            return true;
        }
        return false;
    }

    /* renamed from: k */
    public static IMixFeedService m109435k() {
        Object a = C81908b.m141854a(IMixFeedService.class, false);
        if (a != null) {
            return (IMixFeedService) a;
        }
        return new MixFeedService();
    }

    @Override // com.p2082ss.android.ugc.aweme.mix.services.IMixFeedService
    /* renamed from: b */
    public final boolean mo97325b() {
        if (Keva.getRepo("keva_mixlist_repo_name").getInt(C59530a.m109167a("keva_mixlist_num_key"), 0) <= 0) {
            return true;
        }
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.mix.services.IMixFeedService
    /* renamed from: e */
    public final void mo97329e() {
        IAccountUserService g = C31575b.m65865g();
        C89219l.m154716b(g, "");
        User curUser = g.getCurUser();
        C89219l.m154716b(curUser, "");
        Keva repo = Keva.getRepo("play_list_" + curUser.getUid(), 0);
        C89219l.m154716b(repo, "");
        repo.storeBoolean("show_profile_empty_flag", false);
    }

    @Override // com.p2082ss.android.ugc.aweme.mix.services.IMixFeedService
    /* renamed from: f */
    public final boolean mo97330f() {
        IAccountUserService g = C31575b.m65865g();
        C89219l.m154716b(g, "");
        User curUser = g.getCurUser();
        C89219l.m154716b(curUser, "");
        Keva repo = Keva.getRepo("play_list_" + curUser.getUid(), 0);
        C89219l.m154716b(repo, "");
        return repo.getBoolean("show_profile_empty_flag", true);
    }

    @Override // com.p2082ss.android.ugc.aweme.mix.services.IMixFeedService
    /* renamed from: b */
    public final boolean mo97326b(Aweme aweme) {
        PlayListInfo playListInfo;
        if (aweme == null || (playListInfo = aweme.playlist_info) == null || playListInfo.getMixId() == null) {
            return false;
        }
        return true;
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.services.MixFeedService$d */
    static final class C59926d extends AbstractC89220m implements AbstractC89172b<C23025b, C89391z> {

        /* renamed from: a */
        final /* synthetic */ Context f136507a;

        static {
            Covode.recordClassIndex(70343);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C59926d(Context context) {
            super(1);
            this.f136507a = context;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C23025b bVar) {
            C23025b bVar2 = bVar;
            C89219l.m154721d(bVar2, "");
            String string = this.f136507a.getString(R.string.bx);
            C89219l.m154716b(string, "");
            bVar2.mo37417a(string, (AbstractC89172b<? super C23024a, C89391z>) null);
            return C89391z.f203057a;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.mix.services.IMixFeedService
    /* renamed from: a */
    public final void mo97310a(Context context) {
        C89219l.m154721d(context, "");
        ((C23023b) C23028c.m43435a((C23023b) new C23023b(context).mo37483b(R.string.gfb), new C59926d(context)).mo37482a(false)).mo37405a().mo37396b().show();
    }

    /* renamed from: a */
    private static void m109434a(Context context, Intent intent) {
        C84349a.m145093a(intent, context);
        context.startActivity(intent);
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.services.MixFeedService$c */
    static final class DialogInterface$OnClickListenerC59925c implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ AbstractC59387a f136506a;

        static {
            Covode.recordClassIndex(70342);
        }

        DialogInterface$OnClickListenerC59925c(AbstractC59387a aVar) {
            this.f136506a = aVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            this.f136506a.mo84871b(false);
            if (dialogInterface != null) {
                dialogInterface.dismiss();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.services.MixFeedService$b */
    static final class DialogInterface$OnClickListenerC59924b implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ Activity f136500a;

        /* renamed from: b */
        final /* synthetic */ Aweme f136501b;

        /* renamed from: c */
        final /* synthetic */ C89233z.C89238e f136502c;

        /* renamed from: d */
        final /* synthetic */ AbstractC59387a f136503d;

        /* renamed from: e */
        final /* synthetic */ String f136504e;

        /* renamed from: f */
        final /* synthetic */ String f136505f;

        static {
            Covode.recordClassIndex(70341);
        }

        DialogInterface$OnClickListenerC59924b(Activity activity, Aweme aweme, C89233z.C89238e eVar, AbstractC59387a aVar, String str, String str2) {
            this.f136500a = activity;
            this.f136501b = aweme;
            this.f136502c = eVar;
            this.f136503d = aVar;
            this.f136504e = str;
            this.f136505f = str2;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            C59530a.m109170a(this.f136500a, this.f136501b, this.f136502c.element, MixFeedApi.EnumC59386b.VIDEOREMOVE.getOperation(), this.f136503d, this.f136504e, this.f136505f);
            dialogInterface.dismiss();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.mix.services.IMixFeedService
    /* renamed from: a */
    public final void mo97311a(Context context, Bundle bundle) {
        C89219l.m154721d(context, "");
        C89219l.m154721d(bundle, "");
        Intent buildIntent = SmartRouter.buildRoute(context, "//mix/feed_manage").buildIntent();
        buildIntent.putExtras(bundle);
        m109434a(context, buildIntent);
    }

    @Override // com.p2082ss.android.ugc.aweme.mix.services.IMixFeedService
    /* renamed from: a */
    public final RecyclerView.ViewHolder mo97305a(ViewGroup viewGroup, boolean z, boolean z2, String str, AbstractC59393g gVar) {
        C89219l.m154721d(viewGroup, "");
        C89219l.m154721d(str, "");
        View a = C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), R.layout.aks, viewGroup, false);
        C89219l.m154716b(a, "");
        return new C59911c(a, z, z2, str, gVar);
    }

    @Override // com.p2082ss.android.ugc.aweme.mix.services.IMixFeedService
    /* renamed from: a */
    public final void mo97307a(Activity activity, Aweme aweme, AbstractC59387a aVar, String str, String str2) {
        String str3;
        PlayListInfo playListInfo;
        C89219l.m154721d(activity, "");
        C89219l.m154721d(aVar, "");
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C89233z.C89238e eVar = new C89233z.C89238e();
        eVar.element = "";
        if (aweme == null || (playListInfo = aweme.playlist_info) == null) {
            str3 = "";
        } else {
            str3 = playListInfo.getMixName();
            if (str3 == null) {
                str3 = "";
            }
            T t = (T) playListInfo.getMixId();
            if (t != null) {
                eVar.element = t;
            }
        }
        C17197a.C17200a aVar2 = new C17197a.C17200a(activity);
        String string = activity.getResources().getString(R.string.f_q);
        C89219l.m154716b(string, "");
        String a = C1764a.m5928a(string, Arrays.copyOf(new Object[]{str3}, 1));
        C89219l.m154716b(a, "");
        aVar2.f41070a = a;
        aVar2.mo27194b(R.string.f_r).mo27190a(R.string.f_t, (DialogInterface.OnClickListener) new DialogInterface$OnClickListenerC59924b(activity, aweme, eVar, aVar, str, str2), false).mo27195b(R.string.a8y, (DialogInterface.OnClickListener) new DialogInterface$OnClickListenerC59925c(aVar), false).mo27193a().mo27185c();
    }

    @Override // com.p2082ss.android.ugc.aweme.mix.services.IMixFeedService
    /* renamed from: a */
    public final void mo97308a(Activity activity, Aweme aweme, String str, String str2, String str3, String str4) {
        C89219l.m154721d(activity, "");
        C89219l.m154721d(aweme, "");
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C89219l.m154721d(str3, "");
        C89219l.m154721d(str4, "");
        C89219l.m154721d(aweme, "");
        C89219l.m154721d(str3, "");
        C89219l.m154721d(str4, "");
        Bundle bundle = new Bundle();
        bundle.putSerializable("key_add_mix_aweme", aweme);
        bundle.putString("key_choosed_mix_id", str);
        bundle.putString("key_choosed_mix_name", str2);
        bundle.putString("enter_from", str3);
        bundle.putString("enter_method", str4);
        AddFeedToMixFragment addFeedToMixFragment = new AddFeedToMixFragment();
        addFeedToMixFragment.setArguments(bundle);
        C23226a.C23227a a = new C23226a.C23227a().mo37817a(addFeedToMixFragment).mo37822b(false).mo37812a(1);
        double b = (double) C13628n.m24521b(activity);
        Double.isNaN(b);
        C23226a aVar = a.mo37821b((int) (b * 0.7d)).mo37824c(false).mo37811a().f55057a;
        if (activity instanceof ActivityC0945e) {
            aVar.show(((ActivityC0945e) activity).getSupportFragmentManager(), "Add_video_to_mix");
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.mix.services.IMixFeedService
    /* renamed from: a */
    public final void mo97309a(Activity activity, AbstractC59388b bVar, String str, String str2, String str3, String str4) {
        C89219l.m154721d(activity, "");
        C89219l.m154721d(bVar, "");
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C89219l.m154721d(str3, "");
        C89219l.m154721d(str4, "");
        C89219l.m154721d(bVar, "");
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        Bundle bundle = new Bundle();
        bundle.putBoolean("key_full_scrren", true);
        bundle.putString("key_choosed_mix_id", str3);
        bundle.putString("key_choosed_mix_name", str4);
        bundle.putString("enter_from", str);
        bundle.putString("enter_method", str2);
        AddFeedToMixFragment addFeedToMixFragment = new AddFeedToMixFragment();
        addFeedToMixFragment.setArguments(bundle);
        addFeedToMixFragment.f135569d = bVar;
        if (activity instanceof ActivityC0945e) {
            AbstractC0952i supportFragmentManager = ((ActivityC0945e) activity).getSupportFragmentManager();
            C89219l.m154716b(supportFragmentManager, "");
            C89219l.m154721d(supportFragmentManager, "");
            try {
                AbstractC0976n a = supportFragmentManager.mo3552a();
                C89219l.m154716b(a, "");
                a.mo3451a(R.anim.dq, R.anim.dx);
                a.mo3454a(R.id.dnh, addFeedToMixFragment, "Add_video_to_mix");
                a.mo3476d();
            } catch (IllegalStateException e) {
                e.printStackTrace();
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.mix.services.IMixFeedService
    /* renamed from: a */
    public final C23226a mo97306a(Context context, String str, String str2, Aweme aweme, String str3, String str4, String str5) {
        String str6;
        AbstractC0952i supportFragmentManager;
        PlayListInfo playListInfo;
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C89219l.m154721d(str3, "");
        C89219l.m154721d(str4, "");
        if (context == null) {
            return null;
        }
        if (aweme == null || (playListInfo = aweme.playlist_info) == null || (str6 = playListInfo.getMixName()) == null) {
            str6 = "";
        }
        C89219l.m154721d(str2, "");
        C89219l.m154721d(str6, "");
        C89219l.m154721d(str, "");
        C89219l.m154721d(str3, "");
        C89219l.m154721d(str4, "");
        Bundle bundle = new Bundle();
        bundle.putSerializable("key_positioned_aweme", aweme);
        bundle.putString("key_mix_id", str2);
        bundle.putString("key_mix_name", str6);
        bundle.putString("key_mix_uid", str3);
        bundle.putString("key_mix_secuid", str4);
        bundle.putString("enter_from", str6);
        bundle.putString("key_mix_dialog_enter_from", str);
        bundle.putString("key_video_from", str5);
        C59701o oVar = new C59701o();
        oVar.setArguments(bundle);
        C23226a.C23227a a = new C23226a.C23227a().mo37817a(oVar).mo37815a(new C59701o.DialogInterface$OnDismissListenerC59720r(oVar)).mo37812a(1);
        double b = (double) C13628n.m24521b(context);
        Double.isNaN(b);
        C23226a aVar = a.mo37821b((int) (b * 0.73d)).mo37822b(false).f55057a;
        if ((context instanceof ActivityC0945e) && (supportFragmentManager = ((ActivityC0945e) context).getSupportFragmentManager()) != null) {
            aVar.show(supportFragmentManager, "MixVideosDialog");
        }
        return aVar;
    }

    /* renamed from: a */
    private static C59537a m109433a(String str, Aweme aweme, String str2, String str3, String str4, String str5, boolean z, C59538b bVar, Float f, String str6) {
        C59537a aVar = new C59537a();
        aVar.setMVideoFrom(str2);
        aVar.setMNeedShowDialog(z);
        aVar.setEnterGroupId(str);
        aVar.setVideoPlayedPercentage(f);
        if (aweme != null) {
            aVar.setMSecUid(aweme.getSecAuthorUid());
            aVar.setMUsrId(aweme.getAuthorUid());
            aVar.setMAweme(aweme);
            aVar.setMAid(aweme.getAid());
        }
        if (!TextUtils.isEmpty(str4)) {
            aVar.setMUsrId(str4);
        }
        if (!TextUtils.isEmpty(str5)) {
            aVar.setMSecUid(str5);
        }
        aVar.setSearchParam(bVar);
        aVar.setMEventType("playlist");
        aVar.setMixId(str3);
        aVar.setPreviousPage(str6);
        aVar.setPageStartTime(SystemClock.elapsedRealtime());
        return aVar;
    }
}
