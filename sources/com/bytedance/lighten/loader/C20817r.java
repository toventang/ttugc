package com.bytedance.lighten.loader;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.facebook.imagepipeline.p1879d.AbstractC24395n;
import com.facebook.imagepipeline.p1879d.C24382h;

/* renamed from: com.bytedance.lighten.loader.r */
public class C20817r implements AbstractC24395n {

    /* renamed from: a */
    private static volatile C20817r f49239a;

    /* renamed from: b */
    private C24382h<?, ?> f49240b;

    /* renamed from: c */
    private C24382h<?, ?> f49241c;

    /* renamed from: d */
    private int f49242d;

    /* renamed from: e */
    private int f49243e;

    /* renamed from: f */
    private int f49244f;

    /* renamed from: g */
    private int f49245g;

    /* renamed from: h */
    private int f49246h;

    /* renamed from: i */
    private int f49247i;

    static {
        Covode.recordClassIndex(24393);
    }

    private C20817r() {
    }

    @Override // com.facebook.imagepipeline.p1879d.AbstractC24395n
    /* renamed from: b */
    public final void mo34247b() {
        this.f49242d++;
    }

    @Override // com.facebook.imagepipeline.p1879d.AbstractC24395n
    /* renamed from: c */
    public final void mo34249c() {
        this.f49243e++;
    }

    @Override // com.facebook.imagepipeline.p1879d.AbstractC24395n
    /* renamed from: d */
    public final void mo34250d() {
        this.f49244f++;
    }

    @Override // com.facebook.imagepipeline.p1879d.AbstractC24395n
    /* renamed from: e */
    public final void mo34251e() {
        this.f49245g++;
    }

    @Override // com.facebook.imagepipeline.p1879d.AbstractC24395n
    /* renamed from: f */
    public final void mo34252f() {
        this.f49246h++;
    }

    @Override // com.facebook.imagepipeline.p1879d.AbstractC24395n
    /* renamed from: g */
    public final void mo34253g() {
        this.f49247i++;
    }

    /* renamed from: a */
    public static C20817r m39155a() {
        MethodCollector.m26663i(12844);
        if (f49239a == null) {
            synchronized (C20817r.class) {
                try {
                    if (f49239a == null) {
                        f49239a = new C20817r();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(12844);
                    throw th;
                }
            }
        }
        C20817r rVar = f49239a;
        MethodCollector.m26664o(12844);
        return rVar;
    }

    @Override // com.facebook.imagepipeline.p1879d.AbstractC24395n
    /* renamed from: a */
    public final void mo34246a(C24382h<?, ?> hVar) {
        this.f49240b = hVar;
    }

    @Override // com.facebook.imagepipeline.p1879d.AbstractC24395n
    /* renamed from: b */
    public final void mo34248b(C24382h<?, ?> hVar) {
        this.f49241c = hVar;
    }
}
