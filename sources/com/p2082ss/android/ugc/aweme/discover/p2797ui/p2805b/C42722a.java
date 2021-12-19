package com.p2082ss.android.ugc.aweme.discover.p2797ui.p2805b;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.p060l.AbstractC1134m;
import androidx.p060l.C1124l;
import androidx.p060l.C1141n;
import androidx.p060l.C1142o;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.bytedance.common.utility.collection.C13603b;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.discover.model.GuideSearchWord;
import com.p2082ss.android.ugc.aweme.discover.p2767c.C41893a;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.discover.ui.b.a */
public final class C42722a extends RecyclerView.AbstractC1371n {

    /* renamed from: a */
    public boolean f99660a;

    /* renamed from: b */
    private boolean f99661b;

    /* renamed from: c */
    private final C42724b f99662c;

    static {
        Covode.recordClassIndex(50826);
    }

    /* renamed from: a */
    private final void m85374a() {
        this.f99662c.setVisibility(8);
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.b.a$a */
    public static final class C42723a extends C1141n {

        /* renamed from: a */
        final /* synthetic */ C42722a f99663a;

        static {
            Covode.recordClassIndex(50827);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C42723a(C42722a aVar) {
            this.f99663a = aVar;
        }

        @Override // androidx.p060l.AbstractC1134m.AbstractC1140c, androidx.p060l.C1141n
        /* renamed from: a */
        public final void mo3865a(AbstractC1134m mVar) {
            C89219l.m154721d(mVar, "");
            this.f99663a.f99660a = false;
        }

        @Override // androidx.p060l.AbstractC1134m.AbstractC1140c, androidx.p060l.C1141n
        /* renamed from: d */
        public final void mo3868d(AbstractC1134m mVar) {
            C89219l.m154721d(mVar, "");
            this.f99663a.f99660a = true;
        }
    }

    public C42722a(C42724b bVar) {
        C89219l.m154721d(bVar, "");
        this.f99662c = bVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1371n
    /* renamed from: a */
    public final void mo4754a(RecyclerView recyclerView, int i, int i2) {
        boolean z;
        C89219l.m154721d(recyclerView, "");
        super.mo4754a(recyclerView, i, i2);
        if (this.f99661b && i2 != 0) {
            RecyclerView.AbstractC1350a adapter = recyclerView.getAdapter();
            if (!(adapter instanceof C41893a)) {
                adapter = null;
            }
            C41893a aVar = (C41893a) adapter;
            if (aVar != null) {
                List<View> a = aVar.mo71052a();
                int size = a.size();
                int i3 = 0;
                int i4 = 0;
                while (true) {
                    if (i4 >= size) {
                        break;
                    } else if (a.get(i4) instanceof C42724b) {
                        Objects.requireNonNull(a.get(i4), "null cannot be cast to non-null type com.ss.android.ugc.aweme.discover.ui.guide.GuideSearchHeadView");
                        break;
                    } else {
                        i4++;
                    }
                }
                RecyclerView.AbstractC1362i layoutManager = recyclerView.getLayoutManager();
                if (layoutManager instanceof LinearLayoutManager) {
                    ((LinearLayoutManager) layoutManager).mo4371k();
                } else if (layoutManager instanceof StaggeredGridLayoutManager) {
                    StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) layoutManager;
                    staggeredGridLayoutManager.mo4790a(new int[staggeredGridLayoutManager.f4556a]);
                }
                if (i2 > 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (!this.f99660a) {
                    C1124l lVar = new C1124l();
                    lVar.mo3908a(new C42723a(this));
                    lVar.mo3903a(48);
                    lVar.mo3906a(300L);
                    ViewParent parent = this.f99662c.getParent();
                    Objects.requireNonNull(parent, "null cannot be cast to non-null type android.view.ViewGroup");
                    C1142o.m3795a((ViewGroup) parent, lVar);
                    C42724b bVar = this.f99662c;
                    if (z) {
                        i3 = 8;
                    }
                    bVar.setVisibility(i3);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo72990a(List<GuideSearchWord> list, String str, String str2, String str3) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C89219l.m154721d(str3, "");
        boolean z = !C13603b.m24435a((Collection) list);
        this.f99661b = z;
        if (!z) {
            m85374a();
            return;
        }
        C42724b bVar = this.f99662c;
        if (list == null) {
            C89219l.m154715b();
        }
        bVar.mo72993a(list, str, str2, str3);
    }
}
