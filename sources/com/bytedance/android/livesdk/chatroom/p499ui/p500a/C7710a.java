package com.bytedance.android.livesdk.chatroom.p499ui.p500a;

import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.livesdkapi.view.AbstractC11876d;
import com.bytedance.android.livesdkapi.view.AbstractC11877e;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import java.util.Objects;
import p4600h.C89391z;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.livesdk.chatroom.ui.a.a */
public final class C7710a {

    /* renamed from: a */
    public View f19173a;

    static {
        Covode.recordClassIndex(8505);
    }

    /* renamed from: a */
    public final AbstractC11876d mo13984a() {
        View view = this.f19173a;
        if (!(view instanceof AbstractC11876d)) {
            return null;
        }
        Objects.requireNonNull(view, "null cannot be cast to non-null type com.bytedance.android.livesdkapi.view.IRender");
        return (AbstractC11876d) view;
    }

    /* renamed from: b */
    public final ViewGroup.LayoutParams mo13987b() {
        ViewGroup.LayoutParams layoutParams = this.f19173a.getLayoutParams();
        C89219l.m154716b(layoutParams, "");
        return layoutParams;
    }

    public C7710a(View view) {
        C89219l.m154721d(view, "");
        this.f19173a = view;
    }

    /* renamed from: a */
    public final void mo13985a(int i) {
        if (this.f19173a.getContext() != null) {
            C13628n.m24510a(this.f19173a, i);
        }
    }

    /* renamed from: b */
    public final C89391z mo13988b(int i) {
        View view = this.f19173a;
        if (!(view instanceof AbstractC11877e) || view == null) {
            return null;
        }
        Objects.requireNonNull(view, "null cannot be cast to non-null type com.bytedance.android.livesdkapi.view.IRenderView");
        ((AbstractC11877e) view).setScaleType(i);
        return C89391z.f203057a;
    }

    /* renamed from: a */
    public final void mo13986a(ViewGroup.LayoutParams layoutParams) {
        C89219l.m154721d(layoutParams, "");
        if (this.f19173a.getContext() != null) {
            this.f19173a.setLayoutParams(layoutParams);
        }
    }
}
