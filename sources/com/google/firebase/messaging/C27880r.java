package com.google.firebase.messaging;

import android.content.SharedPreferences;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* access modifiers changed from: package-private */
/* renamed from: com.google.firebase.messaging.r */
public final class C27880r {

    /* renamed from: a */
    final SharedPreferences f65463a;

    /* renamed from: b */
    final String f65464b;

    /* renamed from: c */
    final String f65465c;

    /* renamed from: d */
    final ArrayDeque<String> f65466d = new ArrayDeque<>();

    /* renamed from: e */
    private final Executor f65467e;

    /* renamed from: f */
    private boolean f65468f = false;

    static {
        Covode.recordClassIndex(33473);
    }

    /* renamed from: a */
    public final String mo46583a() {
        String peek;
        MethodCollector.m26663i(13072);
        synchronized (this.f65466d) {
            try {
                peek = this.f65466d.peek();
            } finally {
                MethodCollector.m26664o(13072);
            }
        }
        return peek;
    }

    /* renamed from: a */
    public final boolean mo46584a(Object obj) {
        boolean remove;
        MethodCollector.m26663i(13071);
        synchronized (this.f65466d) {
            try {
                remove = this.f65466d.remove(obj);
                if (remove && !this.f65468f) {
                    this.f65467e.execute(new RunnableC27881s(this));
                }
            } finally {
                MethodCollector.m26664o(13071);
            }
        }
        return remove;
    }

    private C27880r(SharedPreferences sharedPreferences, String str, String str2, Executor executor) {
        this.f65463a = sharedPreferences;
        this.f65464b = str;
        this.f65465c = str2;
        this.f65467e = executor;
    }

    /* renamed from: a */
    static C27880r m55814a(SharedPreferences sharedPreferences, String str, String str2, Executor executor) {
        MethodCollector.m26663i(13070);
        C27880r rVar = new C27880r(sharedPreferences, str, str2, executor);
        synchronized (rVar.f65466d) {
            try {
                rVar.f65466d.clear();
                String string = rVar.f65463a.getString(rVar.f65464b, "");
                if (!TextUtils.isEmpty(string) && string.contains(rVar.f65465c)) {
                    String[] split = string.split(rVar.f65465c, -1);
                    for (String str3 : split) {
                        if (!TextUtils.isEmpty(str3)) {
                            rVar.f65466d.add(str3);
                        }
                    }
                }
            } finally {
                MethodCollector.m26664o(13070);
            }
        }
        return rVar;
    }
}
