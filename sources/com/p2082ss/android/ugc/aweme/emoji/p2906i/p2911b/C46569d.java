package com.p2082ss.android.ugc.aweme.emoji.p2906i.p2911b;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import com.bytedance.covode.number.Covode;
import com.bytedance.p1777x.p1780c.C23697c;
import com.p2082ss.android.socialbase.downloader.depend.AbsDownloadListener;
import com.p2082ss.android.socialbase.downloader.exception.BaseException;
import com.p2082ss.android.socialbase.downloader.model.DownloadInfo;
import com.p2082ss.android.ugc.aweme.download.component_api.AbstractC43167a;
import com.p2082ss.android.ugc.aweme.download.component_api.DownloadServiceManager;
import com.p2082ss.android.ugc.aweme.emoji.p2906i.p2911b.p2912a.C46559b;
import com.p2082ss.android.ugc.aweme.emoji.p2906i.p2911b.p2912a.C46560c;
import com.p2082ss.android.ugc.aweme.emoji.p2906i.p2911b.p2912a.C46561d;
import com.p2082ss.android.ugc.aweme.emoji.utils.C46640b;
import com.p2082ss.android.ugc.aweme.emoji.utils.C46642d;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import java.io.File;
import java.util.LinkedHashMap;
import kotlinx.coroutines.AbstractC89516am;
import kotlinx.coroutines.AbstractC89568bz;
import kotlinx.coroutines.AbstractC89587ci;
import kotlinx.coroutines.C89517an;
import kotlinx.coroutines.C89546bf;
import kotlinx.coroutines.C89624i;
import kotlinx.coroutines.internal.C89652o;
import p4560f.p4561a.AbstractC88403ab;
import p4560f.p4561a.AbstractC88406ae;
import p4560f.p4561a.AbstractC88984x;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89382r;
import p4600h.C89391z;
import p4600h.p4603c.AbstractC89124d;
import p4600h.p4603c.p4604a.EnumC89098a;
import p4600h.p4603c.p4605b.p4606a.AbstractC89118k;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.emoji.i.b.d */
public final class C46569d {

    /* renamed from: a */
    static C46560c f108581a;

    /* renamed from: b */
    static C46562b f108582b;

    /* renamed from: c */
    static volatile String f108583c;

    /* renamed from: d */
    static volatile int f108584d = 1;

    /* renamed from: e */
    public static final C46569d f108585e = new C46569d();

    /* renamed from: f */
    private static final AbstractC89516am f108586f;

    /* renamed from: g */
    private static final AbstractC89244h f108587g = C89250i.m154773a((AbstractC89171a) C46571b.f108590a);

    /* renamed from: h */
    private static final AbstractC89244h f108588h = C89250i.m154773a((AbstractC89171a) C46572c.f108591a);

    /* renamed from: a */
    public static LinkedHashMap<String, String> m89876a() {
        return (LinkedHashMap) f108587g.getValue();
    }

    /* renamed from: b */
    public static LinkedHashMap<String, String> m89878b() {
        return (LinkedHashMap) f108588h.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.emoji.i.b.d$e */
    public static final class C46575e implements AbstractC88406ae<C46561d> {
        static {
            Covode.recordClassIndex(55162);
        }

        @Override // p4560f.p4561a.AbstractC88406ae
        public final void onSubscribe(AbstractC88412b bVar) {
            C89219l.m154721d(bVar, "");
        }

        C46575e() {
        }

        @Override // p4560f.p4561a.AbstractC88406ae
        public final void onError(Throwable th) {
            C89219l.m154721d(th, "");
            C51423a.m95790a(th);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4560f.p4561a.AbstractC88406ae
        public final /* synthetic */ void onSuccess(C46561d dVar) {
            C46561d dVar2 = dVar;
            C89219l.m154721d(dVar2, "");
            if (dVar2.f108565b == 1) {
                C46642d a = C46642d.m90028a();
                C89219l.m154716b(a, "");
                a.mo79250a("");
                C51423a.m95784a(3, null, "OnlineEmojiResManager refreshEmoji fallback");
                return;
            }
            C46559b bVar = dVar2.f108564a;
            if (bVar == null || C23697c.m44781a(bVar.getMd5()) || C23697c.m44781a(bVar.getResourceUrl())) {
                C51423a.m95791b(3, null, "OnlineEmojiResManager refreshEmoji fail: ".concat(String.valueOf(dVar2)));
                return;
            }
            C46642d a2 = C46642d.m90028a();
            C89219l.m154716b(a2, "");
            if (C89219l.m154714a((Object) bVar.getMd5(), (Object) a2.mo79253d())) {
                String md5 = bVar.getMd5();
                if (md5 == null) {
                    C89219l.m154715b();
                }
                C89219l.m154721d(md5, "");
                File file = new File(C46566c.m89866a(md5));
                if (file.exists() && file.isDirectory()) {
                    bVar.getMd5();
                    C46569d.m89877a(bVar);
                    return;
                }
            }
            C46570a aVar = new C46570a(bVar);
            AbstractC43167a a3 = DownloadServiceManager.INSTANCE.getDownloadService().with(bVar.getResourceUrl()).mo73399a(3);
            a3.f100629f = C46566c.m89865a();
            String md52 = bVar.getMd5();
            if (md52 == null) {
                C89219l.m154715b();
            }
            C89219l.m154721d(md52, "");
            a3.f100626c = md52 + ".zip";
            a3.f100601D = aVar;
            a3.mo73402a(DownloadServiceManager.INSTANCE.isAutoRemoveListener()).mo73400a("emoji_online_small").mo73409f();
        }
    }

    private C46569d() {
    }

    /* renamed from: com.ss.android.ugc.aweme.emoji.i.b.d$b */
    static final class C46571b extends AbstractC89220m implements AbstractC89171a<LinkedHashMap<String, String>> {

        /* renamed from: a */
        public static final C46571b f108590a = new C46571b();

        static {
            Covode.recordClassIndex(55158);
        }

        C46571b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ LinkedHashMap<String, String> invoke() {
            return new LinkedHashMap();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.emoji.i.b.d$c */
    static final class C46572c extends AbstractC89220m implements AbstractC89171a<LinkedHashMap<String, String>> {

        /* renamed from: a */
        public static final C46572c f108591a = new C46572c();

        static {
            Covode.recordClassIndex(55159);
        }

        C46572c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ LinkedHashMap<String, String> invoke() {
            return new LinkedHashMap();
        }
    }

    /* renamed from: c */
    public static boolean m89879c() {
        if (f108584d == 2) {
            return true;
        }
        C51423a.m95791b(3, null, "OnlineEmojiResManager not enabled: " + f108584d);
        return false;
    }

    /* renamed from: d */
    public static void m89880d() {
        AbstractC88403ab.m153601a((AbstractC88984x) C46640b.f108757a.getSmallEmojiResources()).mo142918b(C88925a.m154180b(C88946a.f201991c)).mo116431a_(new C46575e());
    }

    static {
        boolean z;
        Covode.recordClassIndex(55156);
        AbstractC89516am a = C89517an.m155448a(C89546bf.f203267b);
        f108586f = a;
        f108583c = "";
        C46642d a2 = C46642d.m90028a();
        C89219l.m154716b(a2, "");
        String d = a2.mo79253d();
        C89219l.m154716b(d, "");
        if (d.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            C51423a.m95784a(3, null, "OnlineEmojiResManager preloadResourceInfo lastCacheMd5 empty");
            return;
        }
        f108583c = d;
        AbstractC89568bz unused = C89624i.m155555a(a, null, null, new C46573d(d, null), 3);
    }

    /* renamed from: com.ss.android.ugc.aweme.emoji.i.b.d$a */
    public static final class C46570a extends AbsDownloadListener {

        /* renamed from: a */
        final /* synthetic */ C46559b f108589a;

        static {
            Covode.recordClassIndex(55157);
        }

        C46570a(C46559b bVar) {
            this.f108589a = bVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:14:0x0065  */
        /* JADX WARNING: Removed duplicated region for block: B:30:0x00fa  */
        @Override // com.p2082ss.android.socialbase.downloader.depend.IDownloadListener, com.p2082ss.android.socialbase.downloader.depend.AbsDownloadListener
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void onSuccessed(com.p2082ss.android.socialbase.downloader.model.DownloadInfo r13) {
            /*
            // Method dump skipped, instructions count: 254
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.emoji.p2906i.p2911b.C46569d.C46570a.onSuccessed(com.ss.android.socialbase.downloader.model.DownloadInfo):void");
        }

        @Override // com.p2082ss.android.socialbase.downloader.depend.IDownloadListener, com.p2082ss.android.socialbase.downloader.depend.AbsDownloadListener
        public final void onFailed(DownloadInfo downloadInfo, BaseException baseException) {
            Integer num;
            String str;
            super.onFailed(downloadInfo, baseException);
            StringBuilder sb = new StringBuilder("OnlineEmojiResManager download failed: ");
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

    /* renamed from: a */
    static Drawable m89874a(Context context) {
        Resources resources;
        if (context == null || (resources = context.getResources()) == null) {
            return null;
        }
        return resources.getDrawable(2131231992);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.emoji.i.b.d$d */
    public static final class C46573d extends AbstractC89118k implements AbstractC89183m<AbstractC89516am, AbstractC89124d<? super C89391z>, Object> {

        /* renamed from: a */
        int f108592a;

        /* renamed from: b */
        final /* synthetic */ String f108593b;

        static {
            Covode.recordClassIndex(55160);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C46573d(String str, AbstractC89124d dVar) {
            super(2, dVar);
            this.f108593b = str;
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final AbstractC89124d<C89391z> create(Object obj, AbstractC89124d<?> dVar) {
            C89219l.m154721d(dVar, "");
            return new C46573d(this.f108593b, dVar);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final Object invoke(AbstractC89516am amVar, AbstractC89124d<? super C89391z> dVar) {
            return ((C46573d) create(amVar, dVar)).invokeSuspend(C89391z.f203057a);
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final Object invokeSuspend(Object obj) {
            EnumC89098a aVar = EnumC89098a.COROUTINE_SUSPENDED;
            int i = this.f108592a;
            if (i == 0) {
                C89382r.m154942a(obj);
                String str = this.f108593b;
                C89219l.m154716b(str, "");
                final C46560c c = C46566c.m89870c(str);
                AbstractC89587ci ciVar = C89652o.f203399a;
                C465741 r1 = new AbstractC89183m<AbstractC89516am, AbstractC89124d<? super C89391z>, Object>(this, null) {
                    /* class com.p2082ss.android.ugc.aweme.emoji.p2906i.p2911b.C46569d.C46573d.C465741 */

                    /* renamed from: a */
                    int f108594a;

                    /* renamed from: b */
                    final /* synthetic */ C46573d f108595b;

                    static {
                        Covode.recordClassIndex(55161);
                    }

                    {
                        this.f108595b = r2;
                    }

                    @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
                    public final AbstractC89124d<C89391z> create(Object obj, AbstractC89124d<?> dVar) {
                        C89219l.m154721d(dVar, "");
                        return 

                        /* renamed from: a */
                        static String m89875a(String str) {
                            if (!m89879c()) {
                                return null;
                            }
                            String str2 = m89876a().get(str);
                            if (str2 != null) {
                                return str2;
                            }
                            C51423a.m95784a(3, null, "OnlineEmojiResManager mapResource not found: ".concat(String.valueOf(str)));
                            return null;
                        }

                        /* renamed from: a */
                        public static void m89877a(C46559b bVar) {
                            C46566c cVar = C46566c.f108575a;
                            int i = f108584d;
                            if ((i == 1 || i == 2) && f108583c.length() > 0) {
                                String[] strArr = new String[2];
                                strArr[0] = f108583c;
                                String md5 = bVar.getMd5();
                                if (md5 == null) {
                                    C89219l.m154715b();
                                }
                                strArr[1] = md5;
                                cVar.mo79168a(strArr);
                                return;
                            }
                            String[] strArr2 = new String[1];
                            String md52 = bVar.getMd5();
                            if (md52 == null) {
                                C89219l.m154715b();
                            }
                            strArr2[0] = md52;
                            cVar.mo79168a(strArr2);
                        }
                    }
