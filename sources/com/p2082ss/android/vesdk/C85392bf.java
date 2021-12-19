package com.p2082ss.android.vesdk;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.vesdk.bf */
public class C85392bf {

    /* renamed from: a */
    public int f191160a;

    /* renamed from: b */
    public EnumC85393a f191161b;

    /* renamed from: c */
    public float f191162c;

    /* renamed from: d */
    public float f191163d;

    /* renamed from: e */
    public float f191164e;

    /* renamed from: f */
    public float f191165f;

    static {
        Covode.recordClassIndex(99504);
    }

    /* renamed from: com.ss.android.vesdk.bf$a */
    public enum EnumC85393a {
        BEGAN,
        MOVED,
        STATIONARY,
        ENDED,
        CANCELED;

        static {
            Covode.recordClassIndex(99505);
        }
    }

    public String toString() {
        return "pointerId: " + this.f191160a + ", TouchEvent: " + this.f191161b + ", x: " + this.f191162c + ", y: " + this.f191163d + ", force: " + this.f191164e + ", majorRadius: " + this.f191165f;
    }
}
