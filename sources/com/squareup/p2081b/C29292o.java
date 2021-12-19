package com.squareup.p2081b;

import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.Context;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.provider.MediaStore;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.squareup.p2081b.AbstractC29315y;
import com.squareup.p2081b.C29299t;

/* access modifiers changed from: package-private */
/* renamed from: com.squareup.b.o */
public final class C29292o extends C29278g {

    /* renamed from: b */
    private static final String[] f69499b = {"orientation"};

    static {
        Covode.recordClassIndex(35641);
    }

    /* renamed from: com.squareup.b.o$a */
    enum EnumC29293a {
        MICRO(3, 96, 96),
        MINI(1, 512, 384),
        FULL(2, -1, -1);
        

        /* renamed from: d */
        final int f69504d;

        /* renamed from: e */
        final int f69505e;

        /* renamed from: f */
        final int f69506f;

        static {
            Covode.recordClassIndex(35642);
        }

        private EnumC29293a(int i, int i2, int i3) {
            this.f69504d = i;
            this.f69505e = i2;
            this.f69506f = i3;
        }
    }

    C29292o(Context context) {
        super(context);
    }

    @Override // com.squareup.p2081b.AbstractC29315y, com.squareup.p2081b.C29278g
    /* renamed from: a */
    public final boolean mo51062a(C29312w wVar) {
        Uri uri = wVar.f69562d;
        if (!"content".equals(uri.getScheme()) || !"media".equals(uri.getAuthority())) {
            return false;
        }
        return true;
    }

    @Override // com.squareup.p2081b.AbstractC29315y, com.squareup.p2081b.C29278g
    /* renamed from: b */
    public final AbstractC29315y.C29316a mo51063b(C29312w wVar) {
        boolean z;
        EnumC29293a aVar;
        Bitmap thumbnail;
        int i;
        ContentResolver contentResolver = this.f69456a.getContentResolver();
        int a = m58680a(contentResolver, wVar.f69562d);
        String type = contentResolver.getType(wVar.f69562d);
        if (type == null || !type.startsWith("video/")) {
            z = false;
        } else {
            z = true;
        }
        if (wVar.mo51126c()) {
            int i2 = wVar.f69566h;
            int i3 = wVar.f69567i;
            if (i2 <= EnumC29293a.MICRO.f69505e && i3 <= EnumC29293a.MICRO.f69506f) {
                aVar = EnumC29293a.MICRO;
            } else if (i2 > EnumC29293a.MINI.f69505e || i3 > EnumC29293a.MINI.f69506f) {
                aVar = EnumC29293a.FULL;
            } else {
                aVar = EnumC29293a.MINI;
            }
            if (!z && aVar == EnumC29293a.FULL) {
                return new AbstractC29315y.C29316a(null, mo51078c(wVar), C29299t.EnumC29305d.DISK, a);
            }
            long parseId = ContentUris.parseId(wVar.f69562d);
            BitmapFactory.Options d = m58718d(wVar);
            d.inJustDecodeBounds = true;
            m58715a(wVar.f69566h, wVar.f69567i, aVar.f69505e, aVar.f69506f, d, wVar);
            if (z) {
                if (aVar == EnumC29293a.FULL) {
                    i = 1;
                } else {
                    i = aVar.f69504d;
                }
                thumbnail = MediaStore.Video.Thumbnails.getThumbnail(contentResolver, parseId, i, d);
            } else {
                thumbnail = MediaStore.Images.Thumbnails.getThumbnail(contentResolver, parseId, aVar.f69504d, d);
            }
            if (thumbnail != null) {
                return new AbstractC29315y.C29316a(thumbnail, null, C29299t.EnumC29305d.DISK, a);
            }
        }
        return new AbstractC29315y.C29316a(null, mo51078c(wVar), C29299t.EnumC29305d.DISK, a);
    }

    /* renamed from: a */
    private static int m58680a(ContentResolver contentResolver, Uri uri) {
        MethodCollector.m26663i(9982);
        Cursor cursor = null;
        try {
            Cursor query = contentResolver.query(uri, f69499b, null, null, null);
            if (query != null) {
                if (!query.moveToFirst()) {
                    query.close();
                } else {
                    int i = query.getInt(0);
                    query.close();
                    MethodCollector.m26664o(9982);
                    return i;
                }
            }
            MethodCollector.m26664o(9982);
            return 0;
        } catch (RuntimeException unused) {
            if (0 != 0) {
                cursor.close();
            }
            MethodCollector.m26664o(9982);
            return 0;
        } catch (Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            MethodCollector.m26664o(9982);
            throw th;
        }
    }
}
