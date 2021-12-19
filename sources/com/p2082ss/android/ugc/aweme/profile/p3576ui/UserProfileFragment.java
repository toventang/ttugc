package com.p2082ss.android.ugc.aweme.profile.p3576ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.LinearLayout;
import androidx.fragment.app.AbstractC0952i;
import androidx.fragment.app.AbstractC0976n;
import androidx.fragment.app.ActivityC0945e;
import androidx.fragment.app.Fragment;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.widget.DmtStatusView;
import com.bytedance.ies.foundation.activity.ActivityC17312a;
import com.bytedance.ies.foundation.activity.BaseActivityViewModel;
import com.bytedance.ies.foundation.base.AbstractC17362a;
import com.bytedance.ies.foundation.fragment.BaseFragmentViewModel;
import com.bytedance.ies.foundation.fragment.C17372a;
import com.bytedance.ies.powerpage.AbstractC17736b;
import com.bytedance.ies.powerpage.AbstractC17738c;
import com.bytedance.ies.powerpage.p1235a.AbstractC17735a;
import com.bytedance.router.arg.RouteArgExtension;
import com.kakao.usermgmt.StringSet;
import com.p2082ss.android.ugc.aweme.activity.processor.AbstractC33100u;
import com.p2082ss.android.ugc.aweme.activity.processor.C33074d;
import com.p2082ss.android.ugc.aweme.activity.processor.C33103x;
import com.p2082ss.android.ugc.aweme.base.AbstractC34585f;
import com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a;
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
import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;
import p4600h.AbstractC89244h;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

@AbstractC17735a
/* renamed from: com.ss.android.ugc.aweme.profile.ui.UserProfileFragment */
public final class UserProfileFragment extends C17372a implements AbstractC17736b, AbstractC33100u, AbstractC34585f, AbstractC63858v {

    /* renamed from: e */
    public LinearLayout f145053e;

    /* renamed from: f */
    public SlideSwitchLayout f145054f;

    /* renamed from: g */
    public C33074d f145055g;

    /* renamed from: h */
    private final AbstractC89244h f145056h = RouteArgExtension.INSTANCE.navArg(this, C63957a.f145062a);

    /* renamed from: i */
    private Aweme f145057i;

    /* renamed from: j */
    private C63824ac f145058j;

    /* renamed from: k */
    private DmtStatusView f145059k;

    /* renamed from: l */
    private String f145060l;

    /* renamed from: m */
    private SparseArray f145061m;

    static {
        Covode.recordClassIndex(75400);
    }

    /* renamed from: e */
    private final UserProfileArg m115674e() {
        return (UserProfileArg) this.f145056h.getValue();
    }

    @Override // com.bytedance.ies.foundation.fragment.C17372a
    /* renamed from: a */
    public final View mo27715a(int i) {
        if (this.f145061m == null) {
            this.f145061m = new SparseArray();
        }
        View view = (View) this.f145061m.get(i);
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f145061m.put(i, findViewById);
        return findViewById;
    }

    @Override // com.p2082ss.android.ugc.aweme.activity.processor.AbstractC33100u
    /* renamed from: a */
    public final boolean mo58849a() {
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.activity.processor.AbstractC33100u
    /* renamed from: a */
    public final boolean mo58850a(int i, KeyEvent keyEvent) {
        return false;
    }

    @Override // com.bytedance.ies.foundation.fragment.C17372a
    public final void bx_() {
        SparseArray sparseArray = this.f145061m;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    @Override // com.bytedance.ies.foundation.fragment.C17372a, com.p2082ss.android.ugc.aweme.base.AbstractC34585f
    /* renamed from: c */
    public final String mo64296c() {
        return "others_homepage";
    }

    @Override // com.bytedance.ies.powerpage.AbstractC17736b
    public final void onActivityResult_Activity(int i, int i2, Intent intent) {
        AbstractC17738c.m32873a(this, i, i2, intent);
    }

    @Override // com.bytedance.ies.powerpage.AbstractC17736b
    public final void onBackPressed_Activity() {
        AbstractC17738c.m32872a(this);
    }

    @Override // com.bytedance.ies.foundation.fragment.C17372a, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        bx_();
    }

    @Override // com.bytedance.ies.powerpage.AbstractC17736b
    public final void onNewIntent(Intent intent) {
    }

    /* renamed from: h */
    private static AbstractC34586a m115677h() {
        return new C64250i();
    }

    /* renamed from: i */
    private void m115678i() {
        ActivityC0945e activity = getActivity();
        if (activity != null) {
            C89219l.m154716b(activity, "");
            activity.finish();
            C65691a.m117584a(activity);
            C59287a.m108997a(activity);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.presenter.AbstractC63858v
    /* renamed from: d */
    public final void mo103335d() {
        DmtStatusView dmtStatusView = this.f145059k;
        if (dmtStatusView != null) {
            dmtStatusView.mo27382d();
        }
        try {
            ActivityC0945e activity = getActivity();
            if (activity != null) {
                activity.onBackPressed();
            }
        } catch (Exception unused) {
            m115678i();
        }
    }

    @Override // com.bytedance.ies.foundation.fragment.C17372a, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        C33074d dVar = this.f145055g;
        if (dVar != null) {
            dVar.f78634b.activityConfiguration(new C33074d.C33075a(dVar));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.UserProfileFragment$a */
    static final class C63957a extends AbstractC89220m implements AbstractC89171a<UserProfileArg> {

        /* renamed from: a */
        public static final C63957a f145062a = new C63957a();

        static {
            Covode.recordClassIndex(75401);
        }

        C63957a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ UserProfileArg invoke() {
            return new UserProfileArg(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, 67108863, null);
        }
    }

    /* renamed from: f */
    private final void m115675f() {
        AbstractC0952i childFragmentManager = getChildFragmentManager();
        C89219l.m154716b(childFragmentManager, "");
        Fragment a = childFragmentManager.mo3551a("userprofilefragment");
        if (a == null) {
            a = m115677h();
            a.setArguments(m115676g());
        }
        AbstractC0976n a2 = childFragmentManager.mo3552a();
        C89219l.m154716b(a2, "");
        a2.mo3470b(R.id.ffp, a, "userprofilefragment").mo3473c();
    }

    /* renamed from: g */
    private final Bundle m115676g() {
        String str;
        Bundle bundle = new Bundle();
        bundle.putString("uid", m115674e().getUserId());
        bundle.putString("sec_user_id", m115674e().getSecUid());
        bundle.putString("profile_from", m115674e().getLabel());
        bundle.putString("video_id", m115674e().getAid());
        bundle.putString("profile_from", "other_user");
        bundle.putString(StringSet.type, m115674e().getType());
        bundle.putString("enter_method", m115674e().getEnterMethod());
        bundle.putString("enter_from", m115674e().getEnterFrom());
        bundle.putString("position", m115674e().getPosition());
        bundle.putString("profile_from_scene", m115674e().getProfileFromScene());
        if (!TextUtils.isEmpty(m115674e().getPreviousPage())) {
            bundle.putString("extra_previous_page", m115674e().getPreviousPage());
        }
        bundle.putString("request_id", m115674e().getLiveRequestId());
        bundle.putString("room_id", m115674e().getLiveRoomId());
        bundle.putString("room_owner_id", m115674e().getLiveRoomOwnerId());
        bundle.putString("user_type", m115674e().getLiveType());
        String trackParams = m115674e().getTrackParams();
        if (!TextUtils.isEmpty(trackParams)) {
            try {
                bundle.putString("show_window_source", new JSONObject(trackParams).optString("show_window_source"));
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        bundle.putBoolean("is_live_record", m115674e().isFromLiveRecord());
        bundle.putString("search_request_id", m115674e().getSearchRequestId());
        bundle.putBoolean("isFromFeed", false);
        Bundle arguments = getArguments();
        if (arguments != null) {
            str = arguments.getString("extra_previous_page_position");
        } else {
            str = null;
        }
        bundle.putString("extra_previous_page_position", str);
        Bundle arguments2 = getArguments();
        if (arguments2 == null) {
            arguments2 = new Bundle();
        }
        C89219l.m154716b(arguments2, "");
        bundle.putString("enter_from_request_id", arguments2.getString("enter_from_request_id"));
        bundle.putString("scene_id", m115674e().getSceneId());
        bundle.putInt("need_track_compare_recommend_reason", arguments2.getInt("need_track_compare_recommend_reason", 0));
        bundle.putString("previous_recommend_reason", arguments2.getString("previous_recommend_reason"));
        bundle.putString("recommend_from_type", arguments2.getString("recommend_from_type"));
        bundle.putInt("is_cold_launch", arguments2.getInt("is_cold_launch", 0));
        bundle.putInt("from_recommend_card", arguments2.getInt("from_recommend_card", 0));
        bundle.putString("id", arguments2.getString("id"));
        bundle.putInt("general_search_card_type", arguments2.getInt("general_search_card_type", 0));
        bundle.putBoolean("is_notify_miniapp_follow_status", arguments2.getBoolean("is_notify_miniapp_follow_status", false));
        bundle.putSerializable("recommend_enter_profile_params", arguments2.getSerializable("recommend_enter_profile_params"));
        bundle.putSerializable("extra_mutual_relation", arguments2.getSerializable("extra_mutual_relation"));
        bundle.putBoolean("extra_from_mutual", arguments2.getBoolean("extra_from_mutual", false));
        bundle.putString("event_keys", arguments2.getString("event_keys"));
        return bundle;
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.UserProfileFragment$b */
    static final class C63958b extends AbstractC89220m implements AbstractC89172b<BaseActivityViewModel, C89391z> {

        /* renamed from: a */
        public static final C63958b f145063a = new C63958b();

        static {
            Covode.recordClassIndex(75402);
        }

        C63958b() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(BaseActivityViewModel baseActivityViewModel) {
            BaseActivityViewModel baseActivityViewModel2 = baseActivityViewModel;
            C89219l.m154721d(baseActivityViewModel2, "");
            baseActivityViewModel2.config(C639591.f145064a);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.UserProfileFragment$d */
    static final class C63964d extends AbstractC89220m implements AbstractC89172b<BaseFragmentViewModel, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C33103x f145070a;

        static {
            Covode.recordClassIndex(75408);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C63964d(C33103x xVar) {
            super(1);
            this.f145070a = xVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(BaseFragmentViewModel baseFragmentViewModel) {
            BaseFragmentViewModel baseFragmentViewModel2 = baseFragmentViewModel;
            C89219l.m154721d(baseFragmentViewModel2, "");
            baseFragmentViewModel2.config(new AbstractC89171a<AbstractC17362a>(this) {
                /* class com.p2082ss.android.ugc.aweme.profile.p3576ui.UserProfileFragment.C63964d.C639651 */

                /* renamed from: a */
                final /* synthetic */ C63964d f145071a;

                static {
                    Covode.recordClassIndex(75409);
                }

                {
                    this.f145071a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                @Override // p4600h.p4611f.p4612a.AbstractC89171a
                public final /* bridge */ /* synthetic */ AbstractC17362a invoke() {
                    return this.f145071a.f145070a;
                }
            });
            return C89391z.f203057a;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        Window window;
        super.onActivityCreated(bundle);
        ActivityC0945e activity = getActivity();
        if (activity != null && (window = activity.getWindow()) != null) {
            window.setSoftInputMode(48);
        }
    }

    @Override // com.bytedance.ies.powerpage.AbstractC17736b
    public final void onBeforeActivityCreated(Activity activity) {
        Activity activity2;
        if (!(activity instanceof ActivityC17312a)) {
            activity2 = null;
        } else {
            activity2 = activity;
        }
        ActivityC17312a aVar = (ActivityC17312a) activity2;
        if (aVar != null) {
            aVar.activityConfiguration(new C63960c(this, activity));
        }
    }

    @Override // com.bytedance.ies.foundation.fragment.C17372a, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C33103x xVar = new C33103x(0, false, false, 7);
        xVar.f78673g = R.color.l;
        xVar.f78670d = R.color.l;
        xVar.f78674h = true;
        mo27716a(new C63964d(xVar));
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.UserProfileFragment$c */
    static final class C63960c extends AbstractC89220m implements AbstractC89172b<BaseActivityViewModel, C89391z> {

        /* renamed from: a */
        final /* synthetic */ UserProfileFragment f145065a;

        /* renamed from: b */
        final /* synthetic */ Activity f145066b;

        static {
            Covode.recordClassIndex(75404);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C63960c(UserProfileFragment userProfileFragment, Activity activity) {
            super(1);
            this.f145065a = userProfileFragment;
            this.f145066b = activity;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(BaseActivityViewModel baseActivityViewModel) {
            BaseActivityViewModel baseActivityViewModel2 = baseActivityViewModel;
            C89219l.m154721d(baseActivityViewModel2, "");
            baseActivityViewModel2.config(C639611.f145067a);
            baseActivityViewModel2.config(C639622.f145068a);
            if (Build.VERSION.SDK_INT >= 21) {
                baseActivityViewModel2.config(new AbstractC89171a<AbstractC17362a>(this) {
                    /* class com.p2082ss.android.ugc.aweme.profile.p3576ui.UserProfileFragment.C63960c.C639633 */

                    /* renamed from: a */
                    final /* synthetic */ C63960c f145069a;

                    static {
                        Covode.recordClassIndex(75407);
                    }

                    {
                        this.f145069a = r2;
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    @Override // p4600h.p4611f.p4612a.AbstractC89171a
                    public final /* synthetic */ AbstractC17362a invoke() {
                        C33074d dVar = new C33074d((ActivityC17312a) this.f145069a.f145066b, this.f145069a.f145065a, (byte) 0);
                        this.f145069a.f145065a.f145055g = dVar;
                        return dVar;
                    }
                });
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: a */
    private static String m115673a(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.activity.processor.AbstractC33100u
    /* renamed from: a */
    public final void mo58848a(int i, Intent intent) {
        ActivityC0945e activity = getActivity();
        if (activity != null) {
            C89219l.m154716b(activity, "");
            C41327a.m83190a(activity, i);
            if (-1 == i && intent != null) {
                String a = m115673a(intent, "feed_share_element_aid");
                AbstractC0952i childFragmentManager = getChildFragmentManager();
                C89219l.m154716b(childFragmentManager, "");
                if (childFragmentManager.mo3551a("userprofilefragment") instanceof AbstractC64151d) {
                    Fragment a2 = childFragmentManager.mo3551a("userprofilefragment");
                    Objects.requireNonNull(a2, "null cannot be cast to non-null type com.ss.android.ugc.aweme.profile.ui.uiinterface.IUserProfile");
                    ((AbstractC64151d) a2).mo103762e(a);
                } else if (childFragmentManager.mo3551a("myprofilefragment") instanceof AbstractC64149b) {
                    Fragment a3 = childFragmentManager.mo3551a("myprofilefragment");
                    Objects.requireNonNull(a3, "null cannot be cast to non-null type com.ss.android.ugc.aweme.profile.ui.uiinterface.IMyProfile");
                    ((AbstractC64149b) a3).mo103745a(a);
                }
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.presenter.AbstractC63858v
    /* renamed from: a */
    public final void mo103334a(String str, String str2) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        m115674e().setUserId(str);
        m115674e().setSecUid(str2);
        m115675f();
        DmtStatusView dmtStatusView = this.f145059k;
        if (dmtStatusView != null) {
            dmtStatusView.mo27382d();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x013f, code lost:
        if (android.text.TextUtils.equals(r1, r0.getCurUserId()) != false) goto L_0x00bf;
     */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00f4 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x01d2  */
    @Override // com.bytedance.ies.foundation.fragment.C17372a, androidx.fragment.app.Fragment
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onViewCreated(android.view.View r8, android.os.Bundle r9) {
        /*
        // Method dump skipped, instructions count: 561
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.profile.p3576ui.UserProfileFragment.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C89219l.m154721d(layoutInflater, "");
        return C1764a.m5927a(layoutInflater, R.layout.amd, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        if (i == 1) {
            if (i2 == 2) {
                SlideSwitchLayout slideSwitchLayout = this.f145054f;
                if (slideSwitchLayout != null) {
                    slideSwitchLayout.setCurrentItem("page_profile");
                    return;
                }
                return;
            }
        } else if (i == 10086 && i2 == -1) {
            ActivityC0945e activity = getActivity();
            if (activity != null) {
                activity.setResult(-1, intent);
            }
            mo27717b(C63958b.f145063a);
            m115678i();
            return;
        }
        super.onActivityResult(i, i2, intent);
    }
}
