package com.p2082ss.android.ugc.aweme.shortvideo;

import com.bytedance.covode.number.Covode;
import com.bytedance.creativex.recorder.filter.p942a.AbstractC14210a;
import com.bytedance.creativex.recorder.filter.p942a.AbstractC14220j;
import com.bytedance.creativex.recorder.filter.p942a.C14215e;
import com.google.p1998c.p1999a.AbstractC27235f;
import com.p2082ss.android.ugc.aweme.filter.FilterBean;
import com.p2082ss.android.ugc.aweme.filter.repository.internal.main.C50807q;
import com.p2082ss.android.ugc.aweme.filter.repository.internal.utils.C50812b;
import com.p2082ss.android.ugc.aweme.filter.repository.p2986a.AbstractC50703k;
import com.p2082ss.android.ugc.aweme.filter.repository.p2986a.AbstractC50705m;
import com.p2082ss.android.ugc.aweme.shortvideo.p3892x.AbstractC74317i;
import java.util.Iterator;
import java.util.List;
import p4600h.C89378p;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ex */
public final class C71828ex implements AbstractC74317i {

    /* renamed from: a */
    public AbstractC27235f<FilterBean, Float> f160971a;

    /* renamed from: b */
    private final C50807q f160972b = new C50807q();

    /* renamed from: c */
    private boolean f160973c;

    /* renamed from: d */
    private final AbstractC50705m f160974d = new C71829a(this);

    /* renamed from: e */
    private final AbstractC14220j f160975e = new C71831b();

    /* renamed from: f */
    private final AbstractC14210a f160976f;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ex$a */
    public static final class C71829a implements AbstractC50705m {

        /* renamed from: a */
        final /* synthetic */ C71828ex f160977a;

        static {
            Covode.recordClassIndex(84375);
        }

        @Override // com.p2082ss.android.ugc.aweme.filter.repository.p2986a.AbstractC50705m
        /* renamed from: a */
        public final void mo86057a(FilterBean filterBean, float f) {
            C89219l.m154721d(filterBean, "");
        }

        @Override // com.p2082ss.android.ugc.aweme.filter.repository.p2986a.AbstractC50705m
        /* renamed from: b */
        public final float mo86058b(FilterBean filterBean) {
            C89219l.m154721d(filterBean, "");
            return 0.0f;
        }

        /* renamed from: com.ss.android.ugc.aweme.shortvideo.ex$a$a */
        public static final class C71830a implements AbstractC50703k {
            static {
                Covode.recordClassIndex(84376);
            }

            @Override // com.p2082ss.android.ugc.aweme.filter.repository.p2986a.AbstractC50703k
            /* renamed from: a */
            public final float mo23007a(FilterBean filterBean) {
                C89219l.m154721d(filterBean, "");
                return 0.0f;
            }

            C71830a() {
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.filter.repository.p2986a.AbstractC50705m
        /* renamed from: a */
        public final AbstractC50703k mo86056a() {
            return new C71830a();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C71829a(C71828ex exVar) {
            this.f160977a = exVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.filter.repository.p2986a.AbstractC50705m
        /* renamed from: a */
        public final float mo86055a(FilterBean filterBean) {
            Float a;
            C89219l.m154721d(filterBean, "");
            AbstractC27235f<FilterBean, Float> fVar = this.f160977a.f160971a;
            if (fVar == null || (a = fVar.mo45319a(filterBean)) == null) {
                return 0.0f;
            }
            return a.floatValue();
        }
    }

    static {
        Covode.recordClassIndex(84374);
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ex$b */
    public static final class C71831b implements AbstractC14220j {
        static {
            Covode.recordClassIndex(84377);
        }

        @Override // com.bytedance.creativex.recorder.filter.p942a.AbstractC14220j
        /* renamed from: a */
        public final int mo22977a(int i) {
            return -1;
        }

        @Override // com.bytedance.creativex.recorder.filter.p942a.AbstractC14220j
        /* renamed from: a */
        public final void mo22978a(int i, int i2) {
        }

        @Override // com.bytedance.creativex.recorder.filter.p942a.AbstractC14220j
        /* renamed from: a */
        public final void mo22979a(boolean z) {
        }

        @Override // com.bytedance.creativex.recorder.filter.p942a.AbstractC14220j
        /* renamed from: a */
        public final boolean mo22980a() {
            return false;
        }

        C71831b() {
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.p3892x.AbstractC74317i
    /* renamed from: a */
    public final void mo113484a() {
        this.f160976f.useFilterSource("build_in");
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.p3892x.AbstractC74317i
    /* renamed from: a */
    public final void mo113485a(AbstractC27235f<FilterBean, Float> fVar) {
        C89219l.m154721d(fVar, "");
        this.f160971a = fVar;
    }

    public C71828ex(AbstractC14210a aVar) {
        C89219l.m154721d(aVar, "");
        this.f160976f = aVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.p3892x.AbstractC74317i
    /* renamed from: a */
    public final void mo113486a(List<? extends FilterBean> list, int i) {
        Object obj;
        float f;
        C89219l.m154721d(list, "");
        if (!this.f160973c) {
            this.f160976f.removeFilterSource("live");
            this.f160976f.addFilterSource(new C14215e("live", this.f160972b, this.f160974d, this.f160975e));
            this.f160973c = true;
        }
        C50807q qVar = this.f160972b;
        C89219l.m154721d(list, "");
        if (qVar.f117250a.size() == list.size()) {
            List f2 = C89070n.m154581f(qVar.f117250a, list);
            if (!f2.isEmpty()) {
                Iterator it = f2.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    C89378p pVar = (C89378p) it.next();
                    if (!C89219l.m154714a(C50812b.m95169b((FilterBean) pVar.getFirst()), C50812b.m95169b((FilterBean) pVar.getSecond()))) {
                        break;
                    }
                }
            }
        } else {
            qVar.f117250a = list;
            qVar.mo86130a(qVar.f117250a);
        }
        this.f160976f.useFilterSource("live");
        Float f3 = null;
        if (!list.isEmpty()) {
            if (i < 0 || i >= list.size()) {
                obj = list.get(0);
            } else {
                obj = list.get(i);
            }
            FilterBean filterBean = (FilterBean) obj;
            if (filterBean == null) {
                return;
            }
            if (C89219l.m154714a((Object) filterBean, (Object) this.f160976f.getCurSelectedFilter().f7727a.getValue())) {
                AbstractC27235f<FilterBean, Float> fVar = this.f160971a;
                if (fVar != null) {
                    f3 = fVar.mo45319a(filterBean);
                }
                AbstractC14210a aVar = this.f160976f;
                if (f3 != null) {
                    f = f3.floatValue();
                } else {
                    f = 0.0f;
                }
                aVar.setFilterIntensity(filterBean, f);
                return;
            }
            this.f160976f.setFilterChosen(filterBean, null, true, true, false);
        }
    }
}
