package com.p2082ss.android.ugc.aweme.ecommerce.address.widget;

import android.app.Activity;
import android.app.Application;
import android.content.ClipboardManager;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.telephony.TelephonyManager;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13849d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.dmt.p1194ui.p1198d.C17191a;
import com.bytedance.ies.dmt.p1194ui.p1200f.C17235c;
import com.bytedance.ies.ugc.appcontext.C17879g;
import com.bytedance.platform.godzilla.p1575b.p1583b.C21708b;
import com.bytedance.services.apm.api.C22708a;
import com.bytedance.tux.input.TuxTextView;
import com.google.p1998c.p2001c.AbstractC27540z;
import com.p2082ss.android.ugc.aweme.AbstractC34292ax;
import com.p2082ss.android.ugc.aweme.AbstractC34892bo;
import com.p2082ss.android.ugc.aweme.AccountService;
import com.p2082ss.android.ugc.aweme.account.login.model.C31966a;
import com.p2082ss.android.ugc.aweme.lancet.C58027i;
import com.p2082ss.android.ugc.trill.R;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.Objects;
import p4600h.C89378p;
import p4600h.C89387v;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89350l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.address.widget.PhoneInputView */
public final class PhoneInputView extends LinearLayout {

    /* renamed from: a */
    public static final C31966a f101608a = C31966a.f76328f;

    /* renamed from: b */
    public static final C43582a f101609b = new C43582a((byte) 0);

    /* renamed from: e */
    private static final C89350l f101610e = new C89350l("\\D+");

    /* renamed from: c */
    private View.OnClickListener f101611c;

    /* renamed from: d */
    private AbstractC89171a<C89391z> f101612d;

    /* renamed from: f */
    private SparseArray f101613f;

    public PhoneInputView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    /* renamed from: a */
    public final View mo74065a(int i) {
        if (this.f101613f == null) {
            this.f101613f = new SparseArray();
        }
        View view = (View) this.f101613f.get(i);
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f101613f.put(i, findViewById);
        return findViewById;
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.address.widget.PhoneInputView$a */
    public static final class C43582a {
        static {
            Covode.recordClassIndex(51825);
        }

        private C43582a() {
        }

        /* renamed from: a */
        public static C31966a m86621a() {
            boolean z;
            Object a = m86622a(C17879g.m33104a(), "phone");
            Objects.requireNonNull(a, "null cannot be cast to non-null type android.telephony.TelephonyManager");
            String simCountryIso = ((TelephonyManager) a).getSimCountryIso();
            if (simCountryIso == null || simCountryIso.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                Locale locale = Locale.getDefault();
                C89219l.m154716b(locale, "");
                simCountryIso = locale.getCountry();
            }
            if (simCountryIso == null || simCountryIso.length() == 0) {
                return PhoneInputView.f101608a;
            }
            for (T t : C31966a.f76330h) {
                if (C89361p.m154872a(t.f76334c, simCountryIso, true)) {
                    C89219l.m154716b(t, "");
                    return t;
                }
            }
            return PhoneInputView.f101608a;
        }

        public /* synthetic */ C43582a(byte b) {
            this();
        }

        /* renamed from: a */
        private static Object m86622a(Application application, String str) {
            Object obj;
            MethodCollector.m26663i(6436);
            if (Build.VERSION.SDK_INT > 27 || !"clipboard".equals(str)) {
                if (!C58027i.f132247b && "connectivity".equals(str)) {
                    try {
                        new C21708b().mo35361a();
                        C58027i.f132247b = true;
                        obj = application.getSystemService(str);
                    } catch (Throwable unused) {
                    }
                }
                obj = application.getSystemService(str);
            } else if (C58027i.f132246a) {
                synchronized (ClipboardManager.class) {
                    try {
                        obj = application.getSystemService(str);
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
                        MethodCollector.m26664o(6436);
                    }
                }
            } else {
                obj = application.getSystemService(str);
            }
            return obj;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.address.widget.PhoneInputView$c */
    static final class C43584c extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        public static final C43584c f101620a = new C43584c();

        static {
            Covode.recordClassIndex(51827);
        }

        C43584c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* bridge */ /* synthetic */ C89391z invoke() {
            return C89391z.f203057a;
        }
    }

    public final AbstractC89171a<C89391z> getOnCountryCodeChangeListener() {
        return this.f101612d;
    }

    public final View.OnClickListener getOnCountryCodeClickListener() {
        return this.f101611c;
    }

    private final int getCountryCode() {
        try {
            return Integer.parseInt(getCountryCodeString());
        } catch (NumberFormatException unused) {
            return 0;
        }
    }

    private final long getPhoneNumber() {
        try {
            return Long.parseLong(getPhoneNumberString());
        } catch (NumberFormatException unused) {
            return 0;
        }
    }

    private final String getPhoneNumberString() {
        return ((InputWithIndicator) mo74065a(R.id.aff)).getText();
    }

    /* renamed from: a */
    public final void mo74066a() {
        C31966a a = C43582a.m86621a();
        mo74067a(a.f76335d, a.f76334c);
    }

    public final EditText getEditText() {
        return ((InputWithIndicator) mo74065a(R.id.aff)).getEditText();
    }

    static {
        Covode.recordClassIndex(51822);
    }

    private final String getCountryCodeString() {
        String replace;
        TuxTextView tuxTextView = (TuxTextView) mo74065a(R.id.afd);
        C89219l.m154716b(tuxTextView, "");
        CharSequence text = tuxTextView.getText();
        if (text == null || (replace = f101610e.replace(text, "")) == null) {
            return "";
        }
        return replace;
    }

    public final C89378p<String, String> getFullPhoneNumber() {
        return C89387v.m154943a(getCountryName(), m86617b(getCountryCodeString(), getPhoneNumberString()));
    }

    public final C43583b getPhoneModel() {
        return new C43583b(getCountryName(), getCountryCodeString(), getPhoneNumberString());
    }

    public final String getCountryName() {
        String obj;
        TuxTextView tuxTextView = (TuxTextView) mo74065a(R.id.afc);
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

    public final void setOnCountryCodeClickListener(View.OnClickListener onClickListener) {
        this.f101611c = onClickListener;
    }

    public final void setHint(String str) {
        getEditText().setHint(str);
    }

    public final void setOnCountryCodeChangeListener(AbstractC89171a<C89391z> aVar) {
        C89219l.m154721d(aVar, "");
        this.f101612d = aVar;
    }

    /* renamed from: a */
    private static CharSequence m86616a(String str) {
        if (C89361p.m154908a((CharSequence) str, (CharSequence) "*", false)) {
            return new C17191a.C17192a().mo27179b(str).f40973a;
        }
        return str;
    }

    private final void setCountryCode(String str) {
        TuxTextView tuxTextView = (TuxTextView) mo74065a(R.id.afd);
        C89219l.m154716b(tuxTextView, "");
        tuxTextView.setText(str);
    }

    private final void setCountryName(String str) {
        TuxTextView tuxTextView = (TuxTextView) mo74065a(R.id.afc);
        C89219l.m154716b(tuxTextView, "");
        tuxTextView.setText(str);
    }

    public final void setPhoneModel(C43583b bVar) {
        C89219l.m154721d(bVar, "");
        setFullPhoneNumber(C89387v.m154943a(bVar.f101617a, m86617b(bVar.f101618b, bVar.f101619c)));
    }

    public final void setPhoneNumber(String str) {
        C89219l.m154721d(str, "");
        ((InputWithIndicator) mo74065a(R.id.aff)).setText(m86616a(str));
    }

    public final void setFullPhoneNumber(C89378p<String, String> pVar) {
        String str;
        String str2;
        Object obj = null;
        if (pVar != null) {
            str = pVar.getSecond();
            str2 = pVar.getFirst();
        } else {
            str = null;
            str2 = null;
        }
        if (!(pVar == null || str == null)) {
            try {
                if (str.length() != 0) {
                    int a = C89361p.m154888a((CharSequence) str, ")", 0, false, 6);
                    if (str != null) {
                        String substring = str.substring(1, a);
                        C89219l.m154716b(substring, "");
                        String substring2 = str.substring(C89361p.m154888a((CharSequence) str, ")", 0, false, 6) + 1);
                        C89219l.m154716b(substring2, "");
                        AbstractC27540z<C31966a> zVar = C31966a.f76330h;
                        ArrayList arrayList = new ArrayList();
                        for (T t : zVar) {
                            if (C89219l.m154714a((Object) t.f76335d, (Object) substring)) {
                                arrayList.add(t);
                            }
                        }
                        ArrayList arrayList2 = arrayList;
                        if (str2 != null && str2.length() != 0) {
                            Iterator it = arrayList2.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    break;
                                }
                                Object next = it.next();
                                if (C89219l.m154714a((Object) ((C31966a) next).f76334c, (Object) str2)) {
                                    obj = next;
                                    break;
                                }
                            }
                            C31966a aVar = (C31966a) obj;
                            if (aVar != null) {
                                mo74067a(aVar.f76335d, aVar.f76334c);
                            }
                        } else if (arrayList2.size() == 1) {
                            mo74067a(((C31966a) arrayList2.get(0)).f76335d, ((C31966a) arrayList2.get(0)).f76334c);
                        } else {
                            mo74067a(substring, "");
                        }
                        ((InputWithIndicator) mo74065a(R.id.aff)).setText(m86616a(substring2));
                        return;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                }
            } catch (Exception unused) {
                C22708a.m42800a("phone is not correct");
                return;
            }
        }
        ((InputWithIndicator) mo74065a(R.id.aff)).setText("");
    }

    /* renamed from: b */
    private static String m86617b(String str, String str2) {
        boolean z;
        if (str2.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return "";
        }
        String str3 = "(+" + str + ")" + str2;
        C89219l.m154716b(str3, "");
        return str3;
    }

    /* renamed from: a */
    public final void mo74067a(String str, String str2) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        setCountryCode(str);
        setCountryName(str2);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PhoneInputView(Context context, AttributeSet attributeSet, int i) {
        this(context, (i & 2) != 0 ? null : attributeSet, (byte) 0);
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.address.widget.PhoneInputView$b */
    public static final class C43583b {

        /* renamed from: a */
        public final String f101617a;

        /* renamed from: b */
        public final String f101618b;

        /* renamed from: c */
        public final String f101619c;

        static {
            Covode.recordClassIndex(51826);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C43583b)) {
                return false;
            }
            C43583b bVar = (C43583b) obj;
            return C89219l.m154714a(this.f101617a, bVar.f101617a) && C89219l.m154714a(this.f101618b, bVar.f101618b) && C89219l.m154714a(this.f101619c, bVar.f101619c);
        }

        public final int hashCode() {
            String str = this.f101617a;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.f101618b;
            int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = this.f101619c;
            if (str3 != null) {
                i = str3.hashCode();
            }
            return hashCode2 + i;
        }

        public final String toString() {
            return "PhoneModel(iso=" + this.f101617a + ", countryCode=" + this.f101618b + ", number=" + this.f101619c + ")";
        }

        public C43583b(String str, String str2, String str3) {
            C89219l.m154721d(str, "");
            C89219l.m154721d(str2, "");
            C89219l.m154721d(str3, "");
            this.f101617a = str;
            this.f101618b = str2;
            this.f101619c = str3;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private PhoneInputView(final Context context, AttributeSet attributeSet, byte b) {
        super(context, attributeSet, 0);
        C89219l.m154721d(context, "");
        MethodCollector.m26663i(9695);
        View.inflate(context, R.layout.rm, this);
        C17235c.m31810a(mo74065a(R.id.d1n), 0.5f);
        mo74066a();
        ((LinearLayout) mo74065a(R.id.d1n)).setOnClickListener(new View.OnClickListener(this) {
            /* class com.p2082ss.android.ugc.aweme.ecommerce.address.widget.PhoneInputView.View$OnClickListenerC435801 */

            /* renamed from: a */
            final /* synthetic */ PhoneInputView f101614a;

            static {
                Covode.recordClassIndex(51823);
            }

            {
                this.f101614a = r1;
            }

            public final void onClick(View view) {
                ClickAgent.onClick(view);
                View.OnClickListener onCountryCodeClickListener = this.f101614a.getOnCountryCodeClickListener();
                if (onCountryCodeClickListener != null) {
                    onCountryCodeClickListener.onClick(view);
                }
                AbstractC34892bo g = AccountService.m65215a().mo57071g();
                Context context = context;
                if (!(context instanceof Activity)) {
                    context = null;
                }
                g.openCountryListActivity((Activity) context, new AbstractC34292ax(this) {
                    /* class com.p2082ss.android.ugc.aweme.ecommerce.address.widget.PhoneInputView.View$OnClickListenerC435801.C435811 */

                    /* renamed from: a */
                    final /* synthetic */ View$OnClickListenerC435801 f101616a;

                    static {
                        Covode.recordClassIndex(51824);
                    }

                    @Override // com.p2082ss.android.ugc.aweme.AbstractC34292ax
                    public final void onExit() {
                    }

                    /* JADX WARN: Incorrect args count in method signature: ()V */
                    {
                        this.f101616a = r1;
                    }

                    @Override // com.p2082ss.android.ugc.aweme.AbstractC34292ax
                    public final void onChanged(String str, String str2) {
                        C89219l.m154721d(str, "");
                        C89219l.m154721d(str2, "");
                        this.f101616a.f101614a.mo74067a(str, str2);
                        this.f101616a.f101614a.getOnCountryCodeChangeListener().invoke();
                    }
                });
            }
        });
        this.f101612d = C43584c.f101620a;
        MethodCollector.m26664o(9695);
    }
}
