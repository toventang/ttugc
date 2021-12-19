package com.p2082ss.android.ugc.aweme.p2479ck;

import com.bytedance.covode.number.Covode;
import com.bytedance.p1007g.C14853c;
import com.p2082ss.android.ugc.aweme.challenge.p2454ui.ChallengeDetailActivity;
import com.p2082ss.android.ugc.aweme.compliance.api.C39223a;
import com.p2082ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity;
import com.p2082ss.android.ugc.aweme.detail.p2751ui.DetailActivity;
import com.p2082ss.android.ugc.aweme.friends.p3022ui.InviteUserListActivity;
import com.p2082ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p2082ss.android.ugc.aweme.p2479ck.C36125t;
import com.p2082ss.android.ugc.aweme.profile.p3576ui.ProfileEditActivity;
import com.p2082ss.android.ugc.aweme.profile.p3576ui.UserProfileActivity;
import com.p2082ss.android.ugc.aweme.prop.impl.PropReuseServiceImpl;
import com.p2082ss.android.ugc.aweme.question.QuestionDetailActivity;
import com.p2082ss.android.ugc.aweme.splash.SplashActivity;
import com.p2082ss.android.ugc.trill.setting.PushSettingActivity;
import java.lang.reflect.Type;

/* renamed from: com.ss.android.ugc.aweme.ck.s */
public final class C36124s implements C36125t.AbstractC36129a {
    static {
        Covode.recordClassIndex(43377);
    }

    @Override // com.p2082ss.android.ugc.aweme.p2479ck.C36125t.AbstractC36129a
    /* renamed from: a */
    public final void mo63246a() {
        C36125t.f85343d = ((Boolean) C14853c.m27276a("smart_router_enable", (Type) Boolean.class, (Object) true, false)).booleanValue();
        C36125t.m73594a("aweme://main", SplashActivity.class);
        C36125t.m73594a("aweme://push-setting", PushSettingActivity.class);
        C36125t.m73594a("aweme://profile_edit", ProfileEditActivity.class);
        C36125t.m73594a("aweme://draft_box", AVExternalServiceImpl.m113114a().classnameService().getDraftBoxActivity());
        C36125t.m73594a("aweme://challenge/detail/:id", ChallengeDetailActivity.class);
        C36125t.m73594a("aweme://qna/detail/:id", QuestionDetailActivity.class);
        C36125t.m73594a("aweme://user/profile/:uid", UserProfileActivity.class);
        C36125t.m73594a("aweme://user/profile/:uid/:room_id/:room_owner_id/:request_id/:user_type", UserProfileActivity.class);
        C36125t.m73594a("aweme://aweme/detail/:id", DetailActivity.class);
        C36125t.m73594a("aweme://aweme/detaillist/:ids", DetailActivity.class);
        C36125t.m73594a("aweme://story/detail", DetailActivity.class);
        C36125t.m73594a("aweme://webview/", CrossPlatformActivity.class);
        C36125t.m73594a("aweme://reactnative/", CrossPlatformActivity.class);
        C36125t.m73594a("aweme://webview/", CrossPlatformActivity.class);
        C36125t.m73594a("aweme://friend/find", InviteUserListActivity.class);
        C36125t.m73591a();
        C36125t.m73593a("aweme://aweme/challenge/detail/", new C36122q(C36099e.f85308a));
        C36125t.m73591a();
        C36125t.m73593a("aweme://teen_protection", C39223a.m79602p().mo68652b());
        C36125t.m73591a();
        C36125t.m73593a("aweme://privacy/setting/modify/", C39223a.m79602p().mo68654c());
        C36125t.m73594a("aweme://studio/create", AVExternalServiceImpl.m113114a().classnameService().getVideoRecordPermissionActivityClass());
        C36125t.m73594a("aweme://stickers/detail/:id", PropReuseServiceImpl.m116994c().mo104486b());
    }
}
