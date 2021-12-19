package com.p2082ss.android.ugc.aweme.shortvideo.edit.multiedit.p3829d;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.View;
import androidx.core.p036g.C0692e;
import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.C1175ad;
import androidx.lifecycle.C1181ae;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.C20370ah;
import com.bytedance.jedi.arch.C20531t;
import com.bytedance.jedi.arch.JediViewModel;
import com.p2082ss.android.ugc.asve.editor.AbstractC31071f;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.aweme.shortvideo.C69905c;
import com.p2082ss.android.ugc.aweme.shortvideo.RetakeVideoContext;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.C70082m;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.CutMultiVideoViewModel;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoBottomBarViewModel;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoSpeedViewModel;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditViewModel;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.viewmodel.C70576a;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.viewmodel.VEVideoCutterViewModel;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.VEVideoPublishEditActivity;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.multiedit.data.C71493a;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoRecordData;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoSegmentRecordData;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoStatusRecordData;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.multiedit.p3827b.C71423a;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.multiedit.p3827b.C71427b;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.multiedit.p3827b.C71429d;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.multiedit.p3828c.AbstractC71432a;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.multiedit.p3828c.AbstractC71433b;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.multiedit.p3828c.AbstractC71434c;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.multiedit.p3828c.AbstractC71435d;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.multiedit.p3829d.C71484h;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.multiedit.view.AbstractC71496a;
import com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.TimeSpeedModelExtension;
import com.p2082ss.android.ugc.aweme.shortvideo.util.C73950ak;
import com.p2082ss.android.ugc.aweme.shortvideo.util.C73962ap;
import com.p2082ss.android.ugc.aweme.shortvideo.util.C73991bj;
import com.p2082ss.android.ugc.aweme.tools.EnumC78601i;
import com.p2082ss.android.ugc.gamora.editor.multiedit.MultiEditViewModel;
import com.p2082ss.android.ugc.gamora.editor.p4276c.AbstractC82074b;
import com.p2082ss.android.ugc.gamora.editor.p4276c.C82080c;
import com.p2082ss.android.ugc.tools.utils.C84904k;
import com.p2082ss.android.ugc.tools.view.p4362a.AbstractC84917a;
import com.p2082ss.android.ugc.tools.view.p4362a.AbstractC84919c;
import com.p2082ss.android.vesdk.C85391be;
import com.p2082ss.android.vesdk.C85581w;
import com.p2082ss.android.vesdk.VERecordData;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89233z;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.multiedit.d.f */
public final class View$OnClickListenerC71465f implements View.OnClickListener {

    /* renamed from: u */
    public static final C71466a f160110u = new C71466a((byte) 0);

    /* renamed from: A */
    private boolean f160111A;

    /* renamed from: B */
    private MultiEditVideoRecordData f160112B;

    /* renamed from: C */
    private C69905c f160113C;

    /* renamed from: D */
    private int f160114D;

    /* renamed from: E */
    private ArrayList<TimeSpeedModelExtension> f160115E;

    /* renamed from: F */
    private ArrayList<TimeSpeedModelExtension> f160116F;

    /* renamed from: G */
    private ArrayList<TimeSpeedModelExtension> f160117G;

    /* renamed from: H */
    private ArrayList<TimeSpeedModelExtension> f160118H;

    /* renamed from: I */
    private boolean f160119I;

    /* renamed from: J */
    private int f160120J;

    /* renamed from: K */
    private boolean f160121K;

    /* renamed from: L */
    private AbstractC84919c f160122L;

    /* renamed from: M */
    private final AbstractC84917a f160123M = new C71476k(this);

    /* renamed from: N */
    private AbstractC71432a f160124N;

    /* renamed from: O */
    private final String f160125O = "new";

    /* renamed from: a */
    public CutMultiVideoViewModel f160126a;

    /* renamed from: b */
    public VideoEditViewModel f160127b;

    /* renamed from: c */
    public VEVideoCutterViewModel f160128c;

    /* renamed from: d */
    public boolean f160129d;

    /* renamed from: e */
    public ActivityC0945e f160130e;

    /* renamed from: f */
    public AbstractC71496a f160131f;

    /* renamed from: g */
    public C71442d f160132g = new C71442d();

    /* renamed from: h */
    public C71484h f160133h = new C71484h();

    /* renamed from: i */
    public C71444e f160134i = new C71444e();

    /* renamed from: j */
    public int f160135j;

    /* renamed from: k */
    public ArrayList<VideoSegment> f160136k = new ArrayList<>();

    /* renamed from: l */
    public VideoPublishEditModel f160137l;

    /* renamed from: m */
    public MultiEditVideoRecordData f160138m;

    /* renamed from: n */
    MultiEditVideoRecordData f160139n;

    /* renamed from: o */
    public MultiEditVideoRecordData f160140o;

    /* renamed from: p */
    ArrayList<TimeSpeedModelExtension> f160141p;

    /* renamed from: q */
    public boolean f160142q;

    /* renamed from: r */
    public int f160143r = 1;

    /* renamed from: s */
    public int f160144s;

    /* renamed from: t */
    public C71441c f160145t = new C71441c();

    /* renamed from: v */
    private CutVideoSpeedViewModel f160146v;

    /* renamed from: w */
    private CutVideoBottomBarViewModel f160147w;

    /* renamed from: x */
    private MultiEditViewModel f160148x;

    /* renamed from: y */
    private View f160149y;

    /* renamed from: z */
    private ArrayList<MediaModel> f160150z = new ArrayList<>();

    static {
        Covode.recordClassIndex(83999);
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.multiedit.d.f$a */
    public static final class C71466a {
        static {
            Covode.recordClassIndex(84000);
        }

        private C71466a() {
        }

        public /* synthetic */ C71466a(byte b) {
            this();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.multiedit.d.f$b */
    public static final class C71467b extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ View$OnClickListenerC71465f f160151a;

        static {
            Covode.recordClassIndex(84001);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C71467b(View$OnClickListenerC71465f fVar) {
            super(0);
            this.f160151a = fVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            this.f160151a.mo113096g();
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.multiedit.d.f$c */
    public static final class C71468c extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ View$OnClickListenerC71465f f160152a;

        static {
            Covode.recordClassIndex(84002);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C71468c(View$OnClickListenerC71465f fVar) {
            super(0);
            this.f160152a = fVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            this.f160152a.mo113093d();
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.multiedit.d.f$f */
    public static final class C71471f implements AbstractC71435d {

        /* renamed from: a */
        final /* synthetic */ View$OnClickListenerC71465f f160155a;

        static {
            Covode.recordClassIndex(84005);
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.edit.multiedit.p3828c.AbstractC71435d
        /* renamed from: b */
        public final void mo113053b() {
            this.f160155a.f160142q = false;
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.edit.multiedit.p3828c.AbstractC71435d
        /* renamed from: a */
        public final void mo113051a() {
            if (!this.f160155a.f160145t.f160069g) {
                View$OnClickListenerC71465f fVar = this.f160155a;
                fVar.f160145t.f160072j = 0;
                VideoEditViewModel videoEditViewModel = fVar.f160127b;
                if (videoEditViewModel == null) {
                    C89219l.m154710a("videoEditViewModel");
                }
                VideoSegment videoSegment = videoEditViewModel.mo111232k().get(fVar.f160135j);
                VideoEditViewModel videoEditViewModel2 = fVar.f160127b;
                if (videoEditViewModel2 == null) {
                    C89219l.m154710a("videoEditViewModel");
                }
                List<VideoSegment> k = videoEditViewModel2.mo111232k();
                C89219l.m154716b(k, "");
                int i = 0;
                for (T t : k) {
                    int i2 = i + 1;
                    if (i < 0) {
                        C89070n.m154520a();
                    }
                    T t2 = t;
                    if (i < fVar.f160135j) {
                        C71441c cVar = fVar.f160145t;
                        int i3 = cVar.f160072j;
                        C89219l.m154716b(t2, "");
                        cVar.f160072j = i3 + ((int) (t2.mo110580e() - t2.mo110578d()));
                    }
                    i = i2;
                }
                C71441c cVar2 = fVar.f160145t;
                C89219l.m154716b(videoSegment, "");
                cVar2.f160073k = (int) (videoSegment.mo110580e() - videoSegment.mo110578d());
                C71442d dVar = fVar.f160132g;
                MultiEditVideoRecordData multiEditVideoRecordData = fVar.f160138m;
                if (multiEditVideoRecordData == null) {
                    C89219l.m154710a("curRecordData");
                }
                int i4 = fVar.f160135j;
                int i5 = fVar.f160145t.f160072j;
                if (!(multiEditVideoRecordData == null || C84904k.m145909a(multiEditVideoRecordData.segmentDataList))) {
                    MultiEditVideoRecordData a = C71429d.m126153a(multiEditVideoRecordData, (MultiEditVideoRecordData) null);
                    a.resetTimeData();
                    MultiEditVideoSegmentRecordData multiEditVideoSegmentRecordData = a.segmentDataList.get(i4);
                    a.segmentDataList.clear();
                    a.segmentDataList.add(multiEditVideoSegmentRecordData);
                    long e = videoSegment.mo110580e() - videoSegment.mo110578d();
                    AbstractC31071f fVar2 = dVar.f160074a;
                    if (fVar2 != null) {
                        fVar2.mo56385r();
                    }
                    AbstractC31071f fVar3 = dVar.f160074a;
                    if (fVar3 != null) {
                        int unused = fVar3.mo56276a(C71493a.m126273a(a), false, true);
                    }
                    if (multiEditVideoRecordData.isPlaySingleSegmentMusic()) {
                        dVar.mo113070b(multiEditVideoRecordData);
                        dVar.mo113066a(multiEditVideoRecordData, i5, 0, (int) e);
                    }
                    AbstractC31071f fVar4 = dVar.f160074a;
                    if (fVar4 != null) {
                        fVar4.mo56311a(true);
                    }
                    dVar.mo113072d();
                    AbstractC31071f fVar5 = dVar.f160074a;
                    if (fVar5 != null) {
                        fVar5.mo56381p();
                    }
                    dVar.mo113073e();
                    AbstractC31071f fVar6 = dVar.f160074a;
                    if (fVar6 != null) {
                        fVar6.mo56323b((int) videoSegment.mo110578d(), (int) videoSegment.mo110580e());
                    }
                    AbstractC31071f fVar7 = dVar.f160074a;
                    if (fVar7 != null) {
                        fVar7.mo56265a((int) videoSegment.mo110578d(), C85581w.EnumC85607f.EDITOR_SEEK_FLAG_LastSeek);
                    }
                }
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C71471f(View$OnClickListenerC71465f fVar) {
            this.f160155a = fVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:43:0x00c5, code lost:
            if (r21 == false) goto L_0x019a;
         */
        /* JADX WARNING: Removed duplicated region for block: B:50:0x00e0  */
        @Override // com.p2082ss.android.ugc.aweme.shortvideo.edit.multiedit.p3828c.AbstractC71435d
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo113052a(boolean r20, boolean r21) {
            /*
            // Method dump skipped, instructions count: 467
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.shortvideo.edit.multiedit.p3829d.View$OnClickListenerC71465f.C71471f.mo113052a(boolean, boolean):void");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.multiedit.d.f$g */
    public static final class C71472g implements AbstractC71432a {

        /* renamed from: a */
        final /* synthetic */ View$OnClickListenerC71465f f160156a;

        static {
            Covode.recordClassIndex(84006);
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.edit.multiedit.p3828c.AbstractC71432a
        /* renamed from: b */
        public final void mo113039b() {
            this.f160156a.f160134i.mo113074a();
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.edit.multiedit.p3828c.AbstractC71432a
        /* renamed from: a */
        public final void mo113038a() {
            C71444e eVar = this.f160156a.f160134i;
            eVar.f160084h.post(eVar.f160086j);
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.edit.multiedit.p3828c.AbstractC71432a
        /* renamed from: c */
        public final void mo113040c() {
            if (!this.f160156a.f160145t.f160067e) {
                this.f160156a.f160132g.mo113060a();
                this.f160156a.f160132g.f160075b = null;
            } else if (!View$OnClickListenerC71465f.m126216c(this.f160156a).mo113206b()) {
                this.f160156a.f160132g.mo113060a();
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C71472g(View$OnClickListenerC71465f fVar) {
            this.f160156a = fVar;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.multiedit.d.f$i */
    public static final class C71474i extends AbstractC89220m implements AbstractC89171a<Boolean> {

        /* renamed from: a */
        public static final C71474i f160158a = new C71474i();

        static {
            Covode.recordClassIndex(84008);
        }

        C71474i() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Boolean invoke() {
            return false;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.multiedit.d.f$m */
    static final class RunnableC71478m implements Runnable {

        /* renamed from: a */
        final /* synthetic */ View$OnClickListenerC71465f f160162a;

        static {
            Covode.recordClassIndex(84012);
        }

        RunnableC71478m(View$OnClickListenerC71465f fVar) {
            this.f160162a = fVar;
        }

        public final void run() {
            this.f160162a.f160132g.mo113069b();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.multiedit.d.f$q */
    static final class RunnableC71482q implements Runnable {

        /* renamed from: a */
        final /* synthetic */ View$OnClickListenerC71465f f160178a;

        /* renamed from: b */
        final /* synthetic */ C89233z.C89234a f160179b;

        static {
            Covode.recordClassIndex(84016);
        }

        RunnableC71482q(View$OnClickListenerC71465f fVar, C89233z.C89234a aVar) {
            this.f160178a = fVar;
            this.f160179b = aVar;
        }

        public final void run() {
            this.f160178a.f160134i.mo113078a(this.f160179b.element);
        }
    }

    /* renamed from: j */
    private final void m126222j() {
        C71472g gVar = new C71472g(this);
        this.f160124N = gVar;
        this.f160132g.f160075b = gVar;
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.multiedit.d.f$d */
    public static final class C71469d implements AbstractC71434c {

        /* renamed from: a */
        final /* synthetic */ View$OnClickListenerC71465f f160153a;

        static {
            Covode.recordClassIndex(84003);
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.edit.multiedit.p3828c.AbstractC71434c
        /* renamed from: a */
        public final void mo113042a() {
            this.f160153a.f160133h.mo113106a(View$OnClickListenerC71465f.m126218e(this.f160153a), this.f160153a.f160135j, false, true);
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.edit.multiedit.p3828c.AbstractC71434c
        /* renamed from: b */
        public final void mo113048b() {
            this.f160153a.f160133h.mo113106a(View$OnClickListenerC71465f.m126218e(this.f160153a), this.f160153a.f160135j, false, false);
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.edit.multiedit.p3828c.AbstractC71434c
        /* renamed from: c */
        public final void mo113049c() {
            this.f160153a.f160133h.mo113106a(View$OnClickListenerC71465f.m126218e(this.f160153a), this.f160153a.f160135j, true, false);
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.edit.multiedit.p3828c.AbstractC71434c
        /* renamed from: d */
        public final void mo113050d() {
            if (!View$OnClickListenerC71465f.m126219f(this.f160153a).multiEditVideoRecordData.isMultiEditRetake || View$OnClickListenerC71465f.m126219f(this.f160153a).multiEditVideoRecordData.segmentSizeChange) {
                C71484h hVar = this.f160153a.f160133h;
                ActivityC0945e e = View$OnClickListenerC71465f.m126218e(this.f160153a);
                int i = this.f160153a.f160135j;
                hVar.mo113110b(View$OnClickListenerC71465f.m126217d(this.f160153a).mo111232k().get(this.f160153a.f160135j));
                AbstractC71496a aVar = hVar.f160181a;
                if (aVar == null) {
                    C89219l.m154710a("viewManager");
                }
                aVar.mo113203b(e, i, new C71484h.C71485a(hVar));
                AbstractC71435d dVar = hVar.f160182b;
                if (dVar == null) {
                    C89219l.m154710a("statusChangeListener");
                }
                dVar.mo113051a();
                return;
            }
            C71484h hVar2 = this.f160153a.f160133h;
            View$OnClickListenerC71465f.m126218e(this.f160153a);
            hVar2.mo113107a(View$OnClickListenerC71465f.m126217d(this.f160153a).mo111232k().get(this.f160153a.f160135j));
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C71469d(View$OnClickListenerC71465f fVar) {
            this.f160153a = fVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.edit.multiedit.p3828c.AbstractC71434c
        /* renamed from: a */
        public final void mo113047a(Integer num) {
            int i;
            View$OnClickListenerC71465f fVar = this.f160153a;
            if (num != null) {
                i = num.intValue();
            } else {
                i = 1;
            }
            fVar.f160143r = i;
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.edit.multiedit.p3828c.AbstractC71434c
        /* renamed from: a */
        public final void mo113046a(C0692e<Integer, Integer> eVar) {
            if (eVar != null && this.f160153a.f160143r != 2) {
                AbstractC71496a c = View$OnClickListenerC71465f.m126216c(this.f160153a);
                F f = eVar.f2750a;
                if (f == null) {
                    C89219l.m154715b();
                }
                C89219l.m154716b(f, "");
                int intValue = f.intValue();
                S s = eVar.f2751b;
                if (s == null) {
                    C89219l.m154715b();
                }
                C89219l.m154716b(s, "");
                c.mo113190a(intValue, s.intValue());
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.edit.multiedit.p3828c.AbstractC71434c
        /* renamed from: a */
        public final void mo113043a(float f) {
            if (!C73962ap.m130083a(f, 0.0f, 1.0E-5f)) {
                MultiEditVideoSegmentRecordData multiEditVideoSegmentRecordData = View$OnClickListenerC71465f.m126212a(this.f160153a).segmentDataList.get(this.f160153a.f160135j);
                C89219l.m154716b(multiEditVideoSegmentRecordData, "");
                multiEditVideoSegmentRecordData.setVideoSpeed(f);
                C71442d dVar = this.f160153a.f160132g;
                MultiEditVideoRecordData b = View$OnClickListenerC71465f.m126215b(this.f160153a);
                int i = this.f160153a.f160135j;
                C89219l.m154721d(b, "");
                C85391be b2 = C71493a.m126279b(b);
                b2.f191156i[i] = (double) f;
                AbstractC31071f fVar = dVar.f160074a;
                if (fVar != null) {
                    fVar.mo56277a(b2);
                }
                C0692e<Long, Long> playBoundary = View$OnClickListenerC71465f.m126216c(this.f160153a).mo113189a().getPlayBoundary();
                C89219l.m154716b(playBoundary, "");
                if (!(playBoundary.f2750a == null || playBoundary.f2751b == null)) {
                    long singleSeekTime = View$OnClickListenerC71465f.m126216c(this.f160153a).mo113189a().getSingleSeekTime();
                    F f2 = playBoundary.f2750a;
                    if (f2 == null) {
                        C89219l.m154715b();
                    }
                    int longValue = (int) f2.longValue();
                    S s = playBoundary.f2751b;
                    if (s == null) {
                        C89219l.m154715b();
                    }
                    int longValue2 = (int) s.longValue();
                    this.f160153a.f160132g.mo113061a(longValue, longValue2, f);
                    this.f160153a.f160132g.mo113065a(View$OnClickListenerC71465f.m126212a(this.f160153a), (int) (((float) longValue) / f), (int) (((float) longValue2) / f));
                    VEVideoCutterViewModel vEVideoCutterViewModel = this.f160153a.f160128c;
                    if (vEVideoCutterViewModel == null) {
                        C89219l.m154710a("veVideoCutterViewModel");
                    }
                    vEVideoCutterViewModel.mo111336a(new C70576a(singleSeekTime, C85581w.EnumC85607f.EDITOR_SEEK_FLAG_LastSeek));
                }
                View$OnClickListenerC71465f.m126216c(this.f160153a).mo113207c();
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.edit.multiedit.p3828c.AbstractC71434c
        /* renamed from: a */
        public final void mo113044a(int i, int i2) {
            View$OnClickListenerC71465f fVar = this.f160153a;
            VideoEditViewModel videoEditViewModel = fVar.f160127b;
            if (videoEditViewModel == null) {
                C89219l.m154710a("videoEditViewModel");
            }
            VideoSegment remove = videoEditViewModel.mo111232k().remove(i);
            VideoEditViewModel videoEditViewModel2 = fVar.f160127b;
            if (videoEditViewModel2 == null) {
                C89219l.m154710a("videoEditViewModel");
            }
            videoEditViewModel2.mo111232k().add(i2, remove);
            VideoEditViewModel videoEditViewModel3 = fVar.f160127b;
            if (videoEditViewModel3 == null) {
                C89219l.m154710a("videoEditViewModel");
            }
            List<VideoSegment> k = videoEditViewModel3.mo111232k();
            C89219l.m154716b(k, "");
            int i3 = 0;
            int i4 = 0;
            for (T t : k) {
                t.f156709a = i3;
                if (i3 < i2) {
                    C89219l.m154716b(t, "");
                    i4 += (int) (t.mo110580e() - t.mo110578d());
                }
                i3++;
            }
            MultiEditVideoRecordData multiEditVideoRecordData = fVar.f160138m;
            if (multiEditVideoRecordData == null) {
                C89219l.m154710a("curRecordData");
            }
            MultiEditVideoSegmentRecordData remove2 = multiEditVideoRecordData.segmentDataList.remove(i);
            MultiEditVideoRecordData multiEditVideoRecordData2 = fVar.f160138m;
            if (multiEditVideoRecordData2 == null) {
                C89219l.m154710a("curRecordData");
            }
            multiEditVideoRecordData2.segmentDataList.add(i2, remove2);
            C71442d dVar = fVar.f160132g;
            MultiEditVideoRecordData multiEditVideoRecordData3 = fVar.f160138m;
            if (multiEditVideoRecordData3 == null) {
                C89219l.m154710a("curRecordData");
            }
            if (multiEditVideoRecordData3 != null) {
                AbstractC31071f fVar2 = dVar.f160074a;
                if (fVar2 != null) {
                    fVar2.mo56385r();
                }
                VERecordData a = C71493a.m126273a(multiEditVideoRecordData3);
                AbstractC31071f fVar3 = dVar.f160074a;
                if (fVar3 != null) {
                    int unused = fVar3.mo56276a(a, false, true);
                }
                dVar.mo113070b(multiEditVideoRecordData3);
                AbstractC31071f fVar4 = dVar.f160074a;
                if (fVar4 != null) {
                    fVar4.mo56311a(true);
                }
                dVar.mo113072d();
                AbstractC31071f fVar5 = dVar.f160074a;
                if (fVar5 != null) {
                    fVar5.mo56381p();
                }
                dVar.mo113073e();
                AbstractC31071f fVar6 = dVar.f160074a;
                if (fVar6 != null) {
                    fVar6.mo56265a(i4, C85581w.EnumC85607f.EDITOR_SEEK_FLAG_LastSeek);
                }
            }
            AbstractC71496a aVar = fVar.f160131f;
            if (aVar == null) {
                C89219l.m154710a("viewManager");
            }
            aVar.mo113211f();
            AbstractC71496a aVar2 = fVar.f160131f;
            if (aVar2 == null) {
                C89219l.m154710a("viewManager");
            }
            aVar2.mo113207c();
            C71441c cVar = fVar.f160145t;
            MultiEditVideoRecordData multiEditVideoRecordData4 = fVar.f160139n;
            if (multiEditVideoRecordData4 == null) {
                C89219l.m154710a("restoreRecordData");
            }
            cVar.mo113058a(multiEditVideoRecordData4);
            ArrayList<TimeSpeedModelExtension> arrayList = fVar.f160141p;
            if (arrayList == null) {
                C89219l.m154715b();
            }
            if (i < arrayList.size()) {
                ArrayList<TimeSpeedModelExtension> arrayList2 = fVar.f160141p;
                if (arrayList2 == null) {
                    C89219l.m154715b();
                }
                TimeSpeedModelExtension remove3 = arrayList2.remove(i);
                C89219l.m154716b(remove3, "");
                ArrayList<TimeSpeedModelExtension> arrayList3 = fVar.f160141p;
                if (arrayList3 != null) {
                    arrayList3.add(i2, remove3);
                }
            }
            C39162r.m79460a("edit_segment_order", C71427b.m126147c().mo129406a("from_order", String.valueOf(i + 1)).mo129406a("to_order", String.valueOf(i2 + 1)).f188764a);
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.edit.multiedit.p3828c.AbstractC71434c
        /* renamed from: a */
        public final void mo113045a(long j, long j2) {
            float f;
            if (this.f160153a.f160145t.f160068f) {
                if (this.f160153a.f160144s == 0) {
                    View$OnClickListenerC71465f fVar = this.f160153a;
                    fVar.f160144s = (int) (fVar.f160145t.f160064b - this.f160153a.f160145t.f160063a);
                }
                int i = (int) (j2 - j);
                C71427b.m126144a(false, true, 0, this.f160153a.f160144s, i);
                this.f160153a.f160144s = i;
            } else if (this.f160153a.f160143r == 1) {
                if (this.f160153a.f160144s == 0) {
                    View$OnClickListenerC71465f fVar2 = this.f160153a;
                    fVar2.f160144s = (int) (fVar2.f160145t.f160064b - this.f160153a.f160145t.f160063a);
                }
                int i2 = (int) (j2 - j);
                C71427b.m126144a(false, false, 0, this.f160153a.f160144s, i2);
                this.f160153a.f160144s = i2;
            } else {
                if (this.f160153a.f160144s == 0) {
                    View$OnClickListenerC71465f fVar3 = this.f160153a;
                    VideoSegment videoSegment = View$OnClickListenerC71465f.m126217d(fVar3).mo111232k().get(this.f160153a.f160135j);
                    C89219l.m154716b(videoSegment, "");
                    long e = videoSegment.mo110580e();
                    VideoSegment videoSegment2 = View$OnClickListenerC71465f.m126217d(this.f160153a).mo111232k().get(this.f160153a.f160135j);
                    C89219l.m154716b(videoSegment2, "");
                    fVar3.f160144s = (int) (e - videoSegment2.mo110578d());
                }
                int i3 = (int) (j2 - j);
                C71427b.m126144a(true, false, this.f160153a.f160135j, this.f160153a.f160144s, i3);
                this.f160153a.f160144s = i3;
            }
            if (this.f160153a.f160143r == 1) {
                this.f160153a.f160145t.f160063a = j;
                this.f160153a.f160145t.f160064b = j2;
                C0692e<Float, Float> d = View$OnClickListenerC71465f.m126216c(this.f160153a).mo113209d();
                C71441c cVar = this.f160153a.f160145t;
                F f2 = d.f2750a;
                if (f2 == null) {
                    C89219l.m154715b();
                }
                cVar.f160065c = f2.floatValue();
                C71441c cVar2 = this.f160153a.f160145t;
                S s = d.f2751b;
                if (s == null) {
                    C89219l.m154715b();
                }
                cVar2.f160066d = s.floatValue();
                if (this.f160153a.f160135j < View$OnClickListenerC71465f.m126212a(this.f160153a).segmentDataList.size()) {
                    MultiEditVideoSegmentRecordData multiEditVideoSegmentRecordData = View$OnClickListenerC71465f.m126212a(this.f160153a).segmentDataList.get(this.f160153a.f160135j);
                    C89219l.m154716b(multiEditVideoSegmentRecordData, "");
                    f = multiEditVideoSegmentRecordData.getVideoSpeed();
                } else {
                    f = 1.0f;
                }
                this.f160153a.f160132g.mo113065a(View$OnClickListenerC71465f.m126212a(this.f160153a), (int) (((float) j) / f), (int) (((float) j2) / f));
                return;
            }
            this.f160153a.f160132g.mo113066a(View$OnClickListenerC71465f.m126212a(this.f160153a), this.f160153a.f160145t.f160072j, (int) j, (int) (j2 - j));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.multiedit.d.f$l */
    static final class C71477l extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ View$OnClickListenerC71465f f160161a;

        static {
            Covode.recordClassIndex(84011);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C71477l(View$OnClickListenerC71465f fVar) {
            super(0);
            this.f160161a = fVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            View$OnClickListenerC71465f.m126220g(this.f160161a).mo110475a(View$OnClickListenerC71465f.m126217d(this.f160161a).mo111232k().get(this.f160161a.f160135j));
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.multiedit.d.f$p */
    static final class RunnableC71481p implements Runnable {

        /* renamed from: a */
        final /* synthetic */ View$OnClickListenerC71465f f160177a;

        static {
            Covode.recordClassIndex(84015);
        }

        RunnableC71481p(View$OnClickListenerC71465f fVar) {
            this.f160177a = fVar;
        }

        public final void run() {
            this.f160177a.f160132g.mo113068a(View$OnClickListenerC71465f.m126212a(this.f160177a), View$OnClickListenerC71465f.m126215b(this.f160177a));
        }
    }

    /* renamed from: k */
    private final void m126223k() {
        C71484h hVar = this.f160133h;
        AbstractC71496a aVar = this.f160131f;
        if (aVar == null) {
            C89219l.m154710a("viewManager");
        }
        hVar.mo113109a(aVar);
        this.f160133h.mo113108a(new C71471f(this));
    }

    /* renamed from: a */
    public final float mo113083a() {
        AbstractC71496a aVar = this.f160131f;
        if (aVar == null) {
            C89219l.m154710a("viewManager");
        }
        return aVar.mo113189a().getSelectedTime();
    }

    /* renamed from: b */
    public final void mo113089b() {
        if (this.f160111A) {
            AbstractC71496a aVar = this.f160131f;
            if (aVar == null) {
                C89219l.m154710a("viewManager");
            }
            aVar.mo113205b(true);
        }
    }

    /* renamed from: c */
    public final void mo113091c() {
        if (this.f160111A) {
            AbstractC71496a aVar = this.f160131f;
            if (aVar == null) {
                C89219l.m154710a("viewManager");
            }
            aVar.mo113216k();
            this.f160133h.f160183c.mo113054a();
        }
        this.f160111A = false;
    }

    /* renamed from: d */
    public final void mo113093d() {
        if (!this.f160142q) {
            this.f160142q = true;
            C63244g.m114602a().mo73263I().mo101634a("click_edit_segments_return", (Map<String, String>) null);
            CutMultiVideoViewModel cutMultiVideoViewModel = this.f160126a;
            if (cutMultiVideoViewModel == null) {
                C89219l.m154710a("cutMultiVideoViewModel");
            }
            cutMultiVideoViewModel.mo110479c();
        }
    }

    /* renamed from: g */
    public final void mo113096g() {
        C71442d dVar = this.f160132g;
        MultiEditVideoRecordData multiEditVideoRecordData = this.f160139n;
        if (multiEditVideoRecordData == null) {
            C89219l.m154710a("restoreRecordData");
        }
        dVar.mo113064a(multiEditVideoRecordData);
        AbstractC71496a aVar = this.f160131f;
        if (aVar == null) {
            C89219l.m154710a("viewManager");
        }
        aVar.mo113189a().setCurrentRotate(0);
        MultiEditViewModel multiEditViewModel = this.f160148x;
        if (multiEditViewModel == null) {
            C89219l.m154710a("multiEditViewModel");
        }
        multiEditViewModel.mo127494a(false);
        mo113092c(false);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final void mo113097h() {
        this.f160145t.f160070h = false;
        this.f160145t.f160069g = false;
        VideoPublishEditModel videoPublishEditModel = this.f160137l;
        if (videoPublishEditModel == null) {
            C89219l.m154710a("model");
        }
        videoPublishEditModel.multiEditVideoRecordData.isMultiEditRetake = false;
        VideoPublishEditModel videoPublishEditModel2 = this.f160137l;
        if (videoPublishEditModel2 == null) {
            C89219l.m154710a("model");
        }
        videoPublishEditModel2.multiEditVideoRecordData.segmentSizeChange = false;
        VideoPublishEditModel videoPublishEditModel3 = this.f160137l;
        if (videoPublishEditModel3 == null) {
            C89219l.m154710a("model");
        }
        videoPublishEditModel3.multiEditVideoRecordData.currentEditIndex = -1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.multiedit.d.f$h */
    public static final class C71473h extends AbstractC89220m implements AbstractC89171a<Long> {

        /* renamed from: a */
        final /* synthetic */ View$OnClickListenerC71465f f160157a;

        static {
            Covode.recordClassIndex(84007);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C71473h(View$OnClickListenerC71465f fVar) {
            super(0);
            this.f160157a = fVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Long invoke() {
            View$OnClickListenerC71465f fVar = this.f160157a;
            ArrayList<VideoSegment> arrayList = fVar.f160136k;
            VideoEditViewModel videoEditViewModel = fVar.f160127b;
            if (videoEditViewModel == null) {
                C89219l.m154710a("videoEditViewModel");
            }
            float l = videoEditViewModel.mo111233l();
            float f = 0.0f;
            for (T t : arrayList) {
                if (!t.f156717i) {
                    f += ((float) (t.mo110580e() - t.mo110578d())) / (t.mo110582f() * l);
                }
            }
            return Long.valueOf(Math.min((long) f, 60000L));
        }
    }

    /* renamed from: l */
    private final void m126224l() {
        C71444e eVar = this.f160134i;
        VEVideoCutterViewModel vEVideoCutterViewModel = this.f160128c;
        if (vEVideoCutterViewModel == null) {
            C89219l.m154710a("veVideoCutterViewModel");
        }
        CutMultiVideoViewModel cutMultiVideoViewModel = this.f160126a;
        if (cutMultiVideoViewModel == null) {
            C89219l.m154710a("cutMultiVideoViewModel");
        }
        VideoEditViewModel videoEditViewModel = this.f160127b;
        if (videoEditViewModel == null) {
            C89219l.m154710a("videoEditViewModel");
        }
        CutVideoSpeedViewModel cutVideoSpeedViewModel = this.f160146v;
        if (cutVideoSpeedViewModel == null) {
            C89219l.m154710a("speedViewModel");
        }
        C71442d dVar = this.f160132g;
        AbstractC71496a aVar = this.f160131f;
        if (aVar == null) {
            C89219l.m154710a("viewManager");
        }
        eVar.mo113076a(vEVideoCutterViewModel, cutMultiVideoViewModel, videoEditViewModel, cutVideoSpeedViewModel, dVar, aVar);
        this.f160134i.mo113077a(new C71469d(this));
        C71444e eVar2 = this.f160134i;
        ActivityC0945e eVar3 = this.f160130e;
        if (eVar3 == null) {
            C89219l.m154710a("activity");
        }
        eVar2.mo113075a(eVar3);
        CutVideoBottomBarViewModel cutVideoBottomBarViewModel = this.f160147w;
        if (cutVideoBottomBarViewModel == null) {
            C89219l.m154710a("bottomBarViewModel");
        }
        ActivityC0945e eVar4 = this.f160130e;
        if (eVar4 == null) {
            C89219l.m154710a("activity");
        }
        AbstractC88412b unused = cutVideoBottomBarViewModel.mo33677a(eVar4, C71483g.f160180a, new C20370ah(), new C71470e(this));
    }

    /* renamed from: e */
    public final void mo113094e() {
        MultiEditVideoRecordData multiEditVideoRecordData = this.f160139n;
        if (multiEditVideoRecordData == null) {
            C89219l.m154710a("restoreRecordData");
        }
        if (multiEditVideoRecordData.startTime == this.f160145t.f160063a) {
            MultiEditVideoRecordData multiEditVideoRecordData2 = this.f160139n;
            if (multiEditVideoRecordData2 == null) {
                C89219l.m154710a("restoreRecordData");
            }
            if (multiEditVideoRecordData2.endTime == this.f160145t.f160064b) {
                MultiEditVideoRecordData multiEditVideoRecordData3 = this.f160138m;
                if (multiEditVideoRecordData3 == null) {
                    C89219l.m154710a("curRecordData");
                }
                MultiEditVideoRecordData multiEditVideoRecordData4 = this.f160139n;
                if (multiEditVideoRecordData4 == null) {
                    C89219l.m154710a("restoreRecordData");
                }
                if (!(!multiEditVideoRecordData3.isEqual(multiEditVideoRecordData4))) {
                    mo113096g();
                    this.f160112B = null;
                    mo113097h();
                    C71427b.m126145b();
                }
            }
        }
        ActivityC0945e eVar = this.f160130e;
        if (eVar == null) {
            C89219l.m154710a("activity");
        }
        C71423a.m126140b(eVar, new C71467b(this));
        this.f160112B = null;
        mo113097h();
        C71427b.m126145b();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x003e, code lost:
        if ((!p4600h.p4611f.p4613b.C89219l.m154714a((java.lang.Object) r1.segmentDataList.get(r3.f160135j).videoPath, (java.lang.Object) r2)) != false) goto L_0x0040;
     */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo113095f() {
        /*
            r3 = this;
            com.ss.android.ugc.aweme.shortvideo.edit.multiedit.view.a r1 = r3.f160131f
            if (r1 != 0) goto L_0x0009
            java.lang.String r0 = "viewManager"
            p4600h.p4611f.p4613b.C89219l.m154710a(r0)
        L_0x0009:
            boolean r0 = r1.mo113210e()
            if (r0 != 0) goto L_0x0040
            boolean r0 = r3.f160119I
            if (r0 == 0) goto L_0x0058
            com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoRecordData r0 = r3.f160112B
            if (r0 == 0) goto L_0x0058
            java.util.List<com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoSegmentRecordData> r1 = r0.segmentDataList
            int r0 = r3.f160135j
            java.lang.Object r0 = r1.get(r0)
            com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoSegmentRecordData r0 = (com.p2082ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoSegmentRecordData) r0
            java.lang.String r2 = r0.videoPath
            com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoRecordData r1 = r3.f160138m
            if (r1 != 0) goto L_0x002c
            java.lang.String r0 = "curRecordData"
            p4600h.p4611f.p4613b.C89219l.m154710a(r0)
        L_0x002c:
            java.util.List<com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoSegmentRecordData> r1 = r1.segmentDataList
            int r0 = r3.f160135j
            java.lang.Object r0 = r1.get(r0)
            com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoSegmentRecordData r0 = (com.p2082ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoSegmentRecordData) r0
            java.lang.String r0 = r0.videoPath
            boolean r0 = p4600h.p4611f.p4613b.C89219l.m154714a(r0, r2)
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0058
        L_0x0040:
            androidx.fragment.app.e r1 = r3.f160130e
            if (r1 != 0) goto L_0x0049
            java.lang.String r0 = "activity"
            p4600h.p4611f.p4613b.C89219l.m154710a(r0)
        L_0x0049:
            com.ss.android.ugc.aweme.shortvideo.edit.multiedit.d.f$c r0 = new com.ss.android.ugc.aweme.shortvideo.edit.multiedit.d.f$c
            r0.<init>(r3)
            com.p2082ss.android.ugc.aweme.shortvideo.edit.multiedit.p3827b.C71423a.m126139a(r1, r0)
        L_0x0051:
            com.p2082ss.android.ugc.aweme.shortvideo.edit.multiedit.p3827b.C71427b.m126141a()
            r0 = 0
            r3.f160119I = r0
            return
        L_0x0058:
            r3.mo113093d()
            goto L_0x0051
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.shortvideo.edit.multiedit.p3829d.View$OnClickListenerC71465f.mo113095f():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0174, code lost:
        if (m126214a(r1) == false) goto L_0x0181;
     */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x017a  */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m126221i() {
        /*
        // Method dump skipped, instructions count: 387
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.shortvideo.edit.multiedit.p3829d.View$OnClickListenerC71465f.m126221i():void");
    }

    /* renamed from: m */
    private final void m126225m() {
        MultiEditVideoRecordData multiEditVideoRecordData = this.f160138m;
        if (multiEditVideoRecordData == null) {
            C89219l.m154710a("curRecordData");
        }
        if (!C84904k.m145909a(multiEditVideoRecordData.segmentDataList)) {
            this.f160150z.clear();
            MultiEditVideoRecordData multiEditVideoRecordData2 = this.f160138m;
            if (multiEditVideoRecordData2 == null) {
                C89219l.m154710a("curRecordData");
            }
            for (MultiEditVideoSegmentRecordData multiEditVideoSegmentRecordData : multiEditVideoRecordData2.segmentDataList) {
                this.f160150z.add(multiEditVideoSegmentRecordData.convertModel());
            }
            VideoEditViewModel videoEditViewModel = this.f160127b;
            if (videoEditViewModel == null) {
                C89219l.m154710a("videoEditViewModel");
            }
            videoEditViewModel.mo111214a(this.f160150z);
            VideoEditViewModel videoEditViewModel2 = this.f160127b;
            if (videoEditViewModel2 == null) {
                C89219l.m154710a("videoEditViewModel");
            }
            List<VideoSegment> k = videoEditViewModel2.mo111232k();
            this.f160136k.clear();
            MultiEditVideoRecordData multiEditVideoRecordData3 = this.f160138m;
            if (multiEditVideoRecordData3 == null) {
                C89219l.m154710a("curRecordData");
            }
            List<MultiEditVideoSegmentRecordData> list = multiEditVideoRecordData3.segmentDataList;
            C89219l.m154716b(list, "");
            boolean z = false;
            int i = 0;
            for (T t : list) {
                int i2 = i + 1;
                if (i < 0) {
                    C89070n.m154520a();
                }
                T t2 = t;
                VideoSegment videoSegment = new VideoSegment(this.f160150z.get(i));
                videoSegment.f156709a = i;
                C89219l.m154716b(t2, "");
                videoSegment.mo110573a(t2.getStartTime());
                if (t2.getEndTime() <= 0) {
                    MediaModel mediaModel = this.f160150z.get(i);
                    C89219l.m154716b(mediaModel, "");
                    t2.setEndTime(mediaModel.f134668h);
                }
                videoSegment.mo110576b(t2.getEndTime());
                videoSegment.mo110572a(t2.getVideoSpeed());
                videoSegment.f156718j = t2.rotate;
                this.f160136k.add(videoSegment);
                VideoSegment videoSegment2 = k.get(i);
                C89219l.m154716b(videoSegment2, "");
                videoSegment2.mo110573a(t2.getStartTime());
                VideoSegment videoSegment3 = k.get(i);
                C89219l.m154716b(videoSegment3, "");
                videoSegment3.mo110576b(t2.getEndTime());
                i = i2;
            }
            C71441c cVar = this.f160145t;
            MultiEditVideoRecordData multiEditVideoRecordData4 = this.f160138m;
            if (multiEditVideoRecordData4 == null) {
                C89219l.m154710a("curRecordData");
            }
            if (multiEditVideoRecordData4.segmentDataList.size() == 1) {
                MultiEditVideoRecordData multiEditVideoRecordData5 = this.f160138m;
                if (multiEditVideoRecordData5 == null) {
                    C89219l.m154710a("curRecordData");
                }
                if (multiEditVideoRecordData5.isSingleVideo) {
                    z = true;
                }
            }
            cVar.f160068f = z;
        }
    }

    /* renamed from: n */
    private final void m126226n() {
        String sb;
        this.f160145t.mo113057a();
        C71441c cVar = this.f160145t;
        MultiEditVideoRecordData multiEditVideoRecordData = this.f160138m;
        if (multiEditVideoRecordData == null) {
            C89219l.m154710a("curRecordData");
        }
        cVar.mo113059b(multiEditVideoRecordData);
        int i = this.f160135j;
        RetakeVideoContext retakeVideoContext = new RetakeVideoContext();
        MultiEditVideoRecordData multiEditVideoRecordData2 = this.f160138m;
        if (multiEditVideoRecordData2 == null) {
            C89219l.m154710a("curRecordData");
        }
        retakeVideoContext.f155734d = C71493a.m126273a(multiEditVideoRecordData2);
        retakeVideoContext.f155733c = i;
        long j = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            MultiEditVideoRecordData multiEditVideoRecordData3 = this.f160138m;
            if (multiEditVideoRecordData3 == null) {
                C89219l.m154710a("curRecordData");
            }
            j += multiEditVideoRecordData3.segmentDataList.get(i3).videoLength;
        }
        retakeVideoContext.f155732b = j / 1000;
        MultiEditVideoRecordData multiEditVideoRecordData4 = this.f160138m;
        if (multiEditVideoRecordData4 == null) {
            C89219l.m154710a("curRecordData");
        }
        retakeVideoContext.f155731a = multiEditVideoRecordData4.segmentDataList.get(i).videoLength / 1000;
        MultiEditVideoRecordData multiEditVideoRecordData5 = this.f160138m;
        if (multiEditVideoRecordData5 == null) {
            C89219l.m154710a("curRecordData");
        }
        File file = new File(multiEditVideoRecordData5.curRecordingDir);
        String name = file.getName();
        C89219l.m154716b(name, "");
        if (!C89361p.m154929e((CharSequence) name, (CharSequence) this.f160125O)) {
            StringBuilder sb2 = new StringBuilder();
            String path = file.getPath();
            C89219l.m154716b(path, "");
            sb = sb2.append(m126213a(path)).append(this.f160125O).toString();
        } else {
            String name2 = file.getName();
            C89219l.m154716b(name2, "");
            Integer e = C89361p.m154863e(C89361p.m154899a(name2, (CharSequence) this.f160125O));
            if (e != null) {
                i2 = e.intValue();
            }
            StringBuilder sb3 = new StringBuilder();
            String parent = file.getParent();
            C89219l.m154716b(parent, "");
            sb = sb3.append(m126213a(parent)).append(this.f160125O).append(i2 + 1).toString();
        }
        retakeVideoContext.mo109993a(sb);
        MultiEditVideoStatusRecordData multiEditVideoStatusRecordData = new MultiEditVideoStatusRecordData();
        MultiEditVideoRecordData multiEditVideoRecordData6 = this.f160138m;
        if (multiEditVideoRecordData6 == null) {
            C89219l.m154710a("curRecordData");
        }
        multiEditVideoRecordData6.hasRetake = true;
        multiEditVideoStatusRecordData.currentEditIndex = this.f160135j;
        multiEditVideoStatusRecordData.originalSegments = this.f160115E;
        multiEditVideoStatusRecordData.restoreSegments = this.f160116F;
        multiEditVideoStatusRecordData.singleRestoreSegments = this.f160118H;
        multiEditVideoStatusRecordData.editSegments = this.f160141p;
        multiEditVideoStatusRecordData.editCutSegments = this.f160117G;
        MultiEditVideoRecordData multiEditVideoRecordData7 = this.f160138m;
        if (multiEditVideoRecordData7 == null) {
            C89219l.m154710a("curRecordData");
        }
        multiEditVideoStatusRecordData.curMultiEditVideoRecordData = multiEditVideoRecordData7;
        MultiEditVideoRecordData multiEditVideoRecordData8 = this.f160140o;
        if (multiEditVideoRecordData8 == null) {
            C89219l.m154710a("originRecordData");
        }
        multiEditVideoStatusRecordData.originMultiEditRecordData = multiEditVideoRecordData8;
        MultiEditVideoRecordData multiEditVideoRecordData9 = this.f160139n;
        if (multiEditVideoRecordData9 == null) {
            C89219l.m154710a("restoreRecordData");
        }
        multiEditVideoStatusRecordData.restoreMultiEditVideoRecordData = multiEditVideoRecordData9;
        MultiEditVideoRecordData multiEditVideoRecordData10 = this.f160138m;
        if (multiEditVideoRecordData10 == null) {
            C89219l.m154710a("curRecordData");
        }
        multiEditVideoStatusRecordData.singleRestoreMultiEditRecordData = C71429d.m126153a(multiEditVideoRecordData10, (MultiEditVideoRecordData) null);
        multiEditVideoStatusRecordData.recordMusic = this.f160113C;
        multiEditVideoStatusRecordData.originalMusicStart = this.f160114D;
        retakeVideoContext.f155735e = multiEditVideoStatusRecordData;
        VideoPublishEditModel videoPublishEditModel = this.f160137l;
        if (videoPublishEditModel == null) {
            C89219l.m154710a("model");
        }
        if (videoPublishEditModel.isStitchMode()) {
            VideoPublishEditModel videoPublishEditModel2 = this.f160137l;
            if (videoPublishEditModel2 == null) {
                C89219l.m154710a("model");
            }
            retakeVideoContext.f155737g = videoPublishEditModel2.stitchParams;
        }
        VideoPublishEditModel videoPublishEditModel3 = this.f160137l;
        if (videoPublishEditModel3 == null) {
            C89219l.m154710a("model");
        }
        if (videoPublishEditModel3.mIsFromDraft) {
            ActivityC0945e eVar = this.f160130e;
            if (eVar == null) {
                C89219l.m154710a("activity");
            }
            if (eVar instanceof VEVideoPublishEditActivity) {
                ActivityC0945e eVar2 = this.f160130e;
                if (eVar2 == null) {
                    C89219l.m154710a("activity");
                }
                Objects.requireNonNull(eVar2, "null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.edit.VEVideoPublishEditActivity");
                VEVideoPublishEditActivity vEVideoPublishEditActivity = (VEVideoPublishEditActivity) eVar2;
                VideoPublishEditModel videoPublishEditModel4 = this.f160137l;
                if (videoPublishEditModel4 == null) {
                    C89219l.m154710a("model");
                }
                Intent a = vEVideoPublishEditActivity.mo111757a(videoPublishEditModel4);
                if (a != null) {
                    a.putExtra("retake_video", retakeVideoContext);
                    a.putExtra("retake_shoot_mode", 1);
                    VideoPublishEditModel videoPublishEditModel5 = this.f160137l;
                    if (videoPublishEditModel5 == null) {
                        C89219l.m154710a("model");
                    }
                    vEVideoPublishEditActivity.mo111758a(a, videoPublishEditModel5);
                } else {
                    return;
                }
            } else {
                return;
            }
        } else {
            ActivityC0945e eVar3 = this.f160130e;
            if (eVar3 == null) {
                C89219l.m154710a("activity");
            }
            C82080c.m142102a(new AbstractC82074b.C82078d(eVar3, retakeVideoContext));
        }
        C71427b.m126142a(this.f160135j);
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.multiedit.d.f$j */
    public static final class C71475j implements AbstractC71433b {

        /* renamed from: a */
        final /* synthetic */ View$OnClickListenerC71465f f160159a;

        static {
            Covode.recordClassIndex(84009);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C71475j(View$OnClickListenerC71465f fVar) {
            this.f160159a = fVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.edit.multiedit.p3828c.AbstractC71433b
        /* renamed from: a */
        public final void mo113041a(int i) {
            C39162r.m79460a("select_video_section", C71427b.m126147c().mo129406a("order", String.valueOf(i + 1)).f188764a);
            this.f160159a.mo113084a(i);
        }
    }

    /* renamed from: a */
    public final void mo113086a(AbstractC31071f fVar) {
        this.f160132g.mo113063a(fVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.multiedit.d.f$e */
    public static final class C71470e extends AbstractC89220m implements AbstractC89172b<Boolean, C89391z> {

        /* renamed from: a */
        final /* synthetic */ View$OnClickListenerC71465f f160154a;

        static {
            Covode.recordClassIndex(84004);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C71470e(View$OnClickListenerC71465f fVar) {
            super(1);
            this.f160154a = fVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Boolean bool) {
            this.f160154a.f160129d = bool.booleanValue();
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.multiedit.d.f$o */
    public static final class C71480o extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ View$OnClickListenerC71465f f160170a;

        /* renamed from: b */
        final /* synthetic */ int f160171b;

        /* renamed from: c */
        final /* synthetic */ C89233z.C89235b f160172c;

        /* renamed from: d */
        final /* synthetic */ float f160173d;

        /* renamed from: e */
        final /* synthetic */ int f160174e = 0;

        /* renamed from: f */
        final /* synthetic */ int f160175f = 0;

        /* renamed from: g */
        final /* synthetic */ View f160176g;

        static {
            Covode.recordClassIndex(84014);
        }

        public final void onAnimationCancel(Animator animator) {
            super.onAnimationCancel(animator);
            this.f160176g.setEnabled(true);
        }

        public final void onAnimationStart(Animator animator) {
            super.onAnimationStart(animator);
            this.f160176g.setEnabled(false);
        }

        public final void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            this.f160176g.setEnabled(true);
            View$OnClickListenerC71465f.m126220g(this.f160170a).mo110478b();
            View$OnClickListenerC71465f.m126212a(this.f160170a).segmentDataList.get(this.f160170a.f160135j).rotate = (View$OnClickListenerC71465f.m126212a(this.f160170a).segmentDataList.get(this.f160170a.f160135j).rotate + 90) % 360;
        }

        C71480o(View$OnClickListenerC71465f fVar, int i, C89233z.C89235b bVar, float f, View view) {
            this.f160170a = fVar;
            this.f160171b = i;
            this.f160172c = bVar;
            this.f160173d = f;
            this.f160176g = view;
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ MultiEditVideoRecordData m126212a(View$OnClickListenerC71465f fVar) {
        MultiEditVideoRecordData multiEditVideoRecordData = fVar.f160138m;
        if (multiEditVideoRecordData == null) {
            C89219l.m154710a("curRecordData");
        }
        return multiEditVideoRecordData;
    }

    /* renamed from: b */
    public static final /* synthetic */ MultiEditVideoRecordData m126215b(View$OnClickListenerC71465f fVar) {
        MultiEditVideoRecordData multiEditVideoRecordData = fVar.f160140o;
        if (multiEditVideoRecordData == null) {
            C89219l.m154710a("originRecordData");
        }
        return multiEditVideoRecordData;
    }

    /* renamed from: c */
    public static final /* synthetic */ AbstractC71496a m126216c(View$OnClickListenerC71465f fVar) {
        AbstractC71496a aVar = fVar.f160131f;
        if (aVar == null) {
            C89219l.m154710a("viewManager");
        }
        return aVar;
    }

    /* renamed from: d */
    public static final /* synthetic */ VideoEditViewModel m126217d(View$OnClickListenerC71465f fVar) {
        VideoEditViewModel videoEditViewModel = fVar.f160127b;
        if (videoEditViewModel == null) {
            C89219l.m154710a("videoEditViewModel");
        }
        return videoEditViewModel;
    }

    /* renamed from: e */
    public static final /* synthetic */ ActivityC0945e m126218e(View$OnClickListenerC71465f fVar) {
        ActivityC0945e eVar = fVar.f160130e;
        if (eVar == null) {
            C89219l.m154710a("activity");
        }
        return eVar;
    }

    /* renamed from: f */
    public static final /* synthetic */ VideoPublishEditModel m126219f(View$OnClickListenerC71465f fVar) {
        VideoPublishEditModel videoPublishEditModel = fVar.f160137l;
        if (videoPublishEditModel == null) {
            C89219l.m154710a("model");
        }
        return videoPublishEditModel;
    }

    /* renamed from: g */
    public static final /* synthetic */ CutMultiVideoViewModel m126220g(View$OnClickListenerC71465f fVar) {
        CutMultiVideoViewModel cutMultiVideoViewModel = fVar.f160126a;
        if (cutMultiVideoViewModel == null) {
            C89219l.m154710a("cutMultiVideoViewModel");
        }
        return cutMultiVideoViewModel;
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.multiedit.d.f$n */
    static final class C71479n implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ View$OnClickListenerC71465f f160163a;

        /* renamed from: b */
        final /* synthetic */ int f160164b;

        /* renamed from: c */
        final /* synthetic */ C89233z.C89235b f160165c;

        /* renamed from: d */
        final /* synthetic */ float f160166d;

        /* renamed from: e */
        final /* synthetic */ int f160167e = 0;

        /* renamed from: f */
        final /* synthetic */ int f160168f = 0;

        /* renamed from: g */
        final /* synthetic */ View f160169g;

        static {
            Covode.recordClassIndex(84013);
        }

        C71479n(View$OnClickListenerC71465f fVar, int i, C89233z.C89235b bVar, float f, View view) {
            this.f160163a = fVar;
            this.f160164b = i;
            this.f160165c = bVar;
            this.f160166d = f;
            this.f160169g = view;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            C89219l.m154716b(valueAnimator, "");
            float animatedFraction = valueAnimator.getAnimatedFraction();
            C71442d dVar = this.f160163a.f160132g;
            float f = ((float) this.f160164b) + (90.0f * animatedFraction);
            float f2 = this.f160165c.element + (this.f160166d * animatedFraction);
            float f3 = this.f160165c.element + (this.f160166d * animatedFraction);
            int i = this.f160167e;
            int i2 = this.f160168f;
            AbstractC31071f fVar = dVar.f160074a;
            if (fVar != null) {
                fVar.mo56302a(f3, f2, f, i, i2);
            }
        }
    }

    /* renamed from: a */
    private static String m126213a(String str) {
        String str2 = File.separator;
        C89219l.m154716b(str2, "");
        if (C89361p.m154876c(str, str2, false)) {
            return str;
        }
        return str + File.separator;
    }

    /* renamed from: b */
    public final void mo113090b(boolean z) {
        if (z) {
            this.f160132g.mo113069b();
            return;
        }
        if (this.f160131f != null) {
            AbstractC71496a aVar = this.f160131f;
            if (aVar == null) {
                C89219l.m154710a("viewManager");
            }
            if (!aVar.mo113206b()) {
                this.f160132g.mo113060a();
                return;
            }
        }
        if (this.f160145t.f160068f) {
            View view = this.f160149y;
            if (view == null) {
                C89219l.m154710a("rootView");
            }
            view.postDelayed(new RunnableC71478m(this), 100);
        }
    }

    /* renamed from: a */
    private static boolean m126214a(VideoSegment videoSegment) {
        try {
            if (C73950ak.m130042a(Math.min(videoSegment.f156714f, videoSegment.f156715g), Math.max(videoSegment.f156714f, videoSegment.f156715g), (int) (((float) videoSegment.mo110570a()) * EnumC78601i.FAST.value())).getFirst().intValue() == 0) {
                return true;
            }
            return false;
        } catch (Exception e) {
            C73991bj.m130131b(e.getMessage());
            return false;
        }
    }

    /* renamed from: a */
    public final void mo113084a(int i) {
        this.f160135j = i;
        if (i >= 0) {
            CutMultiVideoViewModel cutMultiVideoViewModel = this.f160126a;
            if (cutMultiVideoViewModel == null) {
                C89219l.m154710a("cutMultiVideoViewModel");
            }
            int i2 = this.f160135j;
            cutMultiVideoViewModel.mo110473a(i2, i2);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo113092c(boolean z) {
        MultiEditVideoRecordData multiEditVideoRecordData;
        MultiEditVideoRecordData multiEditVideoRecordData2 = this.f160138m;
        if (multiEditVideoRecordData2 == null) {
            C89219l.m154710a("curRecordData");
        }
        boolean z2 = multiEditVideoRecordData2.hasRetake;
        if (!z || (multiEditVideoRecordData = this.f160112B) == null) {
            MultiEditVideoRecordData multiEditVideoRecordData3 = this.f160139n;
            if (multiEditVideoRecordData3 == null) {
                C89219l.m154710a("restoreRecordData");
            }
            MultiEditVideoRecordData multiEditVideoRecordData4 = this.f160138m;
            if (multiEditVideoRecordData4 == null) {
                C89219l.m154710a("curRecordData");
            }
            this.f160138m = C71429d.m126153a(multiEditVideoRecordData3, multiEditVideoRecordData4);
        } else {
            MultiEditVideoRecordData multiEditVideoRecordData5 = this.f160138m;
            if (multiEditVideoRecordData5 == null) {
                C89219l.m154710a("curRecordData");
            }
            this.f160138m = C71429d.m126153a(multiEditVideoRecordData, multiEditVideoRecordData5);
        }
        MultiEditVideoRecordData multiEditVideoRecordData6 = this.f160138m;
        if (multiEditVideoRecordData6 == null) {
            C89219l.m154710a("curRecordData");
        }
        multiEditVideoRecordData6.hasRetake = z2;
        if (!z || C84904k.m145909a(this.f160118H)) {
            ArrayList<TimeSpeedModelExtension> arrayList = this.f160116F;
            this.f160141p = (ArrayList) (arrayList != null ? C89070n.m154585g((Collection) arrayList) : null);
        } else {
            ArrayList<TimeSpeedModelExtension> arrayList2 = this.f160118H;
            this.f160141p = (ArrayList) (arrayList2 != null ? C89070n.m154585g((Collection) arrayList2) : null);
        }
        MultiEditVideoRecordData multiEditVideoRecordData7 = this.f160138m;
        if (multiEditVideoRecordData7 == null) {
            C89219l.m154710a("curRecordData");
        }
        MultiEditVideoRecordData a = C71429d.m126153a(multiEditVideoRecordData7, (MultiEditVideoRecordData) null);
        this.f160140o = a;
        if (a == null) {
            C89219l.m154710a("originRecordData");
        }
        a.resetTimeData();
        C71441c cVar = this.f160145t;
        MultiEditVideoRecordData multiEditVideoRecordData8 = this.f160138m;
        if (multiEditVideoRecordData8 == null) {
            C89219l.m154710a("curRecordData");
        }
        cVar.mo113058a(multiEditVideoRecordData8);
        m126225m();
        AbstractC71496a aVar = this.f160131f;
        if (aVar == null) {
            C89219l.m154710a("viewManager");
        }
        VideoEditViewModel videoEditViewModel = this.f160127b;
        if (videoEditViewModel == null) {
            C89219l.m154710a("videoEditViewModel");
        }
        aVar.mo113199a(videoEditViewModel.mo111232k());
        VideoEditViewModel videoEditViewModel2 = this.f160127b;
        if (videoEditViewModel2 == null) {
            C89219l.m154710a("videoEditViewModel");
        }
        videoEditViewModel2.mo111214a(this.f160150z);
        MultiEditVideoRecordData multiEditVideoRecordData9 = this.f160139n;
        if (multiEditVideoRecordData9 == null) {
            C89219l.m154710a("restoreRecordData");
        }
        Float valueOf = Float.valueOf(multiEditVideoRecordData9.leftSlideX);
        MultiEditVideoRecordData multiEditVideoRecordData10 = this.f160139n;
        if (multiEditVideoRecordData10 == null) {
            C89219l.m154710a("restoreRecordData");
        }
        C0692e<Float, Float> eVar = new C0692e<>(valueOf, Float.valueOf(multiEditVideoRecordData10.rightSlideX));
        AbstractC71496a aVar2 = this.f160131f;
        if (aVar2 == null) {
            C89219l.m154710a("viewManager");
        }
        aVar2.mo113192a(eVar);
        AbstractC71496a aVar3 = this.f160131f;
        if (aVar3 == null) {
            C89219l.m154710a("viewManager");
        }
        aVar3.mo113207c();
        int i = 0;
        for (T t : this.f160136k) {
            int i2 = i + 1;
            if (i < 0) {
                C89070n.m154520a();
            }
            T t2 = t;
            VideoEditViewModel videoEditViewModel3 = this.f160127b;
            if (videoEditViewModel3 == null) {
                C89219l.m154710a("videoEditViewModel");
            }
            VideoSegment videoSegment = videoEditViewModel3.mo111232k().get(i);
            C89219l.m154716b(videoSegment, "");
            videoSegment.mo110573a(t2.mo110578d());
            VideoEditViewModel videoEditViewModel4 = this.f160127b;
            if (videoEditViewModel4 == null) {
                C89219l.m154710a("videoEditViewModel");
            }
            VideoSegment videoSegment2 = videoEditViewModel4.mo111232k().get(i);
            C89219l.m154716b(videoSegment2, "");
            videoSegment2.mo110576b(t2.mo110580e());
            i = i2;
        }
    }

    /* renamed from: a */
    public final void mo113087a(VideoPublishEditModel videoPublishEditModel) {
        C89219l.m154721d(videoPublishEditModel, "");
        if (!this.f160111A) {
            this.f160137l = videoPublishEditModel;
            MultiEditVideoStatusRecordData multiEditVideoStatusRecordData = videoPublishEditModel.multiEditVideoRecordData;
            if (multiEditVideoStatusRecordData != null && multiEditVideoStatusRecordData.curMultiEditVideoRecordData != null && !C84904k.m145909a(multiEditVideoStatusRecordData.curMultiEditVideoRecordData.segmentDataList)) {
                if (multiEditVideoStatusRecordData.originalSegments != null) {
                    this.f160115E = multiEditVideoStatusRecordData.originalSegments;
                    ArrayList<TimeSpeedModelExtension> arrayList = multiEditVideoStatusRecordData.restoreSegments;
                    if (arrayList == null) {
                        ArrayList<TimeSpeedModelExtension> arrayList2 = this.f160115E;
                        if (arrayList2 == null) {
                            C89219l.m154715b();
                        }
                        arrayList = new ArrayList<>(arrayList2);
                    }
                    this.f160116F = arrayList;
                    ArrayList<TimeSpeedModelExtension> arrayList3 = multiEditVideoStatusRecordData.editSegments;
                    if (arrayList3 == null) {
                        ArrayList<TimeSpeedModelExtension> arrayList4 = this.f160116F;
                        if (arrayList4 == null) {
                            C89219l.m154715b();
                        }
                        arrayList3 = new ArrayList<>(arrayList4);
                    }
                    this.f160141p = arrayList3;
                    ArrayList<TimeSpeedModelExtension> arrayList5 = multiEditVideoStatusRecordData.editCutSegments;
                    if (arrayList5 == null) {
                        ArrayList<TimeSpeedModelExtension> arrayList6 = this.f160116F;
                        if (arrayList6 == null) {
                            C89219l.m154715b();
                        }
                        arrayList5 = new ArrayList<>(arrayList6);
                    }
                    this.f160117G = arrayList5;
                    ArrayList<TimeSpeedModelExtension> arrayList7 = multiEditVideoStatusRecordData.singleRestoreSegments;
                    if (arrayList7 == null) {
                        ArrayList<TimeSpeedModelExtension> arrayList8 = this.f160116F;
                        if (arrayList8 == null) {
                            C89219l.m154715b();
                        }
                        arrayList7 = new ArrayList<>(arrayList8);
                    }
                    this.f160118H = arrayList7;
                    if (multiEditVideoStatusRecordData.segmentSizeChange) {
                        this.f160118H = this.f160141p;
                    }
                }
                MultiEditVideoRecordData multiEditVideoRecordData = multiEditVideoStatusRecordData.curMultiEditVideoRecordData;
                C89219l.m154716b(multiEditVideoRecordData, "");
                this.f160138m = multiEditVideoRecordData;
                this.f160113C = multiEditVideoStatusRecordData.recordMusic;
                this.f160114D = multiEditVideoStatusRecordData.originalMusicStart;
                if (multiEditVideoStatusRecordData.restoreMultiEditVideoRecordData == null) {
                    this.f160139n = C71429d.m126153a(multiEditVideoStatusRecordData.curMultiEditVideoRecordData, (MultiEditVideoRecordData) null);
                } else {
                    MultiEditVideoRecordData multiEditVideoRecordData2 = multiEditVideoStatusRecordData.restoreMultiEditVideoRecordData;
                    C89219l.m154716b(multiEditVideoRecordData2, "");
                    this.f160139n = multiEditVideoRecordData2;
                }
                if (multiEditVideoStatusRecordData.singleRestoreMultiEditRecordData == null) {
                    this.f160112B = C71429d.m126153a(multiEditVideoStatusRecordData.curMultiEditVideoRecordData, (MultiEditVideoRecordData) null);
                } else {
                    this.f160112B = multiEditVideoStatusRecordData.singleRestoreMultiEditRecordData;
                }
                MultiEditVideoRecordData multiEditVideoRecordData3 = this.f160138m;
                if (multiEditVideoRecordData3 == null) {
                    C89219l.m154710a("curRecordData");
                }
                MultiEditVideoRecordData a = C71429d.m126153a(multiEditVideoRecordData3, (MultiEditVideoRecordData) null);
                this.f160140o = a;
                if (a == null) {
                    C89219l.m154710a("originRecordData");
                }
                a.resetTimeData();
                C71441c cVar = this.f160145t;
                MultiEditVideoRecordData multiEditVideoRecordData4 = this.f160138m;
                if (multiEditVideoRecordData4 == null) {
                    C89219l.m154710a("curRecordData");
                }
                cVar.mo113058a(multiEditVideoRecordData4);
                this.f160145t.f160069g = multiEditVideoStatusRecordData.isMultiEditRetake;
                this.f160145t.f160070h = multiEditVideoStatusRecordData.segmentSizeChange;
                this.f160145t.f160071i = multiEditVideoStatusRecordData.currentEditIndex;
                m126225m();
                m126221i();
                m126223k();
                m126224l();
                if (multiEditVideoStatusRecordData.currentEditIndex >= 0 && !multiEditVideoStatusRecordData.segmentSizeChange) {
                    C71484h hVar = this.f160133h;
                    if (this.f160130e == null) {
                        C89219l.m154710a("activity");
                    }
                    VideoEditViewModel videoEditViewModel = this.f160127b;
                    if (videoEditViewModel == null) {
                        C89219l.m154710a("videoEditViewModel");
                    }
                    hVar.mo113107a(videoEditViewModel.mo111232k().get(multiEditVideoStatusRecordData.currentEditIndex));
                    mo113084a(multiEditVideoStatusRecordData.currentEditIndex);
                }
                this.f160111A = true;
            }
        }
    }

    /* renamed from: a */
    public final void mo113088a(boolean z) {
        boolean z2;
        if (this.f160111A) {
            this.f160145t.f160067e = z;
            AbstractC71496a aVar = this.f160131f;
            if (aVar == null) {
                C89219l.m154710a("viewManager");
            }
            aVar.mo113205b(z);
            m126222j();
            if (z) {
                if (this.f160145t.f160068f) {
                    MultiEditVideoRecordData multiEditVideoRecordData = this.f160138m;
                    if (multiEditVideoRecordData == null) {
                        C89219l.m154710a("curRecordData");
                    }
                    this.f160120J = multiEditVideoRecordData.segmentDataList.get(this.f160135j).rotate;
                    CutVideoSpeedViewModel cutVideoSpeedViewModel = this.f160146v;
                    if (cutVideoSpeedViewModel == null) {
                        C89219l.m154710a("speedViewModel");
                    }
                    MultiEditVideoRecordData multiEditVideoRecordData2 = this.f160138m;
                    if (multiEditVideoRecordData2 == null) {
                        C89219l.m154710a("curRecordData");
                    }
                    MultiEditVideoSegmentRecordData multiEditVideoSegmentRecordData = multiEditVideoRecordData2.segmentDataList.get(this.f160135j);
                    C89219l.m154716b(multiEditVideoSegmentRecordData, "");
                    EnumC78601i a = C70082m.m123739a(multiEditVideoSegmentRecordData.getVideoSpeed());
                    C89219l.m154716b(a, "");
                    cutVideoSpeedViewModel.mo110750a(a);
                    CutVideoSpeedViewModel cutVideoSpeedViewModel2 = this.f160146v;
                    if (cutVideoSpeedViewModel2 == null) {
                        C89219l.m154710a("speedViewModel");
                    }
                    cutVideoSpeedViewModel2.mo110754b(this.f160129d);
                    View view = this.f160149y;
                    if (view == null) {
                        C89219l.m154710a("rootView");
                    }
                    view.postDelayed(new RunnableC71481p(this), 10);
                } else if (this.f160145t.f160069g) {
                    if (!this.f160145t.f160070h) {
                        this.f160143r = 2;
                        AbstractC71496a aVar2 = this.f160131f;
                        if (aVar2 == null) {
                            C89219l.m154710a("viewManager");
                        }
                        aVar2.mo113212g();
                    }
                    this.f160132g.mo113071c();
                } else {
                    C71442d dVar = this.f160132g;
                    MultiEditVideoRecordData multiEditVideoRecordData3 = this.f160138m;
                    if (multiEditVideoRecordData3 == null) {
                        C89219l.m154710a("curRecordData");
                    }
                    MultiEditVideoRecordData multiEditVideoRecordData4 = this.f160138m;
                    if (multiEditVideoRecordData4 == null) {
                        C89219l.m154710a("curRecordData");
                    }
                    dVar.mo113068a(multiEditVideoRecordData3, multiEditVideoRecordData4);
                }
                if (!this.f160145t.f160069g) {
                    MultiEditVideoRecordData multiEditVideoRecordData5 = this.f160138m;
                    if (multiEditVideoRecordData5 == null) {
                        C89219l.m154710a("curRecordData");
                    }
                    MultiEditVideoRecordData multiEditVideoRecordData6 = this.f160139n;
                    if (multiEditVideoRecordData6 == null) {
                        C89219l.m154710a("restoreRecordData");
                    }
                    C71429d.m126153a(multiEditVideoRecordData5, multiEditVideoRecordData6);
                }
                AbstractC84919c cVar = this.f160122L;
                if (cVar != null) {
                    cVar.mo87533b(this.f160123M);
                }
                this.f160132g.f160075b = this.f160124N;
                AbstractC71496a aVar3 = this.f160131f;
                if (aVar3 == null) {
                    C89219l.m154710a("viewManager");
                }
                aVar3.mo113200a(true);
                this.f160121K = false;
                VEVideoCutterViewModel vEVideoCutterViewModel = this.f160128c;
                if (vEVideoCutterViewModel == null) {
                    C89219l.m154710a("veVideoCutterViewModel");
                }
                vEVideoCutterViewModel.mo111336a(new C70576a(2, false));
                MultiEditViewModel multiEditViewModel = this.f160148x;
                if (multiEditViewModel == null) {
                    C89219l.m154710a("multiEditViewModel");
                }
                multiEditViewModel.mo127496b(true);
            } else {
                AbstractC84919c cVar2 = this.f160122L;
                if (cVar2 != null) {
                    cVar2.mo87535c(this.f160123M);
                }
                this.f160134i.mo113074a();
                MultiEditViewModel multiEditViewModel2 = this.f160148x;
                if (multiEditViewModel2 == null) {
                    C89219l.m154710a("multiEditViewModel");
                }
                multiEditViewModel2.mo127496b(false);
                CutVideoSpeedViewModel cutVideoSpeedViewModel3 = this.f160146v;
                if (cutVideoSpeedViewModel3 == null) {
                    C89219l.m154710a("speedViewModel");
                }
                cutVideoSpeedViewModel3.mo110754b(false);
            }
            this.f160134i.f160083g = z;
            if (!this.f160145t.f160069g || this.f160145t.f160070h) {
                z2 = false;
            } else {
                z2 = true;
            }
            this.f160119I = z2;
            C89233z.C89234a aVar4 = new C89233z.C89234a();
            aVar4.element = false;
            if (this.f160119I) {
                aVar4.element = true;
            }
            if (!this.f160145t.f160069g) {
                aVar4.element = true;
            }
            View view2 = this.f160149y;
            if (view2 == null) {
                C89219l.m154710a("rootView");
            }
            view2.postDelayed(new RunnableC71482q(this, aVar4), 100);
            if (this.f160145t.f160070h) {
                mo113097h();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:173:0x0342, code lost:
        if (r9 <= ((java.lang.Number) r0).longValue()) goto L_0x0344;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:174:0x0344, code lost:
        r19 = r19 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:194:0x03cd, code lost:
        if (r9 <= ((java.lang.Number) r0).longValue()) goto L_0x0344;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:205:0x0448, code lost:
        if (r5 <= ((java.lang.Number) r0).longValue()) goto L_0x044a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:206:0x044a, code lost:
        r13 = r13 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:221:0x04dd, code lost:
        if (r5 <= ((java.lang.Number) r0).longValue()) goto L_0x044a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:242:0x052a  */
    /* JADX WARNING: Removed duplicated region for block: B:251:0x0547  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r23) {
        /*
        // Method dump skipped, instructions count: 1624
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.shortvideo.edit.multiedit.p3829d.View$OnClickListenerC71465f.onClick(android.view.View):void");
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.multiedit.d.f$k */
    static final class C71476k implements AbstractC84917a {

        /* renamed from: a */
        final /* synthetic */ View$OnClickListenerC71465f f160160a;

        static {
            Covode.recordClassIndex(84010);
        }

        C71476k(View$OnClickListenerC71465f fVar) {
            this.f160160a = fVar;
        }

        @Override // com.p2082ss.android.ugc.tools.view.p4362a.AbstractC84917a
        public final boolean onKeyDown(int i, KeyEvent keyEvent) {
            if (i != 4 || !this.f160160a.f160145t.f160067e) {
                return false;
            }
            if (this.f160160a.f160143r == 1) {
                this.f160160a.mo113094e();
            } else {
                this.f160160a.mo113095f();
            }
            return true;
        }
    }

    /* renamed from: a */
    public final void mo113085a(ActivityC0945e eVar, View view) {
        C89219l.m154721d(eVar, "");
        C89219l.m154721d(view, "");
        this.f160130e = eVar;
        this.f160149y = view;
        AbstractC1174ac a = C1181ae.m3881a(eVar, (C1175ad.AbstractC1177b) null).mo3983a(VideoEditViewModel.class);
        C89219l.m154716b(a, "");
        this.f160127b = (VideoEditViewModel) a;
        AbstractC1174ac a2 = C1181ae.m3881a(eVar, (C1175ad.AbstractC1177b) null).mo3983a(CutMultiVideoViewModel.class);
        C89219l.m154716b(a2, "");
        this.f160126a = (CutMultiVideoViewModel) a2;
        AbstractC1174ac a3 = C1181ae.m3881a(eVar, (C1175ad.AbstractC1177b) null).mo3983a(VEVideoCutterViewModel.class);
        C89219l.m154716b(a3, "");
        this.f160128c = (VEVideoCutterViewModel) a3;
        JediViewModel a4 = C20531t.m38716a(eVar).mo33800a(CutVideoBottomBarViewModel.class);
        C89219l.m154716b(a4, "");
        this.f160147w = (CutVideoBottomBarViewModel) a4;
        JediViewModel a5 = C20531t.m38716a(eVar).mo33800a(CutVideoSpeedViewModel.class);
        C89219l.m154716b(a5, "");
        this.f160146v = (CutVideoSpeedViewModel) a5;
        JediViewModel a6 = C20531t.m38716a(eVar).mo33800a(MultiEditViewModel.class);
        C89219l.m154716b(a6, "");
        this.f160148x = (MultiEditViewModel) a6;
        if (!(eVar instanceof AbstractC84919c)) {
            eVar = null;
        }
        this.f160122L = (AbstractC84919c) eVar;
    }
}
