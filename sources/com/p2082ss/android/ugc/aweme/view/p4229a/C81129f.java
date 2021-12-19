package com.p2082ss.android.ugc.aweme.view.p4229a;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.services.apm.api.C22708a;
import com.bytedance.tux.button.TuxButton;
import com.bytedance.tux.input.TuxTextView;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.model.AbstractC60142d;
import com.p2082ss.android.ugc.aweme.model.AbstractC60160s;
import com.p2082ss.android.ugc.aweme.model.AbstractC60162u;
import com.p2082ss.android.ugc.aweme.model.C60143e;
import com.p2082ss.android.ugc.aweme.model.C60145g;
import com.p2082ss.android.ugc.aweme.model.C60157q;
import com.p2082ss.android.ugc.aweme.model.EnumC60153m;
import com.p2082ss.android.ugc.aweme.profile.C63423ai;
import com.p2082ss.android.ugc.aweme.utils.C80493gg;
import com.p2082ss.android.ugc.aweme.view.p4229a.C81122c;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.view.a.f */
public final class C81129f extends RecyclerView.AbstractC1350a<C81131b> implements C81122c.AbstractC81123a {

    /* renamed from: a */
    public final AbstractC81130a f181304a;

    /* renamed from: b */
    private final C60157q f181305b;

    /* renamed from: c */
    private final AbstractC60162u f181306c;

    /* renamed from: com.ss.android.ugc.aweme.view.a.f$a */
    public interface AbstractC81130a {
        static {
            Covode.recordClassIndex(94458);
        }

        /* renamed from: a */
        void mo124590a(AbstractC60142d dVar);

        /* renamed from: a */
        void mo124591a(AbstractC60142d dVar, C60143e eVar);

        /* renamed from: a */
        void mo124592a(AbstractC60160s sVar);

        /* renamed from: b */
        void mo124593b(AbstractC60142d dVar);
    }

    static {
        Covode.recordClassIndex(94457);
    }

    /* Return type fixed from 'androidx.recyclerview.widget.RecyclerView$ViewHolder' to match base method */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final /* synthetic */ C81131b onCreateViewHolder(ViewGroup viewGroup, int i) {
        return m140886a(this, viewGroup, i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final int getItemCount() {
        return this.f181306c.mo97838c().size();
    }

    /* renamed from: com.ss.android.ugc.aweme.view.a.f$b */
    public static final class C81131b extends RecyclerView.ViewHolder {

        /* renamed from: a */
        final TuxTextView f181307a;

        /* renamed from: b */
        final TuxButton f181308b;

        /* renamed from: c */
        final TuxButton f181309c;

        /* renamed from: d */
        final RecyclerView f181310d;

        /* renamed from: e */
        final RecyclerView f181311e;

        /* renamed from: f */
        public final AbstractC81130a f181312f;

        static {
            Covode.recordClassIndex(94459);
        }

        /* renamed from: com.ss.android.ugc.aweme.view.a.f$b$a */
        static final class View$OnClickListenerC81132a implements View.OnClickListener {

            /* renamed from: a */
            final /* synthetic */ C81131b f181313a;

            /* renamed from: b */
            final /* synthetic */ AbstractC60142d f181314b;

            static {
                Covode.recordClassIndex(94460);
            }

            View$OnClickListenerC81132a(C81131b bVar, AbstractC60142d dVar) {
                this.f181313a = bVar;
                this.f181314b = dVar;
            }

            public final void onClick(View view) {
                ClickAgent.onClick(view);
                this.f181313a.f181312f.mo124590a(this.f181314b);
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.view.a.f$b$b */
        static final class View$OnClickListenerC81133b implements View.OnClickListener {

            /* renamed from: a */
            final /* synthetic */ C81131b f181315a;

            /* renamed from: b */
            final /* synthetic */ AbstractC60142d f181316b;

            static {
                Covode.recordClassIndex(94461);
            }

            View$OnClickListenerC81133b(C81131b bVar, AbstractC60142d dVar) {
                this.f181315a = bVar;
                this.f181316b = dVar;
            }

            public final void onClick(View view) {
                ClickAgent.onClick(view);
                this.f181315a.f181312f.mo124593b(this.f181316b);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C81131b(View view, AbstractC81130a aVar) {
            super(view);
            C89219l.m154721d(view, "");
            C89219l.m154721d(aVar, "");
            this.f181312f = aVar;
            this.f181307a = (TuxTextView) view.findViewById(R.id.d9a);
            this.f181308b = (TuxButton) view.findViewById(R.id.d7w);
            this.f181309c = (TuxButton) view.findViewById(R.id.d7x);
            this.f181310d = (RecyclerView) view.findViewById(R.id.d81);
            this.f181311e = (RecyclerView) view.findViewById(R.id.d8d);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.view.a.f$c */
    public static final class C81134c implements AbstractC81121b {

        /* renamed from: a */
        final /* synthetic */ C81129f f181317a;

        /* renamed from: b */
        final /* synthetic */ AbstractC60142d f181318b;

        static {
            Covode.recordClassIndex(94462);
        }

        @Override // com.p2082ss.android.ugc.aweme.view.p4229a.AbstractC81121b
        /* renamed from: a */
        public final void mo124587a(C60143e eVar) {
            C89219l.m154721d(eVar, "");
            this.f181317a.f181304a.mo124591a(this.f181318b, eVar);
        }

        C81134c(C81129f fVar, AbstractC60142d dVar) {
            this.f181317a = fVar;
            this.f181318b = dVar;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.view.p4229a.C81122c.AbstractC81123a
    /* renamed from: a */
    public final void mo124588a(AbstractC60160s sVar) {
        C89219l.m154721d(sVar, "");
        notifyDataSetChanged();
        this.f181304a.mo124592a(sVar);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$ViewHolder, int] */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final /* synthetic */ void onBindViewHolder(C81131b bVar, int i) {
        int i2;
        boolean z;
        int i3;
        int i4;
        int i5;
        C81131b bVar2 = bVar;
        C89219l.m154721d(bVar2, "");
        AbstractC60142d dVar = this.f181306c.mo97838c().get(i);
        C89219l.m154716b(dVar, "");
        AbstractC60142d dVar2 = dVar;
        C81134c cVar = new C81134c(this, dVar2);
        C60157q qVar = this.f181305b;
        C89219l.m154721d(qVar, "");
        C89219l.m154721d(dVar2, "");
        C89219l.m154721d(this, "");
        C89219l.m154721d(cVar, "");
        TuxTextView tuxTextView = bVar2.f181307a;
        C89219l.m154716b(tuxTextView, "");
        tuxTextView.setText(dVar2.mo97816b());
        boolean z2 = !dVar2.mo97820f().isEmpty();
        TuxButton tuxButton = bVar2.f181308b;
        C89219l.m154716b(tuxButton, "");
        if (z2) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        tuxButton.setVisibility(i2);
        bVar2.f181308b.setOnClickListener(new C81131b.View$OnClickListenerC81132a(bVar2, dVar2));
        if (dVar2.mo97824j() != null) {
            z = true;
        } else {
            z = false;
        }
        TuxButton tuxButton2 = bVar2.f181309c;
        C89219l.m154716b(tuxButton2, "");
        if (z) {
            i3 = 0;
        } else {
            i3 = 8;
        }
        tuxButton2.setVisibility(i3);
        bVar2.f181309c.setOnClickListener(new C81131b.View$OnClickListenerC81133b(bVar2, dVar2));
        if (dVar2.mo97823i() != null) {
            C60145g i6 = dVar2.mo97823i();
            if (i6 == null) {
                C89219l.m154715b();
            }
            RecyclerView recyclerView = bVar2.f181310d;
            C89219l.m154716b(recyclerView, "");
            View view = bVar2.itemView;
            C89219l.m154716b(view, "");
            view.getContext();
            recyclerView.setLayoutManager(new LinearLayoutManager(0, false));
            RecyclerView recyclerView2 = bVar2.f181310d;
            C89219l.m154716b(recyclerView2, "");
            recyclerView2.setAdapter(new C81118a(i6, cVar));
        } else {
            RecyclerView recyclerView3 = bVar2.f181310d;
            C89219l.m154716b(recyclerView3, "");
            recyclerView3.setVisibility(8);
        }
        if ((!dVar2.mo97821g().isEmpty()) || (!dVar2.mo97819e().isEmpty())) {
            if (dVar2.mo97817c() == EnumC60153m.GRID) {
                i4 = 3;
            } else {
                i4 = 6;
            }
            if (dVar2.mo97817c() == EnumC60153m.GRID) {
                i5 = 0;
            } else {
                i5 = 1;
            }
            RecyclerView recyclerView4 = bVar2.f181311e;
            C89219l.m154716b(recyclerView4, "");
            View view2 = bVar2.itemView;
            C89219l.m154716b(view2, "");
            view2.getContext();
            recyclerView4.setLayoutManager(new GridLayoutManager(i4));
            ArrayList arrayList = new ArrayList(dVar2.mo97821g().values());
            RecyclerView recyclerView5 = bVar2.f181311e;
            C89219l.m154716b(recyclerView5, "");
            recyclerView5.setAdapter(new C81122c(qVar, arrayList, dVar2.mo97819e(), i5, this));
            return;
        }
        RecyclerView recyclerView6 = bVar2.f181311e;
        C89219l.m154716b(recyclerView6, "");
        recyclerView6.setVisibility(8);
    }

    public C81129f(C60157q qVar, AbstractC60162u uVar, AbstractC81130a aVar) {
        C89219l.m154721d(qVar, "");
        C89219l.m154721d(uVar, "");
        C89219l.m154721d(aVar, "");
        this.f181305b = qVar;
        this.f181306c = uVar;
        this.f181304a = aVar;
    }

    /* renamed from: a */
    private static RecyclerView.ViewHolder m140886a(C81129f fVar, ViewGroup viewGroup, int i) {
        boolean a;
        MethodCollector.m26663i(236);
        C89219l.m154721d(viewGroup, "");
        View a2 = C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), R.layout.aon, viewGroup, false);
        C89219l.m154716b(a2, "");
        C81131b bVar = new C81131b(a2, fVar.f181304a);
        try {
            if (bVar.itemView.getParent() != null) {
                try {
                    a = SettingsManager.m29616a().mo25400a("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (a) {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("onCreateViewHolder getParent() != null crash hook, holder ").append(bVar.getClass().getName()).append(" parent ").append(viewGroup.getClass().getName()).append(" viewType ").append(i);
                    C22708a.m42800a(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) bVar.itemView.getParent();
                    if (viewGroup2 != null) {
                        viewGroup2.removeView(bVar.itemView);
                    }
                }
            }
        } catch (Exception e) {
            C63423ai.m115002a(e);
            C51423a.m95786a(e);
        }
        C80493gg.f180088a = bVar.getClass().getName();
        MethodCollector.m26664o(236);
        return bVar;
    }
}
