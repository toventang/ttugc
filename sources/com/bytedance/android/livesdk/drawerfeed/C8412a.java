package com.bytedance.android.livesdk.drawerfeed;

import android.content.DialogInterface;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.core.p037h.C0792v;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.AbstractC0976n;
import androidx.fragment.app.Fragment;
import com.bytedance.android.live.core.p218f.C3931d;
import com.bytedance.android.live.gift.C4327c;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.livesdk.AbstractC11293v;
import com.bytedance.android.livesdk.C8774g;
import com.bytedance.android.livesdk.chatroom.C7411d;
import com.bytedance.android.livesdk.p425aa.C6501b;
import com.bytedance.android.livesdk.p449am.C6779a;
import com.bytedance.android.livesdk.widget.LiveLoadingView;
import com.bytedance.android.livesdkapi.p691g.AbstractC11761b;
import com.bytedance.android.p145b.p146a.AbstractC2702b;
import com.bytedance.common.utility.C13617h;
import com.bytedance.common.utility.C13627m;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p4560f.p4561a.p4565b.C88411a;

/* renamed from: com.bytedance.android.livesdk.drawerfeed.a */
public final class C8412a extends AbstractC11293v {

    /* renamed from: a */
    public DrawerLayout f20807a;

    /* renamed from: b */
    public Fragment f20808b;

    /* renamed from: c */
    public LiveLoadingView f20809c;

    /* renamed from: d */
    public Bundle f20810d;

    /* renamed from: e */
    String f20811e;

    /* renamed from: f */
    long f20812f;

    /* renamed from: g */
    private List<DrawerLayout.AbstractC0843c> f20813g;

    /* renamed from: h */
    private final C88411a f20814h = new C88411a();

    /* renamed from: i */
    private boolean f20815i = false;

    /* renamed from: j */
    private DrawerLayout.AbstractC0843c f20816j = new DrawerLayout.AbstractC0843c() {
        /* class com.bytedance.android.livesdk.drawerfeed.C8412a.C84152 */

        static {
            Covode.recordClassIndex(9260);
        }

        @Override // androidx.drawerlayout.widget.DrawerLayout.AbstractC0843c
        public final void onDrawerSlide(View view, float f) {
        }

        @Override // androidx.drawerlayout.widget.DrawerLayout.AbstractC0843c
        public final void onDrawerClosed(View view) {
            C8774g.m17073a().mo15046c();
            if (C8412a.this.getUserVisibleHint()) {
                C8412a.this.mo9929d();
            }
            C8412a.this.dismissAllowingStateLoss();
        }

        @Override // androidx.drawerlayout.widget.DrawerLayout.AbstractC0843c
        public final void onDrawerStateChanged(int i) {
            if (i == 0 && C8412a.this.f20807a != null && !C8412a.this.f20807a.isDrawerOpen(8388613)) {
                C8412a.this.f20807a.closeDrawer(8388613);
                C8412a.this.dismissAllowingStateLoss();
            }
        }

        @Override // androidx.drawerlayout.widget.DrawerLayout.AbstractC0843c
        public final void onDrawerOpened(View view) {
            String str;
            C8774g.m17073a().mo15045b();
            if (C8412a.this.getUserVisibleHint()) {
                C8412a aVar = C8412a.this;
                if (!C13627m.m24498a(aVar.f20811e)) {
                    str = aVar.f20811e;
                } else {
                    str = "button";
                }
                HashMap hashMap = new HashMap();
                aVar.f20812f = SystemClock.elapsedRealtime();
                hashMap.put("request_page", C7411d.m15284a().mo13614e());
                C6501b.C6502a.m13948a("livesdk_more_anchor_show").mo12652a((Map<String, String>) hashMap).mo12656c(str).mo12643a(aVar.f27010p).mo12655b();
            }
        }
    };

    static {
        Covode.recordClassIndex(9257);
    }

    @Override // com.bytedance.android.livesdk.AbstractC11293v
    /* renamed from: b */
    public final AbstractC11293v.C11295b mo8355b() {
        AbstractC11293v.C11295b bVar = new AbstractC11293v.C11295b(R.layout.xa);
        bVar.f27014a = 0;
        bVar.f27015b = R.style.zm;
        return bVar;
    }

    @Override // com.bytedance.android.livesdk.AbstractC11293v
    /* renamed from: i */
    public final boolean mo10398i() {
        DrawerLayout drawerLayout = this.f20807a;
        if (drawerLayout == null || !C0792v.m2791y(drawerLayout) || !this.f20807a.isDrawerOpen(8388613)) {
            return false;
        }
        this.f20807a.closeDrawer(8388613);
        return true;
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC0944d, com.bytedance.android.livesdk.AbstractC11293v, androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        Window window = getDialog().getWindow();
        if (window != null) {
            if (Build.VERSION.SDK_INT >= 21) {
                window.addFlags(Integer.MIN_VALUE);
                window.setNavigationBarColor(-16777216);
                window.setLayout(-1, -1);
            }
            if (getActivity() != null && C3931d.m9571a(getActivity())) {
                window.clearFlags(1024);
            }
        }
    }

    /* renamed from: d */
    public final void mo9929d() {
        String str;
        if (!C13627m.m24498a(this.f20811e)) {
            str = this.f20811e;
        } else {
            str = "button";
        }
        HashMap hashMap = new HashMap();
        hashMap.put("duration", String.valueOf(SystemClock.elapsedRealtime() - this.f20812f));
        hashMap.put("request_page", C7411d.m15284a().mo13614e());
        if (!C13627m.m24498a(C7411d.m15284a().mo13614e())) {
            hashMap.put("enter_live_method", C7411d.m15284a().mo13614e());
        }
        C6501b.C6502a.m13948a("livesdk_more_anchor_duration").mo12652a((Map<String, String>) hashMap).mo12656c(str).mo12643a(this.f27010p).mo12655b();
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC0944d, com.bytedance.android.livesdk.AbstractC11293v
    public final void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        this.f20814h.mo142944a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ boolean mo14729a(int i, KeyEvent keyEvent) {
        boolean z;
        if (4 == i) {
            if (keyEvent.getAction() == 0) {
                this.f20815i = true;
                return false;
            }
        } else if (4 != i) {
            return false;
        }
        if (1 != keyEvent.getAction()) {
            return false;
        }
        if (this.f20815i) {
            z = mo10398i();
        } else {
            z = false;
        }
        this.f20815i = false;
        return z;
    }

    @Override // com.bytedance.android.livesdk.AbstractC11293v, androidx.fragment.app.Fragment
    public final void onViewCreated(final View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f20814h.mo142945a(C6779a.m14563a().mo13052a(C4327c.class).mo143289d(new C8416b(this)));
        DrawerLayout drawerLayout = (DrawerLayout) view.findViewById(R.id.ap0);
        this.f20807a = drawerLayout;
        drawerLayout.addDrawerListener(this.f20816j);
        if (C13617h.m24466b(this.f20813g)) {
            for (DrawerLayout.AbstractC0843c cVar : this.f20813g) {
                this.f20807a.addDrawerListener(cVar);
            }
        }
        ViewGroup viewGroup = (ViewGroup) view.findViewById(R.id.cyw);
        int a = (int) (((float) C13628n.m24504a(getContext())) - C13628n.m24520b(getContext(), 50.0f));
        if (a > 0) {
            ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
            layoutParams.width = a;
            viewGroup.setLayoutParams(layoutParams);
            this.f20807a.post(new Runnable() {
                /* class com.bytedance.android.livesdk.drawerfeed.C8412a.RunnableC84131 */

                static {
                    Covode.recordClassIndex(9258);
                }

                public final void run() {
                    if (C8412a.this.isVisible()) {
                        if (C8412a.this.f20807a != null) {
                            C8412a.this.f20807a.openDrawer(8388613);
                        }
                        if (C8412a.this.f20808b == null) {
                            C8412a.this.f20809c = (LiveLoadingView) view.findViewById(R.id.an1);
                            C8412a.this.f20809c.setVisibility(0);
                            C8412a.this.f20808b = ((AbstractC2702b) C6193a.m13435a(AbstractC2702b.class)).createDrawerFeedFragment(new AbstractC11761b() {
                                /* class com.bytedance.android.livesdk.drawerfeed.C8412a.RunnableC84131.C84141 */

                                static {
                                    Covode.recordClassIndex(9259);
                                }

                                @Override // com.bytedance.android.livesdkapi.p691g.AbstractC11761b
                                /* renamed from: b */
                                public final void mo14732b() {
                                    C8412a.this.mo9929d();
                                    C8412a.this.dismiss();
                                }

                                @Override // com.bytedance.android.livesdkapi.p691g.AbstractC11761b
                                /* renamed from: c */
                                public final void mo14733c() {
                                    C8412a aVar = C8412a.this;
                                    if (aVar.f20809c != null) {
                                        aVar.f20809c.setVisibility(8);
                                    }
                                }

                                @Override // com.bytedance.android.livesdkapi.p691g.AbstractC11761b
                                /* renamed from: a */
                                public final void mo14731a() {
                                    C8412a aVar = C8412a.this;
                                    if (aVar.f20807a != null && C0792v.m2791y(aVar.f20807a)) {
                                        aVar.f20807a.requestDisallowInterceptTouchEvent(true);
                                    }
                                }
                            });
                            if (C8412a.this.f20808b != null) {
                                C8412a.this.f20808b.setArguments(C8412a.this.f20810d);
                            }
                        }
                        if (C8412a.this.f20808b != null && !C8412a.this.f20808b.isAdded()) {
                            AbstractC0976n a = C8412a.this.getChildFragmentManager().mo3552a();
                            a.mo3453a(R.id.cyv, C8412a.this.f20808b);
                            a.mo3473c();
                        }
                    }
                }
            });
            getDialog().setOnKeyListener(new DialogInterface$OnKeyListenerC8417c(this));
        }
    }

    /* renamed from: a */
    public static C8412a m16618a(List<DrawerLayout.AbstractC0843c> list, Bundle bundle, String str) {
        C8412a aVar = new C8412a();
        aVar.f20813g = list;
        aVar.f20810d = bundle;
        aVar.f20811e = str;
        return aVar;
    }
}
