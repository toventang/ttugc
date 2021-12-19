package com.p2082ss.android.ugc.aweme.commercialize.p2535b.p2536a;

import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.AbstractC1214u;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.base.p2379ui.RemoteImageView;
import com.p2082ss.android.ugc.aweme.shortvideo.model.AnchorPublishStruct;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.commercialize.b.a.f */
public final class C37616f extends RecyclerView.ViewHolder {

    /* renamed from: a */
    final RemoteImageView f88923a;

    /* renamed from: b */
    final TextView f88924b;

    /* renamed from: c */
    public final ConstraintLayout f88925c;

    /* renamed from: d */
    final TextView f88926d;

    /* renamed from: e */
    final TextView f88927e;

    /* renamed from: f */
    final TextView f88928f;

    /* renamed from: g */
    final View f88929g;

    /* renamed from: h */
    public final AbstractC1204m f88930h;

    static {
        Covode.recordClassIndex(45038);
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.b.a.f$b */
    static final class View$OnClickListenerC37618b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ AnchorPublishStruct f88932a;

        static {
            Covode.recordClassIndex(45040);
        }

        View$OnClickListenerC37618b(AnchorPublishStruct anchorPublishStruct) {
            this.f88932a = anchorPublishStruct;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f88932a.onClickAction.invoke();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.b.a.f$a */
    static final class C37617a<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ C37616f f88931a;

        static {
            Covode.recordClassIndex(45039);
        }

        C37617a(C37616f fVar) {
            this.f88931a = fVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            float f;
            Boolean bool = (Boolean) obj;
            if (bool != null) {
                boolean booleanValue = bool.booleanValue();
                ConstraintLayout constraintLayout = this.f88931a.f88925c;
                if (booleanValue) {
                    f = 1.0f;
                } else {
                    f = 0.34f;
                }
                constraintLayout.setAlpha(f);
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C37616f(View view, AbstractC1204m mVar) {
        super(view);
        C89219l.m154721d(view, "");
        C89219l.m154721d(mVar, "");
        this.f88930h = mVar;
        View findViewById = this.itemView.findViewById(R.id.bse);
        C89219l.m154716b(findViewById, "");
        this.f88923a = (RemoteImageView) findViewById;
        View findViewById2 = this.itemView.findViewById(R.id.es7);
        C89219l.m154716b(findViewById2, "");
        this.f88924b = (TextView) findViewById2;
        View findViewById3 = this.itemView.findViewById(R.id.ix);
        C89219l.m154716b(findViewById3, "");
        this.f88925c = (ConstraintLayout) findViewById3;
        View findViewById4 = this.itemView.findViewById(R.id.f4y);
        C89219l.m154716b(findViewById4, "");
        this.f88926d = (TextView) findViewById4;
        View findViewById5 = this.itemView.findViewById(R.id.ro);
        C89219l.m154716b(findViewById5, "");
        this.f88927e = (TextView) findViewById5;
        View findViewById6 = this.itemView.findViewById(R.id.bqe);
        C89219l.m154716b(findViewById6, "");
        this.f88928f = (TextView) findViewById6;
        View findViewById7 = this.itemView.findViewById(R.id.c93);
        C89219l.m154716b(findViewById7, "");
        this.f88929g = findViewById7;
    }
}
