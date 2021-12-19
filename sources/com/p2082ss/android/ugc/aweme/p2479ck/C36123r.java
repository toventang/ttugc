package com.p2082ss.android.ugc.aweme.p2479ck;

import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.ss.android.ugc.aweme.ck.r */
public final class C36123r {

    /* renamed from: a */
    public ArrayList<String> f85332a;

    /* renamed from: b */
    public ArrayList<String> f85333b;

    /* renamed from: c */
    public ArrayList<String> f85334c;

    /* renamed from: d */
    public ArrayList<String> f85335d;

    /* renamed from: e */
    public ArrayList<String> f85336e;

    /* renamed from: f */
    public ArrayList<String> f85337f;

    /* renamed from: g */
    public ArrayList<String> f85338g;

    /* renamed from: h */
    public ArrayList<String> f85339h;

    /* renamed from: i */
    public ArrayList<String> f85340i;

    static {
        Covode.recordClassIndex(43376);
    }

    /* renamed from: a */
    public final void mo63243a() {
        m73585a(this.f85334c);
        m73585a(this.f85338g);
        m73585a(this.f85339h);
        m73585a(this.f85337f);
        m73585a(this.f85336e);
        m73585a(this.f85332a);
        m73585a(this.f85333b);
        m73585a(this.f85335d);
        m73585a(this.f85334c);
    }

    /* renamed from: a */
    private static void m73585a(ArrayList<String> arrayList) {
        if (arrayList != null && !arrayList.isEmpty()) {
            arrayList.clear();
        }
    }

    /* renamed from: b */
    public final void mo63245b(String str) {
        if (this.f85332a == null) {
            this.f85332a = new ArrayList<>();
        }
        this.f85332a.add(str);
    }

    /* renamed from: a */
    public final void mo63244a(String str) {
        if (this.f85340i == null) {
            this.f85340i = new ArrayList<>();
        }
        this.f85340i.add(str);
    }

    /* renamed from: a */
    static boolean m73586a(ArrayList<String> arrayList, String str) {
        if (arrayList == null) {
            return false;
        }
        Iterator<String> it = arrayList.iterator();
        while (it.hasNext()) {
            if (it.next().equals(str)) {
                return true;
            }
        }
        return false;
    }
}
