package com.p2082ss.android.ugc.aweme.share.p3766l;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.share.l.a */
public enum EnumC69294a {
    Default(1, 2131232304),
    H_THREE_POINT(2, 2131232305),
    ARROW(3, 2131232306),
    T_THREE_POINT(4, 2131232307);
    

    /* renamed from: a */
    private int f154855a;

    /* renamed from: b */
    private int f154856b;

    public final int getDrawable() {
        return this.f154856b;
    }

    public final int getStyle() {
        return this.f154855a;
    }

    static {
        Covode.recordClassIndex(81624);
    }

    public static EnumC69294a build(int i) {
        EnumC69294a aVar = Default;
        EnumC69294a aVar2 = H_THREE_POINT;
        if (i != aVar2.getStyle()) {
            aVar2 = T_THREE_POINT;
            if (i != aVar2.getStyle()) {
                aVar2 = ARROW;
                if (i != aVar2.getStyle()) {
                    return aVar;
                }
            }
        }
        return aVar2;
    }

    private EnumC69294a(int i, int i2) {
        this.f154855a = i;
        this.f154856b = i2;
    }
}
