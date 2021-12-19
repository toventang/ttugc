package com.p2082ss.android.ugc.aweme.p3070im.sdk.relations.viewmodel;

import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.C1213t;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.data.p3187a.p3188a.AbstractC55249a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.relations.data.core.AbstractC55815d;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.relations.data.core.AbstractC55858h;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.relations.data.core.C55845g;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.relations.data.core.p3224a.AbstractC55764d;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.IMContact;
import java.util.List;
import p4600h.C89378p;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.viewmodel.RelationViewModel */
public final class RelationViewModel extends AbstractC1174ac implements AbstractC55764d<IMContact>, AbstractC55815d {

    /* renamed from: d */
    public static final C55938a f127569d = new C55938a((byte) 0);

    /* renamed from: a */
    public final C1213t<AbstractC55249a<List<IMContact>>> f127570a = new C1213t<>();

    /* renamed from: b */
    public final C1213t<AbstractC55249a<C89378p<List<IMContact>, String>>> f127571b = new C1213t<>();

    /* renamed from: c */
    public final AbstractC55858h f127572c;

    static {
        Covode.recordClassIndex(65730);
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.viewmodel.RelationViewModel$a */
    public static final class C55938a {
        static {
            Covode.recordClassIndex(65731);
        }

        private C55938a() {
        }

        public /* synthetic */ C55938a(byte b) {
            this();
        }
    }

    /* renamed from: a */
    public final List<Integer> mo92813a() {
        AbstractC55858h hVar = this.f127572c;
        if (hVar instanceof C55845g) {
            return ((C55845g) hVar).mo92667i();
        }
        return null;
    }

    /* renamed from: b */
    public final List<String> mo92814b() {
        AbstractC55858h hVar = this.f127572c;
        if (hVar instanceof C55845g) {
            return ((C55845g) hVar).mo92707j();
        }
        return null;
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.relations.data.core.p3224a.AbstractC55764d
    /* renamed from: c */
    public final void mo92517c(Throwable th) {
        C89219l.m154721d(th, "");
        this.f127570a.setValue(new AbstractC55249a.AbstractC55251b.C55252a(th));
    }

    public RelationViewModel(AbstractC55858h hVar) {
        C89219l.m154721d(hVar, "");
        this.f127572c = hVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.relations.data.core.p3224a.AbstractC55764d
    /* renamed from: a */
    public final void mo92510a(Throwable th) {
        C89219l.m154721d(th, "");
        this.f127570a.setValue(new AbstractC55249a.AbstractC55251b.C55252a(th));
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.relations.data.core.AbstractC55815d
    /* renamed from: b */
    public final void mo92514b(Throwable th) {
        C89219l.m154721d(th, "");
        this.f127571b.setValue(new AbstractC55249a.AbstractC55251b.C55252a(th));
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.relations.data.core.AbstractC55815d
    /* renamed from: a */
    public final void mo92511a(List<IMContact> list, String str) {
        C89219l.m154721d(list, "");
        C89219l.m154721d(str, "");
        this.f127571b.setValue(new AbstractC55249a.C55254d(new C89378p(list, str)));
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.relations.data.core.p3224a.AbstractC55764d
    /* renamed from: b */
    public final void mo92515b(List<IMContact> list, boolean z) {
        C89219l.m154721d(list, "");
        this.f127570a.setValue(new AbstractC55249a.C55254d(this.f127572c.mo92619e()));
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.relations.data.core.p3224a.AbstractC55764d
    /* renamed from: a */
    public final void mo92512a(List<IMContact> list, boolean z) {
        C89219l.m154721d(list, "");
        this.f127570a.setValue(new AbstractC55249a.C55254d(list));
    }
}
