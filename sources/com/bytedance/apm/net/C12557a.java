package com.bytedance.apm.net;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.net.model.C61425e;
import com.p2082ss.android.ugc.aweme.net.model.EnumC61424d;
import com.p2082ss.android.ugc.aweme.net.monitor.C61439n;
import com.p2082ss.android.ugc.aweme.net.p3502l.C61416a;
import com.p2082ss.android.ugc.aweme.net.p3502l.C61417b;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Map;
import java.util.zip.GZIPOutputStream;
import javax.net.ssl.HttpsURLConnection;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.apm.net.a */
public final class C12557a {

    /* renamed from: a */
    private final String f30545a;

    /* renamed from: b */
    private HttpURLConnection f30546b;

    /* renamed from: c */
    private String f30547c;

    /* renamed from: d */
    private boolean f30548d = false;

    /* renamed from: e */
    private DataOutputStream f30549e;

    /* renamed from: f */
    private GZIPOutputStream f30550f;

    static {
        Covode.recordClassIndex(14374);
    }

    /* renamed from: a */
    public final String mo20380a() {
        ArrayList<String> arrayList = new ArrayList();
        byte[] bytes = ("\r\n--" + this.f30545a + "--\r\n").getBytes();
        if (this.f30548d) {
            this.f30550f.write(bytes);
            this.f30550f.finish();
            this.f30550f.close();
        } else {
            this.f30549e.write(bytes);
            this.f30549e.flush();
            this.f30549e.close();
        }
        int responseCode = this.f30546b.getResponseCode();
        if (responseCode == 200) {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(this.f30546b.getInputStream()));
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                arrayList.add(readLine);
            }
            bufferedReader.close();
            this.f30546b.disconnect();
            StringBuilder sb = new StringBuilder();
            for (String str : arrayList) {
                sb.append(str);
            }
            return sb.toString();
        }
        throw new IOException("Server returned non-OK status: ".concat(String.valueOf(responseCode)));
    }

    /* renamed from: a */
    public final void mo20383a(JSONObject jSONObject) {
        String jSONObject2;
        StringBuilder sb = new StringBuilder(100);
        sb.append("--").append(this.f30545a).append("\r\nContent-Disposition: form-data; name=\"params.txt\"; filetype=\"common_params\"; logtype=\"env\"; filename=\"params.txt\"\r\n");
        sb.append("Content-Type: text/plain\r\n");
        sb.append("\r\n");
        if (this.f30548d) {
            this.f30550f.write(sb.toString().getBytes());
        } else {
            this.f30549e.write(sb.toString().getBytes());
        }
        if (jSONObject != null) {
            jSONObject2 = jSONObject.toString();
        } else {
            JSONObject jSONObject3 = new JSONObject();
            try {
                jSONObject3.put("defaultData", "none commonParams");
            } catch (JSONException e) {
                e.printStackTrace();
            }
            jSONObject2 = jSONObject3.toString();
        }
        if (this.f30548d) {
            this.f30550f.write(jSONObject2.getBytes());
        } else {
            this.f30549e.write(jSONObject2.getBytes());
        }
        if (this.f30548d) {
            this.f30550f.write("\r\n".getBytes());
            return;
        }
        this.f30549e.write("\r\n".getBytes());
        this.f30549e.flush();
    }

    /* renamed from: a */
    public final void mo20382a(String str, String str2) {
        StringBuilder sb = new StringBuilder(100);
        sb.append("--").append(this.f30545a).append("\r\nContent-Disposition: form-data; name=\"").append(str).append("\"\r\nContent-Type: text/plain; charset=").append(this.f30547c).append("\r\n\r\n").append(str2).append("\r\n");
        try {
            if (this.f30548d) {
                this.f30550f.write(sb.toString().getBytes());
            } else {
                this.f30549e.write(sb.toString().getBytes());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public C12557a(String str, String str2) {
        R openConnection;
        URLConnection aVar;
        this.f30547c = str2;
        String str3 = "AAA" + System.currentTimeMillis() + "AAA";
        this.f30545a = str3;
        URL url = new URL(str);
        C61425e<URL, URLConnection> m = C61439n.f139485e.mo68809m(new C61425e<>(url, null, null, EnumC61424d.CONTINUE));
        if (m.f139473f == EnumC61424d.INTERCEPT && m.f139469b != null) {
            openConnection = m.f139469b;
            if (openConnection instanceof HttpsURLConnection) {
                aVar = new C61417b(openConnection);
            } else {
                if (openConnection instanceof HttpURLConnection) {
                    aVar = new C61416a(openConnection);
                }
                HttpURLConnection httpURLConnection = (HttpURLConnection) openConnection;
                this.f30546b = httpURLConnection;
                httpURLConnection.setUseCaches(false);
                this.f30546b.setDoOutput(true);
                this.f30546b.setDoInput(true);
                this.f30546b.setRequestMethod("POST");
                this.f30546b.setRequestProperty("Content-Type", "multipart/form-data; boundary=" + str3);
                this.f30549e = new DataOutputStream(this.f30546b.getOutputStream());
            }
        } else if (m.f139473f != EnumC61424d.EXCEPTION || m.f139472e == null) {
            openConnection = url.openConnection();
            if (openConnection instanceof HttpsURLConnection) {
                aVar = new C61417b((HttpsURLConnection) openConnection);
            } else {
                if (openConnection instanceof HttpURLConnection) {
                    aVar = new C61416a((HttpURLConnection) openConnection);
                }
                HttpURLConnection httpURLConnection2 = (HttpURLConnection) openConnection;
                this.f30546b = httpURLConnection2;
                httpURLConnection2.setUseCaches(false);
                this.f30546b.setDoOutput(true);
                this.f30546b.setDoInput(true);
                this.f30546b.setRequestMethod("POST");
                this.f30546b.setRequestProperty("Content-Type", "multipart/form-data; boundary=" + str3);
                this.f30549e = new DataOutputStream(this.f30546b.getOutputStream());
            }
        } else {
            throw m.f139472e;
        }
        openConnection = aVar;
        HttpURLConnection httpURLConnection22 = (HttpURLConnection) openConnection;
        this.f30546b = httpURLConnection22;
        httpURLConnection22.setUseCaches(false);
        this.f30546b.setDoOutput(true);
        this.f30546b.setDoInput(true);
        this.f30546b.setRequestMethod("POST");
        this.f30546b.setRequestProperty("Content-Type", "multipart/form-data; boundary=" + str3);
        this.f30549e = new DataOutputStream(this.f30546b.getOutputStream());
    }

    /* renamed from: a */
    public final void mo20381a(String str, File file, Map<String, String> map) {
        String name = file.getName();
        StringBuilder sb = new StringBuilder(100);
        sb.append("--").append(this.f30545a).append("\r\nContent-Disposition: form-data; name=\"").append(str).append("\"; filename=\"").append(name).append("\"");
        for (Map.Entry<String, String> entry : map.entrySet()) {
            sb.append("; ").append(entry.getKey()).append("=\"").append(entry.getValue()).append("\"");
        }
        sb.append("\r\nContent-Transfer-Encoding: binary\r\n\r\n");
        if (this.f30548d) {
            this.f30550f.write(sb.toString().getBytes());
        } else {
            this.f30549e.write(sb.toString().getBytes());
        }
        FileInputStream fileInputStream = new FileInputStream(file);
        byte[] bArr = new byte[8192];
        while (true) {
            int read = fileInputStream.read(bArr);
            if (read == -1) {
                break;
            } else if (this.f30548d) {
                this.f30550f.write(bArr, 0, read);
            } else {
                this.f30549e.write(bArr, 0, read);
            }
        }
        fileInputStream.close();
        if (this.f30548d) {
            this.f30550f.write("\r\n".getBytes());
            return;
        }
        this.f30549e.write("\r\n".getBytes());
        this.f30549e.flush();
    }
}
