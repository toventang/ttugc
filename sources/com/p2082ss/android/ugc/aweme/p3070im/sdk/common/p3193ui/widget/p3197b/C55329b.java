package com.p2082ss.android.ugc.aweme.p3070im.sdk.common.p3193ui.widget.p3197b;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.common.ui.widget.b.b */
public final class C55329b {

    /* renamed from: a */
    final int f126515a;

    /* renamed from: b */
    int f126516b;

    /* renamed from: c */
    public int f126517c;

    /* renamed from: d */
    public int f126518d;

    /* renamed from: e */
    public boolean f126519e;

    /* renamed from: f */
    public final Handler f126520f;

    /* renamed from: g */
    public final View f126521g;

    /* renamed from: h */
    final View f126522h;

    /* renamed from: i */
    public final ViewGroup f126523i;

    /* renamed from: j */
    public final AbstractC55336d f126524j;

    /* renamed from: k */
    public long f126525k;

    /* renamed from: l */
    public boolean f126526l;

    /* renamed from: m */
    public View f126527m;

    /* renamed from: n */
    public C55328a f126528n;

    /* renamed from: o */
    public boolean f126529o;

    /* renamed from: p */
    public boolean f126530p;

    /* renamed from: q */
    public Runnable f126531q;

    /* renamed from: r */
    public ViewGroup.OnHierarchyChangeListener f126532r;

    /* renamed from: s */
    private Runnable f126533s;

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.common.ui.widget.b.b$a */
    public static class C55334a {

        /* renamed from: a */
        public int f126538a;

        /* renamed from: b */
        public int f126539b;

        /* renamed from: c */
        public int f126540c;

        /* renamed from: d */
        public int f126541d;

        /* renamed from: e */
        public View f126542e;

        /* renamed from: f */
        public View f126543f;

        /* renamed from: g */
        public ViewGroup f126544g;

        /* renamed from: h */
        public AbstractC55336d f126545h;

        /* renamed from: i */
        public long f126546i = -1;

        /* renamed from: j */
        public boolean f126547j;

        /* renamed from: k */
        public C55328a f126548k;

        static {
            Covode.recordClassIndex(65099);
        }
    }

    static {
        Covode.recordClassIndex(65094);
    }

    /* renamed from: a */
    public final void mo92396a(long j) {
        if (j < 0) {
            j = 0;
        }
        this.f126520f.postDelayed(this.f126533s, j);
    }

    private C55329b(View view, View view2, View view3, AbstractC55336d dVar, int i, int i2, int i3, int i4) {
        String str;
        this.f126531q = new Runnable() {
            /* class com.p2082ss.android.ugc.aweme.p3070im.sdk.common.p3193ui.widget.p3197b.C55329b.RunnableC553301 */

            static {
                Covode.recordClassIndex(65095);
            }

            /* JADX WARNING: Removed duplicated region for block: B:118:0x022a  */
            /* JADX WARNING: Removed duplicated region for block: B:119:0x0232  */
            /* JADX WARNING: Removed duplicated region for block: B:130:0x0258  */
            /* JADX WARNING: Removed duplicated region for block: B:42:0x00bb  */
            /* JADX WARNING: Removed duplicated region for block: B:45:0x00c2  */
            /* JADX WARNING: Removed duplicated region for block: B:53:0x00e8 A[ADDED_TO_REGION] */
            /* JADX WARNING: Removed duplicated region for block: B:61:0x0100  */
            /* JADX WARNING: Removed duplicated region for block: B:69:0x0111  */
            /* JADX WARNING: Removed duplicated region for block: B:71:0x0115  */
            /* JADX WARNING: Removed duplicated region for block: B:74:0x012c  */
            /* JADX WARNING: Removed duplicated region for block: B:77:0x0144  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void run() {
                /*
                // Method dump skipped, instructions count: 674
                */
                throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.p3070im.sdk.common.p3193ui.widget.p3197b.C55329b.RunnableC553301.run():void");
            }
        };
        this.f126533s = new Runnable() {
            /* class com.p2082ss.android.ugc.aweme.p3070im.sdk.common.p3193ui.widget.p3197b.C55329b.RunnableC553312 */

            static {
                Covode.recordClassIndex(65096);
            }

            public final void run() {
                MethodCollector.m26663i(2952);
                if (C55329b.this.f126530p) {
                    MethodCollector.m26664o(2952);
                    return;
                }
                if (C55329b.this.f126519e) {
                    C55329b.this.f126524j.mo92402a(C55329b.this.f126523i, C55329b.this);
                    if (C55329b.this.f126526l) {
                        C55329b.this.f126523i.removeView(C55329b.this.f126527m);
                    }
                    C55329b.this.f126519e = false;
                    C55329b.this.f126529o = false;
                }
                MethodCollector.m26664o(2952);
            }
        };
        this.f126532r = new ViewGroup.OnHierarchyChangeListener() {
            /* class com.p2082ss.android.ugc.aweme.p3070im.sdk.common.p3193ui.widget.p3197b.C55329b.ViewGroup$OnHierarchyChangeListenerC553323 */

            static {
                Covode.recordClassIndex(65097);
            }

            public final void onChildViewAdded(View view, View view2) {
            }

            public final void onChildViewRemoved(View view, View view2) {
                if (view == C55329b.this.f126523i && view2 == C55329b.this.f126521g) {
                    C55329b.this.f126523i.setOnHierarchyChangeListener(null);
                    C55329b.this.f126529o = false;
                }
            }
        };
        this.f126521g = view;
        this.f126522h = view2;
        this.f126524j = dVar == null ? C55335c.f126549a : dVar;
        if (view2 != null) {
            view3 = view3 == null ? view2.getRootView() : view3;
            if ((view3 instanceof FrameLayout) || (view3 instanceof RelativeLayout)) {
                this.f126523i = (ViewGroup) view3;
                this.f126525k = -1;
                this.f126515a = i;
                this.f126516b = i2;
                this.f126517c = i3;
                this.f126518d = i4;
                this.f126519e = false;
                this.f126526l = false;
                this.f126529o = false;
                this.f126530p = false;
                this.f126520f = new Handler(Looper.getMainLooper());
                return;
            }
            str = "canvasView is not a FrameLayout nor a RelativeLayout!!";
        } else {
            str = "anchorView is null!!";
        }
        throw new RuntimeException("Invalid bubble args : ".concat(str));
    }

    public /* synthetic */ C55329b(View view, View view2, View view3, AbstractC55336d dVar, int i, int i2, int i3, int i4, byte b) {
        this(view, view2, view3, dVar, i, i2, i3, i4);
    }
}
