package com.p2082ss.android.ugc.aweme.model;

import com.bytedance.covode.number.Covode;
import java.util.LinkedList;
import java.util.Queue;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.model.b */
public final class C60140b {

    /* renamed from: a */
    public static final Queue<C60103a> f137081a = new LinkedList();

    /* renamed from: b */
    public static final C60140b f137082b = new C60140b();

    private C60140b() {
    }

    /* renamed from: a */
    public static boolean m109602a() {
        return f137081a.isEmpty();
    }

    static {
        Covode.recordClassIndex(70667);
    }

    /* renamed from: b */
    public static void m109603b() {
        Queue<C60103a> queue = f137081a;
        if (!queue.isEmpty()) {
            queue.peek().f136975a.invoke();
        }
    }

    /* renamed from: c */
    public static void m109604c() {
        Queue<C60103a> queue = f137081a;
        queue.remove();
        if (!queue.isEmpty()) {
            queue.peek().f136975a.invoke();
        }
    }

    /* renamed from: a */
    public static void m109601a(C60103a aVar) {
        C89219l.m154721d(aVar, "");
        Queue<C60103a> queue = f137081a;
        queue.add(aVar);
        if (queue.size() == 1) {
            queue.peek().f136975a.invoke();
        }
    }
}
