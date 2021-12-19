package com.p2082ss.android.ugc.aweme.shortvideo.cut;

import com.bytedance.android.livesdk.livesetting.feed.LiveFeedRefreshTimeSetting;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.asve.editor.AbstractC31071f;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.AbstractC70076i;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.model.C71413b;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment;
import com.p2082ss.android.ugc.aweme.shortvideo.p3836i.C71889n;
import com.p2082ss.android.ugc.aweme.tools.EnumC78601i;
import com.p2082ss.android.ugc.aweme.tools.p4098c.C78102c;
import com.p2082ss.android.vesdk.C85391be;
import com.p2082ss.android.vesdk.C85581w;
import com.p2082ss.android.vesdk.ROTATE_DEGREE;
import com.p2082ss.android.vesdk.VEListener;
import com.p2082ss.android.vesdk.VEVideoEncodeSettings;
import com.p2082ss.android.vesdk.clipparam.VEClipSourceParam;
import com.p2082ss.android.vesdk.clipparam.VEClipTimelineParam;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p4600h.C89378p;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.v */
public final class C70504v implements AbstractC70076i {

    /* renamed from: a */
    public static final C70505a f157561a = new C70505a((byte) 0);

    /* renamed from: b */
    private int f157562b;

    /* renamed from: c */
    private VideoSegment f157563c;

    /* renamed from: d */
    private final AbstractC31071f f157564d;

    /* renamed from: e */
    private C85391be f157565e;

    static {
        Covode.recordClassIndex(82953);
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.cut.AbstractC70076i
    /* renamed from: a */
    public final void mo110541a(boolean z, C89378p<Long, Long> pVar) {
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.cut.AbstractC70076i
    /* renamed from: b */
    public final void mo110546b(int i, int i2) {
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.v$a */
    public static final class C70505a {
        static {
            Covode.recordClassIndex(82954);
        }

        private C70505a() {
        }

        public /* synthetic */ C70505a(byte b) {
            this();
        }

        /* renamed from: a */
        public static int m124382a(ROTATE_DEGREE rotate_degree) {
            if (rotate_degree == null) {
                return 0;
            }
            int i = C70578w.f157916a[rotate_degree.ordinal()];
            if (i == 1) {
                return 90;
            }
            if (i == 2) {
                return LiveFeedRefreshTimeSetting.DEFAULT;
            }
            if (i != 3) {
                return 0;
            }
            return 270;
        }

        /* renamed from: a */
        public static ROTATE_DEGREE m124383a(int i) {
            if (i == 90) {
                return ROTATE_DEGREE.ROTATE_90;
            }
            if (i == 180) {
                return ROTATE_DEGREE.ROTATE_180;
            }
            if (i != 270) {
                return ROTATE_DEGREE.ROTATE_NONE;
            }
            return ROTATE_DEGREE.ROTATE_270;
        }

        /* renamed from: a */
        public static VEVideoEncodeSettings m124384a(C70071e eVar) {
            C89219l.m154721d(eVar, "");
            VEVideoEncodeSettings.C85292a e = new VEVideoEncodeSettings.C85292a(2).mo130588b(eVar.f156688g).mo130580a(eVar.f156689h).mo130579a(eVar.f156690i).mo130573a(eVar.f156685d, eVar.f156686e).mo130590c(eVar.f156692k).mo130597f(eVar.f156693l).mo130576a(eVar.f156691j).mo130575a(VEVideoEncodeSettings.COMPILE_TYPE.COMPILE_TYPE_MP4).mo130572a(eVar.f156687f).mo130595e(eVar.f156694m);
            if (eVar.f156695n.length() > 0) {
                e.mo130581a(eVar.f156695n);
            }
            VEVideoEncodeSettings d = e.mo130594d();
            C89219l.m154716b(d, "");
            return d;
        }

        /* renamed from: a */
        public static void m124385a(List<? extends EditVideoSegment> list, AbstractC31071f fVar) {
            C89219l.m154721d(list, "");
            C89219l.m154721d(fVar, "");
            if ((!list.isEmpty()) && list != null) {
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                ArrayList arrayList5 = new ArrayList();
                for (T t : list) {
                    String a = C71889n.C71890a.m126963a(t.getVideoPath());
                    arrayList2.add(Integer.valueOf((int) t.getVideoFileInfo().getDuration()));
                    arrayList.add(t.getVideoPath());
                    arrayList3.add(Integer.valueOf(t.getVideoFileInfo().getWidth()));
                    arrayList4.add(Integer.valueOf(t.getVideoFileInfo().getHeight()));
                    arrayList5.add(a);
                }
                String a2 = C71889n.m126962a(false, true, arrayList, arrayList2, arrayList3, arrayList4, arrayList5, null);
                C89219l.m154716b(a2, "");
                fVar.mo56288a("description", a2);
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.cut.AbstractC70076i
    /* renamed from: a */
    public final void mo110538a(List<? extends VideoSegment> list) {
        if (list != null && !list.isEmpty()) {
            C78102c.m136524b(this.f157565e, list);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.cut.AbstractC70076i
    /* renamed from: a */
    public final void mo110534a(int i, int i2) {
        this.f157564d.mo56352e(i, i2);
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.cut.AbstractC70076i
    /* renamed from: c */
    public final void mo110547c(int i, int i2) {
        this.f157564d.mo56323b(i, i2);
    }

    public C70504v(AbstractC31071f fVar, C85391be beVar) {
        C89219l.m154721d(fVar, "");
        C89219l.m154721d(beVar, "");
        this.f157564d = fVar;
        this.f157565e = beVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.cut.AbstractC70076i
    /* renamed from: b */
    public final void mo110545b(int i, float f) {
        this.f157565e.f191156i[i] = (double) f;
        this.f157564d.mo56277a(this.f157565e);
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.cut.AbstractC70076i
    /* renamed from: a */
    public final void mo110540a(List<? extends VideoSegment> list, boolean z) {
        C78102c.m136522a(this.f157565e, list);
        this.f157564d.mo56277a(this.f157565e);
        this.f157564d.mo56265a(0, C85581w.EnumC85607f.EDITOR_SEEK_FLAG_LastSeek);
        AbstractC70076i.C70077a.m123719a(this, 0.0f, 0.0f, 0.0f, 30);
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.cut.AbstractC70076i
    /* renamed from: a */
    public final void mo110536a(int i, VideoSegment videoSegment) {
        C89219l.m154721d(videoSegment, "");
        this.f157563c = videoSegment;
        this.f157562b = i;
        int i2 = videoSegment.f156718j;
        videoSegment.f156718j = 0;
        C78102c.m136521a(this.f157565e, i, videoSegment);
        this.f157564d.mo56278a(this.f157565e, (int) videoSegment.mo110578d(), (int) videoSegment.mo110580e());
        videoSegment.f156718j = i2;
        AbstractC70076i.C70077a.m123719a(this, (float) videoSegment.f156718j, videoSegment.f156719k, videoSegment.f156720l, 24);
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.cut.AbstractC70076i
    /* renamed from: a */
    public final void mo110537a(C70071e eVar, VEListener.AbstractC85248q qVar) {
        C89219l.m154721d(eVar, "");
        C89219l.m154721d(qVar, "");
        VEVideoEncodeSettings a = C70505a.m124384a(eVar);
        List<VideoSegment> list = eVar.f156682a;
        ArrayList arrayList = new ArrayList(C89070n.m154526a((Iterable) list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(C71413b.m126116a((VideoSegment) it.next()));
        }
        C70505a.m124385a(arrayList, this.f157564d);
        this.f157564d.mo56316a(eVar.f156683b.toString(), eVar.f156684c, a, qVar);
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.cut.AbstractC70076i
    /* renamed from: a */
    public final boolean mo110544a(int i, float f) {
        if (this.f157564d.mo56261a(i, C70505a.m124383a((int) f)) == 0) {
            return true;
        }
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.cut.AbstractC70076i
    /* renamed from: a */
    public final void mo110535a(int i, int i2, List<? extends VideoSegment> list) {
        List<? extends VideoSegment> list2;
        C89219l.m154721d(list, "");
        int size = list.size();
        String[] strArr = new String[size];
        int[] iArr = new int[size];
        int[] iArr2 = new int[size];
        float[] fArr = new float[size];
        int[] iArr3 = new int[size];
        if (!list.isEmpty()) {
            list2 = list;
        } else {
            list2 = null;
        }
        int i3 = 0;
        if (list2 != null) {
            int i4 = 0;
            for (T t : list2) {
                int i5 = i4 + 1;
                if (i4 < 0) {
                    C89070n.m154520a();
                }
                T t2 = t;
                strArr[i4] = t2.mo110571a(false).toString();
                iArr[i4] = (int) t2.mo110578d();
                iArr2[i4] = (int) t2.mo110580e();
                fArr[i4] = t2.mo110582f();
                iArr3[i4] = t2.f156718j;
                i4 = i5;
            }
        }
        C85391be beVar = new C85391be(strArr);
        C78102c.m136523a(beVar, list, iArr, iArr2, fArr, iArr3);
        this.f157565e = beVar;
        for (T t3 : list) {
            int i6 = i3 + 1;
            if (i3 < 0) {
                C89070n.m154520a();
            }
            this.f157565e.f191149b[i3] = t3.f156709a;
            i3 = i6;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.cut.AbstractC70076i
    /* renamed from: a */
    public final void mo110542a(boolean z, boolean z2, List<? extends VideoSegment> list) {
        VideoSegment videoSegment = this.f157563c;
        if (videoSegment != null) {
            C85391be beVar = this.f157565e;
            int i = this.f157562b;
            C89219l.m154721d(beVar, "");
            C89219l.m154721d(videoSegment, "");
            beVar.f191156i[i] = (double) videoSegment.mo110582f();
            beVar.f191152e[i] = (int) videoSegment.mo110578d();
            beVar.f191153f[i] = (int) videoSegment.mo110580e();
            beVar.f191158k[i] = C70505a.m124383a(videoSegment.f156718j);
            if (list != null) {
                int i2 = 0;
                for (T t : list) {
                    int i3 = i2 + 1;
                    if (i2 < 0) {
                        C89070n.m154520a();
                    }
                    beVar.f191157j[i2] = !t.f156717i;
                    i2 = i3;
                }
            }
            this.f157564d.mo56277a(this.f157565e);
            AbstractC70076i.C70077a.m123719a(this, 0.0f, 0.0f, 0.0f, 30);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.cut.AbstractC70076i
    /* renamed from: a */
    public final void mo110539a(List<? extends VideoSegment> list, int i, long j, long j2) {
        if (!(list == null || list.isEmpty())) {
            int size = list.size();
            ArrayList<VEClipSourceParam> arrayList = new ArrayList<>(size);
            ArrayList<VEClipTimelineParam> arrayList2 = new ArrayList<>(size);
            for (T t : list) {
                VEClipSourceParam vEClipSourceParam = new VEClipSourceParam();
                vEClipSourceParam.clipFilePath = t.mo110571a(false).toString();
                vEClipSourceParam.clipWidth = t.f156714f;
                vEClipSourceParam.clipHeight = t.f156715g;
                arrayList.add(vEClipSourceParam);
                VEClipTimelineParam vEClipTimelineParam = new VEClipTimelineParam();
                vEClipTimelineParam.speed = (double) EnumC78601i.NORMAL.value();
                vEClipTimelineParam.trimIn = 0;
                vEClipTimelineParam.trimOut = (int) t.f156710b;
                arrayList2.add(vEClipTimelineParam);
            }
            this.f157564d.mo56269a(i - list.size(), arrayList, arrayList2);
            this.f157564d.mo56323b((int) j, (int) j2);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.cut.AbstractC70076i
    /* renamed from: a */
    public final boolean mo110543a(float f, float f2, float f3, int i, int i2) {
        this.f157564d.mo56302a(f2, f3, f, i, i2);
        return true;
    }
}
