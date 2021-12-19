package com.p2082ss.android.ugc.aweme.discover.p2774i;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import androidx.recyclerview.widget.C1434i;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.bytedance.common.utility.collection.C13603b;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.widget.DmtStatusView;
import com.p2082ss.android.ugc.aweme.base.utils.C34728n;
import com.p2082ss.android.ugc.aweme.challenge.p2454ui.C35672z;
import com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39058d;
import com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39063h;
import com.p2082ss.android.ugc.aweme.common.p2632d.C39092a;
import com.p2082ss.android.ugc.aweme.discover.adapter.C41743r;
import com.p2082ss.android.ugc.aweme.discover.p2767c.C41893a;
import com.p2082ss.android.ugc.aweme.discover.p2795n.AbstractC42474a;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.p2949i.C49672ag;
import com.p2082ss.android.ugc.aweme.feed.p2957n.AbstractC49762o;
import com.p2082ss.android.ugc.aweme.feed.p2963q.AbstractC49887w;
import com.p2082ss.android.ugc.aweme.performance.C62845i;
import com.p2082ss.android.ugc.aweme.search.p3686d.AbstractC67364c;
import com.p2082ss.android.ugc.aweme.utils.C80472gc;
import com.p2082ss.android.ugc.aweme.views.AbstractC81445m;
import com.p2082ss.android.ugc.trill.R;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import org.greenrobot.eventbus.AbstractC90252i;
import org.greenrobot.eventbus.AbstractC90253j;
import org.greenrobot.eventbus.AbstractC90264r;
import org.greenrobot.eventbus.RunnableC90250g;
import org.greenrobot.eventbus.ThreadMode;

/* renamed from: com.ss.android.ugc.aweme.discover.i.a */
public abstract class AbstractC42068a extends AbstractC49887w implements AbstractC90252i, AbstractC90253j {

    /* renamed from: j */
    private static int f98072j;

    /* renamed from: a */
    protected AbstractC67364c f98073a;

    /* renamed from: b */
    protected AbstractC49762o f98074b;

    /* renamed from: c */
    protected C39092a f98075c;

    /* renamed from: d */
    protected DmtStatusView f98076d;

    /* renamed from: e */
    public RecyclerView f98077e;

    /* renamed from: f */
    protected C41743r f98078f;

    /* renamed from: g */
    public C41893a f98079g;

    /* renamed from: h */
    public boolean f98080h;

    /* renamed from: i */
    private int f98081i;

    static {
        Covode.recordClassIndex(50002);
    }

    /* renamed from: a */
    public abstract RecyclerView.AbstractC1362i mo71246a();

    @Override // com.p2082ss.android.ugc.aweme.feed.p2963q.AbstractC49887w
    public final boolean aE_() {
        return true;
    }

    /* renamed from: c */
    public abstract RecyclerView.AbstractC1361h mo71250c();

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public abstract C41743r mo71251d();

    @Override // org.greenrobot.eventbus.AbstractC90252i
    public Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(2, new RunnableC90250g(AbstractC42068a.class, "onVideoEvent", C49672ag.class, ThreadMode.POSTING, 0, false));
        return hashMap;
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final void mo71252j() {
        this.f98077e.post(new RunnableC42070b(this));
    }

    /* renamed from: a */
    public final void mo71247a(AbstractC39063h.AbstractC39067a aVar) {
        C41743r rVar = this.f98078f;
        if (rVar != null) {
            rVar.mo67813a(aVar);
        }
    }

    @AbstractC90264r
    public void onVideoEvent(C49672ag agVar) {
        int a;
        Aweme aweme;
        if (mo84730bE()) {
            int i = agVar.f114315a;
            if (i == 2) {
                String str = (String) agVar.f114316b;
                if (!(TextUtils.isEmpty(str) || (a = this.f98078f.mo67803a(str)) < 0 || C13603b.m24435a((Collection) ((AbstractC39058d) this.f98078f).f92236l))) {
                    if (this.f98078f.mo61481b() != null) {
                        ((AbstractC39058d) this.f98078f).f92236l.remove(a - 1);
                    } else {
                        ((AbstractC39058d) this.f98078f).f92236l.remove(a);
                    }
                    this.f98078f.notifyItemRemoved(a);
                    if (this.f98078f.getItemCount() == 0) {
                        this.f98076d.setVisibility(0);
                        this.f98076d.mo27385g();
                        this.f98078f.ap_();
                    }
                }
            } else if (i == 13) {
                int childCount = this.f98077e.getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    RecyclerView.ViewHolder a2 = this.f98077e.mo4393a(this.f98077e.getChildAt(i2));
                    if (a2.getItemViewType() == 0) {
                        ((AbstractC42474a) a2).mo72624G();
                    }
                }
            } else if (i != 21) {
                if (i == 22) {
                    this.f98078f.notifyDataSetChanged();
                    if (this.f98078f.getItemCount() == 0) {
                        this.f98076d.setVisibility(0);
                        this.f98076d.mo27385g();
                        this.f98078f.ap_();
                    }
                }
            } else if (this.f114989bu && (aweme = (Aweme) agVar.f114316b) != null) {
                mo71248a(agVar, this.f98078f.mo67803a(aweme.getAid()), aweme);
            }
        }
    }

    public AbstractC42068a(AbstractC67364c cVar, AbstractC49762o oVar) {
        this.f98073a = cVar;
        this.f98074b = oVar;
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81910b, com.p2082ss.android.ugc.aweme.feed.p2963q.AbstractC49887w
    /* renamed from: a */
    public void mo70393a(View view, Bundle bundle) {
        C35672z zVar;
        this.f98076d = (DmtStatusView) view.findViewById(R.id.e7i);
        this.f98077e = (RecyclerView) view.findViewById(R.id.c_f);
        super.mo70393a(view, bundle);
        this.f98077e.setLayoutManager(mo71246a());
        this.f98077e.mo4402a(mo71250c());
        this.f98077e.setItemAnimator(new C1434i());
        this.f98078f = mo71251d();
        C41893a aVar = new C41893a(this.f98078f);
        this.f98079g = aVar;
        this.f98077e.setAdapter(aVar);
        if (!C62845i.m113257a()) {
            zVar = new C35672z();
            this.f98077e.mo4405a(zVar);
        } else {
            zVar = null;
        }
        this.f98077e = C80472gc.m139484a(this.f98077e, this.f98074b, 2);
        this.f98075c = new C39092a(this.f98077e, zVar);
        this.f98077e.mo4405a(new RecyclerView.AbstractC1371n() {
            /* class com.p2082ss.android.ugc.aweme.discover.p2774i.AbstractC42068a.C420691 */

            static {
                Covode.recordClassIndex(50003);
            }

            @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1371n
            /* renamed from: a */
            public final void mo4753a(RecyclerView recyclerView, int i) {
                if (i == 0 && AbstractC42068a.this.f98078f.getItemCount() > 1 && AbstractC42068a.this.f98080h) {
                    AbstractC42068a.this.f98078f.notifyItemChanged(1);
                    AbstractC42068a.this.f98080h = false;
                }
            }
        });
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo71248a(C49672ag agVar, int i, Aweme aweme) {
        RecyclerView recyclerView;
        if (f98072j == 0) {
            f98072j = this.f183419bv.getResources().getDimensionPixelOffset(R.dimen.n5);
        }
        if (i != -1 && (this.f98077e.getLayoutManager() instanceof AbstractC81445m)) {
            if (this.f98077e.getLayoutManager() instanceof StaggeredGridLayoutManager) {
                StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) this.f98077e.getLayoutManager();
                if (this.f98081i == 0 && (recyclerView = this.f98077e) != null) {
                    this.f98081i = recyclerView.getHeight();
                }
                staggeredGridLayoutManager.mo4347a(i, (this.f98081i - C34728n.m70946a(200.0d)) / 2);
            } else if (this.f98077e.getLayoutManager() instanceof GridLayoutManager) {
                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) this.f98077e.getLayoutManager();
                int k = linearLayoutManager.mo4371k();
                int m = linearLayoutManager.mo4373m();
                if (i < k || i > m) {
                    ((AbstractC81445m) this.f98077e.getLayoutManager()).mo125099a(i, 0);
                } else {
                    return;
                }
            }
            this.f98080h = true;
        }
    }
}
