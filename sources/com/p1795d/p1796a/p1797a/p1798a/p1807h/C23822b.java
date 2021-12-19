package com.p1795d.p1796a.p1797a.p1798a.p1807h;

import android.view.View;
import com.bytedance.covode.number.Covode;
import com.p1795d.p1796a.p1797a.p1798a.p1800b.C23781l;
import com.p1795d.p1796a.p1797a.p1798a.p1802c.C23787c;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

/* renamed from: com.d.a.a.a.h.b */
public final class C23822b {

    /* renamed from: a */
    final HashMap<View, String> f56340a = new HashMap<>();

    /* renamed from: b */
    final HashMap<View, C23823a> f56341b = new HashMap<>();

    /* renamed from: c */
    final HashMap<String, View> f56342c = new HashMap<>();

    /* renamed from: d */
    final HashSet<View> f56343d = new HashSet<>();

    /* renamed from: e */
    public final HashSet<String> f56344e = new HashSet<>();

    /* renamed from: f */
    public final HashSet<String> f56345f = new HashSet<>();

    /* renamed from: g */
    final HashMap<String, String> f56346g = new HashMap<>();

    /* renamed from: h */
    boolean f56347h;

    /* renamed from: com.d.a.a.a.h.b$a */
    public static class C23823a {

        /* renamed from: a */
        public final C23787c f56348a;

        /* renamed from: b */
        public final ArrayList<String> f56349b = new ArrayList<>();

        static {
            Covode.recordClassIndex(27931);
        }

        public C23823a(C23787c cVar, String str) {
            this.f56348a = cVar;
            mo39291a(str);
        }

        /* renamed from: a */
        public final void mo39291a(String str) {
            this.f56349b.add(str);
        }
    }

    static {
        Covode.recordClassIndex(27930);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.HashMap<android.view.View, com.d.a.a.a.h.b$a> */
    /* JADX WARN: Multi-variable type inference failed */
    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo39290a(C23781l lVar) {
        for (C23787c cVar : lVar.f56259b) {
            Object obj = cVar.f56279a.get();
            if (obj != null) {
                C23823a aVar = this.f56341b.get(obj);
                if (aVar != null) {
                    aVar.mo39291a(lVar.f56263f);
                } else {
                    this.f56341b.put(obj, new C23823a(cVar, lVar.f56263f));
                }
            }
        }
    }
}
