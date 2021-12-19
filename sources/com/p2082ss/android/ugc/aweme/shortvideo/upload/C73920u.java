package com.p2082ss.android.ugc.aweme.shortvideo.upload;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.upload.u */
public final class C73920u {

    /* renamed from: a */
    public final String f165949a;

    /* renamed from: b */
    public final EnumC73919t f165950b;

    /* renamed from: c */
    public float f165951c;

    /* renamed from: d */
    public float f165952d;

    /* renamed from: e */
    public float f165953e;

    /* renamed from: f */
    public float f165954f;

    /* renamed from: g */
    public String f165955g;

    /* renamed from: h */
    public String f165956h;

    /* renamed from: i */
    public boolean f165957i;

    static {
        Covode.recordClassIndex(86667);
    }

    /* renamed from: a */
    public final C73921a mo116367a() {
        if (!this.f165957i) {
            return null;
        }
        float f = this.f165951c;
        return new C73921a(f, f - this.f165953e, toString());
    }

    public final String toString() {
        return "Record(creationId='" + this.f165949a + "', type=" + this.f165950b + ", initMB=" + this.f165951c + ", beforeCompileMB=" + this.f165952d + ", afterCompileMB=" + this.f165953e + ", compileFileMB=" + this.f165954f + ')';
    }

    /* renamed from: a */
    public final void mo116368a(String str) {
        C89219l.m154721d(str, "");
        this.f165955g = str;
    }

    /* renamed from: b */
    public final void mo116369b(String str) {
        C89219l.m154721d(str, "");
        this.f165956h = str;
    }

    public /* synthetic */ C73920u(String str, EnumC73919t tVar) {
        this(str, tVar, "", "");
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.upload.u$a */
    public static final class C73921a {

        /* renamed from: a */
        public final float f165958a;

        /* renamed from: b */
        public final float f165959b;

        /* renamed from: c */
        public final String f165960c;

        static {
            Covode.recordClassIndex(86668);
        }

        public C73921a(float f, float f2, String str) {
            C89219l.m154721d(str, "");
            this.f165958a = f;
            this.f165959b = f2;
            this.f165960c = str;
        }
    }

    private C73920u(String str, EnumC73919t tVar, String str2, String str3) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(tVar, "");
        C89219l.m154721d(str2, "");
        C89219l.m154721d(str3, "");
        this.f165949a = str;
        this.f165950b = tVar;
        this.f165951c = 0.0f;
        this.f165952d = 0.0f;
        this.f165953e = 0.0f;
        this.f165954f = 0.0f;
        this.f165955g = str2;
        this.f165956h = str3;
        this.f165957i = true;
    }
}
