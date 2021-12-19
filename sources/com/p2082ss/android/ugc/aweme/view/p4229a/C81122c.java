package com.p2082ss.android.ugc.aweme.view.p4229a;

import android.content.Context;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.lighten.p1477a.C20745e;
import com.bytedance.lighten.p1477a.C20761r;
import com.bytedance.lighten.p1477a.C20766v;
import com.bytedance.services.apm.api.C22708a;
import com.p2082ss.android.ugc.aweme.base.p2379ui.SmartRoundImageView;
import com.p2082ss.android.ugc.aweme.common.C39082ag;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.model.AbstractC60154n;
import com.p2082ss.android.ugc.aweme.model.AbstractC60160s;
import com.p2082ss.android.ugc.aweme.model.C60148j;
import com.p2082ss.android.ugc.aweme.model.C60157q;
import com.p2082ss.android.ugc.aweme.profile.C63423ai;
import com.p2082ss.android.ugc.aweme.utils.C80493gg;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.view.a.c */
public final class C81122c extends RecyclerView.AbstractC1350a<C81125c> {

    /* renamed from: c */
    public static final C81124b f181285c = new C81124b((byte) 0);

    /* renamed from: a */
    public final int f181286a;

    /* renamed from: b */
    public final AbstractC81123a f181287b;

    /* renamed from: d */
    private final C60157q f181288d;

    /* renamed from: e */
    private final ArrayList<C60148j> f181289e;

    /* renamed from: f */
    private final ArrayList<AbstractC60154n> f181290f;

    /* renamed from: com.ss.android.ugc.aweme.view.a.c$a */
    public interface AbstractC81123a {
        static {
            Covode.recordClassIndex(94451);
        }

        /* renamed from: a */
        void mo124588a(AbstractC60160s sVar);
    }

    static {
        Covode.recordClassIndex(94450);
    }

    /* Return type fixed from 'androidx.recyclerview.widget.RecyclerView$ViewHolder' to match base method */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final /* synthetic */ C81125c onCreateViewHolder(ViewGroup viewGroup, int i) {
        return m140882a(this, viewGroup, i);
    }

    /* renamed from: com.ss.android.ugc.aweme.view.a.c$b */
    public static final class C81124b {
        static {
            Covode.recordClassIndex(94452);
        }

        private C81124b() {
        }

        public /* synthetic */ C81124b(byte b) {
            this();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final int getItemCount() {
        return this.f181289e.size() + this.f181290f.size();
    }

    /* renamed from: com.ss.android.ugc.aweme.view.a.c$d */
    static final class View$OnClickListenerC81126d implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C81122c f181295a;

        /* renamed from: b */
        final /* synthetic */ AbstractC60160s f181296b;

        static {
            Covode.recordClassIndex(94454);
        }

        View$OnClickListenerC81126d(C81122c cVar, AbstractC60160s sVar) {
            this.f181295a = cVar;
            this.f181296b = sVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f181295a.f181287b.mo124588a(this.f181296b);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.view.a.c$c */
    public static final class C81125c extends RecyclerView.ViewHolder {

        /* renamed from: a */
        final SmartImageView f181291a;

        /* renamed from: b */
        final SmartRoundImageView f181292b;

        /* renamed from: c */
        final View f181293c;

        /* renamed from: d */
        final View f181294d;

        static {
            Covode.recordClassIndex(94453);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C81125c(View view) {
            super(view);
            C89219l.m154721d(view, "");
            this.f181291a = (SmartImageView) view.findViewById(R.id.d85);
            this.f181292b = (SmartRoundImageView) view.findViewById(R.id.d8b);
            this.f181293c = view.findViewById(R.id.d84);
            this.f181294d = view.findViewById(R.id.d8c);
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$ViewHolder, int] */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final /* synthetic */ void onBindViewHolder(C81125c cVar, int i) {
        C60148j jVar;
        String str;
        boolean z;
        C81125c cVar2 = cVar;
        C89219l.m154721d(cVar2, "");
        if (i >= this.f181289e.size()) {
            AbstractC60154n nVar = this.f181290f.get(i - this.f181289e.size());
            C89219l.m154716b(nVar, "");
            jVar = nVar;
        } else {
            C60148j jVar2 = this.f181289e.get(i);
            C89219l.m154716b(jVar2, "");
            jVar = jVar2;
        }
        String b = jVar.mo97826b();
        String h = jVar.mo97827c().mo97822h();
        int i2 = 0;
        if (h == null || h.length() == 0) {
            str = jVar.mo97827c().mo97815a();
        } else {
            str = jVar.mo97827c().mo97822h();
        }
        if (str != null) {
            if (C89219l.m154714a(this.f181288d.mo97833b(str), jVar) || C89219l.m154714a(this.f181288d.mo97834c(str), jVar)) {
                z = true;
            } else {
                z = false;
            }
            if (this.f181286a == 1) {
                C89219l.m154721d(b, "");
                View view = cVar2.f181294d;
                C89219l.m154716b(view, "");
                if (!z) {
                    i2 = 8;
                }
                view.setVisibility(i2);
                View view2 = cVar2.itemView;
                C89219l.m154716b(view2, "");
                Context context = view2.getContext();
                C89219l.m154716b(context, "");
                float a = C39082ag.C39083a.m79347a(context, 22.0f);
                C20745e.C20746a aVar = new C20745e.C20746a();
                aVar.f48957a = true;
                aVar.f48961e = a;
                C20745e a2 = aVar.mo34169a();
                cVar2.f181292b.setCircleOptions(a2);
                C20766v a3 = C20761r.m39057a(Uri.parse(b));
                SmartRoundImageView smartRoundImageView = cVar2.f181292b;
                C89219l.m154716b(smartRoundImageView, "");
                a3.f49105b = smartRoundImageView.getContext();
                a3.f49092E = cVar2.f181292b;
                a3.f49126w = a2;
                a3.mo34186c();
            } else {
                C89219l.m154721d(b, "");
                View view3 = cVar2.f181293c;
                C89219l.m154716b(view3, "");
                if (!z) {
                    i2 = 8;
                }
                view3.setVisibility(i2);
                C20766v a4 = C20761r.m39057a(Uri.parse(b));
                SmartImageView smartImageView = cVar2.f181291a;
                C89219l.m154716b(smartImageView, "");
                a4.f49105b = smartImageView.getContext();
                a4.f49092E = cVar2.f181291a;
                a4.mo34186c();
            }
            cVar2.itemView.setOnClickListener(new View$OnClickListenerC81126d(this, jVar));
        }
    }

    /* renamed from: a */
    private static RecyclerView.ViewHolder m140882a(C81122c cVar, ViewGroup viewGroup, int i) {
        C81125c cVar2;
        MethodCollector.m26663i(3803);
        C89219l.m154721d(viewGroup, "");
        boolean z = true;
        if (cVar.f181286a != 1) {
            View a = C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), R.layout.aoq, viewGroup, false);
            C89219l.m154716b(a, "");
            cVar2 = new C81125c(a);
        } else {
            View a2 = C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), R.layout.aop, viewGroup, false);
            C89219l.m154716b(a2, "");
            cVar2 = new C81125c(a2);
        }
        try {
            if (cVar2.itemView.getParent() != null) {
                try {
                    z = SettingsManager.m29616a().mo25400a("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (z) {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("onCreateViewHolder getParent() != null crash hook, holder ").append(cVar2.getClass().getName()).append(" parent ").append(viewGroup.getClass().getName()).append(" viewType ").append(i);
                    C22708a.m42800a(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) cVar2.itemView.getParent();
                    if (viewGroup2 != null) {
                        viewGroup2.removeView(cVar2.itemView);
                    }
                }
            }
        } catch (Exception e) {
            C63423ai.m115002a(e);
            C51423a.m95786a(e);
        }
        C80493gg.f180088a = cVar2.getClass().getName();
        MethodCollector.m26664o(3803);
        return cVar2;
    }

    public C81122c(C60157q qVar, ArrayList<C60148j> arrayList, ArrayList<AbstractC60154n> arrayList2, int i, AbstractC81123a aVar) {
        C89219l.m154721d(qVar, "");
        C89219l.m154721d(arrayList, "");
        C89219l.m154721d(arrayList2, "");
        C89219l.m154721d(aVar, "");
        this.f181288d = qVar;
        this.f181289e = arrayList;
        this.f181290f = arrayList2;
        this.f181286a = i;
        this.f181287b = aVar;
    }
}
