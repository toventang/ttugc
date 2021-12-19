package androidx.appcompat.view;

import android.view.View;
import android.view.animation.Interpolator;
import androidx.core.p037h.AbstractC0750aa;
import androidx.core.p037h.C0751ab;
import androidx.core.p037h.C0807z;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: androidx.appcompat.view.h */
public final class C0284h {

    /* renamed from: a */
    final ArrayList<C0807z> f953a = new ArrayList<>();

    /* renamed from: b */
    AbstractC0750aa f954b;

    /* renamed from: c */
    boolean f955c;

    /* renamed from: d */
    private long f956d = -1;

    /* renamed from: e */
    private Interpolator f957e;

    /* renamed from: f */
    private final C0751ab f958f = new C0751ab() {
        /* class androidx.appcompat.view.C0284h.C02851 */

        /* renamed from: b */
        private boolean f960b;

        /* renamed from: c */
        private int f961c;

        static {
            Covode.recordClassIndex(319);
        }

        @Override // androidx.core.p037h.AbstractC0750aa, androidx.core.p037h.C0751ab
        /* renamed from: a */
        public final void mo557a(View view) {
            if (!this.f960b) {
                this.f960b = true;
                if (C0284h.this.f954b != null) {
                    C0284h.this.f954b.mo557a(null);
                }
            }
        }

        @Override // androidx.core.p037h.AbstractC0750aa, androidx.core.p037h.C0751ab
        /* renamed from: b */
        public final void mo558b(View view) {
            int i = this.f961c + 1;
            this.f961c = i;
            if (i == C0284h.this.f953a.size()) {
                if (C0284h.this.f954b != null) {
                    C0284h.this.f954b.mo558b(null);
                }
                this.f961c = 0;
                this.f960b = false;
                C0284h.this.f955c = false;
            }
        }
    };

    static {
        Covode.recordClassIndex(318);
    }

    /* renamed from: c */
    public final C0284h mo780c() {
        if (!this.f955c) {
            this.f956d = 250;
        }
        return this;
    }

    /* renamed from: b */
    public final void mo779b() {
        if (this.f955c) {
            Iterator<C0807z> it = this.f953a.iterator();
            while (it.hasNext()) {
                it.next().mo2939b();
            }
            this.f955c = false;
        }
    }

    /* renamed from: a */
    public final void mo778a() {
        if (!this.f955c) {
            Iterator<C0807z> it = this.f953a.iterator();
            while (it.hasNext()) {
                C0807z next = it.next();
                long j = this.f956d;
                if (j >= 0) {
                    next.mo2932a(j);
                }
                Interpolator interpolator = this.f957e;
                if (interpolator != null) {
                    next.mo2933a(interpolator);
                }
                if (this.f954b != null) {
                    next.mo2934a(this.f958f);
                }
                next.mo2940c();
            }
            this.f955c = true;
        }
    }

    /* renamed from: a */
    public final C0284h mo774a(Interpolator interpolator) {
        if (!this.f955c) {
            this.f957e = interpolator;
        }
        return this;
    }

    /* renamed from: a */
    public final C0284h mo775a(AbstractC0750aa aaVar) {
        if (!this.f955c) {
            this.f954b = aaVar;
        }
        return this;
    }

    /* renamed from: a */
    public final C0284h mo776a(C0807z zVar) {
        if (!this.f955c) {
            this.f953a.add(zVar);
        }
        return this;
    }

    /* renamed from: a */
    public final C0284h mo777a(C0807z zVar, C0807z zVar2) {
        this.f953a.add(zVar);
        zVar2.mo2938b(zVar.mo2930a());
        this.f953a.add(zVar2);
        return this;
    }
}
