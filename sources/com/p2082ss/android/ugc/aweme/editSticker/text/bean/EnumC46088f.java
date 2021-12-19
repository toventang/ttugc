package com.p2082ss.android.ugc.aweme.editSticker.text.bean;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.editSticker.text.bean.f */
public enum EnumC46088f {
    LEFT(1),
    TOP(2),
    RIGHT(4),
    BOTTOM(8);
    
    public static final C46089a Companion = new C46089a((byte) 0);

    /* renamed from: b */
    private final int f107333b;

    /* renamed from: com.ss.android.ugc.aweme.editSticker.text.bean.f$a */
    public static final class C46089a {
        static {
            Covode.recordClassIndex(54647);
        }

        private C46089a() {
        }

        public /* synthetic */ C46089a(byte b) {
            this();
        }
    }

    public final int getGravity() {
        return this.f107333b;
    }

    static {
        Covode.recordClassIndex(54646);
    }

    private EnumC46088f(int i) {
        this.f107333b = i;
    }
}
