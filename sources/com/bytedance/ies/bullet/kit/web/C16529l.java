package com.bytedance.ies.bullet.kit.web;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89214g;

/* renamed from: com.bytedance.ies.bullet.kit.web.l */
public final class C16529l extends Error {

    /* renamed from: a */
    private final int f39644a;

    /* renamed from: b */
    private final CharSequence f39645b;

    /* renamed from: c */
    private final CharSequence f39646c;

    static {
        Covode.recordClassIndex(18960);
    }

    public final CharSequence getDescription() {
        return this.f39645b;
    }

    public final int getErrorCode() {
        return this.f39644a;
    }

    public final CharSequence getFailingUrl() {
        return this.f39646c;
    }

    public C16529l(int i, CharSequence charSequence, CharSequence charSequence2) {
        super("WebLoadError, errorCode: " + i + ", desc: " + charSequence + ", failingUrl: " + charSequence2);
        this.f39644a = i;
        this.f39645b = charSequence;
        this.f39646c = charSequence2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C16529l(int i, CharSequence charSequence, CharSequence charSequence2, int i2, C89214g gVar) {
        this(i, (i2 & 2) != 0 ? null : charSequence, (i2 & 4) != 0 ? null : charSequence2);
    }
}
