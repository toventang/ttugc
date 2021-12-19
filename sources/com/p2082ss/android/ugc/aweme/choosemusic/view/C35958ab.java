package com.p2082ss.android.ugc.aweme.choosemusic.view;

import android.os.Build;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.choosemusic.view.ab */
public final class C35958ab {

    /* renamed from: a */
    int f84878a;

    /* renamed from: b */
    int f84879b;

    /* renamed from: c */
    int f84880c;

    /* renamed from: d */
    public boolean f84881d = true;

    /* renamed from: e */
    private AbstractC35959a f84882e;

    /* renamed from: f */
    private int f84883f;

    /* renamed from: g */
    private int f84884g;

    /* renamed from: h */
    private boolean f84885h = true;

    /* renamed from: i */
    private int f84886i;

    /* renamed from: j */
    private int f84887j;

    /* renamed from: com.ss.android.ugc.aweme.choosemusic.view.ab$a */
    public interface AbstractC35959a {
        static {
            Covode.recordClassIndex(43205);
        }

        /* renamed from: a */
        void mo62829a();
    }

    static {
        Covode.recordClassIndex(43204);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.choosemusic.view.ab$b */
    public class View$OnScrollChangeListenerC35960b implements View.OnScrollChangeListener {
        static {
            Covode.recordClassIndex(43206);
        }

        private View$OnScrollChangeListenerC35960b() {
        }

        /* synthetic */ View$OnScrollChangeListenerC35960b(C35958ab abVar, byte b) {
            this();
        }

        public final void onScrollChange(View view, int i, int i2, int i3, int i4) {
            if (view instanceof RecyclerView) {
                C35958ab.this.mo63095b((RecyclerView) view);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.choosemusic.view.ab$c */
    public class C35961c extends RecyclerView.AbstractC1371n {
        static {
            Covode.recordClassIndex(43207);
        }

        private C35961c() {
        }

        /* synthetic */ C35961c(C35958ab abVar, byte b) {
            this();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1371n
        /* renamed from: a */
        public final void mo4754a(RecyclerView recyclerView, int i, int i2) {
            super.mo4754a(recyclerView, i, i2);
            C35958ab.this.mo63095b(recyclerView);
        }
    }

    /* renamed from: a */
    public final void mo63094a(RecyclerView recyclerView) {
        if (Build.VERSION.SDK_INT >= 23) {
            recyclerView.setOnScrollChangeListener(new View$OnScrollChangeListenerC35960b(this, (byte) 0));
        } else {
            recyclerView.setOnScrollListener(new C35961c(this, (byte) 0));
        }
    }

    /* renamed from: b */
    public final void mo63095b(RecyclerView recyclerView) {
        if (this.f84881d) {
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) recyclerView.getLayoutManager();
            this.f84879b = recyclerView.getChildCount();
            this.f84880c = linearLayoutManager.mo4685A();
            int k = linearLayoutManager.mo4371k();
            this.f84878a = k;
            int i = this.f84880c;
            if (i < this.f84884g) {
                this.f84887j = this.f84886i;
                this.f84884g = i;
                if (i == 0) {
                    this.f84885h = true;
                }
            }
            if (this.f84885h && i > this.f84884g) {
                this.f84885h = false;
                this.f84884g = i;
                this.f84887j++;
            }
            if (!this.f84885h && i - this.f84879b <= k + this.f84883f) {
                AbstractC35959a aVar = this.f84882e;
                if (aVar != null) {
                    aVar.mo62829a();
                }
                this.f84885h = true;
            }
        }
    }

    public C35958ab(AbstractC35959a aVar, int i) {
        this.f84882e = aVar;
        this.f84883f = i;
    }
}
