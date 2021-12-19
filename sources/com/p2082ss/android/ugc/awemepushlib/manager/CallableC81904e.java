package com.p2082ss.android.ugc.awemepushlib.manager;

import android.content.Context;
import android.graphics.Bitmap;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.awemepushlib.p4247c.C81823b;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.awemepushlib.manager.e */
final /* synthetic */ class CallableC81904e implements Callable {

    /* renamed from: a */
    private final Bitmap[] f183107a;

    /* renamed from: b */
    private final C81823b f183108b;

    /* renamed from: c */
    private final Context f183109c;

    /* renamed from: d */
    private final Bitmap[] f183110d;

    /* renamed from: e */
    private final int f183111e;

    static {
        Covode.recordClassIndex(95321);
    }

    CallableC81904e(Bitmap[] bitmapArr, C81823b bVar, Context context, Bitmap[] bitmapArr2, int i) {
        this.f183107a = bitmapArr;
        this.f183108b = bVar;
        this.f183109c = context;
        this.f183110d = bitmapArr2;
        this.f183111e = i;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return MessageShowHandler.m141807a(this.f183107a, this.f183108b, this.f183109c, this.f183110d, this.f183111e);
    }
}
