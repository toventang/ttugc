package com.bytedance.geckox.p1012b;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.geckox.p1021h.C14953a;
import com.bytedance.geckox.p1021h.C14954b;
import com.bytedance.geckox.p1021h.C14955c;
import com.bytedance.geckox.p1022i.C14957a;
import com.bytedance.geckox.statistic.C15035c;
import com.bytedance.geckox.utils.C15051d;
import com.bytedance.geckox.utils.C15052e;
import com.bytedance.geckox.utils.ExecutorC15055g;
import java.io.File;
import java.io.FileFilter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.bytedance.geckox.b.b */
public final class C14884b {
    static {
        Covode.recordClassIndex(16995);
    }

    /* renamed from: a */
    public static void m27326a(final File file) {
        ExecutorC15055g.m27720a().execute(new Runnable() {
            /* class com.bytedance.geckox.p1012b.C14884b.RunnableC148873 */

            static {
                Covode.recordClassIndex(16998);
            }

            public final void run() {
                C15052e.m27712a(file);
            }
        });
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    public static boolean m27329a(String str) {
        try {
            C14953a a = C14953a.m27537a(str + File.separator + "update.lock");
            if (a == null) {
                return true;
            }
            try {
                C14954b a2 = C14954b.m27539a(str + File.separator + "select.lock");
                try {
                    C15052e.m27712a(new File(str));
                    a2.mo24076a();
                    return true;
                } catch (Throwable th) {
                    a2.mo24076a();
                    throw th;
                }
            } finally {
                a.mo24075a();
            }
        } catch (Throwable th2) {
            C15051d.m27710a(new RuntimeException("delete old channel version failed，path：".concat(String.valueOf(str)), th2));
            return false;
        }
    }

    /* renamed from: a */
    private static List<File> m27323a(String str, long j, List<File> list) {
        File[] listFiles = new File(str).listFiles(new FileFilter() {
            /* class com.bytedance.geckox.p1012b.C14884b.C148862 */

            static {
                Covode.recordClassIndex(16997);
            }

            public final boolean accept(File file) {
                return file.isDirectory();
            }
        });
        if (listFiles == null || listFiles.length == 0 || listFiles.length == 1) {
            return null;
        }
        return m27324a(listFiles, j, list);
    }

    /* renamed from: a */
    private static List<File> m27324a(File[] fileArr, long j, List<File> list) {
        ArrayList<File> arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        File file = null;
        long j2 = j;
        for (File file2 : fileArr) {
            String name = file2.getName();
            if (name.endsWith("--updating")) {
                arrayList.add(file2);
            } else if (name.endsWith("--pending-delete")) {
                m27326a(file2);
                list.add(file2);
            } else {
                try {
                    long parseLong = Long.parseLong(name);
                    if (j2 != 0) {
                        if (parseLong != j) {
                            arrayList2.add(file2);
                        }
                    } else if (parseLong > j2) {
                        if (file != null) {
                            try {
                                arrayList2.add(file);
                            } catch (Exception unused) {
                                j2 = parseLong;
                                m27326a(file2);
                                list.add(file2);
                            }
                        }
                        file = file2;
                        j2 = parseLong;
                    } else {
                        arrayList2.add(file2);
                    }
                } catch (Exception unused2) {
                    m27326a(file2);
                    list.add(file2);
                }
            }
        }
        for (File file3 : arrayList) {
            String name2 = file3.getName();
            int indexOf = name2.indexOf("--updating");
            if (indexOf == -1) {
                m27326a(file3);
                list.add(file3);
            } else {
                String substring = name2.substring(0, indexOf);
                long j3 = -1;
                try {
                    j3 = Long.parseLong(substring);
                } catch (NumberFormatException e) {
                    e.printStackTrace();
                }
                if (j3 <= j2) {
                    m27326a(file3);
                    list.add(file3);
                }
            }
        }
        return arrayList2;
    }

    /* renamed from: a */
    public static void m27328a(String str, Long l, boolean z, int i) {
        long j = 0;
        if (l != null) {
            try {
                j = l.longValue();
            } catch (Throwable th) {
                C15051d.m27710a(new RuntimeException("delete old channel version failed，path：".concat(String.valueOf(str)), th));
                return;
            }
        }
        m27327a(str, j, z, i);
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    public static void m27327a(String str, long j, boolean z, int i) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if (z) {
            C14953a a = C14953a.m27537a(str + File.separator + "update.lock");
            if (a == null) {
                m27325a(i, str, arrayList, arrayList2, "get lock failed");
                return;
            }
            try {
                C14954b a2 = C14954b.m27539a(str + File.separator + "select.lock");
                try {
                    List<File> a3 = m27323a(str, j, arrayList);
                    if (a3 == null || a3.isEmpty()) {
                        m27325a(i, str, arrayList, arrayList2, "versions is empty");
                        a2.mo24076a();
                        return;
                    }
                    C14957a.m27543a("delete after update", str, Long.valueOf(j), a3);
                    for (File file : a3) {
                        if (C14955c.m27541a(file.getAbsolutePath() + File.separator + "using.lock")) {
                            arrayList.add(file);
                        } else {
                            arrayList2.add(file);
                        }
                    }
                    m27325a(i, str, arrayList, arrayList2, "");
                    a2.mo24076a();
                    a.mo24075a();
                } catch (Throwable th) {
                    a2.mo24076a();
                    throw th;
                }
            } finally {
                a.mo24075a();
            }
        } else {
            List<File> a4 = m27323a(str, j, arrayList);
            if (a4 == null || a4.isEmpty()) {
                m27325a(i, str, arrayList, arrayList2, "versions is empty");
                return;
            }
            C14957a.m27543a("delete after update", str, Long.valueOf(j), a4);
            for (File file2 : a4) {
                if (C14955c.m27541a(file2.getAbsolutePath() + File.separator + "using.lock")) {
                    arrayList.add(file2);
                } else {
                    arrayList2.add(file2);
                }
            }
            m27325a(i, str, arrayList, arrayList2, "");
        }
    }

    /* renamed from: a */
    private static void m27325a(int i, String str, List<File> list, List<File> list2, String str2) {
        if (i == 41) {
            if (list2.isEmpty()) {
                return;
            }
        } else if (i == 40 && list.isEmpty() && list2.isEmpty()) {
            return;
        }
        if (list.size() > 0) {
            if (!TextUtils.isEmpty(str2)) {
                str2 = str2 + ";";
            }
            str2 = str2 + "deleteVersion:";
            Iterator<File> it = list.iterator();
            while (it.hasNext()) {
                str2 = str2 + "[" + it.next().getName() + "]";
            }
        }
        if (list2.size() > 0) {
            if (!TextUtils.isEmpty(str2)) {
                str2 = str2 + ";";
            }
            str2 = str2 + "notDeleteVersion:";
            Iterator<File> it2 = list2.iterator();
            while (it2.hasNext()) {
                str2 = str2 + "[" + it2.next().getName() + "]";
            }
        }
        C15035c.m27678a(4, i, str2, new File(str).getName());
    }
}
