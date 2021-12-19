package com.bytedance.android.live.publicscreen.impl.model.chat.badge;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.live.publicscreen.impl.model.chat.badge.a */
public abstract class AbstractC5995a {

    /* renamed from: a */
    public int f15052a = -1;

    /* renamed from: b */
    public int f15053b;

    /* renamed from: c */
    public Runnable f15054c;

    /* renamed from: d */
    public final Context f15055d;

    static {
        Covode.recordClassIndex(6606);
    }

    /* renamed from: a */
    public abstract void mo11888a(Canvas canvas, Paint paint);

    /* renamed from: b */
    public abstract int mo11889b(Paint paint);

    public AbstractC5995a(Context context) {
        C89219l.m154721d(context, "");
        this.f15055d = context;
        this.f15053b = context.getResources().getDimensionPixelSize(R.dimen.xu);
    }

    /* renamed from: a */
    public final int mo11887a(Paint paint) {
        C89219l.m154721d(paint, "");
        if (this.f15052a < 0) {
            this.f15052a = mo11889b(paint);
        }
        return this.f15052a;
    }
}
