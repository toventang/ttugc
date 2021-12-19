package com.p2082ss.android.ugc.aweme.friends.widget.contact.p3024a;

import android.content.res.Resources;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.input.TuxTextView;
import com.p2082ss.android.ugc.aweme.friends.widget.contact.C51795h;
import com.p2082ss.android.ugc.aweme.inbox.widget.C56520b;
import com.p2082ss.android.ugc.trill.R;
import java.util.Objects;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4615g.C89241a;

/* renamed from: com.ss.android.ugc.aweme.friends.widget.contact.a.b */
public final class C51772b extends AbstractC51771a<C51795h> {

    /* renamed from: e */
    private final AbstractC89244h f119328e;

    /* renamed from: f */
    private final int f119329f;

    static {
        Covode.recordClassIndex(61137);
    }

    /* renamed from: com.ss.android.ugc.aweme.friends.widget.contact.a.b$a */
    static final class C51773a extends AbstractC89220m implements AbstractC89171a<TuxTextView> {

        /* renamed from: a */
        final /* synthetic */ View f119330a;

        static {
            Covode.recordClassIndex(61138);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C51773a(View view) {
            super(0);
            this.f119330a = view;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ TuxTextView invoke() {
            return this.f119330a.findViewById(R.id.bpp);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C51772b(View view) {
        super(view);
        C89219l.m154721d(view, "");
        this.f119328e = C89250i.m154773a((AbstractC89171a) new C51773a(view));
        Resources system = Resources.getSystem();
        C89219l.m154709a((Object) system, "");
        this.f119329f = C89241a.m154730a(TypedValue.applyDimension(1, 21.0f, system.getDisplayMetrics()));
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.ss.android.ugc.aweme.friends.widget.contact.a] */
    @Override // com.p2082ss.android.ugc.aweme.friends.widget.contact.p3024a.AbstractC51771a
    /* renamed from: a */
    public final /* synthetic */ void mo87498a(C51795h hVar) {
        C51795h hVar2 = hVar;
        C89219l.m154721d(hVar2, "");
        if (hVar2.f119361b == -1) {
            View view = this.itemView;
            C89219l.m154716b(view, "");
            view.setVisibility(8);
            return;
        }
        TuxTextView tuxTextView = (TuxTextView) this.f119328e.getValue();
        C89219l.m154716b(tuxTextView, "");
        View view2 = this.itemView;
        C89219l.m154716b(view2, "");
        tuxTextView.setText(view2.getContext().getString(hVar2.f119361b));
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.friends.widget.contact.p3024a.AbstractC51771a
    /* renamed from: b */
    public final void mo87501b(C56520b bVar) {
        C89219l.m154721d(bVar, "");
        if (bVar.f128859a != -1) {
            View view = this.itemView;
            C89219l.m154716b(view, "");
            if (view.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
                View view2 = this.itemView;
                C89219l.m154716b(view2, "");
                ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = bVar.f128859a - this.f119329f;
            }
        }
    }
}
