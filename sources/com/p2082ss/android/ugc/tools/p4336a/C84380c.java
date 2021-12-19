package com.p2082ss.android.ugc.tools.p4336a;

import android.content.Context;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.tools.C84401c;
import com.p2082ss.android.ugc.tools.utils.C84912r;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.tools.a.c */
public final class C84380c {
    static {
        Covode.recordClassIndex(98345);
    }

    /* renamed from: com.ss.android.ugc.tools.a.c$a */
    public static final class ViewTreeObserver$OnGlobalLayoutListenerC84381a implements ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: a */
        final /* synthetic */ View f188653a;

        /* renamed from: b */
        final /* synthetic */ int f188654b;

        /* renamed from: c */
        final /* synthetic */ int f188655c;

        static {
            Covode.recordClassIndex(98346);
        }

        public final void onGlobalLayout() {
            this.f188653a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            View view = this.f188653a;
            int i = this.f188654b;
            int i2 = this.f188655c;
            while (true) {
                ViewParent parent = view.getParent();
                if (parent instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) parent;
                    if (viewGroup.getWidth() < i || viewGroup.getHeight() < i2) {
                        view = (View) parent;
                    } else {
                        C84401c.f188722f.mo123658a("expandViewTouchArea: " + this.f188653a + ", " + viewGroup);
                        View view2 = this.f188653a;
                        int i3 = this.f188654b;
                        int i4 = this.f188655c;
                        TouchDelegate touchDelegate = viewGroup.getTouchDelegate();
                        if (touchDelegate instanceof C84379b) {
                            ((C84379b) touchDelegate).mo129386a(new C84375a(i3, i4, viewGroup, view2));
                            return;
                        }
                        C84379b bVar = new C84379b(view2);
                        viewGroup.setTouchDelegate(bVar);
                        bVar.mo129386a(new C84375a(i3, i4, viewGroup, view2));
                        return;
                    }
                } else {
                    return;
                }
            }
        }

        ViewTreeObserver$OnGlobalLayoutListenerC84381a(View view, int i, int i2) {
            this.f188653a = view;
            this.f188654b = i;
            this.f188655c = i2;
        }
    }

    /* renamed from: a */
    public static void m145132a(View view) {
        if (view != null) {
            Context context = view.getContext();
            C89219l.m154716b(context, "");
            int a = (int) C84912r.m145930a(context, 48.0f);
            Context context2 = view.getContext();
            C89219l.m154716b(context2, "");
            view.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver$OnGlobalLayoutListenerC84381a(view, a, (int) C84912r.m145930a(context2, 48.0f)));
        }
    }
}
