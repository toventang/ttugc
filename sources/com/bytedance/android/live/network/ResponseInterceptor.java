package com.bytedance.android.live.network;

import android.net.Uri;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.android.live.C4139e;
import com.bytedance.android.live.core.p213c.C3854a;
import com.bytedance.android.live.core.p214d.C3868c;
import com.bytedance.android.live.core.p215e.p216a.C3881a;
import com.bytedance.android.live.core.p215e.p216a.C3882b;
import com.bytedance.android.live.core.p215e.p216a.C3883c;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.live.network.C5816m;
import com.bytedance.android.live.network.model.C5819a;
import com.bytedance.android.live.network.model.C5820b;
import com.bytedance.android.live.network.p380a.AbstractC5796a;
import com.bytedance.android.live.network.p382c.C5803a;
import com.bytedance.android.live.network.response.C5827a;
import com.bytedance.android.live.network.response.C5830b;
import com.bytedance.android.live.network.response.C5831c;
import com.bytedance.android.live.network.response.C5832d;
import com.bytedance.android.live.network.response.C5833e;
import com.bytedance.android.live.network.response.RequestError;
import com.bytedance.android.live.p172a.p173a.p174a.C2910b;
import com.bytedance.android.live.p172a.p173a.p174a.C2911c;
import com.bytedance.android.live.p172a.p173a.p175b.C2912a;
import com.bytedance.android.livesdk.livesetting.message.LiveMtPbRequestsSetting;
import com.bytedance.android.livesdk.model.Extra;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.common.utility.C13627m;
import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.C22099u;
import com.bytedance.retrofit2.client.C22027b;
import com.bytedance.retrofit2.client.C22028c;
import com.bytedance.retrofit2.client.Request;
import com.bytedance.retrofit2.p1612c.AbstractC22021a;
import com.p2082ss.android.ugc.aweme.p2404bs.C34932b;
import com.p2082ss.android.ugc.trill.R;
import java.util.LinkedList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* access modifiers changed from: package-private */
public class ResponseInterceptor implements AbstractC22021a {
    static {
        Covode.recordClassIndex(6394);
    }

    ResponseInterceptor() {
    }

    /* renamed from: a */
    private static JSONObject m12698a(String str) {
        try {
            return new JSONObject(str);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: a */
    private C22099u m12695a(AbstractC22021a.AbstractC22022a aVar) {
        Request a = m12694a(aVar.mo35809a());
        C22099u a2 = aVar.mo35810a(a);
        m12699a(a, a2);
        return a2;
    }

    /* renamed from: a */
    private static String m12696a(C22099u uVar) {
        List<C22027b> b = uVar.f52261a.mo35846b("X-Tt-Logid");
        if (b == null || b.size() <= 0) {
            return "";
        }
        return b.get(0).f52038b;
    }

    /* renamed from: a */
    private static Request m12694a(Request request) {
        if (!LiveMtPbRequestsSetting.INSTANCE.getValue().isEnable()) {
            return request;
        }
        C89219l.m154721d(request, "");
        AbstractC5796a.EnumC5797a remove = C5816m.f14669b.remove(C5816m.C5817a.m12754a(request));
        if (remove == null || !C5816m.C5817a.m12755a().optBoolean(remove.key, false)) {
            return request;
        }
        LinkedList linkedList = new LinkedList(request.getHeaders());
        linkedList.add(new C22027b("response-format", "protobuf"));
        Request.C22024a newBuilder = request.newBuilder();
        newBuilder.f52025c = linkedList;
        return newBuilder.mo35840a();
    }

    @Override // com.bytedance.retrofit2.p1612c.AbstractC22021a
    public C22099u intercept(AbstractC22021a.AbstractC22022a aVar) {
        if (!(aVar.mo35812c() instanceof C34932b)) {
            return m12695a(aVar);
        }
        C34932b bVar = (C34932b) aVar.mo35812c();
        if (bVar.f82415W > 0) {
            long uptimeMillis = SystemClock.uptimeMillis() - bVar.f82415W;
            bVar.mo61814a(bVar.f82417Y, uptimeMillis);
            bVar.mo61815b(bVar.f82417Y, uptimeMillis);
        }
        bVar.mo61813a(getClass().getSimpleName());
        bVar.f82415W = SystemClock.uptimeMillis();
        C22099u a = m12695a(aVar);
        if (bVar.f82416X > 0) {
            long uptimeMillis2 = SystemClock.uptimeMillis() - bVar.f82416X;
            String simpleName = getClass().getSimpleName();
            bVar.mo61814a(simpleName, uptimeMillis2);
            bVar.mo61816c(simpleName, uptimeMillis2);
        }
        bVar.f82416X = SystemClock.uptimeMillis();
        return a;
    }

    /* renamed from: a */
    private static String m12697a(String str, JSONObject jSONObject) {
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("tag", str);
            jSONObject2.put("data", jSONObject.toString());
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jSONObject2.toString();
    }

    /* renamed from: a */
    private static void m12699a(Request request, C22099u uVar) {
        C22028c cVar;
        int i;
        int optInt;
        String str;
        if (!(uVar == null || request == null || (cVar = uVar.f52261a) == null || (i = cVar.f52040b) != 200)) {
            T t = uVar.f52262b;
            String url = request.getUrl();
            String a = C3966y.m9657a((int) R.string.gt_);
            if (t instanceof C5833e) {
                T t2 = t;
                optInt = t2.f14695a;
                if (t2.f14696b instanceof Room) {
                    a = t2.f14696b.message;
                }
            } else if (t instanceof C5832d) {
                optInt = ((C5832d) t).statusCode;
            } else if (t instanceof C5831c) {
                optInt = ((C5831c) t).f14683a;
            } else if (t instanceof C3883c) {
                C3882b bVar = t.f10738c;
                if (bVar != null) {
                    optInt = bVar.f10733a;
                    a = bVar.f10734b;
                }
            } else if (t instanceof C3881a) {
                C3882b bVar2 = t.f10732c;
                if (bVar2 != null) {
                    optInt = bVar2.f10733a;
                    a = bVar2.f10734b;
                }
            } else if (t instanceof C5827a) {
                optInt = t.f14683a;
            } else if (t instanceof C5830b) {
                optInt = t.statusCode;
            } else if (t instanceof String) {
                T t3 = t;
                if (TextUtils.isEmpty(t3)) {
                    JSONObject a2 = m12698a((String) t3);
                    if (a2 == null) {
                        optInt = -1;
                        a = "";
                    } else {
                        optInt = a2.optInt("status_code", -1);
                        a = a2.optString("message", "");
                    }
                }
            }
            if (optInt != 0) {
                try {
                    Uri parse = Uri.parse(url);
                    if (!(C5819a.f14675a == null || C5819a.f14675a.mo11596a() == null || !C5819a.f14675a.mo11596a().contains(parse.getPath()))) {
                    }
                } catch (Exception unused) {
                }
                List<C22027b> list = cVar.f52042d;
                if (list == null || list.isEmpty()) {
                    str = "";
                } else {
                    str = "";
                    for (C22027b bVar3 : list) {
                        if (bVar3 != null && "x-tt-Logid".equalsIgnoreCase(bVar3.f52037a)) {
                            str = bVar3.f52038b;
                        }
                    }
                }
                JSONObject jSONObject = new JSONObject();
                m12701a(jSONObject, "xLogId", str);
                m12700a(jSONObject, "code", i);
                m12700a(jSONObject, "status_code", optInt);
                m12701a(jSONObject, "url", url);
                m12701a(jSONObject, "message", a);
                m12701a(jSONObject, "classes", "com.bytedance.android.livesdk.network.ResponseInterceptor");
                C3854a.m9453a(3, "ttlive_net", m12697a("ttlive_net", jSONObject));
                JSONObject jSONObject2 = new JSONObject();
                m12701a(jSONObject2, "xLogId", str);
                m12700a(jSONObject2, "code", i);
                m12700a(jSONObject2, "status_code", optInt);
                try {
                    Uri parse2 = Uri.parse(url);
                    m12701a(jSONObject2, "host", parse2.getHost());
                    m12701a(jSONObject2, "path", parse2.getPath());
                } catch (Exception e) {
                    C3854a.m9459b(e.getMessage());
                }
                m12701a(jSONObject2, "message", a);
                C3868c.m9497b("ttlive_network_request_error", 1, jSONObject2);
            }
        }
        T t4 = uVar.f52262b;
        if (t4 instanceof C5833e) {
            T t5 = t4;
            if (t5.f14695a != 0) {
                if (t5.f14698d == null) {
                    t5.f14698d = new RequestError();
                }
                t5.f14698d.url = request.getUrl();
                t5.f14698d.message = t5.f14696b.message;
                t5.f14698d.prompts = t5.f14696b.prompts;
                C5803a.m12715a(t5.f14695a, t5.f14698d, C4139e.C4140a.f11575b.mo46674b(t5.f14697c), m12696a(uVar));
            }
        } else if (t4 instanceof C5832d) {
            T t6 = t4;
            if (((C5832d) t6).statusCode != 0) {
                if (((C5832d) t6).error == null) {
                    ((C5832d) t6).error = new RequestError();
                }
                ((C5832d) t6).error.url = request.getUrl();
                int i2 = ((C5832d) t6).statusCode;
                RequestError requestError = ((C5832d) t6).error;
                Extra extra = ((C5832d) t6).extra;
                String a3 = m12696a(uVar);
                Object obj = ((C5832d) t6).data;
                if (requestError == null) {
                    requestError = new RequestError();
                    requestError.prompts = C3966y.m9657a((int) R.string.gt_);
                }
                throw new C5820b(i2, requestError.url, a3).setErrorMsg(requestError.message).setPrompt(requestError.prompts).setAlert(requestError.alert).setExtra(C4139e.C4140a.f11575b.mo46674b(extra)).setData(obj);
            }
        } else if (t4 instanceof C5831c) {
            T t7 = t4;
            if (((C5831c) t7).f14683a != 0) {
                if (((C5831c) t7).f14686d == null) {
                    ((C5831c) t7).f14686d = new RequestError();
                }
                ((C5831c) t7).f14686d.url = request.getUrl();
                C5803a.m12714a(((C5831c) t7).f14683a, ((C5831c) t7).f14686d, ((C5831c) t7).f14685c, m12696a(uVar));
            }
        } else if (t4 instanceof C3883c) {
            T t8 = t4;
            if (!(TextUtils.equals(t8.f10737b, "success") || t8.f10738c == null)) {
                t8.f10738c.f10735c = request.getUrl();
                C5803a.m12713a(t8.f10738c.f10733a, t8.f10738c, m12696a(uVar));
            }
        } else if (t4 instanceof C3881a) {
            T t9 = t4;
            if (!(TextUtils.equals(t9.f10731b, "success") || t9.f10732c == null)) {
                t9.f10732c.f10735c = request.getUrl();
                C5803a.m12713a(t9.f10732c.f10733a, t9.f10732c, m12696a(uVar));
            }
        } else if (t4 instanceof C5827a) {
            T t10 = t4;
            if (t10.f14683a != 0) {
                if (t10.f14686d == null) {
                    t10.f14686d = new RequestError();
                }
                t10.f14686d.url = request.getUrl();
                C5803a.m12714a(t10.f14683a, t10.f14686d, t10.f14685c, m12696a(uVar));
            } else if (t10.f14684b == null) {
                throw new C2911c();
            }
        } else if (t4 instanceof C5830b) {
            T t11 = t4;
            if (t11.statusCode != 0) {
                if (t11.error == null) {
                    t11.error = new RequestError();
                }
                t11.error.url = request.getUrl();
                C5803a.m12714a(t11.statusCode, t11.error, t11.extra, m12696a(uVar));
            } else if (t11.data == null) {
                throw new C2911c(t11);
            }
        } else if (t4 instanceof String) {
            T t12 = t4;
            if (!C13627m.m24498a((String) t12)) {
                JSONObject jSONObject3 = new JSONObject((String) t12);
                if (!jSONObject3.has("data")) {
                    throw new C2911c();
                } else if (!jSONObject3.has("status_code") || jSONObject3.optInt("status_code") != 0) {
                    JSONObject optJSONObject = jSONObject3.optJSONObject("data");
                    throw new C2912a(jSONObject3.optInt("status_code")).setErrorMsg(optJSONObject.optString("message", "")).setPrompt(optJSONObject.optString("prompts", "")).setExtra(jSONObject3.optString("extra", "")).setAlert(optJSONObject.optString("alert", ""));
                }
            } else {
                throw new C2910b();
            }
        }
    }

    /* renamed from: a */
    private static void m12700a(JSONObject jSONObject, String str, int i) {
        try {
            jSONObject.put(str, i);
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    private static void m12701a(JSONObject jSONObject, String str, String str2) {
        try {
            jSONObject.put(str, str2);
        } catch (Exception unused) {
        }
    }
}
