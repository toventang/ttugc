package com.p2082ss.android.ugc.aweme.editSticker.text.bean;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.editSticker.text.bean.j */
public enum EnumC46094j {
    VERTICAL(0),
    HORIZONTAL(1);
    
    public static final C46095a Companion = new C46095a((byte) 0);

    /* renamed from: b */
    private final int f107342b;

    /* renamed from: com.ss.android.ugc.aweme.editSticker.text.bean.j$a */
    public static final class C46095a {
        static {
            Covode.recordClassIndex(54653);
        }

        private C46095a() {
        }

        public /* synthetic */ C46095a(byte b) {
            this();
        }

        /* renamed from: a */
        public static EnumC46094j m88950a(int i) {
            if (i == EnumC46094j.VERTICAL.getOrientation() || i != EnumC46094j.HORIZONTAL.getOrientation()) {
                return EnumC46094j.VERTICAL;
            }
            return EnumC46094j.HORIZONTAL;
        }
    }

    public final int getOrientation() {
        return this.f107342b;
    }

    static {
        Covode.recordClassIndex(54652);
    }

    private EnumC46094j(int i) {
        this.f107342b = i;
    }
}
