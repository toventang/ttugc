package com.lynx.tasm;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.lynx.tasm.AbstractC28838o;
import com.lynx.tasm.behavior.AbstractC28510f;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import javax.xml.transform.Transformer;

/* renamed from: com.lynx.tasm.p */
public class C28841p extends AbstractC28838o {

    /* renamed from: a */
    CopyOnWriteArrayList<AbstractC28838o> f68084a = new CopyOnWriteArrayList<>();

    static {
        Covode.recordClassIndex(34949);
    }

    @Override // com.lynx.tasm.AbstractC28838o
    /* renamed from: a */
    public final void mo49971a(HashMap<String, Object> hashMap) {
        Iterator<AbstractC28838o> it = this.f68084a.iterator();
        while (it.hasNext()) {
            it.next().mo49971a(hashMap);
        }
    }

    @Override // com.lynx.tasm.AbstractC28838o
    /* renamed from: a */
    public final void mo49973a(Set<String> set) {
        Iterator<AbstractC28838o> it = this.f68084a.iterator();
        while (it.hasNext()) {
            it.next().mo49973a(set);
        }
    }

    @Override // com.lynx.tasm.AbstractC28838o
    /* renamed from: a */
    public final void mo33420a(String str, String str2, int i) {
        Iterator<AbstractC28838o> it = this.f68084a.iterator();
        while (it.hasNext()) {
            it.next().mo33420a(str, str2, i);
        }
    }

    @Override // com.lynx.tasm.AbstractC28838o
    /* renamed from: a */
    public final void mo49972a(Map<String, Object> map) {
        Iterator<AbstractC28838o> it = this.f68084a.iterator();
        while (it.hasNext()) {
            it.next().mo49972a(map);
        }
    }

    @Override // com.lynx.tasm.AbstractC28838o
    /* renamed from: a */
    public final void mo14467a() {
        Iterator<AbstractC28838o> it = this.f68084a.iterator();
        while (it.hasNext()) {
            it.next().mo14467a();
        }
    }

    @Override // com.lynx.tasm.AbstractC28838o
    /* renamed from: b */
    public final void mo14470b() {
        Iterator<AbstractC28838o> it = this.f68084a.iterator();
        while (it.hasNext()) {
            it.next().mo14470b();
        }
    }

    @Override // com.lynx.tasm.AbstractC28838o
    /* renamed from: c */
    public final void mo16280c() {
        Iterator<AbstractC28838o> it = this.f68084a.iterator();
        while (it.hasNext()) {
            it.next().mo16280c();
        }
    }

    @Override // com.lynx.tasm.AbstractC28838o
    /* renamed from: e */
    public final void mo19153e() {
        Iterator<AbstractC28838o> it = this.f68084a.iterator();
        while (it.hasNext()) {
            it.next().mo19153e();
        }
    }

    @Override // com.lynx.tasm.AbstractC28838o
    /* renamed from: f */
    public final void mo33421f() {
        Iterator<AbstractC28838o> it = this.f68084a.iterator();
        while (it.hasNext()) {
            it.next().mo33421f();
        }
    }

    @Override // com.lynx.tasm.AbstractC28838o
    /* renamed from: d */
    public final void mo19152d() {
        Iterator<AbstractC28838o> it = this.f68084a.iterator();
        while (it.hasNext()) {
            it.next().mo19152d();
        }
    }

    /* renamed from: a */
    public final void mo49977a(AbstractC28838o oVar) {
        if (!this.f68084a.contains(oVar)) {
            this.f68084a.add(oVar);
        }
    }

    @Override // com.lynx.tasm.behavior.AbstractC28510f, com.lynx.tasm.AbstractC28838o
    /* renamed from: d */
    public final String mo14474d(String str) {
        Iterator<AbstractC28838o> it = this.f68084a.iterator();
        while (it.hasNext()) {
            String d = it.next().mo14474d(str);
            if (d != null) {
                return d;
            }
        }
        return null;
    }

    @Override // com.lynx.tasm.AbstractC28838o
    /* renamed from: b */
    public final void mo14471b(LynxPerfMetric lynxPerfMetric) {
        Iterator<AbstractC28838o> it = this.f68084a.iterator();
        while (it.hasNext()) {
            it.next().mo14471b(lynxPerfMetric);
        }
    }

    @Override // com.lynx.tasm.AbstractC28838o
    /* renamed from: c */
    public final void mo36953c(C28816j jVar) {
        Iterator<AbstractC28838o> it = this.f68084a.iterator();
        while (it.hasNext()) {
            it.next().mo36953c(jVar);
        }
    }

    @Override // com.lynx.tasm.AbstractC28838o
    /* renamed from: a */
    public final void mo14468a(LynxPerfMetric lynxPerfMetric) {
        Iterator<AbstractC28838o> it = this.f68084a.iterator();
        while (it.hasNext()) {
            it.next().mo14468a(lynxPerfMetric);
        }
    }

    @Override // com.lynx.tasm.AbstractC28838o
    /* renamed from: b */
    public final void mo36952b(C28816j jVar) {
        Iterator<AbstractC28838o> it = this.f68084a.iterator();
        while (it.hasNext()) {
            it.next().mo36952b(jVar);
        }
    }

    @Override // com.lynx.tasm.AbstractC28838o
    /* renamed from: c */
    public final void mo14473c(String str) {
        Iterator<AbstractC28838o> it = this.f68084a.iterator();
        while (it.hasNext()) {
            it.next().mo14473c(str);
        }
    }

    @Override // com.lynx.tasm.AbstractC28838o
    /* renamed from: d */
    public final void mo36954d(C28816j jVar) {
        Iterator<AbstractC28838o> it = this.f68084a.iterator();
        while (it.hasNext()) {
            it.next().mo36954d(jVar);
        }
    }

    @Override // com.lynx.tasm.AbstractC28838o
    /* renamed from: a */
    public final void mo49968a(C28783h hVar) {
        Iterator<AbstractC28838o> it = this.f68084a.iterator();
        while (it.hasNext()) {
            it.next().mo49968a(hVar);
        }
    }

    @Override // com.lynx.tasm.AbstractC28838o
    /* renamed from: b */
    public final void mo49974b(AbstractC28838o.C28840b bVar) {
        Iterator<AbstractC28838o> it = this.f68084a.iterator();
        while (it.hasNext()) {
            it.next().mo49974b(bVar);
        }
    }

    @Override // com.lynx.tasm.AbstractC28838o
    /* renamed from: a */
    public final void mo19151a(C28816j jVar) {
        Iterator<AbstractC28838o> it = this.f68084a.iterator();
        while (it.hasNext()) {
            it.next().mo19151a(jVar);
        }
    }

    @Override // com.lynx.tasm.AbstractC28838o
    /* renamed from: b */
    public final void mo14472b(String str) {
        Iterator<AbstractC28838o> it = this.f68084a.iterator();
        while (it.hasNext()) {
            it.next().mo14472b(str);
        }
    }

    @Override // com.lynx.tasm.AbstractC28838o
    /* renamed from: a */
    public final void mo49969a(AbstractC28838o.C28839a aVar) {
        Iterator<AbstractC28838o> it = this.f68084a.iterator();
        while (it.hasNext()) {
            it.next().mo49969a(aVar);
        }
    }

    @Override // com.lynx.tasm.AbstractC28838o
    /* renamed from: a */
    public final void mo49970a(AbstractC28838o.C28840b bVar) {
        Iterator<AbstractC28838o> it = this.f68084a.iterator();
        while (it.hasNext()) {
            it.next().mo49970a(bVar);
        }
    }

    @Override // com.lynx.tasm.AbstractC28838o
    /* renamed from: a */
    public final void mo14469a(String str) {
        Iterator<AbstractC28838o> it = this.f68084a.iterator();
        while (it.hasNext()) {
            it.next().mo14469a(str);
        }
    }

    @Override // com.lynx.tasm.behavior.AbstractC28510f, com.lynx.tasm.AbstractC28838o
    /* renamed from: a */
    public final void mo26065a(Context context, String str, String str2, float f, float f2, Transformer transformer, AbstractC28510f.AbstractC28511a aVar) {
        Iterator<AbstractC28838o> it = this.f68084a.iterator();
        while (it.hasNext()) {
            it.next().mo26065a(context, str, str2, f, f2, transformer, aVar);
        }
    }
}
