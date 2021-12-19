package com.bytedance.helios.sdk;

import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.p1095c.C15391f;
import com.bytedance.helios.sdk.p1097d.AbstractC15395b;
import com.bytedance.helios.sdk.p1097d.C15397d;
import com.bytedance.helios.sdk.p1099f.p1101b.C15443a;
import com.bytedance.helios.sdk.p1105g.C15475b;
import com.bytedance.helios.sdk.utils.C15484f;
import com.bytedance.helios.sdk.utils.C15488i;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import p4600h.C89388w;
import p4600h.p4601a.C89064i;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.helios.sdk.a */
public final class C15346a {

    /* renamed from: a */
    public static final C15346a f37424a = new C15346a();

    /* renamed from: b */
    private static final HashSet<String> f37425b = new HashSet<>();

    /* renamed from: c */
    private static final ArrayList<Integer> f37426c = C89070n.m154525d(102701, 102700, 102800, 102801);

    private C15346a() {
    }

    /* renamed from: a */
    private static boolean m28245a(int i) {
        return (HeliosEnvImpl.INSTANCE.isEnabled() && C15475b.m28470a(i)) || f37426c.contains(Integer.valueOf(i));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.helios.sdk.a$a */
    public static final class RunnableC15347a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ int f37427a;

        /* renamed from: b */
        final /* synthetic */ Object f37428b;

        /* renamed from: c */
        final /* synthetic */ Object f37429c;

        /* renamed from: d */
        final /* synthetic */ Object[] f37430d;

        /* renamed from: e */
        final /* synthetic */ long f37431e;

        /* renamed from: f */
        final /* synthetic */ boolean f37432f;

        /* renamed from: g */
        final /* synthetic */ String f37433g;

        static {
            Covode.recordClassIndex(17598);
        }

        RunnableC15347a(int i, Object obj, Object obj2, Object[] objArr, long j, boolean z, String str) {
            this.f37427a = i;
            this.f37428b = obj;
            this.f37429c = obj2;
            this.f37430d = objArr;
            this.f37431e = j;
            this.f37432f = z;
            this.f37433g = str;
        }

        public final void run() {
            AbstractC15395b a = C15427e.m28377a(this.f37427a);
            if (a != null) {
                a.mo25136a(this.f37428b, this.f37429c, this.f37430d, this.f37427a, this.f37431e, this.f37432f, this.f37433g);
            }
        }
    }

    static {
        Covode.recordClassIndex(17597);
    }

    /* renamed from: a */
    private static Integer m28239a(Integer num) {
        if (num == null) {
            return num;
        }
        if (num.intValue() == 100106) {
            return 100101;
        }
        if (num.intValue() == 100205) {
            return 100201;
        }
        if (num.intValue() == 100404) {
            return 100401;
        }
        if (num.intValue() == 100405) {
            return 100403;
        }
        return num;
    }

    /* renamed from: a */
    private static void m28244a(String str, Runnable runnable) {
        if (str != null && str.length() != 0) {
            HashSet<String> hashSet = f37425b;
            if (!hashSet.contains(str)) {
                hashSet.add(str);
                runnable.run();
                hashSet.remove(str);
            }
        }
    }

    /* renamed from: a */
    public static final void m28242a(Object obj, Object obj2, Object[] objArr, String str) {
        String name;
        Integer num;
        Method method = (Method) obj2;
        if (method != null) {
            Class<?> declaringClass = method.getDeclaringClass();
            C89219l.m154709a((Object) declaringClass, "");
            String name2 = declaringClass.getName();
            if (name2 != null && name2.length() != 0 && (name = method.getName()) != null && name.length() != 0) {
                long currentTimeMillis = System.currentTimeMillis();
                String str2 = name2 + '.' + name;
                HashMap<String, Integer> hashMap = C15488i.f37745a;
                if (hashMap != null) {
                    num = hashMap.get(str2);
                } else {
                    num = null;
                }
                Integer a = m28239a(num);
                if (a != null) {
                    int intValue = a.intValue();
                    C15484f.m28491a("Helios-Log-Monitor-Ability-Api-Call", "actionInvokeReflection id=" + intValue + " calledTime=" + currentTimeMillis + " proxyMethodKey=" + str, (String) null, 12);
                    if (!m28245a(intValue)) {
                        C15484f.m28491a("Helios-Log-Monitor-Ability-Api-Call", "triggerAction: not enabled, return id=" + intValue + " calledTime=" + currentTimeMillis, (String) null, 12);
                        return;
                    }
                    Class<?> cls = objArr[0];
                    if (cls == null) {
                        cls = method.getDeclaringClass();
                    }
                    m28241a(obj, cls, C89064i.m154469a(objArr, 2), intValue, str, currentTimeMillis, true);
                }
                C15391f.m28291a("actionInvokeReflection", currentTimeMillis);
            }
        }
    }

    /* renamed from: a */
    public static final void m28243a(Object obj, Object[] objArr, int i, String str) {
        long currentTimeMillis = System.currentTimeMillis();
        if (!m28245a(i)) {
            C15484f.m28491a("Helios-Log-Monitor-Ability-Api-Call", "triggerAction: not enabled, return id=" + i + " calledTime=" + currentTimeMillis, (String) null, 12);
            return;
        }
        C15484f.m28491a("Helios-Log-Monitor-Ability-Api-Call", "actionInvokeInsert id=" + i + " calledTime=" + currentTimeMillis + " proxyMethodKey=" + str, (String) null, 12);
        m28241a((Object) null, obj, objArr, i, str, currentTimeMillis, false);
        C15391f.m28291a("actionInvokeInsert", currentTimeMillis);
    }

    /* renamed from: a */
    public static final void m28240a(Object obj, Object obj2, Object[] objArr, int i, String str) {
        long currentTimeMillis = System.currentTimeMillis();
        if (!m28245a(i)) {
            C15484f.m28491a("Helios-Log-Monitor-Ability-Api-Call", "triggerAction: not enabled, return id=" + i + " calledTime=" + currentTimeMillis, (String) null, 12);
            return;
        }
        C15484f.m28491a("Helios-Log-Monitor-Ability-Api-Call", "actionInvoke id=" + i + " calledTime=" + currentTimeMillis + " proxyMethodKey=" + str, (String) null, 12);
        m28241a(obj, obj2, objArr, i, str, currentTimeMillis, false);
        C15391f.m28291a("actionInvoke", currentTimeMillis);
    }

    /* renamed from: a */
    public static final Pair<Boolean, Object> m28238a(Object obj, Object[] objArr, int i, String str, boolean z, String str2) {
        if (!HeliosEnvImpl.INSTANCE.isEnabled()) {
            return new Pair<>(false, null);
        }
        long currentTimeMillis = System.currentTimeMillis();
        long currentTimeMillis2 = System.currentTimeMillis();
        Pair<Boolean, Object> a = m28237a(obj, objArr, i, str, z, currentTimeMillis, str2);
        C15391f.m28291a("actionIntercept", currentTimeMillis2);
        return a;
    }

    /* renamed from: a */
    private static void m28241a(Object obj, Object obj2, Object[] objArr, int i, String str, long j, boolean z) {
        m28244a(str, new RunnableC15347a(i, obj, obj2, objArr, j, z, str));
    }

    /* renamed from: a */
    private static Pair<Boolean, Object> m28237a(Object obj, Object[] objArr, int i, String str, boolean z, long j, String str2) {
        Integer num;
        Object[] objArr2;
        if (!z) {
            return C15443a.m28402a(new C15397d(obj, objArr, i, j, false, str, (String) null, (String) null, 384));
        }
        StringBuilder sb = new StringBuilder();
        if (obj != null) {
            Method method = (Method) obj;
            Class<?> declaringClass = method.getDeclaringClass();
            String str3 = "";
            C89219l.m154709a((Object) declaringClass, str3);
            String sb2 = sb.append(declaringClass.getName()).append('.').append(method.getName()).toString();
            HashMap<String, Integer> hashMap = C15488i.f37745a;
            Class<?> cls = null;
            if (hashMap != null) {
                num = hashMap.get(sb2);
            } else {
                num = null;
            }
            Integer a = m28239a(num);
            if (a == null) {
                return new Pair<>(false, null);
            }
            int intValue = a.intValue();
            if (objArr == null || objArr.length == 0) {
                objArr2 = null;
            } else {
                cls = objArr[0];
                if (cls == null) {
                    cls = method.getDeclaringClass();
                }
                objArr2 = C89064i.m154469a(objArr, objArr.length);
            }
            Class<?> returnType = method.getReturnType();
            C89219l.m154709a((Object) returnType, str3);
            String canonicalName = returnType.getCanonicalName();
            if (str2 != null) {
                str3 = str2;
            }
            return C15443a.m28402a(new C15397d(cls, objArr2, intValue, j, z, canonicalName, str3, (String) null, 256));
        }
        throw new C89388w("null cannot be cast to non-null type");
    }
}
