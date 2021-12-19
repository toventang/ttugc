package com.p2082ss.android.ugc.aweme.discover.adapter;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39058d;
import com.p2082ss.android.ugc.aweme.common.p2632d.AbstractC39097c;
import com.p2082ss.android.ugc.aweme.discover.helper.C42050t;
import com.p2082ss.android.ugc.aweme.discover.mob.AbstractC42448c;
import com.p2082ss.android.ugc.aweme.discover.mob.C42460j;
import com.p2082ss.android.ugc.aweme.discover.p2760a.C41554x;
import com.p2082ss.android.ugc.aweme.discover.p2766b.View$OnAttachStateChangeListenerC41864g;
import com.p2082ss.android.ugc.aweme.discover.p2774i.C42071c;
import com.p2082ss.android.ugc.aweme.discover.p2795n.AbstractC42474a;
import com.p2082ss.android.ugc.aweme.discover.p2795n.View$OnClickListenerC42476c;
import com.p2082ss.android.ugc.aweme.feed.C48027ac;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.LogPbBean;
import com.p2082ss.android.ugc.aweme.flowfeed.p2993a.AbstractC51043a;
import com.p2082ss.android.ugc.aweme.profile.model.FollowStatus;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.search.model.C67678d;
import com.p2082ss.android.ugc.aweme.search.p3686d.AbstractC67364c;
import com.p2082ss.android.ugc.aweme.search.p3695k.AbstractC67566p;
import com.p2082ss.android.ugc.aweme.search.p3695k.AbstractC67567q;
import com.p2082ss.android.ugc.aweme.search.p3695k.C67486am;
import com.p2082ss.android.ugc.aweme.search.p3695k.C67568r;
import com.p2082ss.android.ugc.trill.R;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.discover.adapter.r */
public final class C41743r extends AbstractC39058d {

    /* renamed from: d */
    public View$OnAttachStateChangeListenerC41864g f97371d;

    /* renamed from: e */
    public AbstractC51043a f97372e;

    /* renamed from: f */
    public C67678d f97373f;

    /* renamed from: g */
    private String f97374g;

    /* renamed from: h */
    private AbstractC67364c f97375h;

    /* renamed from: i */
    private C42071c f97376i;

    /* renamed from: j */
    private AbstractC39097c f97377j;

    /* renamed from: k */
    private int f97378k;

    /* renamed from: w */
    private int f97379w;

    /* renamed from: x */
    private C42050t<Aweme> f97380x = new C42050t<>(this);

    static {
        Covode.recordClassIndex(49656);
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39063h
    /* renamed from: b */
    public final void mo67817b(View view) {
        if (view != null) {
            view.setPadding(0, 0, 0, 0);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39060f
    /* renamed from: b */
    public final void mo62376b(List<Aweme> list) {
        super.mo62376b(list);
        this.f97380x.mo71221a(list, C41745t.f97382a);
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39060f
    /* renamed from: b_ */
    public final void mo62377b_(List<Aweme> list) {
        super.mo62377b_(list);
        this.f97380x.mo71221a(list, C41744s.f97381a);
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39063h
    /* renamed from: c_ */
    public final int mo63367c_(View view) {
        if (view == null) {
            return 0;
        }
        return (int) C13628n.m24520b(view.getContext(), 45.0f);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a, com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39058d, com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39063h
    public final void onViewDetachedFromWindow(RecyclerView.ViewHolder viewHolder) {
        super.onViewDetachedFromWindow(viewHolder);
        if (viewHolder instanceof AbstractC67566p) {
            C42460j.C42461a.m84866b(viewHolder.itemView);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a, com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39058d, com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39063h
    public final void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
        C42071c cVar;
        AbstractC39097c cVar2;
        super.onViewAttachedToWindow(viewHolder);
        if (viewHolder instanceof AbstractC67566p) {
            C42460j.C42461a.m84865a(viewHolder.itemView, ((AbstractC67566p) viewHolder).mo70877F());
        }
        if (viewHolder.getItemViewType() == 0 && (cVar = this.f97376i) != null && cVar.f114989bu && (cVar2 = this.f97377j) != null) {
            cVar2.mo67855a(viewHolder);
        }
        if (viewHolder instanceof View$OnClickListenerC42476c) {
            ((View$OnClickListenerC42476c) viewHolder).mo72645a("search_result");
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39058d
    /* renamed from: a */
    public final void mo67804a(FollowStatus followStatus) {
        User author;
        if (!(this.f92236l == null || this.f92236l.isEmpty() || followStatus == null || TextUtils.isEmpty(followStatus.userId))) {
            for (Aweme aweme : this.f92236l) {
                if (!(aweme == null || (author = aweme.getAuthor()) == null || !followStatus.userId.equals(author.getUid()))) {
                    author.setFollowStatus(followStatus.followStatus);
                }
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.base.widget.AbstractC34766g
    /* renamed from: b */
    public final RecyclerView.ViewHolder mo61482b(ViewGroup viewGroup, int i) {
        int i2;
        View$OnClickListenerC42476c cVar = null;
        if (this.f97379w == 9) {
            LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
            if (C41554x.m83488a()) {
                i2 = R.layout.awp;
            } else {
                i2 = R.layout.av9;
            }
            View$OnClickListenerC42476c cVar2 = new View$OnClickListenerC42476c(C1764a.m5927a(from, i2, viewGroup, false), this.f97374g, this.f97375h, null);
            cVar2.mo72640a(this.f97371d);
            cVar2.mo72643a(this.f97372e);
            cVar = cVar2;
        } else if (this.f97378k == 1) {
            cVar = new View$OnClickListenerC42476c(C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), R.layout.aus, viewGroup, false), this.f97374g, this.f97375h);
        }
        View$OnAttachStateChangeListenerC41864g gVar = this.f97371d;
        if (gVar != null) {
            gVar.mo71030a(cVar);
        }
        return cVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.base.widget.AbstractC34766g
    /* renamed from: b */
    public final void mo61483b(RecyclerView.ViewHolder viewHolder, int i) {
        String str;
        String str2;
        int i2;
        boolean z = false;
        if (viewHolder instanceof AbstractC67566p) {
            AbstractC67566p pVar = (AbstractC67566p) viewHolder;
            Aweme aweme = (Aweme) this.f92236l.get(i);
            AbstractC67567q a = C67486am.m119564a();
            String str3 = "normal";
            String str4 = "";
            if (a != null) {
                str4 = a.mo106431c().f151151a;
                str2 = a.mo106431c().f151152b;
                i2 = a.mo106426a();
                str3 = a.mo106431c().f151153c;
                str = a.mo106431c().f151154d;
            } else {
                str = str3;
                str2 = str4;
                i2 = 0;
            }
            String requestId = aweme.getRequestId();
            new LogPbBean().setImprId(requestId);
            String b = C48027ac.C48028a.f111257a.mo80057b(requestId);
            String a2 = AbstractC42448c.AbstractC42450b.C42451a.m84856a(4);
            String a3 = AbstractC42448c.C42449a.m84855a(4);
            C67568r g = C67568r.C67569a.m119673a().mo106518g("search_result");
            g.f151306a = false;
            C67568r j = g.mo106519h(str4).mo106520i(requestId).mo106521j(b);
            j.f151307b = i2;
            j.f151318m = i;
            C67568r f = j.mo106517f(str2);
            f.f151308c = 4;
            pVar.mo70880a(f.mo106515d(a2).mo106516e(a3).mo106523l(str3).mo106524m(str).mo106508a(C41746u.f97383a));
        }
        if (this.f97379w == 9) {
            View$OnClickListenerC42476c cVar = (View$OnClickListenerC42476c) viewHolder;
            Aweme aweme2 = (Aweme) this.f92236l.get(i);
            C42071c cVar2 = this.f97376i;
            if (cVar2 == null || cVar2.f114989bu) {
                z = true;
            }
            cVar.mo72642a(aweme2, i, z);
        } else if (this.f97378k == 1) {
            View$OnClickListenerC42476c cVar3 = (View$OnClickListenerC42476c) viewHolder;
            Aweme aweme3 = (Aweme) this.f92236l.get(i);
            C42071c cVar4 = this.f97376i;
            if (cVar4 == null || cVar4.f114989bu) {
                z = true;
            }
            cVar3.mo72642a(aweme3, i, z);
        }
    }

    public C41743r(C42071c cVar, String str, AbstractC67364c cVar2, AbstractC39097c<AbstractC42474a> cVar3, int i) {
        this.f97374g = str;
        this.f97375h = cVar2;
        this.f97376i = cVar;
        this.f97377j = cVar3;
        this.f97378k = 0;
        this.f97379w = i;
    }
}
