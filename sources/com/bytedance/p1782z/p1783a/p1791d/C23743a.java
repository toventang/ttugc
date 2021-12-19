package com.bytedance.p1782z.p1783a.p1791d;

import com.bytedance.covode.number.Covode;
import com.bytedance.p1782z.p1783a.p1791d.C23751b;
import java.io.File;
import java.io.FilenameFilter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.regex.Pattern;

/* renamed from: com.bytedance.z.a.d.a */
public final class C23743a {

    /* renamed from: a */
    public static String f56200a;

    /* renamed from: b */
    private static int f56201b = -1;

    /* renamed from: c */
    private static List<C23750a> f56202c;

    /* renamed from: d */
    private static List<Integer> f56203d;

    static {
        Covode.recordClassIndex(27848);
    }

    /* renamed from: a */
    public static int m44891a() {
        if (f56201b == -1) {
            f56201b = new File("/sys/devices/system/cpu").listFiles(new FilenameFilter() {
                /* class com.bytedance.p1782z.p1783a.p1791d.C23743a.C237441 */

                static {
                    Covode.recordClassIndex(27849);
                }

                public final boolean accept(File file, String str) {
                    return Pattern.matches("cpu[0-9]", str);
                }
            }).length;
        }
        return f56201b;
    }

    /* renamed from: com.bytedance.z.a.d.a$a */
    public static class C23750a {

        /* renamed from: a */
        public String f56206a;

        /* renamed from: b */
        public List<Integer> f56207b = new ArrayList();

        /* renamed from: c */
        public List<Long> f56208c = new ArrayList();

        static {
            Covode.recordClassIndex(27855);
        }

        public final String toString() {
            return "CpuClusterInfo{name='" + this.f56206a + '\'' + ", affectedCpuList=" + this.f56207b + ", freqList=" + this.f56208c + '}';
        }

        public C23750a(String str) {
            this.f56206a = str;
        }
    }

    /* renamed from: b */
    public static List<Integer> m44892b() {
        List<Integer> list = f56203d;
        if (list != null) {
            return list;
        }
        if (f56202c == null) {
            f56202c = new ArrayList();
            File[] listFiles = new File("/sys/devices/system/cpu/cpufreq").listFiles(new FilenameFilter() {
                /* class com.bytedance.p1782z.p1783a.p1791d.C23743a.C237463 */

                static {
                    Covode.recordClassIndex(27851);
                }

                public final boolean accept(File file, String str) {
                    return Pattern.matches("policy[0-9]", str);
                }
            });
            Arrays.sort(listFiles, new Comparator<File>() {
                /* class com.bytedance.p1782z.p1783a.p1791d.C23743a.C237474 */

                static {
                    Covode.recordClassIndex(27852);
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
                @Override // java.util.Comparator
                public final /* synthetic */ int compare(File file, File file2) {
                    return file.getName().compareTo(file2.getName());
                }
            });
            if (listFiles != null) {
                for (File file : listFiles) {
                    C23750a aVar = new C23750a(file.getName());
                    final ArrayList arrayList = new ArrayList();
                    final ArrayList arrayList2 = new ArrayList();
                    C23751b.m44899a(file.getAbsolutePath() + "/scaling_available_frequencies", new C23751b.AbstractC23752a() {
                        /* class com.bytedance.p1782z.p1783a.p1791d.C23743a.C237485 */

                        static {
                            Covode.recordClassIndex(27853);
                        }

                        @Override // com.bytedance.p1782z.p1783a.p1791d.C23751b.AbstractC23752a
                        /* renamed from: a */
                        public final boolean mo39196a(String str) {
                            if (str != null && !str.isEmpty()) {
                                for (String str2 : str.split(" ")) {
                                    arrayList.add(Long.valueOf(Long.parseLong(str2)));
                                }
                            }
                            return true;
                        }
                    });
                    C23751b.m44899a(file.getAbsolutePath() + "/affected_cpus", new C23751b.AbstractC23752a() {
                        /* class com.bytedance.p1782z.p1783a.p1791d.C23743a.C237496 */

                        static {
                            Covode.recordClassIndex(27854);
                        }

                        @Override // com.bytedance.p1782z.p1783a.p1791d.C23751b.AbstractC23752a
                        /* renamed from: a */
                        public final boolean mo39196a(String str) {
                            if (str != null && !str.isEmpty()) {
                                for (String str2 : str.split(" ")) {
                                    arrayList2.add(Integer.valueOf(Integer.parseInt(str2)));
                                }
                            }
                            return true;
                        }
                    });
                    aVar.f56208c = arrayList;
                    aVar.f56207b = arrayList2;
                    f56202c.add(aVar);
                }
            }
        }
        List<C23750a> list2 = f56202c;
        f56203d = new ArrayList();
        for (C23750a aVar2 : list2) {
            f56203d.add(Integer.valueOf(aVar2.f56207b.size()));
        }
        return f56203d;
    }
}
