package com.bytedance.android.livesdk.survey.p638ui.p639a;

import com.bytedance.android.live.core.p213c.C3854a;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89204ab;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.livesdk.survey.ui.a.g */
public final class C10837g {

    /* renamed from: a */
    final List<AbstractC10836f> f26070a = new ArrayList();

    /* renamed from: b */
    private int f26071b;

    /* renamed from: c */
    private final boolean f26072c;

    /* renamed from: d */
    private final DataChannel f26073d;

    /* renamed from: e */
    private final AbstractC89172b<Boolean, C89391z> f26074e;

    static {
        Covode.recordClassIndex(12439);
    }

    /* renamed from: a */
    public final boolean mo17742a() {
        if (this.f26071b == this.f26070a.size()) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    private final void m19437c() {
        int i = this.f26071b + 1;
        this.f26071b = i;
        if (i == this.f26070a.size()) {
            this.f26074e.invoke(true);
        }
    }

    /* renamed from: d */
    private final void m19438d() {
        int i = this.f26071b - 1;
        this.f26071b = i;
        if (i != this.f26070a.size()) {
            this.f26074e.invoke(false);
        }
    }

    /* renamed from: b */
    public final void mo17743b() {
        Iterator<T> it = this.f26070a.iterator();
        while (it.hasNext()) {
            it.next().mo17734a();
        }
    }

    /* renamed from: a */
    public final void mo17740a(AbstractC10836f fVar) {
        C89219l.m154721d(fVar, "");
        fVar.mo17737a(this);
        fVar.mo17738a(this.f26073d);
        this.f26070a.add(fVar);
        mo17741a(fVar.f26069f);
    }

    /* renamed from: a */
    public final void mo17741a(boolean z) {
        if (!z) {
            m19437c();
        } else {
            m19438d();
        }
        if (this.f26072c) {
            for (T t : this.f26070a) {
                C3854a.m9453a(6, "SurveyEvasion", C89204ab.m154669a(t.getClass()).mo143613b() + ": " + t.f26069f);
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: h.f.a.b<? super java.lang.Boolean, h.z> */
    /* JADX WARN: Multi-variable type inference failed */
    public C10837g(DataChannel dataChannel, AbstractC89172b<? super Boolean, C89391z> bVar) {
        C89219l.m154721d(dataChannel, "");
        C89219l.m154721d(bVar, "");
        this.f26073d = dataChannel;
        this.f26074e = bVar;
    }
}
