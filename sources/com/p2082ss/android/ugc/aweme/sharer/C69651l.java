package com.p2082ss.android.ugc.aweme.sharer;

import android.net.Uri;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.sharer.l */
public final class C69651l extends AbstractC69645h {

    /* renamed from: b */
    public final Uri f155472b;

    /* renamed from: c */
    public final String f155473c;

    /* renamed from: d */
    public final String f155474d;

    /* renamed from: e */
    public final String f155475e;

    /* renamed from: f */
    public final String f155476f;

    /* renamed from: g */
    public final String f155477g;

    static {
        Covode.recordClassIndex(82023);
    }

    public C69651l(Uri uri, String str) {
        this(uri, str, null, 60);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private C69651l(Uri uri, String str, String str2) {
        super((byte) 0);
        C89219l.m154721d(uri, "");
        C89219l.m154721d(str, "");
        this.f155472b = uri;
        this.f155473c = str;
        this.f155474d = null;
        this.f155475e = null;
        this.f155476f = null;
        this.f155477g = str2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C69651l(Uri uri, String str, String str2, int i) {
        this(uri, str, (i & 32) != 0 ? null : str2);
    }
}
