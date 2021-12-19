package com.p2082ss.android.ugc.aweme.p2282ad.utils;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewParent;
import androidx.core.p037h.C0792v;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17873f;
import com.p2082ss.android.ugc.aweme.commercialize_x.service.CommercializeAdServiceImpl;
import com.p2082ss.android.ugc.aweme.p2282ad.feed.p2296e.AbstractC33253a;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ad.utils.d */
public final class C33394d {

    /* renamed from: a */
    public static final C33394d f79347a = new C33394d();

    /* renamed from: b */
    private static final AbstractC89244h f79348b = C89250i.m154773a((AbstractC89171a) C33395a.f79349a);

    /* renamed from: a */
    private static AbstractC33253a m68479a() {
        return (AbstractC33253a) f79348b.getValue();
    }

    private C33394d() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.ad.utils.d$b */
    public static final class RunnableC33396b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ View f79350a;

        /* renamed from: b */
        final /* synthetic */ Runnable f79351b;

        static {
            Covode.recordClassIndex(40245);
        }

        RunnableC33396b(View view, Runnable runnable) {
            this.f79350a = view;
            this.f79351b = runnable;
        }

        public final void run() {
            C33394d.m68480a(this.f79350a, this.f79351b);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ad.utils.d$a */
    static final class C33395a extends AbstractC89220m implements AbstractC89171a<AbstractC33253a> {

        /* renamed from: a */
        public static final C33395a f79349a = new C33395a();

        static {
            Covode.recordClassIndex(40244);
        }

        C33395a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ AbstractC33253a invoke() {
            return CommercializeAdServiceImpl.m79243a().mo67720a(4);
        }
    }

    static {
        Covode.recordClassIndex(40243);
    }

    /* renamed from: a */
    private static boolean m68481a(View view) {
        if (view == null || !C0792v.m2791y(view)) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    private static boolean m68483c(View view) {
        C89219l.m154721d(view, "");
        Rect rect = new Rect();
        if (!m68482b(view) || !view.getGlobalVisibleRect(rect) || rect.isEmpty()) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    private static boolean m68482b(View view) {
        C89219l.m154721d(view, "");
        if (!m68481a(view)) {
            return false;
        }
        while (view.getVisibility() == 0 && view.getAlpha() >= 1.0E-6f) {
            if (view.getId() == 16908290) {
                return true;
            }
            ViewParent parent = view.getParent();
            if (!(parent instanceof View)) {
                return true;
            }
            view = (View) parent;
        }
        return false;
    }

    /* renamed from: a */
    public static final void m68480a(View view, Runnable runnable) {
        AbstractC33253a a;
        C89219l.m154721d(view, "");
        if (runnable == null || !m68481a(view)) {
            return;
        }
        if (!m68483c(view) || C17873f.f42636l || (a = m68479a()) == null || !a.mo59212a(view.getContext())) {
            view.postDelayed(new RunnableC33396b(view, runnable), 100);
        } else {
            runnable.run();
        }
    }
}
