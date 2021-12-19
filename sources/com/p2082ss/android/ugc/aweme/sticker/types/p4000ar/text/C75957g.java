package com.p2082ss.android.ugc.aweme.sticker.types.p4000ar.text;

import android.content.Context;
import android.text.Editable;
import android.text.InputFilter;
import android.text.Spanned;
import android.text.TextWatcher;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.RelativeLayout;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.tools.view.widget.C85052j;
import com.p2082ss.android.ugc.trill.R;
import java.util.Objects;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.sticker.types.ar.text.g */
public final class C75957g extends C75967n {

    /* renamed from: k */
    private RelativeLayout.LayoutParams f170610k;

    /* renamed from: l */
    private View f170611l;

    static {
        Covode.recordClassIndex(88899);
    }

    public C75957g(Context context, char c) {
        this(context, (byte) 0);
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.sticker.types.p4000ar.text.C75967n
    public final int getLayout() {
        return R.layout.ag_;
    }

    public final RelativeLayout.LayoutParams getParams() {
        return this.f170610k;
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.types.p4000ar.text.C75967n
    public final TextWatcher getTextWatcher() {
        return new C75958a(this);
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.types.p4000ar.text.C75967n
    /* renamed from: a */
    public final void mo119627a() {
        super.mo119627a();
        this.f170633f.mo119625b(this.f170636i);
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.types.ar.text.g$a */
    public static final class C75958a implements TextWatcher {

        /* renamed from: a */
        final /* synthetic */ C75957g f170612a;

        static {
            Covode.recordClassIndex(88900);
        }

        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            C89219l.m154721d(charSequence, "");
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C75958a(C75957g gVar) {
            this.f170612a = gVar;
        }

        public final void afterTextChanged(Editable editable) {
            if (editable == null) {
                return;
            }
            if ((this.f170612a.f170636i.length() <= this.f170612a.f170635h || this.f170612a.f170635h <= 0) && this.f170612a.f170633f != null) {
                this.f170612a.f170633f.mo119624a(editable.toString());
            }
        }

        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            C89219l.m154721d(charSequence, "");
            this.f170612a.f170636i = charSequence.toString();
            if (this.f170612a.f170636i == null) {
                this.f170612a.f170636i = "";
            }
        }
    }

    public final void setParams(RelativeLayout.LayoutParams layoutParams) {
        C89219l.m154721d(layoutParams, "");
        this.f170610k = layoutParams;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private C75957g(Context context) {
        super(context, null);
        C89219l.m154721d(context, "");
        EditText editText = this.f170628a;
        C89219l.m154716b(editText, "");
        ViewGroup.LayoutParams layoutParams = editText.getLayoutParams();
        Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
        this.f170610k = (RelativeLayout.LayoutParams) layoutParams;
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.sticker.types.p4000ar.text.C75967n
    /* renamed from: a */
    public final void mo119628a(Context context) {
        super.mo119628a(context);
        this.f170611l = this.f170630c.findViewById(R.id.ad0);
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.types.p4000ar.text.C75967n
    public final void setMaxTextCount(int i) {
        super.setMaxTextCount(i);
        EditText editText = this.f170628a;
        C89219l.m154716b(editText, "");
        editText.setFilters(new C75959b[]{new C75959b(this, this.f170635h)});
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.types.p4000ar.text.C75967n
    /* renamed from: a */
    public final void mo119612a(int i) {
        ViewGroup.LayoutParams layoutParams;
        View view = this.f170611l;
        if (view != null) {
            layoutParams = view.getLayoutParams();
        } else {
            layoutParams = null;
        }
        Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
        RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
        layoutParams2.bottomMargin = i;
        View view2 = this.f170611l;
        if (view2 != null) {
            view2.setLayoutParams(layoutParams2);
        }
        AbstractC89171a aVar = this.f170637j;
        if (aVar != null) {
            View view3 = this.f170631d;
            C89219l.m154716b(view3, "");
            ViewGroup.LayoutParams layoutParams3 = view3.getLayoutParams();
            Objects.requireNonNull(layoutParams3, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
            RelativeLayout.LayoutParams layoutParams4 = (RelativeLayout.LayoutParams) layoutParams3;
            Object invoke = aVar.invoke();
            C89219l.m154716b(invoke, "");
            layoutParams4.topMargin = ((Number) invoke).intValue();
            View view4 = this.f170631d;
            C89219l.m154716b(view4, "");
            view4.setLayoutParams(layoutParams4);
        }
    }

    private /* synthetic */ C75957g(Context context, byte b) {
        this(context);
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.types.ar.text.g$b */
    public static final class C75959b extends InputFilter.LengthFilter {

        /* renamed from: a */
        final /* synthetic */ C75957g f170613a;

        static {
            Covode.recordClassIndex(88901);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C75959b(C75957g gVar, int i) {
            super(i);
            this.f170613a = gVar;
        }

        public final CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
            C89219l.m154721d(charSequence, "");
            C89219l.m154721d(spanned, "");
            CharSequence filter = super.filter(charSequence, i, i2, spanned, i3, i4);
            if (this.f170613a.f170635h - (spanned.length() - (i4 - i3)) < i2 - i) {
                EditText editText = this.f170613a.f170628a;
                C89219l.m154716b(editText, "");
                C85052j.C85053a.m146248b(editText.getContext(), this.f170613a.f170634g, 0).mo129996a();
            }
            return filter;
        }
    }
}
