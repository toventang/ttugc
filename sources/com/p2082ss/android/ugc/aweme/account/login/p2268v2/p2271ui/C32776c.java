package com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui;

import android.text.Editable;
import android.text.TextUtils;
import android.widget.EditText;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.account.C31685i;
import com.p2082ss.android.ugc.aweme.base.utils.KeyboardUtils;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.c */
public final class C32776c {
    static {
        Covode.recordClassIndex(39555);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.c$b */
    public static final class RunnableC32778b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ EditText f78115a;

        static {
            Covode.recordClassIndex(39557);
        }

        RunnableC32778b(EditText editText) {
            this.f78115a = editText;
        }

        public final void run() {
            this.f78115a.requestFocus();
            KeyboardUtils.m70896b(this.f78115a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.c$a */
    public static final class C32777a extends C31685i {

        /* renamed from: a */
        final /* synthetic */ EditText f78113a;

        /* renamed from: b */
        final /* synthetic */ AbstractC32806p f78114b;

        static {
            Covode.recordClassIndex(39556);
        }

        @Override // com.p2082ss.android.ugc.aweme.account.C31685i
        public final void afterTextChanged(Editable editable) {
            this.f78114b.mo58501a(this.f78113a.getId(), editable);
        }

        C32777a(EditText editText, AbstractC32806p pVar) {
            this.f78113a = editText;
            this.f78114b = pVar;
        }
    }

    /* renamed from: a */
    public static final void m67375a(EditText editText) {
        C89219l.m154721d(editText, "");
        editText.postDelayed(new RunnableC32778b(editText), 500);
    }

    /* renamed from: b */
    public static final boolean m67377b(EditText editText) {
        C89219l.m154721d(editText, "");
        return TextUtils.isEmpty(editText.getText());
    }

    /* renamed from: a */
    public static final void m67376a(EditText editText, AbstractC32806p pVar) {
        C89219l.m154721d(editText, "");
        C89219l.m154721d(pVar, "");
        editText.addTextChangedListener(new C32777a(editText, pVar));
    }
}
