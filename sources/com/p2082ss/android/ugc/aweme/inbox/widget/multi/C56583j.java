package com.p2082ss.android.ugc.aweme.inbox.widget.multi;

import android.content.Context;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.AbstractC1483t;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.services.apm.api.C22708a;
import com.p2082ss.android.ugc.aweme.common.C39109f;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.inbox.widget.C56520b;
import com.p2082ss.android.ugc.aweme.inbox.widget.multi.MultiViewModel;
import com.p2082ss.android.ugc.aweme.inbox.widget.multi.p3273a.AbstractC56557f;
import com.p2082ss.android.ugc.aweme.inbox.widget.multi.p3273a.C56533a;
import com.p2082ss.android.ugc.aweme.inbox.widget.multi.p3273a.C56546c;
import com.p2082ss.android.ugc.aweme.inbox.widget.multi.p3273a.C56553e;
import com.p2082ss.android.ugc.aweme.inbox.widget.multi.p3273a.C56561g;
import com.p2082ss.android.ugc.aweme.inbox.widget.multi.p3273a.View$OnClickListenerC56548d;
import com.p2082ss.android.ugc.aweme.profile.C63423ai;
import com.p2082ss.android.ugc.aweme.recommend.users.RecommendUserService;
import com.p2082ss.android.ugc.aweme.recommend.users.RecommendUserServiceImpl;
import com.p2082ss.android.ugc.aweme.utils.C80493gg;
import com.p2082ss.android.ugc.trill.R;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.inbox.widget.multi.j */
public final class C56583j extends AbstractC1483t<AbstractC56585k, RecyclerView.ViewHolder> {

    /* renamed from: b */
    final SparseArray<C56520b> f129014b;

    /* renamed from: c */
    public final Fragment f129015c;

    /* renamed from: d */
    private final AbstractC89244h f129016d;

    static {
        Covode.recordClassIndex(66406);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return m102555a(this, viewGroup, i);
    }

    /* renamed from: com.ss.android.ugc.aweme.inbox.widget.multi.j$a */
    static final class C56584a extends AbstractC89220m implements AbstractC89171a<MultiViewModel> {

        /* renamed from: a */
        final /* synthetic */ C56583j f129017a;

        static {
            Covode.recordClassIndex(66407);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C56584a(C56583j jVar) {
            super(0);
            this.f129017a = jVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ MultiViewModel invoke() {
            return MultiViewModel.C56526a.m102502a(this.f129017a.f129015c);
        }
    }

    public /* synthetic */ C56583j(Fragment fragment) {
        this(fragment, new C56586l());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final long getItemId(int i) {
        return (long) ((AbstractC56585k) mo5017a(i)).hashCode();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final int getItemViewType(int i) {
        return ((AbstractC56585k) mo5017a(i)).f129018j;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
        C89219l.m154721d(viewHolder, "");
        if (viewHolder instanceof AbstractC56557f) {
            ((AbstractC56557f) viewHolder).bP_();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final void onViewDetachedFromWindow(RecyclerView.ViewHolder viewHolder) {
        C89219l.m154721d(viewHolder, "");
        if (viewHolder instanceof AbstractC56557f) {
            ((AbstractC56557f) viewHolder).mo93483b();
        }
    }

    /* renamed from: a */
    private static View m102554a(int i, ViewGroup viewGroup) {
        View a = C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), i, viewGroup, false);
        C89219l.m154716b(a, "");
        return a;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private C56583j(Fragment fragment, C56586l lVar) {
        super(lVar);
        C89219l.m154721d(fragment, "");
        C89219l.m154721d(lVar, "");
        this.f129015c = fragment;
        setHasStableIds(true);
        this.f129016d = C89250i.m154773a((AbstractC89171a) new C56584a(this));
        this.f129014b = new SparseArray<>();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        C89219l.m154721d(viewHolder, "");
        Object obj = null;
        if (!(viewHolder instanceof AbstractC56557f)) {
            viewHolder = null;
        }
        AbstractC56557f fVar = (AbstractC56557f) viewHolder;
        if (fVar != null) {
            Object a = mo5017a(i);
            C89219l.m154716b(a, "");
            C89219l.m154721d(a, "");
            if (a instanceof AbstractC56585k) {
                obj = a;
            }
            AbstractC56585k kVar = (AbstractC56585k) obj;
            if (kVar != null) {
                fVar.f128956g = (T) ((AbstractC56585k) a);
                fVar.mo93479a(kVar);
                return;
            }
            View view = fVar.itemView;
            C89219l.m154716b(view, "");
            view.setVisibility(8);
            C39109f.m79404c("MultiBaseVH", "MultiBaseVH innerOnBind data type is not match!");
        }
    }

    /* renamed from: a */
    private static RecyclerView.ViewHolder m102555a(C56583j jVar, ViewGroup viewGroup, int i) {
        AbstractC56557f aVar;
        MethodCollector.m26663i(2037);
        C89219l.m154721d(viewGroup, "");
        boolean z = true;
        if (i == 0) {
            aVar = new C56533a(m102554a((int) R.layout.k7, viewGroup));
        } else if (i == 1) {
            RecommendUserService b = RecommendUserServiceImpl.m118456b();
            Context context = viewGroup.getContext();
            C89219l.m154716b(context, "");
            aVar = new C56546c(b.mo105668a(context));
        } else if (i == 2) {
            aVar = new C56553e(m102554a((int) R.layout.kj, viewGroup), jVar.f129015c);
        } else if (i != 13) {
            aVar = new C56561g(m102554a((int) R.layout.l_, viewGroup));
        } else {
            aVar = new View$OnClickListenerC56548d(m102554a((int) R.layout.k5, viewGroup));
        }
        MultiViewModel multiViewModel = (MultiViewModel) jVar.f129016d.getValue();
        C89219l.m154721d(multiViewModel, "");
        aVar.f128957h = multiViewModel;
        Fragment fragment = jVar.f129015c;
        C89219l.m154721d(fragment, "");
        aVar.f128958i = fragment;
        C56520b bVar = jVar.f129014b.get(i);
        if (bVar != null) {
            aVar.mo87499a(bVar);
        }
        try {
            if (aVar.itemView.getParent() != null) {
                try {
                    z = SettingsManager.m29616a().mo25400a("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (z) {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("onCreateViewHolder getParent() != null crash hook, holder ").append(aVar.getClass().getName()).append(" parent ").append(viewGroup.getClass().getName()).append(" viewType ").append(i);
                    C22708a.m42800a(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) aVar.itemView.getParent();
                    if (viewGroup2 != null) {
                        viewGroup2.removeView(aVar.itemView);
                    }
                }
            }
        } catch (Exception e) {
            C63423ai.m115002a(e);
            C51423a.m95786a(e);
        }
        C80493gg.f180088a = aVar.getClass().getName();
        MethodCollector.m26664o(2037);
        return aVar;
    }
}
