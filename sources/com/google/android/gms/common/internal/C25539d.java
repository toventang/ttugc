package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.view.View;
import androidx.p025c.C0486b;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.common.api.C25335a;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.signin.C26541a;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: com.google.android.gms.common.internal.d */
public final class C25539d {

    /* renamed from: a */
    public final Account f60585a;

    /* renamed from: b */
    public final Set<Scope> f60586b;

    /* renamed from: c */
    public final Set<Scope> f60587c;

    /* renamed from: d */
    public final Map<C25335a<?>, C25541b> f60588d;

    /* renamed from: e */
    public final int f60589e;

    /* renamed from: f */
    public final View f60590f;

    /* renamed from: g */
    public final String f60591g;

    /* renamed from: h */
    public final String f60592h;

    /* renamed from: i */
    public final C26541a f60593i;

    /* renamed from: j */
    public final boolean f60594j;

    /* renamed from: k */
    public Integer f60595k;

    /* renamed from: com.google.android.gms.common.internal.d$b */
    public static final class C25541b {

        /* renamed from: a */
        public final Set<Scope> f60605a;

        static {
            Covode.recordClassIndex(30944);
        }
    }

    static {
        Covode.recordClassIndex(30942);
    }

    /* renamed from: com.google.android.gms.common.internal.d$a */
    public static final class C25540a {

        /* renamed from: a */
        public Account f60596a;

        /* renamed from: b */
        public String f60597b;

        /* renamed from: c */
        public String f60598c;

        /* renamed from: d */
        private C0486b<Scope> f60599d;

        /* renamed from: e */
        private Map<C25335a<?>, C25541b> f60600e;

        /* renamed from: f */
        private int f60601f;

        /* renamed from: g */
        private View f60602g;

        /* renamed from: h */
        private C26541a f60603h = C26541a.f62625a;

        /* renamed from: i */
        private boolean f60604i;

        static {
            Covode.recordClassIndex(30943);
        }

        /* renamed from: a */
        public final C25539d mo41812a() {
            return new C25539d(this.f60596a, this.f60599d, this.f60600e, this.f60601f, this.f60602g, this.f60597b, this.f60598c, this.f60603h, this.f60604i);
        }

        /* renamed from: a */
        public final C25540a mo41811a(Collection<Scope> collection) {
            if (this.f60599d == null) {
                this.f60599d = new C0486b<>();
            }
            this.f60599d.addAll(collection);
            return this;
        }
    }

    public C25539d(Account account, Set<Scope> set, Map<C25335a<?>, C25541b> map, int i, View view, String str, String str2, C26541a aVar, boolean z) {
        Set<Scope> unmodifiableSet;
        this.f60585a = account;
        if (set == null) {
            unmodifiableSet = Collections.emptySet();
        } else {
            unmodifiableSet = Collections.unmodifiableSet(set);
        }
        this.f60586b = unmodifiableSet;
        map = map == null ? Collections.emptyMap() : map;
        this.f60588d = map;
        this.f60590f = view;
        this.f60589e = i;
        this.f60591g = str;
        this.f60592h = str2;
        this.f60593i = aVar;
        this.f60594j = z;
        HashSet hashSet = new HashSet(unmodifiableSet);
        for (C25541b bVar : map.values()) {
            hashSet.addAll(bVar.f60605a);
        }
        this.f60587c = Collections.unmodifiableSet(hashSet);
    }
}
