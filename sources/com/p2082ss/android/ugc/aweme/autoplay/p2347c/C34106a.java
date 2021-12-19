package com.p2082ss.android.ugc.aweme.autoplay.p2347c;

import android.graphics.Rect;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.flowfeed.utils.AbstractC51064i;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.autoplay.c.a */
public final class C34106a extends AbstractC51064i {

    /* renamed from: a */
    public final View f80643a;

    /* renamed from: b */
    private Rect f80644b = new Rect();

    /* renamed from: c */
    private int[] f80645c = new int[2];

    static {
        Covode.recordClassIndex(41040);
    }

    @Override // com.p2082ss.android.ugc.aweme.flowfeed.utils.AbstractC51064i
    /* renamed from: e */
    public final boolean mo60403e() {
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.flowfeed.utils.AbstractC51064i
    /* renamed from: d */
    public final String mo60334d() {
        return String.valueOf(hashCode());
    }

    @Override // com.p2082ss.android.ugc.aweme.flowfeed.utils.AbstractC51064i
    /* renamed from: c */
    public final Rect mo60332c() {
        this.f80643a.getLocationOnScreen(this.f80645c);
        Rect rect = this.f80644b;
        int[] iArr = this.f80645c;
        rect.set(iArr[0], iArr[1], iArr[0] + this.f80643a.getWidth(), this.f80645c[1] + this.f80643a.getHeight());
        return this.f80644b;
    }

    public C34106a(View view) {
        C89219l.m154721d(view, "");
        this.f80643a = view;
    }
}
