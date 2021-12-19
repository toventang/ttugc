package com.p2082ss.android.ugc.aweme.commercialize.views.bottomdialog;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.trill.R;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.commercialize.views.bottomdialog.d */
public final class C38852d extends RecyclerView.ViewHolder {

    /* renamed from: a */
    public static final C38853a f91737a = new C38853a((byte) 0);

    /* renamed from: b */
    private final AbstractC89244h f91738b;

    /* renamed from: c */
    private final AbstractC89244h f91739c;

    static {
        Covode.recordClassIndex(46406);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final FrameLayout mo67457a() {
        return (FrameLayout) this.f91738b.getValue();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final LinearLayout mo67458b() {
        return (LinearLayout) this.f91739c.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.bottomdialog.d$a */
    public static final class C38853a {
        static {
            Covode.recordClassIndex(46407);
        }

        private C38853a() {
        }

        public /* synthetic */ C38853a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.bottomdialog.d$c */
    static final class C38855c extends AbstractC89220m implements AbstractC89171a<LinearLayout> {

        /* renamed from: a */
        final /* synthetic */ View f91742a;

        static {
            Covode.recordClassIndex(46409);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C38855c(View view) {
            super(0);
            this.f91742a = view;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ LinearLayout invoke() {
            return this.f91742a.findViewById(R.id.cmy);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.bottomdialog.d$d */
    static final class C38856d extends AbstractC89220m implements AbstractC89171a<FrameLayout> {

        /* renamed from: a */
        final /* synthetic */ View f91743a;

        static {
            Covode.recordClassIndex(46410);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C38856d(View view) {
            super(0);
            this.f91743a = view;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ FrameLayout invoke() {
            return this.f91743a.findViewById(R.id.e1f);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.bottomdialog.d$b */
    static final class View$OnClickListenerC38854b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C38838b f91740a;

        /* renamed from: b */
        final /* synthetic */ int f91741b;

        static {
            Covode.recordClassIndex(46408);
        }

        View$OnClickListenerC38854b(C38838b bVar, int i) {
            this.f91740a = bVar;
            this.f91741b = i;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f91740a.mo67451a(this.f91741b);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C38852d(View view) {
        super(view);
        C89219l.m154721d(view, "");
        this.f91738b = C89250i.m154773a((AbstractC89171a) new C38856d(view));
        this.f91739c = C89250i.m154773a((AbstractC89171a) new C38855c(view));
    }
}
