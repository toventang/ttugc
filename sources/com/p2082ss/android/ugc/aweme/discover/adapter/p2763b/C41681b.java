package com.p2082ss.android.ugc.aweme.discover.adapter.p2763b;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.C1175ad;
import androidx.lifecycle.C1181ae;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.p1710c.C22999a;
import com.bytedance.tux.p1710c.C23005c;
import com.p2082ss.android.ugc.aweme.discover.mob.helpers.SearchSugMobHelper;
import com.p2082ss.android.ugc.aweme.discover.p2770e.C41936o;
import com.p2082ss.android.ugc.aweme.discover.p2772g.AbstractC41953a;
import com.p2082ss.android.ugc.aweme.discover.p2773h.AbstractC41955b;
import com.p2082ss.android.ugc.aweme.discover.p2787m.AbstractC42295c;
import com.p2082ss.android.ugc.aweme.discover.widget.SugCompletionView;
import com.p2082ss.android.ugc.aweme.p3382l.p3383a.C58001a;
import com.p2082ss.android.ugc.aweme.search.SearchServiceImpl;
import com.p2082ss.android.ugc.aweme.search.model.C67679e;
import com.p2082ss.android.ugc.aweme.search.p3700n.C67688c;
import com.p2082ss.android.ugc.aweme.search.p3700n.C67694f;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81915c;
import com.p2082ss.android.ugc.trill.R;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.discover.adapter.b.b */
public final class C41681b extends RecyclerView.ViewHolder {

    /* renamed from: g */
    public static final C41685a f97224g = new C41685a((byte) 0);

    /* renamed from: a */
    public C67679e f97225a;

    /* renamed from: b */
    public int f97226b;

    /* renamed from: c */
    public String f97227c = "";

    /* renamed from: d */
    public boolean f97228d;

    /* renamed from: e */
    public final String f97229e;

    /* renamed from: f */
    public AbstractC41953a f97230f;

    /* renamed from: h */
    private final String f97231h;

    /* renamed from: i */
    private SearchSugMobHelper f97232i;

    /* renamed from: j */
    private final AbstractC89244h f97233j;

    static {
        Covode.recordClassIndex(49594);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final AbstractC41955b mo70885a() {
        return (AbstractC41955b) this.f97233j.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.adapter.b.b$a */
    public static final class C41685a {
        static {
            Covode.recordClassIndex(49598);
        }

        private C41685a() {
        }

        public /* synthetic */ C41685a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.adapter.b.b$b */
    static final class RunnableC41686b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C41681b f97238a;

        /* renamed from: b */
        final /* synthetic */ int f97239b;

        /* renamed from: c */
        final /* synthetic */ C67679e f97240c;

        static {
            Covode.recordClassIndex(49599);
        }

        RunnableC41686b(C41681b bVar, int i, C67679e eVar) {
            this.f97238a = bVar;
            this.f97239b = i;
            this.f97240c = eVar;
        }

        public final void run() {
            C41702g.m83660a(this.f97238a.f97229e, this.f97239b, this.f97240c, "enrich_sug");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.adapter.b.b$c */
    static final class C41687c extends AbstractC89220m implements AbstractC89171a<AbstractC41955b> {

        /* renamed from: a */
        public static final C41687c f97241a = new C41687c();

        static {
            Covode.recordClassIndex(49600);
        }

        C41687c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ AbstractC41955b invoke() {
            return SearchServiceImpl.m119336t().mo106217f();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C41681b(View view, String str, int i, AbstractC41953a aVar, final SugCompletionView.AbstractC43029a aVar2) {
        super(view);
        String str2;
        C89219l.m154721d(view, "");
        this.f97230f = aVar;
        this.f97231h = str;
        this.f97233j = C89250i.m154773a((AbstractC89171a) C41687c.f97241a);
        if (i > 0) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            layoutParams.height = i;
            view.setLayoutParams(layoutParams);
        }
        C22999a a = C23005c.m43393a(C416821.f97234a);
        Context context = view.getContext();
        C89219l.m154716b(context, "");
        ((SugCompletionView) view.findViewById(R.id.c06)).setImageDrawable(a.mo37368a(context));
        ((SugCompletionView) view.findViewById(R.id.c06)).setKeyboardDismissHandler(aVar2);
        ((SugCompletionView) view.findViewById(R.id.c06)).setOnClickListener(new View.OnClickListener(this) {
            /* class com.p2082ss.android.ugc.aweme.discover.adapter.p2763b.C41681b.View$OnClickListenerC416832 */

            /* renamed from: a */
            final /* synthetic */ C41681b f97235a;

            static {
                Covode.recordClassIndex(49596);
            }

            {
                this.f97235a = r1;
            }

            public final void onClick(View view) {
                ClickAgent.onClick(view);
                C41681b bVar = this.f97235a;
                C67679e eVar = bVar.f97225a;
                if (eVar != null) {
                    AbstractC81915c.m141874a(new C41936o(eVar.f151667b));
                    C41702g.m83658a(bVar.f97226b, eVar);
                }
            }
        });
        View view2 = this.itemView;
        C89219l.m154716b(view2, "");
        Context context2 = view2.getContext();
        if (context2 instanceof ActivityC0945e) {
            this.f97232i = (SearchSugMobHelper) C1181ae.m3881a((ActivityC0945e) context2, (C1175ad.AbstractC1177b) null).mo3983a(SearchSugMobHelper.class);
        }
        C67694f b = C67688c.C67689a.m119841b();
        if (!(b == null || (str2 = b.f151724b) == null || str2.length() <= 0)) {
            str = str2;
        }
        this.f97229e = str;
        view.setOnTouchListener(new AbstractC42295c(this) {
            /* class com.p2082ss.android.ugc.aweme.discover.adapter.p2763b.C41681b.C416843 */

            /* renamed from: a */
            final /* synthetic */ C41681b f97236a;

            static {
                Covode.recordClassIndex(49597);
            }

            @Override // com.p2082ss.android.ugc.aweme.discover.p2787m.AbstractC42295c
            /* renamed from: a */
            public final void mo70884a() {
                SugCompletionView.AbstractC43029a aVar = aVar2;
                if (aVar != null) {
                    aVar.mo70891a(this.f97236a.f97225a, this.f97236a.f97226b);
                }
            }

            @Override // com.p2082ss.android.ugc.aweme.discover.p2797ui.AbstractC42662aj
            /* renamed from: a */
            public final void mo70824a(View view) {
                C67679e eVar;
                if (!C58001a.m104815a(view, 1200) && this.f97236a.f97228d && (eVar = this.f97236a.f97225a) != null) {
                    AbstractC41953a aVar = this.f97236a.f97230f;
                    if (aVar != null) {
                        aVar.mo71103a(eVar, this.f97236a.f97227c, this.f97236a.f97226b);
                    }
                    C41702g.m83661b(this.f97236a.f97229e, this.f97236a.f97226b, eVar, "enrich_sug");
                }
            }

            {
                this.f97236a = r1;
            }
        });
    }
}
