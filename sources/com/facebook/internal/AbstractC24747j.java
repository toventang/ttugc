package com.facebook.internal;

import android.app.Activity;
import com.bytedance.covode.number.Covode;
import com.facebook.C24798j;
import com.facebook.C24872m;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.facebook.internal.j */
public abstract class AbstractC24747j<CONTENT, RESULT> {

    /* renamed from: a */
    protected static final Object f58717a = new Object();

    /* renamed from: b */
    public int f58718b;

    /* renamed from: c */
    private final Activity f58719c;

    /* renamed from: d */
    private final C24776s f58720d = null;

    /* renamed from: e */
    private List<AbstractC24747j<CONTENT, RESULT>.AbstractC24748a> f58721e;

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract List<AbstractC24747j<CONTENT, RESULT>.AbstractC24748a> mo40578b();

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract C24667a mo40580c();

    /* renamed from: com.facebook.internal.j$a */
    public abstract class AbstractC24748a {
        static {
            Covode.recordClassIndex(28901);
        }

        /* renamed from: a */
        public abstract C24667a mo40581a(CONTENT content);

        /* renamed from: a */
        public abstract boolean mo40583a(CONTENT content, boolean z);

        /* renamed from: a */
        public Object mo40582a() {
            return AbstractC24747j.f58717a;
        }

        public AbstractC24748a() {
        }
    }

    static {
        Covode.recordClassIndex(28900);
    }

    /* renamed from: d */
    private List<AbstractC24747j<CONTENT, RESULT>.AbstractC24748a> m47386d() {
        if (this.f58721e == null) {
            this.f58721e = mo40578b();
        }
        return this.f58721e;
    }

    /* renamed from: a */
    public final Activity mo40576a() {
        Activity activity = this.f58719c;
        if (activity != null) {
            return activity;
        }
        C24776s sVar = this.f58720d;
        if (sVar != null) {
            return sVar.mo40595a();
        }
        return null;
    }

    /* renamed from: a */
    public final boolean mo40577a(CONTENT content) {
        boolean z;
        Object obj = f58717a;
        if (obj == obj) {
            z = true;
        } else {
            z = false;
        }
        for (AbstractC24747j<CONTENT, RESULT>.AbstractC24748a aVar : m47386d()) {
            if ((z || C24693ad.m47260a(aVar.mo40582a(), obj)) && aVar.mo40583a(content, false)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public final void mo40579b(CONTENT content) {
        C24667a a = m47385a(content, f58717a);
        if (a != null) {
            C24776s sVar = this.f58720d;
            if (sVar != null) {
                sVar.mo40596a(a.mo40495a(), a.mo40498c());
                a.mo40499d();
                return;
            }
            this.f58719c.startActivityForResult(a.mo40495a(), a.mo40498c());
            a.mo40499d();
        } else if (C24872m.f59045e) {
            throw new IllegalStateException("No code path should ever result in a null appCall");
        }
    }

    public AbstractC24747j(Activity activity, int i) {
        C24699ae.m47301a((Object) activity, "activity");
        this.f58719c = activity;
        this.f58718b = i;
    }

    /* renamed from: a */
    private C24667a m47385a(CONTENT content, Object obj) {
        boolean z;
        C24667a aVar;
        if (obj == f58717a) {
            z = true;
        } else {
            z = false;
        }
        Iterator<AbstractC24747j<CONTENT, RESULT>.AbstractC24748a> it = m47386d().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            AbstractC24747j<CONTENT, RESULT>.AbstractC24748a next = it.next();
            if ((z || C24693ad.m47260a(next.mo40582a(), obj)) && next.mo40583a(content, true)) {
                try {
                    aVar = next.mo40581a(content);
                } catch (C24798j e) {
                    aVar = mo40580c();
                    C24745i.m47378a(aVar, e);
                }
                if (aVar != null) {
                    return aVar;
                }
            }
        }
        C24667a c = mo40580c();
        C24745i.m47378a(c, new C24798j("Unable to show the provided content via the web or the installed version of the Facebook app. Some dialogs are only supported starting API 14."));
        return c;
    }
}
