package com.p2082ss.android.ugc.aweme.discover.p2775j;

import android.util.SparseArray;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.router.SmartRouter;
import com.p2082ss.android.ugc.aweme.app.api.p2319b.C33615a;
import com.p2082ss.android.ugc.aweme.captcha.util.CaptchaHelperServiceImpl;
import com.p2082ss.android.ugc.aweme.challenge.p2448d.C35503c;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.common.MobClick;
import com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39102c;
import com.p2082ss.android.ugc.aweme.discover.adapter.C41643am;
import com.p2082ss.android.ugc.aweme.discover.mob.C42454f;
import com.p2082ss.android.ugc.aweme.discover.mob.C42466n;
import com.p2082ss.android.ugc.aweme.discover.mob.C42467o;
import com.p2082ss.android.ugc.aweme.discover.model.SearchUser;
import com.p2082ss.android.ugc.aweme.discover.p2797ui.AbstractC42637ac;
import com.p2082ss.android.ugc.aweme.discover.p2797ui.AbstractC42757bi;
import com.p2082ss.android.ugc.aweme.following.p3003ui.adapter.AbstractC51187d;
import com.p2082ss.android.ugc.aweme.friends.p3022ui.AbstractC51754w;
import com.p2082ss.android.ugc.aweme.friends.service.C51648a;
import com.p2082ss.android.ugc.aweme.metrics.C59260v;
import com.p2082ss.android.ugc.aweme.profile.model.FollowStatus;
import com.p2082ss.android.ugc.aweme.profile.model.FollowStatusEvent;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.profile.presenter.AbstractC63854r;
import com.p2082ss.android.ugc.aweme.search.C67458j;
import com.p2082ss.android.ugc.trill.R;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.greenrobot.eventbus.AbstractC90264r;
import org.greenrobot.eventbus.RunnableC90250g;
import org.greenrobot.eventbus.ThreadMode;
import org.json.JSONException;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.discover.j.q */
public final class C42115q extends AbstractC42757bi<SearchUser> implements AbstractC63854r {

    /* renamed from: a */
    public AbstractC51754w f98181a;

    /* renamed from: b */
    private SparseArray f98182b;

    static {
        Covode.recordClassIndex(50049);
    }

    @Override // com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a
    /* renamed from: H */
    public final boolean mo61043H() {
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.p2797ui.AbstractC42757bi, com.p2082ss.android.ugc.aweme.discover.p2797ui.AbstractC42670am, com.p2082ss.android.ugc.aweme.discover.p2797ui.AbstractC42690av
    /* renamed from: a */
    public final View mo71296a(int i) {
        if (this.f98182b == null) {
            this.f98182b = new SparseArray();
        }
        View view = (View) this.f98182b.get(i);
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f98182b.put(i, findViewById);
        return findViewById;
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.p2797ui.AbstractC42757bi, com.p2082ss.android.ugc.aweme.discover.p2797ui.AbstractC42670am, com.p2082ss.android.ugc.aweme.discover.p2797ui.AbstractC42690av
    public final void bb_() {
        SparseArray sparseArray = this.f98182b;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.p2797ui.AbstractC42670am
    /* renamed from: c */
    public final String mo71298c() {
        return "user";
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.presenter.AbstractC63854r
    /* renamed from: c */
    public final void mo71321c(FollowStatus followStatus) {
    }

    @Override // org.greenrobot.eventbus.AbstractC90252i, com.p2082ss.android.ugc.aweme.discover.p2797ui.AbstractC42690av
    public final Map<Integer, Object> getSubscriberEventTypes() {
        Map<Integer, Object> subscriberEventTypes = super.getSubscriberEventTypes();
        subscriberEventTypes.put(3, new RunnableC90250g(C42115q.class, "onFollowStatus", FollowStatusEvent.class, ThreadMode.POSTING, 0, false));
        subscriberEventTypes.put(13, new RunnableC90250g(C42115q.class, "onProfileFollowEvent", C35503c.class, ThreadMode.POSTING, 0, false));
        return subscriberEventTypes;
    }

    public C42115q() {
        this.f99509t = C67458j.f151134c;
    }

    @Override // com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a, com.p2082ss.android.ugc.aweme.discover.p2797ui.AbstractC42757bi, com.bytedance.ies.uikit.p1279a.AbstractC18234b, com.p2082ss.android.ugc.aweme.discover.p2797ui.AbstractC42670am, androidx.fragment.app.Fragment, com.p2082ss.android.ugc.aweme.discover.p2797ui.AbstractC42690av
    public final void onDestroyView() {
        super.onDestroyView();
        AbstractC51754w wVar = this.f98181a;
        if (wVar != null) {
            wVar.ck_();
        }
        bb_();
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.p2797ui.AbstractC42690av
    /* renamed from: m */
    public final void mo71300m() {
        mo72913a(new C41643am(this.f99507r, mo72880v(), new C42116a(), this, "search_result"));
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.p2797ui.AbstractC42690av
    /* renamed from: i */
    public final void mo71299i() {
        mo73030a(new C42120s());
        mo71349n().mo67839a_((AbstractC39102c) this);
        AbstractC51754w i = C51648a.f118980a.mo87329i();
        this.f98181a = i;
        if (i == null) {
            C89219l.m154715b();
        }
        i.mo87468a(this);
        mo71349n().mo71293a((AbstractC42637ac) this);
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.j.q$a */
    final class C42116a implements AbstractC51187d {
        static {
            Covode.recordClassIndex(50050);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public C42116a() {
        }

        @Override // com.p2082ss.android.ugc.aweme.following.p3003ui.adapter.AbstractC51187d
        /* renamed from: a */
        public final boolean mo71326a(User user) {
            int i;
            String str;
            String str2 = "search_history";
            C89219l.m154721d(user, "");
            JSONObject jSONObject = new JSONObject();
            try {
                if (!C89219l.m154714a((Object) C42115q.this.f99510u, (Object) str2)) {
                    str2 = "search_recommend";
                }
                jSONObject.put("enter_from", str2);
            } catch (Exception e) {
                e.printStackTrace();
            }
            String str3 = "follow";
            if (user.getFollowStatus() != 0) {
                C39162r.onEvent(MobClick.obtain().setEventName("follow_cancel").setLabelName("discovery").setValue(user.getUid()).setJsonObject(jSONObject));
            } else {
                try {
                    jSONObject.put("follow_from", "search_result");
                } catch (JSONException e2) {
                    e2.printStackTrace();
                }
                C39162r.onEvent(MobClick.obtain().setEventName(str3).setLabelName("discovery").setValue(user.getUid()).setJsonObject(jSONObject));
            }
            if (user.getFollowStatus() != 0) {
                str3 = "follow_cancel";
            }
            C59260v a = new C59260v(str3).mo96847a("search_result");
            a.f135409s = "follow_button";
            a.f135405e = user.getUid();
            a.f135402b = "search_result";
            a.f135403c = "follow_button";
            a.f135407q = user.getRequestId();
            a.f135376aa = user.isSecret() ? 1 : 0;
            int followStatus = user.getFollowStatus();
            if (followStatus == 0) {
                i = -1;
            } else if (followStatus != 4) {
                i = 1;
            } else {
                i = 0;
            }
            a.f135377ab = i;
            a.mo96792f();
            C42466n nVar = C42466n.f98992a;
            if (user.getFollowStatus() == 0) {
                str = "search_follow";
            } else {
                str = "search_follow_cancel";
            }
            String uid = user.getUid();
            C89219l.m154716b(uid, "");
            nVar.mo71655a(new C42454f(str, uid, "search_user"));
            return true;
        }

        @Override // com.p2082ss.android.ugc.aweme.following.p3003ui.adapter.AbstractC51187d
        /* renamed from: a */
        public final void mo71325a(View view, User user, int i, String str, String str2) {
            C89219l.m154721d(view, "");
            C89219l.m154721d(user, "");
            C89219l.m154721d(str, "");
            String u = C42115q.this.mo72879u();
            String requestId = user.getRequestId();
            String uid = user.getUid();
            String a = C42467o.m84876a(C42115q.this.mo72879u());
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            String uid2 = user.getUid();
            C89219l.m154716b(uid2, "");
            linkedHashMap.put("search_result_id", uid2);
            linkedHashMap.put("previous_page", "search_result");
            C42467o.m84879a(view, i, u, 0, requestId, uid, a, str, linkedHashMap);
            SmartRouter.buildRoute(C42115q.this.getActivity(), "//user/profile").withParam("uid", user.getUid()).withParam("sec_user_id", user.getSecUid()).withParam("enter_from", "search_result").withParam("previous_page", "search_result").withParam("extra_from_pre_page", "search_result").withParam("extra_from_event_enter_from", "search_result").withParam("profile_enterprise_type", user.getCommerceUserLevel()).withParam("extra_previous_page_position", "main_head").withParam("search_request_id", user.getRequestId()).open();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.presenter.AbstractC63854r
    /* renamed from: b */
    public final void mo71320b(FollowStatus followStatus) {
        C89219l.m154721d(followStatus, "");
        if (af_()) {
            mo71305a(followStatus);
        }
    }

    @AbstractC90264r
    public final void onFollowStatus(FollowStatusEvent followStatusEvent) {
        C89219l.m154721d(followStatusEvent, "");
        mo71305a(followStatusEvent.status);
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.presenter.AbstractC63854r
    /* renamed from: d_ */
    public final void mo71322d_(Exception exc) {
        C89219l.m154721d(exc, "");
        if (af_()) {
            CaptchaHelperServiceImpl.m72448a();
            C33615a.m68848a(getContext(), (Throwable) exc, (int) R.string.byb);
        }
    }

    @AbstractC90264r
    public final void onProfileFollowEvent(C35503c cVar) {
        C89219l.m154721d(cVar, "");
        if (cVar.f83729b instanceof User) {
            Object obj = cVar.f83729b;
            Objects.requireNonNull(obj, "null cannot be cast to non-null type com.ss.android.ugc.aweme.profile.model.User");
            FollowStatus followStatus = new FollowStatus();
            followStatus.userId = ((User) obj).getUid();
            followStatus.followStatus = cVar.f83728a;
            mo71305a(followStatus);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39102c, com.p2082ss.android.ugc.aweme.discover.p2797ui.AbstractC42690av
    /* renamed from: b */
    public final void mo59517b(List<? extends SearchUser> list, boolean z) {
        C42082g<?> n = mo71349n();
        C89219l.m154721d(n, "");
        super.mo59517b(list, ((C42120s) n).mo71327d());
    }
}
