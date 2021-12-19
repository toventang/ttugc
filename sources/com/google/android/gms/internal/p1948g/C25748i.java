package com.google.android.gms.internal.p1948g;

import com.bytedance.covode.number.Covode;

/* renamed from: com.google.android.gms.internal.g.i */
public final class C25748i {

    /* renamed from: a */
    public static final AbstractC25751k f60868a;

    /* renamed from: b */
    private static final int f60869b;

    /* renamed from: com.google.android.gms.internal.g.i$a */
    static final class C25749a extends AbstractC25751k {
        static {
            Covode.recordClassIndex(31164);
        }

        @Override // com.google.android.gms.internal.p1948g.AbstractC25751k
        /* renamed from: a */
        public final void mo41980a(Throwable th, Throwable th2) {
        }

        C25749a() {
        }
    }

    /* renamed from: a */
    private static Integer m49695a() {
        try {
            return (Integer) Class.forName("android.os.Build$VERSION").getField("SDK_INT").get(null);
        } catch (Exception e) {
            System.err.println("Failed to retrieve value from android.os.Build$VERSION.SDK_INT due to the following exception.");
            e.printStackTrace(System.err);
            return null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0072  */
    static {
        /*
        // Method dump skipped, instructions count: 119
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p1948g.C25748i.<clinit>():void");
    }
}
