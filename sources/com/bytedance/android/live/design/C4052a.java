package com.bytedance.android.live.design;

import androidx.emoji.p045a.C0877a;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.live.design.a */
public final class C4052a {

    /* renamed from: a */
    public boolean f11187a;

    /* renamed from: b */
    public boolean f11188b;

    /* renamed from: c */
    private boolean f11189c;

    static {
        Covode.recordClassIndex(4593);
    }

    private C4052a() {
    }

    /* renamed from: com.bytedance.android.live.design.a$a */
    public static class C4053a {

        /* renamed from: a */
        public static final C4052a f11190a = new C4052a((byte) 0);

        static {
            Covode.recordClassIndex(4594);
        }
    }

    /* renamed from: a */
    public final boolean mo9495a() {
        if (!this.f11187a) {
            return false;
        }
        if (!this.f11189c) {
            try {
                C0877a.m3052a();
                this.f11189c = true;
            } catch (IllegalStateException unused) {
            }
        }
        return this.f11189c;
    }

    /* synthetic */ C4052a(byte b) {
        this();
    }
}
