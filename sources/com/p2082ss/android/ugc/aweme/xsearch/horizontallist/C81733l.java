package com.p2082ss.android.ugc.aweme.xsearch.horizontallist;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.p1722h.C23163i;
import com.p2082ss.android.common.applog.GlobalContext;
import com.p2082ss.android.ugc.aweme.autoplay.p2348d.C34169m;
import com.p2082ss.android.ugc.aweme.flowfeed.p2993a.AbstractC51043a;
import com.p2082ss.android.ugc.aweme.flowfeed.p2993a.AbstractC51044b;
import com.p2082ss.android.ugc.aweme.flowfeed.utils.AbstractC51059f;
import com.p2082ss.android.ugc.aweme.flowfeed.utils.C51060g;
import com.p2082ss.android.ugc.aweme.p2757dg.C41478e;
import com.p2082ss.android.ugc.aweme.xsearch.C81687b;
import com.p2082ss.android.ugc.aweme.xsearch.horizontallist.AbstractC81695b;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.xsearch.horizontallist.l */
public class C81733l extends C34169m {

    /* renamed from: p */
    public static final C81734a f182769p = new C81734a((byte) 0);

    /* renamed from: j */
    public C81703f f182770j;

    /* renamed from: k */
    public C81718h f182771k;

    /* renamed from: l */
    AbstractC81695b.C81696a f182772l;

    /* renamed from: m */
    public final RecyclerView f182773m;

    /* renamed from: n */
    public final View f182774n;

    /* renamed from: o */
    public final boolean f182775o;

    /* renamed from: q */
    private final AbstractC89244h f182776q;

    /* renamed from: r */
    private final AbstractC89244h f182777r;

    /* renamed from: com.ss.android.ugc.aweme.xsearch.horizontallist.l$c */
    static final class C81736c extends AbstractC89220m implements AbstractC89171a<C51060g> {

        /* renamed from: a */
        final /* synthetic */ C81733l f182779a;

        static {
            Covode.recordClassIndex(95141);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C81736c(C81733l lVar) {
            super(0);
            this.f182779a = lVar;
        }

        /* renamed from: com.ss.android.ugc.aweme.xsearch.horizontallist.l$c$a */
        public static final class C81737a implements AbstractC51059f {
            static {
                Covode.recordClassIndex(95142);
            }

            C81737a() {
            }
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C51060g invoke() {
            C51060g gVar = new C51060g(this.f182779a.f182773m, new C81737a(), this.f182779a);
            C81733l lVar = this.f182779a;
            C81718h hVar = new C81718h(lVar.f182773m, gVar);
            hVar.mo125389a(lVar.f182772l.getX(), lVar.f182772l.getY(), lVar.f182772l.getWidth(), lVar.f182772l.getHeight());
            lVar.f182771k = hVar;
            gVar.f117776g = this.f182779a.f182771k;
            return gVar;
        }
    }

    static {
        Covode.recordClassIndex(95138);
    }

    @Override // com.p2082ss.android.ugc.aweme.autoplay.p2348d.C34169m
    /* renamed from: a */
    public final C51060g mo60497a() {
        return (C51060g) this.f182777r.getValue();
    }

    @Override // com.p2082ss.android.ugc.aweme.autoplay.p2348d.C34169m, com.p2082ss.android.ugc.aweme.flowfeed.utils.C51060g.AbstractC51062a
    /* renamed from: e */
    public final boolean mo60483e() {
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final C41478e mo125406h() {
        return (C41478e) this.f182776q.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.xsearch.horizontallist.l$a */
    public static final class C81734a {
        static {
            Covode.recordClassIndex(95139);
        }

        private C81734a() {
        }

        public /* synthetic */ C81734a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.xsearch.horizontallist.l$b */
    static final class C81735b extends AbstractC89220m implements AbstractC89171a<C41478e> {

        /* renamed from: a */
        public static final C81735b f182778a = new C81735b();

        static {
            Covode.recordClassIndex(95140);
        }

        C81735b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C41478e invoke() {
            C41478e eVar = new C41478e();
            eVar.f96780c = 0;
            eVar.f96778a = 0.0f;
            eVar.f96779b.setColor(0);
            return eVar;
        }
    }

    /* renamed from: a */
    public final void mo125405a(C81703f fVar) {
        C81687b bVar;
        this.f182770j = fVar;
        C81718h hVar = this.f182771k;
        if (hVar != null) {
            if (fVar != null) {
                bVar = fVar.f182697b;
            } else {
                bVar = null;
            }
            hVar.f182724e = bVar;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private C81733l(RecyclerView recyclerView, View view, AbstractC51044b bVar, AbstractC51043a aVar) {
        super(recyclerView, view, bVar, aVar, true);
        C89219l.m154721d(recyclerView, "");
        C89219l.m154721d(view, "");
        this.f182773m = recyclerView;
        this.f182774n = view;
        this.f182775o = true;
        this.f182772l = new AbstractC81695b.C81696a(0.0f, 0.0f, 0.0f, 0.0f, 15, null);
        this.f182776q = C89250i.m154773a((AbstractC89171a) C81735b.f182778a);
        Context context = recyclerView.getContext();
        C89219l.m154716b(context, "");
        new C81694a(recyclerView, C23163i.m43663a(context), C13628n.m24504a(GlobalContext.getContext())).mo4857a(recyclerView);
        this.f182777r = C89250i.m154773a((AbstractC89171a) new C81736c(this));
    }

    public /* synthetic */ C81733l(RecyclerView recyclerView, View view, AbstractC51044b bVar, AbstractC51043a aVar, byte b) {
        this(recyclerView, view, bVar, aVar);
    }
}
