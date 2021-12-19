package com.p2082ss.ugc.effectplatform.p4444b;

import com.bytedance.covode.number.Covode;
import com.p2082ss.ugc.effectplatform.p4444b.p4445a.AbstractC86744d;
import com.p2082ss.ugc.effectplatform.p4444b.p4445a.C86735a;
import java.util.Set;
import p4519d.p4520a.p4522b.C87991a;
import p4519d.p4520a.p4522b.C87993b;
import p4519d.p4520a.p4522b.p4525c.C88003f;
import p4519d.p4520a.p4530d.p4531a.C88044c;
import p4519d.p4520a.p4530d.p4531a.C88045d;
import p4519d.p4520a.p4530d.p4531a.EnumC88043b;
import p4519d.p4520a.p4532e.C88060b;
import p4600h.C89379q;
import p4600h.C89382r;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89350l;

/* renamed from: com.ss.ugc.effectplatform.b.c */
public class C86749c implements AbstractC86755f {

    /* renamed from: b */
    public static final C86750a f195633b = new C86750a((byte) 0);

    /* renamed from: a */
    public final String f195634a;

    /* renamed from: c */
    private C87991a<C86735a> f195635c;

    /* renamed from: d */
    private final C88003f f195636d;

    /* renamed from: e */
    private final int f195637e;

    /* renamed from: f */
    private final int f195638f;

    /* renamed from: g */
    private final long f195639g;

    /* renamed from: h */
    private final AbstractC86744d f195640h;

    static {
        Covode.recordClassIndex(102448);
    }

    /* renamed from: com.ss.ugc.effectplatform.b.c$a */
    public static final class C86750a {
        static {
            Covode.recordClassIndex(102449);
        }

        private C86750a() {
        }

        public /* synthetic */ C86750a(byte b) {
            this();
        }
    }

    /* renamed from: d */
    public final boolean mo140010d() {
        if (mo140008c() != null) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public void mo139974a() {
        C88060b.m153135a("DiskLruCacheImpl", this.f195634a + " is creating");
    }

    /* renamed from: c */
    public final C86735a mo140008c() {
        Object obj;
        V v;
        C88003f fVar = this.f195636d;
        fVar.f199879a.lock();
        try {
            if (this.f195635c.f199870a == null || (v = this.f195635c.f199870a) == null || !C88045d.m153118f(v.f195589g) || !C88045d.m153110b(v.f195583a)) {
                mo139974a();
                try {
                    obj = C89379q.m157068constructorimpl(C86735a.C86736a.m150257a(this.f195634a, this.f195637e, this.f195638f, this.f195639g, this.f195640h));
                } catch (Throwable th) {
                    obj = C89379q.m157068constructorimpl(C89382r.m154941a(th));
                }
                Throwable r0 = C89379q.m157071exceptionOrNullimpl(obj);
                if (r0 != null) {
                    C88060b.m153136a("DiskLruCacheImpl", "DiskLruCache.open fails, ex: ".concat(String.valueOf(r0)), null);
                }
                C87991a<C86735a> aVar = this.f195635c;
                if (C89379q.m157073isFailureimpl(obj)) {
                    obj = null;
                }
                C87993b.m153065a(aVar, obj);
            }
            return this.f195635c.f199870a;
        } finally {
            fVar.f199879a.unlock();
        }
    }

    @Override // com.p2082ss.ugc.effectplatform.p4444b.AbstractC86755f
    /* renamed from: e */
    public void mo140012e() {
        try {
            C86735a c = mo140008c();
            if (c != null) {
                c.mo139986e();
            }
            C86735a c2 = mo140008c();
            if (c2 != null) {
                C88003f fVar = c2.f195586d;
                fVar.f199879a.lock();
                try {
                    if (C88045d.m153110b(c2.f195584b)) {
                        if (C88045d.m153110b(c2.f195583a)) {
                            C88045d.m153114c(c2.f195584b);
                        } else {
                            C86735a.C86736a.m150260a(c2.f195584b, c2.f195583a, false);
                        }
                    }
                    if (C88045d.m153110b(c2.f195583a)) {
                        try {
                            c2.mo139979b();
                            c2.mo139981c();
                            return;
                        } catch (Exception e) {
                            C88060b.m153136a("DiskLruCache", "DiskLruCache " + c2.f195589g + " is corrupt: " + e.getMessage() + ", removing", null);
                            c2.mo139986e();
                        }
                    }
                    if (!C88045d.m153118f(c2.f195589g)) {
                        C88045d.m153117e(c2.f195589g);
                    }
                    c2.mo139984d();
                    fVar.f199879a.unlock();
                    return;
                } finally {
                    fVar.f199879a.unlock();
                }
            } else {
                return;
            }
        } catch (Exception e2) {
            C88060b.m153136a("DiskLruCacheImpl", "clear: exception", e2);
        }
    }

    @Override // com.p2082ss.ugc.effectplatform.p4444b.AbstractC86755f
    /* renamed from: b */
    public final String mo140007b(String str) {
        C89219l.m154719c(str, "");
        C88044c c = mo140009c(str);
        if (c == null) {
            return null;
        }
        return C88045d.m153104a(c, EnumC88043b.Utf8);
    }

    @Override // com.p2082ss.ugc.effectplatform.p4444b.AbstractC86755f
    /* renamed from: c */
    public final C88044c mo140009c(String str) {
        C89219l.m154719c(str, "");
        C86735a.C86740d a = mo139972a(str);
        if (a != null) {
            return a.f195615b[0];
        }
        return null;
    }

    @Override // com.p2082ss.ugc.effectplatform.p4444b.AbstractC86755f
    /* renamed from: e */
    public final boolean mo140013e(String str) {
        C89219l.m154719c(str, "");
        String a = C86735a.C86736a.m150258a(str);
        C86735a c = mo140008c();
        if (c != null) {
            return c.mo139980b(a);
        }
        return false;
    }

    /* renamed from: g */
    public final boolean mo140015g(String str) {
        C89219l.m154719c(str, "");
        C86735a c = mo140008c();
        if (c != null) {
            return c.mo139978a(str);
        }
        return false;
    }

    /* renamed from: a */
    private final C86735a.C86740d mo139972a(String str) {
        String a = C86735a.C86736a.m150258a(str);
        try {
            C86735a c = mo140008c();
            if (c != null) {
                return c.mo139983d(a);
            }
            return null;
        } catch (Exception e) {
            C88060b.m153136a("DiskLruCacheImpl", "get key:" + str + " exception", e);
            return null;
        }
    }

    @Override // com.p2082ss.ugc.effectplatform.p4444b.AbstractC86755f
    /* renamed from: d */
    public final boolean mo140011d(String str) {
        C89219l.m154719c(str, "");
        String a = C86735a.C86736a.m150258a(str);
        try {
            C86735a c = mo140008c();
            if (c != null) {
                return c.mo139982c(a);
            }
            return false;
        } catch (Exception e) {
            C88060b.m153136a("DiskLruCacheImpl", "remove key:" + str + " exception", e);
            return false;
        }
    }

    @Override // com.p2082ss.ugc.effectplatform.p4444b.AbstractC86755f
    /* renamed from: f */
    public final void mo140014f(String str) {
        Set<String> a;
        if (str != null) {
            C89219l.m154719c(str, "");
            int length = str.length();
            char[] cArr = new char[length];
            for (int i = 0; i < length; i++) {
                cArr[i] = str.charAt(i);
                if (cArr[i] == C88045d.f199951a.charAt(0)) {
                    cArr[i] = '_';
                }
            }
            C89350l lVar = new C89350l(new String(cArr));
            C86735a c = mo140008c();
            if (!(c == null || (a = c.mo139976a()) == null)) {
                for (T t : a) {
                    if (lVar.matches(t)) {
                        mo140011d(t);
                    }
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0039, code lost:
        r7 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003a, code lost:
        r8 = null;
        r4 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        r8.mo139991c();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x005a, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x005b, code lost:
        p4519d.p4520a.p4532e.C88060b.m153136a("DiskLruCacheImpl", "abort :".concat(java.lang.String.valueOf(r0)), null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x006a, code lost:
        r4.mo139996a();
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0056 A[SYNTHETIC, Splitter:B:20:0x0056] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x006a  */
    @Override // com.p2082ss.ugc.effectplatform.p4444b.AbstractC86755f
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long mo140004a(java.lang.String r10, p4519d.p4520a.p4530d.p4531a.C88044c r11) {
        /*
        // Method dump skipped, instructions count: 119
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.ugc.effectplatform.p4444b.C86749c.mo140004a(java.lang.String, d.a.d.a.c):long");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x004a, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x004b, code lost:
        r8 = null;
        r4 = null;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x005c A[SYNTHETIC, Splitter:B:23:0x005c] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0070 A[SYNTHETIC, Splitter:B:28:0x0070] */
    @Override // com.p2082ss.ugc.effectplatform.p4444b.AbstractC86755f
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long mo140005a(java.lang.String r10, java.lang.String r11) {
        /*
        // Method dump skipped, instructions count: 129
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.ugc.effectplatform.p4444b.C86749c.mo140005a(java.lang.String, java.lang.String):long");
    }

    /* access modifiers changed from: public */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0099, code lost:
        r9 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x009a, code lost:
        r8 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0146, code lost:
        r9 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0148, code lost:
        r9 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0149, code lost:
        r8 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x016d, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x016f, code lost:
        r9 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0171, code lost:
        r9 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:?, code lost:
        r2.mo139991c();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0199, code lost:
        r2.mo139996a();
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x016d A[ExcHandler: all (th java.lang.Throwable), Splitter:B:1:0x0057] */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x018b A[SYNTHETIC, Splitter:B:63:0x018b] */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0199 A[Catch:{ Exception -> 0x019c }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private p4600h.C89378p<java.lang.String, java.lang.Boolean> m150283a(java.lang.String r18, p4519d.p4520a.p4530d.p4531a.C88044c r19, java.lang.String r20) {
        /*
        // Method dump skipped, instructions count: 413
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.ugc.effectplatform.p4444b.C86749c.m150283a(java.lang.String, d.a.d.a.c, java.lang.String):h.p");
    }

    private C86749c(String str, int i, int i2, long j, AbstractC86744d dVar) {
        C89219l.m154719c(str, "");
        this.f195634a = str;
        this.f195637e = i;
        this.f195638f = i2;
        this.f195639g = j;
        this.f195640h = dVar;
        this.f195635c = new C87991a<>(null);
        this.f195636d = new C88003f();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x00bc, code lost:
        r6 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00bd, code lost:
        r4 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00c0, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:?, code lost:
        r2.mo139991c();
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00c0 A[ExcHandler: all (th java.lang.Throwable), Splitter:B:1:0x0013] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00dc A[SYNTHETIC, Splitter:B:29:0x00dc] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00e4  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p4600h.C89378p<java.lang.String, java.lang.Boolean> mo140006a(java.lang.String r10, p4519d.p4520a.p4530d.p4531a.C88044c r11, java.lang.String r12, long r13, p4600h.p4611f.p4612a.AbstractC89183m<? super java.lang.Integer, ? super java.lang.Long, p4600h.C89391z> r15) {
        /*
        // Method dump skipped, instructions count: 232
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.ugc.effectplatform.p4444b.C86749c.mo140006a(java.lang.String, d.a.d.a.c, java.lang.String, long, h.f.a.m):h.p");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C86749c(String str, int i, int i2, long j, AbstractC86744d dVar, int i3) {
        this(str, (i3 & 2) != 0 ? 0 : i, (i3 & 4) != 0 ? 1 : i2, j, (i3 & 16) != 0 ? null : dVar);
    }
}
