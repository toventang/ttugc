package com.p2082ss.android.ugc.aweme.compliance.business.banappeal.p2644b;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.input.TuxTextView;
import com.p2082ss.android.ugc.trill.R;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.compliance.business.banappeal.b.c */
public final class C39332c extends ConstraintLayout {

    /* renamed from: g */
    final TuxTextView f92844g;

    /* renamed from: h */
    private final TuxTextView f92845h;

    /* renamed from: i */
    private final TuxTextView f92846i;

    /* renamed from: j */
    private final ViewGroup f92847j;

    /* renamed from: com.ss.android.ugc.aweme.compliance.business.banappeal.b.c$a */
    final /* synthetic */ class View$OnClickListenerC39333a implements View.OnClickListener {

        /* renamed from: a */
        private final /* synthetic */ AbstractC89172b f92848a;

        static {
            Covode.recordClassIndex(47013);
        }

        View$OnClickListenerC39333a(AbstractC89172b bVar) {
            this.f92848a = bVar;
        }

        public final /* synthetic */ void onClick(View view) {
            ClickAgent.onClick(view);
            C89219l.m154716b(this.f92848a.invoke(view), "");
        }
    }

    static {
        Covode.recordClassIndex(47012);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private C39332c(Context context) {
        super(context, null, 0);
        C89219l.m154721d(context, "");
        ConstraintLayout.inflate(getContext(), R.layout.tv, this);
        View findViewById = findViewById(R.id.akv);
        C89219l.m154716b(findViewById, "");
        this.f92845h = (TuxTextView) findViewById;
        View findViewById2 = findViewById(R.id.akw);
        C89219l.m154716b(findViewById2, "");
        this.f92846i = (TuxTextView) findViewById2;
        View findViewById3 = findViewById(R.id.aks);
        C89219l.m154716b(findViewById3, "");
        this.f92847j = (ViewGroup) findViewById3;
        View findViewById4 = findViewById(R.id.aku);
        C89219l.m154716b(findViewById4, "");
        TuxTextView tuxTextView = (TuxTextView) findViewById4;
        this.f92844g = tuxTextView;
        tuxTextView.setVisibility(8);
    }

    public /* synthetic */ C39332c(Context context, byte b) {
        this(context);
    }

    /* renamed from: a */
    public final void mo68756a(String str, String str2, AbstractC89172b<? super View, C89391z> bVar) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C89219l.m154721d(bVar, "");
        this.f92847j.setVisibility(0);
        this.f92845h.setText(str);
        this.f92846i.setText(str2);
        this.f92846i.setOnClickListener(new View$OnClickListenerC39333a(bVar));
    }
}
