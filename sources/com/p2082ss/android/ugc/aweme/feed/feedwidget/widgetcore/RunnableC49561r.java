package com.p2082ss.android.ugc.aweme.feed.feedwidget.widgetcore;

import android.content.Context;
import android.os.Build;
import android.widget.TextView;
import com.bytedance.common.utility.collection.C13603b;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.p2082ss.android.ugc.aweme.lego.C58254p;
import com.p2082ss.android.ugc.aweme.lego.p3396f.C58228b;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import p077b.C1731i;
import p4600h.C89391z;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.feed.feedwidget.widgetcore.r */
public final class RunnableC49561r implements Runnable {

    /* renamed from: a */
    public boolean f113991a;

    /* renamed from: b */
    public Runnable f113992b;

    static {
        Covode.recordClassIndex(58402);
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.feedwidget.widgetcore.r$a */
    static final class CallableC49562a<V> implements Callable {

        /* renamed from: a */
        final /* synthetic */ RunnableC49561r f113993a;

        static {
            Covode.recordClassIndex(58403);
        }

        CallableC49562a(RunnableC49561r rVar) {
            this.f113993a = rVar;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            this.f113993a.f113992b.run();
            return C89391z.f203057a;
        }
    }

    public final void run() {
        MethodCollector.m26663i(3231);
        if (this.f113991a) {
            this.f113992b.run();
            C58228b bVar = C58254p.f132680b;
            Context a = C17867d.m33078a();
            if (Build.VERSION.SDK_INT > 23 || bVar.f132614b) {
                MethodCollector.m26664o(3231);
            } else if (bVar.f132613a == null || bVar.f132613a.size() <= 0) {
                if (!bVar.f132615c && bVar.f132613a == null) {
                    try {
                        new TextView(a).post(new Runnable() {
                            /* class com.p2082ss.android.ugc.aweme.lego.p3396f.C58228b.RunnableC582291 */

                            static {
                                Covode.recordClassIndex(68296);
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
                                    bVar.f132613a = (ArrayList) declaredField3.get(obj2);
                                    bVar.f132615c = true;
                                    MethodCollector.m26664o(3231);
                                    return;
                                }
                            }
                            MethodCollector.m26664o(3231);
                            return;
                        } catch (Exception unused) {
                            bVar.f132614b = true;
                        }
                    } catch (Exception unused2) {
                        MethodCollector.m26664o(3231);
                        return;
                    }
                }
                MethodCollector.m26664o(3231);
            } else {
                C13603b.m24434a((Object) bVar.f132613a);
                MethodCollector.m26664o(3231);
            }
        } else {
            C1731i.m5640b(new CallableC49562a(this), C1731i.f5564c);
            MethodCollector.m26664o(3231);
        }
    }

    public RunnableC49561r(boolean z, Runnable runnable) {
        C89219l.m154721d(runnable, "");
        this.f113991a = z;
        this.f113992b = runnable;
    }
}
