package com.p2082ss.android.ugc.aweme.search.p3703q;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.discover.mixfeed.p2789b.C42314a;
import com.p2082ss.android.ugc.aweme.discover.model.SearchUser;
import com.p2082ss.android.ugc.aweme.mix.api.AbstractC59393g;
import com.p2082ss.android.ugc.aweme.mix.api.AbstractC59394h;
import com.p2082ss.android.ugc.aweme.mix.model.C59864a;
import com.p2082ss.android.ugc.aweme.mix.model.C59867d;
import com.p2082ss.android.ugc.aweme.mix.services.MixFeedService;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.search.p3695k.C67496as;
import com.p2082ss.android.ugc.aweme.search.p3695k.C67540c;
import com.p2082ss.android.ugc.aweme.search.p3695k.C67542d;
import com.p2082ss.android.ugc.aweme.search.p3695k.C67568r;
import com.p2082ss.android.ugc.aweme.search.p3700n.C67690d;
import java.util.ArrayList;
import java.util.List;
import p4600h.C89378p;
import p4600h.C89387v;
import p4600h.p4601a.C89041ag;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.search.q.a */
public final class C67697a {

    /* renamed from: a */
    public C67568r f151733a;

    /* renamed from: b */
    public C42314a f151734b;

    /* renamed from: c */
    public View f151735c;

    /* renamed from: d */
    private List<C59867d> f151736d = new ArrayList();

    /* renamed from: e */
    private SearchUser f151737e;

    /* renamed from: f */
    private AbstractC59394h f151738f;

    /* renamed from: g */
    private final C67698a f151739g = new C67698a(this);

    /* renamed from: h */
    private final ViewGroup f151740h;

    static {
        Covode.recordClassIndex(79342);
    }

    /* renamed from: a */
    public final View mo106802a() {
        RecyclerView.ViewHolder viewHolder;
        View view = this.f151735c;
        if (view != null) {
            return view;
        }
        RecyclerView.ViewHolder a = MixFeedService.m109435k().mo97305a(this.f151740h, false, true, "general_search", (AbstractC59393g) this.f151739g);
        if (!(a instanceof AbstractC59394h)) {
            viewHolder = null;
        } else {
            viewHolder = a;
        }
        AbstractC59394h hVar = (AbstractC59394h) viewHolder;
        if (hVar != null) {
            this.f151738f = hVar;
            View view2 = a.itemView;
            this.f151735c = view2;
            C89219l.m154716b(view2, "");
            return view2;
        }
        throw new IllegalStateException("Unknown playlist view holder");
    }

    /* renamed from: com.ss.android.ugc.aweme.search.q.a$a */
    public static final class C67698a implements AbstractC59393g {

        /* renamed from: a */
        final /* synthetic */ C67697a f151741a;

        static {
            Covode.recordClassIndex(79343);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C67698a(C67697a aVar) {
            this.f151741a = aVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.mix.api.AbstractC59393g
        /* renamed from: a */
        public final void mo97058a(String str, String str2, Integer num) {
            String searchResultId;
            String str3;
            String str4;
            C67568r rVar = this.f151741a.f151733a;
            if (rVar != null) {
                C67697a aVar = this.f151741a;
                String str5 = rVar.f151315j;
                String str6 = rVar.f151314i;
                String str7 = rVar.f151311f;
                String str8 = rVar.f151312g;
                int i = rVar.f151318m;
                C67540c a = new C67496as(rVar).mo106484d(str5).mo106480a(str6);
                C42314a aVar2 = aVar.f151734b;
                String str9 = null;
                if (aVar2 != null) {
                    str3 = aVar2.getSearchResultId();
                } else {
                    str3 = null;
                }
                C67542d dVar = (C67542d) a.mo106487g(str3).mo106482b(str7).mo106479a(Integer.valueOf(i)).mo106459o(str8);
                C42314a aVar3 = aVar.f151734b;
                if (aVar3 == null || !aVar3.isAladdin()) {
                    str4 = "0";
                } else {
                    str4 = "1";
                }
                C67542d dVar2 = (C67542d) dVar.mo106496w(str4);
                C42314a aVar4 = aVar.f151734b;
                if (aVar4 != null) {
                    str9 = aVar4.getTokenType();
                }
                ((C67496as) ((C67542d) ((C67542d) ((C67542d) ((C67542d) dVar2.mo106497x(str9)).mo106491r("playlist")).mo106495v(str)).mo106492s(str2)).mo106490d(num)).mo106440B("click_playlist").mo96792f();
            }
            C89378p[] pVarArr = new C89378p[3];
            pVarArr[0] = C89387v.m154943a("is_from_video", "0");
            String str10 = "";
            if (str == null) {
                str = str10;
            }
            pVarArr[1] = C89387v.m154943a("list_item_id", str);
            C42314a aVar5 = this.f151741a.f151734b;
            if (!(aVar5 == null || (searchResultId = aVar5.getSearchResultId()) == null)) {
                str10 = searchResultId;
            }
            pVarArr[2] = C89387v.m154943a("search_result_id", str10);
            C67690d.C67691a.m119848a(C89041ag.m154421a(pVarArr));
        }
    }

    public C67697a(ViewGroup viewGroup) {
        C89219l.m154721d(viewGroup, "");
        this.f151740h = viewGroup;
    }

    /* renamed from: a */
    public final void mo106804a(SearchUser searchUser) {
        long j;
        boolean z;
        String str;
        User user;
        User user2;
        Boolean bool;
        Long l;
        if (!(searchUser == null || searchUser.playlists == null)) {
            this.f151736d.clear();
            this.f151737e = searchUser;
            for (C59867d dVar : searchUser.playlists) {
                if (dVar != null) {
                    this.f151736d.add(dVar);
                }
            }
            C59864a aVar = new C59864a();
            aVar.setMixList(this.f151736d);
            SearchUser searchUser2 = this.f151737e;
            if (searchUser2 == null || (l = searchUser2.mixCursor) == null) {
                j = 0;
            } else {
                j = l.longValue();
            }
            aVar.setCursor(j);
            SearchUser searchUser3 = this.f151737e;
            if (searchUser3 == null || (bool = searchUser3.mixHasMore) == null) {
                z = false;
            } else {
                z = bool.booleanValue();
            }
            aVar.setHasMore(z);
            C42314a aVar2 = this.f151734b;
            String str2 = null;
            aVar.setKeyWord(aVar2 != null ? aVar2.getSearchKeyWord() : null);
            C67568r rVar = this.f151733a;
            aVar.setSearchId(rVar != null ? rVar.f151314i : null);
            C42314a aVar3 = this.f151734b;
            aVar.setSearchResultId(aVar3 != null ? aVar3.getSearchResultId() : null);
            C67568r rVar2 = this.f151733a;
            aVar.setSearchType(rVar2 != null ? rVar2.f151309d : null);
            AbstractC59394h hVar = this.f151738f;
            if (hVar != null) {
                SearchUser searchUser4 = this.f151737e;
                if (searchUser4 == null || (user2 = searchUser4.user) == null || (str = user2.getUid()) == null) {
                    str = "";
                }
                SearchUser searchUser5 = this.f151737e;
                if (!(searchUser5 == null || (user = searchUser5.user) == null)) {
                    str2 = user.getSecUid();
                }
                hVar.mo97059a(str, str2, aVar);
            }
        }
    }

    /* renamed from: a */
    public final void mo106803a(C42314a aVar, C67568r rVar) {
        this.f151734b = aVar;
        this.f151733a = rVar;
    }
}
