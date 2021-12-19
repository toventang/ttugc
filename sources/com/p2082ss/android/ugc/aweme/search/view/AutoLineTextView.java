package com.p2082ss.android.ugc.aweme.search.view;

import android.content.Context;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ViewTreeObserver;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.widget.DmtTextView;

/* renamed from: com.ss.android.ugc.aweme.search.view.AutoLineTextView */
public class AutoLineTextView extends DmtTextView {

    /* renamed from: a */
    public Context f151956a;

    static {
        Covode.recordClassIndex(79456);
    }

    /* renamed from: com.ss.android.ugc.aweme.search.view.AutoLineTextView$a */
    class ViewTreeObserver$OnGlobalLayoutListenerC67803a implements ViewTreeObserver.OnGlobalLayoutListener {
        static {
            Covode.recordClassIndex(79457);
        }

        public final void onGlobalLayout() {
            AutoLineTextView.this.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            AutoLineTextView autoLineTextView = AutoLineTextView.this;
            String charSequence = autoLineTextView.getText().toString();
            TextPaint paint = autoLineTextView.getPaint();
            float width = (float) ((autoLineTextView.getWidth() - autoLineTextView.getPaddingLeft()) - autoLineTextView.getPaddingRight());
            String[] split = charSequence.replaceAll("\r", "").split("\n");
            StringBuilder sb = new StringBuilder();
            for (String str : split) {
                if (paint.measureText(str) <= width) {
                    sb.append(str);
                } else {
                    int i = 0;
                    float f = 0.0f;
                    while (i != str.length()) {
                        char charAt = str.charAt(i);
                        f += paint.measureText(String.valueOf(charAt));
                        if (f <= width) {
                            sb.append(charAt);
                        } else {
                            sb.append("\n");
                            i--;
                            f = 0.0f;
                        }
                        i++;
                    }
                }
                sb.append("\n");
            }
            if (!charSequence.endsWith("\n")) {
                sb.deleteCharAt(sb.length() - 1);
            }
            String sb2 = sb.toString();
            if (!TextUtils.isEmpty(sb2)) {
                AutoLineTextView.this.setText(sb2);
            }
        }

        private ViewTreeObserver$OnGlobalLayoutListenerC67803a() {
        }

        /* synthetic */ ViewTreeObserver$OnGlobalLayoutListenerC67803a(AutoLineTextView autoLineTextView, byte b) {
            this();
        }
    }

    public void setAutoLineText(CharSequence charSequence) {
        getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver$OnGlobalLayoutListenerC67803a(this, (byte) 0));
        setText(charSequence);
    }

    public AutoLineTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f151956a = context;
    }
}
