package com.p2082ss.android.ugc.asve.recorder.reaction.p2225a;

import android.content.Context;
import android.content.res.TypedArray;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.asve.recorder.reaction.model.AbstractC31232d;
import com.p2082ss.android.ugc.asve.recorder.reaction.model.C31230b;
import com.p2082ss.android.ugc.asve.recorder.reaction.model.C31231c;
import java.io.File;
import java.util.ArrayList;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.asve.recorder.reaction.a.c */
public final class C31225c {

    /* renamed from: a */
    public final ArrayList<AbstractC31232d> f74835a = new ArrayList<>();

    /* renamed from: b */
    public int f74836b;

    /* renamed from: c */
    private final String f74837c = "ReactionWindowFactory";

    /* renamed from: d */
    private int f74838d;

    /* renamed from: e */
    private int f74839e;

    static {
        Covode.recordClassIndex(37871);
    }

    /* renamed from: a */
    private final void m64907a(Context context, int i, int i2, int i3) {
        TypedArray obtainTypedArray = context.getResources().obtainTypedArray(i);
        C89219l.m154716b(obtainTypedArray, "");
        int length = obtainTypedArray.length();
        this.f74839e = length;
        for (int i4 = 0; i4 < length; i4++) {
            File a = m64906a(context, "reaction_mask_rectangular", obtainTypedArray, i4);
            if (a != null) {
                String absolutePath = a.getAbsolutePath();
                C89219l.m154716b(absolutePath, "");
                this.f74835a.add(new C31231c(absolutePath, i2, i3, 120, 213, 100, 178));
            } else {
                return;
            }
        }
        obtainTypedArray.recycle();
    }

    /* renamed from: b */
    private final void m64908b(Context context, int i, int i2, int i3) {
        TypedArray obtainTypedArray = context.getResources().obtainTypedArray(i);
        C89219l.m154716b(obtainTypedArray, "");
        int length = obtainTypedArray.length();
        this.f74838d = length;
        for (int i4 = 0; i4 < length; i4++) {
            File a = m64906a(context, "reaction_mask_circle", obtainTypedArray, i4);
            if (a != null) {
                String absolutePath = a.getAbsolutePath();
                C89219l.m154716b(absolutePath, "");
                this.f74835a.add(new C31230b(absolutePath, i2, i3, 120, 120, 100, 100));
            } else {
                return;
            }
        }
        obtainTypedArray.recycle();
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x008a A[SYNTHETIC, Splitter:B:26:0x008a] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x009a A[SYNTHETIC, Splitter:B:35:0x009a] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.io.File m64906a(android.content.Context r8, java.lang.String r9, android.content.res.TypedArray r10, int r11) {
        /*
        // Method dump skipped, instructions count: 166
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.asve.recorder.reaction.p2225a.C31225c.m64906a(android.content.Context, java.lang.String, android.content.res.TypedArray, int):java.io.File");
    }

    public C31225c(Context context, int i, int i2, int i3, int i4) {
        C89219l.m154721d(context, "");
        m64907a(context, i3, i, i2);
        m64908b(context, i4, i, i2);
    }
}
