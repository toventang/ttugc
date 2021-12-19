package com.facebook.imagepipeline.p1889n;

import android.content.ContentResolver;
import android.database.Cursor;
import android.graphics.Rect;
import android.media.ExifInterface;
import android.net.Uri;
import android.provider.MediaStore;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.facebook.common.p1833e.C24099a;
import com.facebook.common.p1835g.AbstractC24113i;
import com.facebook.common.p1839k.C24134g;
import com.facebook.imagepipeline.common.C24363d;
import com.facebook.imagepipeline.p1885j.C24456e;
import com.facebook.imagepipeline.p1890o.C24636b;
import com.facebook.imageutils.C24664g;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.Executor;

/* renamed from: com.facebook.imagepipeline.n.y */
public class C24627y extends AbstractC24514aa implements AbstractC24580bc<C24456e> {

    /* renamed from: a */
    private static final Class<?> f58529a = C24627y.class;

    /* renamed from: b */
    private static final String[] f58530b = {"_id", "_data"};

    /* renamed from: c */
    private static final String[] f58531c = {"_data"};

    /* renamed from: d */
    private static final Rect f58532d = new Rect(0, 0, 512, 384);

    /* renamed from: e */
    private static final Rect f58533e = new Rect(0, 0, 96, 96);

    /* renamed from: f */
    private final ContentResolver f58534f;

    /* access modifiers changed from: protected */
    @Override // com.facebook.imagepipeline.p1889n.AbstractC24514aa
    /* renamed from: a */
    public final String mo40382a() {
        return "LocalContentUriThumbnailFetchProducer";
    }

    static {
        Covode.recordClassIndex(28771);
    }

    @Override // com.facebook.imagepipeline.p1889n.AbstractC24580bc
    /* renamed from: a */
    public final boolean mo40439a(C24363d dVar) {
        Rect rect = f58532d;
        return C24581bd.m47016a(rect.width(), rect.height(), dVar);
    }

    /* access modifiers changed from: protected */
    @Override // com.facebook.imagepipeline.p1889n.AbstractC24514aa
    /* renamed from: a */
    public final C24456e mo40380a(C24636b bVar) {
        C24456e a;
        Uri uri = bVar.mSourceUri;
        if (!C24134g.m45740e(uri) || (a = m47134a(uri, bVar.mResizeOptions)) == null) {
            return null;
        }
        return a;
    }

    /* renamed from: a */
    private static int m47133a(String str) {
        if (str != null) {
            try {
                return C24664g.m47181a(new ExifInterface(str).getAttributeInt("Orientation", 1));
            } catch (IOException e) {
                C24099a.m45650b(f58529a, e, "Unable to retrieve thumbnail rotation for %s", str);
            }
        }
        return 0;
    }

    /* renamed from: a */
    private C24456e m47134a(Uri uri, C24363d dVar) {
        C24456e a;
        MethodCollector.m26663i(8543);
        Cursor query = this.f58534f.query(uri, f58530b, null, null, null);
        if (query == null) {
            MethodCollector.m26664o(8543);
            return null;
        }
        try {
            if (query.getCount() == 0) {
                return null;
            }
            query.moveToFirst();
            String string = query.getString(query.getColumnIndex("_data"));
            if (dVar == null || (a = m47135a(dVar, query.getInt(query.getColumnIndex("_id")))) == null) {
                query.close();
                MethodCollector.m26664o(8543);
                return null;
            }
            a.f58097d = m47133a(string);
            query.close();
            MethodCollector.m26664o(8543);
            return a;
        } finally {
            query.close();
            MethodCollector.m26664o(8543);
        }
    }

    /* renamed from: a */
    private C24456e m47135a(C24363d dVar, int i) {
        int i2;
        Throwable th;
        int i3;
        MethodCollector.m26663i(8686);
        Rect rect = f58533e;
        if (C24581bd.m47016a(rect.width(), rect.height(), dVar)) {
            i2 = 3;
        } else {
            Rect rect2 = f58532d;
            if (C24581bd.m47016a(rect2.width(), rect2.height(), dVar)) {
                i2 = 1;
            } else {
                i2 = 0;
            }
        }
        if (i2 == 0) {
            MethodCollector.m26664o(8686);
            return null;
        }
        try {
            Cursor queryMiniThumbnail = MediaStore.Images.Thumbnails.queryMiniThumbnail(this.f58534f, (long) i, i2, f58531c);
            if (queryMiniThumbnail == null) {
                MethodCollector.m26664o(8686);
                return null;
            }
            try {
                queryMiniThumbnail.moveToFirst();
                if (queryMiniThumbnail.getCount() > 0) {
                    String string = queryMiniThumbnail.getString(queryMiniThumbnail.getColumnIndex("_data"));
                    if (new File(string).exists()) {
                        FileInputStream fileInputStream = new FileInputStream(string);
                        if (string == null) {
                            i3 = -1;
                        } else {
                            i3 = (int) new File(string).length();
                        }
                        C24456e b = mo40383b(fileInputStream, i3);
                        queryMiniThumbnail.close();
                        MethodCollector.m26664o(8686);
                        return b;
                    }
                }
                queryMiniThumbnail.close();
                MethodCollector.m26664o(8686);
                return null;
            } catch (Throwable th2) {
                th = th2;
                queryMiniThumbnail.close();
                MethodCollector.m26664o(8686);
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            MethodCollector.m26664o(8686);
            throw th;
        }
    }

    public C24627y(Executor executor, AbstractC24113i iVar, ContentResolver contentResolver) {
        super(executor, iVar);
        this.f58534f = contentResolver;
    }
}
