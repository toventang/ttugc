package com.p2082ss.android.ugc.aweme.commercialize.utils;

import android.app.Activity;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import com.bytedance.covode.number.Covode;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.commercialize.utils.aj */
public final class C38628aj {

    /* renamed from: f */
    public static final C38630b f91283f = new C38630b((byte) 0);

    /* renamed from: a */
    public int f91284a;

    /* renamed from: b */
    public int f91285b;

    /* renamed from: c */
    public ViewTreeObserver.OnGlobalLayoutListener f91286c = new ViewTreeObserver$OnGlobalLayoutListenerC38632d(this);

    /* renamed from: d */
    public AbstractC38629a f91287d;

    /* renamed from: e */
    public final Activity f91288e;

    /* renamed from: g */
    private final AbstractC89244h f91289g = C89250i.m154773a((AbstractC89171a) new C38631c(this));

    /* renamed from: com.ss.android.ugc.aweme.commercialize.utils.aj$a */
    public interface AbstractC38629a {
        static {
            Covode.recordClassIndex(46170);
        }

        /* renamed from: a */
        void mo67212a(int i, int i2, int i3);
    }

    static {
        Covode.recordClassIndex(46169);
    }

    /* renamed from: a */
    public final View mo67209a() {
        return (View) this.f91289g.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.utils.aj$b */
    public static final class C38630b {
        static {
            Covode.recordClassIndex(46171);
        }

        private C38630b() {
        }

        public /* synthetic */ C38630b(byte b) {
            this();
        }
    }

    /* renamed from: b */
    public final void mo67210b() {
        mo67209a().getViewTreeObserver().removeOnGlobalLayoutListener(this.f91286c);
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.utils.aj$c */
    static final class C38631c extends AbstractC89220m implements AbstractC89171a<View> {

        /* renamed from: a */
        final /* synthetic */ C38628aj f91290a;

        static {
            Covode.recordClassIndex(46172);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C38631c(C38628aj ajVar) {
            super(0);
            this.f91290a = ajVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ View invoke() {
            Window window = this.f91290a.f91288e.getWindow();
            C89219l.m154716b(window, "");
            View decorView = window.getDecorView();
            C89219l.m154716b(decorView, "");
            return decorView;
        }
    }

    /* renamed from: c */
    public final int mo67211c() {
        Rect rect = new Rect();
        mo67209a().getWindowVisibleDisplayFrame(rect);
        return rect.height();
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.utils.aj$d */
    static final class ViewTreeObserver$OnGlobalLayoutListenerC38632d implements ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: a */
        final /* synthetic */ C38628aj f91291a;

        static {
            Covode.recordClassIndex(46173);
        }

        ViewTreeObserver$OnGlobalLayoutListenerC38632d(C38628aj ajVar) {
            this.f91291a = ajVar;
        }

        public final void onGlobalLayout() {
            AbstractC38629a aVar;
            int c = this.f91291a.mo67211c();
            if (this.f91291a.f91284a == 0) {
                this.f91291a.f91284a = c;
            } else if (this.f91291a.f91284a != c) {
                if (Math.abs(c - this.f91291a.f91284a) > 20 && (aVar = this.f91291a.f91287d) != null) {
                    aVar.mo67212a(this.f91291a.f91284a, c, this.f91291a.f91285b);
                }
                this.f91291a.f91284a = c;
            }
        }
    }

    public C38628aj(Activity activity) {
        C89219l.m154721d(activity, "");
        this.f91288e = activity;
    }
}
