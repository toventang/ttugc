package com.p2082ss.android.ugc.aweme.homepage;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.Window;
import androidx.core.content.C0643b;
import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.AbstractC1214u;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.hox.Hox;
import com.p084a.p088b.C1870c;
import com.p2082ss.android.p2085a.p2086a.p2087a.C29339a;
import com.p2082ss.android.ugc.aweme.C34792be;
import com.p2082ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.p2082ss.android.ugc.aweme.base.p2379ui.AbstractC34691k;
import com.p2082ss.android.ugc.aweme.base.p2379ui.C34685e;
import com.p2082ss.android.ugc.aweme.base.p2379ui.C34690j;
import com.p2082ss.android.ugc.aweme.base.p2379ui.C34700p;
import com.p2082ss.android.ugc.aweme.base.p2379ui.ScrollableViewPager;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.p2949i.C49679g;
import com.p2082ss.android.ugc.aweme.homepage.api.data.HomePageDataViewModel;
import com.p2082ss.android.ugc.aweme.homepage.api.interaction.AbstractC52954b;
import com.p2082ss.android.ugc.aweme.homepage.api.interaction.EnumC52955c;
import com.p2082ss.android.ugc.aweme.homepage.api.interaction.ScrollSwitchStateManager;
import com.p2082ss.android.ugc.aweme.homepage.api.p3051ui.HomePageUIFrameService;
import com.p2082ss.android.ugc.aweme.main.uiApiImpl.HomePageUIFrameServiceImpl;
import com.p2082ss.android.ugc.aweme.profile.p3576ui.AbstractC64005b;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81915c;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.homepage.a */
public final class C52932a {

    /* renamed from: a */
    public HomePageDataViewModel f121716a;

    /* renamed from: b */
    public DataCenter f121717b;

    /* renamed from: c */
    public ScrollSwitchStateManager f121718c;

    /* renamed from: d */
    public ScrollableViewPager f121719d;

    /* renamed from: e */
    public C34700p f121720e;

    /* renamed from: f */
    public boolean f121721f;

    /* renamed from: g */
    public boolean f121722g;

    /* renamed from: h */
    private C52968c f121723h = new C52968c();

    static {
        Covode.recordClassIndex(62454);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.homepage.a$g */
    public static final class C52939g implements AbstractC34691k {

        /* renamed from: a */
        final /* synthetic */ ActivityC0945e f121731a;

        static {
            Covode.recordClassIndex(62461);
        }

        C52939g(ActivityC0945e eVar) {
            this.f121731a = eVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.base.p2379ui.AbstractC34691k
        /* renamed from: a */
        public final void mo61352a() {
            ScrollSwitchStateManager.C52950a.m97811a(this.f121731a).mo89340a(EnumC52955c.INSTANCE);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.homepage.a$a */
    public static final class C52933a implements AbstractC52954b {

        /* renamed from: a */
        final /* synthetic */ C52932a f121724a;

        static {
            Covode.recordClassIndex(62455);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:3:0x000e, code lost:
            if (r0 == null) goto L_0x0010;
         */
        @Override // com.p2082ss.android.ugc.aweme.homepage.api.interaction.AbstractC52954b
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final int mo70679a() {
            /*
                r1 = this;
                com.ss.android.ugc.aweme.homepage.a r0 = r1.f121724a
                com.ss.android.ugc.aweme.base.ui.ScrollableViewPager r0 = r0.f121719d
                if (r0 == 0) goto L_0x0018
                int r0 = r0.getCurrentItem()
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                if (r0 != 0) goto L_0x0013
            L_0x0010:
                p4600h.p4611f.p4613b.C89219l.m154715b()
            L_0x0013:
                int r0 = r0.intValue()
                return r0
            L_0x0018:
                r0 = 0
                goto L_0x0010
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.homepage.C52932a.C52933a.mo70679a():int");
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C52933a(C52932a aVar) {
            this.f121724a = aVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.homepage.api.interaction.AbstractC52954b
        /* renamed from: a */
        public final void mo70680a(int i) {
            ScrollableViewPager scrollableViewPager = this.f121724a.f121719d;
            if (scrollableViewPager != null) {
                scrollableViewPager.setCurrentItem(i);
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.homepage.api.interaction.AbstractC52954b
        /* renamed from: a */
        public final void mo70681a(int i, boolean z) {
            ScrollableViewPager scrollableViewPager = this.f121724a.f121719d;
            if (scrollableViewPager != null) {
                scrollableViewPager.mo61355a(i, z);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.homepage.a$d */
    public static final class C52936d implements C34700p.AbstractC34703b {

        /* renamed from: a */
        final /* synthetic */ ActivityC0945e f121727a;

        static {
            Covode.recordClassIndex(62458);
        }

        C52936d(ActivityC0945e eVar) {
            this.f121727a = eVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.base.p2379ui.C34700p.AbstractC34703b
        /* renamed from: a */
        public final void mo61373a(HashMap<Integer, C34685e> hashMap) {
            C89219l.m154721d(hashMap, "");
            ScrollSwitchStateManager.C52950a.m97811a(this.f121727a).mo89343a(hashMap);
        }

        @Override // com.p2082ss.android.ugc.aweme.base.p2379ui.C34700p.AbstractC34703b
        /* renamed from: a */
        public final void mo61374a(List<C34690j> list) {
            C89219l.m154721d(list, "");
            ScrollSwitchStateManager.C52950a.m97811a(this.f121727a).mo89344a(list);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.homepage.a$c */
    public static final class C52935c<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ C52932a f121726a;

        static {
            Covode.recordClassIndex(62457);
        }

        C52935c(C52932a aVar) {
            this.f121726a = aVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* bridge */ /* synthetic */ void onChanged(Object obj) {
            ScrollableViewPager.AbstractC34662a aVar = (ScrollableViewPager.AbstractC34662a) obj;
            ScrollableViewPager scrollableViewPager = this.f121726a.f121719d;
            if (scrollableViewPager != null) {
                scrollableViewPager.f81890f = aVar;
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.homepage.a$h */
    public static final class C52940h extends LayoutInflater {

        /* renamed from: a */
        final /* synthetic */ ActivityC0945e f121732a;

        static {
            Covode.recordClassIndex(62462);
        }

        public final LayoutInflater cloneInContext(Context context) {
            LayoutInflater from = LayoutInflater.from(context);
            C89219l.m154716b(from, "");
            return from;
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C52940h(ActivityC0945e eVar, Context context) {
            super(context);
            this.f121732a = eVar;
        }

        @Override // android.view.LayoutInflater
        public final View inflate(int i, ViewGroup viewGroup, boolean z) {
            View a = C1870c.m6046a(this.f121732a, i, viewGroup, z);
            C89219l.m154716b(a, "");
            return a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.homepage.a$b */
    public static final class C52934b<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ C52932a f121725a;

        static {
            Covode.recordClassIndex(62456);
        }

        C52934b(C52932a aVar) {
            this.f121725a = aVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            Boolean bool = (Boolean) obj;
            ScrollableViewPager scrollableViewPager = this.f121725a.f121719d;
            if (scrollableViewPager != null) {
                if (bool == null) {
                    C89219l.m154715b();
                }
                scrollableViewPager.f81886b = bool.booleanValue();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.homepage.a$f */
    public static final class C52938f implements ViewPager.AbstractC1579e {

        /* renamed from: a */
        final /* synthetic */ C52932a f121729a;

        /* renamed from: b */
        final /* synthetic */ ActivityC0945e f121730b;

        static {
            Covode.recordClassIndex(62460);
        }

        @Override // androidx.viewpager.widget.ViewPager.AbstractC1579e
        public final void onPageScrollStateChanged(int i) {
            ScrollSwitchStateManager.C52950a.m97811a(this.f121730b).mo89355d(i);
            if (i == 0) {
                this.f121729a.f121721f = false;
                this.f121729a.f121722g = false;
            }
        }

        @Override // androidx.viewpager.widget.ViewPager.AbstractC1579e
        public final void onPageSelected(int i) {
            ScrollSwitchStateManager.C52950a.m97811a(this.f121730b).mo89352c(i);
            Bundle bundle = new Bundle();
            bundle.putString(C34792be.f82123b, C34792be.f82124c);
            Hox.C15490a.m28529a(this.f121730b).mo25207a(C34792be.f82124c, i, bundle);
        }

        C52938f(C52932a aVar, ActivityC0945e eVar) {
            this.f121729a = aVar;
            this.f121730b = eVar;
        }

        @Override // androidx.viewpager.widget.ViewPager.AbstractC1579e
        public final void onPageScrolled(int i, float f, int i2) {
            if (!this.f121729a.f121722g) {
                ScrollSwitchStateManager.C52950a.m97811a(this.f121730b).mo89336a(i, f, i2);
                Window window = this.f121730b.getWindow();
                C89219l.m154716b(window, "");
                window.getDecorView().setBackgroundColor(C0643b.m2378c(this.f121730b, R.color.l));
                this.f121729a.f121722g = true;
            }
            ScrollSwitchStateManager scrollSwitchStateManager = this.f121729a.f121718c;
            if (scrollSwitchStateManager != null && i == scrollSwitchStateManager.mo89351c("page_feed") && !this.f121729a.f121721f) {
                this.f121729a.f121721f = true;
                AbstractC81915c.m141874a(new C49679g());
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: com.ss.android.ugc.aweme.base.ui.p$a */
    /* JADX DEBUG: Multi-variable search result rejected for r1v2, resolved type: com.ss.android.ugc.aweme.base.ui.p$a */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    private static C34700p.C34701a m97763a(ActivityC0945e eVar) {
        C89219l.m154721d(eVar, "");
        C34700p.C34701a aVar = new C34700p.C34701a();
        Hox a = Hox.C15490a.m28529a(eVar);
        Class<?> a2 = a.mo25205a("page_feed");
        Class<?> a3 = a.mo25205a("page_profile");
        if (a2 == null || a3 == null) {
            try {
                HomePageUIFrameService e = HomePageUIFrameServiceImpl.m108627e();
                a2 = e.mo89386b("page_feed");
                a3 = e.mo89386b("page_profile");
            } catch (Throwable unused) {
            }
            if (a2 == null) {
                C89219l.m154715b();
            }
        }
        C34700p.C34701a a4 = aVar.mo61370a(a2, "page_feed", null);
        Objects.requireNonNull(a3, "null cannot be cast to non-null type java.lang.Class<out com.ss.android.ugc.aweme.base.ui.CommonPageFragment>");
        a4.mo61369a(a3, "page_profile", 1, null);
        return aVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.homepage.a$i */
    public static final class C52941i<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ C52932a f121733a;

        static {
            Covode.recordClassIndex(62463);
        }

        C52941i(C52932a aVar) {
            this.f121733a = aVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            String str;
            String str2;
            Integer num = (Integer) obj;
            ScrollSwitchStateManager scrollSwitchStateManager = this.f121733a.f121718c;
            if (scrollSwitchStateManager == null) {
                C89219l.m154715b();
            }
            if (num == null) {
                C89219l.m154715b();
            }
            if (C89219l.m154714a((Object) "page_profile", (Object) scrollSwitchStateManager.mo89335a(num.intValue()))) {
                HomePageDataViewModel homePageDataViewModel = this.f121733a.f121716a;
                Aweme aweme = null;
                if (homePageDataViewModel != null) {
                    str = homePageDataViewModel.f121740f;
                } else {
                    str = null;
                }
                HomePageDataViewModel homePageDataViewModel2 = this.f121733a.f121716a;
                if (homePageDataViewModel2 == null || homePageDataViewModel2.f121741g == null) {
                    str2 = "";
                } else {
                    HomePageDataViewModel homePageDataViewModel3 = this.f121733a.f121716a;
                    if (homePageDataViewModel3 == null || (aweme = homePageDataViewModel3.f121741g) == null) {
                        C89219l.m154715b();
                    }
                    str2 = aweme.getAid();
                }
                AbstractC64005b.C64007b.m115770a(str, str2);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.homepage.a$e */
    public static final class View$OnTouchListenerC52937e implements View.OnTouchListener {

        /* renamed from: a */
        public static final View$OnTouchListenerC52937e f121728a = new View$OnTouchListenerC52937e();

        static {
            Covode.recordClassIndex(62459);
        }

        View$OnTouchListenerC52937e() {
        }

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            view.requestFocusFromTouch();
            return false;
        }
    }

    /* renamed from: a */
    public static String m97764a(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: a */
    private static void m97765a(ActivityC0945e eVar, int i) {
        MethodCollector.m26663i(2998);
        ViewStub viewStub = (ViewStub) eVar.findViewById(i);
        C89219l.m154716b(viewStub, "");
        viewStub.setLayoutInflater(new C52940h(eVar, eVar));
        viewStub.inflate();
        MethodCollector.m26664o(2998);
    }

    /* renamed from: a */
    public final void mo89321a(ActivityC0945e eVar, Hox hox) {
        C89219l.m154721d(eVar, "");
        C89219l.m154721d(hox, "");
        C52968c cVar = this.f121723h;
        if (!C52968c.f121801a) {
            C29339a.m58752a(
            /*  JADX ERROR: Method code generation error
                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0013: INVOKE  
                  (wrap: com.ss.android.ugc.aweme.homepage.c$1 : 0x0010: CONSTRUCTOR  (r0v46 com.ss.android.ugc.aweme.homepage.c$1) = (r1v0 'cVar' com.ss.android.ugc.aweme.homepage.c) call: com.ss.android.ugc.aweme.homepage.c.1.<init>(com.ss.android.ugc.aweme.homepage.c):void type: CONSTRUCTOR)
                 type: STATIC call: com.ss.android.a.a.a.a.a(java.lang.Runnable):void in method: com.ss.android.ugc.aweme.homepage.a.a(androidx.fragment.app.e, com.bytedance.hox.Hox):void, file: classes7.dex
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:217)
                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:110)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:56)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:99)
                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:143)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
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
                Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0010: CONSTRUCTOR  (r0v46 com.ss.android.ugc.aweme.homepage.c$1) = (r1v0 'cVar' com.ss.android.ugc.aweme.homepage.c) call: com.ss.android.ugc.aweme.homepage.c.1.<init>(com.ss.android.ugc.aweme.homepage.c):void type: CONSTRUCTOR in method: com.ss.android.ugc.aweme.homepage.a.a(androidx.fragment.app.e, com.bytedance.hox.Hox):void, file: classes7.dex
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
                	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:806)
                	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:746)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:367)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
                	... 19 more
                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.ss.android.ugc.aweme.homepage.c, state: GENERATED_AND_UNLOADED
                	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
                	... 25 more
                */
            /*
            // Method dump skipped, instructions count: 360
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.homepage.C52932a.mo89321a(androidx.fragment.app.e, com.bytedance.hox.Hox):void");
        }
    }
