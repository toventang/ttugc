package com.p2082ss.android.ugc.aweme;

import android.content.Context;
import android.os.Build;
import android.widget.TextView;
import com.bytedance.common.utility.collection.C13603b;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.lang.reflect.Field;
import java.util.ArrayList;

/* renamed from: com.ss.android.ugc.aweme.dh */
public final class C41479dh {

    /* renamed from: a */
    private ArrayList f96782a;

    /* renamed from: b */
    private boolean f96783b;

    /* renamed from: c */
    private boolean f96784c;

    static {
        Covode.recordClassIndex(49378);
    }

    /* renamed from: a */
    public final void mo70754a(Context context) {
        MethodCollector.m26663i(12611);
        if (Build.VERSION.SDK_INT > 23 || this.f96783b) {
            MethodCollector.m26664o(12611);
            return;
        }
        ArrayList arrayList = this.f96782a;
        if (arrayList == null || arrayList.size() <= 0) {
            if (!this.f96784c && this.f96782a == null) {
                new TextView(context).post(new Runnable() {
                    /* class com.p2082ss.android.ugc.aweme.C41479dh.RunnableC414801 */

                    static {
                        Covode.recordClassIndex(49379);
                    }

                    public final void run() {
                    }
                });
                try {
                    Thread currentThread = Thread.currentThread();
                    Field declaredField = Thread.class.getDeclaredField("localValues");
                    declaredField.setAccessible(true);
                    Object obj = declaredField.get(currentThread);
                    Field declaredField2 = Class.forName("java.lang.ThreadLocal$Values").getDeclaredField("table");
                    declaredField2.setAccessible(true);
                    Object[] objArr = (Object[]) declaredField2.get(obj);
                    for (Object obj2 : objArr) {
                        if (obj2 != null && obj2.getClass().getName().equals("android.view.ViewRootImpl$RunQueue")) {
                            Field declaredField3 = Class.forName("android.view.ViewRootImpl$RunQueue").getDeclaredField("mActions");
                            declaredField3.setAccessible(true);
                            declaredField3.get(obj2);
                            C13603b.m24434a(declaredField3.get(obj2));
                            declaredField3.get(obj2);
                            this.f96782a = (ArrayList) declaredField3.get(obj2);
                            this.f96784c = true;
                            obj2.getClass().getName();
                            MethodCollector.m26664o(12611);
                            return;
                        }
                    }
                    MethodCollector.m26664o(12611);
                    return;
                } catch (Exception unused) {
                    this.f96783b = true;
                }
            }
            MethodCollector.m26664o(12611);
            return;
        }
        C13603b.m24434a((Object) this.f96782a);
        MethodCollector.m26664o(12611);
    }
}
