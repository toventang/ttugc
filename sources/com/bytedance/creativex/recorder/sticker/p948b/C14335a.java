package com.bytedance.creativex.recorder.sticker.p948b;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.creativex.recorder.sticker.b.a */
public final class C14335a {

    /* renamed from: a */
    public final int f34706a;

    /* renamed from: b */
    public final int f34707b;

    /* renamed from: c */
    public final int f34708c;

    /* renamed from: d */
    public final String f34709d;

    static {
        Covode.recordClassIndex(16408);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C14335a)) {
            return false;
        }
        C14335a aVar = (C14335a) obj;
        return this.f34706a == aVar.f34706a && this.f34707b == aVar.f34707b && this.f34708c == aVar.f34708c && C89219l.m154714a(this.f34709d, aVar.f34709d);
    }

    public final int hashCode() {
        int i = ((((this.f34706a * 31) + this.f34707b) * 31) + this.f34708c) * 31;
        String str = this.f34709d;
        return i + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "EffectSDKMessage(messageType=" + this.f34706a + ", arg1=" + this.f34707b + ", arg2=" + this.f34708c + ", arg3=" + this.f34709d + ")";
    }

    public C14335a(int i, int i2, int i3, String str) {
        this.f34706a = i;
        this.f34707b = i2;
        this.f34708c = i3;
        this.f34709d = str;
    }
}
