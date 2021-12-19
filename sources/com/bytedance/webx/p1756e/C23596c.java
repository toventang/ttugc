package com.bytedance.webx.p1756e;

import com.bytedance.covode.number.Covode;
import com.bytedance.webx.C23557c;
import java.util.Stack;

/* renamed from: com.bytedance.webx.e.c */
public final class C23596c {

    /* renamed from: a */
    public static final ThreadLocal<C23600b> f55855a = new ThreadLocal<C23600b>() {
        /* class com.bytedance.webx.p1756e.C23596c.C235971 */

        /* renamed from: a */
        public C23600b f55857a = new C23600b();

        static {
            Covode.recordClassIndex(27695);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        public final /* bridge */ /* synthetic */ C23600b initialValue() {
            return this.f55857a;
        }
    };

    /* renamed from: b */
    public static final ThreadLocal<C23599a> f55856b = new ThreadLocal<C23599a>() {
        /* class com.bytedance.webx.p1756e.C23596c.C235982 */

        /* renamed from: a */
        public C23599a f55858a = new C23599a();

        static {
            Covode.recordClassIndex(27696);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        public final /* bridge */ /* synthetic */ C23599a initialValue() {
            return this.f55858a;
        }
    };

    /* renamed from: com.bytedance.webx.e.c$a */
    public static class C23599a {

        /* renamed from: a */
        private Stack f55859a = new Stack();

        static {
            Covode.recordClassIndex(27697);
        }

        /* renamed from: a */
        public final void mo39028a() {
            this.f55859a.push(null);
        }

        /* renamed from: b */
        public final void mo39029b() {
            this.f55859a.pop();
        }
    }

    /* renamed from: com.bytedance.webx.e.c$b */
    public static class C23600b {

        /* renamed from: a */
        private Stack<C23557c[]> f55860a = new Stack<>();

        static {
            Covode.recordClassIndex(27698);
        }

        /* renamed from: a */
        public final void mo39030a() {
            this.f55860a.pop();
        }

        /* renamed from: a */
        public final void mo39031a(C23557c[] cVarArr) {
            this.f55860a.push(cVarArr);
        }
    }

    static {
        Covode.recordClassIndex(27694);
    }
}
