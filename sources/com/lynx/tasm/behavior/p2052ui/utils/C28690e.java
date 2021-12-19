package com.lynx.tasm.behavior.p2052ui.utils;

import android.graphics.drawable.Drawable;
import com.bytedance.covode.number.Covode;
import com.lynx.tasm.behavior.AbstractC28520j;
import com.lynx.tasm.behavior.p2052ui.utils.C28683b;

/* renamed from: com.lynx.tasm.behavior.ui.utils.e */
public class C28690e {

    /* renamed from: d */
    protected final AbstractC28520j f67658d;

    /* renamed from: e */
    public BackgroundDrawable f67659e;

    /* renamed from: f */
    public Drawable.Callback f67660f;

    /* renamed from: g */
    public float f67661g;

    /* renamed from: h */
    public int f67662h;

    static {
        Covode.recordClassIndex(34766);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public BackgroundDrawable mo49765a() {
        return new BackgroundDrawable(this.f67658d, this.f67661g);
    }

    /* renamed from: d */
    public final C28683b mo49780d() {
        BackgroundDrawable backgroundDrawable = this.f67659e;
        if (backgroundDrawable == null) {
            return null;
        }
        return backgroundDrawable.f67608g;
    }

    /* renamed from: c */
    public final BackgroundDrawable mo49779c() {
        if (this.f67659e == null) {
            BackgroundDrawable a = mo49765a();
            this.f67659e = a;
            a.setCallback(this.f67660f);
        }
        return this.f67659e;
    }

    public C28690e(AbstractC28520j jVar) {
        this.f67658d = jVar;
    }

    /* renamed from: a */
    public final void mo49776a(int i) {
        this.f67662h = i;
        if (i != 0 || this.f67659e != null) {
            mo49779c().setColor(i);
        }
    }

    /* renamed from: a */
    public final void mo49778a(int i, C28683b.C28684a aVar) {
        mo49779c().mo49752a(i, aVar);
    }

    /* renamed from: a */
    public final void mo49777a(int i, float f, float f2) {
        mo49779c().mo49751a(i, f, f2);
    }
}
