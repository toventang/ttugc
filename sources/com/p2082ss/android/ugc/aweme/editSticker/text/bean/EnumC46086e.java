package com.p2082ss.android.ugc.aweme.editSticker.text.bean;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.editSticker.text.bean.e */
public enum EnumC46086e {
    MATCH_PARENT(0),
    DIMENSION(1);
    
    public static final C46087a Companion = new C46087a((byte) 0);

    /* renamed from: b */
    private final int f107331b;

    /* renamed from: com.ss.android.ugc.aweme.editSticker.text.bean.e$a */
    public static final class C46087a {
        static {
            Covode.recordClassIndex(54645);
        }

        private C46087a() {
        }

        public /* synthetic */ C46087a(byte b) {
            this();
        }

        /* renamed from: a */
        public static EnumC46086e m88949a(int i) {
            if (i == EnumC46086e.MATCH_PARENT.getMode() || i != EnumC46086e.DIMENSION.getMode()) {
                return EnumC46086e.MATCH_PARENT;
            }
            return EnumC46086e.DIMENSION;
        }
    }

    public final int getMode() {
        return this.f107331b;
    }

    static {
        Covode.recordClassIndex(54644);
    }

    private EnumC46086e(int i) {
        this.f107331b = i;
    }
}
