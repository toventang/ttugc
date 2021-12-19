package com.facebook.imagepipeline.p1890o;

import android.net.Uri;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.facebook.common.p1832d.C24088h;
import com.facebook.common.p1834f.C24102a;
import com.facebook.common.p1834f.C24103b;
import com.facebook.common.p1839k.C24134g;
import com.facebook.imagepipeline.common.C24360a;
import com.facebook.imagepipeline.common.C24361b;
import com.facebook.imagepipeline.common.C24363d;
import com.facebook.imagepipeline.common.C24364e;
import com.facebook.imagepipeline.common.EnumC24362c;
import com.facebook.imagepipeline.p1886k.AbstractC24462c;
import com.facebook.p1826c.p1827a.AbstractC24026e;
import java.io.File;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

/* renamed from: com.facebook.imagepipeline.o.b */
public class C24636b {
    public final List<Uri> mBackupUris;
    public final C24360a mBytesRange;
    public final EnumC24637a mCacheChoice;
    public final C24361b mImageDecodeOptions;
    public final boolean mIsDiskCacheEnabled;
    public final boolean mIsMemoryCacheEnabled;
    public final boolean mIsResizedImageDiskCacheEnabled;
    public final boolean mLocalThumbnailPreviewsEnabled;
    public final EnumC24638b mLowestPermittedRequestLevel;
    public final AbstractC24641d mPostprocessor;
    public final boolean mProgressiveRenderingEnabled;
    public final AbstractC24462c mRequestListener;
    public final EnumC24362c mRequestPriority;
    public final C24363d mResizeOptions;
    public final C24364e mRotationOptions;
    private File mSourceFile;
    public final Uri mSourceUri;
    public final int mSourceUriType;

    static {
        Covode.recordClassIndex(28786);
    }

    /* renamed from: com.facebook.imagepipeline.o.b$b */
    public enum EnumC24638b {
        FULL_FETCH(1),
        DISK_CACHE(2),
        ENCODED_MEMORY_CACHE(3),
        BITMAP_MEMORY_CACHE(4);
        

        /* renamed from: a */
        private int f58549a;

        public final int getValue() {
            return this.f58549a;
        }

        static {
            Covode.recordClassIndex(28788);
        }

        public static EnumC24638b getMax(EnumC24638b bVar, EnumC24638b bVar2) {
            if (bVar.getValue() > bVar2.getValue()) {
                return bVar;
            }
            return bVar2;
        }

        private EnumC24638b(int i) {
            this.f58549a = i;
        }
    }

    public boolean getAutoRotateEnabled() {
        return this.mRotationOptions.mo40165a();
    }

    public int getPreferredHeight() {
        C24363d dVar = this.mResizeOptions;
        if (dVar != null) {
            return dVar.f57780b;
        }
        return 2048;
    }

    public int getPreferredWidth() {
        C24363d dVar = this.mResizeOptions;
        if (dVar != null) {
            return dVar.f57779a;
        }
        return 2048;
    }

    public boolean isResizedImageDiskCacheActuallyEnabled() {
        if (!this.mIsResizedImageDiskCacheEnabled || this.mResizeOptions == null) {
            return false;
        }
        return true;
    }

    /* renamed from: com.facebook.imagepipeline.o.b$a */
    public enum EnumC24637a {
        SMALL,
        DEFAULT;

        static {
            Covode.recordClassIndex(28787);
        }
    }

    public synchronized File getSourceFile() {
        File file;
        MethodCollector.m26663i(3727);
        if (this.mSourceFile == null) {
            this.mSourceFile = new File(this.mSourceUri.getPath());
        }
        file = this.mSourceFile;
        MethodCollector.m26664o(3727);
        return file;
    }

    public int hashCode() {
        AbstractC24026e eVar;
        AbstractC24641d dVar = this.mPostprocessor;
        if (dVar != null) {
            eVar = dVar.getPostprocessorCacheKey();
        } else {
            eVar = null;
        }
        return Arrays.hashCode(new Object[]{this.mCacheChoice, this.mSourceUri, this.mSourceFile, this.mBytesRange, this.mImageDecodeOptions, this.mResizeOptions, this.mRotationOptions, eVar});
    }

    public String toString() {
        return C24088h.m45610a(this).mo39647a("uri", this.mSourceUri).mo39647a("cacheChoice", this.mCacheChoice).mo39647a("decodeOptions", this.mImageDecodeOptions).mo39647a("postprocessor", this.mPostprocessor).mo39647a("priority", this.mRequestPriority).mo39647a("resizeOptions", this.mResizeOptions).mo39647a("rotationOptions", this.mRotationOptions).mo39647a("bytesRange", this.mBytesRange).toString();
    }

    public static C24636b fromFile(File file) {
        if (file == null) {
            return null;
        }
        return fromUri(Uri.fromFile(file));
    }

    public static C24636b fromUri(Uri uri) {
        if (uri == null) {
            return null;
        }
        return C24639c.m47149a(uri).mo40483a();
    }

    public static C24636b fromUri(String str) {
        if (str == null || str.length() == 0) {
            return null;
        }
        return fromUri(Uri.parse(str));
    }

    public C24636b(C24639c cVar) {
        C24364e eVar;
        boolean z;
        this.mCacheChoice = cVar.f58556g;
        Uri uri = cVar.f58550a;
        this.mSourceUri = uri;
        this.mBackupUris = cVar.f58551b;
        this.mSourceUriType = getSourceUriType(uri);
        this.mProgressiveRenderingEnabled = cVar.f58557h;
        this.mLocalThumbnailPreviewsEnabled = cVar.f58558i;
        this.mImageDecodeOptions = cVar.f58555f;
        this.mResizeOptions = cVar.f58553d;
        if (cVar.f58554e == null) {
            eVar = C24364e.f57783b;
        } else {
            eVar = cVar.f58554e;
        }
        this.mRotationOptions = eVar;
        this.mBytesRange = cVar.f58565p;
        this.mRequestPriority = cVar.f58559j;
        this.mLowestPermittedRequestLevel = cVar.f58552c;
        if (!cVar.f58561l || !C24134g.m45737b(cVar.f58550a)) {
            z = false;
        } else {
            z = true;
        }
        this.mIsDiskCacheEnabled = z;
        this.mIsResizedImageDiskCacheEnabled = cVar.f58562m;
        this.mIsMemoryCacheEnabled = cVar.f58563n;
        this.mPostprocessor = cVar.f58560k;
        this.mRequestListener = cVar.f58564o;
    }

    public boolean equals(Object obj) {
        AbstractC24026e eVar;
        if (!(obj instanceof C24636b)) {
            return false;
        }
        C24636b bVar = (C24636b) obj;
        if (!C24088h.m45611a(this.mSourceUri, bVar.mSourceUri) || !C24088h.m45611a(this.mCacheChoice, bVar.mCacheChoice) || !C24088h.m45611a(this.mSourceFile, bVar.mSourceFile) || !C24088h.m45611a(this.mBytesRange, bVar.mBytesRange) || !C24088h.m45611a(this.mImageDecodeOptions, bVar.mImageDecodeOptions) || !C24088h.m45611a(this.mResizeOptions, bVar.mResizeOptions) || !C24088h.m45611a(this.mRotationOptions, bVar.mRotationOptions)) {
            return false;
        }
        AbstractC24641d dVar = this.mPostprocessor;
        AbstractC24026e eVar2 = null;
        if (dVar != null) {
            eVar = dVar.getPostprocessorCacheKey();
        } else {
            eVar = null;
        }
        AbstractC24641d dVar2 = bVar.mPostprocessor;
        if (dVar2 != null) {
            eVar2 = dVar2.getPostprocessorCacheKey();
        }
        return C24088h.m45611a(eVar, eVar2);
    }

    private static int getSourceUriType(Uri uri) {
        String substring;
        String lowerCase;
        if (uri == null) {
            return -1;
        }
        if (C24134g.m45737b(uri)) {
            return 0;
        }
        if (C24134g.m45738c(uri)) {
            String path = uri.getPath();
            int lastIndexOf = path.lastIndexOf(46);
            String str = null;
            if (lastIndexOf >= 0 && lastIndexOf != path.length() - 1 && (substring = path.substring(lastIndexOf + 1)) != null && (str = C24103b.f57031b.get((lowerCase = substring.toLowerCase(Locale.US)))) == null && (str = C24103b.f57030a.getMimeTypeFromExtension(lowerCase)) == null) {
                str = C24102a.f57029a.get(lowerCase);
            }
            if (C24102a.m45683a(str)) {
                return 2;
            }
            return 3;
        } else if (C24134g.m45739d(uri)) {
            return 4;
        } else {
            if (C24134g.m45741f(uri)) {
                return 5;
            }
            if (C24134g.m45742g(uri)) {
                return 6;
            }
            if ("data".equals(C24134g.m45743h(uri))) {
                return 7;
            }
            if ("android.resource".equals(C24134g.m45743h(uri))) {
                return 8;
            }
            return -1;
        }
    }
}
