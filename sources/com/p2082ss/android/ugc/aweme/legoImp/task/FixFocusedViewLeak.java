package com.p2082ss.android.ugc.aweme.legoImp.task;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58264w;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58265x;
import com.p2082ss.android.ugc.aweme.lego.EnumC58148ab;
import com.p2082ss.android.ugc.aweme.lego.EnumC58150ad;
import com.p2082ss.android.ugc.aweme.lego.EnumC58151ae;
import com.p2082ss.android.ugc.aweme.utils.p4203d.C80326a;
import com.p2082ss.android.ugc.aweme.utils.p4203d.C80328b;
import com.p2082ss.android.ugc.aweme.utils.p4203d.C80329c;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.legoImp.task.FixFocusedViewLeak */
public class FixFocusedViewLeak implements AbstractC58264w {
    static {
        Covode.recordClassIndex(68455);
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    public final int bQ_() {
        return 1;
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: f */
    public final EnumC58150ad mo28606f() {
        return AbstractC58265x.m105221a(this);
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: g */
    public final String mo28607g() {
        return "task_";
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: i */
    public final boolean mo28609i() {
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: j */
    public final List mo28610j() {
        return null;
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58264w
    /* renamed from: b */
    public final EnumC58151ae mo28601b() {
        return EnumC58151ae.MAIN;
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: k */
    public final EnumC58148ab mo28611k() {
        return EnumC58148ab.DEFAULT;
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: h */
    public final String mo28608h() {
        return getClass().getSimpleName();
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: a */
    public final void mo28600a(Context context) {
        Application application = (Application) context;
        int i = Build.VERSION.SDK_INT;
        if (Build.VERSION.SDK_INT <= 25) {
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(Arrays.asList(C80326a.f179847a));
            if (C80329c.m139263a() && Build.VERSION.SDK_INT >= 23) {
                arrayList.add("mLastSrvView");
            }
            application.registerActivityLifecycleCallbacks(new C80328b(arrayList) {
                /* class com.p2082ss.android.ugc.aweme.utils.p4203d.C80326a.C803271 */

                /* renamed from: a */
                final /* synthetic */ List f179848a;

                static {
                    Covode.recordClassIndex(93595);
                }

                {
                    this.f179848a = r1;
                }

                @Override // com.p2082ss.android.ugc.aweme.utils.p4203d.C80328b
                public final void onActivityDestroyed(Activity activity) {
                    super.onActivityDestroyed(activity);
                    List<String> list = this.f179848a;
                    if (activity != null && list != null) {
                        try {
                            Context applicationContext = activity.getApplicationContext();
                            if (C58003a.f132201c) {
                                if (applicationContext == null) {
                                    applicationContext = C58003a.f132199a;
                                }
                            }
                            InputMethodManager inputMethodManager = (InputMethodManager) C80326a.m139262a(applicationContext, "input_method");
                            if (inputMethodManager != null) {
                                for (String str : list) {
                                    try {
                                        Field declaredField = inputMethodManager.getClass().getDeclaredField(str);
                                        if (declaredField != null) {
                                            if (!declaredField.isAccessible()) {
                                                declaredField.setAccessible(true);
                                            }
                                            Object obj = declaredField.get(inputMethodManager);
                                            if (obj != null) {
                                                if (obj instanceof View) {
                                                    if (((View) obj).getContext() == activity) {
                                                        declaredField.set(inputMethodManager, null);
                                                    }
                                                }
                                            }
                                        }
                                    } catch (Throwable unused) {
                                    }
                                }
                            }
                        } catch (Throwable unused2) {
                        }
                    }
                }
            });
        }
    }
}
