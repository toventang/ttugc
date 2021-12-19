package com.p2082ss.android.ugc.tools.view.style;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.tools.view.style.a */
public enum EnumC84965a {
    REGULAR("regular", 1),
    BOLD("bold", 2),
    BOLD_ITALIC("boldItalic", 3),
    ITALIC("italic", 4),
    LIGHT("light", 5),
    LIGHT_ITALIC("lightItalic", 6),
    MEDIUM("medium", 7),
    MEDIUM_ITALIC("mediumItalic", 8);
    

    /* renamed from: b */
    private final String f189890b;

    /* renamed from: c */
    private final int f189891c;

    public final String getFONT_NAME() {
        return this.f189890b;
    }

    public final int getVALUE() {
        return this.f189891c;
    }

    static {
        Covode.recordClassIndex(98970);
    }

    private EnumC84965a(String str, int i) {
        this.f189890b = str;
        this.f189891c = i;
    }
}
