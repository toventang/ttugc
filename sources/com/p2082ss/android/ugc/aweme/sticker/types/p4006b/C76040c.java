package com.p2082ss.android.ugc.aweme.sticker.types.p4006b;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.app.ActivityC0218d;
import androidx.appcompat.widget.ViewStubCompat;
import androidx.core.p037h.C0792v;
import androidx.lifecycle.AbstractC1214u;
import androidx.lifecycle.LiveData;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.services.apm.api.C22708a;
import com.p2082ss.android.ugc.aweme.filter.widget.FilterBeautySeekBar;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.profile.C63423ai;
import com.p2082ss.android.ugc.aweme.sticker.panel.C75575k;
import com.p2082ss.android.ugc.aweme.sticker.presenter.AbstractC75655o;
import com.p2082ss.android.ugc.aweme.sticker.types.p4006b.C76046d;
import com.p2082ss.android.ugc.aweme.sticker.widget.C76412b;
import com.p2082ss.android.ugc.aweme.utils.C80493gg;
import com.p2082ss.android.ugc.effectmanager.effect.model.ComposerNode;
import com.p2082ss.android.ugc.tools.view.widget.p4369c.C85035a;
import com.p2082ss.android.ugc.tools.view.widget.p4369c.C85037b;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import p4600h.C89378p;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.sticker.types.b.c */
public final class C76040c implements AbstractC76039b {

    /* renamed from: a */
    public final RecyclerView f170854a;

    /* renamed from: b */
    public final ActivityC0218d f170855b;

    /* renamed from: c */
    public final AbstractC75655o f170856c;

    /* renamed from: d */
    public final ViewGroup f170857d;

    /* renamed from: e */
    public final LiveData<List<ComposerNode>> f170858e;

    /* renamed from: f */
    public final C75575k f170859f;

    /* renamed from: g */
    public final AbstractC89172b<ComposerNode, C89391z> f170860g;

    /* renamed from: h */
    private ComposerNode f170861h;

    /* renamed from: i */
    private final FilterBeautySeekBar f170862i;

    /* renamed from: j */
    private final C76042a f170863j;

    static {
        Covode.recordClassIndex(88984);
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.types.multi.AbstractC76091a
    /* renamed from: a */
    public final void mo119768a() {
        this.f170854a.setVisibility(0);
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.types.multi.AbstractC76091a
    /* renamed from: b */
    public final void mo119769b() {
        this.f170862i.setVisibility(8);
        this.f170854a.setVisibility(8);
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.types.multi.AbstractC76091a
    /* renamed from: c */
    public final void mo119770c() {
        RecyclerView.AbstractC1350a adapter = this.f170854a.getAdapter();
        if (adapter == null) {
            C89219l.m154715b();
        }
        adapter.notifyDataSetChanged();
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.types.b.c$a */
    public final class C76042a extends RecyclerView.AbstractC1350a<C76044b> {

        /* renamed from: a */
        public ComposerNode f170865a;

        /* renamed from: b */
        List<? extends ComposerNode> f170866b;

        static {
            Covode.recordClassIndex(88986);
        }

        /* Return type fixed from 'androidx.recyclerview.widget.RecyclerView$ViewHolder' to match base method */
        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
        public final /* synthetic */ C76044b onCreateViewHolder(ViewGroup viewGroup, int i) {
            return m133336a(this, viewGroup, i);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
        public final int getItemCount() {
            List<ComposerNode> a;
            ComposerNode composerNode = this.f170865a;
            if (composerNode == null || (a = mo119771a(composerNode)) == null) {
                return 0;
            }
            return a.size();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public C76042a() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: com.ss.android.ugc.aweme.sticker.types.b.c$a$a */
        public static final class C76043a extends AbstractC89220m implements AbstractC89172b<C85035a.C85036a, C89391z> {

            /* renamed from: a */
            public static final C76043a f170868a = new C76043a();

            static {
                Covode.recordClassIndex(88987);
            }

            C76043a() {
                super(1);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // p4600h.p4611f.p4612a.AbstractC89172b
            public final /* synthetic */ C89391z invoke(C85035a.C85036a aVar) {
                C85035a.C85036a aVar2 = aVar;
                C89219l.m154721d(aVar2, "");
                aVar2.f190279j = true;
                return C89391z.f203057a;
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final List<ComposerNode> mo119771a(ComposerNode composerNode) {
            List f;
            if (composerNode.children == null) {
                return C89070n.m154516a(composerNode);
            }
            ArrayList arrayList = new ArrayList();
            List<ComposerNode> list = composerNode.children;
            if (!(list == null || (f = C89070n.m154580f((Iterable) list)) == null)) {
                Iterator it = f.iterator();
                while (it.hasNext()) {
                    it.next();
                    arrayList.addAll(mo119771a(composerNode));
                }
            }
            return C89070n.m154590j(arrayList);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$ViewHolder, int] */
        /* JADX WARNING: Code restructure failed: missing block: B:3:0x0012, code lost:
            if (r2 == null) goto L_0x0014;
         */
        /* JADX WARNING: Removed duplicated region for block: B:17:0x0071  */
        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ void onBindViewHolder(com.p2082ss.android.ugc.aweme.sticker.types.p4006b.C76040c.C76044b r8, int r9) {
            /*
            // Method dump skipped, instructions count: 159
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.sticker.types.p4006b.C76040c.C76042a.onBindViewHolder(androidx.recyclerview.widget.RecyclerView$ViewHolder, int):void");
        }

        /* renamed from: a */
        private static RecyclerView.ViewHolder m133336a(C76042a aVar, ViewGroup viewGroup, int i) {
            boolean a;
            MethodCollector.m26663i(7872);
            C89219l.m154721d(viewGroup, "");
            C75575k kVar = C76040c.this.f170859f;
            Context context = viewGroup.getContext();
            C89219l.m154716b(context, "");
            C89378p a2 = C76412b.m133925a(kVar, context, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, C76043a.f170868a, 254);
            C76044b bVar = new C76044b(C76040c.this, (FrameLayout) a2.component1(), (C85037b) a2.component2());
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
            MethodCollector.m26664o(7872);
            return bVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.types.b.c$b */
    public final class C76044b extends RecyclerView.ViewHolder {

        /* renamed from: a */
        final C85037b f170869a;

        /* renamed from: b */
        final /* synthetic */ C76040c f170870b;

        static {
            Covode.recordClassIndex(88988);
        }

        /* renamed from: com.ss.android.ugc.aweme.sticker.types.b.c$b$a */
        static final class View$OnClickListenerC76045a implements View.OnClickListener {

            /* renamed from: a */
            final /* synthetic */ AbstractC89172b f170871a;

            /* renamed from: b */
            final /* synthetic */ ComposerNode f170872b;

            static {
                Covode.recordClassIndex(88989);
            }

            View$OnClickListenerC76045a(AbstractC89172b bVar, ComposerNode composerNode) {
                this.f170871a = bVar;
                this.f170872b = composerNode;
            }

            public final void onClick(View view) {
                ClickAgent.onClick(view);
                this.f170871a.invoke(this.f170872b);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C76044b(C76040c cVar, View view, C85037b bVar) {
            super(view);
            C89219l.m154721d(view, "");
            C89219l.m154721d(bVar, "");
            this.f170870b = cVar;
            this.f170869a = bVar;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.types.p4006b.AbstractC76039b
    /* renamed from: a */
    public final void mo119766a(ComposerNode composerNode) {
        List<ComposerNode> list;
        this.f170861h = composerNode;
        C76042a aVar = this.f170863j;
        aVar.f170865a = composerNode;
        if (composerNode != null) {
            list = aVar.mo119771a(composerNode);
        } else {
            list = null;
        }
        aVar.f170866b = list;
        this.f170863j.notifyDataSetChanged();
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.types.p4006b.AbstractC76039b
    /* renamed from: a */
    public final void mo119767a(ComposerNode composerNode, AbstractC89172b<? super Integer, C89391z> bVar) {
        C89219l.m154721d(composerNode, "");
        C89219l.m154721d(bVar, "");
        this.f170862i.setVisibility(0);
        this.f170862i.setOnSeekBarChangeListener(new C76046d.C76047a(bVar));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r12v0, resolved type: h.f.a.b<? super com.ss.android.ugc.effectmanager.effect.model.ComposerNode, h.z> */
    /* JADX WARN: Multi-variable type inference failed */
    public C76040c(ActivityC0218d dVar, AbstractC75655o oVar, ViewGroup viewGroup, LiveData<List<ComposerNode>> liveData, C75575k kVar, AbstractC89172b<? super ComposerNode, C89391z> bVar) {
        C89219l.m154721d(dVar, "");
        C89219l.m154721d(oVar, "");
        C89219l.m154721d(viewGroup, "");
        C89219l.m154721d(liveData, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(bVar, "");
        this.f170855b = dVar;
        this.f170856c = oVar;
        this.f170857d = viewGroup;
        this.f170858e = liveData;
        this.f170859f = kVar;
        this.f170860g = bVar;
        C76042a aVar = new C76042a();
        this.f170863j = aVar;
        View c = C0792v.m2762c((View) viewGroup, (int) R.id.e_r);
        Objects.requireNonNull(c, "null cannot be cast to non-null type androidx.appcompat.widget.ViewStubCompat");
        View a = ((ViewStubCompat) c).mo1691a();
        View c2 = C0792v.m2762c(a, (int) R.id.c61);
        C89219l.m154716b(c2, "");
        RecyclerView recyclerView = (RecyclerView) c2;
        this.f170854a = recyclerView;
        recyclerView.setAdapter(aVar);
        recyclerView.setLayoutManager(new LinearLayoutManager(0, false));
        View c3 = C0792v.m2762c(a, (int) R.id.abu);
        C89219l.m154716b(c3, "");
        this.f170862i = (FilterBeautySeekBar) c3;
        liveData.observe(dVar, new AbstractC1214u(this) {
            /* class com.p2082ss.android.ugc.aweme.sticker.types.p4006b.C76040c.C760411 */

            /* renamed from: a */
            final /* synthetic */ C76040c f170864a;

            static {
                Covode.recordClassIndex(88985);
            }

            {
                this.f170864a = r1;
            }

            @Override // androidx.lifecycle.AbstractC1214u
            public final /* synthetic */ void onChanged(Object obj) {
                RecyclerView.AbstractC1350a adapter = this.f170864a.f170854a.getAdapter();
                if (adapter == null) {
                    C89219l.m154715b();
                }
                adapter.notifyDataSetChanged();
            }
        });
    }
}
