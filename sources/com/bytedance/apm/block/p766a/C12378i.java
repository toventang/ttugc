package com.bytedance.apm.block.p766a;

import android.os.Handler;
import android.os.Looper;
import com.bytedance.covode.number.Covode;
import com.bytedance.p1562p.p1564b.C21614c;
import com.bytedance.p802b.p841k.C13113a;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.bytedance.apm.block.a.i */
public final class C12378i {

    /* renamed from: f */
    private static StringBuilder f29853f = new StringBuilder();

    /* renamed from: a */
    public Set<Integer> f29854a = m22236a();

    /* renamed from: b */
    private Set<Integer> f29855b = m22236a();

    /* renamed from: c */
    private Set<Integer> f29856c = new HashSet();

    /* renamed from: d */
    private int f29857d = 30;

    /* renamed from: e */
    private final String f29858e = ",";

    /* renamed from: g */
    private final int f29859g = 450;

    /* renamed from: h */
    private Handler f29860h = new Handler(Looper.getMainLooper());

    /* renamed from: com.bytedance.apm.block.a.i$a */
    public static class C12380a {

        /* renamed from: a */
        public static final C12378i f29863a = new C12378i();

        static {
            Covode.recordClassIndex(14186);
        }
    }

    static {
        Covode.recordClassIndex(14184);
    }

    /* renamed from: a */
    private static Set<Integer> m22236a() {
        String string;
        HashSet hashSet = new HashSet();
        if (C13113a.f31955g == null) {
            string = "";
        } else {
            C12382k.m22238a(C13113a.f31955g);
            string = C12382k.f29865a.getString("evil_method_SPUtils_key", null);
        }
        if (string == null) {
            return hashSet;
        }
        String[] split = string.split(",");
        try {
            for (String str : split) {
                hashSet.add(Integer.valueOf(str));
            }
        } catch (Exception unused) {
        }
        return hashSet;
    }

    /* renamed from: a */
    public final void mo20140a(int i) {
        if (!C21614c.f51259f || this.f29855b.contains(Integer.valueOf(i))) {
            return;
        }
        if (this.f29856c.size() <= this.f29857d) {
            this.f29856c.add(Integer.valueOf(i));
            return;
        }
        this.f29855b.addAll(this.f29856c);
        for (Integer num : this.f29856c) {
            f29853f.append(num).append(",");
        }
        if (f29853f.length() > this.f29859g) {
            String sb = f29853f.toString();
            if (!(sb == null || C13113a.f31955g == null)) {
                C12382k.m22238a(C13113a.f31955g);
                String string = C12382k.f29865a.getString("evil_method_SPUtils_key", null);
                if (string != null) {
                    sb = string.concat(sb);
                }
                if (C13113a.f31955g != null) {
                    C12382k.m22238a(C13113a.f31955g);
                    C12382k.f29865a.edit().putString("evil_method_SPUtils_key", sb).apply();
                }
            }
            f29853f.setLength(0);
        }
        final HashSet hashSet = new HashSet(this.f29856c);
        this.f29860h.post(new Runnable() {
            /* class com.bytedance.apm.block.p766a.C12378i.RunnableC123791 */

            static {
                Covode.recordClassIndex(14185);
            }

            public final void run() {
                C12378i.this.f29854a.addAll(hashSet);
            }
        });
        this.f29856c.clear();
    }
}
