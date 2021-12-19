package com.p2082ss.android.ugc.aweme.pendant;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.common.utility.C13607d;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.p2082ss.android.socialbase.downloader.depend.AbsDownloadListener;
import com.p2082ss.android.socialbase.downloader.exception.BaseException;
import com.p2082ss.android.socialbase.downloader.model.DownloadInfo;
import com.p2082ss.android.ugc.aweme.download.component_api.AbstractC43167a;
import com.p2082ss.android.ugc.aweme.download.component_api.DownloadServiceManager;
import com.p2082ss.android.ugc.aweme.utils.C80313cs;
import com.p2082ss.android.ugc.aweme.video.C80720e;
import com.p2082ss.android.ugc.tools.utils.C84915u;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.List;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.AbstractC88982v;
import p4560f.p4561a.AbstractC88983w;
import p4560f.p4561a.AbstractC88986z;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4567d.AbstractC88434g;
import p4560f.p4561a.p4567d.AbstractC88438k;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.pendant.f */
public final class C62772f {

    /* renamed from: e */
    public static final C62773a f142304e = new C62773a((byte) 0);

    /* renamed from: a */
    public int f142305a;

    /* renamed from: b */
    public final String f142306b;

    /* renamed from: c */
    public final List<String> f142307c;

    /* renamed from: d */
    public final String f142308d;

    /* renamed from: f */
    private final String f142309f;

    static {
        Covode.recordClassIndex(73595);
    }

    /* renamed from: com.ss.android.ugc.aweme.pendant.f$a */
    public static final class C62773a {
        static {
            Covode.recordClassIndex(73596);
        }

        private C62773a() {
        }

        public /* synthetic */ C62773a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.pendant.f$e */
    public static final class C62778e implements AbstractC88986z<Integer> {

        /* renamed from: a */
        final /* synthetic */ C62772f f142315a;

        /* renamed from: b */
        final /* synthetic */ AbstractC62804l f142316b;

        static {
            Covode.recordClassIndex(73601);
        }

        @Override // p4560f.p4561a.AbstractC88986z
        public final void onSubscribe(AbstractC88412b bVar) {
            C89219l.m154721d(bVar, "");
        }

        @Override // p4560f.p4561a.AbstractC88986z
        public final void onComplete() {
            AbstractC62804l lVar = this.f142316b;
            if (lVar != null) {
                lVar.mo100763a();
            }
        }

        @Override // p4560f.p4561a.AbstractC88986z
        public final void onError(Throwable th) {
            C89219l.m154721d(th, "");
            AbstractC62804l lVar = this.f142316b;
            if (lVar != null) {
                lVar.mo100764b();
            }
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4560f.p4561a.AbstractC88986z
        public final /* synthetic */ void onNext(Integer num) {
            if (num.intValue() > 0) {
                onComplete();
            } else {
                onError(new Throwable("UNKNOWN EXCEPTIION"));
            }
        }

        C62778e(C62772f fVar, AbstractC62804l lVar) {
            this.f142315a = fVar;
            this.f142316b = lVar;
        }
    }

    /* renamed from: e */
    public final void mo100756e() {
        mo100753b();
        C80313cs.m139234c(mo100753b());
    }

    /* renamed from: a */
    public final String mo100750a() {
        if (this.f142305a < this.f142307c.size()) {
            return this.f142307c.get(this.f142305a);
        }
        throw new Exception("Array out of bound");
    }

    /* renamed from: c */
    public final String mo100754c() {
        StringBuilder append = new StringBuilder().append(mo100753b()).append(File.separator);
        mo100750a();
        return append.append(mo100751a(true)).toString();
    }

    /* renamed from: d */
    public final String mo100755d() {
        StringBuilder append = new StringBuilder().append(mo100753b()).append(File.separator);
        mo100750a();
        return append.append(mo100751a(false)).toString();
    }

    /* renamed from: f */
    public final boolean mo100757f() {
        File[] listFiles;
        File file = new File(mo100754c());
        File file2 = new File(mo100755d());
        String str = this.f142308d;
        if (file.exists() && file2.exists() && file2.isDirectory() && (listFiles = file2.listFiles()) != null && listFiles.length != 0) {
            return m113153a(file, str);
        }
        return false;
    }

    /* renamed from: b */
    public final String mo100753b() {
        String str;
        StringBuilder sb = new StringBuilder();
        String str2 = this.f142306b;
        StringBuilder sb2 = new StringBuilder();
        File b = C80720e.m139924b(C17867d.m33078a());
        C89219l.m154716b(b, "");
        StringBuilder append = sb.append(sb2.append(b.getPath()).append(File.separator).append(str2).toString()).append(File.separator);
        if (!TextUtils.isEmpty(this.f142309f)) {
            str = this.f142309f;
        } else {
            str = "default_activity";
        }
        return append.append(str).toString();
    }

    /* renamed from: com.ss.android.ugc.aweme.pendant.f$c */
    public static final class C62776c implements AbstractC88438k<Throwable> {

        /* renamed from: a */
        final /* synthetic */ C62772f f142313a;

        static {
            Covode.recordClassIndex(73599);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C62776c(C62772f fVar) {
            this.f142313a = fVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4560f.p4561a.p4567d.AbstractC88438k
        /* renamed from: a */
        public final /* synthetic */ boolean mo7718a(Throwable th) {
            C89219l.m154721d(th, "");
            if (this.f142313a.f142305a >= this.f142313a.f142307c.size() - 1) {
                return false;
            }
            this.f142313a.f142305a++;
            return true;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.pendant.f$d */
    static final class C62777d<T, R> implements AbstractC88434g {

        /* renamed from: a */
        final /* synthetic */ C62772f f142314a;

        static {
            Covode.recordClassIndex(73600);
        }

        C62777d(C62772f fVar) {
            this.f142314a = fVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88434g
        public final /* synthetic */ Object apply(Object obj) {
            String str = (String) obj;
            C89219l.m154721d(str, "");
            AbstractC88979t a = AbstractC88979t.m154294a(new C62779f(str));
            C89219l.m154716b(a, "");
            return a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.pendant.f$b */
    static final class C62774b<T> implements AbstractC88983w {

        /* renamed from: a */
        final /* synthetic */ C62772f f142310a;

        static {
            Covode.recordClassIndex(73597);
        }

        C62774b(C62772f fVar) {
            this.f142310a = fVar;
        }

        /* renamed from: com.ss.android.ugc.aweme.pendant.f$b$a */
        public static final class C62775a extends AbsDownloadListener {

            /* renamed from: a */
            final /* synthetic */ C62774b f142311a;

            /* renamed from: b */
            final /* synthetic */ AbstractC88982v f142312b;

            static {
                Covode.recordClassIndex(73598);
            }

            /* JADX DEBUG: Multi-variable search result rejected for r0v13, resolved type: f.a.v */
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.p2082ss.android.socialbase.downloader.depend.IDownloadListener, com.p2082ss.android.socialbase.downloader.depend.AbsDownloadListener
            public final void onSuccessed(DownloadInfo downloadInfo) {
                String c = this.f142311a.f142310a.mo100754c();
                if (C62772f.m113153a(new File(c), this.f142311a.f142310a.f142308d)) {
                    this.f142312b.mo143031a(c);
                } else {
                    this.f142312b.mo143024a((Throwable) new Exception("FIle in  " + this.f142311a.f142310a.f142305a + " doesnot match md5"));
                }
            }

            C62775a(C62774b bVar, AbstractC88982v vVar) {
                this.f142311a = bVar;
                this.f142312b = vVar;
            }

            @Override // com.p2082ss.android.socialbase.downloader.depend.IDownloadListener, com.p2082ss.android.socialbase.downloader.depend.AbsDownloadListener
            public final void onFailed(DownloadInfo downloadInfo, BaseException baseException) {
                C89219l.m154721d(baseException, "");
                this.f142312b.mo143024a((Throwable) baseException);
            }
        }

        @Override // p4560f.p4561a.AbstractC88983w
        public final void subscribe(AbstractC88982v<String> vVar) {
            C89219l.m154721d(vVar, "");
            C80313cs.m139234c(this.f142310a.mo100753b());
            C80313cs.m139225a(this.f142310a.mo100755d(), false);
            C62775a aVar = new C62775a(this, vVar);
            AbstractC43167a with = DownloadServiceManager.INSTANCE.getDownloadService().with(this.f142310a.mo100750a());
            with.f100629f = this.f142310a.mo100753b();
            C62772f fVar = this.f142310a;
            fVar.mo100750a();
            with.f100626c = fVar.mo100751a(true);
            AbstractC43167a a = with.mo73400a("legacy_lottie_file");
            a.f100601D = aVar;
            a.mo73409f();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.pendant.f$f */
    static final class C62779f<T> implements AbstractC88983w {

        /* renamed from: a */
        final /* synthetic */ String f142317a;

        static {
            Covode.recordClassIndex(73602);
        }

        C62779f(String str) {
            this.f142317a = str;
        }

        @Override // p4560f.p4561a.AbstractC88983w
        public final void subscribe(AbstractC88982v<Integer> vVar) {
            C89219l.m154721d(vVar, "");
            try {
                if (C89361p.m154876c(this.f142317a, ".zip", false)) {
                    int a = C89361p.m154885a((CharSequence) this.f142317a, ".zip");
                    String str = this.f142317a;
                    if (str != null) {
                        String substring = str.substring(0, a);
                        C89219l.m154716b(substring, "");
                        C84915u.m145938a(new File(this.f142317a), new File(substring));
                        vVar.mo143031a((Integer) 1);
                        return;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                }
                vVar.mo143024a(new Throwable("file Path not ended with .zip!"));
            } catch (Exception e) {
                vVar.mo143024a(e);
            }
        }
    }

    /* renamed from: a */
    public final InputStream mo100749a(String str) {
        FileInputStream fileInputStream;
        MethodCollector.m26663i(7365);
        C89219l.m154721d(str, "");
        try {
            fileInputStream = new FileInputStream(new File(mo100755d() + File.separator + (str + ".json")));
        } catch (Throwable unused) {
            fileInputStream = null;
        }
        MethodCollector.m26664o(7365);
        return fileInputStream;
    }

    /* renamed from: a */
    public final String mo100751a(boolean z) {
        String str;
        StringBuilder append = new StringBuilder().append(this.f142308d);
        if (z) {
            str = ".zip";
        } else {
            str = "";
        }
        return append.append(str).toString();
    }

    /* renamed from: a */
    public static boolean m113153a(File file, String str) {
        if (!file.exists()) {
            return false;
        }
        return TextUtils.equals(C13607d.m24438a(file), str);
    }

    /* renamed from: a */
    public final void mo100752a(Context context, AbstractC62804l lVar) {
        C89219l.m154721d(context, "");
        AbstractC88979t a = AbstractC88979t.m154294a(new C62774b(this)).mo143259a(Long.MAX_VALUE, new C62776c(this));
        C89219l.m154716b(a, "");
        a.mo143267a((AbstractC88434g) new C62777d(this), false).mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143062b((AbstractC88986z) new C62778e(this, lVar));
    }

    public C62772f(String str, String str2, List<String> list, String str3) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C89219l.m154721d(list, "");
        C89219l.m154721d(str3, "");
        this.f142306b = str;
        this.f142309f = str2;
        this.f142307c = list;
        this.f142308d = str3;
        new StringBuilder("LottieFileManager ").append(this).append(" init, ").append(str).append(", ").append(str2).append(", ").append(list).append(' ').append(str3);
    }
}
