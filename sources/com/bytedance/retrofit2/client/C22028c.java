package com.bytedance.retrofit2.client;

import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.mime.TypedInput;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.bytedance.retrofit2.client.c */
public final class C22028c {

    /* renamed from: a */
    public final String f52039a;

    /* renamed from: b */
    public final int f52040b;

    /* renamed from: c */
    public final String f52041c;

    /* renamed from: d */
    public final List<C22027b> f52042d;

    /* renamed from: e */
    public final TypedInput f52043e;

    /* renamed from: f */
    public Object f52044f;

    static {
        Covode.recordClassIndex(25718);
    }

    /* renamed from: a */
    public final boolean mo35845a() {
        int i = this.f52040b;
        if (i < 200 || i >= 300) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final C22027b mo35844a(String str) {
        List<C22027b> list = this.f52042d;
        if (list == null) {
            return null;
        }
        for (C22027b bVar : list) {
            if (str.equalsIgnoreCase(bVar.f52037a)) {
                return bVar;
            }
        }
        return null;
    }

    /* renamed from: b */
    public final List<C22027b> mo35846b(String str) {
        List<C22027b> list;
        ArrayList arrayList = null;
        if (!(str == null || (list = this.f52042d) == null)) {
            for (C22027b bVar : list) {
                if (str.equalsIgnoreCase(bVar.f52037a)) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(bVar);
                }
            }
        }
        return arrayList;
    }

    public C22028c(String str, int i, String str2, List<C22027b> list, TypedInput typedInput) {
        if (str == null) {
            throw new IllegalArgumentException("url == null");
        } else if (i < 200) {
            throw new IllegalArgumentException("Invalid status code: ".concat(String.valueOf(i)));
        } else if (str2 == null) {
            throw new IllegalArgumentException("reason == null");
        } else if (list != null) {
            this.f52039a = str;
            this.f52040b = i;
            this.f52041c = str2;
            this.f52042d = Collections.unmodifiableList(new ArrayList(list));
            this.f52043e = typedInput;
        } else {
            throw new IllegalArgumentException("headers == null");
        }
    }
}
