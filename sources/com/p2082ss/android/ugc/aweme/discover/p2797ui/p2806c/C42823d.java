package com.p2082ss.android.ugc.aweme.discover.p2797ui.p2806c;

import android.os.Bundle;
import android.util.SparseArray;
import android.view.View;
import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.C1175ad;
import androidx.lifecycle.C1181ae;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.base.p177a.C2954a;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.base.utils.C34728n;
import com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39060f;
import com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39102c;
import com.p2082ss.android.ugc.aweme.discover.activity.C41571b;
import com.p2082ss.android.ugc.aweme.discover.activity.SearchLiveListEnterParamViewModel;
import com.p2082ss.android.ugc.aweme.discover.model.SearchLiveList;
import com.p2082ss.android.ugc.aweme.discover.model.SearchLiveStruct;
import com.p2082ss.android.ugc.aweme.discover.p2775j.AbstractC42081f;
import com.p2082ss.android.ugc.aweme.discover.p2775j.C42082g;
import com.p2082ss.android.ugc.aweme.discover.p2797ui.AbstractC42637ac;
import com.p2082ss.android.ugc.aweme.discover.p2797ui.AbstractC42757bi;
import com.p2082ss.android.ugc.aweme.discover.p2797ui.p2806c.C42815b;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.search.model.C67678d;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.greenrobot.eventbus.AbstractC90264r;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.RunnableC90250g;
import org.greenrobot.eventbus.ThreadMode;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.discover.ui.c.d */
public final class C42823d extends AbstractC42757bi<SearchLiveStruct> implements C42815b.AbstractC42817b {

    /* renamed from: d */
    private static final C42824a f99873d = new C42824a((byte) 0);

    /* renamed from: a */
    private boolean f99874a;

    /* renamed from: b */
    private C41571b f99875b;

    /* renamed from: e */
    private SparseArray f99876e;

    static {
        Covode.recordClassIndex(50927);
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.p2797ui.AbstractC42757bi, com.p2082ss.android.ugc.aweme.discover.p2797ui.AbstractC42670am, com.p2082ss.android.ugc.aweme.discover.p2797ui.AbstractC42690av
    /* renamed from: a */
    public final View mo71296a(int i) {
        if (this.f99876e == null) {
            this.f99876e = new SparseArray();
        }
        View view = (View) this.f99876e.get(i);
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f99876e.put(i, findViewById);
        return findViewById;
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.p2797ui.p2806c.C42815b.AbstractC42817b
    /* renamed from: a */
    public final void mo60375a(String str) {
        C89219l.m154721d(str, "");
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.p2797ui.AbstractC42757bi, com.p2082ss.android.ugc.aweme.discover.p2797ui.AbstractC42670am, com.p2082ss.android.ugc.aweme.discover.p2797ui.AbstractC42690av
    public final void bb_() {
        SparseArray sparseArray = this.f99876e;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.p2797ui.AbstractC42670am
    /* renamed from: c */
    public final String mo71298c() {
        return "live";
    }

    @Override // org.greenrobot.eventbus.AbstractC90252i, com.p2082ss.android.ugc.aweme.discover.p2797ui.AbstractC42690av
    public final Map<Integer, Object> getSubscriberEventTypes() {
        Map<Integer, Object> subscriberEventTypes = super.getSubscriberEventTypes();
        subscriberEventTypes.put(66, new RunnableC90250g(C42823d.class, "onRoomStatusEvent", C2954a.class, ThreadMode.POSTING, 0, false));
        return subscriberEventTypes;
    }

    @Override // com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a, com.p2082ss.android.ugc.aweme.discover.p2797ui.AbstractC42757bi, com.bytedance.ies.uikit.p1279a.AbstractC18234b, com.p2082ss.android.ugc.aweme.discover.p2797ui.AbstractC42670am, androidx.fragment.app.Fragment, com.p2082ss.android.ugc.aweme.discover.p2797ui.AbstractC42690av
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        bb_();
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.c.d$a */
    static final class C42824a {
        static {
            Covode.recordClassIndex(50928);
        }

        private C42824a() {
        }

        public /* synthetic */ C42824a(byte b) {
            this();
        }
    }

    public C42823d() {
        this.f99509t = 7;
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.p2797ui.AbstractC42690av
    /* renamed from: D */
    public final RecyclerView.AbstractC1362i mo72903D() {
        getContext();
        return new GridLayoutManager(2);
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        EventBus.m156962a().mo145395b(this);
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.p2797ui.AbstractC42690av
    /* renamed from: i */
    public final void mo71299i() {
        String str;
        String str2;
        mo73030a(new C42830g());
        C42082g<?> n = mo71349n();
        Objects.requireNonNull(n, "null cannot be cast to non-null type com.ss.android.ugc.aweme.discover.ui.live.SearchLivePresenter");
        C42826f fVar = new C42826f();
        C41571b bVar = this.f99875b;
        C42820c cVar = null;
        if (bVar != null) {
            str = bVar.getRoomIdList();
        } else {
            str = null;
        }
        fVar.f99882a = str;
        C41571b bVar2 = this.f99875b;
        if (bVar2 != null) {
            str2 = bVar2.getEnterFrom();
        } else {
            str2 = null;
        }
        fVar.f99883b = str2;
        n.mo67838a((Object) fVar);
        mo71349n().mo67839a_((AbstractC39102c) this);
        mo71349n().mo71293a((AbstractC42637ac) this);
        AbstractC39060f A = mo72900A();
        if (A instanceof C42820c) {
            cVar = A;
        }
        C42820c cVar2 = cVar;
        if (cVar2 != null) {
            AbstractC42081f fVar2 = (AbstractC42081f) mo71349n().f92286h;
            Objects.requireNonNull(fVar2, "null cannot be cast to non-null type com.ss.android.ugc.aweme.discover.ui.live.SearchLiveModel");
            C42826f fVar3 = (C42826f) fVar2;
            C89219l.m154721d(fVar3, "");
            cVar2.f99865g = fVar3;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.p2797ui.AbstractC42690av
    /* renamed from: m */
    public final void mo71300m() {
        String str;
        String str2;
        String str3;
        String str4;
        if (this.f99507r == null) {
            C67678d dVar = new C67678d();
            C41571b bVar = this.f99875b;
            if (bVar == null || (str = bVar.getSearchKeyword()) == null) {
                str = "";
            }
            C67678d keyword = dVar.setKeyword(str);
            C41571b bVar2 = this.f99875b;
            if (bVar2 != null) {
                str2 = bVar2.getEnterMethod();
            } else {
                str2 = null;
            }
            C67678d enterMethod = keyword.setEnterMethod(str2);
            C41571b bVar3 = this.f99875b;
            if (bVar3 == null || (str3 = bVar3.getFromSearchSubtag()) == null) {
                str3 = "";
            }
            C67678d fromSearchSubtag = enterMethod.setFromSearchSubtag(str3);
            C41571b bVar4 = this.f99875b;
            if (bVar4 == null || (str4 = bVar4.getPreSearchId()) == null) {
                str4 = "";
            }
            this.f99507r = fromSearchSubtag.setPreSearchId(str4);
        }
        C67678d dVar2 = this.f99507r;
        if (dVar2 == null) {
            C89219l.m154715b();
        }
        C42820c cVar = new C42820c(dVar2, mo72880v(), this, this);
        String str5 = this.f99510u;
        C89219l.m154721d(str5, "");
        cVar.f99867i = str5;
        mo72913a(cVar);
        this.f99874a = true;
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment, com.p2082ss.android.ugc.aweme.discover.p2797ui.AbstractC42690av
    public final void onCreate(Bundle bundle) {
        SearchLiveListEnterParamViewModel searchLiveListEnterParamViewModel;
        super.onCreate(bundle);
        EventBus.m156966a(EventBus.m156962a(), this);
        ActivityC0945e activity = getActivity();
        C41571b bVar = null;
        if (!(activity == null || (searchLiveListEnterParamViewModel = (SearchLiveListEnterParamViewModel) C1181ae.m3881a(activity, (C1175ad.AbstractC1177b) null).mo3983a(SearchLiveListEnterParamViewModel.class)) == null)) {
            bVar = searchLiveListEnterParamViewModel.f96941a;
        }
        this.f99875b = bVar;
    }

    @AbstractC90264r
    public final void onRoomStatusEvent(C2954a aVar) {
        C89219l.m154721d(aVar, "");
        long j = aVar.f8696a;
        AbstractC39060f A = mo72900A();
        Integer num = null;
        if (!(A instanceof C42820c)) {
            A = null;
        }
        C42820c cVar = (C42820c) A;
        if (cVar != null) {
            int i = 0;
            Iterator it = cVar.f92236l.iterator();
            while (true) {
                if (!it.hasNext()) {
                    i = -1;
                    break;
                }
                SearchLiveStruct searchLiveStruct = (SearchLiveStruct) it.next();
                C89219l.m154716b(searchLiveStruct, "");
                if (searchLiveStruct.getLiveAweme() != null) {
                    Aweme liveAweme = searchLiveStruct.getLiveAweme();
                    C89219l.m154716b(liveAweme, "");
                    User author = liveAweme.getAuthor();
                    if (author != null && j == author.roomId) {
                        break;
                    }
                }
                i++;
            }
            num = Integer.valueOf(i);
        }
        RecyclerView.AbstractC1350a adapter = mo72925w().getAdapter();
        if (adapter != null) {
            Integer.valueOf(adapter.getItemCount());
        }
        if (num != null && num.intValue() != -1) {
            mo72925w().mo4435d(num.intValue());
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.p2797ui.AbstractC42690av
    /* renamed from: a */
    public final void mo71302a(View view, Bundle bundle) {
        C89219l.m154721d(view, "");
        super.mo71302a(view, bundle);
        mo72925w().mo4402a(new C42825e(C34728n.m70946a(8.0d)));
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.p2797ui.p2806c.C42815b.AbstractC42817b
    /* renamed from: a */
    public final void mo60374a(SearchLiveList searchLiveList, List<? extends Aweme> list, boolean z) {
        C89219l.m154721d(searchLiveList, "");
        C89219l.m154721d(list, "");
        AbstractC42081f fVar = (AbstractC42081f) mo71349n().f92286h;
        List list2 = null;
        if (!(fVar instanceof C42826f)) {
            fVar = null;
        }
        C42826f fVar2 = (C42826f) fVar;
        if (fVar2 != null) {
            fVar2.mo73076a(searchLiveList);
        }
        List e = mo72900A().mo63369e();
        if (e != null) {
            List<SearchLiveStruct> list3 = searchLiveList.liveList;
            C89219l.m154716b(list3, "");
            list2 = C89070n.m154572d((Collection) e, (Iterable) list3);
        }
        mo59517b(list2, z);
    }
}
