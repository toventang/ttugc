package com.p2082ss.android.ugc.aweme.tools.music.aichoosemusic.p4122b;

import android.graphics.Bitmap;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.p2432c.C35335b;
import com.p2082ss.android.vesdk.AbstractC85304ab;
import dmt.p4542av.video.C88151a;
import java.io.File;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.NoSuchElementException;
import p4600h.C89379q;
import p4600h.p4601a.C89064i;
import p4600h.p4603c.AbstractC89124d;
import p4600h.p4603c.p4605b.p4606a.AbstractC89110d;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89233z;

/* renamed from: com.ss.android.ugc.aweme.tools.music.aichoosemusic.b.b */
public final class C78718b extends AbstractC78708a {

    /* renamed from: e */
    private final C35335b f176896e;

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.tools.music.aichoosemusic.b.b$a */
    public static final class C78719a extends AbstractC89110d {

        /* renamed from: a */
        /* synthetic */ Object f176897a;

        /* renamed from: b */
        int f176898b;

        /* renamed from: c */
        final /* synthetic */ C78718b f176899c;

        /* renamed from: d */
        Object f176900d;

        static {
            Covode.recordClassIndex(91862);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C78719a(C78718b bVar, AbstractC89124d dVar) {
            super(dVar);
            this.f176899c = bVar;
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final Object invokeSuspend(Object obj) {
            this.f176897a = obj;
            this.f176898b |= Integer.MIN_VALUE;
            return this.f176899c.mo122566a(this);
        }
    }

    static {
        Covode.recordClassIndex(91861);
    }

    public C78718b(C35335b bVar) {
        C89219l.m154721d(bVar, "");
        this.f176896e = bVar;
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:21:0x007b */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0, types: [com.ss.android.ugc.aweme.tools.music.aichoosemusic.b.b, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v1, types: [com.ss.android.ugc.aweme.tools.music.aichoosemusic.b.a] */
    /* JADX WARN: Type inference failed for: r7v3, types: [com.ss.android.ugc.aweme.tools.music.aichoosemusic.b.a] */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0020  */
    /* JADX WARNING: Unknown variable types count: 1 */
    @Override // com.p2082ss.android.ugc.aweme.tools.music.aichoosemusic.p4122b.AbstractC78708a
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo122566a(p4600h.p4603c.AbstractC89124d<? super java.lang.String> r24) {
        /*
        // Method dump skipped, instructions count: 275
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.tools.music.aichoosemusic.p4122b.C78718b.mo122566a(h.c.d):java.lang.Object");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.tools.music.aichoosemusic.b.b$b */
    public static final class C78720b implements AbstractC85304ab {

        /* renamed from: a */
        final /* synthetic */ C89233z.C89236c f176901a;

        /* renamed from: b */
        final /* synthetic */ List f176902b;

        /* renamed from: c */
        final /* synthetic */ int[] f176903c;

        /* renamed from: d */
        final /* synthetic */ AbstractC89124d f176904d;

        /* renamed from: e */
        final /* synthetic */ C78718b f176905e;

        /* renamed from: f */
        final /* synthetic */ long f176906f;

        /* renamed from: g */
        final /* synthetic */ long f176907g;

        /* renamed from: h */
        final /* synthetic */ String f176908h;

        static {
            Covode.recordClassIndex(91863);
        }

        C78720b(C89233z.C89236c cVar, List list, int[] iArr, AbstractC89124d dVar, C78718b bVar, long j, long j2, String str) {
            this.f176901a = cVar;
            this.f176902b = list;
            this.f176903c = iArr;
            this.f176904d = dVar;
            this.f176905e = bVar;
            this.f176906f = j;
            this.f176907g = j2;
            this.f176908h = str;
        }

        @Override // com.p2082ss.android.vesdk.AbstractC85304ab
        public final boolean processFrame(ByteBuffer byteBuffer, int i, int i2, int i3) {
            boolean z;
            MethodCollector.m26663i(4140);
            C88151a.m153229a("extracting_frame");
            Bitmap createBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
            createBitmap.copyPixelsFromBuffer(byteBuffer.position(0));
            File a = this.f176905e.mo122565a(createBitmap, this.f176901a.element);
            List list = this.f176902b;
            String absolutePath = a.getAbsolutePath();
            C89219l.m154716b(absolutePath, "");
            list.add(absolutePath);
            this.f176901a.element++;
            int[] iArr = this.f176903c;
            C89219l.m154721d(iArr, "");
            if (iArr.length == 0) {
                NoSuchElementException noSuchElementException = new NoSuchElementException("Array is empty.");
                MethodCollector.m26664o(4140);
                throw noSuchElementException;
            }
            if (iArr[C89064i.m154474a(iArr)] - i3 < 10) {
                z = true;
                this.f176904d.resumeWith(C89379q.m157068constructorimpl(this.f176902b));
            } else {
                z = false;
            }
            MethodCollector.m26664o(4140);
            if (!z) {
                return true;
            }
            return false;
        }
    }
}
