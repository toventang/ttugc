package com.bytedance.crash.p932j;

import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13933m;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.Map;

/* renamed from: com.bytedance.crash.j.l */
public final class C13923l {

    /* renamed from: a */
    final boolean f33916a;

    /* renamed from: b */
    C13910g f33917b;

    /* renamed from: c */
    C13927o f33918c;

    /* renamed from: d */
    private final String f33919d;

    /* renamed from: e */
    private final HttpURLConnection f33920e;

    /* renamed from: f */
    private final String f33921f;

    static {
        Covode.recordClassIndex(15983);
    }

    /* renamed from: a */
    public final String mo22404a() {
        MethodCollector.m26663i(2511);
        ArrayList<String> arrayList = new ArrayList();
        byte[] bytes = ("\r\n--" + this.f33919d + "--\r\n").getBytes();
        if (this.f33916a) {
            this.f33918c.write(bytes);
            this.f33918c.mo22412b();
            this.f33918c.mo22411a();
        } else {
            this.f33917b.write(bytes);
            this.f33917b.flush();
            this.f33917b.mo22392a();
        }
        int responseCode = this.f33920e.getResponseCode();
        if (responseCode == 200) {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(this.f33920e.getInputStream()));
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                arrayList.add(readLine);
            }
            bufferedReader.close();
            this.f33920e.disconnect();
            StringBuilder sb = new StringBuilder();
            for (String str : arrayList) {
                sb.append(str);
            }
            String sb2 = sb.toString();
            MethodCollector.m26664o(2511);
            return sb2;
        }
        IOException iOException = new IOException("Server returned non-OK status: ".concat(String.valueOf(responseCode)));
        MethodCollector.m26664o(2511);
        throw iOException;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo22408a(byte[] bArr) {
        if (this.f33916a) {
            this.f33918c.write(bArr);
        } else {
            this.f33917b.write(bArr);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo22405a(File file) {
        MethodCollector.m26663i(2450);
        FileInputStream fileInputStream = new FileInputStream(file);
        byte[] bArr = new byte[8192];
        while (true) {
            int read = fileInputStream.read(bArr);
            if (read == -1) {
                fileInputStream.close();
                MethodCollector.m26664o(2450);
                return;
            } else if (this.f33916a) {
                this.f33918c.write(bArr, 0, read);
            } else {
                this.f33917b.write(bArr, 0, read);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo22407a(String str, Map<String, String> map) {
        StringBuilder sb = new StringBuilder();
        sb.append("--").append(this.f33919d).append("\r\nContent-Disposition: form-data; name=\"").append(str).append("\"; filename=\"").append(str).append("\"");
        if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                sb.append("; ").append(entry.getKey()).append("=\"").append(entry.getValue()).append("\"");
            }
        }
        sb.append("\r\nContent-Transfer-Encoding: binary\r\n\r\n");
        mo22408a(sb.toString().getBytes());
    }

    /* renamed from: a */
    public final void mo22406a(String str, String str2, boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append("--").append(this.f33919d).append("\r\nContent-Disposition: form-data; name=\"").append(str).append("\"\r\nContent-Type: text/plain; charset=").append(this.f33921f).append("\r\n\r\n");
        try {
            mo22408a(sb.toString().getBytes());
        } catch (IOException unused) {
        }
        byte[] bytes = str2.getBytes();
        if (z) {
            bytes = C13933m.f33942g.getEncryptImpl().mo22303a(bytes);
        }
        try {
            mo22408a(bytes);
            mo22408a("\r\n".getBytes());
        } catch (IOException unused2) {
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0077  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00bc  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C13923l(java.lang.String r6, java.lang.String r7, boolean r8) {
        /*
        // Method dump skipped, instructions count: 203
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.crash.p932j.C13923l.<init>(java.lang.String, java.lang.String, boolean):void");
    }
}
