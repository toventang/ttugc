package com.p2082ss.android.ugc.aweme.tools.beauty.p4090d;

import android.text.TextUtils;
import android.util.Log;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.beauty.ComposerBeauty;
import com.p2082ss.android.ugc.aweme.dependence.beauty.C41093a;
import com.p2082ss.android.ugc.aweme.dependence.p2736a.p2737a.p2738a.AbstractC41086b;
import com.p2082ss.android.ugc.aweme.dependence.p2736a.p2737a.p2739b.AbstractC41088b;
import com.p2082ss.android.ugc.aweme.dependence.p2736a.p2737a.p2739b.C41091e;
import com.p2082ss.android.ugc.aweme.tools.beauty.C77876c;
import com.p2082ss.android.ugc.aweme.tools.beauty.C77878d;
import com.p2082ss.android.ugc.aweme.tools.beauty.p4091e.p4092a.C77887a;
import com.p2082ss.android.ugc.aweme.tools.beauty.p4095g.C77908d;
import com.p2082ss.android.ugc.effectmanager.EffectManager;
import com.p2082ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.p2082ss.android.ugc.effectmanager.common.utils.FileUtils;
import com.p2082ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;
import com.p2082ss.android.ugc.tools.p4337b.p4338a.AbstractC84398d;
import com.p2082ss.android.ugc.tools.utils.C84915u;
import java.io.File;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.tools.beauty.d.a */
public final class C77879a extends AbstractC41088b<C77876c, Void> {

    /* renamed from: i */
    public static final C77880a f174737i = new C77880a((byte) 0);

    /* renamed from: j */
    private final AbstractC84398d f174738j;

    static {
        Covode.recordClassIndex(90966);
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.beauty.d.a$a */
    public static final class C77880a {
        static {
            Covode.recordClassIndex(90967);
        }

        private C77880a() {
        }

        public /* synthetic */ C77880a(byte b) {
            this();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.dependence.p2736a.p2737a.p2739b.AbstractC41088b
    /* renamed from: a */
    public final boolean mo70304a() {
        ComposerBeauty composerBeauty = this.f96050h.f174728a;
        if (C77878d.m135993a(composerBeauty.getEffect().getEffectId()) < 0) {
            return true;
        }
        return this.f174738j.mo78918c(composerBeauty.getEffect());
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.beauty.d.a$b */
    public static final class C77881b implements IFetchEffectListener {

        /* renamed from: a */
        final /* synthetic */ C77879a f174739a;

        /* renamed from: b */
        final /* synthetic */ AbstractC41086b f174740b;

        static {
            Covode.recordClassIndex(90968);
        }

        @Override // com.p2082ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
        public final void onStart(Effect effect) {
            this.f174740b.mo70283a(this.f174739a);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.p2082ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
        public final /* synthetic */ void onSuccess(Effect effect) {
            this.f174740b.mo70289b(this.f174739a);
        }

        C77881b(C77879a aVar, AbstractC41086b bVar) {
            this.f174739a = aVar;
            this.f174740b = bVar;
        }

        @Override // com.p2082ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
        public final void onFail(Effect effect, ExceptionResult exceptionResult) {
            C89219l.m154721d(exceptionResult, "");
            this.f174740b.mo70294c(this.f174739a);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.dependence.p2736a.p2737a.p2739b.AbstractC41088b
    /* renamed from: b */
    public final void mo70305b(AbstractC41086b<C77876c, Void> bVar) {
        C89219l.m154721d(bVar, "");
        EffectManager c = this.f174738j.mo78917c();
        if (c != null) {
            c.fetchEffect(this.f96050h.f174728a.getEffect(), new C77881b(this, bVar));
            return;
        }
        String str = "failed by null effectManager,effect: " + this.f96050h.f174728a.getEffect().getName();
        C41093a.m82764b(str);
        this.f96048f = new C41091e(-1, str, null);
        bVar.mo70294c(this);
    }

    @Override // com.p2082ss.android.ugc.aweme.dependence.p2736a.p2737a.p2739b.AbstractC41088b
    /* renamed from: c */
    public final void mo70306c(AbstractC41086b<C77876c, Void> bVar) {
        boolean z;
        C89219l.m154721d(bVar, "");
        ComposerBeauty composerBeauty = this.f96050h.f174728a;
        C89219l.m154721d(composerBeauty, "");
        C89219l.m154721d(composerBeauty, "");
        File file = new File(composerBeauty.getEffect().getUnzipPath());
        if (file.exists() && file.isDirectory()) {
            File[] listFiles = file.listFiles();
            if (listFiles != null) {
                int length = listFiles.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        break;
                    }
                    File file2 = listFiles[i];
                    C89219l.m154716b(file2, "");
                    if (C89219l.m154714a((Object) file2.getName(), (Object) "unzip_begin")) {
                        z = true;
                        break;
                    }
                    i++;
                }
            }
            z = false;
            if (z) {
                if (listFiles != null) {
                    boolean z2 = false;
                    boolean z3 = false;
                    for (File file3 : listFiles) {
                        C89219l.m154716b(file3, "");
                        if (TextUtils.equals("config.json", file3.getName())) {
                            z3 = true;
                        }
                        if (TextUtils.equals("unzip_complete", file3.getName())) {
                            z2 = true;
                        }
                    }
                    if (z3 && z2) {
                        return;
                    }
                }
            } else if (listFiles != null) {
                for (File file4 : listFiles) {
                    C89219l.m154716b(file4, "");
                    if (TextUtils.equals("config.json", file4.getName())) {
                        return;
                    }
                }
            }
        }
        Effect effect = composerBeauty.getEffect();
        File file5 = new File(effect.getZipPath());
        File file6 = new File(effect.getUnzipPath());
        try {
            FileUtils.INSTANCE.removeDir(effect.getUnzipPath());
            FileUtils.INSTANCE.createFile(effect.getUnzipPath() + File.separator + "unzip_begin", true);
            C84915u.m145938a(file5, file6);
            FileUtils.INSTANCE.createFile(effect.getUnzipPath() + File.separator + "unzip_complete", true);
            C77887a.m136015b(composerBeauty, 0, "success");
        } catch (Exception e) {
            C41093a.m82762a(Log.getStackTraceString(e));
            C77887a.m136015b(composerBeauty, 1, e.toString());
        } finally {
            C77908d.m136047a(file5);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C77879a(String str, C77876c cVar, AbstractC84398d dVar) {
        super(str, cVar);
        C89219l.m154721d(str, "");
        C89219l.m154721d(cVar, "");
        C89219l.m154721d(dVar, "");
        this.f174738j = dVar;
    }
}
