package com.p2082ss.android.ugc.aweme.emoji.emojichoose;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.p2082ss.android.ugc.aweme.emoji.emojichoose.model.C46516b;
import com.p2082ss.android.ugc.aweme.emoji.p2897b.AbstractC46452f;
import com.p2082ss.android.ugc.aweme.emoji.p2904g.C46534a;
import com.p2082ss.android.ugc.aweme.emoji.p2906i.C46576c;
import com.p2082ss.android.ugc.aweme.emoji.sysemoji.C46615q;
import com.p2082ss.android.ugc.aweme.emoji.systembigemoji.C46616a;
import com.p2082ss.android.ugc.aweme.emoji.systembigemoji.C46625c;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.emoji.emojichoose.n */
public final class C46517n {

    /* renamed from: a */
    public AbstractC46452f f108449a;

    /* renamed from: b */
    public List<AbstractC46452f> f108450b = new ArrayList();

    /* renamed from: c */
    public int f108451c;

    /* renamed from: d */
    private C46576c f108452d;

    /* renamed from: e */
    private C46615q f108453e;

    /* renamed from: f */
    private C46502d f108454f;

    static {
        Covode.recordClassIndex(55104);
    }

    /* renamed from: c */
    public final int mo79062c() {
        return this.f108450b.size();
    }

    /* renamed from: b */
    public final int mo79060b() {
        AbstractC46452f fVar = this.f108449a;
        if (fVar == null) {
            return 0;
        }
        return fVar.mo78971f();
    }

    /* renamed from: d */
    private void m89786d() {
        if (this.f108454f.f108379a) {
            if (this.f108452d == null) {
                this.f108452d = new C46576c(C17867d.m33078a());
            }
            m89785a(this.f108452d);
        }
    }

    /* renamed from: e */
    private void m89787e() {
        if (this.f108454f.f108383e) {
            if (this.f108453e == null) {
                this.f108453e = new C46615q(C17867d.m33078a(), this.f108454f.f108385g);
            }
            m89785a(this.f108453e);
        }
    }

    /* renamed from: a */
    public final void mo79058a() {
        LinkedHashMap<C46516b, List<C46534a>> linkedHashMap;
        this.f108450b.clear();
        m89786d();
        m89787e();
        if (this.f108454f.f108382d && (linkedHashMap = C46616a.f108703a) != null && !linkedHashMap.isEmpty()) {
            for (Map.Entry<C46516b, List<C46534a>> entry : linkedHashMap.entrySet()) {
                C46625c cVar = new C46625c();
                cVar.f108729d = entry.getKey();
                cVar.f108728c = entry.getValue();
                m89785a(cVar);
            }
        }
        if (this.f108451c >= mo79062c()) {
            mo79059a(0);
        }
    }

    public C46517n(C46502d dVar) {
        this.f108454f = dVar;
        m89786d();
        m89787e();
        mo79059a(0);
    }

    /* renamed from: a */
    private void m89785a(AbstractC46452f fVar) {
        if (this.f108450b == null) {
            this.f108450b = new ArrayList();
        }
        this.f108450b.add(fVar);
    }

    /* renamed from: b */
    public final AbstractC46452f mo79061b(int i) {
        return this.f108450b.get(i);
    }

    /* renamed from: a */
    public final void mo79059a(int i) {
        if (i >= 0 && i < mo79062c()) {
            this.f108451c = i;
            this.f108449a = this.f108450b.get(i);
        }
    }
}
