package com.p2082ss.android.ugc.aweme.interest;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.input.TuxTextView;
import com.p2082ss.android.ugc.aweme.journey.AbstractC56854e;
import com.p2082ss.android.ugc.aweme.journey.C57054w;
import com.p2082ss.android.ugc.aweme.journey.step.interestselector.C56969a;
import com.p2082ss.android.ugc.trill.R;
import java.util.List;
import java.util.Objects;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.interest.c */
public final class C56802c extends C56969a {
    static {
        Covode.recordClassIndex(66668);
    }

    @Override // com.p2082ss.android.ugc.aweme.journey.step.interestselector.C56969a, com.p2082ss.android.ugc.aweme.journey.AbstractC56860g
    /* renamed from: a */
    public final AbstractC56854e mo93949a(ViewGroup viewGroup) {
        C89219l.m154721d(viewGroup, "");
        View a = C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), R.layout.abj, viewGroup, false);
        C89219l.m154716b(a, "");
        Context context = a.getContext();
        Objects.requireNonNull(context, "null cannot be cast to non-null type com.ss.android.ugc.aweme.interest.UpdateInterestActivity");
        int i = ((UpdateInterestActivity) context).f129346a;
        if (i > 0) {
            a.getLayoutParams().width = i;
        }
        a.setLayoutParams(a.getLayoutParams());
        TuxTextView tuxTextView = (TuxTextView) a.findViewById(R.id.el_);
        C89219l.m154716b(tuxTextView, "");
        return new C56803a(a, a, tuxTextView.getText().toString());
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C56802c(List<C57054w> list, AbstractC89172b<? super Integer, C89391z> bVar) {
        super(list, true, bVar, null);
        C89219l.m154721d(list, "");
        C89219l.m154721d(bVar, "");
    }

    /* renamed from: com.ss.android.ugc.aweme.interest.c$a */
    public static final class C56803a extends AbstractC56854e {

        /* renamed from: a */
        final /* synthetic */ View f129366a;

        static {
            Covode.recordClassIndex(66669);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C56803a(View view, View view2, String str) {
            super(view2, str);
            this.f129366a = view;
        }
    }
}
