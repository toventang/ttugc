package com.p2082ss.android.ugc.aweme.p2690cr.p2697d.p2698a.p2699a;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.draft.model.C43223c;
import com.p2082ss.android.ugc.aweme.draft.model.C43225d;
import com.p2082ss.android.ugc.aweme.draft.model.C43235i;
import com.p2082ss.android.ugc.aweme.effect.EffectListModel;
import com.p2082ss.android.ugc.aweme.effect.EffectPointModel;
import com.p2082ss.android.ugc.aweme.mvtheme.C61288d;
import com.p2082ss.android.ugc.aweme.p2690cr.p2697d.p2700b.C40347a;
import com.p2082ss.android.ugc.aweme.p2690cr.p2697d.p2700b.p2701a.C40348a;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.model.EditPreviewInfo;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment;
import java.util.ArrayList;
import java.util.List;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.cr.d.a.a.a */
public final class C40341a extends AbstractC40342b {
    static {
        Covode.recordClassIndex(48142);
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.p2690cr.p2697d.p2698a.p2699a.AbstractC40342b
    /* renamed from: a */
    public final long mo69487a() {
        long a = m81514a(this.f94516a.f100900W.f100759S) + 0;
        EditPreviewInfo a2 = C43225d.m86323a(this.f94516a, false);
        if (a2 != null) {
            String[] reverseAudioArray = a2.getReverseAudioArray();
            if (reverseAudioArray != null) {
                for (String str : reverseAudioArray) {
                    a += m81514a(str);
                }
            }
            String[] reverseVideoArray = a2.getReverseVideoArray();
            if (reverseVideoArray != null) {
                for (String str2 : reverseVideoArray) {
                    a += m81514a(str2);
                }
            }
            String[] tempVideoArray = a2.getTempVideoArray();
            if (tempVideoArray != null) {
                for (String str3 : tempVideoArray) {
                    a += m81514a(str3);
                }
            }
            List<EditVideoSegment> videoList = a2.getVideoList();
            if (videoList != null) {
                for (T t : videoList) {
                    a = a + m81514a(t.getAudioPath()) + m81514a(t.getVideoPath());
                }
            }
        }
        return a;
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.p2690cr.p2697d.p2698a.p2699a.AbstractC40342b
    /* renamed from: c */
    public final long mo69489c() {
        String str;
        ArrayList<String> arrayList;
        List<String> f;
        long a = m81514a(this.f94516a.f100900W.f100760T) + 0;
        C61288d dVar = this.f94516a.f100900W.f100753M;
        if (!(dVar == null || (arrayList = dVar.selectMediaList) == null || (f = C89070n.m154580f((Iterable) arrayList)) == null)) {
            for (String str2 : f) {
                a += m81514a(str2);
            }
        }
        C61288d dVar2 = this.f94516a.f100900W.f100753M;
        if (dVar2 != null) {
            str = dVar2.videoCoverImgPath;
        } else {
            str = null;
        }
        return a + m81514a(str);
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.p2690cr.p2697d.p2698a.p2699a.AbstractC40342b
    /* renamed from: b */
    public final long mo69488b() {
        long j;
        ArrayList<EffectPointModel> effectPointModels;
        List f;
        String str = null;
        C40348a aVar = new C40348a(null, null, 3);
        if (this.f94516a.f100913m != 0) {
            String filterFolder = C63244g.m114602a().mo73290r().mo86005c().mo86019a(this.f94516a.f100913m).getFilterFolder();
            C40347a aVar2 = new C40347a();
            aVar2.mo69491a(aVar);
            aVar2.mo69493a(filterFolder);
            j = aVar.f94521a + 0;
        } else {
            j = 0;
        }
        C43235i q = this.f94516a.mo73722q();
        if (q != null) {
            str = q.f100951d;
        }
        if (str != null) {
            aVar.f94521a = 0;
            String str2 = this.f94516a.mo73722q().f100951d;
            C40347a aVar3 = new C40347a();
            aVar3.mo69491a(aVar);
            aVar3.mo69493a(str2);
            j += aVar.f94521a;
        }
        long a = j + m81514a(this.f94516a.f100908h);
        EffectListModel effectListModel = this.f94516a.f100882E;
        if (!(effectListModel == null || (effectPointModels = effectListModel.getEffectPointModels()) == null || (f = C89070n.m154580f((Iterable) effectPointModels)) == null)) {
            ArrayList<EffectPointModel> arrayList = new ArrayList();
            for (Object obj : f) {
                if (((EffectPointModel) obj).getResDir() != null) {
                    arrayList.add(obj);
                }
            }
            for (EffectPointModel effectPointModel : arrayList) {
                aVar.f94521a = 0;
                C40347a aVar4 = new C40347a();
                aVar4.mo69491a(aVar);
                aVar4.mo69493a(effectPointModel.getResDir());
                a += aVar.f94521a;
            }
        }
        C61288d dVar = this.f94516a.f100900W.f100753M;
        if (dVar == null || dVar.mvResUnzipPath == null) {
            return a;
        }
        String str3 = this.f94516a.f100900W.f100753M.mvResUnzipPath;
        aVar.f94521a = 0;
        C40347a aVar5 = new C40347a();
        aVar5.mo69491a(aVar);
        aVar5.mo69493a(str3);
        return a + aVar.f94521a;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C40341a(C43223c cVar) {
        super(cVar);
        C89219l.m154721d(cVar, "");
    }
}
