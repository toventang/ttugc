package com.p2082ss.android.ugc.aweme.homepage.api.interaction;

import androidx.lifecycle.C1213t;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.homepage.api.interaction.a */
public final class C52952a extends C1213t<Integer> {

    /* renamed from: a */
    public boolean f121780a;

    /* renamed from: b */
    public AbstractC52954b f121781b = new C52953a();

    static {
        Covode.recordClassIndex(62479);
    }

    /* renamed from: com.ss.android.ugc.aweme.homepage.api.interaction.a$a */
    public static final class C52953a implements AbstractC52954b {
        static {
            Covode.recordClassIndex(62480);
        }

        @Override // com.p2082ss.android.ugc.aweme.homepage.api.interaction.AbstractC52954b
        /* renamed from: a */
        public final int mo70679a() {
            return 0;
        }

        @Override // com.p2082ss.android.ugc.aweme.homepage.api.interaction.AbstractC52954b
        /* renamed from: a */
        public final void mo70680a(int i) {
        }

        @Override // com.p2082ss.android.ugc.aweme.homepage.api.interaction.AbstractC52954b
        /* renamed from: a */
        public final void mo70681a(int i, boolean z) {
        }

        C52953a() {
        }
    }

    /* renamed from: a */
    public final Integer getValue() {
        return Integer.valueOf(this.f121781b.mo70679a());
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // androidx.lifecycle.LiveData, androidx.lifecycle.C1213t
    public final /* synthetic */ void setValue(Integer num) {
        mo89363a(num.intValue());
    }

    /* renamed from: a */
    public final void mo89363a(int i) {
        this.f121781b.mo70680a(i);
        super.setValue(Integer.valueOf(i));
    }

    /* renamed from: a */
    public final void mo89365a(AbstractC52954b bVar) {
        C89219l.m154721d(bVar, "");
        this.f121780a = true;
        this.f121781b = bVar;
    }

    /* renamed from: a */
    public final void mo89364a(int i, boolean z) {
        m97813b(i, z);
    }

    /* renamed from: b */
    private void m97813b(int i, boolean z) {
        this.f121781b.mo70681a(i, z);
        super.setValue(Integer.valueOf(i));
    }
}
