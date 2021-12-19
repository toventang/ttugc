package com.p2082ss.android.ugc.aweme.discover.p2797ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1203l;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.AbstractC1215v;
import androidx.lifecycle.C1175ad;
import androidx.lifecycle.C1181ae;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.common.utility.collection.C13603b;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.common.MobClick;
import com.p2082ss.android.ugc.aweme.discover.adapter.AbstractC41742q;
import com.p2082ss.android.ugc.aweme.discover.adapter.C41643am;
import com.p2082ss.android.ugc.aweme.discover.mixfeed.p2788a.C42312e;
import com.p2082ss.android.ugc.aweme.discover.mob.C42452d;
import com.p2082ss.android.ugc.aweme.discover.mob.C42467o;
import com.p2082ss.android.ugc.aweme.discover.model.SearchMixUserData;
import com.p2082ss.android.ugc.aweme.discover.model.SearchUser;
import com.p2082ss.android.ugc.aweme.discover.p2797ui.AbstractC42744bb;
import com.p2082ss.android.ugc.aweme.following.p3003ui.adapter.AbstractC51187d;
import com.p2082ss.android.ugc.aweme.keyword.SearchKeywordPresenter;
import com.p2082ss.android.ugc.aweme.metrics.C59252q;
import com.p2082ss.android.ugc.aweme.metrics.C59260v;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.search.model.C67678d;
import com.p2082ss.android.ugc.aweme.search.p3695k.C67568r;
import com.p2082ss.android.ugc.aweme.search.survey.SurveyViewModel;
import com.p2082ss.android.ugc.trill.R;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import org.greenrobot.eventbus.EventBus;

/* renamed from: com.ss.android.ugc.aweme.discover.ui.SearchMixUserCell */
public class SearchMixUserCell extends AbstractC42744bb<SearchMixUserData> implements AbstractC1203l {

    /* renamed from: j */
    public C67678d f99328j;

    /* renamed from: k */
    RecyclerView f99329k = new RecyclerView(this.f99704a);

    /* renamed from: l */
    public boolean f99330l;

    /* renamed from: m */
    public int f99331m;

    /* renamed from: n */
    private final C42581a f99332n;

    /* renamed from: o */
    private C41643am f99333o;

    /* renamed from: p */
    private View f99334p;

    /* renamed from: q */
    private View f99335q;

    /* renamed from: r */
    private SearchKeywordPresenter f99336r;

    /* renamed from: s */
    private SearchMixUserData f99337s;

    static {
        Covode.recordClassIndex(50682);
    }

    public void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        if (aVar == AbstractC1196i.EnumC1198a.ON_DESTROY) {
            onDestroy();
        }
    }

    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_DESTROY)
    public void onDestroy() {
        EventBus.m156962a().mo145395b(this);
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.SearchMixUserCell$a */
    class C42581a implements AbstractC51187d {
        static {
            Covode.recordClassIndex(50683);
        }

        private C42581a() {
        }

        @Override // com.p2082ss.android.ugc.aweme.following.p3003ui.adapter.AbstractC51187d
        /* renamed from: a */
        public final boolean mo71326a(User user) {
            String str;
            String str2;
            int i;
            if (SearchMixUserCell.this.mo72770a(user)) {
                str = "aladdin_card";
            } else {
                str = "follow_button";
            }
            if (SearchMixUserCell.this.f99328j != null) {
                SearchMixUserCell.this.f99328j.getKeyword();
            }
            MobClick obtain = MobClick.obtain();
            String str3 = "follow";
            if (user.getFollowStatus() == 0) {
                str2 = str3;
            } else {
                str2 = "follow_cancel";
            }
            C39162r.onEvent(obtain.setEventName(str2).setLabelName("general_search").setValue(user.getUid()));
            if (user.getFollowStatus() != 0) {
                str3 = "follow_cancel";
            }
            C59260v a = new C59260v(str3).mo96847a("general_search");
            a.f135409s = str;
            a.f135403c = "follow_button";
            a.f135402b = "general_search";
            a.f135405e = user.getUid();
            C59260v o = a.mo96849o(String.valueOf(SearchMixUserCell.this.f99331m));
            o.f135407q = user.getRequestId();
            o.f135376aa = user.isSecret() ? 1 : 0;
            if (user.getFollowStatus() == 0) {
                i = -1;
            } else if (4 == user.getFollowStatus()) {
                i = 0;
            } else {
                i = 1;
            }
            o.f135377ab = i;
            o.mo96792f();
            return true;
        }

        /* synthetic */ C42581a(SearchMixUserCell searchMixUserCell, byte b) {
            this();
        }

        @Override // com.p2082ss.android.ugc.aweme.following.p3003ui.adapter.AbstractC51187d
        /* renamed from: a */
        public final void mo71325a(View view, User user, int i, String str, String str2) {
            String keyword;
            String a;
            boolean a2 = SearchMixUserCell.this.mo72770a(user);
            if (SearchMixUserCell.this.f99328j == null) {
                keyword = "";
            } else {
                keyword = SearchMixUserCell.this.f99328j.getKeyword();
            }
            HashMap hashMap = new HashMap();
            if (SearchMixUserCell.this.f99710g != null) {
                hashMap.put("token_type", SearchMixUserCell.this.f99710g.f151301B);
                hashMap.put("search_result_id", SearchMixUserCell.this.f99710g.f151302C);
                hashMap.put("list_item_id", user.getUid());
            }
            String requestId = user.getRequestId();
            String uid = user.getUid();
            String str3 = "aladdin_card";
            if (a2) {
                a = str3;
            } else {
                a = C42467o.m84876a(keyword);
            }
            int i2 = SearchMixUserCell.this.f99331m;
            HashMap hashMap2 = new HashMap();
            if (TextUtils.equals(a, str3)) {
                hashMap2.put("list_item_id", uid);
            }
            C42452d.m84859a(view, uid, i2, hashMap2);
            C59252q o = ((C59252q) new C59252q().mo96742b()).mo96825o(C42467o.m84875a(3));
            o.f135315r = requestId;
            C59252q qVar = (C59252q) o.mo96744c().mo96743b(String.valueOf(i2));
            qVar.f135314q = uid;
            qVar.f135289ac = str;
            qVar.mo96788a(hashMap);
            C42467o.m84878a(i, keyword, requestId, qVar, 3, a);
            C42467o.m84877a(3, requestId, uid);
            SmartRoute buildRoute = SmartRouter.buildRoute(SearchMixUserCell.this.f99704a, "aweme://user/profile/");
            SmartRoute withParam = buildRoute.withParam("uid", user.getUid()).withParam("sec_user_id", user.getSecUid()).withParam("enter_from", "general_search").withParam("previous_page", "general_search").withParam("extra_from_pre_page", "general_search").withParam("extra_from_event_enter_from", "general_search").withParam("enter_from_request_id", user.getRequestId()).withParam("extra_previous_page_position", "main_head");
            if (!a2) {
                str3 = C42467o.m84876a(keyword);
            }
            withParam.withParam("enter_method", str3).withParam("general_search_card_type", SearchMixUserCell.this.mo72768a(user.getUid())).withParam("search_request_id", user.getRequestId());
            if (!TextUtils.isEmpty(str2)) {
                buildRoute.withParam("from_scene", str2);
            }
            buildRoute.open();
            if (SearchMixUserCell.this.f99704a instanceof ActivityC0945e) {
                ((SurveyViewModel) C1181ae.m3881a((ActivityC0945e) SearchMixUserCell.this.f99704a, (C1175ad.AbstractC1177b) null).mo3983a(SurveyViewModel.class)).f151840c.postValue(true);
            }
        }
    }

    /* renamed from: a */
    public final int mo72768a(String str) {
        SearchMixUserData searchMixUserData = this.f99337s;
        if (!(searchMixUserData == null || searchMixUserData.users == null)) {
            for (SearchUser searchUser : this.f99337s.users) {
                if (TextUtils.equals(searchUser.user.getUid(), str)) {
                    return searchUser.cardType();
                }
            }
        }
        return 0;
    }

    /* renamed from: a */
    public final boolean mo72770a(User user) {
        if (this.f99337s.users != null) {
            for (SearchUser searchUser : this.f99337s.users) {
                if (searchUser.isAladdin() && searchUser.user.getUid().contains(user.getUid())) {
                    return true;
                }
            }
        }
        return false;
    }

    public SearchMixUserCell(View view, Context context, AbstractC42744bb.AbstractC42746a aVar) {
        super(view, context, aVar);
        MethodCollector.m26663i(6802);
        this.f99706c.setText(context.getString(R.string.h5_));
        this.f99334p = view.findViewById(R.id.brk);
        this.f99335q = view.findViewById(R.id.f8);
        C42581a aVar2 = new C42581a(this, (byte) 0);
        this.f99332n = aVar2;
        SearchUserLinearLayoutManager searchUserLinearLayoutManager = new SearchUserLinearLayoutManager(this.f99704a);
        searchUserLinearLayoutManager.mo4356b(1);
        this.f99329k.setLayoutManager(searchUserLinearLayoutManager);
        if (this.f99329k.getItemAnimator() != null) {
            this.f99329k.getItemAnimator().f4470l = 0;
        }
        this.f99329k.setNestedScrollingEnabled(false);
        this.f99709f.addView(this.f99329k);
        this.f99336r = new SearchKeywordPresenter((ActivityC0945e) context);
        C41643am amVar = new C41643am(this.f99336r, aVar2);
        this.f99333o = amVar;
        this.f99329k.setAdapter(amVar);
        MethodCollector.m26664o(6802);
    }

    /* renamed from: a */
    public final void mo72769a(SearchMixUserData searchMixUserData, C67678d dVar, boolean z) {
        String str;
        this.f99337s = searchMixUserData;
        if (!C13603b.m24435a((Collection) searchMixUserData.users)) {
            this.f99328j = dVar;
            ((AbstractC41742q) this.f99333o).f97368d = dVar;
            this.f99333o.f97136g = this.f99710g;
            this.f99333o.mo67829d(false);
            if (!TextUtils.isEmpty(searchMixUserData.cardTitle)) {
                this.f99706c.setText(searchMixUserData.cardTitle);
            }
            if (searchMixUserData.hasTopUser) {
                SearchUser searchUser = searchMixUserData.users.get(0);
                if (!(searchUser == null || searchUser.user == null)) {
                    this.f99710g.mo106513b(searchUser.user.getUid());
                    C67568r rVar = this.f99710g;
                    User user = searchUser.user;
                    if (user != null) {
                        str = C42312e.m84674a(user);
                    } else {
                        str = null;
                    }
                    rVar.f151324s = str;
                }
                this.f99333o.mo62377b_(Collections.singletonList(searchUser));
                this.f99708e.setVisibility(8);
                return;
            }
            this.f99710g.mo106510a(searchMixUserData.users);
            this.f99333o.mo62377b_(searchMixUserData.users);
            mo73016a(z);
        }
    }
}
