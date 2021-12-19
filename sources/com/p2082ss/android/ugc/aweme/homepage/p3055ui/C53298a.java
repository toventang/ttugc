package com.p2082ss.android.ugc.aweme.homepage.p3055ui;

import android.os.Bundle;
import android.util.SparseArray;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1214u;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.covode.number.Covode;
import com.bytedance.hox.Hox;
import com.p2082ss.android.ugc.aweme.AbstractC35329by;
import com.p2082ss.android.ugc.aweme.C34792be;
import com.p2082ss.android.ugc.aweme.feed.p2949i.C49680h;
import com.p2082ss.android.ugc.aweme.homepage.api.interaction.ScrollSwitchStateManager;
import com.p2082ss.android.ugc.aweme.homepage.p3055ui.p3056a.AbstractC53302a;
import com.p2082ss.android.ugc.aweme.homepage.p3055ui.view.FlippableViewPagerExt;
import com.p2082ss.android.ugc.aweme.homepage.p3055ui.view.tab.HomeTabViewModel;
import com.p2082ss.android.ugc.aweme.homepage.p3055ui.view.tab.top.C53362a;
import com.p2082ss.android.ugc.aweme.homepage.p3055ui.view.tab.top.C53385d;
import com.p2082ss.android.ugc.aweme.homepage.p3055ui.view.tab.top.C53392e;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81915c;
import java.lang.ref.WeakReference;
import p4600h.C89386u;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.homepage.ui.a */
public final class C53298a {

    /* renamed from: a */
    public C53385d f122335a;

    /* renamed from: b */
    public C53305b f122336b;

    /* renamed from: c */
    public FlippableViewPagerExt f122337c;

    /* renamed from: d */
    public ScrollSwitchStateManager f122338d;

    /* renamed from: e */
    public Hox f122339e;

    static {
        Covode.recordClassIndex(62849);
    }

    /* renamed from: com.ss.android.ugc.aweme.homepage.ui.a$a */
    public static final class C53299a implements ViewPager.AbstractC1579e {

        /* renamed from: a */
        final /* synthetic */ C53298a f122340a;

        static {
            Covode.recordClassIndex(62850);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public C53299a(C53298a aVar) {
            this.f122340a = aVar;
        }

        @Override // androidx.viewpager.widget.ViewPager.AbstractC1579e
        public final void onPageScrollStateChanged(int i) {
            ScrollSwitchStateManager scrollSwitchStateManager = this.f122340a.f122338d;
            if (scrollSwitchStateManager != null) {
                scrollSwitchStateManager.f121771m.setValue(Integer.valueOf(i));
            }
            C53385d dVar = this.f122340a.f122335a;
            if (dVar != null) {
                dVar.f122579b.onPageScrollStateChanged(i);
            }
        }

        @Override // androidx.viewpager.widget.ViewPager.AbstractC1579e
        public final void onPageSelected(int i) {
            Object obj;
            AbstractC35329by a;
            C53392e eVar;
            ScrollSwitchStateManager scrollSwitchStateManager = this.f122340a.f122338d;
            if (scrollSwitchStateManager != null) {
                scrollSwitchStateManager.f121770l.setValue(Integer.valueOf(i));
            }
            Bundle bundle = new Bundle();
            bundle.putString(C34792be.f82123b, C34792be.f82126e);
            Hox hox = this.f122340a.f122339e;
            if (hox != null) {
                hox.mo25207a("HOME", i, bundle);
            }
            C53385d dVar = this.f122340a.f122335a;
            if (dVar != null) {
                dVar.f122579b.onPageSelected(i);
                C53362a.C53377f a2 = dVar.f122578a.mo89839a(i);
                String str = null;
                if (a2 != null) {
                    obj = a2.f122562e;
                } else {
                    obj = null;
                }
                if (obj instanceof String) {
                    str = obj;
                }
                String str2 = str;
                if ((!C89219l.m154714a((Object) str2, (Object) "Following")) && (eVar = (C53392e) HomeTabViewModel.C53309a.m98315a(dVar.f122584g).mo89739b(str2)) != null) {
                    eVar.mo89980a();
                }
                if (!(str2 == null || (a = HomeTabViewModel.C53309a.m98315a(dVar.f122584g).mo89735a(str2)) == null)) {
                    a.mo57293i();
                }
            }
            AbstractC81915c.m141874a(new C49680h());
        }

        @Override // androidx.viewpager.widget.ViewPager.AbstractC1579e
        public final void onPageScrolled(int i, float f, int i2) {
            ScrollSwitchStateManager scrollSwitchStateManager = this.f122340a.f122338d;
            if (scrollSwitchStateManager != null) {
                scrollSwitchStateManager.f121772n.setValue(new C89386u<>(Integer.valueOf(i), Float.valueOf(f), Integer.valueOf(i2)));
            }
            C53385d dVar = this.f122340a.f122335a;
            if (dVar != null) {
                dVar.f122579b.onPageScrolled(i, f, i2);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.homepage.ui.a$c */
    public static final class C53301c implements AbstractC53302a {

        /* renamed from: a */
        final /* synthetic */ C53298a f122342a;

        static {
            Covode.recordClassIndex(62852);
        }

        @Override // com.p2082ss.android.ugc.aweme.homepage.p3055ui.p3056a.AbstractC53302a
        /* renamed from: a */
        public final void mo89709a(SparseArray<Fragment> sparseArray) {
            C89219l.m154721d(sparseArray, "");
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public C53301c(C53298a aVar) {
            this.f122342a = aVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.homepage.p3055ui.p3056a.AbstractC53302a
        /* renamed from: a */
        public final void mo89710a(WeakReference<Fragment> weakReference) {
            ScrollSwitchStateManager scrollSwitchStateManager = this.f122342a.f122338d;
            if (scrollSwitchStateManager != null) {
                scrollSwitchStateManager.f121769k = weakReference;
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.homepage.ui.a$b */
    public static final class C53300b<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ C53298a f122341a;

        static {
            Covode.recordClassIndex(62851);
        }

        public C53300b(C53298a aVar) {
            this.f122341a = aVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            Boolean bool = (Boolean) obj;
            FlippableViewPagerExt flippableViewPagerExt = this.f122341a.f122337c;
            if (flippableViewPagerExt != null) {
                if (bool == null) {
                    C89219l.m154715b();
                }
                flippableViewPagerExt.f122369a = bool.booleanValue();
            }
        }
    }
}
