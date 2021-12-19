package com.google.android.play.core.p1966e;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.google.android.play.core.p1963b.AbstractC26899aq;
import com.google.android.play.core.p1963b.C26903au;
import com.google.android.play.core.p1963b.C26909b;
import com.google.android.play.core.p1963b.C26952l;
import com.google.android.play.core.p1965d.C26991q;
import com.google.android.play.core.tasks.AbstractC27062d;
import com.google.android.play.core.tasks.C27064f;
import com.google.android.play.core.tasks.C27071m;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.play.core.e.t */
public final class C27048t {

    /* renamed from: a */
    static final C26909b f64014a = new C26909b("SplitInstallService");

    /* renamed from: d */
    private static final Intent f64015d = new Intent("com.google.android.play.core.splitinstall.BIND_SPLIT_INSTALL_SERVICE").setPackage("com.android.vending");

    /* renamed from: b */
    final String f64016b;

    /* renamed from: c */
    C26952l<AbstractC26899aq> f64017c;

    static {
        Covode.recordClassIndex(32524);
    }

    public C27048t(Context context) {
        this.f64016b = context.getPackageName();
        if (C26903au.m53445a(context)) {
            this.f64017c = new C26952l<>(C26991q.m53630a(context), f64014a, "SplitInstallService", f64015d, C27040l.f64001a);
        }
    }

    /* renamed from: a */
    static /* synthetic */ Bundle m53765a() {
        Bundle bundle = new Bundle();
        bundle.putInt("playcore_version_code", 10803);
        return bundle;
    }

    /* renamed from: a */
    static /* synthetic */ ArrayList m53766a(Collection collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            Bundle bundle = new Bundle();
            bundle.putString("language", (String) it.next());
            arrayList.add(bundle);
        }
        return arrayList;
    }

    /* renamed from: b */
    private static <T> AbstractC27062d<T> m53767b() {
        f64014a.mo44596b("onError(%d)", -14);
        return C27064f.m53800a((Exception) new C26993a(-14));
    }

    /* renamed from: a */
    public final AbstractC27062d<AbstractC27034f> mo44748a(int i) {
        if (this.f64017c == null) {
            return m53767b();
        }
        f64014a.mo44598d("getSessionState(%d)", Integer.valueOf(i));
        C27071m mVar = new C27071m();
        this.f64017c.mo44652a(new C27042n(this, mVar, i, mVar));
        return mVar.f64055a;
    }

    /* renamed from: a */
    public final AbstractC27062d<Integer> mo44749a(Collection<String> collection, Collection<String> collection2) {
        if (this.f64017c == null) {
            return m53767b();
        }
        f64014a.mo44598d("startInstall(%s,%s)", collection, collection2);
        C27071m mVar = new C27071m();
        this.f64017c.mo44652a(new C27041m(this, mVar, collection, collection2, mVar));
        return mVar.f64055a;
    }

    /* renamed from: b */
    public final AbstractC27062d<Void> mo44750b(int i) {
        if (this.f64017c == null) {
            return m53767b();
        }
        f64014a.mo44598d("cancelInstall(%d)", Integer.valueOf(i));
        C27071m mVar = new C27071m();
        this.f64017c.mo44652a(new C27043o(this, mVar, i, mVar));
        return mVar.f64055a;
    }
}
