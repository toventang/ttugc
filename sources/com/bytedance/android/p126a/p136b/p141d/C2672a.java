package com.bytedance.android.p126a.p136b.p141d;

import com.bytedance.android.p126a.p127a.p131d.C2626b;
import com.bytedance.android.p126a.p136b.C2651a;
import com.bytedance.android.p126a.p136b.p141d.p142a.C2673a;
import com.bytedance.android.p126a.p136b.p141d.p143b.C2675a;
import com.bytedance.android.p126a.p136b.p141d.p144c.C2676a;
import com.bytedance.covode.number.Covode;
import java.util.List;

/* renamed from: com.bytedance.android.a.b.d.a */
public final class C2672a implements AbstractC2674b {

    /* renamed from: a */
    private C2651a f7987a;

    /* renamed from: b */
    private int f7988b;

    /* renamed from: c */
    private AbstractC2674b f7989c;

    static {
        Covode.recordClassIndex(3060);
    }

    @Override // com.bytedance.android.p126a.p136b.p141d.AbstractC2674b
    /* renamed from: b */
    public final List<C2626b> mo7189b() {
        return this.f7989c.mo7189b();
    }

    @Override // com.bytedance.android.p126a.p136b.p141d.AbstractC2674b
    /* renamed from: c */
    public final List<C2626b> mo7191c() {
        return this.f7989c.mo7191c();
    }

    @Override // com.bytedance.android.p126a.p136b.p141d.AbstractC2674b
    /* renamed from: d */
    public final void mo7193d() {
        this.f7989c.mo7193d();
    }

    @Override // com.bytedance.android.p126a.p136b.p141d.AbstractC2674b
    /* renamed from: a */
    public final void mo7186a() {
        this.f7989c.mo7186a();
    }

    @Override // com.bytedance.android.p126a.p136b.p141d.AbstractC2674b
    /* renamed from: a */
    public final List<C2626b> mo7185a(List<C2626b> list) {
        return this.f7989c.mo7185a(list);
    }

    @Override // com.bytedance.android.p126a.p136b.p141d.AbstractC2674b
    /* renamed from: b */
    public final void mo7190b(C2626b bVar) {
        this.f7989c.mo7190b(bVar);
    }

    @Override // com.bytedance.android.p126a.p136b.p141d.AbstractC2674b
    /* renamed from: c */
    public final void mo7192c(C2626b bVar) {
        this.f7989c.mo7192c(bVar);
    }

    public C2672a(C2651a aVar) {
        this.f7987a = aVar;
        int i = aVar.f7941a.f7974d;
        this.f7988b = i;
        this.f7989c = m7711b(i);
    }

    /* renamed from: b */
    private static AbstractC2674b m7711b(int i) {
        if (i == 0) {
            return new C2676a();
        }
        if (i == 1) {
            return new C2673a();
        }
        if (i != 2) {
            return null;
        }
        return new C2675a();
    }

    @Override // com.bytedance.android.p126a.p136b.p141d.AbstractC2674b
    /* renamed from: a */
    public final boolean mo7188a(C2626b bVar) {
        return this.f7989c.mo7188a(bVar);
    }

    @Override // com.bytedance.android.p126a.p136b.p141d.AbstractC2674b
    /* renamed from: a */
    public final void mo7187a(int i) {
        AbstractC2674b b;
        if ((i != this.f7988b || this.f7989c == null) && (b = m7711b(i)) != null) {
            AbstractC2674b bVar = this.f7989c;
            List<C2626b> list = null;
            if (bVar != null) {
                list = bVar.mo7189b();
                bVar.mo7186a();
                bVar.mo7193d();
            }
            this.f7989c = b;
            if (list != null) {
                b.mo7185a(list);
            }
        }
    }
}
