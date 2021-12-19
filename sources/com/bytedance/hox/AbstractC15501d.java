package com.bytedance.hox;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import com.bytedance.hox.p1106a.AbstractC15494a;
import com.bytedance.hox.p1106a.AbstractC15495b;
import com.bytedance.hox.p1106a.AbstractC15496c;
import com.bytedance.hox.p1106a.AbstractC15497d;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.hox.d */
public abstract class AbstractC15501d {

    /* renamed from: e */
    public AbstractC15498b f37771e;

    /* renamed from: f */
    public LinkedList<AbstractC15501d> f37772f;

    /* renamed from: g */
    public List<AbstractC15497d> f37773g = new ArrayList();

    /* renamed from: h */
    public List<AbstractC15494a> f37774h = new ArrayList();

    /* renamed from: i */
    public List<AbstractC15495b> f37775i = new ArrayList();

    static {
        Covode.recordClassIndex(17760);
    }

    /* renamed from: d */
    public abstract String mo25232d();

    /* renamed from: e */
    public String mo25233e() {
        return "";
    }

    /* renamed from: f */
    public abstract Class<? extends Fragment> mo25234f();

    /* renamed from: g */
    public abstract Bundle mo25235g();

    public AbstractC15501d() {
        LinkedList<AbstractC15501d> linkedList = new LinkedList<>();
        this.f37772f = linkedList;
        linkedList.add(this);
    }

    /* renamed from: b */
    public final void mo25231b(AbstractC15496c cVar) {
        C89219l.m154719c(cVar, "");
        mo25222a(cVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo25222a(AbstractC15496c cVar) {
        C89219l.m154719c(cVar, "");
        if (!C89070n.m154556a((Iterable) this.f37773g, (Object) cVar)) {
            if (cVar instanceof AbstractC15497d) {
                this.f37773g.add(cVar);
            }
            if (cVar instanceof AbstractC15494a) {
                this.f37774h.add(cVar);
            }
            if (cVar instanceof AbstractC15495b) {
                this.f37775i.add(cVar);
                return;
            }
            return;
        }
        throw new RuntimeException("have been added, cannot add again");
    }
}
