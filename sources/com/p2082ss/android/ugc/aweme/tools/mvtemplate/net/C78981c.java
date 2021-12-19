package com.p2082ss.android.ugc.aweme.tools.mvtemplate.net;

import android.util.Base64;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.effectplatforn.EffectPlatformFactory;
import com.p2082ss.android.ugc.aweme.mvtheme.MvNetFileBean;
import com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63196au;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.aweme.tools.mvtemplate.p4140e.C78948b;
import com.p2082ss.android.ugc.effectmanager.common.model.BaseNetResponse;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4567d.AbstractC88428a;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4560f.p4561a.p4567d.AbstractC88434g;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89233z;

/* renamed from: com.ss.android.ugc.aweme.tools.mvtemplate.net.c */
public final class C78981c {

    /* renamed from: a */
    public AbstractC88412b f177498a;

    /* renamed from: b */
    public final ArrayList<MvNetFileBean> f177499b = new ArrayList<>();

    /* renamed from: c */
    private final AbstractC89244h f177500c = C89250i.m154773a((AbstractC89171a) C78982a.f177502a);

    /* renamed from: d */
    private final AbstractC89244h f177501d = C89250i.m154773a((AbstractC89171a) C78986e.f177506a);

    static {
        Covode.recordClassIndex(92139);
    }

    /* renamed from: a */
    public final AfrApi mo122801a() {
        return (AfrApi) this.f177500c.getValue();
    }

    /* renamed from: b */
    public final C78975a mo122803b() {
        return (C78975a) this.f177501d.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.mvtemplate.net.c$e */
    static final class C78986e extends AbstractC89220m implements AbstractC89171a<C78975a> {

        /* renamed from: a */
        public static final C78986e f177506a = new C78986e();

        static {
            Covode.recordClassIndex(92144);
        }

        C78986e() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C78975a invoke() {
            return new C78975a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.mvtemplate.net.c$j */
    public static final class C78991j implements AbstractC88428a {

        /* renamed from: a */
        final /* synthetic */ C78981c f177518a;

        static {
            Covode.recordClassIndex(92149);
        }

        public C78991j(C78981c cVar) {
            this.f177518a = cVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88428a
        /* renamed from: a */
        public final void mo8579a() {
            AbstractC88412b bVar;
            AbstractC88412b bVar2 = this.f177518a.f177498a;
            if (bVar2 != null && !bVar2.isDisposed() && (bVar = this.f177518a.f177498a) != null) {
                bVar.dispose();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.mvtemplate.net.c$a */
    static final class C78982a extends AbstractC89220m implements AbstractC89171a<AfrApi> {

        /* renamed from: a */
        public static final C78982a f177502a = new C78982a();

        static {
            Covode.recordClassIndex(92140);
        }

        C78982a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ AfrApi invoke() {
            String itemName = EffectPlatformFactory.m89604a().getHosts().get(0).getItemName();
            AbstractC63196au C = C63244g.m114602a().mo73257C();
            C89219l.m154716b(itemName, "");
            return C.createRetrofit(itemName, true, AfrApi.class);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.mvtemplate.net.c$b */
    public static final class C78983b<T, R> implements AbstractC88434g {

        /* renamed from: a */
        public static final C78983b f177503a = new C78983b();

        static {
            Covode.recordClassIndex(92141);
        }

        C78983b() {
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88434g
        public final /* synthetic */ Object apply(Object obj) {
            C89219l.m154721d(obj, "");
            ImageResponse imageResponse = new ImageResponse();
            imageResponse.status_code = -1;
            return imageResponse;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.mvtemplate.net.c$c */
    public static final class C78984c<T, R> implements AbstractC88434g {

        /* renamed from: a */
        public static final C78984c f177504a = new C78984c();

        static {
            Covode.recordClassIndex(92142);
        }

        C78984c() {
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88434g
        public final /* synthetic */ Object apply(Object obj) {
            C89219l.m154721d(obj, "");
            ImageResponse imageResponse = new ImageResponse();
            imageResponse.status_code = -1;
            return imageResponse;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.mvtemplate.net.c$d */
    public static final class C78985d<T, R> implements AbstractC88434g {

        /* renamed from: a */
        public static final C78985d f177505a = new C78985d();

        static {
            Covode.recordClassIndex(92143);
        }

        C78985d() {
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88434g
        public final /* synthetic */ Object apply(Object obj) {
            C89219l.m154721d(obj, "");
            VideoResponse videoResponse = new VideoResponse();
            videoResponse.status_code = -1;
            return videoResponse;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.mvtemplate.net.c$h */
    public static final class C78989h<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C78981c f177511a;

        /* renamed from: b */
        final /* synthetic */ C89233z.C89236c f177512b;

        /* renamed from: c */
        final /* synthetic */ AbstractC78993e f177513c;

        /* renamed from: d */
        final /* synthetic */ C89233z.C89238e f177514d;

        static {
            Covode.recordClassIndex(92147);
        }

        public C78989h(C78981c cVar, C89233z.C89236c cVar2, AbstractC78993e eVar, C89233z.C89238e eVar2) {
            this.f177511a = cVar;
            this.f177512b = cVar2;
            this.f177513c = eVar;
            this.f177514d = eVar2;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            if (this.f177512b.element == 0) {
                this.f177513c.mo122716a(this.f177511a.f177499b);
            } else {
                this.f177513c.mo122717a(this.f177511a.f177499b, this.f177514d.element);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.mvtemplate.net.c$i */
    public static final class C78990i<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C78981c f177515a;

        /* renamed from: b */
        final /* synthetic */ AbstractC78993e f177516b;

        /* renamed from: c */
        final /* synthetic */ C89233z.C89238e f177517c;

        static {
            Covode.recordClassIndex(92148);
        }

        public C78990i(C78981c cVar, AbstractC78993e eVar, C89233z.C89238e eVar2) {
            this.f177515a = cVar;
            this.f177516b = eVar;
            this.f177517c = eVar2;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            AbstractC88412b bVar;
            this.f177516b.mo122717a(this.f177515a.f177499b, this.f177517c.element);
            AbstractC88412b bVar2 = this.f177515a.f177498a;
            if (bVar2 != null && !bVar2.isDisposed() && (bVar = this.f177515a.f177498a) != null) {
                bVar.dispose();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.mvtemplate.net.c$f */
    public static final class C78987f<T, R> implements AbstractC88434g {

        /* renamed from: a */
        final /* synthetic */ C89233z.C89236c f177507a;

        /* renamed from: b */
        final /* synthetic */ C89233z.C89238e f177508b;

        static {
            Covode.recordClassIndex(92145);
        }

        public C78987f(C89233z.C89236c cVar, C89233z.C89238e eVar) {
            this.f177507a = cVar;
            this.f177508b = eVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88434g
        public final /* synthetic */ Object apply(Object obj) {
            Object[] objArr = (Object[]) obj;
            C89219l.m154721d(objArr, "");
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : objArr) {
                if (obj2 instanceof BaseNetResponse) {
                    BaseNetResponse baseNetResponse = (BaseNetResponse) obj2;
                    if (baseNetResponse.status_code == 0) {
                        arrayList.add(obj2);
                    } else {
                        this.f177507a.element++;
                        String str = baseNetResponse.message;
                        if (str != null && str.length() > 0) {
                            C89233z.C89238e eVar = this.f177508b;
                            T t = (T) baseNetResponse.message;
                            if (t == null) {
                                C89219l.m154715b();
                            }
                            eVar.element = t;
                        }
                    }
                }
            }
            return arrayList;
        }
    }

    /* renamed from: a */
    private static String m137806a(String str) {
        boolean z;
        MethodCollector.m26663i(7336);
        if (str != null) {
            boolean z2 = true;
            if (str.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                byte[] decode = Base64.decode(str, 0);
                String str2 = (C78948b.m137762a("resize_bitmap_tmp") + File.separator) + C78948b.m137769c(".mp4");
                try {
                    File file = new File(str2);
                    if (!file.exists()) {
                        file.createNewFile();
                    }
                    BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file));
                    bufferedOutputStream.write(decode);
                    bufferedOutputStream.flush();
                    bufferedOutputStream.close();
                } catch (Exception unused) {
                    z2 = false;
                }
                MethodCollector.m26664o(7336);
                if (z2) {
                    return str2;
                }
                return "";
            }
        }
        MethodCollector.m26664o(7336);
        return "";
    }

    /* renamed from: a */
    public final boolean mo122802a(VideoResponse videoResponse) {
        VideoItem videoItem;
        VideoItemInfo data = videoResponse.getData();
        if (data == null || (videoItem = data.getVideoItem()) == null || data.getKey().length() == 0) {
            return true;
        }
        String key = data.getKey();
        String b = mo122803b().mo122795b(key);
        String a = m137806a(videoItem.getContent());
        if (a.length() <= 0 || videoItem.getAlgorithm().length() <= 0 || b.length() <= 0) {
            return true;
        }
        MvNetFileBean mvNetFileBean = new MvNetFileBean(b, videoItem.getAlgorithm(), a, videoItem.getJsonResult());
        mo122803b().mo122794a(key, videoItem.getAlgorithm(), mvNetFileBean);
        this.f177499b.add(mvNetFileBean);
        return false;
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.mvtemplate.net.c$g */
    public static final class C78988g<T, R> implements AbstractC88434g {

        /* renamed from: a */
        final /* synthetic */ C78981c f177509a;

        /* renamed from: b */
        final /* synthetic */ C89233z.C89236c f177510b;

        static {
            Covode.recordClassIndex(92146);
        }

        public C78988g(C78981c cVar, C89233z.C89236c cVar2) {
            this.f177509a = cVar;
            this.f177510b = cVar2;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:34:0x010d, code lost:
            if (r1 != false) goto L_0x0074;
         */
        @Override // p4560f.p4561a.p4567d.AbstractC88434g
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ java.lang.Object apply(java.lang.Object r17) {
            /*
            // Method dump skipped, instructions count: 306
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.tools.mvtemplate.net.C78981c.C78988g.apply(java.lang.Object):java.lang.Object");
        }
    }
}
