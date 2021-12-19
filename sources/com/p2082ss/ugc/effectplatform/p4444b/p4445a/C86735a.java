package com.p2082ss.ugc.effectplatform.p4444b.p4445a;

import com.bytedance.covode.number.Covode;
import com.p2082ss.ugc.effectplatform.util.C86994k;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import p4519d.p4520a.p4521a.C87988a;
import p4519d.p4520a.p4521a.C87989b;
import p4519d.p4520a.p4522b.C87991a;
import p4519d.p4520a.p4522b.C87993b;
import p4519d.p4520a.p4522b.p4524b.C87994a;
import p4519d.p4520a.p4522b.p4525c.C88003f;
import p4519d.p4520a.p4530d.p4531a.AbstractC88054k;
import p4519d.p4520a.p4530d.p4531a.C88044c;
import p4519d.p4520a.p4530d.p4531a.C88045d;
import p4519d.p4520a.p4530d.p4531a.C88049f;
import p4519d.p4520a.p4530d.p4531a.C88050g;
import p4519d.p4520a.p4530d.p4531a.C88051h;
import p4519d.p4520a.p4530d.p4531a.C88053j;
import p4519d.p4520a.p4530d.p4531a.C88055l;
import p4519d.p4520a.p4530d.p4531a.C88056m;
import p4519d.p4520a.p4530d.p4531a.EnumC88043b;
import p4519d.p4520a.p4530d.p4531a.EnumC88052i;
import p4519d.p4520a.p4532e.C88060b;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89350l;

/* renamed from: com.ss.ugc.effectplatform.b.a.a */
public final class C86735a {

    /* renamed from: i */
    public static final C86736a f195581i = new C86736a((byte) 0);

    /* renamed from: t */
    private static final C89350l f195582t = new C89350l("[a-z0-9_-]{1,120}");

    /* renamed from: a */
    public final C88051h f195583a;

    /* renamed from: b */
    public final C88051h f195584b;

    /* renamed from: c */
    public C87991a<Integer> f195585c;

    /* renamed from: d */
    public final C88003f f195586d;

    /* renamed from: e */
    public C87991a<Boolean> f195587e;

    /* renamed from: f */
    public C87991a<Boolean> f195588f;

    /* renamed from: g */
    public final String f195589g;

    /* renamed from: h */
    public final int f195590h;

    /* renamed from: j */
    private final C88051h f195591j;

    /* renamed from: k */
    private C87991a<Long> f195592k;

    /* renamed from: l */
    private C87991a<C88056m> f195593l;

    /* renamed from: m */
    private C87991a<Long> f195594m;

    /* renamed from: n */
    private final C87989b<String, C86739c> f195595n;

    /* renamed from: o */
    private final C87994a f195596o;

    /* renamed from: p */
    private final Runnable f195597p;

    /* renamed from: q */
    private final int f195598q;

    /* renamed from: r */
    private long f195599r;

    /* renamed from: s */
    private final AbstractC86744d f195600s;

    /* renamed from: com.ss.ugc.effectplatform.b.a.a$a */
    public static final class C86736a {
        static {
            Covode.recordClassIndex(102435);
        }

        private C86736a() {
        }

        public /* synthetic */ C86736a(byte b) {
            this();
        }

        /* renamed from: a */
        private static void m150259a(C88051h hVar) {
            if (C88045d.m153110b(hVar) && !C88045d.m153114c(hVar)) {
                throw new C88053j("delete file exception occur,file = ".concat(String.valueOf(hVar)));
            }
        }

        /* renamed from: a */
        public static String m150258a(String str) {
            C89219l.m154719c(str, "");
            char[] cArr = new char[str.length()];
            int length = str.length();
            for (int i = 0; i < length; i++) {
                cArr[i] = str.charAt(i);
                char c = cArr[i];
                if (!(c == '_' || c == '-' || ((c >= 'a' && c <= 'z') || (c >= '0' && c <= '9')))) {
                    cArr[i] = '_';
                }
            }
            return new String(cArr);
        }

        /* renamed from: a */
        public static void m150260a(C88051h hVar, C88051h hVar2, boolean z) {
            if (z) {
                m150259a(hVar2);
            }
            if (!C88045d.m153107a(hVar, hVar2)) {
                throw new C88053j("rename file exception occur, from = " + hVar + ",to = " + hVar2);
            }
        }

        /* renamed from: a */
        public static C86735a m150257a(String str, int i, int i2, long j, AbstractC86744d dVar) {
            C88051h a;
            C89219l.m154719c(str, "");
            if (j <= 0) {
                throw new IllegalArgumentException("maxSize <= 0");
            } else if (i2 > 0) {
                if (!C88045d.m153118f(str)) {
                    C88045d.m153117e(str);
                    if (!C88045d.m153118f(str)) {
                        C88060b.m153136a("DiskLruCache", "Cache directory error".concat(String.valueOf(str)), null);
                    }
                }
                C88051h a2 = new C88051h(str).mo142616a("journal.bkp");
                if (a2 != null && C88045d.m153110b(a2) && (a = new C88051h(str).mo142616a("journal")) != null && C88045d.m153110b(a)) {
                    if (C88045d.m153110b(a)) {
                        C88045d.m153114c(a2);
                    } else {
                        m150260a(a2, a, false);
                    }
                }
                C86735a aVar = new C86735a(str, i, i2, j, dVar, (byte) 0);
                if (C88045d.m153110b(aVar.f195583a)) {
                    try {
                        aVar.mo139979b();
                        aVar.mo139981c();
                        aVar.f195587e.f199870a = (V) true;
                        return aVar;
                    } catch (Exception e) {
                        C88060b.m153136a("DiskLruCache", "DiskLruCache " + str + " is corrupt: " + e.getMessage() + ", removing", null);
                        aVar.mo139986e();
                    }
                }
                C88045d.m153117e(str);
                C86735a aVar2 = new C86735a(str, i, i2, j, dVar, (byte) 0);
                aVar2.mo139984d();
                return aVar2;
            } else {
                throw new IllegalArgumentException("valueCount <= 0");
            }
        }
    }

    /* renamed from: com.ss.ugc.effectplatform.b.a.a$b */
    public final class C86737b {

        /* renamed from: a */
        public final C87991a<boolean[]> f195601a;

        /* renamed from: b */
        public C87991a<Boolean> f195602b = new C87991a<>(false);

        /* renamed from: c */
        public final C86739c f195603c;

        /* renamed from: d */
        final /* synthetic */ C86735a f195604d;

        /* renamed from: e */
        private C87991a<Boolean> f195605e = new C87991a<>(false);

        static {
            Covode.recordClassIndex(102436);
        }

        /* renamed from: c */
        public final void mo139991c() {
            this.f195604d.mo139977a(this, false);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: com.ss.ugc.effectplatform.b.a.a$b$a */
        public static final class C86738a extends AbstractC89220m implements AbstractC89171a<C89391z> {

            /* renamed from: a */
            final /* synthetic */ C86737b f195606a;

            /* renamed from: b */
            final /* synthetic */ int f195607b = 0;

            static {
                Covode.recordClassIndex(102437);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C86738a(C86737b bVar) {
                super(0);
                this.f195606a = bVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // p4600h.p4611f.p4612a.AbstractC89171a
            public final /* synthetic */ C89391z invoke() {
                this.f195606a.f195602b.f199870a = (V) true;
                return C89391z.f203057a;
            }
        }

        /* renamed from: b */
        public final void mo139990b() {
            if (this.f195602b.f199870a.booleanValue()) {
                this.f195604d.mo139977a(this, false);
                this.f195604d.mo139982c(this.f195603c.f195612e);
            } else {
                this.f195604d.mo139977a(this, true);
            }
            this.f195605e.f199870a = (V) true;
        }

        /* JADX DEBUG: Failed to insert an additional move for type inference into block B:10:0x0040 */
        /* JADX DEBUG: Multi-variable search result rejected for r2v2, resolved type: boolean */
        /* JADX DEBUG: Multi-variable search result rejected for r1v9, resolved type: boolean[] */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v0 */
        /* JADX WARN: Type inference failed for: r2v4, types: [d.a.d.a.g] */
        /* renamed from: a */
        public final C88050g mo139989a() {
            C88050g gVar;
            boolean z = 0;
            if (this.f195604d.f195590h > 0) {
                C88003f fVar = this.f195604d.f195586d;
                fVar.f199879a.lock();
                try {
                    if (C89219l.m154714a((Object) this.f195603c.f195610c.f199870a, (Object) this)) {
                        if (!this.f195603c.f195609b.f199870a.booleanValue()) {
                            boolean[] zArr = new boolean[this.f195604d.f195590h];
                            zArr[0] = true;
                            this.f195601a.f199870a = zArr;
                        }
                        C88051h b = this.f195603c.mo139995b(0);
                        try {
                            z = C88045d.m153101a(b, false);
                            gVar = z;
                        } catch (Exception unused) {
                            C88045d.m153117e(this.f195604d.f195589g);
                            try {
                                gVar = C88045d.m153101a(b, z);
                            } catch (Exception unused2) {
                                C86742b bVar = new C86742b();
                                fVar.f199879a.unlock();
                                return bVar;
                            }
                        }
                        if (gVar == null) {
                            C89219l.m154707a();
                        }
                        return new C86743c(gVar, new C86738a(this));
                    }
                    throw new IllegalStateException("Check failed.".toString());
                } finally {
                    fVar.f199879a.unlock();
                }
            } else {
                throw new IllegalArgumentException(("Expected index 0 to be greater than 0 and less than the maximum value count of " + this.f195604d.f195590h).toString());
            }
        }

        public C86737b(C86735a aVar, C86739c cVar) {
            C89219l.m154719c(cVar, "");
            this.f195604d = aVar;
            this.f195603c = cVar;
            this.f195601a = new C87991a<>(new boolean[aVar.f195590h]);
        }
    }

    /* renamed from: k */
    private final boolean m150242k() {
        return this.f195588f.f199870a.booleanValue();
    }

    /* renamed from: l */
    private final void m150243l() {
        if (m150242k()) {
            throw new IllegalStateException("cache is closed");
        }
    }

    /* renamed from: com.ss.ugc.effectplatform.b.a.a$d */
    public final class C86740d implements AbstractC88054k {

        /* renamed from: a */
        public final C88051h[] f195614a;

        /* renamed from: b */
        public final C88044c[] f195615b;

        /* renamed from: c */
        final /* synthetic */ C86735a f195616c;

        /* renamed from: d */
        private final long[] f195617d;

        /* renamed from: e */
        private final String f195618e;

        /* renamed from: f */
        private final long f195619f;

        static {
            Covode.recordClassIndex(102439);
        }

        @Override // p4519d.p4520a.p4530d.p4531a.AbstractC88054k
        /* renamed from: a */
        public final void mo139996a() {
            C88044c[] cVarArr = this.f195615b;
            for (C88044c cVar : cVarArr) {
                if (cVar != null) {
                    C88045d.m153106a((AbstractC88054k) cVar);
                }
            }
        }

        public C86740d(C86735a aVar, String str, long j, C88051h[] hVarArr, C88044c[] cVarArr, long[] jArr) {
            C89219l.m154719c(str, "");
            C89219l.m154719c(hVarArr, "");
            C89219l.m154719c(cVarArr, "");
            C89219l.m154719c(jArr, "");
            this.f195616c = aVar;
            this.f195618e = str;
            this.f195619f = j;
            this.f195614a = hVarArr;
            this.f195615b = cVarArr;
            this.f195617d = jArr;
        }
    }

    static {
        Covode.recordClassIndex(102434);
    }

    /* renamed from: i */
    private long m150240i() {
        C88003f fVar = this.f195586d;
        fVar.f199879a.lock();
        try {
            return this.f195599r;
        } finally {
            fVar.f199879a.unlock();
        }
    }

    /* renamed from: e */
    public final void mo139986e() {
        m150239h();
        if (C86994k.m150676c(this.f195589g)) {
            C88045d.m153117e(this.f195589g);
        }
    }

    /* renamed from: a */
    public final Set<String> mo139976a() {
        C88003f fVar = this.f195586d;
        fVar.f199879a.lock();
        try {
            return C89070n.m154592l(new LinkedHashSet(this.f195595n.keySet()));
        } finally {
            fVar.f199879a.unlock();
        }
    }

    /* renamed from: g */
    public final boolean mo139988g() {
        if (this.f195585c.f199870a.intValue() < 2000 || this.f195585c.f199870a.intValue() < this.f195595n.size()) {
            return false;
        }
        return true;
    }

    /* renamed from: com.ss.ugc.effectplatform.b.a.a$c */
    public final class C86739c {

        /* renamed from: a */
        public final C87988a<Long> f195608a = new C87988a<>();

        /* renamed from: b */
        public C87991a<Boolean> f195609b;

        /* renamed from: c */
        public C87991a<C86737b> f195610c;

        /* renamed from: d */
        public C87991a<Long> f195611d;

        /* renamed from: e */
        public final String f195612e;

        /* renamed from: f */
        final /* synthetic */ C86735a f195613f;

        static {
            Covode.recordClassIndex(102438);
        }

        /* renamed from: a */
        public final String mo139993a() {
            StringBuilder sb = new StringBuilder();
            Iterator<Long> it = this.f195608a.iterator();
            while (it.hasNext()) {
                sb.append(' ').append(it.next().longValue());
            }
            String sb2 = sb.toString();
            C89219l.m154709a((Object) sb2, "");
            return sb2;
        }

        /* renamed from: b */
        private static C88053j m150264b(String[] strArr) {
            throw new Exception("unexpected journal line: ".concat(String.valueOf(strArr)));
        }

        /* renamed from: a */
        public final C88051h mo139992a(int i) {
            if (i == 0) {
                return new C88051h(this.f195613f.f195589g).mo142616a(this.f195612e);
            }
            return new C88051h(this.f195613f.f195589g).mo142616a(this.f195612e + '.' + i);
        }

        /* renamed from: b */
        public final C88051h mo139995b(int i) {
            if (i == 0) {
                return new C88051h(this.f195613f.f195589g).mo142616a(this.f195612e + ".tmp");
            }
            return new C88051h(this.f195613f.f195589g).mo142616a(this.f195612e + '.' + i + ".tmp");
        }

        /* renamed from: a */
        public final void mo139994a(String[] strArr) {
            C89219l.m154719c(strArr, "");
            if (strArr.length == this.f195613f.f195590h) {
                try {
                    int length = strArr.length;
                    for (int i = 0; i < length; i++) {
                        this.f195608a.set(i, Long.valueOf(Long.parseLong(strArr[i])));
                    }
                } catch (NumberFormatException unused) {
                    throw m150264b(strArr);
                }
            } else {
                throw m150264b(strArr);
            }
        }

        public C86739c(C86735a aVar, String str) {
            C89219l.m154719c(str, "");
            this.f195613f = aVar;
            this.f195612e = str;
            this.f195609b = new C87991a<>(false);
            this.f195610c = new C87991a<>(null);
            this.f195611d = new C87991a<>(0L);
            int i = aVar.f195590h;
            for (int i2 = 0; i2 < i; i2++) {
                this.f195608a.add(0L);
            }
        }
    }

    /* renamed from: com.ss.ugc.effectplatform.b.a.a$e */
    public static final class RunnableC86741e implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C86735a f195620a;

        static {
            Covode.recordClassIndex(102440);
        }

        public final void run() {
            boolean z;
            C88003f fVar = this.f195620a.f195586d;
            fVar.f199879a.lock();
            try {
                if (!this.f195620a.f195587e.f199870a.booleanValue()) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z && !this.f195620a.f195588f.f199870a.booleanValue()) {
                    this.f195620a.mo139987f();
                    if (this.f195620a.mo139988g()) {
                        this.f195620a.mo139984d();
                        this.f195620a.f195585c.f199870a = (V) 0;
                    }
                    fVar.f199879a.unlock();
                }
            } finally {
                fVar.f199879a.unlock();
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        RunnableC86741e(C86735a aVar) {
            this.f195620a = aVar;
        }
    }

    /* renamed from: h */
    private void m150239h() {
        C88003f fVar = this.f195586d;
        fVar.f199879a.lock();
        try {
            if (!this.f195587e.f199870a.booleanValue() || this.f195588f.f199870a.booleanValue()) {
                this.f195588f.f199870a = (V) true;
                return;
            }
            Iterator it = new ArrayList(this.f195595n.values()).iterator();
            while (it.hasNext()) {
                V v = ((C86739c) it.next()).f195610c.f199870a;
                if (v != null) {
                    v.mo139991c();
                }
            }
            mo139987f();
            V v2 = this.f195593l.f199870a;
            if (v2 != null) {
                v2.mo139996a();
            }
            C87993b.m153065a(this.f195593l, null);
            this.f195588f.f199870a = (V) true;
            fVar.f199879a.unlock();
        } finally {
            fVar.f199879a.unlock();
        }
    }

    /* renamed from: c */
    public final void mo139981c() {
        C88045d.m153114c(this.f195591j);
        Iterator<C86739c> it = this.f195595n.values().iterator();
        while (it.hasNext()) {
            C86739c next = it.next();
            int i = 0;
            if (next.f195610c.f199870a == null) {
                int i2 = this.f195590h;
                while (i < i2) {
                    C87991a<Long> aVar = this.f195592k;
                    aVar.f199870a = (V) Long.valueOf(aVar.f199870a.longValue() + next.f195608a.get(i).longValue());
                    i++;
                }
            } else {
                next.f195610c.f199870a = null;
                int i3 = this.f195590h;
                while (i < i3) {
                    C86994k.m150671a(next.mo139992a(i));
                    C86994k.m150671a(next.mo139995b(i));
                    i++;
                }
                it.remove();
            }
        }
    }

    /* renamed from: f */
    public final void mo139987f() {
        Map.Entry<String, C86739c> next;
        while (this.f195592k.f199870a.longValue() > this.f195599r) {
            int size = this.f195595n.size();
            int i = 0;
            Iterator<Map.Entry<String, C86739c>> it = this.f195595n.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                next = it.next();
                AbstractC86744d dVar = this.f195600s;
                if (dVar != null && dVar.mo140000a(next.getKey())) {
                    i++;
                }
            }
            if (size - i < 10) {
                long i2 = m150240i() * 2;
                C88003f fVar = this.f195586d;
                fVar.f199879a.lock();
                try {
                    this.f195599r = i2;
                    if (this.f195587e.f199870a.booleanValue()) {
                        this.f195596o.execute(this.f195597p);
                    }
                } finally {
                    fVar.f199879a.unlock();
                }
            }
            mo139982c(next.getKey());
        }
    }

    /* renamed from: j */
    private final void m150241j() {
        if (!this.f195587e.f199870a.booleanValue()) {
            C88003f fVar = this.f195586d;
            fVar.f199879a.lock();
            try {
                if (C88045d.m153110b(this.f195584b)) {
                    if (!C88045d.m153110b(this.f195583a)) {
                        C86736a.m150260a(this.f195584b, this.f195583a, false);
                    } else if (C88045d.m153114c(this.f195584b) && C88045d.m153110b(this.f195584b)) {
                        throw new C88053j("failed to delete " + this.f195584b);
                    }
                }
                if (C88045d.m153110b(this.f195583a)) {
                    try {
                        mo139979b();
                        mo139981c();
                        this.f195587e.f199870a = (V) true;
                        return;
                    } catch (C88053j e) {
                        C88060b.m153136a("DiskLruCache", "DiskLruCache " + this.f195589g + " is corrupt: " + e.getMessage() + ", removing", null);
                        mo139986e();
                        this.f195588f.f199870a = (V) false;
                    } catch (Throwable th) {
                        this.f195588f.f199870a = (V) false;
                        throw th;
                    }
                }
                mo139984d();
                this.f195587e.f199870a = (V) true;
                fVar.f199879a.unlock();
            } finally {
                fVar.f199879a.unlock();
            }
        }
    }

    /* renamed from: b */
    public final void mo139979b() {
        C88044c d = C88045d.m153115d(this.f195583a);
        if (d != null) {
            int i = 0;
            C86745e eVar = new C86745e(d, EnumC88043b.Ascii, (byte) 0);
            try {
                String b = eVar.mo140001b();
                String b2 = eVar.mo140001b();
                String b3 = eVar.mo140001b();
                String b4 = eVar.mo140001b();
                String b5 = eVar.mo140001b();
                if ((!C89219l.m154714a((Object) "libcore.io.DiskLruCache", (Object) b)) || (!C89219l.m154714a((Object) "1", (Object) b2)) || (!C89219l.m154714a((Object) String.valueOf(this.f195598q), (Object) b3)) || (!C89219l.m154714a((Object) String.valueOf(this.f195590h), (Object) b4)) || (!C89219l.m154714a((Object) b5, (Object) ""))) {
                    throw new C88053j("unexpected journal header: [" + b + ", " + b2 + ", " + b4 + ", " + b5 + "]");
                }
                while (true) {
                    try {
                        String b6 = eVar.mo140001b();
                        if (b6 != null) {
                            if (!m150236f(b6)) {
                                break;
                            }
                            i++;
                        } else {
                            break;
                        }
                    } catch (Exception unused) {
                    }
                }
                this.f195585c.f199870a = (V) Integer.valueOf(i - this.f195595n.size());
                if (eVar.mo140002c()) {
                    mo139984d();
                } else {
                    C87991a<C88056m> aVar = this.f195593l;
                    C88050g a = C88045d.m153101a(this.f195583a, true);
                    if (a == null) {
                        C89219l.m154707a();
                    }
                    C87993b.m153065a(aVar, new C88055l(a, EnumC88043b.Ascii));
                }
                C88045d.m153106a(eVar);
            } catch (Exception e) {
                throw e;
            } catch (Throwable th) {
                C88045d.m153106a(eVar);
                throw th;
            }
        }
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: d */
    public final void mo139984d() {
        C88050g gVar;
        C88003f fVar = this.f195586d;
        fVar.f199879a.lock();
        try {
            V v = this.f195593l.f199870a;
            if (v != null) {
                v.f199970a.close();
            }
            try {
                gVar = C88045d.m153101a(this.f195591j, false);
            } catch (Exception unused) {
                C88051h hVar = this.f195591j;
                C89219l.m154719c(hVar, "");
                String str = hVar.f199967a;
                if (str != null) {
                    C89219l.m154719c(str, "");
                    new File(str).getAbsoluteFile().createNewFile();
                }
                gVar = C88045d.m153101a(this.f195591j, false);
            }
            if (gVar != null) {
                C88055l lVar = new C88055l(gVar, EnumC88043b.Ascii);
                try {
                    lVar.mo142619a("libcore.io.DiskLruCache");
                    lVar.mo142619a("\n");
                    lVar.mo142619a("1");
                    lVar.mo142619a("\n");
                    lVar.mo142619a(String.valueOf(this.f195598q));
                    lVar.mo142619a("\n");
                    lVar.mo142619a(String.valueOf(this.f195590h));
                    lVar.mo142619a("\n");
                    lVar.mo142619a("\n");
                    for (C86739c cVar : this.f195595n.values()) {
                        if (cVar.f195610c.f199870a != null) {
                            lVar.mo142619a("DIRTY " + cVar.f195612e + '\n');
                        } else {
                            lVar.mo142619a("CLEAN " + cVar.f195612e + cVar.mo139993a() + '\n');
                        }
                    }
                    lVar.mo139996a();
                    if (C88045d.m153110b(this.f195583a)) {
                        C86736a.m150260a(this.f195583a, this.f195584b, true);
                    }
                    C86736a.m150260a(this.f195591j, this.f195583a, false);
                    C88045d.m153114c(this.f195584b);
                    C87991a<C88056m> aVar = this.f195593l;
                    C88050g a = C88045d.m153101a(this.f195583a, true);
                    if (a == null) {
                        C89219l.m154707a();
                    }
                    C87993b.m153065a(aVar, new C88055l(a, EnumC88043b.Ascii));
                    fVar.f199879a.unlock();
                } catch (Throwable th) {
                    lVar.mo139996a();
                    throw th;
                }
            }
        } finally {
            fVar.f199879a.unlock();
        }
    }

    /* renamed from: g */
    private static boolean m150237g(String str) {
        return f195582t.matches(str);
    }

    /* renamed from: e */
    public final C86737b mo139985e(String str) {
        if (str == null) {
            return null;
        }
        return m150238h(str);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00a6, code lost:
        if (r6 == -1) goto L_0x00a8;
     */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean m150236f(java.lang.String r12) {
        /*
        // Method dump skipped, instructions count: 191
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.ugc.effectplatform.p4444b.p4445a.C86735a.m150236f(java.lang.String):boolean");
    }

    /* renamed from: h */
    private C86737b m150238h(String str) {
        C88003f fVar = this.f195586d;
        fVar.f199879a.lock();
        try {
            m150241j();
            m150243l();
            if (m150237g(str)) {
                C86739c cVar = this.f195595n.get(str);
                if (cVar == null) {
                    cVar = new C86739c(this, str);
                    this.f195595n.put(str, cVar);
                } else if (cVar.f195610c.f199870a != null) {
                    C88060b.m153135a("DiskLruCache", "key: " + str + " is now in editing, return null!");
                    fVar.f199879a.unlock();
                    return null;
                }
                V v = (V) new C86737b(this, cVar);
                cVar.f195610c.f199870a = v;
                V v2 = this.f195593l.f199870a;
                if (v2 != null) {
                    v2.mo142619a("DIRTY " + str + '\n');
                }
                V v3 = this.f195593l.f199870a;
                if (v3 != null) {
                    v3.f199970a.flush();
                }
                return v;
            }
            throw new IllegalArgumentException("keys must match regex [a-z0-9_-]{1,120}: \"" + str + "\"");
        } finally {
            fVar.f199879a.unlock();
        }
    }

    /* renamed from: c */
    public final boolean mo139982c(String str) {
        if (str == null) {
            return false;
        }
        C88003f fVar = this.f195586d;
        fVar.f199879a.lock();
        try {
            m150241j();
            m150243l();
            if (m150237g(str)) {
                C86739c cVar = this.f195595n.get(str);
                if (cVar != null) {
                    if (cVar.f195610c.f199870a == null) {
                        C87991a<Integer> aVar = this.f195585c;
                        aVar.f199870a = (V) Integer.valueOf(aVar.f199870a.intValue() + 1);
                        V v = this.f195593l.f199870a;
                        if (v != null) {
                            v.mo142618a("REMOVE " + str + '\n');
                        }
                        V v2 = this.f195593l.f199870a;
                        if (v2 != null) {
                            v2.f199970a.flush();
                        }
                        this.f195595n.remove(str);
                        int i = this.f195590h;
                        for (int i2 = 0; i2 < i; i2++) {
                            C88051h a = cVar.mo139992a(i2);
                            try {
                                C86994k.m150671a(a);
                                C87991a<Long> aVar2 = this.f195592k;
                                aVar2.f199870a = (V) Long.valueOf(aVar2.f199870a.longValue() - cVar.f195608a.get(i2).longValue());
                                cVar.f195608a.set(i2, 0L);
                            } catch (Exception unused) {
                                throw new Exception("failed to delete ".concat(String.valueOf(a)));
                            }
                        }
                        if (mo139988g()) {
                            this.f195596o.execute(this.f195597p);
                        }
                        fVar.f199879a.unlock();
                        return true;
                    }
                }
                return false;
            }
            throw new IllegalArgumentException("keys must match regex [a-z0-9_-]{1,120}: \"" + str + "\"");
        } finally {
            fVar.f199879a.unlock();
        }
    }

    /* renamed from: d */
    public final C86740d mo139983d(String str) {
        C88044c cVar;
        if (str == null) {
            return null;
        }
        C88003f fVar = this.f195586d;
        fVar.f199879a.lock();
        try {
            m150241j();
            m150243l();
            if (m150237g(str)) {
                C86739c cVar2 = this.f195595n.get(str);
                if (cVar2 == null) {
                    return null;
                }
                if (!cVar2.f195609b.f199870a.booleanValue()) {
                    fVar.f199879a.unlock();
                    return null;
                }
                int i = this.f195590h;
                C88044c[] cVarArr = new C88044c[i];
                C88051h[] hVarArr = new C88051h[i];
                int i2 = 0;
                for (int i3 = 0; i3 < i; i3++) {
                    try {
                        hVarArr[i3] = cVar2.mo139992a(i3);
                        C88051h hVar = hVarArr[i3];
                        if (hVar != null) {
                            cVarArr[i3] = C88045d.m153115d(hVar);
                        }
                    } catch (Exception unused) {
                        while (i2 < this.f195590h && (cVar = cVarArr[i2]) != null) {
                            C88045d.m153106a((AbstractC88054k) cVar);
                            i2++;
                        }
                        fVar.f199879a.unlock();
                        return null;
                    }
                }
                C87991a<Integer> aVar = this.f195585c;
                aVar.f199870a = (V) Integer.valueOf(aVar.f199870a.intValue() + 1);
                V v = this.f195593l.f199870a;
                if (v != null) {
                    v.mo142618a("READ " + str + '\n');
                }
                if (mo139988g()) {
                    this.f195596o.execute(this.f195597p);
                }
                C86740d dVar = new C86740d(this, str, cVar2.f195611d.f199870a.longValue(), hVarArr, cVarArr, C89070n.m154582f((Collection<Long>) cVar2.f195608a));
                fVar.f199879a.unlock();
                return dVar;
            }
            mo139982c(str);
            throw new IllegalArgumentException("keys must match regex [a-z0-9_-]{1,120}: \"" + str + "\"");
        } finally {
            fVar.f199879a.unlock();
        }
    }

    /* renamed from: b */
    public final boolean mo139980b(String str) {
        if (str == null) {
            return false;
        }
        C88003f fVar = this.f195586d;
        fVar.f199879a.lock();
        try {
            m150243l();
            if (m150237g(str)) {
                C86739c cVar = this.f195595n.get(str);
                if (cVar == null) {
                    return false;
                }
                if (!cVar.f195609b.f199870a.booleanValue()) {
                    fVar.f199879a.unlock();
                    return false;
                }
                try {
                    C87991a<Integer> aVar = this.f195585c;
                    aVar.f199870a = (V) Integer.valueOf(aVar.f199870a.intValue() + 1);
                    V v = this.f195593l.f199870a;
                    if (v != null) {
                        v.mo142619a("READ " + str + '\n');
                    }
                    V v2 = this.f195593l.f199870a;
                    if (v2 != null) {
                        v2.f199970a.flush();
                    }
                    if (mo139988g()) {
                        this.f195596o.execute(this.f195597p);
                    }
                } catch (Exception unused) {
                }
                fVar.f199879a.unlock();
                return true;
            }
            throw new IllegalArgumentException("keys must match regex [a-z0-9_-]{1,120}: \"" + str + "\"");
        } finally {
            fVar.f199879a.unlock();
        }
    }

    /* renamed from: a */
    public final boolean mo139978a(String str) {
        long j;
        String str2;
        Long l;
        C89219l.m154719c(str, "");
        C88003f fVar = this.f195586d;
        fVar.f199879a.lock();
        try {
            m150243l();
            if (m150237g(str)) {
                C86739c cVar = this.f195595n.get(str);
                boolean z = false;
                if (cVar == null) {
                    cVar = new C86739c(this, str);
                    this.f195595n.put(str, cVar);
                } else if (cVar.f195610c.f199870a != null) {
                    fVar.f199879a.unlock();
                    return false;
                }
                C88051h a = cVar.mo139992a(0);
                if (C88045d.m153110b(a)) {
                    long longValue = cVar.f195608a.get(0).longValue();
                    C88049f a2 = C88045d.m153099a(a);
                    if (a2 == null || (l = a2.f199964f) == null) {
                        j = 0;
                    } else {
                        j = l.longValue();
                    }
                    if (a2 != null && a2.f199965g == EnumC88052i.Directory) {
                        if (a != null) {
                            str2 = a.f199967a;
                        } else {
                            str2 = null;
                        }
                        j = C86994k.m150669a(str2);
                    }
                    cVar.f195608a.set(0, Long.valueOf(j));
                    C87991a<Long> aVar = this.f195592k;
                    aVar.f199870a = (V) Long.valueOf((aVar.f199870a.longValue() - longValue) + j);
                    C87991a<Integer> aVar2 = this.f195585c;
                    aVar2.f199870a = (V) Integer.valueOf(aVar2.f199870a.intValue() + 1);
                    cVar.f195610c.f199870a = null;
                    cVar.f195609b.f199870a = (V) true;
                    V v = this.f195593l.f199870a;
                    if (v != null) {
                        v.mo142619a("CLEAN " + cVar.f195612e + cVar.mo139993a() + '\n');
                    }
                    C87991a<Long> aVar3 = this.f195594m;
                    aVar3.f199870a = (V) Long.valueOf(aVar3.f199870a.longValue() + 1);
                    cVar.f195611d.f199870a = this.f195594m.f199870a;
                    V v2 = this.f195593l.f199870a;
                    if (v2 != null) {
                        v2.f199970a.flush();
                    }
                    if (this.f195592k.f199870a.longValue() > this.f195599r || mo139988g()) {
                        this.f195596o.execute(this.f195597p);
                    }
                    z = true;
                } else {
                    this.f195595n.remove(cVar.f195612e);
                    V v3 = this.f195593l.f199870a;
                    if (v3 != null) {
                        v3.mo142619a("REMOVE " + cVar.f195612e + '\n');
                    }
                }
                return z;
            }
            throw new IllegalArgumentException("keys must match regex [a-z0-9_-]{1,120}: \"" + str + "\"");
        } finally {
            fVar.f199879a.unlock();
        }
    }

    /* renamed from: a */
    public final void mo139977a(C86737b bVar, boolean z) {
        long j;
        Long l;
        C88003f fVar = this.f195586d;
        fVar.f199879a.lock();
        try {
            C86739c cVar = bVar.f195603c;
            if (!(!C89219l.m154714a((Object) cVar.f195610c.f199870a, (Object) bVar))) {
                if (z && !cVar.f195609b.f199870a.booleanValue()) {
                    int i = this.f195590h;
                    for (int i2 = 0; i2 < i; i2++) {
                        if (!((boolean[]) bVar.f195601a.f199870a)[i2]) {
                            bVar.mo139991c();
                            throw new IllegalStateException("Newly created entry didn't create value for index ".concat(String.valueOf(i2)));
                        } else if (cVar.mo139995b(i2) != null && !C88045d.m153110b(cVar.mo139995b(i2))) {
                            bVar.mo139991c();
                            return;
                        }
                    }
                }
                int i3 = this.f195590h;
                for (int i4 = 0; i4 < i3; i4++) {
                    C88051h b = cVar.mo139995b(i4);
                    if (b != null) {
                        if (!z) {
                            C86994k.m150671a(b);
                        } else if (C88045d.m153110b(b)) {
                            C88051h a = cVar.mo139992a(i4);
                            C88045d.m153107a(b, a);
                            long longValue = cVar.f195608a.get(i4).longValue();
                            C88049f a2 = C88045d.m153099a(a);
                            if (a2 == null || (l = a2.f199964f) == null) {
                                j = 0;
                            } else {
                                j = l.longValue();
                            }
                            cVar.f195608a.set(i4, Long.valueOf(j));
                            C87991a<Long> aVar = this.f195592k;
                            aVar.f199870a = (V) Long.valueOf((aVar.f199870a.longValue() - longValue) + j);
                        }
                    }
                }
                C87991a<Integer> aVar2 = this.f195585c;
                aVar2.f199870a = (V) Integer.valueOf(aVar2.f199870a.intValue() + 1);
                cVar.f195610c.f199870a = null;
                if (cVar.f195609b.f199870a.booleanValue() || z) {
                    cVar.f195609b.f199870a = (V) true;
                    V v = this.f195593l.f199870a;
                    if (v != null) {
                        v.mo142619a("CLEAN " + cVar.f195612e + cVar.mo139993a() + '\n');
                    }
                    if (z) {
                        C87991a<Long> aVar3 = this.f195594m;
                        aVar3.f199870a = (V) Long.valueOf(aVar3.f199870a.longValue() + 1);
                        cVar.f195611d.f199870a = this.f195594m.f199870a;
                    }
                } else {
                    this.f195595n.remove(cVar.f195612e);
                    V v2 = this.f195593l.f199870a;
                    if (v2 != null) {
                        v2.mo142619a("REMOVE " + cVar.f195612e + '\n');
                    }
                }
                V v3 = this.f195593l.f199870a;
                if (v3 != null) {
                    v3.f199970a.flush();
                }
                if (this.f195592k.f199870a.longValue() > this.f195599r || mo139988g()) {
                    this.f195596o.execute(this.f195597p);
                }
                fVar.f199879a.unlock();
                return;
            }
            throw new IllegalStateException();
        } finally {
            fVar.f199879a.unlock();
        }
    }

    private C86735a(String str, int i, int i2, long j, AbstractC86744d dVar) {
        this.f195589g = str;
        this.f195598q = i;
        this.f195590h = i2;
        this.f195599r = j;
        this.f195600s = dVar;
        this.f195592k = new C87991a<>(0L);
        this.f195585c = new C87991a<>(0);
        this.f195593l = new C87991a<>(null);
        this.f195586d = new C88003f();
        this.f195587e = new C87991a<>(false);
        this.f195588f = new C87991a<>(false);
        this.f195594m = new C87991a<>(0L);
        this.f195595n = new C87989b<>();
        this.f195596o = new C87994a();
        this.f195597p = new RunnableC86741e(this);
        C88051h a = new C88051h(str).mo142616a("journal");
        if (a == null) {
            C89219l.m154707a();
        }
        this.f195583a = a;
        C88051h a2 = new C88051h(str).mo142616a("journal.tmp");
        if (a2 == null) {
            C89219l.m154707a();
        }
        this.f195591j = a2;
        C88051h a3 = new C88051h(str).mo142616a("journal.bkp");
        if (a3 == null) {
            C89219l.m154707a();
        }
        this.f195584b = a3;
    }

    public /* synthetic */ C86735a(String str, int i, int i2, long j, AbstractC86744d dVar, byte b) {
        this(str, i, i2, j, dVar);
    }
}
