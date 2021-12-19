package com.bytedance.android.live.broadcast.utils;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.TextUtils;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.live.network.response.C5832d;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.retrofit2.mime.TypedOutput;
import com.bytedance.retrofit2.p1610b.AbstractC21994b;
import com.bytedance.retrofit2.p1610b.AbstractC22012t;
import com.bytedance.retrofit2.p1610b.AbstractC22018z;
import com.p2082ss.android.ugc.aweme.lancet.C58016d;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.Callable;
import p4560f.p4561a.AbstractC88403ab;
import p4560f.p4561a.AbstractC88924h;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;

public final class StickerImageUploader {

    /* renamed from: a */
    public AbstractC88412b f10280a;

    /* renamed from: b */
    public AbstractC88412b f10281b;

    /* renamed from: c */
    boolean f10282c;

    /* renamed from: d */
    public C3712b<C3713c> f10283d;

    interface UploadStickerImageApi {
        static {
            Covode.recordClassIndex(4225);
        }

        @AbstractC22012t(mo35799a = "/webcast/review/upload_green_screen/")
        AbstractC88403ab<C5832d<Object>> upload(@AbstractC21994b TypedOutput typedOutput, @AbstractC22018z(mo35807a = "room_id") long j, @AbstractC22018z(mo35807a = "user_id") long j2);
    }

    static {
        Covode.recordClassIndex(4224);
    }

    /* renamed from: com.bytedance.android.live.broadcast.utils.StickerImageUploader$a */
    public static class C3711a {

        /* renamed from: a */
        public static StickerImageUploader f10284a = new StickerImageUploader((byte) 0);

        static {
            Covode.recordClassIndex(4226);
        }
    }

    private StickerImageUploader() {
        this.f10283d = new C3712b<>();
    }

    /* renamed from: com.bytedance.android.live.broadcast.utils.StickerImageUploader$b */
    public static class C3712b<T> {

        /* renamed from: a */
        public final List<T> f10285a = Collections.synchronizedList(new ArrayList(20));

        /* renamed from: b */
        final int f10286b = 20;

        static {
            Covode.recordClassIndex(4227);
        }

        /* renamed from: a */
        public final T mo9027a() {
            if (this.f10285a.size() == 0) {
                return null;
            }
            return this.f10285a.remove(0);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo9024a() {
        if (!this.f10282c) {
            this.f10282c = true;
            C3713c a = this.f10283d.mo9027a();
            if (a == null) {
                this.f10282c = false;
            } else if (!new File(a.f10288b).exists()) {
                this.f10282c = false;
            } else {
                this.f10281b = AbstractC88924h.m154136a((Callable) new CallableC3732j(this, a)).mo143195a(C88391a.m153580a(C88392a.f200660a)).mo143204b(C88925a.m154180b(C88946a.f201991c)).mo143190a(new C3733k(this, a), new C3734l(this, a));
            }
        }
    }

    /* synthetic */ StickerImageUploader(byte b) {
        this();
    }

    /* renamed from: com.bytedance.android.live.broadcast.utils.StickerImageUploader$c */
    public static class C3713c {

        /* renamed from: a */
        String f10287a;

        /* renamed from: b */
        String f10288b;

        /* renamed from: c */
        long f10289c;

        /* renamed from: d */
        long f10290d;

        static {
            Covode.recordClassIndex(4228);
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C3713c)) {
                return false;
            }
            return TextUtils.equals(((C3713c) obj).f10288b, this.f10288b);
        }

        public C3713c(String str, String str2, long j, long j2) {
            this.f10287a = str;
            this.f10288b = str2;
            this.f10289c = j;
            this.f10290d = j2;
        }
    }

    /* renamed from: a */
    private static Bitmap m9214a(Bitmap bitmap) {
        MethodCollector.m26663i(7011);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream);
        int i = 90;
        while (byteArrayOutputStream.toByteArray().length / 1024 > 300) {
            byteArrayOutputStream.reset();
            bitmap.compress(Bitmap.CompressFormat.JPEG, i, byteArrayOutputStream);
            i -= 10;
        }
        Bitmap decodeStream = BitmapFactory.decodeStream(new ByteArrayInputStream(byteArrayOutputStream.toByteArray()), null, null);
        MethodCollector.m26664o(7011);
        return decodeStream;
    }

    /* renamed from: a */
    public static File m9215a(String str) {
        MethodCollector.m26663i(7009);
        File file = new File(str);
        if (file.length() / 1024 < 300) {
            MethodCollector.m26664o(7009);
            return file;
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        int i = 1;
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(str, options);
        options.inJustDecodeBounds = false;
        int i2 = options.outWidth;
        int i3 = options.outHeight;
        if (i2 > i3 && i2 > 600) {
            i = i2 / 600;
        } else if (i2 < i3 && i3 > 800) {
            i = i3 / 800;
        }
        options.inSampleSize = i;
        Bitmap a = m9214a(BitmapFactory.decodeFile(str, options));
        try {
            Context e = C3966y.m9669e();
            StringBuilder sb = new StringBuilder();
            if (C58016d.f132221b == null || !C58016d.f132224e) {
                C58016d.f132221b = e.getCacheDir();
            }
            File file2 = new File(sb.append(C58016d.f132221b).append(File.separator).append(UUID.randomUUID().toString()).append(".jpg").toString());
            FileOutputStream fileOutputStream = new FileOutputStream(file2);
            a.compress(Bitmap.CompressFormat.JPEG, 100, fileOutputStream);
            fileOutputStream.flush();
            fileOutputStream.close();
            MethodCollector.m26664o(7009);
            return file2;
        } catch (Exception unused) {
            MethodCollector.m26664o(7009);
            return null;
        }
    }

    /* renamed from: a */
    public final void mo9025a(C3713c cVar) {
        C3712b<C3713c> bVar = this.f10283d;
        if (bVar.f10285a.indexOf(cVar) != -1) {
            bVar.f10285a.remove(cVar);
        }
        if (bVar.f10286b <= bVar.f10285a.size()) {
            bVar.f10285a.remove(bVar.f10286b - 1);
        }
        bVar.f10285a.add(0, cVar);
        if (this.f10283d.f10285a.size() != 0) {
            mo9024a();
        }
    }
}
