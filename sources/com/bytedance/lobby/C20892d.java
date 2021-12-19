package com.bytedance.lobby;

import android.os.Bundle;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.lobby.d */
public final class C20892d {

    /* renamed from: a */
    public int f49401a;

    /* renamed from: b */
    public String f49402b;

    /* renamed from: c */
    public String f49403c;

    /* renamed from: d */
    public Bundle f49404d;

    static {
        Covode.recordClassIndex(24480);
    }

    /* renamed from: com.bytedance.lobby.d$a */
    public static class C20893a {

        /* renamed from: a */
        public int f49405a = 1;

        /* renamed from: b */
        public String f49406b;

        /* renamed from: c */
        public String f49407c;

        /* renamed from: d */
        public Bundle f49408d;

        static {
            Covode.recordClassIndex(24481);
        }

        /* renamed from: a */
        public final C20893a mo34340a() {
            this.f49405a = 2;
            return this;
        }

        /* renamed from: b */
        public final C20892d mo34342b() {
            return new C20892d(this, (byte) 0);
        }

        /* renamed from: a */
        public final C20893a mo34341a(Bundle bundle) {
            this.f49408d = bundle;
            return this;
        }

        C20893a(String str, String str2) {
            this.f49406b = str;
            this.f49407c = str2;
        }
    }

    /* renamed from: com.bytedance.lobby.d$b */
    public static final class C20894b extends C20893a {
        static {
            Covode.recordClassIndex(24482);
        }

        public C20894b(String str) {
            super("facebook", str);
        }
    }

    /* renamed from: com.bytedance.lobby.d$c */
    public static final class C20895c extends C20893a {
        static {
            Covode.recordClassIndex(24483);
        }

        public C20895c(String str) {
            super("google", str);
        }
    }

    /* renamed from: com.bytedance.lobby.d$d */
    public static final class C20896d extends C20893a {
        static {
            Covode.recordClassIndex(24484);
        }

        public C20896d(String str) {
            super("google_onetap", str);
        }
    }

    /* renamed from: com.bytedance.lobby.d$e */
    public static final class C20897e extends C20893a {
        static {
            Covode.recordClassIndex(24485);
        }

        public C20897e(String str) {
            super("google_web", str);
        }
    }

    /* renamed from: com.bytedance.lobby.d$f */
    public static final class C20898f extends C20893a {
        static {
            Covode.recordClassIndex(24486);
        }

        public C20898f(String str) {
            super("instagram", str);
        }
    }

    /* renamed from: com.bytedance.lobby.d$g */
    public static final class C20899g extends C20893a {
        static {
            Covode.recordClassIndex(24487);
        }

        public C20899g(String str) {
            super("kakaotalk", str);
        }
    }

    /* renamed from: com.bytedance.lobby.d$h */
    public static final class C20900h extends C20893a {
        static {
            Covode.recordClassIndex(24488);
        }

        public C20900h(String str) {
            super("line", str);
        }
    }

    /* renamed from: com.bytedance.lobby.d$i */
    public static final class C20901i extends C20893a {
        static {
            Covode.recordClassIndex(24489);
        }

        public C20901i(String str) {
            super("twitter", str);
        }
    }

    /* renamed from: com.bytedance.lobby.d$j */
    public static final class C20902j extends C20893a {
        static {
            Covode.recordClassIndex(24490);
        }

        public C20902j(String str) {
            super("vk", str);
        }
    }

    private C20892d(C20893a aVar) {
        Bundle bundle;
        this.f49401a = aVar.f49405a;
        this.f49402b = aVar.f49406b;
        this.f49403c = aVar.f49407c;
        if (aVar.f49408d == null) {
            bundle = new Bundle();
        } else {
            bundle = aVar.f49408d;
        }
        this.f49404d = bundle;
    }

    /* synthetic */ C20892d(C20893a aVar, byte b) {
        this(aVar);
    }
}
