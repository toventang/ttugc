package com.bytedance.android.livesdk.p456as;

import android.app.Activity;
import com.bytedance.android.livesdk.p456as.C6861a;
import com.bytedance.android.livesdk.p456as.C6865d;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.livesdk.as.e */
public final class C6869e extends C6865d {

    /* renamed from: g */
    Activity f17216g;

    /* renamed from: h */
    String f17217h;

    /* renamed from: i */
    String f17218i;

    static {
        Covode.recordClassIndex(7607);
    }

    /* renamed from: com.bytedance.android.livesdk.as.e$b */
    public static final class C6871b<T extends AbstractC6870a<T>> extends AbstractC6870a<T> {
        static {
            Covode.recordClassIndex(7609);
        }

        /* access modifiers changed from: package-private */
        @Override // com.bytedance.android.livesdk.p456as.C6861a.AbstractC6862a, com.bytedance.android.livesdk.p456as.C6865d.AbstractC6866a, com.bytedance.android.livesdk.p456as.C6869e.AbstractC6870a
        /* renamed from: a */
        public final /* bridge */ /* synthetic */ C6861a.AbstractC6862a mo13133a() {
            return this;
        }

        /* access modifiers changed from: package-private */
        @Override // com.bytedance.android.livesdk.p456as.C6865d.AbstractC6866a, com.bytedance.android.livesdk.p456as.C6869e.AbstractC6870a
        /* renamed from: b */
        public final /* bridge */ /* synthetic */ C6865d.AbstractC6866a mo13137b() {
            return this;
        }

        @Override // com.bytedance.android.livesdk.p456as.C6865d.AbstractC6866a, com.bytedance.android.livesdk.p456as.C6869e.AbstractC6870a
        /* renamed from: c */
        public final /* synthetic */ C6865d mo13141c() {
            return mo13141c();
        }

        @Override // com.bytedance.android.livesdk.p456as.C6869e.AbstractC6870a
        /* renamed from: d */
        public final C6869e mo13144d() {
            return new C6869e(this, (byte) 0);
        }
    }

    /* renamed from: com.bytedance.android.livesdk.as.e$a */
    public static abstract class AbstractC6870a<T extends C6865d.AbstractC6866a<T>> extends C6865d.AbstractC6866a<T> {

        /* renamed from: g */
        Activity f17219g;

        /* renamed from: h */
        String f17220h;

        /* renamed from: i */
        String f17221i;

        static {
            Covode.recordClassIndex(7608);
        }

        /* access modifiers changed from: package-private */
        @Override // com.bytedance.android.livesdk.p456as.C6865d.AbstractC6866a
        /* renamed from: b */
        public abstract T mo13133a();

        /* renamed from: d */
        public abstract C6869e mo13141c();

        /* renamed from: e */
        public final T mo13145e(String str) {
            this.f17220h = str;
            return mo13133a();
        }

        /* renamed from: f */
        public final T mo13146f(String str) {
            this.f17221i = str;
            return mo13133a();
        }

        /* renamed from: a */
        public final T mo13143a(Activity activity) {
            this.f17219g = activity;
            return mo13133a();
        }
    }

    private C6869e(AbstractC6870a aVar) {
        super(aVar);
        this.f17216g = aVar.f17219g;
        this.f17217h = aVar.f17220h;
        this.f17218i = aVar.f17221i;
    }

    /* synthetic */ C6869e(AbstractC6870a aVar, byte b) {
        this(aVar);
    }
}
