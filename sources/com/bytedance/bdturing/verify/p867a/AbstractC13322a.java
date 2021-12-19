package com.bytedance.bdturing.verify.p867a;

import android.app.Activity;
import com.bytedance.bdturing.p861a.C13247b;
import com.bytedance.bdturing.p866f.C13284b;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.bdturing.verify.a.a */
public abstract class AbstractC13322a {

    /* renamed from: a */
    public Activity f32577a;

    /* renamed from: b */
    public boolean f32578b;

    /* renamed from: c */
    public boolean f32579c;

    /* renamed from: d */
    public boolean f32580d = true;

    /* renamed from: e */
    public boolean f32581e = true;

    /* renamed from: f */
    private boolean f32582f;

    static {
        Covode.recordClassIndex(15290);
    }

    /* renamed from: a */
    public abstract void mo21492a(StringBuilder sb);

    /* renamed from: b */
    public abstract int mo21495b();

    /* renamed from: c */
    public abstract String mo21496c();

    /* renamed from: d */
    public abstract int mo21497d();

    /* renamed from: a */
    public boolean mo21494a() {
        return this.f32582f;
    }

    /* renamed from: e */
    public final String mo21498e() {
        mo21495b();
        StringBuilder a = C13247b.m23818a(mo21496c(), this.f32577a);
        if (this.f32578b) {
            C13284b.m23895a(a, "preload", 1);
        }
        mo21492a(a);
        String sb = a.toString();
        C89219l.m154709a((Object) sb, "");
        return sb;
    }

    /* renamed from: a */
    public void mo21493a(boolean z) {
        this.f32582f = z;
    }
}
