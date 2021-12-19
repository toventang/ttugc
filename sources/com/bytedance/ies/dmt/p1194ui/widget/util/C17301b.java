package com.bytedance.ies.dmt.p1194ui.widget.util;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;
import com.p2082ss.android.ugc.trill.R;
import java.util.Map;

/* renamed from: com.bytedance.ies.dmt.ui.widget.util.b */
public class C17301b {

    /* renamed from: a */
    private static volatile C17301b f41557a;

    /* renamed from: b */
    private boolean f41558b;

    static {
        Covode.recordClassIndex(19785);
    }

    private C17301b() {
    }

    /* renamed from: a */
    public static C17301b m32033a() {
        MethodCollector.m26663i(6462);
        if (f41557a == null) {
            synchronized (C17301b.class) {
                try {
                    if (f41557a == null) {
                        f41557a = new C17301b();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(6462);
                    throw th;
                }
            }
        }
        C17301b bVar = f41557a;
        MethodCollector.m26664o(6462);
        return bVar;
    }

    /* renamed from: a */
    public final synchronized Typeface mo27611a(String str) {
        MethodCollector.m26663i(6894);
        if (!this.f41558b) {
            MethodCollector.m26664o(6894);
            return null;
        }
        Typeface a = C17300a.m32029a().mo27610a(str);
        MethodCollector.m26664o(6894);
        return a;
    }

    /* renamed from: a */
    public final synchronized void mo27614a(TextView textView, String str) {
        MethodCollector.m26663i(6750);
        if (textView == null || !this.f41558b) {
            MethodCollector.m26664o(6750);
            return;
        }
        Typeface a = mo27611a(str);
        if (a != null) {
            textView.setTypeface(a);
        }
        MethodCollector.m26664o(6750);
    }

    /* renamed from: a */
    public final synchronized void mo27612a(Context context, Map<String, String> map) {
        MethodCollector.m26663i(6602);
        this.f41558b = false;
        if (!(context == null || map == null || map.size() <= 0)) {
            if (C17300a.f41551a != null) {
                C17300a.f41551a.f41556e = null;
                if (C17300a.f41551a.f41555d != null) {
                    C17300a.f41551a.f41555d.clear();
                    C17300a.f41551a.f41555d = null;
                }
                if (C17300a.f41551a.f41554c != null) {
                    C17300a.f41551a.f41554c.clear();
                    C17300a.f41551a.f41554c = null;
                }
                C17300a.f41551a = null;
            }
            C17300a a = C17300a.m32029a();
            Context applicationContext = context.getApplicationContext();
            if (C58003a.f132201c) {
                if (applicationContext == null) {
                    applicationContext = C58003a.f132199a;
                }
            }
            a.f41556e = applicationContext;
            a.f41555d = map;
            if (a.f41555d != null && a.f41555d.size() >= 0) {
                for (String str : a.f41555d.keySet()) {
                    if (TextUtils.isEmpty(str)) {
                        break;
                    }
                    a.mo27609a(C17300a.f41552b.get(str).intValue());
                }
            }
            this.f41558b = true;
        }
        MethodCollector.m26664o(6602);
    }

    /* renamed from: a */
    public final synchronized void mo27613a(TextView textView, AttributeSet attributeSet) {
        MethodCollector.m26663i(6604);
        int i = 1;
        if (attributeSet != null) {
            if (this.f41558b) {
                TypedArray obtainStyledAttributes = textView.getContext().obtainStyledAttributes(attributeSet, new int[]{R.attr.uo, R.attr.ur, R.attr.us});
                boolean z = obtainStyledAttributes.getBoolean(2, false);
                obtainStyledAttributes.recycle();
                if (z) {
                    textView.setIncludeFontPadding(true);
                }
            } else {
                TypedArray obtainStyledAttributes2 = textView.getContext().obtainStyledAttributes(attributeSet, new int[]{R.attr.uo, R.attr.ur, R.attr.us});
                boolean z2 = obtainStyledAttributes2.getBoolean(1, false);
                obtainStyledAttributes2.recycle();
                if (!z2) {
                    textView.setIncludeFontPadding(true);
                }
            }
        }
        if (!this.f41558b) {
            MethodCollector.m26664o(6604);
            return;
        }
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes3 = textView.getContext().obtainStyledAttributes(attributeSet, new int[]{R.attr.uo, R.attr.ur, R.attr.us});
            i = obtainStyledAttributes3.getInt(0, 1);
            obtainStyledAttributes3.recycle();
        }
        Typeface a = C17300a.m32029a().mo27609a(i);
        if (a != null) {
            textView.setTypeface(a);
        }
        MethodCollector.m26664o(6604);
    }
}
