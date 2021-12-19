package com.bytedance.android.livesdk.feed.drawerfeed;

import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.C1181ae;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.core.p210a.AbstractC3838b;
import com.bytedance.android.live.core.p215e.C3884b;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.live.core.p218f.p219a.C3898g;
import com.bytedance.android.live.core.performance.C4017b;
import com.bytedance.android.live.p250i.p251a.AbstractC4357d;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.livesdk.chatroom.C7411d;
import com.bytedance.android.livesdk.feed.BannerSwipeRefreshLayout;
import com.bytedance.android.livesdk.feed.C8564e;
import com.bytedance.android.livesdk.feed.LiveDrawerSettings;
import com.bytedance.android.livesdk.feed.feed.FeedDataKey;
import com.bytedance.android.livesdk.feed.p523a.AbstractC8472a;
import com.bytedance.android.livesdk.feed.p523a.C8476d;
import com.bytedance.android.livesdk.feed.p530f.AbstractC8567a;
import com.bytedance.android.livesdk.feed.p533i.AbstractC8597a;
import com.bytedance.android.livesdk.feed.repository.BaseFeedRepository;
import com.bytedance.android.livesdk.feed.viewmodel.C8724l;
import com.bytedance.android.livesdk.feed.viewmodel.C8725m;
import com.bytedance.android.livesdk.feed.viewmodel.TabFeedViewModel;
import com.bytedance.android.livesdk.livesetting.other.LiveFeedPreloadSetting;
import com.bytedance.android.livesdk.model.C9898o;
import com.bytedance.android.livesdk.model.FeedItem;
import com.bytedance.android.livesdk.p425aa.C6501b;
import com.bytedance.android.livesdk.utils.C11226ao;
import com.bytedance.android.livesdkapi.depend.p680d.AbstractC11643g;
import com.bytedance.android.livesdkapi.p691g.AbstractC11761b;
import com.bytedance.android.livesdkapi.p691g.AbstractC11762c;
import com.bytedance.android.livesdkapi.view.TextureViewWrapper;
import com.bytedance.android.p145b.p146a.C2695a;
import com.bytedance.common.utility.C13627m;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.base.utils.C34719f;
import com.p2082ss.android.ugc.aweme.lancet.C58029j;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.bytedance.android.livesdk.feed.drawerfeed.l */
public class C8555l extends AbstractC8567a {

    /* renamed from: u */
    private static final String f21141u = C8555l.class.getCanonicalName();

    /* renamed from: A */
    private boolean f21142A = false;

    /* renamed from: a */
    protected View f21143a;

    /* renamed from: b */
    protected TextureViewWrapper f21144b;

    /* renamed from: c */
    C8529a f21145c;

    /* renamed from: d */
    AbstractC11643g f21146d;

    /* renamed from: e */
    AbstractC3838b<FeedDataKey, FeedItem> f21147e;

    /* renamed from: f */
    public AbstractC11761b f21148f;

    /* renamed from: v */
    private GridLayoutManager f21149v;

    /* renamed from: w */
    private final Map<Long, FeedDataKey> f21150w = new HashMap();

    /* renamed from: x */
    private String f21151x = "";

    /* renamed from: y */
    private final String f21152y = "";

    /* renamed from: z */
    private final boolean f21153z = true;

    @Override // com.bytedance.android.livesdk.feed.p530f.AbstractC8567a
    /* renamed from: g */
    public final AbstractC8472a mo14861g() {
        return this.f21145c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public final /* synthetic */ void mo14865k() {
        mo14876p();
    }

    @Override // com.bytedance.android.livesdk.p643ui.C10935a, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
    }

    @Override // com.bytedance.android.livesdk.p643ui.C10935a, com.bytedance.android.livesdk.feed.p530f.AbstractC8567a, androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
    }

    @Override // com.bytedance.android.livesdk.p643ui.C10935a, com.bytedance.android.livesdk.feed.p530f.AbstractC8567a, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
    }

    static {
        Covode.recordClassIndex(9410);
    }

    /* renamed from: q */
    private static boolean m16762q() {
        try {
            return C34719f.C34720a.f82009a.mo61395c();
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // com.bytedance.android.livesdk.feed.p530f.AbstractC8567a, com.bytedance.android.livesdk.feed.AbstractC8596i
    /* renamed from: a */
    public final String mo14851a() {
        if (!C13627m.m24498a(this.f21151x)) {
            return this.f21151x;
        }
        return super.mo14851a();
    }

    @Override // com.bytedance.android.livesdk.feed.p530f.AbstractC8567a, com.bytedance.android.livesdk.feed.AbstractC8596i
    /* renamed from: b */
    public final String mo14857b() {
        if (!C13627m.m24498a("")) {
            return "";
        }
        return super.mo14857b();
    }

    @Override // com.bytedance.android.livesdk.feed.p530f.AbstractC8567a
    /* renamed from: e */
    public final int mo14860e() {
        if (m16761f()) {
            return 2;
        }
        return 1;
    }

    @Override // com.bytedance.android.livesdk.feed.p530f.AbstractC8567a
    /* renamed from: h */
    public final long mo14862h() {
        if (f21172t != null) {
            return f21172t.getId();
        }
        return 1;
    }

    /* renamed from: f */
    public static boolean m16761f() {
        if (f21172t == null || f21172t.getStyle() == 2 || f21172t.getStyle() == 3) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.android.livesdk.feed.p530f.AbstractC8567a, com.bytedance.android.livesdk.feed.AbstractC8596i
    /* renamed from: c */
    public final int mo14858c() {
        int i;
        C9898o value = LiveFeedPreloadSetting.INSTANCE.getValue();
        if (value != null) {
            if (m16761f()) {
                i = (value.f23964b - 1) * 2;
            } else {
                i = value.f23963a;
            }
            if (i > 1) {
                return i;
            }
        }
        return super.mo14858c();
    }

    @Override // com.bytedance.android.livesdk.feed.p530f.AbstractC8567a
    /* renamed from: i */
    public final RecyclerView.AbstractC1362i mo14863i() {
        getContext();
        GridLayoutManager gridLayoutManager = new GridLayoutManager(2);
        gridLayoutManager.mo4320a(new GridLayoutManager.AbstractC1337c() {
            /* class com.bytedance.android.livesdk.feed.drawerfeed.C8555l.C85561 */

            static {
                Covode.recordClassIndex(9411);
            }

            @Override // androidx.recyclerview.widget.GridLayoutManager.AbstractC1337c
            /* renamed from: a */
            public final int mo4342a(int i) {
                if (C8555l.this.f21145c.getItemViewType(i) == R.layout.b9p) {
                    return 1;
                }
                return 2;
            }
        });
        return gridLayoutManager;
    }

    @Override // com.bytedance.android.livesdk.p643ui.C10935a, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        for (FeedDataKey feedDataKey : this.f21150w.values()) {
            AbstractC3838b<FeedDataKey, FeedItem> bVar = this.f21147e;
            if (bVar != null) {
                bVar.mo9207d(feedDataKey);
            }
        }
    }

    @Override // com.bytedance.android.livesdk.feed.p530f.AbstractC8567a
    /* renamed from: j */
    public final void mo14864j() {
        super.mo14864j();
        if (this.f21149v != null && this.f21181k != null) {
            this.f21181k.f21515x = this.f21149v.mo4372l();
            View c = this.f21149v.mo4358c(this.f21181k.f21515x);
            if (c != null) {
                this.f21181k.f21516y = c.getTop();
            }
        }
    }

    @Override // com.bytedance.android.livesdk.feed.p530f.AbstractC8567a
    /* renamed from: d */
    public final TabFeedViewModel mo14859d() {
        String str;
        String str2;
        ActivityC0945e activity = getActivity();
        C8564e eVar = this.f21177g;
        eVar.f21164a = mo14862h();
        eVar.f21165b = this;
        this.f21181k = (TabFeedViewModel) C1181ae.m3881a(activity, eVar).mo3983a(TabFeedViewModel.class);
        this.f21181k.mo14998h();
        TabFeedViewModel tabFeedViewModel = this.f21181k;
        if (tabFeedViewModel.f21517z == null) {
            tabFeedViewModel.f21517z = new C8724l(tabFeedViewModel);
            tabFeedViewModel.f21506A = new C8725m(tabFeedViewModel);
            tabFeedViewModel.f21481a.mo14942d().mo14832a(tabFeedViewModel.f21517z);
            tabFeedViewModel.f21481a.mo14942d().mo14833a(tabFeedViewModel.f21506A);
        }
        this.f21181k.f21508C = this.f21151x;
        String str3 = "";
        if (C13627m.m24499a("homepage_hot", C7411d.m15284a().mo13614e())) {
            str = "enter_auto_foru_feed_from_room";
            str2 = "foru_";
        } else {
            str = "enter_auto_from_room";
            str2 = str3;
        }
        if (C13627m.m24499a("referral_task", C7411d.m15284a().mo13614e())) {
            str = "enter_auto_referrals_from_room";
            str2 = str3;
        }
        if (C7411d.m15284a() != null) {
            C7411d.m15284a().mo13611b();
            C7411d.m15284a().mo13612c();
        }
        if (LiveDrawerSettings.INSTANCE.getValue().getEnableFullEntrance()) {
            str = "drawer_enter_from_room";
            str2 = str3;
        }
        TabFeedViewModel tabFeedViewModel2 = this.f21181k;
        tabFeedViewModel2.f21507B = !C13627m.m24498a(str);
        tabFeedViewModel2.f21481a.mo14940b(str);
        this.f21181k.f10973c.observe(this, new C8561q(this));
        String d = C7411d.m15284a().mo13613d();
        if (!TextUtils.isEmpty(d)) {
            str3 = d + "_";
        }
        String str4 = str3 + str2 + "feed_refresh";
        if (C13627m.m24499a("referral_task", C7411d.m15284a().mo13614e())) {
            str4 = "referrals_refresh";
        }
        if (LiveDrawerSettings.INSTANCE.getValue().getEnableFullEntrance()) {
            str4 = "drawer_refresh";
        }
        this.f21180j.setOnRefreshListener(new C8562r(this, str4));
        return this.f21181k;
    }

    @Override // androidx.fragment.app.Fragment
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f21145c.notifyDataSetChanged();
    }

    @Override // com.bytedance.android.livesdk.feed.p530f.AbstractC8567a, androidx.fragment.app.Fragment
    public void setUserVisibleHint(boolean z) {
        super.setUserVisibleHint(z);
        if (!z) {
            mo14864j();
        } else {
            mo14873m();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ void mo14855a(Integer num) {
        if (num != null) {
            RecyclerView.ViewHolder f = this.f21178h.mo4451f(num.intValue());
            if (f instanceof AbstractC8597a) {
                this.f21178h.postDelayed(new RunnableC8563s(this, f), 500);
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        this.f21146d = ((AbstractC4357d) C6193a.m13435a(AbstractC4357d.class)).getLivePlayController();
    }

    @Override // com.bytedance.android.livesdk.feed.p530f.AbstractC8567a
    /* renamed from: a */
    public final C8476d.C8479a mo14850a(C8476d.C8479a aVar) {
        C8476d.C8479a aVar2 = new C8476d.C8479a();
        aVar2.f20982g = getActivity();
        aVar2.f20978c = this.f21181k;
        aVar2.f20977b = this.f21178h;
        aVar2.f20985j = new C8558n(this);
        aVar2.f20976a = this.f21145c;
        aVar2.f20979d = mo14863i();
        aVar2.f20981f = mo14874n();
        aVar2.f20983h = false;
        aVar2.f20980e = mo14860e();
        aVar2.f20984i = this;
        return aVar2;
    }

    @Override // com.bytedance.android.livesdk.feed.p530f.AbstractC8567a
    /* renamed from: a */
    public final void mo14852a(View view) {
        super.mo14852a(view);
        this.f21143a = view.findViewById(R.id.ec7);
        if (Build.VERSION.SDK_INT >= 21) {
            this.f21143a.setBackgroundResource(R.drawable.byf);
        }
        this.f21144b = (TextureViewWrapper) view.findViewById(R.id.ec5);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ void mo14853a(C3884b bVar) {
        boolean z;
        AbstractC11761b bVar2;
        BannerSwipeRefreshLayout bannerSwipeRefreshLayout = this.f21180j;
        if (bVar == null || !bVar.mo9243a() || !this.f21142A) {
            z = false;
        } else {
            z = true;
        }
        bannerSwipeRefreshLayout.setRefreshing(z);
        this.f21142A = true;
        if (bVar.f10741a != C3884b.EnumC3885a.RUNNING && (bVar2 = this.f21148f) != null) {
            bVar2.mo14733c();
        }
    }

    @Override // com.bytedance.android.livesdk.p643ui.C10935a, com.bytedance.android.livesdk.feed.p530f.AbstractC8567a, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        C4017b.m9800b(C4017b.EnumC4018a.LiveFeedInit);
        C7411d a = C7411d.m15284a();
        String str = null;
        if (a.f18373a && a.f18374b != null) {
            C7411d.C7412a aVar = a.f18374b;
            if (aVar.f18380d != null) {
                str = aVar.f18380d.f22734b;
            }
        }
        if (!TextUtils.isEmpty(str)) {
            this.f21151x = str;
        }
        super.onCreate(bundle);
        C8547e eVar = new C8547e(this);
        HashMap hashMap = new HashMap();
        hashMap.put(Integer.valueOf((int) R.layout.b9p), new C8549f(eVar.f21127f, eVar.f21123b, eVar.f21124c, eVar.f21125d));
        hashMap.put(Integer.valueOf((int) R.layout.bdr), new C8551h(
        /*  JADX ERROR: Method code generation error
            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0051: INVOKE  
              (r6v0 'hashMap' java.util.HashMap)
              (wrap: java.lang.Integer : 0x0043: INVOKE  (r2v3 java.lang.Integer) = (wrap: int : ?: CAST (int) (wrap: ?? : ?: SGET   com.ss.android.ugc.trill.R.layout.bdr int)) type: STATIC call: java.lang.Integer.valueOf(int):java.lang.Integer)
              (wrap: com.bytedance.android.livesdk.feed.drawerfeed.h : 0x004e: CONSTRUCTOR  (r0v6 com.bytedance.android.livesdk.feed.drawerfeed.h) = 
              (wrap: com.bytedance.android.livesdk.feed.drawerfeed.e$1 : 0x0049: CONSTRUCTOR  (r1v2 com.bytedance.android.livesdk.feed.drawerfeed.e$1) = (r8v0 'eVar' com.bytedance.android.livesdk.feed.drawerfeed.e) call: com.bytedance.android.livesdk.feed.drawerfeed.e.1.<init>(com.bytedance.android.livesdk.feed.drawerfeed.e):void type: CONSTRUCTOR)
             call: com.bytedance.android.livesdk.feed.drawerfeed.h.<init>(com.bytedance.android.livesdk.feed.p):void type: CONSTRUCTOR)
             type: INTERFACE call: java.util.Map.put(java.lang.Object, java.lang.Object):java.lang.Object in method: com.bytedance.android.livesdk.feed.drawerfeed.l.onCreate(android.os.Bundle):void, file: classes6.dex
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:217)
            	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:110)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:56)
            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
            	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:244)
            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:237)
            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:342)
            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:295)
            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:264)
            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
            Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x004e: CONSTRUCTOR  (r0v6 com.bytedance.android.livesdk.feed.drawerfeed.h) = 
              (wrap: com.bytedance.android.livesdk.feed.drawerfeed.e$1 : 0x0049: CONSTRUCTOR  (r1v2 com.bytedance.android.livesdk.feed.drawerfeed.e$1) = (r8v0 'eVar' com.bytedance.android.livesdk.feed.drawerfeed.e) call: com.bytedance.android.livesdk.feed.drawerfeed.e.1.<init>(com.bytedance.android.livesdk.feed.drawerfeed.e):void type: CONSTRUCTOR)
             call: com.bytedance.android.livesdk.feed.drawerfeed.h.<init>(com.bytedance.android.livesdk.feed.p):void type: CONSTRUCTOR in method: com.bytedance.android.livesdk.feed.drawerfeed.l.onCreate(android.os.Bundle):void, file: classes6.dex
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
            	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:806)
            	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:746)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:367)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
            	... 14 more
            Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0049: CONSTRUCTOR  (r1v2 com.bytedance.android.livesdk.feed.drawerfeed.e$1) = (r8v0 'eVar' com.bytedance.android.livesdk.feed.drawerfeed.e) call: com.bytedance.android.livesdk.feed.drawerfeed.e.1.<init>(com.bytedance.android.livesdk.feed.drawerfeed.e):void type: CONSTRUCTOR in method: com.bytedance.android.livesdk.feed.drawerfeed.l.onCreate(android.os.Bundle):void, file: classes6.dex
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
            	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:806)
            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:663)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
            	... 20 more
            Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.bytedance.android.livesdk.feed.drawerfeed.e, state: GENERATED_AND_UNLOADED
            	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
            	... 26 more
            */
        /*
        // Method dump skipped, instructions count: 234
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.feed.drawerfeed.C8555l.onCreate(android.os.Bundle):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ void mo14854a(BaseFeedRepository.EnumC8657a aVar) {
        if (aVar == BaseFeedRepository.EnumC8657a.SUCCESS) {
            if (this.f21181k != null && this.f21181k.f21515x > 0 && this.f21145c.getItemCount() > this.f21181k.f21515x) {
                int i = this.f21181k.f21516y;
                if (i > C3966y.m9653a(3.0f)) {
                    i -= C3966y.m9653a(3.0f);
                }
                this.f21149v.mo4347a(this.f21181k.f21515x, i);
            }
            this.f21181k.f21516y = 0;
            this.f21181k.f21515x = 0;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ void mo14856a(String str) {
        C6501b.C6502a.m13948a("livesdk_explore_refresh").mo12645a("has_banner", C2695a.f8059g.mo7220c()).mo12643a(this.f21189s).mo12655b();
        this.f21181k.mo14990a(str);
        getContext();
        if (!C58029j.f132253e || !C58029j.m104846b() || C58029j.m104847c()) {
            C58029j.f132253e = m16762q();
        }
        if (!C58029j.f132253e) {
            C11226ao.m19882a(getContext(), (int) R.string.gkv);
        }
        C3898g.m9526a().f10794a.clear();
    }

    @Override // com.bytedance.android.livesdk.p643ui.C10935a, com.bytedance.android.livesdk.feed.p530f.AbstractC8567a, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f21179i.f20964c.f21482i.observe(this, new C8559o(this));
        this.f21149v = (GridLayoutManager) this.f21178h.getLayoutManager();
        getString(R.string.gkp);
        if (getActivity() != null && (getActivity() instanceof AbstractC11762c)) {
            getActivity();
        }
        HashMap hashMap = new HashMap();
        hashMap.put("event_belong", "tab_click");
        C6501b.C6502a.m13948a("live_enter").mo12652a((Map<String, String>) hashMap).mo12655b();
        this.f21181k.f21487n.observe(this, new C8560p(this));
    }

    @Override // com.bytedance.android.livesdk.feed.p530f.AbstractC8567a, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f21184n = super.onCreateView(layoutInflater, viewGroup, bundle);
        this.f21178h.setBackgroundColor(getContext().getResources().getColor(R.color.x2));
        return this.f21184n;
    }
}
