package com.p2082ss.android.ugc.aweme.sticker.types.p4000ar.text;

import android.content.Context;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.tools.utils.C84912r;
import com.p2082ss.android.ugc.tools.view.widget.C85052j;
import com.p2082ss.android.ugc.trill.R;
import java.util.Objects;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.sticker.types.ar.text.a */
public final class C75949a extends C75967n {

    /* renamed from: k */
    private FrameLayout.LayoutParams f170600k;

    static {
        Covode.recordClassIndex(88891);
    }

    public C75949a(Context context, char c) {
        this(context, (byte) 0);
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.sticker.types.p4000ar.text.C75967n
    public final int getLayout() {
        return R.layout.agz;
    }

    public final FrameLayout.LayoutParams getParams() {
        return this.f170600k;
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.types.p4000ar.text.C75967n
    public final TextWatcher getTextWatcher() {
        return new C75950a(this);
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.types.ar.text.a$a */
    public static final class C75950a implements TextWatcher {

        /* renamed from: a */
        final /* synthetic */ C75949a f170601a;

        static {
            Covode.recordClassIndex(88892);
        }

        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            C89219l.m154721d(charSequence, "");
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C75950a(C75949a aVar) {
            this.f170601a = aVar;
        }

        public final void afterTextChanged(Editable editable) {
            int length;
            if (editable != null) {
                EditText editText = this.f170601a.f170628a;
                C89219l.m154716b(editText, "");
                int selectionStart = editText.getSelectionStart();
                EditText editText2 = this.f170601a.f170628a;
                C89219l.m154716b(editText2, "");
                int selectionEnd = editText2.getSelectionEnd();
                if (editable.toString().length() > this.f170601a.f170635h && this.f170601a.f170635h > 0) {
                    String obj = editable.toString();
                    int i = selectionStart - 1;
                    if (i < 0 || selectionEnd < 0 || selectionEnd < i || i > (length = obj.length()) || selectionEnd > length) {
                        editable.delete(this.f170601a.f170635h, editable.toString().length());
                    } else {
                        editable.delete(i, selectionEnd);
                    }
                    EditText editText3 = this.f170601a.f170628a;
                    C89219l.m154716b(editText3, "");
                    editText3.setText(editable);
                    this.f170601a.f170628a.setSelection(editable.toString().length());
                    EditText editText4 = this.f170601a.f170628a;
                    C89219l.m154716b(editText4, "");
                    C85052j.C85053a.m146248b(editText4.getContext(), this.f170601a.f170634g, 0).mo129996a();
                } else if (this.f170601a.f170633f != null) {
                    this.f170601a.f170633f.mo119624a(editable.toString());
                }
            }
        }

        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            C89219l.m154721d(charSequence, "");
            this.f170601a.f170636i = charSequence.toString();
            if (this.f170601a.f170636i == null) {
                this.f170601a.f170636i = "";
            }
        }
    }

    public final void setParams(FrameLayout.LayoutParams layoutParams) {
        C89219l.m154721d(layoutParams, "");
        this.f170600k = layoutParams;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private C75949a(Context context) {
        super(context, null);
        C89219l.m154721d(context, "");
        EditText editText = this.f170628a;
        C89219l.m154716b(editText, "");
        ViewGroup.LayoutParams layoutParams = editText.getLayoutParams();
        Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        this.f170600k = (FrameLayout.LayoutParams) layoutParams;
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.types.p4000ar.text.C75967n
    /* renamed from: a */
    public final void mo119612a(int i) {
        if (this.f170628a != null) {
            FrameLayout.LayoutParams layoutParams = this.f170600k;
            EditText editText = this.f170628a;
            C89219l.m154716b(editText, "");
            Context context = editText.getContext();
            C89219l.m154716b(context, "");
            layoutParams.bottomMargin = (int) (((float) i) + C84912r.m145930a(context, 16.0f));
            EditText editText2 = this.f170628a;
            C89219l.m154716b(editText2, "");
            editText2.setLayoutParams(this.f170600k);
        }
        AbstractC89171a aVar = this.f170637j;
        if (aVar != null) {
            View view = this.f170631d;
            C89219l.m154716b(view, "");
            ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
            Objects.requireNonNull(layoutParams2, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) layoutParams2;
            Object invoke = aVar.invoke();
            C89219l.m154716b(invoke, "");
            layoutParams3.topMargin = ((Number) invoke).intValue();
            View view2 = this.f170631d;
            C89219l.m154716b(view2, "");
            view2.setLayoutParams(layoutParams3);
        }
    }

    private /* synthetic */ C75949a(Context context, byte b) {
        this(context);
    }
}
