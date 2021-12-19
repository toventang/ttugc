package com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed;

import android.app.Application;
import android.graphics.Bitmap;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.p2082ss.android.ugc.aweme.initializer.AVServiceProxyImpl;
import com.p2082ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.p2082ss.android.ugc.aweme.p2477ci.C36080a;
import com.p2082ss.android.ugc.aweme.p2690cr.AbstractC40381g;
import com.p2082ss.android.ugc.aweme.p2690cr.C40353e;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63247i;
import com.p2082ss.android.ugc.aweme.services.IAVServiceProxy;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.stickingpoint.C70455f;
import com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.p3847a.AbstractC72423a;
import com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.p3847a.AbstractC72433g;
import com.p2082ss.android.ugc.aweme.tools.p4098c.C78102c;
import com.p2082ss.android.ugc.aweme.video.C80720e;
import com.p2082ss.android.ugc.tools.utils.C84891c;
import com.p2082ss.android.ugc.tools.utils.C84896h;
import com.p2082ss.android.ugc.tools.utils.C84904k;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.Callable;
import p077b.AbstractC1729g;
import p077b.C1731i;
import p4600h.C89391z;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.e */
public final class C72440e {

    /* renamed from: a */
    public static int f162414a = 35;

    /* renamed from: b */
    public static final C72440e f162415b = new C72440e();

    private C72440e() {
    }

    /* renamed from: a */
    public static int m127809a() {
        if (C70455f.f157420d) {
            return f162414a;
        }
        return 12;
    }

    /* renamed from: c */
    public static boolean m127818c() {
        if (!m127820d() || !C70455f.f157420d) {
            return false;
        }
        return true;
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.e$c */
    static final class CallableC72443c<V> implements Callable {

        /* renamed from: a */
        public static final CallableC72443c f162418a = new CallableC72443c();

        static {
            Covode.recordClassIndex(85117);
        }

        CallableC72443c() {
        }

        @Override // java.util.concurrent.Callable
        public final Object call() {
            if (!C80720e.m139927b(C72440e.m127815b())) {
                return null;
            }
            C72440e.f162415b.mo114717a(new File(C72440e.m127815b()));
            return null;
        }
    }

    static {
        Covode.recordClassIndex(85114);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.e$d */
    public static final class CallableC72444d<V> implements Callable {

        /* renamed from: a */
        final /* synthetic */ List f162419a;

        static {
            Covode.recordClassIndex(85118);
        }

        CallableC72444d(List list) {
            this.f162419a = list;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            if (!new File(C72440e.m127815b()).exists()) {
                new File(C72440e.m127815b()).mkdirs();
            }
            for (MediaModel mediaModel : this.f162419a) {
                String a = C72440e.m127811a(mediaModel.f134662b);
                if (a != null) {
                    mediaModel.f134662b = a;
                }
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.e$f */
    public static final class CallableC72446f<V> implements Callable {

        /* renamed from: a */
        final /* synthetic */ List f162421a;

        static {
            Covode.recordClassIndex(85120);
        }

        public CallableC72446f(List list) {
            this.f162421a = list;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            if (!new File(C72440e.m127815b()).exists()) {
                new File(C72440e.m127815b()).mkdirs();
            }
            for (VideoSegment videoSegment : this.f162421a) {
                String a = C72440e.m127811a(videoSegment.mo110571a(false));
                if (a != null) {
                    videoSegment.mo110574a(a);
                }
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: b */
    public static String m127815b() {
        StringBuilder sb = new StringBuilder();
        Application application = C63247i.f143610a;
        C89219l.m154716b(application, "");
        File filesDir = application.getFilesDir();
        C89219l.m154716b(filesDir, "");
        return sb.append(filesDir.getAbsolutePath()).append(File.separator).append("videoimage_mixed_resize").append(File.separator).toString();
    }

    /* renamed from: d */
    private static boolean m127820d() {
        IAVServiceProxy createIAVServiceProxybyMonsterPlugin = AVServiceProxyImpl.createIAVServiceProxybyMonsterPlugin(false);
        C89219l.m154716b(createIAVServiceProxybyMonsterPlugin, "");
        if (!createIAVServiceProxybyMonsterPlugin.getStoryService().mo93871e() || C63244g.m114602a().mo73255A().mo93901a()) {
            return false;
        }
        return true;
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.e$a */
    static final class CallableC72441a<V> implements Callable {

        /* renamed from: a */
        final /* synthetic */ List f162416a;

        static {
            Covode.recordClassIndex(85115);
        }

        CallableC72441a(List list) {
            this.f162416a = list;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            int i;
            List<MediaModel> list = this.f162416a;
            if (list == null) {
                C89219l.m154715b();
            }
            for (MediaModel mediaModel : list) {
                if (!C84896h.m145866a(mediaModel.f134662b, true)) {
                    if (mediaModel.f134672l <= 0 || mediaModel.f134673m <= 0) {
                        int[] iArr = new int[10];
                        String str = mediaModel.f134662b;
                        C89219l.m154716b(str, "");
                        if (C78102c.m136520a(str, iArr) == 0) {
                            mediaModel.f134672l = iArr[0];
                            mediaModel.f134673m = iArr[1];
                        }
                    }
                    if (mediaModel.f134672l > mediaModel.f134673m) {
                        i = mediaModel.f134673m;
                    } else {
                        i = mediaModel.f134672l;
                    }
                    if (i > 1100) {
                        return mediaModel.f134662b;
                    }
                }
            }
            return null;
        }
    }

    /* renamed from: b */
    public static boolean m127817b(String str) {
        return C84896h.m145866a(str, true);
    }

    /* renamed from: c */
    public static boolean m127819c(String str) {
        return C84896h.m145866a(str, false);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.e$e */
    public static final class C72445e<TTaskResult, TContinuationResult> implements AbstractC1729g {

        /* renamed from: a */
        final /* synthetic */ AbstractC72433g f162420a;

        static {
            Covode.recordClassIndex(85119);
        }

        C72445e(AbstractC72433g gVar) {
            this.f162420a = gVar;
        }

        @Override // p077b.AbstractC1729g
        public final /* synthetic */ Object then(C1731i iVar) {
            AbstractC72433g gVar = this.f162420a;
            if (gVar == null) {
                return null;
            }
            gVar.mo113365a();
            return null;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.e$g */
    public static final class C72447g<TTaskResult, TContinuationResult> implements AbstractC1729g {

        /* renamed from: a */
        final /* synthetic */ AbstractC72433g f162422a;

        static {
            Covode.recordClassIndex(85121);
        }

        public C72447g(AbstractC72433g gVar) {
            this.f162422a = gVar;
        }

        @Override // p077b.AbstractC1729g
        public final /* synthetic */ Object then(C1731i iVar) {
            AbstractC72433g gVar = this.f162422a;
            if (gVar == null) {
                return null;
            }
            gVar.mo113365a();
            return null;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.e$b */
    static final class C72442b<TTaskResult, TContinuationResult> implements AbstractC1729g {

        /* renamed from: a */
        final /* synthetic */ AbstractC72423a f162417a;

        static {
            Covode.recordClassIndex(85116);
        }

        C72442b(AbstractC72423a aVar) {
            this.f162417a = aVar;
        }

        @Override // p077b.AbstractC1729g
        public final Object then(C1731i<String> iVar) {
            if (iVar == null || iVar.mo5545d() == null) {
                AbstractC72423a aVar = this.f162417a;
                if (aVar == null) {
                    return null;
                }
                aVar.mo114410a(false);
                return null;
            }
            AbstractC72423a aVar2 = this.f162417a;
            if (aVar2 == null) {
                return null;
            }
            iVar.mo5545d();
            aVar2.mo114410a(true);
            return null;
        }
    }

    /* renamed from: a */
    public static boolean m127814a(int i) {
        if (i == 11) {
            return false;
        }
        if (i == 6) {
            return true;
        }
        if (!C70455f.f157420d || i == 3 || i == 4 || i == 10 || i == 12) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000f, code lost:
        if (r5 == null) goto L_0x0011;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m127810a(android.content.Context r5) {
        /*
            if (r5 == 0) goto L_0x0033
            android.content.res.Resources r1 = r5.getResources()
            if (r1 == 0) goto L_0x0033
            r0 = 2131823030(0x7f1109b6, float:1.9278848E38)
            java.lang.String r5 = r1.getString(r0)
            if (r5 != 0) goto L_0x0014
        L_0x0011:
            p4600h.p4611f.p4613b.C89219l.m154715b()
        L_0x0014:
            java.lang.String r4 = ""
            p4600h.p4611f.p4613b.C89219l.m154716b(r5, r4)
            r3 = 1
            java.lang.Object[] r2 = new java.lang.Object[r3]
            r1 = 0
            int r0 = m127809a()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2[r1] = r0
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r2, r3)
            java.lang.String r0 = com.C1764a.m5928a(r5, r0)
            p4600h.p4611f.p4613b.C89219l.m154716b(r0, r4)
            return r0
        L_0x0033:
            r5 = 0
            goto L_0x0011
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.C72440e.m127810a(android.content.Context):java.lang.String");
    }

    /* renamed from: a */
    public static String m127811a(String str) {
        Bitmap a;
        if (!C84896h.m145866a(str, true) || (a = C36080a.m73531a(str, 720, 1280, C36080a.m73537b(str), 4)) == null) {
            return null;
        }
        StringBuilder append = new StringBuilder().append(m127815b());
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd-HHmmssSSS", Locale.US);
        Calendar instance = Calendar.getInstance(TimeZone.getTimeZone("GMT+8"));
        C89219l.m154716b(instance, "");
        String sb = append.append(simpleDateFormat.format(instance.getTime()) + ".png").toString();
        C84891c.m145848a(a, new File(sb), 50, Bitmap.CompressFormat.PNG);
        C36080a.m73533a(a);
        return sb;
    }

    /* renamed from: b */
    private static boolean m127816b(File file) {
        MethodCollector.m26663i(6951);
        try {
            C40353e.C40356c cVar = (C40353e.C40356c) SettingsManager.m29616a().mo25397a("storage_intercepter_key", C40353e.C40356c.class, AbstractC40381g.f94567a);
            if (C40353e.m81545a(file.getAbsolutePath(), cVar)) {
                C40353e.m81540a(file, new RuntimeException(), "exception_delete_log", C40353e.m81542a(cVar));
            }
            if (C40353e.m81549c(file.getAbsolutePath(), cVar)) {
                C40353e.m81540a(file, new RuntimeException(), "exception_handle", C40353e.m81542a(cVar));
                MethodCollector.m26664o(6951);
                return false;
            }
        } catch (Throwable unused) {
        }
        boolean delete = file.delete();
        MethodCollector.m26664o(6951);
        return delete;
    }

    /* renamed from: a */
    public final boolean mo114717a(File file) {
        if (file == null || !file.exists()) {
            return false;
        }
        if (file.isDirectory()) {
            for (File file2 : file.listFiles()) {
                mo114717a(file2);
            }
        }
        return m127816b(file);
    }

    /* renamed from: a */
    public static void m127812a(List<? extends MediaModel> list, AbstractC72423a aVar) {
        if (C84904k.m145909a(list)) {
            aVar.mo114410a(false);
        } else {
            C1731i.m5640b(new CallableC72441a(list), C1731i.f5562a).mo5534a(new C72442b(aVar), C1731i.f5564c, null);
        }
    }

    /* renamed from: a */
    public static void m127813a(List<? extends MediaModel> list, AbstractC72433g gVar) {
        C89219l.m154721d(list, "");
        if (C84904k.m145909a(list)) {
            gVar.mo113365a();
        } else {
            C1731i.m5640b(new CallableC72444d(list), C1731i.f5562a).mo5534a(new C72445e(gVar), C1731i.f5564c, null);
        }
    }
}
