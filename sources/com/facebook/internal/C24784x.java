package com.facebook.internal;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.facebook.C24798j;
import com.facebook.C24872m;
import com.p2082ss.android.ugc.aweme.lancet.C58016d;
import com.p2082ss.android.ugc.aweme.p2690cr.AbstractC40381g;
import com.p2082ss.android.ugc.aweme.p2690cr.C40353e;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Collection;
import java.util.UUID;

/* renamed from: com.facebook.internal.x */
public final class C24784x {

    /* renamed from: a */
    private static final String f58809a = C24784x.class.getName();

    /* renamed from: b */
    private static File f58810b;

    private C24784x() {
    }

    /* renamed from: a */
    private static boolean m47457a(File file) {
        MethodCollector.m26663i(8733);
        try {
            C40353e.C40356c cVar = (C40353e.C40356c) SettingsManager.m29616a().mo25397a("storage_intercepter_key", C40353e.C40356c.class, AbstractC40381g.f94567a);
            if (C40353e.m81545a(file.getAbsolutePath(), cVar)) {
                C40353e.m81540a(file, new RuntimeException(), "exception_delete_log", C40353e.m81542a(cVar));
            }
            if (C40353e.m81549c(file.getAbsolutePath(), cVar)) {
                C40353e.m81540a(file, new RuntimeException(), "exception_handle", C40353e.m81542a(cVar));
                MethodCollector.m26664o(8733);
                return false;
            }
        } catch (Throwable unused) {
        }
        boolean delete = file.delete();
        MethodCollector.m26664o(8733);
        return delete;
    }

    static {
        Covode.recordClassIndex(28937);
    }

    /* renamed from: a */
    private static synchronized File m47452a() {
        File file;
        synchronized (C24784x.class) {
            MethodCollector.m26663i(8871);
            if (f58810b == null) {
                C24699ae.m47299a();
                Context context = C24872m.f59047g;
                if (C58016d.f132221b == null || !C58016d.f132224e) {
                    C58016d.f132221b = context.getCacheDir();
                }
                f58810b = new File(C58016d.f132221b, "com.facebook.NativeAppCallAttachmentStore.files");
            }
            file = f58810b;
            MethodCollector.m26664o(8871);
        }
        return file;
    }

    /* renamed from: a */
    public static void m47456a(Collection<C24785a> collection) {
        InputStream inputStream;
        MethodCollector.m26663i(8586);
        if (collection == null || collection.size() == 0) {
            MethodCollector.m26664o(8586);
            return;
        }
        if (f58810b == null) {
            C24693ad.m47252a(m47452a());
        }
        m47452a().mkdirs();
        ArrayList<File> arrayList = new ArrayList();
        try {
            for (C24785a aVar : collection) {
                if (aVar.f58817g) {
                    File a = m47454a(aVar.f58811a, aVar.f58813c, true);
                    arrayList.add(a);
                    if (aVar.f58814d != null) {
                        Bitmap bitmap = aVar.f58814d;
                        FileOutputStream fileOutputStream = new FileOutputStream(a);
                        try {
                            bitmap.compress(Bitmap.CompressFormat.JPEG, 100, fileOutputStream);
                            C24693ad.m47251a(fileOutputStream);
                        } catch (Throwable th) {
                            C24693ad.m47251a(fileOutputStream);
                            MethodCollector.m26664o(8586);
                            throw th;
                        }
                    } else if (aVar.f58815e != null) {
                        Uri uri = aVar.f58815e;
                        boolean z = aVar.f58816f;
                        FileOutputStream fileOutputStream2 = new FileOutputStream(a);
                        if (!z) {
                            try {
                                inputStream = new FileInputStream(uri.getPath());
                            } catch (Throwable th2) {
                                C24693ad.m47251a(fileOutputStream2);
                                MethodCollector.m26664o(8586);
                                throw th2;
                            }
                        } else {
                            C24699ae.m47299a();
                            inputStream = C24872m.f59047g.getContentResolver().openInputStream(uri);
                        }
                        C24693ad.m47226a(inputStream, (OutputStream) fileOutputStream2);
                        C24693ad.m47251a(fileOutputStream2);
                    }
                }
            }
            MethodCollector.m26664o(8586);
        } catch (IOException e) {
            for (File file : arrayList) {
                try {
                    m47457a(file);
                } catch (Exception unused) {
                }
            }
            C24798j jVar = new C24798j(e);
            MethodCollector.m26664o(8586);
            throw jVar;
        }
    }

    /* renamed from: a */
    public static C24785a m47450a(UUID uuid, Bitmap bitmap) {
        C24699ae.m47301a(uuid, "callId");
        C24699ae.m47301a(bitmap, "attachmentBitmap");
        return new C24785a(uuid, bitmap, null, (byte) 0);
    }

    /* renamed from: a */
    public static C24785a m47451a(UUID uuid, Uri uri) {
        C24699ae.m47301a(uuid, "callId");
        C24699ae.m47301a(uri, "attachmentUri");
        return new C24785a(uuid, null, uri, (byte) 0);
    }

    /* renamed from: a */
    public static File m47453a(UUID uuid, String str) {
        if (C24693ad.m47261a(str) || uuid == null) {
            throw new FileNotFoundException();
        }
        try {
            return m47454a(uuid, str, false);
        } catch (IOException unused) {
            throw new FileNotFoundException();
        }
    }

    /* renamed from: a */
    public static File m47455a(UUID uuid, boolean z) {
        if (f58810b == null) {
            return null;
        }
        File file = new File(f58810b, uuid.toString());
        if (z && !file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    /* renamed from: com.facebook.internal.x$a */
    public static final class C24785a {

        /* renamed from: a */
        public final UUID f58811a;

        /* renamed from: b */
        public final String f58812b;

        /* renamed from: c */
        public final String f58813c;

        /* renamed from: d */
        public Bitmap f58814d;

        /* renamed from: e */
        public Uri f58815e;

        /* renamed from: f */
        public boolean f58816f;

        /* renamed from: g */
        public boolean f58817g;

        static {
            Covode.recordClassIndex(28938);
        }

        private C24785a(UUID uuid, Bitmap bitmap, Uri uri) {
            String uuid2;
            String a;
            boolean z;
            this.f58811a = uuid;
            this.f58814d = bitmap;
            this.f58815e = uri;
            if (uri != null) {
                String scheme = uri.getScheme();
                if ("content".equalsIgnoreCase(scheme)) {
                    this.f58816f = true;
                    if (uri.getAuthority() == null || uri.getAuthority().startsWith("media")) {
                        z = false;
                    } else {
                        z = true;
                    }
                    this.f58817g = z;
                } else if ("file".equalsIgnoreCase(uri.getScheme())) {
                    this.f58817g = true;
                } else if (!C24693ad.m47269b(uri)) {
                    throw new C24798j("Unsupported scheme for media Uri : ".concat(String.valueOf(scheme)));
                }
            } else if (bitmap != null) {
                this.f58817g = true;
            } else {
                throw new C24798j("Cannot share media without a bitmap or Uri set");
            }
            if (!this.f58817g) {
                uuid2 = null;
            } else {
                uuid2 = UUID.randomUUID().toString();
            }
            this.f58813c = uuid2;
            if (!this.f58817g) {
                a = this.f58815e.toString();
            } else {
                C24699ae.m47299a();
                a = C1764a.m5928a("%s%s/%s/%s", new Object[]{"content://com.facebook.app.FacebookContentProvider", C24872m.f59041a, uuid.toString(), uuid2});
            }
            this.f58812b = a;
        }

        /* synthetic */ C24785a(UUID uuid, Bitmap bitmap, Uri uri, byte b) {
            this(uuid, bitmap, uri);
        }
    }

    /* renamed from: a */
    private static File m47454a(UUID uuid, String str, boolean z) {
        File a = m47455a(uuid, z);
        if (a == null) {
            return null;
        }
        try {
            return new File(a, URLEncoder.encode(str, "UTF-8"));
        } catch (UnsupportedEncodingException unused) {
            return null;
        }
    }
}
