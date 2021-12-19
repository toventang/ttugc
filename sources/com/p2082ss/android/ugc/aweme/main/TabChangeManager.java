package com.p2082ss.android.ugc.aweme.main;

import android.os.Bundle;
import android.text.TextUtils;
import android.widget.Space;
import android.widget.TabHost;
import androidx.fragment.app.AbstractC0952i;
import androidx.fragment.app.ActivityC0945e;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.C1175ad;
import androidx.lifecycle.C1181ae;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.uikit.tabhost.FragmentTabHost;
import com.p2082ss.android.p2085a.p2086a.p2087a.C29339a;
import com.p2082ss.android.ugc.aweme.base.p2379ui.AbstractC34687g;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.homepage.api.p3051ui.HomePageUIFrameService;
import com.p2082ss.android.ugc.aweme.logger.C58945a;
import com.p2082ss.android.ugc.aweme.main.uiApiImpl.HomePageUIFrameServiceImpl;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import p077b.C1731i;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.main.TabChangeManager */
public final class TabChangeManager extends AbstractC1174ac {

    /* renamed from: h */
    public static final C59002a f134308h = new C59002a((byte) 0);

    /* renamed from: a */
    public FragmentTabHost f134309a;

    /* renamed from: b */
    String f134310b;

    /* renamed from: c */
    public final List<AbstractC34687g> f134311c = new ArrayList();

    /* renamed from: d */
    public String f134312d;

    /* renamed from: e */
    public boolean f134313e;

    /* renamed from: f */
    public AbstractC0952i f134314f;

    /* renamed from: g */
    public AbstractC59004b f134315g;

    /* renamed from: i */
    private int f134316i;

    /* renamed from: com.ss.android.ugc.aweme.main.TabChangeManager$a */
    public static final class C59002a {
        static {
            Covode.recordClassIndex(69344);
        }

        /* renamed from: com.ss.android.ugc.aweme.main.TabChangeManager$a$a */
        public static final class C59003a implements C1175ad.AbstractC1177b {
            static {
                Covode.recordClassIndex(69345);
            }

            C59003a() {
            }

            @Override // androidx.lifecycle.C1175ad.AbstractC1177b
            /* renamed from: a */
            public final <T extends AbstractC1174ac> T mo3261a(Class<T> cls) {
                C89219l.m154721d(cls, "");
                return new TabChangeManager();
            }
        }

        private C59002a() {
        }

        public /* synthetic */ C59002a(byte b) {
            this();
        }

        /* renamed from: a */
        public static TabChangeManager m108439a(ActivityC0945e eVar) {
            if (eVar == null) {
                C89219l.m154715b();
            }
            AbstractC1174ac a = C1181ae.m3881a(eVar, new C59003a()).mo3983a(TabChangeManager.class);
            C89219l.m154716b(a, "");
            return (TabChangeManager) a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.main.TabChangeManager$b */
    public interface AbstractC59004b {
        static {
            Covode.recordClassIndex(69347);
        }

        /* renamed from: a */
        void mo89405a(String str);
    }

    static {
        Covode.recordClassIndex(69343);
    }

    /* renamed from: a */
    public final boolean mo96535a() {
        if (this.f134309a != null) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.main.TabChangeManager$c */
    public static final class CallableC59005c<V> implements Callable {

        /* renamed from: a */
        final /* synthetic */ TabChangeManager f134317a;

        /* renamed from: b */
        final /* synthetic */ Class f134318b;

        /* renamed from: c */
        final /* synthetic */ String f134319c;

        /* renamed from: d */
        final /* synthetic */ Bundle f134320d;

        static {
            Covode.recordClassIndex(69348);
        }

        CallableC59005c(TabChangeManager tabChangeManager, Class cls, String str, Bundle bundle) {
            this.f134317a = tabChangeManager;
            this.f134318b = cls;
            this.f134319c = str;
            this.f134320d = bundle;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            this.f134317a.mo96532a(this.f134318b, this.f134319c, this.f134320d);
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.main.TabChangeManager$d */
    public static final class RunnableC59006d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ TabChangeManager f134321a;

        /* renamed from: b */
        final /* synthetic */ String f134322b;

        /* renamed from: c */
        final /* synthetic */ boolean f134323c;

        /* renamed from: d */
        final /* synthetic */ int f134324d;

        /* renamed from: e */
        final /* synthetic */ boolean f134325e;

        static {
            Covode.recordClassIndex(69349);
        }

        RunnableC59006d(TabChangeManager tabChangeManager, String str, boolean z, int i, boolean z2) {
            this.f134321a = tabChangeManager;
            this.f134322b = str;
            this.f134323c = z;
            this.f134324d = i;
            this.f134325e = z2;
        }

        public final void run() {
            this.f134321a.mo96534a(this.f134322b, this.f134323c, this.f134324d, this.f134325e);
        }
    }

    @Override // androidx.lifecycle.AbstractC1174ac
    public final void onCleared() {
        this.f134309a = null;
        this.f134311c.clear();
    }

    /* renamed from: b */
    public final Fragment mo96536b() {
        if (!mo96535a()) {
            return null;
        }
        FragmentTabHost fragmentTabHost = this.f134309a;
        if (fragmentTabHost == null) {
            C89219l.m154715b();
        }
        return fragmentTabHost.getCurrentFragment();
    }

    /* renamed from: a */
    public final Fragment mo96530a(String str) {
        AbstractC0952i iVar = this.f134314f;
        if (iVar == null) {
            return null;
        }
        return iVar.mo3551a(str);
    }

    /* renamed from: a */
    public final TabChangeManager mo96531a(AbstractC34687g gVar) {
        C89219l.m154721d(gVar, "");
        this.f134311c.add(gVar);
        if (gVar instanceof AbstractC1204m) {
            ((AbstractC1204m) gVar).getLifecycle().mo4012a(new TabChangeManager$addListener$1(this, gVar));
        }
        return this;
    }

    /* renamed from: a */
    public final void mo96533a(String str, boolean z) {
        if (str != null) {
            int i = this.f134316i + 1;
            this.f134316i = i;
            mo96534a(str, z, i, false);
        }
    }

    /* renamed from: a */
    public final void mo96532a(Class<?> cls, String str, Bundle bundle) {
        MethodCollector.m26663i(9411);
        if (!mo96535a()) {
            C1731i.m5640b(new CallableC59005c(this, cls, str, bundle), C1731i.f5564c);
            MethodCollector.m26664o(9411);
            return;
        }
        FragmentTabHost fragmentTabHost = this.f134309a;
        if (fragmentTabHost == null) {
            C89219l.m154715b();
        }
        if (str == null) {
            C89219l.m154715b();
        }
        TabHost.TabSpec newTabSpec = fragmentTabHost.newTabSpec(str);
        C89219l.m154716b(newTabSpec, "");
        FragmentTabHost fragmentTabHost2 = this.f134309a;
        if (fragmentTabHost2 == null) {
            C89219l.m154715b();
        }
        Space space = new Space(fragmentTabHost2.getContext());
        space.setMinimumHeight(0);
        space.setMinimumWidth(0);
        newTabSpec.setIndicator(space);
        try {
            FragmentTabHost fragmentTabHost3 = this.f134309a;
            if (fragmentTabHost3 == null) {
                C89219l.m154715b();
            }
            fragmentTabHost3.mo29214a(newTabSpec, cls, bundle);
            MethodCollector.m26664o(9411);
        } catch (Exception e) {
            C51423a.m95786a(e);
            MethodCollector.m26664o(9411);
        }
    }

    /* renamed from: a */
    public final void mo96534a(String str, boolean z, int i, boolean z2) {
        String str2;
        if (!TextUtils.equals("HOME", str)) {
            C58945a.C58947b.f134185a.f134176c = false;
            C58945a.C58947b.f134185a.f134180g = false;
        }
        if (!mo96535a() && TextUtils.equals("HOME", str) && (str2 = this.f134312d) == null) {
            this.f134310b = str2;
            this.f134312d = str;
        }
        if (!mo96535a()) {
            C29339a.m58754b(new RunnableC59006d(this, str, z, i, z2));
        } else if (this.f134316i <= i) {
            HomePageUIFrameService e = HomePageUIFrameServiceImpl.m108627e();
            FragmentTabHost fragmentTabHost = this.f134309a;
            if (fragmentTabHost == null) {
                C89219l.m154715b();
            }
            String tagForCurrentTabInMainPageFragment = e.getTagForCurrentTabInMainPageFragment(this, fragmentTabHost.getCurrentTabTag(), str);
            FragmentTabHost fragmentTabHost2 = this.f134309a;
            if (fragmentTabHost2 == null) {
                C89219l.m154715b();
            }
            fragmentTabHost2.setCurrentTabByTag(tagForCurrentTabInMainPageFragment);
            this.f134310b = this.f134312d;
            this.f134312d = str;
            AbstractC59004b bVar = this.f134315g;
            if (bVar != null) {
                bVar.mo89405a(this.f134312d);
            }
            for (AbstractC34687g gVar : this.f134311c) {
                gVar.mo61348a(this.f134312d, this.f134310b, z, z2);
            }
            HomePageUIFrameServiceImpl.m108627e().mo89383a(str);
        }
    }
}
