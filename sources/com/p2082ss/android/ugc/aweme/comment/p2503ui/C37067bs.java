package com.p2082ss.android.ugc.aweme.comment.p2503ui;

import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.text.style.StyleSpan;
import android.view.View;
import android.widget.TextView;
import androidx.core.content.C0643b;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.icon.TuxIconView;
import com.p2082ss.android.ugc.trill.R;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.comment.ui.bs */
public final class C37067bs {

    /* renamed from: a */
    public final View f87328a;

    /* renamed from: b */
    private final AbstractC89244h f87329b = C89250i.m154773a((AbstractC89171a) new C37073f(this));

    /* renamed from: c */
    private final AbstractC89244h f87330c = C89250i.m154773a((AbstractC89171a) new C37072e(this));

    /* renamed from: com.ss.android.ugc.aweme.comment.ui.bs$a */
    public interface AbstractC37068a {
        static {
            Covode.recordClassIndex(44422);
        }

        /* renamed from: a */
        void mo64567a();

        /* renamed from: b */
        void mo64568b();
    }

    static {
        Covode.recordClassIndex(44421);
    }

    /* renamed from: a */
    private TextView m74754a() {
        return (TextView) this.f87329b.getValue();
    }

    /* renamed from: b */
    private TuxIconView m74755b() {
        return (TuxIconView) this.f87330c.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.ui.bs$e */
    static final class C37072e extends AbstractC89220m implements AbstractC89171a<TuxIconView> {

        /* renamed from: a */
        final /* synthetic */ C37067bs f87342a;

        static {
            Covode.recordClassIndex(44426);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C37072e(C37067bs bsVar) {
            super(0);
            this.f87342a = bsVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ TuxIconView invoke() {
            return this.f87342a.f87328a.findViewById(R.id.c8n);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.ui.bs$f */
    static final class C37073f extends AbstractC89220m implements AbstractC89171a<TextView> {

        /* renamed from: a */
        final /* synthetic */ C37067bs f87343a;

        static {
            Covode.recordClassIndex(44427);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C37073f(C37067bs bsVar) {
            super(0);
            this.f87343a = bsVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ TextView invoke() {
            return this.f87343a.f87328a.findViewById(R.id.egy);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.ui.bs$c */
    public static final class C37070c extends ClickableSpan {

        /* renamed from: a */
        final /* synthetic */ int f87336a;

        /* renamed from: b */
        final /* synthetic */ int f87337b;

        /* renamed from: c */
        final /* synthetic */ C37067bs f87338c;

        /* renamed from: d */
        final /* synthetic */ C37069b f87339d;

        static {
            Covode.recordClassIndex(44424);
        }

        public final void onClick(View view) {
            C89219l.m154721d(view, "");
            this.f87339d.f87335e.mo64567a();
        }

        public final void updateDrawState(TextPaint textPaint) {
            C89219l.m154721d(textPaint, "");
            super.updateDrawState(textPaint);
            textPaint.setUnderlineText(false);
        }

        C37070c(int i, int i2, C37067bs bsVar, C37069b bVar) {
            this.f87336a = i;
            this.f87337b = i2;
            this.f87338c = bsVar;
            this.f87339d = bVar;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.comment.ui.bs$d */
    public static final class View$OnClickListenerC37071d implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C37067bs f87340a;

        /* renamed from: b */
        final /* synthetic */ C37069b f87341b;

        static {
            Covode.recordClassIndex(44425);
        }

        View$OnClickListenerC37071d(C37067bs bsVar, C37069b bVar) {
            this.f87340a = bsVar;
            this.f87341b = bVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f87341b.f87335e.mo64568b();
        }
    }

    public C37067bs(View view) {
        C89219l.m154721d(view, "");
        this.f87328a = view;
        view.setTag(this);
    }

    /* renamed from: a */
    public final void mo64566a(boolean z) {
        TuxIconView b = m74755b();
        if (z) {
            b.setIconRes(R.raw.icon_thumbs_up_fill);
            b.setColorFilter(C0643b.m2378c(this.f87328a.getContext(), R.color.bh));
            return;
        }
        b.setIconRes(R.raw.icon_thumbs_up);
        b.setColorFilter(C0643b.m2378c(this.f87328a.getContext(), R.color.bx));
    }

    /* renamed from: a */
    public final void mo64565a(C37069b bVar) {
        C89219l.m154721d(bVar, "");
        int a = C89361p.m154888a((CharSequence) bVar.f87331a, bVar.f87333c, 0, false, 6);
        int length = bVar.f87333c.length() + a;
        TextView a2 = m74754a();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(bVar.f87331a);
        if (a > 0) {
            spannableStringBuilder.setSpan(new StyleSpan(1), a, length, 33);
            spannableStringBuilder.setSpan(new C37070c(a, length, this, bVar), a, length, 33);
        }
        a2.setText(spannableStringBuilder);
        m74754a().setMovementMethod(new LinkMovementMethod());
        mo64566a(bVar.f87334d);
        m74755b().setOnClickListener(new View$OnClickListenerC37071d(this, bVar));
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.ui.bs$b */
    public static final class C37069b {

        /* renamed from: a */
        public final String f87331a;

        /* renamed from: b */
        public final String f87332b;

        /* renamed from: c */
        public final String f87333c;

        /* renamed from: d */
        public final boolean f87334d;

        /* renamed from: e */
        public final AbstractC37068a f87335e;

        static {
            Covode.recordClassIndex(44423);
        }

        public C37069b(String str, String str2, String str3, boolean z, AbstractC37068a aVar) {
            C89219l.m154721d(str, "");
            C89219l.m154721d(str2, "");
            C89219l.m154721d(str3, "");
            C89219l.m154721d(aVar, "");
            this.f87331a = str;
            this.f87332b = str2;
            this.f87333c = str3;
            this.f87334d = z;
            this.f87335e = aVar;
        }
    }
}
