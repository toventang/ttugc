package dmt.p4542av.video.p4545b;

import android.content.Context;
import android.text.TextUtils;
import android.view.SurfaceView;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.covode.number.Covode;
import com.bytedance.creativex.editor.preview.AbstractC14088a;
import com.p2082ss.android.ugc.asve.editor.AbstractC31071f;
import com.p2082ss.android.ugc.asve.editor.C31082m;
import com.p2082ss.android.ugc.aweme.mvtheme.C61288d;
import com.p2082ss.android.ugc.aweme.services.video.VEVolumeChangeOp;
import com.p2082ss.android.ugc.tools.utils.C84904k;
import dmt.p4542av.video.C88295s;
import dmt.p4542av.video.VEPreviewMusicParams;
import dmt.p4542av.video.VEPreviewParams;
import java.util.ArrayList;
import java.util.Objects;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: dmt.av.video.b.o */
public final class C88233o extends AbstractC88181j {
    static {
        Covode.recordClassIndex(104268);
    }

    @Override // dmt.p4542av.video.p4545b.AbstractC88181j
    /* renamed from: a */
    public final boolean mo142733a(VEPreviewMusicParams vEPreviewMusicParams) {
        C89219l.m154721d(vEPreviewMusicParams, "");
        return false;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C88233o(dmt.p4542av.video.p4545b.C88238s r3) {
        /*
            r2 = this;
            java.lang.String r1 = ""
            p4600h.p4611f.p4613b.C89219l.m154721d(r3, r1)
            java.util.concurrent.ScheduledExecutorService r0 = com.p2082ss.android.ugc.aweme.p2719cv.C40780g.m82247d()
            p4600h.p4611f.p4613b.C89219l.m154716b(r0, r1)
            r2.<init>(r3, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: dmt.p4542av.video.p4545b.C88233o.<init>(dmt.av.video.b.s):void");
    }

    @Override // dmt.p4542av.video.p4545b.AbstractC88181j
    /* renamed from: a */
    public final boolean mo142732a(VEVolumeChangeOp vEVolumeChangeOp) {
        C89219l.m154721d(vEVolumeChangeOp, "");
        return mo142743c().mo56313a(mo142743c().mo56345d(), 1, vEVolumeChangeOp.mVolume);
    }

    @Override // dmt.p4542av.video.p4545b.AbstractC88181j
    /* renamed from: a */
    public final boolean mo142735a(C88295s sVar) {
        C89219l.m154721d(sVar, "");
        if (mo142743c().mo56257a(mo142743c().mo56345d(), sVar.f200362a, sVar.f200362a + sVar.f200363b, false) >= 0) {
            return true;
        }
        return false;
    }

    @Override // dmt.p4542av.video.p4545b.AbstractC88181j
    /* renamed from: a */
    public final int mo142714a(Context context, AbstractC14088a aVar, SurfaceView surfaceView, AbstractC1204m mVar) {
        VEPreviewParams vEPreviewParams;
        C61288d dVar;
        C89219l.m154721d(aVar, "");
        super.mo142714a(context, aVar, surfaceView, mVar);
        if (!(aVar instanceof VEPreviewParams) || (dVar = (vEPreviewParams = (VEPreviewParams) aVar).mvCreateVideoData) == null || !C84904k.m145910b(dVar.selectMediaList) || TextUtils.isEmpty(dVar.mvResUnzipPath)) {
            return 0;
        }
        int size = dVar.selectMediaList.size();
        String[] strArr = new String[size];
        for (int i = 0; i < size; i++) {
            String str = dVar.selectMediaList.get(i);
            C89219l.m154716b(str, "");
            strArr[i] = str;
        }
        int size2 = dVar.selectMediaList.size();
        String[] strArr2 = new String[size2];
        for (int i2 = 0; i2 < size2; i2++) {
            strArr2[i2] = "img";
        }
        if (mo142743c() == null) {
            return 0;
        }
        if (vEPreviewParams.mPageType == 3 || vEPreviewParams.mPageType == 2 || vEPreviewParams.mIsFromDraft) {
            AbstractC31071f c = mo142743c();
            String str2 = dVar.mvResUnzipPath;
            C89219l.m154716b(str2, "");
            ArrayList arrayList = new ArrayList(size);
            for (int i3 = 0; i3 < size; i3++) {
                arrayList.add(strArr[i3].toString());
            }
            Object[] array = arrayList.toArray(new String[0]);
            Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
            return c.mo56274a(new C31082m(str2, (String[]) array, strArr2, vEPreviewParams.mMusicPath, vEPreviewParams.mMusicInPoint, vEPreviewParams.mMusicOutPoint, 192));
        }
        AbstractC31071f c2 = mo142743c();
        String str3 = dVar.mvResUnzipPath;
        C89219l.m154716b(str3, "");
        ArrayList arrayList2 = new ArrayList(size);
        for (int i4 = 0; i4 < size; i4++) {
            arrayList2.add(strArr[i4].toString());
        }
        Object[] array2 = arrayList2.toArray(new String[0]);
        Objects.requireNonNull(array2, "null cannot be cast to non-null type kotlin.Array<T>");
        return c2.mo56274a(new C31082m(str3, (String[]) array2, strArr2, null, 0, 0, 248));
    }
}
