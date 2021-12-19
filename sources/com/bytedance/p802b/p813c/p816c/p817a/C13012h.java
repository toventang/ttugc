package com.bytedance.p802b.p813c.p816c.p817a;

import android.os.Looper;
import android.os.Process;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.monitor.p1546a.C21454c;
import com.bytedance.p802b.p813c.p815b.C13001c;
import com.bytedance.p802b.p813c.p816c.AbstractC13002a;
import com.bytedance.p802b.p813c.p816c.C13015b;
import com.bytedance.p802b.p813c.p816c.C13016c;
import com.bytedance.p802b.p813c.p816c.C13018d;
import com.bytedance.p802b.p813c.p816c.C13019e;
import com.bytedance.p802b.p813c.p816c.C13022h;
import com.bytedance.p802b.p813c.p816c.C13023i;
import com.bytedance.p802b.p813c.p818d.C13024a;
import com.bytedance.p802b.p830h.C13092a;
import com.bytedance.p802b.p834j.p839e.AbstractC13109a;
import com.bytedance.p802b.p841k.C13130f;
import com.bytedance.p802b.p841k.p844c.C13121a;
import com.bytedance.p802b.p841k.p845d.AbstractRunnableC13123a;
import com.bytedance.p802b.p841k.p845d.C13124b;
import com.bytedance.p802b.p841k.p845d.EnumC13126c;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.bytedance.b.c.c.a.h */
final class C13012h extends AbstractC13002a {

    /* renamed from: b */
    private List<Double> f31700b = new CopyOnWriteArrayList();

    /* renamed from: c */
    private List<C13023i> f31701c = new CopyOnWriteArrayList();

    /* renamed from: d */
    private List<C13023i> f31702d = new CopyOnWriteArrayList();

    /* renamed from: e */
    private AbstractRunnableC13123a f31703e = new AbstractRunnableC13123a() {
        /* class com.bytedance.p802b.p813c.p816c.p817a.C13012h.C130131 */

        static {
            Covode.recordClassIndex(14849);
        }

        public final void run() {
            C13012h.this.mo20865b();
        }
    };

    /* renamed from: f */
    private C13001c f31704f;

    /* renamed from: g */
    private long f31705g;

    /* renamed from: h */
    private boolean f31706h;

    static {
        Covode.recordClassIndex(14848);
    }

    @Override // com.bytedance.p802b.p813c.p816c.AbstractC13021g, com.bytedance.p802b.p813c.p816c.AbstractC13002a
    /* renamed from: a */
    public final void mo20854a() {
        super.mo20854a();
        m23357d();
    }

    /* renamed from: d */
    private void m23357d() {
        this.f31700b.clear();
        this.f31702d.clear();
        this.f31701c.clear();
        this.f31705g = 0;
        C13124b.m23597a(EnumC13126c.IO).mo20944b(this.f31703e);
    }

    /* renamed from: b */
    public final void mo20865b() {
        String a;
        if (C13015b.m23362a()) {
            m23357d();
            this.f31678a.mo20874c();
            return;
        }
        double a2 = C13019e.m23375a();
        this.f31700b.add(Double.valueOf(a2));
        boolean a3 = C13015b.m23363a(this.f31704f, a2, this.f31706h);
        if (System.currentTimeMillis() - this.f31705g >= 30000) {
            if (this.f31700b.isEmpty() || this.f31702d.isEmpty()) {
                m23357d();
                this.f31678a.mo20874c();
                return;
            }
            double d = 0.0d;
            double d2 = 0.0d;
            for (Double d3 : this.f31700b) {
                double doubleValue = d3.doubleValue();
                if (d2 < doubleValue) {
                    d2 = doubleValue;
                }
                d += doubleValue;
            }
            this.f31702d.size();
            double size = (double) this.f31700b.size();
            Double.isNaN(size);
            double d4 = d / size;
            LinkedList linkedList = new LinkedList();
            String[] split = C13015b.f31709a.split("#");
            int i = 0;
            if (this.f31706h) {
                if (!this.f31704f.f31676g.isEmpty()) {
                    int length = split.length;
                    while (i < length) {
                        String str = split[i];
                        if (this.f31704f.f31676g.containsKey(str)) {
                            double doubleValue2 = this.f31704f.f31676g.get(str).doubleValue();
                            if (doubleValue2 >= 0.0d && d4 > doubleValue2) {
                                linkedList.add(str);
                            }
                        }
                        i++;
                    }
                }
            } else if (!this.f31704f.f31677h.isEmpty()) {
                int length2 = split.length;
                while (i < length2) {
                    String str2 = split[i];
                    if (this.f31704f.f31677h.containsKey(str2)) {
                        double doubleValue3 = this.f31704f.f31677h.get(str2).doubleValue();
                        if (doubleValue3 >= 0.0d && d4 > doubleValue3) {
                            linkedList.add(str2);
                        }
                    }
                    i++;
                }
            }
            if (C13016c.C13017a.f31717a.mo20869a() && (!linkedList.isEmpty() || ((this.f31706h && d4 > this.f31704f.f31672c) || (!this.f31706h && d4 > this.f31704f.f31673d)))) {
                C13016c.C13017a.f31717a.f31710a = System.currentTimeMillis();
                if (linkedList.isEmpty()) {
                    a = (!this.f31706h || d4 <= this.f31704f.f31672c) ? (this.f31706h || d4 <= this.f31704f.f31673d) ? "" : "apm_max_foreground" : "apm_max_background";
                } else {
                    a = C13130f.m23607a(linkedList.toArray(), "#");
                    if (this.f31706h && d4 > this.f31704f.f31672c) {
                        a = a + "#apm_max_background";
                    } else if (!this.f31706h && d4 > this.f31704f.f31673d) {
                        a = a + "#apm_max_foreground";
                    }
                }
                C13092a.m23544a(new C13005b(d4, d2, this.f31702d, a, this.f31706h));
            }
            m23357d();
            this.f31678a.mo20877f();
        } else if (!a3) {
            this.f31701c.clear();
        } else {
            m23356c();
        }
    }

    /* renamed from: c */
    private void m23356c() {
        C13023i next;
        int i = 40;
        char c = '\n';
        if (this.f31701c.isEmpty()) {
            int myPid = Process.myPid();
            List<C13023i> list = this.f31701c;
            BufferedReader bufferedReader = null;
            File[] listFiles = new File("/proc/" + myPid + "/task/").listFiles();
            long a = C13121a.m23594a();
            int length = listFiles.length;
            int i2 = 0;
            while (i2 < length) {
                try {
                    BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(new FileInputStream(listFiles[i2].getPath() + "/stat")), 1000);
                    try {
                        String readLine = bufferedReader2.readLine();
                        int lastIndexOf = readLine.lastIndexOf(41);
                        String substring = readLine.substring(0, lastIndexOf);
                        String substring2 = readLine.substring(lastIndexOf + 4);
                        int indexOf = substring.indexOf(i);
                        int intValue = Integer.valueOf(substring.substring(0, indexOf - 1)).intValue();
                        String substring3 = substring.substring(indexOf + 1);
                        String[] split = substring2.split(" ");
                        long parseLong = Long.parseLong(split[c]) + Long.parseLong(split[11]);
                        if (intValue != 0 && !substring3.isEmpty() && parseLong != 0 && !Thread.currentThread().getName().contains(substring3)) {
                            C13023i iVar = new C13023i();
                            iVar.f31731b = substring3;
                            iVar.f31730a = intValue;
                            iVar.f31732c = parseLong;
                            iVar.f31736g = a;
                            iVar.f31737h = Integer.parseInt(split[14]);
                            list.add(iVar);
                        }
                        C21454c.m40295a(bufferedReader2);
                        bufferedReader = bufferedReader2;
                    } catch (Throwable unused) {
                        bufferedReader = bufferedReader2;
                        C21454c.m40295a(bufferedReader);
                        i2++;
                        i = 40;
                        c = '\n';
                    }
                } catch (FileNotFoundException unused2) {
                    C21454c.m40295a(bufferedReader);
                    i2++;
                    i = 40;
                    c = '\n';
                }
                i2++;
                i = 40;
                c = '\n';
            }
            this.f31701c.size();
            return;
        }
        C13022h.m23381a(Process.myPid(), this.f31701c, new LinkedList(), this.f31704f.f31674e);
        this.f31701c.size();
        if (!this.f31701c.isEmpty()) {
            if (this.f31701c.size() > 10) {
                this.f31701c.clear();
                return;
            }
            if (C13016c.C13017a.f31717a.mo20869a()) {
                ThreadGroup threadGroup = Looper.getMainLooper().getThread().getThreadGroup();
                int activeCount = threadGroup.activeCount();
                int i3 = activeCount + (activeCount / 2);
                Thread[] threadArr = new Thread[i3];
                threadGroup.enumerate(threadArr);
                StringBuilder sb = new StringBuilder();
                for (int i4 = 0; i4 < i3; i4++) {
                    Thread thread = threadArr[i4];
                    if (thread == null) {
                        break;
                    }
                    if (thread != Thread.currentThread()) {
                        ListIterator<C13023i> listIterator = this.f31701c.listIterator();
                        while (true) {
                            if (!listIterator.hasNext()) {
                                break;
                            }
                            next = listIterator.next();
                            if (next == null || (!next.f31731b.equals(thread.getName()) && (thread.getName().length() <= 15 || !next.f31731b.equals(thread.getName().substring(0, 15))))) {
                            }
                        }
                        if (next.f31730a != Process.myPid() || this.f31704f.f31671b) {
                            StackTraceElement[] stackTrace = thread.getStackTrace();
                            int i5 = 0;
                            for (StackTraceElement stackTraceElement : stackTrace) {
                                i5++;
                                sb.append("\tat ").append(stackTraceElement.getClassName()).append(".").append(stackTraceElement.getMethodName()).append("(").append(stackTraceElement.getFileName()).append(":").append(stackTraceElement.getLineNumber()).append(")\n");
                                if (i5 > 40) {
                                    break;
                                }
                            }
                            next.f31735f = sb.toString();
                            next.f31734e = C1764a.m5928a("%.2f", new Object[]{Double.valueOf(next.f31733d / this.f31704f.f31674e)});
                            this.f31702d.add(next);
                            sb.setLength(0);
                        }
                    }
                }
            }
            Collections.sort(this.f31701c, new Comparator<C13023i>() {
                /* class com.bytedance.p802b.p813c.p816c.p817a.C13012h.C130142 */

                static {
                    Covode.recordClassIndex(14850);
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
                @Override // java.util.Comparator
                public final /* bridge */ /* synthetic */ int compare(C13023i iVar, C13023i iVar2) {
                    return (int) ((iVar2.f31733d * 100.0d) - (iVar.f31733d * 100.0d));
                }
            });
            LinkedList<AbstractC13109a.C13110a> linkedList = new LinkedList<>();
            for (C13023i iVar2 : this.f31701c) {
                linkedList.add(new AbstractC13109a.C13110a(iVar2.f31731b, iVar2.f31733d, iVar2.f31730a));
            }
            C13024a.C13025a.f31742a.mo20884b(linkedList);
            this.f31701c.clear();
        }
    }

    @Override // com.bytedance.p802b.p813c.p816c.AbstractC13021g, com.bytedance.p802b.p813c.p816c.AbstractC13002a
    /* renamed from: a */
    public final void mo20856a(boolean z) {
        super.mo20856a(z);
        m23357d();
        this.f31678a.mo20873b();
    }

    public C13012h(C13018d dVar) {
        super(dVar);
    }

    @Override // com.bytedance.p802b.p813c.p816c.AbstractC13021g, com.bytedance.p802b.p813c.p816c.AbstractC13002a
    /* renamed from: a */
    public final void mo20855a(C13001c cVar, boolean z) {
        super.mo20855a(cVar, z);
        this.f31704f = cVar;
        this.f31705g = System.currentTimeMillis();
        this.f31706h = z;
        C13124b.m23597a(EnumC13126c.IO).mo20943a(this.f31703e);
    }
}
