package com.bytedance.sdk.bridge;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.sdk.bridge.api.AbstractC22692a;

/* renamed from: com.bytedance.sdk.bridge.a */
public class C22685a {

    /* renamed from: a */
    public String f53592a;

    /* renamed from: b */
    public AbstractC22692a f53593b;

    /* renamed from: c */
    public Context f53594c;

    /* renamed from: d */
    private Boolean f53595d;

    /* renamed from: e */
    private Boolean f53596e;

    /* renamed from: f */
    private Boolean f53597f;

    /* renamed from: g */
    private Boolean f53598g;

    static {
        Covode.recordClassIndex(26505);
    }

    /* renamed from: a */
    public final Boolean mo36966a() {
        boolean booleanValue;
        Boolean bool = this.f53595d;
        if (bool == null) {
            booleanValue = false;
        } else {
            booleanValue = bool.booleanValue();
        }
        return Boolean.valueOf(booleanValue);
    }

    /* renamed from: b */
    public final Boolean mo36967b() {
        boolean booleanValue;
        Boolean bool = this.f53598g;
        if (bool == null) {
            booleanValue = false;
        } else {
            booleanValue = bool.booleanValue();
        }
        return Boolean.valueOf(booleanValue);
    }

    /* renamed from: com.bytedance.sdk.bridge.a$a */
    public static class C22686a {

        /* renamed from: a */
        private String f53599a;

        /* renamed from: b */
        private Boolean f53600b;

        /* renamed from: c */
        private Boolean f53601c = true;

        /* renamed from: d */
        private Boolean f53602d;

        /* renamed from: e */
        private Boolean f53603e;

        /* renamed from: f */
        private AbstractC22692a f53604f;

        /* renamed from: g */
        private Context f53605g;

        static {
            Covode.recordClassIndex(26506);
        }

        /* renamed from: a */
        public final C22685a mo36970a() {
            return new C22685a(this.f53600b, this.f53599a, this.f53601c, this.f53602d, this.f53603e, this.f53604f, this.f53605g, (byte) 0);
        }

        /* renamed from: a */
        public final C22686a mo36968a(Boolean bool) {
            this.f53600b = bool;
            return this;
        }

        /* renamed from: b */
        public final C22686a mo36971b(Boolean bool) {
            this.f53601c = bool;
            return this;
        }

        /* renamed from: c */
        public final C22686a mo36972c(Boolean bool) {
            this.f53602d = bool;
            return this;
        }

        /* renamed from: d */
        public final C22686a mo36973d(Boolean bool) {
            this.f53603e = bool;
            return this;
        }

        /* renamed from: a */
        public final C22686a mo36969a(String str) {
            this.f53599a = str;
            return this;
        }
    }

    private C22685a(Boolean bool, String str, Boolean bool2, Boolean bool3, Boolean bool4, AbstractC22692a aVar, Context context) {
        this.f53595d = bool;
        this.f53592a = str;
        this.f53596e = bool2;
        this.f53597f = bool3;
        this.f53598g = bool4;
        this.f53593b = aVar;
        this.f53594c = context;
    }

    /* synthetic */ C22685a(Boolean bool, String str, Boolean bool2, Boolean bool3, Boolean bool4, AbstractC22692a aVar, Context context, byte b) {
        this(bool, str, bool2, bool3, bool4, aVar, context);
    }
}
