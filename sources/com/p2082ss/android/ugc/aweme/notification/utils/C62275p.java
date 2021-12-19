package com.p2082ss.android.ugc.aweme.notification.utils;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.notification.utils.p */
public final class C62275p {

    /* renamed from: a */
    LinearLayoutManager f141338a;

    /* renamed from: b */
    int f141339b;

    /* renamed from: c */
    int f141340c = 6;

    /* renamed from: d */
    final Rect f141341d = new Rect();

    /* renamed from: e */
    final Rect f141342e = new Rect();

    /* renamed from: f */
    AbstractC62276a f141343f;

    /* renamed from: g */
    private RecyclerView f141344g;

    /* renamed from: com.ss.android.ugc.aweme.notification.utils.p$a */
    public interface AbstractC62276a {
        static {
            Covode.recordClassIndex(73050);
        }

        /* renamed from: a */
        void mo99852a(int i);
    }

    static {
        Covode.recordClassIndex(73049);
    }

    /* renamed from: a */
    private final void m112662a() {
        RecyclerView recyclerView = this.f141344g;
        if (recyclerView == null) {
            C89219l.m154710a("mRecyclerView");
        }
        recyclerView.mo4405a(new C62277b(this));
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.utils.p$b */
    public static final class C62277b extends RecyclerView.AbstractC1371n {

        /* renamed from: a */
        public boolean f141345a = true;

        /* renamed from: b */
        final /* synthetic */ C62275p f141346b;

        static {
            Covode.recordClassIndex(73051);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C62277b(C62275p pVar) {
            this.f141346b = pVar;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1371n
        /* renamed from: a */
        public final void mo4754a(RecyclerView recyclerView, int i, int i2) {
            boolean z;
            C89219l.m154721d(recyclerView, "");
            if (i2 < 0) {
                z = true;
            } else {
                z = false;
            }
            this.f141345a = z;
            C62275p pVar = this.f141346b;
            LinearLayoutManager linearLayoutManager = pVar.f141338a;
            if (linearLayoutManager == null) {
                C89219l.m154710a("mLinearLayoutManager");
            }
            int k = linearLayoutManager.mo4371k();
            LinearLayoutManager linearLayoutManager2 = pVar.f141338a;
            if (linearLayoutManager2 == null) {
                C89219l.m154710a("mLinearLayoutManager");
            }
            int m = linearLayoutManager2.mo4373m();
            if (!(k == -1 || m == -1)) {
                LinearLayoutManager linearLayoutManager3 = pVar.f141338a;
                if (linearLayoutManager3 == null) {
                    C89219l.m154710a("mLinearLayoutManager");
                }
                View c = linearLayoutManager3.mo4358c(k);
                LinearLayoutManager linearLayoutManager4 = pVar.f141338a;
                if (linearLayoutManager4 == null) {
                    C89219l.m154710a("mLinearLayoutManager");
                }
                View c2 = linearLayoutManager4.mo4358c(m);
                if (!(c == null || c2 == null)) {
                    c.getLocalVisibleRect(pVar.f141341d);
                    c2.getGlobalVisibleRect(pVar.f141342e);
                    if (z) {
                        if (pVar.f141339b > k) {
                            int i3 = pVar.f141339b;
                            for (int i4 = k; i4 < i3; i4++) {
                                AbstractC62276a aVar = pVar.f141343f;
                                if (aVar != null) {
                                    aVar.mo99852a(i4);
                                }
                            }
                            pVar.f141339b = k;
                        }
                        if (pVar.f141340c != m) {
                            pVar.f141340c = m;
                            return;
                        }
                    } else {
                        if (pVar.f141340c < m) {
                            int i5 = m + 1;
                            for (int i6 = pVar.f141340c + 1; i6 < i5; i6++) {
                                AbstractC62276a aVar2 = pVar.f141343f;
                                if (aVar2 != null) {
                                    aVar2.mo99852a(i6);
                                }
                            }
                            pVar.f141340c = m;
                        }
                        if (pVar.f141339b == k) {
                            pVar.f141340c = m;
                            return;
                        }
                    }
                    pVar.f141339b = k;
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo100266a(RecyclerView recyclerView, LinearLayoutManager linearLayoutManager, AbstractC62276a aVar) {
        C89219l.m154721d(recyclerView, "");
        C89219l.m154721d(linearLayoutManager, "");
        C89219l.m154721d(aVar, "");
        this.f141344g = recyclerView;
        this.f141338a = linearLayoutManager;
        this.f141343f = aVar;
        m112662a();
    }
}
