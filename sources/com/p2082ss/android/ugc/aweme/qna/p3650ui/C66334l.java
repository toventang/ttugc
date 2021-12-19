package com.p2082ss.android.ugc.aweme.qna.p3650ui;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.AbstractC1483t;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.services.apm.api.C22708a;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.profile.C63423ai;
import com.p2082ss.android.ugc.aweme.qna.model.C66293f;
import com.p2082ss.android.ugc.aweme.qna.model.C66296h;
import com.p2082ss.android.ugc.aweme.qna.p3645c.C66018a;
import com.p2082ss.android.ugc.aweme.qna.p3645c.C66024d;
import com.p2082ss.android.ugc.aweme.qna.p3649g.C66286e;
import com.p2082ss.android.ugc.aweme.qna.p3650ui.C66340p;
import com.p2082ss.android.ugc.aweme.qna.p3651vm.AbstractC66363i;
import com.p2082ss.android.ugc.aweme.utils.C80493gg;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.qna.ui.l */
public final class C66334l extends AbstractC1483t<C66293f, C66318g> {

    /* renamed from: b */
    public static final C66335a f149162b = new C66335a((byte) 0);

    /* renamed from: c */
    private final C66024d f149163c;

    /* renamed from: d */
    private final C66018a f149164d;

    /* renamed from: e */
    private final AbstractC66363i f149165e;

    /* renamed from: f */
    private final C66286e f149166f;

    static {
        Covode.recordClassIndex(77845);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final /* synthetic */ RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return m117982a(this, viewGroup, i);
    }

    /* renamed from: com.ss.android.ugc.aweme.qna.ui.l$a */
    public static final class C66335a {
        static {
            Covode.recordClassIndex(77846);
        }

        private C66335a() {
        }

        public /* synthetic */ C66335a(byte b) {
            this();
        }
    }

    public /* synthetic */ C66334l(AbstractC66363i iVar) {
        this(iVar, null);
    }

    /* renamed from: a */
    private final void m117983a(C66296h hVar) {
        this.f149163c.mo105078a(hVar);
        this.f149164d.mo105077a(hVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final int getItemViewType(int i) {
        return ((C66293f) mo5017a(i)).f149043g;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final /* synthetic */ void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
        C66318g gVar = (C66318g) viewHolder;
        C89219l.m154721d(gVar, "");
        super.onViewAttachedToWindow(gVar);
        if (!(gVar instanceof C66325k)) {
            gVar = null;
        }
        C66325k kVar = (C66325k) gVar;
        if (kVar != null) {
            m117983a(kVar.f149142a);
        }
    }

    /* renamed from: a */
    public final void mo105252a(String str) {
        C89219l.m154721d(str, "");
        List<T> list = this.f4921a.f4672f;
        C89219l.m154716b(list, "");
        ArrayList arrayList = new ArrayList();
        for (T t : list) {
            if (!C89219l.m154714a((Object) t.f149044h, (Object) str)) {
                arrayList.add(t);
            }
        }
        mo5018a(arrayList);
    }

    /* renamed from: b */
    public final void mo105253b(List<C66296h> list) {
        C89219l.m154721d(list, "");
        this.f149163c.f148639a.clear();
        this.f149164d.f148634a.clear();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            m117983a((C66296h) it.next());
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C66334l(AbstractC66363i iVar, C66286e eVar) {
        super(C66336m.f149167a);
        C89219l.m154721d(iVar, "");
        this.f149165e = iVar;
        this.f149166f = eVar;
        this.f149163c = new C66024d();
        this.f149164d = new C66018a();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final /* synthetic */ void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        C66318g gVar = (C66318g) viewHolder;
        C89219l.m154721d(gVar, "");
        Object a = mo5017a(i);
        C89219l.m154716b(a, "");
        gVar.mo105231a((C66293f) a);
    }

    /* renamed from: a */
    private static RecyclerView.ViewHolder m117982a(C66334l lVar, ViewGroup viewGroup, int i) {
        RecyclerView.ViewHolder viewHolder;
        boolean a;
        MethodCollector.m26663i(11207);
        C89219l.m154721d(viewGroup, "");
        switch (i) {
            case 0:
                viewHolder = C66340p.C66341a.m117991a(viewGroup);
                break;
            case 1:
                C89219l.m154721d(viewGroup, "");
                View a2 = C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), R.layout.aqb, viewGroup, false);
                C89219l.m154716b(a2, "");
                viewHolder = new C66338n(a2);
                break;
            case 2:
                AbstractC66363i iVar = lVar.f149165e;
                C66286e eVar = lVar.f149166f;
                C89219l.m154721d(viewGroup, "");
                C89219l.m154721d(iVar, "");
                View a3 = C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), R.layout.aq9, viewGroup, false);
                C89219l.m154716b(a3, "");
                Context context = viewGroup.getContext();
                C89219l.m154716b(context, "");
                viewHolder = new C66325k(iVar, a3, context, eVar);
                break;
            case 3:
                AbstractC66363i iVar2 = lVar.f149165e;
                C89219l.m154721d(viewGroup, "");
                C89219l.m154721d(iVar2, "");
                View a4 = C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), R.layout.aq3, viewGroup, false);
                C89219l.m154716b(a4, "");
                Context context2 = viewGroup.getContext();
                C89219l.m154716b(context2, "");
                viewHolder = new C66309f(iVar2, a4, context2);
                break;
            case 4:
                AbstractC66363i iVar3 = lVar.f149165e;
                C89219l.m154721d(viewGroup, "");
                C89219l.m154721d(iVar3, "");
                View a5 = C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), R.layout.aq7, viewGroup, false);
                C89219l.m154716b(a5, "");
                viewHolder = new C66321j(iVar3, a5);
                break;
            case ABRConfig.ABR_STARTUP_MODEL_KEY:
                C89219l.m154721d(viewGroup, "");
                View a6 = C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), R.layout.aq5, viewGroup, false);
                C89219l.m154716b(a6, "");
                Context context3 = viewGroup.getContext();
                C89219l.m154716b(context3, "");
                viewHolder = new C66319h(a6, context3);
                break;
            case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                C89219l.m154721d(viewGroup, "");
                float dimension = C17867d.m33078a().getResources().getDimension(R.dimen.id);
                View a7 = C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), R.layout.aqc, viewGroup, false);
                C89219l.m154716b(a7, "");
                ViewGroup.LayoutParams layoutParams = a7.getLayoutParams();
                layoutParams.height = (int) (dimension * 1.5f);
                a7.setLayoutParams(layoutParams);
                viewHolder = new C66303b(a7);
                break;
            default:
                viewHolder = C66340p.C66341a.m117991a(viewGroup);
                break;
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
        MethodCollector.m26664o(11207);
        return viewHolder;
    }
}
