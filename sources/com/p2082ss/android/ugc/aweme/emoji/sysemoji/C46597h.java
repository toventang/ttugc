package com.p2082ss.android.ugc.aweme.emoji.sysemoji;

import android.os.Build;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.p1777x.p1780c.C23697c;
import com.p2082ss.android.socialbase.downloader.depend.AbsDownloadListener;
import com.p2082ss.android.socialbase.downloader.exception.BaseException;
import com.p2082ss.android.socialbase.downloader.model.DownloadInfo;
import com.p2082ss.android.ugc.aweme.download.component_api.AbstractC43167a;
import com.p2082ss.android.ugc.aweme.download.component_api.DownloadServiceManager;
import com.p2082ss.android.ugc.aweme.emoji.utils.C46642d;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.utils.C80313cs;
import com.p2082ss.android.ugc.aweme.utils.C80342dg;
import java.io.File;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlinx.coroutines.AbstractC89516am;
import kotlinx.coroutines.AbstractC89568bz;
import kotlinx.coroutines.C89517an;
import kotlinx.coroutines.C89546bf;
import kotlinx.coroutines.C89624i;
import p4560f.p4561a.AbstractC88406ae;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89382r;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4603c.AbstractC89124d;
import p4600h.p4603c.p4605b.p4606a.AbstractC89118k;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4621l.C89309k;

/* renamed from: com.ss.android.ugc.aweme.emoji.sysemoji.h */
public final class C46597h {

    /* renamed from: a */
    static final AbstractC89516am f108647a = C89517an.m155448a(C89546bf.f203267b);

    /* renamed from: b */
    static volatile int f108648b;

    /* renamed from: c */
    static final List<C46605i> f108649c = new ArrayList();

    /* renamed from: d */
    static final Map<Integer, List<C46605i>> f108650d = new LinkedHashMap();

    /* renamed from: e */
    public static final C46597h f108651e = new C46597h();

    /* renamed from: f */
    private static Map<Integer, Boolean> f108652f = new LinkedHashMap();

    /* renamed from: g */
    private static volatile String f108653g = "";

    /* renamed from: h */
    private static final AbstractC89244h f108654h = C89250i.m154773a((AbstractC89171a) C46602d.f108661a);

    /* renamed from: a */
    public static boolean m89938a(int i, int i2) {
        int i3 = i & i2;
        return i3 == 4 || i3 == 1 || i3 == 2 || i3 == 7;
    }

    /* renamed from: d */
    private static List<C46605i> m89941d() {
        return (List) f108654h.getValue();
    }

    private C46597h() {
    }

    /* renamed from: com.ss.android.ugc.aweme.emoji.sysemoji.h$d */
    static final class C46602d extends AbstractC89220m implements AbstractC89171a<List<C46605i>> {

        /* renamed from: a */
        public static final C46602d f108661a = new C46602d();

        static {
            Covode.recordClassIndex(55192);
        }

        C46602d() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ List<C46605i> invoke() {
            return C46597h.m89939b();
        }
    }

    static {
        Covode.recordClassIndex(55187);
    }

    /* renamed from: a */
    public static void m89936a() {
        boolean z;
        C46642d a = C46642d.m90028a();
        C89219l.m154716b(a, "");
        String e = a.mo79254e();
        C89219l.m154716b(e, "");
        if (e.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            C51423a.m95784a(3, null, "ImSysEmojiManager preloadResourceInfo lastCacheMd5 empty");
            return;
        }
        f108653g = e;
        f108648b = 1;
        AbstractC89568bz unused = C89624i.m155555a(f108647a, null, null, new C46600c(e, null), 3);
    }

    /* renamed from: e */
    private synchronized void m89942e() {
        MethodCollector.m26663i(11623);
        if (m89941d().isEmpty()) {
            m89941d().addAll(m89939b());
        }
        MethodCollector.m26664o(11623);
    }

    /* renamed from: c */
    public final synchronized void mo79192c() {
        MethodCollector.m26663i(11452);
        List<C46605i> list = f108649c;
        if (!list.isEmpty()) {
            MethodCollector.m26664o(11452);
        } else if (C46611n.m89949d()) {
            m89942e();
            list.addAll(m89941d());
            MethodCollector.m26664o(11452);
        } else {
            m89936a();
            MethodCollector.m26664o(11452);
        }
    }

    /* renamed from: b */
    public static List<C46605i> m89939b() {
        boolean z;
        MethodCollector.m26663i(11296);
        f108648b = 1;
        InputStream open = C17867d.m33078a().getAssets().open("I18N_sys_emoji.json");
        C89219l.m154716b(open, "");
        ArrayList arrayList = new ArrayList();
        List<C46582a> d = ((C46608k) C80342dg.m139301a(C80313cs.m139227a(open, "UTF-8"), C46608k.class)).getD();
        if (d != null) {
            ArrayList arrayList2 = new ArrayList(C89070n.m154526a((Iterable) d, 10));
            for (T t : d) {
                if (Build.VERSION.SDK_INT >= Integer.parseInt(t.getAnd())) {
                    z = true;
                } else {
                    z = false;
                }
                String str = null;
                if (z) {
                    C46605i iVar = new C46605i();
                    iVar.setBusinessType(t.getBusiness());
                    List<String> emoji = t.getEmoji();
                    if (emoji != null) {
                        str = emoji.get(0);
                    }
                    iVar.setPreviewEmoji(str);
                    iVar.setSupportSkinBusinessType(1);
                    iVar.setEmojiList(t.getEmoji());
                    iVar.setMiniSupportSysVersion(t.getAnd());
                    arrayList.add(iVar);
                    str = t;
                }
                arrayList2.add(str);
            }
        }
        MethodCollector.m26664o(11296);
        return arrayList;
    }

    /* renamed from: com.ss.android.ugc.aweme.emoji.sysemoji.h$a */
    public static final class C46598a extends AbsDownloadListener {

        /* renamed from: a */
        final /* synthetic */ C46609l f108655a;

        static {
            Covode.recordClassIndex(55188);
        }

        C46598a(C46609l lVar) {
            this.f108655a = lVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:14:0x0065  */
        /* JADX WARNING: Removed duplicated region for block: B:30:0x011e  */
        @Override // com.p2082ss.android.socialbase.downloader.depend.IDownloadListener, com.p2082ss.android.socialbase.downloader.depend.AbsDownloadListener
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void onSuccessed(com.p2082ss.android.socialbase.downloader.model.DownloadInfo r13) {
            /*
            // Method dump skipped, instructions count: 290
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.emoji.sysemoji.C46597h.C46598a.onSuccessed(com.ss.android.socialbase.downloader.model.DownloadInfo):void");
        }

        @Override // com.p2082ss.android.socialbase.downloader.depend.IDownloadListener, com.p2082ss.android.socialbase.downloader.depend.AbsDownloadListener
        public final void onFailed(DownloadInfo downloadInfo, BaseException baseException) {
            Integer num;
            String str;
            super.onFailed(downloadInfo, baseException);
            StringBuilder sb = new StringBuilder("ImSysEmojiManager download failed: ");
            if (baseException != null) {
                num = Integer.valueOf(baseException.getErrorCode());
            } else {
                num = null;
            }
            StringBuilder append = sb.append(num).append(", ");
            if (baseException != null) {
                str = baseException.getMessage();
            } else {
                str = null;
            }
            C51423a.m95791b(3, null, append.append(str).toString());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.emoji.sysemoji.h$b */
    public static final class C46599b extends AbstractC89220m implements AbstractC89172b<C46605i, Boolean> {

        /* renamed from: a */
        final /* synthetic */ int f108656a;

        static {
            Covode.recordClassIndex(55189);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C46599b(int i) {
            super(1);
            this.f108656a = i;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ Boolean invoke(C46605i iVar) {
            C46605i iVar2 = iVar;
            C89219l.m154721d(iVar2, "");
            return Boolean.valueOf(C46597h.m89938a(this.f108656a, iVar2.getBusinessType()));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.emoji.sysemoji.h$f */
    static final class C46604f extends AbstractC89118k implements AbstractC89183m<AbstractC89516am, AbstractC89124d<? super C89391z>, Object> {

        /* renamed from: a */
        int f108662a;

        /* renamed from: b */
        final /* synthetic */ String f108663b;

        /* renamed from: c */
        final /* synthetic */ int f108664c;

        /* renamed from: d */
        final /* synthetic */ List f108665d;

        static {
            Covode.recordClassIndex(55194);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C46604f(String str, int i, List list, AbstractC89124d dVar) {
            super(2, dVar);
            this.f108663b = str;
            this.f108664c = i;
            this.f108665d = list;
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final AbstractC89124d<C89391z> create(Object obj, AbstractC89124d<?> dVar) {
            C89219l.m154721d(dVar, "");
            return new C46604f(this.f108663b, this.f108664c, this.f108665d, dVar);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final Object invoke(AbstractC89516am amVar, AbstractC89124d<? super C89391z> dVar) {
            return ((C46604f) create(amVar, dVar)).invokeSuspend(C89391z.f203057a);
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final Object invokeSuspend(Object obj) {
            if (this.f108662a == 0) {
                C89382r.m154942a(obj);
                C46593f.f108640a.mo79186a(this.f108663b, this.f108665d);
                return C89391z.f203057a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* renamed from: a */
    public static void m89937a(C46609l lVar) {
        C46593f fVar = C46593f.f108640a;
        int i = f108648b;
        if ((i == 1 || i == 2) && f108653g.length() > 0) {
            String[] strArr = new String[2];
            strArr[0] = f108653g;
            String md5 = lVar.getMd5();
            if (md5 == null) {
                C89219l.m154715b();
            }
            strArr[1] = md5;
            fVar.mo79187a(strArr);
            return;
        }
        String[] strArr2 = new String[1];
        String md52 = lVar.getMd5();
        if (md52 == null) {
            C89219l.m154715b();
        }
        strArr2[0] = md52;
        fVar.mo79187a(strArr2);
    }

    /* renamed from: b */
    public static boolean m89940b(int i) {
        C46611n.m89948c();
        C46611n.m89946a();
        C46611n.m89949d();
        boolean z = true;
        if (f108652f.get(Integer.valueOf(i)) == null) {
            if (!C46611n.m89949d() && (C46611n.m89948c() || !m89938a(i, C46611n.m89946a().f108684a))) {
                z = false;
            }
            f108652f.put(Integer.valueOf(i), Boolean.valueOf(z));
            return z;
        }
        Boolean bool = f108652f.get(Integer.valueOf(i));
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.emoji.sysemoji.h$c */
    public static final class C46600c extends AbstractC89118k implements AbstractC89183m<AbstractC89516am, AbstractC89124d<? super C89391z>, Object> {

        /* renamed from: a */
        int f108657a;

        /* renamed from: b */
        final /* synthetic */ String f108658b;

        static {
            Covode.recordClassIndex(55190);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C46600c(String str, AbstractC89124d dVar) {
            super(2, dVar);
            this.f108658b = str;
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final AbstractC89124d<C89391z> create(Object obj, AbstractC89124d<?> dVar) {
            C89219l.m154721d(dVar, "");
            return new C46600c(this.f108658b, dVar);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final Object invoke(AbstractC89516am amVar, AbstractC89124d<? super C89391z> dVar) {
            return ((C46600c) create(amVar, dVar)).invokeSuspend(C89391z.f203057a);
        }

        /* JADX WARNING: Removed duplicated region for block: B:14:0x0048 A[RETURN] */
        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
            // Method dump skipped, instructions count: 140
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.emoji.sysemoji.C46597h.C46600c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.emoji.sysemoji.h$e */
    public static final class C46603e implements AbstractC88406ae<C46607j> {
        static {
            Covode.recordClassIndex(55193);
        }

        @Override // p4560f.p4561a.AbstractC88406ae
        public final void onError(Throwable th) {
            C89219l.m154721d(th, "");
        }

        @Override // p4560f.p4561a.AbstractC88406ae
        public final void onSubscribe(AbstractC88412b bVar) {
            C89219l.m154721d(bVar, "");
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4560f.p4561a.AbstractC88406ae
        public final /* synthetic */ void onSuccess(C46607j jVar) {
            C46607j jVar2 = jVar;
            C89219l.m154721d(jVar2, "");
            if (jVar2.f108672a == 0) {
                C46642d a = C46642d.m90028a();
                C89219l.m154716b(a, "");
                String e = a.mo79254e();
                C89219l.m154716b(e, "");
                if (e.length() > 0) {
                    C51423a.m95784a(3, null, "ImSysEmojiManager refreshEmoji response.isUpdate == 0");
                    C46597h.m89936a();
                    return;
                }
            }
            C51423a.m95784a(3, null, "ImSysEmojiManager refreshEmoji success: ".concat(String.valueOf(jVar2)));
            C46609l lVar = jVar2.f108673b;
            if (lVar == null || C23697c.m44781a(lVar.getMd5()) || C23697c.m44781a(lVar.getResourceUrl())) {
                C51423a.m95791b(3, null, "ImSysEmojiManager refreshEmoji fail: ".concat(String.valueOf(jVar2)));
                return;
            }
            C46642d a2 = C46642d.m90028a();
            C89219l.m154716b(a2, "");
            if (C89219l.m154714a((Object) lVar.getMd5(), (Object) a2.mo79254e())) {
                String md5 = lVar.getMd5();
                if (md5 == null) {
                    C89219l.m154715b();
                }
                C89219l.m154721d(md5, "");
                File file = new File(C46593f.m89926a(md5));
                if (file.exists() && file.isDirectory()) {
                    lVar.getMd5();
                    C46597h.m89937a(lVar);
                    C46597h.m89936a();
                    return;
                }
            }
            C46598a aVar = new C46598a(lVar);
            AbstractC43167a a3 = DownloadServiceManager.INSTANCE.getDownloadService().with(lVar.getResourceUrl()).mo73399a(3);
            a3.f100629f = C46593f.m89925a();
            String md52 = lVar.getMd5();
            if (md52 == null) {
                C89219l.m154715b();
            }
            C89219l.m154721d(md52, "");
            a3.f100626c = md52 + ".zip";
            AbstractC43167a a4 = a3.mo73402a(true).mo73400a("emoji_im_sys_manager");
            a4.f100601D = aVar;
            a4.mo73409f();
        }
    }

    /* renamed from: a */
    public final synchronized List<C46605i> mo79191a(int i) {
        String str;
        List<C46605i> list;
        MethodCollector.m26663i(11152);
        Map<Integer, List<C46605i>> map = f108650d;
        boolean z = true;
        if (map.get(Integer.valueOf(i)) == null || (list = map.get(Integer.valueOf(i))) == null || !(!list.isEmpty())) {
            ArrayList arrayList = new ArrayList();
            List<C46605i> list2 = f108649c;
            if (list2 != null && !list2.isEmpty()) {
                z = false;
            }
            if (z || C46611n.m89949d()) {
                m89942e();
                arrayList.addAll(m89941d());
            } else {
                arrayList.addAll(list2);
            }
            ArrayList arrayList2 = new ArrayList();
            Iterator a = C89309k.m154799a(C89309k.m154809e(C89070n.m154598r(arrayList)), (AbstractC89172b) new C46599b(i)).mo2926a();
            while (a.hasNext()) {
                C46605i iVar = (C46605i) a.next();
                if (iVar.getSupportSkinBusinessType() != i) {
                    List<String> emojiList = iVar.getEmojiList();
                    if (emojiList == null || (str = emojiList.get(0)) == null) {
                        str = "";
                    }
                    iVar.setPreviewEmoji(str);
                }
                arrayList2.add(iVar);
            }
            f108650d.put(Integer.valueOf(i), arrayList2);
            MethodCollector.m26664o(11152);
            return arrayList2;
        }
        List<C46605i> list3 = map.get(Integer.valueOf(i));
        if (list3 == null) {
            C89219l.m154715b();
        }
        List<C46605i> list4 = list3;
        MethodCollector.m26664o(11152);
        return list4;
    }
}
