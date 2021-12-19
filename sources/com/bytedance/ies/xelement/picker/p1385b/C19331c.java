package com.bytedance.ies.xelement.picker.p1385b;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xelement.p1366c.AbstractC19054a;
import com.bytedance.ies.xelement.picker.p1386c.C19333a;
import com.bytedance.ies.xelement.picker.p1386c.C19334b;
import com.bytedance.ies.xelement.picker.p1388e.AbstractC19343g;
import com.bytedance.ies.xelement.picker.p1388e.AbstractC19344h;
import com.bytedance.ies.xelement.picker.view.View$OnClickListenerC19363c;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.ies.xelement.picker.b.c */
public final class C19331c extends AbstractC19329a<C19331c> {

    /* renamed from: a */
    private C19334b f45684a;

    static {
        Covode.recordClassIndex(22119);
    }

    /* access modifiers changed from: package-private */
    @Override // com.bytedance.ies.xelement.picker.p1385b.AbstractC19329a
    /* renamed from: a */
    public final C19333a mo30782a() {
        return this.f45684a;
    }

    /* renamed from: b */
    public final View$OnClickListenerC19363c mo30798b() {
        return new View$OnClickListenerC19363c(this.f45684a);
    }

    /* renamed from: a */
    public final C19331c mo30793a(AbstractC19054a aVar) {
        this.f45684a.f45727L = aVar;
        return this;
    }

    public C19331c(Context context) {
        C19334b bVar = new C19334b();
        this.f45684a = bVar;
        bVar.f45698f = context;
    }

    /* renamed from: a */
    public final C19331c mo30794a(AbstractC19343g gVar) {
        this.f45684a.f45719D = gVar;
        return this;
    }

    /* renamed from: a */
    public final C19331c mo30795a(AbstractC19344h hVar) {
        this.f45684a.f45720E = hVar;
        return this;
    }

    /* renamed from: b */
    public final C19331c mo30797b(List<Integer> list) {
        if (list == null) {
            this.f45684a.f45723H = null;
        } else {
            this.f45684a.f45723H = new ArrayList(list);
        }
        return this;
    }

    /* renamed from: a */
    public final C19331c mo30796a(List<List<String>> list) {
        if (list == null) {
            this.f45684a.f45721F = null;
        } else {
            this.f45684a.f45721F = new ArrayList(list);
        }
        return this;
    }
}
