package com.p2082ss.android.ugc.gamora.editor.sticker.read;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.gamora.editor.sticker.read.e */
public final class C83060e {

    /* renamed from: a */
    public boolean f185595a;

    /* renamed from: b */
    public String f185596b;
    @AbstractC27891c(mo46611a = "speakerID")

    /* renamed from: c */
    public String f185597c;
    @AbstractC27891c(mo46611a = "lock_keywords_easteregg")

    /* renamed from: d */
    public String f185598d;
    @AbstractC27891c(mo46611a = "lock_easteregg")

    /* renamed from: e */
    public int f185599e;
    @AbstractC27891c(mo46611a = "voice_use_commercial")

    /* renamed from: f */
    public int f185600f;

    static {
        Covode.recordClassIndex(96933);
    }

    public C83060e() {
        this(false, null, null, null, 63);
    }

    private C83060e(boolean z, String str, String str2, String str3) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C89219l.m154721d(str3, "");
        this.f185595a = z;
        this.f185596b = str;
        this.f185597c = str2;
        this.f185598d = str3;
        this.f185599e = 0;
        this.f185600f = 0;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C83060e(boolean z, String str, String str2, String str3, int i) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? "" : str3);
    }
}
