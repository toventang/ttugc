package com.p2082ss.android.ugc.aweme.property;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.google.gson.C28022o;
import com.google.gson.C28025r;
import com.p2082ss.android.ugc.aweme.p2387bf.C34822d;
import com.p2082ss.android.ugc.aweme.p2690cr.p2697d.C40346b;
import com.p2082ss.android.ugc.aweme.property.C65406cr;
import com.p2082ss.android.vesdk.C85568t;
import java.util.HashMap;
import java.util.Map;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89376n;
import p4600h.C89378p;
import p4600h.C89387v;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.property.eo */
public final class C65460eo {

    /* renamed from: a */
    public final C65406cr f147643a;

    /* renamed from: b */
    private final AbstractC89244h f147644b;

    static {
        Covode.recordClassIndex(76947);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final C65406cr mo104599a() {
        return (C65406cr) this.f147644b.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.property.eo$a */
    public static final class C65461a implements C65406cr.AbstractC65407a {

        /* renamed from: a */
        final /* synthetic */ String f147645a;

        /* renamed from: b */
        final /* synthetic */ C85568t.C85573d f147646b;

        static {
            Covode.recordClassIndex(76948);
        }

        @Override // com.p2082ss.android.ugc.aweme.property.C65406cr.AbstractC65407a
        /* renamed from: a */
        public final String mo104593a() {
            return this.f147645a;
        }

        @Override // com.p2082ss.android.ugc.aweme.property.C65406cr.AbstractC65407a
        /* renamed from: c */
        public final Object mo104595c() {
            Object obj = this.f147646b.f191742b;
            C89219l.m154716b(obj, "");
            return obj;
        }

        @Override // com.p2082ss.android.ugc.aweme.property.C65406cr.AbstractC65407a
        /* renamed from: b */
        public final C65406cr.EnumC65408b mo104594b() {
            C85568t.EnumC85572c cVar = this.f147646b.f191741a;
            if (cVar != null) {
                int i = C65463ep.f147648a[cVar.ordinal()];
                if (i == 1) {
                    return C65406cr.EnumC65408b.Long;
                }
                if (i == 2) {
                    return C65406cr.EnumC65408b.Boolean;
                }
                if (i == 3) {
                    return C65406cr.EnumC65408b.Float;
                }
                if (i == 4) {
                    return C65406cr.EnumC65408b.Integer;
                }
                if (i == 5) {
                    return C65406cr.EnumC65408b.String;
                }
            }
            return C65406cr.EnumC65408b.String;
        }

        C65461a(String str, C85568t.C85573d dVar) {
            this.f147645a = str;
            this.f147646b = dVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.property.eo$b */
    static final class C65462b extends AbstractC89220m implements AbstractC89171a<C65406cr> {

        /* renamed from: a */
        final /* synthetic */ Context f147647a;

        static {
            Covode.recordClassIndex(76949);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C65462b(Context context) {
            super(0);
            this.f147647a = context;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C65406cr invoke() {
            return new C65406cr(C34822d.m71158a(this.f147647a, "av_ab_vesdk_panel.xml", 0));
        }
    }

    /* renamed from: b */
    public static Map<String, C65406cr.AbstractC65407a> m117186b() {
        HashMap hashMap = new HashMap();
        C85568t a = C85568t.m147473a();
        C89219l.m154716b(a, "");
        Map<String, C85568t.C85573d> map = a.f191736a;
        C89219l.m154716b(map, "");
        for (Map.Entry<String, C85568t.C85573d> entry : map.entrySet()) {
            if (entry.getValue() != null && !TextUtils.isEmpty(entry.getKey())) {
                String key = entry.getKey();
                C89219l.m154716b(key, "");
                String key2 = entry.getKey();
                C89219l.m154716b(key2, "");
                C85568t.C85573d value = entry.getValue();
                C89219l.m154716b(value, "");
                hashMap.put(key, m117182a(key2, value));
            }
        }
        return hashMap;
    }

    public C65460eo(Context context) {
        C89219l.m154721d(context, "");
        this.f147644b = C89250i.m154773a((AbstractC89171a) new C65462b(context));
        this.f147643a = new C65406cr(C34822d.m71158a(context, "av_ab_vesdk.xml", 0));
    }

    /* renamed from: a */
    public final C89378p<Object, Integer> mo104600a(C65406cr.AbstractC65407a aVar) {
        int i;
        C89219l.m154721d(aVar, "");
        C40346b.m81527b();
        Object a = m117183a(this.f147643a, aVar);
        if (this.f147643a.mo104591f(aVar)) {
            i = 1;
        } else {
            i = 2;
        }
        return C89387v.m154943a(a, Integer.valueOf(i));
    }

    /* renamed from: a */
    public static C65406cr.AbstractC65407a m117182a(String str, C85568t.C85573d dVar) {
        return new C65461a(str, dVar);
    }

    /* renamed from: a */
    private static Object m117183a(C65406cr crVar, C65406cr.AbstractC65407a aVar) {
        Object valueOf;
        C65406cr.EnumC65408b b = aVar.mo104594b();
        if (b != null) {
            int i = C65463ep.f147650c[b.ordinal()];
            if (i == 1) {
                valueOf = Boolean.valueOf(crVar.mo104586a(aVar));
            } else if (i == 2) {
                valueOf = Integer.valueOf(crVar.mo104587b(aVar));
            } else if (i == 3) {
                valueOf = Long.valueOf(crVar.mo104588c(aVar));
            } else if (i == 4) {
                valueOf = Float.valueOf(crVar.mo104589d(aVar));
            } else if (i == 5) {
                valueOf = crVar.mo104590e(aVar);
            }
            C89219l.m154716b(valueOf, "");
            return valueOf;
        }
        throw new C89376n();
    }

    /* renamed from: a */
    public static String m117184a(C28022o oVar, String str) {
        try {
            C28025r d = oVar.mo46804d(str);
            if (d == null) {
                return "";
            }
            String c = d.mo46689c();
            C89219l.m154716b(c, "");
            return c;
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    /* renamed from: a */
    public static float m117179a(C28022o oVar, String str, float f) {
        try {
            C28025r d = oVar.mo46804d(str);
            if (d != null) {
                return d.mo46691e();
            }
            return f;
        } catch (Exception e) {
            e.printStackTrace();
            return f;
        }
    }

    /* renamed from: a */
    public static long m117181a(C28022o oVar, String str, long j) {
        try {
            C28025r d = oVar.mo46804d(str);
            if (d != null) {
                return d.mo46693f();
            }
            return j;
        } catch (Exception e) {
            e.printStackTrace();
            return j;
        }
    }

    /* renamed from: a */
    public static int m117180a(C28022o oVar, String str, int i) {
        try {
            C28025r d = oVar.mo46804d(str);
            if (d == null) {
                return i;
            }
            if (!(d.f65806a instanceof Boolean)) {
                return d.mo46694g();
            }
            if (d.mo46695h()) {
                return 1;
            }
            return 0;
        } catch (Exception e) {
            e.printStackTrace();
            return i;
        }
    }

    /* renamed from: a */
    public static boolean m117185a(C28022o oVar, String str, boolean z) {
        try {
            C28025r d = oVar.mo46804d(str);
            if (d == null) {
                return z;
            }
            if (!(d.f65806a instanceof Number)) {
                return d.mo46695h();
            }
            if (d.mo46688b().intValue() == 1) {
                return true;
            }
            return false;
        } catch (Exception e) {
            e.printStackTrace();
            return z;
        }
    }
}
