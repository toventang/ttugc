package com.p2082ss.android.ugc.aweme.hybridkit.bridge;

import android.content.Context;
import com.bytedance.bridge.magpie.p879a.AbstractC13403a;
import com.bytedance.bridge.magpie.p879a.AbstractC13408b;
import com.bytedance.bridge.magpie.p879a.p881b.C13409a;
import com.bytedance.bridge.magpie.p883b.C13428a;
import com.bytedance.bridge.magpie.p883b.C13434c;
import com.bytedance.bridge.magpie.p885d.AbstractC13443b;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.keva.Keva;
import com.bytedance.retrofit2.AbstractC21983b;
import com.bytedance.retrofit2.C22099u;
import com.bytedance.retrofit2.mime.TypedByteArray;
import com.bytedance.ttnet.utils.RetrofitUtils;
import com.p2082ss.android.common.applog.AppLog;
import com.p2082ss.android.ugc.aweme.lego.C58221f;
import com.p2082ss.android.ugc.aweme.web.C81631k;
import java.io.IOException;
import java.io.InputStream;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.zip.ZipInputStream;
import org.json.JSONObject;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89338d;

/* renamed from: com.ss.android.ugc.aweme.hybridkit.bridge.a */
public final class C53406a {

    /* renamed from: a */
    public static final C53406a f122616a = new C53406a();

    private C53406a() {
    }

    /* renamed from: com.ss.android.ugc.aweme.hybridkit.bridge.a$b */
    public static final class C53408b implements AbstractC13408b {

        /* renamed from: a */
        final /* synthetic */ Context f122618a;

        static {
            Covode.recordClassIndex(62975);
        }

        @Override // com.bytedance.bridge.magpie.p879a.AbstractC13408b
        /* renamed from: a */
        public final AbstractC13403a mo21632a() {
            return new C53409a();
        }

        @Override // com.bytedance.bridge.magpie.p879a.AbstractC13408b
        /* renamed from: d */
        public final String mo21637d() {
            C89219l.m154716b("https://jsb-sg.tiktokv.com/src/server/v2/package", "");
            return "https://jsb-sg.tiktokv.com/src/server/v2/package";
        }

        @Override // com.bytedance.bridge.magpie.p879a.AbstractC13408b
        /* renamed from: e */
        public final String mo21638e() {
            return C17867d.m33085f();
        }

        @Override // com.bytedance.bridge.magpie.p879a.AbstractC13408b
        /* renamed from: g */
        public final List<String> mo21640g() {
            return C89070n.m154516a("webcast");
        }

        /* renamed from: com.ss.android.ugc.aweme.hybridkit.bridge.a$b$a */
        public static final class C53409a implements AbstractC13403a {

            /* renamed from: a */
            public final Keva f122619a = Keva.getRepo("magpie_bridge");

            static {
                Covode.recordClassIndex(62976);
            }

            C53409a() {
            }

            @Override // com.bytedance.bridge.magpie.p879a.AbstractC13403a
            /* renamed from: a */
            public final String mo21622a(String str) {
                C89219l.m154721d(str, "");
                return this.f122619a.getString(str, null);
            }

            @Override // com.bytedance.bridge.magpie.p879a.AbstractC13403a
            /* renamed from: a */
            public final void mo21623a(String str, String str2) {
                C89219l.m154721d(str, "");
                C89219l.m154721d(str2, "");
                this.f122619a.storeString(str, str2);
            }
        }

        @Override // com.bytedance.bridge.magpie.p879a.AbstractC13408b
        /* renamed from: c */
        public final String mo21636c() {
            C81631k kVar = C81631k.f182525a;
            C89219l.m154716b(kVar, "");
            String c = kVar.mo125297c();
            C89219l.m154716b(c, "");
            return c;
        }

        @Override // com.bytedance.bridge.magpie.p879a.AbstractC13408b
        /* renamed from: f */
        public final String mo21639f() {
            String serverDeviceId = AppLog.getServerDeviceId();
            if (serverDeviceId == null) {
                return "";
            }
            return serverDeviceId;
        }

        @Override // com.bytedance.bridge.magpie.p879a.AbstractC13408b
        /* renamed from: b */
        public final String mo21635b() {
            String str = "";
            MethodCollector.m26663i(1489);
            try {
                StringBuilder sb = new StringBuilder();
                InputStream open = this.f122618a.getAssets().open("jsb_whitelist.zip");
                C89219l.m154716b(open, str);
                ZipInputStream zipInputStream = new ZipInputStream(open);
                if (zipInputStream.getNextEntry() != null) {
                    byte[] bArr = new byte[1024];
                    while (true) {
                        int read = zipInputStream.read(bArr, 0, 1024);
                        if (read < 0) {
                            break;
                        }
                        sb.append(new String(bArr, 0, read, C89338d.f202990a));
                    }
                }
                zipInputStream.close();
                String sb2 = sb.toString();
                C89219l.m154716b(sb2, str);
                str = sb2;
            } catch (IOException unused) {
            }
            MethodCollector.m26664o(1489);
            return str;
        }

        public C53408b(Context context) {
            this.f122618a = context;
        }

        @Override // com.bytedance.bridge.magpie.p879a.AbstractC13408b
        /* renamed from: a */
        public final void mo21634a(Runnable runnable) {
            C89219l.m154721d(runnable, "");
            C58221f.m105153e().mo95704a(new C53405xb6434fe(runnable)).mo95706a();
        }

        @Override // com.bytedance.bridge.magpie.p879a.AbstractC13408b
        /* renamed from: a */
        public final String mo21633a(String str, String str2, byte[] bArr) {
            C22099u<String> execute;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("Content-Type", str2);
            try {
                AbstractC21983b<String> doPost = ((BridgePermissionAPI) RetrofitUtils.m43281a(str, BridgePermissionAPI.class)).doPost(str, linkedHashMap, new TypedByteArray(str2, bArr, new String[0]));
                if (doPost == null || (execute = doPost.execute()) == null) {
                    return null;
                }
                return execute.f52262b;
            } catch (Exception unused) {
                return null;
            }
        }
    }

    static {
        Covode.recordClassIndex(62973);
    }

    /* renamed from: com.ss.android.ugc.aweme.hybridkit.bridge.a$a */
    public static final class C53407a implements AbstractC13443b {

        /* renamed from: a */
        final /* synthetic */ C13409a f122617a;

        static {
            Covode.recordClassIndex(62974);
        }

        @Override // com.bytedance.bridge.magpie.p885d.AbstractC13443b
        /* renamed from: b */
        public final void mo21669b(C13428a aVar) {
            C89219l.m154721d(aVar, "");
        }

        C53407a(C13409a aVar) {
            this.f122617a = aVar;
        }

        @Override // com.bytedance.bridge.magpie.p885d.AbstractC13443b
        /* renamed from: a */
        public final C13434c mo21668a(C13428a aVar) {
            C89219l.m154721d(aVar, "");
            if (this.f122617a.mo21641a(aVar)) {
                return null;
            }
            C13434c cVar = new C13434c();
            cVar.f32753b = -1;
            cVar.mo21657a("permission auth failed");
            cVar.f32752a = new JSONObject("{\"code\": -1, \"msg\": \"permission denied\"}");
            return cVar;
        }
    }
}
