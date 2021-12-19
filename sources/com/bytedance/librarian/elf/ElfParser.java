package com.bytedance.librarian.elf;

import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.librarian.elf.Elf;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ElfParser implements Elf, Closeable {

    /* renamed from: a */
    private final int f48935a = 1179403647;

    /* renamed from: b */
    private final FileChannel f48936b;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f48936b.close();
    }

    /* renamed from: a */
    public final List<String> mo34121a() {
        boolean z;
        Elf.Header elf64Header;
        ByteOrder byteOrder;
        Elf.DynamicStructure a;
        this.f48936b.position(0L);
        ArrayList arrayList = new ArrayList();
        this.f48936b.position(0L);
        ByteBuffer allocate = ByteBuffer.allocate(8);
        allocate.order(ByteOrder.LITTLE_ENDIAN);
        if (mo34122b(allocate, 0) == 1179403647) {
            short e = m39004e(allocate, 4);
            if (m39004e(allocate, 5) == 2) {
                z = true;
            } else {
                z = false;
            }
            if (e == 1) {
                elf64Header = new Elf32Header(z, this);
            } else if (e == 2) {
                elf64Header = new Elf64Header(z, this);
            } else {
                throw new IllegalStateException("Invalid class type!");
            }
            ByteBuffer allocate2 = ByteBuffer.allocate(8);
            if (elf64Header.f48919a) {
                byteOrder = ByteOrder.BIG_ENDIAN;
            } else {
                byteOrder = ByteOrder.LITTLE_ENDIAN;
            }
            allocate2.order(byteOrder);
            long j = (long) elf64Header.f48924f;
            if (j == 65535) {
                j = elf64Header.mo34119a().f48932a;
            }
            long j2 = 0;
            while (true) {
                if (j2 >= j) {
                    break;
                }
                Elf.ProgramHeader a2 = elf64Header.mo34118a(j2);
                if (a2.f48928a == 2) {
                    long j3 = a2.f48929b;
                    if (j3 != 0) {
                        ArrayList<Long> arrayList2 = new ArrayList();
                        long j4 = 0;
                        int i = 0;
                        do {
                            a = elf64Header.mo34117a(j3, i);
                            if (a.f48917a == 1) {
                                arrayList2.add(Long.valueOf(a.f48918b));
                            } else if (a.f48917a == 5) {
                                j4 = a.f48918b;
                            }
                            i++;
                        } while (a.f48917a != 0);
                        if (j4 != 0) {
                            long a3 = m39001a(elf64Header, j, j4);
                            for (Long l : arrayList2) {
                                arrayList.add(m39003d(allocate2, l.longValue() + a3));
                            }
                            return arrayList;
                        }
                        throw new IllegalStateException("String table offset not found!");
                    }
                } else {
                    j2++;
                }
            }
            return Collections.unmodifiableList(arrayList);
        }
        throw new IllegalArgumentException("Invalid ELF Magic!");
    }

    public ElfParser(File file) {
        MethodCollector.m26663i(4945);
        if (file == null || !file.exists()) {
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException("File is null or does not exist");
            MethodCollector.m26664o(4945);
            throw illegalArgumentException;
        }
        this.f48936b = new FileInputStream(file).getChannel();
        MethodCollector.m26664o(4945);
    }

    /* renamed from: e */
    private short m39004e(ByteBuffer byteBuffer, long j) {
        m39002a(byteBuffer, j, 1);
        return (short) (byteBuffer.get() & 255);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final long mo34120a(ByteBuffer byteBuffer, long j) {
        m39002a(byteBuffer, j, 8);
        return byteBuffer.getLong();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final long mo34122b(ByteBuffer byteBuffer, long j) {
        m39002a(byteBuffer, j, 4);
        return ((long) byteBuffer.getInt()) & 4294967295L;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final int mo34123c(ByteBuffer byteBuffer, long j) {
        m39002a(byteBuffer, j, 2);
        return byteBuffer.getShort() & 65535;
    }

    /* renamed from: d */
    private String m39003d(ByteBuffer byteBuffer, long j) {
        StringBuilder sb = new StringBuilder();
        while (true) {
            long j2 = 1 + j;
            short e = m39004e(byteBuffer, j);
            if (e == 0) {
                return sb.toString();
            }
            sb.append((char) e);
            j = j2;
        }
    }

    /* renamed from: a */
    private static long m39001a(Elf.Header header, long j, long j2) {
        for (long j3 = 0; j3 < j; j3++) {
            Elf.ProgramHeader a = header.mo34118a(j3);
            if (a.f48928a == 1 && a.f48930c <= j2 && j2 <= a.f48930c + a.f48931d) {
                return (j2 - a.f48930c) + a.f48929b;
            }
        }
        throw new IllegalStateException("Could not map vma to file offset!");
    }

    /* renamed from: a */
    private void m39002a(ByteBuffer byteBuffer, long j, int i) {
        byteBuffer.position(0);
        byteBuffer.limit(i);
        long j2 = 0;
        while (j2 < ((long) i)) {
            int read = this.f48936b.read(byteBuffer, j + j2);
            if (read != -1) {
                j2 += (long) read;
            } else {
                throw new EOFException();
            }
        }
        byteBuffer.position(0);
    }
}
