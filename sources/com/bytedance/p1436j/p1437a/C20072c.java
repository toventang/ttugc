package com.bytedance.p1436j.p1437a;

import com.bytedance.covode.number.Covode;
import com.bytedance.p1436j.p1437a.p1440c.C20077c;
import com.bytedance.p1436j.p1437a.p1442e.C20098a;
import com.bytedance.p1436j.p1437a.p1442e.C20100b;
import com.lynx.tasm.AbstractC28838o;
import com.lynx.tasm.C28818l;
import com.lynx.tasm.C28820n;
import com.lynx.tasm.TemplateData;
import com.lynx.tasm.behavior.C28463a;
import com.lynx.tasm.component.AbstractC28735a;
import java.util.List;
import java.util.Map;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.j.a.c */
public final class C20072c {

    /* renamed from: a */
    public C28818l f47765a;

    /* renamed from: b */
    public String f47766b;

    /* renamed from: c */
    public Integer f47767c;

    /* renamed from: d */
    public Integer f47768d;

    /* renamed from: e */
    public Integer f47769e;

    /* renamed from: f */
    public Float f47770f;

    /* renamed from: g */
    public AbstractC28735a f47771g;

    /* renamed from: h */
    public C20102f f47772h;

    /* renamed from: i */
    public TemplateData f47773i;

    /* renamed from: j */
    public boolean f47774j;

    /* renamed from: k */
    public AbstractC89172b<? super C28820n, C89391z> f47775k;

    /* renamed from: l */
    public Map<String, Object> f47776l;

    /* renamed from: m */
    public List<AbstractC28838o> f47777m;

    /* renamed from: n */
    public Map<String, C20100b> f47778n;

    /* renamed from: o */
    public List<C28463a> f47779o;

    /* renamed from: p */
    public C20098a f47780p;

    /* renamed from: q */
    public C20068b f47781q;

    /* renamed from: r */
    public String f47782r;

    static {
        Covode.recordClassIndex(23580);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C20072c)) {
            return false;
        }
        C20072c cVar = (C20072c) obj;
        return C89219l.m154714a(this.f47778n, cVar.f47778n) && C89219l.m154714a(this.f47779o, cVar.f47779o) && C89219l.m154714a(this.f47780p, cVar.f47780p) && C89219l.m154714a(this.f47781q, cVar.f47781q) && C89219l.m154714a(this.f47782r, cVar.f47782r);
    }

    public final int hashCode() {
        Map<String, C20100b> map = this.f47778n;
        int i = 0;
        int hashCode = (map != null ? map.hashCode() : 0) * 31;
        List<C28463a> list = this.f47779o;
        int hashCode2 = (hashCode + (list != null ? list.hashCode() : 0)) * 31;
        C20098a aVar = this.f47780p;
        int hashCode3 = (hashCode2 + (aVar != null ? aVar.hashCode() : 0)) * 31;
        C20068b bVar = this.f47781q;
        int hashCode4 = (hashCode3 + (bVar != null ? bVar.hashCode() : 0)) * 31;
        String str = this.f47782r;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode4 + i;
    }

    public final String toString() {
        return "LynxKitInitParams(lynxModules=" + this.f47778n + ", lynxBehaviors=" + this.f47779o + ", initData=" + this.f47780p + ", asyncLayoutParam=" + this.f47781q + ", preloadFonts=" + this.f47782r + ")";
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x010a, code lost:
        if (com.bytedance.p1436j.p1437a.p1444g.C20121a.f47884a == 1) goto L_0x010c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x011d, code lost:
        if (r0 != false) goto L_0x010c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private C20072c() {
        /*
        // Method dump skipped, instructions count: 362
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.p1436j.p1437a.C20072c.<init>():void");
    }

    public /* synthetic */ C20072c(byte b) {
        this();
    }

    /* renamed from: a */
    public final void mo33424a(Map<String, ? extends Object> map) {
        if (map != null) {
            this.f47776l.putAll(map);
        }
    }

    /* renamed from: a */
    public final void mo33422a(AbstractC28838o oVar) {
        C89219l.m154719c(oVar, "");
        this.f47777m.add(oVar);
    }

    /* renamed from: a */
    public final void mo33423a(String str, boolean z, boolean z2, String[] strArr) {
        C28818l a;
        C89219l.m154719c(str, "");
        this.f47766b = str;
        if (z) {
            a = C20077c.m38030a(str, strArr, z2);
        } else {
            a = C28818l.m57691a(str, strArr, z2);
        }
        this.f47765a = a;
    }
}
