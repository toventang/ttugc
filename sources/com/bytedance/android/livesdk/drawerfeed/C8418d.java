package com.bytedance.android.livesdk.drawerfeed;

import android.os.Bundle;
import android.os.SystemClock;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.p037h.C0792v;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.AbstractC0976n;
import androidx.fragment.app.Fragment;
import com.C1764a;
import com.bytedance.android.live.gift.C4327c;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.livesdk.C8774g;
import com.bytedance.android.livesdk.chatroom.C7411d;
import com.bytedance.android.livesdk.feed.FullDraggableContainer;
import com.bytedance.android.livesdk.p425aa.C6501b;
import com.bytedance.android.livesdk.p449am.C6779a;
import com.bytedance.android.livesdk.p643ui.C10935a;
import com.bytedance.android.livesdk.watch.AbstractC11321b;
import com.bytedance.android.livesdk.widget.LiveLoadingView;
import com.bytedance.android.livesdkapi.p691g.AbstractC11761b;
import com.bytedance.android.p145b.p146a.AbstractC2702b;
import com.bytedance.android.p145b.p146a.C2695a;
import com.bytedance.common.utility.C13627m;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p4560f.p4561a.p4565b.C88411a;

/* renamed from: com.bytedance.android.livesdk.drawerfeed.d */
public final class C8418d extends C10935a implements AbstractC11321b {

    /* renamed from: a */
    public DrawerLayout f20823a;

    /* renamed from: b */
    public Fragment f20824b;

    /* renamed from: c */
    LiveLoadingView f20825c;

    /* renamed from: d */
    public Bundle f20826d;

    /* renamed from: e */
    long f20827e;

    /* renamed from: f */
    public FullDraggableContainer f20828f;

    /* renamed from: g */
    public DataChannel f20829g;

    /* renamed from: h */
    public DrawerLayout.AbstractC0843c f20830h;

    /* renamed from: i */
    private final C88411a f20831i = new C88411a();

    /* renamed from: j */
    private List<Object> f20832j = new ArrayList();

    /* renamed from: k */
    private DrawerLayout.AbstractC0843c f20833k = new DrawerLayout.AbstractC0843c() {
        /* class com.bytedance.android.livesdk.drawerfeed.C8418d.C84191 */

        static {
            Covode.recordClassIndex(9264);
        }

        @Override // androidx.drawerlayout.widget.DrawerLayout.AbstractC0843c
        public final void onDrawerSlide(View view, float f) {
        }

        @Override // androidx.drawerlayout.widget.DrawerLayout.AbstractC0843c
        public final void onDrawerStateChanged(int i) {
            if (i == 0 && C8418d.this.f20823a != null) {
                C8418d.this.f20823a.isDrawerOpen(8388613);
            }
        }

        @Override // androidx.drawerlayout.widget.DrawerLayout.AbstractC0843c
        public final void onDrawerClosed(View view) {
            C8774g.m17073a().mo15046c();
            if (C8418d.this.getUserVisibleHint()) {
                C2695a.f8059g.mo7218a(false, C8418d.this.f20829g);
                C8418d.this.mo14735a();
                if (C8418d.this.f20824b != null) {
                    C8418d.this.f20824b.setUserVisibleHint(false);
                }
            }
        }

        @Override // androidx.drawerlayout.widget.DrawerLayout.AbstractC0843c
        public final void onDrawerOpened(View view) {
            C8774g.m17073a().mo15045b();
            if (C8418d.this.getUserVisibleHint()) {
                C2695a aVar = C2695a.f8059g;
                long elapsedRealtime = SystemClock.elapsedRealtime();
                if (aVar.mo7216a().size() == 0) {
                    aVar.f8065e = elapsedRealtime;
                }
                C8418d dVar = C8418d.this;
                HashMap hashMap = new HashMap();
                dVar.f20827e = SystemClock.elapsedRealtime();
                hashMap.put("request_page", C7411d.m15284a().mo13614e());
                C6501b.C6502a.m13948a("livesdk_more_anchor_show").mo12652a((Map<String, String>) hashMap).mo12656c(C2695a.f8059g.f8064d).mo12643a(dVar.f20829g).mo12655b();
            }
            if (C8418d.this.f20824b == null) {
                C8418d dVar2 = C8418d.this;
                View view2 = dVar2.getView();
                if (dVar2.f20824b == null) {
                    dVar2.f20825c = (LiveLoadingView) view2.findViewById(R.id.an1);
                    dVar2.f20825c.setVisibility(0);
                    dVar2.f20824b = ((AbstractC2702b) C6193a.m13435a(AbstractC2702b.class)).createDrawerFeedFragment(new AbstractC11761b() {
                        /* class com.bytedance.android.livesdk.drawerfeed.C8418d.C84202 */

                        static {
                            Covode.recordClassIndex(9265);
                        }

                        @Override // com.bytedance.android.livesdkapi.p691g.AbstractC11761b
                        /* renamed from: b */
                        public final void mo14732b() {
                            C8418d.this.mo14735a();
                            C8418d.this.mo14738a(false, true);
                        }

                        @Override // com.bytedance.android.livesdkapi.p691g.AbstractC11761b
                        /* renamed from: c */
                        public final void mo14733c() {
                            C8418d dVar = C8418d.this;
                            if (dVar.f20825c != null) {
                                dVar.f20825c.setVisibility(8);
                            }
                        }

                        @Override // com.bytedance.android.livesdkapi.p691g.AbstractC11761b
                        /* renamed from: a */
                        public final void mo14731a() {
                            C8418d dVar = C8418d.this;
                            if (dVar.f20823a != null && C0792v.m2791y(dVar.f20823a)) {
                                dVar.f20823a.requestDisallowInterceptTouchEvent(true);
                            }
                        }
                    });
                    if (dVar2.f20824b != null) {
                        dVar2.f20824b.setArguments(dVar2.f20826d);
                    }
                }
                if (dVar2.f20824b != null && !dVar2.f20824b.isAdded()) {
                    AbstractC0976n a = dVar2.getChildFragmentManager().mo3552a();
                    a.mo3453a(R.id.cyv, dVar2.f20824b);
                    a.mo3473c();
                    return;
                }
                return;
            }
            C8418d.this.f20824b.setUserVisibleHint(true);
        }
    };

    static {
        Covode.recordClassIndex(9263);
    }

    @Override // com.bytedance.android.livesdk.watch.AbstractC11321b
    /* renamed from: b */
    public final Fragment mo14739b() {
        return this;
    }

    @Override // com.bytedance.android.livesdk.p643ui.C10935a, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        this.f20831i.mo142944a();
    }

    @Override // com.bytedance.android.livesdk.watch.AbstractC11321b
    /* renamed from: c */
    public final boolean mo14741c() {
        boolean z;
        DrawerLayout drawerLayout = this.f20823a;
        if (drawerLayout == null || !drawerLayout.isDrawerOpen(8388613) || !C0792v.m2791y(this.f20823a)) {
            z = false;
        } else {
            z = true;
        }
        return Boolean.valueOf(z).booleanValue();
    }

    /* renamed from: a */
    public final void mo14735a() {
        HashMap hashMap = new HashMap();
        hashMap.put("duration", String.valueOf(SystemClock.elapsedRealtime() - this.f20827e));
        hashMap.put("request_page", C7411d.m15284a().mo13614e());
        if (!C13627m.m24498a(C7411d.m15284a().mo13614e())) {
            hashMap.put("enter_live_method", C7411d.m15284a().mo13614e());
        }
        C6501b.C6502a.m13948a("livesdk_explore_duration").mo12652a((Map<String, String>) hashMap).mo12656c(C2695a.f8059g.f8064d).mo12643a(this.f20829g).mo12655b();
        C6501b.C6502a.m13948a("livesdk_explore_close").mo12643a(this.f20829g).mo12651a("close_type", C2695a.f8059g.f8063c).mo12645a("has_banner", C2695a.f8059g.mo7220c()).mo12655b();
        C2695a.f8059g.f8063c = "scroll";
    }

    @Override // com.bytedance.android.livesdk.watch.AbstractC11321b
    /* renamed from: a */
    public final void mo14736a(DataChannel dataChannel) {
        this.f20829g = dataChannel;
    }

    @Override // com.bytedance.android.livesdk.p643ui.C10935a, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    @Override // com.bytedance.android.livesdk.watch.AbstractC11321b
    /* renamed from: a */
    public final void mo14737a(boolean z) {
        FullDraggableContainer fullDraggableContainer = this.f20828f;
        if (fullDraggableContainer != null) {
            fullDraggableContainer.setDrawerEnable(z);
        }
    }

    @Override // com.bytedance.android.livesdk.watch.AbstractC11321b
    /* renamed from: b */
    public final void mo14740b(boolean z) {
        FullDraggableContainer fullDraggableContainer = this.f20828f;
        if (fullDraggableContainer != null) {
            fullDraggableContainer.setClearScreen(z);
        }
    }

    @Override // com.bytedance.android.livesdk.watch.AbstractC11321b
    /* renamed from: a */
    public final void mo14738a(boolean z, boolean z2) {
        DrawerLayout drawerLayout = this.f20823a;
        if (drawerLayout != null && C0792v.m2791y(drawerLayout)) {
            if (z) {
                this.f20823a.openDrawer(8388613, z2);
            } else {
                this.f20823a.closeDrawer(8388613, z2);
            }
        }
    }

    @Override // com.bytedance.android.livesdk.p643ui.C10935a, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f20831i.mo142945a(C6779a.m14563a().mo13052a(C4327c.class).mo143289d(new C8421e(this)));
        DrawerLayout drawerLayout = (DrawerLayout) view.findViewById(R.id.ap0);
        this.f20823a = drawerLayout;
        FullDraggableContainer fullDraggableContainer = this.f20828f;
        if (fullDraggableContainer != null) {
            fullDraggableContainer.setDrawerLayout(drawerLayout);
        }
        this.f20823a.addDrawerListener(this.f20833k);
        DrawerLayout.AbstractC0843c cVar = this.f20830h;
        if (cVar != null) {
            this.f20823a.addDrawerListener(cVar);
        }
        ViewGroup viewGroup = (ViewGroup) view.findViewById(R.id.cyw);
        int a = (int) (((float) C13628n.m24504a(getContext())) - C13628n.m24520b(getContext(), 50.0f));
        if (a > 0) {
            ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
            layoutParams.width = a;
            viewGroup.setLayoutParams(layoutParams);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return C1764a.m5927a(layoutInflater, R.layout.xb, viewGroup, false);
    }
}
