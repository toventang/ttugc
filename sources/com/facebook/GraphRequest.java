package com.facebook;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Pair;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.facebook.C24912q;
import com.facebook.internal.C24691ab;
import com.facebook.internal.C24693ad;
import com.facebook.internal.C24699ae;
import com.facebook.internal.C24783w;
import com.facebook.internal.p1894a.p1896b.C24677a;
import com.kakao.usermgmt.StringSet;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.security.SecureRandom;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONObject;

public class GraphRequest {

    /* renamed from: a */
    public static final String f56447a = GraphRequest.class.getSimpleName();

    /* renamed from: b */
    public static final String f56448b;

    /* renamed from: o */
    private static String f56449o;

    /* renamed from: p */
    private static Pattern f56450p = Pattern.compile("^/?v\\d+\\.\\d+/(.*)");

    /* renamed from: r */
    private static volatile String f56451r;

    /* renamed from: c */
    public AccessToken f56452c;

    /* renamed from: d */
    public EnumC24916s f56453d;

    /* renamed from: e */
    public String f56454e;

    /* renamed from: f */
    public JSONObject f56455f;

    /* renamed from: g */
    public String f56456g;

    /* renamed from: h */
    public String f56457h;

    /* renamed from: i */
    public boolean f56458i;

    /* renamed from: j */
    public Bundle f56459j;

    /* renamed from: k */
    public AbstractC23858b f56460k;

    /* renamed from: l */
    public Object f56461l;

    /* renamed from: m */
    public String f56462m;

    /* renamed from: n */
    public boolean f56463n;

    /* renamed from: q */
    private String f56464q;

    /* renamed from: com.facebook.GraphRequest$b */
    public interface AbstractC23858b {
        static {
            Covode.recordClassIndex(27978);
        }

        /* renamed from: a */
        void mo39350a(C24915r rVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.facebook.GraphRequest$c */
    public interface AbstractC23859c {
        static {
            Covode.recordClassIndex(27979);
        }

        /* renamed from: a */
        void mo39352a(String str, String str2);
    }

    /* renamed from: com.facebook.GraphRequest$d */
    public interface AbstractC23860d extends AbstractC23858b {
        static {
            Covode.recordClassIndex(27980);
        }
    }

    /* renamed from: a */
    public final void mo39348a(final AbstractC23858b bVar) {
        if (C24872m.m47686a(EnumC25029u.GRAPH_API_DEBUG_INFO) || C24872m.m47686a(EnumC25029u.GRAPH_API_DEBUG_WARNING)) {
            this.f56460k = new AbstractC23858b() {
                /* class com.facebook.GraphRequest.C238531 */

                static {
                    Covode.recordClassIndex(27972);
                }

                @Override // com.facebook.GraphRequest.AbstractC23858b
                /* renamed from: a */
                public final void mo39350a(C24915r rVar) {
                    JSONObject optJSONObject;
                    JSONArray optJSONArray;
                    JSONObject jSONObject = rVar.f59153b;
                    if (!(jSONObject == null || (optJSONObject = jSONObject.optJSONObject("__debug__")) == null || (optJSONArray = optJSONObject.optJSONArray("messages")) == null)) {
                        for (int i = 0; i < optJSONArray.length(); i++) {
                            JSONObject optJSONObject2 = optJSONArray.optJSONObject(i);
                            if (optJSONObject2 != null) {
                                String optString = optJSONObject2.optString("message");
                                String optString2 = optJSONObject2.optString(StringSet.type);
                                String optString3 = optJSONObject2.optString("link");
                                if (!(optString == null || optString2 == null)) {
                                    EnumC25029u uVar = EnumC25029u.GRAPH_API_DEBUG_INFO;
                                    if (optString2.equals("warning")) {
                                        uVar = EnumC25029u.GRAPH_API_DEBUG_WARNING;
                                    }
                                    if (!C24693ad.m47261a(optString3)) {
                                        optString = optString + " Link: " + optString3;
                                    }
                                    C24783w.m47440a(uVar, GraphRequest.f56447a, optString);
                                }
                            }
                        }
                    }
                    AbstractC23858b bVar = bVar;
                    if (bVar != null) {
                        bVar.mo39350a(rVar);
                    }
                }
            };
        } else {
            this.f56460k = bVar;
        }
    }

    /* renamed from: a */
    private static void m45079a(final C24912q qVar, List<C24915r> list) {
        int size = qVar.size();
        final ArrayList arrayList = new ArrayList();
        for (int i = 0; i < size; i++) {
            GraphRequest a = qVar.get(i);
            if (a.f56460k != null) {
                arrayList.add(new Pair(a.f56460k, list.get(i)));
            }
        }
        if (arrayList.size() > 0) {
            RunnableC238542 r1 = new Runnable() {
                /* class com.facebook.GraphRequest.RunnableC238542 */

                static {
                    Covode.recordClassIndex(27973);
                }

                public final void run() {
                    if (!C24677a.m47209a(this)) {
                        try {
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                Pair pair = (Pair) it.next();
                                ((AbstractC23858b) pair.first).mo39350a((C24915r) pair.second);
                            }
                            for (C24912q.AbstractC24913a aVar : qVar.f59149e) {
                                aVar.mo39537a();
                            }
                        } catch (Throwable th) {
                            C24677a.m47208a(th, this);
                        }
                    }
                }
            };
            Handler handler = qVar.f59145a;
            if (handler == null) {
                r1.run();
            } else {
                handler.post(r1);
            }
        }
    }

    /* renamed from: a */
    private void m45082a(JSONArray jSONArray, Map<String, C23857a> map) {
        JSONObject jSONObject = new JSONObject();
        String str = this.f56456g;
        if (str != null) {
            jSONObject.put(StringSet.name, str);
            jSONObject.put("omit_response_on_success", this.f56458i);
        }
        String str2 = this.f56457h;
        if (str2 != null) {
            jSONObject.put("depends_on", str2);
        }
        String c = m45088c();
        jSONObject.put("relative_url", c);
        jSONObject.put("method", this.f56453d);
        AccessToken accessToken = this.f56452c;
        if (accessToken != null) {
            C24783w.m47442a(accessToken.f56404e);
        }
        ArrayList arrayList = new ArrayList();
        for (String str3 : this.f56459j.keySet()) {
            Object a = m45070a(this.f56459j, str3);
            if (m45090c(a)) {
                String a2 = C1764a.m5929a(Locale.ROOT, "%s%d", new Object[]{"file", Integer.valueOf(map.size())});
                arrayList.add(a2);
                map.put(a2, new C23857a(this, a));
            }
        }
        if (!arrayList.isEmpty()) {
            jSONObject.put("attached_files", TextUtils.join(",", arrayList));
        }
        if (this.f56455f != null) {
            final ArrayList arrayList2 = new ArrayList();
            m45083a(this.f56455f, c, new AbstractC23859c() {
                /* class com.facebook.GraphRequest.C238553 */

                static {
                    Covode.recordClassIndex(27974);
                }

                @Override // com.facebook.GraphRequest.AbstractC23859c
                /* renamed from: a */
                public final void mo39352a(String str, String str2) {
                    arrayList2.add(C1764a.m5929a(Locale.US, "%s=%s", new Object[]{str, URLEncoder.encode(str2, "UTF-8")}));
                }
            });
            jSONObject.put("body", TextUtils.join("&", arrayList2));
        }
        jSONArray.put(jSONObject);
    }

    /* renamed from: a */
    private static void m45078a(C24912q qVar, C24783w wVar, int i, URL url, OutputStream outputStream, boolean z) {
        C23861e eVar = new C23861e(outputStream, wVar, z);
        if (i == 1) {
            GraphRequest a = qVar.get(0);
            HashMap hashMap = new HashMap();
            for (String str : a.f56459j.keySet()) {
                Object a2 = m45070a(a.f56459j, str);
                if (m45090c(a2)) {
                    hashMap.put(str, new C23857a(a, a2));
                }
            }
            if (wVar != null) {
                wVar.mo40600b("  Parameters:\n");
            }
            m45076a(a.f56459j, eVar, a);
            if (wVar != null) {
                wVar.mo40600b("  Attachments:\n");
            }
            m45081a(hashMap, eVar);
            JSONObject jSONObject = a.f56455f;
            if (jSONObject != null) {
                m45083a(jSONObject, url.getPath(), eVar);
                return;
            }
            return;
        }
        String f = m45094f(qVar);
        if (!C24693ad.m47261a(f)) {
            eVar.mo39352a("batch_app_id", f);
            HashMap hashMap2 = new HashMap();
            m45077a(eVar, qVar, hashMap2);
            if (wVar != null) {
                wVar.mo40600b("  Attachments:\n");
            }
            m45081a(hashMap2, eVar);
            return;
        }
        throw new C24798j("App ID was not specified at the request or Settings.");
    }

    /* renamed from: a */
    private static void m45080a(String str, Object obj, AbstractC23859c cVar, boolean z) {
        while (true) {
            Class<?> cls = obj.getClass();
            if (JSONObject.class.isAssignableFrom(cls)) {
                JSONObject jSONObject = (JSONObject) obj;
                if (z) {
                    Iterator<String> keys = jSONObject.keys();
                    while (keys.hasNext()) {
                        String next = keys.next();
                        m45080a(C1764a.m5928a("%s[%s]", new Object[]{str, next}), jSONObject.opt(next), cVar, z);
                    }
                    return;
                } else if (jSONObject.has("id")) {
                    obj = jSONObject.optString("id");
                } else if (jSONObject.has("url")) {
                    obj = jSONObject.optString("url");
                } else if (jSONObject.has("fbsdk:create_object")) {
                    obj = jSONObject.toString();
                } else {
                    return;
                }
            } else if (JSONArray.class.isAssignableFrom(cls)) {
                JSONArray jSONArray = (JSONArray) obj;
                int length = jSONArray.length();
                for (int i = 0; i < length; i++) {
                    m45080a(C1764a.m5929a(Locale.ROOT, "%s[%d]", new Object[]{str, Integer.valueOf(i)}), jSONArray.opt(i), cVar, z);
                }
                return;
            } else if (String.class.isAssignableFrom(cls) || Number.class.isAssignableFrom(cls) || Boolean.class.isAssignableFrom(cls)) {
                cVar.mo39352a(str, obj.toString());
                return;
            } else if (Date.class.isAssignableFrom(cls)) {
                cVar.mo39352a(str, new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ", Locale.US).format((Date) obj));
                return;
            } else {
                return;
            }
        }
    }

    /* renamed from: a */
    private static void m45076a(Bundle bundle, C23861e eVar, GraphRequest graphRequest) {
        for (String str : bundle.keySet()) {
            Object a = m45070a(bundle, str);
            if (m45084a(a)) {
                eVar.mo39357a(str, a, graphRequest);
            }
        }
    }

    /* renamed from: a */
    private static void m45081a(Map<String, C23857a> map, C23861e eVar) {
        for (String str : map.keySet()) {
            C23857a aVar = map.get(str);
            if (m45090c(aVar.f56474b)) {
                eVar.mo39357a(str, aVar.f56474b, aVar.f56473a);
            }
        }
    }

    /* renamed from: a */
    private static void m45077a(C23861e eVar, Collection<GraphRequest> collection, Map<String, C23857a> map) {
        JSONArray jSONArray = new JSONArray();
        for (GraphRequest graphRequest : collection) {
            graphRequest.m45082a(jSONArray, map);
        }
        eVar.mo39358a("batch", jSONArray, collection);
    }

    /* renamed from: a */
    public static boolean m45084a(Object obj) {
        return (obj instanceof String) || (obj instanceof Boolean) || (obj instanceof Number) || (obj instanceof Date);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.facebook.GraphRequest$e */
    public static class C23861e implements AbstractC23859c {

        /* renamed from: a */
        private final OutputStream f56475a;

        /* renamed from: b */
        private final C24783w f56476b;

        /* renamed from: c */
        private boolean f56477c = true;

        /* renamed from: d */
        private boolean f56478d;

        static {
            Covode.recordClassIndex(27981);
        }

        /* renamed from: a */
        public final void mo39357a(String str, Object obj, GraphRequest graphRequest) {
            OutputStream outputStream = this.f56475a;
            if (outputStream instanceof AbstractC25035z) {
                ((AbstractC25035z) outputStream).mo40926a(graphRequest);
            }
            if (GraphRequest.m45084a(obj)) {
                mo39352a(str, GraphRequest.m45086b(obj));
            } else if (obj instanceof Bitmap) {
                m45102a(str, (Bitmap) obj);
            } else if (obj instanceof byte[]) {
                m45106a(str, (byte[]) obj);
            } else if (obj instanceof Uri) {
                m45103a(str, (Uri) obj, (String) null);
            } else if (obj instanceof ParcelFileDescriptor) {
                m45104a(str, (ParcelFileDescriptor) obj, (String) null);
            } else if (obj instanceof ParcelableResourceWithMimeType) {
                ParcelableResourceWithMimeType parcelableResourceWithMimeType = (ParcelableResourceWithMimeType) obj;
                RESOURCE resource = parcelableResourceWithMimeType.f56472b;
                String str2 = parcelableResourceWithMimeType.f56471a;
                if (resource instanceof ParcelFileDescriptor) {
                    m45104a(str, (ParcelFileDescriptor) resource, str2);
                } else if (resource instanceof Uri) {
                    m45103a(str, (Uri) resource, str2);
                } else {
                    throw m45101a();
                }
            } else {
                throw m45101a();
            }
        }

        /* renamed from: a */
        public final void mo39358a(String str, JSONArray jSONArray, Collection<GraphRequest> collection) {
            OutputStream outputStream = this.f56475a;
            if (!(outputStream instanceof AbstractC25035z)) {
                mo39352a(str, jSONArray.toString());
                return;
            }
            AbstractC25035z zVar = (AbstractC25035z) outputStream;
            m45105a(str, (String) null, (String) null);
            m45107a("[", new Object[0]);
            int i = 0;
            for (GraphRequest graphRequest : collection) {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                zVar.mo40926a(graphRequest);
                if (i > 0) {
                    m45107a(",%s", jSONObject.toString());
                } else {
                    m45107a("%s", jSONObject.toString());
                }
                i++;
            }
            m45107a("]", new Object[0]);
            C24783w wVar = this.f56476b;
            if (wVar != null) {
                wVar.mo40599a("    ".concat(String.valueOf(str)), (Object) jSONArray.toString());
            }
        }

        @Override // com.facebook.GraphRequest.AbstractC23859c
        /* renamed from: a */
        public final void mo39352a(String str, String str2) {
            m45105a(str, (String) null, (String) null);
            m45109b("%s", str2);
            m45108b();
            C24783w wVar = this.f56476b;
            if (wVar != null) {
                wVar.mo40599a("    ".concat(String.valueOf(str)), (Object) str2);
            }
        }

        /* renamed from: a */
        private static RuntimeException m45101a() {
            return new IllegalArgumentException("value is not a supported type.");
        }

        /* renamed from: b */
        private void m45108b() {
            MethodCollector.m26663i(8887);
            if (!this.f56478d) {
                m45109b("--%s", GraphRequest.f56448b);
                MethodCollector.m26664o(8887);
                return;
            }
            this.f56475a.write("&".getBytes());
            MethodCollector.m26664o(8887);
        }

        /* renamed from: b */
        private void m45109b(String str, Object... objArr) {
            m45107a(str, objArr);
            if (!this.f56478d) {
                m45107a("\r\n", new Object[0]);
            }
        }

        /* renamed from: a */
        private void m45102a(String str, Bitmap bitmap) {
            MethodCollector.m26663i(8429);
            m45105a(str, str, "image/png");
            bitmap.compress(Bitmap.CompressFormat.PNG, 100, this.f56475a);
            m45109b("", new Object[0]);
            m45108b();
            C24783w wVar = this.f56476b;
            if (wVar != null) {
                wVar.mo40599a("    ".concat(String.valueOf(str)), (Object) "<Image>");
            }
            MethodCollector.m26664o(8429);
        }

        /* renamed from: a */
        private void m45106a(String str, byte[] bArr) {
            MethodCollector.m26663i(8591);
            m45105a(str, str, "content/unknown");
            this.f56475a.write(bArr);
            m45109b("", new Object[0]);
            m45108b();
            C24783w wVar = this.f56476b;
            if (wVar != null) {
                wVar.mo40599a("    ".concat(String.valueOf(str)), (Object) C1764a.m5929a(Locale.ROOT, "<Data: %d>", new Object[]{Integer.valueOf(bArr.length)}));
            }
            MethodCollector.m26664o(8591);
        }

        /* renamed from: a */
        private void m45107a(String str, Object... objArr) {
            MethodCollector.m26663i(9035);
            if (!this.f56478d) {
                if (this.f56477c) {
                    this.f56475a.write("--".getBytes());
                    this.f56475a.write(GraphRequest.f56448b.getBytes());
                    this.f56475a.write("\r\n".getBytes());
                    this.f56477c = false;
                }
                this.f56475a.write(C1764a.m5928a(str, objArr).getBytes());
                MethodCollector.m26664o(9035);
                return;
            }
            this.f56475a.write(URLEncoder.encode(C1764a.m5929a(Locale.US, str, objArr), "UTF-8").getBytes());
            MethodCollector.m26664o(9035);
        }

        public C23861e(OutputStream outputStream, C24783w wVar, boolean z) {
            this.f56475a = outputStream;
            this.f56476b = wVar;
            this.f56478d = z;
        }

        /* renamed from: a */
        private void m45103a(String str, Uri uri, String str2) {
            int a;
            MethodCollector.m26663i(8742);
            if (str2 == null) {
                str2 = "content/unknown";
            }
            m45105a(str, str, str2);
            if (this.f56475a instanceof C25032x) {
                ((C25032x) this.f56475a).mo40925a(C24693ad.m47280e(uri));
                a = 0;
            } else {
                C24699ae.m47299a();
                a = C24693ad.m47226a(C24872m.f59047g.getContentResolver().openInputStream(uri), this.f56475a) + 0;
            }
            m45109b("", new Object[0]);
            m45108b();
            C24783w wVar = this.f56476b;
            if (wVar != null) {
                wVar.mo40599a("    ".concat(String.valueOf(str)), (Object) C1764a.m5929a(Locale.ROOT, "<Data: %d>", new Object[]{Integer.valueOf(a)}));
            }
            MethodCollector.m26664o(8742);
        }

        /* renamed from: a */
        private void m45104a(String str, ParcelFileDescriptor parcelFileDescriptor, String str2) {
            int a;
            MethodCollector.m26663i(8745);
            if (str2 == null) {
                str2 = "content/unknown";
            }
            m45105a(str, str, str2);
            OutputStream outputStream = this.f56475a;
            if (outputStream instanceof C25032x) {
                ((C25032x) outputStream).mo40925a(parcelFileDescriptor.getStatSize());
                a = 0;
            } else {
                a = C24693ad.m47226a((InputStream) new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor), this.f56475a) + 0;
            }
            m45109b("", new Object[0]);
            m45108b();
            C24783w wVar = this.f56476b;
            if (wVar != null) {
                wVar.mo40599a("    ".concat(String.valueOf(str)), (Object) C1764a.m5929a(Locale.ROOT, "<Data: %d>", new Object[]{Integer.valueOf(a)}));
            }
            MethodCollector.m26664o(8745);
        }

        /* renamed from: a */
        private void m45105a(String str, String str2, String str3) {
            MethodCollector.m26663i(9034);
            if (!this.f56478d) {
                m45107a("Content-Disposition: form-data; name=\"%s\"", str);
                if (str2 != null) {
                    m45107a("; filename=\"%s\"", str2);
                }
                m45109b("", new Object[0]);
                if (str3 != null) {
                    m45109b("%s: %s", "Content-Type", str3);
                }
                m45109b("", new Object[0]);
                MethodCollector.m26664o(9034);
                return;
            }
            this.f56475a.write(C1764a.m5928a("%s=", new Object[]{str}).getBytes());
            MethodCollector.m26664o(9034);
        }
    }

    /* renamed from: a */
    public final AsyncTaskC24911p mo39347a() {
        GraphRequest[] graphRequestArr = {this};
        C24699ae.m47301a(graphRequestArr, "requests");
        return m45085b(new C24912q(Arrays.asList(graphRequestArr)));
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0041  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void m45083a(org.json.JSONObject r5, java.lang.String r6, com.facebook.GraphRequest.AbstractC23859c r7) {
        /*
            java.util.regex.Pattern r0 = com.facebook.GraphRequest.f56450p
            java.util.regex.Matcher r2 = r0.matcher(r6)
            boolean r1 = r2.matches()
            r0 = 1
            if (r1 == 0) goto L_0x005e
            java.lang.String r2 = r2.group(r0)
        L_0x0011:
            java.lang.String r0 = "me/"
            boolean r1 = r2.startsWith(r0)
            r0 = 0
            if (r1 != 0) goto L_0x0022
            java.lang.String r0 = "/me/"
            boolean r0 = r2.startsWith(r0)
            if (r0 == 0) goto L_0x005c
        L_0x0022:
            java.lang.String r0 = ":"
            int r2 = r6.indexOf(r0)
            java.lang.String r0 = "?"
            int r1 = r6.indexOf(r0)
            r0 = 3
            if (r2 <= r0) goto L_0x005c
            r0 = -1
            if (r1 == r0) goto L_0x0036
            if (r2 >= r1) goto L_0x005c
        L_0x0036:
            r4 = 1
        L_0x0037:
            java.util.Iterator r3 = r5.keys()
        L_0x003b:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0060
            java.lang.Object r2 = r3.next()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r1 = r5.opt(r2)
            if (r4 == 0) goto L_0x005a
            java.lang.String r0 = "image"
            boolean r0 = r2.equalsIgnoreCase(r0)
            if (r0 == 0) goto L_0x005a
            r0 = 1
        L_0x0056:
            m45080a(r2, r1, r7, r0)
            goto L_0x003b
        L_0x005a:
            r0 = 0
            goto L_0x0056
        L_0x005c:
            r4 = 0
            goto L_0x0037
        L_0x005e:
            r2 = r6
            goto L_0x0011
        L_0x0060:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.GraphRequest.m45083a(org.json.JSONObject, java.lang.String, com.facebook.GraphRequest$c):void");
    }

    public static class ParcelableResourceWithMimeType<RESOURCE extends Parcelable> implements Parcelable {
        public static final Parcelable.Creator<ParcelableResourceWithMimeType> CREATOR = new Parcelable.Creator<ParcelableResourceWithMimeType>() {
            /* class com.facebook.GraphRequest.ParcelableResourceWithMimeType.C238561 */

            static {
                Covode.recordClassIndex(27976);
            }

            /* Return type fixed from 'java.lang.Object[]' to match base method */
            @Override // android.os.Parcelable.Creator
            public final /* bridge */ /* synthetic */ ParcelableResourceWithMimeType[] newArray(int i) {
                return new ParcelableResourceWithMimeType[i];
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ ParcelableResourceWithMimeType createFromParcel(Parcel parcel) {
                return new ParcelableResourceWithMimeType(parcel, (byte) 0);
            }
        };

        /* renamed from: a */
        public final String f56471a;

        /* renamed from: b */
        public final RESOURCE f56472b;

        public int describeContents() {
            return 1;
        }

        static {
            Covode.recordClassIndex(27975);
        }

        private ParcelableResourceWithMimeType(Parcel parcel) {
            this.f56471a = parcel.readString();
            C24699ae.m47299a();
            this.f56472b = (RESOURCE) parcel.readParcelable(C24872m.f59047g.getClassLoader());
        }

        /* synthetic */ ParcelableResourceWithMimeType(Parcel parcel, byte b) {
            this(parcel);
        }

        public ParcelableResourceWithMimeType(RESOURCE resource, String str) {
            this.f56471a = str;
            this.f56472b = resource;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.f56471a);
            parcel.writeParcelable(this.f56472b, i);
        }
    }

    public GraphRequest() {
        this(null, null, null, null, null);
    }

    /* renamed from: d */
    private String m45091d() {
        if (f56450p.matcher(this.f56454e).matches()) {
            return this.f56454e;
        }
        return C1764a.m5928a("%s/%s", new Object[]{this.f56462m, this.f56454e});
    }

    static {
        Covode.recordClassIndex(27971);
        char[] charArray = "-_1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
        StringBuilder sb = new StringBuilder();
        SecureRandom secureRandom = new SecureRandom();
        int nextInt = secureRandom.nextInt(11) + 30;
        for (int i = 0; i < nextInt; i++) {
            sb.append(charArray[secureRandom.nextInt(charArray.length)]);
        }
        f56448b = sb.toString();
    }

    /* renamed from: c */
    private String m45088c() {
        if (this.f56464q == null) {
            String a = C1764a.m5928a("%s/%s", new Object[]{C24691ab.m47225b(), m45091d()});
            m45087b();
            Uri parse = Uri.parse(m45071a(a, (Boolean) true));
            return C1764a.m5928a("%s?%s", new Object[]{parse.getPath(), parse.getQuery()});
        }
        throw new C24798j("Can't override URL for a batch request");
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{Request:  accessToken: ");
        Object obj = this.f56452c;
        if (obj == null) {
            obj = "null";
        }
        return sb.append(obj).append(", graphPath: ").append(this.f56454e).append(", graphObject: ").append(this.f56455f).append(", httpMethod: ").append(this.f56453d).append(", parameters: ").append(this.f56459j).append("}").toString();
    }

    /* renamed from: b */
    private void m45087b() {
        if (this.f56452c != null) {
            if (!this.f56459j.containsKey("access_token")) {
                String str = this.f56452c.f56404e;
                C24783w.m47442a(str);
                this.f56459j.putString("access_token", str);
            }
        } else if (!this.f56463n && !this.f56459j.containsKey("access_token")) {
            C24699ae.m47299a();
            String str2 = C24872m.f59041a;
            C24699ae.m47299a();
            String str3 = C24872m.f59043c;
            if (!C24693ad.m47261a(str2) && !C24693ad.m47261a(str3)) {
                this.f56459j.putString("access_token", str2 + "|" + str3);
            }
        }
        this.f56459j.putString("sdk", "android");
        this.f56459j.putString("format", "json");
        if (C24872m.m47686a(EnumC25029u.GRAPH_API_DEBUG_INFO)) {
            this.f56459j.putString("debug", "info");
        } else if (C24872m.m47686a(EnumC25029u.GRAPH_API_DEBUG_WARNING)) {
            this.f56459j.putString("debug", "warning");
        }
    }

    /* renamed from: a */
    public static GraphRequest m45068a(String str) {
        return new GraphRequest(null, str, null, null, null);
    }

    /* renamed from: b */
    public static AsyncTaskC24911p m45085b(C24912q qVar) {
        C24699ae.m47303a((Collection) qVar, "requests");
        AsyncTaskC24911p pVar = new AsyncTaskC24911p(qVar);
        pVar.executeOnExecutor(C24872m.m47689c(), new Void[0]);
        return pVar;
    }

    /* renamed from: c */
    private static boolean m45090c(Object obj) {
        if ((obj instanceof Bitmap) || (obj instanceof byte[]) || (obj instanceof Uri) || (obj instanceof ParcelFileDescriptor) || (obj instanceof ParcelableResourceWithMimeType)) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static C24915r m45069a(GraphRequest graphRequest) {
        List<C24915r> a = m45075a(graphRequest);
        if (a != null && a.size() == 1) {
            return a.get(0);
        }
        throw new C24798j("invalid state: expected a single response");
    }

    /* renamed from: b */
    public static String m45086b(Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        if ((obj instanceof Boolean) || (obj instanceof Number)) {
            return obj.toString();
        }
        if (obj instanceof Date) {
            return new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ", Locale.US).format(obj);
        }
        throw new IllegalArgumentException("Unsupported parameter type.");
    }

    /* renamed from: e */
    private static boolean m45093e(C24912q qVar) {
        Iterator it = qVar.iterator();
        while (it.hasNext()) {
            GraphRequest graphRequest = (GraphRequest) it.next();
            Iterator<String> it2 = graphRequest.f56459j.keySet().iterator();
            while (true) {
                if (it2.hasNext()) {
                    if (m45090c(m45070a(graphRequest.f56459j, it2.next()))) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    /* renamed from: f */
    private static String m45094f(C24912q qVar) {
        String str;
        if (!C24693ad.m47261a(qVar.f59150f)) {
            return qVar.f59150f;
        }
        Iterator it = qVar.iterator();
        while (it.hasNext()) {
            AccessToken accessToken = ((GraphRequest) it.next()).f56452c;
            if (accessToken != null && (str = accessToken.f56407h) != null) {
                return str;
            }
        }
        if (!C24693ad.m47261a(f56449o)) {
            return f56449o;
        }
        C24699ae.m47299a();
        return C24872m.f59041a;
    }

    /* renamed from: d */
    private static boolean m45092d(C24912q qVar) {
        for (C24912q.AbstractC24913a aVar : qVar.f59149e) {
            if (aVar instanceof C24912q.AbstractC24914b) {
                return true;
            }
        }
        Iterator it = qVar.iterator();
        while (it.hasNext()) {
            if (((GraphRequest) it.next()).f56460k instanceof AbstractC23860d) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public static List<C24915r> m45072a(C24912q qVar) {
        C24699ae.m47303a((Collection) qVar, "requests");
        try {
            HttpURLConnection c = m45089c(qVar);
            try {
                return m45073a(c, qVar);
            } finally {
                C24693ad.m47256a(c);
            }
        } catch (Exception e) {
            List<C24915r> a = C24915r.m47752a(qVar.f59146b, (HttpURLConnection) null, new C24798j(e));
            m45079a(qVar, a);
            C24693ad.m47256a((URLConnection) null);
            return a;
        }
    }

    /* renamed from: a */
    private static List<C24915r> m45074a(Collection<GraphRequest> collection) {
        return m45072a(new C24912q(collection));
    }

    /* JADX WARNING: Removed duplicated region for block: B:110:0x0270  */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x000d A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0152 A[Catch:{ IOException | JSONException -> 0x027f }] */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x01a2 A[Catch:{ IOException | JSONException -> 0x0277 }] */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x01b0 A[Catch:{ IOException | JSONException -> 0x0277 }] */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x01b7  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x01c4  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x020d  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0210  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0214  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0033  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.net.HttpURLConnection m45089c(com.facebook.C24912q r24) {
        /*
        // Method dump skipped, instructions count: 671
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.GraphRequest.m45089c(com.facebook.q):java.net.HttpURLConnection");
    }

    /* renamed from: a */
    private static List<C24915r> m45075a(GraphRequest... graphRequestArr) {
        C24699ae.m47301a(graphRequestArr, "requests");
        return m45074a((Collection<GraphRequest>) Arrays.asList(graphRequestArr));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.facebook.GraphRequest$a */
    public static class C23857a {

        /* renamed from: a */
        public final GraphRequest f56473a;

        /* renamed from: b */
        public final Object f56474b;

        static {
            Covode.recordClassIndex(27977);
        }

        public C23857a(GraphRequest graphRequest, Object obj) {
            this.f56473a = graphRequest;
            this.f56474b = obj;
        }
    }

    /* renamed from: a */
    private static Object m45070a(Bundle bundle, String str) {
        try {
            return bundle.get(str);
        } catch (Exception | OutOfMemoryError unused) {
            return null;
        }
    }

    /* renamed from: a */
    private String m45071a(String str, Boolean bool) {
        if (!bool.booleanValue() && this.f56453d == EnumC24916s.POST) {
            return str;
        }
        Uri.Builder buildUpon = Uri.parse(str).buildUpon();
        for (String str2 : this.f56459j.keySet()) {
            Object a = m45070a(this.f56459j, str2);
            if (a == null) {
                a = "";
            }
            if (m45084a(a)) {
                buildUpon.appendQueryParameter(str2, m45086b(a).toString());
            } else if (this.f56453d == EnumC24916s.GET) {
                throw new IllegalArgumentException(C1764a.m5929a(Locale.US, "Unsupported parameter type for GET request: %s", new Object[]{a.getClass().getSimpleName()}));
            }
        }
        return buildUpon.toString();
    }

    /* renamed from: a */
    public static List<C24915r> m45073a(HttpURLConnection httpURLConnection, C24912q qVar) {
        List<C24915r> a = C24915r.m47750a(httpURLConnection, qVar);
        C24693ad.m47256a(httpURLConnection);
        int size = qVar.size();
        if (size == a.size()) {
            m45079a(qVar, a);
            C24012b.m45437a().mo39535b();
            return a;
        }
        throw new C24798j(C1764a.m5929a(Locale.US, "Received %d responses while expecting %d", new Object[]{Integer.valueOf(a.size()), Integer.valueOf(size)}));
    }

    /* renamed from: a */
    public static GraphRequest m45067a(AccessToken accessToken, String str, JSONObject jSONObject, AbstractC23858b bVar) {
        GraphRequest graphRequest = new GraphRequest(accessToken, str, null, EnumC24916s.POST, bVar);
        graphRequest.f56455f = jSONObject;
        return graphRequest;
    }

    public GraphRequest(AccessToken accessToken, String str, Bundle bundle, EnumC24916s sVar, AbstractC23858b bVar) {
        this(accessToken, str, bundle, sVar, bVar, (byte) 0);
    }

    private GraphRequest(AccessToken accessToken, String str, Bundle bundle, EnumC24916s sVar, AbstractC23858b bVar, byte b) {
        this.f56458i = true;
        this.f56452c = accessToken;
        this.f56454e = str;
        this.f56462m = null;
        mo39348a(bVar);
        if (this.f56464q == null || sVar == EnumC24916s.GET) {
            this.f56453d = sVar == null ? EnumC24916s.GET : sVar;
            if (bundle != null) {
                this.f56459j = new Bundle(bundle);
            } else {
                this.f56459j = new Bundle();
            }
            if (this.f56462m == null) {
                this.f56462m = C24872m.m47693e();
                return;
            }
            return;
        }
        throw new C24798j("Can't change HTTP method on request with overridden URL.");
    }
}
