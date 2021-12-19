package com.p2082ss.android.ugc.aweme.photo;

import android.net.Uri;
import com.bytedance.covode.number.Covode;
import com.google.p1998c.p1999a.C27245k;
import com.p2082ss.android.ugc.tools.utils.C84896h;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.photo.PhotoContext */
public class PhotoContext implements Serializable {
    public int mHeight;
    public String mPhotoLocalPath;
    public int mWidth;

    static {
        Covode.recordClassIndex(73682);
    }

    private PhotoContext() {
    }

    public Uri getPhotoUri() {
        return C84896h.m145871d(this.mPhotoLocalPath);
    }

    public static PhotoContext fromUpload(String str, int i, int i2) {
        C27245k.m54229a(str);
        PhotoContext photoContext = new PhotoContext();
        photoContext.mPhotoLocalPath = str;
        photoContext.mWidth = i;
        photoContext.mHeight = i2;
        return photoContext;
    }
}
