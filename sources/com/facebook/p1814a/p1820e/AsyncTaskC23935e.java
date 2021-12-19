package com.facebook.p1814a.p1820e;

import android.os.AsyncTask;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.facebook.internal.p1894a.p1896b.C24677a;
import com.p2082ss.android.ugc.aweme.net.model.C61425e;
import com.p2082ss.android.ugc.aweme.net.model.EnumC61424d;
import com.p2082ss.android.ugc.aweme.net.monitor.C61439n;
import com.p2082ss.android.ugc.aweme.net.p3502l.C61416a;
import com.p2082ss.android.ugc.aweme.net.p3502l.C61417b;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import javax.net.ssl.HttpsURLConnection;

/* renamed from: com.facebook.a.e.e */
public final class AsyncTaskC23935e extends AsyncTask<String, Void, Boolean> {

    /* renamed from: a */
    private AbstractC23936a f56663a;

    /* renamed from: b */
    private File f56664b;

    /* renamed from: c */
    private String f56665c;

    /* renamed from: com.facebook.a.e.e$a */
    public interface AbstractC23936a {
        static {
            Covode.recordClassIndex(28057);
        }

        /* renamed from: a */
        void mo39430a(File file);
    }

    static {
        Covode.recordClassIndex(28056);
    }

    /* renamed from: a */
    private Boolean m45246a() {
        R r;
        URLConnection uRLConnection;
        MethodCollector.m26663i(8127);
        if (C24677a.m47209a(this)) {
            MethodCollector.m26664o(8127);
            return null;
        }
        try {
            URL url = new URL(this.f56665c);
            C61425e<URL, URLConnection> m = C61439n.f139485e.mo68809m(new C61425e<>(url, null, null, EnumC61424d.CONTINUE));
            if (m.f139473f == EnumC61424d.INTERCEPT && m.f139469b != null) {
                r = m.f139469b;
                if (r instanceof HttpsURLConnection) {
                    uRLConnection = new C61417b(r);
                } else {
                    if (r instanceof HttpURLConnection) {
                        uRLConnection = new C61416a(r);
                    }
                    int contentLength = r.getContentLength();
                    DataInputStream dataInputStream = new DataInputStream(url.openStream());
                    byte[] bArr = new byte[contentLength];
                    dataInputStream.readFully(bArr);
                    dataInputStream.close();
                    DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(this.f56664b));
                    dataOutputStream.write(bArr);
                    dataOutputStream.flush();
                    dataOutputStream.close();
                    MethodCollector.m26664o(8127);
                    return true;
                }
            } else if (m.f139473f != EnumC61424d.EXCEPTION || m.f139472e == null) {
                r = url.openConnection();
                if (r instanceof HttpsURLConnection) {
                    uRLConnection = new C61417b((HttpsURLConnection) r);
                } else {
                    if (r instanceof HttpURLConnection) {
                        uRLConnection = new C61416a((HttpURLConnection) r);
                    }
                    int contentLength2 = r.getContentLength();
                    DataInputStream dataInputStream2 = new DataInputStream(url.openStream());
                    byte[] bArr2 = new byte[contentLength2];
                    dataInputStream2.readFully(bArr2);
                    dataInputStream2.close();
                    DataOutputStream dataOutputStream2 = new DataOutputStream(new FileOutputStream(this.f56664b));
                    dataOutputStream2.write(bArr2);
                    dataOutputStream2.flush();
                    dataOutputStream2.close();
                    MethodCollector.m26664o(8127);
                    return true;
                }
            } else {
                RuntimeException runtimeException = m.f139472e;
                MethodCollector.m26664o(8127);
                throw runtimeException;
            }
            r = uRLConnection;
            int contentLength22 = r.getContentLength();
            DataInputStream dataInputStream22 = new DataInputStream(url.openStream());
            byte[] bArr22 = new byte[contentLength22];
            dataInputStream22.readFully(bArr22);
            dataInputStream22.close();
            DataOutputStream dataOutputStream22 = new DataOutputStream(new FileOutputStream(this.f56664b));
            dataOutputStream22.write(bArr22);
            dataOutputStream22.flush();
            dataOutputStream22.close();
            try {
                MethodCollector.m26664o(8127);
                return true;
            } catch (Throwable th) {
                C24677a.m47208a(th, this);
                MethodCollector.m26664o(8127);
                return null;
            }
        } catch (Exception unused) {
            MethodCollector.m26664o(8127);
            return false;
        }
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object[]] */
    /* access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    public final /* synthetic */ Boolean doInBackground(String[] strArr) {
        if (C24677a.m47209a(this)) {
            return null;
        }
        try {
            return m45246a();
        } catch (Throwable th) {
            C24677a.m47208a(th, this);
            return null;
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    /* access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    public final /* synthetic */ void onPostExecute(Boolean bool) {
        if (!C24677a.m47209a(this)) {
            try {
                Boolean bool2 = bool;
                if (!C24677a.m47209a(this)) {
                    try {
                        if (bool2.booleanValue()) {
                            this.f56663a.mo39430a(this.f56664b);
                        }
                    } catch (Throwable th) {
                        C24677a.m47208a(th, this);
                    }
                }
            } catch (Throwable th2) {
                C24677a.m47208a(th2, this);
            }
        }
    }

    public AsyncTaskC23935e(String str, File file, AbstractC23936a aVar) {
        this.f56665c = str;
        this.f56664b = file;
        this.f56663a = aVar;
    }
}
