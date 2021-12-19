package com.bytedance.tux.dialog.p1715d;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.p1719f.C23136b;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.tux.dialog.d.b */
public final class C23046b extends AbstractC23047c {

    /* renamed from: a */
    public CharSequence f54549a;

    /* renamed from: b */
    public CharSequence f54550b;

    static {
        Covode.recordClassIndex(26966);
    }

    @Override // com.bytedance.tux.dialog.internal.AbstractC23067c
    /* renamed from: a */
    public final View mo37400a() {
        boolean z;
        MethodCollector.m26663i(8710);
        View inflate = LayoutInflater.from(this.f54597f).inflate(R.layout.i, (ViewGroup) null);
        inflate.setLayoutParams(new ViewGroup.MarginLayoutParams(-1, -2));
        TuxTextView tuxTextView = (TuxTextView) inflate.findViewById(R.id.title_tv);
        TuxTextView tuxTextView2 = (TuxTextView) inflate.findViewById(R.id.adq);
        tuxTextView.setTextColor(this.f54595d.f54607i);
        CharSequence charSequence = this.f54549a;
        if (charSequence == null || charSequence.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            C89219l.m154709a((Object) tuxTextView, "");
            tuxTextView.setVisibility(8);
            CharSequence charSequence2 = this.f54550b;
            if (charSequence2 == null || charSequence2.length() == 0) {
                C89219l.m154709a((Object) tuxTextView2, "");
                tuxTextView2.setVisibility(8);
            } else {
                tuxTextView2.setTuxFont(this.f54595d.f54602d);
                tuxTextView2.setTextColor(this.f54595d.f54607i);
                C89219l.m154709a((Object) tuxTextView2, "");
                tuxTextView2.setText(this.f54550b);
                if (!(this.f54550b instanceof String)) {
                    tuxTextView2.setMovementMethod(C23136b.f54757a);
                }
            }
        } else {
            tuxTextView.setTuxFont(this.f54595d.f54600b);
            C89219l.m154709a((Object) tuxTextView, "");
            tuxTextView.setText(this.f54549a);
            if (!(this.f54549a instanceof String)) {
                tuxTextView.setMovementMethod(C23136b.f54757a);
            }
            CharSequence charSequence3 = this.f54550b;
            if (charSequence3 == null || charSequence3.length() == 0) {
                C89219l.m154709a((Object) tuxTextView2, "");
                tuxTextView2.setVisibility(8);
            } else {
                tuxTextView2.setTuxFont(this.f54595d.f54601c);
                tuxTextView2.setTextColor(this.f54595d.f54608j);
                C89219l.m154709a((Object) tuxTextView2, "");
                tuxTextView2.setText(this.f54550b);
                if (!(this.f54550b instanceof String)) {
                    tuxTextView2.setMovementMethod(C23136b.f54757a);
                }
            }
        }
        C89219l.m154709a((Object) inflate, "");
        MethodCollector.m26664o(8710);
        return inflate;
    }

    @Override // com.bytedance.tux.dialog.p1715d.AbstractC23047c
    /* renamed from: a */
    public final void mo37440a(CharSequence charSequence) {
        this.f54549a = charSequence;
    }

    @Override // com.bytedance.tux.dialog.p1715d.AbstractC23047c
    /* renamed from: b */
    public final void mo37441b(CharSequence charSequence) {
        this.f54550b = charSequence;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C23046b(Context context) {
        super(context);
        C89219l.m154719c(context, "");
    }
}
