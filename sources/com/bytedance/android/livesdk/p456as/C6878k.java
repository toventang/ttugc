package com.bytedance.android.livesdk.p456as;

import android.app.Activity;
import com.bytedance.android.livesdk.p456as.C6861a;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.livesdk.as.k */
public final class C6878k extends C6861a {

    /* renamed from: b */
    public int f17238b;

    /* renamed from: c */
    String f17239c;

    /* renamed from: d */
    public Activity f17240d;

    /* renamed from: e */
    public long f17241e;

    /* renamed from: com.bytedance.android.livesdk.as.k$c */
    public static final class C6881c extends AbstractC6879a<C6881c> {
        static {
            Covode.recordClassIndex(7619);
        }

        /* access modifiers changed from: package-private */
        @Override // com.bytedance.android.livesdk.p456as.C6861a.AbstractC6862a, com.bytedance.android.livesdk.p456as.C6878k.AbstractC6879a
        /* renamed from: a */
        public final /* bridge */ /* synthetic */ C6861a.AbstractC6862a mo13133a() {
            return this;
        }

        /* Return type fixed from 'com.bytedance.android.livesdk.as.k$a' to match base method */
        /* access modifiers changed from: package-private */
        @Override // com.bytedance.android.livesdk.p456as.C6878k.AbstractC6879a
        /* renamed from: b */
        public final /* bridge */ /* synthetic */ C6881c mo13177b() {
            return this;
        }
    }

    static {
        Covode.recordClassIndex(7616);
    }

    /* renamed from: com.bytedance.android.livesdk.as.k$b */
    public static final class C6880b<T extends C6880b<T>> extends AbstractC6879a<T> {
        static {
            Covode.recordClassIndex(7618);
        }

        /* access modifiers changed from: package-private */
        @Override // com.bytedance.android.livesdk.p456as.C6861a.AbstractC6862a, com.bytedance.android.livesdk.p456as.C6878k.AbstractC6879a
        /* renamed from: a */
        public final /* bridge */ /* synthetic */ C6861a.AbstractC6862a mo13133a() {
            return this;
        }

        /* access modifiers changed from: package-private */
        @Override // com.bytedance.android.livesdk.p456as.C6878k.AbstractC6879a
        /* renamed from: b */
        public final /* bridge */ /* synthetic */ AbstractC6879a mo13177b() {
            return this;
        }

        /* renamed from: c */
        public final C6878k mo13179c() {
            return new C6878k(this);
        }
    }

    /* renamed from: com.bytedance.android.livesdk.as.k$a */
    public static abstract class AbstractC6879a<T extends AbstractC6879a<T>> extends C6861a.AbstractC6862a<T> {

        /* renamed from: b */
        int f17242b;

        /* renamed from: c */
        String f17243c = "";

        /* renamed from: d */
        Activity f17244d;

        /* renamed from: e */
        long f17245e;

        static {
            Covode.recordClassIndex(7617);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public abstract T mo13133a();

        /* renamed from: b */
        public final T mo13178b(long j) {
            this.f17245e = j;
            return mo13133a();
        }

        /* renamed from: a */
        public final T mo13174a(int i) {
            this.f17242b = i;
            return mo13133a();
        }

        /* renamed from: a */
        public final T mo13175a(Activity activity) {
            this.f17244d = activity;
            return mo13133a();
        }

        /* renamed from: a */
        public final T mo13176a(String str) {
            this.f17243c = str;
            return mo13133a();
        }
    }

    public C6878k(AbstractC6879a aVar) {
        super(aVar);
        this.f17239c = aVar.f17243c;
        this.f17238b = aVar.f17242b;
        this.f17240d = aVar.f17244d;
        this.f17241e = aVar.f17245e;
    }
}
