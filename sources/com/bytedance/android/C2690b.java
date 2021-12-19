package com.bytedance.android;

import android.content.Context;
import android.content.MutableContextWrapper;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.live.p408u.C6204h;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadSetting;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.p2719cv.C40780g;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.LockSupport;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.b */
public final class C2690b {

    /* renamed from: a */
    static final Thread f8045a = Thread.currentThread();

    /* renamed from: b */
    static final ConcurrentHashMap<Integer, C2691a> f8046b = new ConcurrentHashMap<>();

    /* renamed from: c */
    static Context f8047c;

    /* renamed from: d */
    public static final C2690b f8048d = new C2690b();

    /* renamed from: e */
    private static C2692b f8049e;

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.b$b */
    public static final class C2692b extends LayoutInflater {

        /* renamed from: a */
        public static final C2693a f8056a = new C2693a((byte) 0);

        /* renamed from: b */
        private static final String[] f8057b = {"android.widget.", "android.webkit.", "android.app."};

        /* renamed from: com.bytedance.android.b$b$a */
        public static final class C2693a {
            static {
                Covode.recordClassIndex(3082);
            }

            private C2693a() {
            }

            public /* synthetic */ C2693a(byte b) {
                this();
            }
        }

        static {
            Covode.recordClassIndex(3081);
        }

        public C2692b(Context context) {
            super(context);
        }

        public final LayoutInflater cloneInContext(Context context) {
            C89219l.m154721d(context, "");
            return new C2692b(context);
        }

        /* access modifiers changed from: protected */
        @Override // android.view.LayoutInflater
        public final View onCreateView(String str, AttributeSet attributeSet) {
            C89219l.m154721d(str, "");
            C89219l.m154721d(attributeSet, "");
            for (String str2 : f8057b) {
                try {
                    View createView = createView(str, str2, attributeSet);
                    if (createView != null) {
                        return createView;
                    }
                } catch (ClassNotFoundException unused) {
                }
            }
            View onCreateView = super.onCreateView(str, attributeSet);
            C89219l.m154716b(onCreateView, "");
            return onCreateView;
        }
    }

    private C2690b() {
    }

    /* renamed from: a */
    public static void m7786a() {
        f8049e = null;
        f8046b.clear();
        f8047c = null;
    }

    static {
        Covode.recordClassIndex(3079);
    }

    /* renamed from: com.bytedance.android.b$c */
    static final class RunnableC2694c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ int f8058a;

        static {
            Covode.recordClassIndex(3083);
        }

        RunnableC2694c(int i) {
            this.f8058a = i;
        }

        public final void run() {
            View view;
            C2691a aVar = C2690b.f8046b.get(Integer.valueOf(this.f8058a));
            if (aVar == null || aVar.f8051b) {
                C2690b.f8046b.remove(Integer.valueOf(this.f8058a));
                return;
            }
            aVar.f8052c = true;
            C2692b bVar = aVar.f8055f;
            if (bVar != null) {
                view = bVar.inflate(aVar.f8053d, aVar.f8054e, false);
            } else {
                view = null;
            }
            aVar.f8050a = view;
            aVar.f8052c = false;
            if (C2690b.f8047c != null) {
                View view2 = aVar.f8050a;
                if (view2 != null) {
                    C2690b.m7785a(view2);
                }
            } else {
                C2690b.f8046b.remove(Integer.valueOf(this.f8058a));
            }
            LockSupport.unpark(C2690b.f8045a);
            if (aVar.f8051b) {
                C2690b.f8046b.remove(Integer.valueOf(this.f8058a));
            }
        }
    }

    /* renamed from: b */
    public static View m7789b(int i) {
        if (C6204h.m13480b()) {
            return m7790c(i);
        }
        return null;
    }

    /* renamed from: a */
    public static View m7785a(View view) {
        Context context = view.getContext();
        if (!(context instanceof MutableContextWrapper)) {
            context = null;
        }
        MutableContextWrapper mutableContextWrapper = (MutableContextWrapper) context;
        if (mutableContextWrapper != null) {
            mutableContextWrapper.setBaseContext(f8047c);
        }
        return view;
    }

    /* renamed from: c */
    private static View m7790c(int i) {
        C2691a remove = f8046b.remove(Integer.valueOf(i));
        if (remove == null) {
            return null;
        }
        remove.f8051b = true;
        if (remove.f8052c) {
            LockSupport.parkNanos(remove, 20000);
        }
        return remove.f8050a;
    }

    /* renamed from: a */
    public static void m7787a(int i) {
        if (C6204h.m13480b() && LiveLayoutPreloadSetting.INSTANCE.enable()) {
            ConcurrentHashMap<Integer, C2691a> concurrentHashMap = f8046b;
            if (!concurrentHashMap.containsKey(Integer.valueOf(i))) {
                concurrentHashMap.put(Integer.valueOf(i), new C2691a(i, f8049e));
                C40780g.m82246c().submit(new RunnableC2694c(i));
            }
        }
    }

    /* renamed from: a */
    public static void m7788a(Context context) {
        f8047c = context;
        if (context != null) {
            f8049e = new C2692b(new MutableContextWrapper(context));
            Collection<C2691a> values = f8046b.values();
            C89219l.m154716b(values, "");
            Iterator<T> it = values.iterator();
            while (it.hasNext()) {
                View view = it.next().f8050a;
                if (view != null) {
                    m7785a(view);
                }
            }
            return;
        }
        f8046b.clear();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.b$a */
    public static final class C2691a {

        /* renamed from: a */
        public volatile View f8050a;

        /* renamed from: b */
        public volatile boolean f8051b;

        /* renamed from: c */
        public volatile boolean f8052c;

        /* renamed from: d */
        public final int f8053d;

        /* renamed from: e */
        public final ViewGroup f8054e = null;

        /* renamed from: f */
        public final C2692b f8055f;

        static {
            Covode.recordClassIndex(3080);
        }

        public C2691a(int i, C2692b bVar) {
            this.f8053d = i;
            this.f8055f = bVar;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0022  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.view.View m7784a(int r3, android.view.ViewGroup r4) {
        /*
            boolean r1 = com.bytedance.android.live.p408u.C6204h.m13480b()
            r0 = 0
            r2 = 0
            if (r1 == 0) goto L_0x003a
            com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadSetting r0 = com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadSetting.INSTANCE
            boolean r0 = r0.enable()
            if (r0 == 0) goto L_0x003a
            android.view.View r1 = m7790c(r3)
            if (r1 != 0) goto L_0x0039
            com.bytedance.android.b$b r0 = com.bytedance.android.C2690b.f8049e
            if (r0 == 0) goto L_0x0020
            android.view.View r1 = r0.inflate(r3, r4, r2)
        L_0x001e:
            if (r1 != 0) goto L_0x0039
        L_0x0020:
            if (r4 == 0) goto L_0x0028
            android.view.View r1 = com.bytedance.android.livesdk.utils.C11279p.m20000a(r4, r3, r2)
            if (r1 != 0) goto L_0x0039
        L_0x0028:
            android.content.Context r0 = com.bytedance.android.live.core.p218f.C3966y.m9669e()
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)
            android.view.View r1 = com.C1764a.m5927a(r0, r3, r4, r2)
            java.lang.String r0 = ""
            p4600h.p4611f.p4613b.C89219l.m154716b(r1, r0)
        L_0x0039:
            return r1
        L_0x003a:
            com.bytedance.android.b$b r0 = com.bytedance.android.C2690b.f8049e
            if (r0 == 0) goto L_0x0020
            android.view.View r1 = r0.inflate(r3, r4, r2)
            goto L_0x001e
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.C2690b.m7784a(int, android.view.ViewGroup):android.view.View");
    }
}
