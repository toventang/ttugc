package com.bytedance.android.livesdk.feed.banner;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.android.live.core.p213c.C3854a;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.live.uikit.p411c.C6229a;
import com.bytedance.android.livesdk.feed.AbstractC8654p;
import com.bytedance.android.livesdk.feed.banner.p525a.C8502c;
import com.bytedance.android.livesdk.model.C9594m;
import com.bytedance.android.livesdk.model.FeedItem;
import com.bytedance.android.livesdk.p425aa.C6501b;
import com.bytedance.android.livesdk.p643ui.AbstractC10937b;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: com.bytedance.android.livesdk.feed.banner.b */
public final class C8503b extends AbstractC10937b<FeedItem> {

    /* renamed from: a */
    ViewPager f21033a;

    /* renamed from: b */
    RoundIndicatorView f21034b;

    /* renamed from: c */
    private C8502c f21035c;

    /* renamed from: d */
    private RunnableC8505b f21036d;

    /* renamed from: e */
    private C8504a f21037e;

    /* renamed from: f */
    private List<C9594m> f21038f;

    /* renamed from: g */
    private Context f21039g;

    /* renamed from: h */
    private String f21040h;

    /* renamed from: i */
    private boolean f21041i;

    /* renamed from: j */
    private AbstractC8654p f21042j;

    static {
        Covode.recordClassIndex(9357);
    }

    @Override // com.bytedance.android.livesdk.p643ui.AbstractC10937b
    /* renamed from: c */
    public final boolean mo14825c() {
        return true;
    }

    @Override // com.bytedance.android.livesdk.p643ui.AbstractC10937b
    /* renamed from: b */
    public final void mo14824b() {
        super.mo14824b();
        this.f21041i = false;
        C8504a aVar = this.f21037e;
        if (aVar != null) {
            aVar.f21045c = false;
        }
        this.f21033a.removeCallbacks(this.f21036d);
        this.f21033a.clearOnPageChangeListeners();
        C8504a aVar2 = this.f21037e;
        if (aVar2 != null) {
            aVar2.f21043a = false;
        }
    }

    /* renamed from: com.bytedance.android.livesdk.feed.banner.b$b */
    public static class RunnableC8505b implements Runnable {

        /* renamed from: a */
        ViewPager f21050a;

        static {
            Covode.recordClassIndex(9359);
        }

        public final void run() {
            if (C6229a.m13521a(C3966y.m9669e())) {
                ViewPager viewPager = this.f21050a;
                viewPager.setCurrentItem(viewPager.getCurrentItem() + 1);
                return;
            }
            try {
                Field declaredField = ViewPager.class.getDeclaredField("mFirstLayout");
                declaredField.setAccessible(true);
                declaredField.set(this.f21050a, false);
                declaredField.setAccessible(false);
                Method declaredMethod = ViewPager.class.getDeclaredMethod("setCurrentItemInternal", Integer.TYPE, Boolean.TYPE, Boolean.TYPE, Integer.TYPE);
                declaredMethod.setAccessible(true);
                ViewPager viewPager2 = this.f21050a;
                declaredMethod.invoke(viewPager2, Integer.valueOf(viewPager2.getCurrentItem() + 1), true, true, 1);
                declaredMethod.setAccessible(false);
            } catch (Exception unused) {
                ViewPager viewPager3 = this.f21050a;
                viewPager3.setCurrentItem(viewPager3.getCurrentItem() + 1);
            }
        }

        public RunnableC8505b(ViewPager viewPager) {
            this.f21050a = viewPager;
        }
    }

    @Override // com.bytedance.android.livesdk.p643ui.AbstractC10937b
    /* renamed from: a */
    public final void mo14823a() {
        super.mo14823a();
        this.f21041i = true;
        C8504a aVar = this.f21037e;
        if (aVar != null) {
            aVar.f21045c = true;
        }
        if (this.f21041i && this.itemView != null && this.itemView.getVisibility() == 0) {
            m16711a(this.f21038f);
            List<C9594m> list = this.f21038f;
            if (list != null && list.size() > 1 && this.f21033a != null && this.f21034b != null) {
                C8504a aVar2 = this.f21037e;
                if (aVar2 != null) {
                    aVar2.f21043a = true;
                }
                this.f21033a.clearOnPageChangeListeners();
                this.f21033a.addOnPageChangeListener(this.f21037e);
                this.f21034b.setViewPager(this.f21033a);
                m16710a(this.f21033a, this.f21036d);
            }
        }
    }

    /* renamed from: a */
    private void m16711a(List<C9594m> list) {
        int i;
        C8504a aVar = this.f21037e;
        if (aVar != null) {
            i = aVar.f21044b;
        } else {
            i = 0;
        }
        if (list != null && !list.isEmpty() && this.f21041i) {
            HashMap hashMap = new HashMap();
            hashMap.put("show_source", this.f21040h);
            hashMap.put("banner_id", String.valueOf(list.get(i % list.size()).getId()));
            C6501b.C6502a.m13948a("banner_show").mo12652a((Map<String, String>) hashMap).mo12655b();
        }
    }

    /* renamed from: com.bytedance.android.livesdk.feed.banner.b$a */
    public static class C8504a implements ViewPager.AbstractC1579e {

        /* renamed from: a */
        public boolean f21043a;

        /* renamed from: b */
        public int f21044b;

        /* renamed from: c */
        public boolean f21045c = true;

        /* renamed from: d */
        public boolean f21046d = true;

        /* renamed from: e */
        private ViewPager f21047e;

        /* renamed from: f */
        private RunnableC8505b f21048f;

        /* renamed from: g */
        private String f21049g;

        static {
            Covode.recordClassIndex(9358);
        }

        @Override // androidx.viewpager.widget.ViewPager.AbstractC1579e
        public final void onPageScrollStateChanged(int i) {
        }

        @Override // androidx.viewpager.widget.ViewPager.AbstractC1579e
        public final void onPageScrolled(int i, float f, int i2) {
        }

        @Override // androidx.viewpager.widget.ViewPager.AbstractC1579e
        public final void onPageSelected(int i) {
            C8502c cVar;
            C9594m mVar;
            this.f21044b = i;
            if (this.f21043a) {
                C8503b.m16710a(this.f21047e, this.f21048f);
                if (this.f21045c && (cVar = (C8502c) this.f21047e.getAdapter()) != null) {
                    C8502c cVar2 = (C8502c) this.f21047e.getAdapter();
                    if (cVar2.f21030a != null && !cVar2.f21030a.isEmpty() && i >= 0 && (mVar = cVar2.f21030a.get(i % cVar2.f21030a.size())) != null) {
                        this.f21046d = false;
                        HashMap hashMap = new HashMap();
                        hashMap.put("show_source", this.f21049g);
                        hashMap.put("banner_id", String.valueOf(mVar.getId()));
                        hashMap.put("banner_position", String.valueOf((i % cVar.f21030a.size()) + 1));
                        C6501b.C6502a.m13948a("banner_show").mo12652a((Map<String, String>) hashMap).mo12639a().mo12655b();
                        ViewPager viewPager = this.f21047e;
                        if (viewPager instanceof C8506c) {
                            C8506c cVar3 = (C8506c) viewPager;
                            if (cVar3.f21051a == null || cVar3.f21051a.getAction() == 3 || cVar3.f21051a.getAction() == 1) {
                                cVar3.post(new RunnableC8507d(cVar3));
                            }
                            C3854a.m9453a(3, "BannerViewPager", "onPageSelected ");
                        }
                    }
                }
            }
        }

        public C8504a(ViewPager viewPager, RunnableC8505b bVar, String str) {
            this.f21047e = viewPager;
            this.f21048f = bVar;
            this.f21049g = str;
        }
    }

    /* renamed from: a */
    public static void m16710a(ViewPager viewPager, Runnable runnable) {
        viewPager.removeCallbacks(runnable);
        viewPager.postDelayed(runnable, 5000);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, int] */
    @Override // com.bytedance.android.livesdk.p643ui.AbstractC10937b
    /* renamed from: a */
    public final /* synthetic */ void mo9329a(FeedItem feedItem, int i) {
        List<C9594m> list;
        List<C9594m> list2;
        int i2;
        FeedItem feedItem2 = feedItem;
        if (!(feedItem2 == null || feedItem2.banners == null || (list2 = this.f21038f) == (list = feedItem2.banners))) {
            if (list2 == null ? list == null : list != null) {
                if (list2.size() == list.size()) {
                    for (int i3 = 0; i3 < list2.size(); i3++) {
                        C9594m mVar = list2.get(i3);
                        C9594m mVar2 = list.get(i3);
                        if ((mVar == null || mVar.mo16558a(mVar2)) && (mVar2 == null || mVar2.mo16558a(mVar))) {
                        }
                    }
                    return;
                }
            }
            m16711a(list);
            this.f21033a.removeCallbacks(this.f21036d);
            this.f21038f = list;
            this.f21033a.setAdapter(null);
            if (list == null || list.isEmpty()) {
                ViewGroup.LayoutParams layoutParams = this.f21033a.getLayoutParams();
                layoutParams.height = 0;
                this.f21033a.setLayoutParams(layoutParams);
                this.f21035c = null;
                this.f21034b.setVisibility(8);
                return;
            }
            ViewGroup.LayoutParams layoutParams2 = this.f21033a.getLayoutParams();
            Iterator<C9594m> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    i2 = 0;
                    break;
                }
                C9594m next = it.next();
                if (!(next == null || next.f23277f == 0)) {
                    i2 = (C13628n.m24504a(this.f21039g) * next.f23276e) / next.f23277f;
                    break;
                }
            }
            if (i2 != layoutParams2.height) {
                layoutParams2.height = i2;
                this.f21033a.setLayoutParams(layoutParams2);
            }
            if (this.f21035c == null) {
                this.f21035c = new C8502c(this.itemView.getContext(), LayoutInflater.from(this.itemView.getContext()), this.f21040h, this.f21042j);
            }
            this.f21035c.mo14822a(this.f21038f);
            this.f21033a.setAdapter(this.f21035c);
            if (this.f21038f.size() > 1) {
                m16710a(this.f21033a, this.f21036d);
                this.f21033a.clearOnPageChangeListeners();
                this.f21033a.addOnPageChangeListener(this.f21037e);
                C8504a aVar = this.f21037e;
                if (aVar != null) {
                    aVar.f21043a = true;
                }
                this.f21034b.setViewPager(this.f21033a);
                this.f21034b.setVisibility(0);
                this.f21034b.setCount(list.size());
                this.f21033a.setCurrentItem(this.f21038f.size() * (Integer.MAX_VALUE / (this.f21038f.size() * 2)));
                return;
            }
            this.f21034b.setVisibility(8);
        }
    }
}
