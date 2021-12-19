package com.p2082ss.android.ugc.aweme.tools.beauty.p4096h;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.dependence.beauty.data.BeautyComposerInfo;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.aweme.property.AVPreferences;
import com.p2082ss.android.ugc.aweme.tools.beauty.service.AbstractC78056f;
import java.util.List;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.tools.beauty.h.d */
public final class C77981d implements AbstractC78056f.AbstractC78057a {

    /* renamed from: a */
    private final AbstractC89244h f174921a = C89250i.m154773a((AbstractC89171a) C77982a.f174923a);

    /* renamed from: b */
    private final AbstractC78056f.AbstractC78057a f174922b;

    static {
        Covode.recordClassIndex(91070);
    }

    @Override // com.p2082ss.android.ugc.aweme.tools.beauty.service.AbstractC78056f.AbstractC78057a
    /* renamed from: a */
    public final void mo22723a() {
        this.f174922b.mo22723a();
    }

    @Override // com.p2082ss.android.ugc.aweme.tools.beauty.service.AbstractC78056f.AbstractC78057a
    /* renamed from: a */
    public final void mo121548a(String str, String str2, float f) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        this.f174922b.mo121548a(str, str2, f);
    }

    @Override // com.p2082ss.android.ugc.aweme.tools.beauty.service.AbstractC78056f.AbstractC78057a
    /* renamed from: a */
    public final void mo121549a(List<BeautyComposerInfo> list, int i) {
        C89219l.m154721d(list, "");
        this.f174922b.mo121549a(list, i);
    }

    @Override // com.p2082ss.android.ugc.aweme.tools.beauty.service.AbstractC78056f.AbstractC78057a
    /* renamed from: a */
    public final void mo121550a(List<BeautyComposerInfo> list, List<BeautyComposerInfo> list2, int i) {
        C89219l.m154721d(list, "");
        C89219l.m154721d(list2, "");
        this.f174922b.mo121550a(list, list2, i);
    }

    @Override // com.p2082ss.android.ugc.aweme.tools.beauty.service.AbstractC78056f.AbstractC78057a
    /* renamed from: a */
    public final void mo121551a(boolean z) {
        this.f174922b.mo121551a(z);
    }

    @Override // com.p2082ss.android.ugc.aweme.tools.beauty.service.AbstractC78056f.AbstractC78057a
    /* renamed from: a */
    public final int[] mo121552a(String str, String str2) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        return this.f174922b.mo121552a(str, str2);
    }

    @Override // com.p2082ss.android.ugc.aweme.tools.beauty.service.AbstractC78056f.AbstractC78057a
    /* renamed from: b */
    public final void mo22724b() {
        this.f174922b.mo22724b();
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.beauty.h.d$a */
    static final class C77982a extends AbstractC89220m implements AbstractC89171a<AVPreferences> {

        /* renamed from: a */
        public static final C77982a f174923a = new C77982a();

        static {
            Covode.recordClassIndex(91071);
        }

        C77982a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ AVPreferences invoke() {
            return C63244g.m114602a().mo73277e();
        }
    }

    public C77981d(AbstractC78056f.AbstractC78057a aVar) {
        C89219l.m154721d(aVar, "");
        this.f174922b = aVar;
    }
}
