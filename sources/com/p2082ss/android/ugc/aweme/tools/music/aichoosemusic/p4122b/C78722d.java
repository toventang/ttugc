package com.p2082ss.android.ugc.aweme.tools.music.aichoosemusic.p4122b;

import android.graphics.Bitmap;
import com.bytedance.common.utility.BitmapUtils;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.p2432c.C35337d;
import com.p2082ss.android.ugc.aweme.shortvideo.model.ExtractFramesModel;
import com.p2082ss.android.ugc.aweme.shortvideo.model.FrameItem;
import com.p2082ss.android.ugc.aweme.tools.music.aichoosemusic.C78727d;
import com.p2082ss.android.ugc.tools.utils.C84915u;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import p4600h.p4603c.AbstractC89124d;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.tools.music.aichoosemusic.b.d */
public final class C78722d extends AbstractC78708a {

    /* renamed from: e */
    private final C35337d f176910e;

    static {
        Covode.recordClassIndex(91865);
    }

    @Override // com.p2082ss.android.ugc.aweme.tools.music.aichoosemusic.p4122b.AbstractC78708a
    /* renamed from: e */
    public final void mo122572e() {
        if (this.f176910e.f83369a == null) {
            mo122569a("");
        } else {
            super.mo122572e();
        }
    }

    public C78722d(C35337d dVar) {
        C89219l.m154721d(dVar, "");
        this.f176910e = dVar;
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.tools.music.aichoosemusic.p4122b.AbstractC78708a
    /* renamed from: a */
    public final Object mo122566a(AbstractC89124d<? super String> dVar) {
        Bitmap decodeBitmap;
        ExtractFramesModel extractFramesModel = this.f176910e.f83369a;
        if (extractFramesModel == null) {
            return null;
        }
        List<FrameItem> allFrames = extractFramesModel.getAllFrames();
        int i = 0;
        if (allFrames == null || allFrames.isEmpty()) {
            return null;
        }
        List<FrameItem> a = C78727d.m137386a(allFrames, m137360b());
        String a2 = mo122568a();
        ArrayList arrayList = new ArrayList();
        for (FrameItem frameItem : a) {
            File file = new File(frameItem.getPath());
            if (file.exists() && (decodeBitmap = BitmapUtils.decodeBitmap(file)) != null) {
                String absolutePath = mo122565a(C78727d.m137385a(decodeBitmap), i).getAbsolutePath();
                C89219l.m154716b(absolutePath, "");
                arrayList.add(absolutePath);
            }
            i++;
        }
        return C84915u.m145940a(a2, arrayList);
    }
}
