package com.p2082ss.android.ugc.aweme.compliance.protection.timelock.p2682ui.p2683a;

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
import com.p2082ss.android.ugc.aweme.lancet.C58027i;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i.C79459a;
import com.p2082ss.android.ugc.trill.R;
import java.lang.reflect.Field;

/* renamed from: com.ss.android.ugc.aweme.compliance.protection.timelock.ui.a.j */
public abstract class AbstractC40120j extends AbstractC34586a {

    /* renamed from: a */
    protected EditText f94203a;

    /* renamed from: b */
    protected Button f94204b;

    static {
        Covode.recordClassIndex(47903);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo69270a(String str);

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public int mo69271c() {
        return R.string.ge6;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo69269a(View view) {
        if (getActivity() != null) {
            ((InputMethodManager) m81160a(getActivity(), "input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }

    /* renamed from: a */
    private static Object m81160a(ActivityC0945e eVar, String str) {
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
        this.f94203a = editText;
        final View.OnFocusChangeListener onFocusChangeListener = editText.getOnFocusChangeListener();
        editText.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            /* class com.p2082ss.android.ugc.aweme.compliance.protection.timelock.p2682ui.p2683a.AbstractC40120j.View$OnFocusChangeListenerC401233 */

            static {
                Covode.recordClassIndex(47906);
            }

            public final void onFocusChange(View view, boolean z) {
                view.post(new Runnable() {
                    /* class com.p2082ss.android.ugc.aweme.compliance.protection.timelock.p2682ui.p2683a.AbstractC40120j.View$OnFocusChangeListenerC401233.RunnableC401241 */

                    static {
                        Covode.recordClassIndex(47907);
                    }

                    public final void run() {
                        if (AbstractC40120j.this.getActivity() != null && AbstractC40120j.this.af_()) {
                            ((InputMethodManager) m81164a(AbstractC40120j.this.getActivity(), "input_method")).showSoftInput(editText, 1);
                        }
                    }

                    /* renamed from: a */
                    private static Object m81164a(ActivityC0945e eVar, String str) {
                        Object obj;
                        MethodCollector.m26663i(3728);
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
                                    MethodCollector.m26664o(3728);
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
            /* class com.p2082ss.android.ugc.aweme.compliance.protection.timelock.p2682ui.p2683a.AbstractC40120j.RunnableC401254 */

            static {
                Covode.recordClassIndex(47908);
            }

            public final void run() {
                editText.requestFocus();
            }
        });
        Button button = (Button) view.findViewById(R.id.cn_);
        this.f94204b = button;
        button.setVisibility(0);
        this.f94204b.setAlpha(0.5f);
        this.f94204b.setOnClickListener(new View.OnClickListener() {
            /* class com.p2082ss.android.ugc.aweme.compliance.protection.timelock.p2682ui.p2683a.AbstractC40120j.View$OnClickListenerC401211 */

            static {
                Covode.recordClassIndex(47904);
            }

            public final void onClick(View view) {
                ClickAgent.onClick(view);
                String obj = AbstractC40120j.this.f94203a.getText().toString();
                if (TextUtils.isEmpty(obj) || obj.length() != 4) {
                    new C79459a(AbstractC40120j.this.getContext()).mo123050a(AbstractC40120j.this.mo69271c()).mo123053a();
                } else {
                    AbstractC40120j.this.mo69270a(obj);
                }
            }
        });
        this.f94203a.addTextChangedListener(new TextWatcher() {
            /* class com.p2082ss.android.ugc.aweme.compliance.protection.timelock.p2682ui.p2683a.AbstractC40120j.C401222 */

            static {
                Covode.recordClassIndex(47905);
            }

            public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public final void afterTextChanged(Editable editable) {
                if (editable.length() == 4) {
                    AbstractC40120j.this.f94204b.setAlpha(1.0f);
                } else {
                    AbstractC40120j.this.f94204b.setAlpha(0.5f);
                }
            }
        });
    }
}
