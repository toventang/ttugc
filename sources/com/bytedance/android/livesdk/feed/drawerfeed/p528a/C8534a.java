package com.bytedance.android.livesdk.feed.drawerfeed.p528a;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.android.livesdk.feed.AbstractC8654p;
import com.bytedance.android.livesdk.feed.banner.C8503b;
import com.bytedance.android.livesdk.feed.banner.RoundIndicatorView;
import com.bytedance.android.livesdk.feed.banner.p525a.C8502c;
import com.bytedance.android.livesdk.feed.feed.FeedDataKey;
import com.bytedance.android.livesdk.model.C9594m;
import com.bytedance.android.livesdk.model.FeedItem;
import com.bytedance.android.livesdk.p425aa.C6501b;
import com.bytedance.android.livesdk.p643ui.AbstractC10937b;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p4560f.p4561a.p4591l.C88960c;

/* renamed from: com.bytedance.android.livesdk.feed.drawerfeed.a.a */
public final class C8534a extends AbstractC10937b<FeedItem> {

    /* renamed from: a */
    ViewPager f21096a;

    /* renamed from: b */
    RoundIndicatorView f21097b;

    /* renamed from: c */
    C8503b.RunnableC8505b f21098c;

    /* renamed from: d */
    C88960c<Object> f21099d;

    /* renamed from: e */
    C88960c<Object> f21100e;

    /* renamed from: f */
    C88960c<Boolean> f21101f;

    /* renamed from: g */
    private C8502c f21102g;

    /* renamed from: h */
    private C8503b.C8504a f21103h = new C8503b.C8504a(this.f21096a, this.f21098c, this.f21106k);

    /* renamed from: i */
    private List<C9594m> f21104i;

    /* renamed from: j */
    private Context f21105j;

    /* renamed from: k */
    private String f21106k;

    /* renamed from: l */
    private boolean f21107l;

    /* renamed from: m */
    private AbstractC8654p f21108m;

    /* renamed from: n */
    private ViewGroup f21109n;

    static {
        Covode.recordClassIndex(9389);
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
        this.f21107l = false;
        C8503b.C8504a aVar = this.f21103h;
        if (aVar != null) {
            aVar.f21045c = false;
        }
        mo14842d();
    }

    @Override // com.bytedance.android.livesdk.p643ui.AbstractC10937b
    /* renamed from: a */
    public final void mo14823a() {
        super.mo14823a();
        boolean z = true;
        this.f21107l = true;
        C8503b.C8504a aVar = this.f21103h;
        if (aVar != null) {
            aVar.f21045c = true;
        }
        List<C9594m> list = this.f21104i;
        if (list == null || list.size() > 1) {
            z = false;
        }
        mo14841a(z);
    }

    /* renamed from: d */
    public final void mo14842d() {
        this.f21096a.removeCallbacks(this.f21098c);
        this.f21096a.clearOnPageChangeListeners();
        C8503b.C8504a aVar = this.f21103h;
        if (aVar != null) {
            aVar.f21043a = false;
        }
    }

    /* renamed from: a */
    private void m16742a(List<C9594m> list) {
        int i;
        C8503b.C8504a aVar = this.f21103h;
        if (aVar != null) {
            i = aVar.f21044b;
        } else {
            i = 0;
        }
        if (list != null && !list.isEmpty() && this.f21107l) {
            int size = i % list.size();
            HashMap hashMap = new HashMap();
            hashMap.put("show_source", this.f21106k);
            hashMap.put("banner_id", String.valueOf(list.get(size).getId()));
            hashMap.put("banner_position", String.valueOf(size + 1));
            C6501b.C6502a.m13948a("banner_show").mo12652a((Map<String, String>) hashMap).mo12639a().mo12655b();
        }
    }

    /* renamed from: a */
    public final void mo14841a(boolean z) {
        if (this.f21107l && this.itemView != null && this.itemView.getVisibility() == 0) {
            if (z) {
                m16742a(this.f21104i);
            }
            List<C9594m> list = this.f21104i;
            if (list != null && list.size() > 1 && this.f21096a != null && this.f21097b != null) {
                C8503b.C8504a aVar = this.f21103h;
                if (aVar != null) {
                    aVar.f21043a = true;
                }
                this.f21096a.clearOnPageChangeListeners();
                this.f21096a.addOnPageChangeListener(this.f21103h);
                this.f21097b.setViewPager(this.f21096a);
                m16741a(this.f21096a, this.f21098c);
            }
        }
    }

    /* renamed from: a */
    private static void m16741a(ViewPager viewPager, Runnable runnable) {
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
        if (!(feedItem2 == null || feedItem2.banners == null || (list2 = this.f21104i) == (list = feedItem2.banners))) {
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
            m16742a(list);
            this.f21096a.removeCallbacks(this.f21098c);
            this.f21104i = list;
            this.f21096a.setAdapter(null);
            if (list == null || list.isEmpty()) {
                ViewGroup.LayoutParams layoutParams = this.f21096a.getLayoutParams();
                layoutParams.height = 0;
                this.f21096a.setLayoutParams(layoutParams);
                this.f21102g = null;
                this.f21097b.setVisibility(8);
                return;
            }
            ViewGroup.LayoutParams layoutParams2 = this.f21096a.getLayoutParams();
            Iterator<C9594m> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    i2 = 0;
                    break;
                }
                C9594m next = it.next();
                if (!(next == null || next.f23277f == 0)) {
                    i2 = (this.f21109n.getMeasuredWidth() * next.f23276e) / next.f23277f;
                    break;
                }
            }
            if (i2 != layoutParams2.height) {
                layoutParams2.height = i2;
                this.f21096a.setLayoutParams(layoutParams2);
            }
            if (this.f21102g == null) {
                this.f21102g = new C8502c(this.itemView.getContext(), LayoutInflater.from(this.itemView.getContext()), this.f21106k, this.f21108m);
            }
            this.f21102g.mo14822a(this.f21104i);
            this.f21096a.setAdapter(this.f21102g);
            if (this.f21104i.size() > 1) {
                m16741a(this.f21096a, this.f21098c);
                this.f21096a.clearOnPageChangeListeners();
                this.f21096a.addOnPageChangeListener(this.f21103h);
                C8503b.C8504a aVar = this.f21103h;
                if (aVar != null) {
                    aVar.f21043a = true;
                }
                this.f21097b.setViewPager(this.f21096a);
                this.f21097b.setVisibility(0);
                this.f21097b.setCount(list.size());
                this.f21096a.setCurrentItem(this.f21104i.size() * (Integer.MAX_VALUE / (this.f21104i.size() * 2)));
                return;
            }
            this.f21097b.setVisibility(8);
        }
    }

    public C8534a(View view, FeedDataKey feedDataKey, C88960c<Object> cVar, C88960c<Object> cVar2, C88960c<Boolean> cVar3, AbstractC8654p pVar, ViewGroup viewGroup) {
        super(view);
        this.f21109n = viewGroup;
        this.f21096a = (ViewPager) view.findViewById(R.id.fgn);
        this.f21097b = (RoundIndicatorView) view.findViewById(R.id.bmu);
        this.f21105j = view.getContext();
        this.f21106k = feedDataKey.f21207b;
        this.f21108m = pVar;
        this.f21099d = cVar;
        this.f21100e = cVar2;
        this.f21101f = cVar3;
        C8503b.RunnableC8505b bVar = new C8503b.RunnableC8505b(this.f21096a);
        this.f21098c = bVar;
        this.f21096a.removeCallbacks(bVar);
        this.f21096a.setOnTouchListener(new View$OnTouchListenerC8535b(this));
        this.f21097b.setViewPager(this.f21096a);
        RoundIndicatorView roundIndicatorView = this.f21097b;
        C8503b.C8504a aVar = this.f21103h;
        if (roundIndicatorView.f21001b != null) {
            roundIndicatorView.f21001b.addOnPageChangeListener(aVar);
        }
        this.f21101f.mo143254a(new C8536c(this), C8537d.f21112a);
        this.f21099d.mo143254a(new C8538e(this), C8539f.f21114a);
        this.f21100e.mo143254a(new C8540g(this), C8541h.f21116a);
    }
}
