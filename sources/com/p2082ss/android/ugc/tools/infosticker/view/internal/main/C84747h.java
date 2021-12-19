package com.p2082ss.android.ugc.tools.infosticker.view.internal.main;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import androidx.p060l.C1098c;
import androidx.p060l.C1142o;
import androidx.p060l.C1146q;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.tools.utils.C84912r;
import java.util.Objects;
import p4600h.p4611f.p4613b.C89219l;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.tools.infosticker.view.internal.main.h */
public final class C84747h {

    /* renamed from: a */
    public static final C84748a f189368a = new C84748a((byte) 0);

    /* renamed from: b */
    private int f189369b;

    /* renamed from: c */
    private int f189370c;

    /* renamed from: d */
    private boolean f189371d = true;

    /* renamed from: e */
    private final int f189372e;

    /* renamed from: f */
    private final View f189373f;

    /* renamed from: g */
    private final View f189374g;

    /* renamed from: h */
    private final View f189375h;

    static {
        Covode.recordClassIndex(98723);
    }

    /* renamed from: com.ss.android.ugc.tools.infosticker.view.internal.main.h$a */
    public static final class C84748a {
        static {
            Covode.recordClassIndex(98724);
        }

        private C84748a() {
        }

        public /* synthetic */ C84748a(byte b) {
            this();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo129656a(boolean z) {
        int i;
        ViewGroup.LayoutParams layoutParams = this.f189375h.getLayoutParams();
        if (this.f189371d) {
            this.f189369b = this.f189375h.getMeasuredWidth();
            this.f189374g.measure(0, 0);
            this.f189370c = this.f189374g.getMeasuredWidth();
            this.f189371d = false;
        }
        if (z) {
            i = this.f189369b - (this.f189370c + this.f189372e);
        } else {
            i = -1;
        }
        layoutParams.width = i;
        C1146q qVar = new C1146q();
        qVar.mo3941a(new C1098c().mo3921b(this.f189375h).mo3921b(this.f189374g));
        qVar.mo3907a(new AccelerateInterpolator());
        qVar.mo3906a(300L);
        View view = this.f189373f;
        Objects.requireNonNull(view, "null cannot be cast to non-null type android.view.ViewGroup");
        C1142o.m3795a((ViewGroup) view, qVar);
        this.f189375h.setLayoutParams(layoutParams);
    }

    public C84747h(Context context, View view, View view2, View view3) {
        C89219l.m154721d(context, "");
        C89219l.m154721d(view, "");
        C89219l.m154721d(view2, "");
        C89219l.m154721d(view3, "");
        this.f189373f = view;
        this.f189374g = view2;
        this.f189375h = view3;
        this.f189372e = (int) C84912r.m145930a(context, 16.0f);
    }
}
