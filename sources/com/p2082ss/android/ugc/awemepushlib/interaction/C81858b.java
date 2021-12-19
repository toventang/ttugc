package com.p2082ss.android.ugc.awemepushlib.interaction;

import android.os.Handler;
import android.os.Message;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.awemepushlib.interaction.b */
final /* synthetic */ class C81858b implements Handler.Callback {

    /* renamed from: a */
    private final int f183016a;

    /* renamed from: b */
    private final int f183017b;

    /* renamed from: c */
    private final int f183018c;

    /* renamed from: d */
    private final int f183019d;

    /* renamed from: e */
    private final int f183020e;

    /* renamed from: f */
    private final Handler.Callback f183021f;

    static {
        Covode.recordClassIndex(95272);
    }

    C81858b(int i, int i2, int i3, int i4, int i5, Handler.Callback callback) {
        this.f183016a = i;
        this.f183017b = i2;
        this.f183018c = i3;
        this.f183019d = i4;
        this.f183020e = i5;
        this.f183021f = callback;
    }

    public final boolean handleMessage(Message message) {
        return C81847a.m141748a(this.f183016a, this.f183017b, this.f183018c, this.f183019d, this.f183020e, this.f183021f, message);
    }
}
