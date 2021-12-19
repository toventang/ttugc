package com.bytedance.ies.bullet.service.base.resourceloader.config;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.service.base.p1163a.AbstractC16584o;
import com.bytedance.ies.bullet.service.base.p1168e.AbstractC16640d;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.bullet.service.base.resourceloader.config.j */
public class C16667j {

    /* renamed from: g */
    public C16658a f39839g;

    /* renamed from: h */
    public int f39840h;

    /* renamed from: i */
    public long f39841i;

    /* renamed from: j */
    public Integer f39842j;

    /* renamed from: k */
    public boolean f39843k;

    /* renamed from: l */
    public String f39844l;

    /* renamed from: m */
    public String f39845m;

    /* renamed from: n */
    public String f39846n;

    /* renamed from: o */
    public String f39847o;

    /* renamed from: p */
    public boolean f39848p;

    /* renamed from: q */
    public boolean f39849q;

    /* renamed from: r */
    public boolean f39850r;

    /* renamed from: s */
    public AbstractC16584o f39851s;

    /* renamed from: t */
    public String f39852t;

    /* renamed from: u */
    public String f39853u;

    /* renamed from: v */
    public boolean f39854v;

    /* renamed from: w */
    public AbstractC16640d f39855w;

    /* renamed from: x */
    public boolean f39856x;

    /* renamed from: y */
    public String f39857y;

    static {
        Covode.recordClassIndex(19106);
    }

    public /* synthetic */ C16667j() {
        this("");
    }

    public String toString() {
        return "[accessKey=" + this.f39857y + ", loaderConfig=" + this.f39839g + ", dynamic=" + this.f39842j + ',' + "onlyLocal=" + this.f39843k + ", channel=" + this.f39844l + ',' + "bundle=" + this.f39845m + ", group=" + this.f39846n + ",cdnUrl=" + this.f39847o + ',' + "enableCached:" + this.f39856x + ']';
    }

    /* renamed from: a */
    public final void mo26450a(C16658a aVar) {
        C89219l.m154719c(aVar, "");
        this.f39839g = aVar;
    }

    /* renamed from: b */
    public final void mo26452b(String str) {
        C89219l.m154719c(str, "");
        this.f39845m = str;
    }

    /* renamed from: c */
    public final void mo26453c(String str) {
        C89219l.m154719c(str, "");
        this.f39847o = str;
    }

    /* renamed from: d */
    public final void mo26454d(String str) {
        C89219l.m154719c(str, "");
        this.f39852t = str;
    }

    /* renamed from: e */
    public final void mo26455e(String str) {
        C89219l.m154719c(str, "");
        this.f39853u = str;
    }

    /* renamed from: f */
    public final void mo26456f(String str) {
        C89219l.m154719c(str, "");
        this.f39857y = str;
    }

    /* renamed from: a */
    public final void mo26451a(String str) {
        C89219l.m154719c(str, "");
        this.f39844l = str;
    }

    public C16667j(String str) {
        C89219l.m154719c(str, "");
        this.f39857y = str;
        this.f39839g = new C16658a(false);
        this.f39841i = 1000;
        this.f39844l = "";
        this.f39845m = "";
        this.f39847o = "";
        this.f39848p = true;
        this.f39849q = true;
        this.f39850r = true;
        this.f39852t = "";
        this.f39853u = "";
        this.f39856x = true;
    }

    /* renamed from: a */
    public C16667j mo25897a(C16667j jVar) {
        C89219l.m154719c(jVar, "");
        this.f39839g = jVar.f39839g;
        this.f39841i = jVar.f39841i;
        this.f39842j = jVar.f39842j;
        this.f39843k = jVar.f39843k;
        this.f39844l = jVar.f39844l;
        this.f39845m = jVar.f39845m;
        this.f39846n = jVar.f39846n;
        this.f39847o = jVar.f39847o;
        this.f39851s = jVar.f39851s;
        this.f39854v = jVar.f39854v;
        this.f39856x = jVar.f39856x;
        this.f39852t = jVar.f39852t;
        return this;
    }
}
