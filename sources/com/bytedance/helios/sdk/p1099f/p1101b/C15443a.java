package com.bytedance.helios.sdk.p1099f.p1101b;

import com.bytedance.covode.number.Covode;
import com.bytedance.helios.api.p1088b.C15306d;
import com.bytedance.helios.api.p1088b.C15318n;
import com.bytedance.helios.api.p1088b.C15320o;
import com.bytedance.helios.sdk.p1099f.p1100a.AbstractC15438b;
import com.bytedance.helios.sdk.utils.C15484f;
import java.util.Map;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;

/* renamed from: com.bytedance.helios.sdk.f.b.a */
public final class C15443a {

    /* renamed from: a */
    public static final C15443a f37692a = new C15443a();

    private C15443a() {
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x0368, code lost:
        if (r4.equals("boolean") != false) goto L_0x036a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x037a, code lost:
        if (r4.equals("long") != false) goto L_0x037c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x038a, code lost:
        if (r4.equals("char") != false) goto L_0x038c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x03a7, code lost:
        if (r4.equals("byte") != false) goto L_0x03a9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x03bf, code lost:
        if (r4.equals("java.lang.Short") != false) goto L_0x03c1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x03cf, code lost:
        if (r4.equals("java.lang.Float") != false) goto L_0x03d1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x040a, code lost:
        if (r4.equals("double") != false) goto L_0x040c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x0445, code lost:
        if (r4.equals("java.lang.Integer") != false) goto L_0x0447;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:207:0x05a8, code lost:
        if (r4.equals("java.lang.String") != false) goto L_0x04da;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:212:0x05bf, code lost:
        if (r4.equals("java.lang.Double") != false) goto L_0x06f4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:220:0x05e3, code lost:
        if (r4.equals("java.lang.Long") != false) goto L_0x0643;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:222:0x05ec, code lost:
        if (r4.equals("java.lang.Byte") != false) goto L_0x065f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:224:0x05f5, code lost:
        if (r4.equals("java.lang.Boolean") != false) goto L_0x0634;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:226:0x05fe, code lost:
        if (r4.equals("java.lang.Character") != false) goto L_0x0651;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:228:0x0607, code lost:
        if (r4.equals("short") != false) goto L_0x0686;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:233:0x061d, code lost:
        if (r4.equals("float") != false) goto L_0x0693;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:238:0x0632, code lost:
        if (r4.equals("boolean") != false) goto L_0x0634;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:239:0x0634, code lost:
        r8 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:241:0x0641, code lost:
        if (r4.equals("long") != false) goto L_0x0643;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:242:0x0643, code lost:
        r8 = -1L;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:244:0x064f, code lost:
        if (r4.equals("char") != false) goto L_0x0651;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:245:0x0651, code lost:
        r8 = ' ';
     */
    /* JADX WARNING: Code restructure failed: missing block: B:247:0x065d, code lost:
        if (r4.equals("byte") != false) goto L_0x065f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:248:0x065f, code lost:
        r8 = java.lang.Byte.valueOf(java.lang.Byte.parseByte("-1"));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:250:0x066f, code lost:
        if (r4.equals("int") != false) goto L_0x0761;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:255:0x0684, code lost:
        if (r4.equals("java.lang.Short") != false) goto L_0x0686;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:256:0x0686, code lost:
        r8 = (short) -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:258:0x0691, code lost:
        if (r4.equals("java.lang.Float") != false) goto L_0x0693;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:259:0x0693, code lost:
        r8 = java.lang.Float.valueOf(-1.0f);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:280:0x06f2, code lost:
        if (r4.equals("double") != false) goto L_0x06f4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:281:0x06f4, code lost:
        r8 = java.lang.Double.valueOf(-1.0d);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:304:0x075f, code lost:
        if (r4.equals("java.lang.Integer") != false) goto L_0x0761;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:305:0x0761, code lost:
        r8 = -1;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.util.Pair m28402a(com.bytedance.helios.sdk.p1097d.C15397d r20) {
        /*
        // Method dump skipped, instructions count: 2206
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.helios.sdk.p1099f.p1101b.C15443a.m28402a(com.bytedance.helios.sdk.d.d):android.util.Pair");
    }

    static {
        Covode.recordClassIndex(17695);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.helios.sdk.f.b.a$b */
    public static final class C15445b extends AbstractC89220m implements AbstractC89171a<Boolean> {

        /* renamed from: a */
        final /* synthetic */ Map.Entry f37694a;

        /* renamed from: b */
        final /* synthetic */ Map f37695b;

        /* renamed from: c */
        final /* synthetic */ C15318n f37696c;

        static {
            Covode.recordClassIndex(17697);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C15445b(Map.Entry entry, Map map, C15318n nVar) {
            super(0);
            this.f37694a = entry;
            this.f37695b = map;
            this.f37696c = nVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Boolean invoke() {
            return Boolean.valueOf(((AbstractC15438b) this.f37694a.getValue()).mo25182a(this.f37696c));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.helios.sdk.f.b.a$a */
    public static final class RunnableC15444a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C15318n f37693a;

        static {
            Covode.recordClassIndex(17696);
        }

        RunnableC15444a(C15318n nVar) {
            this.f37693a = nVar;
        }

        public final void run() {
            this.f37693a.mo24858i("SensitiveApiInterceptException");
            C15306d dVar = this.f37693a.f37379y;
            Object obj = dVar.f37327c.second;
            if (obj != null) {
                this.f37693a.f37368n.put("returnResult", obj.toString());
            }
            String str = dVar.f37326b;
            if (str != null) {
                this.f37693a.f37368n.put("returnType", str);
            }
            C15320o.m28228a(this.f37693a, false);
            C15484f.m28491a("Helios-Intercept-Api", "actionIntercept id=" + this.f37693a.f37356b + " calledTime=" + this.f37693a.f37366l + " returnType=" + this.f37693a.f37379y.f37326b + " returnResult=" + this.f37693a.f37379y.f37327c.second, (String) null, 12);
        }
    }
}
