package com.p2082ss.android.ugc.aweme.tools.music.p4125d.p4127b;

import android.os.SystemClock;
import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.tools.music.d.b.b */
public final class C78764b {

    /* renamed from: a */
    public static final C78764b f177017a = new C78764b();

    /* renamed from: com.ss.android.ugc.aweme.tools.music.d.b.b$a */
    public static final class C78765a extends RecyclerView.AbstractC1371n {
        static {
            Covode.recordClassIndex(91908);
        }

        C78765a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1371n
        /* renamed from: a */
        public final void mo4753a(RecyclerView recyclerView, int i) {
            C89219l.m154721d(recyclerView, "");
            super.mo4753a(recyclerView, i);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1371n
        /* renamed from: a */
        public final void mo4754a(RecyclerView recyclerView, int i, int i2) {
            C89219l.m154721d(recyclerView, "");
            super.mo4754a(recyclerView, i, i2);
            if (!recyclerView.canScrollVertically(1)) {
                recyclerView.dispatchTouchEvent(MotionEvent.obtain(SystemClock.uptimeMillis(), SystemClock.uptimeMillis(), 3, 0.0f, 0.0f, 0));
            }
        }
    }

    private C78764b() {
    }

    static {
        Covode.recordClassIndex(91907);
    }

    /* renamed from: a */
    public static void m137502a(RecyclerView recyclerView) {
        C89219l.m154721d(recyclerView, "");
        recyclerView.mo4405a(new C78765a());
    }
}
