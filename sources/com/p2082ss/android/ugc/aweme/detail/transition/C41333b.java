package com.p2082ss.android.ugc.aweme.detail.transition;

import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import androidx.core.app.C0576b;
import androidx.core.p036g.C0692e;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.C16048b;
import com.bytedance.ies.abmock.SettingsManager;
import java.util.ArrayList;
import java.util.Arrays;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.detail.transition.b */
public final class C41333b {

    /* renamed from: a */
    public static boolean f96464a;

    /* renamed from: b */
    public static final C41333b f96465b = new C41333b();

    /* renamed from: com.ss.android.ugc.aweme.detail.transition.b$a */
    public static final class C41334a {

        /* renamed from: a */
        static boolean f96466a;

        /* renamed from: b */
        public static final C41334a f96467b = new C41334a();

        /* renamed from: c */
        private static final boolean f96468c = true;

        private C41334a() {
        }

        static {
            Covode.recordClassIndex(49223);
            boolean z = true;
            if (!C16048b.m29633a().mo25421a(true, "feed_detail_transition_enable", false)) {
                z = false;
            }
            f96466a = z;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.detail.transition.b$b */
    public static final class C41335b {

        /* renamed from: a */
        public static final boolean f96469a = SettingsManager.m29616a().mo25400a("feed_detail_transition_local_enable", true);

        /* renamed from: b */
        public static final C41335b f96470b = new C41335b();

        private C41335b() {
        }

        static {
            Covode.recordClassIndex(49224);
        }
    }

    private C41333b() {
    }

    static {
        boolean z;
        Covode.recordClassIndex(49222);
        if (Build.VERSION.SDK_INT < 21 || !C41335b.f96469a || !C41334a.f96466a) {
            z = false;
        } else {
            z = true;
        }
        f96464a = z;
    }

    /* renamed from: a */
    public static final void m83193a(Activity activity) {
        C89219l.m154721d(activity, "");
        if (f96464a) {
            activity.getWindow().requestFeature(12);
        }
    }

    /* renamed from: a */
    public static final void m83194a(Activity activity, boolean z) {
        C89219l.m154721d(activity, "");
        if (f96464a) {
            Window window = activity.getWindow();
            C89219l.m154716b(window, "");
            window.setSharedElementsUseOverlay(z);
        }
    }

    /* renamed from: a */
    public static Bundle m83192a(Activity activity, View[] viewArr) {
        C89219l.m154721d(viewArr, "");
        if (!f96464a || activity == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (View view : viewArr) {
            arrayList.add(C0692e.m2449a(view, view != null ? view.getTransitionName() : null));
        }
        int size = arrayList.size();
        C0692e[] eVarArr = new C0692e[size];
        arrayList.toArray(eVarArr);
        C0576b a = C0576b.m2190a(activity, (C0692e[]) Arrays.copyOf(eVarArr, size));
        C89219l.m154716b(a, "");
        return a.mo2564a();
    }
}
