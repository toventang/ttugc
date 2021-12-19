package com.p2082ss.android.ugc.aweme.profile.p3576ui;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.widget.LinearLayout;
import androidx.fragment.app.AbstractC0952i;
import androidx.fragment.app.Fragment;
import com.bytedance.apm.agent.p757v2.instrumentation.ActivityAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.utils.C15477a;
import com.bytedance.ies.dmt.p1194ui.widget.DmtStatusView;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.kakao.usermgmt.StringSet;
import com.p2082ss.android.ugc.aweme.base.AbstractC34585f;
import com.p2082ss.android.ugc.aweme.base.p2364a.AbstractC34466a;
import com.p2082ss.android.ugc.aweme.base.p2364a.AbstractC34472g;
import com.p2082ss.android.ugc.aweme.detail.transition.C41327a;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.p2970ui.SlideSwitchLayout;
import com.p2082ss.android.ugc.aweme.miniapp_api.C59287a;
import com.p2082ss.android.ugc.aweme.profile.arg.UserProfileArg;
import com.p2082ss.android.ugc.aweme.profile.p3576ui.p3580d.AbstractC64149b;
import com.p2082ss.android.ugc.aweme.profile.p3576ui.p3580d.AbstractC64151d;
import com.p2082ss.android.ugc.aweme.profile.p3576ui.p3581v2.C64250i;
import com.p2082ss.android.ugc.aweme.profile.presenter.AbstractC63858v;
import com.p2082ss.android.ugc.aweme.profile.presenter.C63824ac;
import com.p2082ss.android.ugc.aweme.push.C65691a;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.profile.ui.UserProfileActivity */
public class UserProfileActivity extends AbstractActivityC63979ak implements AbstractC34472g, AbstractC34585f, AbstractC63858v {

    /* renamed from: a */
    LinearLayout f145045a;

    /* renamed from: b */
    SlideSwitchLayout f145046b;

    /* renamed from: c */
    protected DmtStatusView f145047c;

    /* renamed from: d */
    private UserProfileArg f145048d;

    /* renamed from: e */
    private Aweme f145049e;

    /* renamed from: f */
    private C63824ac f145050f;

    /* renamed from: g */
    private String f145051g;

    /* renamed from: h */
    private List<AbstractC34466a> f145052h = new ArrayList();

    static {
        Covode.recordClassIndex(75399);
    }

    @Override // com.p2082ss.android.ugc.aweme.base.AbstractC34585f
    /* renamed from: c */
    public final String mo61041c() {
        return "others_homepage";
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d
    public void onDestroy() {
        C15477a.m28479e(this);
        super.onDestroy();
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d
    public void onStart() {
        C15477a.m28473a(this);
        super.onStart();
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a
    public void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.profile.ui.UserProfileActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a
    public void onPause() {
        C15477a.m28477c(this);
        super.onPause();
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.presenter.AbstractC63858v
    /* renamed from: d */
    public final void mo103335d() {
        this.f145047c.mo27382d();
        try {
            onBackPressed();
        } catch (Exception unused) {
            finish();
        }
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a
    public void finish() {
        super.finish();
        C65691a.m117584a(this);
        C59287a.m108997a(this);
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a
    public void onResume() {
        C15477a.m28476b(this);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.profile.ui.UserProfileActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.profile.ui.UserProfileActivity", "onResume", false);
    }

    /* renamed from: a */
    private void m115668a() {
        AbstractC0952i supportFragmentManager = getSupportFragmentManager();
        Fragment a = supportFragmentManager.mo3551a("userprofilefragment");
        if (a == null) {
            a = new C64250i();
            a.setArguments(m115669b());
        }
        supportFragmentManager.mo3552a().mo3470b(R.id.ffp, a, "userprofilefragment").mo3473c();
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d
    public void onStop() {
        C15477a.m28478d(this);
        super.onStop();
        if (EnterTransitionCrashOptimizer.getContext() != null && Build.VERSION.SDK_INT >= 21) {
            try {
                getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
            } catch (Throwable unused) {
            }
        }
        if (Build.VERSION.SDK_INT >= 21) {
            try {
                getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
            } catch (Throwable unused2) {
            }
        }
    }

    /* renamed from: b */
    private Bundle m115669b() {
        Bundle bundle = new Bundle();
        bundle.putString("uid", this.f145048d.getUserId());
        bundle.putString("sec_user_id", this.f145048d.getSecUid());
        bundle.putString("profile_from", this.f145048d.getLabel());
        bundle.putString("video_id", this.f145048d.getAid());
        bundle.putString("profile_from", "other_user");
        bundle.putString(StringSet.type, this.f145048d.getType());
        bundle.putString("enter_method", this.f145048d.getEnterMethod());
        bundle.putString("enter_from", this.f145048d.getEnterFrom());
        bundle.putString("position", this.f145048d.getPosition());
        bundle.putString("profile_from_scene", this.f145048d.getProfileFromScene());
        if (!TextUtils.isEmpty(this.f145048d.getPreviousPage())) {
            bundle.putString("extra_previous_page", this.f145048d.getPreviousPage());
        }
        bundle.putString("request_id", this.f145048d.getLiveRequestId());
        bundle.putString("room_id", this.f145048d.getLiveRoomId());
        bundle.putString("room_owner_id", this.f145048d.getLiveRoomOwnerId());
        bundle.putString("user_type", this.f145048d.getLiveType());
        String trackParams = this.f145048d.getTrackParams();
        if (!TextUtils.isEmpty(trackParams)) {
            try {
                bundle.putString("show_window_source", new JSONObject(trackParams).optString("show_window_source"));
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        bundle.putBoolean("is_live_record", this.f145048d.isFromLiveRecord());
        bundle.putString("search_request_id", this.f145048d.getSearchRequestId());
        bundle.putBoolean("isFromFeed", false);
        bundle.putString("extra_previous_page_position", m115667a(getIntent(), "extra_previous_page_position"));
        bundle.putString("enter_from_request_id", m115667a(getIntent(), "enter_from_request_id"));
        bundle.putString("scene_id", this.f145048d.getSceneId());
        bundle.putInt("need_track_compare_recommend_reason", getIntent().getIntExtra("need_track_compare_recommend_reason", 0));
        bundle.putString("previous_recommend_reason", m115667a(getIntent(), "previous_recommend_reason"));
        bundle.putString("recommend_from_type", m115667a(getIntent(), "recommend_from_type"));
        bundle.putInt("is_cold_launch", getIntent().getIntExtra("is_cold_launch", 0));
        bundle.putInt("from_recommend_card", getIntent().getIntExtra("from_recommend_card", 0));
        bundle.putString("id", m115667a(getIntent(), "id"));
        bundle.putInt("general_search_card_type", getIntent().getIntExtra("general_search_card_type", 0));
        bundle.putBoolean("is_notify_miniapp_follow_status", getIntent().getBooleanExtra("is_notify_miniapp_follow_status", false));
        bundle.putSerializable("recommend_enter_profile_params", getIntent().getSerializableExtra("recommend_enter_profile_params"));
        bundle.putSerializable("extra_mutual_relation", getIntent().getSerializableExtra("extra_mutual_relation"));
        bundle.putBoolean("extra_from_mutual", getIntent().getBooleanExtra("extra_from_mutual", false));
        bundle.putString("event_keys", m115667a(getIntent(), "event_keys"));
        return bundle;
    }

    @Override // com.p2082ss.android.ugc.aweme.base.p2364a.AbstractC34472g
    public void unRegisterActivityOnKeyDownListener(AbstractC34466a aVar) {
        List<AbstractC34466a> list = this.f145052h;
        if (list != null) {
            list.remove(aVar);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.base.p2364a.AbstractC34472g
    public void registerActivityOnKeyDownListener(AbstractC34466a aVar) {
        if (!this.f145052h.contains(aVar)) {
            this.f145052h.add(aVar);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:36:0x01d6, code lost:
        if (android.text.TextUtils.equals(r9.f145048d.getUserId(), com.p2082ss.android.ugc.aweme.account.C31575b.m65865g().getCurUserId()) != false) goto L_0x015a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x023e  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x024b  */
    @Override // androidx.core.app.ActivityC0580d, androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d, com.p2082ss.android.ugc.aweme.profile.p3576ui.AbstractActivityC63979ak, com.bytedance.ies.powerpage.ActivityC17733a
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r10) {
        /*
        // Method dump skipped, instructions count: 590
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.profile.p3576ui.UserProfileActivity.onCreate(android.os.Bundle):void");
    }

    /* renamed from: a */
    private static String m115667a(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.presenter.AbstractC63858v
    /* renamed from: a */
    public final void mo103334a(String str, String str2) {
        this.f145048d.setUserId(str);
        this.f145048d.setSecUid(str2);
        m115668a();
        this.f145047c.mo27382d();
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a
    public void onActivityReenter(int i, Intent intent) {
        C41327a.m83190a(this, i);
        if (-1 == i && intent != null) {
            String a = m115667a(intent, "feed_share_element_aid");
            AbstractC0952i supportFragmentManager = getSupportFragmentManager();
            if (supportFragmentManager.mo3551a("userprofilefragment") instanceof AbstractC64151d) {
                ((AbstractC64151d) supportFragmentManager.mo3551a("userprofilefragment")).mo103762e(a);
            } else if (supportFragmentManager.mo3551a("myprofilefragment") instanceof AbstractC64149b) {
                ((AbstractC64149b) supportFragmentManager.mo3551a("myprofilefragment")).mo103745a(a);
            }
        }
        super.onActivityReenter(i, intent);
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (isDestroyed()) {
            return false;
        }
        for (AbstractC34466a aVar : this.f145052h) {
            if (aVar.onKeyDown(i, keyEvent)) {
                return true;
            }
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, com.bytedance.ies.powerpage.ActivityC17733a
    public void onActivityResult(int i, int i2, Intent intent) {
        if (i == 1) {
            if (i2 == 2) {
                SlideSwitchLayout slideSwitchLayout = this.f145046b;
                if (slideSwitchLayout != null) {
                    slideSwitchLayout.setCurrentItem("page_profile");
                    return;
                }
                return;
            }
        } else if (i == 10086 && i2 == -1) {
            setResult(-1, intent);
            activityConfiguration(C64130cu.f145486a);
            finish();
            return;
        }
        super.onActivityResult(i, i2, intent);
    }
}
