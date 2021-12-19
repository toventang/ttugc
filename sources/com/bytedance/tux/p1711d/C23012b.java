package com.bytedance.tux.p1711d;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;
import com.p2082ss.android.ugc.trill.R;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.tux.d.b */
public final class C23012b {

    /* renamed from: a */
    public static final C23012b f54478a = new C23012b();

    /* renamed from: b */
    private static boolean f54479b;

    private C23012b() {
    }

    static {
        Covode.recordClassIndex(26932);
    }

    /* renamed from: a */
    public final synchronized void mo37394a(Context context, List<String> list) {
        MethodCollector.m26663i(8087);
        C89219l.m154719c(list, "");
        f54479b = false;
        if (context != null) {
            C23011a.f54475a = null;
            C23011a.f54476b.clear();
            C89219l.m154719c(context, "");
            C89219l.m154719c(list, "");
            Context applicationContext = context.getApplicationContext();
            if (C58003a.f132201c) {
                if (applicationContext == null) {
                    applicationContext = C58003a.f132199a;
                }
            }
            C23011a.f54475a = applicationContext;
            C23011a.f54476b.clear();
            for (T t : list) {
                C23011a.f54476b.put(t, C23011a.m43399b(t));
            }
            f54479b = true;
        }
        MethodCollector.m26664o(8087);
    }

    /* renamed from: a */
    public final synchronized int mo37393a(TextView textView, AttributeSet attributeSet, int i) {
        MethodCollector.m26663i(8231);
        int i2 = 0;
        if (!f54479b) {
            MethodCollector.m26664o(8231);
            return 0;
        }
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = textView.getContext().obtainStyledAttributes(attributeSet, new int[]{R.attr.ap2}, i, 0);
            C89219l.m154709a((Object) obtainStyledAttributes, "");
            i2 = obtainStyledAttributes.getInt(0, 0);
            obtainStyledAttributes.recycle();
        }
        MethodCollector.m26664o(8231);
        return i2;
    }
}
