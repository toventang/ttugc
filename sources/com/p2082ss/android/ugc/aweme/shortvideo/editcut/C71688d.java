package com.p2082ss.android.ugc.aweme.shortvideo.editcut;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.asve.editor.AbstractC31071f;
import com.p2082ss.android.ugc.asve.editor.C31067b;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.AbstractC70076i;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.C70071e;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.C70504v;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.multiedit.data.C71493a;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoRecordData;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoSegmentRecordData;
import com.p2082ss.android.ugc.aweme.shortvideo.editcut.p3830a.C71557a;
import com.p2082ss.android.ugc.aweme.shortvideo.editcut.p3830a.C71558b;
import com.p2082ss.android.ugc.aweme.tools.EnumC78601i;
import com.p2082ss.android.ugc.aweme.tools.p4098c.C78102c;
import com.p2082ss.android.vesdk.C85391be;
import com.p2082ss.android.vesdk.ROTATE_DEGREE;
import com.p2082ss.android.vesdk.VEListener;
import com.p2082ss.android.vesdk.clipparam.VEClipSourceParam;
import com.p2082ss.android.vesdk.clipparam.VEClipTimelineParam;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlinx.coroutines.AbstractC89516am;
import kotlinx.coroutines.AbstractC89568bz;
import kotlinx.coroutines.C89546bf;
import kotlinx.coroutines.C89561bs;
import kotlinx.coroutines.C89624i;
import p4600h.C89382r;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4603c.AbstractC89124d;
import p4600h.p4603c.p4605b.p4606a.AbstractC89118k;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.editcut.d */
public final class C71688d implements AbstractC70076i {

    /* renamed from: a */
    final Map<String, String> f160657a;

    /* renamed from: b */
    final Map<String, String> f160658b;

    /* renamed from: c */
    private int f160659c;

    /* renamed from: d */
    private C85391be f160660d;

    /* renamed from: e */
    private C31067b f160661e;

    /* renamed from: f */
    private AbstractC89568bz f160662f;

    /* renamed from: g */
    private final AbstractC31071f f160663g;

    /* renamed from: h */
    private final C71557a f160664h;

    /* renamed from: i */
    private final boolean f160665i;

    static {
        Covode.recordClassIndex(84233);
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.cut.AbstractC70076i
    /* renamed from: a */
    public final void mo110537a(C70071e eVar, VEListener.AbstractC85248q qVar) {
        C89219l.m154721d(eVar, "");
        C89219l.m154721d(qVar, "");
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.cut.AbstractC70076i
    /* renamed from: a */
    public final boolean mo110544a(int i, float f) {
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.cut.AbstractC70076i
    /* renamed from: a */
    public final void mo110542a(boolean z, boolean z2, List<? extends VideoSegment> list) {
        VideoSegment videoSegment;
        if (z2) {
            List<MultiEditVideoSegmentRecordData> list2 = mo113367a().segmentDataList;
            C89219l.m154716b(list2, "");
            MultiEditVideoSegmentRecordData multiEditVideoSegmentRecordData = (MultiEditVideoSegmentRecordData) C89070n.m154561b((List) list2, this.f160659c);
            if (multiEditVideoSegmentRecordData != null) {
                multiEditVideoSegmentRecordData.enable = false;
            }
        }
        if (!(!z || list == null || (videoSegment = (VideoSegment) C89070n.m154561b((List) list, this.f160659c)) == null)) {
            List<MultiEditVideoSegmentRecordData> list3 = mo113367a().segmentDataList;
            C89219l.m154716b(list3, "");
            MultiEditVideoSegmentRecordData multiEditVideoSegmentRecordData2 = (MultiEditVideoSegmentRecordData) C89070n.m154561b((List) list3, this.f160659c);
            if (multiEditVideoSegmentRecordData2 != null) {
                C71493a.m126277a(multiEditVideoSegmentRecordData2, videoSegment);
                multiEditVideoSegmentRecordData2.setVideoSpeed(videoSegment.mo110582f());
                multiEditVideoSegmentRecordData2.rotate = videoSegment.f156718j;
            }
        }
        AbstractC70076i.C70077a.m123718a(this, false, null, 3);
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.cut.AbstractC70076i
    /* renamed from: a */
    public final boolean mo110543a(float f, float f2, float f3, int i, int i2) {
        this.f160663g.mo56302a(f2, f3, f, i, i2);
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.cut.AbstractC70076i
    /* renamed from: a */
    public final void mo110540a(List<? extends VideoSegment> list, boolean z) {
        AbstractC70076i.C70077a.m123718a(this, false, null, 3);
    }

    /* renamed from: a */
    public final void mo110541a(boolean r7, p4600h.C89378p<java.lang.Long, java.lang.Long> r8) {
        /*
        // Method dump skipped, instructions count: 208
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.shortvideo.editcut.C71688d.mo110541a(boolean, h.p):void");
    }

    /* renamed from: a */
    public final MultiEditVideoRecordData mo113367a() {
        MultiEditVideoRecordData multiEditVideoRecordData = this.f160664h.f160357d.curMultiEditVideoRecordData;
        C89219l.m154716b(multiEditVideoRecordData, "");
        return multiEditVideoRecordData;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.shortvideo.editcut.d$1 */
    public static final class C716891 extends AbstractC89118k implements AbstractC89183m<AbstractC89516am, AbstractC89124d<? super C89391z>, Object> {

        /* renamed from: a */
        int f160666a;

        /* renamed from: b */
        final /* synthetic */ C71688d f160667b;

        /* renamed from: c */
        private /* synthetic */ Object f160668c;

        static {
            Covode.recordClassIndex(84234);
        }

        {
            this.f160667b = r2;
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final AbstractC89124d<C89391z> create(Object obj, AbstractC89124d<?> dVar) {
            C89219l.m154721d(dVar, "");
            C716891 r1 = new C716891(this.f160667b, dVar);
            r1.f160668c = obj;
            return r1;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final Object invoke(AbstractC89516am amVar, AbstractC89124d<? super C89391z> dVar) {
            return ((C716891) create(amVar, dVar)).invokeSuspend(C89391z.f203057a);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: com.ss.android.ugc.aweme.shortvideo.editcut.d$1$a */
        public static final class C71690a extends AbstractC89118k implements AbstractC89183m<AbstractC89516am, AbstractC89124d<? super C89391z>, Object> {

            /* renamed from: a */
            int f160669a;

            /* renamed from: b */
            final /* synthetic */ C716891 f160670b;

            static {
                Covode.recordClassIndex(84235);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C71690a(C716891 r2, AbstractC89124d dVar) {
                super(2, dVar);
                this.f160670b = r2;
            }

            @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
            public final AbstractC89124d<C89391z> create(Object obj, AbstractC89124d<?> dVar) {
                C89219l.m154721d(dVar, "");
                return new C71690a(this.f160670b, dVar);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
            @Override // p4600h.p4611f.p4612a.AbstractC89183m
            public final Object invoke(AbstractC89516am amVar, AbstractC89124d<? super C89391z> dVar) {
                return ((C71690a) create(amVar, dVar)).invokeSuspend(C89391z.f203057a);
            }

            @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
            public final Object invokeSuspend(Object obj) {
                if (this.f160669a == 0) {
                    C89382r.m154942a(obj);
                    List<MultiEditVideoSegmentRecordData> list = this.f160670b.f160667b.mo113367a().segmentDataList;
                    C89219l.m154716b(list, "");
                    int i = 0;
                    for (T t : list) {
                        int i2 = i + 1;
                        if (i < 0) {
                            C89070n.m154520a();
                        }
                        C71688d dVar = this.f160670b.f160667b;
                        String str = t.audioPath;
                        C89219l.m154716b(str, "");
                        if (dVar.f160658b.get(str) == null) {
                            dVar.f160658b.put(str, dVar.mo113368a(1, i, str));
                        }
                        i = i2;
                    }
                    return C89391z.f203057a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: com.ss.android.ugc.aweme.shortvideo.editcut.d$1$b */
        public static final class C71691b extends AbstractC89118k implements AbstractC89183m<AbstractC89516am, AbstractC89124d<? super C89391z>, Object> {

            /* renamed from: a */
            int f160671a;

            /* renamed from: b */
            final /* synthetic */ C716891 f160672b;

            static {
                Covode.recordClassIndex(84236);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C71691b(C716891 r2, AbstractC89124d dVar) {
                super(2, dVar);
                this.f160672b = r2;
            }

            @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
            public final AbstractC89124d<C89391z> create(Object obj, AbstractC89124d<?> dVar) {
                C89219l.m154721d(dVar, "");
                return new C71691b(this.f160672b, dVar);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
            @Override // p4600h.p4611f.p4612a.AbstractC89183m
            public final Object invoke(AbstractC89516am amVar, AbstractC89124d<? super C89391z> dVar) {
                return ((C71691b) create(amVar, dVar)).invokeSuspend(C89391z.f203057a);
            }

            @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
            public final Object invokeSuspend(Object obj) {
                if (this.f160671a == 0) {
                    C89382r.m154942a(obj);
                    List<MultiEditVideoSegmentRecordData> list = this.f160672b.f160667b.mo113367a().segmentDataList;
                    C89219l.m154716b(list, "");
                    int i = 0;
                    for (T t : list) {
                        int i2 = i + 1;
                        if (i < 0) {
                            C89070n.m154520a();
                        }
                        C71688d dVar = this.f160672b.f160667b;
                        String str = t.videoPath;
                        C89219l.m154716b(str, "");
                        if (dVar.f160657a.get(str) == null) {
                            dVar.f160657a.put(str, dVar.mo113368a(0, i, str));
                        }
                        i = i2;
                    }
                    return C89391z.f203057a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:13:0x0049 A[RETURN] */
        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                r8 = this;
                h.c.a.a r7 = p4600h.p4603c.p4604a.EnumC89098a.COROUTINE_SUSPENDED
                int r0 = r8.f160666a
                r6 = 2
                r5 = 1
                r4 = 0
                if (r0 == 0) goto L_0x0013
                if (r0 == r5) goto L_0x0038
                if (r0 != r6) goto L_0x004a
                p4600h.C89382r.m154942a(r9)
            L_0x0010:
                h.z r0 = p4600h.C89391z.f203057a
                return r0
            L_0x0013:
                p4600h.C89382r.m154942a(r9)
                java.lang.Object r3 = r8.f160668c
                kotlinx.coroutines.am r3 = (kotlinx.coroutines.AbstractC89516am) r3
                com.ss.android.ugc.aweme.shortvideo.editcut.d$1$b r0 = new com.ss.android.ugc.aweme.shortvideo.editcut.d$1$b
                r0.<init>(r8, r4)
                r1 = 3
                kotlinx.coroutines.av r2 = kotlinx.coroutines.C89622g.m155548a(r3, r4, r0, r1)
                com.ss.android.ugc.aweme.shortvideo.editcut.d$1$a r0 = new com.ss.android.ugc.aweme.shortvideo.editcut.d$1$a
                r0.<init>(r8, r4)
                kotlinx.coroutines.av r1 = kotlinx.coroutines.C89622g.m155548a(r3, r4, r0, r1)
                r8.f160668c = r1
                r8.f160666a = r5
                java.lang.Object r0 = r2.mo144106a(r8)
                if (r0 != r7) goto L_0x003f
                return r7
            L_0x0038:
                java.lang.Object r1 = r8.f160668c
                kotlinx.coroutines.av r1 = (kotlinx.coroutines.AbstractC89531av) r1
                p4600h.C89382r.m154942a(r9)
            L_0x003f:
                r8.f160668c = r4
                r8.f160666a = r6
                java.lang.Object r0 = r1.mo144106a(r8)
                if (r0 != r7) goto L_0x0010
                return r7
            L_0x004a:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r1.<init>(r0)
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.shortvideo.editcut.C71688d.C716891.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.cut.AbstractC70076i
    /* renamed from: a */
    public final void mo110538a(List<? extends VideoSegment> list) {
        if (list != null && C71558b.m126458a(this.f160664h)) {
            MultiEditVideoRecordData a = mo113367a();
            C89219l.m154721d(a, "");
            C89219l.m154721d(list, "");
            if (!list.isEmpty()) {
                if (a.segmentDataList == null) {
                    a.segmentDataList = new ArrayList();
                }
                for (T t : list) {
                    List<MultiEditVideoSegmentRecordData> list2 = a.segmentDataList;
                    C89219l.m154721d(t, "");
                    MultiEditVideoSegmentRecordData multiEditVideoSegmentRecordData = new MultiEditVideoSegmentRecordData();
                    multiEditVideoSegmentRecordData.videoPath = t.mo110571a(false);
                    multiEditVideoSegmentRecordData.width = t.f156714f;
                    multiEditVideoSegmentRecordData.height = t.f156715g;
                    multiEditVideoSegmentRecordData.setVideoSpeed(t.mo110582f());
                    multiEditVideoSegmentRecordData.rotate = t.f156718j;
                    multiEditVideoSegmentRecordData.videoLength = t.f156710b * 1000;
                    multiEditVideoSegmentRecordData.setStartTime(t.mo110578d());
                    multiEditVideoSegmentRecordData.setEndTime(t.mo110580e());
                    multiEditVideoSegmentRecordData.enable = !t.f156717i;
                    multiEditVideoSegmentRecordData.videoKey = t.f156709a;
                    list2.add(multiEditVideoSegmentRecordData);
                }
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.cut.AbstractC70076i
    /* renamed from: c */
    public final void mo110547c(int i, int i2) {
        this.f160663g.mo56323b(i, i2);
    }

    private C71688d(AbstractC31071f fVar, C71557a aVar) {
        C89219l.m154721d(fVar, "");
        C89219l.m154721d(aVar, "");
        this.f160663g = fVar;
        this.f160664h = aVar;
        this.f160665i = true;
        this.f160657a = new LinkedHashMap();
        this.f160658b = new LinkedHashMap();
        this.f160659c = -1;
        if (!C71558b.m126458a(aVar)) {
            this.f160662f = C89624i.m155555a(C89561bs.f203280a, C89546bf.f203267b, null, new C716891(this, null), 2);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.cut.AbstractC70076i
    /* renamed from: a */
    public final void mo110534a(int i, int i2) {
        this.f160663g.mo56352e(i, i2);
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.cut.AbstractC70076i
    /* renamed from: b */
    public final void mo110545b(int i, float f) {
        if (C71558b.m126458a(this.f160664h)) {
            if (!this.f160664h.f160355b) {
                MultiEditVideoSegmentRecordData multiEditVideoSegmentRecordData = mo113367a().segmentDataList.get(i);
                C89219l.m154716b(multiEditVideoSegmentRecordData, "");
                multiEditVideoSegmentRecordData.setVideoSpeed(f);
            }
            C85391be beVar = this.f160660d;
            if (beVar == null) {
                beVar = C71493a.m126279b(mo113367a());
            }
            if (i >= 0 && i < beVar.f191156i.length) {
                beVar.f191156i[i] = (double) f;
            }
            this.f160663g.mo56277a(beVar);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.cut.AbstractC70076i
    /* renamed from: a */
    public final void mo110536a(int i, VideoSegment videoSegment) {
        C89219l.m154721d(videoSegment, "");
        this.f160659c = i;
        if (C71558b.m126458a(this.f160664h)) {
            C85391be b = C71493a.m126279b(mo113367a());
            C78102c.m136521a(b, i, videoSegment);
            this.f160660d = b;
            AbstractC31071f fVar = this.f160663g;
            if (b == null) {
                C89219l.m154715b();
            }
            fVar.mo56278a(b, (int) videoSegment.mo110578d(), (int) videoSegment.mo110580e());
            return;
        }
        C31067b a = m126589a(mo113367a(), false, this.f160657a, this.f160658b, i);
        C89219l.m154721d(a, "");
        C89219l.m154721d(videoSegment, "");
        a.f74420c[0] = 0;
        a.f74421d[0] = (int) videoSegment.f156710b;
        int[] iArr = a.f74425h;
        if (iArr != null) {
            iArr[0] = 0;
        }
        int[] iArr2 = a.f74426i;
        if (iArr2 != null) {
            iArr2[0] = (int) videoSegment.f156710b;
        }
        ROTATE_DEGREE[] rotate_degreeArr = a.f74428k;
        if (rotate_degreeArr != null) {
            rotate_degreeArr[0] = C70504v.C70505a.m124383a(videoSegment.f156718j);
        }
        float[] fArr = a.f74422e;
        if (fArr != null) {
            fArr[0] = videoSegment.mo110582f();
        }
        this.f160661e = a;
        this.f160663g.mo56273a(a);
        mo110547c((int) (((float) videoSegment.mo110578d()) * videoSegment.mo110582f()), (int) (((float) videoSegment.mo110580e()) * videoSegment.mo110582f()));
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.cut.AbstractC70076i
    /* renamed from: b */
    public final void mo110546b(int i, int i2) {
        if (!this.f160664h.f160355b) {
            mo113367a().segmentDataList.get(i).rotate = i2;
        }
        if (C71558b.m126458a(this.f160664h)) {
            C85391be beVar = this.f160660d;
            if (beVar == null) {
                beVar = C71493a.m126279b(mo113367a());
            }
            if (i >= 0 && i < beVar.f191158k.length) {
                beVar.f191158k[i] = C70504v.C70505a.m124383a(i2);
            }
            this.f160663g.mo56277a(beVar);
            return;
        }
        C31067b bVar = this.f160661e;
        if (bVar == null) {
            bVar = m126589a(mo113367a(), false, this.f160657a, this.f160658b, i);
        }
        ROTATE_DEGREE[] rotate_degreeArr = bVar.f74428k;
        if (rotate_degreeArr != null) {
            rotate_degreeArr[0] = C70504v.C70505a.m124383a(i2);
        }
        this.f160663g.mo56273a(bVar);
    }

    public /* synthetic */ C71688d(AbstractC31071f fVar, C71557a aVar, byte b) {
        this(fVar, aVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final String mo113368a(int i, int i2, String str) {
        int i3;
        if (i == 0) {
            i3 = 0;
        } else {
            i3 = this.f160663g.mo56300a().f191689j;
        }
        String a = this.f160663g.mo56301a(i, i3, i2, str);
        if (a == null) {
            return "";
        }
        return a;
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.cut.AbstractC70076i
    /* renamed from: a */
    public final void mo110535a(int i, int i2, List<? extends VideoSegment> list) {
        C89219l.m154721d(list, "");
        if (C71558b.m126458a(this.f160664h)) {
            this.f160663g.mo56352e(i, i2);
        } else {
            AbstractC70076i.C70077a.m123718a(this, false, null, 3);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.cut.AbstractC70076i
    /* renamed from: a */
    public final void mo110539a(List<? extends VideoSegment> list, int i, long j, long j2) {
        if (!(list == null || list.isEmpty() || !C71558b.m126458a(this.f160664h))) {
            int size = list.size();
            ArrayList<VEClipSourceParam> arrayList = new ArrayList<>(size);
            ArrayList<VEClipTimelineParam> arrayList2 = new ArrayList<>(size);
            for (T t : list) {
                VEClipSourceParam vEClipSourceParam = new VEClipSourceParam();
                vEClipSourceParam.clipFilePath = t.mo110571a(false);
                vEClipSourceParam.clipWidth = t.f156714f;
                vEClipSourceParam.clipHeight = t.f156715g;
                arrayList.add(vEClipSourceParam);
                VEClipTimelineParam vEClipTimelineParam = new VEClipTimelineParam();
                vEClipTimelineParam.speed = (double) EnumC78601i.NORMAL.value();
                vEClipTimelineParam.trimIn = 0;
                vEClipTimelineParam.trimOut = (int) t.f156710b;
                arrayList2.add(vEClipTimelineParam);
            }
            this.f160663g.mo56269a(i - list.size(), arrayList, arrayList2);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static C31067b m126589a(MultiEditVideoRecordData multiEditVideoRecordData, boolean z, Map<String, String> map, Map<String, String> map2, int i) {
        ArrayList arrayList;
        if (i < 0 || i >= multiEditVideoRecordData.segmentDataList.size()) {
            arrayList = multiEditVideoRecordData.segmentDataList;
            if (!z) {
                C89219l.m154716b(arrayList, "");
                ArrayList arrayList2 = new ArrayList();
                for (T t : arrayList) {
                    if (t.enable) {
                        arrayList2.add(t);
                    }
                }
                arrayList = arrayList2;
            }
        } else {
            arrayList = C89070n.m154516a(multiEditVideoRecordData.segmentDataList.get(i));
        }
        int size = arrayList.size();
        String[] strArr = new String[size];
        String[] strArr2 = new String[size];
        for (int i2 = 0; i2 < size; i2++) {
            strArr2[i2] = "";
        }
        int[] iArr = new int[size];
        int[] iArr2 = new int[size];
        float[] fArr = new float[size];
        String[] strArr3 = new String[size];
        String[] strArr4 = new String[size];
        for (int i3 = 0; i3 < size; i3++) {
            strArr4[i3] = "";
        }
        int[] iArr3 = new int[size];
        int[] iArr4 = new int[size];
        float[] fArr2 = new float[size];
        ROTATE_DEGREE[] rotate_degreeArr = new ROTATE_DEGREE[size];
        C89219l.m154716b(arrayList, "");
        int i4 = 0;
        for (T t2 : arrayList) {
            int i5 = i4 + 1;
            if (i4 < 0) {
                C89070n.m154520a();
            }
            T t3 = t2;
            strArr[i4] = t3.videoPath;
            String str = map.get(t3.videoPath);
            if (str == null) {
                str = "";
            }
            strArr2[i4] = str;
            C89219l.m154716b(t3, "");
            iArr[i4] = (int) t3.getStartTime();
            iArr2[i4] = (int) t3.getEndTime();
            fArr[i4] = t3.getVideoSpeed();
            strArr3[i4] = t3.audioPath;
            String str2 = map2.get(t3.audioPath);
            if (str2 == null) {
                str2 = "";
            }
            strArr4[i4] = str2;
            iArr3[i4] = (int) (((float) t3.getStartTime()) * t3.audioSpeed);
            iArr4[i4] = (int) (((float) t3.getEndTime()) * t3.audioSpeed);
            fArr2[i4] = t3.audioSpeed;
            rotate_degreeArr[i4] = C70504v.C70505a.m124383a(t3.rotate);
            i4 = i5;
        }
        ArrayList arrayList3 = new ArrayList();
        for (int i6 = 0; i6 < size; i6++) {
            String str3 = strArr3[i6];
            if (!(str3 == null || str3.length() == 0)) {
                arrayList3.add(str3);
            }
        }
        if (arrayList3.isEmpty()) {
            strArr3 = null;
            strArr4 = null;
        }
        return new C31067b(strArr, strArr2, iArr, iArr2, fArr, strArr3, strArr4, iArr3, iArr4, fArr2, rotate_degreeArr);
    }
}
