package com.p2082ss.android.socialbase.downloader.p2189k;

import android.app.ActivityManager;
import android.content.ClipboardManager;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Environment;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.os.StatFs;
import android.text.TextUtils;
import android.util.SparseArray;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13849d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.platform.godzilla.p1575b.p1583b.C21708b;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.p2082ss.android.p2153j.AbstractC29949b;
import com.p2082ss.android.p2153j.C29950c;
import com.p2082ss.android.socialbase.downloader.depend.AbstractC30341ae;
import com.p2082ss.android.socialbase.downloader.downloader.C30399c;
import com.p2082ss.android.socialbase.downloader.exception.BaseException;
import com.p2082ss.android.socialbase.downloader.exception.DownloadHttpException;
import com.p2082ss.android.socialbase.downloader.impls.C30499l;
import com.p2082ss.android.socialbase.downloader.model.DownloadChunk;
import com.p2082ss.android.socialbase.downloader.model.DownloadInfo;
import com.p2082ss.android.socialbase.downloader.model.HttpHeader;
import com.p2082ss.android.socialbase.downloader.p2179b.EnumC30294h;
import com.p2082ss.android.socialbase.downloader.p2181d.C30325a;
import com.p2082ss.android.socialbase.downloader.p2181d.C30326b;
import com.p2082ss.android.socialbase.downloader.p2182e.C30434a;
import com.p2082ss.android.socialbase.downloader.p2184g.AbstractC30460g;
import com.p2082ss.android.socialbase.downloader.p2187i.C30472a;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.lancet.C58016d;
import com.p2082ss.android.ugc.aweme.lancet.C58027i;
import com.p2082ss.android.ugc.aweme.net.p3492e.C61338a;
import com.p2082ss.android.ugc.aweme.p2690cr.AbstractC40381g;
import com.p2082ss.android.ugc.aweme.p2690cr.C40353e;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.InterruptedIOException;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Field;
import java.net.ConnectException;
import java.net.HttpRetryException;
import java.net.MalformedURLException;
import java.net.NoRouteToHostException;
import java.net.PortUnreachableException;
import java.net.ProtocolException;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.net.UnknownServiceException;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLHandshakeException;
import okhttp3.internal.p4657e.C90148n;
import org.json.JSONObject;

/* renamed from: com.ss.android.socialbase.downloader.k.g */
public class C30535g {

    /* renamed from: a */
    public static final String f72839a = C30535g.class.getSimpleName();

    /* renamed from: b */
    public static volatile SparseArray<Boolean> f72840b = new SparseArray<>();

    /* renamed from: c */
    public static volatile SparseArray<List<AbstractC30341ae>> f72841c = new SparseArray<>();

    /* renamed from: d */
    private static final Pattern f72842d = Pattern.compile(".*\\d+ *- *(\\d+) */ *\\d+");

    /* renamed from: e */
    private static String f72843e = null;

    /* renamed from: f */
    private static final char[] f72844f = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* renamed from: g */
    private static Pattern f72845g = null;

    /* renamed from: h */
    private static Pattern f72846h = null;

    /* renamed from: i */
    private static ConnectivityManager f72847i;

    /* renamed from: j */
    private static Boolean f72848j;

    /* renamed from: k */
    private static Boolean f72849k;

    /* renamed from: a */
    public static boolean m62558a(int i) {
        return i == 0 || i == 2;
    }

    /* renamed from: a */
    public static boolean m62560a(long j) {
        return j == -1;
    }

    /* renamed from: a */
    private static String m62544a(byte[] bArr, int i) {
        Objects.requireNonNull(bArr, "bytes is null");
        if (i + 0 <= bArr.length) {
            int i2 = i * 2;
            char[] cArr = new char[i2];
            int i3 = 0;
            for (int i4 = 0; i4 < i; i4++) {
                int i5 = bArr[i4 + 0] & 255;
                int i6 = i3 + 1;
                char[] cArr2 = f72844f;
                cArr[i3] = cArr2[i5 >> 4];
                i3 = i6 + 1;
                cArr[i6] = cArr2[i5 & 15];
            }
            return new String(cArr, 0, i2);
        }
        throw new IndexOutOfBoundsException();
    }

    /* renamed from: a */
    public static List<DownloadChunk> m62546a(List<DownloadChunk> list) {
        SparseArray sparseArray = new SparseArray();
        SparseArray sparseArray2 = new SparseArray();
        for (DownloadChunk downloadChunk : list) {
            if (downloadChunk != null) {
                if (downloadChunk.mo54403b()) {
                    sparseArray.put(downloadChunk.f72916e, downloadChunk);
                    List<DownloadChunk> list2 = (List) sparseArray2.get(downloadChunk.f72916e);
                    if (list2 != null) {
                        for (DownloadChunk downloadChunk2 : list2) {
                            downloadChunk2.mo54400a(downloadChunk);
                        }
                        downloadChunk.f72918g = list2;
                    }
                } else {
                    DownloadChunk downloadChunk3 = (DownloadChunk) sparseArray.get(downloadChunk.mo54396a());
                    if (downloadChunk3 != null) {
                        List list3 = downloadChunk3.f72918g;
                        if (list3 == null) {
                            list3 = new ArrayList();
                            downloadChunk3.f72918g = list3;
                        }
                        downloadChunk.mo54400a(downloadChunk3);
                        list3.add(downloadChunk);
                    } else {
                        List list4 = (List) sparseArray2.get(downloadChunk.mo54396a());
                        if (list4 == null) {
                            list4 = new ArrayList();
                            sparseArray2.put(downloadChunk.mo54396a(), list4);
                        }
                        list4.add(downloadChunk);
                    }
                }
            }
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < sparseArray.size(); i++) {
            arrayList.add(sparseArray.get(sparseArray.keyAt(i)));
        }
        return arrayList.isEmpty() ? list : arrayList;
    }

    /* renamed from: a */
    public static String m62543a(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return null;
        }
        return new C30325a(str, str2).mo53843e();
    }

    /* renamed from: a */
    public static void m62552a(DownloadInfo downloadInfo, boolean z) {
        if (downloadInfo != null) {
            if (downloadInfo.isForce() && !m62605e(downloadInfo.getSavePath())) {
                z = false;
            } else if (z) {
                try {
                    m62577b(downloadInfo.getSavePath(), downloadInfo.getName());
                } catch (Throwable unused) {
                    return;
                }
            }
            m62577b(downloadInfo.getTempPath(), downloadInfo.getTempName());
            if (downloadInfo.isSavePathRedirected()) {
                m62550a(downloadInfo);
            }
            if (z) {
                String c = m62590c(downloadInfo.getUrl());
                if (!TextUtils.isEmpty(c) && !TextUtils.isEmpty(downloadInfo.getSavePath()) && downloadInfo.getSavePath().contains(c)) {
                    m62611h(downloadInfo.getSavePath());
                }
            }
        }
    }

    /* renamed from: a */
    public static void m62550a(DownloadInfo downloadInfo) {
        C30472a a;
        JSONObject a2;
        if (downloadInfo != null && (a2 = (a = C30472a.m62087a(downloadInfo.getId(), (DownloadInfo) null)).mo54261a("download_dir")) != null) {
            String optString = a2.optString("ins_desc");
            if (!TextUtils.isEmpty(optString)) {
                m62577b(downloadInfo.getSavePath(), optString);
            }
            String title = downloadInfo.getTitle();
            if (TextUtils.isEmpty(title)) {
                title = downloadInfo.getName();
            }
            String a3 = m62542a(title, a);
            String savePath = downloadInfo.getSavePath();
            if (!TextUtils.isEmpty(a3) && !TextUtils.isEmpty(savePath)) {
                File file = new File(a3);
                File file2 = new File(savePath);
                while (file2.isDirectory() && TextUtils.equals(file.getName(), file2.getName())) {
                    m62611h(file2.getPath());
                    file = file.getParentFile();
                    file2 = file2.getParentFile();
                    if (file == null) {
                        return;
                    }
                    if (file2 == null) {
                        return;
                    }
                }
            }
        }
    }

    /* renamed from: b */
    public static void m62577b(String str, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            C30325a aVar = new C30325a(str, str2, false, true);
            if (aVar.mo53840b()) {
                aVar.mo53842d();
            }
        }
    }

    /* renamed from: a */
    public static boolean m62562a(Context context, String str) {
        if (context == null || TextUtils.isEmpty(str) || context.checkCallingOrSelfPermission(str) != 0) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static boolean m62566a(DownloadInfo downloadInfo, boolean z, String str) {
        if (!z && !TextUtils.isEmpty(downloadInfo.getSavePath()) && !TextUtils.isEmpty(downloadInfo.getName())) {
            try {
                C30325a aVar = new C30325a(downloadInfo.getSavePath(), downloadInfo.getName());
                if (C30326b.m61486a(aVar) && m62565a(downloadInfo, aVar) && m62558a(m62534a(aVar, str))) {
                    return true;
                }
            } catch (OutOfMemoryError e) {
                e.printStackTrace();
            }
        }
        return false;
    }

    /* renamed from: c */
    public static boolean m62595c(DownloadInfo downloadInfo) {
        boolean z = false;
        if (downloadInfo.isDeleteCacheIfCheckFailed() || !TextUtils.isEmpty(downloadInfo.getLastModified())) {
            C30434a.m62027b(f72839a, "dcache::curt=" + System.currentTimeMillis() + " expired=" + downloadInfo.getCacheExpiredTime());
            if (System.currentTimeMillis() > downloadInfo.getCacheExpiredTime()) {
                z = true;
            }
        } else {
            C30434a.m62027b(f72839a, "dcache::last modify is emtpy, so just return cache");
        }
        C30434a.m62027b(f72839a, "cacheExpired::dcache::name=" + downloadInfo.getName() + " expired=" + z);
        return z;
    }

    /* renamed from: a */
    public static boolean m62565a(DownloadInfo downloadInfo, C30325a aVar) {
        return downloadInfo.getTotalBytes() <= 0 || aVar.mo53837a() >= downloadInfo.getTotalBytes();
    }

    /* renamed from: a */
    public static void m62548a(int i, boolean z, BaseException baseException) {
        MethodCollector.m26663i(9840);
        synchronized (f72840b) {
            try {
                List<AbstractC30341ae> list = f72841c.get(i);
                if (list != null) {
                    for (AbstractC30341ae aeVar : list) {
                        if (aeVar != null) {
                            if (z) {
                                aeVar.mo53871a();
                            } else {
                                aeVar.mo53872a(baseException);
                            }
                        }
                    }
                }
                C30434a.m62027b(f72839a, "handleTempSaveCallback id:".concat(String.valueOf(i)));
                f72840b.remove(i);
            } finally {
                MethodCollector.m26664o(9840);
            }
        }
    }

    /* renamed from: a */
    public static void m62551a(DownloadInfo downloadInfo, String str, String str2) {
        if (downloadInfo != null && !TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str) && !str2.equals(downloadInfo.getName())) {
            C30325a aVar = new C30325a(downloadInfo.getSavePath(), str2);
            C30325a aVar2 = new C30325a(downloadInfo.getSavePath(), downloadInfo.getName());
            aVar.mo53843e();
            aVar2.mo53843e();
            if (aVar2.mo53840b() && !aVar2.mo53844f()) {
                throw new BaseException(1001, "targetPath file exists but read-only");
            } else if (!m62581b(aVar, aVar2)) {
                throw new BaseException(1001, C1764a.m5928a("Can't copy the exist file(%s/%s) to the target file(%s/%s)", new Object[]{downloadInfo.getSavePath(), str2, downloadInfo.getSavePath(), downloadInfo.getName()}));
            }
        }
    }

    /* renamed from: b */
    private static boolean m62581b(C30325a aVar, C30325a aVar2) {
        if (!(aVar == null || aVar2 == null)) {
            try {
                if (aVar.mo53840b() && !aVar.mo53841c()) {
                    if (!aVar.mo53850l().equals(aVar2.mo53850l())) {
                        File k = aVar2.mo53849k();
                        if (k == null || k.mkdirs() || k.isDirectory()) {
                            aVar.mo53843e();
                            aVar2.mo53843e();
                            if (!aVar2.mo53840b() || aVar2.mo53844f()) {
                                m62592c(aVar, aVar2);
                                return true;
                            }
                            throw new IOException("Destination '" + aVar2 + "' exists but is read-only");
                        }
                        throw new BaseException(1053, "Destination '" + k + "' directory cannot be created");
                    }
                }
            } catch (BaseException e) {
                throw e;
            } catch (Throwable th) {
                m62554a(th, "CopyFile");
                return false;
            }
        }
        return false;
    }

    /* renamed from: a */
    public static boolean m62563a(C30325a aVar, C30325a aVar2) {
        aVar.mo53843e();
        aVar2.mo53843e();
        boolean a = aVar.mo53839a(aVar2);
        if (!a) {
            a = m62581b(aVar, aVar2);
            try {
                aVar.mo53843e();
                aVar2.mo53843e();
                aVar.mo53842d();
            } catch (Throwable unused) {
            }
        }
        return a;
    }

    /* renamed from: a */
    public static List<HttpHeader> m62547a(List<HttpHeader> list, String str, long j, long j2) {
        String a;
        ArrayList arrayList = new ArrayList();
        if (list != null && list.size() > 0) {
            for (HttpHeader httpHeader : list) {
                if (httpHeader != null) {
                    arrayList.add(httpHeader);
                }
            }
        }
        if (!TextUtils.isEmpty(str)) {
            arrayList.add(new HttpHeader("If-Match", str));
        }
        arrayList.add(new HttpHeader("Accept-Encoding", "identity"));
        if (j2 <= 0) {
            a = C1764a.m5928a("bytes=%s-", new Object[]{String.valueOf(j)});
        } else {
            a = C1764a.m5928a("bytes=%s-%s", new Object[]{String.valueOf(j), String.valueOf(j2)});
        }
        arrayList.add(new HttpHeader("Range", a));
        C30434a.m62027b(f72839a, " range CurrentOffset:" + j + " EndOffset:" + j2 + ", range = " + a);
        return arrayList;
    }

    /* renamed from: a */
    public static boolean m62559a(int i, String str, String str2) {
        return i == -3 && !m62600d(str, str2);
    }

    /* renamed from: a */
    public static boolean m62561a(Context context) {
        NetworkInfo a;
        try {
            ConnectivityManager d = m62597d(context);
            if (!(d == null || (a = m62537a(d)) == null)) {
                if (a.isAvailable()) {
                    if (1 == a.getType()) {
                        return true;
                    }
                }
            }
        } catch (Exception unused) {
        }
        return false;
    }

    /* renamed from: b */
    public static boolean m62580b(Context context) {
        NetworkInfo a;
        try {
            ConnectivityManager d = m62597d(context);
            if (d == null || (a = m62537a(d)) == null) {
                return false;
            }
            return a.isConnected();
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: a */
    public static boolean m62557a() {
        Boolean bool = f72848j;
        if (bool != null) {
            return bool.booleanValue();
        }
        boolean z = false;
        if (C30472a.f72639a.mo54258a("force_independent_process", 0) > 0) {
            Boolean bool2 = false;
            f72848j = bool2;
            return bool2.booleanValue();
        } else if (C30399c.m61674B() == null) {
            return true;
        } else {
            String c = m62589c(C30399c.m61674B());
            if (c != null && !c.contains(":") && c.equals(C30399c.m61674B().getPackageName())) {
                z = true;
            }
            Boolean valueOf = Boolean.valueOf(z);
            f72848j = valueOf;
            return valueOf.booleanValue();
        }
    }

    /* renamed from: b */
    public static boolean m62579b() {
        return !m62594c() && C30399c.m61714c() && C30499l.m62246a(true).mo54190h();
    }

    /* renamed from: c */
    public static boolean m62594c() {
        Boolean bool = f72849k;
        if (bool != null) {
            return bool.booleanValue();
        }
        if (C30399c.m61674B() == null) {
            return false;
        }
        String c = m62589c(C30399c.m61674B());
        if (c == null || !c.equals(C30399c.m61674B().getPackageName() + ":downloader")) {
            f72849k = false;
        } else {
            f72849k = true;
        }
        return f72849k.booleanValue();
    }

    /* renamed from: a */
    public static boolean m62568a(Throwable th) {
        if (th == null) {
            return false;
        }
        C30399c.m61673A();
        String e = m62604e(th);
        if (TextUtils.isEmpty(e) || !e.contains("Precondition Failed")) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public static boolean m62585b(Throwable th) {
        if (th == null) {
            return false;
        }
        C30399c.m61673A();
        String e = m62604e(th);
        if (TextUtils.isEmpty(e) || !e.contains("Requested Range Not Satisfiable")) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static boolean m62564a(BaseException baseException) {
        return baseException.getErrorCode() == 1051;
    }

    /* renamed from: b */
    public static boolean m62582b(BaseException baseException) {
        if (!(baseException instanceof DownloadHttpException)) {
            return false;
        }
        DownloadHttpException downloadHttpException = (DownloadHttpException) baseException;
        return downloadHttpException.getHttpStatusCode() == 412 || downloadHttpException.getHttpStatusCode() == 416;
    }

    /* renamed from: a */
    public static void m62554a(Throwable th, String str) {
        String str2 = !TextUtils.isEmpty(str) ? str : "";
        if (th instanceof BaseException) {
            BaseException baseException = (BaseException) th;
            baseException.setErrorMsg(str2 + "-" + baseException.getErrorMessage());
            throw baseException;
        } else if (th instanceof SSLHandshakeException) {
            throw new BaseException(1011, m62576b(th, str2));
        } else if (m62608f(th)) {
            throw new BaseException(1048, m62576b(th, str2));
        } else if (m62568a(th)) {
            throw new DownloadHttpException(1004, 412, m62576b(th, str2));
        } else if (m62585b(th)) {
            throw new DownloadHttpException(1004, 416, m62576b(th, str2));
        } else if (m62610g(th)) {
            throw new BaseException(1047, m62576b(th, str2));
        } else if (m62612h(th)) {
            throw new BaseException(1049, m62576b(th, str2));
        } else if (m62613i(th)) {
            throw new BaseException(1041, m62576b(th, str2));
        } else if (th instanceof IOException) {
            m62614j(th);
            m62553a((IOException) th, str);
        } else {
            throw new BaseException(1000, m62576b(th, str2));
        }
    }

    /* renamed from: a */
    private static void m62553a(IOException iOException, String str) {
        if (str == null) {
            str = "";
        }
        String b = m62576b(iOException, str);
        if (iOException instanceof ConnectException) {
            throw new BaseException(1041, b);
        } else if (iOException instanceof UnknownHostException) {
            throw new BaseException(1055, b);
        } else if (iOException instanceof NoRouteToHostException) {
            throw new BaseException(1056, b);
        } else if (iOException instanceof UnknownServiceException) {
            throw new BaseException(1057, b);
        } else if (iOException instanceof PortUnreachableException) {
            throw new BaseException(1058, b);
        } else if (iOException instanceof SocketTimeoutException) {
            throw new BaseException(1048, b);
        } else if (iOException instanceof SocketException) {
            throw new BaseException(1059, b);
        } else if (iOException instanceof HttpRetryException) {
            throw new BaseException(1060, b);
        } else if (iOException instanceof ProtocolException) {
            throw new BaseException(1061, b);
        } else if (iOException instanceof MalformedURLException) {
            throw new BaseException(1062, b);
        } else if (iOException instanceof FileNotFoundException) {
            throw new BaseException(1063, b);
        } else if (iOException instanceof InterruptedIOException) {
            throw new BaseException(1064, b);
        } else if (iOException instanceof UnsupportedEncodingException) {
            throw new BaseException(1065, b);
        } else if (iOException instanceof EOFException) {
            throw new BaseException(1066, b);
        } else if (iOException instanceof C90148n) {
            throw new BaseException(1067, b);
        } else if (iOException instanceof SSLException) {
            throw new BaseException(1011, b);
        } else if (m62596c(iOException)) {
            throw new BaseException(1006, b);
        } else {
            throw new BaseException(1023, b);
        }
    }

    /* renamed from: c */
    public static boolean m62596c(Throwable th) {
        if (th == null) {
            return false;
        }
        if (th instanceof BaseException) {
            BaseException baseException = (BaseException) th;
            int errorCode = baseException.getErrorCode();
            if (errorCode == 1006) {
                return true;
            }
            if (errorCode == 1023 || errorCode == 1039 || errorCode == 1040 || errorCode == 1054 || errorCode == 1064) {
                String message = baseException.getMessage();
                return !TextUtils.isEmpty(message) && message.contains("ENOSPC");
            }
        } else if (th instanceof IOException) {
            String e = m62604e(th);
            return !TextUtils.isEmpty(e) && e.contains("ENOSPC");
        }
    }

    /* renamed from: a */
    public static <K> HashMap<Integer, K> m62545a(SparseArray<K> sparseArray) {
        if (sparseArray == null) {
            return null;
        }
        HashMap<Integer, K> hashMap = new HashMap<>();
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            int keyAt = sparseArray.keyAt(i);
            hashMap.put(Integer.valueOf(keyAt), sparseArray.valueAt(i));
        }
        return hashMap;
    }

    /* renamed from: a */
    public static <K> void m62549a(SparseArray<K> sparseArray, Map<Integer, K> map) {
        if (!(map == null || sparseArray == null)) {
            for (Integer num : map.keySet()) {
                if (num != null) {
                    sparseArray.put(num.intValue(), map.get(num));
                }
            }
        }
    }

    /* renamed from: a */
    public static boolean m62569a(List<HttpHeader> list, List<HttpHeader> list2) {
        if (list == list2) {
            return true;
        }
        if (list == null || list2 == null || list.size() != list2.size()) {
            return false;
        }
        return new HashSet(list).equals(new HashSet(list2));
    }

    /* renamed from: a */
    public static void m62556a(Closeable... closeableArr) {
        for (Closeable closeable : closeableArr) {
            if (closeable != null) {
                try {
                    closeable.close();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* renamed from: a */
    private static String m62542a(String str, C30472a aVar) {
        JSONObject a;
        if (aVar == null || (a = aVar.mo54261a("download_dir")) == null) {
            return "";
        }
        String optString = a.optString("dir_name");
        if (!TextUtils.isEmpty(optString) && optString.startsWith("/")) {
            optString = optString.substring(1);
        }
        if (TextUtils.isEmpty(optString)) {
            return optString;
        }
        if (!optString.contains("%s")) {
            optString = optString + str;
        } else {
            try {
                optString = C1764a.m5928a(optString, new Object[]{str});
            } catch (Throwable unused) {
            }
        }
        return optString.length() > 255 ? optString.substring(optString.length() - 255) : optString;
    }

    /* renamed from: b */
    private static boolean m62584b(File file) {
        if (file == null) {
            return false;
        }
        try {
            if ((file.exists() || file.mkdirs()) && file.isDirectory()) {
                return true;
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: a */
    public static void m62555a(List<HttpHeader> list, DownloadInfo downloadInfo) {
        long throttleNetSpeed = downloadInfo.getThrottleNetSpeed();
        if (throttleNetSpeed > 0) {
            list.add(new HttpHeader("extra_throttle_net_speed", String.valueOf(throttleNetSpeed)));
        }
    }

    /* renamed from: b */
    public static void m62578b(List<HttpHeader> list, DownloadInfo downloadInfo) {
        long ttnetProtectTimeout = downloadInfo.getTtnetProtectTimeout();
        if (ttnetProtectTimeout > 300) {
            list.add(new HttpHeader("extra_ttnet_protect_timeout", String.valueOf(ttnetProtectTimeout)));
        }
    }

    /* renamed from: c */
    public static void m62593c(List<HttpHeader> list, DownloadInfo downloadInfo) {
        if (downloadInfo.isAddTTNetCommonParam()) {
            list.add(new HttpHeader("extra_ttnet_common_param", "true"));
        }
    }

    /* renamed from: a */
    private static boolean m62567a(File file) {
        MethodCollector.m26663i(9380);
        try {
            C40353e.C40356c cVar = (C40353e.C40356c) SettingsManager.m29616a().mo25397a("storage_intercepter_key", C40353e.C40356c.class, AbstractC40381g.f94567a);
            if (C40353e.m81545a(file.getAbsolutePath(), cVar)) {
                C40353e.m81540a(file, new RuntimeException(), "exception_delete_log", C40353e.m81542a(cVar));
            }
            if (C40353e.m81549c(file.getAbsolutePath(), cVar)) {
                C40353e.m81540a(file, new RuntimeException(), "exception_handle", C40353e.m81542a(cVar));
                MethodCollector.m26664o(9380);
                return false;
            }
        } catch (Throwable unused) {
        }
        boolean delete = file.delete();
        MethodCollector.m26664o(9380);
        return delete;
    }

    /* renamed from: d */
    public static boolean m62599d() {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    private static File m62607f() {
        String str;
        try {
            str = Environment.getExternalStorageState();
        } catch (Exception unused) {
            str = "";
        }
        if ("mounted".equals(str)) {
            return Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS);
        }
        return null;
    }

    static {
        Covode.recordClassIndex(37063);
    }

    /* renamed from: e */
    private static String m62603e() {
        BufferedReader bufferedReader;
        MethodCollector.m26663i(6451);
        try {
            bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream("/proc/" + Process.myPid() + "/cmdline"), "iso-8859-1"));
            try {
                StringBuilder sb = new StringBuilder();
                while (true) {
                    int read = bufferedReader.read();
                    if (read <= 0) {
                        break;
                    }
                    sb.append((char) read);
                }
                if (C30434a.m62025a()) {
                    C30434a.m62027b("Process", "get processName = " + sb.toString());
                }
                String sb2 = sb.toString();
                m62556a(bufferedReader);
                MethodCollector.m26664o(6451);
                return sb2;
            } catch (Throwable unused) {
                m62556a(bufferedReader);
                MethodCollector.m26664o(6451);
                return null;
            }
        } catch (Throwable unused2) {
            bufferedReader = null;
            m62556a(bufferedReader);
            MethodCollector.m26664o(6451);
            return null;
        }
    }

    /* renamed from: a */
    private static NetworkInfo m62537a(ConnectivityManager connectivityManager) {
        try {
            return connectivityManager.getActiveNetworkInfo();
        } catch (Exception e) {
            C51423a.m95790a((Throwable) e);
            return C61338a.m111034a();
        }
    }

    /* renamed from: b */
    public static boolean m62583b(DownloadInfo downloadInfo) {
        return m62566a(downloadInfo, downloadInfo.isForce(), downloadInfo.getMd5());
    }

    /* renamed from: d */
    private static ConnectivityManager m62597d(Context context) {
        ConnectivityManager connectivityManager = f72847i;
        if (connectivityManager != null) {
            return connectivityManager;
        }
        ConnectivityManager connectivityManager2 = (ConnectivityManager) m62588c(context, "connectivity");
        f72847i = connectivityManager2;
        return connectivityManager2;
    }

    /* renamed from: e */
    public static String m62604e(Throwable th) {
        if (th == null) {
            return "";
        }
        try {
            return th.toString();
        } catch (Throwable unused) {
            return "throwable getMsg error";
        }
    }

    /* renamed from: j */
    private static void m62614j(Throwable th) {
        C30399c.m61673A();
        C30399c.m61673A();
        th.getCause();
    }

    /* renamed from: b */
    public static long m62571b(String str) {
        try {
            StatFs statFs = new StatFs(str);
            int i = Build.VERSION.SDK_INT;
            return statFs.getAvailableBytes();
        } catch (IllegalArgumentException e) {
            throw new BaseException(1050, e);
        } catch (Throwable th) {
            throw new BaseException(1052, th);
        }
    }

    /* renamed from: c */
    public static EnumC30294h m62587c(int i) {
        EnumC30294h hVar = EnumC30294h.MAIN;
        if (i == EnumC30294h.SUB.ordinal()) {
            return EnumC30294h.SUB;
        }
        if (i == EnumC30294h.NOTIFICATION.ordinal()) {
            return EnumC30294h.NOTIFICATION;
        }
        return hVar;
    }

    /* renamed from: e */
    private static File m62602e(Context context) {
        if (C58016d.f132222c != null && C58016d.f132224e) {
            return C58016d.f132222c;
        }
        File filesDir = context.getFilesDir();
        C58016d.f132222c = filesDir;
        return filesDir;
    }

    /* renamed from: h */
    private static boolean m62612h(Throwable th) {
        if (th == null) {
            return false;
        }
        String e = m62604e(th);
        if (TextUtils.isEmpty(e) || !e.contains("network not available")) {
            return false;
        }
        return true;
    }

    /* renamed from: i */
    private static boolean m62613i(Throwable th) {
        if (th == null) {
            return false;
        }
        String e = m62604e(th);
        if (TextUtils.isEmpty(e) || !e.contains("Exception in connect")) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public static long m62572b(List<DownloadChunk> list) {
        long j = 0;
        for (DownloadChunk downloadChunk : list) {
            j += downloadChunk.mo54412j();
        }
        return j;
    }

    /* renamed from: c */
    public static String m62590c(String str) {
        if (str != null) {
            try {
                if (str.length() != 0) {
                    MessageDigest instance = MessageDigest.getInstance("MD5");
                    instance.update(str.getBytes("UTF-8"));
                    byte[] digest = instance.digest();
                    if (digest != null) {
                        return m62544a(digest, digest.length);
                    }
                    throw new NullPointerException("bytes is null");
                }
            } catch (Exception unused) {
            }
        }
        return null;
    }

    /* renamed from: d */
    public static String m62598d(String str) {
        StringBuilder sb = new StringBuilder();
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (charAt <= 31 || charAt >= 127) {
                sb.append(C1764a.m5928a("\\u%04x", new Object[]{Integer.valueOf(charAt)}));
            } else {
                sb.append(charAt);
            }
        }
        return sb.toString();
    }

    /* renamed from: e */
    public static boolean m62605e(String str) {
        Context B;
        if (C30472a.f72639a.mo54258a("save_path_security", 0) <= 0 || (B = C30399c.m61674B()) == null || TextUtils.isEmpty(str) || str.startsWith("/data") || str.contains("Android/data/" + B.getPackageName())) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public static long m62606f(String str) {
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        Matcher matcher = Pattern.compile("max-age=([0-9]+)").matcher(str);
        if (!matcher.find()) {
            return 0;
        }
        try {
            return Long.parseLong(matcher.group(1));
        } catch (Throwable unused) {
            return 0;
        }
    }

    /* renamed from: g */
    private static String m62609g(String str) {
        if (str == null) {
            return null;
        }
        try {
            if (f72845g == null) {
                f72845g = Pattern.compile("attachment;\\s*filename\\s*=\\s*\"([^\"]*)\"");
            }
            Matcher matcher = f72845g.matcher(str);
            if (matcher.find()) {
                return matcher.group(1);
            }
            if (f72846h == null) {
                f72846h = Pattern.compile("attachment;\\s*filename\\s*=\\s*(.*)");
            }
            Matcher matcher2 = f72846h.matcher(str);
            if (matcher2.find()) {
                return matcher2.group(1);
            }
            return null;
        } catch (Exception unused) {
        }
    }

    /* renamed from: h */
    private static boolean m62611h(String str) {
        Thread.currentThread();
        if (C30326b.m61483a(str) == 1 && m62605e(str) && !TextUtils.isEmpty(str)) {
            File file = new File(str);
            if (!file.isDirectory() || !m62567a(file)) {
                return false;
            }
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static long m62535a(AbstractC30460g gVar) {
        long j = -1;
        if (gVar == null) {
            return -1;
        }
        String b = m62575b(gVar, "Content-Length");
        if (TextUtils.isEmpty(b) && C30528a.m62524a(1)) {
            return m62570b(gVar);
        }
        try {
            j = Long.parseLong(b);
            return j;
        } catch (NumberFormatException unused) {
            return j;
        }
    }

    /* renamed from: b */
    private static long m62570b(AbstractC30460g gVar) {
        if (gVar == null) {
            return -1;
        }
        String b = m62575b(gVar, "Content-Range");
        if (TextUtils.isEmpty(b)) {
            return -1;
        }
        try {
            Matcher matcher = Pattern.compile("bytes (\\d+)-(\\d+)/\\d+").matcher(b);
            if (matcher.find()) {
                return (Long.parseLong(matcher.group(2)) - Long.parseLong(matcher.group(1))) + 1;
            }
        } catch (Exception e) {
            C30434a.m62029d(f72839a, "parse content-length from content-range failed ".concat(String.valueOf(e)));
        }
        return -1;
    }

    /* renamed from: c */
    public static long m62586c(List<DownloadChunk> list) {
        if (list == null || list.isEmpty()) {
            return -1;
        }
        long j = -1;
        for (DownloadChunk downloadChunk : list) {
            if (downloadChunk != null && ((downloadChunk.mo54411i() <= downloadChunk.f72914c || downloadChunk.f72914c == 0) && (j == -1 || j > downloadChunk.mo54411i()))) {
                j = downloadChunk.mo54411i();
            }
        }
        return j;
    }

    /* renamed from: f */
    private static boolean m62608f(Throwable th) {
        if (th == null) {
            return false;
        }
        String e = m62604e(th);
        if (th instanceof SocketTimeoutException) {
            return true;
        }
        if (TextUtils.isEmpty(e) || (!e.contains("time out") && !e.contains("Time-out"))) {
            return false;
        }
        return true;
    }

    /* renamed from: g */
    private static boolean m62610g(Throwable th) {
        DownloadHttpException downloadHttpException;
        if (th == null) {
            return false;
        }
        String e = m62604e(th);
        if ((th instanceof DownloadHttpException) && (((downloadHttpException = (DownloadHttpException) th) != null && downloadHttpException.getHttpStatusCode() == 403) || (!TextUtils.isEmpty(e) && e.contains("403")))) {
            return true;
        }
        if (TextUtils.isEmpty(e) || !e.contains("Forbidden")) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static long m62536a(String str) {
        if (str == null) {
            return -1;
        }
        String[] split = str.split("/");
        if (split.length >= 2) {
            try {
                return Long.parseLong(split[1]);
            } catch (NumberFormatException unused) {
                C30434a.m62029d(f72839a, "parse instance length failed with ".concat(String.valueOf(str)));
            }
        }
        return -1;
    }

    /* renamed from: d */
    public static boolean m62601d(Throwable th) {
        if (!(th instanceof BaseException)) {
            return false;
        }
        int errorCode = ((BaseException) th).getErrorCode();
        if (errorCode == 1055 || errorCode == 1023 || errorCode == 1041 || errorCode == 1022 || errorCode == 1048 || errorCode == 1056 || errorCode == 1057 || errorCode == 1058 || errorCode == 1059 || errorCode == 1060 || errorCode == 1061 || errorCode == 1067 || errorCode == 1049 || errorCode == 1047 || errorCode == 1051 || errorCode == 1004 || errorCode == 1011 || errorCode == 1002 || errorCode == 1013) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static String m62574b(int i) {
        String str = "ttmd5 check code = " + i + ", ";
        if (i == 99) {
            return str + "unknown error";
        }
        switch (i) {
            case 0:
                return str + "md5 match";
            case 1:
                return str + "md5 not match";
            case 2:
                return str + "md5 empty";
            case 3:
                return str + "ttmd5 version not support";
            case 4:
                return str + "ttmd5 tag parser error";
            case ABRConfig.ABR_STARTUP_MODEL_KEY:
                return str + "file not exist";
            case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                return str + "get file md5 error";
            default:
                return str;
        }
    }

    /* renamed from: c */
    public static String m62589c(Context context) {
        String str = f72843e;
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        try {
            int myPid = Process.myPid();
            ActivityManager activityManager = (ActivityManager) m62588c(context, "activity");
            if (activityManager != null) {
                for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : activityManager.getRunningAppProcesses()) {
                    if (runningAppProcessInfo.pid == myPid) {
                        if (C30434a.m62025a()) {
                            C30434a.m62027b("Process", "processName = " + runningAppProcessInfo.processName);
                        }
                        String str2 = runningAppProcessInfo.processName;
                        f72843e = str2;
                        return str2;
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        String e2 = m62603e();
        f72843e = e2;
        return e2;
    }

    /* renamed from: a */
    public static String m62539a(AbstractC30460g gVar, String str) {
        String g = m62609g(gVar.mo54234a("Content-Disposition"));
        if (TextUtils.isEmpty(g)) {
            return m62590c(str);
        }
        return g;
    }

    /* renamed from: a */
    public static int m62534a(C30325a aVar, String str) {
        if (aVar.mo53852n()) {
            return C29950c.m60354a(str, aVar.mo53845g(), (AbstractC29949b) null);
        }
        try {
            return C29950c.m60354a(str, aVar.mo53845g(), new C30529b(aVar.mo53847i()));
        } catch (Throwable unused) {
            return 5;
        }
    }

    /* renamed from: d */
    private static boolean m62600d(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return false;
        }
        return new C30325a(str, str2).mo53840b();
    }

    /* renamed from: b */
    private static File m62573b(Context context, String str) {
        if (!TextUtils.isEmpty(str)) {
            return context.getExternalFilesDir(str);
        }
        if (C58016d.f132223d != null && C58016d.f132224e) {
            return C58016d.f132223d;
        }
        File externalFilesDir = context.getExternalFilesDir(str);
        C58016d.f132223d = externalFilesDir;
        return externalFilesDir;
    }

    /* renamed from: c */
    private static Object m62588c(Context context, String str) {
        Object obj;
        MethodCollector.m26663i(10460);
        if (Build.VERSION.SDK_INT > 27 || !"clipboard".equals(str)) {
            if (!C58027i.f132247b && "connectivity".equals(str)) {
                try {
                    new C21708b().mo35361a();
                    C58027i.f132247b = true;
                    obj = context.getSystemService(str);
                } catch (Throwable unused) {
                }
            }
            obj = context.getSystemService(str);
        } else if (C58027i.f132246a) {
            synchronized (ClipboardManager.class) {
                try {
                    obj = context.getSystemService(str);
                    if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                        try {
                            Field declaredField = ClipboardManager.class.getDeclaredField("mHandler");
                            declaredField.setAccessible(true);
                            declaredField.set(obj, new C58027i.HandlerC58028a((Handler) declaredField.get(obj)));
                        } catch (Exception e) {
                            C13849d.m25015a(e, "ClipboardManager Handler Reflect Fail");
                        }
                    }
                    C58027i.f132246a = false;
                } finally {
                    MethodCollector.m26664o(10460);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }

    /* renamed from: a */
    public static String m62540a(File file, boolean z) {
        Context B = C30399c.m61674B();
        if (m62584b(file)) {
            return file.getAbsolutePath();
        }
        int i = B.getApplicationInfo().targetSdkVersion;
        if (Build.VERSION.SDK_INT < 29 || (i != 29 ? i <= 29 : Environment.isExternalStorageLegacy())) {
            if (z) {
                File f = m62607f();
                if (m62584b(f)) {
                    return f.getAbsolutePath();
                }
            }
            File b = m62573b(B, Environment.DIRECTORY_DOWNLOADS);
            if (m62584b(b)) {
                return b.getAbsolutePath();
            }
        } else {
            File b2 = m62573b(B, Environment.DIRECTORY_DOWNLOADS);
            if (m62584b(b2)) {
                return b2.getAbsolutePath();
            }
        }
        return m62602e(B).getAbsolutePath();
    }

    /* renamed from: b */
    public static String m62575b(AbstractC30460g gVar, String str) {
        if (gVar == null || TextUtils.isEmpty(str)) {
            return null;
        }
        String a = gVar.mo54234a(str);
        if (!C30472a.f72639a.mo54262a("fix_get_http_resp_head_ignore_case", true)) {
            return a;
        }
        if (TextUtils.isEmpty(a)) {
            a = gVar.mo54234a(str.toLowerCase());
        }
        if (TextUtils.isEmpty(a)) {
            return gVar.mo54234a(str.toUpperCase());
        }
        return a;
    }

    /* renamed from: c */
    public static String m62591c(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        String c = m62590c(str2);
        if (TextUtils.isEmpty(c) || str.contains(c)) {
            return str;
        }
        return new File(str, c).getAbsolutePath();
    }

    /* renamed from: a */
    public static String m62541a(String str, int i) {
        if (i == 0) {
            return "";
        }
        if (TextUtils.isEmpty(str) || str.length() <= i) {
            return str;
        }
        return str.substring(0, i);
    }

    /* renamed from: b */
    public static String m62576b(Throwable th, String str) {
        if (str == null) {
            return m62604e(th);
        }
        return str + "-" + m62604e(th);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0098, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0099, code lost:
        if (r11 != null) goto L_0x009b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:?, code lost:
        r11.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x009f, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00a0, code lost:
        r2.addSuppressed(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00a3, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00a6, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00a7, code lost:
        if (r5 != null) goto L_0x00a9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:?, code lost:
        r5.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00ad, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00ae, code lost:
        r2.addSuppressed(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00b1, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00b4, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00b5, code lost:
        if (r12 != null) goto L_0x00b7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:?, code lost:
        r12.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00bb, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00bc, code lost:
        r2.addSuppressed(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00bf, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x00c2, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x00c3, code lost:
        if (r7 != null) goto L_0x00c5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:?, code lost:
        r7.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x00c9, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x00ca, code lost:
        r2.addSuppressed(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x00cd, code lost:
        throw r1;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void m62592c(com.p2082ss.android.socialbase.downloader.p2181d.C30325a r15, com.p2082ss.android.socialbase.downloader.p2181d.C30325a r16) {
        /*
        // Method dump skipped, instructions count: 233
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.socialbase.downloader.p2189k.C30535g.m62592c(com.ss.android.socialbase.downloader.d.a, com.ss.android.socialbase.downloader.d.a):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0079, code lost:
        if (r8 != false) goto L_0x00f5;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.p2082ss.android.socialbase.downloader.model.C30593c m62538a(com.p2082ss.android.socialbase.downloader.model.DownloadInfo r11, java.lang.String r12, java.lang.String r13, int r14) {
        /*
        // Method dump skipped, instructions count: 325
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.socialbase.downloader.p2189k.C30535g.m62538a(com.ss.android.socialbase.downloader.model.DownloadInfo, java.lang.String, java.lang.String, int):com.ss.android.socialbase.downloader.model.c");
    }
}
