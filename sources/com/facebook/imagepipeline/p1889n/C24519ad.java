package com.facebook.imagepipeline.p1889n;

import android.content.ContentResolver;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.ThumbnailUtils;
import android.net.Uri;
import android.os.Build;
import android.provider.DocumentsContract;
import android.provider.MediaStore;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.facebook.common.p1832d.C24086f;
import com.facebook.common.p1836h.C24117a;
import com.facebook.common.p1839k.C24134g;
import com.facebook.imagepipeline.p1878c.C24359g;
import com.facebook.imagepipeline.p1879d.C24389j;
import com.facebook.imagepipeline.p1880e.C24428k;
import com.facebook.imagepipeline.p1885j.AbstractC24454c;
import com.facebook.imagepipeline.p1885j.C24455d;
import com.facebook.imagepipeline.p1885j.C24458g;
import com.facebook.imagepipeline.p1890o.C24636b;
import com.facebook.p1825b.AbstractC24018a;
import com.facebook.p1825b.C24019b;
import com.facebook.p1826c.p1827a.AbstractC24026e;
import com.facebook.p1826c.p1827a.AbstractC24032k;
import java.io.File;
import java.io.OutputStream;
import java.util.Map;
import java.util.concurrent.Executor;

/* renamed from: com.facebook.imagepipeline.n.ad */
public final class C24519ad implements AbstractC24544ak<C24117a<AbstractC24454c>> {

    /* renamed from: a */
    private final Executor f58232a;

    /* renamed from: b */
    private final ContentResolver f58233b;

    static {
        Covode.recordClassIndex(28663);
    }

    /* renamed from: a */
    public static Bitmap m46865a(C24636b bVar) {
        AbstractC24026e a;
        File file;
        MethodCollector.m26663i(7944);
        try {
            if (bVar.isResizedImageDiskCacheActuallyEnabled()) {
                a = C24389j.m46446a().mo40189b(bVar);
            } else {
                a = C24389j.m46446a().mo40187a(bVar);
            }
            AbstractC24018a a2 = C24428k.m46551a().mo40246d().mo39575a(a);
            if (a2 == null) {
                a2 = C24428k.m46551a().mo40250h().mo39575a(a);
            }
            if ((a2 instanceof C24019b) && (file = ((C24019b) a2).f56886a) != null && file.exists()) {
                Bitmap decodeFile = BitmapFactory.decodeFile(file.getAbsolutePath());
                MethodCollector.m26664o(7944);
                return decodeFile;
            }
        } catch (Exception unused) {
        }
        MethodCollector.m26664o(7944);
        return null;
    }

    /* renamed from: b */
    public final String mo40384b(C24636b bVar) {
        String str;
        String[] strArr;
        MethodCollector.m26663i(8099);
        Uri uri = bVar.mSourceUri;
        if (C24134g.m45738c(uri)) {
            String path = bVar.getSourceFile().getPath();
            MethodCollector.m26664o(8099);
            return path;
        }
        if (C24134g.m45739d(uri)) {
            int i = Build.VERSION.SDK_INT;
            if ("com.android.providers.media.documents".equals(uri.getAuthority())) {
                String documentId = DocumentsContract.getDocumentId(uri);
                uri = MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
                strArr = new String[]{documentId.split(":")[1]};
                str = "_id=?";
            } else {
                str = null;
                strArr = null;
            }
            Cursor query = this.f58233b.query(uri, new String[]{"_data"}, str, strArr, null);
            if (query != null) {
                try {
                    if (query.moveToFirst()) {
                        return query.getString(query.getColumnIndexOrThrow("_data"));
                    }
                } finally {
                    query.close();
                    MethodCollector.m26664o(8099);
                }
            }
            if (query != null) {
                query.close();
            }
        }
        MethodCollector.m26664o(8099);
        return null;
    }

    public C24519ad(Executor executor, ContentResolver contentResolver) {
        this.f58232a = executor;
        this.f58233b = contentResolver;
    }

    @Override // com.facebook.imagepipeline.p1889n.AbstractC24544ak
    /* renamed from: a */
    public final void mo40379a(AbstractC24596k<C24117a<AbstractC24454c>> kVar, AbstractC24545al alVar) {
        final AbstractC24547an c = alVar.mo40416c();
        final String b = alVar.mo40415b();
        final C24636b a = alVar.mo40413a();
        final C245212 r1 = new AbstractC24562av<C24117a<AbstractC24454c>>(kVar, "VideoThumbnailProducer", c, b) {
            /* class com.facebook.imagepipeline.p1889n.C24519ad.C245212 */

            static {
                Covode.recordClassIndex(28665);
            }

            /* access modifiers changed from: private */
            /* renamed from: d */
            public C24117a<AbstractC24454c> mo39641c() {
                int i;
                AbstractC24026e a;
                MethodCollector.m26663i(7807);
                String b = C24519ad.this.mo40384b(a);
                if (b == null) {
                    MethodCollector.m26664o(7807);
                    return null;
                }
                Bitmap a2 = C24519ad.m46865a(a);
                if (a2 == null) {
                    C24636b bVar = a;
                    if (bVar.getPreferredWidth() > 96 || bVar.getPreferredHeight() > 96) {
                        i = 1;
                    } else {
                        i = 3;
                    }
                    a2 = ThumbnailUtils.createVideoThumbnail(b, i);
                    if (a2 == null) {
                        MethodCollector.m26664o(7807);
                        return null;
                    }
                    if (!(!a.isResizedImageDiskCacheActuallyEnabled() || a2.getHeight() == 0 || a.mResizeOptions.f57780b == 0)) {
                        float width = ((float) a2.getWidth()) / ((float) a2.getHeight());
                        int i2 = a.mResizeOptions.f57779a;
                        int i3 = a.mResizeOptions.f57780b;
                        float f = (float) i2;
                        float f2 = (float) i3;
                        if (f / f2 > width) {
                            i3 = (int) (f / width);
                        } else {
                            i2 = (int) (f2 * width);
                        }
                        a2 = Bitmap.createScaledBitmap(a2, i2, i3, true);
                    }
                    C24519ad adVar = C24519ad.this;
                    C24636b bVar2 = a;
                    try {
                        boolean isResizedImageDiskCacheActuallyEnabled = bVar2.isResizedImageDiskCacheActuallyEnabled();
                        if (isResizedImageDiskCacheActuallyEnabled) {
                            a = C24389j.m46446a().mo40189b(bVar2);
                        } else {
                            a = C24389j.m46446a().mo40187a(bVar2);
                        }
                        C24428k.m46551a().mo40246d().mo39576a(a, new AbstractC24032k(isResizedImageDiskCacheActuallyEnabled, a2) {
                            /* class com.facebook.imagepipeline.p1889n.C24519ad.C245201 */

                            /* renamed from: a */
                            final /* synthetic */ boolean f58234a;

                            /* renamed from: b */
                            final /* synthetic */ Bitmap f58235b;

                            static {
                                Covode.recordClassIndex(28664);
                            }

                            @Override // com.facebook.p1826c.p1827a.AbstractC24032k
                            /* renamed from: a */
                            public final void mo39548a(OutputStream outputStream) {
                                Bitmap.CompressFormat compressFormat;
                                int i;
                                MethodCollector.m26663i(7030);
                                if (this.f58234a) {
                                    compressFormat = Bitmap.CompressFormat.JPEG;
                                } else {
                                    compressFormat = Bitmap.CompressFormat.PNG;
                                }
                                if (this.f58234a) {
                                    i = 85;
                                } else {
                                    i = 100;
                                }
                                this.f58235b.compress(compressFormat, i, outputStream);
                                MethodCollector.m26664o(7030);
                            }

                            {
                                this.f58234a = r2;
                                this.f58235b = r3;
                            }
                        });
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
                C24117a<AbstractC24454c> a3 = C24117a.m45706a(new C24455d(a2, C24359g.m46366a(), C24458g.f58105a));
                MethodCollector.m26664o(7807);
                return a3;
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // com.facebook.common.p1830b.AbstractRunnableC24073h, com.facebook.imagepipeline.p1889n.AbstractC24562av
            /* renamed from: b */
            public final /* synthetic */ void mo39640b(C24117a<AbstractC24454c> aVar) {
                C24117a.m45712c(aVar);
            }

            @Override // com.facebook.common.p1830b.AbstractRunnableC24073h, com.facebook.imagepipeline.p1889n.AbstractC24562av
            /* renamed from: a */
            public final void mo39637a(Exception exc) {
                super.mo39637a(exc);
                c.onUltimateProducerReached(b, "VideoThumbnailProducer", false);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            /* access modifiers changed from: protected */
            @Override // com.facebook.imagepipeline.p1889n.AbstractC24562av
            /* renamed from: c */
            public final /* synthetic */ Map mo40385c(C24117a<AbstractC24454c> aVar) {
                boolean z;
                if (aVar != null) {
                    z = true;
                } else {
                    z = false;
                }
                return C24086f.m45603of("createdThumbnail", String.valueOf(z));
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // com.facebook.common.p1830b.AbstractRunnableC24073h, com.facebook.imagepipeline.p1889n.AbstractC24562av
            /* renamed from: a */
            public final /* synthetic */ void mo39638a(C24117a<AbstractC24454c> aVar) {
                boolean z;
                super.mo39638a(aVar);
                AbstractC24547an anVar = c;
                String str = b;
                if (aVar != null) {
                    z = true;
                } else {
                    z = false;
                }
                anVar.onUltimateProducerReached(str, "VideoThumbnailProducer", z);
            }
        };
        alVar.mo40414a(new C24587e() {
            /* class com.facebook.imagepipeline.p1889n.C24519ad.C245223 */

            static {
                Covode.recordClassIndex(28666);
            }

            @Override // com.facebook.imagepipeline.p1889n.AbstractC24546am, com.facebook.imagepipeline.p1889n.C24587e
            /* renamed from: a */
            public final void mo34237a() {
                r1.mo39636a();
            }
        });
        this.f58232a.execute(r1);
    }
}
