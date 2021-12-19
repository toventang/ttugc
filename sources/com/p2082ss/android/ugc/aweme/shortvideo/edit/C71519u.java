package com.p2082ss.android.ugc.aweme.shortvideo.edit;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.asve.editor.AbstractC31071f;
import com.p2082ss.android.ugc.asve.editor.C31060a;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.multiedit.data.C71493a;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoRecordData;
import com.p2082ss.android.vesdk.C85581w;
import com.p2082ss.android.vesdk.VEListener;
import com.p2082ss.android.vesdk.VERecordData;
import com.p2082ss.android.vesdk.runtime.C85553b;
import p077b.C1731i;
import p077b.C1743j;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.u */
public final class C71519u implements AbstractC71531x {

    /* renamed from: a */
    public C1743j<Boolean> f160290a = new C1743j<>();

    /* renamed from: b */
    public boolean f160291b;

    /* renamed from: c */
    private AbstractC31071f f160292c;

    /* renamed from: d */
    private final AbstractC31071f f160293d;

    /* renamed from: e */
    private final MultiEditVideoRecordData f160294e;

    static {
        Covode.recordClassIndex(84060);
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.edit.AbstractC71531x
    /* renamed from: c */
    public final String[] mo111962c() {
        return this.f160293d.mo56362g();
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.edit.AbstractC71531x
    /* renamed from: d */
    public final String[] mo111963d() {
        return this.f160293d.mo56365h();
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.edit.AbstractC71531x
    /* renamed from: e */
    public final String[] mo111964e() {
        return this.f160293d.mo56367i();
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.edit.AbstractC71531x
    /* renamed from: b */
    public final boolean mo111961b() {
        if (mo111962c() != null) {
            return true;
        }
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.edit.AbstractC71531x
    /* renamed from: a */
    public final C1731i<Boolean> mo111960a() {
        C31060a aVar;
        if (mo111962c() != null) {
            this.f160291b = true;
            this.f160290a.mo5555a((Boolean) true);
        } else {
            C85553b a = this.f160293d.mo56300a();
            VERecordData a2 = C71493a.m126273a(this.f160294e);
            C71520a aVar2 = new C71520a(this);
            C89219l.m154721d(a, "");
            C89219l.m154721d(a2, "");
            C89219l.m154721d(aVar2, "");
            C85581w a3 = C85581w.m147493a(a, a2, -1, -1, aVar2);
            if (a3 != null) {
                aVar = new C31060a(a3);
            } else {
                aVar = null;
            }
            this.f160292c = aVar;
        }
        C1731i<TResult> iVar = this.f160290a.f5610a;
        C89219l.m154716b(iVar, "");
        return iVar;
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.u$a */
    public static final class C71520a implements VEListener.AbstractC85249r {

        /* renamed from: a */
        final /* synthetic */ C71519u f160295a;

        static {
            Covode.recordClassIndex(84061);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C71520a(C71519u uVar) {
            this.f160295a = uVar;
        }

        @Override // com.p2082ss.android.vesdk.VEListener.AbstractC85249r
        /* renamed from: a */
        public final void mo111965a(int i) {
            boolean z;
            C71519u uVar = this.f160295a;
            if (i == 0) {
                z = true;
            } else {
                z = false;
            }
            uVar.f160291b = z;
            this.f160295a.f160290a.mo5555a(Boolean.valueOf(this.f160295a.f160291b));
        }
    }

    public C71519u(AbstractC31071f fVar, MultiEditVideoRecordData multiEditVideoRecordData) {
        C89219l.m154721d(fVar, "");
        C89219l.m154721d(multiEditVideoRecordData, "");
        this.f160293d = fVar;
        this.f160294e = multiEditVideoRecordData;
    }
}
