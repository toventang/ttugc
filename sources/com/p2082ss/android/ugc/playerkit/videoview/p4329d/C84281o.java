package com.p2082ss.android.ugc.playerkit.videoview.p4329d;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.playerkit.videoview.p4329d.AbstractC84278n;
import java.util.List;

/* renamed from: com.ss.android.ugc.playerkit.videoview.d.o */
public final class C84281o implements AbstractC84278n.AbstractC84280a {

    /* renamed from: a */
    private List<AbstractC84278n> f188472a;

    /* renamed from: b */
    private C84273i f188473b;

    /* renamed from: c */
    private C84264a f188474c;

    /* renamed from: d */
    private C84276l f188475d;

    /* renamed from: e */
    private int f188476e;

    static {
        Covode.recordClassIndex(98196);
    }

    @Override // com.p2082ss.android.ugc.playerkit.videoview.p4329d.AbstractC84278n.AbstractC84280a
    /* renamed from: a */
    public final C84273i mo129301a() {
        return this.f188473b;
    }

    @Override // com.p2082ss.android.ugc.playerkit.videoview.p4329d.AbstractC84278n.AbstractC84280a
    /* renamed from: b */
    public final C84264a mo129305b() {
        return this.f188474c;
    }

    @Override // com.p2082ss.android.ugc.playerkit.videoview.p4329d.AbstractC84278n.AbstractC84280a
    /* renamed from: c */
    public final C84276l mo129306c() {
        return this.f188475d;
    }

    @Override // com.p2082ss.android.ugc.playerkit.videoview.p4329d.AbstractC84278n.AbstractC84280a
    /* renamed from: a */
    public final C84274j mo129302a(C84264a aVar) {
        if (this.f188476e < this.f188472a.size()) {
            return this.f188472a.get(this.f188476e).mo117451b(new C84281o(this.f188472a, aVar, this.f188476e + 1));
        }
        throw new AssertionError();
    }

    @Override // com.p2082ss.android.ugc.playerkit.videoview.p4329d.AbstractC84278n.AbstractC84280a
    /* renamed from: a */
    public final C84274j mo129303a(C84273i iVar) {
        if (this.f188476e < this.f188472a.size()) {
            return this.f188472a.get(this.f188476e).mo117450a(new C84281o(this.f188472a, iVar, this.f188476e + 1));
        }
        throw new AssertionError();
    }

    @Override // com.p2082ss.android.ugc.playerkit.videoview.p4329d.AbstractC84278n.AbstractC84280a
    /* renamed from: a */
    public final C84274j mo129304a(C84276l lVar) {
        if (this.f188476e < this.f188472a.size()) {
            return this.f188472a.get(this.f188476e).mo117452c(new C84281o(this.f188472a, lVar, this.f188476e + 1));
        }
        throw new AssertionError();
    }

    public C84281o(List<AbstractC84278n> list, C84264a aVar, int i) {
        this.f188472a = list;
        this.f188476e = i;
        this.f188474c = aVar;
    }

    public C84281o(List<AbstractC84278n> list, C84273i iVar, int i) {
        this.f188472a = list;
        this.f188473b = iVar;
        this.f188476e = i;
    }

    public C84281o(List<AbstractC84278n> list, C84276l lVar, int i) {
        this.f188472a = list;
        this.f188476e = i;
        this.f188475d = lVar;
    }
}
