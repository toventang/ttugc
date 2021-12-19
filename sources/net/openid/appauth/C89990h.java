package net.openid.appauth;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.browser.p024a.C0471b;
import androidx.browser.p024a.C0479c;
import androidx.browser.p024a.C0483e;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import net.openid.appauth.C89982e;
import net.openid.appauth.C90013s;
import net.openid.appauth.p4649a.C89967b;
import net.openid.appauth.p4649a.C89969d;
import net.openid.appauth.p4649a.C89970e;
import net.openid.appauth.p4650b.AbstractC89974a;
import net.openid.appauth.p4651c.C89977a;
import net.openid.appauth.p4651c.C89980b;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: net.openid.appauth.h */
public final class C89990h {

    /* renamed from: a */
    Context f203965a;

    /* renamed from: b */
    public final C89970e f203966b;

    /* renamed from: c */
    public final C89967b f203967c;

    /* renamed from: d */
    public boolean f203968d;

    /* renamed from: e */
    private final C89972b f203969e;

    /* renamed from: net.openid.appauth.h$b */
    public interface AbstractC89992b {
        static {
            Covode.recordClassIndex(106163);
        }

        /* renamed from: a */
        void mo36766a(C90013s sVar, C89982e eVar);
    }

    static {
        Covode.recordClassIndex(106161);
    }

    /* renamed from: b */
    private void m156161b() {
        if (this.f203968d) {
            throw new IllegalStateException("Service has been disposed and rendered inoperable");
        }
    }

    /* renamed from: a */
    private C0479c.C0480a m156160a() {
        m156161b();
        C0471b b = this.f203966b.mo144630b();
        C0483e eVar = null;
        if (b != null) {
            C0483e b2 = b.mo2032b();
            if (b2 == null) {
                C89977a.m156122c("Failed to create custom tabs session through custom tabs client", new Object[0]);
            } else {
                eVar = b2;
            }
        }
        return new C0479c.C0480a(eVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: net.openid.appauth.h$a */
    public static class AsyncTaskC89991a extends AsyncTask<Void, Void, JSONObject> {

        /* renamed from: a */
        private C90011r f203970a;

        /* renamed from: b */
        private AbstractC89998k f203971b;

        /* renamed from: c */
        private final AbstractC89974a f203972c;

        /* renamed from: d */
        private AbstractC89992b f203973d;

        /* renamed from: e */
        private C89982e f203974e;

        static {
            Covode.recordClassIndex(106162);
        }

        /* renamed from: a */
        private JSONObject m156165a() {
            Throwable th;
            InputStream inputStream;
            IOException e;
            JSONException e2;
            MethodCollector.m26663i(9776);
            InputStream inputStream2 = null;
            try {
                HttpURLConnection a = this.f203972c.mo144632a(this.f203970a.f204029b.f203976b);
                a.setRequestMethod("POST");
                a.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
                if (TextUtils.isEmpty(a.getRequestProperty("Accept"))) {
                    a.setRequestProperty("Accept", "application/json");
                }
                a.setDoOutput(true);
                C90011r rVar = this.f203970a;
                HashMap hashMap = new HashMap();
                hashMap.put("grant_type", rVar.f204031d);
                C90011r.m156203a(hashMap, "redirect_uri", rVar.f204032e);
                C90011r.m156203a(hashMap, "code", rVar.f204033f);
                C90011r.m156203a(hashMap, "refresh_token", rVar.f204035h);
                C90011r.m156203a(hashMap, "code_verifier", rVar.f204036i);
                C90011r.m156203a(hashMap, "scope", rVar.f204034g);
                for (Map.Entry<String, String> entry : rVar.f204037j.entrySet()) {
                    hashMap.put(entry.getKey(), entry.getValue());
                }
                Map<String, String> a2 = this.f203971b.mo144667a(this.f203970a.f204030c);
                if (a2 != null) {
                    hashMap.putAll(a2);
                }
                String a3 = C89980b.m156130a(hashMap);
                a.setRequestProperty("Content-Length", String.valueOf(a3.length()));
                OutputStreamWriter outputStreamWriter = new OutputStreamWriter(a.getOutputStream());
                outputStreamWriter.write(a3);
                outputStreamWriter.flush();
                if (a.getResponseCode() < 200 || a.getResponseCode() >= 300) {
                    inputStream = a.getErrorStream();
                } else {
                    inputStream = a.getInputStream();
                }
                try {
                    JSONObject jSONObject = new JSONObject(C90015t.m156215a(inputStream));
                    C90015t.m156216b(inputStream);
                    MethodCollector.m26664o(9776);
                    return jSONObject;
                } catch (IOException e3) {
                    e = e3;
                    C89977a.m156119a(e, "Failed to complete exchange request", new Object[0]);
                    this.f203974e = C89982e.fromTemplate(C89982e.C89984b.f203903d, e);
                    C90015t.m156216b(inputStream);
                    MethodCollector.m26664o(9776);
                    return null;
                } catch (JSONException e4) {
                    e2 = e4;
                    try {
                        C89977a.m156119a(e2, "Failed to complete exchange request", new Object[0]);
                        this.f203974e = C89982e.fromTemplate(C89982e.C89984b.f203905f, e2);
                        C90015t.m156216b(inputStream);
                        MethodCollector.m26664o(9776);
                        return null;
                    } catch (Throwable th2) {
                        th = th2;
                        inputStream2 = inputStream;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    inputStream2 = inputStream;
                    C90015t.m156216b(inputStream2);
                    MethodCollector.m26664o(9776);
                    throw th;
                }
            } catch (IOException e5) {
                e = e5;
                inputStream = null;
                C89977a.m156119a(e, "Failed to complete exchange request", new Object[0]);
                this.f203974e = C89982e.fromTemplate(C89982e.C89984b.f203903d, e);
                C90015t.m156216b(inputStream);
                MethodCollector.m26664o(9776);
                return null;
            } catch (JSONException e6) {
                e2 = e6;
                inputStream = null;
                C89977a.m156119a(e2, "Failed to complete exchange request", new Object[0]);
                this.f203974e = C89982e.fromTemplate(C89982e.C89984b.f203905f, e2);
                C90015t.m156216b(inputStream);
                MethodCollector.m26664o(9776);
                return null;
            } catch (Throwable th4) {
                th = th4;
                C90015t.m156216b(inputStream2);
                MethodCollector.m26664o(9776);
                throw th;
            }
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object[]] */
        /* access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        public final /* synthetic */ JSONObject doInBackground(Void[] voidArr) {
            return m156165a();
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        public final /* synthetic */ void onPostExecute(JSONObject jSONObject) {
            C89982e eVar;
            Uri uri;
            JSONObject jSONObject2 = jSONObject;
            C89982e eVar2 = this.f203974e;
            if (eVar2 != null) {
                this.f203973d.mo36766a(null, eVar2);
            } else if (jSONObject2.has("error")) {
                try {
                    String string = jSONObject2.getString("error");
                    C89982e eVar3 = C89982e.C89985c.f203916i.get(string);
                    if (eVar3 == null) {
                        eVar3 = C89982e.C89985c.f203915h;
                    }
                    String optString = jSONObject2.optString("error_description", null);
                    String optString2 = jSONObject2.optString("error_uri");
                    if (optString2 == null) {
                        uri = null;
                    } else {
                        uri = Uri.parse(optString2);
                    }
                    eVar = C89982e.fromOAuthTemplate(eVar3, string, optString, uri);
                } catch (JSONException e) {
                    eVar = C89982e.fromTemplate(C89982e.C89984b.f203905f, e);
                }
                this.f203973d.mo36766a(null, eVar);
            } else {
                try {
                    C90013s.C90014a aVar = new C90013s.C90014a(this.f203970a);
                    aVar.f204057b = C90009p.m156201b(C90001n.m156181a(jSONObject2, "token_type"), "token type must not be empty if defined");
                    aVar.f204058c = C90009p.m156201b(C90001n.m156186b(jSONObject2, "access_token"), "access token cannot be empty if specified");
                    aVar.f204059d = C90001n.m156190e(jSONObject2, "expires_at");
                    if (jSONObject2.has("expires_in")) {
                        Long valueOf = Long.valueOf(jSONObject2.getLong("expires_in"));
                        C90010q qVar = C90010q.f204027a;
                        if (valueOf == null) {
                            aVar.f204059d = null;
                        } else {
                            aVar.f204059d = Long.valueOf(qVar.mo144668a() + TimeUnit.SECONDS.toMillis(valueOf.longValue()));
                        }
                    }
                    aVar.f204061f = C90009p.m156201b(C90001n.m156186b(jSONObject2, "refresh_token"), "refresh token must not be empty if defined");
                    aVar.f204060e = C90009p.m156201b(C90001n.m156186b(jSONObject2, "id_token"), "id token must not be empty if defined");
                    String b = C90001n.m156186b(jSONObject2, "scope");
                    if (TextUtils.isEmpty(b)) {
                        aVar.f204062g = null;
                    } else {
                        String[] split = b.split(" +");
                        if (split == null) {
                            split = new String[0];
                        }
                        aVar.f204062g = C89976c.m156115a(Arrays.asList(split));
                    }
                    Set<String> set = C90013s.f204047a;
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    Iterator<String> keys = jSONObject2.keys();
                    while (keys.hasNext()) {
                        String next = keys.next();
                        if (!set.contains(next)) {
                            linkedHashMap.put(next, jSONObject2.get(next).toString());
                        }
                    }
                    aVar.f204063h = C89965a.m156102a(linkedHashMap, C90013s.f204047a);
                    C90013s sVar = new C90013s(aVar.f204056a, aVar.f204057b, aVar.f204058c, aVar.f204059d, aVar.f204060e, aVar.f204061f, aVar.f204062g, aVar.f204063h);
                    C89977a.m156118a("Token exchange with %s completed", this.f203970a.f204029b.f203976b);
                    this.f203973d.mo36766a(sVar, null);
                } catch (JSONException e2) {
                    this.f203973d.mo36766a(null, C89982e.fromTemplate(C89982e.C89984b.f203905f, e2));
                }
            }
        }

        AsyncTaskC89991a(C90011r rVar, AbstractC89998k kVar, AbstractC89974a aVar, AbstractC89992b bVar) {
            this.f203970a = rVar;
            this.f203971b = kVar;
            this.f203972c = aVar;
            this.f203973d = bVar;
        }
    }

    public C89990h(Context context) {
        this(context, C89972b.f203869a);
    }

    /* renamed from: a */
    public final Intent mo144658a(C89986f fVar) {
        return m156159a(fVar, m156160a().mo2041a());
    }

    /* renamed from: a */
    public final void mo144659a(C90011r rVar, AbstractC89992b bVar) {
        mo144660a(rVar, C90008o.f204026a, bVar);
    }

    private C89990h(Context context, C89972b bVar) {
        this(context, bVar, C89969d.m156105a(context), new C89970e(context));
    }

    /* renamed from: a */
    private Intent m156159a(C89986f fVar, C0479c cVar) {
        Intent intent;
        m156161b();
        if (this.f203967c != null) {
            Uri a = fVar.mo144642a();
            if (this.f203967c.f203862d.booleanValue()) {
                intent = cVar.f1822a;
            } else {
                intent = new Intent("android.intent.action.VIEW");
            }
            intent.setPackage(this.f203967c.f203859a);
            intent.setData(a);
            C89977a.m156118a("Using %s as browser for auth, custom tab = %s", intent.getPackage(), this.f203967c.f203862d.toString());
            C89977a.m156118a("Initiating authorization request to %s", fVar.f203918b.f203975a);
            Intent a2 = AuthorizationManagementActivity.m156093a(this.f203965a);
            a2.putExtra("authIntent", intent);
            a2.putExtra("authRequest", fVar.mo144643b().toString());
            a2.putExtra("completeIntent", (Parcelable) null);
            a2.putExtra("cancelIntent", (Parcelable) null);
            return a2;
        }
        throw new ActivityNotFoundException();
    }

    /* renamed from: a */
    public final void mo144660a(C90011r rVar, AbstractC89998k kVar, AbstractC89992b bVar) {
        m156161b();
        C89977a.m156118a("Initiating code exchange request to %s", rVar.f204029b.f203976b);
        new AsyncTaskC89991a(rVar, kVar, this.f203969e.f203871c, bVar).execute(new Void[0]);
    }

    private C89990h(Context context, C89972b bVar, C89967b bVar2, C89970e eVar) {
        this.f203965a = (Context) C90009p.m156197a(context);
        this.f203969e = bVar;
        this.f203966b = eVar;
        this.f203967c = bVar2;
        if (bVar2 != null && bVar2.f203862d.booleanValue()) {
            eVar.mo144629a(bVar2.f203859a);
        }
    }
}
