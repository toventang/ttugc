package com.p2082ss.android.ugc.aweme.sharer;

import android.net.Uri;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.sharer.n */
public final class C69653n extends AbstractC69645h {

    /* renamed from: b */
    public final Uri f155480b;

    /* renamed from: c */
    public final String f155481c;

    /* renamed from: d */
    public final String f155482d;

    /* renamed from: e */
    public final String f155483e;

    /* renamed from: f */
    public final String f155484f;

    /* renamed from: g */
    public final String f155485g;

    static {
        Covode.recordClassIndex(82025);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private C69653n(Uri uri, String str, String str2, String str3, String str4) {
        super((byte) 0);
        C89219l.m154721d(uri, "");
        this.f155480b = uri;
        this.f155481c = str;
        this.f155482d = str2;
        this.f155483e = null;
        this.f155484f = str3;
        this.f155485g = str4;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C69653n(Uri uri, String str, String str2, String str3, String str4, int i) {
        this(uri, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 16) != 0 ? null : str3, (i & 32) == 0 ? str4 : null);
    }
}
