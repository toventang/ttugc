package com.p2082ss.android.ugc.aweme.simkit.impl.bitrateselector;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63034d;
import com.p2082ss.android.ugc.playerkit.simapicommon.p4325a.C84237e;
import java.util.Comparator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.simkit.impl.bitrateselector.e */
public final class C74651e implements AbstractC63034d {

    /* renamed from: a */
    public static final C74651e f167795a = new C74651e();

    /* renamed from: b */
    private static int f167796b = -1;

    /* renamed from: c */
    private static final ConcurrentHashMap<String, Float> f167797c = new ConcurrentHashMap<>(50);

    /* renamed from: d */
    private static final ConcurrentLinkedQueue<String> f167798d = new ConcurrentLinkedQueue<>();

    private C74651e() {
    }

    static {
        Covode.recordClassIndex(87474);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v63, types: [com.ss.android.ugc.f.a.a.a.a.c] */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0232, code lost:
        if (r0 == null) goto L_0x023b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x0234, code lost:
        r0 = r0.floatValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x0238, code lost:
        r17 = (int) r0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x02db  */
    /* JADX WARNING: Removed duplicated region for block: B:169:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0184  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x0216  */
    /* JADX WARNING: Unknown variable types count: 1 */
    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63034d
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo101166a(com.p2082ss.android.ugc.aweme.player.sdk.p3553b.C63059e r28) {
        /*
        // Method dump skipped, instructions count: 1016
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.simkit.impl.bitrateselector.C74651e.mo101166a(com.ss.android.ugc.aweme.player.sdk.b.e):void");
    }

    /* renamed from: com.ss.android.ugc.aweme.simkit.impl.bitrateselector.e$a */
    static final class C74652a<T> implements Comparator<T> {

        /* renamed from: a */
        public static final C74652a f167799a = new C74652a();

        static {
            Covode.recordClassIndex(87475);
        }

        C74652a() {
        }

        @Override // java.util.Comparator
        public final /* synthetic */ int compare(Object obj, Object obj2) {
            C84237e eVar = (C84237e) obj;
            C84237e eVar2 = (C84237e) obj2;
            C89219l.m154719c(eVar, "");
            C89219l.m154719c(eVar2, "");
            return eVar2.getBitRate() - eVar.getBitRate();
        }
    }
}
