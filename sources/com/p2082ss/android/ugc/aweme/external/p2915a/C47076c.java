package com.p2082ss.android.ugc.aweme.external.p2915a;

import android.content.res.TypedArray;
import android.graphics.BitmapFactory;
import com.bytedance.common.utility.C13617h;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.external.p2915a.C47092e;
import com.p2082ss.android.ugc.aweme.photo.C62857b;
import com.p2082ss.android.ugc.aweme.photo.C62870g;
import com.p2082ss.android.ugc.aweme.photo.PhotoContext;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63238c;
import com.p2082ss.android.ugc.aweme.services.external.ability.IAVProcessService;
import com.p2082ss.android.ugc.aweme.services.video.ImVideoCompileService;
import com.p2082ss.android.ugc.aweme.shortvideo.festival.C71848m;
import com.p2082ss.android.ugc.aweme.shortvideo.festival.C71850o;
import com.p2082ss.android.ugc.aweme.shortvideo.p3793af.C69823b;
import com.p2082ss.android.ugc.aweme.shortvideo.util.C73991bj;
import com.p2082ss.android.ugc.aweme.watermark.C81490d;
import com.p2082ss.android.ugc.aweme.watermark.C81492e;
import com.p2082ss.android.ugc.aweme.watermark.C81507q;
import com.p2082ss.android.ugc.aweme.watermark.C81508r;
import com.p2082ss.android.ugc.trill.R;
import com.p2082ss.android.vesdk.VEUtils;
import java.util.ArrayList;
import java.util.List;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.external.a.c */
public final class C47076c implements IAVProcessService {
    static {
        Covode.recordClassIndex(55680);
    }

    /* renamed from: com.ss.android.ugc.aweme.external.a.c$b */
    static final class C47080b extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ AbstractC89172b f109647a;

        static {
            Covode.recordClassIndex(55684);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C47080b(AbstractC89172b bVar) {
            super(0);
            this.f109647a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            this.f109647a.invoke(new Throwable());
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.external.a.c$d */
    static final class C47082d extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ IAVProcessService.IProcessCallback f109651a;

        static {
            Covode.recordClassIndex(55686);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C47082d(IAVProcessService.IProcessCallback iProcessCallback) {
            super(0);
            this.f109651a = iProcessCallback;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            IAVProcessService.IProcessCallback iProcessCallback = this.f109651a;
            if (iProcessCallback != null) {
                iProcessCallback.finish(-1);
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.external.a.c$c */
    static final class C47081c extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ IAVProcessService.IProcessCallback f109648a;

        /* renamed from: b */
        final /* synthetic */ String f109649b;

        /* renamed from: c */
        final /* synthetic */ String f109650c;

        static {
            Covode.recordClassIndex(55685);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C47081c(IAVProcessService.IProcessCallback iProcessCallback, String str, String str2) {
            super(0);
            this.f109648a = iProcessCallback;
            this.f109649b = str;
            this.f109650c = str2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            IAVProcessService.IProcessCallback iProcessCallback = this.f109648a;
            if (iProcessCallback != null) {
                iProcessCallback.finish(Integer.valueOf(VEUtils.extractVideo(this.f109649b, this.f109650c)));
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.external.a.c$a */
    static final class C47077a extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ IAVProcessService.CompileParam f109642a;

        /* renamed from: b */
        final /* synthetic */ AbstractC89172b f109643b;

        /* renamed from: c */
        final /* synthetic */ AbstractC89172b f109644c;

        static {
            Covode.recordClassIndex(55681);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C47077a(IAVProcessService.CompileParam compileParam, AbstractC89172b bVar, AbstractC89172b bVar2) {
            super(0);
            this.f109642a = compileParam;
            this.f109643b = bVar;
            this.f109644c = bVar2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            ImVideoCompileService.Companion.getInstance().compileImVideo(this.f109642a).mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143254a(new AbstractC88433f(this) {
                /* class com.p2082ss.android.ugc.aweme.external.p2915a.C47076c.C47077a.C470781 */

                /* renamed from: a */
                final /* synthetic */ C47077a f109645a;

                static {
                    Covode.recordClassIndex(55682);
                }

                {
                    this.f109645a = r1;
                }

                @Override // p4560f.p4561a.p4567d.AbstractC88433f
                public final /* synthetic */ void accept(Object obj) {
                    AbstractC89172b bVar = this.f109645a.f109643b;
                    C89219l.m154716b(obj, "");
                    bVar.invoke(obj);
                }
            }, new AbstractC88433f(this) {
                /* class com.p2082ss.android.ugc.aweme.external.p2915a.C47076c.C47077a.C470792 */

                /* renamed from: a */
                final /* synthetic */ C47077a f109646a;

                static {
                    Covode.recordClassIndex(55683);
                }

                {
                    this.f109646a = r1;
                }

                @Override // p4560f.p4561a.p4567d.AbstractC88433f
                public final /* synthetic */ void accept(Object obj) {
                    AbstractC89172b bVar = this.f109646a.f109644c;
                    C89219l.m154716b(obj, "");
                    bVar.invoke(obj);
                }
            });
            return C89391z.f203057a;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.services.external.ability.IAVProcessService
    public final int[] getVideoFileInfo(String str) {
        int[] b = C69823b.m123389b(str);
        C89219l.m154716b(b, "");
        return b;
    }

    @Override // com.p2082ss.android.ugc.aweme.services.external.ability.IAVProcessService
    public final void compileVideo(IAVProcessService.CompileParam compileParam, AbstractC89172b<? super IAVProcessService.CompileResult, C89391z> bVar, AbstractC89172b<? super Throwable, C89391z> bVar2) {
        C89219l.m154721d(compileParam, "");
        C89219l.m154721d(bVar, "");
        C89219l.m154721d(bVar2, "");
        C47092e.C47093a aVar = new C47092e.C47093a();
        aVar.f109675c = false;
        C47092e.C47093a a = aVar.mo79415a(new C47077a(compileParam, bVar, bVar2));
        a.f109673a = new C47080b(bVar2);
        a.mo79416a();
    }

    @Override // com.p2082ss.android.ugc.aweme.services.external.ability.IAVProcessService
    public final void muteVideo(String str, String str2, IAVProcessService.IProcessCallback<Integer> iProcessCallback) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C47092e.C47093a aVar = new C47092e.C47093a();
        aVar.f109675c = false;
        C47092e.C47093a a = aVar.mo79415a(new C47081c(iProcessCallback, str, str2));
        a.f109673a = new C47082d(iProcessCallback);
        a.mo79416a();
    }

    @Override // com.p2082ss.android.ugc.aweme.services.external.ability.IAVProcessService
    public final void compressPhoto(String str, Integer num, Integer num2, IAVProcessService.IProcessCallback<String> iProcessCallback) {
        PhotoContext a;
        String str2;
        String str3;
        C89219l.m154721d(str, "");
        C73991bj.m130131b("PhotoServiceMonitor===> enter compressPhoto " + System.currentTimeMillis());
        if (num == null || num2 == null) {
            a = C62870g.m113284a(str, new C62857b(), 1080, 1920);
        } else {
            a = C62870g.m113284a(str, new C62857b(), num.intValue(), num2.intValue());
        }
        C73991bj.m130131b("PhotoServiceMonitor===> return compressPhoto " + System.currentTimeMillis());
        if (iProcessCallback != null) {
            if (a == null || (str3 = a.mPhotoLocalPath) == null) {
                str2 = null;
            } else {
                str2 = str3.toString();
            }
            iProcessCallback.finish(str2);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.services.external.ability.IAVProcessService
    public final void createWaterMarkImages(String str, String str2, String str3, String str4, boolean z, IAVProcessService.IProcessCallback<String[]> iProcessCallback) {
        C81507q[] qVarArr;
        MethodCollector.m26663i(7704);
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C89219l.m154721d(str3, "");
        if (iProcessCallback != null) {
            List<C71848m> a = C71850o.m126875a(str4);
            int i = 0;
            if (C13617h.m24465a(a)) {
                TypedArray obtainTypedArray = C63238c.f143574a.getResources().obtainTypedArray(R.array.b1);
                int length = obtainTypedArray.length();
                int[] iArr = new int[length];
                ArrayList arrayList = new ArrayList();
                int i2 = 0;
                while (i2 < length) {
                    C81507q qVar = new C81507q();
                    iArr[i2] = obtainTypedArray.getResourceId(i2, i);
                    qVar.mo125224a(str, BitmapFactory.decodeResource(C63238c.f143574a.getResources(), iArr[i2], null), z);
                    arrayList.add(qVar);
                    i2++;
                    i = 0;
                }
                obtainTypedArray.recycle();
                qVarArr = (C81507q[]) arrayList.toArray(new C81507q[arrayList.size()]);
            } else {
                ArrayList arrayList2 = new ArrayList();
                for (int i3 = 0; i3 < a.size(); i3++) {
                    C81507q qVar2 = new C81507q();
                    qVar2.mo125224a(str, BitmapFactory.decodeFile(a.get(i3).f161018b), z);
                    arrayList2.add(qVar2);
                }
                qVarArr = (C81507q[]) arrayList2.toArray(new C81507q[arrayList2.size()]);
            }
            String[] a2 = C81508r.m141344a(qVarArr, str2, str3);
            C89219l.m154716b(a2, "");
            iProcessCallback.finish(a2);
            MethodCollector.m26664o(7704);
            return;
        }
        MethodCollector.m26664o(7704);
    }

    @Override // com.p2082ss.android.ugc.aweme.services.external.ability.IAVProcessService
    public final void createWaterMarkImages(int i, int i2, String str, String str2, String str3, boolean z, boolean z2, String str4, boolean z3, IAVProcessService.IProcessCallback<String[]> iProcessCallback) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C89219l.m154721d(str3, "");
        C89219l.m154721d(str4, "");
        if (iProcessCallback != null) {
            String[] a = C81492e.m141306a(C81492e.m141305a(i, i2, str, z, z2, z3, new C81490d.C81491a().mo125203a(str4).mo125204a()), str2, str3);
            C89219l.m154716b(a, "");
            iProcessCallback.finish(a);
        }
    }
}
