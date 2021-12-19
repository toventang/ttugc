package com.lynx.tasm.behavior.p2049b;

import android.view.ViewGroup;
import com.bytedance.covode.number.Covode;
import com.lynx.tasm.behavior.p2049b.C28471b;
import com.lynx.tasm.behavior.p2052ui.LynxUI;
import com.lynx.tasm.behavior.p2052ui.UIGroup;
import com.lynx.tasm.p2043a.C28407b;
import com.lynx.tasm.p2043a.p2044a.C28397c;
import java.util.HashMap;

/* renamed from: com.lynx.tasm.behavior.b.a */
public class C28466a {

    /* renamed from: a */
    public final LynxUI f66944a;

    /* renamed from: b */
    public int f66945b;

    /* renamed from: c */
    public ViewGroup f66946c;

    /* renamed from: d */
    public UIGroup f66947d;

    /* renamed from: e */
    public C28407b f66948e;

    /* renamed from: f */
    public C28407b f66949f;

    /* renamed from: g */
    public C28407b f66950g;

    /* renamed from: h */
    public C28407b f66951h;

    /* renamed from: i */
    public String f66952i;

    /* renamed from: j */
    public volatile boolean f66953j;

    /* renamed from: k */
    public volatile boolean f66954k;

    /* renamed from: l */
    public HashMap<String, C28397c.AbstractC28403c> f66955l = new HashMap<>();

    static {
        Covode.recordClassIndex(34464);
    }

    /* renamed from: a */
    public final boolean mo48976a() {
        if (this.f66953j || this.f66954k) {
            return true;
        }
        return false;
    }

    public C28466a(LynxUI lynxUI) {
        this.f66944a = lynxUI;
    }

    /* renamed from: a */
    public final void mo48975a(String str) {
        this.f66952i = str;
        C28471b.C28474a.f66975a.mo48982a(this.f66944a, str);
    }
}
