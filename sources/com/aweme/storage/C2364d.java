package com.aweme.storage;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.kakao.usermgmt.StringSet;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.aweme.storage.d */
public final class C2364d {

    /* renamed from: a */
    public static long f7189a;

    /* renamed from: b */
    public static long f7190b;

    /* renamed from: c */
    public static List<String> f7191c;

    static {
        Covode.recordClassIndex(2642);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.aweme.storage.d$a */
    public static class C2365a {

        /* renamed from: a */
        public long f7192a;

        /* renamed from: b */
        public List<C2365a> f7193b = new ArrayList();

        /* renamed from: c */
        private String f7194c;

        /* renamed from: d */
        private C2365a f7195d;

        /* renamed from: e */
        private String f7196e;

        static {
            Covode.recordClassIndex(2643);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final boolean mo6527a() {
            if (this.f7192a > C2364d.f7189a) {
                return true;
            }
            return false;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public final String mo6528b() {
            String str = this.f7196e;
            if (str != null) {
                return str;
            }
            if (this.f7195d == null) {
                this.f7196e = this.f7194c;
            } else {
                this.f7196e = this.f7195d.mo6528b() + File.separator + this.f7194c;
            }
            return this.f7196e;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public final JSONObject mo6529c() {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put(StringSet.name, this.f7194c);
                jSONObject.put("size", this.f7192a);
                List<C2365a> list = this.f7193b;
                if (list != null && list.size() > 0) {
                    JSONArray jSONArray = new JSONArray();
                    for (C2365a aVar : this.f7193b) {
                        if (aVar != null) {
                            jSONArray.put(aVar.mo6529c());
                        }
                    }
                    jSONObject.put("child", jSONArray);
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
            return jSONObject;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final void mo6526a(C2365a aVar) {
            this.f7193b.add(aVar);
        }

        /* renamed from: a */
        static C2365a m7195a(JSONObject jSONObject, C2365a aVar) {
            if (jSONObject == null) {
                return null;
            }
            try {
                String optString = jSONObject.optString(StringSet.name);
                long optLong = jSONObject.optLong("size", 0);
                if (optString == null) {
                    return null;
                }
                C2365a aVar2 = new C2365a(optString, optLong, aVar);
                if (aVar != null) {
                    aVar.mo6526a(aVar2);
                }
                JSONArray optJSONArray = jSONObject.optJSONArray("child");
                if (optJSONArray != null && optJSONArray.length() > 0) {
                    for (int i = 0; i < optJSONArray.length(); i++) {
                        JSONObject jSONObject2 = optJSONArray.getJSONObject(i);
                        if (jSONObject2 != null) {
                            m7195a(jSONObject2, aVar2);
                        }
                    }
                }
                return aVar2;
            } catch (Exception e) {
                e.printStackTrace();
                return null;
            }
        }

        C2365a(String str, long j, C2365a aVar) {
            this.f7194c = str;
            this.f7192a = j;
            this.f7195d = aVar;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.aweme.storage.d$b */
    public enum EnumC2366b {
        p,
        e;

        static {
            Covode.recordClassIndex(2644);
        }
    }

    /* renamed from: a */
    static C2365a m7193a(String str) {
        Throwable th;
        FileInputStream fileInputStream;
        FileNotFoundException e;
        IOException e2;
        Exception e3;
        MethodCollector.m26663i(1747);
        File file = new File(str);
        FileInputStream fileInputStream2 = null;
        if (!file.exists()) {
            MethodCollector.m26664o(1747);
            return null;
        }
        try {
            fileInputStream = new FileInputStream(file);
            try {
                byte[] bArr = new byte[fileInputStream.available()];
                fileInputStream.read(bArr);
                C2365a a = C2365a.m7195a(new JSONObject(new String(bArr, "utf-8")), null);
                try {
                    fileInputStream.close();
                } catch (Exception e4) {
                    e4.printStackTrace();
                }
                MethodCollector.m26664o(1747);
                return a;
            } catch (FileNotFoundException e5) {
                e = e5;
                e.printStackTrace();
                fileInputStream.close();
                MethodCollector.m26664o(1747);
                return null;
            } catch (IOException e6) {
                e2 = e6;
                e2.printStackTrace();
                fileInputStream.close();
                MethodCollector.m26664o(1747);
                return null;
            } catch (Exception e7) {
                e3 = e7;
                try {
                    e3.printStackTrace();
                    try {
                        fileInputStream.close();
                    } catch (Exception e8) {
                        e8.printStackTrace();
                    }
                    MethodCollector.m26664o(1747);
                    return null;
                } catch (Throwable th2) {
                    th = th2;
                    fileInputStream2 = fileInputStream;
                    try {
                        fileInputStream2.close();
                    } catch (Exception e9) {
                        e9.printStackTrace();
                    }
                    MethodCollector.m26664o(1747);
                    throw th;
                }
            }
        } catch (FileNotFoundException e10) {
            e = e10;
            fileInputStream = null;
            e.printStackTrace();
            fileInputStream.close();
            MethodCollector.m26664o(1747);
            return null;
        } catch (IOException e11) {
            e2 = e11;
            fileInputStream = null;
            e2.printStackTrace();
            fileInputStream.close();
            MethodCollector.m26664o(1747);
            return null;
        } catch (Exception e12) {
            e3 = e12;
            fileInputStream = null;
            e3.printStackTrace();
            fileInputStream.close();
            MethodCollector.m26664o(1747);
            return null;
        } catch (Throwable th3) {
            th = th3;
            fileInputStream2.close();
            MethodCollector.m26664o(1747);
            throw th;
        }
    }

    /* renamed from: a */
    static C2365a m7192a(File file, C2365a aVar, EnumC2366b bVar) {
        List<String> list;
        String name;
        File[] listFiles;
        if (file == null || !file.exists()) {
            return null;
        }
        if (file.isFile() || ((list = f7191c) != null && list.contains(file.getName()))) {
            return null;
        }
        if (aVar == null) {
            name = bVar.name();
        } else {
            name = file.getName();
        }
        C2365a aVar2 = new C2365a(name, C2367e.m7201a(file), aVar);
        if (aVar != null) {
            aVar.mo6526a(aVar2);
        }
        if (file.isFile()) {
            return null;
        }
        if (file.isDirectory() && (listFiles = file.listFiles()) != null && listFiles.length > 0) {
            for (File file2 : listFiles) {
                m7192a(file2, aVar2, bVar);
            }
        }
        return aVar2;
    }

    /* renamed from: a */
    static void m7194a(C2365a aVar, C2365a aVar2, List<C2365a> list) {
        if (!(aVar == null || aVar2 == null || list == null)) {
            if (aVar2.f7192a - aVar.f7192a > f7189a) {
                list.add(aVar2);
            }
            List<C2365a> list2 = aVar2.f7193b;
            if (!(list2 == null || list2.isEmpty())) {
                List<C2365a> list3 = aVar.f7193b;
                if (list3 == null || list3.isEmpty()) {
                    for (C2365a aVar3 : list2) {
                        if (aVar3 != null && aVar3.mo6527a()) {
                            list.add(aVar3);
                        }
                    }
                    return;
                }
                for (C2365a aVar4 : list2) {
                    if (aVar4 != null) {
                        Iterator<C2365a> it = list3.iterator();
                        int i = 0;
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            C2365a next = it.next();
                            if (next != null && aVar4.mo6528b().equals(next.mo6528b())) {
                                m7194a(next, aVar4, list);
                                break;
                            }
                            i++;
                        }
                        if (i >= list3.size() && aVar4.mo6527a()) {
                            list.add(aVar4);
                        }
                    }
                }
            }
        }
    }
}
