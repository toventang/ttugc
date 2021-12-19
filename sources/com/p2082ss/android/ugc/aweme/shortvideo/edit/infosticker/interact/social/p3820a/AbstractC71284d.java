package com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.p3820a;

import android.content.Context;
import android.text.Editable;
import android.text.TextPaint;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.p3825ui.SocialTouchableEditText;
import com.p2082ss.android.ugc.aweme.tools.C78099c;
import com.p2082ss.android.ugc.tools.utils.C84912r;
import java.util.Locale;
import java.util.Objects;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.a.d */
public abstract class AbstractC71284d<T> extends FrameLayout {

    /* renamed from: a */
    public SocialTouchableEditText f159772a;

    /* renamed from: b */
    public TextView f159773b;

    /* renamed from: c */
    public LinearLayout f159774c;

    /* renamed from: d */
    private T f159775d;

    /* renamed from: e */
    private int f159776e;

    /* renamed from: f */
    private int f159777f;

    /* renamed from: g */
    private int f159778g;

    /* renamed from: h */
    private int f159779h;

    static {
        Covode.recordClassIndex(83803);
    }

    /* renamed from: a */
    public abstract SocialTouchableEditText mo112752a();

    /* renamed from: b */
    public abstract TextView mo112754b();

    /* renamed from: c */
    public abstract LinearLayout mo112755c();

    /* renamed from: d */
    public abstract void mo112756d();

    /* renamed from: g */
    public abstract void mo112759g();

    public abstract String getContent();

    public abstract int getLayoutResId();

    public final T getCurModel() {
        return this.f159775d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.a.d$a */
    public static final class RunnableC71285a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ AbstractC71284d f159780a;

        static {
            Covode.recordClassIndex(83804);
        }

        RunnableC71285a(AbstractC71284d dVar) {
            this.f159780a = dVar;
        }

        public final void run() {
            this.f159780a.getMEditTextView().requestFocus();
        }
    }

    public final LinearLayout getInputLayout() {
        LinearLayout linearLayout = this.f159774c;
        if (linearLayout == null) {
            C89219l.m154710a("inputLayout");
        }
        return linearLayout;
    }

    public final SocialTouchableEditText getMEditTextView() {
        SocialTouchableEditText socialTouchableEditText = this.f159772a;
        if (socialTouchableEditText == null) {
            C89219l.m154710a("mEditTextView");
        }
        return socialTouchableEditText;
    }

    public final TextView getMIconView() {
        TextView textView = this.f159773b;
        if (textView == null) {
            C89219l.m154710a("mIconView");
        }
        return textView;
    }

    private final int getMaxTextWidth() {
        TextView textView = this.f159773b;
        if (textView == null) {
            C89219l.m154710a("mIconView");
        }
        int paddingLeft = textView.getPaddingLeft();
        TextView textView2 = this.f159773b;
        if (textView2 == null) {
            C89219l.m154710a("mIconView");
        }
        int paddingRight = textView2.getPaddingRight();
        SocialTouchableEditText socialTouchableEditText = this.f159772a;
        if (socialTouchableEditText == null) {
            C89219l.m154710a("mEditTextView");
        }
        int paddingLeft2 = socialTouchableEditText.getPaddingLeft();
        SocialTouchableEditText socialTouchableEditText2 = this.f159772a;
        if (socialTouchableEditText2 == null) {
            C89219l.m154710a("mEditTextView");
        }
        return this.f159776e - (((paddingLeft + paddingRight) + paddingLeft2) + socialTouchableEditText2.getPaddingRight());
    }

    /* renamed from: e */
    public final void mo112757e() {
        LinearLayout linearLayout = this.f159774c;
        if (linearLayout == null) {
            C89219l.m154710a("inputLayout");
        }
        TextView textView = this.f159773b;
        if (textView == null) {
            C89219l.m154710a("mIconView");
        }
        linearLayout.removeView(textView);
        TextView textView2 = this.f159773b;
        if (textView2 == null) {
            C89219l.m154710a("mIconView");
        }
        Context context = getContext();
        C89219l.m154716b(context, "");
        int a = (int) C84912r.m145930a(context, 12.0f);
        Context context2 = getContext();
        C89219l.m154716b(context2, "");
        Context context3 = getContext();
        C89219l.m154716b(context3, "");
        Context context4 = getContext();
        C89219l.m154716b(context4, "");
        textView2.setPadding(a, (int) C84912r.m145930a(context2, 16.0f), (int) C84912r.m145930a(context3, 2.0f), (int) C84912r.m145930a(context4, 14.0f));
        SocialTouchableEditText socialTouchableEditText = this.f159772a;
        if (socialTouchableEditText == null) {
            C89219l.m154710a("mEditTextView");
        }
        Context context5 = getContext();
        C89219l.m154716b(context5, "");
        int a2 = (int) C84912r.m145930a(context5, 8.0f);
        Context context6 = getContext();
        C89219l.m154716b(context6, "");
        int a3 = (int) C84912r.m145930a(context6, 16.0f);
        Context context7 = getContext();
        C89219l.m154716b(context7, "");
        socialTouchableEditText.setPadding(0, a2, a3, (int) C84912r.m145930a(context7, 8.0f));
        if (C78099c.m136517a(getContext())) {
            LinearLayout linearLayout2 = this.f159774c;
            if (linearLayout2 == null) {
                C89219l.m154710a("inputLayout");
            }
            TextView textView3 = this.f159773b;
            if (textView3 == null) {
                C89219l.m154710a("mIconView");
            }
            linearLayout2.addView(textView3, 1);
            return;
        }
        LinearLayout linearLayout3 = this.f159774c;
        if (linearLayout3 == null) {
            C89219l.m154710a("inputLayout");
        }
        TextView textView4 = this.f159773b;
        if (textView4 == null) {
            C89219l.m154710a("mIconView");
        }
        linearLayout3.addView(textView4, 0);
    }

    /* renamed from: f */
    public final void mo112758f() {
        LinearLayout linearLayout = this.f159774c;
        if (linearLayout == null) {
            C89219l.m154710a("inputLayout");
        }
        TextView textView = this.f159773b;
        if (textView == null) {
            C89219l.m154710a("mIconView");
        }
        linearLayout.removeView(textView);
        TextView textView2 = this.f159773b;
        if (textView2 == null) {
            C89219l.m154710a("mIconView");
        }
        Context context = getContext();
        C89219l.m154716b(context, "");
        Context context2 = getContext();
        C89219l.m154716b(context2, "");
        Context context3 = getContext();
        C89219l.m154716b(context3, "");
        Context context4 = getContext();
        C89219l.m154716b(context4, "");
        textView2.setPadding((int) C84912r.m145930a(context, 2.0f), (int) C84912r.m145930a(context2, 16.0f), (int) C84912r.m145930a(context3, 12.0f), (int) C84912r.m145930a(context4, 14.0f));
        SocialTouchableEditText socialTouchableEditText = this.f159772a;
        if (socialTouchableEditText == null) {
            C89219l.m154710a("mEditTextView");
        }
        Context context5 = getContext();
        C89219l.m154716b(context5, "");
        int a = (int) C84912r.m145930a(context5, 8.0f);
        Context context6 = getContext();
        C89219l.m154716b(context6, "");
        int a2 = (int) C84912r.m145930a(context6, 0.0f);
        Context context7 = getContext();
        C89219l.m154716b(context7, "");
        socialTouchableEditText.setPadding(16, a, a2, (int) C84912r.m145930a(context7, 8.0f));
        if (C78099c.m136517a(getContext())) {
            LinearLayout linearLayout2 = this.f159774c;
            if (linearLayout2 == null) {
                C89219l.m154710a("inputLayout");
            }
            TextView textView3 = this.f159773b;
            if (textView3 == null) {
                C89219l.m154710a("mIconView");
            }
            linearLayout2.addView(textView3, 0);
            return;
        }
        LinearLayout linearLayout3 = this.f159774c;
        if (linearLayout3 == null) {
            C89219l.m154710a("inputLayout");
        }
        TextView textView4 = this.f159773b;
        if (textView4 == null) {
            C89219l.m154710a("mIconView");
        }
        linearLayout3.addView(textView4, 1);
    }

    public final void setCurModel(T t) {
        this.f159775d = t;
    }

    public final void setInputLayout(LinearLayout linearLayout) {
        C89219l.m154721d(linearLayout, "");
        this.f159774c = linearLayout;
    }

    public final void setMEditTextView(SocialTouchableEditText socialTouchableEditText) {
        C89219l.m154721d(socialTouchableEditText, "");
        this.f159772a = socialTouchableEditText;
    }

    public final void setMIconView(TextView textView) {
        C89219l.m154721d(textView, "");
        this.f159773b = textView;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public AbstractC71284d(Context context) {
        this(context, (byte) 0);
        C89219l.m154721d(context, "");
    }

    private final void setTextSize(int i) {
        if (this.f159777f != i) {
            this.f159777f = i;
            SocialTouchableEditText socialTouchableEditText = this.f159772a;
            if (socialTouchableEditText == null) {
                C89219l.m154710a("mEditTextView");
            }
            float f = (float) i;
            socialTouchableEditText.setTextSize(f);
            TextView textView = this.f159773b;
            if (textView == null) {
                C89219l.m154710a("mIconView");
            }
            textView.setTextSize(f * 0.73333335f);
        }
    }

    /* renamed from: a */
    public final void mo112753a(boolean z) {
        String str;
        TextView textView = this.f159773b;
        if (textView == null) {
            C89219l.m154710a("mIconView");
        }
        CharSequence text = textView.getText();
        String str2 = null;
        if (text != null) {
            str = text.toString();
        } else {
            str = null;
        }
        SocialTouchableEditText socialTouchableEditText = this.f159772a;
        if (socialTouchableEditText == null) {
            C89219l.m154710a("mEditTextView");
        }
        Editable text2 = socialTouchableEditText.getText();
        if (text2 != null) {
            str2 = text2.toString();
        }
        if (str == null || str.length() == 0 || str2 == null || str2.length() == 0) {
            mo112759g();
            return;
        }
        SocialTouchableEditText socialTouchableEditText2 = this.f159772a;
        if (socialTouchableEditText2 == null) {
            C89219l.m154710a("mEditTextView");
        }
        socialTouchableEditText2.setHint("");
        SocialTouchableEditText socialTouchableEditText3 = this.f159772a;
        if (socialTouchableEditText3 == null) {
            C89219l.m154710a("mEditTextView");
        }
        TextPaint textPaint = new TextPaint(socialTouchableEditText3.getPaint());
        TextView textView2 = this.f159773b;
        if (textView2 == null) {
            C89219l.m154710a("mIconView");
        }
        TextPaint textPaint2 = new TextPaint(textView2.getPaint());
        int maxTextWidth = getMaxTextWidth();
        int i = this.f159778g;
        int i2 = this.f159779h;
        if (i >= i2) {
            while (true) {
                float a = C13628n.m24503a(getContext(), (float) i);
                textPaint2.setTextSize(a);
                float measureText = textPaint2.measureText(str);
                textPaint.setTextSize(a);
                Locale locale = Locale.getDefault();
                C89219l.m154716b(locale, "");
                Objects.requireNonNull(str2, "null cannot be cast to non-null type java.lang.String");
                String upperCase = str2.toUpperCase(locale);
                C89219l.m154716b(upperCase, "");
                if (measureText + textPaint.measureText(upperCase) >= ((float) maxTextWidth)) {
                    if (i == i2) {
                        break;
                    }
                    i--;
                } else {
                    break;
                }
            }
        }
        i = this.f159779h;
        setTextSize(i);
        if (z) {
            SocialTouchableEditText socialTouchableEditText4 = this.f159772a;
            if (socialTouchableEditText4 == null) {
                C89219l.m154710a("mEditTextView");
            }
            socialTouchableEditText4.post(new RunnableC71285a(this));
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    private AbstractC71284d(Context context, byte b) {
        this(context, (char) 0);
        C89219l.m154721d(context, "");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private AbstractC71284d(Context context, char c) {
        super(context, null, 0);
        C89219l.m154721d(context, "");
        this.f159778g = 30;
        this.f159779h = 10;
        LayoutInflater.from(getContext()).inflate(getLayoutResId(), this);
        this.f159776e = C13628n.m24504a(getContext()) - (((int) C13628n.m24520b(getContext(), 8.0f)) * 2);
        this.f159772a = mo112752a();
        this.f159773b = mo112754b();
        this.f159774c = mo112755c();
        setTextSize(this.f159778g);
    }
}
