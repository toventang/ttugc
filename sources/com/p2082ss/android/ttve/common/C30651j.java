package com.p2082ss.android.ttve.common;

import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ttve.common.j */
public final class C30651j {

    /* renamed from: a */
    public int f73286a = -1;

    /* renamed from: b */
    public int f73287b = -1;

    /* renamed from: c */
    public List<Integer> f73288c = new ArrayList();

    /* renamed from: d */
    public List<Integer> f73289d = new ArrayList();

    static {
        Covode.recordClassIndex(37193);
    }

    /* renamed from: a */
    public final void mo54956a() {
        this.f73286a = -1;
        this.f73287b = -1;
        this.f73288c.clear();
        this.f73289d.clear();
    }

    /* renamed from: a */
    public final int mo54954a(int i) {
        if (i < 0) {
            return i;
        }
        if (this.f73286a == -1) {
            this.f73286a = i;
        }
        if (this.f73288c.size() > 0) {
            List<Integer> list = this.f73288c;
            i = list.get(list.size() - 1).intValue() + 1;
        }
        this.f73288c.add(Integer.valueOf(i));
        return i;
    }

    /* renamed from: a */
    public final int mo54955a(int i, int i2) {
        int i3;
        int i4;
        int i5 = 0;
        if (i == 1) {
            int i6 = this.f73286a;
            if (i2 >= i6 && i6 != -1) {
                while (i5 < this.f73288c.size()) {
                    if (i2 == this.f73288c.get(i5).intValue()) {
                        i3 = this.f73286a;
                        return i5 + i3;
                    }
                    i5++;
                }
            }
        } else if (i != 2 || i2 < (i4 = this.f73287b) || i4 == -1) {
            return i2;
        } else {
            while (i5 < this.f73289d.size()) {
                if (i2 == this.f73289d.get(i5).intValue()) {
                    i3 = this.f73287b;
                    return i5 + i3;
                }
                i5++;
            }
        }
        return i2;
    }
}
