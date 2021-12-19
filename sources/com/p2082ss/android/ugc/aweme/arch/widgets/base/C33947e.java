package com.p2082ss.android.ugc.aweme.arch.widgets.base;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.AbstractC0952i;
import androidx.fragment.app.ActivityC0945e;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import androidx.p022b.p023a.C0464a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.arch.widgets.base.Widget;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.ss.android.ugc.aweme.arch.widgets.base.e */
public class C33947e extends Fragment {

    /* renamed from: d */
    private static final String f80288d = C33947e.class.getCanonicalName();

    /* renamed from: a */
    public Fragment f80289a;

    /* renamed from: b */
    public DataCenter f80290b;

    /* renamed from: c */
    AbstractC0952i.AbstractC0954b f80291c = new AbstractC0952i.AbstractC0954b() {
        /* class com.p2082ss.android.ugc.aweme.arch.widgets.base.C33947e.C339492 */

        static {
            Covode.recordClassIndex(40874);
        }

        @Override // androidx.fragment.app.AbstractC0952i.AbstractC0954b
        public final void onFragmentViewDestroyed(AbstractC0952i iVar, Fragment fragment) {
            if (fragment == C33947e.this.f80289a) {
                iVar.mo3554a(C33947e.this.f80291c);
                fragment.getChildFragmentManager().mo3552a().mo3455a(C33947e.this).mo3478e();
            }
        }
    };

    /* renamed from: e */
    private Thread f80292e;

    /* renamed from: f */
    private Handler f80293f = new Handler(Looper.getMainLooper());

    /* renamed from: g */
    private Widget.AbstractC33940a f80294g = new Widget.AbstractC33940a() {
        /* class com.p2082ss.android.ugc.aweme.arch.widgets.base.C33947e.C339481 */

        static {
            Covode.recordClassIndex(40873);
        }

        @Override // com.p2082ss.android.ugc.aweme.arch.widgets.base.Widget.AbstractC33940a
        /* renamed from: a */
        public final AbstractC1204m mo60209a() {
            return C33947e.this;
        }

        @Override // com.p2082ss.android.ugc.aweme.arch.widgets.base.Widget.AbstractC33940a
        /* renamed from: b */
        public final Activity mo60211b() {
            return C33947e.this.getActivity();
        }

        @Override // com.p2082ss.android.ugc.aweme.arch.widgets.base.Widget.AbstractC33940a
        /* renamed from: a */
        public final void mo60210a(Intent intent, int i) {
            C33947e.this.startActivityForResult(intent, i);
        }
    };

    /* renamed from: h */
    private View f80295h;

    /* renamed from: i */
    private Context f80296i;

    /* renamed from: j */
    private C0464a f80297j;

    /* renamed from: k */
    private LayoutInflater f80298k;

    /* renamed from: l */
    private List<Widget> f80299l = new CopyOnWriteArrayList();

    static {
        Covode.recordClassIndex(40872);
    }

    /* renamed from: a */
    private boolean m69518a() {
        if (this.f80292e == null) {
            this.f80292e = Looper.getMainLooper().getThread();
        }
        if (Thread.currentThread() == this.f80292e) {
            return true;
        }
        return false;
    }

    /* renamed from: com.ss.android.ugc.aweme.arch.widgets.base.e$5 */
    static /* synthetic */ class C339525 {

        /* renamed from: a */
        static final /* synthetic */ int[] f80307a;

        /* JADX WARNING: Can't wrap try/catch for region: R(10:0|1|2|3|4|5|6|7|8|(3:9|10|12)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0018 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0023 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0039 */
        static {
            /*
                r0 = 40877(0x9fad, float:5.7281E-41)
                com.bytedance.covode.number.Covode.recordClassIndex(r0)
                androidx.lifecycle.i$b[] r0 = androidx.lifecycle.AbstractC1196i.EnumC1199b.values()
                int r0 = r0.length
                int[] r2 = new int[r0]
                com.p2082ss.android.ugc.aweme.arch.widgets.base.C33947e.C339525.f80307a = r2
                androidx.lifecycle.i$b r0 = androidx.lifecycle.AbstractC1196i.EnumC1199b.INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0018 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0018 }
                r0 = 1
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0018 }
            L_0x0018:
                int[] r2 = com.p2082ss.android.ugc.aweme.arch.widgets.base.C33947e.C339525.f80307a     // Catch:{ NoSuchFieldError -> 0x0023 }
                androidx.lifecycle.i$b r0 = androidx.lifecycle.AbstractC1196i.EnumC1199b.CREATED     // Catch:{ NoSuchFieldError -> 0x0023 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0023 }
                r0 = 2
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0023 }
            L_0x0023:
                int[] r2 = com.p2082ss.android.ugc.aweme.arch.widgets.base.C33947e.C339525.f80307a     // Catch:{ NoSuchFieldError -> 0x002e }
                androidx.lifecycle.i$b r0 = androidx.lifecycle.AbstractC1196i.EnumC1199b.STARTED     // Catch:{ NoSuchFieldError -> 0x002e }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x002e }
                r0 = 3
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x002e }
            L_0x002e:
                int[] r2 = com.p2082ss.android.ugc.aweme.arch.widgets.base.C33947e.C339525.f80307a     // Catch:{ NoSuchFieldError -> 0x0039 }
                androidx.lifecycle.i$b r0 = androidx.lifecycle.AbstractC1196i.EnumC1199b.RESUMED     // Catch:{ NoSuchFieldError -> 0x0039 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0039 }
                r0 = 4
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0039 }
            L_0x0039:
                int[] r2 = com.p2082ss.android.ugc.aweme.arch.widgets.base.C33947e.C339525.f80307a     // Catch:{ NoSuchFieldError -> 0x0044 }
                androidx.lifecycle.i$b r0 = androidx.lifecycle.AbstractC1196i.EnumC1199b.DESTROYED     // Catch:{ NoSuchFieldError -> 0x0044 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0044 }
                r0 = 5
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0044 }
            L_0x0044:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.arch.widgets.base.C33947e.C339525.<clinit>():void");
        }
    }

    /* renamed from: b */
    public final C33947e mo60222b(Widget widget) {
        MethodCollector.m26663i(3750);
        if (widget == null) {
            MethodCollector.m26664o(3750);
            return this;
        }
        getLifecycle().mo4013b(widget);
        int i = C339525.f80307a[getLifecycle().mo4011a().ordinal()];
        if (i == 2) {
            widget.onDestroy();
        } else if (i == 3) {
            widget.onStop();
            widget.onDestroy();
        } else if (i == 4) {
            widget.onPause();
            widget.onStop();
            widget.onDestroy();
        }
        widget.f80274f = null;
        widget.f80273e = null;
        this.f80299l.remove(widget);
        if (widget.f80271c != widget.f80272d && (widget.f80271c instanceof ViewGroup)) {
            ((ViewGroup) widget.f80271c).removeAllViews();
        }
        MethodCollector.m26664o(3750);
        return this;
    }

    /* renamed from: a */
    public final C33947e mo60218a(DataCenter dataCenter) {
        this.f80290b = dataCenter;
        for (Widget widget : this.f80299l) {
            widget.f80273e = dataCenter;
        }
        return this;
    }

    /* renamed from: a */
    public final C33947e mo60219a(Widget widget) {
        if (widget == null) {
            return this;
        }
        widget.f80274f = this.f80294g;
        widget.f80270b = this.f80296i;
        widget.f80273e = this.f80290b;
        this.f80299l.add(widget);
        getLifecycle().mo4012a(widget);
        return this;
    }

    /* renamed from: a */
    public static C33947e m69516a(Fragment fragment, View view) {
        return m69517a(null, fragment, view, fragment.getContext());
    }

    /* renamed from: b */
    public final C33947e mo60221b(int i, Widget widget) {
        if (widget == null) {
            return this;
        }
        return mo60217a(this.f80295h.findViewById(i), widget);
    }

    /* renamed from: a */
    public final C33947e mo60216a(int i, final Widget widget) {
        if (widget == null) {
            return this;
        }
        widget.f80274f = this.f80294g;
        widget.f80270b = this.f80296i;
        widget.f80273e = this.f80290b;
        final ViewGroup viewGroup = (ViewGroup) this.f80295h.findViewById(i);
        widget.f80271c = viewGroup;
        if (widget.mo60207c() == 0) {
            mo60220a(widget, viewGroup, null);
            return this;
        }
        this.f80297j.mo2025a(widget.mo60207c(), viewGroup, new C0464a.AbstractC0469d() {
            /* class com.p2082ss.android.ugc.aweme.arch.widgets.base.C33947e.C339503 */

            static {
                Covode.recordClassIndex(40875);
            }

            @Override // androidx.p022b.p023a.C0464a.AbstractC0469d
            public final void onInflateFinished(View view, int i, ViewGroup viewGroup) {
                if (!C33947e.this.isRemoving() && !C33947e.this.isDetached() && C33947e.this.getLifecycle().mo4011a() != AbstractC1196i.EnumC1199b.DESTROYED) {
                    C33947e.this.mo60220a(widget, viewGroup, view);
                }
            }
        });
        return this;
    }

    /* renamed from: a */
    public final C33947e mo60217a(View view, final Widget widget) {
        if (widget == null) {
            return this;
        }
        widget.f80274f = this.f80294g;
        widget.f80270b = this.f80296i;
        widget.f80273e = this.f80290b;
        widget.f80272d = view;
        this.f80299l.add(widget);
        if (!m69518a()) {
            this.f80293f.post(new Runnable() {
                /* class com.p2082ss.android.ugc.aweme.arch.widgets.base.C33947e.RunnableC339514 */

                static {
                    Covode.recordClassIndex(40876);
                }

                public final void run() {
                    C33947e.this.getLifecycle().mo4012a(widget);
                }
            });
            return this;
        }
        getLifecycle().mo4012a(widget);
        return this;
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        for (Widget widget : this.f80299l) {
            widget.mo60204a(i, i2, intent);
        }
    }

    /* renamed from: a */
    public final void mo60220a(Widget widget, View view, View view2) {
        MethodCollector.m26663i(3645);
        widget.f80272d = view2;
        if ((view instanceof ViewGroup) && view2 != null) {
            ((ViewGroup) view).addView(view2);
        }
        this.f80299l.add(widget);
        getLifecycle().mo4012a(widget);
        MethodCollector.m26664o(3645);
    }

    /* renamed from: a */
    public static C33947e m69517a(ActivityC0945e eVar, Fragment fragment, View view, Context context) {
        AbstractC0952i childFragmentManager;
        if (eVar != null) {
            childFragmentManager = eVar.getSupportFragmentManager();
        } else if (fragment == null) {
            return null;
        } else {
            childFragmentManager = fragment.getChildFragmentManager();
        }
        C33947e eVar2 = new C33947e();
        eVar2.f80289a = fragment;
        eVar2.f80295h = view;
        eVar2.f80296i = context;
        eVar2.f80297j = new C0464a(eVar2.f80296i);
        eVar2.f80298k = LayoutInflater.from(eVar2.f80296i);
        if (!(fragment == null || fragment.getFragmentManager() == null)) {
            fragment.getFragmentManager().mo3555a(eVar2.f80291c, false);
        }
        childFragmentManager.mo3552a().mo3456a(eVar2, f80288d).mo3478e();
        return eVar2;
    }
}
