package com.bytedance.lynx.hybrid.webkit.p1539a.p1540a;

import com.bytedance.covode.number.Covode;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Stack;
import p4600h.C89379q;
import p4600h.C89382r;
import p4600h.p4611f.p4613b.C89219l;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.lynx.hybrid.webkit.a.a.f */
public final class C21385f {

    /* renamed from: a */
    public static final C21387b f50740a = new C21387b();

    /* renamed from: b */
    public static final C21386a f50741b = new C21386a((byte) 0);

    /* renamed from: com.bytedance.lynx.hybrid.webkit.a.a.f$a */
    public static final class C21386a {
        static {
            Covode.recordClassIndex(25006);
        }

        /* renamed from: a */
        public static Object m40155a(String str) {
            Object obj;
            Stack stack;
            C89219l.m154719c(str, "");
            try {
                Map map = (Map) C21385f.f50740a.get();
                obj = C89379q.m157068constructorimpl((map == null || (stack = (Stack) map.get(str)) == null) ? null : stack.pop());
            } catch (Throwable th) {
                obj = C89379q.m157068constructorimpl(C89382r.m154941a(th));
            }
            if (C89379q.m157073isFailureimpl(obj)) {
                return null;
            }
            return obj;
        }

        /* renamed from: b */
        public static Object m40156b(String str) {
            Object obj;
            Stack stack;
            C89219l.m154719c(str, "");
            try {
                Map map = (Map) C21385f.f50740a.get();
                obj = C89379q.m157068constructorimpl((map == null || (stack = (Stack) map.get(str)) == null) ? null : stack.peek());
            } catch (Throwable th) {
                obj = C89379q.m157068constructorimpl(C89382r.m154941a(th));
            }
            if (C89379q.m157073isFailureimpl(obj)) {
                return null;
            }
            return obj;
        }

        private C21386a() {
        }

        public /* synthetic */ C21386a(byte b) {
            this();
        }
    }

    /* renamed from: com.bytedance.lynx.hybrid.webkit.a.a.f$b */
    public static final class C21387b extends ThreadLocal<Map<String, Stack<Object>>> {
        static {
            Covode.recordClassIndex(25007);
        }

        C21387b() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // java.lang.ThreadLocal
        public final /* synthetic */ Map<String, Stack<Object>> initialValue() {
            return new LinkedHashMap();
        }
    }

    static {
        Covode.recordClassIndex(25005);
    }
}
