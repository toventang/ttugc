package com.p2082ss.android.ugc.aweme.net;

import android.content.Context;
import com.bytedance.common.utility.collection.C13603b;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.common.applog.C29803q;
import com.p2082ss.android.http.p2146a.p2149b.C29934d;
import com.p2082ss.android.p2085a.p2086a.p2087a.C29339a;
import com.p2082ss.android.ugc.aweme.app.api.Api;
import com.p2082ss.android.ugc.aweme.app.api.p2319b.C33615a;
import com.p2082ss.android.ugc.aweme.services.RetrofitService;
import com.p2082ss.android.ugc.trill.R;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.net.b */
public class C61305b<T> {

    /* renamed from: h */
    public static final String f139223h = C61305b.class.getSimpleName();

    /* renamed from: i */
    static final CommonApi f139224i = ((CommonApi) RetrofitService.createIRetrofitServicebyMonsterPlugin(false).createNewRetrofit(Api.f79771d).create(CommonApi.class));

    /* renamed from: a */
    public AbstractC61331d<T> f139225a;

    /* renamed from: b */
    public String f139226b;

    /* renamed from: c */
    EnumC61379i f139227c;

    /* renamed from: d */
    List<C29934d> f139228d;

    /* renamed from: e */
    Class<T> f139229e;

    /* renamed from: f */
    String f139230f;

    /* renamed from: g */
    public boolean f139231g;

    static {
        Covode.recordClassIndex(71935);
    }

    /* renamed from: a */
    public final void mo98934a(final Context context) {
        C29339a.m58752a(new Runnable() {
            /* class com.p2082ss.android.ugc.aweme.net.C61305b.RunnableC613061 */

            static {
                Covode.recordClassIndex(71936);
            }

            public final void run() {
                Object a;
                try {
                    EnumC61379i iVar = C61305b.this.f139227c;
                    String str = C61305b.this.f139226b;
                    List<C29934d> list = C61305b.this.f139228d;
                    String str2 = C61305b.this.f139230f;
                    Class<T> cls = C61305b.this.f139229e;
                    HashMap hashMap = new HashMap();
                    if (!C13603b.m24435a((Collection) list)) {
                        for (C29934d dVar : list) {
                            hashMap.put(dVar.f71419a, dVar.f71420b);
                        }
                    }
                    if (iVar == EnumC61379i.POST) {
                        C29803q.m60037b(hashMap, true);
                        T t = C61305b.f139224i.doPost(str, hashMap).execute().f52262b;
                        if (String.class.equals(cls)) {
                            a = Api.m68815a(t, Api.C33600d.f79780a, str2, str);
                        } else {
                            a = Api.m68815a(t, new Api.C33598b(cls), str2, str);
                        }
                    } else if (iVar == EnumC61379i.GET) {
                        T t2 = C61305b.f139224i.doGet(str, hashMap).execute().f52262b;
                        if (String.class.equals(cls)) {
                            a = Api.m68815a(t2, Api.C33600d.f79780a, str2, str);
                        } else {
                            a = Api.m68815a(t2, new Api.C33598b(cls), str2, str);
                        }
                    } else {
                        throw new IllegalStateException("Unsupport http type !");
                    }
                    if (C61305b.this.f139225a != null) {
                        C29339a.m58754b(new RunnableC61310c(this, a));
                    }
                } catch (Exception e) {
                    if (C61305b.this.f139225a != null) {
                        C29339a.m58754b(new Runnable() {
                            /* class com.p2082ss.android.ugc.aweme.net.C61305b.RunnableC613061.RunnableC613071 */

                            static {
                                Covode.recordClassIndex(71937);
                            }

                            public final void run() {
                                if (C61305b.this.f139231g) {
                                    C33615a.m68848a(context, (Throwable) e, (int) R.string.g1i);
                                }
                                C61305b.this.f139225a.mo60109a(e);
                            }
                        });
                    } else {
                        C33615a.m68848a(context, (Throwable) e, (int) R.string.g1i);
                    }
                }
            }
        });
    }

    public C61305b(String str, EnumC61379i iVar, Class<T> cls) {
        this(str, iVar, "", cls);
    }

    private C61305b(String str, EnumC61379i iVar, String str2, Class<T> cls) {
        this(str, iVar, null, str2, cls);
    }

    public C61305b(String str, EnumC61379i iVar, List<C29934d> list, Class<T> cls) {
        this(str, iVar, list, null, cls);
    }

    private C61305b(String str, EnumC61379i iVar, List<C29934d> list, String str2, Class<T> cls) {
        this.f139231g = true;
        this.f139226b = str;
        this.f139227c = iVar;
        this.f139228d = list;
        this.f139229e = cls;
        this.f139230f = str2;
    }
}
