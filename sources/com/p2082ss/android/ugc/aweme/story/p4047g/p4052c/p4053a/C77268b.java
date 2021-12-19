package com.p2082ss.android.ugc.aweme.story.p4047g.p4052c.p4053a;

import android.app.Activity;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.tools.utils.AbstractC84903j;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.story.g.c.a.b */
public final class C77268b {

    /* renamed from: a */
    public final View f173349a;

    /* renamed from: b */
    public int f173350b;

    /* renamed from: c */
    public AbstractC77269a f173351c;

    /* renamed from: d */
    public final AbstractC84903j f173352d;

    /* renamed from: e */
    private final ViewTreeObserver.OnGlobalLayoutListener f173353e = new ViewTreeObserver$OnGlobalLayoutListenerC77270b(this);

    /* renamed from: com.ss.android.ugc.aweme.story.g.c.a.b$a */
    public interface AbstractC77269a {
        static {
            Covode.recordClassIndex(90286);
        }

        /* renamed from: a */
        void mo77523a(int i);

        /* renamed from: b */
        void mo77535b(int i);

        /* renamed from: c */
        void mo77540c(int i);
    }

    static {
        Covode.recordClassIndex(90285);
    }

    /* renamed from: a */
    public final void mo120870a() {
        View view = this.f173349a;
        if (!(view == null || this.f173353e == null)) {
            view.getViewTreeObserver().removeOnGlobalLayoutListener(this.f173353e);
        }
        this.f173351c = null;
    }

    /* renamed from: com.ss.android.ugc.aweme.story.g.c.a.b$b */
    static final class ViewTreeObserver$OnGlobalLayoutListenerC77270b implements ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: a */
        final /* synthetic */ C77268b f173354a;

        static {
            Covode.recordClassIndex(90287);
        }

        ViewTreeObserver$OnGlobalLayoutListenerC77270b(C77268b bVar) {
            this.f173354a = bVar;
        }

        public final void onGlobalLayout() {
            Rect rect = new Rect();
            View view = this.f173354a.f173349a;
            if (view != null) {
                view.getWindowVisibleDisplayFrame(rect);
            }
            int height = rect.height();
            if (!(this.f173354a.f173352d == null || this.f173354a.f173350b == height)) {
                this.f173354a.f173352d.mo123658a("softKeyBoard old Height:" + this.f173354a.f173350b + ", new Height:" + height);
            }
            if (this.f173354a.f173350b == 0) {
                this.f173354a.f173350b = height;
            } else if (this.f173354a.f173350b != height) {
                AbstractC77269a aVar = this.f173354a.f173351c;
                if (aVar != null) {
                    if (this.f173354a.f173350b - height > 200) {
                        aVar.mo77523a(this.f173354a.f173350b - height);
                    } else if (this.f173354a.f173350b > height) {
                        aVar.mo77540c(this.f173354a.f173350b - height);
                    } else if (height - this.f173354a.f173350b > 200) {
                        aVar.mo77535b(height - this.f173354a.f173350b);
                    }
                }
                this.f173354a.f173350b = height;
            }
        }
    }

    /* renamed from: a */
    public final void mo120871a(AbstractC77269a aVar) {
        this.f173351c = aVar;
        View view = this.f173349a;
        if (view != null && this.f173353e != null) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(this.f173353e);
        }
    }

    public C77268b(Activity activity, AbstractC84903j jVar) {
        C89219l.m154721d(activity, "");
        this.f173352d = jVar;
        Window window = activity.getWindow();
        C89219l.m154716b(window, "");
        this.f173349a = window.getDecorView();
    }
}
