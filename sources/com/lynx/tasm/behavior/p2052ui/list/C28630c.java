package com.lynx.tasm.behavior.p2052ui.list;

import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.lynx.tasm.C28719c;
import com.lynx.tasm.base.LLog;
import com.lynx.tasm.behavior.p2052ui.view.UIComponent;
import com.lynx.tasm.p2054c.C28729g;
import com.lynx.tasm.utils.DisplayMetricsHolder;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: com.lynx.tasm.behavior.ui.list.c */
public final class C28630c implements AbstractC28636d {

    /* renamed from: a */
    private final C28719c f67395a;

    /* renamed from: b */
    private final Handler f67396b;

    /* renamed from: c */
    private final RunnableC28633a f67397c;

    /* renamed from: d */
    private final RecyclerView f67398d;

    /* renamed from: e */
    private final HashSet<C28634b> f67399e = new HashSet<>();

    /* renamed from: f */
    private final Rect f67400f;

    /* renamed from: g */
    private final int[] f67401g;

    /* renamed from: h */
    private final Rect f67402h;

    /* renamed from: i */
    private long f67403i;

    static {
        Covode.recordClassIndex(34689);
    }

    @Override // com.lynx.tasm.behavior.p2052ui.list.AbstractC28636d
    /* renamed from: a */
    public final void mo49559a(C28644h hVar) {
    }

    @Override // com.lynx.tasm.behavior.p2052ui.list.AbstractC28636d
    /* renamed from: b */
    public final void mo49560b(C28644h hVar) {
    }

    @Override // com.lynx.tasm.behavior.p2052ui.list.AbstractC28636d
    /* renamed from: c */
    public final void mo49561c(C28644h hVar) {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.lynx.tasm.behavior.ui.list.c$a */
    public class RunnableC28633a implements Runnable {
        static {
            Covode.recordClassIndex(34692);
        }

        public final void run() {
            C28630c.this.mo49566a(true);
        }

        private RunnableC28633a() {
        }

        /* synthetic */ RunnableC28633a(C28630c cVar, byte b) {
            this();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.lynx.tasm.behavior.ui.list.c$b */
    public class C28634b {

        /* renamed from: a */
        int f67407a;

        /* renamed from: b */
        int f67408b;

        /* renamed from: c */
        String f67409c;

        static {
            Covode.recordClassIndex(34693);
        }

        public final int hashCode() {
            return this.f67407a << (this.f67408b + 16);
        }

        public final boolean equals(Object obj) {
            if (obj == null) {
                return false;
            }
            if (this == obj) {
                return true;
            }
            if (obj instanceof C28634b) {
                C28634b bVar = (C28634b) obj;
                if (bVar.f67407a == this.f67407a && bVar.f67408b == this.f67408b && TextUtils.equals(bVar.f67409c, this.f67409c)) {
                    return true;
                }
                return false;
            }
            return false;
        }

        public C28634b(int i, int i2, String str) {
            this.f67407a = i;
            this.f67408b = i2;
            this.f67409c = str;
        }
    }

    @Override // com.lynx.tasm.behavior.p2052ui.list.AbstractC28636d
    /* renamed from: a */
    public final void mo49558a() {
        mo49566a(false);
    }

    /* renamed from: com.lynx.tasm.behavior.ui.list.c$c */
    class C28635c extends RecyclerView.AbstractC1371n {
        static {
            Covode.recordClassIndex(34694);
        }

        private C28635c() {
        }

        /* synthetic */ C28635c(C28630c cVar, byte b) {
            this();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1371n
        /* renamed from: a */
        public final void mo4753a(RecyclerView recyclerView, int i) {
            if (i == 0) {
                C28630c.this.mo49566a(true);
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1371n
        /* renamed from: a */
        public final void mo4754a(RecyclerView recyclerView, int i, int i2) {
            C28630c.this.mo49566a(false);
        }
    }

    /* renamed from: a */
    private boolean m57249a(View view) {
        this.f67402h.set(0, 0, view.getWidth(), view.getHeight());
        view.getLocationOnScreen(this.f67401g);
        Rect rect = this.f67402h;
        int[] iArr = this.f67401g;
        rect.offset(iArr[0], iArr[1]);
        return this.f67402h.intersect(this.f67400f);
    }

    /* renamed from: a */
    public final void mo49566a(boolean z) {
        long currentTimeMillis = System.currentTimeMillis();
        if (z || currentTimeMillis - this.f67403i >= 200) {
            this.f67403i = currentTimeMillis;
            this.f67396b.removeCallbacks(this.f67397c);
            long nanoTime = System.nanoTime();
            HashSet hashSet = new HashSet();
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < this.f67398d.getChildCount(); i++) {
                View childAt = this.f67398d.getChildAt(i);
                C28644h hVar = (C28644h) this.f67398d.mo4393a(childAt);
                UIComponent uIComponent = hVar.f67449a.f67451b;
                if (uIComponent != null && uIComponent.getEvents() != null && (uIComponent.getEvents().containsKey("nodeappear") || uIComponent.getEvents().containsKey("nodedisappear")) && m57249a(childAt)) {
                    C28634b bVar = new C28634b(hVar.f67449a.f67451b.getSign(), hVar.getLayoutPosition(), hVar.f67449a.f67451b.f67686a);
                    hashSet.add(bVar);
                    if (!this.f67399e.contains(bVar)) {
                        arrayList.add(bVar);
                    }
                }
            }
            this.f67399e.removeAll(hashSet);
            Iterator<C28634b> it = this.f67399e.iterator();
            while (it.hasNext()) {
                m57248a("nodedisappear", it.next());
            }
            this.f67399e.clear();
            this.f67399e.addAll(hashSet);
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                m57248a("nodeappear", (C28634b) it2.next());
            }
            if (UIList.f67360h) {
                LLog.m56860b("UIList", "onListContentChange time " + ((System.nanoTime() - nanoTime) / 1000) + " us");
            }
            if (!z) {
                this.f67396b.postDelayed(this.f67397c, 200);
            }
        }
    }

    public C28630c(C28719c cVar, RecyclerView recyclerView) {
        Rect rect = new Rect();
        this.f67400f = rect;
        this.f67401g = new int[2];
        this.f67402h = new Rect();
        this.f67403i = 0;
        DisplayMetrics a = DisplayMetricsHolder.m57912a(recyclerView.getContext());
        rect.set(0, 0, a.widthPixels, a.heightPixels);
        this.f67395a = cVar;
        this.f67396b = new Handler(Looper.getMainLooper());
        this.f67397c = new RunnableC28633a(this, (byte) 0);
        this.f67398d = recyclerView;
        recyclerView.mo4405a(new C28635c(this, (byte) 0));
        ViewTreeObserver viewTreeObserver = recyclerView.getViewTreeObserver();
        viewTreeObserver.addOnDrawListener(new ViewTreeObserver.OnDrawListener() {
            /* class com.lynx.tasm.behavior.p2052ui.list.C28630c.ViewTreeObserver$OnDrawListenerC286311 */

            static {
                Covode.recordClassIndex(34690);
            }

            public final void onDraw() {
                C28630c.this.mo49566a(false);
            }
        });
        viewTreeObserver.addOnScrollChangedListener(new ViewTreeObserver.OnScrollChangedListener() {
            /* class com.lynx.tasm.behavior.p2052ui.list.C28630c.ViewTreeObserver$OnScrollChangedListenerC286322 */

            static {
                Covode.recordClassIndex(34691);
            }

            public final void onScrollChanged() {
                C28630c.this.mo49566a(false);
            }
        });
    }

    /* renamed from: a */
    private void m57248a(String str, C28634b bVar) {
        if (UIList.f67360h) {
            LLog.m56860b("UIList", "sendNodeEvent " + str + "  " + bVar.f67408b + " " + bVar.f67409c);
        }
        C28729g a = C28729g.m57542a(bVar.f67407a, str);
        a.mo49838a("position", Integer.valueOf(bVar.f67408b));
        a.mo49838a("key", bVar.f67409c);
        this.f67395a.mo49834a(a);
    }
}
