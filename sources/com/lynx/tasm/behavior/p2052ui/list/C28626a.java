package com.lynx.tasm.behavior.p2052ui.list;

import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.lynx.tasm.C28719c;

/* renamed from: com.lynx.tasm.behavior.ui.list.a */
public final class C28626a implements AbstractC28636d {

    /* renamed from: a */
    C28719c f67381a;

    /* renamed from: b */
    RecyclerView f67382b;

    /* renamed from: c */
    AbstractC28636d f67383c;

    /* renamed from: d */
    boolean f67384d;

    static {
        Covode.recordClassIndex(34685);
    }

    @Override // com.lynx.tasm.behavior.p2052ui.list.AbstractC28636d
    /* renamed from: a */
    public final void mo49558a() {
        this.f67383c.mo49558a();
    }

    @Override // com.lynx.tasm.behavior.p2052ui.list.AbstractC28636d
    /* renamed from: b */
    public final void mo49560b(C28644h hVar) {
        this.f67383c.mo49560b(hVar);
    }

    @Override // com.lynx.tasm.behavior.p2052ui.list.AbstractC28636d
    /* renamed from: c */
    public final void mo49561c(C28644h hVar) {
        this.f67383c.mo49561c(hVar);
    }

    @Override // com.lynx.tasm.behavior.p2052ui.list.AbstractC28636d
    /* renamed from: a */
    public final void mo49559a(C28644h hVar) {
        this.f67383c.mo49559a(hVar);
    }

    public C28626a(C28719c cVar, RecyclerView recyclerView) {
        this.f67381a = cVar;
        this.f67382b = recyclerView;
        this.f67383c = new C28627b(cVar);
    }
}
