package com.p2082ss.android.ugc.aweme.homepage.p3055ui.view.tab.bottom;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.core.content.C0643b;
import androidx.fragment.app.ActivityC0945e;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.hox.AbstractC15501d;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.p2082ss.android.agilelogger.ALog;
import com.p2082ss.android.ugc.aweme.AbstractC35329by;
import com.p2082ss.android.ugc.aweme.adaptation.C33403c;
import com.p2082ss.android.ugc.aweme.base.utils.C34723i;
import com.p2082ss.android.ugc.aweme.base.utils.C34729o;
import com.p2082ss.android.ugc.aweme.homepage.api.interaction.ScrollSwitchStateManager;
import com.p2082ss.android.ugc.aweme.homepage.msadapt.MSAdaptionService;
import com.p2082ss.android.ugc.aweme.homepage.p3055ui.view.tab.C53311a;
import com.p2082ss.android.ugc.aweme.homepage.p3055ui.view.tab.HomeTabViewModel;
import com.p2082ss.android.ugc.aweme.inbox.p3267b.C56318b;
import com.p2082ss.android.ugc.aweme.logger.C58945a;
import com.p2082ss.android.ugc.aweme.main.TabAlphaController;
import com.p2082ss.android.ugc.aweme.main.TabChangeManager;
import com.p2082ss.android.ugc.aweme.notice.api.p3510b.C61545a;
import com.p2082ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p2082ss.android.ugc.aweme.p2728dc.View$OnClickListenerC40952c;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81915c;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.homepage.ui.view.tab.bottom.MainBottomTabView */
public final class MainBottomTabView extends LinearLayout {

    /* renamed from: a */
    public final HashMap<String, AbstractC35329by> f122383a;

    /* renamed from: b */
    private boolean f122384b;

    static {
        Covode.recordClassIndex(62873);
    }

    public MainBottomTabView(Context context) {
        this(context, (AttributeSet) null, 6);
    }

    public MainBottomTabView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    public final HomeTabViewModel get() {
        Context context = getContext();
        Objects.requireNonNull(context, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        return HomeTabViewModel.C53309a.m98315a((ActivityC0945e) context);
    }

    private final int getScreenWidth() {
        int d = C34723i.m70931d(getContext());
        if (MSAdaptionService.m97895c().mo89377c(getContext())) {
            return C34723i.m70930c(getContext());
        }
        return d;
    }

    /* renamed from: b */
    public final void mo89744b() {
        for (String str : this.f122383a.keySet()) {
            AbstractC53316a aVar = (AbstractC53316a) get().mo89739b(str);
            if (aVar != null) {
                aVar.mo89770p();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.homepage.ui.view.tab.bottom.MainBottomTabView$c */
    public static final class RunnableC53315c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ MainBottomTabView f122389a;

        /* renamed from: b */
        final /* synthetic */ String f122390b;

        /* renamed from: c */
        final /* synthetic */ String f122391c;

        /* renamed from: d */
        final /* synthetic */ boolean f122392d;

        static {
            Covode.recordClassIndex(62876);
        }

        public RunnableC53315c(MainBottomTabView mainBottomTabView, String str, String str2, boolean z) {
            this.f122389a = mainBottomTabView;
            this.f122390b = str;
            this.f122391c = str2;
            this.f122392d = z;
        }

        public final void run() {
            AbstractC53316a aVar;
            MainBottomTabView mainBottomTabView = this.f122389a;
            String str = this.f122390b;
            String str2 = this.f122391c;
            if (str2 == null) {
                str2 = "HOME";
            }
            if (!(TextUtils.equals(str, str2) || TextUtils.equals(str, "PUBLISH"))) {
                AbstractC53316a aVar2 = (AbstractC53316a) mainBottomTabView.get().mo89739b(str);
                if (aVar2 != null) {
                    aVar2.mo89755d();
                }
                boolean z = !TextUtils.equals(str, "HOME");
                for (String str3 : mainBottomTabView.f122383a.keySet()) {
                    if (!(mainBottomTabView.f122383a.get(str3) == null || (aVar = (AbstractC53316a) mainBottomTabView.get().mo89739b(str3)) == null)) {
                        aVar.setActivated(z);
                    }
                }
                AbstractC53316a aVar3 = (AbstractC53316a) mainBottomTabView.get().mo89739b(str2);
                if (aVar3 != null) {
                    aVar3.mo89750a();
                }
                mainBottomTabView.mo89743a(str);
            }
        }
    }

    /* renamed from: a */
    public final void mo89741a() {
        String str;
        int i;
        if (getChildCount() > 0) {
            removeAllViews();
        }
        this.f122383a.clear();
        HomeTabViewModel homeTabViewModel = get();
        homeTabViewModel.f122375a.put("HOME", null);
        homeTabViewModel.f122375a.put("DISCOVER", null);
        homeTabViewModel.f122375a.put("PUBLISH", null);
        homeTabViewModel.f122375a.put("NOTIFICATION", null);
        homeTabViewModel.f122375a.put("USER", null);
        int screenWidth = getScreenWidth();
        Context context = getContext();
        Objects.requireNonNull(context, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        ActivityC0945e eVar = (ActivityC0945e) context;
        TabChangeManager a = TabChangeManager.C59002a.m108439a(eVar);
        List<AbstractC35329by> a2 = get().mo89736a();
        Context context2 = getContext();
        Objects.requireNonNull(context2, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        Intent intent = ((ActivityC0945e) context2).getIntent();
        if (intent == null || (str = m98321a(intent, "com.ss.android.ugc.aweme.intent.extra.EXTRA_AWEME_PUSH_TAB")) == null) {
            str = "";
        }
        C89219l.m154716b(str, "");
        if (!C89219l.m154714a((Object) str, (Object) "")) {
            int size = a2.size();
            i = 0;
            while (true) {
                if (i >= size) {
                    break;
                }
                AbstractC35329by byVar = a2.get(i);
                if ((byVar instanceof AbstractC15501d) && C89219l.m154714a((Object) str, (Object) byVar.mo62209d())) {
                    AbstractC15501d dVar = (AbstractC15501d) byVar;
                    if (dVar.mo25234f() != null) {
                        a.mo96532a(dVar.mo25234f(), byVar.mo62209d(), dVar.mo25235g());
                        break;
                    }
                }
                i++;
            }
        }
        i = -1;
        int size2 = a2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            AbstractC35329by byVar2 = a2.get(i2);
            if ((byVar2 instanceof AbstractC15501d) && i != i2) {
                AbstractC15501d dVar2 = (AbstractC15501d) byVar2;
                if (dVar2.mo25234f() != null) {
                    a.mo96532a(dVar2.mo25234f(), byVar2.mo62209d(), dVar2.mo25235g());
                }
            }
            View a3 = byVar2.mo62208a(C53311a.f122381a);
            if (a3 == null) {
                C89219l.m154715b();
            }
            this.f122383a.put(byVar2.mo62209d(), byVar2);
            get().mo89738a(byVar2.mo62209d(), byVar2);
            get().mo89737a(byVar2, a3);
            ScrollSwitchStateManager a4 = ScrollSwitchStateManager.C52950a.m97811a(eVar);
            if (TextUtils.equals("lark_inhouse", C17867d.f42595s)) {
                a3.setOnLongClickListener(new View$OnLongClickListenerC53313a(a4, byVar2));
            }
            a3.setOnClickListener(new View$OnClickListenerC53314b(byVar2, a4));
            if (!C89219l.m154714a((Object) byVar2.mo62209d(), (Object) "PUBLISH")) {
                Context context3 = getContext();
                C89219l.m154716b(context3, "");
                a3.setBackground(context3.getResources().getDrawable(R.drawable.a_j));
            }
            int i3 = (int) (((float) screenWidth) / 5.0f);
            ALog.m59866e("zzq_home_tab", "screenWidth: " + screenWidth + ", singleWidth: " + i3);
            a3.setLayoutParams(new LinearLayout.LayoutParams(i3, -1));
            addView(a3);
        }
        Bundle bundle = new Bundle();
        bundle.putString("tab", "UNLOGIN_NOTIFICATION");
        a.mo96532a(View$OnClickListenerC40952c.class, "UNLOGIN_NOTIFICATION", bundle);
        Bundle bundle2 = new Bundle();
        bundle2.putString("tab", "UNLOGIN_PROFILE");
        a.mo96532a(View$OnClickListenerC40952c.class, "UNLOGIN_PROFILE", bundle2);
    }

    /* renamed from: com.ss.android.ugc.aweme.homepage.ui.view.tab.bottom.MainBottomTabView$a */
    static final class View$OnLongClickListenerC53313a implements View.OnLongClickListener {

        /* renamed from: a */
        final /* synthetic */ ScrollSwitchStateManager f122385a;

        /* renamed from: b */
        final /* synthetic */ AbstractC35329by f122386b;

        static {
            Covode.recordClassIndex(62874);
        }

        View$OnLongClickListenerC53313a(ScrollSwitchStateManager scrollSwitchStateManager, AbstractC35329by byVar) {
            this.f122385a = scrollSwitchStateManager;
            this.f122386b = byVar;
        }

        public final boolean onLongClick(View view) {
            ScrollSwitchStateManager scrollSwitchStateManager = this.f122385a;
            String d = this.f122386b.mo62209d();
            C89219l.m154721d(d, "");
            scrollSwitchStateManager.f121766h.setValue(d);
            return true;
        }
    }

    public final void setAlpha(float f) {
        TabAlphaController a = TabAlphaController.m108430a();
        C89219l.m154716b(a, "");
        if (!a.f134306b) {
            super.setAlpha(f);
        }
    }

    /* renamed from: a */
    public final void mo89743a(String str) {
        int i;
        boolean z = !TextUtils.equals(str, "HOME");
        if (!this.f122384b || !TextUtils.equals(str, "HOME")) {
            this.f122384b = false;
            if (!z) {
                setBackgroundColor(C0643b.m2378c(getContext(), R.color.c9));
            } else if (C33403c.C33406b.f79409a.f79388q) {
                setBackgroundColor(C0643b.m2378c(getContext(), R.color.l));
                mo89744b();
                return;
            } else {
                setBackgroundColor(C0643b.m2378c(getContext(), R.color.l));
            }
            mo89744b();
            AbstractC53316a aVar = (AbstractC53316a) get().mo89739b("HOME");
            if (aVar != null && aVar.getRefreshIcon() != null) {
                ImageView refreshIcon = aVar.getRefreshIcon();
                Resources resources = aVar.getResources();
                if ("HOME".equals(str)) {
                    i = R.color.a9;
                } else {
                    i = R.color.bx;
                }
                refreshIcon.setColorFilter(resources.getColor(i));
                return;
            }
            return;
        }
        this.f122384b = false;
    }

    /* renamed from: com.ss.android.ugc.aweme.homepage.ui.view.tab.bottom.MainBottomTabView$b */
    static final class View$OnClickListenerC53314b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ AbstractC35329by f122387a;

        /* renamed from: b */
        final /* synthetic */ ScrollSwitchStateManager f122388b;

        static {
            Covode.recordClassIndex(62875);
        }

        View$OnClickListenerC53314b(AbstractC35329by byVar, ScrollSwitchStateManager scrollSwitchStateManager) {
            this.f122387a = byVar;
            this.f122388b = scrollSwitchStateManager;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            boolean z = false;
            Boolean bool = false;
            C58945a.C58947b.f134185a.f134176c = false;
            C58945a.C58947b.f134185a.f134180g = false;
            AVExternalServiceImpl.m113114a().shoutOutsService().setInMainTab(C89219l.m154714a((Object) this.f122387a.mo62209d(), (Object) "HOME"));
            this.f122388b.mo89358e(this.f122387a.mo62209d());
            if (C56318b.m102311b() && C89219l.m154714a((Object) this.f122387a.mo62209d(), (Object) "NOTIFICATION")) {
                if (view != null) {
                    Long l = C34729o.f82017a.get(view);
                    long nanoTime = System.nanoTime() / 1000000;
                    if (l == null) {
                        C34729o.f82017a.put(view, Long.valueOf(nanoTime));
                    } else {
                        if (nanoTime - l.longValue() <= 400) {
                            z = true;
                        } else {
                            C34729o.f82017a.put(view, Long.valueOf(nanoTime));
                        }
                        bool = Boolean.valueOf(z);
                    }
                }
                C89219l.m154716b(bool, "");
                if (bool.booleanValue()) {
                    AbstractC81915c.m141874a(new C61545a());
                }
            }
        }
    }

    /* renamed from: a */
    private static String m98321a(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: a */
    public final void mo89742a(int i, int i2) {
        AbstractC53316a aVar;
        for (Map.Entry<String, AbstractC35329by> entry : this.f122383a.entrySet()) {
            AbstractC35329by value = entry.getValue();
            if (!TextUtils.equals(entry.getKey(), "PUBLISH") && (aVar = (AbstractC53316a) get().mo89734a(value)) != null) {
                aVar.setPadding(0, i, 0, i2);
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private MainBottomTabView(Context context, AttributeSet attributeSet, byte b) {
        super(context, attributeSet, 0);
        C89219l.m154721d(context, "");
        MethodCollector.m26663i(3547);
        setOrientation(0);
        this.f122383a = new HashMap<>();
        this.f122384b = true;
        MethodCollector.m26664o(3547);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    private /* synthetic */ MainBottomTabView(Context context, AttributeSet attributeSet, int i) {
        this(context, (i & 2) != 0 ? null : attributeSet, (byte) 0);
    }
}
