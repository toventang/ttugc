package com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.hashtag;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.AbstractC1214u;
import androidx.lifecycle.C1175ad;
import androidx.lifecycle.C1181ae;
import androidx.lifecycle.C1213t;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.p2722cy.p2723a.AbstractC40895j;
import com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63178ak;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63253l;
import com.p2082ss.android.ugc.aweme.scene.C67279a;
import com.p2082ss.android.ugc.aweme.shortvideo.C70752e;
import com.p2082ss.android.ugc.aweme.shortvideo.C71832f;
import com.p2082ss.android.ugc.aweme.shortvideo.C71852g;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.hashtag.p3822a.C71304a;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.hashtag.p3822a.C71308c;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.hashtag.p3822a.C71311e;
import com.p2082ss.android.ugc.aweme.shortvideo.model.AVSearchChallengeList;
import com.p2082ss.android.ugc.aweme.themechange.base.AVDmtPanelRecycleView;
import com.p2082ss.android.ugc.aweme.video.hashtag.AVRecommendHashTagResponseViewModel;
import com.p2082ss.android.ugc.aweme.video.hashtag.C80735b;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.hashtag.c */
public final class C71313c extends FrameLayout implements AbstractC1214u<C71832f>, AbstractC63178ak.AbstractC63183e {

    /* renamed from: h */
    public static String f159816h = "challenge_create";

    /* renamed from: i */
    public static final C71314a f159817i = new C71314a((byte) 0);

    /* renamed from: a */
    public C71308c f159818a;

    /* renamed from: b */
    public AbstractC63178ak.C63184f f159819b;

    /* renamed from: c */
    boolean f159820c;

    /* renamed from: d */
    public boolean f159821d;

    /* renamed from: e */
    public AbstractC71318e<? super C80735b> f159822e;

    /* renamed from: f */
    AbstractC63178ak.AbstractC63182d f159823f;

    /* renamed from: g */
    AbstractC63178ak.AbstractC63181c f159824g;

    /* renamed from: j */
    private AVDmtPanelRecycleView f159825j;

    /* renamed from: k */
    private C71311e f159826k;

    /* renamed from: l */
    private String f159827l;

    /* renamed from: m */
    private final List<C80735b> f159828m;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.hashtag.c$a */
    public static final class C71314a {
        static {
            Covode.recordClassIndex(83835);
        }

        private C71314a() {
        }

        public /* synthetic */ C71314a(byte b) {
            this();
        }
    }

    /* renamed from: a */
    private final void m126006a() {
        this.f159821d = true;
        m126007a(3);
    }

    @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63178ak.AbstractC63183e
    /* renamed from: c */
    public final void mo101624c() {
        m126007a(1);
    }

    static {
        Covode.recordClassIndex(83834);
    }

    @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63178ak.AbstractC63183e
    /* renamed from: b */
    public final void mo101623b() {
        AVDmtPanelRecycleView aVDmtPanelRecycleView = this.f159825j;
        if (aVDmtPanelRecycleView == null) {
            C89219l.m154710a("mHashTagListView");
        }
        aVDmtPanelRecycleView.mo4413b(0);
        this.f159821d = false;
        m126007a(0);
    }

    public final void setOnHashTagItemClickListener(AbstractC71318e<? super C80735b> eVar) {
        this.f159822e = eVar;
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.hashtag.c$b */
    public static final class C71315b implements AbstractC40895j {

        /* renamed from: a */
        final /* synthetic */ C71313c f159829a;

        static {
            Covode.recordClassIndex(83836);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C71315b(C71313c cVar) {
            this.f159829a = cVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.p2722cy.p2723a.AbstractC40895j
        /* renamed from: a */
        public final void mo70092a(View view, int i) {
            C89219l.m154721d(view, "");
            C71308c cVar = this.f159829a.f159818a;
            if (cVar == null) {
                C89219l.m154710a("mHashTagAdapter");
            }
            Object b = C89070n.m154561b((List) cVar.f159812a, i);
            AbstractC71318e<? super C80735b> eVar = this.f159829a.f159822e;
            if (eVar != null) {
                eVar.mo112794a(b);
            }
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C71313c(Context context) {
        this(context, (byte) 0);
        C89219l.m154721d(context, "");
    }

    @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63178ak.AbstractC63183e
    /* renamed from: a */
    public final void mo101622a(AVSearchChallengeList aVSearchChallengeList) {
        List<C71852g> list;
        if (aVSearchChallengeList != null) {
            list = aVSearchChallengeList.items;
        } else {
            list = null;
        }
        this.f159828m.clear();
        if (list == null || list.isEmpty()) {
            m126007a(2);
        } else {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                List<C80735b> list2 = this.f159828m;
                C80735b a = C80735b.m139992a(list.get(i), false);
                C89219l.m154716b(a, "");
                list2.add(a);
            }
            m126006a();
        }
        AVDmtPanelRecycleView aVDmtPanelRecycleView = this.f159825j;
        if (aVDmtPanelRecycleView == null) {
            C89219l.m154710a("mHashTagListView");
        }
        aVDmtPanelRecycleView.mo4413b(0);
    }

    /* renamed from: a */
    private final void m126007a(int i) {
        if (i == 0) {
            AVDmtPanelRecycleView aVDmtPanelRecycleView = this.f159825j;
            if (aVDmtPanelRecycleView == null) {
                C89219l.m154710a("mHashTagListView");
            }
            RecyclerView.AbstractC1350a adapter = aVDmtPanelRecycleView.getAdapter();
            C71311e eVar = this.f159826k;
            if (eVar == null) {
                C89219l.m154710a("mLoadingHashTagAdapter");
            }
            if (!C89219l.m154714a(adapter, eVar)) {
                AVDmtPanelRecycleView aVDmtPanelRecycleView2 = this.f159825j;
                if (aVDmtPanelRecycleView2 == null) {
                    C89219l.m154710a("mHashTagListView");
                }
                C71311e eVar2 = this.f159826k;
                if (eVar2 == null) {
                    C89219l.m154710a("mLoadingHashTagAdapter");
                }
                aVDmtPanelRecycleView2.setAdapter(eVar2);
            }
            setVisibility(0);
        } else if (i == 1) {
            AVDmtPanelRecycleView aVDmtPanelRecycleView3 = this.f159825j;
            if (aVDmtPanelRecycleView3 == null) {
                C89219l.m154710a("mHashTagListView");
            }
            RecyclerView.AbstractC1350a adapter2 = aVDmtPanelRecycleView3.getAdapter();
            C71311e eVar3 = this.f159826k;
            if (eVar3 == null) {
                C89219l.m154710a("mLoadingHashTagAdapter");
            }
            if (!C89219l.m154714a(adapter2, eVar3)) {
                AVDmtPanelRecycleView aVDmtPanelRecycleView4 = this.f159825j;
                if (aVDmtPanelRecycleView4 == null) {
                    C89219l.m154710a("mHashTagListView");
                }
                C71311e eVar4 = this.f159826k;
                if (eVar4 == null) {
                    C89219l.m154710a("mLoadingHashTagAdapter");
                }
                aVDmtPanelRecycleView4.setAdapter(eVar4);
            }
            setVisibility(8);
        } else if (i == 2) {
            AVDmtPanelRecycleView aVDmtPanelRecycleView5 = this.f159825j;
            if (aVDmtPanelRecycleView5 == null) {
                C89219l.m154710a("mHashTagListView");
            }
            RecyclerView.AbstractC1350a adapter3 = aVDmtPanelRecycleView5.getAdapter();
            C71311e eVar5 = this.f159826k;
            if (eVar5 == null) {
                C89219l.m154710a("mLoadingHashTagAdapter");
            }
            if (!C89219l.m154714a(adapter3, eVar5)) {
                AVDmtPanelRecycleView aVDmtPanelRecycleView6 = this.f159825j;
                if (aVDmtPanelRecycleView6 == null) {
                    C89219l.m154710a("mHashTagListView");
                }
                C71311e eVar6 = this.f159826k;
                if (eVar6 == null) {
                    C89219l.m154710a("mLoadingHashTagAdapter");
                }
                aVDmtPanelRecycleView6.setAdapter(eVar6);
            }
            setVisibility(8);
        } else if (i == 3) {
            AVDmtPanelRecycleView aVDmtPanelRecycleView7 = this.f159825j;
            if (aVDmtPanelRecycleView7 == null) {
                C89219l.m154710a("mHashTagListView");
            }
            RecyclerView.AbstractC1350a adapter4 = aVDmtPanelRecycleView7.getAdapter();
            C71308c cVar = this.f159818a;
            if (cVar == null) {
                C89219l.m154710a("mHashTagAdapter");
            }
            if (!C89219l.m154714a(adapter4, cVar)) {
                AVDmtPanelRecycleView aVDmtPanelRecycleView8 = this.f159825j;
                if (aVDmtPanelRecycleView8 == null) {
                    C89219l.m154710a("mHashTagListView");
                }
                C71308c cVar2 = this.f159818a;
                if (cVar2 == null) {
                    C89219l.m154710a("mHashTagAdapter");
                }
                aVDmtPanelRecycleView8.setAdapter(cVar2);
            }
            setVisibility(0);
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // androidx.lifecycle.AbstractC1214u
    public final /* synthetic */ void onChanged(C71832f fVar) {
        if (fVar != null) {
            AbstractC63178ak.AbstractC63182d dVar = this.f159823f;
            if (dVar == null) {
                C89219l.m154710a("recommendHashTagViewModel");
            }
            C71832f a = dVar.mo93809a();
            if (a == null) {
                m126007a(1);
                return;
            }
            String str = this.f159827l;
            if (str == null || str.length() == 0) {
                LinkedList linkedList = new LinkedList();
                boolean z = a.f160979b;
                boolean z2 = a.f160981d;
                int i = a.f160982e;
                List<? extends C70752e> list = a.f160978a;
                new ArrayList();
                if (z) {
                    C63244g.m114602a().mo73271Q();
                } else if (z2 && i > 0) {
                    C63244g.m114602a().mo73271Q();
                    throw new NullPointerException("size");
                }
                if (list != null && !list.isEmpty()) {
                    C71304a.m125996a(linkedList, null, list);
                }
                if (linkedList.isEmpty()) {
                    m126007a(2);
                    return;
                }
                this.f159828m.clear();
                this.f159828m.addAll(linkedList);
                m126006a();
                AVDmtPanelRecycleView aVDmtPanelRecycleView = this.f159825j;
                if (aVDmtPanelRecycleView == null) {
                    C89219l.m154710a("mHashTagListView");
                }
                aVDmtPanelRecycleView.mo4413b(0);
            }
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    private C71313c(Context context, byte b) {
        this(context, (char) 0);
        C89219l.m154721d(context, "");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private C71313c(Context context, char c) {
        super(context, null, 0);
        C89219l.m154721d(context, "");
        MethodCollector.m26663i(9355);
        this.f159821d = true;
        ArrayList arrayList = new ArrayList();
        this.f159828m = arrayList;
        LayoutInflater.from(getContext()).inflate(R.layout.afl, this);
        View findViewById = findViewById(R.id.bdo);
        C89219l.m154716b(findViewById, "");
        AVDmtPanelRecycleView aVDmtPanelRecycleView = (AVDmtPanelRecycleView) findViewById;
        this.f159825j = aVDmtPanelRecycleView;
        if (aVDmtPanelRecycleView == null) {
            C89219l.m154710a("mHashTagListView");
        }
        getContext();
        aVDmtPanelRecycleView.setLayoutManager(new HashTagStickerListView$initView$1(this));
        this.f159826k = new C71311e();
        this.f159818a = new C71308c(arrayList, new C71315b(this));
        AbstractC63178ak h = C63253l.f143623a.mo73312h();
        if (h == null) {
            this.f159820c = false;
            setVisibility(8);
        } else {
            this.f159820c = true;
            Context context2 = getContext();
            C89219l.m154716b(context2, "");
            Activity a = C67279a.m119194a(context2);
            if (a != null) {
                AbstractC63178ak.AbstractC63182d a2 = h.mo93806a((ActivityC0945e) a);
                C89219l.m154716b(a2, "");
                this.f159823f = a2;
                AbstractC63178ak.AbstractC63181c a3 = h.mo93804a(this);
                C89219l.m154716b(a3, "");
                this.f159824g = a3;
            } else {
                NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
                MethodCollector.m26664o(9355);
                throw nullPointerException;
            }
        }
        Context context3 = getContext();
        if (context3 != null) {
            AbstractC1174ac a4 = C1181ae.m3881a((ActivityC0945e) context3, (C1175ad.AbstractC1177b) null).mo3983a(AVRecommendHashTagResponseViewModel.class);
            C89219l.m154716b(a4, "");
            C1213t<C71832f> tVar = ((AVRecommendHashTagResponseViewModel) a4).f180506a;
            Context context4 = getContext();
            if (context4 != null) {
                tVar.observe((ActivityC0945e) context4, this);
                MethodCollector.m26664o(9355);
                return;
            }
            NullPointerException nullPointerException2 = new NullPointerException("null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
            MethodCollector.m26664o(9355);
            throw nullPointerException2;
        }
        NullPointerException nullPointerException3 = new NullPointerException("null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        MethodCollector.m26664o(9355);
        throw nullPointerException3;
    }
}
