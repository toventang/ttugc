package com.facebook;

import android.os.AsyncTask;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.facebook.internal.p1894a.p1896b.C24677a;
import java.net.HttpURLConnection;
import java.util.List;

/* renamed from: com.facebook.p */
public class AsyncTaskC24911p extends AsyncTask<Void, Void, List<C24915r>> {

    /* renamed from: c */
    private static final String f59140c = AsyncTaskC24911p.class.getCanonicalName();

    /* renamed from: a */
    public final C24912q f59141a;

    /* renamed from: b */
    public Exception f59142b;

    /* renamed from: d */
    private final HttpURLConnection f59143d;

    static {
        Covode.recordClassIndex(29104);
    }

    /* renamed from: a */
    private List<C24915r> m47745a() {
        if (C24677a.m47209a(this)) {
            return null;
        }
        try {
            HttpURLConnection httpURLConnection = this.f59143d;
            if (httpURLConnection == null) {
                return GraphRequest.m45072a(this.f59141a);
            }
            return GraphRequest.m45073a(httpURLConnection, this.f59141a);
        } catch (Exception e) {
            this.f59142b = e;
            return null;
        } catch (Throwable th) {
            C24677a.m47208a(th, this);
            return null;
        }
    }

    public String toString() {
        return "{RequestAsyncTask:  connection: " + this.f59143d + ", requests: " + this.f59141a + "}";
    }

    /* access modifiers changed from: protected */
    public void onPreExecute() {
        Handler handler;
        if (!C24677a.m47209a(this)) {
            try {
                super.onPreExecute();
                if (C24872m.f59045e) {
                    C1764a.m5928a("execute async task: %s", new Object[]{this});
                }
                if (this.f59141a.f59145a == null) {
                    if (Thread.currentThread() instanceof HandlerThread) {
                        handler = new Handler();
                    } else {
                        handler = new Handler(Looper.getMainLooper());
                    }
                    this.f59141a.f59145a = handler;
                }
            } catch (Throwable th) {
                C24677a.m47208a(th, this);
            }
        }
    }

    public AsyncTaskC24911p(C24912q qVar) {
        this(qVar, (byte) 0);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object[]] */
    /* access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    public /* synthetic */ List<C24915r> doInBackground(Void[] voidArr) {
        if (C24677a.m47209a(this)) {
            return null;
        }
        try {
            return m47745a();
        } catch (Throwable th) {
            C24677a.m47208a(th, this);
            return null;
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    /* access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    public /* synthetic */ void onPostExecute(List<C24915r> list) {
        if (!C24677a.m47209a(this)) {
            try {
                List<C24915r> list2 = list;
                if (!C24677a.m47209a(this)) {
                    try {
                        super.onPostExecute(list2);
                        Exception exc = this.f59142b;
                        if (exc != null) {
                            C1764a.m5928a("onPostExecute: exception encountered during request: %s", new Object[]{exc.getMessage()});
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

    private AsyncTaskC24911p(C24912q qVar, byte b) {
        this.f59141a = qVar;
        this.f59143d = null;
    }
}
