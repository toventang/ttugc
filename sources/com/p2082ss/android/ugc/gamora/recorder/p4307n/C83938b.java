package com.p2082ss.android.ugc.gamora.recorder.p4307n;

import android.view.View;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.base.C34602l;

/* renamed from: com.ss.android.ugc.gamora.recorder.n.b */
public final class C83938b implements Cloneable, Comparable<C83938b> {

    /* renamed from: a */
    public final int f187373a;

    /* renamed from: b */
    public int f187374b;

    /* renamed from: c */
    public C34602l f187375c;

    /* renamed from: d */
    public boolean f187376d;

    /* renamed from: e */
    public AbstractC83904a f187377e;

    /* renamed from: f */
    public boolean f187378f;

    /* renamed from: g */
    public boolean f187379g;

    /* renamed from: h */
    public int f187380h;

    /* renamed from: i */
    public AbstractC83939a f187381i;

    /* renamed from: j */
    public boolean f187382j;

    /* renamed from: k */
    public boolean f187383k;

    /* renamed from: l */
    public boolean f187384l;

    /* renamed from: m */
    private int f187385m;

    /* renamed from: com.ss.android.ugc.gamora.recorder.n.b$a */
    public interface AbstractC83939a {
        static {
            Covode.recordClassIndex(97830);
        }

        /* renamed from: a */
        void mo70063a(View view);
    }

    static {
        Covode.recordClassIndex(97829);
    }

    public final int hashCode() {
        return this.f187373a;
    }

    /* renamed from: a */
    public final C83938b clone() {
        C83938b bVar = new C83938b(this.f187373a, this.f187374b, this.f187377e, this.f187380h, this.f187383k);
        bVar.f187375c = this.f187375c;
        bVar.f187376d = this.f187376d;
        bVar.f187378f = this.f187378f;
        bVar.f187379g = this.f187379g;
        bVar.f187382j = this.f187382j;
        bVar.f187381i = this.f187381i;
        return bVar;
    }

    /* renamed from: a */
    public final void mo128819a(boolean z) {
        int i;
        this.f187383k = z;
        if (z) {
            i = this.f187385m;
        } else {
            i = -1;
        }
        this.f187380h = i;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(C83938b bVar) {
        return Integer.compare(this.f187373a, bVar.f187373a);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C83938b)) {
            return false;
        }
        C83938b bVar = (C83938b) obj;
        if (this.f187373a == bVar.f187373a && this.f187374b == bVar.f187374b && this.f187380h == bVar.f187380h && this.f187376d == bVar.f187376d && this.f187375c == bVar.f187375c) {
            return true;
        }
        return false;
    }

    public C83938b(int i, int i2, AbstractC83904a aVar, int i3, boolean z) {
        this(i, i2, aVar, i3, true, z);
    }

    public C83938b(int i, int i2, AbstractC83904a aVar, int i3, boolean z, boolean z2) {
        int i4;
        this.f187376d = true;
        this.f187382j = true;
        this.f187373a = i;
        this.f187374b = i2;
        this.f187377e = aVar;
        if (z2) {
            i4 = i3;
        } else {
            i4 = -1;
        }
        this.f187380h = i4;
        this.f187385m = i3;
        this.f187376d = z;
        this.f187383k = z2;
    }
}
