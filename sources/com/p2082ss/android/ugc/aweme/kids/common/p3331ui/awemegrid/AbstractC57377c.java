package com.p2082ss.android.ugc.aweme.kids.common.p3331ui.awemegrid;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.AbstractC1214u;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.status.TuxStatusView;
import com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a;
import com.p2082ss.android.ugc.aweme.base.widget.AbstractC34766g;
import com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39060f;
import com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39063h;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.AwemeStatistics;
import com.p2082ss.android.ugc.aweme.feed.p2957n.AbstractC49762o;
import com.p2082ss.android.ugc.aweme.feed.p2957n.C49763p;
import com.p2082ss.android.ugc.aweme.kids.common.p3329b.C57346a;
import com.p2082ss.android.ugc.aweme.kids.common.p3329b.C57347b;
import com.p2082ss.android.ugc.aweme.kids.common.p3331ui.awemegrid.KidsAwemeGridViewModel;
import com.p2082ss.android.ugc.aweme.kids.common.p3331ui.p3332a.AbstractC57367d;
import com.p2082ss.android.ugc.aweme.utils.C80298cg;
import com.p2082ss.android.ugc.aweme.views.WrapGridLayoutManager;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.greenrobot.eventbus.AbstractC90252i;
import org.greenrobot.eventbus.AbstractC90253j;
import org.greenrobot.eventbus.AbstractC90264r;
import org.greenrobot.eventbus.RunnableC90250g;
import org.greenrobot.eventbus.ThreadMode;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4601a.C89086z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.kids.common.ui.awemegrid.c */
public abstract class AbstractC57377c extends AbstractC34586a implements AbstractC39063h.AbstractC39067a, AbstractC49762o, AbstractC57367d, AbstractC90252i, AbstractC90253j {

    /* renamed from: a */
    public RecyclerView f130782a;

    /* renamed from: b */
    public AbstractC57374a f130783b;

    /* renamed from: c */
    public KidsAwemeGridViewModel f130784c;

    /* renamed from: d */
    public C57375b f130785d;

    /* renamed from: e */
    public TuxStatusView f130786e;

    /* renamed from: j */
    private final AbstractC89244h f130787j = C89250i.m154773a((AbstractC89171a) new C57382e(this));

    /* renamed from: k */
    private boolean f130788k;

    /* renamed from: l */
    private HashMap f130789l;

    static {
        Covode.recordClassIndex(67296);
    }

    /* renamed from: a */
    public abstract void mo94637a();

    /* renamed from: a */
    public abstract void mo94638a(View view, Aweme aweme);

    /* renamed from: b */
    public abstract boolean mo94639b();

    /* renamed from: c */
    public abstract String mo94640c();

    /* renamed from: d */
    public abstract View mo94641d();

    @Override // org.greenrobot.eventbus.AbstractC90252i
    public Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(84, new RunnableC90250g(AbstractC57377c.class, "onReportEvent", C57347b.class, ThreadMode.MAIN, 0, false));
        hashMap.put(85, new RunnableC90250g(AbstractC57377c.class, "onChangeDiggEvent", C57346a.class, ThreadMode.MAIN, 0, false));
        return hashMap;
    }

    /* renamed from: m */
    public void mo94646m() {
        HashMap hashMap = this.f130789l;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo94646m();
    }

    /* renamed from: com.ss.android.ugc.aweme.kids.common.ui.awemegrid.c$a */
    public static final class C57378a extends GridLayoutManager.AbstractC1337c {
        static {
            Covode.recordClassIndex(67297);
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.AbstractC1337c
        /* renamed from: a */
        public final int mo4342a(int i) {
            return 1;
        }

        C57378a() {
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.p2957n.AbstractC49762o
    public final void ba_() {
        mo62679l();
    }

    /* renamed from: g */
    public void mo94643g() {
        mo94645k();
    }

    /* renamed from: j */
    public void mo94644j() {
        mo94645k();
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        C80298cg.m139205b(this);
    }

    /* renamed from: com.ss.android.ugc.aweme.kids.common.ui.awemegrid.c$e */
    static final class C57382e extends AbstractC89220m implements AbstractC89171a<WrapGridLayoutManager> {

        /* renamed from: a */
        final /* synthetic */ AbstractC57377c f130793a;

        static {
            Covode.recordClassIndex(67301);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C57382e(AbstractC57377c cVar) {
            super(0);
            this.f130793a = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ WrapGridLayoutManager invoke() {
            this.f130793a.getContext();
            return new WrapGridLayoutManager(3, 1);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.p2957n.AbstractC49762o
    public final boolean bn_() {
        AbstractC57374a aVar = this.f130783b;
        if (aVar == null || !aVar.mo94634a()) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final void mo94642e() {
        mo95043n();
        KidsAwemeGridViewModel kidsAwemeGridViewModel = this.f130784c;
        if (kidsAwemeGridViewModel != null) {
            kidsAwemeGridViewModel.mo94633a();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public final void mo94645k() {
        TuxStatusView tuxStatusView = this.f130786e;
        if (tuxStatusView != null) {
            tuxStatusView.setVisibility(8);
        }
        this.f130788k = false;
    }

    /* renamed from: n */
    private final void mo95043n() {
        TuxStatusView tuxStatusView = this.f130786e;
        if (tuxStatusView != null) {
            tuxStatusView.setVisibility(0);
        }
        TuxStatusView tuxStatusView2 = this.f130786e;
        if (tuxStatusView2 != null) {
            tuxStatusView2.mo37867a();
        }
        this.f130788k = true;
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39063h.AbstractC39067a
    /* renamed from: l */
    public final void mo62679l() {
        AbstractC88412b bVar;
        View view;
        C57375b bVar2 = this.f130785d;
        if (bVar2 != null) {
            bVar2.ao_();
        }
        C57375b bVar3 = this.f130785d;
        if (bVar3 != null) {
            bVar3.mo67829d(true);
        }
        C57375b bVar4 = this.f130785d;
        if (!(bVar4 == null || (view = ((AbstractC34766g) bVar4).f82109c) == null)) {
            view.setVisibility(0);
        }
        KidsAwemeGridViewModel kidsAwemeGridViewModel = this.f130784c;
        if (kidsAwemeGridViewModel != null && kidsAwemeGridViewModel.f130767e != null) {
            AbstractC88412b bVar5 = kidsAwemeGridViewModel.f130766d;
            if (!(bVar5 == null || bVar5.isDisposed() || (bVar = kidsAwemeGridViewModel.f130766d) == null)) {
                bVar.dispose();
            }
            kidsAwemeGridViewModel.f130766d = kidsAwemeGridViewModel.f130767e.mo94636c().mo143292d(new KidsAwemeGridViewModel.C57368a(kidsAwemeGridViewModel)).mo143254a(new KidsAwemeGridViewModel.C57369b(kidsAwemeGridViewModel), new KidsAwemeGridViewModel.C57370c(kidsAwemeGridViewModel));
        }
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C80298cg.m139204a(this);
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.p2957n.AbstractC49762o
    /* renamed from: a */
    public final void mo59513a(boolean z) {
        if (!z) {
            C57375b bVar = this.f130785d;
            if (bVar != null) {
                bVar.mo67813a((AbstractC39063h.AbstractC39067a) null);
            }
            C57375b bVar2 = this.f130785d;
            if (bVar2 != null) {
                bVar2.ap_();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.kids.common.ui.awemegrid.c$b */
    static final class C57379b<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ AbstractC57377c f130790a;

        static {
            Covode.recordClassIndex(67298);
        }

        C57379b(AbstractC57377c cVar) {
            this.f130790a = cVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            RecyclerView.AbstractC1350a aVar;
            List<T> list = (List) obj;
            RecyclerView recyclerView = this.f130790a.f130782a;
            if (recyclerView != null) {
                aVar = recyclerView.getAdapter();
            } else {
                aVar = null;
            }
            Objects.requireNonNull(aVar, "null cannot be cast to non-null type com.ss.android.ugc.aweme.kids.common.ui.awemegrid.KidsAwemeGridAdapter");
            AbstractC39060f fVar = (AbstractC39060f) aVar;
            if (fVar != null) {
                fVar.mo62377b_(list);
            }
            if (list.isEmpty()) {
                this.f130790a.mo94643g();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.kids.common.ui.awemegrid.c$c */
    static final class C57380c<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ AbstractC57377c f130791a;

        static {
            Covode.recordClassIndex(67299);
        }

        C57380c(AbstractC57377c cVar) {
            this.f130791a = cVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            Integer num = (Integer) obj;
            if (num != null) {
                if (num.intValue() == 0) {
                    this.f130791a.mo94645k();
                    return;
                } else if (num.intValue() == -2) {
                    this.f130791a.mo94644j();
                    return;
                }
            }
            this.f130791a.mo94643g();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.kids.common.ui.awemegrid.c$d */
    static final class C57381d<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ AbstractC57377c f130792a;

        static {
            Covode.recordClassIndex(67300);
        }

        C57381d(AbstractC57377c cVar) {
            this.f130792a = cVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            Integer num = (Integer) obj;
            if (num != null) {
                if (num.intValue() == 0) {
                    C57375b bVar = this.f130792a.f130785d;
                    if (bVar != null) {
                        bVar.aq_();
                        return;
                    }
                    return;
                } else if (num.intValue() == -2) {
                    AbstractC57377c cVar = this.f130792a;
                    C57375b bVar2 = cVar.f130785d;
                    if (bVar2 != null) {
                        bVar2.mo67812a(cVar.f130782a, false);
                        return;
                    }
                    return;
                }
            }
            AbstractC57377c cVar2 = this.f130792a;
            C57375b bVar3 = cVar2.f130785d;
            if (bVar3 != null) {
                bVar3.ap_();
            }
            cVar2.mo94637a();
        }
    }

    @AbstractC90264r(mo145422a = ThreadMode.MAIN)
    public final void onChangeDiggEvent(C57346a aVar) {
        C89219l.m154721d(aVar, "");
        KidsAwemeGridViewModel kidsAwemeGridViewModel = this.f130784c;
        if (kidsAwemeGridViewModel != null) {
            C89219l.m154721d(aVar, "");
            List<Aweme> value = kidsAwemeGridViewModel.f130763a.getValue();
            if (value == null) {
                value = C89086z.INSTANCE;
            }
            for (Aweme aweme : value) {
                if (aweme.getAid().equals(aVar.f130718a)) {
                    if (aVar.f130719b) {
                        aweme.setUserDigg(1);
                        AwemeStatistics statistics = aweme.getStatistics();
                        C89219l.m154716b(statistics, "");
                        statistics.setDiggCount(statistics.getDiggCount() + 1);
                        return;
                    }
                    aweme.setUserDigg(0);
                    AwemeStatistics statistics2 = aweme.getStatistics();
                    C89219l.m154716b(statistics2, "");
                    statistics2.setDiggCount(statistics2.getDiggCount() - 1);
                    return;
                }
            }
        }
    }

    @AbstractC90264r(mo145422a = ThreadMode.MAIN)
    public final void onReportEvent(C57347b bVar) {
        C89219l.m154721d(bVar, "");
        KidsAwemeGridViewModel kidsAwemeGridViewModel = this.f130784c;
        if (kidsAwemeGridViewModel != null) {
            C89219l.m154721d(bVar, "");
            List<Aweme> value = kidsAwemeGridViewModel.f130763a.getValue();
            if (value == null) {
                value = new ArrayList<>();
            }
            Iterator<Aweme> it = value.iterator();
            while (it.hasNext()) {
                if (it.next().getAid().equals(bVar.f130720a)) {
                    it.remove();
                }
            }
            kidsAwemeGridViewModel.f130763a.postValue(value);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        C89219l.m154721d(view, "");
        super.onViewCreated(view, bundle);
        this.f130782a = (RecyclerView) view.findViewById(R.id.c1x);
        this.f130786e = (TuxStatusView) view.findViewById(R.id.c1y);
        RecyclerView recyclerView = this.f130782a;
        if (recyclerView != null) {
            recyclerView.setOverScrollMode(2);
        }
        RecyclerView recyclerView2 = this.f130782a;
        if (recyclerView2 != null) {
            recyclerView2.setLayoutManager((WrapGridLayoutManager) this.f130787j.getValue());
        }
        if (getContext() != null) {
            C57375b bVar = new C57375b(mo94640c(), this, mo94639b());
            this.f130785d = bVar;
            bVar.f130776d = mo94641d();
            C57375b bVar2 = this.f130785d;
            if (bVar2 != null) {
                bVar2.mo67813a((AbstractC39063h.AbstractC39067a) this);
            }
            C57375b bVar3 = this.f130785d;
            if (bVar3 != null) {
                bVar3.f92247s = new C57378a();
            }
        }
        AbstractC57374a aVar = this.f130783b;
        if (aVar != null) {
            KidsAwemeGridViewModel kidsAwemeGridViewModel = new KidsAwemeGridViewModel(aVar);
            kidsAwemeGridViewModel.f130763a.observe(this, new C57379b(this));
            kidsAwemeGridViewModel.f130764b.observe(this, new C57380c(this));
            kidsAwemeGridViewModel.f130765c.observe(this, new C57381d(this));
            this.f130784c = kidsAwemeGridViewModel;
        }
        RecyclerView recyclerView3 = this.f130782a;
        if (recyclerView3 != null) {
            recyclerView3.setAdapter(this.f130785d);
        }
        RecyclerView recyclerView4 = this.f130782a;
        if (recyclerView4 != null) {
            recyclerView4.setOnFlingListener(new C49763p(this.f130782a, this));
        }
        mo94642e();
    }

    @Override // com.p2082ss.android.ugc.aweme.kids.common.p3331ui.p3332a.AbstractC57367d
    /* renamed from: a */
    public final void mo94631a(View view, Aweme aweme, String str) {
        mo94638a(view, aweme);
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C89219l.m154721d(layoutInflater, "");
        return C1764a.m5927a(layoutInflater, R.layout.abp, viewGroup, false);
    }
}
