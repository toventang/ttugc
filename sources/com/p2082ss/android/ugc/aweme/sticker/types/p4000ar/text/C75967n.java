package com.p2082ss.android.ugc.aweme.sticker.types.p4000ar.text;

import android.content.ClipboardManager;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13849d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.platform.godzilla.p1575b.p1583b.C21708b;
import com.p2082ss.android.ugc.aweme.lancet.C58027i;
import com.p2082ss.android.ugc.trill.R;
import java.lang.reflect.Field;
import p4600h.p4611f.p4612a.AbstractC89171a;

/* renamed from: com.ss.android.ugc.aweme.sticker.types.ar.text.n */
public class C75967n extends FrameLayout {

    /* renamed from: a */
    protected EditText f170628a;

    /* renamed from: b */
    protected View f170629b;

    /* renamed from: c */
    protected View f170630c;

    /* renamed from: d */
    protected View f170631d;

    /* renamed from: e */
    protected InputMethodManager f170632e;

    /* renamed from: f */
    protected AbstractC75968a f170633f;

    /* renamed from: g */
    protected String f170634g;

    /* renamed from: h */
    protected int f170635h;

    /* renamed from: i */
    protected String f170636i;

    /* renamed from: j */
    protected AbstractC89171a<Integer> f170637j;

    /* renamed from: com.ss.android.ugc.aweme.sticker.types.ar.text.n$a */
    public interface AbstractC75968a {
        static {
            Covode.recordClassIndex(88910);
        }

        /* renamed from: a */
        void mo119624a(String str);

        /* renamed from: b */
        void mo119625b(String str);
    }

    static {
        Covode.recordClassIndex(88909);
    }

    /* renamed from: a */
    public void mo119612a(int i) {
    }

    /* access modifiers changed from: package-private */
    public int getLayout() {
        return R.layout.agz;
    }

    public TextWatcher getTextWatcher() {
        return null;
    }

    /* renamed from: a */
    public void mo119627a() {
        mo119644e();
    }

    /* renamed from: d */
    public final void mo119643d() {
        this.f170628a.requestFocus();
        setVisibility(0);
    }

    /* renamed from: b */
    public final void mo119644e() {
        InputMethodManager inputMethodManager;
        EditText editText = this.f170628a;
        if (editText != null && (inputMethodManager = this.f170632e) != null) {
            inputMethodManager.hideSoftInputFromWindow(editText.getWindowToken(), 0);
        }
    }

    /* renamed from: c */
    public final void mo119642c() {
        EditText editText = this.f170628a;
        if (editText != null && this.f170632e != null) {
            editText.requestFocus();
            this.f170632e.showSoftInput(this.f170628a, 0);
        }
    }

    public String getText() {
        EditText editText = this.f170628a;
        if (editText == null || editText.getEditableText() == null) {
            return null;
        }
        return this.f170628a.getEditableText().toString();
    }

    public void setEffectTextChangeListener(AbstractC75968a aVar) {
        this.f170633f = aVar;
    }

    public void setMaxTextCount(int i) {
        this.f170635h = i;
    }

    public void setTopMarginSupplier(AbstractC89171a<Integer> aVar) {
        this.f170637j = aVar;
    }

    public C75967n(Context context) {
        this(context, null);
    }

    public void setHintText(String str) {
        if (this.f170628a != null && !TextUtils.isEmpty(str)) {
            this.f170628a.setHint(str);
        }
    }

    public void setText(String str) {
        EditText editText = this.f170628a;
        if (editText != null && str != null) {
            editText.setText(str);
            int length = str.length();
            if (length < this.f170628a.getText().length()) {
                this.f170628a.setSelection(length);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo119628a(Context context) {
        MethodCollector.m26663i(6625);
        setVisibility(8);
        this.f170630c = LayoutInflater.from(context).inflate(getLayout(), this);
        this.f170628a = (EditText) findViewById(R.id.ast);
        TextWatcher textWatcher = getTextWatcher();
        if (textWatcher != null) {
            this.f170628a.addTextChangedListener(textWatcher);
        }
        View findViewById = findViewById(R.id.ec3);
        this.f170629b = findViewById;
        findViewById.setOnClickListener(new View$OnClickListenerC75969o(this));
        this.f170631d = findViewById(R.id.ejf);
        setOnClickListener(new View$OnClickListenerC75970p(this));
        MethodCollector.m26664o(6625);
    }

    public C75967n(Context context, AttributeSet attributeSet) {
        super(context, null);
        MethodCollector.m26663i(6620);
        mo119628a(context);
        this.f170632e = (InputMethodManager) m133192a(context, "input_method");
        this.f170634g = context.getResources().getString(R.string.f7b);
        MethodCollector.m26664o(6620);
    }

    /* renamed from: a */
    private static Object m133192a(Context context, String str) {
        Object obj;
        MethodCollector.m26663i(6623);
        if (Build.VERSION.SDK_INT > 27 || !"clipboard".equals(str)) {
            if (!C58027i.f132247b && "connectivity".equals(str)) {
                try {
                    new C21708b().mo35361a();
                    C58027i.f132247b = true;
                    obj = context.getSystemService(str);
                } catch (Throwable unused) {
                }
            }
            obj = context.getSystemService(str);
        } else if (C58027i.f132246a) {
            synchronized (ClipboardManager.class) {
                try {
                    obj = context.getSystemService(str);
                    if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                        try {
                            Field declaredField = ClipboardManager.class.getDeclaredField("mHandler");
                            declaredField.setAccessible(true);
                            declaredField.set(obj, new C58027i.HandlerC58028a((Handler) declaredField.get(obj)));
                        } catch (Exception e) {
                            C13849d.m25015a(e, "ClipboardManager Handler Reflect Fail");
                        }
                    }
                    C58027i.f132246a = false;
                } finally {
                    MethodCollector.m26664o(6623);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }
}
