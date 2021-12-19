package com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia;

import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.analytics.p124a.View$OnAttachStateChangeListenerC2587f;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.setting.p3721i.C68085a;
import com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.C72235n;
import com.p2082ss.android.ugc.aweme.utils.C80461fw;
import com.p2082ss.android.ugc.trill.R;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4617i.AbstractC89255c;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.FastScrollRecyclerView */
public final class FastScrollRecyclerView extends RecyclerView {

    /* renamed from: R */
    public static final C72028a f161392R = new C72028a((byte) 0);

    /* renamed from: O */
    public C72235n f161393O;

    /* renamed from: P */
    public Boolean f161394P;

    /* renamed from: Q */
    public C72235n.AbstractC72241a f161395Q;

    /* renamed from: S */
    private final AbstractC89244h f161396S;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.FastScrollRecyclerView$b */
    public interface AbstractC72029b {
        static {
            Covode.recordClassIndex(84677);
        }

        /* renamed from: a */
        void mo114232a();

        /* renamed from: b */
        void mo114233b();
    }

    static {
        Covode.recordClassIndex(84674);
    }

    private final int getScreenHeight() {
        return ((Number) this.f161396S.getValue()).intValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.FastScrollRecyclerView$a */
    public static final class C72028a {
        static {
            Covode.recordClassIndex(84676);
        }

        private C72028a() {
        }

        public /* synthetic */ C72028a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.FastScrollRecyclerView$e */
    static final class C72032e extends AbstractC89220m implements AbstractC89171a<Integer> {

        /* renamed from: a */
        final /* synthetic */ FastScrollRecyclerView f161403a;

        static {
            Covode.recordClassIndex(84680);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C72032e(FastScrollRecyclerView fastScrollRecyclerView) {
            super(0);
            this.f161403a = fastScrollRecyclerView;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Integer invoke() {
            return Integer.valueOf(C13628n.m24521b(this.f161403a.getContext()));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        C72235n nVar = this.f161393O;
        if (nVar != null) {
            nVar.mo114441a((RecyclerView) this);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final void onDetachedFromWindow() {
        C72235n nVar = this.f161393O;
        if (!(nVar == null || nVar.f161945c == null)) {
            nVar.f161945c.mo4418b(nVar.f161961s);
            nVar.f161945c = null;
        }
        super.onDetachedFromWindow();
    }

    public final void setFastScrollEnabled(boolean z) {
        C72235n nVar = this.f161393O;
        if (nVar != null) {
            nVar.setEnabled(z);
        }
        this.f161394P = Boolean.valueOf(z);
    }

    public final void setFastScrollListener(C72235n.AbstractC72241a aVar) {
        C72235n nVar = this.f161393O;
        if (nVar != null) {
            nVar.setFastScrollListener(aVar);
        }
        this.f161395Q = aVar;
    }

    public final void setVisibility(int i) {
        super.setVisibility(i);
        C72235n nVar = this.f161393O;
        if (nVar != null) {
            nVar.setVisibility(i);
        }
    }

    /* renamed from: a */
    public final void mo114228a(Context context) {
        C72235n nVar = new C72235n(context);
        this.f161393O = nVar;
        nVar.setId(R.id.azf);
        C72235n nVar2 = this.f161393O;
        if (nVar2 != null) {
            nVar2.setEnabled(false);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final void setAdapter(RecyclerView.AbstractC1350a<?> aVar) {
        C72235n nVar;
        super.setAdapter(aVar);
        if ((aVar instanceof C72235n.AbstractC72243c) && (nVar = this.f161393O) != null) {
            nVar.setSectionIndexer((C72235n.AbstractC72243c) aVar);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.FastScrollRecyclerView$c */
    static final class C72030c extends AbstractC89220m implements AbstractC89183m<Context, AttributeSet, C89391z> {

        /* renamed from: a */
        final /* synthetic */ FastScrollRecyclerView f161398a;

        static {
            Covode.recordClassIndex(84678);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C72030c(FastScrollRecyclerView fastScrollRecyclerView) {
            super(2);
            this.f161398a = fastScrollRecyclerView;
        }

        /* renamed from: a */
        public final void mo114234a(Context context) {
            C72235n nVar;
            C72235n nVar2;
            C89219l.m154721d(context, "");
            this.f161398a.mo114228a(context);
            C72235n nVar3 = this.f161398a.f161393O;
            if (nVar3 != null) {
                nVar3.mo114441a((RecyclerView) this.f161398a);
            }
            if ((this.f161398a.getAdapter() instanceof C72235n.AbstractC72243c) && (nVar2 = this.f161398a.f161393O) != null) {
                nVar2.setSectionIndexer((C72235n.AbstractC72243c) this.f161398a.getAdapter());
            }
            Boolean bool = this.f161398a.f161394P;
            if (bool != null) {
                boolean booleanValue = bool.booleanValue();
                C72235n nVar4 = this.f161398a.f161393O;
                if (nVar4 != null) {
                    nVar4.setEnabled(booleanValue);
                }
            }
            C72235n.AbstractC72241a aVar = this.f161398a.f161395Q;
            if (aVar != null && (nVar = this.f161398a.f161393O) != null) {
                nVar.setFastScrollListener(aVar);
            }
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(Context context, AttributeSet attributeSet) {
            mo114234a(context);
            return C89391z.f203057a;
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public FastScrollRecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
        C89219l.m154721d(context, "");
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.FastScrollRecyclerView$d */
    public static final class C72031d extends RecyclerView.AbstractC1371n {

        /* renamed from: a */
        final /* synthetic */ FastScrollRecyclerView f161399a;

        /* renamed from: b */
        final /* synthetic */ C72030c f161400b;

        /* renamed from: c */
        final /* synthetic */ Context f161401c;

        /* renamed from: d */
        final /* synthetic */ AttributeSet f161402d;

        static {
            Covode.recordClassIndex(84679);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1371n
        /* renamed from: a */
        public final void mo4753a(RecyclerView recyclerView, int i) {
            C89219l.m154721d(recyclerView, "");
            super.mo4753a(recyclerView, i);
            this.f161399a.mo4418b(this);
            this.f161400b.mo114234a(this.f161401c);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1371n
        /* renamed from: a */
        public final void mo4754a(RecyclerView recyclerView, int i, int i2) {
            C89219l.m154721d(recyclerView, "");
            super.mo4754a(recyclerView, i, i2);
            if (i != 0 || i2 != 0) {
                this.f161399a.mo4418b(this);
                this.f161400b.mo114234a(this.f161401c);
            }
        }

        C72031d(FastScrollRecyclerView fastScrollRecyclerView, C72030c cVar, Context context, AttributeSet attributeSet) {
            this.f161399a = fastScrollRecyclerView;
            this.f161400b = cVar;
            this.f161401c = context;
            this.f161402d = attributeSet;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    /* renamed from: b */
    public final boolean mo4420b(int i, int i2) {
        if (Math.abs(i2) > getScreenHeight() * 5) {
            if (C68085a.m120387a() == 2) {
                RecyclerView.AbstractC1350a adapter = getAdapter();
                if (!(adapter instanceof AbstractC72029b)) {
                    adapter = null;
                }
                AbstractC72029b bVar = (AbstractC72029b) adapter;
                if (bVar != null) {
                    bVar.mo114232a();
                }
            }
            C80461fw.m139467a("tool_album_scroll_high_speed", 500, -1);
        }
        if (((double) AbstractC89255c.Default.nextFloat()) < 0.1d) {
            C80461fw.m139467a("tool_album_scroll", 500, -1);
        }
        return super.mo4420b(i, i2);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private FastScrollRecyclerView(Context context, AttributeSet attributeSet, byte b) {
        super(context, attributeSet, 0);
        C89219l.m154721d(context, "");
        this.f161396S = C89250i.m154773a((AbstractC89171a) new C72032e(this));
        mo4405a(new C72031d(this, new C72030c(this), context, attributeSet));
        mo4405a(new RecyclerView.AbstractC1371n(this) {
            /* class com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.FastScrollRecyclerView.C720271 */

            /* renamed from: a */
            final /* synthetic */ FastScrollRecyclerView f161397a;

            static {
                Covode.recordClassIndex(84675);
            }

            /* JADX WARN: Incorrect args count in method signature: ()V */
            {
                this.f161397a = r1;
            }

            @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1371n
            /* renamed from: a */
            public final void mo4753a(RecyclerView recyclerView, int i) {
                C89219l.m154721d(recyclerView, "");
                super.mo4753a(recyclerView, i);
                if (C68085a.m120387a() == 2) {
                    if (i != 2) {
                        RecyclerView.AbstractC1350a adapter = this.f161397a.getAdapter();
                        if (!(adapter instanceof AbstractC72029b)) {
                            adapter = null;
                        }
                        AbstractC72029b bVar = (AbstractC72029b) adapter;
                        if (bVar != null) {
                            bVar.mo114233b();
                        }
                    } else {
                        return;
                    }
                }
                if (i != 2) {
                    C80461fw.m139466a("tool_album_scroll");
                    C80461fw.m139466a("tool_album_scroll_high_speed");
                }
            }
        });
        addOnAttachStateChangeListener(new View$OnAttachStateChangeListenerC2587f());
    }
}
