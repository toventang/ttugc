package com.p2082ss.android.ugc.aweme.feed.cache;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.C16048b;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.p2082ss.android.ugc.aweme.DetailFeedServiceImpl;
import com.p2082ss.android.ugc.aweme.feed.cache.p2942a.C49297a;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.FeedItemList;
import com.p2082ss.android.ugc.aweme.lancet.C58016d;
import com.p2082ss.android.ugc.aweme.p2690cr.AbstractC40381g;
import com.p2082ss.android.ugc.aweme.p2690cr.C40353e;
import com.p2082ss.android.ugc.aweme.utils.C80313cs;
import com.p2082ss.android.ugc.aweme.utils.GsonHolder;
import com.p2082ss.android.ugc.aweme.utils.GsonProvider;
import java.io.File;
import java.io.FileOutputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import p077b.C1731i;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89338d;

/* renamed from: com.ss.android.ugc.aweme.feed.cache.f */
public final class C49316f {

    /* renamed from: a */
    public static volatile boolean f113349a;

    /* renamed from: b */
    public static volatile boolean f113350b;

    /* renamed from: c */
    public static final C49316f f113351c = new C49316f();

    private C49316f() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.feed.cache.f$a */
    public static final class C49317a extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ FeedItemList f113352a;

        static {
            Covode.recordClassIndex(58118);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C49317a(FeedItemList feedItemList) {
            super(0);
            this.f113352a = feedItemList;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            mo80908a();
            return C89391z.f203057a;
        }

        /* renamed from: a */
        public final void mo80908a() {
            Throwable th;
            MethodCollector.m26663i(3451);
            File b = C49316f.m92391b();
            if (b == null) {
                MethodCollector.m26664o(3451);
            } else if (C49316f.m92390a(b)) {
                GsonProvider c = GsonHolder.m138943c();
                C89219l.m154716b(c, "");
                String b2 = c.mo123620b().mo46674b(this.f113352a);
                if (TextUtils.isEmpty(b2)) {
                    C49316f.m92393c();
                    MethodCollector.m26664o(3451);
                    return;
                }
                FileOutputStream fileOutputStream = null;
                try {
                    FileOutputStream fileOutputStream2 = new FileOutputStream(b);
                    try {
                        C89219l.m154716b(b2, "");
                        Charset charset = C89338d.f202990a;
                        if (b2 != null) {
                            byte[] bytes = b2.getBytes(charset);
                            C89219l.m154716b(bytes, "");
                            fileOutputStream2.write(bytes);
                            C49316f.f113350b = true;
                            C80313cs.m139228a(fileOutputStream2);
                            MethodCollector.m26664o(3451);
                            return;
                        }
                        NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type java.lang.String");
                        MethodCollector.m26664o(3451);
                        throw nullPointerException;
                    } catch (Exception unused) {
                        fileOutputStream = fileOutputStream2;
                        try {
                            C49316f.f113350b = false;
                            C80313cs.m139228a(fileOutputStream);
                            MethodCollector.m26664o(3451);
                        } catch (Throwable th2) {
                            th = th2;
                            C80313cs.m139228a(fileOutputStream);
                            MethodCollector.m26664o(3451);
                            throw th;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        fileOutputStream = fileOutputStream2;
                        C80313cs.m139228a(fileOutputStream);
                        MethodCollector.m26664o(3451);
                        throw th;
                    }
                } catch (Exception unused2) {
                    C49316f.f113350b = false;
                    C80313cs.m139228a(fileOutputStream);
                    MethodCollector.m26664o(3451);
                }
            } else {
                MethodCollector.m26664o(3451);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.feed.cache.f$b */
    public static final class CallableC49318b<V> implements Callable {

        /* renamed from: a */
        final /* synthetic */ C49317a f113353a;

        static {
            Covode.recordClassIndex(58119);
        }

        CallableC49318b(C49317a aVar) {
            this.f113353a = aVar;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            this.f113353a.mo80908a();
            C49316f.f113349a = false;
            return C89391z.f203057a;
        }
    }

    static {
        Covode.recordClassIndex(58117);
    }

    /* renamed from: c */
    public static void m92393c() {
        try {
            File d = m92394d();
            if (d != null) {
                m92392b(d);
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: b */
    public static File m92391b() {
        File a = m92388a(C17867d.m33078a());
        C89219l.m154716b(a, "");
        String absolutePath = a.getAbsolutePath();
        if (absolutePath == null) {
            return null;
        }
        return new File(absolutePath + File.separator + "extention_cached_feed.json");
    }

    /* renamed from: d */
    private static File m92394d() {
        File a = m92388a(C17867d.m33078a());
        C89219l.m154716b(a, "");
        String absolutePath = a.getAbsolutePath();
        if (absolutePath == null) {
            return null;
        }
        File file = new File(absolutePath + File.separator + "extention_cached_feed.json");
        if (file.exists()) {
            return file;
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0050, code lost:
        if (r1.getItems().size() > 0) goto L_0x0066;
     */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x007d A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x007e  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.p2082ss.android.ugc.aweme.feed.model.FeedItemList m92386a() {
        /*
        // Method dump skipped, instructions count: 140
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.feed.cache.C49316f.m92386a():com.ss.android.ugc.aweme.feed.model.FeedItemList");
    }

    /* renamed from: a */
    public static boolean m92390a(File file) {
        if (file.exists()) {
            return true;
        }
        try {
            file.createNewFile();
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: a */
    private static File m92388a(Context context) {
        if (C58016d.f132221b != null && C58016d.f132224e) {
            return C58016d.f132221b;
        }
        File cacheDir = context.getCacheDir();
        C58016d.f132221b = cacheDir;
        return cacheDir;
    }

    /* renamed from: b */
    private static boolean m92392b(File file) {
        MethodCollector.m26663i(5905);
        try {
            C40353e.C40356c cVar = (C40353e.C40356c) SettingsManager.m29616a().mo25397a("storage_intercepter_key", C40353e.C40356c.class, AbstractC40381g.f94567a);
            if (C40353e.m81545a(file.getAbsolutePath(), cVar)) {
                C40353e.m81540a(file, new RuntimeException(), "exception_delete_log", C40353e.m81542a(cVar));
            }
            if (C40353e.m81549c(file.getAbsolutePath(), cVar)) {
                C40353e.m81540a(file, new RuntimeException(), "exception_handle", C40353e.m81542a(cVar));
                MethodCollector.m26664o(5905);
                return false;
            }
        } catch (Throwable unused) {
        }
        boolean delete = file.delete();
        MethodCollector.m26664o(5905);
        return delete;
    }

    /* renamed from: a */
    private static FeedItemList m92387a(FeedItemList feedItemList) {
        Object obj;
        List<Aweme> items;
        ArrayList<Aweme> arrayList = new ArrayList();
        List<Aweme> items2 = feedItemList.getItems();
        if (items2 != null) {
            for (Aweme aweme : items2) {
                C89219l.m154716b(aweme, "");
                if (C49297a.m92349a(aweme)) {
                    arrayList.add(aweme);
                    aweme.getAid();
                    aweme.getAid();
                }
            }
        }
        if (arrayList.isEmpty()) {
            return feedItemList;
        }
        List<Aweme> items3 = feedItemList.getItems();
        if (items3 != null) {
            items3.removeAll(arrayList);
        }
        if (C16048b.m29633a().mo25421a(true, "request_detail_for_expire_cdn", false)) {
            ArrayList arrayList2 = new ArrayList(C89070n.m154526a((Iterable) arrayList, 10));
            for (Aweme aweme2 : arrayList) {
                arrayList2.add(aweme2.getAid());
            }
            try {
                List<Aweme> list = DetailFeedServiceImpl.m65254b().mo57056a("[" + C89070n.m154551a(arrayList2, ",", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (AbstractC89172b) null, 62) + ']', null, null).f96125a;
                if (list != null) {
                    for (T t : list) {
                        C89219l.m154716b(t, "");
                        t.getAid();
                        t.getAid();
                        Iterator it = arrayList.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                obj = null;
                                break;
                            }
                            obj = it.next();
                            if (TextUtils.equals(((Aweme) obj).getAid(), t.getAid())) {
                                break;
                            }
                        }
                        Aweme aweme3 = (Aweme) obj;
                        if (!(aweme3 == null || (items = feedItemList.getItems()) == null)) {
                            items.add(aweme3);
                        }
                    }
                }
            } catch (Throwable unused) {
            }
        }
        List<Aweme> items4 = feedItemList.getItems();
        if (items4 == null || items4.isEmpty()) {
            return feedItemList;
        }
        return null;
    }

    /* renamed from: a */
    public static void m92389a(FeedItemList feedItemList, boolean z) {
        C49317a aVar = new C49317a(feedItemList);
        if (z) {
            C1731i.m5640b(new CallableC49318b(aVar), C1731i.f5562a);
            return;
        }
        aVar.mo80908a();
        f113349a = false;
    }
}
