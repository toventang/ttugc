package com.p2082ss.android.ugc.aweme.account.login.view;

import android.content.Context;
import android.text.TextPaint;
import android.util.AttributeSet;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.widget.DmtTextView;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.account.login.view.AutoLinefeedTextView */
public final class AutoLinefeedTextView extends DmtTextView {
    static {
        Covode.recordClassIndex(39588);
    }

    public AutoLinefeedTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.view.AutoLinefeedTextView$a */
    static final class RunnableC32809a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ AutoLinefeedTextView f78164a;

        /* renamed from: b */
        final /* synthetic */ String f78165b;

        static {
            Covode.recordClassIndex(39589);
        }

        RunnableC32809a(AutoLinefeedTextView autoLinefeedTextView, String str) {
            this.f78164a = autoLinefeedTextView;
            this.f78165b = str;
        }

        public final void run() {
            String str = this.f78165b;
            if (str != null && str.length() != 0 && this.f78164a.getMeasuredWidth() != 0 && this.f78164a.getMeasuredHeight() != 0) {
                CharSequence text = this.f78164a.getText();
                C89219l.m154716b(text, "");
                int a = C89361p.m154888a(text, this.f78165b, 0, false, 6);
                if (a != -1) {
                    TextPaint paint = this.f78164a.getPaint();
                    CharSequence text2 = this.f78164a.getText();
                    C89219l.m154716b(text2, "");
                    int measureText = (int) paint.measureText(text2.subSequence(0, a + 2).toString());
                    TextPaint paint2 = this.f78164a.getPaint();
                    CharSequence text3 = this.f78164a.getText();
                    C89219l.m154716b(text3, "");
                    if (measureText / this.f78164a.getMeasuredWidth() != ((int) paint2.measureText(text3.subSequence(0, ((this.f78165b.length() + a) - 1) + 1).toString())) / this.f78164a.getMeasuredWidth()) {
                        this.f78164a.setText(new StringBuffer(this.f78164a.getText().toString()).insert(a, "\n").toString());
                    }
                }
            }
        }
    }

    private /* synthetic */ AutoLinefeedTextView(Context context, AttributeSet attributeSet, byte b) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private AutoLinefeedTextView(Context context, AttributeSet attributeSet, char c) {
        super(context, attributeSet, 16842884);
        C89219l.m154721d(context, "");
    }
}
