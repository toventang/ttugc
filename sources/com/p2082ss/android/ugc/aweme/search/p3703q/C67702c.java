package com.p2082ss.android.ugc.aweme.search.p3703q;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.android.livesdk.utils.C11279p;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.discover.alading.C41827d;
import com.p2082ss.android.ugc.aweme.discover.mixfeed.p2789b.C42314a;
import com.p2082ss.android.ugc.aweme.discover.model.SearchUser;
import com.p2082ss.android.ugc.aweme.discover.p2760a.C41556z;
import com.p2082ss.android.ugc.aweme.p2817e.AbstractC43302a;
import com.p2082ss.android.ugc.aweme.p2817e.AbstractC43303b;
import com.p2082ss.android.ugc.aweme.search.C67347b;
import com.p2082ss.android.ugc.aweme.search.p3695k.C67568r;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.search.q.c */
public final class C67702c implements AbstractC43302a, AbstractC43303b {

    /* renamed from: a */
    public LinearLayout f151757a;

    /* renamed from: b */
    private View f151758b;

    /* renamed from: c */
    private C41827d f151759c;

    /* renamed from: d */
    private AbstractC43303b f151760d;

    /* renamed from: e */
    private C67697a f151761e;

    /* renamed from: f */
    private SearchUser f151762f;

    /* renamed from: g */
    private C42314a f151763g;

    /* renamed from: h */
    private C67568r f151764h;

    /* renamed from: i */
    private final ViewStub f151765i;

    /* renamed from: j */
    private final ViewGroup f151766j;

    static {
        Covode.recordClassIndex(79347);
    }

    public C67702c() {
        this(null, null, 3);
    }

    @Override // com.p2082ss.android.ugc.aweme.p2817e.AbstractC43303b
    public final void aV_() {
    }

    /* renamed from: b */
    public final void mo106807b() {
        if (this.f151757a != null) {
            LinearLayout linearLayout = this.f151757a;
            if (linearLayout == null) {
                C89219l.m154710a("rootView");
            }
            C11279p.m20017b(linearLayout);
        }
    }

    /* renamed from: d */
    private final void m119859d() {
        if (this.f151759c == null) {
            LinearLayout linearLayout = this.f151757a;
            if (linearLayout == null) {
                C89219l.m154710a("rootView");
            }
            this.f151759c = new C41827d(linearLayout);
            LinearLayout linearLayout2 = this.f151757a;
            if (linearLayout2 == null) {
                C89219l.m154710a("rootView");
            }
            this.f151758b = linearLayout2.findViewById(R.id.fac);
            this.f151760d = C67347b.m119399a(this.f151759c, this.f151762f);
        }
    }

    /* renamed from: c */
    public final void mo106809c() {
        View view;
        RecyclerView recyclerView;
        C41827d dVar = this.f151759c;
        if (!(dVar == null || (recyclerView = dVar.f97566a) == null)) {
            recyclerView.mo4413b(0);
        }
        C67697a aVar = this.f151761e;
        RecyclerView recyclerView2 = null;
        if (aVar != null) {
            view = aVar.f151735c;
        } else {
            view = null;
        }
        if (view instanceof RecyclerView) {
            recyclerView2 = view;
        }
        RecyclerView recyclerView3 = recyclerView2;
        if (recyclerView3 != null) {
            recyclerView3.mo4413b(0);
        }
    }

    /* renamed from: e */
    private final void m119860e() {
        View view;
        MethodCollector.m26663i(8383);
        if (C41556z.m83490a()) {
            C67697a aVar = this.f151761e;
            if (aVar == null || (view = aVar.f151735c) == null) {
                MethodCollector.m26664o(8383);
                return;
            }
            C11279p.m20006a(view);
            MethodCollector.m26664o(8383);
            return;
        }
        if (C41556z.m83491b()) {
            LinearLayout linearLayout = this.f151757a;
            if (linearLayout == null) {
                C89219l.m154710a("rootView");
            }
            C67697a aVar2 = new C67697a(linearLayout);
            LinearLayout linearLayout2 = this.f151757a;
            if (linearLayout2 == null) {
                C89219l.m154710a("rootView");
            }
            linearLayout2.addView(aVar2.mo106802a(), 0);
            this.f151761e = aVar2;
            aVar2.mo106803a(this.f151763g, this.f151764h);
            C67697a aVar3 = this.f151761e;
            if (aVar3 != null) {
                aVar3.mo106804a(this.f151762f);
                MethodCollector.m26664o(8383);
                return;
            }
        }
        MethodCollector.m26664o(8383);
    }

    /* renamed from: b */
    public final void mo106808b(SearchUser searchUser) {
        MethodCollector.m26663i(8381);
        this.f151762f = searchUser;
        if (this.f151757a != null) {
            MethodCollector.m26664o(8381);
            return;
        }
        ViewGroup viewGroup = this.f151766j;
        LinearLayout linearLayout = null;
        if (viewGroup != null) {
            View a = C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), R.layout.awm, this.f151766j, false);
            if (a instanceof LinearLayout) {
                linearLayout = a;
            }
            LinearLayout linearLayout2 = (LinearLayout) linearLayout;
            if (linearLayout2 != null) {
                this.f151757a = linearLayout2;
            } else {
                IllegalArgumentException illegalArgumentException = new IllegalArgumentException("View configuration error");
                MethodCollector.m26664o(8381);
                throw illegalArgumentException;
            }
        } else {
            ViewStub viewStub = this.f151765i;
            if (viewStub != null) {
                viewStub.setLayoutResource(R.layout.awm);
                View inflate = this.f151765i.inflate();
                if (inflate instanceof LinearLayout) {
                    linearLayout = inflate;
                }
                LinearLayout linearLayout3 = linearLayout;
                if (linearLayout3 != null) {
                    this.f151757a = linearLayout3;
                } else {
                    IllegalArgumentException illegalArgumentException2 = new IllegalArgumentException("ViewStub configuration error");
                    MethodCollector.m26664o(8381);
                    throw illegalArgumentException2;
                }
            }
        }
        m119859d();
        m119860e();
        MethodCollector.m26664o(8381);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00c2, code lost:
        if (r14 != null) goto L_0x003f;
     */
    @Override // com.p2082ss.android.ugc.aweme.p2817e.AbstractC43303b
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo70992a(com.p2082ss.android.ugc.aweme.discover.model.SearchUser r14) {
        /*
        // Method dump skipped, instructions count: 208
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.search.p3703q.C67702c.mo70992a(com.ss.android.ugc.aweme.discover.model.SearchUser):void");
    }

    @Override // com.p2082ss.android.ugc.aweme.p2817e.AbstractC43302a
    /* renamed from: a */
    public final void mo70994a(C42314a aVar, C67568r rVar) {
        this.f151763g = aVar;
        this.f151764h = rVar;
    }

    private C67702c(ViewStub viewStub, ViewGroup viewGroup) {
        this.f151765i = viewStub;
        this.f151766j = viewGroup;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C67702c(ViewStub viewStub, ViewGroup viewGroup, int i) {
        this((i & 1) != 0 ? null : viewStub, (i & 2) != 0 ? null : viewGroup);
    }
}
