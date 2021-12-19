package com.p2082ss.android.ugc.aweme.editSticker.text.bean;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.editSticker.text.bean.k */
public enum EnumC46096k {
    NONE(0),
    LINEAR(1);
    
    public static final C46097a Companion = new C46097a((byte) 0);

    /* renamed from: b */
    private final int f107344b;

    /* renamed from: com.ss.android.ugc.aweme.editSticker.text.bean.k$a */
    public static final class C46097a {
        static {
            Covode.recordClassIndex(54655);
        }

        private C46097a() {
        }

        public /* synthetic */ C46097a(byte b) {
            this();
        }

        /* renamed from: a */
        public static EnumC46096k m88951a(int i) {
            if (i == EnumC46096k.NONE.getType() || i != EnumC46096k.LINEAR.getType()) {
                return EnumC46096k.NONE;
            }
            return EnumC46096k.LINEAR;
        }
    }

    public final int getType() {
        return this.f107344b;
    }

    static {
        Covode.recordClassIndex(54654);
    }

    private EnumC46096k(int i) {
        this.f107344b = i;
    }
}
