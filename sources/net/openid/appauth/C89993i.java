package net.openid.appauth;

import android.net.Uri;
import android.os.AsyncTask;
import com.bytedance.covode.number.Covode;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import net.openid.appauth.C89982e;
import net.openid.appauth.C89996j;
import net.openid.appauth.p4650b.AbstractC89974a;
import net.openid.appauth.p4651c.C89977a;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: net.openid.appauth.i */
public final class C89993i {

    /* renamed from: a */
    public final Uri f203975a;

    /* renamed from: b */
    public final Uri f203976b;

    /* renamed from: c */
    public final Uri f203977c;

    /* renamed from: d */
    public final C89996j f203978d;

    /* renamed from: net.openid.appauth.i$b */
    public interface AbstractC89995b {
        static {
            Covode.recordClassIndex(106166);
        }

        /* renamed from: a */
        void mo36764a(C89993i iVar, C89982e eVar);
    }

    static {
        Covode.recordClassIndex(106164);
    }

    /* renamed from: net.openid.appauth.i$a */
    public static class AsyncTaskC89994a extends AsyncTask<Void, Void, C89993i> {

        /* renamed from: a */
        private Uri f203979a;

        /* renamed from: b */
        private AbstractC89974a f203980b;

        /* renamed from: c */
        private AbstractC89995b f203981c;

        /* renamed from: d */
        private C89982e f203982d;

        static {
            Covode.recordClassIndex(106165);
        }

        /* renamed from: a */
        private C89993i m156168a() {
            InputStream inputStream;
            Throwable th;
            IOException e;
            JSONException e2;
            C89996j.C89997a e3;
            try {
                HttpURLConnection a = this.f203980b.mo144632a(this.f203979a);
                a.setRequestMethod("GET");
                a.setDoInput(true);
                a.connect();
                inputStream = a.getInputStream();
                try {
                    C89993i iVar = new C89993i(new C89996j(new JSONObject(C90015t.m156215a(inputStream))));
                    C90015t.m156216b(inputStream);
                    return iVar;
                } catch (IOException e4) {
                    e = e4;
                    C89977a.m156121b(e, "Network error when retrieving discovery document", new Object[0]);
                    this.f203982d = C89982e.fromTemplate(C89982e.C89984b.f203903d, e);
                    C90015t.m156216b(inputStream);
                    return null;
                } catch (JSONException e5) {
                    e2 = e5;
                    C89977a.m156121b(e2, "Error parsing discovery document", new Object[0]);
                    this.f203982d = C89982e.fromTemplate(C89982e.C89984b.f203905f, e2);
                    C90015t.m156216b(inputStream);
                    return null;
                } catch (C89996j.C89997a e6) {
                    e3 = e6;
                    try {
                        C89977a.m156121b(e3, "Malformed discovery document", new Object[0]);
                        this.f203982d = C89982e.fromTemplate(C89982e.C89984b.f203900a, e3);
                        C90015t.m156216b(inputStream);
                        return null;
                    } catch (Throwable th2) {
                        th = th2;
                    }
                }
            } catch (IOException e7) {
                e = e7;
                inputStream = null;
                C89977a.m156121b(e, "Network error when retrieving discovery document", new Object[0]);
                this.f203982d = C89982e.fromTemplate(C89982e.C89984b.f203903d, e);
                C90015t.m156216b(inputStream);
                return null;
            } catch (JSONException e8) {
                e2 = e8;
                inputStream = null;
                C89977a.m156121b(e2, "Error parsing discovery document", new Object[0]);
                this.f203982d = C89982e.fromTemplate(C89982e.C89984b.f203905f, e2);
                C90015t.m156216b(inputStream);
                return null;
            } catch (C89996j.C89997a e9) {
                e3 = e9;
                inputStream = null;
                C89977a.m156121b(e3, "Malformed discovery document", new Object[0]);
                this.f203982d = C89982e.fromTemplate(C89982e.C89984b.f203900a, e3);
                C90015t.m156216b(inputStream);
                return null;
            } catch (Throwable th3) {
                th = th3;
                inputStream = null;
                C90015t.m156216b(inputStream);
                throw th;
            }
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object[]] */
        /* access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        public final /* synthetic */ C89993i doInBackground(Void[] voidArr) {
            return m156168a();
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        public final /* synthetic */ void onPostExecute(C89993i iVar) {
            C89993i iVar2 = iVar;
            C89982e eVar = this.f203982d;
            if (eVar != null) {
                this.f203981c.mo36764a(null, eVar);
            } else {
                this.f203981c.mo36764a(iVar2, null);
            }
        }

        public AsyncTaskC89994a(Uri uri, AbstractC89974a aVar, AbstractC89995b bVar) {
            this.f203979a = uri;
            this.f203980b = aVar;
            this.f203981c = bVar;
        }
    }

    public C89993i(C89996j jVar) {
        C90009p.m156198a(jVar, "docJson cannot be null");
        this.f203978d = jVar;
        this.f203975a = (Uri) jVar.mo144665a(C89996j.f203994b);
        this.f203976b = (Uri) jVar.mo144665a(C89996j.f203995c);
        this.f203977c = (Uri) jVar.mo144665a(C89996j.f203998f);
    }

    /* renamed from: a */
    public static C89993i m156167a(JSONObject jSONObject) {
        C90009p.m156198a(jSONObject, "json object cannot be null");
        if (jSONObject.has("discoveryDoc")) {
            try {
                return new C89993i(new C89996j(jSONObject.optJSONObject("discoveryDoc")));
            } catch (C89996j.C89997a e) {
                throw new JSONException("Missing required field in discovery doc: " + e.getMissingField());
            }
        } else {
            C90009p.m156200a(jSONObject.has("authorizationEndpoint"), "missing authorizationEndpoint");
            C90009p.m156200a(jSONObject.has("tokenEndpoint"), "missing tokenEndpoint");
            return new C89993i(C90001n.m156188c(jSONObject, "authorizationEndpoint"), C90001n.m156188c(jSONObject, "tokenEndpoint"), C90001n.m156189d(jSONObject, "registrationEndpoint"));
        }
    }

    public C89993i(Uri uri, Uri uri2) {
        this(uri, uri2, null);
    }

    private C89993i(Uri uri, Uri uri2, Uri uri3) {
        this.f203975a = (Uri) C90009p.m156197a(uri);
        this.f203976b = (Uri) C90009p.m156197a(uri2);
        this.f203977c = uri3;
        this.f203978d = null;
    }
}
