package com.bytedance.nita.api;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.nita.p1558f.AbstractC21563b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.nita.api.c */
public interface AbstractC21525c {
    static {
        Covode.recordClassIndex(25166);
    }

    /* renamed from: a */
    String mo35178a();

    /* renamed from: a */
    void mo35188a(View view, Activity activity);

    /* renamed from: b */
    ViewGroup mo35192b(Context context);

    /* renamed from: b */
    AbstractC21563b mo35179b();

    /* renamed from: c */
    EnumC21528e mo35180c();

    /* renamed from: d */
    int[] mo35193d();

    /* renamed from: e */
    int mo35189e();

    /* renamed from: f */
    EnumC21530g mo35194f();

    /* renamed from: g */
    EnumC21529f mo35195g();

    /* renamed from: com.bytedance.nita.api.c$a */
    public static final class C21526a {
        static {
            Covode.recordClassIndex(25167);
        }

        /* renamed from: a */
        public static ViewGroup m40463a(Context context) {
            MethodCollector.m26663i(3298);
            C89219l.m154719c(context, "");
            FrameLayout frameLayout = new FrameLayout(context);
            MethodCollector.m26664o(3298);
            return frameLayout;
        }
    }
}
