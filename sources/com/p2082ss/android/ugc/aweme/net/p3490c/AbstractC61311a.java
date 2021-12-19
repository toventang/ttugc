package com.p2082ss.android.ugc.aweme.net.p3490c;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.common.utility.C13627m;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.baselib.network.http.C14731e;
import com.bytedance.ttnet.p1703d.C22940b;
import com.bytedance.ttnet.p1703d.C22944d;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.net.c.a */
public abstract class AbstractC61311a implements C14731e.AbstractC14740i<C22940b> {

    /* renamed from: a */
    protected Context f139250a;

    static {
        Covode.recordClassIndex(71941);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo98938a(long j, long j2, String str, String str2, String str3, C22940b bVar, Throwable th, JSONObject jSONObject);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo98939a(long j, long j2, String str, String str2, String str3, C22940b bVar, JSONObject jSONObject);

    /* renamed from: a */
    public abstract void mo98940a(C22940b bVar, JSONObject jSONObject);

    public AbstractC61311a(Context context) {
        C22940b.m43243b();
        this.f139250a = context;
    }

    /* renamed from: a */
    private static void m110986a(Throwable th, JSONObject jSONObject) {
        if (th != null) {
            try {
                String message = th.getMessage();
                if (!C13627m.m24498a(message)) {
                    int length = message.length();
                    int indexOf = message.indexOf("ErrorCode=");
                    if (indexOf != -1) {
                        StringBuilder sb = new StringBuilder();
                        for (int i = indexOf + 10; i < length; i++) {
                            char charAt = message.charAt(i);
                            if (!Character.isSpaceChar(charAt)) {
                                if (!(charAt == '-' || Character.isDigit(charAt))) {
                                    break;
                                }
                                sb.append(charAt);
                            }
                        }
                        if (sb.length() > 0) {
                            jSONObject.put("cronet_error_code", sb.toString());
                        }
                    }
                    int indexOf2 = message.indexOf("InternalErrorCode=");
                    if (indexOf2 != -1) {
                        StringBuilder sb2 = new StringBuilder();
                        for (int i2 = indexOf2 + 18; i2 < length; i2++) {
                            char charAt2 = message.charAt(i2);
                            if (!Character.isSpaceChar(charAt2)) {
                                if (!(charAt2 == '-' || Character.isDigit(charAt2))) {
                                    break;
                                }
                                sb2.append(charAt2);
                            }
                        }
                        if (sb2.length() > 0) {
                            jSONObject.put("cronet_internal_error_code", sb2.toString());
                        }
                    }
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [long, long, java.lang.String, java.lang.String, com.bytedance.frameworks.baselib.network.http.a] */
    @Override // com.bytedance.frameworks.baselib.network.http.C14731e.AbstractC14740i
    /* renamed from: a */
    public final /* synthetic */ void mo23740a(long j, long j2, String str, String str2, C22940b bVar) {
        C22940b bVar2 = bVar;
        try {
            String[] strArr = new String[1];
            JSONObject jSONObject = new JSONObject();
            if (str.contains("&config_retry=b")) {
                jSONObject.put("log_config_retry", 1);
            }
            if (TextUtils.isEmpty(strArr[0]) && bVar2 != null) {
                strArr[0] = bVar2.f35358a;
                if (bVar2.f35359b != null) {
                    if (((C22944d) bVar2.f35359b).f54237s > 0) {
                        jSONObject.put("index", ((C22944d) bVar2.f35359b).f54237s);
                    }
                    if (((C22944d) bVar2.f35359b).f54236r > 0) {
                        jSONObject.put("httpIndex", ((C22944d) bVar2.f35359b).f54236r);
                    }
                }
            }
            try {
                mo98940a(bVar2, jSONObject);
                mo98939a(j, j2, str, str2, strArr[0], bVar2, jSONObject);
            } catch (Throwable unused) {
            }
        } catch (Throwable unused2) {
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [long, long, java.lang.String, java.lang.String, com.bytedance.frameworks.baselib.network.http.a, java.lang.Throwable] */
    @Override // com.bytedance.frameworks.baselib.network.http.C14731e.AbstractC14740i
    /* renamed from: a */
    public final /* synthetic */ void mo23741a(long j, long j2, String str, String str2, C22940b bVar, Throwable th) {
        C22940b bVar2 = bVar;
        try {
            String[] strArr = new String[1];
            JSONObject jSONObject = new JSONObject();
            if (TextUtils.isEmpty(strArr[0]) && bVar2 != null) {
                strArr[0] = bVar2.f35358a;
                if (bVar2.f35359b != null) {
                    if (((C22944d) bVar2.f35359b).f54237s > 0) {
                        jSONObject.put("index", ((C22944d) bVar2.f35359b).f54237s);
                    }
                    if (((C22944d) bVar2.f35359b).f54236r > 0) {
                        jSONObject.put("httpIndex", ((C22944d) bVar2.f35359b).f54236r);
                    }
                }
            }
            m110986a(th, jSONObject);
            try {
                mo98940a(bVar2, jSONObject);
                mo98938a(j, j2, str, str2, strArr[0], bVar2, th, jSONObject);
            } catch (Throwable unused) {
            }
        } catch (Throwable unused2) {
        }
    }
}
