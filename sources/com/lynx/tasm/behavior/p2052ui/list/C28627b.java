package com.lynx.tasm.behavior.p2052ui.list;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.lynx.tasm.C28719c;
import com.lynx.tasm.base.LLog;
import com.lynx.tasm.behavior.p2052ui.view.UIComponent;
import com.lynx.tasm.p2054c.C28729g;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;

/* renamed from: com.lynx.tasm.behavior.ui.list.b */
public final class C28627b implements AbstractC28636d {

    /* renamed from: a */
    final C28719c f67385a;

    /* renamed from: b */
    RunnableC28629b f67386b;

    /* renamed from: c */
    LinkedList<C28628a> f67387c = new LinkedList<>();

    /* renamed from: d */
    LinkedList<C28628a> f67388d = new LinkedList<>();

    /* renamed from: e */
    private final Handler f67389e;

    static {
        Covode.recordClassIndex(34686);
    }

    @Override // com.lynx.tasm.behavior.p2052ui.list.AbstractC28636d
    /* renamed from: a */
    public final void mo49558a() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.lynx.tasm.behavior.ui.list.b$a */
    public static class C28628a {

        /* renamed from: a */
        C28644h f67390a;

        /* renamed from: b */
        String f67391b;

        /* renamed from: c */
        int f67392c;

        /* renamed from: d */
        String f67393d;

        static {
            Covode.recordClassIndex(34687);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final boolean mo49563a() {
            if (this.f67390a.f67449a.f67451b == null || this.f67391b == null) {
                return false;
            }
            return true;
        }

        public final String toString() {
            return "{type='" + this.f67391b + "', position=" + this.f67392c + ", key='" + this.f67393d + "'}";
        }

        public C28628a(C28644h hVar, String str) {
            this.f67390a = hVar;
            this.f67391b = str;
            this.f67392c = hVar.getLayoutPosition();
            if (hVar.f67449a.f67451b != null) {
                this.f67393d = hVar.f67449a.f67451b.f67686a;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo49562b() {
        if (this.f67386b == null) {
            RunnableC28629b bVar = new RunnableC28629b(this);
            this.f67386b = bVar;
            this.f67389e.postDelayed(bVar, 50);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.lynx.tasm.behavior.ui.list.b$b */
    public static class RunnableC28629b implements Runnable {

        /* renamed from: a */
        WeakReference<C28627b> f67394a;

        static {
            Covode.recordClassIndex(34688);
        }

        public final void run() {
            UIComponent uIComponent;
            UIComponent uIComponent2;
            C28627b bVar = this.f67394a.get();
            if (bVar != null) {
                bVar.f67386b = null;
                if (UIList.f67360h) {
                    LLog.m56860b("UIList", "Courier flush pending " + bVar.f67388d.size() + " " + Arrays.toString(bVar.f67388d.toArray()) + " flushing " + bVar.f67387c.size() + " " + Arrays.toString(bVar.f67387c.toArray()));
                }
                while (bVar.f67387c.size() > 0) {
                    C28628a removeFirst = bVar.f67387c.removeFirst();
                    if (removeFirst.mo49563a()) {
                        Iterator<C28628a> it = bVar.f67387c.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                C28628a next = it.next();
                                if (C28627b.m57241a(removeFirst, next)) {
                                    bVar.f67387c.remove(next);
                                    break;
                                }
                            } else {
                                Iterator<C28628a> it2 = bVar.f67388d.iterator();
                                while (true) {
                                    if (it2.hasNext()) {
                                        C28628a next2 = it2.next();
                                        if (C28627b.m57241a(removeFirst, next2)) {
                                            bVar.f67388d.remove(next2);
                                            break;
                                        }
                                    } else if (removeFirst.mo49563a() && (uIComponent = removeFirst.f67390a.f67449a.f67451b) != null && uIComponent.getEvents() != null && uIComponent.getEvents().containsKey(removeFirst.f67391b) && (uIComponent2 = removeFirst.f67390a.f67449a.f67451b) != null) {
                                        if (UIList.f67360h) {
                                            LLog.m56860b("UIList", "sendNodeEvent " + removeFirst.f67391b + "  " + removeFirst.f67392c + " " + removeFirst.f67393d);
                                        }
                                        C28729g a = C28729g.m57542a(uIComponent2.getSign(), removeFirst.f67391b);
                                        a.mo49838a("position", Integer.valueOf(removeFirst.f67392c));
                                        a.mo49838a("key", removeFirst.f67393d);
                                        bVar.f67385a.mo49834a(a);
                                    }
                                }
                            }
                        }
                    }
                }
                bVar.f67387c = bVar.f67388d;
                bVar.f67388d = new LinkedList<>();
                if (bVar.f67387c.size() > 0) {
                    bVar.mo49562b();
                }
            }
        }

        public RunnableC28629b(C28627b bVar) {
            this.f67394a = new WeakReference<>(bVar);
        }
    }

    public C28627b(C28719c cVar) {
        this.f67385a = cVar;
        Handler handler = new Handler(Looper.getMainLooper());
        this.f67389e = handler;
        RunnableC28629b bVar = new RunnableC28629b(this);
        this.f67386b = bVar;
        handler.postDelayed(bVar, 500);
    }

    @Override // com.lynx.tasm.behavior.p2052ui.list.AbstractC28636d
    /* renamed from: a */
    public final void mo49559a(C28644h hVar) {
        if (UIList.f67360h) {
            LLog.m56860b("UIList", "onNodeAppear " + hVar.getLayoutPosition());
        }
        this.f67388d.push(new C28628a(hVar, "nodeappear"));
        mo49562b();
    }

    @Override // com.lynx.tasm.behavior.p2052ui.list.AbstractC28636d
    /* renamed from: b */
    public final void mo49560b(C28644h hVar) {
        if (UIList.f67360h) {
            LLog.m56860b("UIList", "onNodeDisappear " + hVar.getLayoutPosition());
        }
        this.f67388d.push(new C28628a(hVar, "nodedisappear"));
        mo49562b();
    }

    @Override // com.lynx.tasm.behavior.p2052ui.list.AbstractC28636d
    /* renamed from: c */
    public final void mo49561c(C28644h hVar) {
        Iterator<C28628a> it = this.f67387c.iterator();
        while (it.hasNext()) {
            C28628a next = it.next();
            if (next.f67390a == hVar) {
                next.f67393d = hVar.f67449a.f67451b.f67686a;
            }
        }
        Iterator<C28628a> it2 = this.f67388d.iterator();
        while (it2.hasNext()) {
            C28628a next2 = it2.next();
            if (next2.f67390a == hVar) {
                next2.f67393d = hVar.f67449a.f67451b.f67686a;
            }
        }
    }

    /* renamed from: a */
    static boolean m57241a(C28628a aVar, C28628a aVar2) {
        if (aVar.f67393d != null || aVar2.f67393d != null) {
            return TextUtils.equals(aVar.f67393d, aVar2.f67393d);
        }
        if (aVar.f67392c == aVar2.f67392c) {
            return true;
        }
        return false;
    }
}
