package androidx.core.content;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.content.res.XmlResourceParser;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import android.webkit.MimeTypeMap;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import com.kakao.usermgmt.StringSet;
import com.p2082ss.android.ugc.aweme.lancet.C58016d;
import com.p2082ss.android.ugc.aweme.p2690cr.AbstractC40381g;
import com.p2082ss.android.ugc.aweme.p2690cr.C40353e;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.xmlpull.v1.XmlPullParserException;

public class FileProvider extends ContentProvider {
    private static final String[] COLUMNS = {"_display_name", "_size"};
    private static final File DEVICE_ROOT = new File("/");
    private static HashMap<String, AbstractC0624a> sCache = new HashMap<>();
    public Object mLazyProviderInfo;
    private AbstractC0624a mStrategy;

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.core.content.FileProvider$a */
    public interface AbstractC0624a {
        static {
            Covode.recordClassIndex(703);
        }

        /* renamed from: a */
        Uri mo2665a(File file);

        /* renamed from: a */
        File mo2666a(Uri uri);
    }

    public void attachInfo(Context context, ProviderInfo providerInfo) {
        m2317x74d45fdf(this, context, providerInfo);
    }

    public int delete(Uri uri, String str, String[] strArr) {
        return m2318xbab14ef7(this, uri, str, strArr);
    }

    public String getType(Uri uri) {
        return m2319x3a9457e4(this, uri);
    }

    public boolean onCreate() {
        return true;
    }

    @Override // android.content.ContentProvider
    public ParcelFileDescriptor openFile(Uri uri, String str) {
        return m2320x84a30132(this, uri, str);
    }

    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        return m2321xf63ff5fc(this, uri, strArr, str, strArr2, str2);
    }

    static {
        Covode.recordClassIndex(702);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.core.content.FileProvider$b */
    public static class C0625b implements AbstractC0624a {

        /* renamed from: a */
        final HashMap<String, File> f2620a = new HashMap<>();

        /* renamed from: b */
        private final String f2621b;

        static {
            Covode.recordClassIndex(704);
        }

        C0625b(String str) {
            this.f2621b = str;
        }

        @Override // androidx.core.content.FileProvider.AbstractC0624a
        /* renamed from: a */
        public final File mo2666a(Uri uri) {
            String encodedPath = uri.getEncodedPath();
            int indexOf = encodedPath.indexOf(47, 1);
            String decode = Uri.decode(encodedPath.substring(1, indexOf));
            String decode2 = Uri.decode(encodedPath.substring(indexOf + 1));
            File file = this.f2620a.get(decode);
            if (file != null) {
                File file2 = new File(file, decode2);
                try {
                    File canonicalFile = file2.getCanonicalFile();
                    if (canonicalFile.getPath().startsWith(file.getPath())) {
                        return canonicalFile;
                    }
                    throw new SecurityException("Resolved path jumped beyond configured root");
                } catch (IOException unused) {
                    throw new IllegalArgumentException("Failed to resolve canonical path for ".concat(String.valueOf(file2)));
                }
            } else {
                throw new IllegalArgumentException("Unable to find configured root for ".concat(String.valueOf(uri)));
            }
        }

        @Override // androidx.core.content.FileProvider.AbstractC0624a
        /* renamed from: a */
        public final Uri mo2665a(File file) {
            String substring;
            try {
                String canonicalPath = file.getCanonicalPath();
                Map.Entry<String, File> entry = null;
                for (Map.Entry<String, File> entry2 : this.f2620a.entrySet()) {
                    String path = entry2.getValue().getPath();
                    if (canonicalPath.startsWith(path) && (entry == null || path.length() > entry.getValue().getPath().length())) {
                        entry = entry2;
                    }
                }
                if (entry != null) {
                    String path2 = entry.getValue().getPath();
                    if (path2.endsWith("/")) {
                        substring = canonicalPath.substring(path2.length());
                    } else {
                        substring = canonicalPath.substring(path2.length() + 1);
                    }
                    return new Uri.Builder().scheme("content").authority(this.f2621b).encodedPath(Uri.encode(entry.getKey()) + '/' + Uri.encode(substring, "/")).build();
                }
                throw new IllegalArgumentException("Failed to find configured root that contains ".concat(String.valueOf(canonicalPath)));
            } catch (IOException unused) {
                throw new IllegalArgumentException("Failed to resolve canonical path for ".concat(String.valueOf(file)));
            }
        }
    }

    /* renamed from: androidx_core_content_FileProvider_com_ss_android_ugc_aweme_lancet_ContextLancet_getCacheDir */
    public static File m2315xfdfd8b39(Context context) {
        if (C58016d.f132221b != null && C58016d.f132224e) {
            return C58016d.f132221b;
        }
        File cacheDir = context.getCacheDir();
        C58016d.f132221b = cacheDir;
        return cacheDir;
    }

    /* renamed from: androidx_core_content_FileProvider_com_ss_android_ugc_aweme_lancet_ContextLancet_getFilesDir */
    public static File m2316xec0aa024(Context context) {
        if (C58016d.f132222c != null && C58016d.f132224e) {
            return C58016d.f132222c;
        }
        File filesDir = context.getFilesDir();
        C58016d.f132222c = filesDir;
        return filesDir;
    }

    public String FileProvider__getType$___twin___(Uri uri) {
        String mimeTypeFromExtension;
        File a = this.mStrategy.mo2666a(uri);
        int lastIndexOf = a.getName().lastIndexOf(46);
        if (lastIndexOf < 0 || (mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(a.getName().substring(lastIndexOf + 1))) == null) {
            return "application/octet-stream";
        }
        return mimeTypeFromExtension;
    }

    /* renamed from: androidx_core_content_FileProvider_com_ss_android_ugc_aweme_storage_FileLancet_delete */
    public static boolean m2322x8f1e193c(File file) {
        try {
            C40353e.C40356c cVar = (C40353e.C40356c) SettingsManager.m29616a().mo25397a("storage_intercepter_key", C40353e.C40356c.class, AbstractC40381g.f94567a);
            if (C40353e.m81545a(file.getAbsolutePath(), cVar)) {
                C40353e.m81540a(file, new RuntimeException(), "exception_delete_log", C40353e.m81542a(cVar));
            }
            if (C40353e.m81549c(file.getAbsolutePath(), cVar)) {
                C40353e.m81540a(file, new RuntimeException(), "exception_handle", C40353e.m81542a(cVar));
                return false;
            }
        } catch (Throwable unused) {
        }
        return file.delete();
    }

    private static int modeToMode(String str) {
        if ("r".equals(str)) {
            return 268435456;
        }
        if ("w".equals(str) || "wt".equals(str)) {
            return 738197504;
        }
        if ("wa".equals(str)) {
            return 704643072;
        }
        if ("rw".equals(str)) {
            return 939524096;
        }
        if ("rwt".equals(str)) {
            return 1006632960;
        }
        throw new IllegalArgumentException("Invalid mode: ".concat(String.valueOf(str)));
    }

    private static Object[] copyOf(Object[] objArr, int i) {
        Object[] objArr2 = new Object[i];
        System.arraycopy(objArr, 0, objArr2, 0, i);
        return objArr2;
    }

    public Uri insert(Uri uri, ContentValues contentValues) {
        throw new UnsupportedOperationException("No external inserts");
    }

    private static String[] copyOf(String[] strArr, int i) {
        String[] strArr2 = new String[i];
        System.arraycopy(strArr, 0, strArr2, 0, i);
        return strArr2;
    }

    public ParcelFileDescriptor FileProvider__openFile$___twin___(Uri uri, String str) {
        return ParcelFileDescriptor.open(this.mStrategy.mo2666a(uri), modeToMode(str));
    }

    private static File buildPath(File file, String... strArr) {
        for (String str : strArr) {
            if (str != null) {
                file = new File(file, str);
            }
        }
        return file;
    }

    /* renamed from: androidx_core_content_FileProvider_com_ss_android_ugc_aweme_lancet_file_LazyFileProvider_getType */
    public static String m2319x3a9457e4(FileProvider fileProvider, Uri uri) {
        if (fileProvider != null && (fileProvider instanceof FileProvider)) {
            synchronized (fileProvider) {
                Object obj = fileProvider.mLazyProviderInfo;
                if (obj != null && (obj instanceof ProviderInfo)) {
                    try {
                        fileProvider.attachInfo(fileProvider.getContext(), (ProviderInfo) obj);
                    } catch (Throwable th) {
                        throw new RuntimeException(th);
                    }
                }
            }
        }
        return fileProvider.FileProvider__getType$___twin___(uri);
    }

    private static AbstractC0624a getPathStrategy(Context context, String str) {
        AbstractC0624a aVar;
        synchronized (sCache) {
            aVar = sCache.get(str);
            if (aVar == null) {
                try {
                    aVar = parsePathStrategy(context, str);
                    sCache.put(str, aVar);
                } catch (IOException e) {
                    throw new IllegalArgumentException("Failed to parse android.support.FILE_PROVIDER_PATHS meta-data", e);
                } catch (XmlPullParserException e2) {
                    throw new IllegalArgumentException("Failed to parse android.support.FILE_PROVIDER_PATHS meta-data", e2);
                }
            }
        }
        return aVar;
    }

    public void FileProvider__attachInfo$___twin___(Context context, ProviderInfo providerInfo) {
        super.attachInfo(context, providerInfo);
        if (providerInfo.exported) {
            throw new SecurityException("Provider must not be exported");
        } else if (providerInfo.grantUriPermissions) {
            this.mStrategy = getPathStrategy(context, providerInfo.authority);
        } else {
            throw new SecurityException("Provider must grant uri permissions");
        }
    }

    private static AbstractC0624a parsePathStrategy(Context context, String str) {
        File file;
        C0625b bVar = new C0625b(str);
        ProviderInfo resolveContentProvider = context.getPackageManager().resolveContentProvider(str, 128);
        if (resolveContentProvider != null) {
            XmlResourceParser loadXmlMetaData = resolveContentProvider.loadXmlMetaData(context.getPackageManager(), "android.support.FILE_PROVIDER_PATHS");
            if (loadXmlMetaData != null) {
                while (true) {
                    int next = loadXmlMetaData.next();
                    if (next == 1) {
                        return bVar;
                    }
                    if (next == 2) {
                        String name = loadXmlMetaData.getName();
                        String attributeValue = loadXmlMetaData.getAttributeValue(null, StringSet.name);
                        String attributeValue2 = loadXmlMetaData.getAttributeValue(null, "path");
                        if ("root-path".equals(name)) {
                            file = DEVICE_ROOT;
                        } else if ("files-path".equals(name)) {
                            file = m2316xec0aa024(context);
                        } else if ("cache-path".equals(name)) {
                            file = m2315xfdfd8b39(context);
                        } else if ("external-path".equals(name)) {
                            file = Environment.getExternalStorageDirectory();
                        } else if ("external-files-path".equals(name)) {
                            int i = Build.VERSION.SDK_INT;
                            File[] externalFilesDirs = context.getExternalFilesDirs(null);
                            if (externalFilesDirs.length > 0) {
                                file = externalFilesDirs[0];
                            } else {
                                continue;
                            }
                        } else if ("external-cache-path".equals(name)) {
                            int i2 = Build.VERSION.SDK_INT;
                            File[] externalCacheDirs = context.getExternalCacheDirs();
                            if (externalCacheDirs.length > 0) {
                                file = externalCacheDirs[0];
                            } else {
                                continue;
                            }
                        } else if (Build.VERSION.SDK_INT >= 21 && "external-media-path".equals(name)) {
                            File[] externalMediaDirs = context.getExternalMediaDirs();
                            if (externalMediaDirs.length > 0) {
                                file = externalMediaDirs[0];
                            } else {
                                continue;
                            }
                        }
                        if (file != null) {
                            File buildPath = buildPath(file, attributeValue2);
                            if (!TextUtils.isEmpty(attributeValue)) {
                                try {
                                    bVar.f2620a.put(attributeValue, buildPath.getCanonicalFile());
                                } catch (IOException e) {
                                    throw new IllegalArgumentException("Failed to resolve canonical path for ".concat(String.valueOf(buildPath)), e);
                                }
                            } else {
                                throw new IllegalArgumentException("Name must not be empty");
                            }
                        } else {
                            continue;
                        }
                    }
                }
            } else {
                throw new IllegalArgumentException("Missing android.support.FILE_PROVIDER_PATHS meta-data");
            }
        } else {
            throw new IllegalArgumentException("Couldn't find meta-data for provider with authority ".concat(String.valueOf(str)));
        }
    }

    public static Uri getUriForFile(Context context, String str, File file) {
        return getPathStrategy(context, str).mo2665a(file);
    }

    public int FileProvider__delete$___twin___(Uri uri, String str, String[] strArr) {
        if (m2322x8f1e193c(this.mStrategy.mo2666a(uri))) {
            return 1;
        }
        return 0;
    }

    /* renamed from: androidx_core_content_FileProvider_com_ss_android_ugc_aweme_lancet_file_LazyFileProvider_attachInfo */
    public static void m2317x74d45fdf(FileProvider fileProvider, Context context, ProviderInfo providerInfo) {
        if (fileProvider == null || !(fileProvider instanceof FileProvider)) {
            fileProvider.FileProvider__attachInfo$___twin___(context, providerInfo);
        } else if (fileProvider.getContext() != null) {
            fileProvider.FileProvider__attachInfo$___twin___(context, providerInfo);
        } else if (providerInfo.exported) {
            throw new SecurityException("Provider must not be exported");
        } else if (providerInfo.grantUriPermissions) {
            fileProvider.mLazyProviderInfo = providerInfo;
            providerInfo.grantUriPermissions = false;
            try {
                fileProvider.FileProvider__attachInfo$___twin___(context, providerInfo);
            } catch (SecurityException unused) {
            }
            providerInfo.grantUriPermissions = true;
        } else {
            throw new SecurityException("Provider must grant uri permissions");
        }
    }

    /* renamed from: androidx_core_content_FileProvider_com_ss_android_ugc_aweme_lancet_file_LazyFileProvider_openFile */
    public static ParcelFileDescriptor m2320x84a30132(FileProvider fileProvider, Uri uri, String str) {
        if (fileProvider != null && (fileProvider instanceof FileProvider)) {
            synchronized (fileProvider) {
                Object obj = fileProvider.mLazyProviderInfo;
                if (obj != null && (obj instanceof ProviderInfo)) {
                    try {
                        fileProvider.attachInfo(fileProvider.getContext(), (ProviderInfo) obj);
                    } catch (Throwable th) {
                        throw new RuntimeException(th);
                    }
                }
            }
        }
        return fileProvider.FileProvider__openFile$___twin___(uri, str);
    }

    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        throw new UnsupportedOperationException("No external updates");
    }

    /* renamed from: androidx_core_content_FileProvider_com_ss_android_ugc_aweme_lancet_file_LazyFileProvider_delete */
    public static int m2318xbab14ef7(FileProvider fileProvider, Uri uri, String str, String[] strArr) {
        if (fileProvider != null && (fileProvider instanceof FileProvider)) {
            synchronized (fileProvider) {
                Object obj = fileProvider.mLazyProviderInfo;
                if (obj != null && (obj instanceof ProviderInfo)) {
                    try {
                        fileProvider.attachInfo(fileProvider.getContext(), (ProviderInfo) obj);
                    } catch (Throwable th) {
                        throw new RuntimeException(th);
                    }
                }
            }
        }
        return fileProvider.FileProvider__delete$___twin___(uri, str, strArr);
    }

    public Cursor FileProvider__query$___twin___(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        int i;
        File a = this.mStrategy.mo2666a(uri);
        if (strArr == null) {
            strArr = COLUMNS;
        }
        String[] strArr3 = new String[strArr.length];
        Object[] objArr = new Object[strArr.length];
        int i2 = 0;
        for (String str3 : strArr) {
            if ("_display_name".equals(str3)) {
                strArr3[i2] = "_display_name";
                i = i2 + 1;
                objArr[i2] = a.getName();
            } else if ("_size".equals(str3)) {
                strArr3[i2] = "_size";
                i = i2 + 1;
                objArr[i2] = Long.valueOf(a.length());
            }
            i2 = i;
        }
        String[] copyOf = copyOf(strArr3, i2);
        Object[] copyOf2 = copyOf(objArr, i2);
        MatrixCursor matrixCursor = new MatrixCursor(copyOf, 1);
        matrixCursor.addRow(copyOf2);
        return matrixCursor;
    }

    /* renamed from: androidx_core_content_FileProvider_com_ss_android_ugc_aweme_lancet_file_LazyFileProvider_query */
    public static Cursor m2321xf63ff5fc(FileProvider fileProvider, Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        if (fileProvider != null && (fileProvider instanceof FileProvider)) {
            synchronized (fileProvider) {
                Object obj = fileProvider.mLazyProviderInfo;
                if (obj != null && (obj instanceof ProviderInfo)) {
                    try {
                        fileProvider.attachInfo(fileProvider.getContext(), (ProviderInfo) obj);
                    } catch (Throwable th) {
                        throw new RuntimeException(th);
                    }
                }
            }
        }
        return fileProvider.FileProvider__query$___twin___(uri, strArr, str, strArr2, str2);
    }
}
