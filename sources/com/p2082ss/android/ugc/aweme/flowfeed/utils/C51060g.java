package com.p2082ss.android.ugc.aweme.flowfeed.utils;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.common.utility.collection.C13603b;
import com.bytedance.covode.number.Covode;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/* renamed from: com.ss.android.ugc.aweme.flowfeed.utils.g */
public class C51060g {

    /* renamed from: a */
    public final RecyclerView f117770a;

    /* renamed from: b */
    protected Set<AbstractC51064i> f117771b = new LinkedHashSet();

    /* renamed from: c */
    protected int f117772c;

    /* renamed from: d */
    public boolean f117773d;

    /* renamed from: e */
    public boolean f117774e;

    /* renamed from: f */
    public final AbstractC51059f f117775f;

    /* renamed from: g */
    public AbstractC51057e f117776g;

    /* renamed from: h */
    public boolean f117777h;

    /* renamed from: i */
    private final AbstractC51062a f117778i;

    /* renamed from: com.ss.android.ugc.aweme.flowfeed.utils.g$a */
    public interface AbstractC51062a {
        static {
            Covode.recordClassIndex(60247);
        }

        /* renamed from: e */
        boolean mo60483e();
    }

    static {
        Covode.recordClassIndex(60245);
    }

    /* renamed from: g */
    public final void mo86402g() {
        this.f117771b.clear();
    }

    /* renamed from: j */
    private AbstractC51064i m95453j() {
        return this.f117776g.mo60507a(this.f117771b);
    }

    /* renamed from: h */
    public final void mo86403h() {
        m95454k();
        mo86398c();
        mo86401f();
    }

    /* renamed from: i */
    public final void mo86404i() {
        m95454k();
        mo86398c();
        mo86400e();
    }

    /* renamed from: k */
    private void m95454k() {
        if (!C13603b.m24435a((Collection) this.f117771b)) {
            for (AbstractC51064i iVar : this.f117771b) {
                iVar.f117781e = 0;
            }
        }
    }

    /* renamed from: a */
    public final void mo86394a() {
        int i;
        RecyclerView.AbstractC1362i layoutManager = this.f117770a.getLayoutManager();
        if (!(layoutManager instanceof LinearLayoutManager) || ((LinearLayoutManager) layoutManager).f4334j != 0) {
            i = 0;
        } else {
            i = 1;
        }
        this.f117776g.mo60508a(i);
    }

    /* renamed from: d */
    public final void mo86399d() {
        if (!C13603b.m24435a((Collection) this.f117771b)) {
            Iterator<AbstractC51064i> it = this.f117771b.iterator();
            while (it.hasNext()) {
                it.next();
            }
        }
    }

    /* renamed from: b */
    public final void mo86396b() {
        if (!C13603b.m24435a((Collection) this.f117771b)) {
            for (AbstractC51064i iVar : this.f117771b) {
                if (this.f117776g.mo60510b(iVar.mo60332c())) {
                    if (!iVar.f117784h) {
                        iVar.f117784h = true;
                    }
                } else if (iVar.f117784h) {
                    iVar.f117784h = false;
                }
            }
        }
    }

    /* renamed from: c */
    public final void mo86398c() {
        if (!C13603b.m24435a((Collection) this.f117771b)) {
            for (AbstractC51064i iVar : this.f117771b) {
                if (this.f117776g.mo60509a(iVar.mo60332c()) && !iVar.f117783g) {
                    C1764a.m5928a("start showing: %s", new Object[]{iVar.mo60334d()});
                    iVar.f117783g = true;
                }
            }
        }
    }

    /* renamed from: f */
    public final void mo86401f() {
        AbstractC51064i j;
        if (!this.f117777h && this.f117772c != 2 && !C13603b.m24435a((Collection) this.f117771b)) {
            AbstractC51062a aVar = this.f117778i;
            if ((aVar == null || aVar.mo60483e()) && (j = m95453j()) != null) {
                C1764a.m5928a("PlayTargetChanged roll into playarea: %s", new Object[]{j.mo60334d()});
                j.mo60330b(this.f117772c);
            }
        }
    }

    /* renamed from: e */
    public final void mo86400e() {
        AbstractC51064i j;
        if (!this.f117777h && this.f117772c != 2 && !C13603b.m24435a((Collection) this.f117771b)) {
            AbstractC51062a aVar = this.f117778i;
            if (aVar != null && !aVar.mo60483e()) {
                return;
            }
            if ((this.f117772c != 1 || this.f117775f == null) && (j = m95453j()) != null) {
                C1764a.m5928a("PlayTargetChanged roll into playarea: %s", new Object[]{j.mo60334d()});
                j.mo60327a(this.f117772c);
            }
        }
    }

    /* renamed from: a */
    public final void mo86395a(AbstractC51064i iVar) {
        if (iVar != null) {
            iVar.mo60334d();
            iVar.mo86405f();
            if (iVar.mo60326a() < 0) {
                new RuntimeException("Negative displayPosition");
            }
            if (this.f117771b.add(iVar)) {
                iVar.mo60334d();
            }
        }
    }

    /* renamed from: b */
    public final void mo86397b(AbstractC51064i iVar) {
        if (iVar != null) {
            iVar.mo60334d();
            iVar.mo86405f();
            if (iVar.mo60326a() < 0) {
                new RuntimeException("Negative displayPosition");
            }
            if (this.f117771b.remove(iVar)) {
                iVar.mo60334d();
            }
        }
    }

    public C51060g(RecyclerView recyclerView, AbstractC51059f fVar, AbstractC51062a aVar) {
        this.f117775f = fVar;
        this.f117778i = aVar;
        this.f117770a = recyclerView;
        recyclerView.mo4405a(new RecyclerView.AbstractC1371n() {
            /* class com.p2082ss.android.ugc.aweme.flowfeed.utils.C51060g.C510611 */

            static {
                Covode.recordClassIndex(60246);
            }

            @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1371n
            /* renamed from: a */
            public final void mo4753a(RecyclerView recyclerView, int i) {
                super.mo4753a(recyclerView, i);
                C51060g.this.mo86394a();
                C51060g.this.f117772c = i;
                if (i == 0) {
                    if (C51060g.this.f117773d || (C51060g.this.f117774e && C51060g.this.f117775f != null)) {
                        C51060g.this.mo86401f();
                    }
                    C51060g.this.f117773d = false;
                    C51060g.this.f117774e = false;
                } else if (i == 2) {
                    C51060g.this.f117773d = true;
                } else if (i == 1) {
                    C51060g.this.f117774e = true;
                }
            }

            @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1371n
            /* renamed from: a */
            public final void mo4754a(RecyclerView recyclerView, int i, int i2) {
                super.mo4754a(recyclerView, i, i2);
                C51060g.this.mo86394a();
                if (C51060g.this.f117775f != null) {
                    C51060g.this.f117776g.mo60506a();
                }
                if (C51060g.this.f117772c == 1 && C51060g.this.f117775f == null) {
                    C51060g.this.mo86401f();
                }
                if (C51060g.this.f117772c == 0 && i2 == 0) {
                    if (recyclerView.getItemAnimator() != null) {
                        recyclerView.getItemAnimator().mo4667a(new C51063h(this));
                    } else {
                        C51060g.this.mo86401f();
                    }
                }
                C51060g.this.mo86398c();
                C51060g.this.mo86396b();
                C51060g.this.mo86399d();
            }
        });
    }
}
