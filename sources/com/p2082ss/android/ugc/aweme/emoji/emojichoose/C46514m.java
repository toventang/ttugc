package com.p2082ss.android.ugc.aweme.emoji.emojichoose;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.p2082ss.android.ugc.aweme.emoji.p2897b.AbstractC46452f;
import com.p2082ss.android.ugc.aweme.emoji.p2897b.C46447a;
import com.p2082ss.android.ugc.aweme.emoji.p2906i.C46576c;
import com.p2082ss.android.ugc.aweme.emoji.sysemoji.C46615q;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.emoji.emojichoose.m */
public final class C46514m {

    /* renamed from: a */
    public AbstractC46452f f108433a;

    /* renamed from: b */
    public List<AbstractC46452f> f108434b = new ArrayList();

    /* renamed from: c */
    public int f108435c;

    /* renamed from: d */
    private C46576c f108436d;

    /* renamed from: e */
    private C46615q f108437e;

    /* renamed from: f */
    private C46502d f108438f;

    static {
        Covode.recordClassIndex(55099);
    }

    /* renamed from: b */
    public final int mo79027b() {
        return this.f108434b.size();
    }

    /* renamed from: a */
    public final int mo79025a() {
        AbstractC46452f fVar = this.f108433a;
        if (fVar == null) {
            return 0;
        }
        return fVar.mo78971f();
    }

    /* renamed from: e */
    public final AbstractC46452f mo79031e(int i) {
        return this.f108434b.get(i);
    }

    /* renamed from: a */
    private void m89777a(AbstractC46452f fVar) {
        if (this.f108434b == null) {
            this.f108434b = new ArrayList();
        }
        this.f108434b.add(fVar);
    }

    /* renamed from: b */
    public final AbstractC46452f mo79028b(int i) {
        if (i < 0) {
            return null;
        }
        int i2 = 0;
        for (AbstractC46452f fVar : this.f108434b) {
            i2 += fVar.mo78972g();
            if (i < i2) {
                return fVar;
            }
        }
        return null;
    }

    /* renamed from: a */
    public final void mo79026a(int i) {
        if (i >= 0 && i < mo79027b()) {
            this.f108435c = i;
            this.f108433a = this.f108434b.get(i);
        }
    }

    /* renamed from: c */
    public final List<C46447a> mo79029c(int i) {
        if (i < 0) {
            return new ArrayList();
        }
        int i2 = 0;
        for (AbstractC46452f fVar : this.f108434b) {
            if (i < fVar.mo78972g() + i2) {
                return fVar.mo78967b(i - i2);
            }
            i2 += fVar.mo78972g();
        }
        return new ArrayList();
    }

    /* renamed from: d */
    public final int mo79030d(int i) {
        if (i < 0) {
            return 0;
        }
        int i2 = 0;
        for (AbstractC46452f fVar : this.f108434b) {
            if (i < fVar.mo78972g() + i2) {
                return i - i2;
            }
            i2 += fVar.mo78972g();
        }
        return 0;
    }

    public C46514m(C46502d dVar) {
        this.f108438f = dVar;
        if (this.f108438f.f108379a) {
            if (this.f108436d == null) {
                this.f108436d = new C46576c(C17867d.m33078a());
            }
            m89777a(this.f108436d);
        }
        if (this.f108438f.f108383e) {
            if (this.f108437e == null) {
                this.f108437e = new C46615q(C17867d.m33078a(), this.f108438f.f108385g);
            }
            m89777a(this.f108437e);
        }
        mo79026a(0);
    }
}
