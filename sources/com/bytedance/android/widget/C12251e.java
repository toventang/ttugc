package com.bytedance.android.widget;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.widget.e */
public final class C12251e extends Error {

    /* renamed from: a */
    private final String f29525a;

    static {
        Covode.recordClassIndex(13986);
    }

    public final String getMessage() {
        return this.f29525a;
    }

    public C12251e(String str) {
        this.f29525a = str;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C12251e(Widget widget) {
        this((Class<? extends Widget>) widget.getClass());
        C89219l.m154719c(widget, "");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C12251e(Class<? extends Widget> cls) {
        this(cls.getSimpleName() + " should use WidgetContainer!");
        C89219l.m154719c(cls, "");
    }
}
