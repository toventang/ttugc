package com.p2082ss.android.ugc.aweme.kids.choosemusic.p3326h;

import android.os.Build;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.kids.choosemusic.h.q */
public final class C57293q {

    /* renamed from: a */
    int f130518a;

    /* renamed from: b */
    int f130519b;

    /* renamed from: c */
    int f130520c;

    /* renamed from: d */
    public boolean f130521d = true;

    /* renamed from: e */
    private AbstractC57294a f130522e;

    /* renamed from: f */
    private int f130523f;

    /* renamed from: g */
    private int f130524g;

    /* renamed from: h */
    private boolean f130525h = true;

    /* renamed from: i */
    private int f130526i;

    /* renamed from: j */
    private int f130527j;

    /* renamed from: com.ss.android.ugc.aweme.kids.choosemusic.h.q$a */
    public interface AbstractC57294a {
        static {
            Covode.recordClassIndex(67199);
        }

        /* renamed from: a */
        void mo94413a();
    }

    static {
        Covode.recordClassIndex(67198);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.kids.choosemusic.h.q$b */
    public class View$OnScrollChangeListenerC57295b implements View.OnScrollChangeListener {
        static {
            Covode.recordClassIndex(67200);
        }

        private View$OnScrollChangeListenerC57295b() {
        }

        /* synthetic */ View$OnScrollChangeListenerC57295b(C57293q qVar, byte b) {
            this();
        }

        public final void onScrollChange(View view, int i, int i2, int i3, int i4) {
            if (view instanceof RecyclerView) {
                C57293q.this.mo94497b((RecyclerView) view);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.kids.choosemusic.h.q$c */
    public class C57296c extends RecyclerView.AbstractC1371n {
        static {
            Covode.recordClassIndex(67201);
        }

        private C57296c() {
        }

        /* synthetic */ C57296c(C57293q qVar, byte b) {
            this();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1371n
        /* renamed from: a */
        public final void mo4754a(RecyclerView recyclerView, int i, int i2) {
            super.mo4754a(recyclerView, i, i2);
            C57293q.this.mo94497b(recyclerView);
        }
    }

    /* renamed from: a */
    public final void mo94496a(RecyclerView recyclerView) {
        if (Build.VERSION.SDK_INT >= 23) {
            recyclerView.setOnScrollChangeListener(new View$OnScrollChangeListenerC57295b(this, (byte) 0));
        } else {
            recyclerView.setOnScrollListener(new C57296c(this, (byte) 0));
        }
    }

    /* renamed from: b */
    public final void mo94497b(RecyclerView recyclerView) {
        if (this.f130521d) {
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) recyclerView.getLayoutManager();
            this.f130519b = recyclerView.getChildCount();
            this.f130520c = linearLayoutManager.mo4685A();
            int k = linearLayoutManager.mo4371k();
            this.f130518a = k;
            int i = this.f130520c;
            if (i < this.f130524g) {
                this.f130527j = this.f130526i;
                this.f130524g = i;
                if (i == 0) {
                    this.f130525h = true;
                }
            }
            if (this.f130525h && i > this.f130524g) {
                this.f130525h = false;
                this.f130524g = i;
                this.f130527j++;
            }
            if (!this.f130525h && i - this.f130519b <= k + this.f130523f) {
                AbstractC57294a aVar = this.f130522e;
                if (aVar != null) {
                    aVar.mo94413a();
                }
                this.f130525h = true;
            }
        }
    }

    public C57293q(AbstractC57294a aVar, int i) {
        this.f130522e = aVar;
        this.f130523f = i;
    }
}
