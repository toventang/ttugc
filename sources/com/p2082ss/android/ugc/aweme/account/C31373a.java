package com.p2082ss.android.ugc.aweme.account;

import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.account.util.AbstractC33032b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.account.a */
public final class C31373a {

    /* renamed from: a */
    public static final CopyOnWriteArrayList<AbstractC31670g> f75153a = new CopyOnWriteArrayList<>();

    /* renamed from: b */
    public static List<AbstractC33032b> f75154b = new ArrayList();

    /* renamed from: c */
    public static final C31374a f75155c = new C31374a((byte) 0);

    /* renamed from: com.ss.android.ugc.aweme.account.a$a */
    public static final class C31374a {
        static {
            Covode.recordClassIndex(38082);
        }

        private C31374a() {
        }

        /* renamed from: a */
        public static void m65590a() {
            Iterator<T> it = C31373a.f75153a.iterator();
            while (it.hasNext()) {
                it.next().onStart();
            }
        }

        /* renamed from: b */
        private static void m65594b() {
            Iterator<T> it = C31373a.f75153a.iterator();
            while (it.hasNext()) {
                it.next().mo57662a();
            }
        }

        public /* synthetic */ C31374a(byte b) {
            this();
        }

        /* renamed from: a */
        public static void m65593a(List<AbstractC33032b> list) {
            C89219l.m154721d(list, "");
            C31373a.f75154b = list;
        }

        /* renamed from: a */
        public static void m65592a(AbstractC31670g gVar) {
            C89219l.m154721d(gVar, "");
            C31373a.f75153a.add(gVar);
        }

        /* renamed from: b */
        public static void m65595b(AbstractC31670g gVar) {
            C89219l.m154721d(gVar, "");
            C31373a.f75153a.remove(gVar);
        }

        /* renamed from: a */
        public static void m65591a(Bundle bundle) {
            if (!C31373a.f75154b.isEmpty()) {
                C31373a.f75154b.remove(0).mo58835a(bundle);
            } else {
                m65594b();
            }
        }
    }

    static {
        Covode.recordClassIndex(38081);
    }
}
