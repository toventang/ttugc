package com.p2082ss.android.ugc.aweme.p4173ug.dynamicresource;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.widget.ImageView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.kakao.usermgmt.StringSet;
import com.p2082ss.android.socialbase.downloader.depend.AbsDownloadListener;
import com.p2082ss.android.socialbase.downloader.exception.BaseException;
import com.p2082ss.android.socialbase.downloader.model.DownloadInfo;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.download.component_api.AbstractC43167a;
import com.p2082ss.android.ugc.aweme.download.component_api.DownloadServiceManager;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58264w;
import com.p2082ss.android.ugc.aweme.lego.C58221f;
import com.p2082ss.android.ugc.aweme.p2690cr.AbstractC40381g;
import com.p2082ss.android.ugc.aweme.p2690cr.C40353e;
import com.p2082ss.android.ugc.aweme.p4173ug.dynamicresource.C79611e;
import com.p2082ss.android.ugc.aweme.p4173ug.p4178d.C79597a;
import com.p2082ss.android.ugc.aweme.p4173ug.p4178d.C79598b;
import com.p2082ss.android.ugc.aweme.p4173ug.p4179e.C79624a;
import java.io.File;
import java.io.FilenameFilter;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.PriorityBlockingQueue;
import p077b.C1731i;
import p4600h.C89391z;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ug.dynamicresource.d */
public final class C79607d implements AbstractC79620l {

    /* renamed from: a */
    static final ConcurrentHashMap<String, C79615h> f178621a = new ConcurrentHashMap<>();

    /* renamed from: b */
    static final PriorityBlockingQueue<C79615h> f178622b = new PriorityBlockingQueue<>();

    /* renamed from: c */
    static volatile boolean f178623c;

    /* renamed from: d */
    static volatile boolean f178624d;

    /* renamed from: e */
    public static final C79607d f178625e = new C79607d();

    private C79607d() {
    }

    @Override // com.p2082ss.android.ugc.aweme.p4173ug.dynamicresource.AbstractC79620l
    /* renamed from: a */
    public final void mo123148a(ImageView imageView, String str) {
        C89219l.m154721d(imageView, "");
        C89219l.m154721d(str, "");
        C89219l.m154721d(imageView, "");
        C89219l.m154721d(str, "");
        C79611e.C79612a aVar = new C79611e.C79612a(imageView, null);
        C89219l.m154721d(str, "");
        C89219l.m154721d(Bitmap.class, "");
        C89219l.m154721d(aVar, "");
        C79615h hVar = f178621a.get(str);
        if (hVar != null) {
            Object b = m138394b(str, Bitmap.class);
            if (b != null) {
                m138396b(str, "async", "async_hit_cache");
                aVar.mo123146a(b);
                return;
            }
            C89219l.m154721d(aVar, "");
            C89219l.m154721d(Bitmap.class, "");
            hVar.f178649l.put(aVar, Bitmap.class);
            if (hVar.f178646i != EnumC79614g.DOWNLOADING) {
                C89219l.m154716b(hVar, "");
                m138389a(hVar, "async");
                return;
            }
            return;
        }
        aVar.mo123146a(null);
    }

    @Override // com.p2082ss.android.ugc.aweme.p4173ug.dynamicresource.AbstractC79620l
    /* renamed from: a */
    public final void mo123147a() {
        C1731i.m5640b(CallableC79610c.f178629a, C1731i.f5562a);
    }

    @Override // com.p2082ss.android.ugc.aweme.p4173ug.dynamicresource.AbstractC79620l
    /* renamed from: b */
    public final AbstractC58264w mo123149b() {
        return new BootFinishTask();
    }

    @Override // com.p2082ss.android.ugc.aweme.p4173ug.dynamicresource.AbstractC79620l
    /* renamed from: c */
    public final boolean mo123150c() {
        return C79624a.m138425a();
    }

    static {
        Covode.recordClassIndex(92819);
    }

    /* renamed from: d */
    private static C79615h m138398d() {
        String str;
        C79615h hVar;
        while (true) {
            PriorityBlockingQueue<C79615h> priorityBlockingQueue = f178622b;
            if (priorityBlockingQueue.isEmpty()) {
                return null;
            }
            C79615h poll = priorityBlockingQueue.poll();
            if (!(poll == null || (str = poll.f178638a) == null || (hVar = f178621a.get(str)) == null || !hVar.f178644g || hVar.f178641d.getValue() <= EnumC79613f.NO_PRELOAD.getValue())) {
                if (!(hVar.f178646i == EnumC79614g.DOWNLOADING && hVar.f178646i == EnumC79614g.SUCCESS) && !hVar.mo123158c()) {
                    return hVar;
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ug.dynamicresource.d$c */
    static final class CallableC79610c<V> implements Callable {

        /* renamed from: a */
        public static final CallableC79610c f178629a = new CallableC79610c();

        static {
            Covode.recordClassIndex(92822);
        }

        CallableC79610c() {
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            Iterator<Map.Entry<String, IDynamicResourceConfig>> it = C79603b.f178613a.entrySet().iterator();
            while (true) {
                if (it.hasNext()) {
                    Map.Entry<String, IDynamicResourceConfig> next = it.next();
                    C79597a[] aVarArr = (C79597a[]) SettingsManager.m29616a().mo25397a("ug_dynamic_resource_list", C79597a[].class, C79598b.f178606a);
                    if (aVarArr != null) {
                        try {
                            for (C79597a aVar : aVarArr) {
                                if (C89219l.m154714a((Object) aVar.f178602a, (Object) next.getKey())) {
                                    C79615h hVar = C79607d.f178621a.get(aVar.f178602a);
                                    if (hVar == null || (true ^ C89219l.m154714a((Object) hVar.f178642e, (Object) aVar.f178604c))) {
                                        IDynamicResourceConfig value = next.getValue();
                                        C89219l.m154721d(value, "");
                                        C89219l.m154721d(aVar, "");
                                        hVar = new C79615h(value.mo96305a(), value.mo96306b(), aVar.f178603b, value.mo96307c(), aVar.f178604c, aVar.f178605d, value.mo96308d());
                                        hVar.mo123158c();
                                    }
                                    C79607d.f178621a.put(aVar.f178602a, hVar);
                                    C79607d.f178622b.add(hVar);
                                }
                            }
                            throw new NoSuchElementException("Array contains no element matching the predicate.");
                        } catch (NoSuchElementException e) {
                            e.printStackTrace();
                        }
                    }
                } else {
                    if (C79607d.f178623c) {
                        C79607d.f178623c = false;
                        C79607d.m138395b("boot_finish_miss");
                    }
                    if (!C79607d.f178624d) {
                        C58221f.m105153e().mo95704a(new BackgroundTask()).mo95704a(new IdleTask()).mo95706a();
                    }
                    C79607d.f178624d = true;
                    return C89391z.f203057a;
                }
            }
        }
    }

    /* renamed from: b */
    public static void m138395b(String str) {
        C89219l.m154721d(str, "");
        C79615h d = m138398d();
        if (d != null) {
            m138389a(d, str);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ug.dynamicresource.d$b */
    public static final class C79609b extends AbsDownloadListener {

        /* renamed from: a */
        final /* synthetic */ C79615h f178627a;

        /* renamed from: b */
        final /* synthetic */ String f178628b;

        static {
            Covode.recordClassIndex(92821);
        }

        @Override // com.p2082ss.android.socialbase.downloader.depend.IDownloadListener, com.p2082ss.android.socialbase.downloader.depend.AbsDownloadListener
        public final void onSuccessed(DownloadInfo downloadInfo) {
            if (downloadInfo != null) {
                C79607d.m138392a(this.f178627a.f178638a, "success", this.f178628b);
                C79607d.m138390a(this.f178627a.f178638a);
                return;
            }
            C79607d.m138392a(this.f178627a.f178638a, "fail", this.f178628b);
            C79607d.m138390a(this.f178627a.f178638a);
        }

        C79609b(C79615h hVar, String str) {
            this.f178627a = hVar;
            this.f178628b = str;
        }

        @Override // com.p2082ss.android.socialbase.downloader.depend.IDownloadListener, com.p2082ss.android.socialbase.downloader.depend.AbsDownloadListener
        public final void onFailed(DownloadInfo downloadInfo, BaseException baseException) {
            C89219l.m154721d(baseException, "");
            C79607d.m138392a(this.f178627a.f178638a, "fail", this.f178628b);
            C79607d.m138390a(this.f178627a.f178638a);
        }
    }

    /* renamed from: a */
    public static void m138390a(String str) {
        C79615h hVar = f178621a.get(str);
        if (hVar != null) {
            if (!hVar.mo123158c()) {
                hVar.mo123156a(EnumC79614g.FAIL);
                hVar.f178648k++;
                f178622b.add(hVar);
            } else {
                hVar.f178648k = 0;
            }
            for (Map.Entry<AbstractC79602a<?>, Class<?>> entry : hVar.f178649l.entrySet()) {
                Class<?> value = entry.getValue();
                AbstractC79602a<?> key = entry.getKey();
                if (C89219l.m154714a(value, String.class)) {
                    Objects.requireNonNull(key, "null cannot be cast to non-null type com.ss.android.ugc.aweme.ug.dynamicresource.DynamicResourceCallback<kotlin.String>");
                    key.mo123146a(m138397c(str, String.class));
                } else if (C89219l.m154714a(value, Bitmap.class)) {
                    Objects.requireNonNull(key, "null cannot be cast to non-null type com.ss.android.ugc.aweme.ug.dynamicresource.DynamicResourceCallback<android.graphics.Bitmap>");
                    key.mo123146a(m138397c(str, Bitmap.class));
                } else if (C89219l.m154714a(value, File.class)) {
                    Objects.requireNonNull(key, "null cannot be cast to non-null type com.ss.android.ugc.aweme.ug.dynamicresource.DynamicResourceCallback<java.io.File>");
                    key.mo123146a(m138397c(str, File.class));
                } else {
                    key.mo123146a(null);
                }
            }
            hVar.f178649l.clear();
            m138391a(hVar.mo123155a(), hVar.mo123157b());
        }
    }

    /* renamed from: a */
    private static boolean m138393a(File file) {
        MethodCollector.m26663i(4332);
        try {
            C40353e.C40356c cVar = (C40353e.C40356c) SettingsManager.m29616a().mo25397a("storage_intercepter_key", C40353e.C40356c.class, AbstractC40381g.f94567a);
            if (C40353e.m81545a(file.getAbsolutePath(), cVar)) {
                C40353e.m81540a(file, new RuntimeException(), "exception_delete_log", C40353e.m81542a(cVar));
            }
            if (C40353e.m81549c(file.getAbsolutePath(), cVar)) {
                C40353e.m81540a(file, new RuntimeException(), "exception_handle", C40353e.m81542a(cVar));
                MethodCollector.m26664o(4332);
                return false;
            }
        } catch (Throwable unused) {
        }
        boolean delete = file.delete();
        MethodCollector.m26664o(4332);
        return delete;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.ug.dynamicresource.d$a */
    public static final class C79608a implements FilenameFilter {

        /* renamed from: a */
        final /* synthetic */ String f178626a;

        static {
            Covode.recordClassIndex(92820);
        }

        C79608a(String str) {
            this.f178626a = str;
        }

        public final boolean accept(File file, String str) {
            return !C89219l.m154714a((Object) str, (Object) this.f178626a);
        }
    }

    /* renamed from: b */
    private static <T> T m138394b(String str, Class<T> cls) {
        C79615h hVar = f178621a.get(str);
        if (hVar == null || !hVar.mo123158c()) {
            return null;
        }
        return (T) m138399d(hVar.f178647j, cls);
    }

    /* renamed from: a */
    private static <T> T m138387a(Integer num, Class<T> cls) {
        MethodCollector.m26663i(6490);
        T t = null;
        if (num != null) {
            try {
                num.intValue();
                if (C89219l.m154714a(cls, Bitmap.class)) {
                    t = (T) BitmapFactory.decodeResource(C17867d.m33078a().getResources(), num.intValue());
                }
            } catch (Exception unused) {
            }
        }
        MethodCollector.m26664o(6490);
        return t;
    }

    /* renamed from: c */
    private static <T> T m138397c(String str, Class<T> cls) {
        Integer num;
        String str2;
        T t = (T) m138394b(str, cls);
        if (t != null) {
            m138396b(str, "async", "async_re_download_success");
            return t;
        }
        C79615h hVar = f178621a.get(str);
        if (hVar != null) {
            num = hVar.f178645h;
        } else {
            num = null;
        }
        T t2 = (T) m138387a(num, cls);
        if (t2 != null) {
            str2 = "async_re_download_fallback";
        } else {
            str2 = "async_re_download_fail";
        }
        m138396b(str, "async", str2);
        return t2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.lang.String */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: d */
    private static <T> T m138399d(String str, Class<T> cls) {
        MethodCollector.m26663i(6342);
        if (C89219l.m154714a(cls, String.class)) {
            MethodCollector.m26664o(6342);
            return str;
        } else if (C89219l.m154714a(cls, Bitmap.class)) {
            T t = (T) BitmapFactory.decodeFile(str);
            MethodCollector.m26664o(6342);
            return t;
        } else if (C89219l.m154714a(cls, File.class)) {
            T t2 = (T) new File(str);
            MethodCollector.m26664o(6342);
            return t2;
        } else {
            MethodCollector.m26664o(6342);
            return null;
        }
    }

    /* renamed from: a */
    public static <T> T m138388a(String str, Class<T> cls) {
        Integer num;
        String str2;
        C89219l.m154721d(str, "");
        C89219l.m154721d(cls, "");
        T t = (T) m138394b(str, cls);
        if (t != null) {
            m138396b(str, "sync", "sync_hit_cache");
            return t;
        }
        ConcurrentHashMap<String, C79615h> concurrentHashMap = f178621a;
        C79615h hVar = concurrentHashMap.get(str);
        if (hVar != null) {
            C89219l.m154716b(hVar, "");
            m138389a(hVar, "sync");
        }
        C79615h hVar2 = concurrentHashMap.get(str);
        if (hVar2 != null) {
            num = hVar2.f178645h;
        } else {
            num = null;
        }
        T t2 = (T) m138387a(num, cls);
        if (t2 != null) {
            str2 = "sync_hit_fallback";
        } else {
            str2 = "sync_miss";
        }
        m138396b(str, "sync", str2);
        return t2;
    }

    /* renamed from: a */
    private static void m138389a(C79615h hVar, String str) {
        m138392a(hVar.f178638a, "start", str);
        C79609b bVar = new C79609b(hVar, str);
        AbstractC43167a with = DownloadServiceManager.INSTANCE.getDownloadService().with(hVar.f178640c);
        with.f100629f = hVar.mo123155a();
        AbstractC43167a a = with.mo73399a(3);
        a.f100626c = hVar.mo123157b();
        AbstractC43167a a2 = a.mo73400a("dynamic_resource_download");
        a2.f100601D = bVar;
        a2.mo73409f();
        hVar.mo123156a(EnumC79614g.DOWNLOADING);
    }

    /* renamed from: a */
    private static void m138391a(String str, String str2) {
        File[] listFiles;
        File file = new File(str);
        if (file.exists() && (listFiles = file.listFiles(new C79608a(str2))) != null) {
            for (File file2 : listFiles) {
                m138393a(file2);
            }
        }
    }

    /* renamed from: a */
    public static void m138392a(String str, String str2, String str3) {
        C39162r.m79460a("heli_download_resource", new C33744d().mo59983a("key", str).mo59983a("status", str2).mo59983a("launch_type", str3).f79943a);
    }

    /* renamed from: b */
    private static void m138396b(String str, String str2, String str3) {
        C39162r.m79460a("heli_get_resource", new C33744d().mo59983a("key", str).mo59983a(StringSet.type, str2).mo59983a("result", str3).f79943a);
    }
}
