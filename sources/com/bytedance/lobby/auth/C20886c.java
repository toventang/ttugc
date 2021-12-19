package com.bytedance.lobby.auth;

import android.os.Bundle;
import androidx.fragment.app.ActivityC0945e;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.lobby.auth.c */
public final class C20886c {

    /* renamed from: a */
    public final ActivityC0945e f49386a;

    /* renamed from: b */
    public final String f49387b;

    /* renamed from: c */
    public final AbstractC20884a f49388c;

    /* renamed from: d */
    public final Bundle f49389d;

    static {
        Covode.recordClassIndex(24474);
    }

    /* renamed from: com.bytedance.lobby.auth.c$a */
    public static class C20887a {

        /* renamed from: a */
        public String f49390a;

        /* renamed from: b */
        public ActivityC0945e f49391b;

        /* renamed from: c */
        public AbstractC20884a f49392c;

        /* renamed from: d */
        public Bundle f49393d;

        static {
            Covode.recordClassIndex(24475);
        }

        /* renamed from: a */
        public final C20886c mo34322a() {
            return new C20886c(this, (byte) 0);
        }

        public C20887a(ActivityC0945e eVar) {
            this.f49391b = eVar;
        }

        /* renamed from: a */
        public final C20887a mo34321a(Bundle bundle) {
            Bundle bundle2 = this.f49393d;
            if (bundle2 == null) {
                this.f49393d = bundle;
            } else {
                bundle2.putAll(bundle);
            }
            return this;
        }
    }

    private C20886c(C20887a aVar) {
        this.f49387b = aVar.f49390a;
        this.f49386a = aVar.f49391b;
        this.f49388c = aVar.f49392c;
        this.f49389d = aVar.f49393d;
    }

    /* synthetic */ C20886c(C20887a aVar, byte b) {
        this(aVar);
    }
}
