package com.bytedance.geckox.p1012b;

import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.geckox.model.CleanPolicyModel;
import com.bytedance.geckox.p1019f.AbstractC14933a;
import com.bytedance.geckox.p1022i.C14957a;
import com.bytedance.geckox.p1023j.C14959a;
import com.bytedance.geckox.p1023j.C14960b;
import com.bytedance.geckox.statistic.C15035c;
import com.bytedance.geckox.statistic.model.C15040b;
import com.bytedance.geckox.utils.C15052e;
import com.bytedance.geckox.utils.C15064m;
import com.bytedance.geckox.utils.ExecutorC15055g;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.geckox.b.a */
public final class C14874a {
    static {
        Covode.recordClassIndex(16985);
    }

    /* renamed from: a */
    public static void m27316a(final int i, Map<String, CleanPolicyModel> map, Map<String, String> map2, final AbstractC14933a aVar) {
        CleanPolicyModel value;
        List<Long> b;
        List<Long> b2;
        ConcurrentHashMap<String, C14959a> concurrentHashMap;
        MethodCollector.m26663i(2335);
        if (map == null || map.isEmpty()) {
            MethodCollector.m26664o(2335);
            return;
        }
        try {
            final ArrayList arrayList = new ArrayList();
            for (Map.Entry<String, CleanPolicyModel> entry : map.entrySet()) {
                String key = entry.getKey();
                String str = map2.get(key);
                if (!TextUtils.isEmpty(str)) {
                    File file = new File(str, key);
                    if (file.isDirectory() && (value = entry.getValue()) != null && value.specifiedClean != null && !value.specifiedClean.isEmpty()) {
                        for (CleanPolicyModel.C14974a aVar2 : value.specifiedClean) {
                            String str2 = aVar2.f36572a;
                            int i2 = aVar2.f36573b;
                            List<Long> list = aVar2.f36574c;
                            File file2 = new File(file, str2);
                            if (i2 != 1) {
                                if (i2 != 2) {
                                    if (i2 == 3) {
                                        File file3 = new File(file, str2);
                                        File file4 = new File(file, str2 + "--pending-delete");
                                        file3.renameTo(file4);
                                        arrayList.add(new C14876a(key, str2, 3, 0, file4));
                                        C89219l.m154719c(key, "");
                                        C89219l.m154719c(str2, "");
                                        if (C14960b.f36545d && (concurrentHashMap = C14960b.f36542a.get(key)) != null) {
                                            concurrentHashMap.remove(str2);
                                            C14960b.f36544c.put(key, true);
                                        }
                                    }
                                } else if (!(list == null || (b2 = C15064m.m27739b(file2)) == null || b2.isEmpty())) {
                                    for (Long l : b2) {
                                        if (list.get(0).longValue() > l.longValue()) {
                                            File file5 = new File(file2, l + "--pending-delete");
                                            new File(file2, String.valueOf(l)).renameTo(file5);
                                            arrayList.add(new C14876a(key, str2, 2, l.longValue(), file5));
                                        }
                                    }
                                }
                            } else if (!(list == null || (b = C15064m.m27739b(file2)) == null || b.isEmpty())) {
                                for (Long l2 : b) {
                                    if (list.contains(l2)) {
                                        File file6 = new File(file2, l2 + "--pending-delete");
                                        new File(file2, String.valueOf(l2)).renameTo(file6);
                                        arrayList.add(new C14876a(key, str2, 1, l2.longValue(), file6));
                                    }
                                }
                            }
                        }
                    }
                }
            }
            ExecutorC15055g.m27720a().execute(new Runnable() {
                /* class com.bytedance.geckox.p1012b.C14874a.RunnableC148751 */

                static {
                    Covode.recordClassIndex(16986);
                }

                public final void run() {
                    try {
                        int i = i;
                        List<C14876a> list = arrayList;
                        AbstractC14933a aVar = aVar;
                        if (list == null) {
                            return;
                        }
                        if (!list.isEmpty()) {
                            for (C14876a aVar2 : list) {
                                File file = aVar2.f36346e;
                                long uptimeMillis = SystemClock.uptimeMillis();
                                boolean a = C15052e.m27712a(file);
                                long uptimeMillis2 = SystemClock.uptimeMillis();
                                int i2 = 200;
                                if (!a) {
                                    i2 = 201;
                                }
                                C15035c.m27682a(new C15040b(aVar2.f36342a, aVar2.f36343b, aVar2.f36344c, i2, aVar2.f36345d, uptimeMillis2 - uptimeMillis, i));
                            }
                        }
                    } catch (Exception unused) {
                        C14957a.m27542a();
                    }
                }
            });
            MethodCollector.m26664o(2335);
        } catch (Exception e) {
            e.printStackTrace();
            MethodCollector.m26664o(2335);
        }
    }

    /* renamed from: com.bytedance.geckox.b.a$a */
    static class C14876a {

        /* renamed from: a */
        String f36342a;

        /* renamed from: b */
        String f36343b;

        /* renamed from: c */
        int f36344c;

        /* renamed from: d */
        long f36345d;

        /* renamed from: e */
        File f36346e;

        static {
            Covode.recordClassIndex(16987);
        }

        C14876a(String str, String str2, int i, long j, File file) {
            this.f36342a = str;
            this.f36343b = str2;
            this.f36344c = i;
            this.f36345d = j;
            this.f36346e = file;
        }
    }
}
