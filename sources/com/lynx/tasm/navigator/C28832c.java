package com.lynx.tasm.navigator;

import com.bytedance.covode.number.Covode;
import com.lynx.tasm.LynxView;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Map;
import java.util.Stack;
import java.util.WeakHashMap;

/* renamed from: com.lynx.tasm.navigator.c */
public final class C28832c {

    /* renamed from: a */
    static C28832c f68069a = new C28832c();

    /* renamed from: b */
    AbstractC28836f f68070b;

    /* renamed from: c */
    private Stack<C28825a> f68071c = new Stack<>();

    /* renamed from: d */
    private Map<AbstractC28831b, C28825a> f68072d = new WeakHashMap();

    /* renamed from: e */
    private int f68073e = Integer.MAX_VALUE;

    /* renamed from: a */
    public static C28832c m57726a() {
        return f68069a;
    }

    static {
        Covode.recordClassIndex(34940);
    }

    private C28832c() {
    }

    /* renamed from: c */
    public final C28825a mo49964c() {
        Stack<C28825a> stack = this.f68071c;
        if (stack == null || stack.isEmpty()) {
            return null;
        }
        return this.f68071c.peek();
    }

    /* renamed from: b */
    public final boolean mo49963b() {
        C28825a c = mo49964c();
        if (c == null || c.f68051a.isEmpty()) {
            return false;
        }
        c.mo49956a((LynxView) c.f68054d.remove(c.f68051a.pop()));
        return true;
    }

    /* renamed from: a */
    public final void mo49961a(AbstractC28831b bVar) {
        C28825a remove = this.f68072d.remove(bVar);
        if (remove != null) {
            Iterator<C28833d> it = remove.f68051a.iterator();
            while (it.hasNext()) {
                remove.f68054d.remove(it.next());
            }
            remove.f68051a.clear();
            if (remove.f68053c != null) {
                remove.f68053c.clear();
            }
            Iterator<C28825a> it2 = this.f68071c.iterator();
            while (it2.hasNext()) {
                if (it2.next() == remove) {
                    it2.remove();
                    return;
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo49962a(AbstractC28831b bVar, LynxView lynxView) {
        C28825a aVar = new C28825a(bVar, this.f68073e);
        if (lynxView != null) {
            aVar.f68052b = new WeakReference<>(lynxView);
        }
        this.f68071c.push(aVar);
        this.f68072d.put(bVar, aVar);
    }
}
