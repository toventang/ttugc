package com.p2082ss.android.ugc.awemepushlib.manager;

import android.content.Context;
import android.graphics.Bitmap;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.awemepushlib.p4247c.C81823b;
import p077b.AbstractC1729g;
import p077b.C1731i;

/* renamed from: com.ss.android.ugc.awemepushlib.manager.f */
final /* synthetic */ class C81905f implements AbstractC1729g {

    /* renamed from: a */
    private final Context f183112a;

    /* renamed from: b */
    private final Bitmap[] f183113b;

    /* renamed from: c */
    private final Bitmap[] f183114c;

    /* renamed from: d */
    private final int f183115d;

    /* renamed from: e */
    private final C81823b f183116e;

    static {
        Covode.recordClassIndex(95322);
    }

    C81905f(Context context, Bitmap[] bitmapArr, Bitmap[] bitmapArr2, int i, C81823b bVar) {
        this.f183112a = context;
        this.f183113b = bitmapArr;
        this.f183114c = bitmapArr2;
        this.f183115d = i;
        this.f183116e = bVar;
    }

    @Override // p077b.AbstractC1729g
    public final Object then(C1731i iVar) {
        return MessageShowHandler.m141812a(this.f183112a, (Bitmap[]) this.f183113b[0], (Bitmap[]) this.f183114c[0], this.f183115d, this.f183116e);
    }
}
