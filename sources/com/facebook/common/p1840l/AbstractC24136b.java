package com.facebook.common.p1840l;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import com.bytedance.covode.number.Covode;
import java.io.FileDescriptor;
import java.io.InputStream;

/* renamed from: com.facebook.common.l.b */
public interface AbstractC24136b {

    /* renamed from: com.facebook.common.l.b$a */
    public interface AbstractC24137a {
        static {
            Covode.recordClassIndex(28265);
        }
    }

    static {
        Covode.recordClassIndex(28264);
    }

    Bitmap decodeFileDescriptor(FileDescriptor fileDescriptor, Rect rect, BitmapFactory.Options options);

    Bitmap decodeStream(InputStream inputStream, Rect rect, BitmapFactory.Options options);

    void setBitmapCreator(AbstractC24135a aVar);

    void setWebpErrorLogger(AbstractC24137a aVar);
}
