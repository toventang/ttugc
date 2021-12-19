package com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.tux.button.TuxButton;
import com.bytedance.tux.input.TuxTextView;
import com.p2082ss.android.ugc.aweme.adaptation.C33398a;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63247i;
import com.p2082ss.android.ugc.aweme.setting.C68065d;
import com.p2082ss.android.ugc.aweme.shortvideo.C71812ep;
import com.p2082ss.android.ugc.aweme.views.AbstractView$OnClickListenerC81432d;
import com.p2082ss.android.ugc.trill.R;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.d */
public final class C72205d extends ConstraintLayout {

    /* renamed from: h */
    public static final C72207a f161872h = new C72207a((byte) 0);

    /* renamed from: g */
    public AbstractC89171a<C89391z> f161873g;

    static {
        Covode.recordClassIndex(84870);
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.d$a */
    public static final class C72207a {
        static {
            Covode.recordClassIndex(84872);
        }

        private C72207a() {
        }

        public /* synthetic */ C72207a(byte b) {
            this();
        }
    }

    private final int getBottomMargin() {
        if (C89070n.m154522b(1, 4, 2, 5).contains(Integer.valueOf(C33398a.f79357a.mo59448a()))) {
            return C71812ep.m126783a(33.0d, C63247i.f143610a);
        }
        return 0;
    }

    public final void setConfirmCallBack(AbstractC89171a<C89391z> aVar) {
        C89219l.m154721d(aVar, "");
        this.f161873g = aVar;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private C72205d(Context context) {
        super(context, null, 0);
        ViewGroup.LayoutParams layoutParams;
        C89219l.m154721d(context, "");
        ConstraintLayout.C0547a aVar = null;
        MethodCollector.m26663i(9905);
        View inflate = LayoutInflater.from(context).inflate(R.layout.cx, this);
        int a = (int) (C68065d.m120371a() / 60000);
        View findViewById = inflate.findViewById(R.id.bci);
        TuxTextView tuxTextView = (TuxTextView) (!(findViewById instanceof TuxTextView) ? null : findViewById);
        if (tuxTextView != null) {
            tuxTextView.setText(String.valueOf(a) + ":00");
        }
        View findViewById2 = inflate.findViewById(R.id.bck);
        TuxTextView tuxTextView2 = (TuxTextView) (!(findViewById2 instanceof TuxTextView) ? null : findViewById2);
        if (tuxTextView2 != null) {
            tuxTextView2.setText(context.getResources().getQuantityString(R.plurals.f_, a, Integer.valueOf(a)));
        }
        View findViewById3 = inflate.findViewById(R.id.bcj);
        TuxTextView tuxTextView3 = (TuxTextView) (!(findViewById3 instanceof TuxTextView) ? null : findViewById3);
        if (tuxTextView3 != null) {
            tuxTextView3.setText(context.getResources().getQuantityString(R.plurals.f9, a, Integer.valueOf(a)));
        }
        View findViewById4 = inflate.findViewById(R.id.bcg);
        TuxButton tuxButton = (TuxButton) (!(findViewById4 instanceof TuxButton) ? null : findViewById4);
        if (tuxButton != null) {
            tuxButton.setOnClickListener(new AbstractView$OnClickListenerC81432d(this) {
                /* class com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.C72205d.C722061 */

                /* renamed from: a */
                final /* synthetic */ C72205d f161874a;

                static {
                    Covode.recordClassIndex(84871);
                }

                /* JADX WARN: Incorrect args count in method signature: ()V */
                {
                    this.f161874a = r1;
                }

                @Override // com.p2082ss.android.ugc.aweme.views.AbstractView$OnClickListenerC81432d
                /* renamed from: a */
                public final void mo77200a(View view) {
                    AbstractC89171a<C89391z> aVar = this.f161874a.f161873g;
                    if (aVar != null) {
                        aVar.invoke();
                    }
                }
            });
        }
        View findViewById5 = inflate.findViewById(R.id.acq);
        ConstraintLayout constraintLayout = (ConstraintLayout) (!(findViewById5 instanceof ConstraintLayout) ? null : findViewById5);
        if (constraintLayout != null) {
            layoutParams = constraintLayout.getLayoutParams();
        } else {
            layoutParams = null;
        }
        ConstraintLayout.C0547a aVar2 = layoutParams instanceof ConstraintLayout.C0547a ? layoutParams : aVar;
        if (aVar2 != null) {
            aVar2.bottomMargin += getBottomMargin();
            constraintLayout.setLayoutParams(aVar2);
        }
        MethodCollector.m26664o(9905);
    }

    public /* synthetic */ C72205d(Context context, byte b) {
        this(context);
    }
}
