package com.p2082ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.timelock.p3376ui.p3377a;

import android.content.ClipboardManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import androidx.fragment.app.ActivityC0945e;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13849d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.platform.godzilla.p1575b.p1583b.C21708b;
import com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a;
import com.p2082ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.widgets.CheckButton;
import com.p2082ss.android.ugc.aweme.lancet.C58027i;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i.C79459a;
import com.p2082ss.android.ugc.trill.R;
import java.lang.reflect.Field;

/* renamed from: com.ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.timelock.ui.a.c */
public abstract class AbstractC57897c extends AbstractC34586a {

    /* renamed from: a */
    protected EditText f131980a;

    /* renamed from: b */
    protected CheckButton f131981b;

    /* renamed from: c */
    protected Button f131982c;

    static {
        Covode.recordClassIndex(67914);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo95222b(String str);

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public int mo95223c() {
        return R.string.ge6;
    }

    /* renamed from: a */
    public static boolean m104677a(String str) {
        if (TextUtils.isEmpty(str) || str.length() != 4) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo95221a(View view) {
        if (getActivity() != null) {
            ((InputMethodManager) m104676a(getActivity(), "input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }

    /* renamed from: a */
    private static Object m104676a(ActivityC0945e eVar, String str) {
        Object systemService;
        if (Build.VERSION.SDK_INT > 27 || !"clipboard".equals(str)) {
            if (!C58027i.f132247b && "connectivity".equals(str)) {
                try {
                    new C21708b().mo35361a();
                    C58027i.f132247b = true;
                    return eVar.getSystemService(str);
                } catch (Throwable unused) {
                }
            }
            return eVar.getSystemService(str);
        } else if (!C58027i.f132246a) {
            return eVar.getSystemService(str);
        } else {
            synchronized (ClipboardManager.class) {
                systemService = eVar.getSystemService(str);
                if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                    try {
                        Field declaredField = ClipboardManager.class.getDeclaredField("mHandler");
                        declaredField.setAccessible(true);
                        declaredField.set(systemService, new C58027i.HandlerC58028a((Handler) declaredField.get(systemService)));
                    } catch (Exception e) {
                        C13849d.m25015a(e, "ClipboardManager Handler Reflect Fail");
                    }
                }
                C58027i.f132246a = false;
            }
            return systemService;
        }
    }

    @Override // com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment, com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        final EditText editText = (EditText) view.findViewById(R.id.asj);
        this.f131980a = editText;
        final View.OnFocusChangeListener onFocusChangeListener = editText.getOnFocusChangeListener();
        editText.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            /* class com.p2082ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.timelock.p3376ui.p3377a.AbstractC57897c.View$OnFocusChangeListenerC579014 */

            static {
                Covode.recordClassIndex(67918);
            }

            public final void onFocusChange(View view, boolean z) {
                view.post(new Runnable() {
                    /* class com.p2082ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.timelock.p3376ui.p3377a.AbstractC57897c.View$OnFocusChangeListenerC579014.RunnableC579021 */

                    static {
                        Covode.recordClassIndex(67919);
                    }

                    public final void run() {
                        if (AbstractC57897c.this.getActivity() != null && AbstractC57897c.this.af_()) {
                            ((InputMethodManager) m104681a(AbstractC57897c.this.getActivity(), "input_method")).showSoftInput(editText, 1);
                        }
                    }

                    /* renamed from: a */
                    private static Object m104681a(ActivityC0945e eVar, String str) {
                        Object obj;
                        MethodCollector.m26663i(12367);
                        if (Build.VERSION.SDK_INT > 27 || !"clipboard".equals(str)) {
                            if (!C58027i.f132247b && "connectivity".equals(str)) {
                                try {
                                    new C21708b().mo35361a();
                                    C58027i.f132247b = true;
                                    obj = eVar.getSystemService(str);
                                } catch (Throwable unused) {
                                }
                            }
                            obj = eVar.getSystemService(str);
                        } else if (C58027i.f132246a) {
                            synchronized (ClipboardManager.class) {
                                try {
                                    obj = eVar.getSystemService(str);
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
                                    MethodCollector.m26664o(12367);
                                }
                            }
                        } else {
                            obj = eVar.getSystemService(str);
                        }
                        return obj;
                    }
                });
                View.OnFocusChangeListener onFocusChangeListener = onFocusChangeListener;
                if (onFocusChangeListener != null) {
                    onFocusChangeListener.onFocusChange(view, z);
                }
            }
        });
        editText.post(new Runnable() {
            /* class com.p2082ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.timelock.p3376ui.p3377a.AbstractC57897c.RunnableC579035 */

            static {
                Covode.recordClassIndex(67920);
            }

            public final void run() {
                editText.requestFocus();
            }
        });
        this.f131981b = (CheckButton) view.findViewById(R.id.ye);
        Button button = (Button) view.findViewById(R.id.cn_);
        this.f131982c = button;
        button.setVisibility(0);
        this.f131982c.setAlpha(0.5f);
        this.f131981b.setVisibility(8);
        this.f131981b.setOnClickListener(new View.OnClickListener() {
            /* class com.p2082ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.timelock.p3376ui.p3377a.AbstractC57897c.View$OnClickListenerC578981 */

            static {
                Covode.recordClassIndex(67915);
            }

            public final void onClick(View view) {
                ClickAgent.onClick(view);
                String obj = AbstractC57897c.this.f131980a.getText().toString();
                if (!AbstractC57897c.m104677a(obj)) {
                    new C79459a(AbstractC57897c.this.getContext()).mo123050a(AbstractC57897c.this.mo95223c()).mo123053a();
                } else {
                    AbstractC57897c.this.mo95222b(obj);
                }
            }
        });
        this.f131982c.setOnClickListener(new View.OnClickListener() {
            /* class com.p2082ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.timelock.p3376ui.p3377a.AbstractC57897c.View$OnClickListenerC578992 */

            static {
                Covode.recordClassIndex(67916);
            }

            public final void onClick(View view) {
                ClickAgent.onClick(view);
                String obj = AbstractC57897c.this.f131980a.getText().toString();
                if (!AbstractC57897c.m104677a(obj)) {
                    new C79459a(AbstractC57897c.this.getContext()).mo123050a(AbstractC57897c.this.mo95223c()).mo123053a();
                } else {
                    AbstractC57897c.this.mo95222b(obj);
                }
            }
        });
        this.f131980a.addTextChangedListener(new TextWatcher() {
            /* class com.p2082ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.timelock.p3376ui.p3377a.AbstractC57897c.C579003 */

            static {
                Covode.recordClassIndex(67917);
            }

            public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public final void afterTextChanged(Editable editable) {
                if (editable.length() == 4) {
                    AbstractC57897c.this.f131981b.setAlpha(1.0f);
                    AbstractC57897c.this.f131982c.setAlpha(1.0f);
                    return;
                }
                AbstractC57897c.this.f131981b.setAlpha(0.5f);
                AbstractC57897c.this.f131982c.setAlpha(0.5f);
            }
        });
    }
}
