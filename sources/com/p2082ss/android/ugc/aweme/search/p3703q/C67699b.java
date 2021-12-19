package com.p2082ss.android.ugc.aweme.search.p3703q;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.PagerAdapter;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.discover.mixfeed.p2789b.C42314a;
import com.p2082ss.android.ugc.aweme.discover.model.SearchUser;
import com.p2082ss.android.ugc.aweme.search.ecom.AbstractC67393a;
import com.p2082ss.android.ugc.aweme.search.ecom.AbstractC67411e;
import com.p2082ss.android.ugc.aweme.search.ecom.ProductListView;
import com.p2082ss.android.ugc.aweme.search.ecom.p3688a.C67397b;
import com.p2082ss.android.ugc.aweme.search.p3695k.C67568r;
import com.p2082ss.android.ugc.aweme.views.RtlViewPager;
import com.p2082ss.android.ugc.trill.R;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.search.q.b */
public final class C67699b extends PagerAdapter {

    /* renamed from: g */
    public static final C67700a f151742g = new C67700a((byte) 0);

    /* renamed from: a */
    public C67702c f151743a;

    /* renamed from: b */
    public ProductListView f151744b;

    /* renamed from: c */
    public AbstractC67393a f151745c;

    /* renamed from: d */
    public AbstractC67411e f151746d;

    /* renamed from: e */
    public AbstractC89171a<C89391z> f151747e;

    /* renamed from: f */
    public int f151748f = -1;

    /* renamed from: h */
    private SearchUser f151749h;

    /* renamed from: i */
    private C42314a f151750i;

    /* renamed from: j */
    private C67568r f151751j;

    /* renamed from: k */
    private final Context f151752k;

    static {
        Covode.recordClassIndex(79344);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int getCount() {
        return 2;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final boolean isViewFromObject(View view, Object obj) {
        C89219l.m154721d(view, "");
        C89219l.m154721d(obj, "");
        return view == obj;
    }

    /* renamed from: com.ss.android.ugc.aweme.search.q.b$a */
    public static final class C67700a {
        static {
            Covode.recordClassIndex(79345);
        }

        private C67700a() {
        }

        public /* synthetic */ C67700a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.search.q.b$b */
    static final class RunnableC67701b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C67699b f151753a;

        /* renamed from: b */
        final /* synthetic */ RtlViewPager f151754b;

        /* renamed from: c */
        final /* synthetic */ View f151755c;

        /* renamed from: d */
        final /* synthetic */ int f151756d;

        static {
            Covode.recordClassIndex(79346);
        }

        RunnableC67701b(C67699b bVar, RtlViewPager rtlViewPager, View view, int i) {
            this.f151753a = bVar;
            this.f151754b = rtlViewPager;
            this.f151755c = view;
            this.f151756d = i;
        }

        public final void run() {
            RtlViewPager rtlViewPager = this.f151754b;
            View view = this.f151755c;
            if (rtlViewPager.f181922c) {
                rtlViewPager.f181923d = view;
                rtlViewPager.requestLayout();
            }
            if (this.f151756d == 1) {
                ProductListView productListView = this.f151753a.f151744b;
                if (productListView == null) {
                    C89219l.m154710a("productListView");
                }
                RecyclerView.AbstractC1350a adapter = productListView.getAdapter();
                if (adapter != null) {
                    adapter.notifyDataSetChanged();
                }
            }
        }
    }

    public C67699b(Context context) {
        C89219l.m154721d(context, "");
        this.f151752k = context;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final CharSequence getPageTitle(int i) {
        if (i == 0) {
            return this.f151752k.getString(R.string.ff5);
        }
        if (i != 1) {
            return null;
        }
        return this.f151752k.getString(R.string.a4l);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final Object instantiateItem(ViewGroup viewGroup, int i) {
        View view;
        MethodCollector.m26663i(7808);
        C89219l.m154721d(viewGroup, "");
        boolean z = false;
        if (i == 0) {
            if (this.f151743a != null) {
                z = true;
            }
            if (!z) {
                C67702c cVar = new C67702c(null, viewGroup, 1);
                this.f151743a = cVar;
                SearchUser searchUser = this.f151749h;
                if (searchUser == null) {
                    C89219l.m154710a("user");
                }
                cVar.mo106808b(searchUser);
                C67702c cVar2 = this.f151743a;
                if (cVar2 == null) {
                    C89219l.m154710a("videoAndPlaylistController");
                }
                cVar2.mo106807b();
                C67702c cVar3 = this.f151743a;
                if (cVar3 == null) {
                    C89219l.m154710a("videoAndPlaylistController");
                }
                C42314a aVar = this.f151750i;
                if (aVar == null) {
                    C89219l.m154710a("aladinMobParam");
                }
                C67568r rVar = this.f151751j;
                if (rVar == null) {
                    C89219l.m154710a("itemMobParam");
                }
                cVar3.mo70994a(aVar, rVar);
                C67702c cVar4 = this.f151743a;
                if (cVar4 == null) {
                    C89219l.m154710a("videoAndPlaylistController");
                }
                SearchUser searchUser2 = this.f151749h;
                if (searchUser2 == null) {
                    C89219l.m154710a("user");
                }
                cVar4.mo70992a(searchUser2);
            }
            C67702c cVar5 = this.f151743a;
            if (cVar5 == null) {
                C89219l.m154710a("videoAndPlaylistController");
            }
            view = cVar5.f151757a;
            if (view == null) {
                C89219l.m154710a("rootView");
            }
        } else if (i == 1) {
            if (this.f151744b == null) {
                View a = C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), R.layout.awl, viewGroup, false);
                if (a != null) {
                    ProductListView productListView = (ProductListView) a;
                    productListView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                    productListView.mo106296a(this.f151746d, this.f151745c, this.f151747e);
                    SearchUser searchUser3 = this.f151749h;
                    if (searchUser3 == null) {
                        C89219l.m154710a("user");
                    }
                    C67397b bVar = searchUser3.productGroup;
                    C89219l.m154716b(bVar, "");
                    productListView.setData(bVar);
                    productListView.f150972P = false;
                    this.f151744b = productListView;
                } else {
                    NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.search.ecom.ProductListView");
                    MethodCollector.m26664o(7808);
                    throw nullPointerException;
                }
            }
            view = this.f151744b;
            if (view == null) {
                C89219l.m154710a("productListView");
            }
        } else {
            IllegalStateException illegalStateException = new IllegalStateException("UserItemPagerAdapter only supports 2 items, but item pos #" + i + " found instead.");
            MethodCollector.m26664o(7808);
            throw illegalStateException;
        }
        viewGroup.addView(view);
        MethodCollector.m26664o(7808);
        return view;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        MethodCollector.m26663i(7809);
        C89219l.m154721d(viewGroup, "");
        C89219l.m154721d(obj, "");
        if (!(obj instanceof View)) {
            obj = null;
        }
        View view = (View) obj;
        if (view != null) {
            viewGroup.removeView(view);
            MethodCollector.m26664o(7809);
            return;
        }
        MethodCollector.m26664o(7809);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final void setPrimaryItem(ViewGroup viewGroup, int i, Object obj) {
        C89219l.m154721d(viewGroup, "");
        C89219l.m154721d(obj, "");
        super.setPrimaryItem(viewGroup, i, obj);
        if (!(viewGroup instanceof RtlViewPager)) {
            viewGroup = null;
        }
        RtlViewPager rtlViewPager = (RtlViewPager) viewGroup;
        if (rtlViewPager != null) {
            if (!(obj instanceof View)) {
                obj = null;
            }
            View view = (View) obj;
            if (view != null && this.f151748f != i) {
                this.f151748f = i;
                view.post(new RunnableC67701b(this, rtlViewPager, view, i));
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, View.ALPHA, 0.0f, 1.0f);
                ofFloat.setDuration(200L);
                ofFloat.start();
            }
        }
    }

    /* renamed from: a */
    public final void mo106805a(SearchUser searchUser, C42314a aVar, C67568r rVar, boolean z) {
        C89219l.m154721d(searchUser, "");
        C89219l.m154721d(aVar, "");
        C89219l.m154721d(rVar, "");
        this.f151749h = searchUser;
        this.f151750i = aVar;
        this.f151751j = rVar;
        if (this.f151743a != null && (z || this.f151748f == 0)) {
            C67702c cVar = this.f151743a;
            if (cVar == null) {
                C89219l.m154710a("videoAndPlaylistController");
            }
            cVar.mo70994a(aVar, rVar);
            C67702c cVar2 = this.f151743a;
            if (cVar2 == null) {
                C89219l.m154710a("videoAndPlaylistController");
            }
            cVar2.mo70992a(searchUser);
        }
        if (this.f151744b != null && this.f151748f == 1) {
            ProductListView productListView = this.f151744b;
            if (productListView == null) {
                C89219l.m154710a("productListView");
            }
            C67397b bVar = searchUser.productGroup;
            C89219l.m154716b(bVar, "");
            productListView.setData(bVar);
        }
    }
}
