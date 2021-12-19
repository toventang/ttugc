package com.p2082ss.android.ugc.aweme.account.login.p2254a;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.input.TuxTextView;
import com.p2082ss.android.ugc.trill.R;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.EnumC89331m;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.account.login.a.d */
public final class C31818d extends RecyclerView.ViewHolder {

    /* renamed from: a */
    final AbstractC89244h f76046a;

    /* renamed from: b */
    AbstractC31817c f76047b;

    /* renamed from: c */
    private final AbstractC89244h f76048c;

    /* renamed from: d */
    private final AbstractC89244h f76049d;

    /* renamed from: e */
    private final AbstractC89244h f76050e;

    static {
        Covode.recordClassIndex(38560);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final ImageView mo57769a() {
        return (ImageView) this.f76048c.getValue();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final ConstraintLayout mo57770b() {
        return (ConstraintLayout) this.f76049d.getValue();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final TextView mo57771c() {
        return (TextView) this.f76050e.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.a.d$b */
    static final class C31820b extends AbstractC89220m implements AbstractC89171a<TextView> {

        /* renamed from: a */
        final /* synthetic */ View f76052a;

        static {
            Covode.recordClassIndex(38562);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C31820b(View view) {
            super(0);
            this.f76052a = view;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ TextView invoke() {
            return this.f76052a.findViewById(R.id.a41);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.a.d$c */
    static final class C31821c extends AbstractC89220m implements AbstractC89171a<ConstraintLayout> {

        /* renamed from: a */
        final /* synthetic */ View f76053a;

        static {
            Covode.recordClassIndex(38563);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C31821c(View view) {
            super(0);
            this.f76053a = view;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ ConstraintLayout invoke() {
            return this.f76053a.findViewById(R.id.acf);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.a.d$d */
    static final class C31822d extends AbstractC89220m implements AbstractC89171a<TuxTextView> {

        /* renamed from: a */
        final /* synthetic */ View f76054a;

        static {
            Covode.recordClassIndex(38564);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C31822d(View view) {
            super(0);
            this.f76054a = view;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ TuxTextView invoke() {
            return this.f76054a.findViewById(R.id.ajf);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.a.d$e */
    static final class C31823e extends AbstractC89220m implements AbstractC89171a<ImageView> {

        /* renamed from: a */
        final /* synthetic */ View f76055a;

        static {
            Covode.recordClassIndex(38565);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C31823e(View view) {
            super(0);
            this.f76055a = view;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ ImageView invoke() {
            return this.f76055a.findViewById(R.id.bh1);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.a.d$a */
    static final class View$OnClickListenerC31819a implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ AbstractC31817c f76051a;

        static {
            Covode.recordClassIndex(38561);
        }

        View$OnClickListenerC31819a(AbstractC31817c cVar) {
            this.f76051a = cVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            AbstractC31817c cVar = this.f76051a;
            if (cVar != null) {
                cVar.mo57768a();
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C31818d(View view) {
        super(view);
        C89219l.m154721d(view, "");
        this.f76046a = C89250i.m154774a(EnumC89331m.NONE, new C31822d(view));
        this.f76048c = C89250i.m154774a(EnumC89331m.NONE, new C31823e(view));
        this.f76049d = C89250i.m154774a(EnumC89331m.NONE, new C31821c(view));
        this.f76050e = C89250i.m154774a(EnumC89331m.NONE, new C31820b(view));
    }
}
