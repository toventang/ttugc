package com.p2082ss.android.ugc.aweme.feed.caption;

import android.content.Context;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.core.content.C0643b;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.dmt.p1194ui.widget.util.C17301b;
import com.bytedance.ies.dmt.p1194ui.widget.util.C17303d;
import com.bytedance.tux.button.TuxButton;
import com.bytedance.tux.input.TuxTextView;
import com.p2082ss.android.ugc.trill.R;
import java.util.Arrays;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.feed.caption.b */
public final class C49335b extends LinearLayout {

    /* renamed from: a */
    private final ImageView f113377a;

    /* renamed from: b */
    private final TuxTextView f113378b;

    /* renamed from: c */
    private final TuxButton f113379c;

    /* renamed from: d */
    private final TuxTextView f113380d;

    /* renamed from: e */
    private final TuxTextView f113381e;

    static {
        Covode.recordClassIndex(58136);
    }

    public final TuxButton getBtnDismiss() {
        return this.f113379c;
    }

    public final ImageView getIvClose() {
        return this.f113377a;
    }

    public final TuxTextView getModalTitle() {
        return this.f113381e;
    }

    public final TuxTextView getTvGoSetting() {
        return this.f113380d;
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.caption.b$a */
    public static final class C49336a extends ClickableSpan {

        /* renamed from: a */
        final /* synthetic */ C49335b f113382a;

        /* renamed from: b */
        final /* synthetic */ View.OnClickListener f113383b;

        static {
            Covode.recordClassIndex(58137);
        }

        public final void onClick(View view) {
            C89219l.m154721d(view, "");
            this.f113383b.onClick(view);
        }

        public final void updateDrawState(TextPaint textPaint) {
            C89219l.m154721d(textPaint, "");
            super.updateDrawState(textPaint);
            textPaint.setColor(C0643b.m2378c(this.f113382a.getContext(), R.color.a2));
            textPaint.setUnderlineText(false);
            textPaint.setTypeface(C17301b.m32033a().mo27611a(C17303d.f41573g));
        }

        C49336a(C49335b bVar, View.OnClickListener onClickListener) {
            this.f113382a = bVar;
            this.f113383b = onClickListener;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private C49335b(Context context) {
        super(context, null, 0);
        C89219l.m154721d(context, "");
        MethodCollector.m26663i(4770);
        View inflate = View.inflate(context, R.layout.ru, this);
        View findViewById = inflate.findViewById(R.id.bu5);
        C89219l.m154716b(findViewById, "");
        this.f113377a = (ImageView) findViewById;
        View findViewById2 = inflate.findViewById(R.id.ex_);
        C89219l.m154716b(findViewById2, "");
        this.f113378b = (TuxTextView) findViewById2;
        View findViewById3 = inflate.findViewById(R.id.xg);
        C89219l.m154716b(findViewById3, "");
        this.f113379c = (TuxButton) findViewById3;
        View findViewById4 = inflate.findViewById(R.id.ewo);
        C89219l.m154716b(findViewById4, "");
        this.f113380d = (TuxTextView) findViewById4;
        View findViewById5 = inflate.findViewById(R.id.bpn);
        C89219l.m154716b(findViewById5, "");
        this.f113381e = (TuxTextView) findViewById5;
        MethodCollector.m26664o(4770);
    }

    public /* synthetic */ C49335b(Context context, byte b) {
        this(context);
    }

    /* renamed from: a */
    public final void mo80921a(View.OnClickListener onClickListener, boolean z) {
        int i;
        int i2;
        C89219l.m154721d(onClickListener, "");
        TuxTextView tuxTextView = this.f113381e;
        Context context = getContext();
        if (z) {
            i = R.string.h_g;
        } else {
            i = R.string.h_f;
        }
        tuxTextView.setText(context.getString(i));
        Context context2 = getContext();
        if (z) {
            i2 = R.string.h_k;
        } else {
            i2 = R.string.h_j;
        }
        String string = context2.getString(i2);
        C89219l.m154716b(string, "");
        String string2 = getContext().getString(R.string.h_e);
        C89219l.m154716b(string2, "");
        String a = C1764a.m5928a(string, Arrays.copyOf(new Object[]{string2}, 1));
        C89219l.m154716b(a, "");
        SpannableString spannableString = new SpannableString(a);
        int a2 = C89361p.m154888a((CharSequence) spannableString, string2, 0, false, 6);
        spannableString.setSpan(new C49336a(this, onClickListener), a2, string2.length() + a2, 33);
        this.f113378b.setHighlightColor(C0643b.m2378c(getContext(), R.color.c9));
        this.f113378b.setMovementMethod(LinkMovementMethod.getInstance());
        this.f113378b.setText(spannableString);
    }
}
