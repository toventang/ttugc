package com.p2082ss.android.ugc.aweme.shortvideo.edit;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.asve.editor.AbstractC31071f;
import com.p2082ss.android.ugc.asve.editor.C31060a;
import com.p2082ss.android.ugc.asve.p2217f.C31095c;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.model.EditPreviewInfo;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.multiedit.data.C71493a;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoRecordData;
import com.p2082ss.android.vesdk.C85581w;
import com.p2082ss.android.vesdk.VEListener;
import com.p2082ss.android.vesdk.VERecordData;
import com.p2082ss.android.vesdk.VESize;
import com.p2082ss.android.vesdk.VEUtils;
import com.p2082ss.android.vesdk.runtime.C85553b;
import p077b.C1731i;
import p077b.C1743j;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.f */
public final class C71023f implements AbstractC71531x {

    /* renamed from: a */
    public boolean f158961a;

    /* renamed from: b */
    private AbstractC31071f f158962b;

    /* renamed from: c */
    private C85553b f158963c;

    /* renamed from: d */
    private final AbstractC31071f f158964d;

    /* renamed from: e */
    private final MultiEditVideoRecordData f158965e;

    /* renamed from: f */
    private VideoPublishEditModel f158966f;

    static {
        Covode.recordClassIndex(83519);
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.edit.AbstractC71531x
    /* renamed from: c */
    public final String[] mo111962c() {
        return this.f158964d.mo56362g();
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.edit.AbstractC71531x
    /* renamed from: d */
    public final String[] mo111963d() {
        return this.f158964d.mo56365h();
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.edit.AbstractC71531x
    /* renamed from: e */
    public final String[] mo111964e() {
        return this.f158964d.mo56367i();
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
        C1743j jVar = new C1743j();
        if (mo111962c() != null) {
            this.f158961a = true;
            jVar.mo5555a((Object) true);
        } else {
            VERecordData a = C71493a.m126273a(this.f158965e);
            EditPreviewInfo previewInfo = this.f158966f.getPreviewInfo();
            int[] totalVideoWidth = previewInfo.getTotalVideoWidth();
            int[] totalVideoHeight = previewInfo.getTotalVideoHeight();
            C89219l.m154716b(previewInfo, "");
            VESize calcTargetRes = VEUtils.calcTargetRes(totalVideoWidth, totalVideoHeight, C31095c.m64296a(previewInfo), previewInfo.getPreviewWidth());
            this.f158963c = this.f158964d.mo56300a();
            C85553b a2 = this.f158964d.mo56300a();
            int i = calcTargetRes.width;
            int i2 = calcTargetRes.height;
            C71024a aVar2 = new C71024a(this, jVar);
            C89219l.m154721d(a2, "");
            C89219l.m154721d(a, "");
            C89219l.m154721d(aVar2, "");
            C85581w a3 = C85581w.m147493a(a2, a, i, i2, aVar2);
            if (a3 != null) {
                aVar = new C31060a(a3);
            } else {
                aVar = null;
            }
            this.f158962b = aVar;
        }
        C1731i<TResult> iVar = jVar.f5610a;
        C89219l.m154716b(iVar, "");
        return iVar;
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.f$a */
    public static final class C71024a implements VEListener.AbstractC85249r {

        /* renamed from: a */
        final /* synthetic */ C71023f f158967a;

        /* renamed from: b */
        final /* synthetic */ C1743j f158968b;

        static {
            Covode.recordClassIndex(83520);
        }

        @Override // com.p2082ss.android.vesdk.VEListener.AbstractC85249r
        /* renamed from: a */
        public final void mo111965a(int i) {
            boolean z;
            C71023f fVar = this.f158967a;
            if (i == 0) {
                z = true;
            } else {
                z = false;
            }
            fVar.f158961a = z;
            this.f158968b.mo5555a(Boolean.valueOf(this.f158967a.f158961a));
        }

        C71024a(C71023f fVar, C1743j jVar) {
            this.f158967a = fVar;
            this.f158968b = jVar;
        }
    }

    public C71023f(AbstractC31071f fVar, MultiEditVideoRecordData multiEditVideoRecordData, VideoPublishEditModel videoPublishEditModel) {
        C89219l.m154721d(fVar, "");
        C89219l.m154721d(multiEditVideoRecordData, "");
        C89219l.m154721d(videoPublishEditModel, "");
        this.f158964d = fVar;
        this.f158965e = multiEditVideoRecordData;
        this.f158966f = videoPublishEditModel;
    }
}
