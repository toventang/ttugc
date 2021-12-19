package com.lynx.tasm;

import android.content.Context;
import android.view.View;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.lynx.tasm.behavior.AbstractC28510f;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import javax.xml.transform.Transformer;

/* renamed from: com.lynx.tasm.o */
public abstract class AbstractC28838o implements AbstractC28510f {
    static {
        Covode.recordClassIndex(34946);
    }

    /* renamed from: a */
    public void mo14467a() {
    }

    @Override // com.lynx.tasm.behavior.AbstractC28510f
    /* renamed from: a */
    public void mo26065a(Context context, String str, String str2, float f, float f2, Transformer transformer, AbstractC28510f.AbstractC28511a aVar) {
    }

    /* renamed from: a */
    public void mo14468a(LynxPerfMetric lynxPerfMetric) {
    }

    /* renamed from: a */
    public void mo49968a(C28783h hVar) {
    }

    /* renamed from: a */
    public void mo19151a(C28816j jVar) {
    }

    /* renamed from: a */
    public void mo49969a(C28839a aVar) {
    }

    /* renamed from: a */
    public void mo49970a(C28840b bVar) {
    }

    /* renamed from: a */
    public void mo14469a(String str) {
    }

    /* renamed from: a */
    public void mo33420a(String str, String str2, int i) {
    }

    /* renamed from: a */
    public void mo49971a(HashMap<String, Object> hashMap) {
    }

    /* renamed from: a */
    public void mo49972a(Map<String, Object> map) {
    }

    /* renamed from: a */
    public void mo49973a(Set<String> set) {
    }

    /* renamed from: b */
    public void mo14470b() {
    }

    /* renamed from: b */
    public void mo14471b(LynxPerfMetric lynxPerfMetric) {
    }

    /* renamed from: b */
    public void mo36952b(C28816j jVar) {
    }

    /* renamed from: b */
    public void mo49974b(C28840b bVar) {
    }

    /* renamed from: b */
    public void mo14472b(String str) {
    }

    /* renamed from: c */
    public void mo16280c() {
    }

    /* renamed from: c */
    public void mo36953c(C28816j jVar) {
    }

    /* renamed from: c */
    public void mo14473c(String str) {
    }

    @Override // com.lynx.tasm.behavior.AbstractC28510f
    /* renamed from: d */
    public String mo14474d(String str) {
        return null;
    }

    /* renamed from: d */
    public void mo19152d() {
    }

    /* renamed from: d */
    public void mo36954d(C28816j jVar) {
    }

    /* renamed from: e */
    public void mo19153e() {
    }

    /* renamed from: f */
    public void mo33421f() {
    }

    /* renamed from: com.lynx.tasm.o$a */
    public static class C28839a {

        /* renamed from: a */
        public final boolean f68078a;

        /* renamed from: b */
        public final long f68079b;

        /* renamed from: c */
        public final long f68080c;

        static {
            Covode.recordClassIndex(34947);
        }

        public final String toString() {
            return C1764a.m5928a("FlushInfo is sync:" + this.f68078a + ", begin timing:" + this.f68079b + ", end timing:" + this.f68080c, new Object[0]);
        }

        public C28839a(boolean z, long j, long j2) {
            this.f68078a = z;
            this.f68079b = j;
            this.f68080c = j2;
        }
    }

    /* renamed from: com.lynx.tasm.o$b */
    public static class C28840b {

        /* renamed from: a */
        public View f68081a;

        /* renamed from: b */
        public String f68082b;

        /* renamed from: c */
        public String f68083c;

        static {
            Covode.recordClassIndex(34948);
        }

        public final String toString() {
            return C1764a.m5928a("ViewInfo @%d view %s, name %s, monitor-name %s", new Object[]{Integer.valueOf(hashCode()), this.f68081a.getClass().getSimpleName(), this.f68082b, this.f68083c});
        }

        public C28840b(View view, String str, String str2) {
            this.f68081a = view;
            this.f68082b = str;
            this.f68083c = str2;
        }
    }
}
