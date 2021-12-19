package com.bytedance.android.livesdk.feed.p523a;

import android.os.Bundle;
import androidx.lifecycle.AbstractC1204m;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.bytedance.android.live.core.paging.viewmodel.PagingViewModel;
import com.bytedance.android.livesdk.feed.AbstractC8634k;
import com.bytedance.android.livesdk.feed.BannerSwipeRefreshLayout;
import com.bytedance.android.livesdk.feed.feed.FeedDataKey;
import com.bytedance.android.livesdk.feed.viewmodel.BaseFeedDataViewModel;
import com.bytedance.android.livesdk.livesetting.feed.I18nZhibozhongAnimationTagSetting;
import com.bytedance.android.livesdk.util.rxutils.C11195i;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.livesdk.feed.a.d */
public final class C8476d {

    /* renamed from: a */
    public AbstractC8472a f20962a;

    /* renamed from: b */
    RecyclerView f20963b;

    /* renamed from: c */
    public BaseFeedDataViewModel f20964c;

    /* renamed from: d */
    public RecyclerView.AbstractC1362i f20965d;

    /* renamed from: e */
    public RecyclerView.AbstractC1361h f20966e;

    /* renamed from: f */
    public AbstractC8634k f20967f;

    /* renamed from: g */
    public boolean f20968g;

    /* renamed from: h */
    public AbstractC8480b f20969h;

    /* renamed from: i */
    public BannerSwipeRefreshLayout.AbstractC8469a f20970i;

    /* renamed from: j */
    public Bundle f20971j;

    /* renamed from: k */
    boolean f20972k;

    /* renamed from: l */
    private AbstractC1204m f20973l;

    /* renamed from: com.bytedance.android.livesdk.feed.a.d$b */
    public interface AbstractC8480b {
        static {
            Covode.recordClassIndex(9333);
        }

        /* renamed from: a */
        void mo14812a();
    }

    static {
        Covode.recordClassIndex(9329);
    }

    private C8476d() {
    }

    /* renamed from: com.bytedance.android.livesdk.feed.a.d$a */
    public static class C8479a {

        /* renamed from: a */
        public AbstractC8472a f20976a;

        /* renamed from: b */
        public RecyclerView f20977b;

        /* renamed from: c */
        public BaseFeedDataViewModel f20978c;

        /* renamed from: d */
        public RecyclerView.AbstractC1362i f20979d;

        /* renamed from: e */
        public int f20980e = 2;

        /* renamed from: f */
        public RecyclerView.AbstractC1361h f20981f;

        /* renamed from: g */
        public AbstractC1204m f20982g;

        /* renamed from: h */
        public boolean f20983h;

        /* renamed from: i */
        public AbstractC8634k f20984i;

        /* renamed from: j */
        public AbstractC8480b f20985j;

        /* renamed from: k */
        public BannerSwipeRefreshLayout.AbstractC8469a f20986k;

        /* renamed from: l */
        public Bundle f20987l;

        static {
            Covode.recordClassIndex(9332);
        }

        public C8479a() {
            StaggeredGridLayoutManager staggeredGridLayoutManager = new StaggeredGridLayoutManager(this.f20980e, 1);
            staggeredGridLayoutManager.mo4793i();
            this.f20979d = staggeredGridLayoutManager;
        }
    }

    /* renamed from: a */
    public final void mo14809a() {
        AbstractC8472a aVar = this.f20962a;
        C84771 r1 = new AbstractC8491o() {
            /* class com.bytedance.android.livesdk.feed.p523a.C8476d.C84771 */

            static {
                Covode.recordClassIndex(9330);
            }

            @Override // com.bytedance.android.livesdk.feed.p523a.AbstractC8491o
            /* renamed from: b */
            public final BannerSwipeRefreshLayout.AbstractC8469a mo14811b() {
                return C8476d.this.f20970i;
            }

            @Override // com.bytedance.android.livesdk.feed.p523a.AbstractC8491o
            /* renamed from: a */
            public final FeedDataKey mo14810a() {
                return C8476d.this.f20964c.mo14994e();
            }
        };
        aVar.f20944k = r1.mo14810a();
        aVar.f20956w = new Object[]{r1, aVar.f20949p, aVar.f20950q, aVar.f20951r, aVar.f20952s, aVar.f20953t};
        this.f20963b.setAdapter(this.f20962a);
        this.f20963b.setLayoutManager(this.f20965d);
        this.f20963b.mo4405a(new RecyclerView.AbstractC1371n() {
            /* class com.bytedance.android.livesdk.feed.p523a.C8476d.C84782 */

            static {
                Covode.recordClassIndex(9331);
            }

            @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1371n
            /* renamed from: a */
            public final void mo4753a(RecyclerView recyclerView, int i) {
                super.mo4753a(recyclerView, i);
                if (i == 0) {
                    AbstractC8472a aVar = C8476d.this.f20962a;
                    aVar.mo14805a(aVar.f20946m, true);
                    if (I18nZhibozhongAnimationTagSetting.INSTANCE.getValue()) {
                        aVar.f20953t.onNext(C11195i.f26825c);
                        return;
                    }
                    return;
                }
                C8476d.this.f20962a.mo14806b();
            }

            @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1371n
            /* renamed from: a */
            public final void mo4754a(RecyclerView recyclerView, int i, int i2) {
                super.mo4754a(recyclerView, i, i2);
                if (i > 0 || i2 > 0) {
                    C8476d.this.f20962a.mo14806b();
                }
            }
        });
        RecyclerView.AbstractC1361h hVar = this.f20966e;
        if (hVar != null) {
            this.f20963b.mo4402a(hVar);
        }
        this.f20962a.mo9336a((PagingViewModel) this.f20964c);
        this.f20962a.f20948o.mo143268a(C8481e.f20988a).mo143254a(new C8482f(this), C8483g.f20990a);
        this.f20962a.f20949p.mo143254a(new C8484h(this), C8485i.f20992a);
        this.f20962a.f20950q.mo143254a(new C8486j(this), C8487k.f20994a);
        this.f20964c.mo14992c();
        this.f20964c.f21481a.mo14936a(this.f20973l);
        this.f20964c.f21482i.observeForever(new C8488l(this));
        this.f20964c.f21495v.observe(this.f20973l, new C8489m(this));
        this.f20964c.f21487n.observe(this.f20973l, new C8490n(this));
    }

    private C8476d(AbstractC1204m mVar, AbstractC8472a aVar, RecyclerView recyclerView, BaseFeedDataViewModel baseFeedDataViewModel) {
        this.f20973l = mVar;
        this.f20962a = aVar;
        this.f20963b = recyclerView;
        this.f20964c = baseFeedDataViewModel;
    }

    public /* synthetic */ C8476d(AbstractC1204m mVar, AbstractC8472a aVar, RecyclerView recyclerView, BaseFeedDataViewModel baseFeedDataViewModel, byte b) {
        this(mVar, aVar, recyclerView, baseFeedDataViewModel);
    }
}
