package com.bytedance.bridge.magpie.p883b;

import com.bytedance.bridge.magpie.p885d.AbstractC13444c;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.bridge.magpie.b.b */
public final class C13431b {

    /* renamed from: f */
    public static final C13433b f32744f = new C13433b((byte) 0);

    /* renamed from: a */
    public String f32745a = "";

    /* renamed from: b */
    public EnumC13432a f32746b = EnumC13432a.PUBLIC;

    /* renamed from: c */
    public String f32747c = "";

    /* renamed from: d */
    public AbstractC13444c f32748d;

    /* renamed from: e */
    public boolean f32749e = true;

    static {
        Covode.recordClassIndex(15431);
    }

    /* renamed from: com.bytedance.bridge.magpie.b.b$a */
    public enum EnumC13432a {
        PUBLIC("public"),
        PROTECT("protected"),
        PRIVATE("private"),
        SECURE("secure");
        

        /* renamed from: b */
        private final String f32751b;

        public final String getValue() {
            return this.f32751b;
        }

        static {
            Covode.recordClassIndex(15432);
        }

        private EnumC13432a(String str) {
            this.f32751b = str;
        }
    }

    /* renamed from: com.bytedance.bridge.magpie.b.b$b */
    public static final class C13433b {
        static {
            Covode.recordClassIndex(15433);
        }

        private C13433b() {
        }

        public /* synthetic */ C13433b(byte b) {
            this();
        }
    }

    /* renamed from: a */
    public final void mo21653a(EnumC13432a aVar) {
        C89219l.m154719c(aVar, "");
        this.f32746b = aVar;
    }

    /* renamed from: b */
    public final void mo21655b(String str) {
        C89219l.m154719c(str, "");
        this.f32747c = str;
    }

    /* renamed from: a */
    public final void mo21654a(String str) {
        C89219l.m154719c(str, "");
        this.f32745a = str;
    }
}
