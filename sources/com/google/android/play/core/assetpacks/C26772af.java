package com.google.android.play.core.assetpacks;

import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.android.play.core.p1963b.AbstractC26906ax;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.SequenceInputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

/* renamed from: com.google.android.play.core.assetpacks.af */
final class C26772af extends AbstractC26906ax {

    /* renamed from: a */
    private final File f63435a;

    /* renamed from: b */
    private final File f63436b;

    /* renamed from: c */
    private final NavigableMap<Long, File> f63437c = new TreeMap();

    static {
        Covode.recordClassIndex(32247);
    }

    C26772af(File file, File file2) {
        this.f63435a = file;
        this.f63436b = file2;
        List<File> a = C26835co.m53302a(file, file2);
        if (!a.isEmpty()) {
            long j = 0;
            for (File file3 : a) {
                this.f63437c.put(Long.valueOf(j), file3);
                j += file3.length();
            }
            return;
        }
        throw new C26787au(C1764a.m5928a("Virtualized slice archive empty for %s, %s", new Object[]{file, file2}));
    }

    /* renamed from: a */
    private final InputStream m53201a(long j, Long l) {
        MethodCollector.m26663i(14278);
        FileInputStream fileInputStream = new FileInputStream((File) this.f63437c.get(l));
        if (fileInputStream.skip(j - l.longValue()) == j - l.longValue()) {
            MethodCollector.m26664o(14278);
            return fileInputStream;
        }
        C26787au auVar = new C26787au(C1764a.m5928a("Virtualized slice archive corrupt, could not skip in file with key %s", new Object[]{l}));
        MethodCollector.m26664o(14278);
        throw auVar;
    }

    @Override // com.google.android.play.core.p1963b.AbstractC26906ax
    /* renamed from: a */
    public final long mo44462a() {
        Map.Entry<Long, File> lastEntry = this.f63437c.lastEntry();
        return lastEntry.getKey().longValue() + lastEntry.getValue().length();
    }

    @Override // com.google.android.play.core.p1963b.AbstractC26906ax
    /* renamed from: a */
    public final InputStream mo44463a(long j, long j2) {
        MethodCollector.m26663i(14277);
        if (j < 0 || j2 < 0) {
            C26787au auVar = new C26787au(C1764a.m5928a("Invalid input parameters %s, %s", new Object[]{Long.valueOf(j), Long.valueOf(j2)}));
            MethodCollector.m26664o(14277);
            throw auVar;
        }
        long j3 = j + j2;
        if (j3 <= mo44462a()) {
            Long floorKey = this.f63437c.floorKey(Long.valueOf(j));
            Long floorKey2 = this.f63437c.floorKey(Long.valueOf(j3));
            if (floorKey.equals(floorKey2)) {
                C26771ae aeVar = new C26771ae(m53201a(j, floorKey), j2);
                MethodCollector.m26664o(14277);
                return aeVar;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(m53201a(j, floorKey));
            Collection<File> values = this.f63437c.subMap(floorKey, false, floorKey2, false).values();
            if (!values.isEmpty()) {
                arrayList.add(new C26817bx(Collections.enumeration(values)));
            }
            arrayList.add(new C26771ae(new FileInputStream((File) this.f63437c.get(floorKey2)), j2 - (floorKey2.longValue() - j)));
            SequenceInputStream sequenceInputStream = new SequenceInputStream(Collections.enumeration(arrayList));
            MethodCollector.m26664o(14277);
            return sequenceInputStream;
        }
        C26787au auVar2 = new C26787au(C1764a.m5928a("Trying to access archive out of bounds. Archive ends at: %s. Tried accessing: %s", new Object[]{Long.valueOf(mo44462a()), Long.valueOf(j3)}));
        MethodCollector.m26664o(14277);
        throw auVar2;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
