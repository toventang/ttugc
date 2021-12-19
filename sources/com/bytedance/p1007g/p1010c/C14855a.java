package com.bytedance.p1007g.p1010c;

import android.util.Pair;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.g.c.a */
public class C14855a<T> {

    /* renamed from: a */
    public String f36283a;

    /* renamed from: b */
    public double f36284b;

    /* renamed from: c */
    public C14856b<T>[] f36285c;

    /* renamed from: d */
    public String f36286d;

    /* renamed from: e */
    public String[] f36287e;

    /* renamed from: f */
    public List<Pair<String, Float>> f36288f = new ArrayList();

    static {
        Covode.recordClassIndex(16956);
    }

    public C14855a(String str, String str2, String[] strArr, C14856b<T>... bVarArr) {
        this.f36283a = str;
        this.f36284b = 0.0d;
        this.f36286d = str2;
        this.f36287e = strArr;
        this.f36285c = bVarArr;
        for (C14856b<T> bVar : bVarArr) {
            this.f36288f.add(new Pair<>(bVar.f36289a, Double.valueOf(bVar.f36290b)));
        }
    }
}
