package com.bytedance.android.livesdk.rank.impl.ranks.p615a;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.RelativeLayout;
import androidx.fragment.app.AbstractC0952i;
import androidx.fragment.app.AbstractC0974l;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;
import com.C1764a;
import com.bytedance.android.live.actionhandler.IActionHandlerService;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.live.design.view.C4081a;
import com.bytedance.android.live.design.view.C4097j;
import com.bytedance.android.live.design.widget.LiveButton;
import com.bytedance.android.live.design.widget.LiveTextView;
import com.bytedance.android.live.design.widget.rtl.LiveAutoRtlImageView;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.live.uikit.rtl.RtlViewPager;
import com.bytedance.android.livesdk.p561j.C9076co;
import com.bytedance.android.livesdk.p561j.C9119ed;
import com.bytedance.android.livesdk.p643ui.C10935a;
import com.bytedance.android.livesdk.rank.api.C10334b;
import com.bytedance.android.livesdk.rank.api.EnumC10345i;
import com.bytedance.android.livesdk.rank.impl.C10383c;
import com.bytedance.android.livesdk.rank.impl.api.model.EnumC10367d;
import com.bytedance.android.livesdk.rank.impl.api.model.RankPage;
import com.bytedance.android.livesdk.rank.impl.api.model.RankResponse;
import com.bytedance.android.livesdk.rank.impl.p619ui.tablayout.LiveTabLayout;
import com.bytedance.android.livesdk.rank.impl.ranks.p615a.C10489c;
import com.bytedance.android.livesdk.rank.impl.ranks.p616b.p617a.C10520b;
import com.bytedance.android.livesdk.rank.impl.ranks.p616b.p618b.C10539b;
import com.bytedance.android.livesdk.utils.C11279p;
import com.bytedance.android.livesdk.widget.LiveLoadingView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.p1206f.C17309b;
import com.bytedance.ies.sdk.datachannel.C17846f;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import p4600h.C89391z;
import p4600h.p4601a.C89037ac;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.C89217j;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.livesdk.rank.impl.ranks.a.b */
public final class C10480b extends C10935a implements C10489c.AbstractC10491b {

    /* renamed from: h */
    public static final C10481a f25231h = new C10481a((byte) 0);

    /* renamed from: a */
    public AbstractC89171a<C89391z> f25232a;

    /* renamed from: b */
    public RankPage f25233b;

    /* renamed from: c */
    boolean f25234c;

    /* renamed from: d */
    public C10489c.AbstractC10490a f25235d;

    /* renamed from: e */
    public boolean f25236e;

    /* renamed from: f */
    public DataChannel f25237f;

    /* renamed from: g */
    View f25238g;

    /* renamed from: i */
    private long f25239i;

    /* renamed from: j */
    private long f25240j;

    /* renamed from: k */
    private ArrayList<Integer> f25241k;

    /* renamed from: l */
    private int f25242l = EnumC10345i.HOURLY_RANK.getType();

    /* renamed from: m */
    private int f25243m = EnumC10367d.UNKNOWN.getValue();

    /* renamed from: n */
    private HashMap f25244n;

    static {
        Covode.recordClassIndex(12055);
    }

    /* renamed from: a */
    private View m18998a(int i) {
        if (this.f25244n == null) {
            this.f25244n = new HashMap();
        }
        View view = (View) this.f25244n.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f25244n.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* renamed from: com.bytedance.android.livesdk.rank.impl.ranks.a.b$a */
    public static final class C10481a {
        static {
            Covode.recordClassIndex(12056);
        }

        private C10481a() {
        }

        public /* synthetic */ C10481a(byte b) {
            this();
        }

        /* renamed from: a */
        public static C10480b m19006a(long j, long j2, ArrayList<Integer> arrayList, int i, int i2, AbstractC89171a<C89391z> aVar) {
            C89219l.m154721d(arrayList, "");
            C89219l.m154721d(aVar, "");
            C10480b bVar = new C10480b();
            Bundle bundle = new Bundle();
            bundle.putLong("arg_anchor_id", j);
            bundle.putLong("arg_room_id", j2);
            bundle.putInt("first_show_rank_type", i);
            bundle.putIntegerArrayList("rank_types", arrayList);
            bundle.putInt("target_region_type", i2);
            bVar.setArguments(bundle);
            bVar.f25232a = aVar;
            return bVar;
        }
    }

    /* renamed from: com.bytedance.android.livesdk.rank.impl.ranks.a.b$b */
    public final class C10482b extends AbstractC0974l {

        /* renamed from: a */
        final /* synthetic */ C10480b f25245a;

        /* renamed from: b */
        private final List<RankPage> f25246b;

        static {
            Covode.recordClassIndex(12057);
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public final int getCount() {
            return this.f25246b.size();
        }

        /* renamed from: com.bytedance.android.livesdk.rank.impl.ranks.a.b$b$a */
        static final /* synthetic */ class C10483a extends C89217j implements AbstractC89171a<C89391z> {
            static {
                Covode.recordClassIndex(12058);
            }

            C10483a(C10480b bVar) {
                super(0, bVar, C10480b.class, "dismiss", "dismiss()V", 0);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // p4600h.p4611f.p4612a.AbstractC89171a
            public final /* synthetic */ C89391z invoke() {
                ((C10480b) this.receiver).mo17321e();
                return C89391z.f203057a;
            }
        }

        /* renamed from: com.bytedance.android.livesdk.rank.impl.ranks.a.b$b$b */
        static final /* synthetic */ class C10484b extends C89217j implements AbstractC89171a<C89391z> {
            static {
                Covode.recordClassIndex(12059);
            }

            C10484b(C10480b bVar) {
                super(0, bVar, C10480b.class, "dismiss", "dismiss()V", 0);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // p4600h.p4611f.p4612a.AbstractC89171a
            public final /* synthetic */ C89391z invoke() {
                ((C10480b) this.receiver).mo17321e();
                return C89391z.f203057a;
            }
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public final CharSequence getPageTitle(int i) {
            return this.f25246b.get(i).getTitle();
        }

        @Override // androidx.fragment.app.AbstractC0974l
        /* renamed from: a */
        public final Fragment mo3639a(int i) {
            if (this.f25246b.get(i).getRankType() == EnumC10345i.WEEKLY_RANK.getType()) {
                boolean z = this.f25245a.f25236e;
                C10489c.AbstractC10490a a = C10480b.m18999a(this.f25245a);
                C10483a aVar = new C10483a(this.f25245a);
                C89219l.m154721d(a, "");
                C89219l.m154721d(aVar, "");
                C10539b bVar = new C10539b();
                Bundle bundle = new Bundle();
                bundle.putInt("page_position", i);
                bundle.putBoolean("is_anchor", z);
                bVar.setArguments(bundle);
                bVar.mo17359a(a);
                bVar.mo17360a(aVar);
                return bVar;
            }
            boolean z2 = this.f25245a.f25236e;
            C10489c.AbstractC10490a a2 = C10480b.m18999a(this.f25245a);
            C10484b bVar2 = new C10484b(this.f25245a);
            C89219l.m154721d(a2, "");
            C89219l.m154721d(bVar2, "");
            C10520b bVar3 = new C10520b();
            Bundle bundle2 = new Bundle();
            bundle2.putInt("page_position", i);
            bundle2.putBoolean("is_anchor", z2);
            bVar3.setArguments(bundle2);
            bVar3.mo17359a(a2);
            bVar3.mo17360a(bVar2);
            return bVar3;
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C10482b(C10480b bVar, AbstractC0952i iVar, List<RankPage> list) {
            super(iVar);
            C89219l.m154721d(iVar, "");
            C89219l.m154721d(list, "");
            this.f25245a = bVar;
            this.f25246b = list;
        }
    }

    /* renamed from: e */
    public final void mo17321e() {
        AbstractC89171a<C89391z> aVar = this.f25232a;
        if (aVar == null) {
            C89219l.m154710a("actionDismiss");
        }
        aVar.invoke();
    }

    @Override // com.bytedance.android.livesdk.p643ui.C10935a, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        C10489c.AbstractC10490a aVar = this.f25235d;
        if (aVar == null) {
            C89219l.m154710a("mPresenter");
        }
        aVar.mo17325a();
    }

    @Override // com.bytedance.android.livesdk.p643ui.C10935a, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        HashMap hashMap = this.f25244n;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.bytedance.android.livesdk.rank.impl.ranks.p615a.C10489c.AbstractC10491b
    /* renamed from: a */
    public final void mo17316a() {
        LiveLoadingView liveLoadingView = (LiveLoadingView) m18998a(R.id.cfa);
        C89219l.m154716b(liveLoadingView, "");
        liveLoadingView.setVisibility(0);
    }

    @Override // com.bytedance.android.livesdk.rank.impl.ranks.p615a.C10489c.AbstractC10491b
    /* renamed from: b */
    public final void mo17318b() {
        LiveLoadingView liveLoadingView = (LiveLoadingView) m18998a(R.id.cfa);
        C89219l.m154716b(liveLoadingView, "");
        liveLoadingView.setVisibility(8);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        DataChannel dataChannel = this.f25237f;
        if (dataChannel != null) {
            dataChannel.mo28315b(C10334b.class, (Object) true);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        DataChannel dataChannel = this.f25237f;
        if (dataChannel != null) {
            dataChannel.mo28315b(C10334b.class, (Object) false);
        }
    }

    @Override // com.bytedance.android.livesdk.rank.impl.ranks.p615a.C10489c.AbstractC10491b
    /* renamed from: c */
    public final void mo17319c() {
        RelativeLayout relativeLayout;
        MethodCollector.m26663i(1237);
        ViewStub viewStub = (ViewStub) getView().findViewById(R.id.ct6);
        if (viewStub == null || viewStub.getVisibility() != 8) {
            View view = getView();
            if (view == null || (relativeLayout = (RelativeLayout) view.findViewById(R.id.ea_)) == null) {
                MethodCollector.m26664o(1237);
                return;
            }
            relativeLayout.setVisibility(0);
            MethodCollector.m26664o(1237);
            return;
        }
        ((ViewStub) getView().findViewById(R.id.ct6)).inflate();
        ((LiveButton) m18998a(R.id.ct7)).setOnClickListener(new View$OnClickListenerC10488f(this));
        MethodCollector.m26664o(1237);
    }

    @Override // com.bytedance.android.livesdk.rank.impl.ranks.p615a.C10489c.AbstractC10491b
    /* renamed from: d */
    public final void mo17320d() {
        RelativeLayout relativeLayout;
        MethodCollector.m26663i(1253);
        ViewStub viewStub = (ViewStub) getView().findViewById(R.id.dvw);
        if (viewStub == null || viewStub.getVisibility() != 8) {
            mo17318b();
            View view = getView();
            if (view == null || (relativeLayout = (RelativeLayout) view.findViewById(R.id.eab)) == null) {
                MethodCollector.m26664o(1253);
                return;
            }
            relativeLayout.setVisibility(0);
            MethodCollector.m26664o(1253);
            return;
        }
        ((ViewStub) getView().findViewById(R.id.dvw)).inflate();
        ((LiveButton) m18998a(R.id.dvx)).setOnClickListener(new View$OnClickListenerC10487e(this));
        MethodCollector.m26664o(1253);
    }

    /* renamed from: com.bytedance.android.livesdk.rank.impl.ranks.a.b$d */
    public static final class C10486d extends ViewPager.C1582h {

        /* renamed from: a */
        final /* synthetic */ C10480b f25248a;

        /* renamed from: b */
        final /* synthetic */ List f25249b;

        /* renamed from: c */
        final /* synthetic */ int f25250c;

        static {
            Covode.recordClassIndex(12061);
        }

        @Override // androidx.viewpager.widget.ViewPager.C1582h, androidx.viewpager.widget.ViewPager.AbstractC1579e
        public final void onPageSelected(int i) {
            this.f25248a.f25233b = (RankPage) this.f25249b.get(i);
        }

        C10486d(C10480b bVar, List list, int i) {
            this.f25248a = bVar;
            this.f25249b = list;
            this.f25250c = i;
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ C10489c.AbstractC10490a m18999a(C10480b bVar) {
        C10489c.AbstractC10490a aVar = bVar.f25235d;
        if (aVar == null) {
            C89219l.m154710a("mPresenter");
        }
        return aVar;
    }

    /* renamed from: com.bytedance.android.livesdk.rank.impl.ranks.a.b$e */
    static final class View$OnClickListenerC10487e implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C10480b f25251a;

        static {
            Covode.recordClassIndex(12062);
        }

        View$OnClickListenerC10487e(C10480b bVar) {
            this.f25251a = bVar;
        }

        public final void onClick(View view) {
            RelativeLayout relativeLayout;
            View view2 = this.f25251a.getView();
            if (!(view2 == null || (relativeLayout = (RelativeLayout) view2.findViewById(R.id.eab)) == null)) {
                relativeLayout.setVisibility(8);
            }
            C10480b.m18999a(this.f25251a).mo17328b();
        }
    }

    /* renamed from: com.bytedance.android.livesdk.rank.impl.ranks.a.b$f */
    static final class View$OnClickListenerC10488f implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C10480b f25252a;

        static {
            Covode.recordClassIndex(12063);
        }

        View$OnClickListenerC10488f(C10480b bVar) {
            this.f25252a = bVar;
        }

        public final void onClick(View view) {
            RelativeLayout relativeLayout;
            View view2 = this.f25252a.getView();
            if (!(view2 == null || (relativeLayout = (RelativeLayout) view2.findViewById(R.id.ea_)) == null)) {
                relativeLayout.setVisibility(8);
            }
            C10480b.m18999a(this.f25252a).mo17328b();
        }
    }

    /* renamed from: com.bytedance.android.livesdk.rank.impl.ranks.a.b$c */
    static final class View$OnClickListenerC10485c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C10480b f25247a;

        static {
            Covode.recordClassIndex(12060);
        }

        View$OnClickListenerC10485c(C10480b bVar) {
            this.f25247a = bVar;
        }

        public final void onClick(View view) {
            C10480b bVar = this.f25247a;
            RankPage rankPage = bVar.f25233b;
            if (rankPage == null) {
                C89219l.m154710a("mCurrentRankPage");
            }
            if (!TextUtils.isEmpty(rankPage.getRuleUrl())) {
                RankPage rankPage2 = bVar.f25233b;
                if (rankPage2 == null) {
                    C89219l.m154710a("mCurrentRankPage");
                }
                Uri parse = Uri.parse(rankPage2.getRuleUrl());
                String queryParameter = parse.getQueryParameter("url");
                if (queryParameter != null) {
                    C89219l.m154716b(queryParameter, "");
                    C89219l.m154716b(parse, "");
                    Uri a = C11279p.m19998a(parse, "url", queryParameter + "?landscape=" + (!bVar.f25234c ? 1 : 0));
                    IActionHandlerService iActionHandlerService = (IActionHandlerService) C6193a.m13435a(IActionHandlerService.class);
                    Context context = bVar.getContext();
                    Uri.Builder buildUpon = a.buildUpon();
                    View view2 = bVar.f25238g;
                    if (view2 == null) {
                        C89219l.m154710a("rootView");
                    }
                    Uri.Builder appendQueryParameter = buildUpon.appendQueryParameter("width", String.valueOf((int) C3966y.m9668e(view2.getWidth())));
                    if (!bVar.f25234c || TextUtils.isEmpty(a.getQueryParameter("height"))) {
                        View view3 = bVar.f25238g;
                        if (view3 == null) {
                            C89219l.m154710a("rootView");
                        }
                        appendQueryParameter.appendQueryParameter("height", String.valueOf((int) C3966y.m9668e(view3.getHeight())));
                    }
                    iActionHandlerService.handle(context, appendQueryParameter.build());
                }
            }
        }
    }

    @Override // com.bytedance.android.livesdk.p643ui.C10935a, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        Boolean bool;
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f25239i = arguments.getLong("arg_anchor_id");
            this.f25240j = arguments.getLong("arg_room_id");
            this.f25242l = arguments.getInt("first_show_rank_type");
            ArrayList<Integer> integerArrayList = arguments.getIntegerArrayList("rank_types");
            if (integerArrayList == null) {
                integerArrayList = (ArrayList) C89070n.m154524c(Integer.valueOf(EnumC10345i.HOURLY_RANK.getType()));
            }
            this.f25241k = integerArrayList;
            this.f25243m = arguments.getInt("target_region_type", EnumC10367d.UNKNOWN.getValue());
        }
        this.f25237f = C17846f.m33055a(this);
        long j = this.f25239i;
        long j2 = this.f25240j;
        DataChannel dataChannel = this.f25237f;
        ArrayList<Integer> arrayList = this.f25241k;
        if (arrayList == null) {
            C89219l.m154710a("mRankTypes");
        }
        this.f25235d = new C10492d(j, j2, dataChannel, arrayList, this.f25243m);
        DataChannel dataChannel2 = this.f25237f;
        Boolean bool2 = null;
        if (dataChannel2 != null) {
            bool = (Boolean) dataChannel2.mo28318b(C9076co.class);
        } else {
            bool = null;
        }
        this.f25234c = C11279p.m20027d(bool);
        DataChannel dataChannel3 = this.f25237f;
        if (dataChannel3 != null) {
            bool2 = (Boolean) dataChannel3.mo28318b(C9119ed.class);
        }
        this.f25236e = C11279p.m20012a(bool2);
    }

    @Override // com.bytedance.android.livesdk.rank.impl.ranks.p615a.C10489c.AbstractC10491b
    /* renamed from: a */
    public final void mo17317a(RankResponse rankResponse) {
        int i;
        C17309b a;
        C89219l.m154721d(rankResponse, "");
        View a2 = m18998a(R.id.amc);
        C89219l.m154716b(a2, "");
        a2.setVisibility(0);
        LiveAutoRtlImageView liveAutoRtlImageView = (LiveAutoRtlImageView) m18998a(R.id.de2);
        C89219l.m154716b(liveAutoRtlImageView, "");
        liveAutoRtlImageView.setVisibility(0);
        ((LiveAutoRtlImageView) m18998a(R.id.de2)).setOnClickListener(new View$OnClickListenerC10485c(this));
        if (!(getContext() == null || (a = C17309b.m32048a(getContext(), C17309b.f41588b)) == null || a.mo27622a("live.mt.hourly_rank.help_tooltip", false))) {
            a.mo27623b("live.mt.hourly_rank.help_tooltip", true);
            C4097j.m9924a(((C4081a.C4082a) new C4081a.C4082a(m18998a(R.id.de2)).mo9527a(R.string.e_9).mo9557b(C3966y.m9653a(266.0f)).mo9558c()).mo9530b());
        }
        DataChannel dataChannel = this.f25237f;
        if (dataChannel != null) {
            dataChannel.mo28311a(C10383c.class, rankResponse);
        }
        int showIndex = rankResponse.getShowIndex();
        for (C89037ac acVar : C89070n.m154593m(rankResponse.getPages())) {
            if (acVar.f202767b.getRankType() == this.f25242l) {
                showIndex = acVar.f202766a;
            }
        }
        this.f25233b = rankResponse.getPages().get(showIndex);
        List<RankPage> pages = rankResponse.getPages();
        RtlViewPager rtlViewPager = (RtlViewPager) m18998a(R.id.ffo);
        AbstractC0952i childFragmentManager = getChildFragmentManager();
        C89219l.m154716b(childFragmentManager, "");
        rtlViewPager.setAdapter(new C10482b(this, childFragmentManager, pages));
        rtlViewPager.setCurrentItem(showIndex, true);
        rtlViewPager.setVisibility(0);
        rtlViewPager.addOnPageChangeListener(new C10486d(this, pages, showIndex));
        if (pages.size() != 1 || !this.f25234c) {
            LiveTabLayout liveTabLayout = (LiveTabLayout) m18998a(R.id.ee7);
            liveTabLayout.setVisibility(0);
            if (this.f25234c) {
                i = R.layout.bb5;
            } else {
                i = R.layout.bb6;
            }
            liveTabLayout.setCustomTabViewResId(i);
            liveTabLayout.f25418b.setPadding(C3966y.m9653a(16.0f), 0, C3966y.m9653a(16.0f), 0);
            liveTabLayout.setTabMode(0);
            liveTabLayout.setAutoFillWhenScrollable(true);
            liveTabLayout.setupWithViewPager((ViewPager) m18998a(R.id.ffo));
            return;
        }
        LiveTextView liveTextView = (LiveTextView) m18998a(R.id.e1i);
        liveTextView.setVisibility(0);
        liveTextView.setText(pages.get(0).getTitle());
    }

    @Override // com.bytedance.android.livesdk.p643ui.C10935a, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C89219l.m154721d(view, "");
        super.onViewCreated(view, bundle);
        C10489c.AbstractC10490a aVar = this.f25235d;
        if (aVar == null) {
            C89219l.m154710a("mPresenter");
        }
        aVar.mo17327a(this);
        C10489c.AbstractC10490a aVar2 = this.f25235d;
        if (aVar2 == null) {
            C89219l.m154710a("mPresenter");
        }
        aVar2.mo17328b();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i;
        C89219l.m154721d(layoutInflater, "");
        if (this.f25234c) {
            i = R.layout.b64;
        } else {
            i = R.layout.b65;
        }
        View a = C1764a.m5927a(layoutInflater, i, viewGroup, false);
        C89219l.m154716b(a, "");
        this.f25238g = a;
        if (a == null) {
            C89219l.m154710a("rootView");
        }
        return a;
    }
}
