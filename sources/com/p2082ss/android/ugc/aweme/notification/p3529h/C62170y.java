package com.p2082ss.android.ugc.aweme.notification.p3529h;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.input.TuxTextView;
import com.p2082ss.android.ugc.aweme.notification.bean.C61878k;
import com.p2082ss.android.ugc.trill.R;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.notification.h.y */
public final class C62170y extends RecyclerView.ViewHolder {

    /* renamed from: a */
    private final AbstractC89244h f141168a;

    static {
        Covode.recordClassIndex(72924);
    }

    /* renamed from: a */
    private final TuxTextView m112440a() {
        return (TuxTextView) this.f141168a.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.h.y$a */
    static final class C62171a extends AbstractC89220m implements AbstractC89171a<TuxTextView> {

        /* renamed from: a */
        final /* synthetic */ View f141169a;

        static {
            Covode.recordClassIndex(72925);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C62171a(View view) {
            super(0);
            this.f141169a = view;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ TuxTextView invoke() {
            return this.f141169a.findViewById(R.id.text);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C62170y(View view) {
        super(view);
        C89219l.m154721d(view, "");
        this.f141168a = C89250i.m154773a((AbstractC89171a) new C62171a(view));
    }

    /* renamed from: a */
    public final void mo100169a(C61878k kVar) {
        C89219l.m154721d(kVar, "");
        int type = kVar.getType();
        if (type == 0) {
            TuxTextView a = m112440a();
            C89219l.m154716b(a, "");
            View view = this.itemView;
            C89219l.m154716b(view, "");
            a.setText(view.getContext().getString(R.string.dju));
        } else if (type == 1) {
            TuxTextView a2 = m112440a();
            C89219l.m154716b(a2, "");
            View view2 = this.itemView;
            C89219l.m154716b(view2, "");
            a2.setText(view2.getContext().getString(R.string.djv));
        }
    }
}
