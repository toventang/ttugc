package dmt.p4542av.video.p4545b;

import android.content.Context;
import android.text.TextUtils;
import android.view.SurfaceView;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.covode.number.Covode;
import com.bytedance.creativex.editor.preview.AbstractC14088a;
import com.p2082ss.android.ugc.asve.editor.AbstractC31071f;
import com.p2082ss.android.ugc.asve.editor.C31086o;
import com.p2082ss.android.ugc.aweme.mvtheme.C61288d;
import com.p2082ss.android.ugc.aweme.mvtheme.MvNetFileBean;
import com.p2082ss.android.ugc.aweme.services.video.VEVolumeChangeOp;
import com.p2082ss.android.ugc.aweme.shortvideo.util.C73991bj;
import com.p2082ss.android.ugc.tools.utils.C84896h;
import com.p2082ss.android.ugc.tools.utils.C84904k;
import com.p2082ss.android.vesdk.C85581w;
import com.p2082ss.android.vesdk.VEListener;
import com.p2082ss.android.vesdk.VEMVAlgorithmConfig;
import com.p2082ss.android.vesdk.VEMVParams;
import com.p2082ss.android.vesdk.VESize;
import dmt.p4542av.video.VEPreviewMusicParams;
import dmt.p4542av.video.VEPreviewParams;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: dmt.av.video.b.p */
public final class C88234p extends AbstractC88181j {

    /* renamed from: H */
    private int f200256H = -1;

    /* renamed from: I */
    private List<String> f200257I;

    static {
        Covode.recordClassIndex(104269);
    }

    /* renamed from: dmt.av.video.b.p$a */
    static final class C88235a implements VEListener.AbstractC85222aa {

        /* renamed from: a */
        final /* synthetic */ C88234p f200258a;

        /* renamed from: b */
        final /* synthetic */ C61288d f200259b;

        static {
            Covode.recordClassIndex(104270);
        }

        C88235a(C88234p pVar, C61288d dVar) {
            this.f200258a = pVar;
            this.f200259b = dVar;
        }

        @Override // com.p2082ss.android.vesdk.VEListener.AbstractC85222aa
        /* renamed from: a */
        public final void mo130303a() {
            ArrayList<MvNetFileBean> arrayList = this.f200259b.newMaskFileData;
            C89219l.m154716b(arrayList, "");
            if (!arrayList.isEmpty()) {
                Iterator<MvNetFileBean> it = this.f200259b.newMaskFileData.iterator();
                while (it.hasNext()) {
                    MvNetFileBean next = it.next();
                    String component1 = next.component1();
                    String component2 = next.component2();
                    String component3 = next.component3();
                    String component4 = next.component4();
                    if (!TextUtils.isEmpty(component3)) {
                        String h = C84896h.m145875h(component3);
                        if (!TextUtils.isEmpty(h)) {
                            if (h == null) {
                                C89219l.m154715b();
                            }
                            if (C89361p.m154876c(h, ".mp4", false) || C89361p.m154876c(h, "/mp4", false)) {
                                this.f200258a.mo142743c().mo56291a(component1, component2, component3, VEMVAlgorithmConfig.MV_REESULT_IN_TYPE.MV_REESULT_IN_TYPE_VIDEO);
                            }
                        }
                        this.f200258a.mo142743c().mo56291a(component1, component2, component3, VEMVAlgorithmConfig.MV_REESULT_IN_TYPE.MV_REESULT_IN_TYPE_IMAGE);
                    }
                    if (!TextUtils.isEmpty(component4)) {
                        this.f200258a.mo142743c().mo56291a(component1, component2, component4, VEMVAlgorithmConfig.MV_REESULT_IN_TYPE.MV_REESULT_IN_TYPE_JSON);
                    }
                }
            }
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C88234p(dmt.p4542av.video.p4545b.C88238s r3) {
        /*
            r2 = this;
            java.lang.String r1 = ""
            p4600h.p4611f.p4613b.C89219l.m154721d(r3, r1)
            java.util.concurrent.ScheduledExecutorService r0 = com.p2082ss.android.ugc.aweme.p2719cv.C40780g.m82247d()
            p4600h.p4611f.p4613b.C89219l.m154716b(r0, r1)
            r2.<init>(r3, r0)
            r0 = -1
            r2.f200256H = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: dmt.p4542av.video.p4545b.C88234p.<init>(dmt.av.video.b.s):void");
    }

    @Override // dmt.p4542av.video.p4545b.AbstractC88181j
    /* renamed from: a */
    public final void mo142730a(boolean z) {
        AbstractC14088a aVar = this.f200147h;
        if (this.f200161v == null && aVar != null && aVar.getCanvasWidth() > 0 && aVar.getCanvasHeight() > 0 && !aVar.isCanvasVEEditorType()) {
            mo142743c().mo56280a(C85581w.EnumC85606e.SCALE_MODE_CENTER_INSIDE_WITH_2DENGINE);
            mo142743c().mo56343c(aVar.getCanvasWidth(), aVar.getCanvasHeight());
        }
        super.mo142730a(z);
    }

    @Override // dmt.p4542av.video.p4545b.AbstractC88181j
    /* renamed from: a */
    public final boolean mo142732a(VEVolumeChangeOp vEVolumeChangeOp) {
        C89219l.m154721d(vEVolumeChangeOp, "");
        if (vEVolumeChangeOp.mType == 0) {
            mo142743c().mo56320b(vEVolumeChangeOp.mVolume);
            return false;
        } else if (vEVolumeChangeOp.mType != 1) {
            return false;
        } else {
            if (this.f200148i != -1) {
                mo142743c().mo56313a(this.f200148i, 1, vEVolumeChangeOp.mVolume);
                return false;
            }
            int d = mo142743c().mo56345d();
            this.f200256H = d;
            if (d == -1) {
                return false;
            }
            mo142743c().mo56313a(this.f200256H, 1, vEVolumeChangeOp.mVolume);
            return false;
        }
    }

    @Override // dmt.p4542av.video.p4545b.AbstractC88181j
    /* renamed from: a */
    public final boolean mo142733a(VEPreviewMusicParams vEPreviewMusicParams) {
        List<String> list;
        int a;
        C89219l.m154721d(vEPreviewMusicParams, "");
        if (vEPreviewMusicParams.f200093m) {
            int d = mo142743c().mo56345d();
            this.f200256H = d;
            if (d != -1) {
                mo142743c().mo56313a(this.f200256H, 1, 0.0f);
            } else {
                mo142743c().mo56313a(0, 1, 0.0f);
            }
            return false;
        } else if (vEPreviewMusicParams.f200088h == 2 && TextUtils.isEmpty(vEPreviewMusicParams.f200086f)) {
            return false;
        } else {
            if (this.f200148i != -1) {
                mo142743c().mo56351e(this.f200148i);
                this.f200148i = -1;
            }
            String str = vEPreviewMusicParams.f200086f;
            if (TextUtils.isEmpty(str) || (list = this.f200257I) == null || C84904k.m145909a(list) || !C89070n.m154556a((Iterable) list, (Object) str)) {
                int d2 = mo142743c().mo56345d();
                this.f200256H = d2;
                if (d2 != -1) {
                    mo142743c().mo56313a(this.f200256H, 1, 0.0f);
                }
                if (vEPreviewMusicParams.f200081a == null) {
                    return false;
                }
                if (vEPreviewMusicParams.f200084d <= 0 || Math.abs(vEPreviewMusicParams.f200083c - vEPreviewMusicParams.f200084d) < 1000) {
                    AbstractC31071f c = mo142743c();
                    String str2 = vEPreviewMusicParams.f200081a;
                    C89219l.m154716b(str2, "");
                    a = c.mo56287a(str2, vEPreviewMusicParams.f200082b, vEPreviewMusicParams.f200082b + vEPreviewMusicParams.f200083c, false);
                } else {
                    AbstractC31071f c2 = mo142743c();
                    String str3 = vEPreviewMusicParams.f200081a;
                    C89219l.m154716b(str3, "");
                    a = c2.mo56287a(str3, vEPreviewMusicParams.f200082b, vEPreviewMusicParams.f200082b + vEPreviewMusicParams.f200084d, false);
                }
                this.f200148i = a;
                mo142743c().mo56313a(this.f200148i, 1, vEPreviewMusicParams.f200085e);
            } else if (vEPreviewMusicParams.f200088h == 1) {
                mo142743c().mo56313a(this.f200256H, 1, vEPreviewMusicParams.f200085e);
            } else {
                mo142743c().mo56313a(0, 1, vEPreviewMusicParams.f200085e);
            }
            return false;
        }
    }

    @Override // dmt.p4542av.video.p4545b.AbstractC88181j
    /* renamed from: a */
    public final int mo142714a(Context context, AbstractC14088a aVar, SurfaceView surfaceView, AbstractC1204m mVar) {
        int i;
        C89219l.m154721d(aVar, "");
        super.mo142714a(context, aVar, surfaceView, mVar);
        if (!(aVar instanceof VEPreviewParams)) {
            C73991bj.m130131b("params isn't VEPreviewParams : ".concat(String.valueOf(aVar)));
            return 0;
        }
        VEPreviewParams vEPreviewParams = (VEPreviewParams) aVar;
        if (vEPreviewParams.mvCreateVideoData == null) {
            C73991bj.m130131b("mvCreateVideoData is null");
            return 0;
        }
        C61288d dVar = vEPreviewParams.mvCreateVideoData;
        if (dVar == null) {
            return 0;
        }
        ArrayList<String> arrayList = dVar.selectMediaList;
        C89219l.m154716b(arrayList, "");
        if (!(!arrayList.isEmpty()) || TextUtils.isEmpty(dVar.mvResUnzipPath)) {
            return 0;
        }
        ArrayList<String> arrayList2 = dVar.selectMediaList;
        ArrayList arrayList3 = new ArrayList();
        ArrayList<String> arrayList4 = dVar.selectMediaList;
        C89219l.m154716b(arrayList4, "");
        Iterator<T> it = arrayList4.iterator();
        while (it.hasNext()) {
            it.next();
            arrayList3.add("img");
        }
        this.f200257I = dVar.musicIds;
        if (mo142743c() == null) {
            return 0;
        }
        StringBuilder append = new StringBuilder("MVRes: InitMV: path: ").append(dVar.mvResUnzipPath).append(" file count ");
        File[] listFiles = new File(dVar.mvResUnzipPath).listFiles();
        if (listFiles != null) {
            i = listFiles.length;
        } else {
            i = 0;
        }
        C73991bj.m130128a(append.append(i).toString());
        mo142743c().mo56306a(new C88235a(this, dVar));
        AbstractC31071f c = mo142743c();
        String str = dVar.mvResUnzipPath;
        C89219l.m154716b(str, "");
        C89219l.m154716b(arrayList2, "");
        ArrayList arrayList5 = new ArrayList(C89070n.m154526a((Iterable) arrayList2, 10));
        Iterator<T> it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            arrayList5.add(it2.next().toString());
        }
        Object[] array = arrayList5.toArray(new String[0]);
        Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
        Object[] array2 = arrayList3.toArray(new String[0]);
        Objects.requireNonNull(array2, "null cannot be cast to non-null type kotlin.Array<T>");
        return c.mo56274a(new C31086o(str, (String[]) array, (String[]) array2, VEMVParams.EnumC85259a.RES_CUSTOM, new VESize(aVar.getCanvasWidth(), aVar.getCanvasHeight()), (byte) 0));
    }
}
