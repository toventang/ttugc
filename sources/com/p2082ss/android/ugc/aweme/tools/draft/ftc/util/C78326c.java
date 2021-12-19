package com.p2082ss.android.ugc.aweme.tools.draft.ftc.util;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.view.SurfaceView;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.asve.editor.AbstractC31071f;
import com.p2082ss.android.ugc.aweme.p2440ce.C35444b;
import com.p2082ss.android.ugc.aweme.p2730de.ExecutorC40975j;
import com.p2082ss.android.ugc.aweme.property.C65367bg;
import com.p2082ss.android.ugc.aweme.shortvideo.C71817eu;
import com.p2082ss.android.ugc.aweme.shortvideo.SynthetiseResult;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p2082ss.android.ugc.aweme.tools.draft.ftc.services.IVEEncodingSetting;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i.C79459a;
import com.p2082ss.android.ugc.aweme.utils.permission.C80620e;
import com.p2082ss.android.ugc.aweme.video.C80720e;
import com.p2082ss.android.ugc.trill.R;
import com.p2082ss.android.vesdk.VEListener;
import dmt.p4542av.services.VEEncodingImpl;
import dmt.p4542av.video.C88303z;
import java.io.File;
import java.io.FileInputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import org.json.JSONObject;
import p078c.p080b.C1757e;
import p4600h.C89387v;
import p4600h.C89391z;
import p4600h.p4601a.C89041ag;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.tools.draft.ftc.util.c */
public final class C78326c {

    /* renamed from: c */
    public static boolean f175914c;

    /* renamed from: d */
    public static boolean f175915d;

    /* renamed from: e */
    public static final C78327a f175916e = new C78327a((byte) 0);

    /* renamed from: a */
    public boolean f175917a;

    /* renamed from: b */
    public C78332d f175918b = new C78332d();

    static {
        Covode.recordClassIndex(91445);
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.draft.ftc.util.c$a */
    public static final class C78327a {
        static {
            Covode.recordClassIndex(91446);
        }

        private C78327a() {
        }

        public /* synthetic */ C78327a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.draft.ftc.util.c$c */
    public static final class C78329c implements VEListener.AbstractC85248q {

        /* renamed from: a */
        final /* synthetic */ C78326c f175921a;

        /* renamed from: b */
        final /* synthetic */ Activity f175922b;

        /* renamed from: c */
        final /* synthetic */ VideoPublishEditModel f175923c;

        static {
            Covode.recordClassIndex(91448);
        }

        /* renamed from: com.ss.android.ugc.aweme.tools.draft.ftc.util.c$c$a */
        static final class C78330a extends AbstractC89220m implements AbstractC89171a<C89391z> {

            /* renamed from: a */
            final /* synthetic */ C78329c f175924a;

            static {
                Covode.recordClassIndex(91449);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C78330a(C78329c cVar) {
                super(0);
                this.f175924a = cVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // p4600h.p4611f.p4612a.AbstractC89171a
            public final /* synthetic */ C89391z invoke() {
                ExecutorC40975j jVar = ExecutorC40975j.f95810a;
                jVar.f95811b.postDelayed(new Runnable(this) {
                    /* class com.p2082ss.android.ugc.aweme.tools.draft.ftc.util.C78326c.C78329c.C78330a.RunnableC783311 */

                    /* renamed from: a */
                    final /* synthetic */ C78330a f175925a;

                    static {
                        Covode.recordClassIndex(91450);
                    }

                    {
                        this.f175925a = r1;
                    }

                    public final void run() {
                        MethodCollector.m26663i(9953);
                        C78326c cVar = this.f175925a.f175924a.f175921a;
                        Activity activity = this.f175925a.f175924a.f175922b;
                        VideoPublishEditModel videoPublishEditModel = this.f175925a.f175924a.f175923c;
                        String outputFile = videoPublishEditModel.getOutputFile();
                        long length = new File(outputFile).length();
                        try {
                            Uri b = C1757e.m5906b(activity, new SimpleDateFormat("yyyyMMdd_HHmmssSS", Locale.US).format(new Date()), "video/mp4");
                            if (b != null) {
                                cVar.mo122200a(activity, videoPublishEditModel, new FileInputStream(outputFile), activity.getContentResolver().openOutputStream(b, "w"), length);
                                MethodCollector.m26664o(9953);
                                return;
                            }
                        } catch (Exception unused) {
                            C78332d.m136802b(videoPublishEditModel);
                        }
                        MethodCollector.m26664o(9953);
                    }
                }, 50);
                return C89391z.f203057a;
            }
        }

        @Override // com.p2082ss.android.vesdk.VEListener.AbstractC85248q
        public final void onCompileDone() {
            Activity activity = this.f175922b;
            C78330a aVar = new C78330a(this);
            if (C80620e.m139781c(activity) == 0) {
                aVar.invoke();
            } else {
                C35444b.m72473a(activity, new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, new C78328b(aVar, activity));
            }
        }

        @Override // com.p2082ss.android.vesdk.VEListener.AbstractC85248q
        public final void onCompileProgress(float f) {
            if (!this.f175921a.f175917a) {
                this.f175921a.f175918b.mo122202a(this.f175922b, this.f175923c, f * 80.0f);
            }
        }

        C78329c(C78326c cVar, Activity activity, VideoPublishEditModel videoPublishEditModel) {
            this.f175921a = cVar;
            this.f175922b = activity;
            this.f175923c = videoPublishEditModel;
        }

        @Override // com.p2082ss.android.vesdk.VEListener.AbstractC85248q
        public final void onCompileError(int i, int i2, float f, String str) {
            C78332d.m136802b(this.f175923c);
        }
    }

    /* renamed from: a */
    private static boolean m136795a(Context context) {
        if (f175914c) {
            new C79459a(context).mo123052a(context.getString(R.string.cs2)).mo123053a();
            return false;
        } else if (!m136796b(context)) {
            return false;
        } else {
            return true;
        }
    }

    /* renamed from: b */
    private static boolean m136796b(Context context) {
        if (!C80720e.m139939e()) {
            new C79459a(context).mo123050a(R.string.feu).mo123053a();
            return false;
        } else if (C80720e.m139940f() < 20971520) {
            return false;
        } else {
            return true;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.draft.ftc.util.c$b */
    static final class C78328b implements C35444b.AbstractC35447b {

        /* renamed from: a */
        final /* synthetic */ AbstractC89171a f175919a;

        /* renamed from: b */
        final /* synthetic */ Activity f175920b;

        static {
            Covode.recordClassIndex(91447);
        }

        C78328b(AbstractC89171a aVar, Activity activity) {
            this.f175919a = aVar;
            this.f175920b = activity;
        }

        @Override // com.p2082ss.android.ugc.aweme.p2440ce.C35444b.AbstractC35447b
        /* renamed from: a */
        public final void mo53515a(String[] strArr, int[] iArr) {
            if (iArr != null && iArr.length != 0) {
                if (iArr[0] == 0) {
                    AbstractC89171a aVar = this.f175919a;
                    if (aVar != null) {
                        aVar.invoke();
                        return;
                    }
                    return;
                }
                new C79459a(this.f175920b).mo123052a(this.f175920b.getString(R.string.dgh)).mo123053a();
            }
        }
    }

    /* renamed from: a */
    public final void mo122199a(Activity activity, VideoPublishEditModel videoPublishEditModel, AbstractC1204m mVar, SurfaceView surfaceView) {
        C89219l.m154721d(mVar, "");
        C89219l.m154721d(surfaceView, "");
        if (activity != null && videoPublishEditModel != null && m136795a(activity)) {
            C88303z zVar = new C88303z(videoPublishEditModel.videoEditorType);
            C78341g.m136805a(activity, mVar, surfaceView, zVar, videoPublishEditModel);
            SynthetiseResult synthetiseResult = new SynthetiseResult();
            synthetiseResult.draftHardEncode = videoPublishEditModel.mHardEncode;
            synthetiseResult.outputFile = videoPublishEditModel.getOutputFile().toString();
            synthetiseResult.needRecode = false;
            synthetiseResult.flags |= 1;
            synthetiseResult.isEnableFpsSet = C65367bg.m117063a();
            synthetiseResult.editPreviewInfo = videoPublishEditModel.getPreviewInfo();
            synthetiseResult.videoWidth = videoPublishEditModel.videoWidth();
            synthetiseResult.videoHeight = videoPublishEditModel.videoHeight();
            synthetiseResult.texts = videoPublishEditModel.texts;
            synthetiseResult.isFastImport = videoPublishEditModel.isFastImport;
            synthetiseResult.isFastImportForLog = C71817eu.m126805p(videoPublishEditModel);
            synthetiseResult.segmentCount = videoPublishEditModel.segmentCounts();
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("com.bytedance.info", new JSONObject(C89041ag.m154412a(C89387v.m154943a("is_km_video", 1))));
            } catch (Exception e) {
                e.printStackTrace();
            }
            AbstractC31071f fVar = zVar.f200423w;
            String jSONObject2 = jSONObject.toString();
            C89219l.m154716b(jSONObject2, "");
            fVar.mo56288a("com.android.information", jSONObject2);
            C78332d.m136800a(videoPublishEditModel);
            AbstractC31071f fVar2 = zVar.f200423w;
            String outputFile = videoPublishEditModel.getOutputFile();
            IVEEncodingSetting a = VEEncodingImpl.m153216a();
            AbstractC31071f fVar3 = zVar.f200423w;
            C89219l.m154716b(fVar3, "");
            fVar2.mo56316a(outputFile, (String) null, a.mo122198a(videoPublishEditModel, synthetiseResult, fVar3, ""), new C78329c(this, activity, videoPublishEditModel));
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:16|17) */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        com.p2082ss.android.ugc.aweme.tools.draft.ftc.util.C78332d.m136802b(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0080, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0081, code lost:
        p078c.p083d.C1763b.m5922a(r11);
        p078c.p083d.C1763b.m5923a(r12);
        com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(8364);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x008a, code lost:
        throw r0;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x0073 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo122200a(android.app.Activity r9, com.p2082ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r10, java.io.InputStream r11, java.io.OutputStream r12, long r13) {
        /*
        // Method dump skipped, instructions count: 139
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.tools.draft.ftc.util.C78326c.mo122200a(android.app.Activity, com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel, java.io.InputStream, java.io.OutputStream, long):void");
    }
}
