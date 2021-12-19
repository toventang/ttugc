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

/* renamed from: com.ss.android.ugc.aweme.commercialize.utils.g */
public final class C38742g {

    /* renamed from: e */
    public static final C38744b f91492e = new C38744b((byte) 0);

    /* renamed from: a */
    public int f91493a;

    /* renamed from: b */
    public AbstractC38743a f91494b;

    /* renamed from: c */
    public final Activity f91495c;

    /* renamed from: d */
    public final View f91496d;

    /* renamed from: f */
    private final AbstractC89244h f91497f = C89250i.m154773a((AbstractC89171a) new C38746d(this));

    /* renamed from: g */
    private ViewTreeObserver.OnGlobalLayoutListener f91498g;

    /* renamed from: h */
    private int f91499h = 16;

    /* renamed from: com.ss.android.ugc.aweme.commercialize.utils.g$a */
    public interface AbstractC38743a {
        static {
            Covode.recordClassIndex(46284);
        }

        /* renamed from: a */
        void mo67288a(boolean z);
    }

    static {
        Covode.recordClassIndex(46283);
    }

    /* renamed from: a */
    public final View mo67285a() {
        return (View) this.f91497f.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.utils.g$b */
    public static final class C38744b {
        static {
            Covode.recordClassIndex(46285);
        }

        private C38744b() {
        }

        public /* synthetic */ C38744b(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.utils.g$d */
    static final class C38746d extends AbstractC89220m implements AbstractC89171a<View> {

        /* renamed from: a */
        final /* synthetic */ C38742g f91501a;

        static {
            Covode.recordClassIndex(46287);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C38746d(C38742g gVar) {
            super(0);
            this.f91501a = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ View invoke() {
            Window window = this.f91501a.f91495c.getWindow();
            C89219l.m154716b(window, "");
            View decorView = window.getDecorView();
            C89219l.m154716b(decorView, "");
            return decorView;
        }
    }

    /* renamed from: c */
    public final void mo67287c() {
        this.f91495c.getWindow().setSoftInputMode(this.f91499h);
        mo67285a().getViewTreeObserver().removeOnGlobalLayoutListener(this.f91498g);
        this.f91498g = null;
    }

    /* renamed from: b */
    public final void mo67286b() {
        Window window = this.f91495c.getWindow();
        this.f91499h = window.getAttributes().softInputMode;
        window.setSoftInputMode(16);
        this.f91498g = new ViewTreeObserver$OnGlobalLayoutListenerC38745c(this);
        mo67285a().getViewTreeObserver().addOnGlobalLayoutListener(this.f91498g);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.commercialize.utils.g$c */
    public static final class ViewTreeObserver$OnGlobalLayoutListenerC38745c implements ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: a */
        final /* synthetic */ C38742g f91500a;

        static {
            Covode.recordClassIndex(46286);
        }

        ViewTreeObserver$OnGlobalLayoutListenerC38745c(C38742g gVar) {
            this.f91500a = gVar;
        }

        public final void onGlobalLayout() {
            Rect rect = new Rect();
            this.f91500a.mo67285a().getWindowVisibleDisplayFrame(rect);
            int height = rect.height();
            if (this.f91500a.f91493a == 0) {
                this.f91500a.f91493a = height;
            } else if (this.f91500a.f91493a != height) {
                int i = height - this.f91500a.f91493a;
                if (i < -20) {
                    View view = this.f91500a.f91496d;
                    Rect rect2 = new Rect();
                    int[] iArr = new int[2];
                    view.getLocationOnScreen(iArr);
                    rect2.set(iArr[0], iArr[1], iArr[0] + view.getWidth(), iArr[1] + view.getHeight());
                    this.f91500a.f91496d.animate().translationYBy((float) (-((rect2.bottom - rect.bottom) + 30))).setDuration(100).start();
                    AbstractC38743a aVar = this.f91500a.f91494b;
                    if (aVar != null) {
                        aVar.mo67288a(true);
                    }
                } else if (i > 20) {
                    this.f91500a.f91496d.animate().translationY((((float) (this.f91500a.mo67285a().getHeight() - this.f91500a.f91496d.getHeight())) / 2.0f) - ((float) this.f91500a.f91496d.getTop())).setDuration(100).start();
                    AbstractC38743a aVar2 = this.f91500a.f91494b;
                    if (aVar2 != null) {
                        aVar2.mo67288a(false);
                    }
                }
                this.f91500a.f91493a = height;
            }
        }
    }

    public C38742g(Activity activity, View view) {
        C89219l.m154721d(activity, "");
        C89219l.m154721d(view, "");
        this.f91495c = activity;
        this.f91496d = view;
    }
}
