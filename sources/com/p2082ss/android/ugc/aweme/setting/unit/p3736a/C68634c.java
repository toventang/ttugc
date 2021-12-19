package com.p2082ss.android.ugc.aweme.setting.unit.p3736a;

import android.view.View;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.p2727db.AbstractC40931a;
import com.p2082ss.android.ugc.aweme.setting.p3732ui.p3734b.C68548c;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.setting.unit.a.c */
public final class C68634c extends AbstractC40931a<C68548c> {

    /* renamed from: a */
    private final C68548c f153585a;

    static {
        Covode.recordClassIndex(80890);
    }

    private /* synthetic */ C68634c() {
        this(null);
    }

    /* Return type fixed from 'com.ss.android.ugc.aweme.be.a' to match base method */
    @Override // com.p2082ss.android.ugc.aweme.p2727db.AbstractC40931a
    /* renamed from: b */
    public final /* synthetic */ C68548c mo70128b() {
        C68548c cVar = this.f153585a;
        if (cVar != null) {
            return cVar;
        }
        throw new RuntimeException("pls pass settingUnLoginItem or extends the SettingUnLoginUnit");
    }

    public C68634c(C68548c cVar) {
        this.f153585a = cVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.p2727db.AbstractC40931a
    /* renamed from: a */
    public final void mo70127a(boolean z) {
        mo70126a(new C68636b(this, z));
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.unit.a.c$a */
    public static final class C68635a extends AbstractC89220m implements AbstractC89172b<C68548c, C68548c> {

        /* renamed from: a */
        final /* synthetic */ C68634c f153586a;

        /* renamed from: b */
        final /* synthetic */ View.OnClickListener f153587b;

        static {
            Covode.recordClassIndex(80891);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C68635a(C68634c cVar, View.OnClickListener onClickListener) {
            super(1);
            this.f153586a = cVar;
            this.f153587b = onClickListener;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C68548c invoke(C68548c cVar) {
            C89219l.m154721d(cVar, "");
            return C68548c.m120976a((C68548c) this.f153586a.mo70132l(), null, false, this.f153587b, false, null, 27);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.unit.a.c$b */
    static final class C68636b extends AbstractC89220m implements AbstractC89172b<C68548c, C68548c> {

        /* renamed from: a */
        final /* synthetic */ C68634c f153588a;

        /* renamed from: b */
        final /* synthetic */ boolean f153589b;

        static {
            Covode.recordClassIndex(80892);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C68636b(C68634c cVar, boolean z) {
            super(1);
            this.f153588a = cVar;
            this.f153589b = z;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C68548c invoke(C68548c cVar) {
            C89219l.m154721d(cVar, "");
            return C68548c.m120976a((C68548c) this.f153588a.mo70132l(), null, this.f153589b, null, false, null, 29);
        }
    }
}
