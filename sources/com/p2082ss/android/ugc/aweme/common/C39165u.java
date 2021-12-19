package com.p2082ss.android.ugc.aweme.common;

import android.content.Context;
import android.graphics.Bitmap;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.lancet.C58016d;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.util.UUID;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.common.u */
public final class C39165u {

    /* renamed from: a */
    public static final C39165u f92381a = new C39165u();

    /* renamed from: com.ss.android.ugc.aweme.common.u$a */
    public enum EnumC39166a {
        PNG,
        WEBP,
        MP4;

        static {
            Covode.recordClassIndex(46789);
        }
    }

    private C39165u() {
    }

    static {
        Covode.recordClassIndex(46788);
    }

    /* renamed from: a */
    public static File m79471a(Context context, Bitmap bitmap) {
        MethodCollector.m26663i(310);
        C89219l.m154721d(bitmap, "");
        File file = null;
        try {
            EnumC39166a aVar = EnumC39166a.WEBP;
            file = m79472a(context, aVar);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            bitmap.compress(Bitmap.CompressFormat.PNG, 0, byteArrayOutputStream);
            if (aVar == EnumC39166a.WEBP) {
                bitmap.compress(Bitmap.CompressFormat.WEBP, 0, byteArrayOutputStream);
            } else {
                bitmap.compress(Bitmap.CompressFormat.PNG, 0, byteArrayOutputStream);
            }
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            fileOutputStream.write(byteArray);
            fileOutputStream.flush();
            fileOutputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        MethodCollector.m26664o(310);
        return file;
    }

    /* renamed from: a */
    public static File m79472a(Context context, EnumC39166a aVar) {
        File file;
        Exception e;
        C89219l.m154721d(aVar, "");
        StringBuilder sb = new StringBuilder();
        File file2 = null;
        if (context != null) {
            if (C58016d.f132221b == null || !C58016d.f132224e) {
                C58016d.f132221b = context.getCacheDir();
            }
            file = C58016d.f132221b;
        } else {
            file = null;
        }
        sb.append(file);
        sb.append(File.separator);
        sb.append(UUID.randomUUID());
        int i = C39167v.f92383a[aVar.ordinal()];
        if (i == 1) {
            sb.append(".png");
        } else if (i == 2) {
            sb.append(".webp");
        } else if (i == 3) {
            sb.append(".mp4");
        }
        try {
            File file3 = new File(sb.toString());
            try {
                file3.createNewFile();
                return file3;
            } catch (Exception e2) {
                e = e2;
                file2 = file3;
            }
        } catch (Exception e3) {
            e = e3;
            e.printStackTrace();
            return file2;
        }
    }
}
