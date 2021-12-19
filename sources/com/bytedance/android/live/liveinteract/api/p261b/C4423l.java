package com.bytedance.android.live.liveinteract.api.p261b;

import android.widget.FrameLayout;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.live.liveinteract.api.b.l */
public final class C4423l {

    /* renamed from: a */
    public EnumC4422k f12023a;

    /* renamed from: b */
    public FrameLayout f12024b;

    /* renamed from: c */
    public boolean f12025c;

    /* renamed from: d */
    public boolean f12026d;

    /* renamed from: e */
    public int f12027e;

    /* renamed from: f */
    public int f12028f;

    /* renamed from: g */
    public int f12029g;

    /* renamed from: h */
    public int f12030h;

    /* renamed from: i */
    public boolean f12031i;

    static {
        Covode.recordClassIndex(4999);
    }

    private C4423l(EnumC4422k kVar, FrameLayout frameLayout, boolean z, boolean z2, int i, int i2, int i3, int i4, boolean z3) {
        C89219l.m154721d(kVar, "");
        this.f12023a = kVar;
        this.f12024b = frameLayout;
        this.f12025c = z;
        this.f12026d = z2;
        this.f12027e = i;
        this.f12028f = i2;
        this.f12029g = i3;
        this.f12030h = i4;
        this.f12031i = z3;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C4423l(EnumC4422k kVar, FrameLayout frameLayout, boolean z, boolean z2, int i, int i2, int i3, int i4, boolean z3, int i5) {
        this(kVar, (i5 & 2) != 0 ? null : frameLayout, (i5 & 4) != 0 ? true : z, (i5 & 8) != 0 ? false : z2, (i5 & 16) != 0 ? 0 : i, (i5 & 32) != 0 ? 0 : i2, (i5 & 64) != 0 ? 0 : i3, (i5 & 128) != 0 ? 0 : i4, (i5 & 256) != 0 ? true : z3);
    }
}
