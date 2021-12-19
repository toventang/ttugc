package com.p2082ss.android.ugc.aweme.utils;

import android.graphics.Rect;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.utils.fo */
public final class C80440fo {

    /* renamed from: a */
    public boolean f180017a = true;

    /* renamed from: b */
    private final String f180018b = C80440fo.class.getSimpleName();

    /* renamed from: c */
    private final ArrayList<String> f180019c = new ArrayList<>();

    /* renamed from: d */
    private final RecyclerView f180020d;

    /* renamed from: e */
    private final AbstractC80442a f180021e;

    /* renamed from: com.ss.android.ugc.aweme.utils.fo$a */
    public interface AbstractC80442a {
        static {
            Covode.recordClassIndex(93710);
        }

        /* renamed from: a */
        void mo86642a(int i, C80440fo foVar);
    }

    static {
        Covode.recordClassIndex(93708);
    }

    /* renamed from: a */
    public final void mo123740a() {
        int[] iArr;
        if (this.f180020d.getVisibility() == 0 && this.f180020d.isShown() && this.f180020d.getGlobalVisibleRect(new Rect())) {
            try {
                RecyclerView.AbstractC1362i layoutManager = this.f180020d.getLayoutManager();
                if (layoutManager instanceof LinearLayoutManager) {
                    LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
                    iArr = new int[]{linearLayoutManager.mo4372l(), linearLayoutManager.mo4374n()};
                } else if (layoutManager instanceof GridLayoutManager) {
                    GridLayoutManager gridLayoutManager = (GridLayoutManager) layoutManager;
                    iArr = new int[]{gridLayoutManager.mo4372l(), gridLayoutManager.mo4374n()};
                } else {
                    return;
                }
                int i = iArr[0];
                int i2 = iArr[1];
                if (i <= i2) {
                    while (true) {
                        try {
                            AbstractC80442a aVar = this.f180021e;
                            if (aVar != null) {
                                aVar.mo86642a(i, this);
                            }
                        } catch (Throwable unused) {
                        }
                        if (i != i2) {
                            i++;
                        } else {
                            return;
                        }
                    }
                }
            } catch (Throwable unused2) {
            }
        }
    }

    /* renamed from: a */
    public final void mo123741a(String str, Runnable runnable) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(runnable, "");
        if (!this.f180019c.contains(str)) {
            this.f180019c.add(str);
            runnable.run();
        }
    }

    public C80440fo(RecyclerView recyclerView, AbstractC80442a aVar) {
        C89219l.m154721d(recyclerView, "");
        this.f180020d = recyclerView;
        this.f180021e = aVar;
        recyclerView.mo4405a(new RecyclerView.AbstractC1371n(this) {
            /* class com.p2082ss.android.ugc.aweme.utils.C80440fo.C804411 */

            /* renamed from: a */
            final /* synthetic */ C80440fo f180022a;

            static {
                Covode.recordClassIndex(93709);
            }

            /* JADX WARN: Incorrect args count in method signature: ()V */
            {
                this.f180022a = r1;
            }

            @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1371n
            /* renamed from: a */
            public final void mo4753a(RecyclerView recyclerView, int i) {
                C89219l.m154721d(recyclerView, "");
                if (i == 0) {
                    this.f180022a.mo123740a();
                }
            }

            @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1371n
            /* renamed from: a */
            public final void mo4754a(RecyclerView recyclerView, int i, int i2) {
                C89219l.m154721d(recyclerView, "");
                if (this.f180022a.f180017a) {
                    this.f180022a.f180017a = false;
                    this.f180022a.mo123740a();
                }
            }
        });
    }
}
