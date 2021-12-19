package com.p2082ss.android.http.p2146a.p2149b;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.http.p2146a.p2151d.C29942b;

/* renamed from: com.ss.android.http.a.b.g */
public final class C29937g {

    /* renamed from: a */
    public final int f71422a;

    /* renamed from: b */
    public final int f71423b;

    /* renamed from: c */
    public int f71424c;

    static {
        Covode.recordClassIndex(36349);
    }

    /* renamed from: a */
    public final boolean mo52265a() {
        if (this.f71424c >= this.f71423b) {
            return true;
        }
        return false;
    }

    public final String toString() {
        C29942b bVar = new C29942b(16);
        bVar.mo52268a('[');
        bVar.mo52270a(Integer.toString(this.f71422a));
        bVar.mo52268a('>');
        bVar.mo52270a(Integer.toString(this.f71424c));
        bVar.mo52268a('>');
        bVar.mo52270a(Integer.toString(this.f71423b));
        bVar.mo52268a(']');
        return bVar.toString();
    }

    public C29937g(int i) {
        if (i >= 0) {
            this.f71422a = 0;
            this.f71423b = i;
            this.f71424c = 0;
            return;
        }
        throw new IndexOutOfBoundsException("Lower bound cannot be greater then upper bound");
    }

    /* renamed from: a */
    public final void mo52264a(int i) {
        if (i < this.f71422a) {
            throw new IndexOutOfBoundsException();
        } else if (i <= this.f71423b) {
            this.f71424c = i;
        } else {
            throw new IndexOutOfBoundsException();
        }
    }
}
