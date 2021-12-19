package com.p2082ss.android.ugc.aweme.commercialize.e_commerce.pdp.p2546ui;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.view.Window;
import androidx.appcompat.app.DialogC0240h;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.commercialize.e_commerce.pdp.ui.c */
public final class DialogC37711c extends DialogC0240h {

    /* renamed from: a */
    public final AbstractC37709a f89084a;

    /* renamed from: b */
    private float f89085b;

    /* renamed from: c */
    private float f89086c;

    /* renamed from: d */
    private float f89087d;

    /* renamed from: e */
    private float f89088e;

    static {
        Covode.recordClassIndex(45151);
    }

    @Override // androidx.appcompat.app.DialogC0240h, android.app.Dialog
    public final void setContentView(int i) {
        cn_();
        super.setContentView(i);
        Window window = getWindow();
        if (window != null) {
            window.setBackgroundDrawable(new ColorDrawable(0));
        }
    }

    @Override // androidx.appcompat.app.DialogC0240h, android.app.Dialog
    public final void setContentView(View view) {
        C89219l.m154721d(view, "");
        cn_();
        super.setContentView(view);
        Window window = getWindow();
        if (window != null) {
            window.setBackgroundDrawable(new ColorDrawable(0));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x004b, code lost:
        if (r5.f89085b > r1) goto L_0x0015;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0012, code lost:
        if (r1 != 3) goto L_0x0014;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean dispatchTouchEvent(android.view.MotionEvent r6) {
        /*
        // Method dump skipped, instructions count: 104
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.commercialize.e_commerce.pdp.p2546ui.DialogC37711c.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    private DialogC37711c(Context context, AbstractC37709a aVar) {
        super(context, R.style.a1b);
        this.f89084a = aVar;
    }

    public /* synthetic */ DialogC37711c(Context context, AbstractC37709a aVar, byte b) {
        this(context, aVar);
    }
}
