package com.bytedance.nita.p1557e;

import android.content.Context;
import android.os.Build;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.lang.reflect.Field;
import java.util.ArrayList;

/* renamed from: com.bytedance.nita.e.d */
public final class C21560d {

    /* renamed from: a */
    private ArrayList f51163a;

    /* renamed from: b */
    private boolean f51164b;

    /* renamed from: c */
    private boolean f51165c;

    static {
        Covode.recordClassIndex(25201);
    }

    /* renamed from: a */
    public final void mo35232a(Context context) {
        MethodCollector.m26663i(2004);
        if (Build.VERSION.SDK_INT > 23 || this.f51164b) {
            MethodCollector.m26664o(2004);
            return;
        }
        ArrayList arrayList = this.f51163a;
        if (arrayList == null || arrayList.size() <= 0) {
            if (!this.f51165c && this.f51163a == null) {
                new TextView(context).post(new Runnable() {
                    /* class com.bytedance.nita.p1557e.C21560d.RunnableC215611 */

                    static {
                        Covode.recordClassIndex(25202);
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
                            declaredField3.get(obj2);
                            ArrayList arrayList2 = (ArrayList) declaredField3.get(obj2);
                            this.f51163a = arrayList2;
                            arrayList2.clear();
                            this.f51165c = true;
                            Thread.currentThread().getName();
                            System.identityHashCode(this.f51163a);
                            MethodCollector.m26664o(2004);
                            return;
                        }
                    }
                    MethodCollector.m26664o(2004);
                    return;
                } catch (Exception unused) {
                    this.f51164b = true;
                }
            }
            MethodCollector.m26664o(2004);
            return;
        }
        this.f51163a.clear();
        MethodCollector.m26664o(2004);
    }
}
