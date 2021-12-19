package com.p2082ss.android.ugc.aweme.p2432c;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.shortvideo.model.ExtractFramesModel;
import com.p2082ss.android.ugc.aweme.shortvideo.model.FrameItem;
import java.util.List;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.c.d */
public final class C35337d extends AbstractC35338e {

    /* renamed from: a */
    public final ExtractFramesModel f83369a;

    static {
        Covode.recordClassIndex(42505);
    }

    public C35337d(ExtractFramesModel extractFramesModel) {
        super((byte) 0);
        this.f83369a = extractFramesModel;
    }

    @Override // com.p2082ss.android.ugc.aweme.p2432c.AbstractC35338e
    /* renamed from: a */
    public final boolean mo62216a(AbstractC35338e eVar) {
        String str;
        List<FrameItem> allFrames;
        FrameItem frameItem;
        List<FrameItem> allFrames2;
        FrameItem frameItem2;
        C89219l.m154721d(eVar, "");
        if (C89219l.m154714a(eVar, this)) {
            return true;
        }
        if (!(eVar instanceof C35337d)) {
            return false;
        }
        C35337d dVar = (C35337d) eVar;
        if (C89219l.m154714a(dVar.f83369a, this.f83369a)) {
            return true;
        }
        ExtractFramesModel extractFramesModel = this.f83369a;
        String str2 = null;
        if (extractFramesModel == null || (allFrames2 = extractFramesModel.getAllFrames()) == null || (frameItem2 = (FrameItem) C89070n.m154588i((List) allFrames2)) == null) {
            str = null;
        } else {
            str = frameItem2.getPath();
        }
        ExtractFramesModel extractFramesModel2 = dVar.f83369a;
        if (!(extractFramesModel2 == null || (allFrames = extractFramesModel2.getAllFrames()) == null || (frameItem = (FrameItem) C89070n.m154588i((List) allFrames)) == null)) {
            str2 = frameItem.getPath();
        }
        return C89219l.m154714a((Object) str, (Object) str2);
    }
}
