package com.lynx.tasm.behavior.p2052ui.canvas;

import android.content.ContextWrapper;
import android.net.Uri;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.lynx.tasm.base.LLog;
import com.lynx.tasm.behavior.AbstractC28520j;
import com.lynx.tasm.behavior.p2052ui.canvas.LynxHelium;
import com.lynx.tasm.behavior.p2052ui.image.C28621a;
import com.lynx.tasm.core.C28748b;
import com.lynx.tasm.core.JSProxy;
import com.lynx.tasm.provider.AbstractC28846d;
import com.lynx.tasm.provider.C28847e;
import com.lynx.tasm.provider.C28848f;
import com.p2024he.lynx.loader.Loader;
import com.p2024he.lynx.loader.Resolver;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.lynx.tasm.behavior.ui.canvas.LynxHeliumResourceLoader */
public class LynxHeliumResourceLoader implements Loader {
    private ContextWrapper mContext;
    private LynxHelium.PermissionHandler mPermissionHandler;

    static {
        Covode.recordClassIndex(34659);
    }

    /* renamed from: com_lynx_tasm_behavior_ui_canvas_LynxHeliumResourceLoader_com_ss_android_ugc_aweme_lancet_LogLancet_d */
    public static int m57202xc9a81639(String str, String str2) {
        return 0;
    }

    /* renamed from: com_lynx_tasm_behavior_ui_canvas_LynxHeliumResourceLoader_com_ss_android_ugc_aweme_lancet_LogLancet_e */
    public static int m57203xc9a8163a(String str, String str2) {
        return 0;
    }

    @Override // com.p2024he.lynx.loader.Loader
    public byte[] loadSync(String str) {
        return realLoad(str, null);
    }

    public static byte[] mergeArray(byte[]... bArr) {
        int i = 0;
        for (byte[] bArr2 : bArr) {
            i += bArr2.length;
        }
        byte[] bArr3 = new byte[i];
        int i2 = 0;
        for (int i3 = 0; i3 < bArr.length; i3++) {
            int length = bArr[i3].length;
            if (length != 0) {
                System.arraycopy(bArr[i3], 0, bArr3, i2, length);
                i2 += length;
            }
        }
        return bArr3;
    }

    @Override // com.p2024he.lynx.loader.Loader
    public Uri loadMedia(String str) {
        String redirectUrl = redirectUrl(str);
        m57202xc9a81639("HeliumResLoader", "loadMedia ".concat(String.valueOf(redirectUrl)));
        if (redirectUrl.startsWith("http://") || redirectUrl.startsWith("https://")) {
            return Uri.parse(redirectUrl);
        }
        if (redirectUrl.startsWith("file://")) {
            if (!redirectUrl.startsWith("file:///")) {
                redirectUrl = "file:///" + redirectUrl.substring(7);
            }
            LynxHelium.PermissionHandler permissionHandler = this.mPermissionHandler;
            if (permissionHandler != null) {
                String[] strArr = {"android.permission.READ_EXTERNAL_STORAGE"};
                if (!permissionHandler.verifyHasPermission(strArr)) {
                    this.mPermissionHandler.requestPermissions(strArr, new LynxHelium.OnPermissionListener() {
                        /* class com.lynx.tasm.behavior.p2052ui.canvas.LynxHeliumResourceLoader.C286164 */

                        static {
                            Covode.recordClassIndex(34663);
                        }

                        @Override // com.lynx.tasm.behavior.p2052ui.canvas.LynxHelium.OnPermissionListener
                        public void onPermissionDenied() {
                        }

                        @Override // com.lynx.tasm.behavior.p2052ui.canvas.LynxHelium.OnPermissionListener
                        public void onPermissionGranted() {
                        }
                    });
                }
            }
            return Uri.parse(redirectUrl);
        }
        m57203xc9a8163a("HeliumResLoader", "loadMedia do not support:".concat(String.valueOf(redirectUrl)));
        return Uri.parse(redirectUrl);
    }

    private String redirectUrl(String str) {
        MethodCollector.m26663i(1113);
        String str2 = null;
        if (str == null) {
            MethodCollector.m26664o(1113);
            return null;
        }
        m57202xc9a81639("HeliumResLoader", "redirectUrl ".concat(String.valueOf(str)));
        int indexOf = str.indexOf("?_lynxId=");
        if (indexOf > 0) {
            str2 = str.substring(str.lastIndexOf("?_lynxId=") + 9);
            str = str.substring(0, indexOf);
        }
        if (str2 != null) {
            try {
                JSProxy nativeGetProxyById = JSProxy.nativeGetProxyById(Long.parseLong(str2));
                if (nativeGetProxyById == null) {
                    MethodCollector.m26664o(1113);
                    return str;
                }
                AbstractC28520j jVar = nativeGetProxyById.f67786c.get();
                if (jVar == null) {
                    MethodCollector.m26664o(1113);
                    return str;
                }
                String a = C28621a.m57207a(jVar, str);
                LLog.m56856a(3, "redirectUrl", "result:".concat(String.valueOf(a)));
                MethodCollector.m26664o(1113);
                return a;
            } catch (Exception e) {
                m57202xc9a81639("redirectUrl", "exception:" + e.toString());
            }
        }
        m57202xc9a81639("HeliumResLoader", "redirectUrl to".concat(String.valueOf(str)));
        MethodCollector.m26664o(1113);
        return str;
    }

    public LynxHeliumResourceLoader(ContextWrapper contextWrapper, LynxHelium.PermissionHandler permissionHandler) {
        this.mContext = contextWrapper;
        this.mPermissionHandler = permissionHandler;
    }

    @Override // com.p2024he.lynx.loader.Loader
    public void load(final String str, final Resolver resolver) {
        new Thread(new Runnable() {
            /* class com.lynx.tasm.behavior.p2052ui.canvas.LynxHeliumResourceLoader.RunnableC286131 */

            static {
                Covode.recordClassIndex(34660);
            }

            public void run() {
                LynxHeliumResourceLoader.this.realLoad(str, resolver);
            }
        }).start();
    }

    @Override // com.p2024he.lynx.loader.Loader
    public void loadUrl(final String str, final Resolver resolver) {
        new Thread(new Runnable() {
            /* class com.lynx.tasm.behavior.p2052ui.canvas.LynxHeliumResourceLoader.RunnableC286142 */

            static {
                Covode.recordClassIndex(34661);
            }

            public void run() {
                LynxHeliumResourceLoader.this.realLoad(str, resolver);
            }
        }).start();
    }

    private void requestResource(String str, final Resolver resolver) {
        C28748b.m57567a().mo49866a(new C28847e(str), new AbstractC28846d() {
            /* class com.lynx.tasm.behavior.p2052ui.canvas.LynxHeliumResourceLoader.C286175 */

            static {
                Covode.recordClassIndex(34664);
            }

            /* renamed from: com_lynx_tasm_behavior_ui_canvas_LynxHeliumResourceLoader$5_com_ss_android_ugc_aweme_lancet_LogLancet_e */
            public static int m57205x329f700b(String str, String str2) {
                return 0;
            }

            @Override // com.lynx.tasm.provider.AbstractC28846d
            public void onFailed(C28848f fVar) {
                String str = fVar.f68093b;
                m57205x329f700b("HeliumResLoader", "requestResource error ".concat(String.valueOf(str)));
                resolver.reject(new IOException(str));
            }

            @Override // com.lynx.tasm.provider.AbstractC28846d
            public void onSuccess(C28848f fVar) {
                try {
                    LynxHeliumResourceLoader.this.loadFromStream(fVar.f68095d, resolver);
                } catch (Exception e) {
                    fVar.f68093b = e.toString();
                }
            }
        });
    }

    public byte[] loadFromStream(InputStream inputStream, Resolver resolver) {
        MethodCollector.m26663i(1073);
        int available = inputStream.available();
        if (available <= 0) {
            available = 1024;
        }
        byte[] bArr = new byte[available];
        byte[] bArr2 = new byte[0];
        while (true) {
            int read = inputStream.read(bArr);
            if (read == -1) {
                break;
            }
            byte[] bArr3 = new byte[read];
            System.arraycopy(bArr, 0, bArr3, 0, read);
            bArr2 = mergeArray(bArr2, bArr3);
        }
        if (resolver != null) {
            resolver.resolve(bArr2, 0, bArr2.length);
        }
        inputStream.close();
        MethodCollector.m26664o(1073);
        return bArr2;
    }

    private byte[] loadFromFile(String str, final Resolver resolver) {
        final File file;
        MethodCollector.m26663i(1081);
        if (str.startsWith("/")) {
            file = new File(str);
        } else {
            file = new File("/".concat(String.valueOf(str)));
        }
        LynxHelium.PermissionHandler permissionHandler = this.mPermissionHandler;
        if (permissionHandler == null) {
            byte[] loadFromStream = loadFromStream(new FileInputStream(file), resolver);
            MethodCollector.m26664o(1081);
            return loadFromStream;
        }
        String[] strArr = {"android.permission.READ_EXTERNAL_STORAGE"};
        if (permissionHandler.verifyHasPermission(strArr)) {
            byte[] loadFromStream2 = loadFromStream(new FileInputStream(file), resolver);
            MethodCollector.m26664o(1081);
            return loadFromStream2;
        }
        this.mPermissionHandler.requestPermissions(strArr, new LynxHelium.OnPermissionListener() {
            /* class com.lynx.tasm.behavior.p2052ui.canvas.LynxHeliumResourceLoader.C286153 */

            static {
                Covode.recordClassIndex(34662);
            }

            /* renamed from: com_lynx_tasm_behavior_ui_canvas_LynxHeliumResourceLoader$3_com_ss_android_ugc_aweme_lancet_LogLancet_e */
            public static int m57204xfd5deb09(String str, String str2) {
                return 0;
            }

            @Override // com.lynx.tasm.behavior.p2052ui.canvas.LynxHelium.OnPermissionListener
            public void onPermissionDenied() {
                m57204xfd5deb09("HeliumResLoader", "Read local file permission denied");
                Resolver resolver = resolver;
                if (resolver != null) {
                    resolver.reject(new IOException("Read local file permission denied"));
                }
            }

            @Override // com.lynx.tasm.behavior.p2052ui.canvas.LynxHelium.OnPermissionListener
            public void onPermissionGranted() {
                MethodCollector.m26663i(2134);
                if (resolver != null) {
                    try {
                        LynxHeliumResourceLoader.this.loadFromStream(new FileInputStream(file), resolver);
                        MethodCollector.m26664o(2134);
                        return;
                    } catch (Exception unused) {
                        resolver.reject(new IOException("loadFromStream error"));
                    }
                }
                MethodCollector.m26664o(2134);
            }
        });
        if (resolver == null) {
            LLog.m56862d("HeliumResLoader", "WARNING: PermissionProvider not set!!!");
            byte[] loadFromStream3 = loadFromStream(new FileInputStream(file), null);
            MethodCollector.m26664o(1081);
            return loadFromStream3;
        }
        MethodCollector.m26664o(1081);
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x013d  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0141  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public byte[] realLoad(java.lang.String r9, com.p2024he.lynx.loader.Resolver r10) {
        /*
        // Method dump skipped, instructions count: 334
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lynx.tasm.behavior.p2052ui.canvas.LynxHeliumResourceLoader.realLoad(java.lang.String, com.he.lynx.loader.Resolver):byte[]");
    }
}
