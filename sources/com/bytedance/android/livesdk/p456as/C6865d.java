package com.bytedance.android.livesdk.p456as;

import com.bytedance.android.livesdk.p456as.C6861a;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.livesdk.as.d */
public class C6865d extends C6861a {

    /* renamed from: b */
    String f17206b;

    /* renamed from: c */
    String f17207c;

    /* renamed from: d */
    String f17208d;

    /* renamed from: e */
    public long f17209e;

    /* renamed from: f */
    String f17210f;

    static {
        Covode.recordClassIndex(7603);
    }

    /* renamed from: com.bytedance.android.livesdk.as.d$b */
    public static final class C6867b<T extends AbstractC6866a<T>> extends AbstractC6866a<T> {
        static {
            Covode.recordClassIndex(7605);
        }

        /* access modifiers changed from: package-private */
        @Override // com.bytedance.android.livesdk.p456as.C6861a.AbstractC6862a, com.bytedance.android.livesdk.p456as.C6865d.AbstractC6866a
        /* renamed from: a */
        public final /* bridge */ /* synthetic */ C6861a.AbstractC6862a mo13133a() {
            return this;
        }

        /* access modifiers changed from: package-private */
        @Override // com.bytedance.android.livesdk.p456as.C6865d.AbstractC6866a
        /* renamed from: b */
        public final T mo13137b() {
            return this;
        }

        @Override // com.bytedance.android.livesdk.p456as.C6865d.AbstractC6866a
        /* renamed from: c */
        public final C6865d mo13141c() {
            return new C6865d(this);
        }
    }

    /* renamed from: com.bytedance.android.livesdk.as.d$c */
    public static final class C6868c extends AbstractC6866a<C6868c> {
        static {
            Covode.recordClassIndex(7606);
        }

        /* access modifiers changed from: package-private */
        @Override // com.bytedance.android.livesdk.p456as.C6861a.AbstractC6862a, com.bytedance.android.livesdk.p456as.C6865d.AbstractC6866a
        /* renamed from: a */
        public final /* bridge */ /* synthetic */ C6861a.AbstractC6862a mo13133a() {
            return this;
        }

        /* Return type fixed from 'com.bytedance.android.livesdk.as.d$a' to match base method */
        /* access modifiers changed from: package-private */
        @Override // com.bytedance.android.livesdk.p456as.C6865d.AbstractC6866a
        /* renamed from: b */
        public final /* bridge */ /* synthetic */ C6868c mo13137b() {
            return this;
        }

        @Override // com.bytedance.android.livesdk.p456as.C6865d.AbstractC6866a
        /* renamed from: c */
        public final C6865d mo13141c() {
            return new C6865d(this);
        }
    }

    /* renamed from: com.bytedance.android.livesdk.as.d$a */
    public static abstract class AbstractC6866a<T extends AbstractC6866a<T>> extends C6861a.AbstractC6862a<AbstractC6866a<T>> {

        /* renamed from: b */
        String f17211b = "";

        /* renamed from: c */
        String f17212c = "";

        /* renamed from: d */
        String f17213d = "";

        /* renamed from: e */
        long f17214e;

        /* renamed from: f */
        String f17215f = "";

        static {
            Covode.recordClassIndex(7604);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public abstract T mo13133a();

        /* renamed from: c */
        public abstract C6865d mo13141c();

        /* renamed from: b */
        public final T mo13138b(long j) {
            this.f17214e = j;
            return mo13133a();
        }

        /* renamed from: c */
        public final T mo13140c(String str) {
            this.f17213d = str;
            return mo13133a();
        }

        /* renamed from: d */
        public final T mo13142d(String str) {
            this.f17215f = str;
            return mo13133a();
        }

        /* renamed from: a */
        public final T mo13136a(String str) {
            this.f17211b = str;
            return mo13133a();
        }

        /* renamed from: b */
        public final T mo13139b(String str) {
            this.f17212c = str;
            return mo13133a();
        }
    }

    C6865d(AbstractC6866a aVar) {
        super(aVar);
        this.f17206b = aVar.f17211b;
        this.f17207c = aVar.f17212c;
        this.f17208d = aVar.f17213d;
        this.f17209e = aVar.f17214e;
        this.f17210f = aVar.f17215f;
    }
}
