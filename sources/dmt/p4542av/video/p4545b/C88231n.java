package dmt.p4542av.video.p4545b;

import android.content.Context;
import android.util.Pair;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.covode.number.Covode;
import com.bytedance.creativex.editor.preview.AbstractC14088a;
import com.p2082ss.android.ugc.asve.editor.AbstractC31071f;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63247i;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.multiedit.data.C71493a;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.multiedit.data.C71494b;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoRecordData;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoSegmentRecordData;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.multiedit.p3827b.C71428c;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.multiedit.p3827b.C71429d;
import com.p2082ss.android.ugc.aweme.shortvideo.p3793af.C69823b;
import com.p2082ss.android.ugc.aweme.utils.C80418fa;
import com.p2082ss.android.ugc.tools.utils.C84904k;
import com.p2082ss.android.vesdk.C85581w;
import com.p2082ss.android.vesdk.VERecordData;
import com.p2082ss.android.vesdk.VESize;
import dmt.p4542av.video.VEEditorAutoStartStopArbiter;
import dmt.p4542av.video.VEPreviewMusicParams;
import dmt.p4542av.video.VEPreviewParams;
import java.util.List;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: dmt.av.video.b.n */
public final class C88231n extends AbstractC88181j {

    /* renamed from: H */
    private boolean f200254H;

    static {
        Covode.recordClassIndex(104266);
    }

    /* renamed from: dmt.av.video.b.n$a */
    public static final class SurfaceHolder$CallbackC88232a implements SurfaceHolder.Callback {

        /* renamed from: a */
        final /* synthetic */ C88231n f200255a;

        static {
            Covode.recordClassIndex(104267);
        }

        public final void surfaceCreated(SurfaceHolder surfaceHolder) {
            C89219l.m154721d(surfaceHolder, "");
        }

        public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            C89219l.m154721d(surfaceHolder, "");
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        SurfaceHolder$CallbackC88232a(C88231n nVar) {
            this.f200255a = nVar;
        }

        public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
            C89219l.m154721d(surfaceHolder, "");
            VESize a = this.f200255a.mo142743c().mo56299a(i2, i3);
            C71428c.m126148a(i2, i3, a.width, a.height);
            C88231n.m153328a(this.f200255a.mo142743c());
            C88231n.m153331b(this.f200255a.mo142743c());
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C88231n(dmt.p4542av.video.p4545b.C88238s r3) {
        /*
            r2 = this;
            java.lang.String r1 = ""
            p4600h.p4611f.p4613b.C89219l.m154721d(r3, r1)
            java.util.concurrent.ScheduledExecutorService r0 = com.p2082ss.android.ugc.aweme.p2719cv.C40780g.m82247d()
            p4600h.p4611f.p4613b.C89219l.m154716b(r0, r1)
            r2.<init>(r3, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: dmt.p4542av.video.p4545b.C88231n.<init>(dmt.av.video.b.s):void");
    }

    /* renamed from: a */
    public static void m153328a(AbstractC31071f fVar) {
        fVar.mo56280a(C85581w.EnumC85606e.SCALE_MODE_CENTER_INSIDE_WITH_2DENGINE);
        if (C71428c.m126150a()) {
            fVar.mo56343c(C71494b.f160203e, C71494b.f160204f);
        }
    }

    /* renamed from: a */
    private static boolean m153330a(VEPreviewParams vEPreviewParams) {
        if (vEPreviewParams.isStoryEditMode || !vEPreviewParams.mIsFromDraft) {
            return false;
        }
        if (vEPreviewParams.recordData == null || !vEPreviewParams.recordData.isSupportMultiEdit || vEPreviewParams.recordData.curMultiEditVideoRecordData == null) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static void m153331b(AbstractC31071f fVar) {
        boolean z;
        if (C71494b.f160205g <= 0 || C71494b.f160206h <= 0 || C71494b.f160207i <= 0 || C71494b.f160208j <= 0) {
            z = false;
        } else {
            z = true;
        }
        if (C71428c.m126151b() && z) {
            fVar.mo56302a(((float) C71494b.f160201c) / ((float) C71494b.f160207i), ((float) C71494b.f160202d) / ((float) C71494b.f160208j), 0.0f, -(((C71494b.f160205g / 2) - (C71494b.f160201c / 2)) - C71494b.f160199a), ((C71494b.f160206h / 2) - (C71494b.f160202d / 2)) - C71494b.f160200b);
        }
    }

    @Override // dmt.p4542av.video.p4545b.AbstractC88181j
    /* renamed from: a */
    public final void mo142723a(SurfaceView surfaceView) {
        super.mo142723a(surfaceView);
        if (surfaceView != null) {
            surfaceView.getHolder().addCallback(new SurfaceHolder$CallbackC88232a(this));
        }
    }

    @Override // dmt.p4542av.video.p4545b.AbstractC88181j
    /* renamed from: a */
    public final boolean mo142733a(VEPreviewMusicParams vEPreviewMusicParams) {
        C89219l.m154721d(vEPreviewMusicParams, "");
        if (!this.f200254H) {
            return super.mo142733a(vEPreviewMusicParams);
        }
        this.f200254H = false;
        return true;
    }

    /* renamed from: a */
    private final void m153329a(AbstractC31071f fVar, MultiEditVideoRecordData multiEditVideoRecordData) {
        if (multiEditVideoRecordData != null && C69823b.m123388a(multiEditVideoRecordData.musicPath, C63247i.f143610a)) {
            if (multiEditVideoRecordData.musicDuration <= 0) {
                multiEditVideoRecordData.musicDuration = C80418fa.m139406a(multiEditVideoRecordData.musicPath);
            }
            String str = multiEditVideoRecordData.musicPath;
            C89219l.m154716b(str, "");
            int a = fVar.mo56287a(str, multiEditVideoRecordData.musicTrimIn, multiEditVideoRecordData.musicDuration, false);
            fVar.mo56313a(a, 1, multiEditVideoRecordData.musicVolume);
            multiEditVideoRecordData.musicIndex = a;
            this.f200148i = a;
        }
    }

    @Override // dmt.p4542av.video.p4545b.AbstractC88181j
    /* renamed from: a */
    public final int mo142714a(Context context, AbstractC14088a aVar, SurfaceView surfaceView, AbstractC1204m mVar) {
        C89219l.m154721d(aVar, "");
        super.mo142714a(context, aVar, surfaceView, mVar);
        VEPreviewParams vEPreviewParams = (VEPreviewParams) aVar;
        if (vEPreviewParams.recordData.isMultiEditRetake) {
            VEEditorAutoStartStopArbiter vEEditorAutoStartStopArbiter = this.f200144e;
            if (vEEditorAutoStartStopArbiter != null) {
                vEEditorAutoStartStopArbiter.f200067b = true;
            }
            if (vEPreviewParams.recordData.segmentSizeChange) {
                AbstractC31071f c = mo142743c();
                MultiEditVideoRecordData multiEditVideoRecordData = vEPreviewParams.recordData.curMultiEditVideoRecordData;
                C89219l.m154716b(multiEditVideoRecordData, "");
                int i = vEPreviewParams.recordData.currentEditIndex;
                Pair<Integer, Integer> playInOutTime = multiEditVideoRecordData.getPlayInOutTime();
                Integer num = (Integer) playInOutTime.first;
                Integer num2 = (Integer) playInOutTime.second;
                List<MultiEditVideoSegmentRecordData> list = multiEditVideoRecordData.segmentDataList;
                C89219l.m154716b(list, "");
                int i2 = 0;
                int i3 = 0;
                for (T t : list) {
                    int i4 = i3 + 1;
                    if (i3 < 0) {
                        C89070n.m154520a();
                    }
                    T t2 = t;
                    if (i3 < i) {
                        C89219l.m154716b(t2, "");
                        i2 += (int) (t2.getEndTime() - t2.getStartTime());
                    }
                    i3 = i4;
                }
                VERecordData a = C71493a.m126273a(multiEditVideoRecordData);
                a.mo130356a(((long) num.intValue()) * 1000, ((long) num2.intValue()) * 1000);
                int unused = c.mo56276a(a, false, true);
                m153329a(c, multiEditVideoRecordData);
                c.mo56311a(true);
                m153328a(c);
                c.mo56381p();
                m153331b(c);
                c.mo56265a(i2, C85581w.EnumC85607f.EDITOR_SEEK_FLAG_LastSeek);
            } else {
                AbstractC31071f c2 = mo142743c();
                MultiEditVideoRecordData multiEditVideoRecordData2 = vEPreviewParams.recordData.curMultiEditVideoRecordData;
                C89219l.m154716b(multiEditVideoRecordData2, "");
                int i5 = vEPreviewParams.recordData.currentEditIndex;
                if (!C84904k.m145909a(multiEditVideoRecordData2.segmentDataList)) {
                    MultiEditVideoRecordData a2 = C71429d.m126153a(multiEditVideoRecordData2, (MultiEditVideoRecordData) null);
                    a2.resetTimeData();
                    MultiEditVideoSegmentRecordData multiEditVideoSegmentRecordData = a2.segmentDataList.get(i5);
                    a2.segmentDataList.clear();
                    a2.segmentDataList.add(multiEditVideoSegmentRecordData);
                    List<MultiEditVideoSegmentRecordData> list2 = multiEditVideoRecordData2.segmentDataList;
                    C89219l.m154716b(list2, "");
                    int i6 = 0;
                    int i7 = 0;
                    for (T t3 : list2) {
                        int i8 = i6 + 1;
                        if (i6 < 0) {
                            C89070n.m154520a();
                        }
                        T t4 = t3;
                        if (i6 < i5) {
                            C89219l.m154716b(t4, "");
                            i7 += (int) (t4.getEndTime() - t4.getStartTime());
                        }
                        i6 = i8;
                    }
                    MultiEditVideoSegmentRecordData multiEditVideoSegmentRecordData2 = multiEditVideoRecordData2.segmentDataList.get(i5);
                    C89219l.m154716b(multiEditVideoSegmentRecordData2, "");
                    long startTime = multiEditVideoSegmentRecordData2.getStartTime();
                    MultiEditVideoSegmentRecordData multiEditVideoSegmentRecordData3 = multiEditVideoRecordData2.segmentDataList.get(i5);
                    C89219l.m154716b(multiEditVideoSegmentRecordData3, "");
                    long endTime = multiEditVideoSegmentRecordData3.getEndTime();
                    c2.mo56385r();
                    int unused2 = c2.mo56276a(C71493a.m126273a(a2), false, true);
                    if (multiEditVideoRecordData2.isPlaySingleSegmentMusic()) {
                        m153329a(c2, multiEditVideoRecordData2);
                        int i9 = (int) (endTime - startTime);
                        if (multiEditVideoRecordData2.musicIndex != -1) {
                            int i10 = i7 + multiEditVideoRecordData2.musicTrimIn;
                            if (i10 > multiEditVideoRecordData2.musicDuration) {
                                i10 %= multiEditVideoRecordData2.musicDuration;
                            }
                            c2.mo56257a(multiEditVideoRecordData2.musicIndex, i10, i9 + i10, false);
                        }
                    }
                    c2.mo56311a(true);
                    m153328a(c2);
                    c2.mo56381p();
                    m153331b(c2);
                    int i11 = (int) startTime;
                    c2.mo56323b(i11, (int) endTime);
                    c2.mo56265a(i11, C85581w.EnumC85607f.EDITOR_SEEK_FLAG_LastSeek);
                }
            }
            if (vEPreviewParams.recordData.curMultiEditVideoRecordData.musicIndex == -1) {
                return 0;
            }
            this.f200254H = true;
            return 0;
        }
        MultiEditVideoRecordData multiEditVideoRecordData3 = vEPreviewParams.recordData.curMultiEditVideoRecordData;
        C89219l.m154716b(multiEditVideoRecordData3, "");
        Pair<Integer, Integer> playInOutTime2 = multiEditVideoRecordData3.getPlayInOutTime();
        MultiEditVideoRecordData multiEditVideoRecordData4 = vEPreviewParams.recordData.curMultiEditVideoRecordData;
        C89219l.m154716b(multiEditVideoRecordData4, "");
        VERecordData a3 = C71493a.m126273a(multiEditVideoRecordData4);
        a3.mo130356a(((long) ((Integer) playInOutTime2.first).intValue()) * 1000, ((long) ((Integer) playInOutTime2.second).intValue()) * 1000);
        if (this.f200157r == 1) {
            return mo142743c().mo56276a(a3, m153330a(vEPreviewParams), false);
        }
        return mo142743c().mo56276a(a3, m153330a(vEPreviewParams), true);
    }
}
