package com.bytedance.ies.powerlist;

import android.content.Context;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerlist.p1231b.AbstractC17641a;
import com.bytedance.ies.powerlist.page.config.AbstractC17692b;
import p4600h.p4601a.C89064i;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.powerlist.e */
public abstract class AbstractC17654e {

    /* renamed from: c */
    public static final C17655a f42219c = new C17655a((byte) 0);

    /* renamed from: a */
    public PowerStub f42220a;

    /* renamed from: b */
    public Context f42221b;

    static {
        Covode.recordClassIndex(20208);
    }

    /* renamed from: a */
    public AbstractC17692b<?> mo28123a() {
        return null;
    }

    /* renamed from: c */
    public void mo28126c() {
    }

    /* renamed from: com.bytedance.ies.powerlist.e$a */
    public static final class C17655a {
        static {
            Covode.recordClassIndex(20209);
        }

        private C17655a() {
        }

        public /* synthetic */ C17655a(byte b) {
            this();
        }
    }

    /* renamed from: b */
    public final C17656f<AbstractC17641a> mo28125b() {
        C17656f<AbstractC17641a> fVar;
        PowerStub powerStub = this.f42220a;
        if (powerStub != null && (fVar = powerStub.f42169a) != null) {
            return fVar;
        }
        throw new RuntimeException("this chunk's stub is null, pls use this after onCreate");
    }

    /* renamed from: d_ */
    public final void mo28127d_(View view) {
        PowerStub powerStub = this.f42220a;
        if (powerStub != null) {
            powerStub.mo28097a(0, view);
        }
    }

    /* renamed from: a */
    public final void mo28124a(Class<? extends PowerCell<?>>... clsArr) {
        C89219l.m154719c(clsArr, "");
        PowerStub powerStub = this.f42220a;
        if (powerStub != null) {
            powerStub.mo28099a(C89064i.m154508i(clsArr));
        }
    }
}
