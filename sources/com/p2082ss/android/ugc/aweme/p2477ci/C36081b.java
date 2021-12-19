package com.p2082ss.android.ugc.aweme.p2477ci;

import android.app.Application;
import android.graphics.Bitmap;
import android.text.TextUtils;
import com.bytedance.common.utility.p909d.C13609b;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.asve.editor.C31068c;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63247i;
import com.p2082ss.android.ugc.aweme.property.C65357b;
import com.p2082ss.android.ugc.tools.utils.C84902i;
import java.io.File;
import java.util.concurrent.Callable;
import kotlinx.coroutines.AbstractC89516am;
import kotlinx.coroutines.AbstractC89568bz;
import kotlinx.coroutines.C89546bf;
import kotlinx.coroutines.C89561bs;
import kotlinx.coroutines.C89624i;
import p4600h.C89382r;
import p4600h.C89391z;
import p4600h.p4603c.AbstractC89124d;
import p4600h.p4603c.p4604a.EnumC89098a;
import p4600h.p4603c.p4605b.p4606a.AbstractC89118k;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ci.b */
public final class C36081b {

    /* renamed from: a */
    public static final String f85246a;

    /* renamed from: b */
    private static final String f85247b;

    /* renamed from: com.ss.android.ugc.aweme.ci.b$a */
    public static final class CallableC36082a<V> implements Callable {

        /* renamed from: a */
        public static final CallableC36082a f85248a = new CallableC36082a();

        static {
            Covode.recordClassIndex(43335);
        }

        CallableC36082a() {
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            C13609b.m24452a(C36081b.f85246a);
            return C89391z.f203057a;
        }
    }

    static {
        Covode.recordClassIndex(43334);
        C89219l.m154721d("resize_bitmap_tmp", "");
        C89219l.m154721d("resize_bitmap_tmp", "");
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        Application application = C63247i.f143610a;
        C89219l.m154716b(application, "");
        File filesDir = application.getFilesDir();
        C89219l.m154716b(filesDir, "");
        String sb3 = sb.append(sb2.append(filesDir.getAbsolutePath()).append(File.separator).append("upload_pic_sticker").toString()).append(File.separator).append("resize_bitmap_tmp").toString();
        if (!new File(sb3).exists()) {
            new File(sb3).mkdirs();
        }
        String a = C89219l.m154704a(sb3, (Object) File.separator);
        f85247b = a;
        f85246a = a + "PixelLoopResize.bmp";
    }

    /* renamed from: com.ss.android.ugc.aweme.ci.b$b */
    static final class C36083b extends AbstractC89118k implements AbstractC89183m<AbstractC89516am, AbstractC89124d<? super C89391z>, Object> {

        /* renamed from: a */
        int f85249a;

        /* renamed from: b */
        final /* synthetic */ String f85250b;

        /* renamed from: c */
        final /* synthetic */ String f85251c;

        /* renamed from: d */
        final /* synthetic */ int[] f85252d;

        /* renamed from: e */
        final /* synthetic */ AbstractC89172b f85253e;

        static {
            Covode.recordClassIndex(43336);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C36083b(String str, String str2, int[] iArr, AbstractC89172b bVar, AbstractC89124d dVar) {
            super(2, dVar);
            this.f85250b = str;
            this.f85251c = str2;
            this.f85252d = iArr;
            this.f85253e = bVar;
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final AbstractC89124d<C89391z> create(Object obj, AbstractC89124d<?> dVar) {
            C89219l.m154721d(dVar, "");
            return new C36083b(this.f85250b, this.f85251c, this.f85252d, this.f85253e, dVar);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final Object invoke(AbstractC89516am amVar, AbstractC89124d<? super C89391z> dVar) {
            return ((C36083b) create(amVar, dVar)).invokeSuspend(C89391z.f203057a);
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final Object invokeSuspend(Object obj) {
            EnumC89098a aVar = EnumC89098a.COROUTINE_SUSPENDED;
            int i = this.f85249a;
            if (i == 0) {
                C89382r.m154942a(obj);
                String str = this.f85250b;
                String str2 = this.f85251c;
                int[] iArr = this.f85252d;
                int i2 = iArr[0];
                int i3 = iArr[1];
                Bitmap.CompressFormat compressFormat = Bitmap.CompressFormat.PNG;
                this.f85249a = 1;
                obj = C89624i.m155554a(C89546bf.f203267b, new C36084c(str, i2, i3, 4, str2, compressFormat, null), this);
                if (obj == aVar) {
                    return aVar;
                }
            } else if (i == 1) {
                C89382r.m154942a(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            if (!((Boolean) obj).booleanValue() || !C84902i.m145892a(this.f85251c)) {
                this.f85253e.invoke(this.f85250b);
            } else {
                this.f85253e.invoke(this.f85251c);
            }
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.ci.b$c */
    public static final class C36084c extends AbstractC89118k implements AbstractC89183m<AbstractC89516am, AbstractC89124d<? super Boolean>, Object> {

        /* renamed from: a */
        int f85254a;

        /* renamed from: b */
        final /* synthetic */ String f85255b;

        /* renamed from: c */
        final /* synthetic */ int f85256c;

        /* renamed from: d */
        final /* synthetic */ int f85257d;

        /* renamed from: e */
        final /* synthetic */ int f85258e;

        /* renamed from: f */
        final /* synthetic */ String f85259f;

        /* renamed from: g */
        final /* synthetic */ Bitmap.CompressFormat f85260g;

        static {
            Covode.recordClassIndex(43337);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C36084c(String str, int i, int i2, int i3, String str2, Bitmap.CompressFormat compressFormat, AbstractC89124d dVar) {
            super(2, dVar);
            this.f85255b = str;
            this.f85256c = i;
            this.f85257d = i2;
            this.f85258e = i3;
            this.f85259f = str2;
            this.f85260g = compressFormat;
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final AbstractC89124d<C89391z> create(Object obj, AbstractC89124d<?> dVar) {
            C89219l.m154721d(dVar, "");
            return new C36084c(this.f85255b, this.f85256c, this.f85257d, this.f85258e, this.f85259f, this.f85260g, dVar);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final Object invoke(AbstractC89516am amVar, AbstractC89124d<? super Boolean> dVar) {
            return ((C36084c) create(amVar, dVar)).invokeSuspend(C89391z.f203057a);
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final Object invokeSuspend(Object obj) {
            if (this.f85254a == 0) {
                C89382r.m154942a(obj);
                if (!C84902i.m145892a(this.f85255b)) {
                    return false;
                }
                Bitmap a = C36080a.m73531a(this.f85255b, this.f85256c, this.f85257d, C36080a.m73537b(this.f85255b), this.f85258e);
                if (a == null) {
                    return false;
                }
                return Boolean.valueOf(C36080a.m73535a(a, new File(this.f85259f), this.f85260g));
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* renamed from: a */
    public static final void m73539a(String str, String str2, AbstractC89172b<? super String, C89391z> bVar) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C89219l.m154721d(bVar, "");
        int[] h = C65357b.m117052h();
        if (h == null) {
            h = new int[]{720, 1280};
        }
        C89219l.m154716b(h, "");
        if (TextUtils.isEmpty(str) || !C84902i.m145892a(str) || h.length < 2) {
            bVar.invoke(str);
        } else {
            AbstractC89568bz unused = C89624i.m155555a(C89561bs.f203280a, C31068c.f74429a, null, new C36083b(str, str2, h, bVar, null), 2);
        }
    }
}
