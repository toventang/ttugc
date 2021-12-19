package com.p2082ss.android.ugc.aweme.shortvideo.cut.scene;

import android.content.Intent;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.C70066ac;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.stickingpoint.p3800a.C70410e;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.stickingpoint.p3802c.AbstractC70442h;
import com.p2082ss.android.ugc.tools.utils.C84904k;
import java.util.ArrayList;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.bl */
public final class C70280bl implements AbstractC70300bv {

    /* renamed from: a */
    public AbstractC70442h f157131a;

    /* renamed from: b */
    private C70410e f157132b;

    static {
        Covode.recordClassIndex(82723);
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.cut.scene.AbstractC70300bv
    /* renamed from: c */
    public final void mo110933c() {
        C70410e eVar = this.f157132b;
        if (eVar != null) {
            eVar.notifyDataSetChanged();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.cut.scene.AbstractC70300bv
    /* renamed from: a */
    public final ArrayList<String> mo110925a() {
        C70410e eVar = this.f157132b;
        if (eVar != null) {
            return eVar.mo111340a();
        }
        return null;
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.cut.scene.AbstractC70300bv
    /* renamed from: b */
    public final long mo110931b() {
        C70410e eVar = this.f157132b;
        if (eVar != null) {
            return eVar.mo111344b();
        }
        return 0;
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.cut.scene.AbstractC70300bv
    /* renamed from: a */
    public final void mo110928a(AbstractC70442h hVar) {
        this.f157131a = hVar;
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.bl$a */
    public static final class C70281a implements AbstractC70442h {

        /* renamed from: a */
        final /* synthetic */ C70280bl f157133a;

        static {
            Covode.recordClassIndex(82724);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C70281a(C70280bl blVar) {
            this.f157133a = blVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.cut.stickingpoint.p3802c.AbstractC70442h
        /* renamed from: a */
        public final void mo110934a(View view) {
            AbstractC70442h hVar = this.f157133a.f157131a;
            if (hVar != null) {
                hVar.mo110934a(view);
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.cut.stickingpoint.p3802c.AbstractC70442h
        /* renamed from: b */
        public final void mo110936b(View view) {
            AbstractC70442h hVar = this.f157133a.f157131a;
            if (hVar != null) {
                hVar.mo110936b(view);
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.cut.stickingpoint.p3802c.AbstractC70442h
        /* renamed from: c */
        public final void mo110937c(View view) {
            AbstractC70442h hVar = this.f157133a.f157131a;
            if (hVar != null) {
                hVar.mo110937c(view);
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.cut.stickingpoint.p3802c.AbstractC70442h
        /* renamed from: a */
        public final void mo110935a(List<? extends MediaModel> list) {
            AbstractC70442h hVar = this.f157133a.f157131a;
            if (hVar != null) {
                hVar.mo110935a(list);
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.cut.scene.AbstractC70300bv
    /* renamed from: a */
    public final void mo110929a(List<? extends VideoSegment> list) {
        C70410e eVar = this.f157132b;
        if (eVar != null) {
            eVar.mo111347b((List<VideoSegment>) list);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.cut.scene.AbstractC70300bv
    /* renamed from: a */
    public final void mo110927a(C70410e eVar) {
        this.f157132b = eVar;
        if (eVar != null) {
            eVar.f157351i = new C70281a(this);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.cut.scene.AbstractC70300bv
    /* renamed from: a */
    public final void mo110930a(boolean z) {
        C70410e eVar = this.f157132b;
        if (eVar != null) {
            eVar.mo110982a(z);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.cut.scene.AbstractC70300bv
    /* renamed from: b */
    public final void mo110932b(boolean z) {
        ArrayList<C70066ac> arrayList;
        C70410e eVar = this.f157132b;
        if (eVar == null || C84904k.m145909a(eVar.mo110984c())) {
            arrayList = null;
        } else {
            arrayList = new ArrayList();
            C70410e eVar2 = this.f157132b;
            if (eVar2 == null) {
                C89219l.m154715b();
            }
            for (C70066ac acVar : eVar2.mo110984c()) {
                if (!acVar.f156680b.f156717i) {
                    arrayList.add(acVar);
                }
            }
        }
        if (!C84904k.m145909a(arrayList)) {
            if (arrayList == null) {
                C89219l.m154715b();
            }
            for (C70066ac acVar2 : arrayList) {
                VideoSegment videoSegment = acVar2.f156680b;
                C89219l.m154716b(videoSegment, "");
                videoSegment.f156723o = z;
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.cut.scene.AbstractC70300bv
    /* renamed from: a */
    public final void mo110926a(int i, int i2, Intent intent) {
        if (i == 1001) {
            if (i2 != -1 || intent == null) {
                AbstractC70442h hVar = this.f157131a;
                if (hVar != null) {
                    hVar.mo110935a((List<? extends MediaModel>) null);
                    return;
                }
                return;
            }
            ArrayList parcelableArrayListExtra = intent.getParcelableArrayListExtra("key_choose_media_data");
            AbstractC70442h hVar2 = this.f157131a;
            if (hVar2 != null) {
                hVar2.mo110935a(parcelableArrayListExtra);
            }
        }
    }
}
