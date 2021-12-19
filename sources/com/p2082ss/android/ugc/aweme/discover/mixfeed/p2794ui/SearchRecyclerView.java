package com.p2082ss.android.ugc.aweme.discover.mixfeed.p2794ui;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.common.widget.NestedScrollingRecyclerView;
import com.p2082ss.android.ugc.aweme.search.p3696l.C67609b;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: com.ss.android.ugc.aweme.discover.mixfeed.ui.SearchRecyclerView */
public class SearchRecyclerView extends NestedScrollingRecyclerView {

    /* renamed from: O */
    public boolean f98911O = true;

    /* renamed from: P */
    public boolean f98912P;

    /* renamed from: Q */
    public final Lock f98913Q = new ReentrantLock();

    /* renamed from: R */
    public final C67609b<AbstractC42440a> f98914R = new C67609b<>();

    /* renamed from: com.ss.android.ugc.aweme.discover.mixfeed.ui.SearchRecyclerView$a */
    public interface AbstractC42440a {
        static {
            Covode.recordClassIndex(50387);
        }

        /* renamed from: a */
        void mo71645a();
    }

    static {
        Covode.recordClassIndex(50386);
    }

    /* renamed from: q */
    public final void mo5599q() {
        this.f98911O = true;
        invalidate();
        m84822r();
    }

    /* renamed from: r */
    private void m84822r() {
        C67609b.C67610a<AbstractC42440a> b = this.f98914R.mo106613b();
        try {
            int i = b.f151488b;
            for (int i2 = 0; i2 < i; i2++) {
                b.mo106615a(i2).mo71645a();
            }
        } finally {
            this.f98914R.mo106614c();
        }
    }

    /* renamed from: a */
    public final void mo71644a(AbstractC42440a aVar) {
        if (!this.f98912P || this.f98911O) {
            this.f98914R.mo106612a().add(aVar);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void draw(Canvas canvas) {
        if (this.f98911O) {
            super.draw(canvas);
            return;
        }
        try {
            if (this.f98913Q.tryLock(1000, TimeUnit.MILLISECONDS)) {
                this.f98913Q.unlock();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public SearchRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
