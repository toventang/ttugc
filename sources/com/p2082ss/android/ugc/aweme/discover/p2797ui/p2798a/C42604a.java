package com.p2082ss.android.ugc.aweme.discover.p2797ui.p2798a;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.p017a.p018a.C0196a;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.services.apm.api.C22708a;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.table.cell.AbstractC23293c;
import com.bytedance.tux.table.cell.TuxTextCell;
import com.p2082ss.android.ugc.aweme.discover.model.SearchUserFeedback;
import com.p2082ss.android.ugc.aweme.discover.p2797ui.p2798a.p2799a.p2801b.C42608a;
import com.p2082ss.android.ugc.aweme.discover.p2797ui.p2798a.p2802b.AbstractC42621b;
import com.p2082ss.android.ugc.aweme.discover.p2797ui.p2798a.p2802b.p2804b.C42622a;
import com.p2082ss.android.ugc.aweme.discover.p2797ui.p2798a.p2802b.p2804b.C42626b;
import com.p2082ss.android.ugc.aweme.discover.p2797ui.p2798a.p2802b.p2804b.C42630c;
import com.p2082ss.android.ugc.aweme.discover.p2797ui.p2798a.p2802b.p2804b.C42633d;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.profile.C63423ai;
import com.p2082ss.android.ugc.aweme.search.p3691g.C67441f;
import com.p2082ss.android.ugc.aweme.search.p3691g.C67442g;
import com.p2082ss.android.ugc.aweme.search.p3691g.C67443h;
import com.p2082ss.android.ugc.aweme.search.p3696l.C67641m;
import com.p2082ss.android.ugc.aweme.utils.C80493gg;
import com.p2082ss.android.ugc.trill.R;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import p4600h.p4611f.p4613b.C89219l;
import p4623i.p4624a.p4625a.p4626a.p4627a.C89393b;

/* renamed from: com.ss.android.ugc.aweme.discover.ui.a.a */
public final class C42604a extends RecyclerView.AbstractC1350a<RecyclerView.ViewHolder> {

    /* renamed from: b */
    public static final C42605a f99385b = new C42605a((byte) 0);

    /* renamed from: e */
    private static final int f99386e = 1;

    /* renamed from: f */
    private static final int f99387f = 2;

    /* renamed from: g */
    private static final int f99388g = 3;

    /* renamed from: h */
    private static final int f99389h = 4;

    /* renamed from: i */
    private static final int f99390i = 5;

    /* renamed from: j */
    private static final int f99391j = -1;

    /* renamed from: a */
    public final AbstractC42621b f99392a;

    /* renamed from: c */
    private List<Object> f99393c;

    /* renamed from: d */
    private Map<String, String> f99394d;

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return m85124a(this, viewGroup, i);
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.a.a$a */
    public static final class C42605a {
        static {
            Covode.recordClassIndex(50709);
        }

        private C42605a() {
        }

        public /* synthetic */ C42605a(byte b) {
            this();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final int getItemCount() {
        List<Object> list = this.f99393c;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    static {
        Covode.recordClassIndex(50708);
    }

    public C42604a(AbstractC42621b bVar) {
        C89219l.m154721d(bVar, "");
        this.f99392a = bVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final int getItemViewType(int i) {
        List<Object> list = this.f99393c;
        if (list == null) {
            C89219l.m154715b();
        }
        Object obj = list.get(i);
        if (obj instanceof String) {
            return f99386e;
        }
        if (obj instanceof C67442g) {
            return f99387f;
        }
        if (obj instanceof C67443h) {
            return f99388g;
        }
        if (obj instanceof C67441f) {
            return f99390i;
        }
        if (obj instanceof SearchUserFeedback) {
            return f99389h;
        }
        return f99391j;
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.a.a$b */
    public static final class C42606b extends RecyclerView.ViewHolder {

        /* renamed from: a */
        final /* synthetic */ ViewGroup f99395a;

        static {
            Covode.recordClassIndex(50710);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C42606b(ViewGroup viewGroup, View view) {
            super(view);
            this.f99395a = viewGroup;
        }
    }

    /* renamed from: a */
    public final void mo72805a(List<Object> list, Map<String, String> map) {
        C89219l.m154721d(list, "");
        this.f99393c = list;
        this.f99394d = map;
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        C89219l.m154721d(viewHolder, "");
        List<Object> list = this.f99393c;
        if (list == null) {
            C89219l.m154715b();
        }
        Object obj = list.get(i);
        if (viewHolder instanceof C42633d) {
            C42633d dVar = (C42633d) viewHolder;
            Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.String");
            String str = (String) obj;
            C89219l.m154721d(str, "");
            dVar.f99451a.setText(str);
            dVar.f99452b.setVisibility(0);
        } else if (viewHolder instanceof C42626b) {
            C42626b bVar = (C42626b) viewHolder;
            Objects.requireNonNull(obj, "null cannot be cast to non-null type com.ss.android.ugc.aweme.search.filter.SubFilterOptionStruct");
            C67442g gVar = (C67442g) obj;
            C89219l.m154721d(gVar, "");
            ((TextView) bVar.f99436a.getValue()).setText(gVar.getName());
            if (gVar.isSelected()) {
                View view = bVar.itemView;
                C89219l.m154716b(view, "");
                bVar.mo72822a().setImageDrawable(C0196a.m619b(view.getContext(), 2131233615));
            } else {
                View view2 = bVar.itemView;
                C89219l.m154716b(view2, "");
                bVar.mo72822a().setImageDrawable(C0196a.m619b(view2.getContext(), 2131233614));
            }
            bVar.mo72822a().setOnClickListener(new C42626b.View$OnClickListenerC42627a(bVar, gVar));
        } else if (viewHolder instanceof C42630c) {
            C42630c cVar = (C42630c) viewHolder;
            Objects.requireNonNull(obj, "null cannot be cast to non-null type com.ss.android.ugc.aweme.search.filter.SubSwitchStruct");
            C67443h hVar = (C67443h) obj;
            C89219l.m154721d(hVar, "");
            cVar.mo72824a().setTitle(hVar.getName());
            if (hVar.getDescription() != null) {
                cVar.mo72824a().setSubtitle(hVar.getDescription());
            }
            TuxTextCell a = cVar.mo72824a();
            View view3 = cVar.itemView;
            C89219l.m154716b(view3, "");
            Context context = view3.getContext();
            C89219l.m154716b(context, "");
            AbstractC23293c.C23309j jVar = new AbstractC23293c.C23309j(context);
            jVar.mo37959c(hVar.isSelected());
            jVar.mo37957a(new C42630c.C42631a(jVar, cVar, hVar));
            a.setAccessory(jVar);
        } else if (viewHolder instanceof C42622a) {
            C42622a aVar = (C42622a) viewHolder;
            Objects.requireNonNull(obj, "null cannot be cast to non-null type com.ss.android.ugc.aweme.search.filter.SearchFilterMore");
            C67441f fVar = (C67441f) obj;
            C89219l.m154721d(fVar, "");
            aVar.f99430b = fVar;
            C89393b.m154951c(aVar.mo72820a());
            aVar.mo72820a().setOnClickListener(new C42622a.View$OnClickListenerC42623a(aVar));
            View view4 = aVar.itemView;
            C89219l.m154716b(view4, "");
            ((TuxTextView) aVar.f99429a.getValue()).setText(view4.getResources().getText(R.string.d4h));
        } else if (viewHolder instanceof C42608a) {
            C42608a aVar2 = (C42608a) viewHolder;
            aVar2.f99401b = this.f99394d;
            Objects.requireNonNull(obj, "null cannot be cast to non-null type com.ss.android.ugc.aweme.discover.model.SearchUserFeedback");
            SearchUserFeedback searchUserFeedback = (SearchUserFeedback) obj;
            C89219l.m154721d(searchUserFeedback, "");
            aVar2.f99400a = searchUserFeedback;
        }
    }

    /* renamed from: a */
    private static RecyclerView.ViewHolder m85124a(C42604a aVar, ViewGroup viewGroup, int i) {
        RecyclerView.ViewHolder viewHolder;
        boolean a;
        MethodCollector.m26663i(6316);
        C89219l.m154721d(viewGroup, "");
        if (i == f99386e) {
            viewHolder = new C42633d(C67641m.m119786a(viewGroup, R.layout.awr));
        } else if (i == f99387f) {
            viewHolder = new C42626b(C67641m.m119786a(viewGroup, R.layout.auk), aVar, aVar.f99392a);
        } else if (i == f99388g) {
            viewHolder = new C42630c(C67641m.m119786a(viewGroup, R.layout.aum), aVar, aVar.f99392a);
        } else if (i == f99389h) {
            C89219l.m154721d(viewGroup, "");
            View a2 = C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), R.layout.avg, viewGroup, false);
            C89219l.m154716b(a2, "");
            viewHolder = new C42608a(a2);
        } else if (i == f99390i) {
            viewHolder = new C42622a(C67641m.m119786a(viewGroup, R.layout.aul), aVar.f99392a);
        } else {
            viewHolder = new C42606b(viewGroup, new View(viewGroup.getContext()));
        }
        try {
            if (viewHolder.itemView.getParent() != null) {
                try {
                    a = SettingsManager.m29616a().mo25400a("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (a) {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("onCreateViewHolder getParent() != null crash hook, holder ").append(viewHolder.getClass().getName()).append(" parent ").append(viewGroup.getClass().getName()).append(" viewType ").append(i);
                    C22708a.m42800a(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) viewHolder.itemView.getParent();
                    if (viewGroup2 != null) {
                        viewGroup2.removeView(viewHolder.itemView);
                    }
                }
            }
        } catch (Exception e) {
            C63423ai.m115002a(e);
            C51423a.m95786a(e);
        }
        C80493gg.f180088a = viewHolder.getClass().getName();
        MethodCollector.m26664o(6316);
        return viewHolder;
    }
}
