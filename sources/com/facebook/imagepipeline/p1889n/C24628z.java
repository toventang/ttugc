package com.facebook.imagepipeline.p1889n;

import android.content.ContentResolver;
import android.media.ExifInterface;
import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.facebook.common.p1832d.C24086f;
import com.facebook.common.p1835g.AbstractC24111h;
import com.facebook.common.p1835g.AbstractC24113i;
import com.facebook.common.p1835g.C24114j;
import com.facebook.common.p1836h.C24117a;
import com.facebook.imagepipeline.common.C24363d;
import com.facebook.imagepipeline.p1885j.C24456e;
import com.facebook.imagepipeline.p1890o.C24636b;
import com.facebook.imageutils.C24656a;
import com.facebook.imageutils.C24664g;
import com.facebook.p1870h.C24313b;
import java.util.Map;
import java.util.concurrent.Executor;

/* renamed from: com.facebook.imagepipeline.n.z */
public class C24628z implements AbstractC24580bc<C24456e> {

    /* renamed from: a */
    public final AbstractC24113i f58535a;

    /* renamed from: b */
    private final Executor f58536b;

    /* renamed from: c */
    private final ContentResolver f58537c;

    static {
        Covode.recordClassIndex(28772);
    }

    @Override // com.facebook.imagepipeline.p1889n.AbstractC24580bc
    /* renamed from: a */
    public final boolean mo40439a(C24363d dVar) {
        return C24581bd.m47016a(512, 512, dVar);
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x001e A[Catch:{ IOException -> 0x002b, StackOverflowError -> 0x0024 }] */
    /* JADX WARNING: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.media.ExifInterface mo40463a(android.net.Uri r4) {
        /*
            r3 = this;
            android.content.ContentResolver r0 = r3.f58537c
            java.lang.String r2 = com.facebook.common.p1839k.C24134g.m45735a(r0, r4)
            if (r2 == 0) goto L_0x001b
            java.io.File r1 = new java.io.File     // Catch:{ IOException -> 0x002b, StackOverflowError -> 0x0024 }
            r1.<init>(r2)     // Catch:{ IOException -> 0x002b, StackOverflowError -> 0x0024 }
            boolean r0 = r1.exists()     // Catch:{ IOException -> 0x002b, StackOverflowError -> 0x0024 }
            if (r0 == 0) goto L_0x001b
            boolean r0 = r1.canRead()     // Catch:{ IOException -> 0x002b, StackOverflowError -> 0x0024 }
            if (r0 == 0) goto L_0x001b
            r0 = 1
            goto L_0x001c
        L_0x001b:
            r0 = 0
        L_0x001c:
            if (r0 == 0) goto L_0x002b
            android.media.ExifInterface r0 = new android.media.ExifInterface     // Catch:{ IOException -> 0x002b, StackOverflowError -> 0x0024 }
            r0.<init>(r2)     // Catch:{ IOException -> 0x002b, StackOverflowError -> 0x0024 }
            return r0
        L_0x0024:
            java.lang.Class<com.facebook.imagepipeline.n.z> r1 = com.facebook.imagepipeline.p1889n.C24628z.class
            java.lang.String r0 = "StackOverflowError in ExifInterface constructor"
            com.facebook.common.p1833e.C24099a.m45654c(r1, r0)
        L_0x002b:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.imagepipeline.p1889n.C24628z.mo40463a(android.net.Uri):android.media.ExifInterface");
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    public static C24456e m47139a(AbstractC24111h hVar, ExifInterface exifInterface) {
        int i;
        Pair<Integer, Integer> a = C24656a.m47172a(new C24114j(hVar));
        int a2 = C24664g.m47181a(Integer.parseInt(exifInterface.getAttribute("Orientation")));
        int i2 = -1;
        if (a != null) {
            i = ((Integer) a.first).intValue();
            i2 = ((Integer) a.second).intValue();
        } else {
            i = -1;
        }
        C24117a a3 = C24117a.m45706a(hVar);
        try {
            C24456e eVar = new C24456e(a3);
            C24117a.m45712c(a3);
            eVar.f58096c = C24313b.f57651a;
            eVar.f58097d = a2;
            eVar.f58099f = i;
            eVar.f58100g = i2;
            return eVar;
        } catch (Throwable th) {
            C24117a.m45712c(a3);
            throw th;
        }
    }

    @Override // com.facebook.imagepipeline.p1889n.AbstractC24544ak
    /* renamed from: a */
    public final void mo40379a(AbstractC24596k<C24456e> kVar, AbstractC24545al alVar) {
        AbstractC24547an c = alVar.mo40416c();
        String b = alVar.mo40415b();
        final C24636b a = alVar.mo40413a();
        final C246291 r1 = new AbstractC24562av<C24456e>(kVar, c, "LocalExifThumbnailProducer", b) {
            /* class com.facebook.imagepipeline.p1889n.C24628z.C246291 */

            static {
                Covode.recordClassIndex(28773);
            }

            @Override // com.facebook.common.p1830b.AbstractRunnableC24073h
            /* renamed from: c */
            public final /* synthetic */ Object mo39641c() {
                ExifInterface a = C24628z.this.mo40463a(a.mSourceUri);
                if (a == null || !a.hasThumbnail()) {
                    return null;
                }
                return C24628z.m47139a(C24628z.this.f58535a.mo39680a(a.getThumbnail()), a);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // com.facebook.common.p1830b.AbstractRunnableC24073h, com.facebook.imagepipeline.p1889n.AbstractC24562av
            /* renamed from: b */
            public final /* synthetic */ void mo39640b(C24456e eVar) {
                C24456e.m46681d(eVar);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            /* access modifiers changed from: protected */
            @Override // com.facebook.imagepipeline.p1889n.AbstractC24562av
            /* renamed from: c */
            public final /* synthetic */ Map mo40385c(C24456e eVar) {
                boolean z;
                if (eVar != null) {
                    z = true;
                } else {
                    z = false;
                }
                return C24086f.m45603of("createdThumbnail", Boolean.toString(z));
            }
        };
        alVar.mo40414a(new C24587e() {
            /* class com.facebook.imagepipeline.p1889n.C24628z.C246302 */

            static {
                Covode.recordClassIndex(28774);
            }

            @Override // com.facebook.imagepipeline.p1889n.AbstractC24546am, com.facebook.imagepipeline.p1889n.C24587e
            /* renamed from: a */
            public final void mo34237a() {
                r1.mo39636a();
            }
        });
        this.f58536b.execute(r1);
    }

    public C24628z(Executor executor, AbstractC24113i iVar, ContentResolver contentResolver) {
        this.f58536b = executor;
        this.f58535a = iVar;
        this.f58537c = contentResolver;
    }
}
