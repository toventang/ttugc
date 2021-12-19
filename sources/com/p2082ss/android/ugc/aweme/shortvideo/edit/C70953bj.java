package com.p2082ss.android.ugc.aweme.shortvideo.edit;

import androidx.lifecycle.AbstractC1204m;
import com.bytedance.als.dsl.C2553d;
import com.bytedance.als.dsl.C2554e;
import com.bytedance.covode.number.Covode;
import com.bytedance.p1559o.AbstractC21603p;
import com.bytedance.p1559o.C21582f;
import com.bytedance.p1559o.C21597n;
import com.p2082ss.android.ugc.aweme.infoSticker.C56724i;
import com.p2082ss.android.ugc.aweme.property.C65375bo;
import com.p2082ss.android.ugc.aweme.setting.C68338q;
import com.p2082ss.android.ugc.aweme.setting.p3721i.C68093f;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.C70504v;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.audioeffect.C70837c;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.audioeffect.C70857g;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.model.VideoCutInfo;
import com.p2082ss.android.ugc.aweme.shortvideo.preview.C72547d;
import com.p2082ss.android.ugc.gamora.editor.p4278e.C82156d;
import com.p2082ss.android.ugc.tools.utils.C84911q;
import com.p2082ss.android.vesdk.C85391be;
import com.p2082ss.android.vesdk.ROTATE_DEGREE;
import dmt.p4542av.video.VEPreviewParams;
import dmt.p4542av.video.p4545b.C88238s;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Objects;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4620k.AbstractC89282g;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.bj */
public final class C70953bj {
    static {
        Covode.recordClassIndex(83447);
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.bj$c */
    static final class C70956c extends AbstractC89220m implements AbstractC89172b<C21597n, C89391z> {

        /* renamed from: a */
        final /* synthetic */ VEVideoPublishEditActivity f158861a;

        static {
            Covode.recordClassIndex(83450);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C70956c(VEVideoPublishEditActivity vEVideoPublishEditActivity) {
            super(1);
            this.f158861a = vEVideoPublishEditActivity;
        }

        /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.bj$c$a */
        public static final class C70957a extends AbstractC21603p<VEVideoPublishEditActivity> {

            /* renamed from: a */
            final /* synthetic */ C70956c f158862a;

            static {
                Covode.recordClassIndex(83451);
            }

            public C70957a(C70956c cVar) {
                this.f158862a = cVar;
            }

            @Override // com.bytedance.p1559o.AbstractC21603p
            public final VEVideoPublishEditActivity get(C21582f fVar) {
                C89219l.m154721d(fVar, "");
                return this.f158862a.f158861a;
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.bj$c$b */
        public static final class C70958b extends AbstractC21603p<VideoPublishEditModel> {

            /* renamed from: a */
            final /* synthetic */ C70956c f158863a;

            static {
                Covode.recordClassIndex(83452);
            }

            public C70958b(C70956c cVar) {
                this.f158863a = cVar;
            }

            @Override // com.bytedance.p1559o.AbstractC21603p
            public final VideoPublishEditModel get(C21582f fVar) {
                C89219l.m154721d(fVar, "");
                return this.f158863a.f158861a.f158485k;
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.bj$c$c */
        public static final class C70959c extends AbstractC21603p<C56724i> {

            /* renamed from: a */
            final /* synthetic */ C70956c f158864a;

            static {
                Covode.recordClassIndex(83453);
            }

            public C70959c(C70956c cVar) {
                this.f158864a = cVar;
            }

            @Override // com.bytedance.p1559o.AbstractC21603p
            public final C56724i get(C21582f fVar) {
                C89219l.m154721d(fVar, "");
                return this.f158864a.f158861a.f158486l;
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.bj$c$d */
        public static final class C70960d extends AbstractC21603p<AbstractC70977bq> {

            /* renamed from: a */
            final /* synthetic */ C70956c f158865a;

            static {
                Covode.recordClassIndex(83454);
            }

            public C70960d(C70956c cVar) {
                this.f158865a = cVar;
            }

            @Override // com.bytedance.p1559o.AbstractC21603p
            public final AbstractC70977bq get(C21582f fVar) {
                C89219l.m154721d(fVar, "");
                VideoPublishEditModel videoPublishEditModel = this.f158865a.f158861a.f158485k;
                C89219l.m154716b(videoPublishEditModel, "");
                return C70979br.m125332a(videoPublishEditModel);
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.bj$c$e */
        public static final class C70961e extends AbstractC21603p<AbstractC1204m> {

            /* renamed from: a */
            final /* synthetic */ C70956c f158866a;

            static {
                Covode.recordClassIndex(83455);
            }

            public C70961e(C70956c cVar) {
                this.f158866a = cVar;
            }

            @Override // com.bytedance.p1559o.AbstractC21603p
            public final AbstractC1204m get(C21582f fVar) {
                C89219l.m154721d(fVar, "");
                return this.f158866a.f158861a;
            }
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C21597n nVar) {
            C21597n nVar2 = nVar;
            C89219l.m154721d(nVar2, "");
            C89219l.m154716b(nVar2.mo35260a(VEVideoPublishEditActivity.class, (String) null, (AbstractC21603p) new C70957a(this)), "");
            C89219l.m154716b(nVar2.mo35260a(VideoPublishEditModel.class, (String) null, (AbstractC21603p) new C70958b(this)), "");
            C89219l.m154716b(nVar2.mo35260a(C56724i.class, (String) null, (AbstractC21603p) new C70959c(this)), "");
            C89219l.m154716b(nVar2.mo35260a(AbstractC70977bq.class, (String) null, (AbstractC21603p) new C70960d(this)), "");
            C89219l.m154716b(nVar2.mo35260a(AbstractC1204m.class, (String) null, (AbstractC21603p) new C70961e(this)), "");
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.bj$a */
    public static final class C70954a extends AbstractC21603p<C82156d> {

        /* renamed from: a */
        final /* synthetic */ C2553d f158858a;

        /* renamed from: b */
        final /* synthetic */ VEVideoPublishEditActivity f158859b;

        static {
            Covode.recordClassIndex(83448);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.bytedance.p1559o.AbstractC21603p
        public final /* synthetic */ C82156d get(C21582f fVar) {
            C89219l.m154721d(fVar, "");
            return C70953bj.m125245a(this.f158859b, fVar);
        }

        public C70954a(C2553d dVar, VEVideoPublishEditActivity vEVideoPublishEditActivity) {
            this.f158858a = dVar;
            this.f158859b = vEVideoPublishEditActivity;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.bj$b */
    static final class C70955b extends AbstractC89220m implements AbstractC89172b<C2554e, C89391z> {

        /* renamed from: a */
        public static final C70955b f158860a = new C70955b();

        static {
            Covode.recordClassIndex(83449);
        }

        C70955b() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C2554e eVar) {
            C2554e eVar2 = eVar;
            C89219l.m154721d(eVar2, "");
            eVar2.f7721a = C68093f.m120394a();
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.bj$d */
    public static final class C70962d extends AbstractC89220m implements AbstractC89172b<C72547d, C89391z> {

        /* renamed from: a */
        final /* synthetic */ VEVideoPublishEditActivity f158867a;

        /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.bj$d$a */
        static final class C70966a extends AbstractC89220m implements AbstractC89171a<Boolean> {

            /* renamed from: a */
            public static final C70966a f158869a = new C70966a();

            static {
                Covode.recordClassIndex(83460);
            }

            C70966a() {
                super(0);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // p4600h.p4611f.p4612a.AbstractC89171a
            public final /* synthetic */ Boolean invoke() {
                return true;
            }
        }

        static {
            Covode.recordClassIndex(83456);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C70962d(VEVideoPublishEditActivity vEVideoPublishEditActivity) {
            super(1);
            this.f158867a = vEVideoPublishEditActivity;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C72547d dVar) {
            C72547d dVar2 = dVar;
            C89219l.m154721d(dVar2, "");
            C709631 r0 = C709631.f158868a;
            C89219l.m154721d(r0, "");
            dVar2.f162621a = r0;
            C709642 r1 = new AbstractC89171a<Boolean>(this.f158867a) {
                /* class com.p2082ss.android.ugc.aweme.shortvideo.edit.C70953bj.C70962d.C709642 */

                static {
                    Covode.recordClassIndex(83458);
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                @Override // p4600h.p4611f.p4612a.AbstractC89171a
                public final /* synthetic */ Boolean invoke() {
                    boolean z;
                    VEVideoPublishEditActivity vEVideoPublishEditActivity = (VEVideoPublishEditActivity) this.receiver;
                    boolean z2 = true;
                    boolean z3 = !C68338q.m120618a();
                    if (!vEVideoPublishEditActivity.f158489o || !C68338q.m120618a()) {
                        z = false;
                    } else {
                        z = true;
                    }
                    boolean z4 = vEVideoPublishEditActivity.f158488n;
                    vEVideoPublishEditActivity.f158488n = false;
                    if (!vEVideoPublishEditActivity.f158487m || (!z3 && !z && !z4)) {
                        z2 = false;
                    }
                    return Boolean.valueOf(z2);
                }
            };
            C89219l.m154721d(r1, "");
            dVar2.f162623c = r1;
            AbstractC89282g gVar = C70967bk.f158870a;
            C89219l.m154721d(gVar, "");
            dVar2.f162624d = gVar;
            C709653 r12 = new AbstractC89171a<C70857g>(C70837c.C70838a.m125105a()) {
                /* class com.p2082ss.android.ugc.aweme.shortvideo.edit.C70953bj.C70962d.C709653 */

                static {
                    Covode.recordClassIndex(83459);
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                @Override // p4600h.p4611f.p4612a.AbstractC89171a
                public final /* synthetic */ C70857g invoke() {
                    return C70837c.C70838a.m125107c();
                }
            };
            C89219l.m154721d(r12, "");
            dVar2.f162625e = r12;
            dVar2.f162627g = false;
            C88238s sVar = dVar2.f162626f;
            sVar.f200274b = 3;
            sVar.mo142772a(C70966a.f158869a);
            sVar.f200276d = C65375bo.m117071a();
            return C89391z.f203057a;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x007b  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final com.p2082ss.android.ugc.gamora.editor.p4278e.C82156d m125245a(com.p2082ss.android.ugc.aweme.shortvideo.edit.VEVideoPublishEditActivity r7, com.bytedance.p1559o.C21582f r8) {
        /*
        // Method dump skipped, instructions count: 160
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.shortvideo.edit.C70953bj.m125245a(com.ss.android.ugc.aweme.shortvideo.edit.VEVideoPublishEditActivity, com.bytedance.o.f):com.ss.android.ugc.gamora.editor.e.d");
    }

    /* renamed from: a */
    private static final C85391be m125246a(VEPreviewParams vEPreviewParams, VideoPublishEditModel videoPublishEditModel) {
        if (vEPreviewParams.getEditorHandler() <= 0 || vEPreviewParams.getEditorModel() == null) {
            return null;
        }
        if (vEPreviewParams.isFastImport && vEPreviewParams.mVideoPaths.length == 1) {
            EditVideoSegment editVideoSegment = videoPublishEditModel.getPreviewInfo().getVideoList().get(0);
            VideoCutInfo videoCutInfo = editVideoSegment.getVideoCutInfo();
            if (videoCutInfo != null) {
                if (videoCutInfo.getEnd() - videoCutInfo.getStart() == editVideoSegment.getVideoFileInfo().getDuration()) {
                    C84911q.m145921a("single video import without cut");
                }
            }
            return null;
        }
        C85391be beVar = new C85391be(vEPreviewParams.mVideoPaths);
        beVar.f191152e = vEPreviewParams.mVTrimIn;
        beVar.f191153f = vEPreviewParams.mVTrimOut;
        float[] speedArray = vEPreviewParams.getSpeedArray();
        if (speedArray != null) {
            C89219l.m154716b(speedArray, "");
            if (speedArray.length != 0) {
                ArrayList arrayList = new ArrayList(speedArray.length);
                for (float f : speedArray) {
                    arrayList.add(Double.valueOf((double) f));
                }
                beVar.f191156i = C89070n.m154575d((Collection<Double>) arrayList);
            }
        }
        int[] rotateArray = vEPreviewParams.getRotateArray();
        if (rotateArray != null) {
            C89219l.m154716b(rotateArray, "");
            if (rotateArray.length != 0) {
                ArrayList arrayList2 = new ArrayList(rotateArray.length);
                for (int i : rotateArray) {
                    arrayList2.add(C70504v.C70505a.m124383a(i));
                }
                Object[] array = arrayList2.toArray(new ROTATE_DEGREE[0]);
                Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
                beVar.f191158k = (ROTATE_DEGREE[]) array;
            }
        }
        return beVar;
    }
}
