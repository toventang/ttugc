package com.p2082ss.android.deviceregister.p2135b.p2136a.p2137a;

import android.text.TextUtils;
import com.bytedance.common.utility.C13627m;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.deviceregister.b.a.a.b */
public abstract class AbstractC29876b {

    /* renamed from: d */
    public AbstractC29876b f71280d;

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.deviceregister.b.a.a.b$a */
    public interface AbstractC29878a<L> {
        static {
            Covode.recordClassIndex(36288);
        }

        /* renamed from: a */
        L mo52165a();

        /* renamed from: a */
        L mo52166a(L l, L l2, AbstractC29876b bVar);

        /* renamed from: a */
        void mo52167a(L l);

        /* renamed from: a */
        boolean mo52168a(L l, L l2);

        /* renamed from: b */
        boolean mo52169b(L l);
    }

    static {
        Covode.recordClassIndex(36286);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract String mo52160a(String str);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo52161a(String str, String str2);

    /* renamed from: b */
    public void mo52162b(String str) {
        AbstractC29876b bVar = this.f71280d;
        if (bVar != null) {
            bVar.mo52162b(str);
        }
    }

    /* renamed from: b */
    public final String mo52164b(String str, String str2) {
        return (String) m60207a(str, str2, new AbstractC29878a<String>() {
            /* class com.p2082ss.android.deviceregister.p2135b.p2136a.p2137a.AbstractC29876b.C298771 */

            static {
                Covode.recordClassIndex(36287);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // com.p2082ss.android.deviceregister.p2135b.p2136a.p2137a.AbstractC29876b.AbstractC29878a
            /* renamed from: a */
            public final /* bridge */ /* synthetic */ String mo52165a() {
                return AbstractC29876b.this.mo52160a("device_id");
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // com.p2082ss.android.deviceregister.p2135b.p2136a.p2137a.AbstractC29876b.AbstractC29878a
            /* renamed from: b */
            public final /* synthetic */ boolean mo52169b(String str) {
                if (!TextUtils.isEmpty(str)) {
                    return true;
                }
                return false;
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // com.p2082ss.android.deviceregister.p2135b.p2136a.p2137a.AbstractC29876b.AbstractC29878a
            /* renamed from: a */
            public final /* bridge */ /* synthetic */ void mo52167a(String str) {
                AbstractC29876b.this.mo52161a("device_id", str);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
            @Override // com.p2082ss.android.deviceregister.p2135b.p2136a.p2137a.AbstractC29876b.AbstractC29878a
            /* renamed from: a */
            public final /* bridge */ /* synthetic */ boolean mo52168a(String str, String str2) {
                return C13627m.m24499a(str, str2);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, com.ss.android.deviceregister.b.a.a.b] */
            @Override // com.p2082ss.android.deviceregister.p2135b.p2136a.p2137a.AbstractC29876b.AbstractC29878a
            /* renamed from: a */
            public final /* synthetic */ String mo52166a(String str, String str2, AbstractC29876b bVar) {
                String str3 = str;
                String str4 = str2;
                if (bVar == null) {
                    return str3;
                }
                return bVar.mo52164b(str3, str4);
            }
        });
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002c, code lost:
        if (r7.mo52169b(r6) == false) goto L_0x002e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0034, code lost:
        if (r7.mo52168a(r6, r3) == false) goto L_0x0036;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0036, code lost:
        r7.mo52167a(r6);
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private <T> T m60207a(T r5, T r6, com.p2082ss.android.deviceregister.p2135b.p2136a.p2137a.AbstractC29876b.AbstractC29878a<T> r7) {
        /*
            r4 = this;
            com.ss.android.deviceregister.b.a.a.b r0 = r4.f71280d
            java.lang.Object r3 = r7.mo52165a()
            boolean r2 = r7.mo52169b(r5)
            boolean r1 = r7.mo52169b(r3)
            if (r2 != 0) goto L_0x0013
            if (r1 == 0) goto L_0x0013
            r5 = r3
        L_0x0013:
            if (r0 == 0) goto L_0x0023
            java.lang.Object r1 = r7.mo52166a(r5, r6, r0)
            boolean r0 = r7.mo52168a(r1, r3)
            if (r0 != 0) goto L_0x0022
            r7.mo52167a(r1)
        L_0x0022:
            return r1
        L_0x0023:
            r0 = 0
            if (r2 != 0) goto L_0x003a
            if (r1 != 0) goto L_0x003a
            boolean r0 = r7.mo52169b(r6)
            if (r0 != 0) goto L_0x0036
        L_0x002e:
            if (r2 == 0) goto L_0x0039
            boolean r0 = r7.mo52168a(r6, r3)
            if (r0 != 0) goto L_0x0039
        L_0x0036:
            r7.mo52167a(r6)
        L_0x0039:
            return r6
        L_0x003a:
            r6 = r5
            goto L_0x002e
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.deviceregister.p2135b.p2136a.p2137a.AbstractC29876b.m60207a(java.lang.Object, java.lang.Object, com.ss.android.deviceregister.b.a.a.b$a):java.lang.Object");
    }
}
