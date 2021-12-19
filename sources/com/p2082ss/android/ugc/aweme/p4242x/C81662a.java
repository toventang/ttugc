package com.p2082ss.android.ugc.aweme.p4242x;

import android.app.Activity;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.os.Looper;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.tux.dialog.C23023b;
import com.bytedance.tux.dialog.p1713b.C23024a;
import com.bytedance.tux.dialog.p1713b.C23025b;
import com.bytedance.tux.dialog.p1713b.C23028c;
import com.bytedance.tux.dialog.p1716e.C23053d;
import com.bytedance.tux.p1721g.C23144b;
import com.p2082ss.android.ugc.asve.p2217f.C31098f;
import com.p2082ss.android.ugc.aweme.base.utils.C34722h;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.draft.C43211i;
import com.p2082ss.android.ugc.aweme.draft.C43213k;
import com.p2082ss.android.ugc.aweme.draft.model.C43223c;
import com.p2082ss.android.ugc.aweme.draft.model.DraftSaveResult;
import com.p2082ss.android.ugc.aweme.draft.model.DuetExtraInfo;
import com.p2082ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p2082ss.android.ugc.aweme.p2758dh.C41481a;
import com.p2082ss.android.ugc.aweme.p4242x.C81675b;
import com.p2082ss.android.ugc.aweme.port.internal.AbstractC63274b;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63238c;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63253l;
import com.p2082ss.android.ugc.aweme.services.draft.IDraftService;
import com.p2082ss.android.ugc.aweme.services.external.p3712ui.RecordConfig;
import com.p2082ss.android.ugc.aweme.setting.C68039bx;
import com.p2082ss.android.ugc.aweme.shortvideo.C70638dj;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.C70974bn;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.multiedit.p3827b.C71429d;
import com.p2082ss.android.ugc.aweme.shortvideo.p3789ab.AbstractC69783m;
import com.p2082ss.android.ugc.aweme.shortvideo.p3789ab.C69787n;
import com.p2082ss.android.ugc.aweme.shortvideo.p3833f.C71833a;
import com.p2082ss.android.ugc.aweme.tools.C77807b;
import com.p2082ss.android.ugc.aweme.tools.draft.C78133ai;
import com.p2082ss.android.ugc.aweme.tools.draft.p4112j.C78397c;
import com.p2082ss.android.ugc.aweme.widgetcompat.ProgressDialogC81636a;
import com.p2082ss.android.ugc.tools.p4344f.C84425b;
import com.p2082ss.android.ugc.trill.R;
import com.p2082ss.android.vesdk.AbstractC85304ab;
import com.p2082ss.android.vesdk.VERecordData;
import com.p2082ss.android.vesdk.VEUtils;
import com.p2082ss.android.vesdk.runtime.AbstractC85556e;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.util.UUID;
import p4560f.p4561a.AbstractC88403ab;
import p4560f.p4561a.AbstractC88407af;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4615g.C89241a;

/* renamed from: com.ss.android.ugc.aweme.x.a */
public final class C81662a implements AbstractC63274b {

    /* renamed from: g */
    public static final C81663a f182597g = new C81663a((byte) 0);

    /* renamed from: a */
    boolean f182598a;

    /* renamed from: b */
    boolean f182599b;

    /* renamed from: c */
    boolean f182600c;

    /* renamed from: d */
    boolean f182601d;

    /* renamed from: e */
    public ProgressDialogC81636a f182602e;

    /* renamed from: f */
    public boolean f182603f;

    /* renamed from: h */
    private boolean f182604h;

    /* renamed from: i */
    private WeakReference<Activity> f182605i;

    /* renamed from: j */
    private final int f182606j = -1;

    /* renamed from: k */
    private C43223c f182607k;

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.x.a$e */
    public static final class RunnableC81667e implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C81662a f182614a;

        /* renamed from: b */
        final /* synthetic */ VideoPublishEditModel f182615b;

        /* renamed from: c */
        final /* synthetic */ C43223c f182616c;

        /* renamed from: d */
        final /* synthetic */ int f182617d = 4;

        /* renamed from: e */
        final /* synthetic */ boolean f182618e = true;

        /* renamed from: f */
        final /* synthetic */ Activity f182619f;

        static {
            Covode.recordClassIndex(95071);
        }

        RunnableC81667e(C81662a aVar, VideoPublishEditModel videoPublishEditModel, C43223c cVar, Activity activity) {
            this.f182614a = aVar;
            this.f182615b = videoPublishEditModel;
            this.f182616c = cVar;
            this.f182619f = activity;
        }

        /* renamed from: com.ss.android.ugc.aweme.x.a$e$a */
        public static final class C81670a extends AbstractC85556e {
            static {
                Covode.recordClassIndex(95074);
            }

            @Override // com.p2082ss.android.vesdk.runtime.AbstractC85556e
            /* renamed from: a */
            public final String mo56847a() {
                return C70638dj.f158102e;
            }

            C81670a(String str) {
                super(str);
            }
        }

        public final void run() {
            VideoPublishEditModel videoPublishEditModel = this.f182615b;
            C89219l.m154716b(videoPublishEditModel, "");
            if (videoPublishEditModel.isMultiVideoEdit() && TextUtils.isEmpty(this.f182615b.multiEditVideoRecordData.coverImagePath) && C68039bx.f152403d) {
                this.f182615b.multiEditVideoRecordData.coverImagePath = C71429d.m126154a();
                VERecordData a = VERecordData.m146578a((AbstractC85556e) new C81670a(""), false);
                C89219l.m154716b(a, "");
                VEUtils.getVideoFrames(a.f190794b.get(0).f190798a, new int[]{0}, new AbstractC85304ab(this) {
                    /* class com.p2082ss.android.ugc.aweme.p4242x.C81662a.RunnableC81667e.C816681 */

                    /* renamed from: a */
                    final /* synthetic */ RunnableC81667e f182620a;

                    static {
                        Covode.recordClassIndex(95072);
                    }

                    {
                        this.f182620a = r1;
                    }

                    @Override // com.p2082ss.android.vesdk.AbstractC85304ab
                    public final boolean processFrame(ByteBuffer byteBuffer, int i, int i2, int i3) {
                        MethodCollector.m26663i(6510);
                        Bitmap createBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
                        createBitmap.copyPixelsFromBuffer(ByteBuffer.wrap(byteBuffer.array()));
                        String str = this.f182620a.f182615b.multiEditVideoRecordData.coverImagePath;
                        C89219l.m154716b(str, "");
                        C71429d.m126155a(createBitmap, str);
                        MethodCollector.m26664o(6510);
                        return false;
                    }
                });
            }
            C43223c cVar = this.f182616c;
            int i = this.f182617d;
            VideoPublishEditModel videoPublishEditModel2 = this.f182615b;
            C89219l.m154716b(videoPublishEditModel2, "");
            C69787n.m123312a(new AbstractC69783m.C69786c(cVar, i, videoPublishEditModel2, new IDraftService.DraftSaveListener(this) {
                /* class com.p2082ss.android.ugc.aweme.p4242x.C81662a.RunnableC81667e.C816692 */

                /* renamed from: a */
                final /* synthetic */ RunnableC81667e f182621a;

                static {
                    Covode.recordClassIndex(95073);
                }

                @Override // com.p2082ss.android.ugc.aweme.services.draft.IDraftService.DraftSaveListener
                public final void onDraftSaveSuccess() {
                    if (this.f182621a.f182618e) {
                        this.f182621a.f182614a.mo125329b(this.f182621a.f182619f);
                    }
                    if (this.f182621a.f182618e) {
                        new C23144b(this.f182621a.f182619f).mo37635a(C34722h.m70923b(R.string.fdg)).mo37637b();
                        C39162r.m79460a("save_draft_box_show", new C84425b().mo129406a("enter_from", "homepage_hot").f188764a);
                    }
                    C78397c.m136927a().notifyDraftUpdate(this.f182621a.f182616c);
                    C63238c.f143565C.mo73275c().mo101844a(this.f182621a.f182616c, false);
                    this.f182621a.f182614a.f182603f = false;
                }

                /* JADX WARN: Incorrect args count in method signature: ()V */
                {
                    this.f182621a = r1;
                }

                @Override // com.p2082ss.android.ugc.aweme.services.draft.IDraftService.DraftSaveListener
                public final void onDraftSaveFailed(DraftSaveResult draftSaveResult) {
                    C89219l.m154721d(draftSaveResult, "");
                    if (this.f182621a.f182618e) {
                        this.f182621a.f182614a.mo125329b(this.f182621a.f182619f);
                    }
                    Activity activity = this.f182621a.f182619f;
                    boolean a = C43211i.m86178a(draftSaveResult);
                    if (this.f182621a.f182618e) {
                        if (a) {
                            new C23144b(activity).mo37635a(C34722h.m70923b(R.string.bce)).mo37637b();
                        } else {
                            new C23144b(activity).mo37635a(C34722h.m70923b(R.string.bcf)).mo37637b();
                        }
                    }
                    this.f182621a.f182614a.f182603f = false;
                }
            }));
        }
    }

    static {
        Covode.recordClassIndex(95066);
    }

    @Override // com.p2082ss.android.ugc.aweme.port.internal.AbstractC63274b
    /* renamed from: e */
    public final void mo101836e() {
        this.f182598a = false;
    }

    @Override // com.p2082ss.android.ugc.aweme.port.internal.AbstractC63274b
    /* renamed from: i */
    public final void mo101840i() {
        this.f182601d = false;
    }

    /* renamed from: com.ss.android.ugc.aweme.x.a$a */
    public static final class C81663a {
        static {
            Covode.recordClassIndex(95067);
        }

        private C81663a() {
        }

        public /* synthetic */ C81663a(byte b) {
            this();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.port.internal.AbstractC63274b
    /* renamed from: d */
    public final boolean mo101835d() {
        return this.f182598a;
    }

    @Override // com.p2082ss.android.ugc.aweme.port.internal.AbstractC63274b
    /* renamed from: h */
    public final boolean mo101839h() {
        return this.f182601d;
    }

    @Override // com.p2082ss.android.ugc.aweme.port.internal.AbstractC63274b
    /* renamed from: a */
    public final void mo101829a() {
        C71833a.m126856d(3);
    }

    @Override // com.p2082ss.android.ugc.aweme.port.internal.AbstractC63274b
    /* renamed from: f */
    public final boolean mo101837f() {
        boolean z = this.f182599b;
        this.f182599b = false;
        return z;
    }

    @Override // com.p2082ss.android.ugc.aweme.port.internal.AbstractC63274b
    /* renamed from: g */
    public final boolean mo101838g() {
        boolean z = this.f182600c;
        this.f182600c = false;
        return z;
    }

    @Override // com.p2082ss.android.ugc.aweme.port.internal.AbstractC63274b
    /* renamed from: b */
    public final C43223c mo101833b() {
        C43223c cVar = this.f182607k;
        if (cVar != null) {
            return cVar;
        }
        C43223c e = C78133ai.m136600a().mo122076e("CHECK_POINT");
        if (e == null) {
            return null;
        }
        e.f100905e = e.mo73676f();
        this.f182607k = e;
        return e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.x.a$c */
    public static final class C81665c extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C81662a f182610a;

        /* renamed from: b */
        final /* synthetic */ Activity f182611b;

        static {
            Covode.recordClassIndex(95069);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C81665c(C81662a aVar, Activity activity) {
            super(0);
            this.f182610a = aVar;
            this.f182611b = activity;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            Activity activity;
            if (this.f182610a.f182602e != null) {
                ProgressDialogC81636a aVar = this.f182610a.f182602e;
                if (aVar == null) {
                    C89219l.m154715b();
                }
                if (aVar.isShowing() && (activity = this.f182611b) != null && !activity.isFinishing()) {
                    ProgressDialogC81636a aVar2 = this.f182610a.f182602e;
                    if (aVar2 == null) {
                        C89219l.m154715b();
                    }
                    aVar2.dismiss();
                    this.f182610a.f182602e = null;
                }
            }
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.x.a$g */
    public static final class C81674g extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C81662a f182627a;

        /* renamed from: b */
        final /* synthetic */ Activity f182628b;

        static {
            Covode.recordClassIndex(95078);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C81674g(C81662a aVar, Activity activity) {
            super(0);
            this.f182627a = aVar;
            this.f182628b = activity;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            Activity activity;
            if (this.f182627a.f182602e == null && (activity = this.f182628b) != null && !activity.isFinishing()) {
                Looper mainLooper = Looper.getMainLooper();
                C89219l.m154716b(mainLooper, "");
                if (C89219l.m154714a(mainLooper.getThread(), Thread.currentThread())) {
                    this.f182627a.f182602e = ProgressDialogC81636a.m141497a(this.f182628b, C34722h.m70923b(R.string.etx));
                }
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.x.a$d */
    static final class RunnableC81666d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ VideoPublishEditModel f182612a;

        /* renamed from: b */
        final /* synthetic */ int f182613b = 1;

        static {
            Covode.recordClassIndex(95070);
        }

        RunnableC81666d(VideoPublishEditModel videoPublishEditModel) {
            this.f182612a = videoPublishEditModel;
        }

        public final void run() {
            try {
                if (this.f182612a != null) {
                    new C70974bn("saveCheckPointForRestore");
                    C43223c b = C70974bn.m125291b(this.f182612a);
                    if (this.f182612a.isDuet()) {
                        C89219l.m154716b(b, "");
                        b.mo73623a(DuetExtraInfo.copy$default(this.f182612a.draftDuetExtraInfo, null, null, 0, 0, null, 0, 63, null));
                    }
                    C89219l.m154716b(b, "");
                    b.mo73732t(50);
                    b.f100905e = "CHECK_POINT";
                    if (b.f100906f == null) {
                        b.f100908h = null;
                    }
                    C78133ai.m136600a().mo122064a(b);
                }
                C71833a.m126856d(this.f182613b);
            } catch (Throwable unused) {
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.x.a$b */
    public static final class RunnableC81664b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C81662a f182608a;

        /* renamed from: b */
        final /* synthetic */ Activity f182609b;

        static {
            Covode.recordClassIndex(95068);
        }

        RunnableC81664b(C81662a aVar, Activity activity) {
            this.f182608a = aVar;
            this.f182609b = activity;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:8:0x0012, code lost:
            if (r1 != 3) goto L_0x0014;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void run() {
            /*
            // Method dump skipped, instructions count: 237
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.p4242x.C81662a.RunnableC81664b.run():void");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0015, code lost:
        if (r4 != 3) goto L_0x0017;
     */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x001d  */
    @Override // com.p2082ss.android.ugc.aweme.port.internal.AbstractC63274b
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo101834c() {
        /*
        // Method dump skipped, instructions count: 208
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.p4242x.C81662a.mo101834c():boolean");
    }

    /* renamed from: b */
    public final void mo125329b(Activity activity) {
        C31098f.m64301a(new C81665c(this, activity));
    }

    /* renamed from: com.ss.android.ugc.aweme.x.a$f */
    static final class C81671f extends AbstractC89220m implements AbstractC89172b<C23025b, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C81662a f182622a;

        /* renamed from: b */
        final /* synthetic */ String f182623b;

        /* renamed from: c */
        final /* synthetic */ Activity f182624c;

        static {
            Covode.recordClassIndex(95075);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C81671f(C81662a aVar, String str, Activity activity) {
            super(1);
            this.f182622a = aVar;
            this.f182623b = str;
            this.f182624c = activity;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C23025b bVar) {
            C23025b bVar2 = bVar;
            C89219l.m154721d(bVar2, "");
            bVar2.mo37416a(R.string.as0, new AbstractC89172b<C23024a, C89391z>(this) {
                /* class com.p2082ss.android.ugc.aweme.p4242x.C81662a.C81671f.C816721 */

                /* renamed from: a */
                final /* synthetic */ C81671f f182625a;

                static {
                    Covode.recordClassIndex(95076);
                }

                {
                    this.f182625a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX WARNING: Code restructure failed: missing block: B:6:0x0040, code lost:
                    if (r1 != 3) goto L_0x0042;
                 */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public final /* synthetic */ p4600h.C89391z invoke(com.bytedance.tux.dialog.p1713b.C23024a r8) {
                    /*
                    // Method dump skipped, instructions count: 139
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.p4242x.C81662a.C81671f.C816721.invoke(java.lang.Object):java.lang.Object");
                }
            });
            bVar2.mo37418b(R.string.a8y, new AbstractC89172b<C23024a, C89391z>(this) {
                /* class com.p2082ss.android.ugc.aweme.p4242x.C81662a.C81671f.C816732 */

                /* renamed from: a */
                final /* synthetic */ C81671f f182626a;

                static {
                    Covode.recordClassIndex(95077);
                }

                {
                    this.f182626a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ C89391z invoke(C23024a aVar) {
                    C89219l.m154721d(aVar, "");
                    C41481a.m83393a();
                    AVExternalServiceImpl.m113114a().abnormalExitLogService().logRestoreDialogClick(false);
                    this.f182626a.f182622a.mo101830a(this.f182626a.f182624c);
                    C63253l.f143623a.mo73311g().mo93789a(this.f182626a.f182624c);
                    return C89391z.f203057a;
                }
            });
            return C89391z.f203057a;
        }
    }

    /* renamed from: a */
    static RecordConfig m141532a(Long l) {
        RecordConfig.Builder creationId = new RecordConfig.Builder().shootWay("direct_shoot").restoreType(2).creationId(UUID.randomUUID().toString());
        if (l != null) {
            creationId.decompressTime(l.longValue());
        }
        return creationId.build();
    }

    @Override // com.p2082ss.android.ugc.aweme.port.internal.AbstractC63274b
    /* renamed from: a */
    public final void mo101830a(Activity activity) {
        Activity activity2;
        if (this.f182605i == null && activity != null) {
            this.f182605i = new WeakReference<>(activity);
        }
        WeakReference<Activity> weakReference = this.f182605i;
        if (weakReference != null && (activity2 = weakReference.get()) != null) {
            C89219l.m154716b(activity2, "");
            this.f182598a = false;
            C77807b.f174559a.execute(new RunnableC81664b(this, activity2));
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.port.internal.AbstractC63274b
    /* renamed from: a */
    public final void mo101831a(Activity activity, String str) {
        MethodCollector.m26663i(5755);
        C89219l.m154721d(activity, "");
        C89219l.m154721d(str, "");
        this.f182605i = new WeakReference<>(activity);
        View inflate = LayoutInflater.from(activity).inflate(R.layout.xj, (ViewGroup) null);
        inflate.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        WeakReference weakReference = new WeakReference(inflate.findViewById(R.id.dj7));
        C89219l.m154721d(weakReference, "");
        AbstractC88403ab.m153596a((AbstractC88407af) new C81675b.C81677b(weakReference)).mo142918b(C88925a.m154180b(C88946a.f201991c)).mo142925c(C81675b.C81678c.f182634a).mo142909a(C88391a.m153580a(C88392a.f200660a)).mo142915a(new C81675b.C81679d(weakReference), C81675b.C81680e.f182636a);
        C23023b bVar = new C23023b(activity);
        Resources system = Resources.getSystem();
        C89219l.m154709a((Object) system, "");
        ((C23023b) C23028c.m43435a((C23023b) C23053d.m43471a(bVar, inflate, C89241a.m154730a(TypedValue.applyDimension(1, 20.0f, system.getDisplayMetrics()))).mo37479a(R.string.f_0).mo37483b(R.string.f9z), new C81671f(this, str, activity)).mo37482a(false)).mo37405a().mo37396b().show();
        MethodCollector.m26664o(5755);
    }

    @Override // com.p2082ss.android.ugc.aweme.port.internal.AbstractC63274b
    /* renamed from: a */
    public final void mo101832a(VideoPublishEditModel videoPublishEditModel, String str) {
        C43213k.m86181a("saveCheckPoint creationId: ".concat(String.valueOf(str)));
        boolean z = true;
        boolean z2 = !C68039bx.f152401b;
        if (videoPublishEditModel == null || videoPublishEditModel.isDuet() || videoPublishEditModel.isMvThemeVideoType() || videoPublishEditModel.isStitchMode() || videoPublishEditModel.isUploadVideo()) {
            z = false;
        }
        if (z2 || z) {
            C71833a.m126856d(3);
        } else if (videoPublishEditModel == null || videoPublishEditModel.mDraftToEditFrom == this.f182606j) {
            C77807b.f174559a.execute(new RunnableC81666d(videoPublishEditModel));
        }
    }

    /* renamed from: a */
    public final void mo125328a(Activity activity, C43223c cVar, VideoPublishEditModel videoPublishEditModel) {
        if (!this.f182603f && cVar != null) {
            cVar.mo73732t(0);
            cVar.f100886I = System.currentTimeMillis();
            if (cVar.f100906f == null) {
                cVar.f100908h = null;
            }
            if (videoPublishEditModel == null) {
                new C70974bn("CheckPointServiceImpl");
                videoPublishEditModel = C70974bn.m125289a(cVar);
            }
            C89219l.m154716b(videoPublishEditModel, "");
            if (videoPublishEditModel.isMultiVideoEdit() && TextUtils.isEmpty(videoPublishEditModel.multiEditVideoRecordData.coverImagePath) && C81675b.f182629a != null) {
                videoPublishEditModel.multiEditVideoRecordData.coverImagePath = C81675b.f182629a;
            }
            C43213k.m86181a("[saveDraft]: creation id = " + cVar.mo73676f());
            this.f182603f = true;
            C31098f.m64301a(new C81674g(this, activity));
            C77807b.f174559a.execute(new RunnableC81667e(this, videoPublishEditModel, cVar, activity));
        }
    }
}
