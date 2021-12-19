package com.p2082ss.android.ugc.aweme.ecommerce.review.view;

import android.content.Context;
import android.text.SpannableString;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.core.p037h.C0792v;
import com.C1764a;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.tux.input.TuxTextView;
import com.p2082ss.android.ugc.trill.R;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.review.view.ViewMoreText */
public final class ViewMoreText extends FrameLayout {

    /* renamed from: a */
    public AbstractC89172b<? super Boolean, C89391z> f105388a;

    /* renamed from: b */
    private SparseArray f105389b;

    static {
        Covode.recordClassIndex(53651);
    }

    public ViewMoreText(Context context) {
        this(context, (AttributeSet) null, 6);
    }

    public ViewMoreText(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    /* renamed from: a */
    public final View mo76315a(int i) {
        if (this.f105389b == null) {
            this.f105389b = new SparseArray();
        }
        View view = (View) this.f105389b.get(i);
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f105389b.put(i, findViewById);
        return findViewById;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.ecommerce.review.view.ViewMoreText$b */
    public static final class RunnableC45208b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ ViewMoreText f105392a;

        /* renamed from: b */
        final /* synthetic */ int f105393b;

        /* renamed from: c */
        final /* synthetic */ CharSequence f105394c;

        /* renamed from: d */
        final /* synthetic */ AbstractC89172b f105395d;

        static {
            Covode.recordClassIndex(53654);
        }

        RunnableC45208b(ViewMoreText viewMoreText, int i, CharSequence charSequence, AbstractC89172b bVar) {
            this.f105392a = viewMoreText;
            this.f105393b = i;
            this.f105394c = charSequence;
            this.f105395d = bVar;
        }

        public final void run() {
            try {
                C45209a aVar = new C45209a((TuxTextView) this.f105392a.mo76315a(R.id.acq), (this.f105392a.getWidth() - C0792v.m2770f(this.f105392a)) - C0792v.m2772g(this.f105392a), this.f105392a.getContext().getString(R.string.bh9), this.f105393b);
                CharSequence charSequence = this.f105394c;
                if (charSequence == null) {
                    charSequence = "";
                }
                SpannableString valueOf = SpannableString.valueOf(charSequence);
                if (aVar.f105400e && aVar.f105396a.getLineCount() > aVar.f105398c) {
                    int i = 1;
                    aVar.f105399d = true;
                    float measureText = aVar.f105396a.getPaint().measureText(" ..." + aVar.f105401f);
                    int lineStart = aVar.f105396a.getLayout().getLineStart(aVar.f105398c - 1);
                    int lineStart2 = aVar.f105396a.getLayout().getLineStart(aVar.f105398c) - 1;
                    int i2 = (int) (((float) aVar.f105397b) - measureText);
                    float measureText2 = aVar.f105396a.getPaint().measureText(valueOf.subSequence(lineStart, lineStart2).toString());
                    float f = (float) i2;
                    if (measureText2 > f) {
                        float f2 = measureText2 - f;
                        while (i < Math.min(15, lineStart2) && aVar.f105396a.getPaint().measureText(valueOf.subSequence(lineStart2 - i, lineStart2).toString()) <= f2) {
                            i++;
                        }
                    } else {
                        i = 0;
                    }
                    valueOf = SpannableString.valueOf(valueOf.subSequence(0, lineStart2 - i));
                }
                if (aVar.f105399d) {
                    TuxTextView tuxTextView = (TuxTextView) this.f105392a.mo76315a(R.id.acq);
                    C89219l.m154716b(tuxTextView, "");
                    AbstractC89172b bVar = this.f105395d;
                    C89219l.m154716b(valueOf, "");
                    tuxTextView.setText((CharSequence) bVar.invoke(valueOf));
                    LinearLayout linearLayout = (LinearLayout) this.f105392a.mo76315a(R.id.cld);
                    C89219l.m154716b(linearLayout, "");
                    linearLayout.setVisibility(0);
                    return;
                }
                TuxTextView tuxTextView2 = (TuxTextView) this.f105392a.mo76315a(R.id.acq);
                C89219l.m154716b(tuxTextView2, "");
                AbstractC89172b bVar2 = this.f105395d;
                C89219l.m154716b(valueOf, "");
                tuxTextView2.setText((CharSequence) bVar2.invoke(valueOf));
                LinearLayout linearLayout2 = (LinearLayout) this.f105392a.mo76315a(R.id.cld);
                C89219l.m154716b(linearLayout2, "");
                linearLayout2.setVisibility(8);
            } catch (Exception unused) {
            }
        }
    }

    public final void setExpandListener(AbstractC89172b<? super Boolean, C89391z> bVar) {
        this.f105388a = bVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.ecommerce.review.view.ViewMoreText$a */
    public static final class C45207a extends AbstractC89220m implements AbstractC89172b<CharSequence, SpannableString> {

        /* renamed from: a */
        public static final C45207a f105391a = new C45207a();

        static {
            Covode.recordClassIndex(53653);
        }

        C45207a() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ SpannableString invoke(CharSequence charSequence) {
            CharSequence charSequence2 = charSequence;
            C89219l.m154721d(charSequence2, "");
            SpannableString valueOf = SpannableString.valueOf(charSequence2);
            C89219l.m154716b(valueOf, "");
            return valueOf;
        }
    }

    public final void setContentTextColor(int i) {
        ((TuxTextView) mo76315a(R.id.acq)).setTextColor(i);
        ((TuxTextView) mo76315a(R.id.clt)).setTextColor(i);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    private /* synthetic */ ViewMoreText(Context context, AttributeSet attributeSet, int i) {
        this(context, (i & 2) != 0 ? null : attributeSet, (byte) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private ViewMoreText(Context context, AttributeSet attributeSet, byte b) {
        super(context, attributeSet, 0);
        C89219l.m154721d(context, "");
        MethodCollector.m26663i(7612);
        C1764a.m5927a(LayoutInflater.from(context), R.layout.qg, this, true);
        ((LinearLayout) mo76315a(R.id.cld)).setOnClickListener(new View.OnClickListener(this) {
            /* class com.p2082ss.android.ugc.aweme.ecommerce.review.view.ViewMoreText.View$OnClickListenerC452061 */

            /* renamed from: a */
            final /* synthetic */ ViewMoreText f105390a;

            static {
                Covode.recordClassIndex(53652);
            }

            {
                this.f105390a = r1;
            }

            public final void onClick(View view) {
                ClickAgent.onClick(view);
                AbstractC89172b<? super Boolean, C89391z> bVar = this.f105390a.f105388a;
                if (bVar != null) {
                    bVar.invoke(true);
                }
            }
        });
        TuxTextView tuxTextView = (TuxTextView) mo76315a(R.id.clt);
        C89219l.m154716b(tuxTextView, "");
        tuxTextView.setText(" ...");
        MethodCollector.m26664o(7612);
    }

    /* renamed from: a */
    public final void mo76316a(CharSequence charSequence, int i, boolean z, AbstractC89172b<? super CharSequence, ? extends CharSequence> bVar) {
        CharSequence charSequence2;
        C89219l.m154721d(bVar, "");
        if (!z) {
            TuxTextView tuxTextView = (TuxTextView) mo76315a(R.id.acq);
            C89219l.m154716b(tuxTextView, "");
            tuxTextView.setEllipsize(TextUtils.TruncateAt.END);
            TuxTextView tuxTextView2 = (TuxTextView) mo76315a(R.id.acq);
            C89219l.m154716b(tuxTextView2, "");
            if (charSequence == null) {
                charSequence = "";
            }
            SpannableString valueOf = SpannableString.valueOf(charSequence);
            C89219l.m154716b(valueOf, "");
            tuxTextView2.setText((CharSequence) bVar.invoke(valueOf));
            TuxTextView tuxTextView3 = (TuxTextView) mo76315a(R.id.acq);
            C89219l.m154716b(tuxTextView3, "");
            tuxTextView3.setMaxLines(i);
            LinearLayout linearLayout = (LinearLayout) mo76315a(R.id.cld);
            C89219l.m154716b(linearLayout, "");
            linearLayout.setVisibility(8);
            return;
        }
        TuxTextView tuxTextView4 = (TuxTextView) mo76315a(R.id.acq);
        C89219l.m154716b(tuxTextView4, "");
        tuxTextView4.setEllipsize(null);
        TuxTextView tuxTextView5 = (TuxTextView) mo76315a(R.id.acq);
        C89219l.m154716b(tuxTextView5, "");
        tuxTextView5.setMaxLines(Integer.MAX_VALUE);
        TuxTextView tuxTextView6 = (TuxTextView) mo76315a(R.id.acq);
        C89219l.m154716b(tuxTextView6, "");
        if (charSequence == null) {
            charSequence2 = "";
        } else {
            charSequence2 = charSequence;
        }
        SpannableString valueOf2 = SpannableString.valueOf(charSequence2);
        C89219l.m154716b(valueOf2, "");
        tuxTextView6.setText((CharSequence) bVar.invoke(valueOf2));
        post(new RunnableC45208b(this, i, charSequence, bVar));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.aweme.ecommerce.review.view.ViewMoreText */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public static /* synthetic */ void m87804a(ViewMoreText viewMoreText, CharSequence charSequence, int i, boolean z, AbstractC89172b bVar, int i2) {
        if ((i2 & 2) != 0) {
            i = Integer.MAX_VALUE;
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        if ((i2 & 8) != 0) {
            bVar = C45207a.f105391a;
        }
        viewMoreText.mo76316a(charSequence, i, z, bVar);
    }
}
