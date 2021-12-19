package com.google.android.gms.internal.measurement;

import com.bytedance.covode.number.Covode;

/* renamed from: com.google.android.gms.internal.measurement.em */
public final class C25924em {

    /* renamed from: a */
    static final AbstractC25923el f61076a;

    /* renamed from: b */
    private static final int f61077b;

    /* renamed from: com.google.android.gms.internal.measurement.em$a */
    static final class C25925a extends AbstractC25923el {
        static {
            Covode.recordClassIndex(31340);
        }

        @Override // com.google.android.gms.internal.measurement.AbstractC25923el
        /* renamed from: a */
        public final void mo42349a(Throwable th, Throwable th2) {
        }

        C25925a() {
        }
    }

    /* renamed from: a */
    private static Integer m50165a() {
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C25924em.<clinit>():void");
    }
}
