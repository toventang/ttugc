package com.lynx.tasm.behavior;

import com.bytedance.covode.number.Covode;
import com.lynx.tasm.AbstractC28392a;
import com.lynx.tasm.behavior.p2052ui.LynxFlattenUI;
import com.lynx.tasm.behavior.p2052ui.LynxUI;
import com.lynx.tasm.behavior.shadow.ShadowNode;

/* renamed from: com.lynx.tasm.behavior.a */
public class C28463a {

    /* renamed from: b */
    public String f66942b;

    /* renamed from: c */
    public final boolean f66943c;

    static {
        Covode.recordClassIndex(34461);
    }

    /* renamed from: a */
    public ShadowNode mo16276a() {
        return null;
    }

    /* renamed from: b */
    public AbstractC28392a mo26076b() {
        return null;
    }

    /* renamed from: b */
    public LynxFlattenUI mo16278b(AbstractC28520j jVar) {
        return null;
    }

    public String toString() {
        return "[" + getClass().getSimpleName() + " - " + this.f66942b + "]";
    }

    public C28463a(String str) {
        this(str, false);
    }

    /* renamed from: a */
    public LynxUI mo16275a(AbstractC28520j jVar) {
        throw new RuntimeException(this.f66942b + " is a virtual node, do not have real ui!");
    }

    public C28463a(String str, boolean z) {
        this.f66942b = str;
        this.f66943c = z;
    }
}
