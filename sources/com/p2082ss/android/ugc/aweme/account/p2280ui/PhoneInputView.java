package com.p2082ss.android.ugc.aweme.account.p2280ui;

import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.telephony.TelephonyManager;
import android.util.AttributeSet;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13849d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.dmt.p1194ui.p1200f.C17235c;
import com.bytedance.platform.godzilla.p1575b.p1583b.C21708b;
import com.bytedance.tux.input.TuxTextView;
import com.p2082ss.android.ugc.aweme.account.login.model.C31966a;
import com.p2082ss.android.ugc.aweme.account.login.p2263h.C31940a;
import com.p2082ss.android.ugc.aweme.account.login.p2267ui.MusCountryListActivity;
import com.p2082ss.android.ugc.aweme.account.p2247f.C31667a;
import com.p2082ss.android.ugc.aweme.lancet.C58027i;
import com.p2082ss.android.ugc.tiktok.security.p4333a.C84349a;
import com.p2082ss.android.ugc.trill.R;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Locale;
import java.util.Objects;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89350l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.account.ui.PhoneInputView */
public final class PhoneInputView extends LinearLayout implements C31667a.AbstractC31668a {

    /* renamed from: a */
    public static final C32985a f78494a = new C32985a((byte) 0);

    /* renamed from: b */
    private static final C89350l f78495b = new C89350l("\\D+");

    /* renamed from: c */
    private static final C31966a f78496c = C31966a.f76328f;

    /* renamed from: d */
    private HashMap f78497d;

    public PhoneInputView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    /* renamed from: a */
    private View m67618a(int i) {
        if (this.f78497d == null) {
            this.f78497d = new HashMap();
        }
        View view = (View) this.f78497d.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f78497d.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* renamed from: com.ss.android.ugc.aweme.account.ui.PhoneInputView$a */
    public static final class C32985a {
        static {
            Covode.recordClassIndex(39787);
        }

        private C32985a() {
        }

        public /* synthetic */ C32985a(byte b) {
            this();
        }
    }

    public final int getCountryCode() {
        try {
            return Integer.parseInt(getCountryCodeString());
        } catch (NumberFormatException unused) {
            return 0;
        }
    }

    public final EditText getEditText() {
        return ((InputWithIndicator) m67618a(R.id.aff)).getEditText();
    }

    public final String getFullPhoneNumber() {
        String a = C31940a.m66306a(getPhoneNumberObject());
        C89219l.m154716b(a, "");
        return a;
    }

    public final InputWithIndicator getInputView() {
        InputWithIndicator inputWithIndicator = (InputWithIndicator) m67618a(R.id.aff);
        C89219l.m154716b(inputWithIndicator, "");
        return inputWithIndicator;
    }

    public final long getPhoneNumber() {
        try {
            return Long.parseLong(getPhoneNumberString());
        } catch (NumberFormatException unused) {
            return 0;
        }
    }

    public final String getPhoneNumberString() {
        return ((InputWithIndicator) m67618a(R.id.aff)).getText();
    }

    static {
        Covode.recordClassIndex(39785);
    }

    public final String getCountryCodeString() {
        String replace;
        TuxTextView tuxTextView = (TuxTextView) m67618a(R.id.afd);
        C89219l.m154716b(tuxTextView, "");
        CharSequence text = tuxTextView.getText();
        if (text == null || (replace = f78495b.replace(text, "")) == null) {
            return "";
        }
        return replace;
    }

    public final C31940a.C31941a getPhoneNumberObject() {
        C31940a.C31941a create = C31940a.C31941a.create(getCountryCode(), getPhoneNumber());
        C89219l.m154716b(create, "");
        return create;
    }

    public final String getCountryName() {
        String obj;
        TuxTextView tuxTextView = (TuxTextView) m67618a(R.id.afc);
        C89219l.m154716b(tuxTextView, "");
        CharSequence text = tuxTextView.getText();
        if (text == null || (obj = text.toString()) == null) {
            return "";
        }
        Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.CharSequence");
        String obj2 = C89361p.m154910b((CharSequence) obj).toString();
        if (obj2 == null) {
            return "";
        }
        return obj2;
    }

    /* renamed from: a */
    public final void mo58790a() {
        Object a = m67619a(getContext(), "phone");
        Objects.requireNonNull(a, "null cannot be cast to non-null type android.telephony.TelephonyManager");
        String simCountryIso = ((TelephonyManager) a).getSimCountryIso();
        boolean z = false;
        if (simCountryIso == null || simCountryIso.length() == 0) {
            Locale locale = Locale.getDefault();
            C89219l.m154716b(locale, "");
            simCountryIso = locale.getCountry();
        }
        if (simCountryIso == null || simCountryIso.length() == 0) {
            setCountry(f78496c);
            return;
        }
        for (T t : C31966a.f76330h) {
            if (C89361p.m154872a(t.f76334c, simCountryIso, true)) {
                setCountry(t);
                z = true;
            }
        }
        if (!z) {
            setCountry(f78496c);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.account.p2247f.C31667a.AbstractC31668a
    /* renamed from: a */
    public final void mo57660a(C31966a aVar) {
        setCountry(aVar);
    }

    public final void setCountry(C31966a aVar) {
        String str;
        String str2;
        String str3 = "";
        if (aVar == null || (str = aVar.f76335d) == null) {
            str = str3;
        }
        setCountryCode(str);
        if (!(aVar == null || (str2 = aVar.f76334c) == null)) {
            str3 = str2;
        }
        setCountryName(str3);
    }

    public final void setCountryName(String str) {
        C89219l.m154721d(str, "");
        TuxTextView tuxTextView = (TuxTextView) m67618a(R.id.afc);
        C89219l.m154716b(tuxTextView, "");
        tuxTextView.setText(str);
    }

    public final void setPhoneNumber(String str) {
        C89219l.m154721d(str, "");
        ((InputWithIndicator) m67618a(R.id.aff)).setText(str);
    }

    public final void setCountryCode(String str) {
        boolean z;
        C89219l.m154721d(str, "");
        if (str.length() > 0) {
            z = true;
        } else {
            z = false;
        }
        String str2 = "+";
        if (!z || C89361p.m154874b(str, str2, false)) {
            str2 = "";
        }
        TuxTextView tuxTextView = (TuxTextView) m67618a(R.id.afd);
        C89219l.m154716b(tuxTextView, "");
        tuxTextView.setText(str2 + str);
    }

    /* renamed from: a */
    private static Object m67619a(Context context, String str) {
        Object obj;
        MethodCollector.m26663i(12998);
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
                    MethodCollector.m26664o(12998);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }

    private /* synthetic */ PhoneInputView(Context context, AttributeSet attributeSet, byte b) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private PhoneInputView(final Context context, AttributeSet attributeSet, char c) {
        super(context, attributeSet, 0);
        C89219l.m154721d(context, "");
        MethodCollector.m26663i(13091);
        View.inflate(context, R.layout.hx, this);
        C17235c.m31810a(m67618a(R.id.d1n), 0.5f);
        synchronized (C31667a.class) {
            try {
                C31667a.f75741a.add(new WeakReference<>(this));
            } catch (Throwable th) {
                MethodCollector.m26664o(13091);
                throw th;
            }
        }
        ((LinearLayout) m67618a(R.id.d1n)).setOnClickListener(new View.OnClickListener() {
            /* class com.p2082ss.android.ugc.aweme.account.p2280ui.PhoneInputView.View$OnClickListenerC329841 */

            static {
                Covode.recordClassIndex(39786);
            }

            public final void onClick(View view) {
                ClickAgent.onClick(view);
                Context context = context;
                Intent intent = new Intent(context, MusCountryListActivity.class);
                C84349a.m145093a(intent, context);
                context.startActivity(intent);
            }
        });
        MethodCollector.m26664o(13091);
    }
}
