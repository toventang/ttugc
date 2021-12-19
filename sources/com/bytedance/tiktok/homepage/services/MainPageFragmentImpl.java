package com.bytedance.tiktok.homepage.services;

import android.content.Context;
import android.content.res.Resources;
import android.os.Handler;
import android.view.View;
import androidx.fragment.app.ActivityC0945e;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1203l;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.assem.arch.service.C12801d;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.uikit.p1279a.AbstractC18234b;
import com.bytedance.tiktok.homepage.mainpagefragment.dialog.C22822a;
import com.bytedance.tiktok.homepage.mainpagefragment.dialog.C22825c;
import com.bytedance.tiktok.homepage.mainpagefragment.dialog.FissionPopupWindowHelp;
import com.bytedance.tiktok.homepage.mainpagefragment.notification.C22858c;
import com.bytedance.tux.tooltip.AbstractC23317a;
import com.p2082ss.android.ugc.C81908b;
import com.p2082ss.android.ugc.aweme.feed.C49907s;
import com.p2082ss.android.ugc.aweme.feed.EnumC48310af;
import com.p2082ss.android.ugc.aweme.homepage.api.data.MainPageDataViewModel;
import com.p2082ss.android.ugc.aweme.homepage.api.interaction.ScrollSwitchStateManager;
import com.p2082ss.android.ugc.aweme.homepage.story.feed.StorySidebarFeedVM;
import com.p2082ss.android.ugc.aweme.homepage.story.sidebar.AbstractC53241c;
import com.p2082ss.android.ugc.aweme.main.IMainPageFragment;
import com.p2082ss.android.ugc.aweme.main.MainActivity;
import com.p2082ss.android.ugc.aweme.main.MainPageFragment;
import com.p2082ss.android.ugc.aweme.main.p3435h.C59101a;
import com.p2082ss.android.ugc.aweme.video.C80749k;
import com.p2082ss.android.ugc.aweme.video.C81079v;
import com.p2082ss.android.ugc.trill.R;
import java.lang.ref.WeakReference;
import java.util.Objects;
import p4600h.p4611f.p4613b.C89204ab;
import p4600h.p4611f.p4613b.C89219l;

public final class MainPageFragmentImpl implements IMainPageFragment {

    /* renamed from: a */
    private WeakReference<MainPageFragment> f54018a;

    static {
        Covode.recordClassIndex(26774);
    }

    /* renamed from: com.bytedance.tiktok.homepage.services.MainPageFragmentImpl$a */
    static final class RunnableC22872a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ MainPageFragment f54019a;

        static {
            Covode.recordClassIndex(26775);
        }

        RunnableC22872a(MainPageFragment mainPageFragment) {
            this.f54019a = mainPageFragment;
        }

        public final void run() {
            FissionPopupWindowHelp fissionPopupWindowHelp = this.f54019a.f134274u;
            if (fissionPopupWindowHelp != null) {
                fissionPopupWindowHelp.mo37125b();
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.main.IMainPageFragment
    /* renamed from: b */
    public final boolean mo37210b() {
        MainPageFragment mainPageFragment;
        AbstractC23317a aVar;
        WeakReference<MainPageFragment> weakReference = this.f54018a;
        if (weakReference == null || (mainPageFragment = weakReference.get()) == null || (aVar = mainPageFragment.f134242B) == null || !aVar.isShowing()) {
            return false;
        }
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.main.IMainPageFragment
    /* renamed from: c */
    public final void mo37211c() {
        MainPageFragment mainPageFragment;
        C22822a aVar;
        WeakReference<MainPageFragment> weakReference = this.f54018a;
        if (weakReference != null && (mainPageFragment = weakReference.get()) != null && (aVar = mainPageFragment.f134272s) != null) {
            aVar.mo37142b();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.main.IMainPageFragment
    /* renamed from: e */
    public final String mo37213e() {
        MainPageFragment mainPageFragment;
        MainPageDataViewModel mainPageDataViewModel;
        String str;
        WeakReference<MainPageFragment> weakReference = this.f54018a;
        if (weakReference == null || (mainPageFragment = weakReference.get()) == null || (mainPageDataViewModel = mainPageFragment.f134265l) == null || (str = mainPageDataViewModel.f121754b) == null) {
            return "";
        }
        return str;
    }

    @Override // com.p2082ss.android.ugc.aweme.main.IMainPageFragment
    /* renamed from: f */
    public final String mo37214f() {
        MainPageFragment mainPageFragment;
        String g;
        WeakReference<MainPageFragment> weakReference = this.f54018a;
        if (weakReference == null || (mainPageFragment = weakReference.get()) == null || (g = mainPageFragment.mo93044g()) == null) {
            return "";
        }
        return g;
    }

    @Override // com.p2082ss.android.ugc.aweme.main.IMainPageFragment
    /* renamed from: h */
    public final void mo37216h() {
        MainPageFragment mainPageFragment;
        C22858c cVar;
        WeakReference<MainPageFragment> weakReference = this.f54018a;
        if (weakReference != null && (mainPageFragment = weakReference.get()) != null && (cVar = mainPageFragment.f134241A) != null) {
            cVar.mo37171a(false);
        }
    }

    /* renamed from: j */
    public static IMainPageFragment m43110j() {
        MethodCollector.m26663i(6357);
        Object a = C81908b.m141854a(IMainPageFragment.class, false);
        if (a != null) {
            IMainPageFragment iMainPageFragment = (IMainPageFragment) a;
            MethodCollector.m26664o(6357);
            return iMainPageFragment;
        }
        if (C81908b.f183399h == null) {
            synchronized (IMainPageFragment.class) {
                try {
                    if (C81908b.f183399h == null) {
                        C81908b.f183399h = new MainPageFragmentImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(6357);
                    throw th;
                }
            }
        }
        MainPageFragmentImpl mainPageFragmentImpl = (MainPageFragmentImpl) C81908b.f183399h;
        MethodCollector.m26664o(6357);
        return mainPageFragmentImpl;
    }

    @Override // com.p2082ss.android.ugc.aweme.main.IMainPageFragment
    /* renamed from: a */
    public final void mo37201a() {
        MainPageFragment mainPageFragment;
        WeakReference<MainPageFragment> weakReference = this.f54018a;
        if (weakReference != null && (mainPageFragment = weakReference.get()) != null) {
            C22825c cVar = mainPageFragment.f134273t;
            if (cVar == null) {
                C89219l.m154715b();
            }
            if (cVar.f53910j) {
                C22825c cVar2 = mainPageFragment.f134273t;
                if (cVar2 == null) {
                    C89219l.m154715b();
                }
                cVar2.mo37147a();
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.main.IMainPageFragment
    /* renamed from: d */
    public final void mo37212d() {
        MainPageFragment mainPageFragment;
        Context context;
        Resources resources;
        View view;
        WeakReference<MainPageFragment> weakReference = this.f54018a;
        if (weakReference != null && (mainPageFragment = weakReference.get()) != null && (context = mainPageFragment.getContext()) != null && (resources = context.getResources()) != null && mainPageFragment != null && (view = mainPageFragment.f134259b) != null) {
            view.setBackgroundColor(resources.getColor(R.color.b2));
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.main.IMainPageFragment
    /* renamed from: g */
    public final void mo37215g() {
        MainPageFragment mainPageFragment;
        C22858c cVar;
        Handler handler;
        WeakReference<MainPageFragment> weakReference = this.f54018a;
        if (weakReference != null && (mainPageFragment = weakReference.get()) != null && (cVar = mainPageFragment.f134241A) != null && cVar.f53985f != null) {
            C22858c cVar2 = mainPageFragment.f134241A;
            if (!(cVar2 == null || (handler = cVar2.f53985f) == null)) {
                handler.removeCallbacks(new RunnableC22872a(mainPageFragment));
            }
            FissionPopupWindowHelp fissionPopupWindowHelp = mainPageFragment.f134274u;
            if (fissionPopupWindowHelp != null) {
                fissionPopupWindowHelp.mo37125b();
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.main.IMainPageFragment
    /* renamed from: i */
    public final boolean mo37217i() {
        MainPageFragment mainPageFragment;
        ActivityC0945e activity;
        AbstractC53241c cVar;
        StorySidebarFeedVM w;
        WeakReference<MainPageFragment> weakReference = this.f54018a;
        if (weakReference == null || (mainPageFragment = weakReference.get()) == null || (activity = mainPageFragment.getActivity()) == null || (cVar = (AbstractC53241c) C12801d.m23019a(activity, C89204ab.m154669a(AbstractC53241c.class))) == null || (w = cVar.mo89690w()) == null) {
            return false;
        }
        return w.f122081k;
    }

    @Override // com.p2082ss.android.ugc.aweme.main.IMainPageFragment
    /* renamed from: a */
    public final void mo37203a(Fragment fragment) {
        this.f54018a = new WeakReference<>(fragment);
    }

    @Override // com.p2082ss.android.ugc.aweme.main.IMainPageFragment
    /* renamed from: a */
    public final void mo37204a(ActivityC0945e eVar) {
        C89219l.m154721d(eVar, "");
        C59101a.m108579b(eVar);
    }

    @Override // com.p2082ss.android.ugc.aweme.main.IMainPageFragment
    /* renamed from: b */
    public final void mo37209b(ActivityC0945e eVar) {
        C89219l.m154721d(eVar, "");
        C59101a.m108577a(eVar);
    }

    @Override // com.p2082ss.android.ugc.aweme.main.IMainPageFragment
    /* renamed from: a */
    public final void mo37202a(Context context) {
        C89219l.m154721d(context, "");
        if (!(context instanceof MainActivity)) {
            context = null;
        }
        MainActivity mainActivity = (MainActivity) context;
        if (mainActivity != null) {
            mainActivity.refreshSlideSwitchCanScrollRight();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.main.IMainPageFragment
    /* renamed from: a */
    public final void mo37205a(AbstractC1203l lVar) {
        AbstractC1196i lifecycle;
        C89219l.m154721d(lVar, "");
        WeakReference<MainPageFragment> weakReference = this.f54018a;
        MainPageFragment mainPageFragment = null;
        if (weakReference != null) {
            mainPageFragment = weakReference.get();
        }
        if ((mainPageFragment instanceof AbstractC1204m) && mainPageFragment != null && (lifecycle = mainPageFragment.getLifecycle()) != null) {
            lifecycle.mo4012a(lVar);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.main.IMainPageFragment
    /* renamed from: a */
    public final void mo37206a(ScrollSwitchStateManager scrollSwitchStateManager) {
        MainPageFragment mainPageFragment;
        C22858c cVar;
        C89219l.m154721d(scrollSwitchStateManager, "");
        WeakReference<MainPageFragment> weakReference = this.f54018a;
        if (weakReference != null && (mainPageFragment = weakReference.get()) != null && (cVar = mainPageFragment.f134241A) != null) {
            C89219l.m154721d(scrollSwitchStateManager, "");
            if (!C89219l.m154714a((Object) "NOTIFICATION", (Object) cVar.f53983d.f134312d)) {
                cVar.f53983d.mo96533a("NOTIFICATION", false);
                C81079v.m140776O().mo123908B();
                C80749k.m140049a().mo123953b();
                cVar.mo37178h();
                scrollSwitchStateManager.mo89345a(false);
                AbstractC18234b bVar = cVar.f53981b;
                Objects.requireNonNull(bVar, "null cannot be cast to non-null type com.ss.android.ugc.aweme.main.MainPageFragment");
                ((MainPageFragment) bVar).mo96507b(true);
                C49907s.m93686a(EnumC48310af.NOTICE);
            }
            cVar.f53982c.mo37147a();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.main.IMainPageFragment
    /* renamed from: a */
    public final void mo37207a(String str) {
        MainPageFragment mainPageFragment;
        ActivityC0945e activity;
        AbstractC53241c cVar;
        StorySidebarFeedVM w;
        C89219l.m154721d(str, "");
        WeakReference<MainPageFragment> weakReference = this.f54018a;
        if (weakReference != null && (mainPageFragment = weakReference.get()) != null && (activity = mainPageFragment.getActivity()) != null && (cVar = (AbstractC53241c) C12801d.m23019a(activity, C89204ab.m154669a(AbstractC53241c.class))) != null && (w = cVar.mo89690w()) != null) {
            w.mo89615a("through SPI: ".concat(String.valueOf(str)));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x008b, code lost:
        if (r1.f109359b == false) goto L_0x01a0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0108, code lost:
        if ((r8 - r1.longValue()) <= java.util.concurrent.TimeUnit.DAYS.toMillis(30)) goto L_0x010a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x019c, code lost:
        if (com.p2082ss.android.ugc.aweme.friends.service.C51648a.f118980a.mo87293a("personal_homepage") != 0) goto L_0x008d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x01a0, code lost:
        r10 = false;
     */
    @Override // com.p2082ss.android.ugc.aweme.main.IMainPageFragment
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo37208a(java.lang.String r12, java.lang.String r13) {
        /*
        // Method dump skipped, instructions count: 419
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.tiktok.homepage.services.MainPageFragmentImpl.mo37208a(java.lang.String, java.lang.String):void");
    }
}
