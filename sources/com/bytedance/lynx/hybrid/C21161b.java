package com.bytedance.lynx.hybrid;

import android.content.Context;
import android.net.Uri;
import com.bytedance.covode.number.Covode;
import com.bytedance.lynx.hybrid.p1515a.AbstractC21152f;
import com.bytedance.lynx.hybrid.p1515a.EnumC21149c;
import com.bytedance.lynx.hybrid.service.IResourceService;
import com.lynx.tasm.AbstractC28838o;
import com.lynx.tasm.C28816j;
import com.lynx.tasm.LynxPerfMetric;
import com.lynx.tasm.behavior.AbstractC28510f;
import java.util.Iterator;
import java.util.List;
import javax.xml.transform.Transformer;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.lynx.hybrid.b */
public final class C21161b extends AbstractC28838o {

    /* renamed from: a */
    public Uri f50187a;

    /* renamed from: b */
    public final C21217l f50188b;

    /* renamed from: c */
    public AbstractC21152f f50189c;

    /* renamed from: d */
    private final IResourceService f50190d;

    static {
        Covode.recordClassIndex(24777);
    }

    @Override // com.lynx.tasm.AbstractC28838o
    /* renamed from: a */
    public final void mo14467a() {
        List<AbstractC28838o> list;
        C21217l lVar = this.f50188b;
        if (lVar != null && (list = lVar.f50355p) != null) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                it.next().mo14467a();
            }
        }
    }

    @Override // com.lynx.tasm.AbstractC28838o
    /* renamed from: b */
    public final void mo14470b() {
        List<AbstractC28838o> list;
        C21217l lVar = this.f50188b;
        if (lVar != null && (list = lVar.f50355p) != null) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                it.next().mo14470b();
            }
        }
    }

    @Override // com.lynx.tasm.AbstractC28838o
    /* renamed from: c */
    public final void mo16280c() {
        List<AbstractC28838o> list;
        C21217l lVar = this.f50188b;
        if (lVar != null && (list = lVar.f50355p) != null) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                it.next().mo16280c();
            }
        }
    }

    @Override // com.lynx.tasm.AbstractC28838o
    /* renamed from: e */
    public final void mo19153e() {
        List<AbstractC28838o> list;
        C21217l lVar = this.f50188b;
        if (lVar != null && (list = lVar.f50355p) != null) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                it.next().mo19153e();
            }
        }
    }

    @Override // com.lynx.tasm.AbstractC28838o
    /* renamed from: f */
    public final void mo33421f() {
        List<AbstractC28838o> list;
        C21217l lVar = this.f50188b;
        if (lVar != null && (list = lVar.f50355p) != null) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                it.next().mo33421f();
            }
        }
    }

    @Override // com.lynx.tasm.AbstractC28838o
    /* renamed from: d */
    public final void mo19152d() {
        EnumC21149c cVar;
        List<AbstractC28838o> list;
        C21217l lVar = this.f50188b;
        if (!(lVar == null || (list = lVar.f50355p) == null)) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                it.next().mo19152d();
            }
        }
        AbstractC21152f fVar = this.f50189c;
        if (fVar != null) {
            C21217l lVar2 = this.f50188b;
            if (lVar2 == null || (cVar = lVar2.f50340a) == null) {
                cVar = EnumC21149c.UNKNOWN;
            }
            fVar.mo34718a(cVar);
        }
    }

    @Override // com.lynx.tasm.AbstractC28838o
    /* renamed from: b */
    public final void mo14471b(LynxPerfMetric lynxPerfMetric) {
        List<AbstractC28838o> list;
        C21217l lVar = this.f50188b;
        if (lVar != null && (list = lVar.f50355p) != null) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                it.next().mo14471b(lynxPerfMetric);
            }
        }
    }

    @Override // com.lynx.tasm.AbstractC28838o
    /* renamed from: a */
    public final void mo14468a(LynxPerfMetric lynxPerfMetric) {
        List<AbstractC28838o> list;
        C21217l lVar = this.f50188b;
        if (lVar != null && (list = lVar.f50355p) != null) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                it.next().mo14468a(lynxPerfMetric);
            }
        }
    }

    @Override // com.lynx.tasm.AbstractC28838o
    /* renamed from: b */
    public final void mo14472b(String str) {
        List<AbstractC28838o> list;
        C21217l lVar = this.f50188b;
        if (lVar != null && (list = lVar.f50355p) != null) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                it.next().mo14472b(str);
            }
        }
    }

    @Override // com.lynx.tasm.AbstractC28838o
    /* renamed from: a */
    public final void mo19151a(C28816j jVar) {
        List<AbstractC28838o> list;
        C21217l lVar = this.f50188b;
        if (lVar != null && (list = lVar.f50355p) != null) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                it.next().mo19151a(jVar);
            }
        }
    }

    @Override // com.lynx.tasm.AbstractC28838o
    /* renamed from: a */
    public final void mo14469a(String str) {
        List<AbstractC28838o> list;
        C21217l lVar = this.f50188b;
        if (!(lVar == null || (list = lVar.f50355p) == null)) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                it.next().mo14469a(str);
            }
        }
        this.f50187a = Uri.parse(str);
    }

    /* JADX WARNING: Removed duplicated region for block: B:84:0x0212  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0216  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0218  */
    @Override // com.lynx.tasm.behavior.AbstractC28510f, com.lynx.tasm.AbstractC28838o
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String mo14474d(java.lang.String r20) {
        /*
        // Method dump skipped, instructions count: 564
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.lynx.hybrid.C21161b.mo14474d(java.lang.String):java.lang.String");
    }

    public C21161b(C21217l lVar, IResourceService iResourceService) {
        this.f50188b = lVar;
        this.f50190d = iResourceService;
    }

    @Override // com.lynx.tasm.AbstractC28838o
    /* renamed from: a */
    public final void mo33420a(String str, String str2, int i) {
        List<AbstractC28838o> list;
        C21217l lVar = this.f50188b;
        if (lVar != null && (list = lVar.f50355p) != null) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                it.next().mo33420a(str, str2, i);
            }
        }
    }

    @Override // com.lynx.tasm.behavior.AbstractC28510f, com.lynx.tasm.AbstractC28838o
    /* renamed from: a */
    public final void mo26065a(Context context, String str, String str2, float f, float f2, Transformer transformer, AbstractC28510f.AbstractC28511a aVar) {
        List<AbstractC28838o> list;
        C89219l.m154719c(context, "");
        C89219l.m154719c(aVar, "");
        C21217l lVar = this.f50188b;
        if (lVar != null && (list = lVar.f50355p) != null) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                it.next().mo26065a(context, str, str2, f, f2, transformer, aVar);
            }
        }
    }
}
