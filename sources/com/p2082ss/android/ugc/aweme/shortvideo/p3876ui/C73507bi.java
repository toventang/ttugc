package com.p2082ss.android.ugc.aweme.shortvideo.p3876ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.common.views.CommonItemView;
import com.p2082ss.android.ugc.aweme.shortvideo.publish.C72683v;
import com.p2082ss.android.ugc.trill.R;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.bi */
public final class C73507bi extends RecyclerView.ViewHolder {

    /* renamed from: a */
    public final CommonItemView f165148a;

    /* renamed from: b */
    final View f165149b;

    static {
        Covode.recordClassIndex(86244);
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.bi$a */
    public static class C73508a extends RecyclerView.ViewHolder {

        /* renamed from: a */
        public final CommonItemView f165150a;

        /* renamed from: b */
        final View f165151b;

        static {
            Covode.recordClassIndex(86245);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C73508a(View view) {
            super(view);
            C89219l.m154721d(view, "");
            View findViewById = this.itemView.findViewById(R.id.a_b);
            C89219l.m154716b(findViewById, "");
            this.f165150a = (CommonItemView) findViewById;
            View findViewById2 = this.itemView.findViewById(R.id.am_);
            C89219l.m154716b(findViewById2, "");
            this.f165151b = findViewById2;
        }

        /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.bi$a$a */
        static final class View$OnClickListenerC73509a implements View.OnClickListener {

            /* renamed from: a */
            final /* synthetic */ C73508a f165152a;

            /* renamed from: b */
            final /* synthetic */ C72683v f165153b;

            static {
                Covode.recordClassIndex(86246);
            }

            View$OnClickListenerC73509a(C73508a aVar, C72683v vVar) {
                this.f165152a = aVar;
                this.f165153b = vVar;
            }

            public final void onClick(View view) {
                ClickAgent.onClick(view);
                if (this.f165153b.f162950c != null && this.f165153b.f162951d) {
                    AbstractC89183m<? super View, ? super CommonItemView, C89391z> mVar = this.f165153b.f162950c;
                    if (mVar == null) {
                        C89219l.m154715b();
                    }
                    View view2 = this.f165152a.itemView;
                    C89219l.m154716b(view2, "");
                    mVar.invoke(view2, this.f165152a.f165150a);
                } else if (this.f165153b.f162949b != null) {
                    AbstractC89172b<? super View, C89391z> bVar = this.f165153b.f162949b;
                    if (bVar == null) {
                        C89219l.m154715b();
                    }
                    View view3 = this.f165152a.itemView;
                    C89219l.m154716b(view3, "");
                    bVar.invoke(view3);
                }
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C73507bi(View view) {
        super(view);
        C89219l.m154721d(view, "");
        View findViewById = this.itemView.findViewById(R.id.a_b);
        C89219l.m154716b(findViewById, "");
        this.f165148a = (CommonItemView) findViewById;
        View findViewById2 = this.itemView.findViewById(R.id.am_);
        C89219l.m154716b(findViewById2, "");
        this.f165149b = findViewById2;
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.bi$b */
    static final class View$OnClickListenerC73510b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C73507bi f165154a;

        /* renamed from: b */
        final /* synthetic */ C72683v f165155b;

        static {
            Covode.recordClassIndex(86247);
        }

        View$OnClickListenerC73510b(C73507bi biVar, C72683v vVar) {
            this.f165154a = biVar;
            this.f165155b = vVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            if (this.f165155b.f162950c == null || !this.f165155b.f162951d) {
                C72683v vVar = this.f165155b;
                vVar.f162957j = !vVar.f162957j;
                this.f165154a.f165148a.setChecked(this.f165155b.f162957j);
                AbstractC89183m<? super CommonItemView, ? super Boolean, C89391z> mVar = this.f165155b.f162958k;
                if (mVar != null) {
                    mVar.invoke(this.f165154a.f165148a, Boolean.valueOf(this.f165155b.f162957j));
                }
                AbstractC89172b<? super View, C89391z> bVar = this.f165155b.f162949b;
                if (bVar != null) {
                    C89219l.m154716b(view, "");
                    bVar.invoke(view);
                    return;
                }
                return;
            }
            AbstractC89183m<? super View, ? super CommonItemView, C89391z> mVar2 = this.f165155b.f162950c;
            if (mVar2 == null) {
                C89219l.m154715b();
            }
            View view2 = this.f165154a.itemView;
            C89219l.m154716b(view2, "");
            mVar2.invoke(view2, this.f165154a.f165148a);
        }
    }
}
